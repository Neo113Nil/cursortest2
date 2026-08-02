package defpackage;

import android.net.Uri;
import com.yandex.go.beginners.safety.photo.upload.domain.model.SafetyPhotoUploadScreenState$Type;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class qxl0 {
    public final SafetyPhotoUploadScreenState$Type a;
    public final Uri b;
    public final FormattedText c;

    public qxl0(SafetyPhotoUploadScreenState$Type safetyPhotoUploadScreenState$Type, Uri uri, FormattedText formattedText) {
        this.a = safetyPhotoUploadScreenState$Type;
        this.b = uri;
        this.c = formattedText;
    }

    public static qxl0 a(qxl0 qxl0Var, SafetyPhotoUploadScreenState$Type safetyPhotoUploadScreenState$Type) {
        Uri uri = qxl0Var.b;
        FormattedText formattedText = qxl0Var.c;
        qxl0Var.getClass();
        return new qxl0(safetyPhotoUploadScreenState$Type, uri, formattedText);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxl0)) {
            return false;
        }
        qxl0 qxl0Var = (qxl0) obj;
        return this.a == qxl0Var.a && jl40.l(this.b, qxl0Var.b) && jl40.l(this.c, qxl0Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        FormattedText formattedText = this.c;
        return hashCode + (formattedText == null ? 0 : formattedText.a.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SafetyPhotoUploadScreenState(screenType=");
        sb.append(this.a);
        sb.append(", uri=");
        sb.append(this.b);
        sb.append(", validationReason=");
        return tse0.m(sb, this.c, Extension.C_BRAKE);
    }
}
