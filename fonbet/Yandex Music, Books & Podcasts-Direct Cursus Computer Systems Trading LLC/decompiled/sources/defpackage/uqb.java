package defpackage;

import android.os.SystemClock;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import ru.yandex.video.m3.data.DrmType;
import ru.yandex.video.m3.data.PlaybackStats;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.data.loadcontrol.LoadControlState;
import ru.yandex.video.m3.player.tracks.TrackType;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class uqb extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ crb s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uqb(crb crbVar, int i) {
        super(0);
        this.r = i;
        this.s = crbVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long j;
        Long l;
        DrmType drmType;
        jeg bufferState;
        HashSet u0;
        Object t7oVar;
        long j2 = -9223372036854775807L;
        long j3 = -1;
        int i = 3;
        r7 = null;
        Long l2 = null;
        char c = 1;
        char c2 = 1;
        int i2 = 0;
        switch (this.r) {
            case 0:
                crb crbVar = this.s;
                ExoPlayer exoPlayer = crbVar.a;
                long J0 = exoPlayer.J0();
                if (exoPlayer.e1()) {
                    ris m = exoPlayer.V().m(exoPlayer.R0(), crbVar.M, 0L);
                    m.getClass();
                    long j4 = crbVar.B.b;
                    float floatValue = ((Number) crbVar.f.l(new uqb(crbVar, 5))).floatValue();
                    if ((j4 > dvt.m0(m.l) && floatValue > 1.0f) || (j4 < 0 && floatValue < 1.0f)) {
                        crbVar.n(false, 1.0f);
                    }
                }
                return new tqb(J0, exoPlayer.getDuration(), exoPlayer.t0() - exoPlayer.s0(), exoPlayer.e());
            case 1:
                ExoPlayer exoPlayer2 = new xqb(this.s, i2).s.a;
                return new bcl(Math.max(0L, exoPlayer2.t0()), exoPlayer2.R0());
            case 2:
                long duration = this.s.a.getDuration();
                Long valueOf = duration != -9223372036854775807L ? Long.valueOf(duration) : null;
                return Long.valueOf(valueOf != null ? valueOf.longValue() : -9223372036854775807L);
            case 3:
                crb crbVar2 = this.s;
                ExoPlayer exoPlayer3 = crbVar2.a;
                int c3 = exoPlayer3.V().c(false);
                sis V = exoPlayer3.V();
                if (V.p()) {
                    V = null;
                }
                ris m2 = V != null ? V.m(c3, crbVar2.M, 0L) : null;
                return (m2 != null && m2.i && m2.h) ? new bcl(dvt.m0(m2.l), c3) : new bcl(-1L, -1);
            case 4:
                crb crbVar3 = this.s;
                if (crbVar3.K.g != VideoType.VOD) {
                    long h = crbVar3.h() + crbVar3.e().a;
                    c38 c38Var = crbVar3.O;
                    long j5 = c38Var.a;
                    if (j5 == -9223372036854775807L || c38Var.b == -9223372036854775807L) {
                        j = -9223372036854775807L;
                        l = null;
                    } else {
                        j = -9223372036854775807L;
                        l = Long.valueOf((SystemClock.elapsedRealtime() - c38Var.b) + j5);
                    }
                    if (h > 0 && l != null) {
                        l2 = Long.valueOf(Math.max(l.longValue() - h, 0L));
                    }
                    j2 = l2 != null ? l2.longValue() : j;
                }
                return Long.valueOf(j2);
            case 5:
                return Float.valueOf(this.s.a.m().a);
            case 6:
                crb crbVar4 = this.s;
                if (crbVar4.a.c() == 1) {
                    return null;
                }
                long j6 = crbVar4.e().a;
                long j7 = ((bcl) crbVar4.f.l(new uqb(crbVar4, c2 == true ? 1 : 0))).a;
                long longValue = ((Number) crbVar4.f.l(new uqb(crbVar4, 4))).longValue();
                long j8 = ((bcl) crbVar4.f.l(new uqb(crbVar4, i))).a;
                boolean booleanValue = ((Boolean) crbVar4.f.l(new uqb(crbVar4, 13))).booleanValue();
                VideoType i3 = crbVar4.i();
                boolean g0 = crbVar4.a.g0();
                long c4 = crbVar4.c();
                axh axhVar = crbVar4.l;
                if (axhVar != null && (bufferState = new LoadControlState(axhVar.k).getBufferState()) != null) {
                    j3 = bufferState.a;
                }
                long j9 = j3;
                nnd nndVar = crbVar4.P;
                TrackType trackType = TrackType.Video;
                nndVar.getClass();
                trackType.getClass();
                DrmType drmType2 = (DrmType) ((ConcurrentHashMap) nndVar.c).get(trackType);
                if (drmType2 == null) {
                    TrackType trackType2 = TrackType.Audio;
                    trackType2.getClass();
                    DrmType drmType3 = (DrmType) ((ConcurrentHashMap) nndVar.c).get(trackType2);
                    if (drmType3 == null) {
                        drmType = crbVar4.L == null ? DrmType.None : null;
                    } else {
                        drmType = drmType3;
                    }
                } else {
                    drmType = drmType2;
                }
                PlaybackStats playbackStats = new PlaybackStats(j7, longValue, -9223372036854775807L, j8, null, booleanValue, j6, i3, g0, c4, j9, drmType, null, null, null, null, Integer.valueOf(new xqb(crbVar4, c == true ? 1 : 0).s.a.c()), null);
                crbVar4.o.accept(playbackStats.getDrmType());
                return playbackStats;
            case 7:
                ExoPlayer exoPlayer4 = new xqb(this.s, 2).s.a;
                return new bcl(Math.max(0L, exoPlayer4.J0()), exoPlayer4.R0());
            case 8:
                yjj yjjVar = this.s.m;
                synchronized (yjjVar.a) {
                    u0 = CollectionsKt.u0(yjjVar.a);
                }
                Iterator it = u0.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    try {
                        r7o r7oVar = z7o.b;
                        ((zbl) next).getClass();
                        t7oVar = Unit.a;
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        t7oVar = new t7o(th);
                    }
                    Throwable a = z7o.a(t7oVar);
                    if (a != null) {
                        Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
                    }
                }
                return Unit.a;
            case 9:
                return this.s.K.h;
            case 10:
                return this.s.K.g;
            case 11:
                return Float.valueOf(this.s.a.getVolume());
            case 12:
                return Boolean.valueOf(this.s.a.B0());
            case 13:
                ExoPlayer exoPlayer5 = this.s.a;
                return Boolean.valueOf(exoPlayer5.c() == 3 && exoPlayer5.g0());
            case 14:
                return Boolean.valueOf(this.s.a.i());
            case 15:
                this.s.a.L(false);
                return Unit.a;
            default:
                this.s.a.a();
                return Unit.a;
        }
    }
}
