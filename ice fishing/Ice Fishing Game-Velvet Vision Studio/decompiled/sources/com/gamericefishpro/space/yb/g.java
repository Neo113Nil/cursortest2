package com.gamericefishpro.space.yb;

import com.gamericefishpro.space.ei.l;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final g INSTANCE = new g();
    private static final com.gamericefishpro.space.oh.h sdkVersion$delegate = com.gamericefishpro.space.oh.i.b(a.INSTANCE);

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends l implements Function0 {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return g.INSTANCE.formatVersion$com_onesignal_core("5.6.1");
        }
    }

    private g() {
    }

    public final String formatVersion$com_onesignal_core(String version) {
        String strX;
        String strX2;
        String strX3;
        Intrinsics.checkNotNullParameter(version, "version");
        List listSplit$default = StringsKt__StringsKt.split$default(version, new String[]{"-"}, false, 2, 2, null);
        List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) listSplit$default.get(0), new String[]{"."}, false, 0, 6, null);
        String str = (String) CollectionsKt.x(0, listSplit$default2);
        String str2 = "00";
        if (str == null || (strX = StringsKt.x(2, str)) == null) {
            strX = "00";
        }
        String str3 = (String) CollectionsKt.x(1, listSplit$default2);
        if (str3 == null || (strX2 = StringsKt.x(2, str3)) == null) {
            strX2 = "00";
        }
        String str4 = (String) CollectionsKt.x(2, listSplit$default2);
        if (str4 != null && (strX3 = StringsKt.x(2, str4)) != null) {
            str2 = strX3;
        }
        String str5 = strX + strX2 + str2;
        if (listSplit$default.size() <= 1) {
            return str5;
        }
        return str5 + '-' + ((String) listSplit$default.get(1));
    }

    public final String getSdkVersion() {
        return (String) sdkVersion$delegate.getValue();
    }

    public final boolean isValidEmail(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        if (email.length() == 0) {
            return false;
        }
        Pattern patternCompile = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$");
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        return patternCompile.matcher(email).matches();
    }

    public final boolean isValidPhoneNumber(String number) {
        Intrinsics.checkNotNullParameter(number, "number");
        if (number.length() == 0) {
            return false;
        }
        Pattern patternCompile = Pattern.compile("^\\+?[1-9]\\d{1,14}$");
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        return patternCompile.matcher(number).matches();
    }
}
