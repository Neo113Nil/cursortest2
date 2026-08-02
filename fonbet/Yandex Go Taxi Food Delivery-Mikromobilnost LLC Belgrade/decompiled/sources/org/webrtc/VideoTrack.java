package org.webrtc;

import defpackage.ny61;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class VideoTrack extends MediaStreamTrack {
    private final IdentityHashMap<VideoSink, Long> sinks;

    public VideoTrack(long j) {
        super(j);
        this.sinks = new IdentityHashMap<>();
    }

    private static native void nativeAddSink(long j, long j2);

    private static native void nativeFreeSink(long j);

    private static native boolean nativeGetShouldReceive(long j);

    private static native void nativeRemoveSink(long j, long j2);

    private static native void nativeSetShouldReceive(long j, boolean z);

    private static native long nativeWrapSink(VideoSink videoSink);

    public void addSink(VideoSink videoSink) {
        if (videoSink == null) {
            ny61.g("The VideoSink is not allowed to be null");
        } else {
            if (this.sinks.containsKey(videoSink)) {
                return;
            }
            long nativeWrapSink = nativeWrapSink(videoSink);
            this.sinks.put(videoSink, Long.valueOf(nativeWrapSink));
            nativeAddSink(getNativeMediaStreamTrack(), nativeWrapSink);
        }
    }

    @Override // org.webrtc.MediaStreamTrack
    public void dispose() {
        Iterator<Long> it = this.sinks.values().iterator();
        while (it.hasNext()) {
            long longValue = it.next().longValue();
            nativeRemoveSink(getNativeMediaStreamTrack(), longValue);
            nativeFreeSink(longValue);
        }
        this.sinks.clear();
        super.dispose();
    }

    public long getNativeVideoTrack() {
        return getNativeMediaStreamTrack();
    }

    public void removeSink(VideoSink videoSink) {
        Long remove = this.sinks.remove(videoSink);
        if (remove != null) {
            nativeRemoveSink(getNativeMediaStreamTrack(), remove.longValue());
            nativeFreeSink(remove.longValue());
        }
    }

    public void setShouldReceive(boolean z) {
        nativeSetShouldReceive(getNativeMediaStreamTrack(), z);
    }

    public boolean shouldReceive() {
        return nativeGetShouldReceive(getNativeMediaStreamTrack());
    }
}
