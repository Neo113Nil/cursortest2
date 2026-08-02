package defpackage;

import com.yandex.music.shared.smart.downloading.data.network.CachedTrackIdDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class cmj {
    public final yyq a;
    public final z66 b;
    public final frt c;
    public final e6q d;
    public final raa e;
    public final fzq f;
    public final l0t g;
    public final q3t h;
    public final hzq i;
    public final mvu j;
    public final crt k;
    public final udp l;
    public syq m = new syq();

    public cmj(yyq yyqVar, z66 z66Var, frt frtVar, e6q e6qVar, raa raaVar, fzq fzqVar, l0t l0tVar, q3t q3tVar, hzq hzqVar, mvu mvuVar, crt crtVar, udp udpVar) {
        this.a = yyqVar;
        this.b = z66Var;
        this.c = frtVar;
        this.d = e6qVar;
        this.e = raaVar;
        this.f = fzqVar;
        this.g = l0tVar;
        this.h = q3tVar;
        this.i = hzqVar;
        this.j = mvuVar;
        this.k = crtVar;
        this.l = udpVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(cmj cmjVar, lvu lvuVar, int i, int i2, int i3, String str, cg6 cg6Var) {
        zlj zljVar;
        int i4;
        rj6 rj6Var;
        if (cg6Var instanceof zlj) {
            zljVar = (zlj) cg6Var;
            int i5 = zljVar.l;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                zljVar.l = i5 - Integer.MIN_VALUE;
                zlj zljVar2 = zljVar;
                Object obj = zljVar2.j;
                nm6 nm6Var = nm6.a;
                i4 = zljVar2.l;
                if (i4 != 0) {
                    qgg.h0(obj);
                    StringBuilder l = dfi.l("fetchTracksForSmartDownloading, started: allCachedTracks=", lvuVar.d, i, " storageSizeMb=", " occupiedMb=");
                    hrg.w(i2, i3, " totalDownloadedMb=", " quality=", l);
                    v3w.m(l, str, 3, "OfflineRecommenderSmartDownloadCenter", null);
                    cmjVar.m.d = true;
                    fzq fzqVar = cmjVar.f;
                    List list = lvuVar.a;
                    ArrayList arrayList = new ArrayList(v75.o(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(c((jja) it.next()));
                    }
                    List list2 = lvuVar.b;
                    ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(c((jja) it2.next()));
                    }
                    List list3 = lvuVar.c;
                    ArrayList arrayList3 = new ArrayList(v75.o(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(c((jja) it3.next()));
                    }
                    zljVar2.l = 1;
                    obj = fzqVar.a(arrayList, arrayList2, arrayList3, i, i2, i3, str, zljVar2);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i4 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    Object obj2 = ((qj6) rj6Var).a;
                    ssg.a(3, "OfflineRecommenderSmartDownloadCenter", "fetchTracksForSmartDownloading: " + obj2, null);
                    return (ozq) obj2;
                }
                if (!(rj6Var instanceof pj6)) {
                    b6e.s();
                    return null;
                }
                pj6 pj6Var = (pj6) rj6Var;
                ssg.a(6, "OfflineRecommenderSmartDownloadCenter", "fetchTracksForSmartDownloading: error=" + pj6Var.a().getMessage(), pj6Var.a());
                syq syqVar = cmjVar.m;
                syqVar.q = "backend error";
                syqVar.r = pj6Var.a().getMessage();
                return null;
            }
        }
        zljVar = new zlj(cmjVar, cg6Var);
        zlj zljVar22 = zljVar;
        Object obj3 = zljVar22.j;
        nm6 nm6Var2 = nm6.a;
        i4 = zljVar22.l;
        if (i4 != 0) {
        }
        rj6Var = (rj6) obj3;
        if (!(rj6Var instanceof qj6)) {
        }
    }

    public static CachedTrackIdDto c(jja jjaVar) {
        return new CachedTrackIdDto(jjaVar.a.a, Long.valueOf(jjaVar.b / 1000));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005b  */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [amj, cg6, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v3, types: [long] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(boolean z, Continuation continuation) {
        ?? r3;
        ?? r5;
        long j;
        long j2;
        String str;
        String str2;
        ryq ryqVar;
        String str3;
        Long l;
        try {
            try {
                if (continuation instanceof amj) {
                    amj amjVar = (amj) continuation;
                    int i = amjVar.m;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        amjVar.m = i - Integer.MIN_VALUE;
                        r3 = amjVar;
                        Object obj = r3.k;
                        nm6 nm6Var = nm6.a;
                        r5 = r3.m;
                        Continuation continuation2 = null;
                        if (r5 != 0) {
                            qgg.h0(obj);
                            j = 1000;
                            long currentTimeMillis = System.currentTimeMillis();
                            this.m = new syq();
                            try {
                                l = ((czq) dzq.h.getValue()).e;
                            } catch (CancellationException e) {
                                e = e;
                            } catch (Throwable th) {
                                th = th;
                                r5 = "OfflineRecommenderSmartDownloadCenter";
                            }
                            try {
                                if (l != null) {
                                    String str4 = "OfflineRecommenderSmartDownloadCenter";
                                    long longValue = l.longValue();
                                    z11 z11Var = new z11(this, z, continuation2, 11);
                                    r3.j = currentTimeMillis;
                                    r3.m = 1;
                                    obj = tyf.J(longValue, z11Var, r3);
                                    r5 = str4;
                                    if (obj != nm6Var) {
                                        j2 = currentTimeMillis;
                                        str = str4;
                                        ryqVar = (ryq) obj;
                                        str3 = str;
                                    }
                                } else {
                                    String str5 = "OfflineRecommenderSmartDownloadCenter";
                                    r3.j = currentTimeMillis;
                                    r3.m = 2;
                                    obj = x97.V(dm6.b, new bmj(this, z, null), r3);
                                    r5 = str5;
                                    if (obj != nm6Var) {
                                        j2 = currentTimeMillis;
                                        str2 = str5;
                                        ryqVar = (ryq) obj;
                                        str3 = str2;
                                    }
                                }
                                return nm6Var;
                            } catch (CancellationException e2) {
                                e = e2;
                                this.m.q = "Download cancelled";
                                throw e;
                            } catch (Throwable th2) {
                                th = th2;
                                r3 = currentTimeMillis;
                                this.m.s = (System.currentTimeMillis() - r3) / j;
                                ssg.a(3, r5, dfi.e(this.m.s, "performSmartDownloading: execution time ", " sec"), null);
                                throw th;
                            }
                        }
                        try {
                            if (r5 == 1) {
                                j2 = r3.j;
                                qgg.h0(obj);
                                str = "OfflineRecommenderSmartDownloadCenter";
                                j = 1000;
                                ryqVar = (ryq) obj;
                                str3 = str;
                            } else {
                                if (r5 != 2) {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                j2 = r3.j;
                                qgg.h0(obj);
                                str2 = "OfflineRecommenderSmartDownloadCenter";
                                j = 1000;
                                ryqVar = (ryq) obj;
                                str3 = str2;
                            }
                        } catch (CancellationException e3) {
                            e = e3;
                            this.m.q = "Download cancelled";
                            throw e;
                        } catch (Throwable th3) {
                            th = th3;
                            r5 = "OfflineRecommenderSmartDownloadCenter";
                            j = 1000;
                            this.m.s = (System.currentTimeMillis() - r3) / j;
                            ssg.a(3, r5, dfi.e(this.m.s, "performSmartDownloading: execution time ", " sec"), null);
                            throw th;
                        }
                        this.m.s = (System.currentTimeMillis() - j2) / j;
                        ssg.a(3, str3, dfi.e(this.m.s, "performSmartDownloading: execution time ", " sec"), null);
                        return ryqVar;
                    }
                }
                if (r5 != 0) {
                }
                this.m.s = (System.currentTimeMillis() - j2) / j;
                ssg.a(3, str3, dfi.e(this.m.s, "performSmartDownloading: execution time ", " sec"), null);
                return ryqVar;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (CancellationException e4) {
            e = e4;
        }
        r3 = new amj(this, (cg6) continuation);
        Object obj2 = r3.k;
        nm6 nm6Var2 = nm6.a;
        r5 = r3.m;
        Continuation continuation22 = null;
    }
}
