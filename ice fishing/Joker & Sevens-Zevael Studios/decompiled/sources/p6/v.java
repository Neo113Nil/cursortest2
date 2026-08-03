package p6;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class v extends a7.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f5646a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.google.android.gms.common.internal.a aVar, Looper looper) {
        super(looper, 0);
        this.f5646a = aVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        if (this.f5646a.A.get() != message.arg1) {
            int i10 = message.what;
            if (i10 == 2 || i10 == 1 || i10 == 7) {
                r rVar = (r) message.obj;
                rVar.getClass();
                rVar.c();
                return;
            }
            return;
        }
        int i11 = message.what;
        if ((i11 == 1 || i11 == 7 || i11 == 4 || i11 == 5) && !this.f5646a.f()) {
            r rVar2 = (r) message.obj;
            rVar2.getClass();
            rVar2.c();
            return;
        }
        int i12 = message.what;
        if (i12 == 4) {
            com.google.android.gms.common.internal.a aVar = this.f5646a;
            aVar.f1448x = new m6.b(message.arg2);
            if (!aVar.f1449y && !TextUtils.isEmpty(aVar.s()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(aVar.s());
                    com.google.android.gms.common.internal.a aVar2 = this.f5646a;
                    if (!aVar2.f1449y) {
                        aVar2.w(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            com.google.android.gms.common.internal.a aVar3 = this.f5646a;
            m6.b bVar = aVar3.f1448x;
            if (bVar == null) {
                bVar = new m6.b(8);
            }
            aVar3.f1438n.a(bVar);
            com.google.android.gms.common.internal.a aVar4 = this.f5646a;
            aVar4.f1428d = bVar.f4903h;
            aVar4.f1429e = System.currentTimeMillis();
            return;
        }
        if (i12 == 5) {
            com.google.android.gms.common.internal.a aVar5 = this.f5646a;
            m6.b bVar2 = aVar5.f1448x;
            if (bVar2 == null) {
                bVar2 = new m6.b(8);
            }
            aVar5.f1438n.a(bVar2);
            com.google.android.gms.common.internal.a aVar6 = this.f5646a;
            aVar6.f1428d = bVar2.f4903h;
            aVar6.f1429e = System.currentTimeMillis();
            return;
        }
        if (i12 == 3) {
            Object obj = message.obj;
            PendingIntent pendingIntent = obj instanceof PendingIntent ? (PendingIntent) obj : null;
            int i13 = message.arg2;
            this.f5646a.f1438n.a(new m6.b(i13, pendingIntent));
            com.google.android.gms.common.internal.a aVar7 = this.f5646a;
            aVar7.f1428d = i13;
            aVar7.f1429e = System.currentTimeMillis();
            return;
        }
        if (i12 == 6) {
            this.f5646a.w(5, null);
            m7.g gVar = this.f5646a.f1443s;
            if (gVar != null) {
                ((n6.f) gVar.f4957h).onConnectionSuspended(message.arg2);
            }
            com.google.android.gms.common.internal.a aVar8 = this.f5646a;
            aVar8.f1425a = message.arg2;
            aVar8.f1426b = System.currentTimeMillis();
            com.google.android.gms.common.internal.a.v(this.f5646a, 5, 1, null);
            return;
        }
        if (i12 == 2 && !this.f5646a.a()) {
            r rVar3 = (r) message.obj;
            rVar3.getClass();
            rVar3.c();
            return;
        }
        int i14 = message.what;
        if (i14 != 2 && i14 != 1 && i14 != 7) {
            Log.wtf("GmsClient", a4.d.g("Don't know how to handle message: ", i14), new Exception());
            return;
        }
        r rVar4 = (r) message.obj;
        synchronized (rVar4) {
            try {
                bool = rVar4.f5636a;
                if (rVar4.f5637b) {
                    Log.w("GmsClient", "Callback proxy " + rVar4.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            com.google.android.gms.common.internal.a aVar9 = rVar4.f5641f;
            int i15 = rVar4.f5639d;
            if (i15 != 0) {
                aVar9.w(1, null);
                Bundle bundle = rVar4.f5640e;
                rVar4.a(new m6.b(i15, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
            } else if (!rVar4.b()) {
                aVar9.w(1, null);
                rVar4.a(new m6.b(8, null));
            }
        }
        synchronized (rVar4) {
            rVar4.f5637b = true;
        }
        rVar4.c();
    }
}
