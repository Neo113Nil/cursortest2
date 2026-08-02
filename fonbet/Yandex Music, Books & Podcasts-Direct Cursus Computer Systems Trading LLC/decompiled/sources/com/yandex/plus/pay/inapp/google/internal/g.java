package com.yandex.plus.pay.inapp.google.internal;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.android.billingclient.api.Purchase;
import com.yandex.passport.internal.flags.experiments.p;
import com.yandex.passport.internal.t;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.metrica.utils.n;
import com.yandex.plus.pay.adapter.api.h0;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.dfi;
import defpackage.gos;
import defpackage.kac;
import defpackage.n4n;
import defpackage.nm6;
import defpackage.ptm;
import defpackage.qgg;
import defpackage.qz2;
import defpackage.r7o;
import defpackage.s70;
import defpackage.sz2;
import defpackage.t7o;
import defpackage.uz2;
import defpackage.v75;
import defpackage.xq0;
import defpackage.z7o;
import defpackage.zsd;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.text.Charsets;

/* loaded from: classes5.dex */
public final class g implements com.yandex.plus.pay.inapp.api.b, n4n {
    public final Context a;
    public final com.yandex.plus.log.api.b b;
    public final com.yandex.plus.core.activity.result.internal.h c;
    public final List d;
    public final com.yandex.plus.bdui.flex.factory.e e;

    public g(Context context, com.yandex.plus.log.api.b bVar) {
        context.getClass();
        bVar.getClass();
        this.a = context;
        this.b = bVar;
        this.c = com.yandex.plus.core.activity.result.internal.h.d;
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        synchronizedList.getClass();
        this.d = synchronizedList;
        this.e = new com.yandex.plus.bdui.flex.factory.e(bVar, 6);
    }

