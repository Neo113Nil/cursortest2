package defpackage;

import ru.yandex.video.m3.data.PlaybackParameters;
import ru.yandex.video.m3.data.PlaybackStats;
import ru.yandex.video.m3.data.PlaybackViewState;
import ru.yandex.video.m3.data.StreamType;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.data.dto.VideoData;

/* loaded from: classes6.dex */
public interface paw {
    PlaybackViewState A();

    VideoType B();

    nqs C();

    String D();

    long E();

    void F(rgl rglVar);

    VideoData G();

    void H(String str, PlaybackParameters playbackParameters);

    void I(rgl rglVar);

    Object J();

    void a();

    void b();

    boolean c();

    void d();

    boolean e();

    nqs f();

    iyn g();

    long getPosition();

    float getVolume();

    float h();

    boolean i();

    PlaybackStats j();

    void k();

    int l();

    StreamType m();

    default String n() {
        return null;
    }

    long o();

    void p(int i, int i2);

    void q(u9l u9lVar);

    void r(iyn iynVar);

    void s(long j);

    void stop();

    void t(float f);

    void u(float f);

    long v();

    void w(u9l u9lVar);

    nqs x();

    void y(VideoData videoData, PlaybackParameters playbackParameters);

    long z();
}
