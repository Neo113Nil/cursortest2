package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AuthenticationTokenManager$CurrentAuthenticationTokenChangedBroadcastReceiver;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j02 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<j02> CREATOR = new i02(0);
    public final String a;
    public final String b;
    public final l02 c;
    public final k02 d;
    public final String e;

    public j02(String str, String str2) {
        List split$default;
        str2.getClass();
        wxf.F(str, "token");
        wxf.F(str2, "expectedNonce");
        boolean z = false;
        split$default = StringsKt__StringsKt.split$default(str, new String[]{"."}, false, 0, 6, null);
        if (split$default.size() != 3) {
            xq0.x("Invalid IdToken string");
            throw null;
        }
        String str3 = (String) split$default.get(0);
        String str4 = (String) split$default.get(1);
        String str5 = (String) split$default.get(2);
        this.a = str;
        this.b = str2;
        l02 l02Var = new l02(str3);
        this.c = l02Var;
        this.d = new k02(str4, str2);
        try {
            String E = vnj.E(l02Var.c);
            if (E != null) {
                z = vnj.U(vnj.D(E), str3 + '.' + str4, str5);
            }
        } catch (IOException | InvalidKeySpecException unused) {
        }
        if (z) {
            this.e = str5;
        } else {
            xq0.x("Invalid Signature");
            throw null;
        }
    }

    public static final void a(j02 j02Var) {
        klx klxVar = osh.f;
        osh oshVar = osh.e;
        if (oshVar == null) {
            synchronized (klxVar) {
                oshVar = osh.e;
                if (oshVar == null) {
                    phg a = phg.a(j3c.b());
                    a.getClass();
                    znk znkVar = new znk(6);
                    a.getClass();
                    osh oshVar2 = new osh();
                    oshVar2.b = a;
                    oshVar2.c = znkVar;
                    osh.e = oshVar2;
                    oshVar = oshVar2;
                }
            }
        }
        j02 j02Var2 = (j02) oshVar.a;
        oshVar.a = j02Var;
        znk znkVar2 = (znk) oshVar.c;
        if (j02Var != null) {
            try {
                ((SharedPreferences) znkVar2.b).edit().putString("com.facebook.AuthenticationManager.CachedAuthenticationToken", j02Var.d().toString()).apply();
            } catch (JSONException unused) {
            }
        } else {
            ((SharedPreferences) znkVar2.b).edit().remove("com.facebook.AuthenticationManager.CachedAuthenticationToken").apply();
            gvt.c(j3c.b());
        }
        if (j02Var2 == null ? j02Var == null : j02Var2.equals(j02Var)) {
            return;
        }
        Intent intent = new Intent(j3c.b(), (Class<?>) AuthenticationTokenManager$CurrentAuthenticationTokenChangedBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN", j02Var2);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN", j02Var);
        ((phg) oshVar.b).c(intent);
    }

    public final JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token_string", this.a);
        jSONObject.put("expected_nonce", this.b);
        l02 l02Var = this.c;
        l02Var.getClass();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("alg", l02Var.a);
        jSONObject2.put("typ", l02Var.b);
        jSONObject2.put("kid", l02Var.c);
        jSONObject.put("header", jSONObject2);
        jSONObject.put("claims", this.d.d());
        jSONObject.put("signature", this.e);
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j02)) {
            return false;
        }
        j02 j02Var = (j02) obj;
        return Intrinsics.d(this.a, j02Var.a) && Intrinsics.d(this.b, j02Var.b) && Intrinsics.d(this.c, j02Var.c) && Intrinsics.d(this.d, j02Var.d) && Intrinsics.d(this.e, j02Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + k5r.c(k5r.c(527, 31, this.a), 31, this.b)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
    }

    public j02(Parcel parcel) {
        String readString = parcel.readString();
        wxf.I(readString, "token");
        if (readString != null) {
            this.a = readString;
            String readString2 = parcel.readString();
            wxf.H(readString2, "expectedNonce");
            this.b = readString2;
            Parcelable readParcelable = parcel.readParcelable(l02.class.getClassLoader());
            if (readParcelable != null) {
                this.c = (l02) readParcelable;
                Parcelable readParcelable2 = parcel.readParcelable(k02.class.getClassLoader());
                if (readParcelable2 != null) {
                    this.d = (k02) readParcelable2;
                    String readString3 = parcel.readString();
                    wxf.I(readString3, "signature");
                    if (readString3 == null) {
                        xq0.q("Required value was null.");
                        throw null;
                    }
                    this.e = readString3;
                    return;
                }
                xq0.q("Required value was null.");
                throw null;
            }
            xq0.q("Required value was null.");
            throw null;
        }
        xq0.q("Required value was null.");
        throw null;
    }
}
