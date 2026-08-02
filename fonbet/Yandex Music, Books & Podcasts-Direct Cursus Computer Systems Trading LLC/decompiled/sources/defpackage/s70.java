package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class s70 {
    public volatile Object a;
    public Object b;
    public volatile Object c;

    public /* synthetic */ s70(Object obj) {
        this.b = obj;
    }

    public qz2 a() {
        if (((Context) this.b) == null) {
            xq0.x("Please provide a valid Context.");
            return null;
        }
        if (((n4n) this.c) == null) {
            xq0.x("Please provide a valid listener for purchases updates.");
            return null;
        }
        if (((gos) this.a) == null) {
            xq0.x("Pending purchases for one-time products must be supported.");
            return null;
        }
        ((gos) this.a).getClass();
        n4n n4nVar = (n4n) this.c;
        gos gosVar = (gos) this.a;
        Context context = (Context) this.b;
        if (n4nVar == null) {
            return b() ? new r5x(gosVar, context) : new qz2(gosVar, context);
        }
        n4n n4nVar2 = (n4n) this.c;
        return b() ? new r5x(gosVar, context, n4nVar2) : new qz2(gosVar, context, n4nVar2);
    }

    public boolean b() {
        Context context = (Context) this.b;
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception e) {
            l8x.h("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e);
            return false;
        }
    }
}
