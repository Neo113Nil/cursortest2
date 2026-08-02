package defpackage;

import android.content.SharedPreferences;
import android.os.Build;
import android.view.View;
import androidx.fragment.app.t;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ri implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ri(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00db, code lost:
    
        if (defpackage.fk0.c(r2, r3, r4, null, r6, 12) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00dd, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ba, code lost:
    
        if (r12 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(a1d a1dVar, Continuation continuation) {
        fa1 fa1Var;
        int i;
        d85 d85Var;
        ha1 ha1Var = (ha1) this.b;
        if (continuation instanceof fa1) {
            fa1Var = (fa1) continuation;
            int i2 = fa1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fa1Var.l = i2 - Integer.MIN_VALUE;
                fa1 fa1Var2 = fa1Var;
                Object obj = fa1Var2.j;
                nm6 nm6Var = nm6.a;
                i = fa1Var2.l;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    d85 d85Var2 = (d85) obj;
                    if (d85Var2 != null) {
                        long j = d85Var2.a;
                        fk0 fk0Var = ha1Var.g;
                        d85 d85Var3 = new d85(j);
                        act S = weo.S(300, 0, null, 6);
                        fa1Var2.l = 2;
                    }
                    return Unit.a;
                }
                qgg.h0(obj);
                if (!Intrinsics.d(a1dVar, y0d.a)) {
                    if (a1dVar instanceof z0d) {
                        x6k x6kVar = ha1Var.f;
                        z0d z0dVar = (z0d) a1dVar;
                        List list = z0dVar.e;
                        int i3 = z0dVar.a;
                        int i4 = z0dVar.b;
                        x6kVar.setValue(Boolean.valueOf(list.get(i4) instanceof k0d));
                        x6k x6kVar2 = ha1Var.e;
                        x6kVar2.setValue(Boolean.valueOf(((Boolean) x6kVar2.getValue()).booleanValue() && i4 == i3));
                        fa1Var2.l = 1;
                        l0d l0dVar = (l0d) CollectionsKt.S(list, i4);
                        if (l0dVar == null) {
                            obj = null;
                        } else {
                            if (l0dVar instanceof j0d) {
                                if (i4 == i3) {
                                    d85Var = new d85(ha1Var.a.b());
                                } else {
                                    obj = h4a.t(((j0d) l0dVar).a.a, ha1Var.b, ha1Var.c, false, fa1Var2);
                                }
                            } else {
                                if (!(l0dVar instanceof k0d)) {
                                    b6e.s();
                                    return null;
                                }
                                d85Var = new d85(svd.a);
                            }
                            obj = d85Var;
                        }
                    } else if (!Intrinsics.d(a1dVar, x0d.a)) {
                        b6e.s();
                        return null;
                    }
                }
                return Unit.a;
            }
        }
        fa1Var = new fa1(this, continuation);
        fa1 fa1Var22 = fa1Var;
        Object obj2 = fa1Var22.j;
        nm6 nm6Var2 = nm6.a;
        i = fa1Var22.l;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (r7.Y(r6, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(IndexedValue indexedValue, Continuation continuation) {
        ir3 ir3Var;
        int i;
        ri riVar;
        if (continuation instanceof ir3) {
            ir3Var = (ir3) continuation;
            int i2 = ir3Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ir3Var.n = i2 - Integer.MIN_VALUE;
                Object obj = ir3Var.l;
                nm6 nm6Var = nm6.a;
                i = ir3Var.n;
                if (i != 0) {
                    qgg.h0(obj);
                    x0q x0qVar = (x0q) ((gs4) this.b).b;
                    ir3Var.j = this;
                    ir3Var.k = indexedValue;
                    ir3Var.n = 1;
                    if (x0qVar.emit(indexedValue, ir3Var) != nm6Var) {
                        riVar = this;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                indexedValue = ir3Var.k;
                riVar = ir3Var.j;
                qgg.h0(obj);
                x0 x0Var = (x0) ((gs4) riVar.b).a;
                ir3Var.j = null;
                ir3Var.k = null;
                ir3Var.n = 2;
            }
        }
        ir3Var = new ir3(this, continuation);
        Object obj2 = ir3Var.l;
        nm6 nm6Var2 = nm6.a;
        i = ir3Var.n;
        if (i != 0) {
        }
        x0 x0Var2 = (x0) ((gs4) riVar.b).a;
        ir3Var.j = null;
        ir3Var.k = null;
        ir3Var.n = 2;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        wh1 wh1Var;
        Integer num;
        int i = this.a;
        boolean z = false;
        z = false;
        Continuation continuation2 = null;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((x6k) obj2).setValue(obj);
                break;
            case 1:
                mu muVar = (mu) obj2;
                muVar.g.l(null);
                String str = ((xxq) obj).a;
                str.getClass();
                Object b = mu.b(muVar, str, continuation);
                if (b != nm6.a) {
                    break;
                }
                break;
            case 2:
                t requireActivity = ((xz) obj2).requireActivity();
                requireActivity.getClass();
                ((Function1) obj).invoke(requireActivity);
                break;
            case 3:
                ((y40) obj2).k.l((c50) obj);
                break;
            case 4:
                ((e60) obj2).k.l((k60) obj);
                break;
            case 5:
                qne qneVar = (qne) obj2;
                if (Build.VERSION.SDK_INT >= 34) {
                    rb.N(qneVar.r(), (View) qneVar.a);
                }
                break;
            case 6:
                SharedPreferences sharedPreferences = ((ku0) obj2).b;
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt("app_launch_count", sharedPreferences.getInt("app_launch_count", 0) + 1);
                if (!sharedPreferences.contains("install_date_24026391")) {
                    edit.putLong("install_date_24026391", System.currentTimeMillis());
                }
                edit.apply();
                break;
            case 7:
                tdl tdlVar = (tdl) obj;
                xdl xdlVar = (xdl) ((x21) obj2).f.getValue();
                String str2 = tdlVar.d;
                xdlVar.a(new avo(pkb.Concert, tdlVar.a.a), new avo(pkb.Artist, tdlVar.b), str2 != null ? str2 : "");
                break;
            case 8:
                ((d31) obj2).d.l((g31) obj);
                break;
            case 9:
                udl udlVar = (udl) obj;
                xdl xdlVar2 = (xdl) ((z51) obj2).f.getValue();
                String str3 = udlVar.d;
                String str4 = str3 != null ? str3 : "";
                avo avoVar = avo.c;
                xdlVar2.a(new avo(pkb.Donation, "donation"), new avo(pkb.Artist, udlVar.b), str4);
                break;
            case 10:
                ((b61) obj2).d.l((e61) obj);
                break;
            case 11:
                break;
            case 12:
                mc1 mc1Var = (mc1) obj2;
                mc1Var.g.l(null);
                String str5 = ((xxq) obj).a;
                str5.getClass();
                Object b2 = mc1.b(mc1Var, str5, continuation);
                if (b2 != nm6.a) {
                    break;
                }
                break;
            case 13:
                ((dg1) obj2).m.l((wf1) obj);
                break;
            case 14:
                x66 x66Var = (x66) obj;
                mj1 mj1Var = (mj1) obj2;
                if (mj1Var.H == wh1.c) {
                    break;
                } else {
                    int ordinal = x66Var.b.ordinal();
                    if (ordinal == 0) {
                        wh1Var = wh1.b;
                    } else if (ordinal != 1) {
                        b6e.s();
                        break;
                    } else {
                        wh1Var = wh1.a;
                    }
                    mj1Var.H = wh1Var;
                    mj1.H(mj1Var, null, 3);
                    x97.y(ot0.F(mj1Var), null, null, new ij1(mj1Var, continuation2, z ? 1 : 0), 3);
                    break;
                }
            case 15:
                ((kz1) obj2).l.l((iz1) obj);
                break;
            case 16:
                ((Boolean) obj).getClass();
                b12 b12Var = (b12) obj2;
                iw1 iw1Var = b12Var.g;
                if (!((Boolean) iw1Var.f.getValue()).booleanValue()) {
                    iw1Var = b12Var.f;
                }
                iw1 iw1Var2 = b12Var.j;
                if (iw1Var2 != iw1Var) {
                    ssg.a(3, b12Var.b, "Recreating from " + iw1Var2.b + " to " + iw1Var.b, null);
                    b12Var.j.e();
                    b12Var.j = iw1Var;
                    nej nejVar = b12Var.i;
                    if (nejVar != null) {
                        iw1Var.f(nejVar);
                    }
                }
                ArrayList arrayList = b12Var.h;
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((Boolean) ((gw1) it.next()).b().getValue()).booleanValue()) {
                                z = true;
                            }
                        }
                    }
                }
                v3w.n(z, b12Var.k, null);
                if (!z && (num = b12Var.j.h) != null) {
                    b12Var.a.a(num.intValue(), f6q.Automatic);
                }
                break;
            case 17:
                ssg.a(3, "AutoplayTrigger", "queue became Active, launching autoplay", null);
                Object b3 = ((rf2) ((zf2) obj2).b).b(continuation);
                if (b3 != nm6.a) {
                    break;
                }
                break;
            case 18:
                Object c = fk0.c((fk0) obj2, new d85(((d85) obj).a), null, null, continuation, 14);
                if (c != nm6.a) {
                    break;
                }
                break;
            case 19:
                ((np2) obj2).t(((Boolean) obj).booleanValue());
                break;
            case 20:
                Object obj3 = ((z7o) obj).a;
                z03 z03Var = (z03) obj2;
                if (!(obj3 instanceof t7o)) {
                    fg3 fg3Var = (fg3) obj3;
                    fg3Var.getClass();
                    cdv cdvVar = (cdv) z03Var.e;
                    if (cdvVar != null) {
                        cdvVar.C(ycv.a);
                    }
                    sx3 sx3Var = (sx3) z03Var.f;
                    if (sx3Var != null) {
                        sx3Var.a(new px3(fg3Var));
                    }
                }
                Throwable a = z7o.a(obj3);
                if (a != null) {
                    z03Var.i((bfk) a);
                }
                break;
            case 21:
                xee.t((kv6) ((mmo) obj2).b, (tv1) obj);
                break;
            case 22:
                ((x83) obj2).k.l((b93) obj);
                break;
            case 23:
                u0s u0sVar = (u0s) obj;
                va3 va3Var = (va3) obj2;
                va3Var.getClass();
                u0sVar.getClass();
                va3Var.f.b().h(u0sVar);
                break;
            case 24:
                t requireActivity2 = ((ja3) obj2).requireActivity();
                requireActivity2.getClass();
                ((Function1) obj).invoke(requireActivity2);
                break;
            case 25:
                ((Boolean) obj).getClass();
                ssg.a(3, null, "refresh book screen due to purchase the option", null);
                ((ob3) obj2).N();
                break;
            case 26:
                rk3 rk3Var = (rk3) obj2;
                uf3 uf3Var = rk3Var.c;
                xrt xrtVar = rk3Var.b;
                if (!((Boolean) uf3Var.invoke()).booleanValue() || v3g.E((dqi) xrtVar.a.getValue()).d) {
                    break;
                } else {
                    ssg.a(3, "BullfinchVpnWatcher", "Vpn disabled, updating user service availability", null);
                    Object V = x97.V(dm6.b, new lk3(xrtVar, continuation2, 1), continuation);
                    nm6 nm6Var = nm6.a;
                    if (V != nm6Var) {
                        V = Unit.a;
                    }
                    if (V != nm6Var) {
                        break;
                    }
                }
                break;
            case 27:
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                sz3 sz3Var = (sz3) obj;
                p04 p04Var = (p04) obj2;
                x6k x6kVar = p04Var.l;
                xdr xdrVar = p04Var.i;
                sz3Var.getClass();
                List list = sz3Var.b;
                x6kVar.setValue(Boolean.TRUE);
                ArrayList<ez3> arrayList2 = sz3Var.a;
                ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((ez3) it2.next()).a);
                }
                p04Var.e = arrayList3;
                if (arrayList2.isEmpty() && (list == null || list.isEmpty())) {
                    xdrVar.getClass();
                    xdrVar.m(null, k04.a);
                } else {
                    ArrayList arrayList4 = new ArrayList(v75.o(arrayList2, 10));
                    for (ez3 ez3Var : arrayList2) {
                        c01 c01Var = ez3Var.a;
                        arrayList4.add(new o04(c01Var, new q91(c01Var.b, vz1.w(c01Var.q.a), false), ez3Var.b));
                    }
                    m04 m04Var = new m04(arrayList4, list, sz3Var.c);
                    xdrVar.getClass();
                    xdrVar.m(null, m04Var);
                }
                if (list != null) {
                    jp1 jp1Var = p04Var.d;
                    x97.y(jp1Var.b, null, null, new fp1(jp1Var, continuation2, 1), 3);
                }
                rmb.h(p04Var.b, arrayList2.size(), 2);
                kzp kzpVar = p04Var.h;
                if (kzpVar != null) {
                    kzpVar.invoke(new d73(p04Var.a));
                }
                p04Var.f = true;
                break;
            default:
                List list2 = (List) obj;
                d54 d54Var = (d54) obj2;
                xdr xdrVar2 = d54Var.l;
                w44 w44Var = new w44(list2);
                xdrVar2.getClass();
                xdrVar2.m(null, w44Var);
                kzp kzpVar2 = d54Var.k;
                if (kzpVar2 != null) {
                    kzpVar2.invoke(new d73(d54Var.a));
                }
                rmb.h(d54Var.b, list2.size(), 2);
                break;
        }
        return Unit.a;
    }
}
