package com.onesignal.common;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i {
    public static final i INSTANCE = new i();
    public static final String SDK_VERSION = "050135";

    private i() {
    }

    public final boolean isValidEmail(String str) {
        pc.j.e(str, "email");
        if (str.length() == 0) {
            return false;
        }
        Pattern compile = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$");
        pc.j.d(compile, "compile(emRegex)");
        return compile.matcher(str).matches();
    }

    public final boolean isValidPhoneNumber(String str) {
        pc.j.e(str, "number");
        if (str.length() == 0) {
            return false;
        }
        Pattern compile = Pattern.compile("^\\+?[1-9]\\d{1,14}$");
        pc.j.d(compile, "compile(emRegex)");
        return compile.matcher(str).matches();
    }
}
