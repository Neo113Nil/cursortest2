package defpackage;

import com.yandex.mapkit.geometry.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import ru.yandex.taxi.map.utils.a;

/* loaded from: classes12.dex */
public final class xhn implements jhn {
    public final /* synthetic */ yhn a;

    public xhn(yhn yhnVar) {
        this.a = yhnVar;
    }

    @Override // defpackage.jhn
    public final void L3(uin uinVar) {
        Object id;
        yhn yhnVar = this.a;
        r58 r58Var = yhnVar.B;
        dhn dhnVar = yhnVar.w;
        tgn tgnVar = yhnVar.c;
        ah00 ah00Var = (ah00) yhnVar.b;
        din dinVar = yhnVar.y;
        hz40 hz40Var = yhnVar.A;
        hz40 hz40Var2 = yhnVar.z;
        if (jl40.l(uinVar, oin.b)) {
            dinVar.f();
            return;
        }
        if (uinVar instanceof lin) {
            lin linVar = (lin) uinVar;
            xm00 p = ((gh00) ah00Var).i.p();
            ArrayList arrayList = linVar.b;
            Set set = linVar.c;
            tgnVar.a(arrayList.size(), dhnVar);
            Iterator it = p.q(arrayList).iterator();
            Iterator it2 = set.iterator();
            while (it.hasNext() && it2.hasNext()) {
                f4c0 f4c0Var = (f4c0) it.next();
                vj00 vj00Var = (vj00) it2.next();
                mhn mhnVar = (mhn) vj00Var;
                String str = mhnVar.a;
                vj00 vj00Var2 = linVar.d;
                yhn.Jg(f4c0Var, mhnVar, jl40.l(str, vj00Var2 != null ? vj00Var2.getId() : null));
                f4c0Var.h(vj00Var);
                hz40Var.o(vj00Var.getId(), f4c0Var);
            }
            p.g(r58Var);
            hz40Var2.o(linVar.a, p);
            return;
        }
        if (uinVar instanceof min) {
            min minVar = (min) uinVar;
            xm00 p2 = ((gh00) ah00Var).i.p();
            p2.g(r58Var);
            yhnVar.Ig(p2, minVar.c, minVar.b);
            hz40Var2.o(minVar.a, p2);
            return;
        }
        if (!(uinVar instanceof sin)) {
            if (uinVar instanceof tin) {
                tin tinVar = (tin) uinVar;
                xm00 xm00Var = (xm00) hz40Var2.d(tinVar.a);
                if (xm00Var == null) {
                    g8e.A(jst.e, "Collection doesn't exist on rowan objects update event");
                    return;
                } else {
                    yhnVar.Lg(tinVar.d);
                    yhnVar.Ig(xm00Var, tinVar.b, tinVar.c);
                    return;
                }
            }
            if (!(uinVar instanceof pin)) {
                if (uinVar instanceof qin) {
                    yhn.Hg(yhnVar, ((qin) uinVar).a, true);
                    return;
                }
                if (uinVar instanceof nin) {
                    yhn.Hg(yhnVar, ((nin) uinVar).a, false);
                    return;
                }
                if (uinVar instanceof rin) {
                    yhnVar.x.Kg(((rin) uinVar).a);
                    return;
                } else if (jl40.l(uinVar, oin.a)) {
                    dinVar.h(hz40Var.e);
                    return;
                } else {
                    w511.b();
                    return;
                }
            }
            xm00 xm00Var2 = (xm00) hz40Var2.m(((pin) uinVar).a);
            if (xm00Var2 == null) {
                g8e.A(jst.e, "Collection doesn't exist on collection removing event");
                return;
            }
            Iterator it3 = xm00Var2.n().iterator();
            while (it3.hasNext()) {
                Object obj = ((ap00) it3.next()).d;
                if (obj == null) {
                    obj = null;
                }
                vj00 vj00Var3 = (vj00) obj;
                if (vj00Var3 != null && (id = vj00Var3.getId()) != null) {
                    hz40Var.m(id);
                }
            }
            xm00Var2.d();
            return;
        }
        sin sinVar = (sin) uinVar;
        String str2 = sinVar.a;
        vj00 vj00Var4 = sinVar.f;
        xm00 xm00Var3 = (xm00) hz40Var2.d(str2);
        if (xm00Var3 == null) {
            g8e.A(jst.e, "Collection doesn't exist on map objects update event");
            return;
        }
        yhnVar.Lg(sinVar.e);
        for (mhn mhnVar2 : sinVar.d) {
            Object obj2 = mhnVar2.a;
            Point point = mhnVar2.d;
            f4c0 f4c0Var2 = (f4c0) hz40Var.d(obj2);
            if (f4c0Var2 != null) {
                Object obj3 = f4c0Var2.d;
                if (obj3 == null) {
                    obj3 = null;
                }
                mhn mhnVar3 = (mhn) obj3;
                if (mhnVar3 != null) {
                    if (!a.d(point, mhnVar3.d)) {
                        f4c0Var2.o(point);
                    }
                    if (!jl40.l(mhnVar2.b, mhnVar3.b) || !jl40.l(mhnVar2.e, mhnVar3.e)) {
                        yhn.Jg(f4c0Var2, mhnVar2, jl40.l(mhnVar2.a, vj00Var4 != null ? vj00Var4.getId() : null));
                    }
                    f4c0Var2.h(mhnVar2);
                }
            }
        }
        ArrayList arrayList2 = sinVar.c;
        Set set2 = sinVar.b;
        tgnVar.a(arrayList2.size(), dhnVar);
        Iterator it4 = xm00Var3.q(arrayList2).iterator();
        Iterator it5 = set2.iterator();
        while (it4.hasNext() && it5.hasNext()) {
            f4c0 f4c0Var3 = (f4c0) it4.next();
            vj00 vj00Var5 = (vj00) it5.next();
            mhn mhnVar4 = (mhn) vj00Var5;
            yhn.Jg(f4c0Var3, mhnVar4, jl40.l(mhnVar4.a, vj00Var4 != null ? vj00Var4.getId() : null));
            f4c0Var3.h(vj00Var5);
            hz40Var.o(vj00Var5.getId(), f4c0Var3);
        }
    }
}
