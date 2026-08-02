package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class mr1 implements m56 {
    public boolean a;
    public int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public mr1(rce rceVar, List list, int i, rce rceVar2, lmq lmqVar, hib hibVar, boolean z) {
        this.c = rceVar;
        this.d = list;
        this.b = i;
        this.e = rceVar2;
        this.f = lmqVar;
        this.g = hibVar;
        this.a = z;
    }

    public void a(rce rceVar, cse cseVar) {
        Context context = rceVar.a;
        rce rceVar2 = (rce) this.c;
        if (context != rceVar2.a) {
            jj4.h(cseVar, "' cannot modify the request's context.", "Interceptor '");
            return;
        }
        if (rceVar.b == klx.g) {
            jj4.h(cseVar, "' cannot set the request's data to null.", "Interceptor '");
            return;
        }
        if (rceVar.c != rceVar2.c) {
            jj4.h(cseVar, "' cannot modify the request's target.", "Interceptor '");
        } else if (rceVar.x != rceVar2.x) {
            jj4.h(cseVar, "' cannot modify the request's lifecycle.", "Interceptor '");
        } else {
            if (rceVar.y == rceVar2.y) {
                return;
            }
            jj4.h(cseVar, "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.", "Interceptor '");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(rce rceVar, cg6 cg6Var) {
        tkn tknVar;
        int i;
        rce rceVar2;
        cse cseVar;
        mr1 mr1Var;
        List list = (List) this.d;
        int i2 = this.b;
        if (cg6Var instanceof tkn) {
            tknVar = (tkn) cg6Var;
            int i3 = tknVar.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tknVar.n = i3 - Integer.MIN_VALUE;
                Object obj = tknVar.l;
                nm6 nm6Var = nm6.a;
                i = tknVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    if (i2 > 0) {
                        rceVar2 = rceVar;
                        a(rceVar2, (cse) list.get(i2 - 1));
                    } else {
                        rceVar2 = rceVar;
                    }
                    cseVar = (cse) list.get(i2);
                    mr1 mr1Var2 = new mr1((rce) this.c, (List) this.d, i2 + 1, rceVar2, (lmq) this.f, (hib) this.g, this.a);
                    tknVar.j = this;
                    tknVar.k = cseVar;
                    tknVar.n = 1;
                    obj = cseVar.a(mr1Var2, tknVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    mr1Var = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cseVar = tknVar.k;
                    mr1Var = tknVar.j;
                    qgg.h0(obj);
                }
                sce sceVar = (sce) obj;
                mr1Var.a(sceVar.b(), cseVar);
                return sceVar;
            }
        }
        tknVar = new tkn(this, cg6Var);
        Object obj2 = tknVar.l;
        nm6 nm6Var2 = nm6.a;
        i = tknVar.n;
        if (i != 0) {
        }
        sce sceVar2 = (sce) obj2;
        mr1Var.a(sceVar2.b(), cseVar);
        return sceVar2;
    }

    public void c() {
        if (this.a) {
            b6e.w(this.c, "sendResult() called when either sendResult() or sendError() had already been called for: ");
            return;
        }
        this.a = true;
        Bundle bundle = (Bundle) this.f;
        String str = (String) this.e;
        xy0 xy0Var = ((nuh) this.g).e;
        jhh jhhVar = (jhh) this.d;
        mka mkaVar = jhhVar.e;
        String str2 = jhhVar.a;
        mkaVar.getClass();
        if (xy0Var.get(((Messenger) mkaVar.a).getBinder()) != jhhVar) {
            if (nuh.l) {
                Log.d("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + str2 + " id=" + str);
                return;
            }
            return;
        }
        if ((1 & this.b) != 0) {
            boolean z = nuh.l;
        }
        try {
            mkaVar.getClass();
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putBundle("data_options", bundle);
            bundle2.putBundle("data_notify_children_changed_options", null);
            mkaVar.A(3, bundle2);
        } catch (RemoteException unused) {
            Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + str + " package=" + str2);
        }
    }

    @Override // defpackage.m56
    public void g(Exception exc, dt1 dt1Var) {
        c6e c6eVar = (c6e) this.e;
        sr1 sr1Var = (sr1) this.c;
        nsh nshVar = (nsh) this.g;
        or1 or1Var = (or1) this.d;
        if (this.a && dt1Var != null) {
            dt1Var.c(new imp());
            dt1Var.s(new h1b());
            dt1Var.close();
            xq0.w("double connect callback");
            return;
        }
        this.a = true;
        if (or1Var.isCancelled()) {
            if (dt1Var != null) {
                dt1Var.close();
                return;
            }
            return;
        }
        if (or1Var.j != null) {
            ((ys1) nshVar.d).e(or1Var.i);
        }
        if (exc != null) {
            nshVar.K(or1Var, exc, null, sr1Var, c6eVar);
            return;
        }
        qr1 qr1Var = (qr1) this.f;
        qr1Var.e = dt1Var;
        or1Var.h = dt1Var;
        nr1 nr1Var = new nr1(nshVar, sr1Var, or1Var, sr1Var, c6eVar, qr1Var, this.b);
        qr1Var.g = new znk(4, nr1Var);
        qr1Var.h = new ozw(7, nr1Var);
        qr1Var.f = nr1Var;
        dt1 dt1Var2 = qr1Var.e;
        nr1Var.h = dt1Var2;
        if (dt1Var2 != null) {
            dt1Var2.s(nr1Var.f);
        }
        Iterator it = ((CopyOnWriteArrayList) nshVar.b).iterator();
        while (it.hasNext() && !((cjq) it.next()).a(qr1Var)) {
        }
    }

    public mr1(nsh nshVar, sr1 sr1Var, or1 or1Var, c6e c6eVar, qr1 qr1Var, int i) {
        this.g = nshVar;
        this.c = sr1Var;
        this.d = or1Var;
        this.e = c6eVar;
        this.f = qr1Var;
        this.b = i;
    }

    public mr1(nuh nuhVar, Object obj, jhh jhhVar, String str, Bundle bundle) {
        this.g = nuhVar;
        this.d = jhhVar;
        this.e = str;
        this.f = bundle;
        this.c = obj;
    }
}
