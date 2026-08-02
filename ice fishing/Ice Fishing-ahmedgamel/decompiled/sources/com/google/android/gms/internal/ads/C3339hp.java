package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.hp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3339hp implements BD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31722a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2759Qe f31723b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f31724c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f31725d;

    public /* synthetic */ C3339hp(Object obj, C2759Qe c2759Qe, int i, int i4) {
        this.f31722a = i4;
        this.f31725d = obj;
        this.f31723b = c2759Qe;
        this.f31724c = i;
    }

    @Override // com.google.android.gms.internal.ads.BD
    public final /* synthetic */ P3.a a(Object obj) {
        Bundle bundle;
        Bundle bundle2;
        switch (this.f31722a) {
            case 0:
                C2590Gf c2590Gf = (C2590Gf) this.f31725d;
                C2759Qe c2759Qe = this.f31723b;
                if (c2759Qe != null && (bundle = c2759Qe.f27825F) != null) {
                    bundle.putBoolean("ls", true);
                }
                return QC.t(((BinderC2600Gp) ((InterfaceC3158eN) c2590Gf.f25833x).f()).U3(c2759Qe, this.f31724c), new C3392ip(c2759Qe, 0), (C3383ig) c2590Gf.f25831v);
            default:
                C3887s c3887s = (C3887s) this.f31725d;
                C2759Qe c2759Qe2 = this.f31723b;
                if (c2759Qe2 != null && (bundle2 = c2759Qe2.f27825F) != null) {
                    bundle2.putBoolean("ls", true);
                }
                return QC.t(((BinderC2600Gp) ((InterfaceC3158eN) c3887s.f34558y).f()).X3(c2759Qe2, this.f31724c), new C3392ip(c2759Qe2, 1), (C3383ig) c3887s.f34555v);
        }
    }
}
