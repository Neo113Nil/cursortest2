package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import com.appsflyer.AppsFlyerProperties;
import com.connectsdk.device.ConnectableDevice;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j0n extends l9 {

    @NonNull
    public static final Parcelable.Creator<j0n> CREATOR = new vzw(20);
    public final m0n a;
    public final p0n b;
    public final byte[] c;
    public final List d;
    public final Double e;
    public final List f;
    public final s02 g;
    public final Integer h;
    public final pns i;
    public final lu1 j;
    public final zz1 k;
    public final String l;
    public final ResultReceiver m;

    public j0n(m0n m0nVar, p0n p0nVar, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, s02 s02Var, Integer num, pns pnsVar, String str, zz1 zz1Var, String str2, ResultReceiver resultReceiver) {
        this.m = resultReceiver;
        if (str2 != null) {
            try {
                j0n a = a(new JSONObject(str2));
                this.a = a.a;
                this.b = a.b;
                this.c = a.c;
                this.d = a.d;
                this.e = a.e;
                this.f = a.f;
                this.g = a.g;
                this.h = a.h;
                this.i = a.i;
                this.j = a.j;
                this.k = a.k;
                this.l = str2;
                return;
            } catch (JSONException e) {
                xq0.t(e);
                throw null;
            }
        }
        y1g.G(m0nVar);
        this.a = m0nVar;
        y1g.G(p0nVar);
        this.b = p0nVar;
        y1g.G(bArr);
        this.c = bArr;
        y1g.G(arrayList);
        this.d = arrayList;
        this.e = d;
        this.f = arrayList2;
        this.g = s02Var;
        this.h = num;
        this.i = pnsVar;
        if (str != null) {
            try {
                this.j = lu1.a(str);
            } catch (ku1 e2) {
                xq0.t(e2);
                throw null;
            }
        } else {
            this.j = null;
        }
        this.k = zz1Var;
        this.l = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static j0n a(JSONObject jSONObject) {
        ArrayList arrayList;
        s02 s02Var;
        zz1 zz1Var;
        lu1 lu1Var;
        int i;
        g1x g1xVar;
        g1x a;
        jlx jlxVar;
        nmx nmxVar;
        JSONArray jSONArray;
        String str;
        ArrayList arrayList2;
        JSONArray jSONArray2;
        String str2;
        x3x x3xVar;
        JSONObject jSONObject2 = jSONObject.getJSONObject("rp");
        String str3 = ConnectableDevice.KEY_ID;
        m0n m0nVar = new m0n(jSONObject2.getString(ConnectableDevice.KEY_ID), jSONObject2.getString("name"), jSONObject2.has("icon") ? jSONObject2.optString("icon") : null);
        JSONObject jSONObject3 = jSONObject.getJSONObject("user");
        p0n p0nVar = new p0n(jSONObject3.getString("name"), jSONObject3.has("icon") ? jSONObject3.optString("icon") : null, jSONObject3.optString("displayName"), vq1.J(jSONObject3.getString(ConnectableDevice.KEY_ID)));
        byte[] J = vq1.J(jSONObject.getString("challenge"));
        y1g.G(J);
        JSONArray jSONArray3 = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList3 = new ArrayList();
        for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
            JSONObject jSONObject4 = jSONArray3.getJSONObject(i2);
            try {
                x3xVar = new c4x(new l0n(jSONObject4.getString("type"), jSONObject4.getInt("alg")));
            } catch (IllegalArgumentException unused) {
                x3xVar = v2x.a;
            }
            if (x3xVar.b()) {
                arrayList3.add(x3xVar.a());
            }
        }
        Double valueOf = jSONObject.has("timeout") ? Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d) : null;
        int i3 = 11;
        if (jSONObject.has("excludeCredentials")) {
            JSONArray jSONArray4 = jSONObject.getJSONArray("excludeCredentials");
            ArrayList arrayList4 = new ArrayList();
            int i4 = 0;
            while (i4 < jSONArray4.length()) {
                JSONObject jSONObject5 = jSONArray4.getJSONObject(i4);
                Parcelable.Creator<k0n> creator = k0n.CREATOR;
                String string = jSONObject5.getString("type");
                byte[] decode = Base64.decode(jSONObject5.getString(str3), i3);
                if (!jSONObject5.has("transports") || (jSONArray2 = jSONObject5.getJSONArray("transports")) == null) {
                    jSONArray = jSONArray4;
                    str = str3;
                    arrayList2 = null;
                } else {
                    HashSet hashSet = new HashSet(jSONArray2.length());
                    jSONArray = jSONArray4;
                    int i5 = 0;
                    while (i5 < jSONArray2.length()) {
                        String string2 = jSONArray2.getString(i5);
                        if (string2 == null || string2.isEmpty()) {
                            str2 = str3;
                        } else {
                            str2 = str3;
                            try {
                                hashSet.add(Transport.a(string2));
                            } catch (h9t unused2) {
                                Log.w("Transport", "Ignoring unrecognized transport ".concat(string2));
                            }
                        }
                        i5++;
                        str3 = str2;
                    }
                    str = str3;
                    arrayList2 = new ArrayList(hashSet);
                }
                arrayList4.add(new k0n(string, decode, arrayList2));
                i4++;
                jSONArray4 = jSONArray;
                str3 = str;
                i3 = 11;
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        if (jSONObject.has("authenticatorSelection")) {
            JSONObject jSONObject6 = jSONObject.getJSONObject("authenticatorSelection");
            s02Var = new s02(jSONObject6.has("authenticatorAttachment") ? jSONObject6.optString("authenticatorAttachment") : null, jSONObject6.has("userVerification") ? jSONObject6.optString("userVerification") : null, jSONObject6.has("requireResidentKey") ? Boolean.valueOf(jSONObject6.optBoolean("requireResidentKey")) : null, jSONObject6.has("residentKey") ? jSONObject6.optString("residentKey") : null);
        } else {
            s02Var = null;
        }
        if (jSONObject.has("extensions")) {
            JSONObject jSONObject7 = jSONObject.getJSONObject("extensions");
            x8c x8cVar = jSONObject7.has("fidoAppIdExtension") ? new x8c(jSONObject7.getJSONObject("fidoAppIdExtension").getString(AppsFlyerProperties.APP_ID)) : null;
            if (jSONObject7.has(AppsFlyerProperties.APP_ID)) {
                x8cVar = new x8c(jSONObject7.getString(AppsFlyerProperties.APP_ID));
            }
            x8c x8cVar2 = x8cVar;
            if (!jSONObject7.has("prf")) {
                i = 0;
                if (jSONObject7.has("prfAlreadyHashed")) {
                    a = g1x.a(jSONObject7.getJSONObject("prfAlreadyHashed"), true);
                } else {
                    g1xVar = null;
                    if (jSONObject7.has("cableAuthenticationExtension")) {
                        jlxVar = null;
                    } else {
                        JSONArray jSONArray5 = jSONObject7.getJSONArray("cableAuthenticationExtension");
                        ArrayList arrayList5 = new ArrayList();
                        while (i < jSONArray5.length()) {
                            JSONObject jSONObject8 = jSONArray5.getJSONObject(i);
                            arrayList5.add(new sjx(jSONObject8.getLong("version"), Base64.decode(jSONObject8.getString("clientEid"), 11), Base64.decode(jSONObject8.getString("authenticatorEid"), 11), Base64.decode(jSONObject8.getString("sessionPreKey"), 11)));
                            i++;
                        }
                        jlxVar = new jlx(arrayList5);
                    }
                    ltt lttVar = !jSONObject7.has("userVerificationMethodExtension") ? new ltt(jSONObject7.getJSONObject("userVerificationMethodExtension").getBoolean("uvm")) : null;
                    lox loxVar = !jSONObject7.has("google_multiAssertionExtension") ? new lox(jSONObject7.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion")) : null;
                    f0x f0xVar = !jSONObject7.has("google_sessionIdExtension") ? new f0x(jSONObject7.getJSONObject("google_sessionIdExtension").getInt("sessionId")) : null;
                    n0x n0xVar = !jSONObject7.has("google_silentVerificationExtension") ? new n0x(jSONObject7.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification")) : null;
                    if (jSONObject7.has("devicePublicKeyExtension")) {
                        nmxVar = null;
                    } else {
                        jSONObject7.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey");
                        nmxVar = new nmx();
                    }
                    zz1Var = new zz1(x8cVar2, jlxVar, lttVar, loxVar, f0xVar, n0xVar, nmxVar, !jSONObject7.has("google_tunnelServerIdExtension") ? new v0x(jSONObject7.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId")) : null, !jSONObject7.has("google_thirdPartyPaymentExtension") ? new xnd(jSONObject7.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment")) : null, g1xVar, !jSONObject7.has("txAuthSimple") ? new o2x(jSONObject7.getString("txAuthSimple")) : null, null);
                }
            } else {
                if (jSONObject7.has("prfAlreadyHashed")) {
                    throw new JSONException("both prf and prfAlreadyHashed extensions found");
                }
                i = 0;
                a = g1x.a(jSONObject7.getJSONObject("prf"), false);
            }
            g1xVar = a;
            if (jSONObject7.has("cableAuthenticationExtension")) {
            }
            if (!jSONObject7.has("userVerificationMethodExtension")) {
            }
            if (!jSONObject7.has("google_multiAssertionExtension")) {
            }
            if (!jSONObject7.has("google_sessionIdExtension")) {
            }
            if (!jSONObject7.has("google_silentVerificationExtension")) {
            }
            if (jSONObject7.has("devicePublicKeyExtension")) {
            }
            zz1Var = new zz1(x8cVar2, jlxVar, lttVar, loxVar, f0xVar, n0xVar, nmxVar, !jSONObject7.has("google_tunnelServerIdExtension") ? new v0x(jSONObject7.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId")) : null, !jSONObject7.has("google_thirdPartyPaymentExtension") ? new xnd(jSONObject7.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment")) : null, g1xVar, !jSONObject7.has("txAuthSimple") ? new o2x(jSONObject7.getString("txAuthSimple")) : null, null);
        } else {
            zz1Var = null;
        }
        if (jSONObject.has("attestation")) {
            try {
                lu1Var = lu1.a(jSONObject.getString("attestation"));
            } catch (ku1 e) {
                Log.w("PKCCreationOptions", "Invalid AttestationConveyancePreference", e);
                lu1Var = lu1.NONE;
            }
        } else {
            lu1Var = null;
        }
        return new j0n(m0nVar, p0nVar, J, arrayList3, valueOf, arrayList, s02Var, null, null, lu1Var == null ? null : lu1Var.a, zz1Var, null, null);
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof j0n)) {
            return false;
        }
        j0n j0nVar = (j0n) obj;
        List list2 = j0nVar.d;
        List list3 = j0nVar.f;
        if (ldg.s(this.a, j0nVar.a) && ldg.s(this.b, j0nVar.b) && Arrays.equals(this.c, j0nVar.c) && ldg.s(this.e, j0nVar.e)) {
            List list4 = this.d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && ldg.s(this.g, j0nVar.g) && ldg.s(this.h, j0nVar.h) && ldg.s(this.i, j0nVar.i) && ldg.s(this.j, j0nVar.j) && ldg.s(this.k, j0nVar.k) && ldg.s(this.l, j0nVar.l))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(Arrays.hashCode(this.c)), this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String M = vq1.M(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        String valueOf6 = String.valueOf(this.i);
        String valueOf7 = String.valueOf(this.j);
        String valueOf8 = String.valueOf(this.k);
        StringBuilder m = f1d.m("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        su4.v(m, M, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        m.append(this.e);
        m.append(", \n excludeList=");
        m.append(valueOf4);
        m.append(", \n authenticatorSelection=");
        m.append(valueOf5);
        m.append(", \n requestId=");
        m.append(this.h);
        m.append(", \n tokenBinding=");
        m.append(valueOf6);
        m.append(", \n attestationConveyancePreference=");
        return ouj.q(m, valueOf7, ", \n authenticationExtensions=", valueOf8, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.i0(parcel, 2, this.a, i);
        o8g.i0(parcel, 3, this.b, i);
        o8g.c0(parcel, 4, this.c);
        o8g.n0(parcel, 5, this.d);
        Double d = this.e;
        if (d != null) {
            o8g.q0(6, 8, parcel);
            parcel.writeDouble(d.doubleValue());
        }
        o8g.n0(parcel, 7, this.f);
        o8g.i0(parcel, 8, this.g, i);
        o8g.g0(parcel, 9, this.h);
        o8g.i0(parcel, 10, this.i, i);
        lu1 lu1Var = this.j;
        o8g.j0(parcel, 11, lu1Var == null ? null : lu1Var.a);
        o8g.i0(parcel, 12, this.k, i);
        o8g.j0(parcel, 13, this.l);
        o8g.i0(parcel, 14, this.m, i);
        o8g.p0(parcel, o0);
    }

    public j0n(String str) {
        try {
            j0n a = a(new JSONObject(str));
            this.a = a.a;
            this.b = a.b;
            this.c = a.c;
            this.d = a.d;
            this.e = a.e;
            this.f = a.f;
            this.g = a.g;
            this.h = a.h;
            this.i = a.i;
            this.j = a.j;
            this.k = a.k;
            this.l = str;
        } catch (JSONException e) {
            xq0.t(e);
            throw null;
        }
    }
}
