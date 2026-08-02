package ru.yandex.taxi.preorder.source.pickup;

import android.graphics.Bitmap;
import com.yandex.go.image.domain.requests.g;
import defpackage.aev;
import defpackage.ah00;
import defpackage.avj0;
import defpackage.dmb0;
import defpackage.eqb0;
import defpackage.evu0;
import defpackage.fmb0;
import defpackage.g16;
import defpackage.gh00;
import defpackage.gmb0;
import defpackage.hit;
import defpackage.hmb0;
import defpackage.jl40;
import defpackage.k7x0;
import defpackage.lev;
import defpackage.m16;
import defpackage.ny61;
import defpackage.obv;
import defpackage.pav;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.u8w;
import defpackage.uh;
import defpackage.uyi;
import defpackage.vac;
import defpackage.wpb0;
import defpackage.wq40;
import defpackage.wrg0;
import defpackage.zuj0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.map_object.Trigger;

/* loaded from: classes9.dex */
public final class a {
    public final u8w a;
    public final pav b;
    public final k7x0 c;
    public final hmb0 d;
    public final eqb0 e;
    public final hit f;
    public final com.yandex.go.lifecycle.a g;
    public zzs h;
    public zzs i;
    public String j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;
    public gmb0 o;
    public final ArrayList p;

