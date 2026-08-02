package com.google.android.gms.internal.ads;

import android.content.Context;
import w2.C5147g;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.fk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3226fk implements UA {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31204a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31205b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31206c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f31207d;

    public /* synthetic */ C3226fk(int i, Object obj, Object obj2, Object obj3) {
        this.f31204a = i;
        this.f31205b = obj;
        this.f31206c = obj2;
        this.f31207d = obj3;
    }

    @Override // com.google.android.gms.internal.ads.UA
    public final Object apply(Object obj) {
        switch (this.f31204a) {
            case 0:
                St st = (St) obj;
                C5147g c5147g = new C5147g((Context) this.f31205b);
                c5147g.f41663c = st.f28359B;
                c5147g.f41666f = st.f28361C.toString();
                c5147g.f41665e = ((C5189a) this.f31206c).f41845n;
                c5147g.f41664d = ((C3075cu) this.f31207d).f30396g;
                return c5147g;
            case 1:
                St st2 = (St) this.f31206c;
                InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) this.f31205b;
                if (st2.f28376M) {
                    interfaceC4084vh.A0();
                }
                interfaceC4084vh.e1();
                interfaceC4084vh.onPause();
                return ((C3385ii) this.f31207d).T();
            case 2:
                St st3 = (St) this.f31206c;
                InterfaceC4084vh interfaceC4084vh2 = (InterfaceC4084vh) this.f31205b;
                if (st3.f28376M) {
                    interfaceC4084vh2.A0();
                }
                interfaceC4084vh2.e1();
                interfaceC4084vh2.onPause();
                return ((C3762pi) this.f31207d).T();
            default:
                St st4 = (St) this.f31206c;
                InterfaceC4084vh interfaceC4084vh3 = (InterfaceC4084vh) this.f31205b;
                if (st4.f28376M) {
                    interfaceC4084vh3.A0();
                }
                interfaceC4084vh3.e1();
                interfaceC4084vh3.onPause();
                return ((C3869ri) this.f31207d).T();
        }
    }
}
