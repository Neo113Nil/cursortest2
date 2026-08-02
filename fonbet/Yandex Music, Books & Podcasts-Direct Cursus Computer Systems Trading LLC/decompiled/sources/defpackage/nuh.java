package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.media3.session.i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class nuh extends Service {
    public static final boolean l = Log.isLoggable("MBServiceCompat", 3);
    public gs4 a;
    public final awc b = new awc(this);
    public final jhh c = new jhh(this, "android.media.session.MediaController", -1, -1, null);
    public final ArrayList d = new ArrayList();
    public final xy0 e = new xy0(0);
    public jhh f;
    public final tt1 g;
    public msh h;
    public final zth i;
    public final i j;
    public final g06 k;

    public nuh(i iVar) {
        tt1 tt1Var = new tt1(5);
        tt1Var.b = this;
        this.g = tt1Var;
        this.i = zth.a(iVar.f);
        this.j = iVar;
        this.k = new g06(iVar);
    }

    public final void a(msh mshVar) {
        attachBaseContext(this.j.f);
        onCreate();
        if (mshVar == null) {
            xq0.x("Session token may not be null");
            return;
        }
        if (this.h != null) {
            xq0.q("The session token has already been set");
            return;
        }
        this.h = mshVar;
        gs4 gs4Var = this.a;
        gs4Var.getClass();
        ((nuh) gs4Var.d).g.e(new e8h(2, gs4Var, mshVar));
    }

    public final g8c b(Bundle bundle) {
        gs4 gs4Var = this.a;
        gs4Var.getClass();
        xth s = gs4Var.s();
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        Bundle bundle2 = bundle;
        boolean b = this.i.b(s);
        hee heeVar = rwf.a;
        Math.max(0, bundle2.getInt("androidx.media.utils.MediaBrowserCompat.extras.CUSTOM_BROWSER_ACTION_LIMIT", 0));
        wrh wrhVar = new wrh(s, 0, 0, b, null, bundle2);
        AtomicReference atomicReference = new AtomicReference();
        n20 n20Var = new n20();
        dvt.c0(this.j.l, new r8(this, atomicReference, wrhVar, n20Var, 7));
        try {
            n20Var.b();
            urh urhVar = (urh) atomicReference.get();
            urhVar.getClass();
            this.k.e(s, wrhVar, urhVar.a, urhVar.b);
            return vwh.a;
        } catch (InterruptedException e) {
            vq1.L("MSSLegacyStub", "Couldn't get a result from onConnect", e);
            return null;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        gs4 gs4Var = this.a;
        gs4Var.getClass();
        mhh mhhVar = (mhh) gs4Var.b;
        mhhVar.getClass();
        return mhhVar.onBind(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.a = new shh(this);
        } else if (i >= 26) {
            this.a = new qhh(this);
        } else {
            this.a = new gs4(this);
        }
        this.a.P();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.g.b = null;
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
