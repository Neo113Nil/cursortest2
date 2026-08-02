package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* renamed from: com.google.android.gms.internal.ads.yG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4228yG {

    /* renamed from: a, reason: collision with root package name */
    public static final L7.b f35922a = new L7.b(5);

    public static byte[] a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) f35922a.get()).nextBytes(bArr);
        return bArr;
    }
}
