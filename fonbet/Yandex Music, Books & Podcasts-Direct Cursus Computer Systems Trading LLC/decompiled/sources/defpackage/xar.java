package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.g;
import ru.yandex.video.m3.data.PlaybackParameters;
import ru.yandex.video.m3.data.PlaybackStats;
import ru.yandex.video.m3.data.PlaybackViewState;
import ru.yandex.video.m3.data.StreamType;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.AbrPreferences;
import ru.yandex.video.m3.player.PreparingParams;

/* loaded from: classes6.dex */
public final class xar implements paw {
    public final String a;
    public final int b;
    public final olr c;
    public final xdh d;
    public final g46 e;
    public final vpl f;
    public final yjj g;
    public final yjj h;
    public final yjj i;
    public final mar j;
    public final AbrPreferences k;
    public final AtomicBoolean l;
    public final var m;
    public PreparingParams n;
    public VideoData o;
    public final fyn p;

    public xar(String str, int i, c5p c5pVar, olr olrVar, xdh xdhVar, g46 g46Var, vpl vplVar) {
        this.a = str;
        this.b = i;
        this.c = olrVar;
        this.d = xdhVar;
        this.e = g46Var;
        this.f = vplVar;
        yjj yjjVar = new yjj();
        this.g = yjjVar;
        yjj yjjVar2 = new yjj();
        this.h = yjjVar2;
        yjj yjjVar3 = new yjj();
        this.i = yjjVar3;
        mar marVar = new mar();
        marVar.t0(this);
        this.j = marVar;
        AbrPreferences.Companion.getClass();
        this.k = new AbrPreferences(null, Boolean.FALSE, null, false, null);
        this.l = new AtomicBoolean(false);
        this.m = new var(this);
        yjjVar3.a(new tlr(this, olrVar));
        yjjVar3.a(new qwe(this, yjjVar, yjjVar2));
        this.p = fyn.a;
    }

    @Override // defpackage.paw
    public final PlaybackViewState A() {
        aqd aqdVar = new aqd(17, false);
        aqdVar.b = Boolean.FALSE;
        aqdVar.c = null;
        Boolean bool = (Boolean) aqdVar.b;
        return new PlaybackViewState(bool != null ? bool.booleanValue() : false, (Integer) aqdVar.c, null);
    }

    @Override // defpackage.paw
    public final VideoType B() {
        return null;
    }

    @Override // defpackage.paw
    public final nqs C() {
        return null;
    }

    @Override // defpackage.paw
    public final String D() {
        return this.a;
    }

    @Override // defpackage.paw
    public final long E() {
        return -1L;
    }

    @Override // defpackage.paw
    public final void F(rgl rglVar) {
        rglVar.getClass();
        this.g.e(rglVar);
    }

    @Override // defpackage.paw
    public final VideoData G() {
        return this.o;
    }

    @Override // defpackage.paw
    public final void H(String str, PlaybackParameters playbackParameters) {
        str.getClass();
        playbackParameters.getClass();
    }

    @Override // defpackage.paw
    public final void I(rgl rglVar) {
        rglVar.getClass();
        this.g.a(rglVar);
    }

    @Override // defpackage.paw
    public final /* bridge */ /* synthetic */ Object J() {
        return Unit.a;
    }

    @Override // defpackage.paw
    public final boolean c() {
        return ((Boolean) x97.D(g.a, new war(this, null, 7))).booleanValue();
    }

    @Override // defpackage.paw
    public final boolean e() {
        return ((Boolean) x97.D(g.a, new war(this, null, 8))).booleanValue();
    }

    @Override // defpackage.paw
    public final nqs f() {
        return null;
    }

    @Override // defpackage.paw
    public final iyn g() {
        return this.p;
    }

    @Override // defpackage.paw
    public final long getPosition() {
        return ((Number) x97.D(g.a, new war(this, null, 4))).longValue();
    }

    @Override // defpackage.paw
    public final float getVolume() {
        return ((Number) x97.D(g.a, new war(this, null, 6))).floatValue();
    }

    @Override // defpackage.paw
    public final float h() {
        return ((Number) x97.D(g.a, new war(this, null, 2))).floatValue();
    }

    @Override // defpackage.paw
    public final boolean i() {
        return false;
    }

    @Override // defpackage.paw
    public final PlaybackStats j() {
        return (PlaybackStats) x97.D(g.a, new war(this, null, 3));
    }

    @Override // defpackage.paw
    public final int l() {
        return this.b;
    }

    @Override // defpackage.paw
    public final StreamType m() {
        return null;
    }

    @Override // defpackage.paw
    public final long o() {
        return ((Number) x97.D(g.a, new war(this, null, 1))).longValue();
    }

    @Override // defpackage.paw
    public final void q(u9l u9lVar) {
        u9lVar.getClass();
        this.h.e(u9lVar);
    }

    @Override // defpackage.paw
    public final long v() {
        return ((Number) x97.D(g.a, new war(this, null, 5))).longValue();
    }

    @Override // defpackage.paw
    public final void w(u9l u9lVar) {
        u9lVar.getClass();
        this.h.a(u9lVar);
    }

    @Override // defpackage.paw
    public final nqs x() {
        return null;
    }

    @Override // defpackage.paw
    public final void y(VideoData videoData, PlaybackParameters playbackParameters) {
        playbackParameters.getClass();
    }

    @Override // defpackage.paw
    public final long z() {
        return ((Number) x97.D(g.a, new war(this, null, 0))).longValue();
    }

    @Override // defpackage.paw
    public final void a() {
    }

    @Override // defpackage.paw
    public final void b() {
    }

    @Override // defpackage.paw
    public final void d() {
    }

    @Override // defpackage.paw
    public final void k() {
    }

    @Override // defpackage.paw
    public final void stop() {
    }

    @Override // defpackage.paw
    public final void r(iyn iynVar) {
    }

    @Override // defpackage.paw
    public final void s(long j) {
    }

    @Override // defpackage.paw
    public final void t(float f) {
    }

    @Override // defpackage.paw
    public final void u(float f) {
    }

    @Override // defpackage.paw
    public final void p(int i, int i2) {
    }
}