    public static final qz2 f(g gVar) {
        s70 s70Var = new s70(gVar.a);
        s70Var.a = new gos(29);
        s70Var.c = gVar;
        return s70Var.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.plus.pay.inapp.api.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        c cVar;
        int i;
        if (cg6Var instanceof c) {
            cVar = (c) cg6Var;
            int i2 = cVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.l = i2 - Integer.MIN_VALUE;
                Object obj = cVar.j;
                nm6 nm6Var = nm6.a;
                i = cVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.plaque.animator.internal.utils.a aVar = new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    n nVar = new n(0, this, g.class, "createBillingClient", "createBillingClient()Lcom/android/billingclient/api/BillingClient;", 0, 11);
                    com.yandex.plus.log.api.b bVar = this.b;
                    bVar.getClass();
                    com.yandex.plus.pay.inapp.google.common.internal.operation.h S = r1.S(new y(bVar, new p(nVar, bVar, aVar)), bVar);
                    cVar.l = 1;
                    obj = r1.g(S, Unit.a, cVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                String str = ((sz2) obj).a;
                str.getClass();
                return new com.yandex.plus.pay.inapp.api.a(str);
            }
        }
        cVar = new c(this, cg6Var);
        Object obj2 = cVar.j;
        nm6 nm6Var2 = nm6.a;
        i = cVar.l;
        if (i != 0) {
        }
        String str2 = ((sz2) obj2).a;
        str2.getClass();
        return new com.yandex.plus.pay.inapp.api.a(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // com.yandex.plus.pay.inapp.api.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(com.yandex.plus.pay.inapp.api.e eVar, cg6 cg6Var) {
        e eVar2;
        int i;
        String str;
        if (cg6Var instanceof e) {
            eVar2 = (e) cg6Var;
            int i2 = eVar2.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar2.l = i2 - Integer.MIN_VALUE;
                e eVar3 = eVar2;
                Object obj = eVar3.j;
                nm6 nm6Var = nm6.a;
                i = eVar3.l;
                if (i != 0) {
                    qgg.h0(obj);
                    int ordinal = eVar.ordinal();
                    if (ordinal == 0) {
                        str = "subs";
                    } else {
                        if (ordinal != 1) {
                            b6e.s();
                            return null;
                        }
                        str = "inapp";
                    }
                    h0 h0Var = new h0(str, 3);
                    n nVar = new n(0, this, g.class, "createBillingClient", "createBillingClient()Lcom/android/billingclient/api/BillingClient;", 0, 13);
                    com.yandex.plus.log.api.b bVar = this.b;
                    bVar.getClass();
                    com.yandex.plus.pay.inapp.google.common.internal.operation.h S = r1.S(new y(bVar, new p(nVar, bVar, h0Var)), bVar);
                    eVar3.l = 1;
                    obj = r1.g(S, Unit.a, eVar3);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Iterable<Purchase> iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                for (Purchase purchase : iterable) {
                    String optString = purchase.c.optString("orderId");
                    if (TextUtils.isEmpty(optString)) {
                        optString = null;
                    }
                    String str2 = optString;
                    ArrayList a = purchase.a();
                    String str3 = purchase.a;
                    str3.getClass();
                    byte[] bytes = str3.getBytes(Charsets.UTF_8);
                    bytes.getClass();
                    String encodeToString = Base64.encodeToString(bytes, 2);
                    encodeToString.getClass();
                    String str4 = purchase.b;
                    str4.getClass();
                    String b = purchase.b();
                    b.getClass();
                    arrayList.add(new com.yandex.plus.pay.inapp.api.f(str2, a, encodeToString, str4, b, purchase.c.optBoolean("acknowledged", true), purchase.c()));
                }
                return arrayList;
            }
        }
        eVar2 = new e(this, cg6Var);
        e eVar32 = eVar2;
        Object obj2 = eVar32.j;
        nm6 nm6Var2 = nm6.a;
        i = eVar32.l;
        if (i != 0) {
        }
        Iterable<Purchase> iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
        while (r0.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008d A[LOOP:0: B:11:0x0087->B:13:0x008d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.plus.pay.inapp.api.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(List list, com.yandex.plus.pay.inapp.api.e eVar, cg6 cg6Var) {
        d dVar;
        int i;
        String str;
        Iterator it;
        if (cg6Var instanceof d) {
            dVar = (d) cg6Var;
            int i2 = dVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.l = i2 - Integer.MIN_VALUE;
                Object obj = dVar.j;
                nm6 nm6Var = nm6.a;
                i = dVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    int ordinal = eVar.ordinal();
                    if (ordinal == 0) {
                        str = "subs";
                    } else {
                        if (ordinal != 1) {
                            b6e.s();
                            return null;
                        }
                        str = "inapp";
                    }
                    p pVar = new p(list, str);
                    n nVar = new n(0, this, g.class, "createBillingClient", "createBillingClient()Lcom/android/billingclient/api/BillingClient;", 0, 12);
                    com.yandex.plus.log.api.b bVar = this.b;
                    bVar.getClass();
                    com.yandex.plus.pay.inapp.google.common.internal.operation.h S = r1.S(new y(bVar, new p(nVar, bVar, pVar)), bVar);
                    dVar.l = 1;
                    obj = r1.g(S, Unit.a, dVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(new h((ptm) it.next()));
                }
                return arrayList;
            }
        }
        dVar = new d(this, cg6Var);
        Object obj2 = dVar.j;
        nm6 nm6Var2 = nm6.a;
        i = dVar.l;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x00ca, code lost:
    
        if (r0 != r9) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00cc, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0069, code lost:
    
        if (r1 == r9) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // com.yandex.plus.pay.inapp.api.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(h hVar, com.yandex.plus.pay.inapp.api.h hVar2, cg6 cg6Var) {
        f fVar;
        int i;
        ptm ptmVar;
        com.yandex.plus.pay.inapp.api.h hVar3;
        Object g0;
        Object t7oVar;
        if (cg6Var instanceof f) {
            fVar = (f) cg6Var;
            int i2 = fVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.n = i2 - Integer.MIN_VALUE;
                f fVar2 = fVar;
                Object obj = fVar2.l;
                nm6 nm6Var = nm6.a;
                i = fVar2.n;
                boolean z = true;
                if (i != 0) {
                    qgg.h0(obj);
                    h hVar4 = hVar != null ? hVar : null;
                    if (hVar4 == null) {
                        xq0.q("Expected google play product to start purchase");
                        return null;
                    }
                    ptmVar = hVar4.a;
                    fVar2.j = ptmVar;
                    hVar3 = hVar2;
                    fVar2.k = hVar3;
                    fVar2.n = 1;
                    g0 = zsd.g0(new t(this.c.c, 23), fVar2);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        Purchase purchase = (Purchase) obj;
                        String str = purchase.a;
                        str.getClass();
                        String str2 = purchase.b;
                        com.yandex.plus.log.api.b bVar = this.e.a;
                        boolean z2 = false;
                        if (TextUtils.isEmpty(str) || TextUtils.isEmpty("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAo47Pcw9JEAhZYOcJXo7MjOHjBjKB89a56a4jl9w2lk9ktvCYs/y8VD1y+66r9I9Q6QsCmCJgb+uKm4gvs3A9PdpploZrXnkZ5x2B9mSKh35J0eo1AkGUGPibtZPuIbTfnKdlhY1x/5MJ+OeS5NAq3F/ZwqFrPYjG949LWgbIRYDCwJafky3jkMWOK83/XAHuRXDqdh8cAZEfGL6eO6exC21nXgHx9U7KLonIrmmwZokZKuGRVI0/AWx7L64UCxQZqodlIBpFQWmM6bUa4H7xOONpB994U5CoV/2mQcxjpMCIrp+q/9nELkuHEeU57Fs0XLs36Ily37VRFZcdCYOXzwIDAQAB") || TextUtils.isEmpty(str2)) {
                            com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
                            if (bVar.b(aVar)) {
                                bVar.c(aVar, "PlusPayGooglePurchaseVerifier", "Purchase verification failed: missing data.");
                            }
                        } else {
                            try {
                                PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAo47Pcw9JEAhZYOcJXo7MjOHjBjKB89a56a4jl9w2lk9ktvCYs/y8VD1y+66r9I9Q6QsCmCJgb+uKm4gvs3A9PdpploZrXnkZ5x2B9mSKh35J0eo1AkGUGPibtZPuIbTfnKdlhY1x/5MJ+OeS5NAq3F/ZwqFrPYjG949LWgbIRYDCwJafky3jkMWOK83/XAHuRXDqdh8cAZEfGL6eO6exC21nXgHx9U7KLonIrmmwZokZKuGRVI0/AWx7L64UCxQZqodlIBpFQWmM6bUa4H7xOONpB994U5CoV/2mQcxjpMCIrp+q/9nELkuHEeU57Fs0XLs36Ily37VRFZcdCYOXzwIDAQAB", 0)));
                                generatePublic.getClass();
                                try {
                                    r7o r7oVar = z7o.b;
                                    t7oVar = Base64.decode(str2, 0);
                                } catch (Throwable th) {
                                    r7o r7oVar2 = z7o.b;
                                    t7oVar = new t7o(th);
                                }
                                if (z7o.a(t7oVar) != null) {
                                    com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.e;
                                    if (bVar.b(aVar2)) {
                                        bVar.c(aVar2, "PlusPayGooglePurchaseVerifier", "Base64 decoding failed.");
                                    }
                                    t7oVar = null;
                                }
                                byte[] bArr = (byte[]) t7oVar;
                                try {
                                    Signature signature = Signature.getInstance("SHA1withRSA");
                                    signature.initVerify(generatePublic);
                                    byte[] bytes = str.getBytes(Charsets.UTF_8);
                                    bytes.getClass();
                                    signature.update(bytes);
                                    if (bArr == null || !signature.verify(bArr)) {
                                        z = false;
                                    }
                                    if (!z) {
                                        com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.e;
                                        if (bVar.b(aVar3)) {
                                            bVar.c(aVar3, "PlusPayGooglePurchaseVerifier", "Signature verification failed.");
                                        }
                                    }
                                    z2 = z;
                                } catch (InvalidKeyException unused) {
                                    com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.e;
                                    if (bVar.b(aVar4)) {
                                        bVar.c(aVar4, "PlusPayGooglePurchaseVerifier", "Invalid key specification.");
                                    }
                                } catch (NoSuchAlgorithmException e) {
                                    String message = e.getMessage();
                                    throw new IllegalStateException((message != null ? message : "").toString());
                                } catch (SignatureException unused2) {
                                    com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.e;
                                    if (bVar.b(aVar5)) {
                                        bVar.c(aVar5, "PlusPayGooglePurchaseVerifier", "Signature exception.");
                                    }
                                }
                            } catch (NoSuchAlgorithmException e2) {
                                String message2 = e2.getMessage();
                                throw new IllegalStateException((message2 != null ? message2 : "").toString());
                            } catch (InvalidKeySpecException e3) {
                                String str3 = "Invalid key specification: " + e3;
                                com.yandex.plus.log.api.a aVar6 = com.yandex.plus.log.api.a.e;
                                if (bVar.b(aVar6)) {
                                    bVar.c(aVar6, "PlusPayGooglePurchaseVerifier", str3);
                                }
                                kac.f(str3);
                                return null;
                            }
                        }
                        if (!z2) {
                            throw new com.yandex.plus.pay.inapp.internal.error.d("Signature is invalid", null);
                        }
                        String optString = purchase.c.optString("orderId");
                        String str4 = TextUtils.isEmpty(optString) ? null : optString;
                        ArrayList a = purchase.a();
                        String str5 = purchase.a;
                        str5.getClass();
                        byte[] bytes2 = str5.getBytes(Charsets.UTF_8);
                        bytes2.getClass();
                        String encodeToString = Base64.encodeToString(bytes2, 2);
                        encodeToString.getClass();
                        String str6 = purchase.b;
                        str6.getClass();
                        String b = purchase.b();
                        b.getClass();
                        return new com.yandex.plus.pay.inapp.api.f(str4, a, encodeToString, str6, b, false, purchase.c());
                    }
                    com.yandex.plus.pay.inapp.api.h hVar5 = fVar2.k;
                    ptmVar = fVar2.j;
                    qgg.h0(obj);
                    g0 = obj;
                    hVar3 = hVar5;
                }
                Activity activity = (Activity) g0;
                ptmVar.getClass();
                activity.getClass();
                List list = this.d;
                list.getClass();
                com.yandex.plus.log.api.b bVar2 = this.b;
                bVar2.getClass();
                com.yandex.plus.home.plaque.feature.internal.presentation.b bVar3 = new com.yandex.plus.home.plaque.feature.internal.presentation.b();
                bVar3.a = ptmVar;
                bVar3.c = hVar3;
                bVar3.d = activity;
                bVar3.e = list;
                bVar3.b = bVar2;
                bVar3.f = dfi.i(new StringBuilder("purchase("), ptmVar.c, ')');
                n nVar = new n(0, this, g.class, "createBillingClient", "createBillingClient()Lcom/android/billingclient/api/BillingClient;", 0, 14);
                bVar2.getClass();
                com.yandex.plus.pay.inapp.google.common.internal.operation.h S = r1.S(new y(bVar2, new p(nVar, bVar2, bVar3)), bVar2);
                fVar2.j = null;
                fVar2.k = null;
                fVar2.n = 2;
                obj = r1.g(S, Unit.a, fVar2);
            }
        }
        fVar = new f(this, cg6Var);
        f fVar22 = fVar;
        Object obj2 = fVar22.l;
        nm6 nm6Var2 = nm6.a;
        i = fVar22.n;
        boolean z3 = true;
        if (i != 0) {
        }
        Activity activity2 = (Activity) g0;
        ptmVar.getClass();
        activity2.getClass();
        List list2 = this.d;
        list2.getClass();
        com.yandex.plus.log.api.b bVar22 = this.b;
        bVar22.getClass();
        com.yandex.plus.home.plaque.feature.internal.presentation.b bVar32 = new com.yandex.plus.home.plaque.feature.internal.presentation.b();
        bVar32.a = ptmVar;
        bVar32.c = hVar3;
        bVar32.d = activity2;
        bVar32.e = list2;
        bVar32.b = bVar22;
        bVar32.f = dfi.i(new StringBuilder("purchase("), ptmVar.c, ')');
        n nVar2 = new n(0, this, g.class, "createBillingClient", "createBillingClient()Lcom/android/billingclient/api/BillingClient;", 0, 14);
        bVar22.getClass();
        com.yandex.plus.pay.inapp.google.common.internal.operation.h S2 = r1.S(new y(bVar22, new p(nVar2, bVar22, bVar32)), bVar22);
        fVar22.j = null;
        fVar22.k = null;
        fVar22.n = 2;
        obj2 = r1.g(S2, Unit.a, fVar22);
    }

    @Override // com.yandex.plus.pay.inapp.api.b
    public final Object e(com.yandex.plus.pay.inapp.api.f fVar, cg6 cg6Var) {
        boolean z = fVar.g;
        String str = fVar.e;
        h0 h0Var = z ? new h0(str, 1) : new h0(str, 2);
        n nVar = new n(0, this, g.class, "createBillingClient", "createBillingClient()Lcom/android/billingclient/api/BillingClient;", 0, 10);
        com.yandex.plus.log.api.b bVar = this.b;
        bVar.getClass();
        com.yandex.plus.pay.inapp.google.common.internal.operation.h S = r1.S(new y(bVar, new p(nVar, bVar, h0Var)), bVar);
        Unit unit = Unit.a;
        Object g = r1.g(S, unit, cg6Var);
        return g == nm6.a ? g : unit;
    }

    @Override // defpackage.n4n
    public final void onPurchasesUpdated(uz2 uz2Var, List list) {
        uz2Var.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.b;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "GoogleBilling7Facade", "onPurchaseUpdate(" + uz2Var + ", " + list + ')');
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((n4n) it.next()).onPurchasesUpdated(uz2Var, list);
        }
    }
}
