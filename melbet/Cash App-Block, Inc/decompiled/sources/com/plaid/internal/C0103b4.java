package com.plaid.internal;

import com.plaid.internal.C0095a6;
import java.util.Map;

/* renamed from: com.plaid.internal.b4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0103b4 {
    public static final String a(String str, String str2, Map map) {
        map.getClass();
        str.getClass();
        str2.getClass();
        String str3 = (String) map.get(str);
        if (str3 != null) {
            return str3;
        }
        C0095a6.a.b(C0095a6.a, "Missing field: " + str);
        return str2;
    }
}
