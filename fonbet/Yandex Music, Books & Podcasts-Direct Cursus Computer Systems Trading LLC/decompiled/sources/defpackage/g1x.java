package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g1x extends l9 {
    public static final Parcelable.Creator<g1x> CREATOR = new vzw(18);
    public static final byte[] b = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);
    public final byte[][] a;

    public g1x(byte[][] bArr) {
        y1g.z(bArr != null);
        y1g.z(1 == ((bArr.length & 1) ^ 1));
        int i = 0;
        while (i < bArr.length) {
            y1g.z(i == 0 || bArr[i] != null);
            int i2 = i + 1;
            y1g.z(bArr[i2] != null);
            int length = bArr[i2].length;
            y1g.z(length == 32 || length == 64);
            i += 2;
        }
        this.a = bArr;
    }

    public static g1x a(JSONObject jSONObject, boolean z) {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z) {
                    arrayList.add(d(jSONObject.getJSONObject("eval")));
                } else {
                    arrayList.add(e(jSONObject.getJSONObject("eval")));
                }
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    arrayList.add(vq1.J(next));
                    if (z) {
                        arrayList.add(d(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(e(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new g1x((byte[][]) arrayList.toArray(new byte[0][]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    public static JSONObject b(byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", Base64.encodeToString(bArr, 11));
            return jSONObject;
        }
        jSONObject.put("first", Base64.encodeToString(bArr, 0, 32, 11));
        jSONObject.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] c(byte[] bArr) {
        kzh kzhVar;
        iax iaxVar;
        int i = pax.a;
        yax yaxVar = max.a;
        int i2 = yaxVar.b;
        MessageDigest messageDigest = yaxVar.a;
        try {
            if (yaxVar.c) {
                try {
                    kzhVar = new kzh((MessageDigest) messageDigest.clone(), i2, 1);
                } catch (CloneNotSupportedException unused) {
                }
                byte[] bArr2 = b;
                bArr2.getClass();
                int length = bArr2.length;
                if (!kzhVar.c) {
                    xq0.q("Cannot re-use a Hasher after calling hash() on it");
                    return null;
                }
                MessageDigest messageDigest2 = kzhVar.a;
                messageDigest2.update(bArr2, 0, length);
                bArr.getClass();
                int length2 = bArr.length;
                if (kzhVar.c) {
                    xq0.q("Cannot re-use a Hasher after calling hash() on it");
                    return null;
                }
                messageDigest2.update(bArr, 0, length2);
                if (kzhVar.c) {
                    xq0.q("Cannot re-use a Hasher after calling hash() on it");
                    return null;
                }
                kzhVar.c = true;
                int digestLength = messageDigest2.getDigestLength();
                int i3 = kzhVar.b;
                if (i3 == digestLength) {
                    byte[] digest = messageDigest2.digest();
                    char[] cArr = kax.a;
                    iaxVar = new iax(digest);
                } else {
                    byte[] copyOf = Arrays.copyOf(messageDigest2.digest(), i3);
                    char[] cArr2 = kax.a;
                    iaxVar = new iax(copyOf);
                }
                return (byte[]) iaxVar.b.clone();
            }
            kzhVar = new kzh(MessageDigest.getInstance(messageDigest.getAlgorithm()), i2, 1);
            byte[] bArr22 = b;
            bArr22.getClass();
            int length3 = bArr22.length;
            if (!kzhVar.c) {
            }
        } catch (NoSuchAlgorithmException e) {
            xq0.w(e);
            return null;
        }
    }

    public static byte[] d(JSONObject jSONObject) {
        byte[] J = vq1.J(jSONObject.getString("first"));
        if (J.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        }
        if (!jSONObject.has("second")) {
            return J;
        }
        byte[] J2 = vq1.J(jSONObject.getString("second"));
        if (J2.length == 32) {
            return wxf.T(J, J2);
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    public static byte[] e(JSONObject jSONObject) {
        byte[] c = c(vq1.J(jSONObject.getString("first")));
        return !jSONObject.has("second") ? c : wxf.T(c, c(vq1.J(jSONObject.getString("second"))));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g1x) {
            return Arrays.deepEquals(this.a, ((g1x) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        for (byte[] bArr : this.a) {
            if (bArr != null) {
                i ^= Arrays.hashCode(new Object[]{bArr});
            }
        }
        return i;
    }

    public final String toString() {
        byte[][] bArr = this.a;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = null;
            for (int i = 0; i < bArr.length; i += 2) {
                if (bArr[i] == null) {
                    jSONObject.put("eval", b(bArr[i + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(vq1.M(bArr[i]), b(bArr[i + 1]));
                }
            }
            return "PrfExtension{" + jSONObject.toString() + "}";
        } catch (JSONException e) {
            return hrg.q("PrfExtension{Exception:", e.getMessage(), "}");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        byte[][] bArr = this.a;
        if (bArr != null) {
            int o02 = o8g.o0(parcel, 1);
            parcel.writeInt(bArr.length);
            for (byte[] bArr2 : bArr) {
                parcel.writeByteArray(bArr2);
            }
            o8g.p0(parcel, o02);
        }
        o8g.p0(parcel, o0);
    }
}
