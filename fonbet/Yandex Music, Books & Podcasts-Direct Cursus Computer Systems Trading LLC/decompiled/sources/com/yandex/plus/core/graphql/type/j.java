package com.yandex.plus.core.graphql.type;

/* loaded from: classes4.dex */
public final class j {
    public static s0 a(String str) {
        s0 s0Var;
        str.getClass();
        s0[] values = s0.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                s0Var = null;
                break;
            }
            s0Var = values[i];
            if (s0Var.a.equals(str)) {
                break;
            }
            i++;
        }
        return s0Var == null ? s0.UNKNOWN__ : s0Var;
    }
}
