package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.yandex.plus.pay.inapp.google.internal.a;
import io.appmetrica.analytics.billingv6.impl.i;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class tzw implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tzw(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0051, code lost:
    
        r16 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x005f, code lost:
    
        r0 = r2.r(defpackage.b6x.k, 119, "Service reset to null", r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a() {
        rjp rjpVar;
        Exception exc;
        q1x q1xVar;
        qz2 qz2Var = (qz2) this.d;
        String str = (String) this.c;
        qz2Var.getClass();
        l8x.f("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z = qz2Var.m;
        boolean z2 = qz2Var.s;
        qz2Var.v.getClass();
        qz2Var.v.getClass();
        Bundle c = l8x.c(z, z2, qz2Var.c, qz2Var.z.longValue());
        Exception exc2 = null;
        String str2 = null;
        while (true) {
            if (!qz2Var.l) {
                l8x.g("BillingClient", "getPurchaseHistory is not supported on current device");
                rjpVar = new rjp(b6x.n, exc2, false);
                break;
            }
            try {
                synchronized (qz2Var.a) {
                    try {
                        q1xVar = qz2Var.h;
                    } catch (Throwable th) {
                        th = th;
                        exc = exc2;
                        while (true) {
                            try {
                                try {
                                    throw th;
                                } catch (DeadObjectException e) {
                                    e = e;
                                    rjpVar = qz2Var.r(b6x.k, 59, "Got exception trying to get purchase history", e);
                                    ((i) this.b).onPurchaseHistoryResponse((uz2) rjpVar.b, (List) rjpVar.a);
                                    return exc;
                                } catch (Exception e2) {
                                    e = e2;
                                    rjpVar = qz2Var.r(b6x.i, 59, "Got exception trying to get purchase history", e);
                                    ((i) this.b).onPurchaseHistoryResponse((uz2) rjpVar.b, (List) rjpVar.a);
                                    return exc;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                }
                if (q1xVar == null) {
                    break;
                }
                Bundle X0 = ((l1x) q1xVar).X0(qz2Var.f.getPackageName(), str, str2, c);
                j4x S = ngg.S(X0, "getPurchaseHistory()");
                uz2 uz2Var = (uz2) S.c;
                if (uz2Var != b6x.j) {
                    qz2Var.y(S.b, 11, uz2Var);
                    rjpVar = new rjp(uz2Var, exc2, false);
                    break;
                }
                ArrayList<String> stringArrayList = X0.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = X0.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = X0.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                int i = 0;
                boolean z3 = false;
                while (i < stringArrayList2.size()) {
                    String str3 = stringArrayList2.get(i);
                    String str4 = stringArrayList3.get(i);
                    exc = exc2;
                    l8x.f("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i))));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str3, str4);
                        if (TextUtils.isEmpty(purchaseHistoryRecord.b())) {
                            l8x.g("BillingClient", "BUG: empty/null token!");
                            z3 = true;
                        }
                        arrayList.add(purchaseHistoryRecord);
                        i++;
                        exc2 = exc;
                    } catch (JSONException e3) {
                        rjpVar = qz2Var.r(b6x.i, 51, "Got an exception trying to decode the purchase!", e3);
                    }
                }
                exc = exc2;
                if (z3) {
                    qz2Var.y(26, 11, b6x.i);
                }
                str2 = X0.getString("INAPP_CONTINUATION_TOKEN");
                l8x.f("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                if (TextUtils.isEmpty(str2)) {
                    rjpVar = new rjp(b6x.j, arrayList, false);
                    break;
                }
                exc2 = exc;
            } catch (DeadObjectException e4) {
                e = e4;
                exc = exc2;
            } catch (Exception e5) {
                e = e5;
                exc = exc2;
            }
        }
        ((i) this.b).onPurchaseHistoryResponse((uz2) rjpVar.b, (List) rjpVar.a);
        return exc;
    }

    private final Object b() {
        Bundle i;
        q1x q1xVar;
        qz2 qz2Var = (qz2) this.b;
        String str = (String) this.c;
        String str2 = (String) this.d;
        try {
            synchronized (qz2Var.a) {
                q1xVar = qz2Var.h;
            }
            if (q1xVar == null) {
                return l8x.i(b6x.k, 119);
            }
            return ((l1x) q1xVar).V0(qz2Var.f.getPackageName(), str, str2);
        } catch (DeadObjectException e) {
            uz2 uz2Var = b6x.k;
            String a = v5x.a(e);
            i = l8x.i(uz2Var, 5);
            if (a != null) {
                i.putString("ADDITIONAL_LOG_DETAILS", a);
            }
            return i;
        } catch (Exception e2) {
            uz2 uz2Var2 = b6x.i;
            String a2 = v5x.a(e2);
            i = l8x.i(uz2Var2, 5);
            if (a2 != null) {
                i.putString("ADDITIONAL_LOG_DETAILS", a2);
            }
            return i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x010b, code lost:
    
        r18 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0230  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        Exception exc;
        DeadObjectException deadObjectException;
        q1x q1xVar;
        String str;
        int i;
        String e;
        w2r w2rVar;
        q1x q1xVar2;
        Exception exc2;
        apo s;
        List list;
        q1x q1xVar3;
        q1x q1xVar4;
        boolean z = true;
        int i2 = 119;
        Exception exc3 = null;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((SharedPreferences) this.b).getBoolean((String) this.c, ((Boolean) this.d).booleanValue()));
            case 1:
                qz2 qz2Var = (qz2) this.b;
                psd psdVar = (psd) this.c;
                a aVar = (a) this.d;
                String str2 = "Error consuming purchase with token. Response code: ";
                String str3 = psdVar.b;
                try {
                    l8x.f("BillingClient", "Consuming purchase with token: " + str3);
                    synchronized (qz2Var.a) {
                        try {
                            try {
                                q1xVar = qz2Var.h;
                            } catch (Throwable th) {
                                th = th;
                                while (true) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                            }
                        } catch (DeadObjectException e2) {
                            e = e2;
                        } catch (Exception e3) {
                            e = e3;
                        }
                    }
                    if (q1xVar == null) {
                        try {
                            str2 = str3;
                            try {
                                qz2Var.u(aVar, str2, b6x.k, 119, "Service has been reset to null.", null);
                                return null;
                            } catch (DeadObjectException e4) {
                                e = e4;
                                deadObjectException = e;
                                qz2Var.u(aVar, str2, b6x.k, 29, "Error consuming purchase!", deadObjectException);
                                return null;
                            } catch (Exception e5) {
                                e = e5;
                                exc = e;
                                qz2Var.u(aVar, str2, b6x.i, 29, "Error consuming purchase!", exc);
                                return null;
                            }
                        } catch (DeadObjectException e6) {
                            e = e6;
                            str = str3;
                            deadObjectException = e;
                            str2 = str;
                            qz2Var.u(aVar, str2, b6x.k, 29, "Error consuming purchase!", deadObjectException);
                            return null;
                        } catch (Exception e7) {
                            e = e7;
                            str = str3;
                            exc = e;
                            str2 = str;
                            qz2Var.u(aVar, str2, b6x.i, 29, "Error consuming purchase!", exc);
                            return null;
                        }
                    }
                    str = str3;
                    try {
                        boolean z2 = qz2Var.m;
                        Context context = qz2Var.f;
                        if (z2) {
                            try {
                                String packageName = context.getPackageName();
                                boolean z3 = qz2Var.m;
                                String str4 = qz2Var.c;
                                long longValue = qz2Var.z.longValue();
                                Bundle bundle = new Bundle();
                                if (z3) {
                                    l8x.b(bundle, str4, longValue);
                                }
                                Bundle U0 = ((l1x) q1xVar).U0(packageName, str, bundle);
                                i = U0.getInt("RESPONSE_CODE");
                                e = l8x.e(U0, "BillingClient");
                            } catch (DeadObjectException e8) {
                                e = e8;
                                deadObjectException = e;
                                str2 = str;
                                qz2Var.u(aVar, str2, b6x.k, 29, "Error consuming purchase!", deadObjectException);
                                return null;
                            } catch (Exception e9) {
                                e = e9;
                                exc = e;
                                str2 = str;
                                qz2Var.u(aVar, str2, b6x.i, 29, "Error consuming purchase!", exc);
                                return null;
                            }
                        } else {
                            String packageName2 = context.getPackageName();
                            l1x l1xVar = (l1x) q1xVar;
                            Parcel Q0 = l1xVar.Q0();
                            Q0.writeInt(3);
                            Q0.writeString(packageName2);
                            Q0.writeString(str);
                            Parcel R0 = l1xVar.R0(Q0, 5);
                            i = R0.readInt();
                            R0.recycle();
                            e = "";
                        }
                        uz2 a = b6x.a(i, e);
                        if (i == 0) {
                            l8x.f("BillingClient", "Successfully consumed purchase.");
                            aVar.c(a, str);
                            return null;
                        }
                        qz2Var.u(aVar, str, a, 23, "Error consuming purchase with token. Response code: " + i, null);
                        return null;
                    } catch (DeadObjectException e10) {
                        e = e10;
                        str2 = str;
                        deadObjectException = e;
                        qz2Var.u(aVar, str2, b6x.k, 29, "Error consuming purchase!", deadObjectException);
                        return null;
                    } catch (Exception e11) {
                        e = e11;
                        str2 = str;
                        exc = e;
                        qz2Var.u(aVar, str2, b6x.i, 29, "Error consuming purchase!", exc);
                        return null;
                    }
                } catch (DeadObjectException e12) {
                    e = e12;
                    str2 = str3;
                } catch (Exception e13) {
                    e = e13;
                    str2 = str3;
                }
            case 2:
                Exception exc4 = null;
                qz2 qz2Var2 = (qz2) this.b;
                z6n z6nVar = (z6n) this.c;
                ArrayList arrayList = new ArrayList();
                String str5 = ((y6n) ((i6x) z6nVar.b).get(0)).b;
                i6x i6xVar = (i6x) z6nVar.b;
                int size = i6xVar.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        w2rVar = new w2r(0, "", arrayList);
                    } else {
                        int i4 = i3 + 20;
                        ArrayList arrayList2 = new ArrayList(i6xVar.subList(i3, i4 > size ? size : i4));
                        ArrayList<String> arrayList3 = new ArrayList<>();
                        int size2 = arrayList2.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            arrayList3.add(((y6n) arrayList2.get(i5)).a);
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putStringArrayList("ITEM_ID_LIST", arrayList3);
                        bundle2.putString("playBillingLibraryVersion", qz2Var2.c);
                        try {
                            synchronized (qz2Var2.a) {
                                q1xVar2 = qz2Var2.h;
                            }
                            if (q1xVar2 == null) {
                                w2rVar = qz2Var2.q(b6x.k, 119, "Service has been reset to null.", exc4);
                            } else {
                                int i6 = true != qz2Var2.t ? 17 : 20;
                                String packageName3 = qz2Var2.f.getPackageName();
                                if (qz2Var2.s) {
                                    qz2Var2.v.getClass();
                                }
                                String str6 = qz2Var2.c;
                                qz2Var2.k();
                                qz2Var2.k();
                                qz2Var2.k();
                                qz2Var2.k();
                                long longValue2 = qz2Var2.z.longValue();
                                Bundle bundle3 = new Bundle();
                                l8x.b(bundle3, str6, longValue2);
                                bundle3.putBoolean("enablePendingPurchases", true);
                                bundle3.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                                ArrayList<String> arrayList4 = new ArrayList<>();
                                ArrayList<String> arrayList5 = new ArrayList<>();
                                int size3 = arrayList2.size();
                                i6x i6xVar2 = i6xVar;
                                int i7 = 0;
                                boolean z4 = false;
                                while (i7 < size3) {
                                    int i8 = i7;
                                    y6n y6nVar = (y6n) arrayList2.get(i7);
                                    int i9 = size;
                                    arrayList4.add(null);
                                    z4 |= !TextUtils.isEmpty(null);
                                    if (y6nVar.b.equals("first_party")) {
                                        throw new NullPointerException("Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                                    }
                                    i7 = i8 + 1;
                                    size = i9;
                                }
                                int i10 = size;
                                if (z4) {
                                    bundle3.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                                }
                                if (!arrayList5.isEmpty()) {
                                    bundle3.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                                }
                                Bundle a1 = ((l1x) q1xVar2).a1(i6, packageName3, str5, bundle2, bundle3);
                                if (a1 == null) {
                                    w2rVar = qz2Var2.q(b6x.s, 44, "queryProductDetailsAsync got empty product details response.", null);
                                } else if (a1.containsKey("DETAILS_LIST")) {
                                    ArrayList<String> stringArrayList = a1.getStringArrayList("DETAILS_LIST");
                                    if (stringArrayList != null) {
                                        for (int i11 = 0; i11 < stringArrayList.size(); i11++) {
                                            try {
                                                ptm ptmVar = new ptm(stringArrayList.get(i11));
                                                l8x.f("BillingClient", "Got product details: ".concat(ptmVar.toString()));
                                                arrayList.add(ptmVar);
                                            } catch (JSONException e14) {
                                                w2rVar = qz2Var2.q(b6x.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e14);
                                            }
                                        }
                                        i3 = i4;
                                        i6xVar = i6xVar2;
                                        size = i10;
                                        exc4 = null;
                                    } else {
                                        w2rVar = qz2Var2.q(b6x.s, 46, "queryProductDetailsAsync got null response list", null);
                                    }
                                } else {
                                    int a2 = l8x.a(a1, "BillingClient");
                                    String e15 = l8x.e(a1, "BillingClient");
                                    w2rVar = a2 != 0 ? qz2Var2.q(b6x.a(a2, e15), 23, k5r.i(a2, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "), null) : qz2Var2.q(b6x.a(6, e15), 45, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                                }
                            }
                        } catch (DeadObjectException e16) {
                            w2rVar = qz2Var2.q(b6x.k, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e16);
                        } catch (Exception e17) {
                            w2rVar = qz2Var2.q(b6x.i, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e17);
                        }
                    }
                }
                ((qtm) this.d).onProductDetailsResponse(b6x.a(w2rVar.b, (String) w2rVar.d), (ArrayList) w2rVar.c);
                return null;
            case 3:
                qz2 qz2Var3 = (qz2) this.d;
                String str7 = (String) this.c;
                qz2Var3.getClass();
                l8x.f("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str7)));
                ArrayList arrayList6 = new ArrayList();
                boolean z5 = qz2Var3.m;
                boolean z6 = qz2Var3.s;
                qz2Var3.v.getClass();
                qz2Var3.v.getClass();
                Bundle c = l8x.c(z5, z6, qz2Var3.c, qz2Var3.z.longValue());
                String str8 = null;
                while (true) {
                    try {
                        synchronized (qz2Var3.a) {
                            try {
                                q1xVar3 = qz2Var3.h;
                            } catch (Throwable th3) {
                                th = th3;
                                exc2 = exc3;
                                while (true) {
                                    try {
                                        try {
                                            throw th;
                                        } catch (DeadObjectException e18) {
                                            e = e18;
                                            s = qz2Var3.s(b6x.k, 52, "Got exception trying to get purchases try to reconnect", e);
                                            list = (List) s.b;
                                            m4n m4nVar = (m4n) this.b;
                                            uz2 uz2Var = (uz2) s.c;
                                            if (list != null) {
                                            }
                                            return exc2;
                                        } catch (Exception e19) {
                                            e = e19;
                                            s = qz2Var3.s(b6x.i, 52, "Got exception trying to get purchases try to reconnect", e);
                                            list = (List) s.b;
                                            m4n m4nVar2 = (m4n) this.b;
                                            uz2 uz2Var2 = (uz2) s.c;
                                            if (list != null) {
                                            }
                                            return exc2;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                }
                            }
                        }
                        if (q1xVar3 == null) {
                            s = qz2Var3.s(b6x.k, i2, "Service has been reset to null", exc3);
                            break;
                        } else {
                            Bundle Z0 = qz2Var3.m ? ((l1x) q1xVar3).Z0(z != qz2Var3.s ? 9 : 19, qz2Var3.f.getPackageName(), str7, str8, c) : ((l1x) q1xVar3).Y0(qz2Var3.f.getPackageName(), str7, str8);
                            j4x S = ngg.S(Z0, "getPurchase()");
                            uz2 uz2Var3 = (uz2) S.c;
                            if (uz2Var3 != b6x.j) {
                                s = qz2Var3.s(uz2Var3, S.b, "Purchase bundle invalid", exc3);
                                break;
                            } else {
                                ArrayList<String> stringArrayList2 = Z0.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                                ArrayList<String> stringArrayList3 = Z0.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                                ArrayList<String> stringArrayList4 = Z0.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                                int i12 = 0;
                                boolean z7 = false;
                                while (i12 < stringArrayList3.size()) {
                                    String str9 = stringArrayList3.get(i12);
                                    String str10 = stringArrayList4.get(i12);
                                    exc2 = exc3;
                                    l8x.f("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList2.get(i12))));
                                    try {
                                        Purchase purchase = new Purchase(str9, str10);
                                        if (TextUtils.isEmpty(purchase.b())) {
                                            l8x.g("BillingClient", "BUG: empty/null token!");
                                            z7 = true;
                                        }
                                        arrayList6.add(purchase);
                                        i12++;
                                        exc3 = exc2;
                                    } catch (JSONException e20) {
                                        s = qz2Var3.s(b6x.i, 51, "Got an exception trying to decode the purchase!", e20);
                                    }
                                }
                                exc2 = exc3;
                                if (z7) {
                                    qz2Var3.y(26, 9, b6x.i);
                                }
                                str8 = Z0.getString("INAPP_CONTINUATION_TOKEN");
                                l8x.f("BillingClient", "Continuation token: ".concat(String.valueOf(str8)));
                                if (TextUtils.isEmpty(str8)) {
                                    s = new apo(b6x.j, arrayList6, false, 21);
                                } else {
                                    exc3 = exc2;
                                    z = true;
                                    i2 = 119;
                                }
                            }
                        }
                    } catch (DeadObjectException e21) {
                        e = e21;
                        exc2 = exc3;
                    } catch (Exception e22) {
                        e = e22;
                        exc2 = exc3;
                    }
                }
                list = (List) s.b;
                m4n m4nVar22 = (m4n) this.b;
                uz2 uz2Var22 = (uz2) s.c;
                if (list != null) {
                    m4nVar22.onQueryPurchasesResponse(uz2Var22, list);
                } else {
                    e6x e6xVar = i6x.b;
                    m4nVar22.onQueryPurchasesResponse(uz2Var22, p7x.e);
                }
                return exc2;
            case 4:
                return a();
            case 5:
                return Integer.valueOf(((SharedPreferences) this.b).getInt((String) this.c, ((Integer) this.d).intValue()));
            case 6:
                return Long.valueOf(((SharedPreferences) this.b).getLong((String) this.c, ((Long) this.d).longValue()));
            case 7:
                return ((SharedPreferences) this.b).getString((String) this.c, (String) this.d);
            case 8:
                return b();
            default:
                qz2 qz2Var4 = (qz2) this.b;
                a aVar2 = (a) this.c;
                fd fdVar = (fd) this.d;
                try {
                    synchronized (qz2Var4.a) {
                        q1xVar4 = qz2Var4.h;
                    }
                    if (q1xVar4 == null) {
                        qz2Var4.t(aVar2, b6x.k, 119, null);
                    } else {
                        String packageName4 = qz2Var4.f.getPackageName();
                        String str11 = fdVar.a;
                        String str12 = qz2Var4.c;
                        long longValue3 = qz2Var4.z.longValue();
                        Bundle bundle4 = new Bundle();
                        l8x.b(bundle4, str12, longValue3);
                        Bundle T0 = ((l1x) q1xVar4).T0(packageName4, str11, bundle4);
                        aVar2.a.U(b6x.a(l8x.a(T0, "BillingClient"), l8x.e(T0, "BillingClient")));
                    }
                } catch (DeadObjectException e23) {
                    qz2Var4.t(aVar2, b6x.k, 28, e23);
                } catch (Exception e24) {
                    qz2Var4.t(aVar2, b6x.i, 28, e24);
                }
                return null;
        }
    }

    public /* synthetic */ tzw(qz2 qz2Var, String str, Object obj, int i) {
        this.a = i;
        this.c = str;
        this.b = obj;
        this.d = qz2Var;
    }
}
