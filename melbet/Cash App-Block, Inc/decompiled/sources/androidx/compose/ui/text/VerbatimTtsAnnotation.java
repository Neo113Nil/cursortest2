package androidx.compose.ui.text;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.ui.text.AnnotatedString;

/* loaded from: classes3.dex */
public final class VerbatimTtsAnnotation implements AnnotatedString.Annotation {
    public final String verbatim;

    public VerbatimTtsAnnotation(String str) {
        this.verbatim = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VerbatimTtsAnnotation) {
            return this.verbatim.equals(((VerbatimTtsAnnotation) obj).verbatim);
        }
        return false;
    }

    public final String getVerbatim() {
        return this.verbatim;
    }

    public final int hashCode() {
        return this.verbatim.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.verbatim, ')');
    }
}
