package com.onesignal.common;

import com.google.android.gms.internal.ads.CL;
import java.util.List;
import java.util.regex.Pattern;
import q7.InterfaceC4936e;
import r7.AbstractC4979j;

/* loaded from: classes2.dex */
public final class h {
    public static final h INSTANCE = new h();
    private static final InterfaceC4936e sdkVersion$delegate = com.bumptech.glide.e.q(a.INSTANCE);

    public static final class a extends kotlin.jvm.internal.i implements E7.a {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // E7.a
        public final String invoke() {
            return h.INSTANCE.formatVersion$com_onesignal_core("5.9.4");
        }
    }

    private h() {
    }

    public final String formatVersion$com_onesignal_core(String version) {
        String str;
        String str2;
        String W8;
        kotlin.jvm.internal.h.e(version, "version");
        List b02 = M7.j.b0(version, new String[]{"-"}, 2);
        List b03 = M7.j.b0((CharSequence) b02.get(0), new String[]{com.anythink.core.common.d.j.f12535z}, 6);
        String str3 = (String) AbstractC4979j.H(0, b03);
        String str4 = "00";
        if (str3 == null || (str = M7.j.W(2, str3)) == null) {
            str = "00";
        }
        String str5 = (String) AbstractC4979j.H(1, b03);
        if (str5 == null || (str2 = M7.j.W(2, str5)) == null) {
            str2 = "00";
        }
        String str6 = (String) AbstractC4979j.H(2, b03);
        if (str6 != null && (W8 = M7.j.W(2, str6)) != null) {
            str4 = W8;
        }
        String k6 = CL.k(str, str2, str4);
        if (b02.size() <= 1) {
            return k6;
        }
        return k6 + '-' + ((String) b02.get(1));
    }

    public final String getSdkVersion() {
        return (String) sdkVersion$delegate.getValue();
    }

    public final boolean isValidEmail(String email) {
        kotlin.jvm.internal.h.e(email, "email");
        if (email.length() == 0) {
            return false;
        }
        Pattern compile = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$");
        kotlin.jvm.internal.h.d(compile, "compile(...)");
        return compile.matcher(email).matches();
    }

    public final boolean isValidPhoneNumber(String number) {
        kotlin.jvm.internal.h.e(number, "number");
        if (number.length() == 0) {
            return false;
        }
        Pattern compile = Pattern.compile("^\\+?[1-9]\\d{1,14}$");
        kotlin.jvm.internal.h.d(compile, "compile(...)");
        return compile.matcher(number).matches();
    }
}
