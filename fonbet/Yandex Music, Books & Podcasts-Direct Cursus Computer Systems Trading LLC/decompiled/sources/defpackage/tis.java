package defpackage;

import android.net.Uri;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.trackselection.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.video.m3.data.StreamType;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.player.PlaybackException;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class tis extends scl {
    public final ExoPlayer a;
    public final crb b;
    public final yjj c;
    public final ct7 d;
    public final au1 e;
    public final z0j f;
    public VideoType g;
    public StreamType h;
    public final z6u i;
    public long j;
    public long k;
    public boolean l;

    public tis(ExoPlayer exoPlayer, crb crbVar, yjj yjjVar, ct7 ct7Var, au1 au1Var, z0j z0jVar) {
        exoPlayer.getClass();
        ct7Var.getClass();
        this.a = exoPlayer;
        this.b = crbVar;
        this.c = yjjVar;
        this.d = ct7Var;
        this.e = au1Var;
        this.f = z0jVar;
        this.i = new z6u();
        this.j = -9223372036854775807L;
        this.k = -9223372036854775807L;
    }

    @Override // defpackage.f8l
    public final void I(int i, onh onhVar) {
        gnh gnhVar;
        Uri uri;
        if (onhVar == null || (gnhVar = onhVar.b) == null || (uri = gnhVar.a) == null) {
            return;
        }
        this.f.e = uri.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:227:0x00d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.f8l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R(sis sisVar, int i) {
        long j;
        HashSet u0;
        Object t7oVar;
        HashSet u02;
        Object t7oVar2;
        HashSet u03;
        Object t7oVar3;
        StreamType streamType;
        VideoType videoType;
        List list;
        a0o a0oVar;
        yjj yjjVar;
        HashSet u04;
        Object t7oVar4;
        String str;
        String str2;
        sisVar.getClass();
        Object S0 = this.a.S0();
        if (S0 != null) {
            VideoType videoType2 = this.g;
            StreamType streamType2 = this.h;
            boolean z = S0 instanceof nzd;
            if (z) {
                int i2 = ((nzd) S0).b.d;
                videoType = i2 != 1 ? i2 != 2 ? ((ExoPlayer) this.e.c).P0() ? VideoType.LIVE : VideoType.VOD : VideoType.EVENT : VideoType.VOD;
                streamType = StreamType.Hls;
            } else if (S0 instanceof d97) {
                if (((ExoPlayer) this.e.c).P0()) {
                    d97 d97Var = (d97) S0;
                    if (d97Var.m.size() > 0) {
                        List list2 = d97Var.b(0).c;
                        list2.getClass();
                        nj njVar = (nj) CollectionsKt.firstOrNull(list2);
                        if (njVar != null && (list = njVar.c) != null && (a0oVar = (a0o) CollectionsKt.firstOrNull(list)) != null && a0oVar.c == 0) {
                            videoType = VideoType.LIVE;
                        }
                    }
                    videoType = VideoType.EVENT;
                } else {
                    videoType = VideoType.VOD;
                }
                streamType = StreamType.Dash;
            } else {
                streamType = StreamType.Unknown;
                videoType = null;
            }
            this.g = videoType;
            if (videoType != null) {
                z0j z0jVar = this.f;
                String str3 = (String) z0jVar.d;
                if (str3 != null) {
                    j = 0;
                    if (str3.equals((String) z0jVar.e)) {
                        ((mnn) z0jVar.c).c(videoType == VideoType.VOD || !z0jVar.b, System.currentTimeMillis(), new kgk(21, videoType));
                        z0jVar.d = null;
                    }
                    this.h = streamType;
                    if (videoType2 == videoType || streamType2 != streamType) {
                        yjjVar = this.c;
                        synchronized (yjjVar.a) {
                            u04 = CollectionsKt.u0(yjjVar.a);
                        }
                        Iterator it = u04.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            try {
                                r7o r7oVar = z7o.b;
                                ((zbl) next).s(videoType, streamType);
                                t7oVar4 = Unit.a;
                            } catch (Throwable th) {
                                r7o r7oVar2 = z7o.b;
                                t7oVar4 = new t7o(th);
                            }
                            Throwable a = z7o.a(t7oVar4);
                            if (a != null) {
                                Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
                            }
                        }
                    }
                    z6u z6uVar = this.i;
                    ct7 ct7Var = this.d;
                    if (z) {
                        jyr b = btf.b(grb.B);
                        z6uVar.getClass();
                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) z6uVar.d;
                        concurrentHashMap.clear();
                        for (String str4 : (List) b.getValue()) {
                            str4.getClass();
                            HashMap hashMap = new HashMap();
                            Pattern pattern = (Pattern) z6uVar.c;
                            pattern.getClass();
                            Iterator it2 = wxf.v(str4, pattern).iterator();
                            while (it2.hasNext()) {
                                String str5 = (String) ((List) it2.next()).get(1);
                                Pattern pattern2 = (Pattern) z6uVar.b;
                                pattern2.getClass();
                                Iterator it3 = wxf.v(str5, pattern2).iterator();
                                while (it3.hasNext()) {
                                    List list3 = (List) it3.next();
                                    hashMap.put(new cws(Integer.parseInt((String) list3.get(1)), Integer.parseInt((String) list3.get(2)), Integer.parseInt((String) list3.get(3))), (String) list3.get(4));
                                }
                            }
                            concurrentHashMap.putAll(hashMap);
                        }
                    } else if (S0 instanceof d97) {
                        jyr b2 = btf.b(new rs6(15, (d97) S0));
                        z6uVar.getClass();
                        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) z6uVar.d;
                        concurrentHashMap2.clear();
                        List list4 = (List) b2.getValue();
                        list4.getClass();
                        HashMap hashMap2 = new HashMap();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list4) {
                            iy7 iy7Var = (iy7) obj;
                            if (Intrinsics.d(iy7Var.a, "urn:mpeg:yandex:labels:quality") && (str2 = iy7Var.b) != null && !StringsKt.U(str2)) {
                                arrayList.add(obj);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            iy7 iy7Var2 = (iy7) it4.next();
                            Pattern pattern3 = (Pattern) z6uVar.b;
                            pattern3.getClass();
                            String str6 = iy7Var2.b;
                            str6.getClass();
                            z75.t(arrayList2, wxf.v(str6, pattern3));
                        }
                        Iterator it5 = arrayList2.iterator();
                        while (it5.hasNext()) {
                            List list5 = (List) it5.next();
                            hashMap2.put(new cws(Integer.parseInt((String) list5.get(1)), Integer.parseInt((String) list5.get(2)), Integer.parseInt((String) list5.get(3))), (String) list5.get(4));
                        }
                        concurrentHashMap2.putAll(hashMap2);
                        Pattern compile = Pattern.compile("([0-9]{1,10})");
                        List list6 = (List) b2.getValue();
                        list6.getClass();
                        xqn xqnVar = new xqn();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj2 : list6) {
                            iy7 iy7Var3 = (iy7) obj2;
                            if (Intrinsics.d(iy7Var3.a, "urn:mpeg:yandex:capping:maxheight") && (str = iy7Var3.b) != null && !StringsKt.U(str)) {
                                arrayList3.add(obj2);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it6 = arrayList3.iterator();
                        while (it6.hasNext()) {
                            iy7 iy7Var4 = (iy7) it6.next();
                            compile.getClass();
                            String str7 = iy7Var4.b;
                            str7.getClass();
                            z75.t(arrayList4, wxf.v(str7, compile));
                        }
                        Iterator it7 = arrayList4.iterator();
                        while (it7.hasNext()) {
                            int parseInt = Integer.parseInt((String) ((List) it7.next()).get(1));
                            Integer num = (Integer) xqnVar.a;
                            xqnVar.a = num != null ? Integer.valueOf(Math.min(num.intValue(), parseInt)) : Integer.valueOf(parseInt);
                        }
                        Integer num2 = (Integer) xqnVar.a;
                        if (num2 != null) {
                            int intValue = num2.intValue();
                            us7 a2 = ct7Var.a();
                            if (intValue < ct7Var.d().b) {
                                a2.a = ct7Var.d().a;
                                a2.b = intValue;
                                ct7Var.k(new a(a2));
                            }
                        }
                    }
                }
            }
            j = 0;
            this.h = streamType;
            if (videoType2 == videoType) {
            }
            yjjVar = this.c;
            synchronized (yjjVar.a) {
            }
        } else {
            j = 0;
        }
        long c = this.b.c();
        if (c != this.j) {
            yjj yjjVar2 = this.c;
            synchronized (yjjVar2.a) {
                u03 = CollectionsKt.u0(yjjVar2.a);
            }
            Iterator it8 = u03.iterator();
            while (it8.hasNext()) {
                Object next2 = it8.next();
                try {
                    r7o r7oVar3 = z7o.b;
                    ((zbl) next2).U(c);
                    t7oVar3 = Unit.a;
                } catch (Throwable th2) {
                    r7o r7oVar4 = z7o.b;
                    t7oVar3 = new t7o(th2);
                }
                Throwable a3 = z7o.a(t7oVar3);
                if (a3 != null) {
                    Timber.INSTANCE.e(a3, "notifyObservers", new Object[0]);
                }
            }
            this.j = c;
        }
        if (this.k == -9223372036854775807L || this.g != VideoType.VOD) {
            long h = this.b.h();
            if ((h > j || this.g == VideoType.VOD) && h != this.k) {
                yjj yjjVar3 = this.c;
                synchronized (yjjVar3.a) {
                    u0 = CollectionsKt.u0(yjjVar3.a);
                }
                Iterator it9 = u0.iterator();
                while (it9.hasNext()) {
                    Object next3 = it9.next();
                    try {
                        r7o r7oVar5 = z7o.b;
                        ((zbl) next3).O(h);
                        t7oVar = Unit.a;
                    } catch (Throwable th3) {
                        r7o r7oVar6 = z7o.b;
                        t7oVar = new t7o(th3);
                    }
                    Throwable a4 = z7o.a(t7oVar);
                    if (a4 != null) {
                        Timber.INSTANCE.e(a4, "notifyObservers", new Object[0]);
                    }
                }
                this.k = h;
            }
        }
        if (c <= j || this.l) {
            return;
        }
        this.l = true;
        if (c >= this.b.e().a || this.g == VideoType.VOD) {
            return;
        }
        StreamType streamType3 = this.h;
        if (streamType3 != StreamType.Hls) {
            if (streamType3 == StreamType.Dash) {
                Timber.INSTANCE.w("Start position of content was out of broadcast window. Player will seek to live edge!", new Object[0]);
                crb crbVar = this.b;
                crbVar.m((bcl) crbVar.f.l(new uqb(crbVar, 3)));
                return;
            }
            return;
        }
        yjj yjjVar4 = this.c;
        synchronized (yjjVar4.a) {
            u02 = CollectionsKt.u0(yjjVar4.a);
        }
        Iterator it10 = u02.iterator();
        while (it10.hasNext()) {
            Object next4 = it10.next();
            try {
                r7o r7oVar7 = z7o.b;
                ((zbl) next4).Y(new PlaybackException.HLSLiveRequestsStartOutOfLiveWindow());
                t7oVar2 = Unit.a;
            } catch (Throwable th4) {
                r7o r7oVar8 = z7o.b;
                t7oVar2 = new t7o(th4);
            }
            Throwable a5 = z7o.a(t7oVar2);
            if (a5 != null) {
                Timber.INSTANCE.e(a5, "notifyObservers", new Object[0]);
            }
        }
    }
}
