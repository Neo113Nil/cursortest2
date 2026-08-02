package defpackage;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import com.yandex.music.shared.media.session.common.state.a;
import com.yandex.music.shared.playback.api.commands.AwaitPlayerConvergedCommand;
import com.yandex.music.shared.playback.api.commands.PauseCommand;
import com.yandex.music.shared.playback.api.commands.PlayCommand;
import com.yandex.music.shared.playback.api.commands.SeekToPositionCommand;
import com.yandex.music.shared.playback.api.commands.SetPlaybackSpeedCommand;
import com.yandex.music.shared.playback.api.commands.SetVolumeCommand;
import com.yandex.music.shared.playback.utils.api.commands.AwaitQueuePositionCommand;
import com.yandex.music.shared.playback.utils.api.commands.PrevCommand;
import com.yandex.music.shared.playback.utils.api.commands.SeekBackwardByLongTapCommand;
import com.yandex.music.shared.playback.utils.api.commands.SeekForwardByLongTapCommand;
import com.yandex.music.shared.playback.utils.api.commands.SetQueuePositionCommand;
import com.yandex.music.shared.playback.utils.api.commands.SetRepeatModeCommand;
import com.yandex.music.shared.playback.utils.api.commands.SetShuffleCommand;
import com.yandex.music.shared.playback.utils.api.commands.SkipCommand;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.common.media.mediabrowser.MusicBrowserService;

/* loaded from: classes3.dex */
public final class j9l implements i8l {
    public final ris a;
    public final Looper b;
    public final q7l c;
    public final k1l d;
    public final k1l e;
    public final uol f;
    public final g4l g;
    public final f7l h;
    public final s2h i;
    public final igh j;
    public final zgh k;
    public final opg l;
    public final opg m;
    public final jyr n;
    public final jyr o;
    public final jyr p;
    public final CopyOnWriteArrayList q;
    public final tf6 r;
    public lgh s;
    public rar t;
    public final c9l u;
    public final c9l v;