    public a(u8w u8wVar, zuj0 zuj0Var, pav pavVar, k7x0 k7x0Var, hmb0 hmb0Var, eqb0 eqb0Var, hit hitVar, com.yandex.go.lifecycle.a aVar) {
        this.a = u8wVar;
        this.b = pavVar;
        this.c = k7x0Var;
        this.d = hmb0Var;
        this.e = eqb0Var;
        this.f = hitVar;
        this.g = aVar;
        avj0 avj0Var = (avj0) zuj0Var;
        float b = avj0Var.b(wrg0.pickup_point_sticky_distance_min);
        this.k = b;
        float b2 = avj0Var.b(wrg0.pickup_point_sticky_distance_max);
        this.l = b2;
        this.m = avj0Var.b(wrg0.pickup_point_tapable_distance);
        this.n = (b2 - b) / 2.0f;
        this.o = new fmb0(new dmb0());
        this.p = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, String str, ContinuationImpl continuationImpl) {
        PickupHelper$preloadByUrl$1 pickupHelper$preloadByUrl$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof PickupHelper$preloadByUrl$1) {
            pickupHelper$preloadByUrl$1 = (PickupHelper$preloadByUrl$1) continuationImpl;
            int i2 = pickupHelper$preloadByUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pickupHelper$preloadByUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pickupHelper$preloadByUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pickupHelper$preloadByUrl$1.label;
                if (i != 0) {
                    b.b(obj);
                    g gVar = (g) aVar.b.e();
                    gVar.c(str);
                    aev aevVar = gVar.f;
                    m16 m16Var = vac.a;
                    uh uhVar = lev.a;
                    aevVar.b().b(lev.e, Boolean.FALSE);
                    aevVar.b().b(lev.a, Bitmap.Config.ARGB_8888);
                    gVar.f = aevVar;
                    pickupHelper$preloadByUrl$1.L$0 = null;
                    pickupHelper$preloadByUrl$1.label = 1;
                    if (ru.yandex.taxi.utils.a.e(gVar, pickupHelper$preloadByUrl$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    ((Result) obj).getClass();
                }
                return zy11.a;
            }
        }
        pickupHelper$preloadByUrl$1 = new PickupHelper$preloadByUrl$1(aVar, continuationImpl);
        Object obj2 = pickupHelper$preloadByUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pickupHelper$preloadByUrl$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    public static boolean b(ah00 ah00Var) {
        return ((gh00) ah00Var).j() > 14.0f;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r1.equals("tap") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        return ru.yandex.taxi.common_models.net.map_object.Trigger.TAP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        if (r1.equals("label_tap") == false) goto L24;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Trigger c() {
        String str = this.j;
        if (str != null) {
            switch (str.hashCode()) {
                case -607398952:
                    break;
                case 114595:
                    break;
                case 3091764:
                    if (str.equals("drag")) {
                        return Trigger.DRAG;
                    }
                    break;
                case 794851428:
                    if (str.equals("multiexit_select")) {
                        return Trigger.SELECT;
                    }
                    break;
            }
        }
        return Trigger.SELECT;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, List list, ContinuationImpl continuationImpl) {
        PickupHelper$pickupObject$1 pickupHelper$pickupObject$1;
        int i;
        Bitmap bitmap;
        if (continuationImpl instanceof PickupHelper$pickupObject$1) {
            pickupHelper$pickupObject$1 = (PickupHelper$pickupObject$1) continuationImpl;
            int i2 = pickupHelper$pickupObject$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pickupHelper$pickupObject$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pickupHelper$pickupObject$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pickupHelper$pickupObject$1.label;
                hmb0 hmb0Var = this.d;
                if (i != 0) {
                    b.b(obj);
                    if ("default_tag".equals(str)) {
                        dmb0 dmb0Var = new dmb0();
                        dmb0Var.b = hmb0Var.a();
                        dmb0Var.c = "default_tag";
                        dmb0Var.a = list;
                        return new fmb0(dmb0Var);
                    }
                    g16 c = this.b.b().i(new obv(str, null, 6, 0)).c();
                    pickupHelper$pickupObject$1.L$0 = list;
                    pickupHelper$pickupObject$1.L$1 = str;
                    pickupHelper$pickupObject$1.label = 1;
                    obj = ru.yandex.taxi.utils.a.b(c, pickupHelper$pickupObject$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) pickupHelper$pickupObject$1.L$1;
                    list = (List) pickupHelper$pickupObject$1.L$0;
                    b.b(obj);
                }
                bitmap = (Bitmap) obj;
                if (bitmap == null) {
                    dmb0 dmb0Var2 = new dmb0();
                    dmb0Var2.b = new uyi(0, bitmap);
                    dmb0Var2.c = str;
                    dmb0Var2.a = list;
                    return new fmb0(dmb0Var2);
                }
                dmb0 dmb0Var3 = new dmb0();
                dmb0Var3.b = hmb0Var.a();
                dmb0Var3.c = "default_tag";
                dmb0Var3.a = list;
                return new fmb0(dmb0Var3);
            }
        }
        pickupHelper$pickupObject$1 = new PickupHelper$pickupObject$1(this, continuationImpl);
        Object obj2 = pickupHelper$pickupObject$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pickupHelper$pickupObject$1.label;
        hmb0 hmb0Var2 = this.d;
        if (i != 0) {
        }
        bitmap = (Bitmap) obj2;
        if (bitmap == null) {
        }
    }

    public final Object e(String str, List list, ContinuationImpl continuationImpl) {
        tje.N(this.f.a, null, null, new PickupHelper$preloadPickupImages$1(this, list, null), 3);
        return d(str, list, continuationImpl);
    }

    public final void f(ArrayList arrayList, List list) {
        ArrayList arrayList2;
        Object obj;
        wpb0 wpb0Var;
        boolean isEmpty = list.isEmpty();
        eqb0 eqb0Var = this.e;
        if (!isEmpty) {
            List<wpb0> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (wpb0 wpb0Var2 : list2) {
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            wq40 wq40Var = (wq40) it.next();
                            if (jl40.l(wpb0Var2 != null ? wpb0Var2.a : null, wq40Var != null ? wq40Var.b() : null)) {
                                arrayList2 = new ArrayList(tcc.n(list2, 10));
                                for (wpb0 wpb0Var3 : list2) {
                                    Iterator it2 = arrayList.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            obj = null;
                                            break;
                                        }
                                        obj = it2.next();
                                        wq40 wq40Var2 = (wq40) obj;
                                        if (jl40.l(wpb0Var3 != null ? wpb0Var3.a : null, wq40Var2 != null ? wq40Var2.b() : null)) {
                                            break;
                                        }
                                    }
                                    wq40 wq40Var3 = (wq40) obj;
                                    List list3 = wpb0Var3.g;
                                    if (list3 == null) {
                                        list3 = EmptyList.a;
                                    }
                                    eqb0Var.getClass();
                                    wpb0 a = eqb0.a(wq40Var3, list3);
                                    if (a == null) {
                                        String str = wpb0Var3.f;
                                        if (wq40Var3 == null) {
                                            if (str != null && !evu0.J(str)) {
                                                wpb0Var = new wpb0(wpb0Var3, null);
                                                wpb0Var3 = wpb0Var;
                                            }
                                            a = wpb0Var3;
                                        } else {
                                            String c = wq40Var3.c();
                                            if (!c.equals(str)) {
                                                wpb0Var = new wpb0(wpb0Var3, c);
                                                wpb0Var3 = wpb0Var;
                                            }
                                            a = wpb0Var3;
                                        }
                                    }
                                    arrayList2.add(a);
                                }
                                dmb0 dmb0Var = new dmb0();
                                dmb0Var.a = arrayList2;
                                dmb0Var.b = this.o.a();
                                dmb0Var.c = this.o.d();
                                this.o = new fmb0(dmb0Var);
                            }
                        }
                    }
                }
            }
        }
        arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            wq40 wq40Var4 = (wq40) it3.next();
            eqb0Var.getClass();
            wpb0 a2 = eqb0.a(wq40Var4, null);
            if (a2 != null) {
                arrayList2.add(a2);
            }
        }
        dmb0 dmb0Var2 = new dmb0();
        dmb0Var2.a = arrayList2;
        dmb0Var2.b = this.o.a();
        dmb0Var2.c = this.o.d();
        this.o = new fmb0(dmb0Var2);
    }

    public final void g(gmb0 gmb0Var) {
        this.o = gmb0Var;
        ArrayList arrayList = this.p;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((tls) it.next()).invoke(gmb0Var);
        }
        arrayList.clear();
    }

    public final wpb0 h(ah00 ah00Var, zzs zzsVar, boolean z) {
        float f;
        gh00 gh00Var = (gh00) ah00Var;
        float j = gh00Var.j();
        if (z) {
            f = this.m;
        } else {
            float f2 = this.k;
            f = j <= 15.0f ? f2 : j >= 17.0f ? this.l : ((j - 15.0f) * this.n) + f2;
        }
        wpb0 wpb0Var = null;
        double d = Double.MAX_VALUE;
        for (wpb0 wpb0Var2 : this.o.b()) {
            if (wpb0Var2.q) {
                double f3 = gh00Var.f(ru.yandex.taxi.map.utils.a.F(zzsVar), ru.yandex.taxi.map.utils.a.F(wpb0Var2.b));
                if (Double.compare(f3, Math.min(f, d)) < 0) {
                    wpb0Var = wpb0Var2;
                    d = f3;
                }
            }
        }
        return wpb0Var;
    }
}
