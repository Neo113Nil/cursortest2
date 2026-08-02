package R2;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import java.util.Objects;

/* loaded from: classes.dex */
public final class z extends c3.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0380f f2880b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(AbstractC0380f abstractC0380f, Looper looper) {
        super(looper, 3);
        Objects.requireNonNull(abstractC0380f);
        this.f2880b = abstractC0380f;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        u uVar;
        AbstractC0380f abstractC0380f = this.f2880b;
        if (abstractC0380f.f2794U.get() != message.arg1) {
            int i = message.what;
            if ((i == 2 || i == 1 || i == 7) && (uVar = (u) message.obj) != null) {
                synchronized (uVar) {
                    uVar.f2868a = null;
                }
                AbstractC0380f abstractC0380f2 = uVar.f2870c;
                synchronized (abstractC0380f2.J) {
                    abstractC0380f2.J.remove(uVar);
                }
                return;
            }
            return;
        }
        int i4 = message.what;
        if ((i4 == 1 || i4 == 7 || i4 == 4 || i4 == 5) && !abstractC0380f.d()) {
            u uVar2 = (u) message.obj;
            if (uVar2 != null) {
                synchronized (uVar2) {
                    uVar2.f2868a = null;
                }
                AbstractC0380f abstractC0380f3 = uVar2.f2870c;
                synchronized (abstractC0380f3.J) {
                    abstractC0380f3.J.remove(uVar2);
                }
                return;
            }
            return;
        }
        int i6 = message.what;
        if (i6 == 4) {
            abstractC0380f.f2791R = new O2.b(message.arg2, null, null);
            if (!abstractC0380f.f2792S && !TextUtils.isEmpty(abstractC0380f.v()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(abstractC0380f.v());
                    if (!abstractC0380f.f2792S) {
                        abstractC0380f.z(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            O2.b bVar = abstractC0380f.f2791R;
            if (bVar == null) {
                bVar = new O2.b(8, null, null);
            }
            abstractC0380f.f2782H.a(bVar);
            abstractC0380f.f2798w = bVar.f2256u;
            abstractC0380f.f2799x = System.currentTimeMillis();
            return;
        }
        if (i6 == 5) {
            O2.b bVar2 = abstractC0380f.f2791R;
            if (bVar2 == null) {
                bVar2 = new O2.b(8, null, null);
            }
            abstractC0380f.f2782H.a(bVar2);
            abstractC0380f.f2798w = bVar2.f2256u;
            abstractC0380f.f2799x = System.currentTimeMillis();
            return;
        }
        if (i6 == 3) {
            Object obj = message.obj;
            PendingIntent pendingIntent = obj instanceof PendingIntent ? (PendingIntent) obj : null;
            int i9 = message.arg2;
            abstractC0380f.f2782H.a(new O2.b(i9, pendingIntent, null));
            abstractC0380f.f2798w = i9;
            abstractC0380f.f2799x = System.currentTimeMillis();
            return;
        }
        if (i6 == 6) {
            abstractC0380f.z(5, null);
            InterfaceC0376b interfaceC0376b = abstractC0380f.f2786M;
            if (interfaceC0376b != null) {
                interfaceC0376b.onConnectionSuspended(message.arg2);
            }
            abstractC0380f.f2795n = message.arg2;
            abstractC0380f.f2796u = System.currentTimeMillis();
            abstractC0380f.y(5, 1, null);
            return;
        }
        if (i6 == 2 && !abstractC0380f.h()) {
            u uVar3 = (u) message.obj;
            if (uVar3 != null) {
                synchronized (uVar3) {
                    uVar3.f2868a = null;
                }
                AbstractC0380f abstractC0380f4 = uVar3.f2870c;
                synchronized (abstractC0380f4.J) {
                    abstractC0380f4.J.remove(uVar3);
                }
                return;
            }
            return;
        }
        int i10 = message.what;
        if (i10 != 2 && i10 != 1 && i10 != 7) {
            Log.wtf("GmsClient", D.x.k(i10, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i10).length() + 34)), new Exception());
            return;
        }
        u uVar4 = (u) message.obj;
        synchronized (uVar4) {
            try {
                bool = uVar4.f2868a;
                if (uVar4.f2869b) {
                    String obj2 = uVar4.toString();
                    StringBuilder sb = new StringBuilder(obj2.length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(obj2);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            AbstractC0380f abstractC0380f5 = uVar4.f2873f;
            int i11 = uVar4.f2871d;
            if (i11 != 0) {
                abstractC0380f5.z(1, null);
                Bundle bundle = uVar4.f2872e;
                uVar4.b(new O2.b(i11, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!uVar4.a()) {
                abstractC0380f5.z(1, null);
                uVar4.b(new O2.b(8, null, null));
            }
        }
        synchronized (uVar4) {
            uVar4.f2869b = true;
        }
        synchronized (uVar4) {
            uVar4.f2868a = null;
        }
        AbstractC0380f abstractC0380f6 = uVar4.f2870c;
        synchronized (abstractC0380f6.J) {
            abstractC0380f6.J.remove(uVar4);
        }
    }
}
