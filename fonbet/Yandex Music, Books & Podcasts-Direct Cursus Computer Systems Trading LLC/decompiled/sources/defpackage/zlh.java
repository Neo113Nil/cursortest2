package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import java.util.List;

/* loaded from: classes.dex */
public final class zlh implements IBinder.DeathRecipient {
    public final lkh a = new lkh(this);
    public ol7 b;
    public mkh c;
    public final Handler d;
    public final /* synthetic */ bmh e;

    public zlh(bmh bmhVar, Looper looper) {
        this.e = bmhVar;
        this.d = new Handler(looper, new xcg(2, this));
    }

    public final void a(rkh rkhVar) {
        bmh bmhVar = this.e;
        amh amhVar = bmhVar.n;
        bmhVar.n = new amh(rkhVar, (i6l) amhVar.e, (ioh) amhVar.f, amhVar.a, (CharSequence) amhVar.g, amhVar.b, amhVar.c, (Bundle) amhVar.h);
        k();
    }

    public final void b(boolean z) {
        kkh kkhVar = this.e.b;
        kkhVar.getClass();
        vq1.A(Looper.myLooper() == kkhVar.e.getLooper());
        ikh ikhVar = kkhVar.d;
        new Bundle().putBoolean("androidx.media3.session.ARGUMENT_CAPTIONING_ENABLED", z);
        ikhVar.i(new alp(Bundle.EMPTY, "androidx.media3.session.SESSION_COMMAND_ON_CAPTIONING_ENABLED_CHANGED"));
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        i(8, null, null);
    }

    public final void c(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        bmh bmhVar = this.e;
        amh amhVar = bmhVar.n;
        bmhVar.n = new amh((rkh) amhVar.d, (i6l) amhVar.e, (ioh) amhVar.f, amhVar.a, (CharSequence) amhVar.g, amhVar.b, amhVar.c, bundle2);
        bmhVar.o = true;
        k();
    }

    public final void d(ioh iohVar) {
        bmh bmhVar = this.e;
        amh amhVar = bmhVar.n;
        bmhVar.n = new amh((rkh) amhVar.d, (i6l) amhVar.e, iohVar, amhVar.a, (CharSequence) amhVar.g, amhVar.b, amhVar.c, (Bundle) amhVar.h);
        k();
    }

    public final void e(i6l i6lVar) {
        bmh bmhVar = this.e;
        amh amhVar = bmhVar.n;
        bmhVar.n = new amh((rkh) amhVar.d, bmh.Q0(i6lVar), (ioh) amhVar.f, amhVar.a, (CharSequence) amhVar.g, amhVar.b, amhVar.c, (Bundle) amhVar.h);
        k();
    }

    public final void f(List list) {
        bmh bmhVar = this.e;
        amh amhVar = bmhVar.n;
        bmhVar.n = new amh((rkh) amhVar.d, (i6l) amhVar.e, (ioh) amhVar.f, bmh.X(list), (CharSequence) amhVar.g, amhVar.b, amhVar.c, (Bundle) amhVar.h);
        k();
    }

    public final void g(CharSequence charSequence) {
        bmh bmhVar = this.e;
        amh amhVar = bmhVar.n;
        bmhVar.n = new amh((rkh) amhVar.d, (i6l) amhVar.e, (ioh) amhVar.f, amhVar.a, charSequence, amhVar.b, amhVar.c, (Bundle) amhVar.h);
        k();
    }

    public final void h(String str, Bundle bundle) {
        if (str == null) {
            return;
        }
        kkh kkhVar = this.e.b;
        kkhVar.getClass();
        vq1.A(Looper.myLooper() == kkhVar.e.getLooper());
        kkhVar.d.i(new alp(Bundle.EMPTY, str));
    }

    public final void i(int i, Object obj, Bundle bundle) {
        ol7 ol7Var = this.b;
        if (ol7Var != null) {
            Message obtainMessage = ol7Var.obtainMessage(i, obj);
            if (bundle != null) {
                obtainMessage.setData(bundle);
            }
            obtainMessage.sendToTarget();
        }
    }

    public final void j(Handler handler) {
        if (handler != null) {
            ol7 ol7Var = new ol7(this, handler.getLooper(), 1);
            this.b = ol7Var;
            ol7Var.b = true;
        } else {
            ol7 ol7Var2 = this.b;
            if (ol7Var2 != null) {
                ol7Var2.b = false;
                ol7Var2.removeCallbacksAndMessages(null);
                this.b = null;
            }
        }
    }

    public final void k() {
        Handler handler = this.d;
        if (handler.hasMessages(1)) {
            return;
        }
        handler.sendEmptyMessageDelayed(1, this.e.h);
    }
}
