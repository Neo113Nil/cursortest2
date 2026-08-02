package com.google.android.play.integrity.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ac implements ServiceConnection {
    public final /* synthetic */ ae a;

    public /* synthetic */ ac(ae aeVar) {
        Objects.requireNonNull(aeVar);
        this.a = aeVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ae aeVar = this.a;
        aeVar.c.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        aeVar.c().post(new aa(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ae aeVar = this.a;
        aeVar.c.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        aeVar.c().post(new x(this));
    }
}
