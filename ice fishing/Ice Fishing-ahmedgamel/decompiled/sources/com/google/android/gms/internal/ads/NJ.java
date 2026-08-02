package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class NJ implements InterfaceC4064vE {

    /* renamed from: a, reason: collision with root package name */
    public final C3743pG f27263a;

    public NJ(C3743pG c3743pG) {
        this.f27263a = c3743pG;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4064vE
    public final void a(byte[] bArr, byte[] bArr2) {
        Iterator it = this.f27263a.a(bArr).iterator();
        while (it.hasNext()) {
            try {
                ((OJ) it.next()).f27378a.a(bArr, bArr2);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid signature");
    }
}
