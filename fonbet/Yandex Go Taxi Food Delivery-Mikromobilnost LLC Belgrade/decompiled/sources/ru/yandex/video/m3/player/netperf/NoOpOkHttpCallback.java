package ru.yandex.video.m3.player.netperf;

import defpackage.al7;
import defpackage.kvj0;
import defpackage.yf7;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/yandex/video/m3/player/netperf/NoOpOkHttpCallback;", "Lal7;", "<init>", "()V", "Lyf7;", "call", "Lkvj0;", "response", "Lzy11;", "onResponse", "(Lyf7;Lkvj0;)V", "Ljava/io/IOException;", "e", "onFailure", "(Lyf7;Ljava/io/IOException;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpOkHttpCallback implements al7 {
    public static final int $stable = 0;

    @Override // defpackage.al7
    public void onFailure(yf7 call, IOException e) {
    }

    @Override // defpackage.al7
    public void onResponse(yf7 call, kvj0 response) {
    }
}
