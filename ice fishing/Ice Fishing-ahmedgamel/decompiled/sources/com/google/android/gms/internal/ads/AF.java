package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class AF implements InterfaceC3394jE {

    /* renamed from: a, reason: collision with root package name */
    public final C3720pG f23660a;

    public /* synthetic */ AF(C3720pG c3720pG) {
        this.f23660a = c3720pG;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3394jE
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        Iterator it = this.f23660a.a(bArr).iterator();
        while (it.hasNext()) {
            try {
                return ((C4258zF) it.next()).f35313a.a(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
