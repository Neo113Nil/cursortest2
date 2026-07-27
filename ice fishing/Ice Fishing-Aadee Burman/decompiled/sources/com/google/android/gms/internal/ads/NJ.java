package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class NJ implements InterfaceC4041vE {

    /* renamed from: a, reason: collision with root package name */
    public final C3720pG f26479a;

    public NJ(C3720pG c3720pG) {
        this.f26479a = c3720pG;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4041vE
    public final void a(byte[] bArr, byte[] bArr2) {
        Iterator it = this.f26479a.a(bArr).iterator();
        while (it.hasNext()) {
            try {
                ((OJ) it.next()).f26596a.a(bArr, bArr2);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid signature");
    }
}
