package defpackage;

import java.util.LinkedHashMap;
import ru.yandex.video.m3.data.DrmType;
import ru.yandex.video.m3.data.MediaCodecReuseLog;
import ru.yandex.video.m3.data.MediaCodecSelectorLog;
import ru.yandex.video.m3.data.StartFromCacheInfo;
import ru.yandex.video.m3.data.StreamType;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.tracking.LoadCanceled;
import ru.yandex.video.m3.player.tracking.LoadError;
import ru.yandex.video.m3.player.tracks.TrackType;

/* loaded from: classes6.dex */
public interface zbl {
    default void K(TrackType trackType, String str, MediaCodecSelectorLog mediaCodecSelectorLog) {
        trackType.getClass();
        str.getClass();
    }

    default void R(String str, boolean z) {
        str.getClass();
    }

    default void Y(PlaybackException playbackException) {
        playbackException.getClass();
    }

    void a();

    default void d(String str) {
        str.getClass();
    }

    default void g(long j, long j2, String str) {
        str.getClass();
    }

    default void m(iyn iynVar) {
        iynVar.getClass();
    }

    void onStop(boolean z);

    default void u(TrackType trackType, String str) {
        trackType.getClass();
    }

    default void y(DrmType drmType) {
        drmType.getClass();
    }

    default void C() {
    }

    default void S() {
    }

    default void V() {
    }

    default void W() {
    }

    default void e() {
    }

    default void f() {
    }

    default void l() {
    }

    default void q() {
    }

    default void F(long j) {
    }

    default void I(LoadError loadError) {
    }

    default void J(mka mkaVar) {
    }

    default void L(StartFromCacheInfo startFromCacheInfo) {
    }

    default void M(LoadCanceled loadCanceled) {
    }

    default void N(int i) {
    }

    default void O(long j) {
    }

    default void Q(long j) {
    }

    default void U(long j) {
    }

    default void X(PlaybackException playbackException) {
    }

    default void b(String str) {
    }

    default void h(int i) {
    }

    default void i(mka mkaVar) {
    }

    default void n(boolean z) {
    }

    default void p(LinkedHashMap linkedHashMap) {
    }

    default void z(long j) {
    }

    default void A(int i, int i2) {
    }

    default void B(long j, long j2) {
    }

    default void G(long j, TrackType trackType) {
    }

    default void H(TrackType trackType, Integer num) {
    }

    default void T(boolean z, float f) {
    }

    default void j(int i, int i2) {
    }

    default void k(isb isbVar, MediaCodecReuseLog mediaCodecReuseLog) {
    }

    default void r(isb isbVar, MediaCodecReuseLog mediaCodecReuseLog) {
    }

    default void s(VideoType videoType, StreamType streamType) {
    }

    default void t(long j, long j2) {
    }

    default void x(String str, boolean z) {
    }

    default void c(int i, long j, long j2) {
    }
}
