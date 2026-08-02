package defpackage;

import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class xlu0 extends zlu0 {
    public final vrc c;
    public final ColorModel d;
    public final int e;
    public final String f;

    public xlu0(vrc vrcVar, ColorModel colorModel, int i, String str) {
        super(i, colorModel);
        this.c = vrcVar;
        this.d = colorModel;
        this.e = i;
        this.f = str;
    }

    @Override // defpackage.zlu0
    public final String a() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xlu0)) {
            return false;
        }
        xlu0 xlu0Var = (xlu0) obj;
        return this.c.equals(xlu0Var.c) && jl40.l(this.d, xlu0Var.d) && this.e == xlu0Var.e && jl40.l(this.f, xlu0Var.f);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        ColorModel colorModel = this.d;
        return this.f.hashCode() + oyr.b(this.e, (hashCode + (colorModel == null ? 0 : colorModel.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunicationFullScreenStory(data=");
        sb.append(this.c);
        sb.append(", backgroundColorModel=");
        sb.append(this.d);
        sb.append(", maxProgressValueMs=");
        return xvz.h(this.e, ", id=", this.f, Extension.C_BRAKE, sb);
    }
}
