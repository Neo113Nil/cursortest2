package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class pt7 {
    public final jyr a;
    public final jyr b;

    public pt7(jyr jyrVar, jyr jyrVar2, int i) {
        switch (i) {
            case 1:
                this.a = jyrVar;
                this.b = jyrVar2;
                break;
            default:
                this.a = jyrVar2;
                this.b = jyrVar;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(jzs jzsVar, boolean z, cg6 cg6Var) {
        ot7 ot7Var;
        int i;
        d6l d6lVar;
        long j;
        n7q n7qVar;
        tvk tvkVar;
        nsa nsaVar;
        if (cg6Var instanceof ot7) {
            ot7Var = (ot7) cg6Var;
            int i2 = ot7Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ot7Var.m = i2 - Integer.MIN_VALUE;
                Object obj = ot7Var.k;
                nm6 nm6Var = nm6.a;
                i = ot7Var.m;
                jyr jyrVar = this.a;
                if (i != 0) {
                    qgg.h0(obj);
                    jyr jyrVar2 = this.b;
                    d6l x = p6g.x((e6l) ((oq7) jyrVar2.getValue()).a.c.getValue());
                    if (!Intrinsics.d((x == null || (n7qVar = x.a) == null) ? null : n7qVar.b(), jzsVar)) {
                        ssg.a(5, "WavePlayTimeProviderImpl", "Current playable is not the same as the one that is tracked. Reporting playing time 0", null);
                        return new Long(0L);
                    }
                    if (z) {
                        j = jzsVar.a.e;
                        ssg.a(4, "WavePlayTimeProviderImpl", dfi.d(j, "Calling playedTo with "), null);
                        muu muuVar = (muu) jyrVar.getValue();
                        msa msaVar = nsa.b;
                        ((yuk) muuVar.a).b(yd5.N(j, ssa.MILLISECONDS), "wave");
                        tvkVar = ((yuk) ((muu) jyrVar.getValue()).a).g;
                        if (tvkVar.r == svk.a || tvkVar.e == null) {
                            nsaVar = null;
                        } else {
                            if (((Boolean) tvkVar.c().a.c.invoke()).booleanValue()) {
                                tvkVar.s = true;
                                try {
                                    tvkVar.a();
                                } finally {
                                    tvkVar.s = false;
                                }
                            }
                            nsaVar = new nsa(tvkVar.j);
                        }
                        if (nsaVar == null) {
                            j = nsa.f(nsaVar.a);
                        } else {
                            ssg.a(5, "WavePlayTimeProviderImpl", "Current total played from play-audio module is null", null);
                        }
                        return new Long(j);
                    }
                    uol uolVar = ((oq7) jyrVar2.getValue()).c;
                    ot7Var.j = x;
                    ot7Var.m = 1;
                    obj = uolVar.f(ot7Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    d6lVar = x;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    d6lVar = ot7Var.j;
                    qgg.h0(obj);
                }
                long longValue = ((Number) obj).longValue();
                if (d6lVar.c == v0l.d) {
                    ssg.a(4, "WavePlayTimeProviderImpl", dfi.d(longValue, "Calling playedTo with "), null);
                    muu muuVar2 = (muu) jyrVar.getValue();
                    msa msaVar2 = nsa.b;
                    ((yuk) muuVar2.a).b(yd5.N(longValue, ssa.MILLISECONDS), "wave");
                }
                j = longValue;
                tvkVar = ((yuk) ((muu) jyrVar.getValue()).a).g;
                if (tvkVar.r == svk.a) {
                    if (((Boolean) tvkVar.c().a.c.invoke()).booleanValue()) {
                    }
                    nsaVar = new nsa(tvkVar.j);
                    if (nsaVar == null) {
                    }
                    return new Long(j);
                }
                nsaVar = null;
                if (nsaVar == null) {
                }
                return new Long(j);
            }
        }
        ot7Var = new ot7(this, cg6Var);
        Object obj2 = ot7Var.k;
        nm6 nm6Var2 = nm6.a;
        i = ot7Var.m;
        jyr jyrVar3 = this.a;
        if (i != 0) {
        }
        long longValue2 = ((Number) obj2).longValue();
        if (d6lVar.c == v0l.d) {
        }
        j = longValue2;
        tvkVar = ((yuk) ((muu) jyrVar3.getValue()).a).g;
        if (tvkVar.r == svk.a) {
        }
        nsaVar = null;
        if (nsaVar == null) {
        }
        return new Long(j);
    }

    public void b(ArrayList arrayList) {
        f2q f2qVar = (f2q) this.a.getValue();
        int a = tah.a(v75.o(arrayList, 10));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (Object obj : arrayList) {
            linkedHashMap.put(obj, j1g.a);
        }
        f2qVar.getClass();
        mu muVar = f2qVar.a.b;
        muVar.getClass();
        ssg.a(4, "AlbumLikesCenter", "Updating album likes", null);
        muVar.f.d(mu.i[0], x97.y(muVar.a, null, null, new ku(muVar, linkedHashMap, null, 0), 3));
    }

    public void c(Collection collection, Collection collection2) {
        collection.getClass();
        collection2.getClass();
        f2q f2qVar = (f2q) this.a.getValue();
        Collection collection3 = collection;
        int a = tah.a(v75.o(collection3, 10));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (Object obj : collection3) {
            linkedHashMap.put(obj, j1g.a);
        }
        Collection collection4 = collection2;
        int a2 = tah.a(v75.o(collection4, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(a2 >= 16 ? a2 : 16);
        for (Object obj2 : collection4) {
            linkedHashMap2.put(obj2, j1g.c);
        }
        LinkedHashMap i = uah.i(linkedHashMap, linkedHashMap2);
        f2qVar.getClass();
        mc1 mc1Var = f2qVar.a.c;
        mc1Var.getClass();
        ssg.a(4, "ArtistLikesCenter", "Updating artist likes", null);
        mc1Var.f.d(mc1.i[0], x97.y(mc1Var.a, null, null, new ku(mc1Var, i, null, 1), 3));
    }

    public void d(ArrayList arrayList) {
        f2q f2qVar = (f2q) this.a.getValue();
        int a = tah.a(v75.o(arrayList, 10));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (Object obj : arrayList) {
            linkedHashMap.put(obj, j1g.a);
        }
        f2qVar.getClass();
        bwl bwlVar = f2qVar.a.d;
        bwlVar.getClass();
        ssg.a(4, "PlaylistLikesCenter", "Updating playlist likes", null);
        bwlVar.f.d(bwl.i[0], x97.y(bwlVar.a, null, null, new ku(bwlVar, linkedHashMap, null, 5), 3));
    }

    public void e(Collection collection, Collection collection2) {
        collection.getClass();
        collection2.getClass();
        f2q f2qVar = (f2q) this.a.getValue();
        Collection collection3 = collection;
        int a = tah.a(v75.o(collection3, 10));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (Object obj : collection3) {
            linkedHashMap.put(obj, j1g.a);
        }
        Collection collection4 = collection2;
        int a2 = tah.a(v75.o(collection4, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(a2 >= 16 ? a2 : 16);
        for (Object obj2 : collection4) {
            linkedHashMap2.put(obj2, j1g.c);
        }
        LinkedHashMap i = uah.i(linkedHashMap, linkedHashMap2);
        f2qVar.getClass();
        kxs kxsVar = f2qVar.a.a;
        kxsVar.getClass();
        ssg.a(4, "TrackLikesCenter", "Updating track likes", null);
        kxsVar.h.d(kxs.m[0], x97.y(kxsVar.a, null, null, new ku(kxsVar, i, null, 6), 3));
    }

    public Unit f(ArrayList arrayList) {
        f2q f2qVar = (f2q) this.a.getValue();
        int a = tah.a(v75.o(arrayList, 10));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(((r4u) it.next()).a, j1g.a);
        }
        f2qVar.getClass();
        c5u c5uVar = f2qVar.a.e;
        c5uVar.getClass();
        ssg.a(4, "VideoClipLikesCenter", "Updating video clip likes", null);
        c5uVar.f.d(c5u.i[0], x97.y(c5uVar.a, null, null, new ku(c5uVar, linkedHashMap, null, 7), 3));
        return Unit.a;
    }
}
