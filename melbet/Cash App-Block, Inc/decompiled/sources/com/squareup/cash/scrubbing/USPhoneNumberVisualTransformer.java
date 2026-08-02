package com.squareup.cash.scrubbing;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import com.google.i18n.phonenumbers.AsYouTypeFormatter;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.stripe.android.uicore.elements.PhoneNumberFormatter;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.text.MatchResult;

/* loaded from: classes8.dex */
public final class USPhoneNumberVisualTransformer implements VisualTransformation {
    public final /* synthetic */ int $r8$classId = 0;
    public final Object formatter;

    public USPhoneNumberVisualTransformer() {
        PhoneNumberUtil.getInstance().getClass();
        this.formatter = new AsYouTypeFormatter("US");
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public final TransformedText filter(AnnotatedString annotatedString) {
        int i = this.$r8$classId;
        Object obj = this.formatter;
        annotatedString.getClass();
        switch (i) {
            case 0:
                AsYouTypeFormatter asYouTypeFormatter = (AsYouTypeFormatter) obj;
                asYouTypeFormatter.clear();
                String str = annotatedString.text;
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt = str.charAt(i2);
                    if (Character.isDigit(charAt)) {
                        sb.append(charAt);
                    }
                }
                String sb2 = sb.toString();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                String str2 = "";
                for (int i3 = 0; i3 < sb2.length(); i3++) {
                    str2 = asYouTypeFormatter.inputDigit(sb2.charAt(i3));
                }
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (i4 < str2.length()) {
                    int i7 = i5 + 1;
                    if (Character.isDigit(str2.charAt(i4))) {
                        arrayList.add(Integer.valueOf(i5));
                        arrayList2.add(Integer.valueOf(i5 - i6));
                    } else {
                        i6++;
                        if (i5 == 0) {
                            arrayList2.add(Integer.valueOf(i5));
                        } else {
                            arrayList2.add(Integer.valueOf(i5 - i6));
                        }
                    }
                    i4++;
                    i5 = i7;
                }
                Integer num = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList);
                arrayList.add(Integer.valueOf(num != null ? num.intValue() + 1 : 0));
                Integer num2 = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList2);
                arrayList2.add(Integer.valueOf(num2 != null ? num2.intValue() + 1 : 0));
                return new TransformedText(new AnnotatedString(str2), new USPhoneNumberVisualTransformer$filter$3(arrayList, arrayList2));
            default:
                PhoneNumberFormatter.WithRegion withRegion = (PhoneNumberFormatter.WithRegion) obj;
                String str3 = annotatedString.text;
                str3.getClass();
                String str4 = withRegion.metadata.pattern;
                if (str4 != null) {
                    StringBuilder sb3 = new StringBuilder();
                    int i8 = 0;
                    while (r1 < str4.length()) {
                        char charAt2 = str4.charAt(r1);
                        if (i8 < str3.length()) {
                            if (charAt2 == '#') {
                                charAt2 = str3.charAt(i8);
                                i8++;
                            }
                            sb3.append(charAt2);
                        }
                        r1++;
                    }
                    if (i8 < str3.length()) {
                        sb3.append(' ');
                        char[] charArray = str3.substring(i8).toCharArray();
                        charArray.getClass();
                        sb3.append(charArray);
                    }
                    str3 = sb3.toString();
                }
                return new TransformedText(new AnnotatedString(str3), new MatchResult.Destructured(withRegion));
        }
    }

    public USPhoneNumberVisualTransformer(PhoneNumberFormatter.WithRegion withRegion) {
        this.formatter = withRegion;
    }
}
