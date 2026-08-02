package androidx.camera.core.impl;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class AutoValue_Config_Option {
    public final String id;
    public final Object token;
    public final Class valueClass;

    public AutoValue_Config_Option(String str, Class cls, CaptureRequest.Key key) {
        this.id = str;
        if (cls == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null valueClass");
            throw null;
        }
        this.valueClass = cls;
        this.token = key;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_Config_Option)) {
            return false;
        }
        AutoValue_Config_Option autoValue_Config_Option = (AutoValue_Config_Option) obj;
        if (!this.id.equals(autoValue_Config_Option.id) || !this.valueClass.equals(autoValue_Config_Option.valueClass)) {
            return false;
        }
        Object obj2 = autoValue_Config_Option.token;
        Object obj3 = this.token;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        int hashCode = (((this.id.hashCode() ^ 1000003) * 1000003) ^ this.valueClass.hashCode()) * 1000003;
        Object obj = this.token;
        return (obj == null ? 0 : obj.hashCode()) ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Option{id=");
        sb.append(this.id);
        sb.append(", valueClass=");
        sb.append(this.valueClass);
        sb.append(", token=");
        return Recorder$$ExternalSyntheticOutline1.m(sb, this.token, "}");
    }
}
