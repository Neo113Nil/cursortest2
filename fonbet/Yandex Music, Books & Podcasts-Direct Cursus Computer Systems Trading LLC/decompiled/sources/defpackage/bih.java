package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class bih extends Service {
    public static final boolean g = Log.isLoggable("MBServiceCompat", 3);
    public dn9 a;
    public final n7b b = new n7b(this);
    public final ArrayList c;
    public final xy0 d;
    public final tt1 e;
    public MediaSessionCompat$Token f;

    public bih() {
        new khh(this, "android.media.session.MediaController", -1, -1, null);
        this.c = new ArrayList();
        this.d = new xy0(0);
        tt1 tt1Var = new tt1(6);
        tt1Var.b = this;
        this.e = tt1Var;
    }

    public static List a(List list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i == -1 && i2 == -1) {
            return list;
        }
        int i3 = i2 * i;
        int i4 = i3 + i2;
        if (i < 0 || i2 < 1 || i3 >= list.size()) {
            return Collections.EMPTY_LIST;
        }
        if (i4 > list.size()) {
            i4 = list.size();
        }
        return list.subList(i3, i4);
    }

    public abstract nnd b(int i, String str);

    public abstract void c(String str, uhh uhhVar);

    public abstract void d(String str, uhh uhhVar);

    public final void e(String str, khh khhVar, Bundle bundle) {
        hhh hhhVar = new hhh(this, str, khhVar, str, bundle);
        if (bundle == null) {
            c(str, hhhVar);
        } else {
            hhhVar.d = 1;
            c(str, hhhVar);
        }
        if (hhhVar.b()) {
            return;
        }
        xq0.q(vz1.s(new StringBuilder("onLoadChildren must call detach() or sendResult() before returning for package="), khhVar.a, " id=", str));
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return ((mhh) this.a.c).onBind(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.a = new thh(this);
        } else if (i >= 26) {
            this.a = new rhh(this);
        } else {
            this.a = new dn9(this);
        }
        this.a.q();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.e.b = null;
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
