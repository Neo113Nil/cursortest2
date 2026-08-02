package com.plaid.internal;

import android.content.SharedPreferences;

/* renamed from: com.plaid.internal.b7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0106b7 {
    public static final String a(SharedPreferences sharedPreferences, String str) {
        sharedPreferences.getClass();
        str.getClass();
        String string2 = sharedPreferences.getString("plaid_environment", str);
        return string2 == null ? str : string2;
    }
}
