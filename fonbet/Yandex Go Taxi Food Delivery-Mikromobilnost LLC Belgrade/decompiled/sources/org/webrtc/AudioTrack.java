package org.webrtc;

import defpackage.ny61;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class AudioTrack extends MediaStreamTrack {
    private final IdentityHashMap<AudioTrackSink, Long> sinks;

    public AudioTrack(long j) {
        super(j);
        this.sinks = new IdentityHashMap<>();
    }

    private static native void nativeAddSink(long j, long j2);

    private static native void nativeFreeSink(long j);

    private static native void nativeRemoveSink(long j, long j2);

    private static native void nativeSetVolume(long j, double d);

    private static native long nativeWrapSink(AudioTrackSink audioTrackSink);

    public void addSink(AudioTrackSink audioTrackSink) {
        if (audioTrackSink == null) {
            ny61.g("The AudioTrackSink is not allowed to be null");
        } else {
            if (this.sinks.containsKey(audioTrackSink)) {
                return;
            }
            long nativeWrapSink = nativeWrapSink(audioTrackSink);
            this.sinks.put(audioTrackSink, Long.valueOf(nativeWrapSink));
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

    public long getNativeAudioTrack() {
        return getNativeMediaStreamTrack();
    }

    public void removeSink(AudioTrackSink audioTrackSink) {
        Long remove = this.sinks.remove(audioTrackSink);
        if (remove != null) {
            nativeRemoveSink(getNativeMediaStreamTrack(), remove.longValue());
            nativeFreeSink(remove.longValue());
        }
    }

    public void setVolume(double d) {
        nativeSetVolume(getNativeAudioTrack(), d);
    }
}
