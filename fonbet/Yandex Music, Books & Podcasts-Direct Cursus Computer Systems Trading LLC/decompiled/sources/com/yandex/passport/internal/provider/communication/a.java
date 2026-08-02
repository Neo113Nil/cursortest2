package com.yandex.passport.internal.provider.communication;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import defpackage.gm5;
import defpackage.j5;

/* loaded from: classes4.dex */
public final class a implements ServiceConnection {
    public final /* synthetic */ j5 a;

    public a(j5 j5Var) {
        this.a = j5Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        componentName.getClass();
        iBinder.getClass();
        gm5 gm5Var = (gm5) this.a.b;
        if (gm5Var != null) {
            gm5Var.U(new Messenger(iBinder));
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        componentName.getClass();
        j5 j5Var = this.a;
        gm5 gm5Var = (gm5) j5Var.b;
        if (gm5Var != null) {
            gm5Var.g(null);
        }
        j5Var.b = null;
    }
}
