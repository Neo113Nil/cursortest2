package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class AF implements InterfaceC3417jE {

    /* renamed from: a, reason: collision with root package name */
    public final C3743pG f24440a;

    public /* synthetic */ AF(C3743pG c3743pG) {
        this.f24440a = c3743pG;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3417jE
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        Iterator it = this.f24440a.a(bArr).iterator();
        while (it.hasNext()) {
            try {
                return ((C4281zF) it.next()).f36097a.a(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
