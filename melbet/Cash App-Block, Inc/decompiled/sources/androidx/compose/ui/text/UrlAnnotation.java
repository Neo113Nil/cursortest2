package androidx.compose.ui.text;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.ui.text.AnnotatedString;

/* loaded from: classes3.dex */
public final class UrlAnnotation implements AnnotatedString.Annotation {
    public final String url;

    public UrlAnnotation(String str) {
        this.url = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UrlAnnotation) {
            return this.url.equals(((UrlAnnotation) obj).url);
        }
        return false;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        return this.url.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("UrlAnnotation(url="), this.url, ')');
    }
}
