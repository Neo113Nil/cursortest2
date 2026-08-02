package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.view.ViewGroup;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.yandex.media.ynison.service.e0;
import com.yandex.music.databases.main.MainDatabase;
import com.yandex.music.design.components.animation.a;
import com.yandex.music.shared.local.queue.domain.errors.NoPreviousStateException;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueLaunch;
import com.yandex.music.shared.relay.common.proto.c;
import com.yandex.music.shared.relay.common.proto.i;
import com.yandex.music.shared.relay.common.proto.j;
import com.yandex.music.shared.relay.common.proto.o;
import com.yandex.music.shared.relay.common.proto.w;
import com.yandex.plus.pay.ui.core.api.tarifficator.b;
import com.yandex.plus.pay.ui.core.api.tarifficator.d;
import com.yandex.plus.pay.ui.tarifficator.api.e;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.Page;
import ru.yandex.music.common.media.context.h;

/* loaded from: classes3.dex */
public final class ckg extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public Object m;
    public Object n;
    public Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckg(fvf fvfVar, qzl qzlVar, jic jicVar, jx7 jx7Var, eoe eoeVar, Continuation continuation) {
        super(2, continuation);
        this.j = 16;
        float f = edo.a;
        this.o = fvfVar;
        this.l = qzlVar;
        this.m = jicVar;
        this.n = jx7Var;
        this.p = eoeVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x064c, code lost:
    
        if (r0 == r3) goto L240;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object k(Object obj) {
        oxa oxaVar;
        List list;
        Object c;
        List<wbn> list2;
        List list3;
        Class<sdl> cls;
        Class<udl> cls2;
        vbn vbnVar;
        String str;
        Object next;
        vbn vbnVar2;
        String str2;
        Object next2;
        Class<sdl> cls3;
        Class<udl> cls4;
        Iterator it;
        Map map;
        xpi xpiVar;
        Object a;
        Object obj2;
        Pair pair;
        lm4 a2;
        vbn vbnVar3 = (vbn) this.n;
        efl eflVar = (efl) this.p;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            oxaVar = new oxa(((zel) this.m).a);
            list = vbnVar3.c;
            kel kelVar = eflVar.c;
            this.l = oxaVar;
            this.o = list;
            this.k = 1;
            c = kelVar.c(true, this);
            if (c == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xpiVar = (bqi) this.o;
                qgg.h0(obj);
                a = obj;
                obj2 = (nel) a;
                ((xdr) xpiVar).l(obj2);
                return Unit.a;
            }
            list = (List) this.o;
            oxaVar = (oxa) this.l;
            qgg.h0(obj);
            c = obj;
        }
        List list4 = (List) c;
        oxaVar.getClass();
        list.getClass();
        list4.getClass();
        long size = list4.size();
        egl eglVar = (egl) oxaVar.b;
        long j = eglVar.a;
        cgl cglVar = eglVar.c;
        cgl cglVar2 = eglVar.b;
        Class<sdl> cls5 = sdl.class;
        Class<udl> cls6 = udl.class;
        if (size >= j) {
            ssg.a(3, "PlayerInformersFilter", "all rule skip: totalShown=" + list4.size() + " >= limit=" + eglVar.a, null);
            Map map2 = e5b.a;
            map2.getClass();
            vbnVar = vbnVar3;
            list2 = list;
            list3 = list4;
            cls = cls5;
            cls2 = cls6;
            map = map2;
        } else {
            Class<cel> cls7 = cel.class;
            ern.a(cls7).h();
            long currentTimeMillis = System.currentTimeMillis();
            List list5 = list;
            HashSet hashSet = new HashSet();
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                zp2 zp2Var = (zp2) CollectionsKt.firstOrNull(((wbn) it2.next()).b.f);
                String str3 = zp2Var != null ? zp2Var.a : null;
                if (str3 != null) {
                    hashSet.add(str3);
                }
            }
            CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
            List list6 = list4;
            list2 = list;
            ArrayList arrayList = new ArrayList();
            Iterator it3 = list6.iterator();
            while (it3.hasNext()) {
                Class<cel> cls8 = cls7;
                List list7 = list4;
                ael aelVar = (ael) bow.C(ern.a(cls8), (eel) it3.next());
                if (aelVar != null) {
                    arrayList.add(aelVar);
                }
                list4 = list7;
                cls7 = cls8;
            }
            list3 = list4;
            CopyOnWriteArrayList copyOnWriteArrayList2 = ssg.a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                Object next3 = it4.next();
                Iterator it5 = it4;
                if (hashSet.contains(((ael) next3).b())) {
                    arrayList2.add(next3);
                }
                it4 = it5;
            }
            CopyOnWriteArrayList copyOnWriteArrayList3 = ssg.a;
            ArrayList arrayList3 = new ArrayList();
            Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                Object next4 = it6.next();
                long a3 = currentTimeMillis - ((ael) next4).a();
                msa msaVar = nsa.b;
                Iterator it7 = it6;
                if (a3 < nsa.f(yd5.M(1, ssa.DAYS))) {
                    arrayList3.add(next4);
                }
                it6 = it7;
            }
            CopyOnWriteArrayList copyOnWriteArrayList4 = ssg.a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it8 = arrayList3.iterator();
            while (it8.hasNext()) {
                Object next5 = it8.next();
                String b = ((ael) next5).b();
                Object obj3 = linkedHashMap.get(b);
                if (obj3 == null) {
                    it = it8;
                    ArrayList arrayList4 = new ArrayList();
                    linkedHashMap.put(b, arrayList4);
                    obj3 = arrayList4;
                } else {
                    it = it8;
                }
                ((List) obj3).add(next5);
                it8 = it;
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator it9 = list5.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    break;
                }
                Object next6 = it9.next();
                Iterator it10 = it9;
                zp2 zp2Var2 = (zp2) CollectionsKt.firstOrNull(((wbn) next6).b.f);
                if (zp2Var2 == null || (str2 = zp2Var2.a) == null) {
                    str2 = "";
                }
                List list8 = (List) linkedHashMap.get(str2);
                if (list8 == null) {
                    list8 = c5b.a;
                }
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                List list9 = list5;
                List list10 = list6;
                if (list8.size() >= cglVar2.a) {
                    CopyOnWriteArrayList copyOnWriteArrayList5 = ssg.a;
                    cls3 = cls5;
                    cls4 = cls6;
                } else {
                    Iterator it11 = list8.iterator();
                    if (it11.hasNext()) {
                        next2 = it11.next();
                        if (it11.hasNext()) {
                            long a4 = ((ael) next2).a();
                            do {
                                Object next7 = it11.next();
                                long a5 = ((ael) next7).a();
                                if (a4 < a5) {
                                    next2 = next7;
                                    a4 = a5;
                                }
                            } while (it11.hasNext());
                        }
                    } else {
                        next2 = null;
                    }
                    ael aelVar2 = (ael) next2;
                    long a6 = aelVar2 != null ? aelVar2.a() : 0L;
                    msa msaVar2 = nsa.b;
                    cls3 = cls5;
                    cls4 = cls6;
                    if (nsa.c(yd5.N(currentTimeMillis - a6, ssa.MILLISECONDS), cglVar2.b) < 0) {
                        CopyOnWriteArrayList copyOnWriteArrayList6 = ssg.a;
                    } else {
                        arrayList5.add(next6);
                    }
                }
                it9 = it10;
                linkedHashMap = linkedHashMap2;
                list5 = list9;
                list6 = list10;
                cls5 = cls3;
                cls6 = cls4;
            }
            List list11 = list5;
            List list12 = list6;
            cls = cls5;
            cls2 = cls6;
            if (arrayList5.isEmpty()) {
                CopyOnWriteArrayList copyOnWriteArrayList7 = ssg.a;
            }
            ssg.a(3, "PlayerInformersFilter", "found " + arrayList5.size() + " related concert informers: " + cglVar2, null);
            Class<del> cls9 = del.class;
            ern.a(cls9).h();
            long currentTimeMillis2 = System.currentTimeMillis();
            HashSet hashSet2 = new HashSet();
            Iterator it12 = list11.iterator();
            while (it12.hasNext()) {
                zp2 zp2Var3 = (zp2) CollectionsKt.firstOrNull(((wbn) it12.next()).b.f);
                String str4 = zp2Var3 != null ? zp2Var3.a : null;
                if (str4 != null) {
                    hashSet2.add(str4);
                }
            }
            CopyOnWriteArrayList copyOnWriteArrayList8 = ssg.a;
            ArrayList arrayList6 = new ArrayList();
            Iterator it13 = list12.iterator();
            while (it13.hasNext()) {
                Class<del> cls10 = cls9;
                ael aelVar3 = (ael) bow.C(ern.a(cls10), (eel) it13.next());
                if (aelVar3 != null) {
                    arrayList6.add(aelVar3);
                }
                cls9 = cls10;
            }
            CopyOnWriteArrayList copyOnWriteArrayList9 = ssg.a;
            ArrayList arrayList7 = new ArrayList();
            Iterator it14 = arrayList6.iterator();
            while (it14.hasNext()) {
                Object next8 = it14.next();
                if (hashSet2.contains(((ael) next8).b())) {
                    arrayList7.add(next8);
                }
            }
            CopyOnWriteArrayList copyOnWriteArrayList10 = ssg.a;
            ArrayList arrayList8 = new ArrayList();
            Iterator it15 = arrayList7.iterator();
            while (it15.hasNext()) {
                Object next9 = it15.next();
                long a7 = currentTimeMillis2 - ((ael) next9).a();
                msa msaVar3 = nsa.b;
                if (a7 < nsa.f(yd5.M(1, ssa.DAYS))) {
                    arrayList8.add(next9);
                }
            }
            CopyOnWriteArrayList copyOnWriteArrayList11 = ssg.a;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            Iterator it16 = arrayList8.iterator();
            while (it16.hasNext()) {
                Object next10 = it16.next();
                String b2 = ((ael) next10).b();
                Object obj4 = linkedHashMap3.get(b2);
                if (obj4 == null) {
                    obj4 = new ArrayList();
                    linkedHashMap3.put(b2, obj4);
                }
                ((List) obj4).add(next10);
            }
            ArrayList arrayList9 = new ArrayList();
            for (Object obj5 : list11) {
                zp2 zp2Var4 = (zp2) CollectionsKt.firstOrNull(((wbn) obj5).b.f);
                if (zp2Var4 == null || (str = zp2Var4.a) == null) {
                    str = "";
                }
                List list13 = (List) linkedHashMap3.get(str);
                if (list13 == null) {
                    list13 = c5b.a;
                }
                LinkedHashMap linkedHashMap4 = linkedHashMap3;
                long j2 = currentTimeMillis2;
                if (list13.size() >= cglVar.a) {
                    CopyOnWriteArrayList copyOnWriteArrayList12 = ssg.a;
                    vbnVar2 = vbnVar3;
                } else {
                    Iterator it17 = list13.iterator();
                    if (it17.hasNext()) {
                        next = it17.next();
                        if (it17.hasNext()) {
                            long a8 = ((ael) next).a();
                            do {
                                Object next11 = it17.next();
                                long a9 = ((ael) next11).a();
                                if (a8 < a9) {
                                    next = next11;
                                    a8 = a9;
                                }
                            } while (it17.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    ael aelVar4 = (ael) next;
                    long a10 = aelVar4 != null ? aelVar4.a() : 0L;
                    msa msaVar4 = nsa.b;
                    vbnVar2 = vbnVar3;
                    if (nsa.c(yd5.N(j2 - a10, ssa.MILLISECONDS), cglVar.b) < 0) {
                        CopyOnWriteArrayList copyOnWriteArrayList13 = ssg.a;
                    } else {
                        arrayList9.add(obj5);
                    }
                }
                vbnVar3 = vbnVar2;
                linkedHashMap3 = linkedHashMap4;
                currentTimeMillis2 = j2;
            }
            vbnVar = vbnVar3;
            if (arrayList9.isEmpty()) {
                CopyOnWriteArrayList copyOnWriteArrayList14 = ssg.a;
            }
            ssg.a(3, "PlayerInformersFilter", "found " + arrayList9.size() + " related donation informers: " + cglVar, null);
            dgl dglVar = eglVar.d;
            ern.a(bel.class).h();
            long currentTimeMillis3 = System.currentTimeMillis();
            ArrayList arrayList10 = new ArrayList();
            Iterator it18 = list12.iterator();
            while (it18.hasNext()) {
                eel eelVar = (eel) bow.C(ern.a(bel.class), (eel) it18.next());
                if (eelVar != null) {
                    arrayList10.add(eelVar);
                }
            }
            CopyOnWriteArrayList copyOnWriteArrayList15 = ssg.a;
            ArrayList arrayList11 = new ArrayList();
            Iterator it19 = arrayList10.iterator();
            while (it19.hasNext()) {
                Object next12 = it19.next();
                long a11 = currentTimeMillis3 - ((eel) next12).a();
                msa msaVar5 = nsa.b;
                if (a11 < nsa.f(yd5.M(1, ssa.DAYS))) {
                    arrayList11.add(next12);
                }
            }
            CopyOnWriteArrayList copyOnWriteArrayList16 = ssg.a;
            List list14 = ((long) arrayList11.size()) < dglVar.a ? list2 : c5b.a;
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            oxa.p(linkedHashMap5, arrayList5, ern.a(tdl.class));
            oxa.p(linkedHashMap5, arrayList9, ern.a(cls2));
            oxa.p(linkedHashMap5, list14, ern.a(cls));
            map = linkedHashMap5;
        }
        map.isEmpty();
        ArrayList arrayList12 = new ArrayList();
        for (wbn wbnVar : list2) {
            ArrayList<eel> arrayList13 = new ArrayList();
            for (Object obj6 : list3) {
                if (Intrinsics.d(((eel) obj6).u(), wbnVar.b.a)) {
                    arrayList13.add(obj6);
                }
            }
            if (arrayList13.isEmpty()) {
                arrayList13 = null;
            }
            if (arrayList13 == null) {
                pair = null;
            } else {
                ArrayList arrayList14 = new ArrayList(v75.o(arrayList13, 10));
                for (eel eelVar2 : arrayList13) {
                    if (eelVar2 instanceof cel) {
                        a2 = ern.a(tdl.class);
                    } else if (eelVar2 instanceof del) {
                        a2 = ern.a(cls2);
                    } else {
                        if (!(eelVar2 instanceof bel)) {
                            b6e.s();
                            return null;
                        }
                        a2 = ern.a(cls);
                    }
                    arrayList14.add(a2);
                }
                pair = new Pair(wbnVar, CollectionsKt.w0(CollectionsKt.z0(arrayList14)));
            }
            if (pair != null) {
                arrayList12.add(pair);
            }
        }
        Map n = uah.n(arrayList12);
        if (!n.isEmpty()) {
            CopyOnWriteArrayList copyOnWriteArrayList17 = ssg.a;
        }
        int i2 = 0;
        Map[] mapArr = {map, n};
        f9h f9hVar = new f9h();
        for (int i3 = 2; i2 < i3; i3 = 2) {
            for (Map.Entry entry : mapArr[i2].entrySet()) {
                wbn wbnVar2 = (wbn) entry.getKey();
                List<f9f> list15 = (List) entry.getValue();
                Object obj7 = f9hVar.get(wbnVar2);
                if (obj7 == null) {
                    obj7 = new ArrayList();
                    f9hVar.put(wbnVar2, obj7);
                }
                List list16 = (List) obj7;
                for (f9f f9fVar : list15) {
                    if (!list16.contains(f9fVar)) {
                        list16.add(f9fVar);
                    }
                }
            }
            i2++;
        }
        List r = wah.r(f9hVar.b());
        xpiVar = eflVar.i;
        if (r.isEmpty()) {
            ssg.a(3, "PlayerInformersCenter", "skip: all tracks were filtered out", null);
            obj2 = lel.a;
            ((xdr) xpiVar).l(obj2);
            return Unit.a;
        }
        this.l = null;
        this.o = xpiVar;
        this.k = 2;
        a = efl.a(eflVar, vbnVar, r, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
    
        if (r12 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r12 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0055, code lost:
    
        if (r12 == r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object l(Object obj) {
        String str;
        b9n b9nVar;
        oq oqVar;
        Object V;
        oq oqVar2;
        String str2 = (String) this.n;
        b9n b9nVar2 = (b9n) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        Continuation continuation = null;
        if (i == 0) {
            qgg.h0(obj);
            pjc g = b9nVar2.c.g();
            this.k = 1;
            obj = zsd.g0(g, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    String str3 = (String) this.m;
                    qgg.h0(obj);
                    str = str3;
                    b9nVar = b9nVar2;
                    oqVar = (oq) CollectionsKt.firstOrNull((List) obj);
                    if (oqVar == null) {
                        fkg fkgVar = b9nVar.d;
                        this.m = null;
                        this.o = null;
                        this.k = 3;
                        obj = x97.V(dm6.b, new zjg(fkgVar, str, str2, continuation, 0), this);
                    }
                    this.m = null;
                    this.o = oqVar;
                    this.k = 4;
                    b9nVar.getClass();
                    V = x97.V(dm6.c, new s1n(b9nVar, continuation, 7), this);
                    if (V != nm6Var) {
                    }
                    return nm6Var;
                }
                if (i != 3) {
                    if (i != 4) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oqVar2 = (oq) this.o;
                    qgg.h0(obj);
                    return new o9q(oqVar2, (List) obj, (iow) this.p);
                }
                qgg.h0(obj);
                b9nVar = b9nVar2;
                oqVar = (oq) obj;
                if (oqVar == null) {
                    return null;
                }
                this.m = null;
                this.o = oqVar;
                this.k = 4;
                b9nVar.getClass();
                V = x97.V(dm6.c, new s1n(b9nVar, continuation, 7), this);
                if (V != nm6Var) {
                    oqVar2 = oqVar;
                    obj = V;
                    return new o9q(oqVar2, (List) obj, (iow) this.p);
                }
                return nm6Var;
            }
            qgg.h0(obj);
        }
        str = ((xxq) obj).a;
        str.getClass();
        mn7 mn7Var = dm6.a;
        y8n y8nVar = new y8n(b9nVar2, str, str2, continuation, 0);
        b9nVar = b9nVar2;
        this.m = str;
        this.o = null;
        this.k = 2;
        obj = x97.V(mn7Var, y8nVar, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b4, code lost:
    
        if (r13 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0093, code lost:
    
        if (r13 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        if (r13 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object n(Object obj) {
        String str;
        b9n b9nVar;
        c01 c01Var;
        Object V;
        c01 c01Var2;
        iow iowVar = (iow) this.p;
        String str2 = (String) this.n;
        b9n b9nVar2 = (b9n) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        Continuation continuation = null;
        if (i == 0) {
            qgg.h0(obj);
            ssg.a(6, "EntityStorage", "Not yet implemented : fetchPlaylist id=" + str2 + " subtype=" + iowVar, null);
            pjc g = b9nVar2.c.g();
            this.k = 1;
            obj = zsd.g0(g, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    String str3 = (String) this.m;
                    qgg.h0(obj);
                    str = str3;
                    b9nVar = b9nVar2;
                    c01Var = (c01) CollectionsKt.firstOrNull((List) obj);
                    if (c01Var == null) {
                        fkg fkgVar = b9nVar.d;
                        this.m = null;
                        this.o = null;
                        this.k = 3;
                        obj = x97.V(dm6.b, new zjg(fkgVar, str, str2, continuation, 1), this);
                    }
                    this.m = null;
                    this.o = c01Var;
                    this.k = 4;
                    b9nVar.getClass();
                    V = x97.V(dm6.c, new s1n(b9nVar, continuation, 7), this);
                    if (V != nm6Var) {
                    }
                    return nm6Var;
                }
                if (i != 3) {
                    if (i != 4) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c01Var2 = (c01) this.o;
                    qgg.h0(obj);
                    return new p9q(c01Var2, (List) obj, iowVar);
                }
                qgg.h0(obj);
                b9nVar = b9nVar2;
                c01Var = (c01) obj;
                if (c01Var == null) {
                    return null;
                }
                this.m = null;
                this.o = c01Var;
                this.k = 4;
                b9nVar.getClass();
                V = x97.V(dm6.c, new s1n(b9nVar, continuation, 7), this);
                if (V != nm6Var) {
                    c01Var2 = c01Var;
                    obj = V;
                    return new p9q(c01Var2, (List) obj, iowVar);
                }
                return nm6Var;
            }
            qgg.h0(obj);
        }
        str = ((xxq) obj).a;
        str.getClass();
        mn7 mn7Var = dm6.a;
        y8n y8nVar = new y8n(b9nVar2, str, str2, continuation, 1);
        b9nVar = b9nVar2;
        this.m = str;
        this.o = null;
        this.k = 2;
        obj = x97.V(mn7Var, y8nVar, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0119, code lost:
    
        if (r0 != r10) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c7 A[Catch: all -> 0x0031, CancellationException -> 0x0034, IOException -> 0x0037, TryCatch #2 {IOException -> 0x0037, CancellationException -> 0x0034, all -> 0x0031, blocks: (B:9:0x0026, B:10:0x011c, B:13:0x0126, B:20:0x0048, B:21:0x0103, B:24:0x0050, B:25:0x00c3, B:27:0x00c7, B:29:0x00e4, B:33:0x0057, B:34:0x00ae, B:35:0x00b0, B:38:0x005d, B:40:0x008d, B:42:0x0091, B:46:0x0066, B:48:0x0075), top: B:2:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e4 A[Catch: all -> 0x0031, CancellationException -> 0x0034, IOException -> 0x0037, TryCatch #2 {IOException -> 0x0037, CancellationException -> 0x0034, all -> 0x0031, blocks: (B:9:0x0026, B:10:0x011c, B:13:0x0126, B:20:0x0048, B:21:0x0103, B:24:0x0050, B:25:0x00c3, B:27:0x00c7, B:29:0x00e4, B:33:0x0057, B:34:0x00ae, B:35:0x00b0, B:38:0x005d, B:40:0x008d, B:42:0x0091, B:46:0x0066, B:48:0x0075), top: B:2:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object o(Object obj) {
        Object value;
        Object V;
        Object a;
        sqw sqwVar;
        Object f;
        ocn ocnVar;
        Object a2;
        String str = (String) this.m;
        ocn ocnVar2 = (ocn) this.p;
        mm6 mm6Var = (mm6) this.o;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        Object obj2 = null;
        try {
            if (i == 0) {
                qgg.h0(obj);
                ((qmg) ocnVar2.f).f();
                if (ocnVar2.e.d()) {
                    qiw qiwVar = (qiw) ocnVar2.g.getValue();
                    this.o = mm6Var;
                    this.k = 1;
                    value = qiwVar.c.F.getValue();
                    if (value == nm6Var) {
                        return nm6Var;
                    }
                }
                qiw qiwVar2 = (qiw) ocnVar2.g.getValue();
                this.o = mm6Var;
                this.k = 3;
                a = qiwVar2.a(this);
                if (a == nm6Var) {
                }
                sqwVar = (sqw) a;
                if (sqwVar != null) {
                }
            } else if (i == 1) {
                qgg.h0(obj);
                value = obj;
            } else if (i == 2) {
                qgg.h0(obj);
                V = obj;
                qiw qiwVar22 = (qiw) ocnVar2.g.getValue();
                this.o = mm6Var;
                this.k = 3;
                a = qiwVar22.a(this);
                if (a == nm6Var) {
                    return nm6Var;
                }
                sqwVar = (sqw) a;
                if (sqwVar != null) {
                }
            } else if (i == 3) {
                qgg.h0(obj);
                a = obj;
                sqwVar = (sqw) a;
                if (sqwVar != null) {
                    ((qmg) ocnVar2.f).e(img.COLLECT, "can't collect YnisonRemoteState");
                    r7o r7oVar = z7o.b;
                    return new z7o(new t7o(new IllegalArgumentException("can't collect YnisonRemoteState")));
                }
                ocnVar2.e.a.a().getClass();
                uol uolVar = ocnVar2.d.c;
                this.o = null;
                this.l = ocnVar2;
                this.n = sqwVar;
                this.k = 4;
                f = uolVar.f(this);
                if (f == nm6Var) {
                    return nm6Var;
                }
                ocnVar = ocnVar2;
                sqw e = ocn.e(ocnVar, sqwVar, ((Number) f).longValue());
                this.o = null;
                this.l = null;
                this.n = null;
                this.k = 5;
                a2 = ocn.a(ocnVar2, e, str, this);
            } else {
                if (i != 4) {
                    if (i != 5) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a2 = ((z7o) obj).a;
                    jmg jmgVar = ocnVar2.f;
                    r7o r7oVar2 = z7o.b;
                    if (!(a2 instanceof t7o)) {
                        obj2 = a2;
                    }
                    ((qmg) jmgVar).o = (sqw) obj2;
                    ((qmg) jmgVar).g();
                    return new z7o(a2);
                }
                sqwVar = (sqw) this.n;
                ocn ocnVar3 = (ocn) this.l;
                qgg.h0(obj);
                ocnVar = ocnVar3;
                f = obj;
                sqw e2 = ocn.e(ocnVar, sqwVar, ((Number) f).longValue());
                this.o = null;
                this.l = null;
                this.n = null;
                this.k = 5;
                a2 = ocn.a(ocnVar2, e2, str, this);
            }
            sqw sqwVar2 = (sqw) value;
            if (sqwVar2 != null) {
                fkg fkgVar = ocnVar2.c;
                e0 b = sqwVar2.b();
                this.o = mm6Var;
                this.k = 2;
                V = x97.V(dm6.b, new rfg(b, fkgVar, str, "remote_protobuf", null, 2), this);
                if (V == nm6Var) {
                    return nm6Var;
                }
            }
            qiw qiwVar222 = (qiw) ocnVar2.g.getValue();
            this.o = mm6Var;
            this.k = 3;
            a = qiwVar222.a(this);
            if (a == nm6Var) {
            }
            sqwVar = (sqw) a;
            if (sqwVar != null) {
            }
        } catch (IOException e3) {
            ((qmg) ocnVar2.f).e(img.IO, e3.getMessage());
            r7o r7oVar3 = z7o.b;
            return new z7o(new t7o(e3));
        } catch (CancellationException e4) {
            ((qmg) ocnVar2.f).e(img.CANCEL, e4.getMessage());
            throw e4;
        } catch (Throwable th) {
            ((qmg) ocnVar2.f).e(img.UNCATCHED, th.getMessage());
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0174 A[Catch: CancellationException -> 0x002b, IOException -> 0x002e, TryCatch #5 {IOException -> 0x002e, CancellationException -> 0x002b, blocks: (B:8:0x0026, B:9:0x016c, B:11:0x0174, B:14:0x01a2), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01a2 A[Catch: CancellationException -> 0x002b, IOException -> 0x002e, TRY_LEAVE, TryCatch #5 {IOException -> 0x002e, CancellationException -> 0x002b, blocks: (B:8:0x0026, B:9:0x016c, B:11:0x0174, B:14:0x01a2), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0 A[Catch: CancellationException -> 0x0040, IOException -> 0x0044, TryCatch #6 {IOException -> 0x0044, CancellationException -> 0x0040, blocks: (B:26:0x003b, B:27:0x00ec, B:29:0x00f0, B:31:0x00fc, B:33:0x0100, B:35:0x0116, B:37:0x011c, B:38:0x0120, B:40:0x0124, B:42:0x013a), top: B:25:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fc A[Catch: CancellationException -> 0x0040, IOException -> 0x0044, TryCatch #6 {IOException -> 0x0044, CancellationException -> 0x0040, blocks: (B:26:0x003b, B:27:0x00ec, B:29:0x00f0, B:31:0x00fc, B:33:0x0100, B:35:0x0116, B:37:0x011c, B:38:0x0120, B:40:0x0124, B:42:0x013a), top: B:25:0x003b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object p(Object obj) {
        t1f t1fVar;
        CancellationException e;
        IOException e2;
        t1f t1fVar2;
        t1f t1fVar3;
        sqw sqwVar;
        sqw sqwVar2;
        ocn ocnVar = (ocn) this.p;
        mm6 mm6Var = (mm6) this.o;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        int i2 = 1;
        Continuation continuation = null;
        if (i == 0) {
            qgg.h0(obj);
            t1f t1fVar4 = new t1f(4, false);
            UUID.randomUUID().toString();
            t1fVar4.b = new Long(System.currentTimeMillis());
            try {
                ((qmg) ocnVar.f).c(t1fVar4);
                String str = (String) this.m;
                this.o = mm6Var;
                this.l = t1fVar4;
                this.k = 1;
                Object V = x97.V(dm6.b, new gcn(ocnVar, str, continuation, i2), this);
                if (V != nm6Var) {
                    t1fVar2 = t1fVar4;
                    obj = V;
                }
                return nm6Var;
            } catch (IOException e3) {
                t1fVar = t1fVar4;
                e2 = e3;
                t1fVar.c = new Long(System.currentTimeMillis());
                t1fVar.d = new xmg(img.IO, e2, e2.getMessage());
                ((qmg) ocnVar.f).b(t1fVar);
                r7o r7oVar = z7o.b;
                return new z7o(new t7o(e2));
            } catch (CancellationException e4) {
                t1fVar = t1fVar4;
                e = e4;
                t1fVar.c = new Long(System.currentTimeMillis());
                t1fVar.d = new xmg(img.CANCEL, e, e.getMessage());
                ((qmg) ocnVar.f).b(t1fVar);
                throw e;
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sqwVar2 = (sqw) this.n;
                t1fVar = (t1f) this.l;
                try {
                    qgg.h0(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        jmg jmgVar = ocnVar.f;
                        return new z7o(sqwVar2);
                    }
                    String str2 = "Can't start queue ynisonState=" + sqwVar2;
                    IllegalStateException illegalStateException = new IllegalStateException(str2);
                    t1fVar.d = new xmg(img.PLAYBACK, illegalStateException, str2);
                    ((qmg) ocnVar.f).b(t1fVar);
                    r7o r7oVar2 = z7o.b;
                    return new z7o(new t7o(illegalStateException));
                } catch (IOException e5) {
                    e2 = e5;
                    t1fVar.c = new Long(System.currentTimeMillis());
                    t1fVar.d = new xmg(img.IO, e2, e2.getMessage());
                    ((qmg) ocnVar.f).b(t1fVar);
                    r7o r7oVar3 = z7o.b;
                    return new z7o(new t7o(e2));
                } catch (CancellationException e6) {
                    e = e6;
                    t1fVar.c = new Long(System.currentTimeMillis());
                    t1fVar.d = new xmg(img.CANCEL, e, e.getMessage());
                    ((qmg) ocnVar.f).b(t1fVar);
                    throw e;
                }
            }
            t1fVar3 = (t1f) this.l;
            try {
                qgg.h0(obj);
                sqwVar = (sqw) obj;
                if (sqwVar != null) {
                    return new z7o(v(t1fVar3, ocnVar, "Can't actualize saved state. State is null."));
                }
                if (sqwVar instanceof rqw) {
                    return new z7o(v(t1fVar3, ocnVar, "Can't actualize saved state. State is Raw. ynisonState=" + sqwVar));
                }
                pqw t = s7g.t(sqwVar);
                if ((t != null ? t.b : null) instanceof raq) {
                    return new z7o(v(t1fVar3, ocnVar, "Can't actualize saved state. \"queueState\" is Unknown. ynisonState=" + sqwVar));
                }
                t1fVar3.c = new Long(System.currentTimeMillis());
                jmg jmgVar2 = ocnVar.f;
                ((qmg) jmgVar2).m = sqwVar;
                ((qmg) jmgVar2).d(t1fVar3);
                qiw qiwVar = (qiw) ocnVar.g.getValue();
                this.o = null;
                this.l = t1fVar3;
                this.n = sqwVar;
                this.k = 3;
                Boolean d = qiwVar.d(sqwVar);
                if (d != nm6Var) {
                    sqwVar2 = sqwVar;
                    obj = d;
                    t1fVar = t1fVar3;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                }
                return nm6Var;
            } catch (IOException e7) {
                e2 = e7;
                t1fVar = t1fVar3;
                t1fVar.c = new Long(System.currentTimeMillis());
                t1fVar.d = new xmg(img.IO, e2, e2.getMessage());
                ((qmg) ocnVar.f).b(t1fVar);
                r7o r7oVar32 = z7o.b;
                return new z7o(new t7o(e2));
            } catch (CancellationException e8) {
                e = e8;
                t1fVar = t1fVar3;
                t1fVar.c = new Long(System.currentTimeMillis());
                t1fVar.d = new xmg(img.CANCEL, e, e.getMessage());
                ((qmg) ocnVar.f).b(t1fVar);
                throw e;
            }
        }
        t1fVar2 = (t1f) this.l;
        try {
            qgg.h0(obj);
        } catch (IOException e9) {
            e2 = e9;
            t1fVar = t1fVar2;
            t1fVar.c = new Long(System.currentTimeMillis());
            t1fVar.d = new xmg(img.IO, e2, e2.getMessage());
            ((qmg) ocnVar.f).b(t1fVar);
            r7o r7oVar322 = z7o.b;
            return new z7o(new t7o(e2));
        } catch (CancellationException e10) {
            e = e10;
            t1fVar = t1fVar2;
            t1fVar.c = new Long(System.currentTimeMillis());
            t1fVar.d = new xmg(img.CANCEL, e, e.getMessage());
            ((qmg) ocnVar.f).b(t1fVar);
            throw e;
        }
        e0 e0Var = (e0) obj;
        if (e0Var == null) {
            t1fVar2.c = new Long(System.currentTimeMillis());
            NoPreviousStateException noPreviousStateException = new NoPreviousStateException("Previous state not exist");
            t1fVar2.d = new xmg(img.NO_STATE, noPreviousStateException, "Previous state not exist");
            ((qmg) ocnVar.f).b(t1fVar2);
            r7o r7oVar4 = z7o.b;
            return new z7o(new t7o(noPreviousStateException));
        }
        qiw qiwVar2 = (qiw) ocnVar.g.getValue();
        ocnVar.e.a.a().getClass();
        this.o = mm6Var;
        this.l = t1fVar2;
        this.k = 2;
        obj = qiwVar2.c(e0Var, this);
        if (obj != nm6Var) {
            t1fVar3 = t1fVar2;
            sqwVar = (sqw) obj;
            if (sqwVar != null) {
            }
        }
        return nm6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0150 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object q(Object obj) {
        r2f Q;
        xdr xdrVar;
        emk emkVar;
        emk emkVar2;
        h5n h5nVar;
        List B;
        cnn cnnVar;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        Continuation continuation = null;
        if (i == 0) {
            qgg.h0(obj);
            Q = saf.Q(((mm6) this.o).getCoroutineContext());
            cnn cnnVar2 = (cnn) this.m;
            synchronized (cnnVar2.c) {
                Throwable th = cnnVar2.e;
                if (th != null) {
                    throw th;
                }
                if (((zmn) cnnVar2.u.getValue()).compareTo(zmn.b) <= 0) {
                    throw new IllegalStateException("Recomposer shut down");
                }
                if (cnnVar2.d != null) {
                    throw new IllegalStateException("Recomposer already running");
                }
                cnnVar2.d = Q;
                cnnVar2.y();
            }
            y5 y5Var = new y5(25, (cnn) this.m);
            sfm sfmVar = g2r.a;
            g2r.f(dpo.X);
            synchronized (g2r.b) {
                g2r.g = CollectionsKt.h0((Collection) g2r.g, y5Var);
            }
            h5n h5nVar2 = new h5n(11, y5Var);
            xdr xdrVar2 = cnn.y;
            rxk rxkVar = ((cnn) this.m).x;
            try {
                do {
                    xdrVar = cnn.y;
                    emkVar = (emk) xdrVar.getValue();
                    qee qeeVar = qee.f;
                    vlk vlkVar = emkVar.d;
                    if (vlkVar.containsKey(rxkVar)) {
                        emkVar2 = emkVar;
                    } else if (emkVar.isEmpty()) {
                        emkVar2 = new emk(rxkVar, rxkVar, vlkVar.g(rxkVar, new h8g(qeeVar, qeeVar)));
                    } else {
                        Object obj2 = emkVar.c;
                        Object obj3 = vlkVar.get(obj2);
                        obj3.getClass();
                        emkVar2 = new emk(emkVar.b, rxkVar, vlkVar.g(obj2, new h8g(((h8g) obj3).a, rxkVar)).g(rxkVar, new h8g(obj2, qeeVar)));
                    }
                    if (emkVar != emkVar2) {
                    }
                    break;
                } while (!xdrVar.k(emkVar, emkVar2));
                break;
                cnn cnnVar3 = (cnn) this.m;
                synchronized (cnnVar3.c) {
                    B = cnnVar3.B();
                }
                int size = B.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((wr5) B.get(i2)).t();
                }
                c5l c5lVar = new c5l((bnn) this.n, (qdi) this.p, continuation, 28);
                this.o = Q;
                this.l = h5nVar2;
                this.k = 1;
                if (gld.Q(c5lVar, this) == nm6Var) {
                    return nm6Var;
                }
                h5nVar = h5nVar2;
            } catch (Throwable th2) {
                th = th2;
                h5nVar = h5nVar2;
                h5nVar.b();
                cnnVar = (cnn) this.m;
                synchronized (cnnVar.c) {
                }
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            h5nVar = (h5n) this.l;
            Q = (r2f) this.o;
            try {
                qgg.h0(obj);
            } catch (Throwable th3) {
                th = th3;
                h5nVar.b();
                cnnVar = (cnn) this.m;
                synchronized (cnnVar.c) {
                    try {
                        if (cnnVar.d == Q) {
                            cnnVar.d = null;
                        }
                        cnnVar.y();
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                xdr xdrVar3 = cnn.y;
                ovk.o(((cnn) this.m).x);
                throw th;
            }
        }
        h5nVar.b();
        cnn cnnVar4 = (cnn) this.m;
        synchronized (cnnVar4.c) {
            try {
                if (cnnVar4.d == Q) {
                    cnnVar4.d = null;
                }
                cnnVar4.y();
            } catch (Throwable th5) {
                throw th5;
            }
        }
        xdr xdrVar4 = cnn.y;
        ovk.o(((cnn) this.m).x);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (((defpackage.oc4) r2).d.m(r3, r22) == r1) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0244, code lost:
    
        if (r8.collect(r2, r22) == r1) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object s(Object obj) {
        akq akqVar;
        Throwable th;
        i iVar;
        char c;
        o oVar;
        int i;
        xqn xqnVar = (xqn) this.l;
        akq akqVar2 = (akq) this.o;
        nm6 nm6Var = nm6.a;
        int i2 = this.k;
        if (i2 != 0) {
            if (i2 == 1) {
                qgg.h0(obj);
                return Unit.a;
            }
            if (i2 == 2) {
                qgg.h0(obj);
                return Unit.a;
            }
            xq0.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qgg.h0(obj);
        if (akqVar2 == null) {
            xqnVar.a = null;
            mm6 mm6Var = (ltm) this.m;
            j l = szf.l(false, null, null);
            this.o = null;
            this.k = 1;
        } else {
            n7q n7qVar = akqVar2.b;
            if (Intrinsics.d(n7qVar, xqnVar.a)) {
                akqVar = akqVar2;
                th = null;
                iVar = null;
            } else {
                ssg.a(3, "Relay:Service", "streamStateUpdates() - queue has changed, preparing update", null);
                skr skrVar = (skr) this.n;
                n7qVar.getClass();
                c cVar = (c) dag.p(n7qVar.b(), new itk());
                if (n7qVar instanceof szu) {
                    ppe ppeVar = new ppe(1);
                    szu szuVar = (szu) n7qVar;
                    List j = szuVar.j();
                    th = null;
                    ArrayList arrayList = new ArrayList(v75.o(j, 10));
                    Iterator it = j.iterator();
                    while (it.hasNext()) {
                        arrayList.add(dag.H((jzs) it.next(), ppeVar, skrVar));
                    }
                    List o = szuVar.o();
                    ArrayList arrayList2 = new ArrayList(v75.o(o, 10));
                    Iterator it2 = o.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(dag.H((jzs) it2.next(), ppeVar, skrVar));
                    }
                    int ordinal = szuVar.c.ordinal();
                    if (ordinal == 0) {
                        c = 2;
                    } else if (ordinal == 1) {
                        c = 3;
                    } else {
                        if (ordinal != 2) {
                            b6e.s();
                            return null;
                        }
                        c = 4;
                    }
                    du7 du7Var = szuVar.m.b;
                    int i3 = du7Var.a;
                    int i4 = du7Var.b;
                    fyu l2 = szuVar.l();
                    if (l2 instanceof eyu) {
                        List list = ((eyu) l2).a;
                        veq veqVar = (veq) o.b.createBuilder();
                        List list2 = list;
                        veqVar.d();
                        o oVar2 = (o) veqVar.b;
                        akqVar = akqVar2;
                        mse mseVar = oVar2.a;
                        if (!((u8) mseVar).a) {
                            oVar2.a = o3d.mutableCopy(mseVar);
                        }
                        c8.addAll(list2, oVar2.a);
                        oVar = (o) veqVar.b();
                    } else {
                        akqVar = akqVar2;
                        if (!(l2 instanceof dyu)) {
                            b6e.s();
                            return null;
                        }
                        oVar = null;
                    }
                    HashMap hashMap = ppeVar.c;
                    hashMap.getClass();
                    tzu tzuVar = (tzu) w.i.createBuilder();
                    tzuVar.d();
                    w wVar = (w) tzuVar.b;
                    wVar.getClass();
                    if (c == 2) {
                        i = 1;
                    } else if (c == 3) {
                        i = 2;
                    } else {
                        if (c != 4) {
                            throw null;
                        }
                        i = 3;
                    }
                    wVar.b = i;
                    wVar.a |= 1;
                    tzuVar.d();
                    w wVar2 = (w) tzuVar.b;
                    wVar2.a |= 2;
                    wVar2.c = i3;
                    tzuVar.d();
                    w wVar3 = (w) tzuVar.b;
                    wVar3.a |= 4;
                    wVar3.d = i4;
                    tzuVar.d();
                    w wVar4 = (w) tzuVar.b;
                    rse rseVar = wVar4.e;
                    if (!((u8) rseVar).a) {
                        wVar4.e = o3d.mutableCopy(rseVar);
                    }
                    c8.addAll(arrayList, wVar4.e);
                    tzuVar.d();
                    w wVar5 = (w) tzuVar.b;
                    rse rseVar2 = wVar5.f;
                    if (!((u8) rseVar2).a) {
                        wVar5.f = o3d.mutableCopy(rseVar2);
                    }
                    c8.addAll(arrayList2, wVar5.f);
                    if (oVar != null) {
                        tzuVar.d();
                        w wVar6 = (w) tzuVar.b;
                        wVar6.getClass();
                        wVar6.g = oVar;
                        wVar6.a |= 8;
                    }
                    tzuVar.d();
                    w wVar7 = (w) tzuVar.b;
                    r9h r9hVar = wVar7.h;
                    if (!r9hVar.a) {
                        wVar7.h = r9hVar.d();
                    }
                    wVar7.h.putAll(hashMap);
                    iVar = rzf.g(cVar, (w) tzuVar.b());
                } else {
                    iVar = rzf.g(cVar, null);
                    akqVar = akqVar2;
                    th = null;
                }
            }
            AtomicReference atomicReference = new AtomicReference(iVar);
            ssg.a(3, "Relay:Service", "streamPlayerState() - start emitting player state", th);
            t1f t1fVar = ((oq7) this.p).d;
            msa msaVar = nsa.b;
            pjc F = t1fVar.F(((f7l) t1fVar.b).c, yd5.M(500, ssa.MILLISECONDS));
            s3 s3Var = new s3(akqVar, (ltm) this.m, atomicReference, xqnVar, n7qVar);
            this.o = null;
            this.k = 2;
        }
        return nm6Var;
    }

    private final Object t(Object obj) {
        lum lumVar;
        zc5 zc5Var;
        Serializable d;
        String str;
        boolean contains;
        l18 l18Var = l18.b;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            lumVar = (lum) this.n;
            zc5Var = (zc5) this.p;
            bdt I = hag.I(frt.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            String str2 = ((frt) qdcVar.C(I)).c().a;
            str2.getClass();
            rtl rtlVar = (rtl) lumVar.a;
            nvl nvlVar = new nvl(zc5Var.a, zc5Var.b);
            this.o = lumVar;
            this.l = zc5Var;
            this.m = str2;
            this.k = 1;
            d = rtlVar.d(str2, nvlVar, true, this);
            if (d == nm6Var) {
                return nm6Var;
            }
            str = str2;
            obj = d;
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) this.m;
            zc5Var = (zc5) this.l;
            lumVar = (lum) this.o;
            qgg.h0(obj);
        }
        cvl cvlVar = (cvl) obj;
        if (cvlVar == null) {
            dfi.r("Playlist for search autoflow not found", "SearchEntityDataHelper");
            return null;
        }
        f4m M = ((MainDatabase) ((i5h) ((jyr) lumVar.c).getValue()).c(str)).M();
        long j = cvlVar.k;
        if (j < 0) {
            su4.s(2, null, "nativeId not set", null);
        }
        boolean d2 = cvlVar.d();
        String valueOf = String.valueOf(j);
        ysr ysrVar = new ysr("playlist_view");
        um4 um4Var = new um4(pgp.a);
        um4Var.i("playlist_id=?", xz0.X(new Object[]{valueOf}));
        if (d2) {
            um4Var.i(f4m.r(), xz0.X(new Object[0]));
        }
        tt0.K(ysrVar, um4Var);
        ysrVar.f = d2 ? "timestamp DESC" : "position_playlist";
        atn a = ysrVar.a();
        g4m g4mVar = (g4m) M.b;
        g4mVar.getClass();
        TreeMap treeMap = afo.h;
        j6e a2 = wyf.x(a).a();
        List list = (List) up6.F(g4mVar.a, true, true, new g20((String) a2.a, a2, 9));
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(q7g.T((h4m) it.next()));
        }
        if (gut.h1((z66) ((jyr) lumVar.b).getValue())) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                mqs mqsVar = (mqs) next;
                if (mqsVar == null) {
                    su4.s(2, null, "PermanentCachedTrackPredicate: track is null", null);
                    contains = false;
                } else {
                    bdt I2 = hag.I(uaa.class);
                    qdc qdcVar2 = l18Var.a;
                    qdcVar2.getClass();
                    contains = ((lja) ((e6q) ((uaa) qdcVar2.C(I2))).e.getValue()).a.contains(mqsVar.a);
                }
                if (contains) {
                    arrayList2.add(next);
                }
            }
            arrayList = arrayList2;
        }
        return new fuu(new p3q(zc5Var, o3q.b, new n3q(cvlVar.b)), arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        if (r6.emit(r9, r8) == r2) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068 A[Catch: Exception -> 0x0021, TryCatch #0 {Exception -> 0x0021, blocks: (B:7:0x001c, B:9:0x0079, B:10:0x0050, B:16:0x0060, B:18:0x0068, B:26:0x0032, B:30:0x004b), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0076 -> B:8:0x001f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object u(Object obj) {
        rjc rjcVar;
        si3 si3Var;
        rjc rjcVar2;
        Object c;
        zi3 zi3Var = (zi3) this.p;
        xip xipVar = (xip) this.n;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        try {
            if (i == 0) {
                qgg.h0(obj);
                rjcVar = (rjc) this.o;
                if (!((AtomicBoolean) this.m).compareAndSet(false, true)) {
                    xq0.q("requests flow can only be collected once");
                    return null;
                }
                xipVar.d();
                si3Var = new si3(zi3Var);
                this.o = rjcVar;
                this.l = si3Var;
                this.k = 1;
                c = si3Var.c(this);
                if (c != nm6Var) {
                }
            } else if (i == 1) {
                si3Var = (si3) this.l;
                rjcVar2 = (rjc) this.o;
                qgg.h0(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                si3Var = (si3) this.l;
                rjcVar2 = (rjc) this.o;
                qgg.h0(obj);
                rjcVar = rjcVar2;
                xipVar.d();
                this.o = rjcVar;
                this.l = si3Var;
                this.k = 1;
                c = si3Var.c(this);
                if (c != nm6Var) {
                    return nm6Var;
                }
                rjcVar2 = rjcVar;
                obj = c;
                if (((Boolean) obj).booleanValue()) {
                    return Unit.a;
                }
                Object d = si3Var.d();
                this.o = rjcVar2;
                this.l = si3Var;
                this.k = 2;
            }
        } catch (Exception e) {
            zi3Var.o(n7w.c("Exception thrown while collecting requests", e), true);
            xipVar.d();
            throw e;
        }
    }

    public static final t7o v(t1f t1fVar, ocn ocnVar, String str) {
        t1fVar.c = Long.valueOf(System.currentTimeMillis());
        IllegalStateException illegalStateException = new IllegalStateException(str);
        t1fVar.d = new xmg(img.MISS_CACHE, illegalStateException, str);
        ((qmg) ocnVar.f).b(t1fVar);
        r7o r7oVar = z7o.b;
        return new t7o(illegalStateException);
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.j;
        Object obj2 = this.p;
        switch (i) {
            case 0:
                ckg ckgVar = new ckg((fkg) this.l, (String) this.m, (String) this.n, (String) obj2, continuation, 0);
                ckgVar.o = obj;
                return ckgVar;
            case 1:
                return new ckg((Parcelable) this.o, (fkg) this.l, (lpi) obj2, (String) this.m, (String) this.n, continuation);
            case 2:
                return new ckg((oev) this.o, (u0h) this.l, (aqi) obj2, continuation);
            case 3:
                ckg ckgVar2 = new ckg((i5h) this.n, (String) this.m, (String[]) obj2, continuation);
                ckgVar2.o = obj;
                return ckgVar2;
            case 4:
                ckg ckgVar3 = new ckg((nbh) this.n, (mm6) obj2, continuation, 4);
                ckgVar3.m = obj;
                return ckgVar3;
            case 5:
                return new ckg((j6i) this.n, (mqs) obj2, continuation, 5);
            case 6:
                return new ckg((sai) this.o, (bci) this.l, (mm6) this.m, (lai) this.n, (lai) obj2, continuation, 6);
            case 7:
                ckg ckgVar4 = new ckg((yk3) this.l, (lni) this.m, (j6e) this.n, (i50) obj2, continuation, 7);
                ckgVar4.o = obj;
                return ckgVar4;
            case 8:
                return new ckg((mm6) this.l, (oq) this.m, (w8j) this.n, (lt) obj2, continuation, 8);
            case 9:
                ckg ckgVar5 = new ckg((rfk) this.l, (g3j) this.n, (oxa) obj2, (String) this.m, continuation);
                ckgVar5.o = obj;
                return ckgVar5;
            case 10:
                return new ckg((kik) this.o, (oik) this.l, (LinkedHashMap) this.n, (Set) obj2, (String) this.m, continuation);
            case 11:
                return new ckg((anx) this.o, (g4q) this.l, (g4q) this.m, (PlaybackCommand$QueueLaunch) this.n, (ii3) obj2, continuation, 11);
            case 12:
                return new ckg((zel) this.m, (vbn) this.n, (efl) obj2, continuation, 12);
            case 13:
                ckg ckgVar6 = new ckg((fk0) this.l, (aqi) this.m, (jx7) this.n, (aqi) obj2, continuation, 13);
                ckgVar6.o = obj;
                return ckgVar6;
            case 14:
                return new ckg((h4b) this.o, (fk0) this.l, (aqi) this.m, (jx7) this.n, (aqi) obj2, continuation, 14);
            case 15:
                return new ckg((kvl) this.n, (thj) obj2, continuation, 15);
            case 16:
                fvf fvfVar = (fvf) this.o;
                qzl qzlVar = (qzl) this.l;
                jic jicVar = (jic) this.m;
                jx7 jx7Var = (jx7) this.n;
                float f = edo.a;
                return new ckg(fvfVar, qzlVar, jicVar, jx7Var, (eoe) obj2, continuation);
            case 17:
                qzl qzlVar2 = (qzl) this.o;
                fvf fvfVar2 = (fvf) this.l;
                sdr sdrVar = (sdr) this.m;
                jx7 jx7Var2 = (jx7) this.n;
                float f2 = edo.a;
                return new ckg(qzlVar2, fvfVar2, sdrVar, jx7Var2, (eoe) obj2, continuation);
            case 18:
                ckg ckgVar7 = new ckg((jap) this.l, (msd) this.m, (aqi) this.n, (aqi) obj2, continuation, 18);
                ckgVar7.o = obj;
                return ckgVar7;
            case 19:
                ckg ckgVar8 = new ckg((i4n) this.n, (Uri) obj2, continuation, 19);
                ckgVar8.o = obj;
                return ckgVar8;
            case 20:
                return new ckg(this.l, (String) this.n, (Serializable) obj2, continuation, 20);
            case 21:
                return new ckg(this.l, (String) this.n, (Serializable) obj2, continuation, 21);
            case 22:
                ckg ckgVar9 = new ckg((ocn) obj2, (String) this.m, continuation, 22);
                ckgVar9.o = obj;
                return ckgVar9;
            case 23:
                ckg ckgVar10 = new ckg((ocn) obj2, (String) this.m, continuation, 23);
                ckgVar10.o = obj;
                return ckgVar10;
            case 24:
                return new ckg((rce) this.o, (skn) this.l, (lmq) this.m, (hib) this.n, (Bitmap) obj2, continuation, 24);
            case 25:
                ckg ckgVar11 = new ckg((cnn) this.m, (bnn) this.n, (qdi) obj2, continuation, 25);
                ckgVar11.o = obj;
                return ckgVar11;
            case 26:
                ckg ckgVar12 = new ckg((xqn) this.l, (ltm) this.m, (skr) this.n, (oq7) obj2, continuation, 26);
                ckgVar12.o = obj;
                return ckgVar12;
            case 27:
                return new ckg((lum) this.n, (zc5) obj2, continuation, 27);
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ckg ckgVar13 = new ckg((AtomicBoolean) this.m, (xip) this.n, (zi3) obj2, continuation, 28);
                ckgVar13.o = obj;
                return ckgVar13;
            default:
                return new ckg(this.l, (String) this.n, (Serializable) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((ckg) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((ckg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((ckg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((ckg) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((ckg) create((Float) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((ckg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((ckg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((ckg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((ckg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((ckg) create((ltm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((ckg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 11:
                return ((ckg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 12:
                return ((ckg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 13:
                return ((ckg) create((lke) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 14:
                return ((ckg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 15:
                return ((ckg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 16:
                ((ckg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                return nm6.a;
            case 17:
                ((ckg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                return nm6.a;
            case 18:
                return ((ckg) create((pfm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 19:
                return ((ckg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 20:
                return ((ckg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 21:
                return ((ckg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 22:
                return ((ckg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 23:
                return ((ckg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 24:
                return ((ckg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 25:
                return ((ckg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 26:
                return ((ckg) create((akq) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 27:
                return ((ckg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return ((ckg) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((ckg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0219, code lost:
    
        if (r3 == r2) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x030f, code lost:
    
        if (r0.a(defpackage.hqi.a, r2, r5) == r1) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x04c6, code lost:
    
        if (defpackage.zsd.O(r0, r1, r5) == r11) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x04ac, code lost:
    
        if (defpackage.fk0.c(r0, r1, null, null, r26, 14) != r11) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x048e, code lost:
    
        if (defpackage.fk0.c(r1, r1, null, null, r26, 14) == r11) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x04df, code lost:
    
        if (defpackage.fk0.c(r1, r1, null, null, r26, 14) == r11) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x05bb, code lost:
    
        if (r1 == r0) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0554, code lost:
    
        if (r1 == r0) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x06f3, code lost:
    
        if (defpackage.saf.C(r1, r5) == r13) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0790, code lost:
    
        if (r3.collect(r2, r5) == r13) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x06dd, code lost:
    
        if (r3 == r13) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x085c, code lost:
    
        if (r2 == r1) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0835, code lost:
    
        if (r2 == r1) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0a2e, code lost:
    
        if (r1.f(r0, r5) != r14) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x0aac, code lost:
    
        if (defpackage.zsd.e0(r0, r2, r5) == r1) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x0a80, code lost:
    
        if (r2 == r1) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ab, code lost:
    
        if (r3 == r6) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0b4a, code lost:
    
        if (r1.f((defpackage.lpi) r4, null, r3, r0, r5) == r7) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0b7a, code lost:
    
        if (r1.f((defpackage.lpi) r4, r2, r3, r0, r5) == r7) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0061, code lost:
    
        if (r13 == r6) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0a1b  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0a0a  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x09f2  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Object a;
        String str2;
        Object b;
        fk0 fk0Var;
        tm0 tm0Var;
        tm0 tm0Var2;
        Float f;
        Float f2;
        Object c;
        x3n x3nVar;
        String str3;
        Object V;
        mqs mqsVar;
        rar y;
        Object a2;
        pjc u21Var;
        Object a3;
        Object b2;
        nm6 nm6Var;
        Object V2;
        g0l g0lVar;
        cvl cvlVar;
        hcr hcrVar;
        rar y2;
        Object a4;
        String str4;
        s72 a5;
        String str5;
        Object g0;
        Object f3;
        ckg ckgVar = this;
        int i = ckgVar.j;
        int i2 = 14;
        int i3 = 4;
        int i4 = 0;
        int i5 = 2;
        Object obj2 = ckgVar.p;
        int i6 = 1;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        switch (i) {
            case 0:
                lpi lpiVar = (lpi) ckgVar.o;
                nm6 nm6Var2 = nm6.a;
                int i7 = ckgVar.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    ckgVar.o = null;
                    ckgVar.k = 1;
                    if (((fkg) ckgVar.l).f(lpiVar, (String) ckgVar.m, (String) ckgVar.n, (String) obj2, ckgVar) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i7 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                String str6 = (String) ckgVar.n;
                fkg fkgVar = (fkg) ckgVar.l;
                Parcelable parcelable = (Parcelable) ckgVar.o;
                nm6 nm6Var3 = nm6.a;
                int i8 = ckgVar.k;
                if (i8 != 0) {
                    if (i8 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    if (i8 == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                if (parcelable != null) {
                    Parcel obtain = Parcel.obtain();
                    parcelable.writeToParcel(obtain, 0);
                    obtain.getClass();
                    obtain.setDataPosition(0);
                    String encodeToString = Base64.encodeToString(obtain.marshall(), 0);
                    obtain.recycle();
                    String str7 = (String) ckgVar.m;
                    ckgVar.k = 2;
                    break;
                } else {
                    String str8 = (String) ckgVar.m;
                    ckgVar.k = 1;
                    break;
                }
                return nm6Var3;
            case 2:
                nm6 nm6Var4 = nm6.a;
                int i9 = ckgVar.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    str = swf.H().a;
                    String concat = "https://lumen.yandex.ru/lumen/birth?utm_source=music&utm_medium=q2v&lang=".concat(str);
                    u0h u0hVar = (u0h) ckgVar.l;
                    ckgVar.m = str;
                    ckgVar.n = concat;
                    ckgVar.k = 1;
                    a = uz1.a((uz1) u0hVar.a.getValue(), concat, ckgVar);
                    if (a == nm6Var4) {
                        return nm6Var4;
                    }
                    str2 = concat;
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) ckgVar.n;
                    str = (String) ckgVar.m;
                    qgg.h0(obj);
                    a = obj;
                }
                String str9 = (String) a;
                ((aqi) obj2).setValue(str9 != null ? new xcv(str9, str, true) : new xcv(str2, str, i5));
                return Unit.a;
            case 3:
                rjc rjcVar = (rjc) ckgVar.o;
                nm6 nm6Var5 = nm6.a;
                int i10 = ckgVar.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    i5h i5hVar = (i5h) ckgVar.n;
                    String str10 = (String) ckgVar.m;
                    ckgVar.o = null;
                    ckgVar.l = rjcVar;
                    ckgVar.k = 1;
                    b = i5hVar.b(str10, ckgVar);
                    break;
                } else {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rjcVar = (rjc) ckgVar.l;
                    qgg.h0(obj);
                    b = obj;
                }
                MainDatabase mainDatabase = (MainDatabase) b;
                String[] strArr = (String[]) obj2;
                String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
                mainDatabase.getClass();
                clc G = mainDatabase.G((String[]) Arrays.copyOf(strArr2, strArr2.length), new ikc(i6, 3, z ? 1 : 0));
                ckgVar.o = null;
                ckgVar.l = null;
                ckgVar.k = 2;
                break;
            case 4:
                nbh nbhVar = (nbh) ckgVar.n;
                float f4 = nbhVar.q;
                fk0 fk0Var2 = nbhVar.r;
                Float f5 = (Float) ckgVar.m;
                nm6 nm6Var6 = nm6.a;
                try {
                } catch (Throwable th) {
                    th = th;
                    fk0Var = fk0Var2;
                }
                switch (ckgVar.k) {
                    case 0:
                        qgg.h0(obj);
                        if (f5 == null) {
                            return Unit.a;
                        }
                        tm0 a6 = a.a(Integer.MAX_VALUE, f5.floatValue(), nbhVar.o, nbhVar.p, bcx.F(nbhVar).y);
                        if (f4 != 0.0f && !Intrinsics.a(f4, f5)) {
                            tm0 a7 = a.a(1, f5.floatValue(), 0, nbhVar.p / (1.0f - (f4 / f5.floatValue())), bcx.F(nbhVar).y);
                            Float f6 = new Float(f4);
                            ckgVar.m = f5;
                            ckgVar.l = a6;
                            ckgVar.o = a7;
                            ckgVar.k = 1;
                            if (fk0Var2.f(f6, ckgVar) != nm6Var6) {
                                tm0Var = a7;
                                tm0Var2 = a6;
                                ckgVar.m = f5;
                                ckgVar.l = tm0Var2;
                                ckgVar.o = null;
                                ckgVar.k = 2;
                                fk0Var = fk0Var2;
                                f = f5;
                                try {
                                } catch (Throwable th2) {
                                    th = th2;
                                    Float f7 = new Float(0.0f);
                                    ckgVar.m = null;
                                    ckgVar.l = null;
                                    ckgVar.o = th;
                                    ckgVar.k = 6;
                                    if (fk0Var.f(f7, ckgVar) != nm6Var6) {
                                        throw th;
                                    }
                                    return nm6Var6;
                                }
                                if (fk0.c(fk0Var, f, tm0Var, null, ckgVar, 12) == nm6Var6) {
                                    return nm6Var6;
                                }
                                f2 = new Float(0.0f);
                                ckgVar.m = f;
                                ckgVar.l = tm0Var2;
                                ckgVar.o = null;
                                ckgVar.k = 3;
                                if (fk0Var.f(f2, ckgVar) == nm6Var6) {
                                    return nm6Var6;
                                }
                                tm0 tm0Var3 = tm0Var2;
                                ckgVar.m = null;
                                ckgVar.l = null;
                                ckgVar.k = 4;
                                c = fk0.c(fk0Var, f, tm0Var3, null, ckgVar, 12);
                                if (c == nm6Var6) {
                                    return nm6Var6;
                                }
                                Float f8 = new Float(0.0f);
                                ckgVar.m = null;
                                ckgVar.l = null;
                                ckgVar.k = 5;
                                break;
                            } else {
                                return nm6Var6;
                            }
                        } else {
                            fk0Var = fk0Var2;
                            f = f5;
                            tm0Var2 = a6;
                            f2 = new Float(0.0f);
                            ckgVar.m = f;
                            ckgVar.l = tm0Var2;
                            ckgVar.o = null;
                            ckgVar.k = 3;
                            if (fk0Var.f(f2, ckgVar) == nm6Var6) {
                            }
                            tm0 tm0Var32 = tm0Var2;
                            ckgVar.m = null;
                            ckgVar.l = null;
                            ckgVar.k = 4;
                            c = fk0.c(fk0Var, f, tm0Var32, null, ckgVar, 12);
                            if (c == nm6Var6) {
                            }
                            Float f82 = new Float(0.0f);
                            ckgVar.m = null;
                            ckgVar.l = null;
                            ckgVar.k = 5;
                        }
                        break;
                    case 1:
                        tm0 tm0Var4 = (tm0) ckgVar.o;
                        tm0 tm0Var5 = (tm0) ckgVar.l;
                        qgg.h0(obj);
                        tm0Var = tm0Var4;
                        tm0Var2 = tm0Var5;
                        ckgVar.m = f5;
                        ckgVar.l = tm0Var2;
                        ckgVar.o = null;
                        ckgVar.k = 2;
                        fk0Var = fk0Var2;
                        f = f5;
                        if (fk0.c(fk0Var, f, tm0Var, null, ckgVar, 12) == nm6Var6) {
                        }
                        f2 = new Float(0.0f);
                        ckgVar.m = f;
                        ckgVar.l = tm0Var2;
                        ckgVar.o = null;
                        ckgVar.k = 3;
                        if (fk0Var.f(f2, ckgVar) == nm6Var6) {
                        }
                        tm0 tm0Var322 = tm0Var2;
                        ckgVar.m = null;
                        ckgVar.l = null;
                        ckgVar.k = 4;
                        c = fk0.c(fk0Var, f, tm0Var322, null, ckgVar, 12);
                        if (c == nm6Var6) {
                        }
                        Float f822 = new Float(0.0f);
                        ckgVar.m = null;
                        ckgVar.l = null;
                        ckgVar.k = 5;
                        break;
                    case 2:
                        tm0Var2 = (tm0) ckgVar.l;
                        qgg.h0(obj);
                        fk0Var = fk0Var2;
                        f = f5;
                        f2 = new Float(0.0f);
                        ckgVar.m = f;
                        ckgVar.l = tm0Var2;
                        ckgVar.o = null;
                        ckgVar.k = 3;
                        if (fk0Var.f(f2, ckgVar) == nm6Var6) {
                        }
                        tm0 tm0Var3222 = tm0Var2;
                        ckgVar.m = null;
                        ckgVar.l = null;
                        ckgVar.k = 4;
                        c = fk0.c(fk0Var, f, tm0Var3222, null, ckgVar, 12);
                        if (c == nm6Var6) {
                        }
                        Float f8222 = new Float(0.0f);
                        ckgVar.m = null;
                        ckgVar.l = null;
                        ckgVar.k = 5;
                        break;
                    case 3:
                        tm0Var2 = (tm0) ckgVar.l;
                        qgg.h0(obj);
                        fk0Var = fk0Var2;
                        f = f5;
                        tm0 tm0Var32222 = tm0Var2;
                        ckgVar.m = null;
                        ckgVar.l = null;
                        ckgVar.k = 4;
                        c = fk0.c(fk0Var, f, tm0Var32222, null, ckgVar, 12);
                        if (c == nm6Var6) {
                        }
                        Float f82222 = new Float(0.0f);
                        ckgVar.m = null;
                        ckgVar.l = null;
                        ckgVar.k = 5;
                        break;
                    case 4:
                        qgg.h0(obj);
                        c = obj;
                        fk0Var = fk0Var2;
                        Float f822222 = new Float(0.0f);
                        ckgVar.m = null;
                        ckgVar.l = null;
                        ckgVar.k = 5;
                        break;
                    case 5:
                        qgg.h0(obj);
                        return Unit.a;
                    case 6:
                        Throwable th3 = (Throwable) ckgVar.o;
                        qgg.h0(obj);
                        throw th3;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            case 5:
                j6i j6iVar = (j6i) ckgVar.n;
                nm6 nm6Var7 = nm6.a;
                int i11 = ckgVar.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    x3nVar = j6iVar.a;
                    j7i j7iVar = j6iVar.b;
                    str3 = j7iVar.y;
                    mqs mqsVar2 = (mqs) obj2;
                    ckgVar.o = x3nVar;
                    ckgVar.m = str3;
                    ckgVar.l = mqsVar2;
                    ckgVar.k = 1;
                    V = x97.V(dm6.b, new d7i(j7iVar, z2 ? 1 : 0, i4), ckgVar);
                    if (V == nm6Var7) {
                        return nm6Var7;
                    }
                    mqsVar = mqsVar2;
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mqs mqsVar3 = (mqs) ckgVar.l;
                    String str11 = (String) ckgVar.m;
                    x3nVar = (x3n) ckgVar.o;
                    qgg.h0(obj);
                    mqsVar = mqsVar3;
                    str3 = str11;
                    V = obj;
                }
                List list = (List) V;
                n5p n5pVar = j6iVar.r;
                x3nVar.getClass();
                str3.getClass();
                mqsVar.getClass();
                list.getClass();
                c3x.C((t) x3nVar.a);
                zus zusVar = new zus(list.indexOf(mqsVar));
                z1p Q = p1g.Q(n5pVar);
                rre.Z(mqsVar, zusVar, y5g.B0(mqsVar, new qyt(str3, Q != null ? u1g.R(Q) : null)), new ve(muo.SEARCH, zqt.c), (t) x3nVar.a, (y) x3nVar.b, (kxi) x3nVar.c, new h(Page.SEARCH), null, null, null, 1792);
                return Unit.a;
            case 6:
                sai saiVar = (sai) ckgVar.o;
                Object obj3 = nm6.a;
                int i12 = ckgVar.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    bci bciVar = (bci) ckgVar.l;
                    mm6 mm6Var = (mm6) ckgVar.m;
                    saiVar.getClass();
                    bciVar.getClass();
                    saiVar.c = bciVar;
                    saiVar.d = mm6Var;
                    ckgVar.k = 1;
                    Object h0 = zsd.h0(szf.s0(new co5(saiVar, 2)), new lf2(i5, 8, z3 ? 1 : 0), ckgVar);
                    Object obj4 = h0;
                    if (h0 != obj3) {
                        obj4 = Unit.a;
                        break;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        ViewGroup viewGroup = saiVar.e;
                        if (viewGroup != null) {
                            viewGroup.removeView(saiVar.f);
                        }
                        saiVar.f = null;
                        saiVar.e = null;
                        ((lai) obj2).invoke();
                        return Unit.a;
                    }
                    qgg.h0(obj);
                }
                ((lai) ckgVar.n).invoke();
                ckgVar.k = 2;
                saiVar.getClass();
                Object h02 = zsd.h0(szf.s0(new co5(saiVar, 1)), new lf2(i5, 7, z4 ? 1 : 0), ckgVar);
                Object obj5 = h02;
                if (h02 != obj3) {
                    obj5 = Unit.a;
                    break;
                }
                break;
            case 7:
                lni lniVar = (lni) ckgVar.m;
                yk3 yk3Var = (yk3) ckgVar.l;
                mm6 mm6Var2 = (mm6) ckgVar.o;
                nm6 nm6Var8 = nm6.a;
                int i13 = ckgVar.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    ox6.B((fkn) yk3Var.d, mm6Var2, new fmi(i6, lniVar));
                    ye yeVar = new ye(lniVar, yk3Var, (j6e) ckgVar.n, (i50) obj2, 26);
                    ckgVar.o = null;
                    ckgVar.k = 1;
                    if (sk3.S(g.a, yeVar, ckgVar) == nm6Var8) {
                        return nm6Var8;
                    }
                } else {
                    if (i13 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 8:
                oq oqVar = (oq) ckgVar.m;
                w8j w8jVar = (w8j) ckgVar.n;
                r8j r8jVar = w8jVar.a;
                nm6 nm6Var9 = nm6.a;
                int i14 = ckgVar.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    y = x97.y((mm6) ckgVar.l, null, null, new m1i(w8jVar, z5 ? 1 : 0, i2), 3);
                    boolean z11 = (oqVar == null || oqVar.F.isEmpty()) ? false : true;
                    if (!z11) {
                        if (!z11) {
                            String str12 = ((lt) obj2).a;
                            ckgVar.o = y;
                            ckgVar.k = 1;
                            a2 = r8jVar.a(str12, ckgVar);
                            break;
                        } else {
                            b6e.s();
                            return null;
                        }
                    }
                    w8jVar.e = oqVar;
                    if (oqVar == null) {
                        boolean z12 = r8jVar.e;
                        p0t p0tVar = (p0t) r8jVar.h.getValue();
                        lwc lwcVar = (lwc) r8jVar.i.getValue();
                        f7l f7lVar = (f7l) r8jVar.j.getValue();
                        yab yabVar = (yab) r8jVar.m.getValue();
                        bab babVar = (bab) w8jVar.h.getValue();
                        p0tVar.getClass();
                        lwcVar.getClass();
                        f7lVar.getClass();
                        yabVar.getClass();
                        babVar.getClass();
                        g8c g8cVar = new g8c();
                        g8cVar.a = new g10(oqVar, p0tVar, lwcVar, f7lVar);
                        if (z12) {
                            eca ecaVar = eca.d;
                            u21Var = new u21(10, yabVar.a().i(oqVar), babVar.a(d51.o(oqVar)), new re7(g8cVar, z6 ? 1 : 0, i3));
                        } else {
                            u21Var = new fs(15, ((g10) g8cVar.a).a());
                        }
                        tl0 tl0Var = new tl0(26, w8jVar, oqVar, y);
                        ckgVar.o = null;
                        ckgVar.k = 3;
                        break;
                    } else {
                        ckgVar.o = null;
                        ckgVar.k = 2;
                        break;
                    }
                    return nm6Var9;
                }
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 == 3) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    s8j s8jVar = w8jVar.c;
                    s8jVar.a();
                    Context context = s8jVar.b;
                    context.getClass();
                    hag.x(context, R.string.error_unknown, 0);
                    return Unit.a;
                }
                y = (rar) ckgVar.o;
                qgg.h0(obj);
                a2 = obj;
                oq oqVar2 = (oq) a2;
                if (oqVar2 != null) {
                    oqVar = oqVar2;
                }
                w8jVar.e = oqVar;
                if (oqVar == null) {
                }
                return nm6Var9;
            case 9:
                String str13 = (String) ckgVar.m;
                oxa oxaVar = (oxa) obj2;
                rfk rfkVar = (rfk) ckgVar.l;
                nm6 nm6Var10 = nm6.a;
                int i15 = ckgVar.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    ltm ltmVar = (ltm) ckgVar.o;
                    qzc qzcVar = new qzc(18, ltmVar);
                    if (Intrinsics.d(rfkVar, jfk.a) || o8g.y(rfkVar)) {
                        g3j g3jVar = (g3j) ckgVar.n;
                        if (g3jVar != null) {
                            ((sbp) ((kpm) oxaVar.b).b).c.a().c(g3jVar, str13, qzcVar);
                        }
                    } else if (Intrinsics.d(rfkVar, ifk.a)) {
                        ((sbp) ((kpm) oxaVar.b).b).c.a().a(str13, qzcVar);
                    } else if (((rfkVar instanceof ffk) && !o8g.y(rfkVar)) || (rfkVar instanceof pfk)) {
                        kpm kpmVar = (kpm) oxaVar.b;
                        rfkVar.getClass();
                        ((sbp) kpmVar.b).c.a().d(rfkVar, dpo.G, str13, qzcVar);
                    }
                    xuj xujVar = xuj.y;
                    ckgVar.k = 1;
                    if (y7g.q(ltmVar, xujVar, ckgVar) == nm6Var10) {
                        return nm6Var10;
                    }
                } else {
                    if (i15 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 10:
                nm6 nm6Var11 = nm6.a;
                int i16 = ckgVar.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.pay.ui.core.a aVar = (com.yandex.plus.pay.ui.core.a) ((kik) ckgVar.o).a.getValue();
                    ckgVar.k = 1;
                    a3 = aVar.a();
                    break;
                } else {
                    if (i16 != 1) {
                        if (i16 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        b2 = obj;
                        d dVar = (d) b2;
                        dVar.getClass();
                        if (dVar instanceof com.yandex.plus.pay.ui.core.api.tarifficator.c) {
                            return rik.a;
                        }
                        if (dVar instanceof b) {
                            return qik.a;
                        }
                        if (dVar instanceof com.yandex.plus.pay.ui.core.api.tarifficator.a) {
                            return pik.a;
                        }
                        b6e.s();
                        return null;
                    }
                    qgg.h0(obj);
                    a3 = obj;
                }
                e C = com.yandex.plus.bdui.flex.ui.a.C((com.yandex.plus.pay.ui.core.internal.a) a3);
                oik oikVar = (oik) ckgVar.l;
                LinkedHashMap linkedHashMap = (LinkedHashMap) ckgVar.n;
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                q5b q5bVar = q5b.a;
                String str14 = oikVar.a;
                List w0 = CollectionsKt.w0(oikVar.b);
                if (str14 == null) {
                    xq0.x("page or targetToFeatures must be specified");
                    return null;
                }
                if (w0 == null) {
                    w0 = c5b.a;
                }
                com.yandex.plus.pay.ui.tarifficator.api.c cVar = new com.yandex.plus.pay.ui.tarifficator.api.c(str14, w0, linkedHashMap, e5bVar, q5bVar);
                String str15 = (String) ckgVar.m;
                com.yandex.plus.pay.api.analytics.b bVar = new com.yandex.plus.pay.api.analytics.b();
                bVar.c = (Set) obj2;
                bVar.a(str15);
                com.yandex.plus.pay.api.analytics.c cVar2 = new com.yandex.plus.pay.api.analytics.c(bVar.a, null, bVar.b, null, bVar.c, bVar.d);
                ckgVar.k = 2;
                b2 = ((com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.h) ((com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.e) C).d.getValue()).b(cVar, cVar2, ckgVar);
                break;
            case 11:
                nm6 nm6Var12 = nm6.a;
                int i17 = ckgVar.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    ckgVar.k = 1;
                    if (anx.p((anx) ckgVar.o, (g4q) ckgVar.l, (g4q) ckgVar.m, (PlaybackCommand$QueueLaunch) ckgVar.n, (ii3) obj2, ckgVar) == nm6Var12) {
                        return nm6Var12;
                    }
                } else {
                    if (i17 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 12:
                return k(obj);
            case 13:
                aqi aqiVar = (aqi) obj2;
                aqi aqiVar2 = (aqi) ckgVar.m;
                lke lkeVar = (lke) ckgVar.o;
                nm6 nm6Var13 = nm6.a;
                int i18 = ckgVar.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    fk0 fk0Var3 = (fk0) ckgVar.l;
                    if (lkeVar == null) {
                        nm6Var = nm6Var13;
                        Float f9 = new Float(0.0f);
                        ckgVar.o = null;
                        ckgVar.k = 4;
                        break;
                    } else {
                        if (((Number) fk0Var3.e()).floatValue() != 0.0f) {
                            fk0 fk0Var4 = (fk0) ckgVar.l;
                            Float f10 = new Float(0.0f);
                            ckgVar.o = lkeVar;
                            ckgVar.k = 1;
                            nm6Var = nm6Var13;
                            ckgVar = this;
                            break;
                        }
                        nm6Var = nm6Var13;
                        aqiVar2.setValue(lkeVar);
                        fk0 fk0Var5 = (fk0) ckgVar.l;
                        Float f11 = new Float(1.0f);
                        ckgVar.o = lkeVar;
                        ckgVar.k = 2;
                        ckgVar = this;
                    }
                    return nm6Var;
                }
                if (i18 == 1) {
                    qgg.h0(obj);
                    nm6Var = nm6Var13;
                    aqiVar2.setValue(lkeVar);
                    fk0 fk0Var52 = (fk0) ckgVar.l;
                    Float f112 = new Float(1.0f);
                    ckgVar.o = lkeVar;
                    ckgVar.k = 2;
                    ckgVar = this;
                    break;
                } else if (i18 == 2) {
                    qgg.h0(obj);
                    nm6Var = nm6Var13;
                    pjc a8 = lkeVar.a((jx7) ckgVar.n);
                    seg segVar = new seg((Object) aqiVar, (Continuation) (z7 ? 1 : 0), 20);
                    ckgVar.o = null;
                    ckgVar.k = 3;
                    break;
                } else if (i18 == 3) {
                    qgg.h0(obj);
                } else {
                    if (i18 != 4) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    aqiVar2.setValue(null);
                    aqiVar.setValue(null);
                }
                return Unit.a;
            case 14:
                nm6 nm6Var14 = nm6.a;
                int i19 = ckgVar.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    vdr vdrVar = (vdr) ((h4b) ckgVar.o).a;
                    ckg ckgVar2 = new ckg((fk0) ckgVar.l, (aqi) ckgVar.m, (jx7) ckgVar.n, (aqi) obj2, (Continuation) null, 13);
                    ckgVar.k = 1;
                    if (zsd.O(vdrVar, ckgVar2, ckgVar) == nm6Var14) {
                        return nm6Var14;
                    }
                } else {
                    if (i19 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 15:
                kvl kvlVar = (kvl) ckgVar.n;
                nm6 nm6Var15 = nm6.a;
                int i20 = ckgVar.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    ivl ivlVar = kvlVar.m;
                    cvl cvlVar2 = kvlVar.k;
                    g0l g0lVar2 = (g0l) ivlVar.a.getValue();
                    m2m m2mVar = (m2m) kvlVar.m.b.getValue();
                    ckgVar.o = g0lVar2;
                    ckgVar.l = cvlVar2;
                    hcr hcrVar2 = hcr.a;
                    ckgVar.m = hcrVar2;
                    ckgVar.k = 1;
                    m2mVar.getClass();
                    dq7 dq7Var = ca8.a;
                    V2 = x97.V(mn7.d, new d7i(cvlVar2, z8 ? 1 : 0, i2), ckgVar);
                    if (V2 == nm6Var15) {
                        return nm6Var15;
                    }
                    g0lVar = g0lVar2;
                    cvlVar = cvlVar2;
                    hcrVar = hcrVar2;
                } else {
                    if (i20 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hcr hcrVar3 = (hcr) ckgVar.m;
                    cvl cvlVar3 = (cvl) ckgVar.l;
                    g0l g0lVar3 = (g0l) ckgVar.o;
                    qgg.h0(obj);
                    hcrVar = hcrVar3;
                    cvlVar = cvlVar3;
                    g0lVar = g0lVar3;
                    V2 = obj;
                }
                g0l.l(g0lVar, cvlVar, hcrVar, (List) V2, kvlVar.l, new w5l(new cvo(wjb.SummaryScreen, hlb.Bottomsheet, (glb) null, (dvo) null, new avo(pkb.Album, kvlVar.k.e()), 44), new jab(qkb.Summary, 1, 1, 0), (thj) obj2, null), ((ru.yandex.music.common.media.context.c) ((gpj) kvlVar.m.d.getValue()).b.getValue()).a());
                return Unit.a;
            case 16:
                fvf fvfVar = (fvf) ckgVar.o;
                nm6 nm6Var16 = nm6.a;
                int i21 = ckgVar.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    da3 da3Var = new da3((jic) ckgVar.m, z9 ? 1 : 0, i5);
                    ckgVar.k = 1;
                    break;
                } else {
                    if (i21 != 1) {
                        if (i21 == 2) {
                            throw ouj.e(obj);
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                j0q j0qVar = ((qzl) ckgVar.l).s;
                jx7 jx7Var = (jx7) ckgVar.n;
                float f12 = edo.a;
                hyl hylVar = new hyl(fvfVar, jx7Var, (eoe) obj2);
                ckgVar.k = 2;
                j0qVar.collect(hylVar, ckgVar);
                return nm6Var16;
            case 17:
                nm6 nm6Var17 = nm6.a;
                int i22 = ckgVar.k;
                if (i22 != 0) {
                    if (i22 == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                j0q j0qVar2 = ((qzl) ckgVar.o).u;
                fvf fvfVar2 = (fvf) ckgVar.l;
                sdr sdrVar = (sdr) ckgVar.m;
                jx7 jx7Var2 = (jx7) ckgVar.n;
                float f13 = edo.a;
                pm pmVar = new pm(fvfVar2, sdrVar, jx7Var2, (eoe) obj2);
                ckgVar.k = 1;
                j0qVar2.collect(pmVar, ckgVar);
                return nm6Var17;
            case 18:
                pfm pfmVar = (pfm) ckgVar.o;
                Object obj6 = nm6.a;
                int i23 = ckgVar.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    jap japVar = (jap) ckgVar.l;
                    msd msdVar = (msd) ckgVar.m;
                    aqi aqiVar3 = (aqi) ckgVar.n;
                    ckgVar.o = null;
                    ckgVar.k = 1;
                    iur iurVar = (iur) pfmVar;
                    iurVar.getClass();
                    Object v = xee.v(pfmVar, new ivm(bcx.F(iurVar).A.b(), bcx.F(iurVar).A.f(), (aqi) obj2, japVar, msdVar, aqiVar3, null), ckgVar);
                    Object obj7 = v;
                    if (v != obj6) {
                        obj7 = Unit.a;
                    }
                    if (obj7 == obj6) {
                        return obj6;
                    }
                } else {
                    if (i23 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 19:
                Uri uri = (Uri) obj2;
                i4n i4nVar = (i4n) ckgVar.n;
                mm6 mm6Var3 = (mm6) ckgVar.o;
                nm6 nm6Var18 = nm6.a;
                int i24 = ckgVar.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    y2 = x97.y(mm6Var3, null, null, new dt0(i5, 11, z10 ? 1 : 0), 3);
                    uz1 uz1Var = (uz1) i4nVar.k.getValue();
                    String uri2 = uri.toString();
                    uri2.getClass();
                    ckgVar.o = null;
                    ckgVar.l = y2;
                    ckgVar.k = 1;
                    a4 = uz1.a(uz1Var, uri2, ckgVar);
                    break;
                } else {
                    if (i24 != 1) {
                        if (i24 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str4 = (String) ckgVar.m;
                        qgg.h0(obj);
                        xdr xdrVar = i4nVar.l;
                        if (str4 == null) {
                            str4 = uri.toString();
                            str4.getClass();
                        }
                        k4n k4nVar = new k4n(str4);
                        xdrVar.getClass();
                        xdrVar.m(null, k4nVar);
                        return Unit.a;
                    }
                    y2 = (rar) ckgVar.l;
                    qgg.h0(obj);
                    a4 = obj;
                }
                String str16 = (String) a4;
                ckgVar.o = null;
                ckgVar.l = null;
                ckgVar.m = str16;
                ckgVar.k = 2;
                if (y2.j0(ckgVar) != nm6Var18) {
                    str4 = str16;
                    xdr xdrVar2 = i4nVar.l;
                    if (str4 == null) {
                    }
                    k4n k4nVar2 = new k4n(str4);
                    xdrVar2.getClass();
                    xdrVar2.m(null, k4nVar2);
                    return Unit.a;
                }
                return nm6Var18;
            case 20:
                return l(obj);
            case 21:
                return n(obj);
            case 22:
                return o(obj);
            case 23:
                return p(obj);
            case 24:
                nm6 nm6Var19 = nm6.a;
                int i25 = ckgVar.k;
                if (i25 != 0) {
                    if (i25 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                rce rceVar = (rce) ckgVar.o;
                mr1 mr1Var = new mr1(rceVar, ((skn) ckgVar.l).j, 0, rceVar, (lmq) ckgVar.m, (hib) ckgVar.n, ((Bitmap) obj2) != null);
                ckgVar.k = 1;
                Object b3 = mr1Var.b(rceVar, ckgVar);
                return b3 == nm6Var19 ? nm6Var19 : b3;
            case 25:
                return q(obj);
            case 26:
                return s(obj);
            case 27:
                return t(obj);
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return u(obj);
            default:
                kef kefVar = (kef) obj2;
                o2q o2qVar = (o2q) ckgVar.l;
                jyr jyrVar = o2qVar.b;
                xdr xdrVar3 = o2qVar.f;
                nm6 nm6Var20 = nm6.a;
                int i26 = ckgVar.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    a5 = o2qVar.a();
                    str5 = (String) ckgVar.n;
                    vdr vdrVar2 = (vdr) o2qVar.g.getValue();
                    ckgVar.o = a5;
                    ckgVar.m = str5;
                    ckgVar.k = 1;
                    g0 = zsd.g0(vdrVar2, ckgVar);
                    break;
                } else {
                    if (i26 != 1) {
                        if (i26 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        f3 = obj;
                        List list2 = (List) f3;
                        List q0 = list2 != null ? CollectionsKt.q0(list2, 500) : null;
                        List list3 = q0;
                        if (list3 == null || list3.isEmpty()) {
                            if (((z66) ((arf) o2qVar.h.getValue()).getValue()).g()) {
                                k2q k2qVar = k2q.e;
                                xdrVar3.getClass();
                                xdrVar3.m(null, k2qVar);
                            } else {
                                k2q k2qVar2 = k2q.d;
                                xdrVar3.getClass();
                                xdrVar3.m(null, k2qVar2);
                            }
                        } else if (xdrVar3.getValue() != k2q.c) {
                            xdrVar3.m(null, k2q.b);
                        }
                        int ordinal = ((k2q) xdrVar3.getValue()).ordinal();
                        if (ordinal == 0) {
                            kefVar.invoke(q0);
                        } else if (ordinal == 1) {
                            ((lc0) jyrVar.getValue()).a();
                            kefVar.invoke(q0);
                        } else if (ordinal == 2) {
                            lc0 lc0Var = (lc0) jyrVar.getValue();
                            eth ethVar = (eth) lc0Var.b.getValue();
                            String string = lc0Var.a.getString(R.string.android_auto_authorization_error);
                            string.getClass();
                            ethVar.a(new ulp(string));
                            kefVar.invoke(null);
                        } else if (ordinal == 3) {
                            kefVar.invoke(null);
                        } else {
                            if (ordinal != 4) {
                                b6e.s();
                                return null;
                            }
                            kefVar.invoke(null);
                        }
                        return Unit.a;
                    }
                    str5 = (String) ckgVar.m;
                    a5 = (s72) ckgVar.o;
                    qgg.h0(obj);
                    g0 = obj;
                }
                u0j u0jVar = ((x66) g0).b;
                ckgVar.o = null;
                ckgVar.m = null;
                ckgVar.k = 2;
                a5.getClass();
                if (!Intrinsics.d(str5, "media_suggested_browser_root_id")) {
                    if (!Intrinsics.d(str5, "media_browser_root_id")) {
                        int ordinal2 = u0jVar.ordinal();
                        if (ordinal2 == 0) {
                            f3 = a5.f(str5, ckgVar);
                            break;
                        } else {
                            if (ordinal2 != 1) {
                                b6e.s();
                                return null;
                            }
                            f3 = a5.e(str5, ckgVar);
                            break;
                        }
                    } else {
                        f3 = a5.j(u0jVar, ckgVar);
                        if (f3 != nm6Var20) {
                            f3 = (List) f3;
                            break;
                        }
                    }
                } else {
                    f3 = a5.m(u0jVar, ckgVar);
                    if (f3 != nm6Var20) {
                        f3 = (List) f3;
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckg(i5h i5hVar, String str, String[] strArr, Continuation continuation) {
        super(2, continuation);
        this.j = 3;
        this.n = i5hVar;
        this.m = str;
        this.p = strArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckg(rfk rfkVar, g3j g3jVar, oxa oxaVar, String str, Continuation continuation) {
        super(2, continuation);
        this.j = 9;
        this.l = rfkVar;
        this.n = g3jVar;
        this.p = oxaVar;
        this.m = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckg(kik kikVar, oik oikVar, LinkedHashMap linkedHashMap, Set set, String str, Continuation continuation) {
        super(2, continuation);
        this.j = 10;
        this.o = kikVar;
        this.l = oikVar;
        this.n = linkedHashMap;
        this.p = set;
        this.m = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckg(qzl qzlVar, fvf fvfVar, sdr sdrVar, jx7 jx7Var, eoe eoeVar, Continuation continuation) {
        super(2, continuation);
        this.j = 17;
        float f = edo.a;
        this.o = qzlVar;
        this.l = fvfVar;
        this.m = sdrVar;
        this.n = jx7Var;
        this.p = eoeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ckg(ocn ocnVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.p = ocnVar;
        this.m = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckg(oev oevVar, u0h u0hVar, aqi aqiVar, Continuation continuation) {
        super(2, continuation);
        this.j = 2;
        this.o = oevVar;
        this.l = u0hVar;
        this.p = aqiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckg(Parcelable parcelable, fkg fkgVar, lpi lpiVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.j = 1;
        this.o = parcelable;
        this.l = fkgVar;
        this.p = lpiVar;
        this.m = str;
        this.n = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ckg(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.o = obj;
        this.l = obj2;
        this.m = obj3;
        this.n = obj4;
        this.p = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ckg(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
        this.p = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ckg(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.n = obj2;
        this.p = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ckg(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.n = obj;
        this.p = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ckg(Object obj, String str, Serializable serializable, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.n = str;
        this.p = serializable;
    }
}
