package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class m02 extends r02 {

    @NonNull
    public static final Parcelable.Creator<m02> CREATOR = new oex(0);
    public final obx a;
    public final obx b;
    public final obx c;
    public final obx d;
    public final obx e;

    public m02(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        y1g.G(bArr);
        obx t = obx.t(bArr.length, bArr);
        y1g.G(bArr2);
        obx t2 = obx.t(bArr2.length, bArr2);
        y1g.G(bArr3);
        obx t3 = obx.t(bArr3.length, bArr3);
        y1g.G(bArr4);
        obx t4 = obx.t(bArr4.length, bArr4);
        obx t5 = bArr5 == null ? null : obx.t(bArr5.length, bArr5);
        this.a = t;
        this.b = t2;
        this.c = t3;
        this.d = t4;
        this.e = t5;
    }

    public final JSONObject d() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", vq1.M(this.b.u()));
            jSONObject.put("authenticatorData", vq1.M(this.c.u()));
            jSONObject.put("signature", vq1.M(this.d.u()));
            obx obxVar = this.e;
            if (obxVar == null) {
                return jSONObject;
            }
            jSONObject.put("userHandle", vq1.M(obxVar == null ? null : obxVar.u()));
            return jSONObject;
        } catch (JSONException e) {
            kac.k("Error encoding AuthenticatorAssertionResponse to JSON object", e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m02)) {
            return false;
        }
        m02 m02Var = (m02) obj;
        return ldg.s(this.a, m02Var.a) && ldg.s(this.b, m02Var.b) && ldg.s(this.c, m02Var.c) && ldg.s(this.d, m02Var.d) && ldg.s(this.e, m02Var.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.e}))});
    }

    public final String toString() {
        z6u z6uVar = new z6u(getClass().getSimpleName(), 12);
        bbx bbxVar = dbx.d;
        byte[] u = this.a.u();
        z6uVar.a(bbxVar.c(u.length, u), "keyHandle");
        byte[] u2 = this.b.u();
        z6uVar.a(bbxVar.c(u2.length, u2), "clientDataJSON");
        byte[] u3 = this.c.u();
        z6uVar.a(bbxVar.c(u3.length, u3), "authenticatorData");
        byte[] u4 = this.d.u();
        z6uVar.a(bbxVar.c(u4.length, u4), "signature");
        obx obxVar = this.e;
        byte[] u5 = obxVar == null ? null : obxVar.u();
        if (u5 != null) {
            z6uVar.a(bbxVar.c(u5.length, u5), "userHandle");
        }
        return z6uVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.c0(parcel, 2, this.a.u());
        o8g.c0(parcel, 3, this.b.u());
        o8g.c0(parcel, 4, this.c.u());
        o8g.c0(parcel, 5, this.d.u());
        obx obxVar = this.e;
        o8g.c0(parcel, 6, obxVar == null ? null : obxVar.u());
        o8g.p0(parcel, o0);
    }
}
