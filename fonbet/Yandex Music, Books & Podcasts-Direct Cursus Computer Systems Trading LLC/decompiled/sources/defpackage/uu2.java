package defpackage;

import android.os.SystemClock;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.player.PlaybackException;
import timber.log.Timber;

/* loaded from: classes.dex */
public abstract class uu2 extends v8w {
    public final nsh m;
    public final ngl n;
    public String o;
    public boolean p;
    public final HashMap q;
    public final HashMap r;
    public final mvt s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu2(bz2 bz2Var, ogg oggVar, d97 d97Var, kkp kkpVar, int i, int[] iArr, zsb zsbVar, int i2, db7 db7Var, long j, boolean z, ArrayList arrayList, pcl pclVar, nsh nshVar, aw6 aw6Var, ngl nglVar, ndl ndlVar) {
        super(bz2Var, oggVar, d97Var, kkpVar, i, iArr, zsbVar, i2, db7Var, j, z, arrayList, pclVar);
        oggVar.getClass();
        d97Var.getClass();
        kkpVar.getClass();
        ndlVar.getClass();
        this.m = nshVar;
        this.n = nglVar;
        this.p = true;
        this.q = new HashMap();
        this.r = new HashMap();
        this.s = new mvt(19);
        int size = d97Var.m.size();
        for (int i3 = 0; i3 < size; i3++) {
            pkk b = d97Var.b(i3);
            b.getClass();
            HashMap hashMap = this.q;
            String str = b.a;
            List list = b.c;
            hashMap.put(str, Integer.valueOf(list.size()));
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    u75.n();
                    throw null;
                }
                HashMap hashMap2 = this.r;
                StringBuilder sb = new StringBuilder();
                sb.append(i3);
                sb.append('.');
                sb.append(i4);
                hashMap2.put(sb.toString(), Integer.valueOf(((nj) obj).c.size()));
                i4 = i5;
            }
        }
    }

    @Override // defpackage.xk4
    public final void d(sk4 sk4Var) {
        sk4Var.getClass();
        long j = sk4Var.h;
        if (!this.p) {
            this.p = true;
            ngl nglVar = this.n;
            nglVar.getClass();
            StringBuilder sb = new StringBuilder("first chunk with new base url loaded trackType=");
            int i = this.c;
            sb.append(i);
            sb.append(" baseUrl=");
            sb.append(this.o);
            sb.append(" isInitialChunk=");
            boolean z = sk4Var instanceof hme;
            sb.append(z);
            nglVar.H("BaseUrlStrategy", "onChunkLoadCompleted", sb.toString(), new Object[0]);
            nglVar.H("BaseYandexDashChunkSource", "onChunkLoadCompleted", "first chunk with new base url loaded", "trackType=" + i, "baseUrl=" + this.o, "isInitialChunk=" + z);
        }
        if (sk4Var instanceof hme) {
            int o = this.h.o(((hme) sk4Var).d);
            uk7[] uk7VarArr = this.g;
            uk7 uk7Var = uk7VarArr[o];
            if (((o97) uk7Var.e) == null) {
                xk3 xk3Var = (xk3) uk7Var.b;
                vq1.B(xk3Var);
                tk4 a = xk3Var.a();
                if (a != null) {
                    a0o a0oVar = (a0o) uk7Var.c;
                    uk7VarArr[o] = new uk7(uk7Var.f, a0oVar, (mu2) uk7Var.d, (xk3) uk7Var.b, uk7Var.g, new au1(a, a0oVar.c, 3), 1);
                }
            }
        }
        pcl pclVar = this.f;
        if (pclVar != null) {
            long j2 = pclVar.d;
            if (j2 == -9223372036854775807L || j > j2) {
                pclVar.d = j;
            }
            pclVar.e.g = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00cb  */
    @Override // defpackage.xk4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(sk4 sk4Var, boolean z, j4x j4xVar, xeg xegVar) {
        nsh nshVar;
        uk7 uk7Var;
        nsh nshVar2;
        String b;
        int length;
        int i;
        weg wegVar;
        mdr L;
        boolean z2;
        IOException iOException = (IOException) j4xVar.c;
        sk4Var.getClass();
        dsc dscVar = sk4Var.d;
        xegVar.getClass();
        ngl nglVar = this.n;
        nglVar.getClass();
        int i2 = this.c;
        nsh nshVar3 = this.m;
        nglVar.H("BaseYandexDashChunkSource", "onChunkLoadError", "decide to recall media chunk", "possibleToUseOtherBaseUrl=" + ((nshVar3 != null ? nshVar3.k(i2).f() : 0) > 0));
        if (!z) {
            return false;
        }
        pcl pclVar = this.f;
        if (pclVar == null || !pclVar.f(sk4Var)) {
            i6e i6eVar = iOException instanceof i6e ? (i6e) iOException : null;
            boolean z3 = i6eVar != null && i6eVar.d == 404;
            boolean z4 = this.i.d;
            uk7[] uk7VarArr = this.g;
            if (!z4 && (sk4Var instanceof dih) && z3) {
                uk7 uk7Var2 = uk7VarArr[this.h.o(dscVar)];
                long f = uk7Var2.f();
                if (f != -1 && f != 0) {
                    o97 o97Var = (o97) uk7Var2.e;
                    vq1.B(o97Var);
                    nshVar = nshVar3;
                    if (((dih) sk4Var).b() > ((o97Var.H() + uk7Var2.g) + f) - 1) {
                        this.l = true;
                        return true;
                    }
                    uk7Var = uk7VarArr[this.h.o(dscVar)];
                    nshVar2 = nshVar;
                    b = nshVar == null ? nshVar2.k(i2).b() : null;
                    if (b != null || Intrinsics.d(((mu2) uk7Var.d).a, b)) {
                        zsb zsbVar = this.h;
                        yde ydeVar = ((a0o) uk7Var.c).b;
                        ydeVar.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        length = zsbVar.length();
                        int i3 = 0;
                        for (i = 0; i < length; i++) {
                            if (zsbVar.a(i, elapsedRealtime)) {
                                i3++;
                            }
                        }
                        int size = ydeVar.size();
                        wegVar = new weg(size, size - (nshVar2 == null ? nshVar2.k(i2).f() : 0), length, i3);
                        if (wegVar.a(2) && !wegVar.a(1)) {
                            Timber.INSTANCE.tag("BaseUrlStrategy").e("fallback is unavailable", new Object[0]);
                            return false;
                        }
                        L = xegVar.L(wegVar, j4xVar);
                        if (L != null) {
                            int i4 = L.a;
                            if (wegVar.a(i4)) {
                                if (i4 == 2) {
                                    Timber.INSTANCE.tag("BaseUrlStrategy").e("FALLBACK_TYPE_TRACK", new Object[0]);
                                    zsb zsbVar2 = this.h;
                                    z2 = zsbVar2.h(zsbVar2.o(dscVar), L.b);
                                } else {
                                    if (i4 == 1) {
                                        Timber.INSTANCE.tag("BaseUrlStrategy").e("FALLBACK_TYPE_LOCATION", new Object[0]);
                                        i6e i6eVar2 = iOException instanceof i6e ? (i6e) iOException : null;
                                        Integer valueOf = i6eVar2 != null ? Integer.valueOf(i6eVar2.d) : null;
                                        if (nshVar2 != null && ((valueOf == null || valueOf.intValue() != 401) && ((valueOf == null || valueOf.intValue() != 403) && (valueOf == null || valueOf.intValue() != 451)))) {
                                            z2 = nshVar2.k(i2).e();
                                        }
                                    }
                                    z2 = false;
                                }
                                Timber.INSTANCE.tag("BaseUrlStrategy").e(vz1.q("AfterAll cancelLoad=", ". If true - it will be try to reload with other base url", z2), new Object[0]);
                                return z2;
                            }
                        }
                        Timber.INSTANCE.tag("BaseUrlStrategy").e("Policy indicated to not use any fallback or a fallback type that is not available.", new Object[0]);
                        return false;
                    }
                }
            }
            nshVar = nshVar3;
            uk7Var = uk7VarArr[this.h.o(dscVar)];
            nshVar2 = nshVar;
            if (nshVar == null) {
            }
            if (b != null) {
            }
            zsb zsbVar3 = this.h;
            yde ydeVar2 = ((a0o) uk7Var.c).b;
            ydeVar2.getClass();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            length = zsbVar3.length();
            int i32 = 0;
            while (i < length) {
            }
            int size2 = ydeVar2.size();
            wegVar = new weg(size2, size2 - (nshVar2 == null ? nshVar2.k(i2).f() : 0), length, i32);
            if (wegVar.a(2)) {
            }
            L = xegVar.L(wegVar, j4xVar);
            if (L != null) {
            }
            Timber.INSTANCE.tag("BaseUrlStrategy").e("Policy indicated to not use any fallback or a fallback type that is not available.", new Object[0]);
            return false;
        }
        return true;
    }

    @Override // defpackage.c97
    public final void h(d97 d97Var, int i) {
        ArrayList arrayList;
        nsh nshVar;
        List list;
        a0o a0oVar;
        yde ydeVar;
        d97Var.getClass();
        Timber.INSTANCE.tag("BaseUrlStrategy").d("updateManifest callback", new Object[0]);
        List list2 = d97Var.m;
        if (list2.size() > 0) {
            pkk b = d97Var.b(0);
            b.getClass();
            List list3 = b.c;
            list3.getClass();
            nj njVar = (nj) CollectionsKt.firstOrNull(list3);
            if (njVar == null || (list = njVar.c) == null || (a0oVar = (a0o) CollectionsKt.firstOrNull(list)) == null || (ydeVar = a0oVar.b) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(v75.o(ydeVar, 10));
                Iterator<E> it = ydeVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(((mu2) it.next()).a);
                }
            }
            if (arrayList != null && (nshVar = this.m) != null) {
                nshVar.k(this.c).d(arrayList);
            }
        }
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            pkk b2 = d97Var.b(i2);
            b2.getClass();
            String str = b2.a;
            int size2 = d97Var.b(i2).c.size();
            HashMap hashMap = this.q;
            Integer num = (Integer) hashMap.get(str);
            hashMap.put(str, Integer.valueOf(size2));
            if (num != null && num.intValue() != size2) {
                Timber.INSTANCE.e("adaptation sets count changed!", new Object[0]);
                b6e.q(new PlaybackException.AdaptationSetsCountChanged(String.format("Previous count %d. New count %d", Arrays.copyOf(new Object[]{num, Integer.valueOf(size2)}, 2))));
                return;
            }
            List list4 = b2.c;
            list4.getClass();
            int i3 = 0;
            for (Object obj : list4) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    u75.n();
                    throw null;
                }
                nj njVar2 = (nj) obj;
                StringBuilder sb = new StringBuilder();
                sb.append(i2);
                sb.append('.');
                sb.append(i3);
                String sb2 = sb.toString();
                HashMap hashMap2 = this.r;
                Integer num2 = (Integer) hashMap2.get(sb2);
                int size3 = njVar2.c.size();
                hashMap2.put(sb2, Integer.valueOf(size3));
                if (num2 != null && num2.intValue() != size3) {
                    Timber.INSTANCE.e("representations count changed in adaptationSet " + njVar2, new Object[0]);
                    b6e.q(new PlaybackException.RepresentationCountChanged(String.format(dfi.c(i3, "Adaptation ", ": Previous representation count %d. New count %d"), Arrays.copyOf(new Object[]{num2, Integer.valueOf(size3)}, 2))));
                    return;
                }
                i3 = i4;
            }
        }
        uk7[] uk7VarArr = this.g;
        try {
            this.i = d97Var;
            this.j = i;
            long d = d97Var.d(i);
            ArrayList k = k();
            for (int i5 = 0; i5 < uk7VarArr.length; i5++) {
                uk7VarArr[i5] = uk7VarArr[i5].c(d, (a0o) k.get(this.h.f(i5)));
            }
        } catch (yy2 unused) {
            this.k = new yy2();
        }
    }

    public final nb7 l(a0o a0oVar, String str, whn whnVar, int i) {
        a0oVar.getClass();
        str.getClass();
        whnVar.getClass();
        nb7 I = vwb.I(a0oVar, str, whnVar, i);
        this.s.getClass();
        return I;
    }

    public final uk7 m(int i) {
        uk7[] uk7VarArr = this.g;
        uk7 uk7Var = uk7VarArr[i];
        nsh nshVar = this.m;
        String b = nshVar != null ? nshVar.k(this.c).b() : null;
        if (b != null && !b.equals(((mu2) uk7Var.d).a)) {
            Timber.INSTANCE.tag("BaseUrlStrategy").d(vz1.s(new StringBuilder("updateSelectedBaseUrl from "), ((mu2) uk7Var.d).a, " to ", b), new Object[0]);
            uk7 uk7Var2 = new uk7(uk7Var.f, (a0o) uk7Var.c, new mu2(Integer.MIN_VALUE, 1, b, b), (xk3) uk7Var.b, uk7Var.g, (o97) uk7Var.e, 1);
            uk7VarArr[i] = uk7Var2;
            this.o = b;
            uk7Var = uk7Var2;
        }
        uk7Var.getClass();
        return uk7Var;
    }
}
