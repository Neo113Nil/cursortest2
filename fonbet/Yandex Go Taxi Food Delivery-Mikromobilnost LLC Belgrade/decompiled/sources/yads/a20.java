package yads;

import org.webrtc.MediaStreamTrack;

/* loaded from: classes7.dex */
public enum a20 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("definedByJavaScript"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("htmlDisplay"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("nativeDisplay"),
    c(MediaStreamTrack.VIDEO_TRACK_KIND),
    /* JADX INFO: Fake field, exist only in values array */
    EF49(MediaStreamTrack.AUDIO_TRACK_KIND);

    public final String b;

    a20(String str) {
        this.b = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.b;
    }
}
