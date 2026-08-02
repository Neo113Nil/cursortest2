package Q2;

import R2.AbstractBinderC0375a;
import R2.InterfaceC0384j;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import j3.C4619h;

/* renamed from: Q2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0368m extends x {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2577b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2578c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2579d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0368m(C0370o c0370o, w wVar, O2.b bVar) {
        super(wVar);
        this.f2579d = c0370o;
        this.f2578c = bVar;
    }

    @Override // Q2.x
    public final void a() {
        InterfaceC0384j k9;
        Object obj = this.f2579d;
        Object obj2 = this.f2578c;
        switch (this.f2577b) {
            case 0:
                ((C0370o) obj).f2582w.e((O2.b) obj2);
                break;
            default:
                C0373s c0373s = (C0373s) obj2;
                if (c0373s.j(0)) {
                    C4619h c4619h = (C4619h) obj;
                    O2.b bVar = c4619h.f38485u;
                    if (!bVar.b()) {
                        if (c0373s.f2592E && !bVar.a()) {
                            c0373s.a();
                            c0373s.h();
                            break;
                        } else {
                            c0373s.e(bVar);
                            break;
                        }
                    } else {
                        R2.t tVar = c4619h.f38486v;
                        R2.w.h(tVar);
                        O2.b bVar2 = tVar.f2865v;
                        if (!bVar2.b()) {
                            Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar2)), new Exception());
                            c0373s.e(bVar2);
                            break;
                        } else {
                            c0373s.f2594G = true;
                            IBinder iBinder = tVar.f2864u;
                            if (iBinder == null) {
                                k9 = null;
                            } else {
                                int i = AbstractBinderC0375a.f2772u;
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                                k9 = queryLocalInterface instanceof InterfaceC0384j ? (InterfaceC0384j) queryLocalInterface : new R2.K(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
                            }
                            R2.w.h(k9);
                            c0373s.f2595H = k9;
                            c0373s.f2596I = tVar.f2866w;
                            c0373s.J = tVar.f2867x;
                            c0373s.h();
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0368m(C0373s c0373s, C0373s c0373s2, C4619h c4619h) {
        super(c0373s);
        this.f2578c = c0373s2;
        this.f2579d = c4619h;
    }
}
