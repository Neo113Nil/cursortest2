package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class qgx extends BroadcastReceiver {
    public boolean a;
    public final boolean b;
    public final /* synthetic */ evj c;

    public qgx(evj evjVar, boolean z) {
        this.c = evjVar;
        this.b = z;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter) {
        qgx qgxVar;
        try {
            try {
                if (this.a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    qgxVar = this;
                    context.registerReceiver(qgxVar, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.b ? 4 : 2);
                } else {
                    qgxVar = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                qgxVar.a = true;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized void c(Context context) {
        if (!this.a) {
            l8x.g("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.a = false;
        }
    }

    public final void d(Bundle bundle, uz2 uz2Var, int i) {
        qbx M;
        try {
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            x5x x5xVar = (x5x) this.c.b;
            if (byteArray == null) {
                ((atn) x5xVar).V(v5x.b(23, i, uz2Var));
                return;
            }
            byte[] byteArray2 = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            int i2 = qbx.a;
            synchronized (qbx.class) {
                int i3 = qbx.a;
                fex fexVar = fex.c;
                M = bcx.M();
                int i4 = qbx.a;
            }
            ((atn) x5xVar).V(bfx.n(byteArray2, M));
        } catch (Throwable unused) {
            l8x.g("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0109  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        evj evjVar = this.c;
        x5x x5xVar = (x5x) evjVar.b;
        n4n n4nVar = (n4n) evjVar.d;
        Bundle extras = intent.getExtras();
        ArrayList arrayList = null;
        if (extras == null) {
            l8x.g("BillingBroadcastManager", "Bundle is null.");
            uz2 uz2Var = b6x.i;
            ((atn) x5xVar).V(v5x.b(11, 1, uz2Var));
            if (n4nVar != null) {
                n4nVar.onPurchasesUpdated(uz2Var, null);
                return;
            }
            return;
        }
        uz2 d = l8x.d(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        int i = true == Objects.equals(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW") ? 2 : 1;
        if (!action.equals("com.android.vending.billing.PURCHASES_UPDATED") && !action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
            if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                if (d.a != 0) {
                    d(extras, d, i);
                    e6x e6xVar = i6x.b;
                    n4nVar.onPurchasesUpdated(d, p7x.e);
                    return;
                } else {
                    l8x.g("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                    uz2 uz2Var2 = b6x.i;
                    ((atn) x5xVar).V(v5x.b(77, i, uz2Var2));
                    e6x e6xVar2 = i6x.b;
                    n4nVar.onPurchasesUpdated(uz2Var2, p7x.e);
                    return;
                }
            }
            return;
        }
        ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList2 = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase j = l8x.j(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"));
            if (j == null) {
                l8x.f("BillingHelper", "Couldn't find single purchase data as well.");
                if (d.a != 0) {
                    ((atn) x5xVar).X(v5x.d(i));
                } else {
                    d(extras, d, i);
                }
                n4nVar.onPurchasesUpdated(d, arrayList);
            }
            arrayList2.add(j);
        } else {
            l8x.f("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
            for (int i2 = 0; i2 < stringArrayList.size() && i2 < stringArrayList2.size(); i2++) {
                Purchase j2 = l8x.j(stringArrayList.get(i2), stringArrayList2.get(i2));
                if (j2 != null) {
                    arrayList2.add(j2);
                }
            }
        }
        arrayList = arrayList2;
        if (d.a != 0) {
        }
        n4nVar.onPurchasesUpdated(d, arrayList);
    }
}
