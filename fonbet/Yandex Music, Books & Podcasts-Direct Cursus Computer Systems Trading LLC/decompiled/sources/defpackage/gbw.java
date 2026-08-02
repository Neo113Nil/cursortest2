package defpackage;

import ru.yandex.video.m3.data.PlaybackParameters;
import ru.yandex.video.m3.data.PlaybackStats;
import ru.yandex.video.m3.data.PlaybackViewState;
import ru.yandex.video.m3.data.StreamType;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.data.dto.VideoData;

/* loaded from: classes4.dex */
public final class gbw implements paw {
    public final /* synthetic */ paw a;
    public boolean b;
    public final /* synthetic */ paw c;

    public gbw(paw pawVar) {
        this.c = pawVar;
        this.a = pawVar;
    }

    @Override // defpackage.paw
    public final PlaybackViewState A() {
        return this.a.A();
    }

    @Override // defpackage.paw
    public final VideoType B() {
        return this.a.B();
    }

    @Override // defpackage.paw
    public final nqs C() {
        return this.a.C();
    }

    @Override // defpackage.paw
    public final String D() {
        return this.a.D();
    }

    @Override // defpackage.paw
    public final long E() {
        return this.a.E();
    }

    @Override // defpackage.paw
    public final void F(rgl rglVar) {
        rglVar.getClass();
        this.a.F(rglVar);
    }

    @Override // defpackage.paw
    public final VideoData G() {
        return this.a.G();
    }

    @Override // defpackage.paw
    public final void H(String str, PlaybackParameters playbackParameters) {
        str.getClass();
        playbackParameters.getClass();
        if (this.b) {
            su4.s(2, null, "try prepare released player", null);
        } else {
            this.c.H(str, playbackParameters);
        }
    }

    @Override // defpackage.paw
    public final void I(rgl rglVar) {
        rglVar.getClass();
        this.a.I(rglVar);
    }

    @Override // defpackage.paw
    public final Object J() {
        return this.a.J();
    }

    @Override // defpackage.paw
    public final void a() {
        if (this.b) {
            su4.s(2, null, "try release already released player", null);
        } else {
            this.b = true;
            this.c.a();
        }
    }

    @Override // defpackage.paw
    public final void b() {
        if (this.b) {
            su4.s(2, null, "try pause released player", null);
        } else {
            this.c.b();
        }
    }

    @Override // defpackage.paw
    public final boolean c() {
        return this.a.c();
    }

    @Override // defpackage.paw
    public final void d() {
        if (this.b) {
            su4.s(2, null, "try play released player", null);
        } else {
            this.c.d();
        }
    }

    @Override // defpackage.paw
    public final boolean e() {
        return this.a.e();
    }

    @Override // defpackage.paw
    public final nqs f() {
        return this.a.f();
    }

    @Override // defpackage.paw
    public final iyn g() {
        return this.a.g();
    }

    @Override // defpackage.paw
    public final long getPosition() {
        return this.a.getPosition();
    }

    @Override // defpackage.paw
    public final float getVolume() {
        return this.a.getVolume();
    }

    @Override // defpackage.paw
    public final float h() {
        return this.a.h();
    }

    @Override // defpackage.paw
    public final boolean i() {
        return this.a.i();
    }

    @Override // defpackage.paw
    public final PlaybackStats j() {
        return this.a.j();
    }

    @Override // defpackage.paw
    public final void k() {
        this.a.k();
    }

    @Override // defpackage.paw
    public final int l() {
        return this.a.l();
    }

    @Override // defpackage.paw
    public final StreamType m() {
        return this.a.m();
    }

    @Override // defpackage.paw
    public final String n() {
        return this.a.n();
    }

    @Override // defpackage.paw
    public final long o() {
        return this.a.o();
    }

    @Override // defpackage.paw
    public final void p(int i, int i2) {
        this.a.p(i, i2);
    }

    @Override // defpackage.paw
    public final void q(u9l u9lVar) {
        u9lVar.getClass();
        this.a.q(u9lVar);
    }

    @Override // defpackage.paw
    public final void r(iyn iynVar) {
        this.a.r(iynVar);
    }

    @Override // defpackage.paw
    public final void s(long j) {
        if (this.b) {
            su4.s(2, null, "try seekTo released player", null);
        } else {
            this.c.s(j);
        }
    }

    @Override // defpackage.paw
    public final void stop() {
        if (this.b) {
            su4.s(2, null, "try stop released player", null);
        } else {
            this.c.stop();
        }
    }

    @Override // defpackage.paw
    public final void t(float f) {
        this.a.t(f);
    }

    @Override // defpackage.paw
    public final void u(float f) {
        this.a.u(f);
    }

    @Override // defpackage.paw
    public final long v() {
        return this.a.v();
    }

    @Override // defpackage.paw
    public final void w(u9l u9lVar) {
        u9lVar.getClass();
        this.a.w(u9lVar);
    }

    @Override // defpackage.paw
    public final nqs x() {
        return this.a.x();
    }

    @Override // defpackage.paw
    public final void y(VideoData videoData, PlaybackParameters playbackParameters) {
        playbackParameters.getClass();
        if (this.b) {
            su4.s(2, null, "try prepare released player", null);
        } else {
            this.c.y(videoData, playbackParameters);
        }
    }

    @Override // defpackage.paw
    public final long z() {
        return this.a.z();
    }
}
