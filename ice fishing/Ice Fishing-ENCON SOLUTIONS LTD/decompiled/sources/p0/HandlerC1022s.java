package p0;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* renamed from: p0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC1022s extends A0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f8409a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1022s(com.google.android.gms.common.internal.a aVar, Looper looper) {
        super(looper, 2);
        this.f8409a = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r0 == 5) goto L18;
     */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message message) {
        Boolean bool;
        if (this.f8409a.f2705v.get() != message.arg1) {
            int i2 = message.what;
            if (i2 == 2 || i2 == 1 || i2 == 7) {
                AbstractC1018o abstractC1018o = (AbstractC1018o) message.obj;
                abstractC1018o.getClass();
                abstractC1018o.c();
                return;
            }
            return;
        }
        int i3 = message.what;
        if (i3 != 1 && i3 != 7) {
            if (i3 == 4) {
                this.f8409a.getClass();
            }
        }
        if (!this.f8409a.b()) {
            AbstractC1018o abstractC1018o2 = (AbstractC1018o) message.obj;
            abstractC1018o2.getClass();
            abstractC1018o2.c();
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            com.google.android.gms.common.internal.a aVar = this.f8409a;
            aVar.f2703s = new m0.b(message.arg2);
            if (!aVar.t && !TextUtils.isEmpty(aVar.r()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(aVar.r());
                    com.google.android.gms.common.internal.a aVar2 = this.f8409a;
                    if (!aVar2.t) {
                        aVar2.v(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            com.google.android.gms.common.internal.a aVar3 = this.f8409a;
            m0.b bVar = aVar3.f2703s;
            if (bVar == null) {
                bVar = new m0.b(8);
            }
            aVar3.f2693i.a(bVar);
            this.f8409a.getClass();
            System.currentTimeMillis();
            return;
        }
        if (i4 == 5) {
            com.google.android.gms.common.internal.a aVar4 = this.f8409a;
            m0.b bVar2 = aVar4.f2703s;
            if (bVar2 == null) {
                bVar2 = new m0.b(8);
            }
            aVar4.f2693i.a(bVar2);
            this.f8409a.getClass();
            System.currentTimeMillis();
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            this.f8409a.f2693i.a(new m0.b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null));
            this.f8409a.getClass();
            System.currentTimeMillis();
            return;
        }
        if (i4 == 6) {
            this.f8409a.v(5, null);
            C1010g c1010g = this.f8409a.f2698n;
            if (c1010g != null) {
                ((n0.g) c1010g.f8376a).a(message.arg2);
            }
            this.f8409a.getClass();
            System.currentTimeMillis();
            com.google.android.gms.common.internal.a.u(this.f8409a, 5, 1, null);
            return;
        }
        if (i4 == 2 && !this.f8409a.d()) {
            AbstractC1018o abstractC1018o3 = (AbstractC1018o) message.obj;
            abstractC1018o3.getClass();
            abstractC1018o3.c();
            return;
        }
        int i5 = message.what;
        if (i5 != 2 && i5 != 1 && i5 != 7) {
            Log.wtf("GmsClient", C1.a.f(i5, "Don't know how to handle message: "), new Exception());
            return;
        }
        AbstractC1018o abstractC1018o4 = (AbstractC1018o) message.obj;
        synchronized (abstractC1018o4) {
            try {
                bool = abstractC1018o4.f8399a;
                if (abstractC1018o4.f8400b) {
                    Log.w("GmsClient", "Callback proxy " + abstractC1018o4.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            com.google.android.gms.common.internal.a aVar5 = abstractC1018o4.f8404f;
            int i6 = abstractC1018o4.f8402d;
            if (i6 != 0) {
                aVar5.v(1, null);
                Bundle bundle = abstractC1018o4.f8403e;
                abstractC1018o4.a(new m0.b(i6, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
            } else if (!abstractC1018o4.b()) {
                aVar5.v(1, null);
                abstractC1018o4.a(new m0.b(8, null));
            }
        }
        synchronized (abstractC1018o4) {
            abstractC1018o4.f8400b = true;
        }
        abstractC1018o4.c();
    }
}
