package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n02 extends r02 {

    @NonNull
    public static final Parcelable.Creator<n02> CREATOR = new oex(4);
    public final obx a;
    public final obx b;
    public final obx c;
    public final String[] d;

    public n02(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        y1g.G(bArr);
        obx t = obx.t(bArr.length, bArr);
        y1g.G(bArr2);
        obx t2 = obx.t(bArr2.length, bArr2);
        y1g.G(bArr3);
        obx t3 = obx.t(bArr3.length, bArr3);
        this.a = t;
        this.b = t2;
        this.c = t3;
        y1g.G(strArr);
        this.d = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0215 A[Catch: JSONException -> 0x0021, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0021, blocks: (B:3:0x000a, B:5:0x0013, B:8:0x0028, B:9:0x0035, B:10:0x003c, B:12:0x003f, B:14:0x0049, B:16:0x0054, B:17:0x004f, B:20:0x0057, B:22:0x0060, B:24:0x006a, B:26:0x007b, B:27:0x0083, B:29:0x0091, B:31:0x00a3, B:33:0x00c1, B:35:0x00d0, B:36:0x00d9, B:40:0x00e6, B:41:0x00e9, B:42:0x00ef, B:47:0x0111, B:53:0x0201, B:55:0x0215, B:58:0x0134, B:60:0x0145, B:65:0x015b, B:68:0x0177, B:70:0x018c, B:72:0x0191, B:73:0x01ac, B:74:0x01b1, B:75:0x01b2, B:76:0x01b9, B:81:0x01c6, B:83:0x01d3, B:85:0x01e0, B:86:0x01f5, B:87:0x01fa, B:88:0x01fb, B:89:0x0200, B:91:0x0222, B:92:0x0227, B:95:0x0228, B:96:0x022f, B:97:0x0230, B:98:0x0236, B:104:0x0238, B:105:0x023b, B:108:0x00d3, B:110:0x023f, B:111:0x0246, B:113:0x0249, B:114:0x0250, B:116:0x0251, B:117:0x0258, B:118:0x025b, B:119:0x0262, B:121:0x0263, B:122:0x026a, B:126:0x026e, B:127:0x0275), top: B:2:0x000a, inners: #4, #5, #8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject d() {
        byte[] bArr;
        String[] strArr = this.d;
        try {
            JSONObject jSONObject = new JSONObject();
            obx obxVar = this.b;
            if (obxVar != null) {
                jSONObject.put("clientDataJSON", vq1.M(obxVar.u()));
            }
            obx obxVar2 = this.c;
            if (obxVar2 != null) {
                jSONObject.put("attestationObject", vq1.M(obxVar2.u()));
            }
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < strArr.length; i++) {
                if (strArr[i].equals("cable")) {
                    jSONArray.put(i, "hybrid");
                } else {
                    jSONArray.put(i, strArr[i]);
                }
            }
            jSONObject.put("transports", jSONArray);
            try {
                try {
                    wcx wcxVar = (wcx) ((pcx) wcx.e(obxVar2.u()).c(pcx.class)).b.get(new scx("authData"));
                    if (wcxVar == null) {
                        throw new IllegalArgumentException("attestation object missing authData");
                    }
                    obx obxVar3 = ((icx) wcxVar.c(icx.class)).a;
                    byte[] bArr2 = obxVar3.b;
                    ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(bArr2, 0, obxVar3.o()).asReadOnlyBuffer();
                    try {
                        asReadOnlyBuffer.position(asReadOnlyBuffer.position() + 32);
                        if ((asReadOnlyBuffer.get() & 64) == 0) {
                            throw new IllegalArgumentException("authData does not include credential data");
                        }
                        asReadOnlyBuffer.position(asReadOnlyBuffer.position() + 4);
                        asReadOnlyBuffer.position(asReadOnlyBuffer.position() + 16);
                        asReadOnlyBuffer.position(asReadOnlyBuffer.position() + asReadOnlyBuffer.getShort());
                        try {
                            try {
                                int position = asReadOnlyBuffer.position();
                                int s = obx.s(position, bArr2.length, obxVar3.o());
                                edx edxVar = new edx((s == 0 ? obx.c : new lbx(bArr2, position, s)).r());
                                try {
                                    z5x z5xVar = ((pcx) a0g.Q(edxVar).c(pcx.class)).b;
                                    wcx wcxVar2 = (wcx) z5xVar.get(new lcx(3L));
                                    wcx wcxVar3 = (wcx) z5xVar.get(new lcx(1L));
                                    if (wcxVar2 == null || wcxVar3 == null) {
                                        throw new IllegalArgumentException("COSE key missing required fields");
                                    }
                                    try {
                                        long j = ((lcx) wcxVar2.c(lcx.class)).a;
                                        long j2 = ((lcx) wcxVar3.c(lcx.class)).a;
                                        byte[] bArr3 = null;
                                        if (j2 != 1) {
                                            if (j2 == 2) {
                                                j2 = 2;
                                            }
                                            bArr = bArr3;
                                            jSONObject.put("authenticatorData", vq1.M(obxVar3.u()));
                                            jSONObject.put("publicKeyAlgorithm", j);
                                            if (bArr != null) {
                                                jSONObject.put("publicKey", Base64.encodeToString(bArr, 11));
                                            }
                                            return jSONObject;
                                        }
                                        wcx wcxVar4 = (wcx) z5xVar.get(new lcx(-1L));
                                        if (wcxVar4 == null) {
                                            throw new IllegalArgumentException("COSE key missing required fields");
                                        }
                                        long j3 = ((lcx) wcxVar4.c(lcx.class)).a;
                                        if (j2 == 2 && j3 == 1) {
                                            wcx wcxVar5 = (wcx) z5xVar.get(new lcx(-2L));
                                            wcx wcxVar6 = (wcx) z5xVar.get(new lcx(-3L));
                                            if (wcxVar5 == null || wcxVar6 == null) {
                                                throw new IllegalArgumentException("COSE key missing required fields");
                                            }
                                            obx obxVar4 = ((icx) wcxVar5.c(icx.class)).a;
                                            obx obxVar5 = ((icx) wcxVar6.c(icx.class)).a;
                                            if (obxVar4.b.length != 32 || obxVar5.b.length != 32) {
                                                throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                            }
                                            bArr3 = wxf.T(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), obxVar4.u(), obxVar5.u());
                                        } else if (j2 == 1 && j3 == 6) {
                                            wcx wcxVar7 = (wcx) z5xVar.get(new lcx(-2L));
                                            if (wcxVar7 == null) {
                                                throw new IllegalArgumentException("COSE key missing required fields");
                                            }
                                            obx obxVar6 = ((icx) wcxVar7.c(icx.class)).a;
                                            if (obxVar6.b.length != 32) {
                                                throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                            }
                                            bArr3 = wxf.T(Base64.decode("MCowBQYDK2VwAyEA", 0), obxVar6.u());
                                        }
                                        bArr = bArr3;
                                        jSONObject.put("authenticatorData", vq1.M(obxVar3.u()));
                                        jSONObject.put("publicKeyAlgorithm", j);
                                        if (bArr != null) {
                                        }
                                        return jSONObject;
                                    } catch (tcx e) {
                                        throw new IllegalArgumentException("COSE key ill-formed", e);
                                    }
                                } finally {
                                    try {
                                        edxVar.close();
                                    } catch (IOException unused) {
                                    }
                                }
                            } catch (tcx e2) {
                                e = e2;
                                throw new IllegalArgumentException("failed to parse COSE key", e);
                            }
                        } catch (kcx e3) {
                            e = e3;
                            throw new IllegalArgumentException("failed to parse COSE key", e);
                        }
                    } catch (IllegalArgumentException e4) {
                        throw new IllegalArgumentException("ill-formed authenticator data", e4);
                    }
                } catch (tcx e5) {
                    throw new IllegalArgumentException("authData value has wrong type", e5);
                }
            } catch (kcx e6) {
                e = e6;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            } catch (tcx e7) {
                e = e7;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            }
        } catch (JSONException e8) {
            kac.k("Error encoding AuthenticatorAttestationResponse to JSON object", e8);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n02)) {
            return false;
        }
        n02 n02Var = (n02) obj;
        return ldg.s(this.a, n02Var.a) && ldg.s(this.b, n02Var.b) && ldg.s(this.c, n02Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c}))});
    }

    public final String toString() {
        z6u z6uVar = new z6u(getClass().getSimpleName(), 12);
        bbx bbxVar = dbx.d;
        byte[] u = this.a.u();
        z6uVar.a(bbxVar.c(u.length, u), "keyHandle");
        byte[] u2 = this.b.u();
        z6uVar.a(bbxVar.c(u2.length, u2), "clientDataJSON");
        byte[] u3 = this.c.u();
        z6uVar.a(bbxVar.c(u3.length, u3), "attestationObject");
        z6uVar.a(Arrays.toString(this.d), "transports");
        return z6uVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.c0(parcel, 2, this.a.u());
        o8g.c0(parcel, 3, this.b.u());
        o8g.c0(parcel, 4, this.c.u());
        o8g.k0(parcel, 5, this.d);
        o8g.p0(parcel, o0);
    }
}
