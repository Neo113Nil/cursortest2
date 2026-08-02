package defpackage;

import com.yandex.passport.api.p;
import com.yandex.passport.api.r;
import com.yandex.passport.api.s;
import com.yandex.passport.api.t;
import com.yandex.passport.api.u;
import com.yandex.passport.api.v;
import com.yandex.passport.api.z1;
import com.yandex.passport.internal.account.f;
import java.io.IOException;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class utg implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;
    public final /* synthetic */ hgp c;

    public /* synthetic */ utg(rjc rjcVar, hgp hgpVar, int i) {
        this.a = i;
        this.b = rjcVar;
        this.c = hgpVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ea  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ttg ttgVar;
        Object obj2;
        nm6 nm6Var;
        int i;
        int i2;
        rjc rjcVar;
        int i3;
        rjc rjcVar2;
        wtg wtgVar;
        Object obj3;
        nm6 nm6Var2;
        int i4;
        int i5;
        rjc rjcVar3;
        int i6;
        rjc rjcVar4;
        switch (this.a) {
            case 0:
                if (continuation instanceof ttg) {
                    ttgVar = (ttg) continuation;
                    int i7 = ttgVar.k;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        ttgVar.k = i7 - Integer.MIN_VALUE;
                        obj2 = ttgVar.j;
                        nm6Var = nm6.a;
                        i = ttgVar.k;
                        if (i != 0) {
                            qgg.h0(obj2);
                            v vVar = (v) obj;
                            ssg.a(3, null, "login result = " + vVar, null);
                            boolean z = vVar instanceof t;
                            i2 = 0;
                            rjcVar = this.b;
                            if (z) {
                                z1 z1Var = ((t) vVar).a;
                                ttgVar.m = rjcVar;
                                ttgVar.n = 0;
                                ttgVar.k = 1;
                                obj2 = hgp.a(this.c, false, z1Var, ttgVar);
                                if (obj2 == nm6Var) {
                                    return nm6Var;
                                }
                                i3 = 0;
                                rjcVar2 = rjcVar;
                                rjcVar = rjcVar2;
                                i2 = i3;
                            } else {
                                boolean d = Intrinsics.d(vVar, s.a);
                                mtg mtgVar = mtg.a;
                                if (d) {
                                    ztg.b.g(new IOException("Login forbidden"), false);
                                } else if (!Intrinsics.d(vVar, p.a)) {
                                    if (vVar instanceof r) {
                                        ztg.b.g(((r) vVar).a, false);
                                    } else {
                                        if (!(vVar instanceof u)) {
                                            b6e.s();
                                            return null;
                                        }
                                        obj2 = new ntg(((u) vVar).a);
                                    }
                                }
                                obj2 = mtgVar;
                            }
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    qgg.h0(obj2);
                                    return Unit.a;
                                }
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i3 = ttgVar.n;
                            rjcVar2 = ttgVar.m;
                            qgg.h0(obj2);
                            rjcVar = rjcVar2;
                            i2 = i3;
                        }
                        ttgVar.m = null;
                        ttgVar.n = i2;
                        ttgVar.k = 2;
                        if (rjcVar.emit(obj2, ttgVar) == nm6Var) {
                            return nm6Var;
                        }
                        return Unit.a;
                    }
                }
                ttgVar = new ttg(this, continuation);
                obj2 = ttgVar.j;
                nm6Var = nm6.a;
                i = ttgVar.k;
                if (i != 0) {
                }
                ttgVar.m = null;
                ttgVar.n = i2;
                ttgVar.k = 2;
                if (rjcVar.emit(obj2, ttgVar) == nm6Var) {
                }
                return Unit.a;
            default:
                if (continuation instanceof wtg) {
                    wtgVar = (wtg) continuation;
                    int i8 = wtgVar.k;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        wtgVar.k = i8 - Integer.MIN_VALUE;
                        obj3 = wtgVar.j;
                        nm6Var2 = nm6.a;
                        i4 = wtgVar.k;
                        if (i4 != 0) {
                            qgg.h0(obj3);
                            Object obj4 = ((z7o) obj).a;
                            ssg.a(3, null, "autologin result = ".concat(z7o.b(obj4)), null);
                            f fVar = (f) (obj4 instanceof t7o ? null : obj4);
                            hgp hgpVar = this.c;
                            i5 = 0;
                            rjcVar3 = this.b;
                            if (fVar == null) {
                                ztg ztgVar = ztg.b;
                                Throwable a = z7o.a(obj4);
                                ztgVar.getClass();
                                Map b = tah.b(new Pair("throwable", a));
                                b.getClass();
                                ot0.A(ztgVar.e(), "login_retry", b);
                                hgpVar.p();
                                obj3 = null;
                                wtgVar.m = null;
                                wtgVar.n = i5;
                                wtgVar.k = 2;
                                if (rjcVar3.emit(obj3, wtgVar) == nm6Var2) {
                                    return nm6Var2;
                                }
                                return Unit.a;
                            }
                            z1 z1Var2 = fVar.a;
                            wtgVar.m = rjcVar3;
                            wtgVar.n = 0;
                            wtgVar.k = 1;
                            obj3 = hgp.a(hgpVar, true, z1Var2, wtgVar);
                            if (obj3 == nm6Var2) {
                                return nm6Var2;
                            }
                            i6 = 0;
                            rjcVar4 = rjcVar3;
                        } else {
                            if (i4 != 1) {
                                if (i4 == 2) {
                                    qgg.h0(obj3);
                                    return Unit.a;
                                }
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i6 = wtgVar.n;
                            rjcVar4 = wtgVar.m;
                            qgg.h0(obj3);
                        }
                        i5 = i6;
                        rjcVar3 = rjcVar4;
                        wtgVar.m = null;
                        wtgVar.n = i5;
                        wtgVar.k = 2;
                        if (rjcVar3.emit(obj3, wtgVar) == nm6Var2) {
                        }
                        return Unit.a;
                    }
                }
                wtgVar = new wtg(this, continuation);
                obj3 = wtgVar.j;
                nm6Var2 = nm6.a;
                i4 = wtgVar.k;
                if (i4 != 0) {
                }
                i5 = i6;
                rjcVar3 = rjcVar4;
                wtgVar.m = null;
                wtgVar.n = i5;
                wtgVar.k = 2;
                if (rjcVar3.emit(obj3, wtgVar) == nm6Var2) {
                }
                return Unit.a;
        }
    }
}
