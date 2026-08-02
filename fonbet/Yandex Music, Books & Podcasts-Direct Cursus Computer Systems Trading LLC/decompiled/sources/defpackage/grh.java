package defpackage;

import android.os.Message;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes.dex */
public final class grh {
    public boolean a;
    public boolean b;
    public int c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public Serializable h;
    public Object i;
    public Object j;

    public grh(yld yldVar, irh irhVar, zqh zqhVar, int i, irh irhVar2, Collection collection) {
        this.j = null;
        this.a = false;
        this.b = false;
        this.i = new WeakReference(yldVar);
        this.f = irhVar;
        this.d = zqhVar;
        this.c = i;
        this.e = yldVar.d;
        this.g = irhVar2;
        this.h = collection != null ? new ArrayList(collection) : null;
        yldVar.a.postDelayed(new dyg(8, this), 15000L);
    }

    public static thj f(p7p p7pVar) {
        return new thj(pkb.Wave, StationId.e(o8g.E(p7pVar.b.c)).h(), 1, 1, "");
    }

    public void a() {
        zqh zqhVar = (zqh) this.d;
        if (this.a || this.b) {
            return;
        }
        this.b = true;
        if (zqhVar != null) {
            zqhVar.h(0);
            zqhVar.d();
        }
    }

    public void b(q0p q0pVar, String str, int i) {
        bmb bmbVar;
        str.getClass();
        String str2 = (String) this.i;
        if (str2 == null) {
            return;
        }
        Pair c = c();
        n1p n1pVar = (n1p) c.a;
        int intValue = ((Number) c.b).intValue();
        tao taoVar = (tao) this.d;
        int ordinal = q0pVar.ordinal();
        if (ordinal == 0) {
            bmbVar = bmb.ConcertScreen;
        } else {
            if (ordinal != 1) {
                b6e.s();
                return;
            }
            bmbVar = bmb.ConcertPurchaseScreen;
        }
        ((nmb) taoVar.d).A(tao.t(tao.d(n1pVar)), intValue, str2, (String) taoVar.b, ((zzp) taoVar.e).b(), tao.k((c0p) taoVar.c), ((fnb) taoVar.a).G(), i, cmb.Concert, str, bmbVar);
    }

    public Pair c() {
        Pair pair = (Pair) this.h;
        n1p n1pVar = (n1p) pair.a;
        List list = (List) pair.b;
        int i = 0;
        if (!Intrinsics.d(n1pVar != null ? n1pVar.a : null, "top")) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.d(n1pVar != null ? n1pVar.a : null, ((n1p) it.next()).a)) {
                    break;
                }
                i++;
            }
        }
        return new Pair(n1pVar, Integer.valueOf(i));
    }

    public void d() {
        ys3 ys3Var;
        irh irhVar = (irh) this.e;
        int i = this.c;
        WeakReference weakReference = (WeakReference) this.i;
        krh.b();
        if (this.a || this.b) {
            return;
        }
        yld yldVar = (yld) weakReference.get();
        if (yldVar == null || yldVar.g != this || ((ys3Var = (ys3) this.j) != null && ys3Var.isCancelled())) {
            a();
            return;
        }
        this.a = true;
        yldVar.g = null;
        yld yldVar2 = (yld) weakReference.get();
        if (yldVar2 != null) {
            HashMap hashMap = yldVar2.b;
            if (yldVar2.d == irhVar) {
                Message obtainMessage = yldVar2.a.obtainMessage(263, irhVar);
                obtainMessage.arg1 = i;
                obtainMessage.sendToTarget();
                zqh zqhVar = yldVar2.e;
                if (zqhVar != null) {
                    zqhVar.h(i);
                    yldVar2.e.d();
                }
                if (!hashMap.isEmpty()) {
                    for (zqh zqhVar2 : hashMap.values()) {
                        zqhVar2.h(i);
                        zqhVar2.d();
                    }
                    hashMap.clear();
                }
                yldVar2.e = null;
            }
        }
        yld yldVar3 = (yld) weakReference.get();
        if (yldVar3 == null) {
            return;
        }
        irh irhVar2 = (irh) this.f;
        yldVar3.d = irhVar2;
        yldVar3.e = (zqh) this.d;
        irh irhVar3 = (irh) this.g;
        vld vldVar = yldVar3.a;
        if (irhVar3 == null) {
            Message obtainMessage2 = vldVar.obtainMessage(262, new z4k(irhVar, irhVar2));
            obtainMessage2.arg1 = i;
            obtainMessage2.sendToTarget();
        } else {
            Message obtainMessage3 = vldVar.obtainMessage(264, new z4k(irhVar3, irhVar2));
            obtainMessage3.arg1 = i;
            obtainMessage3.sendToTarget();
        }
        yldVar3.b.clear();
        yldVar3.g();
        yldVar3.l();
        ArrayList arrayList = (ArrayList) this.h;
        if (arrayList != null) {
            yldVar3.d.n(arrayList);
        }
    }

    public void e(r0p r0pVar, String str, int i) {
        str.getClass();
        String str2 = (String) this.i;
        if (str2 == null) {
            return;
        }
        Pair c = c();
        n1p n1pVar = (n1p) c.a;
        int intValue = ((Number) c.b).intValue();
        tao taoVar = (tao) this.d;
        cmb u = tao.u(r0pVar);
        bmb s = tao.s(r0pVar);
        if (s == null) {
            return;
        }
        ((nmb) taoVar.d).A(tao.t(tao.d(n1pVar)), intValue, str2, (String) taoVar.b, ((zzp) taoVar.e).b(), tao.k((c0p) taoVar.c), ((fnb) taoVar.a).G(), i, u, str, s);
    }

    public grh(tao taoVar, tmb tmbVar) {
        this.d = taoVar;
        this.e = tmbVar;
        this.f = new LinkedHashMap();
        this.g = new quk();
        this.h = new Pair(null, c5b.a);
        this.j = "";
    }
}
