package com.squareup.cash.moneybot.widgets;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import coil3.size.SizeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final /* synthetic */ class ComposerKt$$ExternalSyntheticLambda9 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TextFieldValue f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ ComposerKt$$ExternalSyntheticLambda9(TextFieldValue textFieldValue, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = textFieldValue;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        TextFieldValue textFieldValue = this.f$0;
        TextFieldValue textFieldValue2 = (TextFieldValue) obj;
        switch (i) {
            case 0:
                textFieldValue2.getClass();
                AnnotatedString annotatedString = textFieldValue2.annotatedString;
                long j = textFieldValue2.selection;
                String str = annotatedString.text;
                if (str.length() > 0) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= str.length()) {
                            if (str.length() > textFieldValue.annotatedString.text.length()) {
                                break;
                            }
                        } else {
                            char charAt = str.charAt(i2);
                            if (charAt == '\n' || charAt == '\r') {
                                i2++;
                            }
                        }
                    }
                }
                if (str.length() <= 100000) {
                    function1.invoke(textFieldValue2);
                } else {
                    String substring = str.substring(0, 100000);
                    int i3 = TextRange.$r8$clinit;
                    int i4 = (int) (j >> 32);
                    int length = substring.length();
                    if (i4 > length) {
                        i4 = length;
                    }
                    int i5 = (int) (j & BodyPartID.bodyIdMax);
                    int length2 = substring.length();
                    if (i5 > length2) {
                        i5 = length2;
                    }
                    function1.invoke(new TextFieldValue(substring, SizeKt.TextRange(i4, i5), 4));
                }
                break;
            default:
                if (!Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
                    function1.invoke(textFieldValue2);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
