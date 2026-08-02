package androidx.compose.ui.text.font;

import androidx.camera.video.Recorder;

/* loaded from: classes3.dex */
public final class LoadedFontFamily extends FontFamily {
    public final Recorder.AnonymousClass6 typeface;

    public LoadedFontFamily(Recorder.AnonymousClass6 anonymousClass6) {
        this.typeface = anonymousClass6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LoadedFontFamily) {
            return this.typeface == ((LoadedFontFamily) obj).typeface;
        }
        return false;
    }

    public final Recorder.AnonymousClass6 getTypeface() {
        return this.typeface;
    }

    public final int hashCode() {
        return this.typeface.hashCode();
    }

    public final String toString() {
        return "LoadedFontFamily(typeface=" + this.typeface + ')';
    }
}
