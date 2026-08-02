package com.yandex.plus.pay.internal.analytics;

import defpackage.bck;
import defpackage.c5b;
import defpackage.cg6;
import defpackage.dfi;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.wis;
import defpackage.xq0;
import defpackage.z7o;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class f implements com.yandex.plus.pay.inapp.api.b {
    public final com.yandex.plus.pay.inapp.api.b a;
    public final com.yandex.plus.pay.diagnostic.impl.f b;

    public f(com.yandex.plus.pay.inapp.api.b bVar, com.yandex.plus.pay.diagnostic.impl.f fVar) {
        bVar.getClass();
        fVar.getClass();
        this.a = bVar;
        this.b = fVar;
    }

    public static final void f(f fVar, Throwable th) {
        String str;
        com.yandex.plus.pay.diagnostic.impl.f fVar2 = fVar.b;
        if (th instanceof com.yandex.plus.pay.inapp.internal.error.c) {
            g(fVar, th, "connection");
        }
        if (th instanceof com.yandex.plus.pay.inapp.internal.error.a) {
            g(fVar, th, "billing_unavailable");
            return;
        }
        if (th instanceof com.yandex.plus.pay.inapp.internal.error.f) {
            g(fVar, th, "item_unavailable");
            return;
        }
        if (th instanceof com.yandex.plus.pay.inapp.internal.error.e) {
            g(fVar, th, "item_already_owned");
            return;
        }
        if (th instanceof com.yandex.plus.pay.inapp.internal.error.d) {
            g(fVar, th, "invalid_signature");
            return;
        }
        if (!(th instanceof com.yandex.plus.pay.inapp.internal.error.h)) {
            if (!(th instanceof com.yandex.plus.pay.inapp.internal.error.g)) {
                if (th instanceof com.yandex.plus.pay.inapp.internal.error.b) {
                    return;
                }
                g(fVar, th, "unexpected");
                return;
            }
            String message = th.getMessage();
            str = message != null ? message : "";
            c5b c5bVar = c5b.a;
            int i = fVar2.a;
            c5bVar.getClass();
            switch (i) {
                case 0:
                    bck.b(fVar2.b, "not_enough_funds", str, "no_value", CollectionsKt.X(c5bVar, null, null, null, null, 63));
                    break;
                default:
                    bck.b(fVar2.b, "not_enough_funds", str, "no_value", CollectionsKt.X(c5bVar, null, null, null, null, 63));
                    break;
            }
        }
        String message2 = th.getMessage();
        str = message2 != null ? message2 : "";
        c5b c5bVar2 = c5b.a;
        int i2 = fVar2.a;
        c5bVar2.getClass();
        switch (i2) {
            case 0:
                bck bckVar = fVar2.b;
                String X = CollectionsKt.X(c5bVar2, null, null, null, null, 63);
                LinkedHashMap m = dfi.m("code", "unspecified_purchase_state", Constants.KEY_MESSAGE, str);
                m.put("currency", "no_value");
                m.put("additionalData", "no_value");
                m.put("productIdentifier", X);
                m.put("_meta", bck.c(new HashMap()));
                bckVar.d("Error.Subscription.GooglePlay.Pay.Invalid.Unspecify", m);
                break;
            default:
                bck bckVar2 = fVar2.b;
                String X2 = CollectionsKt.X(c5bVar2, null, null, null, null, 63);
                LinkedHashMap m2 = dfi.m("code", "unspecified_purchase_state", Constants.KEY_MESSAGE, str);
                m2.put("currency", "no_value");
                m2.put("additionalData", "no_value");
                m2.put("productIdentifier", X2);
                m2.put("_meta", bck.c(new HashMap()));
                bckVar2.d("Error.Transaction.GooglePlay.Pay.Invalid.Unspecify", m2);
                break;
        }
    }

    public static final void g(f fVar, Throwable th, String str) {
        com.yandex.plus.pay.diagnostic.impl.f fVar2 = fVar.b;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        c5b c5bVar = c5b.a;
        int i = fVar2.a;
        c5bVar.getClass();
        switch (i) {
            case 0:
                bck bckVar = fVar2.b;
                String X = CollectionsKt.X(c5bVar, null, null, null, null, 63);
                LinkedHashMap m = dfi.m("code", str, Constants.KEY_MESSAGE, message);
                m.put("currency", "no_value");
                m.put("additionalData", "no_value");
                m.put("productIdentifier", X);
                m.put("_meta", bck.c(new HashMap()));
                bckVar.d("Error.Subscription.GooglePlay.Pay.OtherError", m);
                break;
            default:
                bck bckVar2 = fVar2.b;
                String X2 = CollectionsKt.X(c5bVar, null, null, null, null, 63);
                LinkedHashMap m2 = dfi.m("code", str, Constants.KEY_MESSAGE, message);
                m2.put("currency", "no_value");
                m2.put("additionalData", "no_value");
                m2.put("productIdentifier", X2);
                m2.put("_meta", bck.c(new HashMap()));
                bckVar2.d("Error.Transaction.GooglePlay.Pay.OtherError", m2);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // com.yandex.plus.pay.inapp.api.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        b bVar;
        int i;
        f fVar;
        t7o t7oVar;
        Object obj;
        Throwable a;
        try {
            if (cg6Var instanceof b) {
                bVar = (b) cg6Var;
                int i2 = bVar.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bVar.m = i2 - Integer.MIN_VALUE;
                    Object obj2 = bVar.k;
                    nm6 nm6Var = nm6.a;
                    i = bVar.m;
                    if (i != 0) {
                        qgg.h0(obj2);
                        try {
                            r7o r7oVar = z7o.b;
                            com.yandex.plus.pay.inapp.api.b bVar2 = this.a;
                            bVar.j = this;
                            bVar.m = 1;
                            obj2 = bVar2.a(bVar);
                            if (obj2 == nm6Var) {
                                return nm6Var;
                            }
                            fVar = this;
                        } catch (wis e) {
                            e = e;
                            fVar = this;
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(e);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                            qgg.h0(obj);
                            return obj;
                        } catch (Throwable th) {
                            th = th;
                            fVar = this;
                            r7o r7oVar3 = z7o.b;
                            t7oVar = new t7o(th);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                            qgg.h0(obj);
                            return obj;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fVar = bVar.j;
                        try {
                            qgg.h0(obj2);
                        } catch (wis e2) {
                            e = e2;
                            r7o r7oVar22 = z7o.b;
                            t7oVar = new t7o(e);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                            qgg.h0(obj);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            r7o r7oVar32 = z7o.b;
                            t7oVar = new t7o(th);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                            qgg.h0(obj);
                            return obj;
                        }
                    }
                    obj = (com.yandex.plus.pay.inapp.api.a) obj2;
                    r7o r7oVar4 = z7o.b;
                    a = z7o.a(obj);
                    if (a != null) {
                        f(fVar, a);
                    }
                    qgg.h0(obj);
                    return obj;
                }
            }
            if (i != 0) {
            }
            obj = (com.yandex.plus.pay.inapp.api.a) obj2;
            r7o r7oVar42 = z7o.b;
            a = z7o.a(obj);
            if (a != null) {
            }
            qgg.h0(obj);
            return obj;
        } catch (CancellationException e3) {
            throw e3;
        }
        bVar = new b(this, cg6Var);
        Object obj22 = bVar.k;
        nm6 nm6Var2 = nm6.a;
        i = bVar.m;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // com.yandex.plus.pay.inapp.api.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(com.yandex.plus.pay.inapp.api.e eVar, cg6 cg6Var) {
        d dVar;
        int i;
        f fVar;
        t7o t7oVar;
        Object obj;
        Throwable a;
        try {
            if (cg6Var instanceof d) {
                dVar = (d) cg6Var;
                int i2 = dVar.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    dVar.m = i2 - Integer.MIN_VALUE;
                    Object obj2 = dVar.k;
                    nm6 nm6Var = nm6.a;
                    i = dVar.m;
                    if (i != 0) {
                        qgg.h0(obj2);
                        try {
                            r7o r7oVar = z7o.b;
                            com.yandex.plus.pay.inapp.api.b bVar = this.a;
                            dVar.j = this;
                            dVar.m = 1;
                            obj2 = bVar.b(eVar, dVar);
                            if (obj2 == nm6Var) {
                                return nm6Var;
                            }
                            fVar = this;
                        } catch (wis e) {
                            e = e;
                            fVar = this;
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(e);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                            qgg.h0(obj);
                            return obj;
                        } catch (Throwable th) {
                            th = th;
                            fVar = this;
                            r7o r7oVar3 = z7o.b;
                            t7oVar = new t7o(th);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                            qgg.h0(obj);
                            return obj;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fVar = dVar.j;
                        try {
                            qgg.h0(obj2);
                        } catch (wis e2) {
                            e = e2;
                            r7o r7oVar22 = z7o.b;
                            t7oVar = new t7o(e);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                            qgg.h0(obj);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            r7o r7oVar32 = z7o.b;
                            t7oVar = new t7o(th);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                            qgg.h0(obj);
                            return obj;
                        }
                    }
                    obj = (List) obj2;
                    r7o r7oVar4 = z7o.b;
                    a = z7o.a(obj);
                    if (a != null) {
                        f(fVar, a);
                    }
                    qgg.h0(obj);
                    return obj;
                }
            }
            if (i != 0) {
            }
            obj = (List) obj2;
            r7o r7oVar42 = z7o.b;
            a = z7o.a(obj);
            if (a != null) {
            }
            qgg.h0(obj);
            return obj;
        } catch (CancellationException e3) {
            throw e3;
        }
        dVar = new d(this, cg6Var);
        Object obj22 = dVar.k;
        nm6 nm6Var2 = nm6.a;
        i = dVar.m;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // com.yandex.plus.pay.inapp.api.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(List list, com.yandex.plus.pay.inapp.api.e eVar, cg6 cg6Var) {
        c cVar;
        int i;
        f fVar;
        Object t7oVar;
        Throwable a;
        try {
            if (cg6Var instanceof c) {
                cVar = (c) cg6Var;
                int i2 = cVar.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cVar.m = i2 - Integer.MIN_VALUE;
                    Object obj = cVar.k;
                    nm6 nm6Var = nm6.a;
                    i = cVar.m;
                    if (i != 0) {
                        qgg.h0(obj);
                        try {
                            r7o r7oVar = z7o.b;
                            com.yandex.plus.pay.inapp.api.b bVar = this.a;
                            cVar.j = this;
                            cVar.m = 1;
                            obj = bVar.c(list, eVar, cVar);
                            if (obj == nm6Var) {
                                return nm6Var;
                            }
                            fVar = this;
                        } catch (wis e) {
                            e = e;
                            fVar = this;
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(e);
                            a = z7o.a(t7oVar);
                            if (a != null) {
                            }
                            qgg.h0(t7oVar);
                            return t7oVar;
                        } catch (Throwable th) {
                            th = th;
                            fVar = this;
                            r7o r7oVar3 = z7o.b;
                            t7oVar = new t7o(th);
                            a = z7o.a(t7oVar);
                            if (a != null) {
                            }
                            qgg.h0(t7oVar);
                            return t7oVar;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fVar = cVar.j;
                        try {
                            qgg.h0(obj);
                        } catch (wis e2) {
                            e = e2;
                            r7o r7oVar22 = z7o.b;
                            t7oVar = new t7o(e);
                            a = z7o.a(t7oVar);
                            if (a != null) {
                            }
                            qgg.h0(t7oVar);
                            return t7oVar;
                        } catch (Throwable th2) {
                            th = th2;
                            r7o r7oVar32 = z7o.b;
                            t7oVar = new t7o(th);
                            a = z7o.a(t7oVar);
                            if (a != null) {
                            }
                            qgg.h0(t7oVar);
                            return t7oVar;
                        }
                    }
                    t7oVar = (List) obj;
                    r7o r7oVar4 = z7o.b;
                    a = z7o.a(t7oVar);
                    if (a != null) {
                        f(fVar, a);
                    }
                    qgg.h0(t7oVar);
                    return t7oVar;
                }
            }
            if (i != 0) {
            }
            t7oVar = (List) obj;
            r7o r7oVar42 = z7o.b;
            a = z7o.a(t7oVar);
            if (a != null) {
            }
            qgg.h0(t7oVar);
            return t7oVar;
        } catch (CancellationException e3) {
            throw e3;
        }
        cVar = new c(this, cg6Var);
        Object obj2 = cVar.k;
        nm6 nm6Var2 = nm6.a;
        i = cVar.m;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // com.yandex.plus.pay.inapp.api.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(com.yandex.plus.pay.inapp.google.internal.h hVar, com.yandex.plus.pay.inapp.api.h hVar2, cg6 cg6Var) {
        e eVar;
        int i;
        f fVar;
        Object t7oVar;
        Throwable a;
        try {
            if (cg6Var instanceof e) {
                eVar = (e) cg6Var;
                int i2 = eVar.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    eVar.m = i2 - Integer.MIN_VALUE;
                    Object obj = eVar.k;
                    nm6 nm6Var = nm6.a;
                    i = eVar.m;
                    if (i != 0) {
                        qgg.h0(obj);
                        try {
                            r7o r7oVar = z7o.b;
                            com.yandex.plus.pay.inapp.api.b bVar = this.a;
                            eVar.j = this;
                            eVar.m = 1;
                            obj = bVar.d(hVar, hVar2, eVar);
                            if (obj == nm6Var) {
                                return nm6Var;
                            }
                            fVar = this;
                        } catch (wis e) {
                            e = e;
                            fVar = this;
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(e);
                            a = z7o.a(t7oVar);
                            if (a != null) {
                            }
                            qgg.h0(t7oVar);
                            return t7oVar;
                        } catch (Throwable th) {
                            th = th;
                            fVar = this;
                            r7o r7oVar3 = z7o.b;
                            t7oVar = new t7o(th);
                            a = z7o.a(t7oVar);
                            if (a != null) {
                            }
                            qgg.h0(t7oVar);
                            return t7oVar;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fVar = eVar.j;
                        try {
                            qgg.h0(obj);
                        } catch (wis e2) {
                            e = e2;
                            r7o r7oVar22 = z7o.b;
                            t7oVar = new t7o(e);
                            a = z7o.a(t7oVar);
                            if (a != null) {
                            }
                            qgg.h0(t7oVar);
                            return t7oVar;
                        } catch (Throwable th2) {
                            th = th2;
                            r7o r7oVar32 = z7o.b;
                            t7oVar = new t7o(th);
                            a = z7o.a(t7oVar);
                            if (a != null) {
                            }
                            qgg.h0(t7oVar);
                            return t7oVar;
                        }
                    }
                    t7oVar = (com.yandex.plus.pay.inapp.api.f) obj;
                    r7o r7oVar4 = z7o.b;
                    a = z7o.a(t7oVar);
                    if (a != null) {
                        f(fVar, a);
                    }
                    qgg.h0(t7oVar);
                    return t7oVar;
                }
            }
            if (i != 0) {
            }
            t7oVar = (com.yandex.plus.pay.inapp.api.f) obj;
            r7o r7oVar42 = z7o.b;
            a = z7o.a(t7oVar);
            if (a != null) {
            }
            qgg.h0(t7oVar);
            return t7oVar;
        } catch (CancellationException e3) {
            throw e3;
        }
        eVar = new e(this, cg6Var);
        Object obj2 = eVar.k;
        nm6 nm6Var2 = nm6.a;
        i = eVar.m;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // com.yandex.plus.pay.inapp.api.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(com.yandex.plus.pay.inapp.api.f fVar, cg6 cg6Var) {
        a aVar;
        int i;
        f fVar2;
        t7o t7oVar;
        Object obj;
        Throwable a;
        try {
            if (cg6Var instanceof a) {
                aVar = (a) cg6Var;
                int i2 = aVar.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.m = i2 - Integer.MIN_VALUE;
                    Object obj2 = aVar.k;
                    nm6 nm6Var = nm6.a;
                    i = aVar.m;
                    if (i != 0) {
                        qgg.h0(obj2);
                        try {
                            r7o r7oVar = z7o.b;
                            com.yandex.plus.pay.inapp.api.b bVar = this.a;
                            aVar.j = this;
                            aVar.m = 1;
                            if (bVar.e(fVar, aVar) == nm6Var) {
                                return nm6Var;
                            }
                            fVar2 = this;
                        } catch (wis e) {
                            e = e;
                            fVar2 = this;
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(e);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                            qgg.h0(obj);
                            return obj;
                        } catch (Throwable th) {
                            th = th;
                            fVar2 = this;
                            r7o r7oVar3 = z7o.b;
                            t7oVar = new t7o(th);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                            qgg.h0(obj);
                            return obj;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fVar2 = aVar.j;
                        try {
                            qgg.h0(obj2);
                        } catch (wis e2) {
                            e = e2;
                            r7o r7oVar22 = z7o.b;
                            t7oVar = new t7o(e);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                            qgg.h0(obj);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            r7o r7oVar32 = z7o.b;
                            t7oVar = new t7o(th);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                            qgg.h0(obj);
                            return obj;
                        }
                    }
                    obj = Unit.a;
                    r7o r7oVar4 = z7o.b;
                    a = z7o.a(obj);
                    if (a != null) {
                        f(fVar2, a);
                    }
                    qgg.h0(obj);
                    return obj;
                }
            }
            if (i != 0) {
            }
            obj = Unit.a;
            r7o r7oVar42 = z7o.b;
            a = z7o.a(obj);
            if (a != null) {
            }
            qgg.h0(obj);
            return obj;
        } catch (CancellationException e3) {
            throw e3;
        }
        aVar = new a(this, cg6Var);
        Object obj22 = aVar.k;
        nm6 nm6Var2 = nm6.a;
        i = aVar.m;
    }
}
