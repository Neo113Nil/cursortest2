package O2;

import P2.AbstractBinderC0371a;
import P2.InterfaceC0380j;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import h3.C4571h;

/* renamed from: O2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0364n extends y {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2261b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2262c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2263d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0364n(C0366p c0366p, x xVar, M2.b bVar) {
        super(xVar);
        this.f2263d = c0366p;
        this.f2262c = bVar;
    }

    @Override // O2.y
    public final void a() {
        InterfaceC0380j k9;
        Object obj = this.f2263d;
        Object obj2 = this.f2262c;
        switch (this.f2261b) {
            case 0:
                ((C0366p) obj).f2266w.d((M2.b) obj2);
                break;
            default:
                C0369t c0369t = (C0369t) obj2;
                if (c0369t.h(0)) {
                    C4571h c4571h = (C4571h) obj;
                    M2.b bVar = c4571h.f38016u;
                    if (!bVar.b()) {
                        if (c0369t.f2276E && !bVar.a()) {
                            c0369t.a();
                            c0369t.f();
                            break;
                        } else {
                            c0369t.d(bVar);
                            break;
                        }
                    } else {
                        P2.t tVar = c4571h.f38017v;
                        P2.w.h(tVar);
                        M2.b bVar2 = tVar.f2544v;
                        if (!bVar2.b()) {
                            Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar2)), new Exception());
                            c0369t.d(bVar2);
                            break;
                        } else {
                            c0369t.f2278G = true;
                            IBinder iBinder = tVar.f2543u;
                            if (iBinder == null) {
                                k9 = null;
                            } else {
                                int i = AbstractBinderC0371a.f2451u;
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                                k9 = queryLocalInterface instanceof InterfaceC0380j ? (InterfaceC0380j) queryLocalInterface : new P2.K(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                            }
                            P2.w.h(k9);
                            c0369t.f2279H = k9;
                            c0369t.f2280I = tVar.f2545w;
                            c0369t.J = tVar.f2546x;
                            c0369t.f();
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0364n(C0369t c0369t, C0369t c0369t2, C4571h c4571h) {
        super(c0369t);
        this.f2262c = c0369t2;
        this.f2263d = c4571h;
    }
}
