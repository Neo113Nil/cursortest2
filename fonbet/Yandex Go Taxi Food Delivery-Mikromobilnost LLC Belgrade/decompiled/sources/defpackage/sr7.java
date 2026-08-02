package defpackage;

import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.feature.kyc.internal.screens.photo.helpers.CameraLens;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class sr7 {
    public final pnx a;
    public final String b;
    public final String c;
    public final String d;
    public final CameraLens e;
    public final String f;
    public final String g;
    public final String h;
    public final ThemedParameter i;

    public sr7(pnx pnxVar, String str, String str2, String str3, CameraLens cameraLens, String str4, String str5, String str6, ThemedParameter themedParameter) {
        this.a = pnxVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = cameraLens;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = themedParameter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr7)) {
            return false;
        }
        sr7 sr7Var = (sr7) obj;
        return this.a.equals(sr7Var.a) && jl40.l(this.b, sr7Var.b) && jl40.l(this.c, sr7Var.c) && jl40.l(this.d, sr7Var.d) && this.e == sr7Var.e && jl40.l(this.f, sr7Var.f) && jl40.l(this.g, sr7Var.g) && jl40.l(this.h, sr7Var.h) && jl40.l(this.i, sr7Var.i);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.b.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (this.e.hashCode() + unr0.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.d)) * 31;
        String str2 = this.f;
        int b2 = unr0.b((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.g);
        String str3 = this.h;
        int hashCode2 = (b2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ThemedParameter themedParameter = this.i;
        return hashCode2 + (themedParameter != null ? themedParameter.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraPageEntity(documentType=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", tipText=");
        g8e.D(sb, this.c, ", uploadErrorText=", this.d, ", lens=");
        sb.append(this.e);
        sb.append(", infoDeeplink=");
        sb.append(this.f);
        sb.append(", backButtonDeeplink=");
        g8e.D(sb, this.g, ", enterPageDeeplink=", this.h, ", tipIcon=");
        sb.append(this.i);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
