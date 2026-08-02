package defpackage;

import android.graphics.Bitmap;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.video.m3.ui.ListYandexPlayerView;

/* loaded from: classes6.dex */
public final class re7 extends aur implements pyc {
    public final /* synthetic */ int j;
    public /* synthetic */ boolean k;
    public /* synthetic */ Object l;
    public /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re7(ListYandexPlayerView listYandexPlayerView, Continuation continuation) {
        super(3, continuation);
        this.j = 2;
        this.l = listYandexPlayerView;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.j) {
            case 0:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                re7 re7Var = new re7((ue7) this.m, (Continuation) obj3, 0);
                re7Var.l = (eag) obj;
                re7Var.k = booleanValue;
                return re7Var.invokeSuspend(Unit.a);
            case 1:
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                re7 re7Var2 = new re7((jub) this.m, (Continuation) obj3, 1);
                re7Var2.l = (zml) obj;
                re7Var2.k = booleanValue2;
                return re7Var2.invokeSuspend(Unit.a);
            case 2:
                boolean booleanValue3 = ((Boolean) obj2).booleanValue();
                re7 re7Var3 = new re7((ListYandexPlayerView) this.l, (Continuation) obj3);
                re7Var3.m = (ue7) obj;
                re7Var3.k = booleanValue3;
                return re7Var3.invokeSuspend(Unit.a);
            case 3:
                boolean booleanValue4 = ((Boolean) obj2).booleanValue();
                re7 re7Var4 = new re7((e3h) this.m, (Continuation) obj3, 3);
                re7Var4.l = (yll) obj;
                re7Var4.k = booleanValue4;
                return re7Var4.invokeSuspend(Unit.a);
            case 4:
                boolean booleanValue5 = ((Boolean) obj).booleanValue();
                re7 re7Var5 = new re7((g8c) this.m, (Continuation) obj3, 4);
                re7Var5.k = booleanValue5;
                re7Var5.l = (y9a) obj2;
                return re7Var5.invokeSuspend(Unit.a);
            case 5:
                boolean booleanValue6 = ((Boolean) obj2).booleanValue();
                re7 re7Var6 = new re7((d18) this.m, (Continuation) obj3, 5);
                re7Var6.l = (h5q) obj;
                re7Var6.k = booleanValue6;
                return re7Var6.invokeSuspend(Unit.a);
            case 6:
                boolean booleanValue7 = ((Boolean) obj).booleanValue();
                re7 re7Var7 = new re7((pqp) this.m, (Continuation) obj3, 6);
                re7Var7.k = booleanValue7;
                re7Var7.l = (yyb) obj2;
                return re7Var7.invokeSuspend(Unit.a);
            case 7:
                boolean booleanValue8 = ((Boolean) obj).booleanValue();
                re7 re7Var8 = new re7((eps) this.m, (Continuation) obj3, 7);
                re7Var8.k = booleanValue8;
                re7Var8.l = (tlv) obj2;
                return re7Var8.invokeSuspend(Unit.a);
            default:
                boolean booleanValue9 = ((Boolean) obj2).booleanValue();
                re7 re7Var9 = new re7((ykw) this.m, (Continuation) obj3, 8);
                re7Var9.l = (iqw) obj;
                re7Var9.k = booleanValue9;
                return re7Var9.invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:307:0x0875  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        imh imhVar;
        Object obj2;
        y3h v3hVar;
        y3h y3hVar;
        y3h y3hVar2;
        sn snVar;
        t7g t7gVar;
        String str;
        xnf xnfVar;
        Object uovVar;
        Bitmap bitmap;
        boolean z = false;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                eag eagVar = (eag) this.l;
                boolean z2 = this.k;
                ue7 ue7Var = (ue7) this.m;
                if (!((Boolean) ((fkn) ue7Var.c.c).a.getValue()).booleanValue()) {
                    return Unit.a;
                }
                xdr xdrVar = ue7Var.k;
                te7 te7Var = z2 ? te7.e : te7.d;
                Iterator it = eagVar.a.iterator();
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i3 = -1;
                    } else if (!Intrinsics.d((imh) it.next(), ue7Var.m)) {
                        i3++;
                    }
                }
                if (i3 == -1) {
                    i2 = te7Var.c;
                    i = 0;
                    imhVar = null;
                } else {
                    i = i3 - te7Var.a;
                    if (i < 0) {
                        i = 0;
                    }
                    i2 = i3 + te7Var.b + 1;
                    imhVar = ue7Var.m;
                }
                List list = eagVar.a;
                int g = u75.g(list);
                if (g < 0) {
                    g = 0;
                }
                if (i2 > g) {
                    i2 = g;
                }
                if (i > i2) {
                    i = i2;
                }
                List subList = list.subList(i, i2);
                Map map = eagVar.d;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (subList.contains(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Map map2 = eagVar.e;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : map2.entrySet()) {
                    if (subList.contains(entry2.getKey())) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                Map map3 = eagVar.f;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry3 : map3.entrySet()) {
                    if (subList.contains(entry3.getKey())) {
                        linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                    }
                }
                Map map4 = eagVar.g;
                Map map5 = eagVar.h;
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (Map.Entry entry4 : map5.entrySet()) {
                    if (Intrinsics.d(entry4.getKey(), ((qe7) ue7Var.i.getValue()).a)) {
                        linkedHashMap4.put(entry4.getKey(), entry4.getValue());
                    }
                }
                Integer num = (Integer) CollectionsKt.R(linkedHashMap4.values());
                int intValue = num != null ? num.intValue() : 0;
                Iterator it2 = eagVar.j.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (Intrinsics.d(((i6r) obj2).a, imhVar != null ? imhVar.d : null)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                i6r i6rVar = (i6r) obj2;
                Map map6 = eagVar.k;
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                for (Map.Entry entry5 : map6.entrySet()) {
                    if (Intrinsics.d(entry5.getKey(), imhVar)) {
                        linkedHashMap5.put(entry5.getKey(), entry5.getValue());
                    }
                }
                Boolean bool = (Boolean) CollectionsKt.R(linkedHashMap5.values());
                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                Map map7 = eagVar.l;
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                for (Map.Entry entry6 : map7.entrySet()) {
                    if (Intrinsics.d(entry6.getKey(), imhVar)) {
                        linkedHashMap6.put(entry6.getKey(), entry6.getValue());
                    }
                }
                jag jagVar = new jag(subList, linkedHashMap, linkedHashMap2, linkedHashMap3, map4, Integer.valueOf(intValue), i6rVar, Boolean.valueOf(booleanValue), (Boolean) CollectionsKt.R(linkedHashMap6.values()), eagVar.m, eagVar.n, CollectionsKt.o0(CollectionsKt.w0(eagVar.o), new dl4(16)), CollectionsKt.o0(CollectionsKt.w0(eagVar.p), new dl4(17)), imhVar, z2, (Long) eagVar.q.get(imhVar));
                xdrVar.getClass();
                xdrVar.m(null, jagVar);
                return Unit.a;
            case 1:
                jub jubVar = (jub) this.m;
                LinkedHashMap linkedHashMap7 = jubVar.k;
                zml zmlVar = (zml) this.l;
                boolean z3 = this.k;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                if (zmlVar == null) {
                    return mtb.e;
                }
                List list2 = zmlVar.a;
                Set keySet = linkedHashMap7.keySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : keySet) {
                    if (!list2.contains(obj3)) {
                        arrayList.add(obj3);
                    }
                }
                List list3 = list2;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list3) {
                    if (!keySet.contains(obj4)) {
                        arrayList2.add(obj4);
                    }
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    rnq rnqVar = (rnq) next;
                    nnq nnqVar = (nnq) jubVar.a.c.i.getValue();
                    qnq qnqVar = jubVar.c;
                    rnqVar.getClass();
                    nnqVar.getClass();
                    prf a = nnqVar.a(rnqVar.a().a().b);
                    rrf a2 = a != null ? a.a().a(rnqVar, qnqVar) : null;
                    if (a2 != null) {
                        linkedHashMap7.put(next, a2);
                    }
                }
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    linkedHashMap7.remove(it4.next());
                }
                if (jubVar.l) {
                    jubVar.e.d(zmlVar.e);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : list3) {
                    rnq rnqVar2 = (rnq) obj5;
                    if (!z3 || !jubVar.g.contains(rnqVar2.a().a().b)) {
                        arrayList3.add(obj5);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    rrf rrfVar = (rrf) linkedHashMap7.get((rnq) it5.next());
                    if (rrfVar != null) {
                        arrayList4.add(rrfVar);
                    }
                }
                return new mtb(arrayList4, zmlVar.b, zmlVar.d, zmlVar.c);
            case 2:
                ListYandexPlayerView listYandexPlayerView = (ListYandexPlayerView) this.l;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                ue7 ue7Var2 = (ue7) this.m;
                if (!this.k || ue7Var2 == null) {
                    listYandexPlayerView.c();
                } else {
                    listYandexPlayerView.a(ue7Var2.j, ue7Var2.l);
                }
                return Unit.a;
            case 3:
                yll yllVar = (yll) this.l;
                boolean z4 = this.k;
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                e3h e3hVar = (e3h) this.m;
                a4h a4hVar = a4h.a;
                if (Intrinsics.d(yllVar, ull.a)) {
                    return new b4h(z4);
                }
                if (!(yllVar instanceof wll)) {
                    if (!Intrinsics.d(yllVar, vll.a) && !Intrinsics.d(yllVar, xll.a)) {
                        b6e.s();
                        return null;
                    }
                    return a4hVar;
                }
                iwe iweVar = e3hVar.a;
                g1h g1hVar = ((wll) yllVar).a;
                dkl dklVar = (dkl) iweVar.b;
                g1hVar.getClass();
                Pair pair = (Pair) iweVar.c;
                if (Intrinsics.d(pair != null ? (g1h) pair.a : null, g1hVar)) {
                    y3hVar2 = (y3h) pair.b;
                } else {
                    List list4 = g1hVar.e;
                    String o = (list4 == null || list4.isEmpty()) ? null : ouj.o(((skr) dklVar.a.getValue()).c(R.string.lyrics_info_prefix_author), ": ", CollectionsKt.X(list4, ", ", null, null, null, 62));
                    String str2 = g1hVar.d.b;
                    String o2 = (str2 == null || str2.length() == 0) ? null : ouj.o(((skr) dklVar.a.getValue()).c(R.string.lyrics_info_prefix_license), ": ", str2);
                    int ordinal = g1hVar.f.ordinal();
                    if (ordinal == 0) {
                        kn0 kn0Var = new kn0();
                        kn0Var.d(g1hVar.g);
                        for (int i4 = 0; i4 < 3; i4++) {
                            kn0Var.append('\n');
                        }
                        int g2 = kn0Var.g(new c4r(d85.b(d85.f, 0.5f, 0.0f, 0.0f, 0.0f, 14), 0L, (tqc) null, (oqc) null, (pqc) null, (qpc) null, (String) null, 0L, (wu2) null, (ccs) null, (bqg) null, 0L, (aas) null, (otp) null, 65534));
                        if (o != null) {
                            try {
                                kn0Var.d(o);
                                kn0Var.append('\n');
                            } catch (Throwable th) {
                                kn0Var.f(g2);
                                throw th;
                            }
                        }
                        if (o2 != null) {
                            kn0Var.d(o2);
                        }
                        kn0Var.f(g2);
                        v3hVar = new v3h(kn0Var.h());
                    } else {
                        if (ordinal != 1 && ordinal != 2) {
                            b6e.s();
                            return null;
                        }
                        StringBuilder sb = new StringBuilder();
                        if (o != null) {
                            sb.append(o);
                        }
                        sb.append('\n');
                        if (o2 != null) {
                            sb.append(o2);
                        }
                        String sb2 = sb.toString();
                        List<wwr> list5 = g1hVar.h;
                        ArrayList arrayList5 = new ArrayList(v75.o(list5, 10));
                        for (wwr wwrVar : list5) {
                            arrayList5.add(new w3h(wwrVar.a, wwrVar.b));
                        }
                        if (arrayList5.isEmpty()) {
                            dfi.r(f1d.g("error converting lyrics for track ", g1hVar.a.a), "PlayerScreen");
                            y3hVar = null;
                            if (y3hVar != null) {
                                iweVar.c = new Pair(g1hVar, y3hVar);
                            }
                            y3hVar2 = y3hVar;
                        } else {
                            v3hVar = new x3h(sb2, arrayList5);
                        }
                    }
                    y3hVar = v3hVar;
                    if (y3hVar != null) {
                    }
                    y3hVar2 = y3hVar;
                }
                if (y3hVar2 instanceof v3h) {
                    return new c4h((v3h) y3hVar2, z4);
                }
                if (y3hVar2 instanceof x3h) {
                    return new d4h((x3h) y3hVar2, z2h.a, z4);
                }
                if (y3hVar2 != null) {
                    b6e.s();
                    return null;
                }
                return a4hVar;
            case 4:
                boolean z5 = this.k;
                y9a y9aVar = (y9a) this.l;
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                n8g a3 = ((g10) ((g8c) this.m).a).a();
                n8g b = t75.b();
                shi shiVar = shi.a;
                if (a3.contains(shiVar)) {
                    b.add(shiVar);
                }
                b.add(z5 ? sn.b : sn.a);
                ArrayList arrayList6 = new ArrayList();
                ListIterator listIterator = a3.listIterator(0);
                while (true) {
                    ezd ezdVar = (ezd) listIterator;
                    if (!ezdVar.hasNext()) {
                        Iterator it6 = arrayList6.iterator();
                        while (it6.hasNext()) {
                            b.add((f10) it6.next());
                        }
                        b.add(sn.c);
                        if (Intrinsics.d(y9aVar, u9a.a)) {
                            snVar = sn.d;
                        } else if (Intrinsics.d(y9aVar, v9a.a)) {
                            snVar = sn.e;
                        } else if (Intrinsics.d(y9aVar, x9a.a)) {
                            snVar = sn.f;
                        } else {
                            if (!Intrinsics.d(y9aVar, w9a.a)) {
                                b6e.s();
                                return null;
                            }
                            snVar = null;
                        }
                        if (snVar != null) {
                            b.add(snVar);
                        }
                        return t75.a(b);
                    }
                    Object next2 = ezdVar.next();
                    if (((shi) next2) != shi.a) {
                        arrayList6.add(next2);
                    }
                }
            case 5:
                h5q h5qVar = (h5q) this.l;
                boolean z6 = this.k;
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                d18 d18Var = (d18) this.m;
                v2q v2qVar = (v2q) d18Var.h;
                if (v2qVar != null) {
                    h5qVar.getClass();
                    if (v2qVar instanceof s2q) {
                        t7gVar = new ugl(((s2q) v2qVar).a);
                    } else {
                        if (!(v2qVar instanceof u2q)) {
                            if (!(v2qVar instanceof t2q)) {
                                b6e.s();
                            }
                            return Unit.a;
                        }
                        u2q u2qVar = (u2q) v2qVar;
                        t7gVar = new vgl(u2qVar.a, u2qVar.b.a, u2qVar.g);
                    }
                    int ordinal2 = h5qVar.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 == 1) {
                            xol xolVar = (xol) d18Var.c;
                            dxb B = asq.B((udp) d18Var.b, v2qVar);
                            xolVar.getClass();
                            wol wolVar = xolVar.e;
                            if (!t7gVar.equals(wolVar != null ? wolVar.a : null)) {
                                wol wolVar2 = xolVar.e;
                                if (wolVar2 != null) {
                                    if (Intrinsics.d(wolVar2.a.s(), xolVar.g) || wolVar2.a.equals(xolVar.f)) {
                                        wolVar2 = null;
                                    }
                                    if (wolVar2 != null) {
                                        t7g t7gVar2 = wolVar2.a;
                                        if (t7gVar2 instanceof ugl) {
                                            qdc qdcVar = (qdc) xolVar.a.a.b;
                                            mib mibVar = (mib) ((jyr) qdcVar.b).getValue();
                                            p3i p3iVar = new p3i(450);
                                            p3iVar.e("allowPreheatWithoutCrossfade", ((Boolean) ((sgl) qdcVar.c).a.a).booleanValue());
                                            LinkedHashMap a4 = p3iVar.a();
                                            LinkedHashMap linkedHashMap8 = new LinkedHashMap(tah.a(a4.size()));
                                            for (Map.Entry entry7 : a4.entrySet()) {
                                                linkedHashMap8.put(entry7.getKey(), ((t3i) entry7.getValue()).getValue());
                                            }
                                            mibVar.b("STREAM_IS_PLAYING_MISSED", linkedHashMap8);
                                        } else if (t7gVar2 instanceof vgl) {
                                            nnd nndVar = xolVar.a.a;
                                            vgl vglVar = (vgl) t7gVar2;
                                            String str3 = vglVar.c;
                                            String S = asq.S(vglVar.d);
                                            String uuid = xolVar.j.toString();
                                            uuid.getClass();
                                            nndVar.getClass();
                                            str3.getClass();
                                            qdc qdcVar2 = (qdc) nndVar.b;
                                            mib mibVar2 = (mib) ((jyr) qdcVar2.b).getValue();
                                            p3i p3iVar2 = new p3i(450);
                                            p3iVar2.e("allowPreheatWithoutCrossfade", ((Boolean) ((sgl) qdcVar2.c).a.a).booleanValue());
                                            new hzn(str3, S, uuid).d(p3iVar2);
                                            LinkedHashMap a5 = p3iVar2.a();
                                            LinkedHashMap linkedHashMap9 = new LinkedHashMap(tah.a(a5.size()));
                                            for (Map.Entry entry8 : a5.entrySet()) {
                                                linkedHashMap9.put(entry8.getKey(), ((t3i) entry8.getValue()).getValue());
                                            }
                                            mibVar2.b("TRACK_IS_PLAYING_MISSED2", linkedHashMap9);
                                        } else {
                                            b6e.s();
                                        }
                                    }
                                }
                                ynf ynfVar = xolVar.c;
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                ynfVar.getClass();
                                ynfVar.a = new wnf(null, null, null, null);
                                wnf wnfVar = ynfVar.a;
                                if (wnfVar == null) {
                                    ssg.a(3, "LaunchTrackMetricsHelper", "LaunchTrackMetrics not initialized", null);
                                } else if (wnfVar.a == null) {
                                    ynfVar.a = wnf.a(wnfVar, Long.valueOf(elapsedRealtime), null, null, null, 14);
                                }
                                xolVar.e = new wol(t7gVar, B, SystemClock.elapsedRealtime());
                                xolVar.f = null;
                                xolVar.b(t7gVar.s());
                                if (t7gVar instanceof ugl) {
                                    qdc qdcVar3 = (qdc) xolVar.a.a.b;
                                    mib mibVar3 = (mib) ((jyr) qdcVar3.b).getValue();
                                    p3i p3iVar3 = new p3i(450);
                                    p3iVar3.e("allowPreheatWithoutCrossfade", ((Boolean) ((sgl) qdcVar3.c).a.a).booleanValue());
                                    LinkedHashMap a6 = p3iVar3.a();
                                    LinkedHashMap linkedHashMap10 = new LinkedHashMap(tah.a(a6.size()));
                                    for (Map.Entry entry9 : a6.entrySet()) {
                                        linkedHashMap10.put(entry9.getKey(), ((t3i) entry9.getValue()).getValue());
                                    }
                                    mibVar3.b("WANT_PLAY_STREAM", linkedHashMap10);
                                } else if (t7gVar instanceof vgl) {
                                    xolVar.j = UUID.randomUUID();
                                    vgl vglVar2 = (vgl) t7gVar;
                                    x97.y(xolVar.d, null, null, new rfg(xolVar, vglVar2, vglVar2.c, B, null, 19), 3);
                                } else {
                                    b6e.s();
                                }
                            }
                        } else if (ordinal2 == 2) {
                            if (Intrinsics.d((t7g) d18Var.g, t7gVar) && ((h5q) d18Var.f) == h5q.d && z6 && !d18Var.a) {
                                xol xolVar2 = (xol) d18Var.c;
                                onh M0 = ((a7q) ((sfm) d18Var.d).c).a.M0();
                                pq4 x = M0 != null ? rzf.x(M0) : null;
                                long w = ((a7q) ((sfm) d18Var.d).c).a.w();
                                uzn uznVar = xolVar2.a;
                                if (t7gVar instanceof ugl) {
                                    qdc qdcVar4 = (qdc) uznVar.a.b;
                                    mib mibVar4 = (mib) ((jyr) qdcVar4.b).getValue();
                                    p3i p3iVar4 = new p3i(450);
                                    p3iVar4.e("allowPreheatWithoutCrossfade", ((Boolean) ((sgl) qdcVar4.c).a.a).booleanValue());
                                    LinkedHashMap a7 = p3iVar4.a();
                                    LinkedHashMap linkedHashMap11 = new LinkedHashMap(tah.a(a7.size()));
                                    for (Map.Entry entry10 : a7.entrySet()) {
                                        linkedHashMap11.put(entry10.getKey(), ((t3i) entry10.getValue()).getValue());
                                    }
                                    mibVar4.b("STREAM_IS_BUFFERING", linkedHashMap11);
                                } else if (t7gVar instanceof vgl) {
                                    if (x != null) {
                                        str = x.a.a;
                                    } else {
                                        x2i x2iVar = oq4.b;
                                        str = "unknown";
                                    }
                                    int i5 = x != null ? x.b : -1;
                                    nnd nndVar2 = uznVar.a;
                                    vgl vglVar3 = (vgl) t7gVar;
                                    String str4 = vglVar3.c;
                                    String S2 = asq.S(vglVar3.d);
                                    String uuid2 = xolVar2.j.toString();
                                    uuid2.getClass();
                                    uuid2.getClass();
                                    mj3 mj3Var = new mj3();
                                    mj3Var.d = uuid2;
                                    mj3Var.e = str;
                                    mj3Var.c = i5;
                                    mj3Var.b = w;
                                    mj3Var.a = w >= 2000;
                                    nndVar2.getClass();
                                    str4.getClass();
                                    qdc qdcVar5 = (qdc) nndVar2.b;
                                    mib mibVar5 = (mib) ((jyr) qdcVar5.b).getValue();
                                    p3i p3iVar5 = new p3i(450);
                                    p3iVar5.e("allowPreheatWithoutCrossfade", ((Boolean) ((sgl) qdcVar5.c).a.a).booleanValue());
                                    ((sgl) nndVar2.c).getClass();
                                    new hzn(str4, S2, mj3Var).d(p3iVar5);
                                    LinkedHashMap a8 = p3iVar5.a();
                                    LinkedHashMap linkedHashMap12 = new LinkedHashMap(tah.a(a8.size()));
                                    for (Map.Entry entry11 : a8.entrySet()) {
                                        linkedHashMap12.put(entry11.getKey(), ((t3i) entry11.getValue()).getValue());
                                    }
                                    mibVar5.b("TRACK_IS_BUFFERING2", linkedHashMap12);
                                } else {
                                    b6e.s();
                                }
                            }
                            d18Var.a = false;
                        } else if (ordinal2 == 3) {
                            xol xolVar3 = (xol) d18Var.c;
                            onh M02 = ((a7q) ((sfm) d18Var.d).c).a.M0();
                            pq4 x2 = M02 != null ? rzf.x(M02) : null;
                            xolVar3.getClass();
                            wol wolVar3 = xolVar3.e;
                            xolVar3.e = null;
                            if (xolVar3.f == null) {
                                if (t7gVar.equals(wolVar3 != null ? wolVar3.a : null)) {
                                    ynf ynfVar2 = xolVar3.c;
                                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                                    wnf wnfVar2 = ynfVar2.a;
                                    if (wnfVar2 == null) {
                                        ssg.a(3, "LaunchTrackMetricsHelper", "LaunchTrackMetrics not initialized", null);
                                    } else if (wnfVar2.d == null) {
                                        ynfVar2.a = wnf.a(wnfVar2, null, null, null, Long.valueOf(elapsedRealtime2), 7);
                                    }
                                    wnf wnfVar3 = xolVar3.c.a;
                                    if (wnfVar3 == null) {
                                        xnfVar = new xnf(0L, 0L, 0L);
                                    } else {
                                        Long r = xee.r(wnfVar3.b, wnfVar3.a);
                                        Long l = wnfVar3.b;
                                        Long l2 = wnfVar3.c;
                                        Long r2 = l != null ? xee.r(l2, l) : xee.r(l2, wnfVar3.a);
                                        Long r3 = xee.r(wnfVar3.d, wnfVar3.c);
                                        xnfVar = new xnf(r != null ? r.longValue() : 0L, r2 != null ? r2.longValue() : 0L, r3 != null ? r3.longValue() : 0L);
                                    }
                                    xnf xnfVar2 = xnfVar;
                                    xolVar3.c.a = null;
                                    long elapsedRealtime3 = SystemClock.elapsedRealtime() - wolVar3.c;
                                    if (t7gVar instanceof ugl) {
                                        qdc qdcVar6 = (qdc) xolVar3.a.a.b;
                                        mib mibVar6 = (mib) ((jyr) qdcVar6.b).getValue();
                                        p3i p3iVar6 = new p3i(450);
                                        p3iVar6.e("allowPreheatWithoutCrossfade", ((Boolean) ((sgl) qdcVar6.c).a.a).booleanValue());
                                        p3iVar6.c(Long.valueOf(elapsedRealtime3), "time");
                                        LinkedHashMap a9 = p3iVar6.a();
                                        LinkedHashMap linkedHashMap13 = new LinkedHashMap(tah.a(a9.size()));
                                        for (Map.Entry entry12 : a9.entrySet()) {
                                            linkedHashMap13.put(entry12.getKey(), ((t3i) entry12.getValue()).getValue());
                                        }
                                        mibVar6.b("STREAM_IS_PLAYING", linkedHashMap13);
                                    } else if (t7gVar instanceof vgl) {
                                        vgl vglVar4 = (vgl) t7gVar;
                                        xolVar3.f = vglVar4;
                                        x97.y(xolVar3.d, null, null, new d7e(xolVar3, vglVar4, elapsedRealtime3, x2, wolVar3, xnfVar2, null, 2), 3);
                                    } else {
                                        b6e.s();
                                    }
                                }
                            }
                        } else if (ordinal2 != 4) {
                            b6e.s();
                            return null;
                        }
                        return Unit.a;
                    }
                    d18Var.f = h5qVar;
                    d18Var.g = t7gVar;
                    return Unit.a;
                }
                return null;
            case 6:
                boolean z7 = this.k;
                yyb yybVar = (yyb) this.l;
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                int ordinal3 = yybVar.ordinal();
                if (ordinal3 != 0) {
                    if (ordinal3 != 1) {
                        b6e.s();
                        return null;
                    }
                    z = true;
                }
                boolean z8 = !v3g.E((frt) ((pqp) this.m).G().a.getValue()).f;
                jyr jyrVar = o5j.e;
                return new k53(z7, z, z8, !tyf.v());
            case 7:
                boolean z9 = this.k;
                tlv tlvVar = (tlv) this.l;
                nm6 nm6Var8 = nm6.a;
                qgg.h0(obj);
                xdr xdrVar2 = (xdr) ((eps) this.m).f;
                plv plvVar = olv.b;
                if (tlvVar instanceof slv) {
                    if (!z9) {
                        plvVar = a4g.B(((slv) tlvVar).b);
                    }
                    plv plvVar2 = plvVar;
                    slv slvVar = (slv) tlvVar;
                    plvVar2.getClass();
                    Bitmap bitmap2 = slvVar.a;
                    if (bitmap2 == null || bitmap2.getWidth() == 0 || bitmap2.getHeight() == 0) {
                        bitmap = null;
                    } else {
                        int width = (int) (bitmap2.getWidth() * 0.6f);
                        if (width < 1) {
                            width = 1;
                        }
                        int height = (int) (bitmap2.getHeight() * 0.6f);
                        if (height < 1) {
                            height = 1;
                        }
                        if (width != bitmap2.getWidth() || height != bitmap2.getHeight()) {
                            bitmap2 = Bitmap.createScaledBitmap(bitmap2, width, height, true);
                        }
                        bitmap = bitmap2;
                    }
                    uovVar = new vov(bitmap, slvVar.c, slvVar.d, slvVar.e, slvVar.f, plvVar2);
                } else {
                    if (!(tlvVar instanceof rlv)) {
                        b6e.s();
                        return null;
                    }
                    if (!z9) {
                        plvVar = a4g.B(((rlv) tlvVar).a);
                    }
                    plvVar.getClass();
                    uovVar = new uov(((rlv) tlvVar).b, plvVar);
                }
                xdrVar2.getClass();
                xdrVar2.m(null, uovVar);
                return Unit.a;
            default:
                iqw iqwVar = (iqw) this.l;
                boolean z10 = this.k;
                nm6 nm6Var9 = nm6.a;
                qgg.h0(obj);
                return z10 ? iqw.a : iqwVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ re7(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.j = i;
        this.m = obj;
    }
}
