package com.google.android.gms.internal.ads;

import android.content.Context;
import u2.C5076g;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.fk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3203fk implements UA {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30416a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30417b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30418c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f30419d;

    public /* synthetic */ C3203fk(int i, Object obj, Object obj2, Object obj3) {
        this.f30416a = i;
        this.f30417b = obj;
        this.f30418c = obj2;
        this.f30419d = obj3;
    }

    @Override // com.google.android.gms.internal.ads.UA
    public final Object apply(Object obj) {
        switch (this.f30416a) {
            case 0:
                St st = (St) obj;
                C5076g c5076g = new C5076g((Context) this.f30417b);
                c5076g.f41273c = st.f27576B;
                c5076g.f41276f = st.f27578C.toString();
                c5076g.f41275e = ((C5110a) this.f30418c).f41391n;
                c5076g.f41274d = ((C3052cu) this.f30419d).f29626g;
                return c5076g;
            case 1:
                St st2 = (St) this.f30418c;
                InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) this.f30417b;
                if (st2.f27593M) {
                    interfaceC4061vh.B0();
                }
                interfaceC4061vh.e1();
                interfaceC4061vh.onPause();
                return ((C3362ii) this.f30419d).T();
            case 2:
                St st3 = (St) this.f30418c;
                InterfaceC4061vh interfaceC4061vh2 = (InterfaceC4061vh) this.f30417b;
                if (st3.f27593M) {
                    interfaceC4061vh2.B0();
                }
                interfaceC4061vh2.e1();
                interfaceC4061vh2.onPause();
                return ((C3739pi) this.f30419d).T();
            default:
                St st4 = (St) this.f30418c;
                InterfaceC4061vh interfaceC4061vh3 = (InterfaceC4061vh) this.f30417b;
                if (st4.f27593M) {
                    interfaceC4061vh3.B0();
                }
                interfaceC4061vh3.e1();
                interfaceC4061vh3.onPause();
                return ((C3846ri) this.f30419d).T();
        }
    }
}
