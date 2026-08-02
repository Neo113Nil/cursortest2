package defpackage;

import android.content.Context;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class vn70 implements wn70 {
    public final boolean a;
    public final boolean b;
    public final float c;
    public final float d;
    public final int e;

    public vn70(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = 13.0f;
        this.d = 14.0f;
        this.e = 16;
    }

    @Override // defpackage.wn70
    public final boolean H() {
        return this.b;
    }

    @Override // defpackage.wn70
    public final float e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn70)) {
            return false;
        }
        vn70 vn70Var = (vn70) obj;
        return this.a == vn70Var.a && this.b == vn70Var.b;
    }

    @Override // defpackage.wn70
    public final float f() {
        return this.c;
    }

    @Override // defpackage.wn70
    public final boolean g() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    @Override // defpackage.wn70
    public final int n(Context context) {
        return lhc.d(qje.t(xng0.controlMinor, context), qje.u(context.getTheme(), xng0.bgMain));
    }

    @Override // defpackage.wn70
    public final int s() {
        return this.e;
    }

    public final String toString() {
        return ly3.o("SuperappMainScreen(ignoreApplyColorsFromUiState=", ", ignoreCardStyleBackground=", Extension.C_BRAKE, this.a, this.b);
    }

    @Override // defpackage.wn70
    public final int y(Context context) {
        return tje.u(16, context);
    }

    public vn70() {
        this(false, false);
    }
}
