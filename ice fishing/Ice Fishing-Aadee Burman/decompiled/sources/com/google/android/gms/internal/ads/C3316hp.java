package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.hp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3316hp implements BD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30948a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2739Qe f30949b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f30950c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f30951d;

    public /* synthetic */ C3316hp(Object obj, C2739Qe c2739Qe, int i, int i6) {
        this.f30948a = i6;
        this.f30951d = obj;
        this.f30949b = c2739Qe;
        this.f30950c = i;
    }

    @Override // com.google.android.gms.internal.ads.BD
    public final /* synthetic */ N3.a a(Object obj) {
        Bundle bundle;
        Bundle bundle2;
        switch (this.f30948a) {
            case 0:
                C2570Gf c2570Gf = (C2570Gf) this.f30951d;
                C2739Qe c2739Qe = this.f30949b;
                if (c2739Qe != null && (bundle = c2739Qe.f27040F) != null) {
                    bundle.putBoolean("ls", true);
                }
                return QC.t(((BinderC2580Gp) ((InterfaceC3135eN) c2570Gf.f25045x).f()).U3(c2739Qe, this.f30950c), new C3369ip(c2739Qe, 0), (C3360ig) c2570Gf.f25043v);
            default:
                C3864s c3864s = (C3864s) this.f30951d;
                C2739Qe c2739Qe2 = this.f30949b;
                if (c2739Qe2 != null && (bundle2 = c2739Qe2.f27040F) != null) {
                    bundle2.putBoolean("ls", true);
                }
                return QC.t(((BinderC2580Gp) ((InterfaceC3135eN) c3864s.f33790y).f()).X3(c2739Qe2, this.f30950c), new C3369ip(c2739Qe2, 1), (C3360ig) c3864s.f33787v);
        }
    }
}
