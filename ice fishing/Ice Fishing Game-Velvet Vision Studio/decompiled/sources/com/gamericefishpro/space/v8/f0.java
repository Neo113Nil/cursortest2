package com.gamericefishpro.space.v8;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends com.gamericefishpro.space.f9.e {
    public final /* synthetic */ f a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(f fVar, Looper looper) {
        super(looper, 2);
        this.a = fVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        x xVar;
        f fVar = this.a;
        if (fVar.U.get() != message.arg1) {
            int i = message.what;
            if ((i == 2 || i == 1 || i == 7) && (xVar = (x) message.obj) != null) {
                synchronized (xVar) {
                    xVar.a = null;
                }
                f fVar2 = xVar.c;
                synchronized (fVar2.J) {
                    fVar2.J.remove(xVar);
                }
                return;
            }
            return;
        }
        int i2 = message.what;
        if ((i2 == 1 || i2 == 7 || i2 == 4 || i2 == 5) && !fVar.g()) {
            x xVar2 = (x) message.obj;
            if (xVar2 != null) {
                synchronized (xVar2) {
                    xVar2.a = null;
                }
                f fVar3 = xVar2.c;
                synchronized (fVar3.J) {
                    fVar3.J.remove(xVar2);
                }
                return;
            }
            return;
        }
        int i3 = message.what;
        if (i3 == 4) {
            fVar.R = new com.gamericefishpro.space.s8.b(message.arg2, null, null);
            if (!fVar.S && !TextUtils.isEmpty(fVar.v()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(fVar.v());
                    if (!fVar.S) {
                        fVar.z(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            com.gamericefishpro.space.s8.b bVar = fVar.R;
            if (bVar == null) {
                bVar = new com.gamericefishpro.space.s8.b(8, null, null);
            }
            fVar.H.a(bVar);
            fVar.v = bVar.e;
            fVar.w = System.currentTimeMillis();
            return;
        }
        if (i3 == 5) {
            com.gamericefishpro.space.s8.b bVar2 = fVar.R;
            if (bVar2 == null) {
                bVar2 = new com.gamericefishpro.space.s8.b(8, null, null);
            }
            fVar.H.a(bVar2);
            fVar.v = bVar2.e;
            fVar.w = System.currentTimeMillis();
            return;
        }
        if (i3 == 3) {
            Object obj = message.obj;
            PendingIntent pendingIntent = obj instanceof PendingIntent ? (PendingIntent) obj : null;
            int i4 = message.arg2;
            fVar.H.a(new com.gamericefishpro.space.s8.b(i4, pendingIntent, null));
            fVar.v = i4;
            fVar.w = System.currentTimeMillis();
            return;
        }
        if (i3 == 6) {
            fVar.z(5, null);
            b bVar3 = fVar.M;
            if (bVar3 != null) {
                bVar3.onConnectionSuspended(message.arg2);
            }
            fVar.d = message.arg2;
            fVar.e = System.currentTimeMillis();
            fVar.y(5, 1, null);
            return;
        }
        if (i3 == 2 && !fVar.a()) {
            x xVar3 = (x) message.obj;
            if (xVar3 != null) {
                synchronized (xVar3) {
                    xVar3.a = null;
                }
                f fVar4 = xVar3.c;
                synchronized (fVar4.J) {
                    fVar4.J.remove(xVar3);
                }
                return;
            }
            return;
        }
        int i5 = message.what;
        if (i5 != 2 && i5 != 1 && i5 != 7) {
            StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 34);
            sb.append("Don't know how to handle message: ");
            sb.append(i5);
            Log.wtf("GmsClient", sb.toString(), new Exception());
            return;
        }
        x xVar4 = (x) message.obj;
        synchronized (xVar4) {
            try {
                bool = xVar4.a;
                if (xVar4.b) {
                    String string = xVar4.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 47);
                    sb2.append("Callback proxy ");
                    sb2.append(string);
                    sb2.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb2.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            f fVar5 = xVar4.f;
            int i6 = xVar4.d;
            if (i6 != 0) {
                fVar5.z(1, null);
                Bundle bundle = xVar4.e;
                xVar4.b(new com.gamericefishpro.space.s8.b(i6, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!xVar4.a()) {
                fVar5.z(1, null);
                xVar4.b(new com.gamericefishpro.space.s8.b(8, null, null));
            }
        }
        synchronized (xVar4) {
            xVar4.b = true;
        }
        synchronized (xVar4) {
            xVar4.a = null;
        }
        f fVar6 = xVar4.c;
        synchronized (fVar6.J) {
            fVar6.J.remove(xVar4);
        }
    }
}
