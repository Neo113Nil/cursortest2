package defpackage;

import com.yandex.media.ynison.service.a0;
import com.yandex.media.ynison.service.x;
import com.yandex.music.shared.playback.api.commands.AwaitPlayerConvergedCommand;
import com.yandex.music.shared.playback.api.commands.SeekToPositionCommand;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import com.yandex.music.shared.wave.domain.commands.WaveQueueCommandsFactory$Next;
import com.yandex.music.shared.wave.domain.commands.WaveQueueCommandsFactory$Prev;
import com.yandex.music.shared.wave.domain.commands.WaveQueueCommandsFactory$SetOriginalPosition;
import com.yandex.music.shared.wave.domain.commands.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class hgw {
    public static final String h = f1d.g("YnisonShared:", "DiffController");
    public final qfw a;
    public final zzp b;
    public final dew c;
    public final pmw d;
    public final onw e;
    public final rjq f;
    public final um6 g;

    public hgw(qfw qfwVar, zzp zzpVar, dew dewVar, pmw pmwVar, onw onwVar) {
        this.a = qfwVar;
        this.b = zzpVar;
        this.c = dewVar;
        this.d = pmwVar;
        this.e = onwVar;
        rjq rjqVar = new rjq(false);
        this.f = rjqVar;
        this.g = hld.s(rjqVar, dm6.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x05b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x05b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(hgw hgwVar, pqw pqwVar, boolean z, boolean z2, Continuation continuation) {
        ggw ggwVar;
        int i;
        pmw pmwVar;
        amw amwVar;
        nm6 nm6Var;
        Throwable th;
        pmw pmwVar2;
        Object a;
        nm6 nm6Var2;
        amw amwVar2;
        g4q g4qVar;
        List list;
        d dVar;
        fyu fyuVar;
        char c;
        PlaybackCommand$QueueBound.Basic m;
        int i2;
        fyu fyuVar2;
        String str;
        x j;
        String str2;
        pmw pmwVar3 = hgwVar.d;
        amw amwVar3 = pmwVar3.b;
        onw onwVar = hgwVar.e;
        amw amwVar4 = onwVar.d;
        if (continuation instanceof ggw) {
            ggwVar = (ggw) continuation;
            int i3 = ggwVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ggwVar.l = i3 - Integer.MIN_VALUE;
                Object obj = ggwVar.j;
                nm6 nm6Var3 = nm6.a;
                i = ggwVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    boolean a2 = ((eew) hgwVar.c).a();
                    String str3 = h;
                    if (!a2) {
                        ssg.a(4, str3, "skip event until glagol connected", null);
                        return Unit.a;
                    }
                    if (z) {
                        pqwVar.getClass();
                        maq maqVar = pqwVar.b;
                        n7q n7qVar = amwVar4.b().b;
                        wnw wnwVar = wnw.a;
                        Object xnwVar = (n7qVar == null || (g4qVar = amwVar4.b().a) == null) ? wnwVar : maqVar instanceof raq ? new xnw((raq) maqVar) : (znw) zdg.p(g4qVar, new kpm(23, maqVar));
                        xnwVar.getClass();
                        vnw vnwVar = vnw.a;
                        if (!xnwVar.equals(vnwVar)) {
                            ((hmw) onwVar.e).b.b();
                        }
                        ndw ndwVar = onwVar.f;
                        x0q x0qVar = onwVar.c.a;
                        hjp hjpVar = onwVar.i;
                        tqw tqwVar = onwVar.g;
                        if (xnwVar.equals(wnwVar)) {
                            tqwVar.a(pqwVar, hjpVar);
                        } else {
                            boolean z3 = xnwVar instanceof xnw;
                            String str4 = onw.j;
                            if (z3) {
                                ssg.a(5, str4, "unsupported ynison queue " + maqVar.k(), null);
                                vfw[] vfwVarArr = vfw.a;
                                x0qVar.a(new nhw("restore on unsupported " + maqVar.k()));
                                osw oswVar = ndwVar.a;
                                raq raqVar = ((xnw) xnwVar).a;
                                oswVar.getClass();
                                raqVar.getClass();
                                vdw[] vdwVarArr = vdw.a;
                                int v = raqVar.e.v();
                                switch (ouj.D(v)) {
                                    case 0:
                                        str = "unspecified";
                                        break;
                                    case 1:
                                        str = "artist";
                                        break;
                                    case 2:
                                        str = "playlist";
                                        break;
                                    case 3:
                                        str = "album";
                                        break;
                                    case 4:
                                        str = "radio";
                                        break;
                                    case 5:
                                        str = "various";
                                        break;
                                    case 6:
                                        str = "generative";
                                        break;
                                    case 7:
                                        str = "fm";
                                        break;
                                    case 8:
                                        str = "video-wave";
                                        break;
                                    case 9:
                                        str = "local_tracks";
                                        break;
                                    case 10:
                                        str = dfi.c(ouj.D(v), "unrecognized(ordinal=", ")");
                                        break;
                                    default:
                                        b6e.s();
                                        return null;
                                }
                                oswVar.a("YNISON_ERROR_REMOTE_UNSUPPORTED_ENTITY", tah.b(new Pair("type", str)));
                                nmb nmbVar = w64.a;
                                a0 n = pqwVar.d.n();
                                String str5 = "null";
                                if (n != null && (j = n.j()) != null) {
                                    int v2 = j.v();
                                    String u = j.u();
                                    int t = j.t();
                                    StringBuilder sb = new StringBuilder();
                                    switch (v2) {
                                        case 1:
                                            str2 = "UNSPECIFIED";
                                            break;
                                        case 2:
                                            str2 = "ARTIST";
                                            break;
                                        case 3:
                                            str2 = "PLAYLIST";
                                            break;
                                        case 4:
                                            str2 = "ALBUM";
                                            break;
                                        case 5:
                                            str2 = "RADIO";
                                            break;
                                        case 6:
                                            str2 = "VARIOUS";
                                            break;
                                        case 7:
                                            str2 = "GENERATIVE";
                                            break;
                                        case 8:
                                            str2 = "FM_RADIO";
                                            break;
                                        case 9:
                                            str2 = "VIDEO_WAVE";
                                            break;
                                        case 10:
                                            str2 = "LOCAL_TRACKS";
                                            break;
                                        case 11:
                                            str2 = "UNRECOGNIZED";
                                            break;
                                        default:
                                            str2 = "null";
                                            break;
                                    }
                                    sb.append(str2);
                                    sb.append("(id=");
                                    sb.append(u);
                                    sb.append(", context=");
                                    switch (t) {
                                        case 1:
                                            str5 = "BASED_ON_ENTITY_BY_DEFAULT";
                                            break;
                                        case 2:
                                            str5 = "USER_TRACKS";
                                            break;
                                        case 3:
                                            str5 = "DOWNLOADED_TRACKS";
                                            break;
                                        case 4:
                                            str5 = "SEARCH";
                                            break;
                                        case 5:
                                            str5 = "MUSIC_HISTORY";
                                            break;
                                        case 6:
                                            str5 = "MUSIC_HISTORY_SEARCH";
                                            break;
                                        case 7:
                                            str5 = "ARTIST_MY_COLLECTION";
                                            break;
                                        case 8:
                                            str5 = "ARTIST_FAMILIAR_FROM_WAVE";
                                            break;
                                        case 9:
                                            str5 = "UNRECOGNIZED";
                                            break;
                                    }
                                    sb.append(str5);
                                    sb.append(")");
                                    str5 = sb.toString();
                                }
                                w64.b(ulb.Version, w64.a("YnisonUnknownStateException", str5));
                            } else if (xnwVar.equals(vnwVar)) {
                                ssg.a(3, str4, "skip queue changes processing", null);
                                pmwVar = pmwVar3;
                                amwVar = amwVar3;
                                th = null;
                                nm6Var = nm6Var3;
                            } else {
                                if (!(xnwVar instanceof ynw)) {
                                    b6e.s();
                                    return null;
                                }
                                unw unwVar = ((ynw) xnwVar).a;
                                if (unwVar instanceof tnw) {
                                    tnw tnwVar = (tnw) unwVar;
                                    ((kr7) tnwVar.a).getClass();
                                    szu szuVar = tnwVar.b;
                                    jbq jbqVar = tnwVar.c;
                                    fpw c2 = pqwVar.c(onwVar.a);
                                    List e = szuVar.b.a.a.e();
                                    eu7 eu7Var = jbqVar.h;
                                    nyn nynVar = jbqVar.e;
                                    int i4 = jbqVar.l;
                                    int i5 = jbqVar.j;
                                    List e2 = eu7Var.a.e();
                                    amwVar = amwVar3;
                                    nm6Var = nm6Var3;
                                    jiv jivVar = new jiv(14);
                                    e.getClass();
                                    e2.getClass();
                                    boolean A = i4w.A(e, e2, jivVar);
                                    d dVar2 = d.a;
                                    dyu dyuVar = dyu.a;
                                    if (A) {
                                        dVar = dVar2;
                                        if (!Intrinsics.d(szuVar.l(), jbqVar.s())) {
                                            ssg.a(4, str4, "Updating wave_queue shuffle state: " + jbqVar.s(), null);
                                            fyu s = jbqVar.s();
                                            if (s instanceof eyu) {
                                                if (((eyu) s).a.size() == jbqVar.n().size()) {
                                                    fyuVar = jbqVar.s();
                                                    int size = jbqVar.n().size();
                                                    fyuVar.getClass();
                                                    if (fyuVar instanceof eyu) {
                                                        c = 0;
                                                        if (!fyuVar.equals(dyuVar)) {
                                                            b6e.s();
                                                            return null;
                                                        }
                                                        m = dVar.m(false, new gxj(i5), null);
                                                    } else {
                                                        List list2 = ((eyu) fyuVar).a;
                                                        if (size == list2.size()) {
                                                            m = dVar.m(true, new gxj(i5), list2);
                                                            i2 = 1;
                                                            c = 0;
                                                            PlaybackCommand$QueueBound[] playbackCommand$QueueBoundArr = new PlaybackCommand$QueueBound[i2];
                                                            playbackCommand$QueueBoundArr[c] = m;
                                                            amw.a(amwVar4, playbackCommand$QueueBoundArr);
                                                        } else {
                                                            Assertions.throwOrSkip("YnisonPlaybackFacadeBridge", new FailedAssertionException("sendShuffle originalElementsSize != shuffleState.shuffleMapping.size"));
                                                            c = 0;
                                                            m = dVar.m(false, new gxj(i5), null);
                                                        }
                                                    }
                                                    i2 = 1;
                                                    PlaybackCommand$QueueBound[] playbackCommand$QueueBoundArr2 = new PlaybackCommand$QueueBound[i2];
                                                    playbackCommand$QueueBoundArr2[c] = m;
                                                    amw.a(amwVar4, playbackCommand$QueueBoundArr2);
                                                } else {
                                                    dfi.r("SharedWavePlaybackQueue.CommandsFactory.update shuffleIndices size not equal to originalPlayables " + dVar, str4);
                                                }
                                            }
                                            fyuVar = dyuVar;
                                            int size2 = jbqVar.n().size();
                                            fyuVar.getClass();
                                            if (fyuVar instanceof eyu) {
                                            }
                                            i2 = 1;
                                            PlaybackCommand$QueueBound[] playbackCommand$QueueBoundArr22 = new PlaybackCommand$QueueBound[i2];
                                            playbackCommand$QueueBoundArr22[c] = m;
                                            amw.a(amwVar4, playbackCommand$QueueBoundArr22);
                                        } else if (szuVar.h() != i5) {
                                            long j2 = (c2.b / 1000) * 1000;
                                            if (j2 > 1000) {
                                                ssg.a(4, str4, "Updating wave_queue playable position: " + i4 + " with progress: " + j2, null);
                                                j9q j9qVar = j9q.a;
                                                amw.a(amwVar4, new WaveQueueCommandsFactory$SetOriginalPosition(i5, false), new AwaitPlayerConvergedCommand(false), new SeekToPositionCommand(j2));
                                            } else {
                                                int h2 = i5 - szuVar.h();
                                                if (h2 == -1) {
                                                    ssg.a(4, str4, dfi.c(i4, "Updating wave_queue playable position: ", " with skip to prev"), null);
                                                    amw.a(amwVar4, WaveQueueCommandsFactory$Prev.INSTANCE);
                                                } else if (h2 != 1) {
                                                    v3w.k("Updating wave_queue playable position: ", i4, 4, str4, null);
                                                    j9q j9qVar2 = j9q.a;
                                                    amw.a(amwVar4, new WaveQueueCommandsFactory$SetOriginalPosition(i5, true));
                                                } else {
                                                    ssg.a(4, str4, dfi.c(i4, "Updating wave_queue playable position: ", " with skip to next"), null);
                                                    i9q i9qVar = i9q.a;
                                                    amw.a(amwVar4, new WaveQueueCommandsFactory$Next(v5j.e, false));
                                                }
                                            }
                                        }
                                    } else {
                                        v3w.k("Updating wave_queue playables: ", jbqVar.n().size(), 4, str4, null);
                                        ArrayList a3 = onwVar.a(szuVar.j(), jbqVar.n());
                                        ArrayList a4 = onwVar.a(szuVar.o(), jbqVar.q());
                                        fyu s2 = jbqVar.s();
                                        int i6 = jbqVar.i;
                                        int i7 = jbqVar.k;
                                        s2.getClass();
                                        if (s2 instanceof eyu) {
                                            if (a3.size() != ((eyu) s2).a.size()) {
                                                dfi.r("sendQueue fixedQueueOriginalPlayables.size != shuffleMapping.size", "YnisonPlaybackFacadeBridge");
                                                fyuVar2 = dyuVar;
                                                PlaybackCommand$QueueBound.Basic j3 = dVar2.j(a3, fyuVar2, a4, i6, i7);
                                                dVar = dVar2;
                                                amw.a(amwVar4, j3);
                                            }
                                        } else if (!s2.equals(dyuVar)) {
                                            b6e.s();
                                            return null;
                                        }
                                        fyuVar2 = s2;
                                        PlaybackCommand$QueueBound.Basic j32 = dVar2.j(a3, fyuVar2, a4, i6, i7);
                                        dVar = dVar2;
                                        amw.a(amwVar4, j32);
                                    }
                                    if (szuVar.c != nynVar) {
                                        ssg.a(4, str4, "Updating wave_queue repeat mode: " + nynVar, null);
                                        amw.a(amwVar4, dVar.k(nynVar));
                                    }
                                    pmwVar = pmwVar3;
                                } else {
                                    amwVar = amwVar3;
                                    nm6Var = nm6Var3;
                                    if (unwVar instanceof snw) {
                                        snw snwVar = (snw) unwVar;
                                        a8q a8qVar = snwVar.a;
                                        u7u u7uVar = snwVar.b;
                                        vaq vaqVar = snwVar.c;
                                        jiv jivVar2 = onwVar.h;
                                        saq b = vaqVar.b();
                                        ArrayList arrayList = u7uVar.g;
                                        int i8 = u7uVar.i;
                                        int i9 = i8 - 1;
                                        int i10 = i9 < 0 ? 0 : i9;
                                        int i11 = i8 + 2;
                                        pmwVar = pmwVar3;
                                        int size3 = arrayList.size();
                                        if (i11 > size3) {
                                            i11 = size3;
                                        }
                                        List subList = arrayList.subList(i10, i11);
                                        Iterator it = subList.iterator();
                                        int i12 = 0;
                                        while (true) {
                                            if (!it.hasNext()) {
                                                list = subList;
                                                i12 = -1;
                                                break;
                                            }
                                            list = subList;
                                            Iterator it2 = it;
                                            if (((Boolean) jivVar2.invoke((i5u) it.next(), u7uVar.c)).booleanValue()) {
                                                break;
                                            }
                                            i12++;
                                            subList = list;
                                            it = it2;
                                        }
                                        Iterator it3 = list.iterator();
                                        int i13 = 0;
                                        while (true) {
                                            if (!it3.hasNext()) {
                                                i13 = -1;
                                                break;
                                            }
                                            if (((Boolean) jivVar2.invoke((i5u) it3.next(), b)).booleanValue()) {
                                                break;
                                            }
                                            i13++;
                                        }
                                        if (i12 != -1 && i13 != -1) {
                                            int i14 = i13 - i12;
                                            if (i14 == -1) {
                                                ssg.a(3, str4, "Updating video wave queue: back", null);
                                                com.yandex.music.shared.radio.domain.commands.d dVar3 = ((s8q) a8qVar).f;
                                                dVar3.getClass();
                                                amw.a(amwVar4, dVar3.a());
                                            } else if (i14 != 0) {
                                                if (i14 == 1) {
                                                    ssg.a(4, str4, "Updating video wave queue: skip", null);
                                                    com.yandex.music.shared.radio.domain.commands.d dVar4 = ((s8q) a8qVar).f;
                                                    dVar4.getClass();
                                                    amw.a(amwVar4, dVar4.d(false));
                                                }
                                            } else if (arrayList.size() != vaqVar.c.size()) {
                                                x0qVar.a(new nhw(f1d.g("Radio queue reduced by ", vaqVar.l().b)));
                                                ssg.a(6, str4, "video wave state - refresh state cause remote state reduced tracks size", null);
                                            }
                                        }
                                        tqwVar.a(pqwVar, hjpVar);
                                    } else {
                                        pmwVar = pmwVar3;
                                        th = null;
                                        if (!(unwVar instanceof rnw)) {
                                            b6e.s();
                                            return null;
                                        }
                                    }
                                }
                                th = null;
                            }
                        }
                        ssg.a(4, str3, "skip playingState handling because new queue will be launched", null);
                        return Unit.a;
                    }
                    pmwVar = pmwVar3;
                    amwVar = amwVar3;
                    nm6Var = nm6Var3;
                    th = null;
                    if (z2) {
                        ggwVar.l = 1;
                        String str6 = pmw.d;
                        n7q n7qVar2 = amwVar.b().b;
                        if (n7qVar2 == null) {
                            ssg.a(6, str6, "No local queue found to apply status changes", th);
                            a = Unit.a;
                        } else if (ngg.y(euk.F(n7qVar2), pqwVar.b.k().getId())) {
                            pmwVar2 = pmwVar;
                            a = pmwVar2.a(pqwVar.b, pqwVar.c(pmwVar2.a), ggwVar);
                            if (a != nm6.a) {
                                a = Unit.a;
                            }
                            nm6Var2 = nm6Var;
                            if (a != nm6Var2) {
                                return nm6Var2;
                            }
                            amwVar2 = amwVar;
                        } else {
                            ssg.a(5, str6, "Skip applying remote status, since queue changed", th);
                            a = Unit.a;
                        }
                        nm6Var2 = nm6Var;
                        pmwVar2 = pmwVar;
                        if (a != nm6Var2) {
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                pmwVar2 = pmwVar3;
                amwVar2 = amwVar3;
                if (p6g.C((e6l) amwVar2.a.a.d.getValue())) {
                    ((hmw) pmwVar2.c).b.b();
                }
                return Unit.a;
            }
        }
        ggwVar = new ggw(hgwVar, continuation);
        Object obj2 = ggwVar.j;
        nm6 nm6Var32 = nm6.a;
        i = ggwVar.l;
        if (i != 0) {
        }
        if (p6g.C((e6l) amwVar2.a.a.d.getValue())) {
        }
        return Unit.a;
    }
}
