package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;
import p2.C4835j;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.im, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3366im implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31115a;

    /* renamed from: b, reason: collision with root package name */
    public final C2987bi f31116b;

    public /* synthetic */ C3366im(C2987bi c2987bi, int i) {
        this.f31115a = i;
        this.f31116b = c2987bi;
    }

    public C3157es a() {
        C5110a b9 = this.f31116b.b();
        C3360ig c3360ig = AbstractC3413jg.f31268a;
        AbstractC3341iD.j(c3360ig);
        return new C3157es(b9, c3360ig);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f31115a) {
            case 0:
                C5110a b9 = this.f31116b.b();
                u2.D d2 = C4835j.f39730C.f39735c;
                return new C3819r8(UUID.randomUUID().toString(), b9, com.anythink.expressad.foundation.g.a.f.f19119a, new JSONObject(), true);
            default:
                return a();
        }
    }
}
