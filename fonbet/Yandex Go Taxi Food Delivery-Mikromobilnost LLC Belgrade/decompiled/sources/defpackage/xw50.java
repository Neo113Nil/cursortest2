package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import java.io.Closeable;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public abstract class xw50 implements Closeable {
    public final x22 a;
    public final ConnectivityManager c;
    public Boolean x;
    public final zq60 b = new zq60();
    public final Handler w = new Handler(Looper.myLooper());

    public xw50(Context context, wff0 wff0Var, x22 x22Var) {
        this.a = x22Var;
        this.c = (ConnectivityManager) context.getSystemService("connectivity");
        wff0Var.a(new fn3(11, this));
    }

    public abstract boolean a();

    public final void c(boolean z) {
        boolean z2;
        if (jl40.l(this.x, Boolean.valueOf(z))) {
            return;
        }
        if (this.x != null) {
            x22 x22Var = this.a;
            if (z) {
                x22Var.reportEvent("connection_established");
            } else {
                x22Var.reportEvent("connection_lost");
            }
        }
        this.x = Boolean.valueOf(z);
        zq60 zq60Var = this.b;
        zq60Var.getClass();
        ArrayList arrayList = zq60Var.a;
        zq60Var.b++;
        int size = arrayList.size();
        int i = 0;
        boolean z3 = false;
        while (true) {
            int i2 = i;
            while (i2 < size && arrayList.get(i2) == null) {
                i2++;
            }
            if (i2 < size) {
                z2 = true;
            } else {
                if (!z3) {
                    zq60.a(zq60Var);
                    z3 = true;
                }
                z2 = false;
            }
            if (!z2) {
                return;
            }
            while (i < size && arrayList.get(i) == null) {
                i++;
            }
            if (i >= size) {
                if (!z3) {
                    zq60.a(zq60Var);
                }
                ny61.p();
                return;
            } else {
                ((qw50) arrayList.get(i)).a(z);
                i++;
            }
        }
    }
}
