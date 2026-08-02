package androidx.compose.material3;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class TextFieldLabelPosition$Attached {
    public final BiasAlignment.Horizontal expandedAlignment;
    public final BiasAlignment.Horizontal minimizedAlignment;

    public TextFieldLabelPosition$Attached() {
        BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
        this.minimizedAlignment = horizontal;
        this.expandedAlignment = horizontal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldLabelPosition$Attached)) {
            return false;
        }
        TextFieldLabelPosition$Attached textFieldLabelPosition$Attached = (TextFieldLabelPosition$Attached) obj;
        return Intrinsics.areEqual(this.minimizedAlignment, textFieldLabelPosition$Attached.minimizedAlignment) && Intrinsics.areEqual(this.expandedAlignment, textFieldLabelPosition$Attached.expandedAlignment);
    }

    public final int hashCode() {
        return Float.hashCode(this.expandedAlignment.bias) + CameraState$Type$EnumUnboxingLocalUtility.m(this.minimizedAlignment.bias, Boolean.hashCode(false) * 31, 31);
    }

    public final String toString() {
        return "Attached(alwaysMinimize=false, minimizedAlignment=" + this.minimizedAlignment + ", expandedAlignment=" + this.expandedAlignment + ')';
    }
}
