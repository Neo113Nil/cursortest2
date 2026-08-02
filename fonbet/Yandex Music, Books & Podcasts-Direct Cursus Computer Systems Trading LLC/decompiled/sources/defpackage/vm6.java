package defpackage;

import android.os.Looper;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.player.PlaybackException;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class vm6 extends e80 {
    public final Looper a;
    public final yjj b;

    public vm6(yjj yjjVar, Looper looper) {
        looper.getClass();
        yjjVar.getClass();
        this.a = looper;
        this.b = yjjVar;
    }

    @Override // defpackage.d80
    public final void A(c80 c80Var, ig7 ig7Var) {
        ig7Var.getClass();
        b("onVideoDisabled");
    }

    @Override // defpackage.d80
    public final void B(int i, c80 c80Var, g8l g8lVar, g8l g8lVar2) {
        g8lVar.getClass();
        g8lVar2.getClass();
        b("onPositionDiscontinuity");
    }

    @Override // defpackage.d80
    public final void D(c80 c80Var, cfg cfgVar, boh bohVar) {
        b("onLoadCanceled");
    }

    @Override // defpackage.d80
    public final void F(c80 c80Var, boolean z) {
        b("onShuffleModeChanged");
    }

    @Override // defpackage.d80
    public final void H(c80 c80Var) {
        b("onDrmKeysRemoved");
    }

    @Override // defpackage.d80
    public final void I(c80 c80Var, String str) {
        str.getClass();
        b("onAudioDecoderReleased");
    }

    @Override // defpackage.d80
    public final void J(c80 c80Var, int i) {
        b("onPlaybackStateChanged");
    }

    @Override // defpackage.d80
    public final void K(c80 c80Var, int i) {
        b("onDroppedVideoFrames");
    }

    @Override // defpackage.d80
    public final void L(c80 c80Var, String str, long j, long j2) {
        str.getClass();
        b("onAudioDecoderInitialized");
    }

    @Override // defpackage.d80
    public final void M(c80 c80Var, int i) {
        b("onRepeatModeChanged");
    }

    @Override // defpackage.d80
    public final void O(c80 c80Var, Exception exc) {
        b("onVideoCodecError");
    }

    @Override // defpackage.d80
    public final void P(c80 c80Var, int i) {
        b("onTimelineChanged");
    }

    @Override // defpackage.d80
    public final void Q(c80 c80Var, String str, long j, long j2) {
        str.getClass();
        b("onVideoDecoderInitialized");
    }

    @Override // defpackage.d80
    public final void R(c80 c80Var, ig7 ig7Var) {
        ig7Var.getClass();
        b("onAudioEnabled");
    }

    @Override // defpackage.d80
    public final void T(c80 c80Var, String str) {
        str.getClass();
        b("onVideoDecoderReleased");
    }

    @Override // defpackage.d80
    public final void V(c80 c80Var, ig7 ig7Var) {
        ig7Var.getClass();
        b("onVideoEnabled");
    }

    @Override // defpackage.d80
    public final void W(c80 c80Var, int i) {
        b("onDrmSessionAcquired");
    }

    @Override // defpackage.d80
    public final void X(c80 c80Var, int i) {
        b("onAudioSessionIdChanged");
    }

    @Override // defpackage.d80
    public final void Y(int i, long j, c80 c80Var) {
        b("onBandwidthEstimate");
    }

    @Override // defpackage.d80
    public final void Z(c80 c80Var, cfg cfgVar, boh bohVar) {
        b("onLoadCompleted");
    }

    @Override // defpackage.d80
    public final void a0(c80 c80Var, float f) {
        b("onVolumeChanged");
    }

    public final void b(String str) {
        HashSet u0;
        Object t7oVar;
        if (Intrinsics.d(Thread.currentThread(), this.a.getThread())) {
            return;
        }
        yjj yjjVar = this.b;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                Thread currentThread = Thread.currentThread();
                currentThread.getClass();
                Thread thread = this.a.getThread();
                thread.getClass();
                ((zbl) next).Y(new PlaybackException.WrongCallbackThread(str, currentThread, thread));
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
    }

    @Override // defpackage.d80
    public final void b0(c80 c80Var, int i, long j, long j2) {
        b("onAudioUnderrun");
    }

    @Override // defpackage.d80
    public final void c(c80 c80Var) {
        b("onDrmKeysLoaded");
    }

    @Override // defpackage.d80
    public final void c0(c80 c80Var, boh bohVar) {
        b("onDownstreamFormatChanged");
    }

    @Override // defpackage.d80
    public final void d(c80 c80Var, boolean z) {
        b("onIsPlayingChanged");
    }

    @Override // defpackage.d80
    public final void d0(c80 c80Var, dsc dscVar, tg7 tg7Var) {
        dscVar.getClass();
        b("onVideoInputFormatChanged");
    }

    @Override // defpackage.d80
    public final void e(c80 c80Var, Exception exc) {
        b("onAudioCodecError");
    }

    @Override // defpackage.d80
    public final void e0(c80 c80Var) {
        b("onDrmSessionReleased");
    }

    @Override // defpackage.d80
    public final void f(c80 c80Var, Exception exc) {
        b("onAudioSinkError");
    }

    @Override // defpackage.d80
    public final void g(c80 c80Var, boolean z) {
        b("onSkipSilenceEnabledChanged");
    }

    @Override // defpackage.d80
    public final void h0(c80 c80Var, boolean z) {
        b("onIsLoadingChanged");
    }

    @Override // defpackage.d80
    public final void i(c80 c80Var, p0l p0lVar) {
        p0lVar.getClass();
        b("onPlaybackParametersChanged");
    }

    @Override // defpackage.d80
    public final void i0(c80 c80Var, boolean z, int i) {
        b("onPlayWhenReadyChanged");
    }

    @Override // defpackage.d80
    public final void j(c80 c80Var, cfg cfgVar, boh bohVar, IOException iOException, boolean z) {
        iOException.getClass();
        b("onLoadError");
    }

    @Override // defpackage.d80
    public final void j0(c80 c80Var, hoh hohVar) {
        hohVar.getClass();
        b("onMediaMetadataChanged");
    }

    @Override // defpackage.d80
    public final void k(c80 c80Var, u2i u2iVar) {
        u2iVar.getClass();
        b("onMetadata");
    }

    @Override // defpackage.d80
    public final void k0(c80 c80Var, ig7 ig7Var) {
        ig7Var.getClass();
        b("onAudioDisabled");
    }

    @Override // defpackage.d80
    public final void l(c80 c80Var, Object obj) {
        obj.getClass();
        b("onRenderedFirstFrame");
    }

    @Override // defpackage.d80
    public final void l0(c80 c80Var, e3t e3tVar) {
        e3tVar.getClass();
        b("onTracksChanged");
    }

    @Override // defpackage.d80
    public final void m(c80 c80Var, cfg cfgVar, boh bohVar) {
        b("onLoadStarted");
    }

    @Override // defpackage.d80
    public final void m0(c80 c80Var, Exception exc) {
        exc.getClass();
        b("onDrmSessionManagerError");
    }

    @Override // defpackage.d80
    public final void n(c80 c80Var) {
        b("onPlayerReleased");
    }

    @Override // defpackage.d80
    public final void n0(c80 c80Var, int i) {
        b("onPlaybackSuppressionReasonChanged");
    }

    @Override // defpackage.d80
    public final void o(c80 c80Var, boh bohVar) {
        b("onUpstreamDiscarded");
    }

    @Override // defpackage.d80
    public final void o0(c80 c80Var) {
        b("onDrmKeysRestored");
    }

    @Override // defpackage.d80
    public final void p(c80 c80Var, int i, int i2) {
        b("onSurfaceSizeChanged");
    }

    @Override // defpackage.d80
    public final void p0(c80 c80Var, hzk hzkVar) {
        hzkVar.getClass();
        b("onPlayerError");
    }

    @Override // defpackage.d80
    public final void q(c80 c80Var, dv1 dv1Var) {
        dv1Var.getClass();
        b("onAudioAttributesChanged");
    }

    @Override // defpackage.d80
    public final void r(c80 c80Var) {
        b("onVideoFrameProcessingOffset");
    }

    @Override // defpackage.d80
    public final void s(c80 c80Var, tcu tcuVar) {
        tcuVar.getClass();
        b("onVideoSizeChanged");
    }

    @Override // defpackage.d80
    public final void t(i8l i8lVar, nnk nnkVar) {
        i8lVar.getClass();
        b("onEvents");
    }

    @Override // defpackage.d80
    public final void v(c80 c80Var, onh onhVar, int i) {
        b("onMediaItemTransition");
    }

    @Override // defpackage.d80
    public final void w(c80 c80Var, dsc dscVar, tg7 tg7Var) {
        dscVar.getClass();
        b("onAudioInputFormatChanged");
    }

    @Override // defpackage.d80
    public final void x(c80 c80Var) {
        b("onAudioPositionAdvancing");
    }
}
