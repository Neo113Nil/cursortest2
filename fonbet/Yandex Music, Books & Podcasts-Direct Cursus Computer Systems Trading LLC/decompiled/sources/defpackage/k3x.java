package defpackage;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.pay.inapp.google.internal.a;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class k3x extends pww {
    public final a h;
    public final x5x i;
    public final int j;

    public k3x(a aVar, atn atnVar, int i) {
        super("com.android.vending.billing.IInAppBillingGetBillingConfigCallback", 2);
        this.h = aVar;
        this.i = atnVar;
        this.j = i;
    }

    @Override // defpackage.pww
    public final boolean R0(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) z1x.a(parcel);
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(k5r.i(dataAvail, "Parcel data not fully consumed, unread size: "));
        }
        int i2 = this.j;
        x5x x5xVar = this.i;
        a aVar = this.h;
        if (bundle == null) {
            uz2 uz2Var = b6x.i;
            ((atn) x5xVar).W(v5x.b(63, 13, uz2Var), i2);
            aVar.b(uz2Var, null);
        } else {
            int a = l8x.a(bundle, "BillingClient");
            String e = l8x.e(bundle, "BillingClient");
            tzb a2 = uz2.a();
            a2.b = a;
            a2.a = e;
            if (a != 0) {
                l8x.g("BillingClient", "getBillingConfig() failed. Response code: " + a);
                uz2 a3 = a2.a();
                ((atn) x5xVar).W(v5x.b(23, 13, a3), i2);
                aVar.b(a3, null);
            } else if (bundle.containsKey("BILLING_CONFIG")) {
                try {
                    aVar.b(a2.a(), new sz2(bundle.getString("BILLING_CONFIG")));
                } catch (JSONException e2) {
                    l8x.h("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e2);
                    uz2 uz2Var2 = b6x.i;
                    ((atn) x5xVar).W(v5x.b(65, 13, uz2Var2), i2);
                    aVar.b(uz2Var2, null);
                }
            } else {
                l8x.g("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
                a2.b = 6;
                uz2 a4 = a2.a();
                ((atn) x5xVar).W(v5x.b(64, 13, a4), i2);
                aVar.b(a4, null);
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
