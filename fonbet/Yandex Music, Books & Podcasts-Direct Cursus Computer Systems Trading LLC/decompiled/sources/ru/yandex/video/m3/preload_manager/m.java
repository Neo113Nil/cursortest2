package ru.yandex.video.m3.preload_manager;

import android.net.Uri;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import defpackage.avs;
import defpackage.b6e;
import defpackage.c5b;
import defpackage.dsc;
import defpackage.f4t;
import defpackage.hsb;
import defpackage.iba;
import defpackage.ika;
import defpackage.kjr;
import defpackage.kka;
import defpackage.men;
import defpackage.mlr;
import defpackage.nnm;
import defpackage.p1g;
import defpackage.p6g;
import defpackage.su4;
import defpackage.t75;
import defpackage.u75;
import defpackage.v75;
import defpackage.wk8;
import defpackage.xiu;
import defpackage.xz0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.video.m3.player.tracks.TrackType;
import ru.yandex.video.m3.preload_manager.PreloadException;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class m {
    public final List a;
    public final nnm b;
    public final xiu c;
    public final ExecutorService d;
    public final long e;
    public List f;
    public volatile boolean g;

    public m(List list, nnm nnmVar, xiu xiuVar, ExecutorService executorService, long j) {
        xiuVar.getClass();
        this.a = list;
        this.b = nnmVar;
        this.c = xiuVar;
        this.d = executorService;
        this.e = j;
        this.f = c5b.a;
    }

    public static String b(List list) {
        if (list.size() > 1) {
            return "both";
        }
        if (list.isEmpty()) {
            return "no";
        }
        Object Q = CollectionsKt.Q(list);
        hsb hsbVar = Q instanceof hsb ? (hsb) Q : null;
        TrackType trackType = hsbVar != null ? hsbVar.a : null;
        int i = trackType == null ? -1 : f4t.a[trackType.ordinal()];
        if (i == -1) {
            return "unknown";
        }
        if (i == 1) {
            return CameraProperty.AUDIO;
        }
        if (i == 2) {
            return "video";
        }
        if (i == 3 || i == 4) {
            return "unknown";
        }
        b6e.s();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:183:0x011e, code lost:
    
        if (r7.equals("both") != false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0181 A[EDGE_INSN: B:50:0x0181->B:51:0x0181 BREAK  A[LOOP:1: B:39:0x0167->B:47:0x017c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020f A[LOOP:3: B:75:0x0209->B:77:0x020f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0222 A[LOOP:4: B:80:0x0220->B:81:0x0222, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022e A[Catch: all -> 0x025f, TryCatch #1 {all -> 0x025f, blocks: (B:83:0x0227, B:85:0x022e, B:87:0x0238, B:88:0x0243, B:90:0x0249, B:95:0x0262, B:99:0x026d, B:101:0x0273, B:92:0x025c, B:107:0x0276, B:108:0x0293), top: B:82:0x0227 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List a() {
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        int size;
        int[] iArr;
        int i;
        int i2;
        List list;
        Integer num;
        Iterator it;
        int size2;
        int i3;
        Integer num2;
        int size3;
        int i4;
        List<hsb> list2 = this.a;
        nnm nnmVar = this.b;
        try {
            List<hsb> list3 = list2;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                for (hsb hsbVar : list3) {
                    if (hsbVar == null) {
                        hsbVar = null;
                    }
                    if (hsbVar != null && hsbVar.d) {
                        break;
                    }
                }
            }
            nnmVar.b.getClass();
            wk8 wk8Var = new wk8(nnmVar.b.a.intValue(), this, 8);
            int i5 = wk8Var.s;
            nnm nnmVar2 = ((m) wk8Var.t).b;
            int i6 = nnmVar2.e;
            String str = nnmVar2.d;
            nnmVar2.b.getClass();
            kka kkaVar = new kka(-9223372036854775807L, str, i5, i6);
            String str2 = nnmVar.k;
            String K = list2.size() == 1 ? mlr.K(40, StringsKt.Y(p6g.r((hsb) CollectionsKt.Q(list2)), "Format=")) : "";
            xiu xiuVar = this.c;
            String X = CollectionsKt.X(u75.h(K, str2), null, null, null, null, 63);
            Uri parse = Uri.parse(str2);
            ArrayList arrayList = new ArrayList();
            for (hsb hsbVar2 : list2) {
                if (hsbVar2 == null) {
                    hsbVar2 = null;
                }
                kjr kjrVar = hsbVar2 != null ? hsbVar2.b : null;
                if (kjrVar != null) {
                    arrayList.add(kjrVar);
                }
            }
            ika j = xiuVar.j(new iba(X, parse, arrayList), kkaVar);
            String b = b(list2);
            int hashCode = b.hashCode();
            if (hashCode != 3029889) {
                try {
                    if (hashCode != 93166550) {
                        if (hashCode == 112202875) {
                            if (!b.equals("video")) {
                            }
                            Object Q = CollectionsKt.Q(list2);
                            hsb hsbVar3 = Q instanceof hsb ? (hsb) Q : null;
                            dsc dscVar = hsbVar3 != null ? hsbVar3.c : null;
                            if (dscVar != null) {
                                valueOf = Integer.valueOf(dscVar.u);
                                valueOf2 = Integer.valueOf(dscVar.v);
                                valueOf3 = Integer.valueOf(dscVar.j);
                                List c = t75.c(new avs(K, b(list2), j, p1g.g(valueOf, valueOf2, valueOf3)));
                                nnmVar.b.getClass();
                                size = list2.size();
                                iArr = new int[size];
                                i = 0;
                                while (true) {
                                    i2 = -1;
                                    if (i >= size) {
                                        break;
                                    }
                                    Object obj = list2.get(i);
                                    hsb hsbVar4 = obj instanceof hsb ? (hsb) obj : null;
                                    if (hsbVar4 != null) {
                                        i2 = hsbVar4.c.j;
                                    }
                                    iArr[i] = i2;
                                    i++;
                                }
                                if (xz0.t(iArr, -1)) {
                                    Timber.INSTANCE.w("impossible to calculate size limits", new Object[0]);
                                    list = c5b.a;
                                } else {
                                    int S = xz0.S(iArr);
                                    ArrayList arrayList2 = new ArrayList(size);
                                    for (int i7 = 0; i7 < size; i7++) {
                                        arrayList2.add(Long.valueOf((long) (((iArr[i7] * 1.0d) / S) * 5242880)));
                                    }
                                    list = arrayList2;
                                }
                                num = null;
                                List list4 = c;
                                int i8 = 0;
                                for (Object obj2 : list4) {
                                    int i9 = i8 + 1;
                                    if (i8 < 0) {
                                        u75.n();
                                        throw null;
                                    }
                                    ((avs) obj2).l = ((Number) ((i8 < 0 || i8 >= list.size()) ? Long.valueOf(5242880 / c.size()) : list.get(i8))).longValue();
                                    i8 = i9;
                                }
                                this.f = c;
                                ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(this.d);
                                it = list4.iterator();
                                while (it.hasNext()) {
                                    executorCompletionService.submit((avs) it.next());
                                }
                                size2 = c.size();
                                DownloadResult[] downloadResultArr = new DownloadResult[size2];
                                for (i3 = 0; i3 < size2; i3++) {
                                    downloadResultArr[i3] = null;
                                }
                                size3 = c.size();
                                for (i4 = 0; i4 < size3; i4++) {
                                    Future poll = executorCompletionService.poll(this.e, TimeUnit.SECONDS);
                                    if (poll == null) {
                                        throw new PreloadException.TracksDownloadTimeout("Track preload is not complete in " + this.e + " seconds");
                                    }
                                    DownloadResult downloadResult = (DownloadResult) poll.get();
                                    Iterator it2 = c.iterator();
                                    int i10 = 0;
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            i10 = -1;
                                            break;
                                        }
                                        if (Intrinsics.d(((avs) it2.next()).h, downloadResult.getDownloadId())) {
                                            break;
                                        }
                                        i10++;
                                    }
                                    Integer valueOf4 = Integer.valueOf(i10);
                                    if (i10 < 0) {
                                        valueOf4 = null;
                                    }
                                    if (valueOf4 != null) {
                                        downloadResultArr[valueOf4.intValue()] = downloadResult;
                                    }
                                }
                                List w = xz0.w(downloadResultArr);
                                Timber.INSTANCE.i("download results=" + w, new Object[0]);
                                return w;
                            }
                        }
                    } else if (b.equals(CameraProperty.AUDIO)) {
                        Object Q2 = CollectionsKt.Q(list2);
                        hsb hsbVar5 = Q2 instanceof hsb ? (hsb) Q2 : null;
                        dsc dscVar2 = hsbVar5 != null ? hsbVar5.c : null;
                        if (dscVar2 != null) {
                            valueOf3 = Integer.valueOf(dscVar2.j);
                            valueOf = null;
                            valueOf2 = null;
                            List c2 = t75.c(new avs(K, b(list2), j, p1g.g(valueOf, valueOf2, valueOf3)));
                            nnmVar.b.getClass();
                            size = list2.size();
                            iArr = new int[size];
                            i = 0;
                            while (true) {
                                i2 = -1;
                                if (i >= size) {
                                }
                                iArr[i] = i2;
                                i++;
                            }
                            if (xz0.t(iArr, -1)) {
                            }
                            num = null;
                            List list42 = c2;
                            int i82 = 0;
                            while (r4.hasNext()) {
                            }
                            this.f = c2;
                            ExecutorCompletionService executorCompletionService2 = new ExecutorCompletionService(this.d);
                            it = list42.iterator();
                            while (it.hasNext()) {
                            }
                            size2 = c2.size();
                            DownloadResult[] downloadResultArr2 = new DownloadResult[size2];
                            while (i3 < size2) {
                            }
                            size3 = c2.size();
                            while (i4 < size3) {
                            }
                            List w2 = xz0.w(downloadResultArr2);
                            Timber.INSTANCE.i("download results=" + w2, new Object[0]);
                            return w2;
                        }
                    }
                    size3 = c2.size();
                    while (i4 < size3) {
                    }
                    List w22 = xz0.w(downloadResultArr2);
                    Timber.INSTANCE.i("download results=" + w22, new Object[0]);
                    return w22;
                } catch (Throwable th) {
                    if (!this.g && !this.d.isShutdown()) {
                        Iterator it3 = this.f.iterator();
                        while (it3.hasNext()) {
                            ((avs) it3.next()).cancel(true);
                        }
                        PreloadException preloadException = th instanceof PreloadException ? th : null;
                        if (preloadException == null) {
                            throw new PreloadException.TracksDownloadError(su4.p(th, new StringBuilder("Downloader failed to download the request with exception ")), th);
                        }
                        throw preloadException;
                    }
                    List<avs> list5 = this.f;
                    ArrayList arrayList3 = new ArrayList(v75.o(list5, 10));
                    for (avs avsVar : list5) {
                        if (!avsVar.g) {
                            avsVar.cancel(true);
                        }
                        avsVar.c();
                        DownloadResult downloadResult2 = avsVar.m;
                        if (downloadResult2 == null) {
                            String str3 = avsVar.h;
                            String str4 = avsVar.i;
                            num2 = num;
                            downloadResult2 = men.l(str3, str4, 0L, p1g.g(num2, num2, num2), false, true);
                        } else {
                            num2 = num;
                        }
                        arrayList3.add(downloadResult2);
                        num = num2;
                    }
                    throw new PreloadException.CanceledOperationException.CanceledTracksDownload(this.d.isShutdown() ? "Tracks downloading was canceled by executor shutdown" : "Tracks downloading was canceled by " + th, th, arrayList3);
                }
                valueOf3 = null;
                valueOf = null;
                valueOf2 = null;
                List c22 = t75.c(new avs(K, b(list2), j, p1g.g(valueOf, valueOf2, valueOf3)));
                nnmVar.b.getClass();
                size = list2.size();
                iArr = new int[size];
                i = 0;
                while (true) {
                    i2 = -1;
                    if (i >= size) {
                    }
                    iArr[i] = i2;
                    i++;
                }
                if (xz0.t(iArr, -1)) {
                }
                num = null;
                List list422 = c22;
                int i822 = 0;
                while (r4.hasNext()) {
                }
                this.f = c22;
                ExecutorCompletionService executorCompletionService22 = new ExecutorCompletionService(this.d);
                it = list422.iterator();
                while (it.hasNext()) {
                }
                size2 = c22.size();
                DownloadResult[] downloadResultArr22 = new DownloadResult[size2];
                while (i3 < size2) {
                }
            }
        } finally {
            PreloadException.UnknownError unknownError = new PreloadException.UnknownError("Unknown error during downloader instantiation", th);
        }
        PreloadException.UnknownError unknownError2 = new PreloadException.UnknownError("Unknown error during downloader instantiation", th);
    }
}
