package defpackage;

import android.net.Uri;
import com.ybsdk.feature.kyc.internal.screens.photov3.PhotoState$Stage$Upload$Status;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class yib0 implements zib0 {
    public final PhotoState$Stage$Upload$Status a;
    public final Uri b;

    public yib0(PhotoState$Stage$Upload$Status photoState$Stage$Upload$Status, Uri uri) {
        this.a = photoState$Stage$Upload$Status;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yib0)) {
            return false;
        }
        yib0 yib0Var = (yib0) obj;
        return this.a == yib0Var.a && jl40.l(this.b, yib0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Upload(status=" + this.a + ", photoUri=" + this.b + Extension.C_BRAKE;
    }
}
