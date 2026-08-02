package defpackage;

import com.yandex.go.navigation.UserPhotoUploadingEntryPoint;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class yq21 {
    public final UserPhotoUploadingEntryPoint a;
    public final boolean b;

    public yq21(UserPhotoUploadingEntryPoint userPhotoUploadingEntryPoint, boolean z) {
        this.a = userPhotoUploadingEntryPoint;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq21)) {
            return false;
        }
        yq21 yq21Var = (yq21) obj;
        return this.a == yq21Var.a && this.b == yq21Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Payload(userPhotoUploadingEntryPoint=" + this.a + ", shouldRequestRouteStats=" + this.b + Extension.C_BRAKE;
    }
}
