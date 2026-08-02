package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.a;

/* loaded from: classes.dex */
public final class f3x extends fsn {
    public final /* synthetic */ a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3x(a aVar, Looper looper) {
        super(looper, 6);
        this.a = aVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        int i = this.a.B.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if (i3 == 2 || i3 == 1 || i3 == 7) {
                d0x d0xVar = (d0x) message.obj;
                d0xVar.getClass();
                d0xVar.c();
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !this.a.c()) {
            d0x d0xVar2 = (d0x) message.obj;
            d0xVar2.getClass();
            d0xVar2.c();
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            a aVar = this.a;
            aVar.y = new h66(message.arg2);
            if (!aVar.z && !TextUtils.isEmpty(aVar.t()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(aVar.t());
                    a aVar2 = this.a;
                    if (!aVar2.z) {
                        aVar2.A(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            a aVar3 = this.a;
            h66 h66Var = aVar3.y;
            if (h66Var == null) {
                h66Var = new h66(8);
            }
            aVar3.o.a(h66Var);
            this.a.w(h66Var);
            return;
        }
        if (i4 == 5) {
            a aVar4 = this.a;
            h66 h66Var2 = aVar4.y;
            if (h66Var2 == null) {
                h66Var2 = new h66(8);
            }
            aVar4.o.a(h66Var2);
            this.a.w(h66Var2);
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            h66 h66Var3 = new h66(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.a.o.a(h66Var3);
            this.a.w(h66Var3);
            return;
        }
        if (i4 == 6) {
            this.a.A(5, null);
            f4m f4mVar = this.a.t;
            if (f4mVar != null) {
                ((rmd) f4mVar.b).p0(message.arg2);
            }
            a aVar5 = this.a;
            aVar5.a = message.arg2;
            aVar5.b = System.currentTimeMillis();
            a.z(this.a, 5, 1, null);
            return;
        }
        if (i4 == 2 && !this.a.isConnected()) {
            d0x d0xVar3 = (d0x) message.obj;
            d0xVar3.getClass();
            d0xVar3.c();
            return;
        }
        int i5 = message.what;
        if (i5 != 2 && i5 != 1 && i5 != 7) {
            Log.wtf("GmsClient", k5r.i(i5, "Don't know how to handle message: "), new Exception());
            return;
        }
        d0x d0xVar4 = (d0x) message.obj;
        synchronized (d0xVar4) {
            try {
                bool = d0xVar4.a;
                if (d0xVar4.b) {
                    Log.w("GmsClient", "Callback proxy " + d0xVar4.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            a aVar6 = d0xVar4.f;
            int i6 = d0xVar4.d;
            if (i6 != 0) {
                aVar6.A(1, null);
                Bundle bundle = d0xVar4.e;
                d0xVar4.a(new h66(i6, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
            } else if (!d0xVar4.b()) {
                aVar6.A(1, null);
                d0xVar4.a(new h66(8, null));
            }
        }
        synchronized (d0xVar4) {
            d0xVar4.b = true;
        }
        d0xVar4.c();
    }
}
