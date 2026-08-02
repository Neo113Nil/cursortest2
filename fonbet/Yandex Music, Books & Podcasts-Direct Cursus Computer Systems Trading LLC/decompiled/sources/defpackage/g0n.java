package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g0n extends l9 {

    @NonNull
    public static final Parcelable.Creator<g0n> CREATOR = new vzw(21);
    public final String a;
    public final String b;
    public final obx c;
    public final n02 d;
    public final m02 e;
    public final o02 f;
    public final a02 g;
    public final String h;

    public g0n(String str, String str2, byte[] bArr, n02 n02Var, m02 m02Var, o02 o02Var, a02 a02Var, String str3) {
        obx t = bArr == null ? null : obx.t(bArr.length, bArr);
        boolean z = false;
        y1g.y("Must provide a response object.", (n02Var != null && m02Var == null && o02Var == null) || (n02Var == null && m02Var != null && o02Var == null) || (n02Var == null && m02Var == null && o02Var != null));
        if (o02Var != null || (str != null && t != null)) {
            z = true;
        }
        y1g.y("Must provide id and rawId if not an error response.", z);
        this.a = str;
        this.b = str2;
        this.c = t;
        this.d = n02Var;
        this.e = m02Var;
        this.f = o02Var;
        this.g = a02Var;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g0n)) {
            return false;
        }
        g0n g0nVar = (g0n) obj;
        return ldg.s(this.a, g0nVar.a) && ldg.s(this.b, g0nVar.b) && ldg.s(this.c, g0nVar.c) && ldg.s(this.d, g0nVar.d) && ldg.s(this.e, g0nVar.e) && ldg.s(this.f, g0nVar.f) && ldg.s(this.g, g0nVar.g) && ldg.s(this.h, g0nVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e, this.d, this.f, this.g, this.h});
    }

    public final String toString() {
        obx obxVar = this.c;
        String M = vq1.M(obxVar == null ? null : obxVar.u());
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.g);
        StringBuilder m = f1d.m("PublicKeyCredential{\n id='", this.a, "', \n type='", this.b, "', \n rawId=");
        su4.v(m, M, ", \n registerResponse=", valueOf, ", \n signResponse=");
        su4.v(m, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        return ouj.q(m, valueOf4, ", \n authenticatorAttachment='", this.h, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        udx.a.d();
        throw null;
    }
}
