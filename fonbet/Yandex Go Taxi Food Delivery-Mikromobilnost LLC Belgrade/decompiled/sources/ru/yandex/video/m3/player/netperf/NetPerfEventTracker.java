package ru.yandex.video.m3.player.netperf;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\bJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H&¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0004H&¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0004H&¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H&¢\u0006\u0004\b\u0015\u0010\bJ!\u0010\u0018\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H&¢\u0006\u0004\b\u001c\u0010\b\u0082\u0001\u0001\u001d¨\u0006\u001eÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/netperf/NetPerfEventTracker;", "", "", "url", "Lzy11;", "onNetworkCallStart", "(Ljava/lang/String;)V", "onDnsResolveStart", "()V", "onDnsResolveEnd", "onConnectStart", "onSecureConnectStart", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL, "onConnectEnd", "onConnectionAcquired", "onRequestHeadersStart", "onResponseHeadersStart", "", "byteCount", "onResponseBodyEnd", "(J)V", "onConnectionReleased", "Ljava/io/IOException;", "ioe", "onConnectFailed", "(Ljava/lang/String;Ljava/io/IOException;)V", "onNetworkCallFailed", "(Ljava/io/IOException;)V", "onNetworkCallEnd", "Lru/yandex/video/m3/player/netperf/NetPerfEventTrackerImpl;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface NetPerfEventTracker {
    void onConnectEnd(String protocol);

    void onConnectFailed(String protocol, IOException ioe);

    void onConnectStart();

    void onConnectionAcquired();

    void onConnectionReleased();

    void onDnsResolveEnd();

    void onDnsResolveStart();

    void onNetworkCallEnd();

    void onNetworkCallFailed(IOException ioe);

    void onNetworkCallStart(String url);

    void onRequestHeadersStart();

    void onResponseBodyEnd(long byteCount);

    void onResponseHeadersStart();

    void onSecureConnectStart();
}
