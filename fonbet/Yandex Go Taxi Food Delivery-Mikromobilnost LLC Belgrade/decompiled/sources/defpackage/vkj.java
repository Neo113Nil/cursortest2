package defpackage;

import android.view.View;
import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class vkj {
    public final View a;
    public final boolean b;
    public final float[] c;
    public final u90 d;

    public vkj(View view, boolean z, float[] fArr, u90 u90Var) {
        this.a = view;
        this.b = z;
        this.c = fArr;
        this.d = u90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vkj) {
            vkj vkjVar = (vkj) obj;
            return this.a.equals(vkjVar.a) && this.b == vkjVar.b && jl40.l(this.c, vkjVar.c) && this.d == vkjVar.d;
        }
        return false;
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        float[] fArr = this.c;
        return this.d.hashCode() + ((e + (fArr == null ? 0 : Arrays.hashCode(fArr))) * 31);
    }

    public final String toString() {
        return "CutoutInfo(view=" + this.a + ", respectPadding=" + this.b + ", customCornerRadii=" + Arrays.toString(this.c) + ", layoutChangeListener=" + this.d + Extension.C_BRAKE;
    }
}
