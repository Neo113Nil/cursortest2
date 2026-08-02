package defpackage;

import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.data.dto.VideoData;

/* loaded from: classes6.dex */
public final class wbu implements VideoData {
    public final imh a;
    public final String b;

    public wbu(imh imhVar, String str) {
        imhVar.getClass();
        str.getClass();
        this.a = imhVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wbu)) {
            return false;
        }
        wbu wbuVar = (wbu) obj;
        return Intrinsics.d(this.a, wbuVar.a) && Intrinsics.d(this.b, wbuVar.b);
    }

    @Override // ru.yandex.video.m3.data.dto.VideoData
    public final String getAudioLanguage() {
        return null;
    }

    @Override // ru.yandex.video.m3.data.dto.VideoData
    public final String getManifestUrl() {
        return this.b;
    }

    @Override // ru.yandex.video.m3.data.dto.VideoData
    public final String getSubtitleLanguage() {
        return null;
    }

    public final int hashCode() {
        return k5r.c(this.a.hashCode() * 31, 961, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreloadVideoData(mediaData=");
        sb.append(this.a);
        sb.append(", manifestUrl=");
        return su4.o(sb, this.b, ", audioLanguage=null, subtitleLanguage=null)");
    }
}
