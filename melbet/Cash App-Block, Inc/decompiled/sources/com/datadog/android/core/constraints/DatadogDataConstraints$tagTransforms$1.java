package com.datadog.android.core.constraints;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.CharRange;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt___StringsKt;

/* loaded from: classes4.dex */
public final class DatadogDataConstraints$tagTransforms$1 extends Lambda implements Function1 {
    public static final DatadogDataConstraints$tagTransforms$1 INSTANCE;
    public static final DatadogDataConstraints$tagTransforms$1 INSTANCE$1;
    public static final DatadogDataConstraints$tagTransforms$1 INSTANCE$2;
    public static final DatadogDataConstraints$tagTransforms$1 INSTANCE$3;
    public static final DatadogDataConstraints$tagTransforms$1 INSTANCE$4;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 1;
        INSTANCE = new DatadogDataConstraints$tagTransforms$1(i, 0);
        INSTANCE$1 = new DatadogDataConstraints$tagTransforms$1(i, 1);
        INSTANCE$2 = new DatadogDataConstraints$tagTransforms$1(i, 2);
        INSTANCE$3 = new DatadogDataConstraints$tagTransforms$1(i, 3);
        INSTANCE$4 = new DatadogDataConstraints$tagTransforms$1(i, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatadogDataConstraints$tagTransforms$1(DatadogDataConstraints datadogDataConstraints) {
        super(1);
        this.$r8$classId = 5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                String str = (String) obj;
                str.getClass();
                Locale locale = Locale.US;
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(locale, str, locale);
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                CharRange charRange = new CharRange('a', 'z');
                Character orNull = StringsKt___StringsKt.getOrNull(0, str2);
                if (orNull == null || !charRange.contains(orNull.charValue())) {
                    return null;
                }
                return str2;
            case 2:
                String str3 = (String) obj;
                str3.getClass();
                return new Regex("[^a-z0-9_:./-]").replace(str3, "_");
            case 3:
                String str4 = (String) obj;
                str4.getClass();
                return StringsKt.endsWith$default(str4, ':') ? Boxes$$ExternalSyntheticOutline1.m1148m(1, 0, str4) : str4;
            case 4:
                String str5 = (String) obj;
                str5.getClass();
                return str5.length() > 200 ? str5.substring(0, 200) : str5;
            default:
                String str6 = (String) obj;
                str6.getClass();
                int indexOf$default = StringsKt.indexOf$default((CharSequence) str6, ':', 0, false, 6);
                if (indexOf$default > 0 ? DatadogDataConstraints.reservedTagKeys.contains(str6.substring(0, indexOf$default)) : false) {
                    return null;
                }
                return str6;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DatadogDataConstraints$tagTransforms$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }
}