    /* JADX WARN: Type inference failed for: r2v8, types: [c9l] */
    /* JADX WARN: Type inference failed for: r2v9, types: [c9l] */
    public j9l(Looper looper, bsd bsdVar, q7l q7lVar, k1l k1lVar, k1l k1lVar2, uol uolVar, g4l g4lVar, f7l f7lVar, jyr jyrVar, jyr jyrVar2, jyr jyrVar3, s2h s2hVar, igh ighVar, zgh zghVar, opg opgVar, opg opgVar2) {
        looper.getClass();
        this.a = new ris();
        this.b = looper;
        this.c = q7lVar;
        this.d = k1lVar;
        this.e = k1lVar2;
        this.f = uolVar;
        this.g = g4lVar;
        this.h = f7lVar;
        this.i = s2hVar;
        this.j = ighVar;
        this.k = zghVar;
        this.l = opgVar;
        this.m = opgVar2;
        this.n = jyrVar2;
        this.o = jyrVar3;
        this.p = jyrVar;
        this.q = new CopyOnWriteArrayList();
        tf6 e = gld.e(bsdVar.plus(a4g.n()).plus(new im6("SessionPlayerAdapter")));
        this.r = e;
        this.s = lgh.u;
        x97.y(e, null, null, new d7i(this, null, 9), 3);
        final int i = 0;
        this.u = new Function0(this) { // from class: c9l
            public final /* synthetic */ j9l b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ssg.a(3, "SessionPlayerAdapter", "setPlayWhenReady enqueue play command", null);
                        j9l j9lVar = this.b;
                        j9lVar.d.a(new PlayCommand(false), new b3t("core_play"));
                        y60 e2 = j9lVar.k.e();
                        String str = MusicBrowserService.n ? "AndroidAuto" : "OtherMedia";
                        bwf bwfVar = bwf.c;
                        arf g = tlm.g(bwfVar);
                        Map map = (Map) g.getValue();
                        arf g2 = tlm.g(bwfVar);
                        ((Map) g2.getValue()).put(Constants.KEY_ACTION, "play");
                        map.put("MediaSession", g2.isInitialized() ? (Map) g2.getValue() : null);
                        tlm.o(e2, str, g.isInitialized() ? (Map) g.getValue() : null);
                        break;
                    default:
                        ssg.a(3, "SessionPlayerAdapter", "setPlayWhenReady enqueue pause command", null);
                        j9l j9lVar2 = this.b;
                        j9lVar2.d.a(PauseCommand.INSTANCE, new b3t("core_pause"));
                        y60 e3 = j9lVar2.k.e();
                        String str2 = MusicBrowserService.n ? "AndroidAuto" : "OtherMedia";
                        bwf bwfVar2 = bwf.c;
                        arf g3 = tlm.g(bwfVar2);
                        Map map2 = (Map) g3.getValue();
                        arf g4 = tlm.g(bwfVar2);
                        ((Map) g4.getValue()).put(Constants.KEY_ACTION, "pause");
                        map2.put("MediaSession", g4.isInitialized() ? (Map) g4.getValue() : null);
                        tlm.o(e3, str2, g3.isInitialized() ? (Map) g3.getValue() : null);
                        break;
                }
                return Unit.a;
            }
        };
        final int i2 = 1;
        this.v = new Function0(this) { // from class: c9l
            public final /* synthetic */ j9l b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ssg.a(3, "SessionPlayerAdapter", "setPlayWhenReady enqueue play command", null);
                        j9l j9lVar = this.b;
                        j9lVar.d.a(new PlayCommand(false), new b3t("core_play"));
                        y60 e2 = j9lVar.k.e();
                        String str = MusicBrowserService.n ? "AndroidAuto" : "OtherMedia";
                        bwf bwfVar = bwf.c;
                        arf g = tlm.g(bwfVar);
                        Map map = (Map) g.getValue();
                        arf g2 = tlm.g(bwfVar);
                        ((Map) g2.getValue()).put(Constants.KEY_ACTION, "play");
                        map.put("MediaSession", g2.isInitialized() ? (Map) g2.getValue() : null);
                        tlm.o(e2, str, g.isInitialized() ? (Map) g.getValue() : null);
                        break;
                    default:
                        ssg.a(3, "SessionPlayerAdapter", "setPlayWhenReady enqueue pause command", null);
                        j9l j9lVar2 = this.b;
                        j9lVar2.d.a(PauseCommand.INSTANCE, new b3t("core_pause"));
                        y60 e3 = j9lVar2.k.e();
                        String str2 = MusicBrowserService.n ? "AndroidAuto" : "OtherMedia";
                        bwf bwfVar2 = bwf.c;
                        arf g3 = tlm.g(bwfVar2);
                        Map map2 = (Map) g3.getValue();
                        arf g4 = tlm.g(bwfVar2);
                        ((Map) g4.getValue()).put(Constants.KEY_ACTION, "pause");
                        map2.put("MediaSession", g4.isInitialized() ? (Map) g4.getValue() : null);
                        tlm.o(e3, str2, g3.isInitialized() ? (Map) g3.getValue() : null);
                        break;
                }
                return Unit.a;
            }
        };
    }

    public static g8l i1(j9l j9lVar, onh onhVar, long j, int i) {
        return new g8l(j9lVar.a.a, i, onhVar, null, i, j, j, -1, -1);
    }

    @Override // defpackage.i8l
    public final int A() {
        long duration = getDuration();
        if (duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return yhn.d((int) (0 / duration), 0, 100);
    }

    @Override // defpackage.i8l
    public final void A0(List list) {
        list.getClass();
        K0(list, Integer.MAX_VALUE);
    }

    @Override // defpackage.i8l
    public final void B() {
        ssg.a(3, "SessionPlayerAdapter", "seekToPreviousMediaItem()", null);
        this.d.a(PrevCommand.INSTANCE, new b3t("queue_prev"));
        y60 e = this.k.e();
        String str = MusicBrowserService.n ? "AndroidAuto" : "OtherMedia";
        bwf bwfVar = bwf.c;
        arf g = tlm.g(bwfVar);
        Map map = (Map) g.getValue();
        arf g2 = tlm.g(bwfVar);
        ((Map) g2.getValue()).put(Constants.KEY_ACTION, "skipt_to_previous");
        map.put("MediaSession", g2.isInitialized() ? (Map) g2.getValue() : null);
        tlm.o(e, str, g.isInitialized() ? (Map) g.getValue() : null);
    }

    @Override // defpackage.i8l
    public final boolean B0() {
        return c0() == 0;
    }

    @Override // defpackage.i8l
    public final void C() {
        q0(v0());
    }

    @Override // defpackage.i8l
    public final boolean C0() {
        return this.s.r;
    }

    @Override // defpackage.i8l
    public final void D(int i, boolean z) {
        ssg.a(3, "SessionPlayerAdapter", "setDeviceMuted(" + z + ", " + i + ")", null);
        enp enpVar = this.s.s.d;
        if (enpVar != null) {
            enpVar.a.b(z ? -100 : 100);
        }
    }

    @Override // defpackage.i8l
    public final long D0() {
        return 0L;
    }

    @Override // defpackage.i8l
    public final void E() {
        ssg.a(3, "SessionPlayerAdapter", "decreaseDeviceVolume()", null);
        enp enpVar = this.s.s.d;
        if (enpVar != null) {
            enpVar.a.b(-1);
        }
    }

    @Override // defpackage.i8l
    public final void E0(int i) {
        ssg.a(3, "SessionPlayerAdapter", dfi.c(i, "setDeviceVolume(", ")"), null);
        enp enpVar = this.s.s.d;
        if (enpVar != null) {
            enpVar.a.d(i);
        }
    }

    @Override // defpackage.i8l
    public final void F(int i) {
        ssg.a(3, "SessionPlayerAdapter", dfi.c(i, "increaseDeviceVolume(", ")"), null);
        enp enpVar = this.s.s.d;
        if (enpVar != null) {
            enpVar.a.b(1);
        }
    }

    @Override // defpackage.i8l
    public final void F0() {
        ssg.a(3, "SessionPlayerAdapter", "seekForward()", null);
        this.d.a(SeekForwardByLongTapCommand.INSTANCE, new b3t("core_seek"));
    }

    @Override // defpackage.i8l
    public final void G(int i, int i2, List list) {
        list.getClass();
        throw new UnsupportedOperationException("replaceMediaItems() is not supported");
    }

    @Override // defpackage.i8l
    public final void G0() {
        ssg.a(3, "SessionPlayerAdapter", "seekBack()", null);
        this.d.a(SeekBackwardByLongTapCommand.INSTANCE, new b3t("core_seek"));
    }

    @Override // defpackage.i8l
    public final void H(w0t w0tVar) {
        w0tVar.getClass();
    }

    @Override // defpackage.i8l
    public final hoh H0() {
        hoh hohVar;
        onh M0 = M0();
        if (M0 != null && (hohVar = M0.d) != null) {
            return hohVar;
        }
        hoh hohVar2 = hoh.K;
        hohVar2.getClass();
        return hohVar2;
    }

    @Override // defpackage.i8l
    public final void I(int i) {
        throw new UnsupportedOperationException("moveMediaItem() is not supported");
    }

    @Override // defpackage.i8l
    public final void I0(List list) {
        list.getClass();
        ssg.a(3, "SessionPlayerAdapter", dfi.c(list.size(), "addMediaItems(mediaItems size = ", ", resetPosition = true)"), null);
        rar rarVar = this.t;
        if (rarVar != null) {
            rarVar.g(null);
        }
    }

    @Override // defpackage.i8l
    public final void J(int i, int i2) {
        throw new UnsupportedOperationException("removeMediaItems() is not supported");
    }

    @Override // defpackage.i8l
    public final long J0() {
        this.m.getClass();
        if (Boolean.FALSE.booleanValue() && h1() && !d1()) {
            return -1L;
        }
        if (getDuration() == -9223372036854775807L) {
            return 0L;
        }
        return this.f.g();
    }

    @Override // defpackage.i8l
    public final void K() {
        int k;
        if (this.s.b.p()) {
            return;
        }
        a aVar = this.s.b;
        if (aVar.p()) {
            k = -1;
        } else {
            int v0 = v0();
            lgh lghVar = this.s;
            int i = lghVar.q;
            if (i == 1) {
                i = 0;
            }
            k = aVar.k(v0, i, lghVar.r);
        }
        boolean z = k != -1;
        if (h1() && !d1()) {
            if (z) {
                B();
            }
        } else if (!z || J0() > 3500) {
            s(0L);
        } else {
            B();
        }
    }

    @Override // defpackage.i8l
    public final void K0(List list, int i) {
        list.getClass();
        ssg.a(3, "SessionPlayerAdapter", dfi.f("addMediaItems(index = ", i, list.size(), ", mediaItems size = ", ")"), null);
        rar rarVar = this.t;
        if (rarVar != null) {
            rarVar.g(null);
        }
    }

    @Override // defpackage.i8l
    public final void L(boolean z) {
        Continuation continuation = null;
        ssg.a(3, "SessionPlayerAdapter", vz1.q("setPlayWhenReady(", ")", z), null);
        c9l c9lVar = z ? this.u : this.v;
        if (!(this.g.f.a.getValue() instanceof v7q)) {
            c9lVar.invoke();
            return;
        }
        ssg.a(3, "SessionPlayerAdapter", "setPlayWhenReady restore queue", null);
        rar rarVar = this.t;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.t = x97.y(this.r, null, null, new b5l(c9lVar, this, continuation, 2), 3);
    }

    @Override // defpackage.i8l
    public final long L0() {
        return 3000L;
    }

    @Override // defpackage.i8l
    public final void M() {
        ssg.a(3, "SessionPlayerAdapter", "seekToNextMediaItem()", null);
        this.d.a(new SkipCommand(), new b3t("queue_skip"));
        y60 e = this.k.e();
        String str = MusicBrowserService.n ? "AndroidAuto" : "OtherMedia";
        bwf bwfVar = bwf.c;
        arf g = tlm.g(bwfVar);
        Map map = (Map) g.getValue();
        arf g2 = tlm.g(bwfVar);
        ((Map) g2.getValue()).put(Constants.KEY_ACTION, "skip_to_next");
        map.put("MediaSession", g2.isInitialized() ? (Map) g2.getValue() : null);
        tlm.o(e, str, g.isInitialized() ? (Map) g.getValue() : null);
    }

    @Override // defpackage.i8l
    public final onh M0() {
        a aVar = this.s.b;
        if (aVar.p()) {
            return null;
        }
        int v0 = v0();
        ris risVar = this.a;
        aVar.m(v0, risVar, 0L);
        return risVar.c;
    }

    @Override // defpackage.i8l
    public final void N(int i) {
        ssg.a(3, "SessionPlayerAdapter", dfi.c(i, "decreaseDeviceVolume(", ")"), null);
        enp enpVar = this.s.s.d;
        if (enpVar != null) {
            enpVar.a.b(-1);
        }
    }

    @Override // defpackage.i8l
    public final e3t O() {
        e3t e3tVar = e3t.b;
        e3tVar.getClass();
        return e3tVar;
    }

    @Override // defpackage.i8l
    public final void P(dv1 dv1Var, boolean z) {
        dfi.r("setAudioAttributes is not available", "SessionPlayerAdapter");
    }

    @Override // defpackage.i8l
    public final int R() {
        return -1;
    }

    @Override // defpackage.i8l
    public final void S(boolean z) {
        ssg.a(3, "SessionPlayerAdapter", vz1.q("setDeviceMuted(", ")", z), null);
        enp enpVar = this.s.s.d;
        if (enpVar != null) {
            enpVar.a.b(z ? -100 : 100);
        }
    }

    @Override // defpackage.i8l
    public final void T(onh onhVar) {
        onhVar.getClass();
        I0(t75.c(onhVar));
    }

    @Override // defpackage.i8l
    public final int U() {
        return this.s.j;
    }

    @Override // defpackage.i8l
    public final sis V() {
        return this.s.c;
    }

    @Override // defpackage.i8l
    public final boolean V0(int i) {
        return this.s.e.a(i);
    }

    @Override // defpackage.i8l
    public final void W(int i, onh onhVar) {
        onhVar.getClass();
        throw new UnsupportedOperationException("replaceMediaItem() is not supported");
    }

    @Override // defpackage.i8l
    public final boolean W0() {
        a aVar = this.s.b;
        if (aVar.p()) {
            return false;
        }
        int v0 = v0();
        ris risVar = this.a;
        aVar.m(v0, risVar, 0L);
        return risVar.i;
    }

    @Override // defpackage.i8l
    public final Looper X() {
        return this.b;
    }

    @Override // defpackage.i8l
    public final void Y() {
        ssg.a(3, "SessionPlayerAdapter", "increaseDeviceVolume()", null);
        enp enpVar = this.s.s.d;
        if (enpVar != null) {
            enpVar.a.b(1);
        }
    }

    @Override // defpackage.i8l
    public final w0t Z() {
        w0t w0tVar = w0t.G;
        w0tVar.getClass();
        return w0tVar;
    }

    @Override // defpackage.i8l
    public final void a0(int i, long j, List list) {
        list.getClass();
        ssg.a(3, "SessionPlayerAdapter", hrg.m(j, ")", dfi.l("addMediaItems(mediaItems size = ", list.size(), i, ", startIndex = ", ", startPositionMs = ")), null);
        rar rarVar = this.t;
        if (rarVar != null) {
            rarVar.g(null);
        }
    }

    @Override // defpackage.i8l
    public final void b() {
        L(false);
    }

    @Override // defpackage.i8l
    public final void b0() {
        if (this.s.b.p()) {
            return;
        }
        M();
    }

    @Override // defpackage.i8l
    public final int c() {
        return this.s.i;
    }

    @Override // defpackage.i8l
    public final int c0() {
        return this.s.s.b;
    }

    @Override // defpackage.i8l
    public final void d() {
        L(true);
    }

    @Override // defpackage.i8l
    public final long d0() {
        a aVar = this.s.b;
        if (!aVar.p()) {
            int v0 = v0();
            ris risVar = this.a;
            aVar.m(v0, risVar, 0L);
            if (risVar.f != -9223372036854775807L) {
                return (dvt.H(risVar.g) - risVar.f) - J0();
            }
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.i8l
    public final boolean d1() {
        a aVar = this.s.b;
        if (aVar.p()) {
            return false;
        }
        int v0 = v0();
        ris risVar = this.a;
        aVar.m(v0, risVar, 0L);
        return risVar.h;
    }

    @Override // defpackage.i8l
    public final boolean e() {
        return this.s.m;
    }

    @Override // defpackage.i8l
    public final void e0(int i, long j) {
        StringBuilder sb = new StringBuilder("seekTo(mediaItemIndex=");
        sb.append(i);
        sb.append(", positionMs=");
        sb.append(j);
        v3w.m(sb, ")", 3, "SessionPlayerAdapter", null);
        if (i >= 0 && i < this.s.b.e.a()) {
            SetQueuePositionCommand setQueuePositionCommand = new SetQueuePositionCommand(i);
            if (j == -9223372036854775807L) {
                this.d.a(setQueuePositionCommand, new b3t("core_seek"));
                return;
            } else {
                this.e.b(new eyk(u75.h(setQueuePositionCommand, new AwaitQueuePositionCommand(i), new AwaitPlayerConvergedCommand(false), new SeekToPositionCommand(j))), new b3t("core_seek"));
                return;
            }
        }
        hzk hzkVar = new hzk(dfi.f("seekTo(mediaItemIndex=", i, this.s.b.e.a(), ") failed. Index out of bounds [0,", ")"), null, 1004);
        ssg.a(6, "SessionPlayerAdapter", "seekTo(mediaItemIndex=" + i + ", positionMs=" + j + ") failed", hzkVar);
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            ((f8l) it.next()).L(hzkVar);
        }
    }

    @Override // defpackage.i8l
    public final boolean f() {
        return this.s.n;
    }

    @Override // defpackage.i8l
    public final d8l f0() {
        return this.s.e;
    }

    @Override // defpackage.i8l
    public final int g() {
        return this.s.q;
    }

    @Override // defpackage.i8l
    public final boolean g0() {
        return this.s.k;
    }

    @Override // defpackage.i8l
    public final long getDuration() {
        return dvt.m0(this.a.m);
    }

    @Override // defpackage.i8l
    public final float getVolume() {
        return this.s.p.a;
    }

    @Override // defpackage.i8l
    public final void h(Surface surface) {
        dfi.r("clearVideoSurface is not available", "SessionPlayerAdapter");
    }

    @Override // defpackage.i8l
    public final void h0(boolean z) {
        ssg.a(3, "SessionPlayerAdapter", vz1.q("setShuffleModeEnabled(", ")", z), null);
        this.d.a(new SetShuffleCommand(z), new b3t("queue_shuffle"));
        y60 e = this.k.e();
        String str = MusicBrowserService.n ? "AndroidAuto" : "OtherMedia";
        arf g = tlm.g(bwf.c);
        Map map = (Map) g.getValue();
        ub ubVar = new ub();
        ubVar.c(new String[]{Constants.KEY_ACTION, "shuffle"}, z ? "on" : "off");
        map.put("MediaSession", ubVar.b());
        tlm.o(e, str, g.isInitialized() ? (Map) g.getValue() : null);
    }

    @Override // defpackage.i8l
    public final boolean h1() {
        a aVar = this.s.b;
        if (aVar.p()) {
            return false;
        }
        int v0 = v0();
        ris risVar = this.a;
        aVar.m(v0, risVar, 0L);
        return risVar.a();
    }

    @Override // defpackage.i8l
    public final boolean i() {
        return false;
    }

    @Override // defpackage.i8l
    public final long i0() {
        return 3500L;
    }

    @Override // defpackage.i8l
    public final void j(SurfaceView surfaceView) {
        dfi.r("clearVideoSurface is not available", "SessionPlayerAdapter");
    }

    @Override // defpackage.i8l
    public final void j0(f8l f8lVar) {
        f8lVar.getClass();
        this.q.add(f8lVar);
    }

    @Override // defpackage.i8l
    public final hzk k() {
        if (this.s.t != null) {
            return new hzk(this.s.t, null, -2);
        }
        return null;
    }

    @Override // defpackage.i8l
    public final int k0() {
        return v0();
    }

    @Override // defpackage.i8l
    public final sv6 l() {
        sv6 sv6Var = sv6.c;
        sv6Var.getClass();
        return sv6Var;
    }

    @Override // defpackage.i8l
    public final tcu l0() {
        return tcu.d;
    }

    @Override // defpackage.i8l
    public final p0l m() {
        return new p0l(this.s.o.a);
    }

    @Override // defpackage.i8l
    public final dv1 m0() {
        return new dv1(2, 0, 1, 1, 0);
    }

    @Override // defpackage.i8l
    public final void n(TextureView textureView) {
        dfi.r("clearVideoSurface is not available", "SessionPlayerAdapter");
    }

    @Override // defpackage.i8l
    public final p08 n0() {
        return this.s.s.a;
    }

    @Override // defpackage.i8l
    public final long o() {
        a aVar = this.s.b;
        if (aVar.p()) {
            return -9223372036854775807L;
        }
        int v0 = v0();
        ris risVar = this.a;
        aVar.m(v0, risVar, 0L);
        long m0 = dvt.m0(risVar.m);
        long duration = getDuration();
        return m0 < duration ? duration : m0;
    }

    @Override // defpackage.i8l
    public final void o0(int i, int i2) {
        enp enpVar = this.s.s.d;
        if (enpVar != null) {
            enpVar.a.d(i);
        }
    }

    @Override // defpackage.i8l
    public final void p(TextureView textureView) {
        dfi.r("clearVideoSurface is not available", "SessionPlayerAdapter");
    }

    @Override // defpackage.i8l
    public final int p0() {
        return -1;
    }

    @Override // defpackage.i8l
    public final void q0(int i) {
        e0(i, -9223372036854775807L);
    }

    @Override // defpackage.i8l
    public final void r(p0l p0lVar) {
        ssg.a(3, "SessionPlayerAdapter", "setPlaybackParameters(" + p0lVar + ")", null);
        this.d.a(new SetPlaybackSpeedCommand(new h4q(p0lVar.a)), new b3t("core_speed"));
    }

    @Override // defpackage.i8l
    public final long r0() {
        return 3000L;
    }

    @Override // defpackage.i8l
    public final void s(long j) {
        ssg.a(3, "SessionPlayerAdapter", dfi.e(j, "seekTo(", ")"), null);
        this.d.a(new SeekToPositionCommand(j), new b3t("core_seek"));
        y60 e = this.k.e();
        String str = MusicBrowserService.n ? "AndroidAuto" : "OtherMedia";
        bwf bwfVar = bwf.c;
        arf g = tlm.g(bwfVar);
        Map map = (Map) g.getValue();
        arf g2 = tlm.g(bwfVar);
        ((Map) g2.getValue()).put(Constants.KEY_ACTION, "seek");
        map.put("MediaSession", g2.isInitialized() ? (Map) g2.getValue() : null);
        tlm.o(e, str, g.isInitialized() ? (Map) g.getValue() : null);
    }

    @Override // defpackage.i8l
    public final long s0() {
        return J0();
    }

    @Override // defpackage.i8l
    public final void stop() {
        ssg.a(3, "SessionPlayerAdapter", "stop()", null);
        L(false);
    }

    @Override // defpackage.i8l
    public final void t(float f) {
        ssg.a(3, "SessionPlayerAdapter", ouj.m("setVolume(", f, ")"), null);
        this.d.a(new SetVolumeCommand(new n4q(f)), a3t.a);
    }

    @Override // defpackage.i8l
    public final long t0() {
        return 0L;
    }

    @Override // defpackage.i8l
    public final void u(float f) {
        r(m().a(f));
    }

    @Override // defpackage.i8l
    public final hoh u0() {
        hoh hohVar = hoh.K;
        hohVar.getClass();
        return hohVar;
    }

    @Override // defpackage.i8l
    public final void v(SurfaceView surfaceView) {
        dfi.r("clearVideoSurface is not available", "SessionPlayerAdapter");
    }

    @Override // defpackage.i8l
    public final int v0() {
        Integer valueOf = Integer.valueOf(this.s.a);
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return -1;
    }

    @Override // defpackage.i8l
    public final long w() {
        return -9223372036854775807L;
    }

    @Override // defpackage.i8l
    public final void w0(int i) {
        ssg.a(3, "SessionPlayerAdapter", dfi.c(i, "setRepeatMode(", ")"), null);
        nyn nynVar = i != 0 ? i != 1 ? i != 2 ? nyn.a : nyn.c : nyn.b : nyn.a;
        this.d.a(new SetRepeatModeCommand(nynVar), new b3t("queue_repeat"));
        zgh zghVar = this.k;
        zghVar.getClass();
        zghVar.j(nynVar, false);
    }

    @Override // defpackage.i8l
    public final void x(onh onhVar, long j) {
        onhVar.getClass();
        a0(0, j, t75.c(onhVar));
    }

    @Override // defpackage.i8l
    public final void x0(f8l f8lVar) {
        f8lVar.getClass();
        this.q.remove(f8lVar);
    }

    @Override // defpackage.i8l
    public final void y() {
        ssg.a(3, "SessionPlayerAdapter", "clearMediaItems()", null);
        tiw tiwVar = (tiw) this.o.getValue();
        tiwVar.getClass();
        ssg.a(3, tiw.b, "media notification removed: Callback.onStop", null);
        xdr xdrVar = tiwVar.a;
        Boolean bool = Boolean.FALSE;
        xdrVar.getClass();
        xdrVar.m(null, bool);
        this.c.a();
        y60 e = this.k.e();
        String str = MusicBrowserService.n ? "AndroidAuto" : "OtherMedia";
        bwf bwfVar = bwf.c;
        arf g = tlm.g(bwfVar);
        Map map = (Map) g.getValue();
        arf g2 = tlm.g(bwfVar);
        ((Map) g2.getValue()).put(Constants.KEY_ACTION, "stop");
        map.put("MediaSession", g2.isInitialized() ? (Map) g2.getValue() : null);
        tlm.o(e, str, g.isInitialized() ? (Map) g.getValue() : null);
    }

    @Override // defpackage.i8l
    public final void y0(int i, int i2) {
        if (i == i2) {
            return;
        }
        z0(i, i + 1, i2);
        throw null;
    }

    @Override // defpackage.i8l
    public final void z0(int i, int i2, int i3) {
        throw new UnsupportedOperationException("moveMediaItems() is not supported");
    }

    @Override // defpackage.i8l
    public final void a() {
    }

    @Override // defpackage.i8l
    public final void q() {
    }

    @Override // defpackage.i8l
    public final void Q(hoh hohVar) {
    }
}
