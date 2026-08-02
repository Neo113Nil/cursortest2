package defpackage;

import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.data.PlaybackParameters;
import ru.yandex.video.m3.data.dto.VideoData;

/* loaded from: classes6.dex */
public final class eom {
    public final String a;
    public final VideoData b;
    public final PlaybackParameters c;

    public /* synthetic */ eom(String str, VideoData videoData, PlaybackParameters playbackParameters, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : videoData, (i & 4) != 0 ? null : playbackParameters);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!eom.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        eom eomVar = (eom) obj;
        PlaybackParameters playbackParameters = eomVar.c;
        if (!Intrinsics.d(this.a, eomVar.a) || !Intrinsics.d(this.b, eomVar.b)) {
            return false;
        }
        PlaybackParameters playbackParameters2 = this.c;
        if (Intrinsics.d(playbackParameters2 != null ? Boolean.valueOf(playbackParameters2.getAutoPlay()) : null, playbackParameters != null ? Boolean.valueOf(playbackParameters.getAutoPlay()) : null)) {
            return Intrinsics.d(playbackParameters2 != null ? playbackParameters2.getStartPosition() : null, playbackParameters != null ? playbackParameters.getStartPosition() : null);
        }
        return false;
    }

    public final int hashCode() {
        Long startPosition;
        int i = 0;
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        VideoData videoData = this.b;
        int hashCode2 = (hashCode + (videoData != null ? videoData.hashCode() : 0)) * 31;
        PlaybackParameters playbackParameters = this.c;
        int hashCode3 = (hashCode2 + (playbackParameters != null ? Boolean.valueOf(playbackParameters.getAutoPlay()).hashCode() : 0)) * 31;
        if (playbackParameters != null && (startPosition = playbackParameters.getStartPosition()) != null) {
            i = startPosition.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "PrepareConfig(contentId=" + this.a + ", videoData=" + this.b + ", playbackParameters=" + this.c + ')';
    }

    public eom(String str, VideoData videoData, PlaybackParameters playbackParameters) {
        this.a = str;
        this.b = videoData;
        this.c = playbackParameters;
    }
}
