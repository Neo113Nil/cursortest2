package defpackage;

import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.common.liveness.CameraType;

/* loaded from: classes4.dex */
public final class vn31 implements tt11 {
    public final kl31 a;
    public final boolean b;
    public final JSONObject c;
    public final CameraType d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final boolean i;

    public vn31(kl31 kl31Var, boolean z, JSONObject jSONObject, CameraType cameraType, boolean z2, boolean z3, boolean z4, int i, boolean z5) {
        this.a = kl31Var;
        this.b = z;
        this.c = jSONObject;
        this.d = cameraType;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = i;
        this.i = z5;
    }

    public static vn31 a(vn31 vn31Var, kl31 kl31Var, JSONObject jSONObject, CameraType cameraType, boolean z, boolean z2, boolean z3, int i, boolean z4, int i2) {
        if ((i2 & 1) != 0) {
            kl31Var = vn31Var.a;
        }
        kl31 kl31Var2 = kl31Var;
        boolean z5 = (i2 & 2) != 0 ? vn31Var.b : true;
        if ((i2 & 4) != 0) {
            jSONObject = vn31Var.c;
        }
        JSONObject jSONObject2 = jSONObject;
        if ((i2 & 8) != 0) {
            cameraType = vn31Var.d;
        }
        CameraType cameraType2 = cameraType;
        if ((i2 & 16) != 0) {
            z = vn31Var.e;
        }
        boolean z6 = z;
        if ((i2 & 32) != 0) {
            z2 = vn31Var.f;
        }
        boolean z7 = z2;
        boolean z8 = (i2 & 64) != 0 ? vn31Var.g : z3;
        int i3 = (i2 & 128) != 0 ? vn31Var.h : i;
        boolean z9 = (i2 & 256) != 0 ? vn31Var.i : z4;
        vn31Var.getClass();
        return new vn31(kl31Var2, z5, jSONObject2, cameraType2, z6, z7, z8, i3, z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn31)) {
            return false;
        }
        vn31 vn31Var = (vn31) obj;
        return jl40.l(this.a, vn31Var.a) && this.b == vn31Var.b && jl40.l(this.c, vn31Var.c) && this.d == vn31Var.d && this.e == vn31Var.e && this.f == vn31Var.f && this.g == vn31Var.g && this.h == vn31Var.h && this.i == vn31Var.i;
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        JSONObject jSONObject = this.c;
        return Boolean.hashCode(this.i) + k5a1.a(this.h, unr0.e(unr0.e(unr0.e((this.d.hashCode() + ((e + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31)) * 31, 31, this.e), 31, this.f), 31, this.g));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoRecordingState(capturingState=");
        sb.append(this.a);
        sb.append(", isContentVisible=");
        sb.append(this.b);
        sb.append(", webViewInstruction=");
        sb.append(this.c);
        sb.append(", cameraType=");
        sb.append(this.d);
        sb.append(", isSwitchCameraAllowed=");
        nnm.v(", isProcessingWidgetVisible=", ", isSuccessfulVerificationWidgetVisible=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", processingTitleRes=");
        sb.append(this.h);
        sb.append(", isButtonEnabled=");
        return x4e.i(sb, this.i, Extension.C_BRAKE);
    }

    public vn31() {
        this(0);
    }

    public /* synthetic */ vn31(int i) {
        this(hl31.a, false, null, CameraType.FRONT, true, false, false, kzh0.ebssdk_processing_tv_text, true);
    }
}
