package com.plaid.internal;

/* renamed from: com.plaid.internal.x7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0330x7 {
    public static String a(String str) {
        return (str == null || str.length() <= 32) ? str : str.length() > 30 ? str.substring(0, 30).concat("..") : str.substring(0, 32);
    }
}
