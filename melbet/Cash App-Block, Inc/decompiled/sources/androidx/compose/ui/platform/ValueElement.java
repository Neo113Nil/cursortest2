package androidx.compose.ui.platform;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ValueElement {
    public final String name;
    public final Object value;

    public ValueElement(String str, Object obj) {
        this.name = str;
        this.value = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValueElement)) {
            return false;
        }
        ValueElement valueElement = (ValueElement) obj;
        return Intrinsics.areEqual(this.name, valueElement.name) && Intrinsics.areEqual(this.value, valueElement.value);
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        Object obj = this.value;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ValueElement(name=");
        sb.append(this.name);
        sb.append(", value=");
        return Recorder$$ExternalSyntheticOutline1.m(sb, this.value, ')');
    }
}
