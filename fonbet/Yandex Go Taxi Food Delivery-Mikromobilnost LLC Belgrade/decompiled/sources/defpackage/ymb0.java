package defpackage;

import android.graphics.Bitmap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ymb0 {
    public final boolean a;
    public final Bitmap b;
    public final String c;
    public final String d;

    public ymb0(boolean z, Bitmap bitmap, String str, String str2) {
        this.a = z;
        this.b = bitmap;
        this.c = str;
        this.d = str2;
    }

    public static ymb0 a(ymb0 ymb0Var, boolean z, int i) {
        if ((i & 1) != 0) {
            z = ymb0Var.a;
        }
        Bitmap bitmap = ymb0Var.b;
        String str = ymb0Var.c;
        String str2 = (i & 8) != 0 ? ymb0Var.d : null;
        ymb0Var.getClass();
        return new ymb0(z, bitmap, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ymb0)) {
            return false;
        }
        ymb0 ymb0Var = (ymb0) obj;
        return this.a == ymb0Var.a && jl40.l(this.b, ymb0Var.b) && jl40.l(this.c, ymb0Var.c) && jl40.l(this.d, ymb0Var.d);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        Bitmap bitmap = this.b;
        int hashCode2 = (hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PickupFromPhotoButtonUiState(isVisible=");
        sb.append(this.a);
        sb.append(", image=");
        sb.append(this.b);
        sb.append(", contentDescription=");
        return g8e.r(sb, this.c, ", tooltipText=", this.d, Extension.C_BRAKE);
    }

    public /* synthetic */ ymb0(int i) {
        this(false, null, null, null);
    }

    public ymb0() {
        this(15);
    }
}
