package defpackage;

import com.ybsdk.feature.kyc.internal.screens.photo.helpers.CameraLens;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class tr7 {
    public final CameraLens a;

    public tr7(CameraLens cameraLens) {
        this.a = cameraLens;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tr7) && this.a == ((tr7) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CameraParametersEntity(lens=" + this.a + Extension.C_BRAKE;
    }
}
