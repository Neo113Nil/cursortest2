package defpackage;

import java.util.LinkedHashMap;
import ru.yandex.video.m3.data.DrmType;
import ru.yandex.video.m3.data.ExtendedStalledReason;
import ru.yandex.video.m3.data.MediaCodecReuseLog;
import ru.yandex.video.m3.data.MediaCodecSelectorLog;
import ru.yandex.video.m3.data.RecoverDetails;
import ru.yandex.video.m3.data.Size;
import ru.yandex.video.m3.data.StalledReason;
import ru.yandex.video.m3.data.StartFromCacheInfo;
import ru.yandex.video.m3.data.StreamType;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PreparingParams;
import ru.yandex.video.m3.player.tracking.FullscreenDataBundle;
import ru.yandex.video.m3.player.tracking.LoadCanceled;
import ru.yandex.video.m3.player.tracking.LoadError;
import ru.yandex.video.m3.player.tracks.TrackType;

/* loaded from: classes6.dex */
public interface u9l {
    default void K(TrackType trackType, String str, MediaCodecSelectorLog mediaCodecSelectorLog) {
        trackType.getClass();
        str.getClass();
    }

    default void d(String str) {
        str.getClass();
    }

    default void d0(StalledReason stalledReason) {
        stalledReason.getClass();
    }

    default void e0(String str) {
        str.getClass();
    }

    default void g(long j, long j2, String str) {
        str.getClass();
    }

    default void j(PreparingParams preparingParams) {
        preparingParams.getClass();
    }

    default void j0(FullscreenDataBundle fullscreenDataBundle) {
        fullscreenDataBundle.getClass();
    }

    default void q0(PlaybackException playbackException, RecoverDetails recoverDetails) {
        recoverDetails.getClass();
    }

    default void u(TrackType trackType, String str) {
        trackType.getClass();
    }

    default void y(DrmType drmType) {
        drmType.getClass();
    }

    default void V() {
    }

    default void Z() {
    }

    default void p0() {
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

    default void S(Integer num) {
    }

    default void W(boolean z) {
    }

    default void Y(long j) {
    }

    default void a0(ExtendedStalledReason extendedStalledReason) {
    }

    default void b(String str) {
    }

    default void c0(String str) {
    }

    default void f0(Size size) {
    }

    default void h(int i) {
    }

    default void i(mka mkaVar) {
    }

    default void k0(gfc gfcVar) {
    }

    default void n0(PlaybackException playbackException) {
    }

    default void o0(Size size) {
    }

    default void p(LinkedHashMap linkedHashMap) {
    }

    default void B(long j, long j2) {
    }

    default void G(long j, TrackType trackType) {
    }

    default void H(TrackType trackType, Integer num) {
    }

    default void k(isb isbVar, MediaCodecReuseLog mediaCodecReuseLog) {
    }

    default void l0(PlaybackException playbackException, String str) {
    }

    default void r(isb isbVar, MediaCodecReuseLog mediaCodecReuseLog) {
    }

    default void s(VideoType videoType, StreamType streamType) {
    }

    default void x(String str, boolean z) {
    }

    default void c(int i, long j, long j2) {
    }
}
