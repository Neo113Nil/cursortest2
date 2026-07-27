package com.onesignal.common;

import a.AbstractC0422a;
import com.icefishing.icefishinglive2.AbstractC4404f;
import java.util.List;
import java.util.regex.Pattern;
import u7.InterfaceC5087e;
import v7.AbstractC5129j;

/* loaded from: classes2.dex */
public final class h {
    public static final h INSTANCE = new h();
    private static final InterfaceC5087e sdkVersion$delegate = AbstractC0422a.q(a.INSTANCE);

    public static final class a extends kotlin.jvm.internal.i implements I7.a {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // I7.a
        public final String invoke() {
            return h.INSTANCE.formatVersion$com_onesignal_core("5.9.5");
        }
    }

    private h() {
    }

    public final String formatVersion$com_onesignal_core(String version) {
        String str;
        String str2;
        String f02;
        kotlin.jvm.internal.h.e(version, "version");
        List k02 = Q7.j.k0(version, new String[]{"-"}, 2);
        List k03 = Q7.j.k0((CharSequence) k02.get(0), new String[]{com.anythink.core.common.d.j.f12378z}, 6);
        String str3 = (String) AbstractC5129j.B(0, k03);
        String str4 = "00";
        if (str3 == null || (str = Q7.j.f0(2, str3)) == null) {
            str = "00";
        }
        String str5 = (String) AbstractC5129j.B(1, k03);
        if (str5 == null || (str2 = Q7.j.f0(2, str5)) == null) {
            str2 = "00";
        }
        String str6 = (String) AbstractC5129j.B(2, k03);
        if (str6 != null && (f02 = Q7.j.f0(2, str6)) != null) {
            str4 = f02;
        }
        String g4 = AbstractC4404f.g(str, str2, str4);
        if (k02.size() <= 1) {
            return g4;
        }
        return g4 + '-' + ((String) k02.get(1));
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
