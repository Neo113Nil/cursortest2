package f0;

import android.os.Bundle;
import java.util.Iterator;

/* renamed from: f0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0148m extends D1.j implements C1.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2950b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2951c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2952d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0148m(Object obj, int i, Object obj2) {
        super(1);
        this.f2950b = i;
        this.f2951c = obj;
        this.f2952d = obj2;
    }

    @Override // C1.l
    public final Object g(Object obj) {
        N n2;
        w c2;
        Object obj2 = this.f2951c;
        Object obj3 = this.f2952d;
        switch (this.f2950b) {
            case 0:
                C0135D c0135d = (C0135D) obj;
                D1.i.e(c0135d, "$this$navOptions");
                C0133B c0133b = c0135d.f2867a;
                c0133b.f2857f = 0;
                c0133b.f2858g = 0;
                c0133b.f2859h = -1;
                c0133b.i = -1;
                w wVar = (w) obj2;
                if (wVar instanceof y) {
                    int i = w.j;
                    Iterator it = J1.h.f0(wVar, C0137b.f2906k).iterator();
                    while (true) {
                        z zVar = (z) obj3;
                        if (it.hasNext()) {
                            w wVar2 = (w) it.next();
                            w f2 = zVar.f();
                            if (D1.i.a(wVar2, f2 != null ? f2.f2989b : null)) {
                            }
                        } else {
                            int i2 = y.f2998n;
                            c0135d.f2870d = R.j.s(zVar.h()).f2994h;
                            c0135d.e = true;
                        }
                    }
                }
                return t1.i.f4388c;
            default:
                C0141f c0141f = (C0141f) obj;
                D1.i.e(c0141f, "backStackEntry");
                w wVar3 = c0141f.f2920b;
                if (wVar3 == null) {
                    wVar3 = null;
                }
                if (wVar3 == null || (c2 = (n2 = (N) obj2).c(wVar3, c0141f.e(), (C0134C) obj3)) == null) {
                    return null;
                }
                if (c2.equals(wVar3)) {
                    return c0141f;
                }
                C0144i b2 = n2.b();
                Bundle a2 = c2.a(c0141f.e());
                z zVar2 = b2.f2939h;
                return S0.e.e(zVar2.f3005a, c2, a2, zVar2.i(), zVar2.f3016o);
        }
    }
}
