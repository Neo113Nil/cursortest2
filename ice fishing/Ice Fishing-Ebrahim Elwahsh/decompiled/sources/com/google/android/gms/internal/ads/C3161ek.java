package com.google.android.gms.internal.ads;

import android.content.Context;
import t2.C5074h;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.ek, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3161ek implements XA {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30476a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30477b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30478c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f30479d;

    public /* synthetic */ C3161ek(Object obj, Object obj2, Object obj3, int i) {
        this.f30476a = i;
        this.f30477b = obj;
        this.f30478c = obj2;
        this.f30479d = obj3;
    }

    @Override // com.google.android.gms.internal.ads.XA
    public final Object apply(Object obj) {
        switch (this.f30476a) {
            case 0:
                Ut ut = (Ut) obj;
                C5074h c5074h = new C5074h((Context) this.f30477b);
                c5074h.f40896c = ut.f28109B;
                c5074h.f40899f = ut.f28111C.toString();
                c5074h.f40898e = ((C5107a) this.f30478c).f41217n;
                c5074h.f40897d = ((C3226fu) this.f30479d).f30904g;
                return c5074h;
            case 1:
                Ut ut2 = (Ut) this.f30478c;
                InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) this.f30477b;
                if (ut2.f28126M) {
                    interfaceC3858rh.y0();
                }
                interfaceC3858rh.c1();
                interfaceC3858rh.onPause();
                return ((C3268gi) this.f30479d).L();
            case 2:
                Ut ut3 = (Ut) this.f30478c;
                InterfaceC3858rh interfaceC3858rh2 = (InterfaceC3858rh) this.f30477b;
                if (ut3.f28126M) {
                    interfaceC3858rh2.y0();
                }
                interfaceC3858rh2.c1();
                interfaceC3858rh2.onPause();
                return ((C3590mi) this.f30479d).L();
            default:
                Ut ut4 = (Ut) this.f30478c;
                InterfaceC3858rh interfaceC3858rh3 = (InterfaceC3858rh) this.f30477b;
                if (ut4.f28126M) {
                    interfaceC3858rh3.y0();
                }
                interfaceC3858rh3.c1();
                interfaceC3858rh3.onPause();
                return ((C3752pi) this.f30479d).L();
        }
    }
}
