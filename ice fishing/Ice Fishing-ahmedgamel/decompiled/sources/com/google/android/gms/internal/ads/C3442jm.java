package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;
import r2.C4906k;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.jm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3442jm implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32099a;

    /* renamed from: b, reason: collision with root package name */
    public final C3010bi f32100b;

    public /* synthetic */ C3442jm(C3010bi c3010bi, int i) {
        this.f32099a = i;
        this.f32100b = c3010bi;
    }

    public C3180es a() {
        C5189a b9 = this.f32100b.b();
        C3383ig c3383ig = AbstractC3436jg.f32055a;
        AbstractC3364iD.j(c3383ig);
        return new C3180es(b9, c3383ig);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f32099a) {
            case 0:
                C5189a b9 = this.f32100b.b();
                w2.D d9 = C4906k.f40186C.f40191c;
                return new C3842r8(UUID.randomUUID().toString(), b9, com.anythink.expressad.foundation.g.a.f.f19906a, new JSONObject(), true);
            default:
                return a();
        }
    }
}
