package ru.yandex.video.m3.player.bandwidth;

import defpackage.ep4;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0004¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/bandwidth/ProgressAccumulatorNotifier;", "", "Lzy11;", "responseStart", "()V", "Lep4;", "bandwidthInfo", "responseProgress", "(Lep4;)V", "responseEnd", "process", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ProgressAccumulatorNotifier {
    void process();

    void responseEnd();

    void responseProgress(ep4 bandwidthInfo);

    void responseStart();
}
