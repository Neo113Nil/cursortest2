package N2;

import O2.AbstractBinderC0364a;
import O2.InterfaceC0373j;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import f3.C4508g;

/* renamed from: N2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0327m extends x {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2076b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2077c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2078d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0327m(C0329o c0329o, w wVar, L2.b bVar) {
        super(wVar);
        this.f2078d = c0329o;
        this.f2077c = bVar;
    }

    @Override // N2.x
    public final void a() {
        InterfaceC0373j k6;
        Object obj = this.f2078d;
        Object obj2 = this.f2077c;
        switch (this.f2076b) {
            case 0:
                ((C0329o) obj).f2081w.f((L2.b) obj2);
                break;
            default:
                C0332s c0332s = (C0332s) obj2;
                if (c0332s.i(0)) {
                    C4508g c4508g = (C4508g) obj;
                    L2.b bVar = c4508g.f37707u;
                    if (!bVar.b()) {
                        if (c0332s.f2091E && !bVar.a()) {
                            c0332s.a();
                            c0332s.h();
                            break;
                        } else {
                            c0332s.f(bVar);
                            break;
                        }
                    } else {
                        O2.t tVar = c4508g.f37708v;
                        O2.w.h(tVar);
                        L2.b bVar2 = tVar.f2472v;
                        if (!bVar2.b()) {
                            Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar2)), new Exception());
                            c0332s.f(bVar2);
                            break;
                        } else {
                            c0332s.f2093G = true;
                            IBinder iBinder = tVar.f2471u;
                            if (iBinder == null) {
                                k6 = null;
                            } else {
                                int i = AbstractBinderC0364a.f2379n;
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                                k6 = queryLocalInterface instanceof InterfaceC0373j ? (InterfaceC0373j) queryLocalInterface : new O2.K(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                            }
                            O2.w.h(k6);
                            c0332s.f2094H = k6;
                            c0332s.f2095I = tVar.f2473w;
                            c0332s.J = tVar.f2474x;
                            c0332s.h();
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0327m(C0332s c0332s, C0332s c0332s2, C4508g c4508g) {
        super(c0332s);
        this.f2077c = c0332s2;
        this.f2078d = c4508g;
    }
}
