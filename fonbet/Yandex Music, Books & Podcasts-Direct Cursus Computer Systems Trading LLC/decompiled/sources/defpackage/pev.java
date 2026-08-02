package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.t;
import com.connectsdk.service.airplay.PListParser;

/* loaded from: classes.dex */
public final class pev extends sbv {
    public static final Parcelable.Creator<pev> CREATOR = new b3s(26);
    public lbv d;
    public String e;

    @Override // defpackage.ytg
    public final void d() {
        lbv lbvVar = this.d;
        if (lbvVar != null) {
            lbvVar.cancel();
            this.d = null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.ytg
    public final String j() {
        return "web_view";
    }

    @Override // defpackage.ytg
    public final int n(atg atgVar) {
        Bundle o = o(atgVar);
        dxr dxrVar = new dxr(this, atgVar, false);
        String h = ctg.h();
        this.e = h;
        a("e2e", h);
        t l = i().c.l();
        boolean A = gvt.A(l);
        String str = atgVar.d;
        if (str == null) {
            wxf.H(l, "context");
            str = j3c.c();
        }
        wxf.I(str, "applicationId");
        String str2 = this.e;
        String str3 = A ? "fbconnect://chrome_os_success" : "fbconnect://success";
        String str4 = atgVar.h;
        int i = atgVar.a;
        String str5 = str;
        int i2 = atgVar.l;
        boolean z = atgVar.m;
        boolean z2 = atgVar.n;
        o.putString("redirect_uri", str3);
        o.putString("client_id", str5);
        o.putString("e2e", str2);
        o.putString("response_type", i2 == 2 ? "token,signed_request,graph_domain,granted_scopes" : "token,signed_request,graph_domain");
        o.putString("return_scopes", PListParser.TAG_TRUE);
        o.putString("auth_type", str4);
        o.putString("login_behavior", hrg.C(i));
        if (z) {
            o.putString("fx_app", hrg.e(i2));
        }
        if (z2) {
            o.putString("skip_dedupe", PListParser.TAG_TRUE);
        }
        int i3 = lbv.m;
        if (i2 == 0) {
            throw null;
        }
        ivf.G(l);
        this.d = new lbv(l, "oauth", o, i2, dxrVar);
        b3c b3cVar = new b3c();
        b3cVar.setRetainInstance(true);
        b3cVar.g = this.d;
        b3cVar.show(l.getSupportFragmentManager(), "FacebookDialogFragment");
        return 1;
    }

    @Override // defpackage.sbv
    public final ra p() {
        return ra.WEB_VIEW;
    }

    @Override // defpackage.ytg, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.e);
    }
}
