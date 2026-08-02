package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.data.ExtendedStalledReason;
import ru.yandex.video.m3.data.LastPlayWhenReadyChanged;
import ru.yandex.video.m3.data.RecoverDetails;
import ru.yandex.video.m3.data.StalledReason;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PreparingParams;
import ru.yandex.video.m3.player.tracks.TrackVariant;

/* loaded from: classes6.dex */
public final class mar implements rgl, u9l {
    public volatile paw a;
    public volatile String b;
    public volatile boolean c;
    public volatile boolean d;
    public volatile boolean e;
    public volatile boolean f;
    public volatile boolean g;
    public volatile boolean h;
    public volatile boolean i;
    public volatile boolean j;
    public volatile boolean k;
    public volatile boolean l;
    public volatile boolean m;
    public volatile boolean o;
    public LastPlayWhenReadyChanged p;
    public ExtendedStalledReason r;
    public TrackVariant s;
    public TrackVariant t;
    public final AtomicInteger n = new AtomicInteger(0);
    public final chs q = new chs();

    public static boolean s0(TrackVariant trackVariant, TrackVariant trackVariant2) {
        if (trackVariant != null) {
            if (trackVariant2 == null) {
                return true;
            }
            boolean z = trackVariant instanceof TrackVariant.Variant;
            if (!z || !(trackVariant2 instanceof TrackVariant.Variant)) {
                if (trackVariant instanceof TrackVariant.Adaptive) {
                    return !(trackVariant2 instanceof TrackVariant.Adaptive);
                }
                if (trackVariant instanceof TrackVariant.Disable) {
                    return !(trackVariant2 instanceof TrackVariant.Disable);
                }
                if (z) {
                    return !(trackVariant2 instanceof TrackVariant.Variant);
                }
                if (trackVariant instanceof TrackVariant.DownloadVariant) {
                    return !(trackVariant2 instanceof TrackVariant.DownloadVariant);
                }
                if (trackVariant instanceof TrackVariant.PreferredTrackVariant) {
                    return !(trackVariant2 instanceof TrackVariant.PreferredTrackVariant);
                }
                b6e.s();
                return false;
            }
            TrackVariant.Variant variant = (TrackVariant.Variant) trackVariant;
            TrackVariant.Variant variant2 = (TrackVariant.Variant) trackVariant2;
            if (variant.getGroupIndex() != variant2.getGroupIndex() || variant.getTrackIndex() != variant2.getTrackIndex()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rgl
    public final void E() {
        chs chsVar = this.q;
        chsVar.getClass();
        chsVar.a("StalledReasonManager", "onPlayerReleased", null, new Object[0]);
        this.n.set(0);
    }

    @Override // defpackage.rgl
    public final void U() {
        paw pawVar = this.a;
        if (pawVar != null) {
            this.h = pawVar.B() == VideoType.LIVE && pawVar.z() > 0 && pawVar.getPosition() > 0 && Math.abs(pawVar.z() - pawVar.getPosition()) < ((long) 2000);
        }
        chs chsVar = this.q;
        chsVar.getClass();
        chsVar.a("StalledReasonManager", "onLoadingStart completed. StalledReason is " + X(), null, new Object[0]);
    }

    @Override // defpackage.u9l
    public final void W(boolean z) {
        chs chsVar = this.q;
        chsVar.getClass();
        chsVar.a("StalledReasonManager", "onStopPlayback keepDecoders=" + z, null, new Object[0]);
    }

    public final StalledReason X() {
        StalledReason stalledReason = this.e ? StalledReason.RECOVER : (this.c || (!this.m && this.k)) ? StalledReason.SET_SOURCE : (this.d || (this.m && this.k)) ? StalledReason.INIT : this.f ? StalledReason.SEEK : this.g ? StalledReason.VIDEO_TRACK_CHANGE : this.h ? StalledReason.LIVE_EDGE : StalledReason.OTHER;
        chs chsVar = this.q;
        chsVar.getClass();
        chsVar.a("StalledReasonManager", "getStalledReason", "stalledReason=" + stalledReason, new Object[0]);
        return stalledReason;
    }

    @Override // defpackage.rgl
    public final void a() {
        chs chsVar = this.q;
        chsVar.getClass();
        chsVar.a("StalledReasonManager", "onResumePlayback", null, new Object[0]);
        this.o = true;
    }

    @Override // defpackage.u9l
    public final void b(String str) {
        this.n.decrementAndGet();
        chs chsVar = this.q;
        chsVar.getClass();
        chsVar.a("StalledReasonManager", "onVideoDecoderReleased", "decoderName: " + str, new Object[0]);
    }

    @Override // defpackage.u9l
    public final void g(long j, long j2, String str) {
        str.getClass();
        chs chsVar = this.q;
        chsVar.getClass();
        chsVar.a("StalledReasonManager", "onVideoDecoderInitialized", null, new Object[0]);
        AtomicInteger atomicInteger = this.n;
        atomicInteger.incrementAndGet();
        atomicInteger.get();
    }

    @Override // defpackage.rgl
    public final void g0() {
        chs chsVar = this.q;
        chsVar.getClass();
        chsVar.a("StalledReasonManager", "onLoadingFinished", null, new Object[0]);
        this.c = false;
        this.e = false;
        this.f = false;
        this.g = false;
        this.d = false;
        this.h = false;
        this.k = false;
    }

    @Override // defpackage.u9l
    public final void j(PreparingParams preparingParams) {
        preparingParams.getClass();
        chs chsVar = this.q;
        chsVar.getClass();
        chsVar.a("StalledReasonManager", "onPreparingStarted " + preparingParams, null, new Object[0]);
        this.m = preparingParams.getIsFirstEverStart();
        this.i = preparingParams.getPrepareWithoutInitCodecs();
        if (preparingParams.getIsFirstEverStart()) {
            this.d = true;
        } else {
            this.c = true;
        }
        this.o = false;
    }

    @Override // defpackage.rgl
    public final void n(boolean z) {
        chs chsVar = this.q;
        chsVar.getClass();
        boolean z2 = false;
        chsVar.a("StalledReasonManager", "onWillPlayWhenReadyChanged", "willPlayWhenReady: " + z, new Object[0]);
        boolean z3 = this.l;
        this.l = z;
        if (this.i && this.l && this.j && this.n.get() <= 0 && !this.o) {
            z2 = true;
        }
        this.k = z2;
        this.p = new LastPlayWhenReadyChanged(z3, this.l, this.k, this.i, this.j, this.n.get(), System.currentTimeMillis());
    }

    @Override // defpackage.rgl
    public final void o(nqs nqsVar, nqs nqsVar2, nqs nqsVar3) {
        nqsVar.getClass();
        nqsVar2.getClass();
        nqsVar3.getClass();
        chs chsVar = this.q;
        chsVar.getClass();
        StringBuilder sb = new StringBuilder("video=");
        TrackVariant c = ((jsb) nqsVar3).c();
        sb.append(c != null ? c.getTitle() : null);
        sb.append(", audio=");
        TrackVariant c2 = ((jsb) nqsVar).c();
        sb.append(c2 != null ? c2.getTitle() : null);
        sb.append(", subtitles=");
        TrackVariant c3 = ((jsb) nqsVar2).c();
        sb.append(c3 != null ? c3.getTitle() : null);
        chsVar.a("StalledReasonManager", "onTracksChanged", sb.toString(), new Object[0]);
        jsb jsbVar = (jsb) nqsVar3;
        TrackVariant c4 = jsbVar.c();
        boolean s0 = s0(this.s, c4);
        this.s = c4;
        if (!s0) {
            TrackVariant c5 = ((jsb) nqsVar).c();
            s0 = s0(this.t, c5);
            this.t = c5;
        }
        if (s0) {
            this.g = true;
        }
        this.j = true ^ (jsbVar.c() instanceof TrackVariant.Disable);
    }

    @Override // defpackage.u9l
    public final void q0(PlaybackException playbackException, RecoverDetails recoverDetails) {
        recoverDetails.getClass();
        chs chsVar = this.q;
        chsVar.getClass();
        chsVar.a("StalledReasonManager", "onPlayerWillTryRecoverAfterError", null, new Object[0]);
        this.e = true;
    }

    public final ExtendedStalledReason r0() {
        ExtendedStalledReason extendedStalledReason = new ExtendedStalledReason(X(), this.d, this.c, this.e, this.f, this.g, this.h, this.m, this.k, this.l, this.n.get(), this.i, this.j, false, false, this.p, this.o);
        chs chsVar = this.q;
        chsVar.getClass();
        if (!Intrinsics.d(this.r, extendedStalledReason)) {
            this.r = extendedStalledReason;
            chsVar.a("StalledReasonManager", "getStalledReasonWithExplanation done. " + extendedStalledReason, null, new Object[0]);
        }
        return extendedStalledReason;
    }

    @Override // defpackage.rgl
    public final void t(long j, long j2) {
        chs chsVar = this.q;
        chsVar.getClass();
        chsVar.a("StalledReasonManager", "onSeek", null, new Object[0]);
        this.f = true;
    }

    public final void t0(paw pawVar) {
        chs chsVar = this.q;
        chsVar.getClass();
        chsVar.a("StalledReasonManager", "start", null, new Object[0]);
        this.a = pawVar;
        pawVar.I(this);
        pawVar.w(this);
    }

    public final void u0() {
        chs chsVar = this.q;
        chsVar.getClass();
        chsVar.a("StalledReasonManager", "stop", null, new Object[0]);
        paw pawVar = this.a;
        if (pawVar != null) {
            pawVar.F(this);
        }
        paw pawVar2 = this.a;
        if (pawVar2 != null) {
            pawVar2.q(this);
        }
    }

    @Override // defpackage.u9l
    public final void x(String str, boolean z) {
        chs chsVar = this.q;
        chsVar.getClass();
        chsVar.a("StalledReasonManager", "onNewMediaItem url=" + str + " autoplay=" + z, null, new Object[0]);
        if (this.b == null) {
            this.d = true;
        } else {
            this.c = true;
        }
        this.b = str;
        this.o = false;
    }
}
