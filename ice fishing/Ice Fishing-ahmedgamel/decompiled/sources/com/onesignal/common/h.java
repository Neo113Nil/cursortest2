package com.onesignal.common;

import N3.C;
import com.google.android.gms.internal.ads.Wv;
import java.util.List;
import java.util.regex.Pattern;
import u7.InterfaceC5079e;
import v7.AbstractC5119j;

/* loaded from: classes2.dex */
public final class h {
    public static final h INSTANCE = new h();
    private static final InterfaceC5079e sdkVersion$delegate = C.O(a.INSTANCE);

    public static final class a extends kotlin.jvm.internal.i implements I7.a {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // I7.a
        public final String invoke() {
            return h.INSTANCE.formatVersion$com_onesignal_core("5.9.4");
        }
    }

    private h() {
    }

    public final String formatVersion$com_onesignal_core(String version) {
        String str;
        String str2;
        String v02;
        kotlin.jvm.internal.h.e(version, "version");
        List A02 = Q7.j.A0(version, new String[]{"-"}, 2);
        List A03 = Q7.j.A0((CharSequence) A02.get(0), new String[]{com.anythink.core.common.d.j.f13164z}, 6);
        String str3 = (String) AbstractC5119j.z(0, A03);
        String str4 = "00";
        if (str3 == null || (str = Q7.j.v0(2, str3)) == null) {
            str = "00";
        }
        String str5 = (String) AbstractC5119j.z(1, A03);
        if (str5 == null || (str2 = Q7.j.v0(2, str5)) == null) {
            str2 = "00";
        }
        String str6 = (String) AbstractC5119j.z(2, A03);
        if (str6 != null && (v02 = Q7.j.v0(2, str6)) != null) {
            str4 = v02;
        }
        String h3 = Wv.h(str, str2, str4);
        if (A02.size() <= 1) {
            return h3;
        }
        return h3 + '-' + ((String) A02.get(1));
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
