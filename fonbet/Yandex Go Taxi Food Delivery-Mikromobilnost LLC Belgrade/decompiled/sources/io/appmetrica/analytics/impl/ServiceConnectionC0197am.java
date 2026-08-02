package io.appmetrica.analytics.impl;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: io.appmetrica.analytics.impl.am, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ServiceConnectionC0197am implements ServiceConnection {
    public final Wi a;
    public final Zl b;
    public final /* synthetic */ C0226bm c;

    public ServiceConnectionC0197am(C0226bm c0226bm, Wi wi) {
        this.c = c0226bm;
        this.a = wi;
        this.b = new Zl(c0226bm, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        C0226bm.a(this.c, this);
        this.a.a(new C0252cj("RuStore service binding died", null, 2, 0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        C0226bm.a(this.c, this);
        this.a.a(new C0252cj("RuStore service returned null binding", null, 2, 0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            Ac a = AbstractBinderC0909zc.a(iBinder);
            if (a == null) {
                C0226bm.a(this.c, this);
                this.a.a(new C0252cj("RuStore service binder is null", null, 2, 0 == true ? 1 : 0));
                return;
            }
            String packageName = this.c.a.getPackageName();
            Zl zl = this.b;
            C0880yc c0880yc = (C0880yc) a;
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("ru.vk.store.sdk.install.referrer.InstallReferrerProvider");
                obtain.writeString(packageName);
                obtain.writeStrongInterface(zl);
                c0880yc.a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        } catch (Throwable th) {
            C0226bm.a(this.c, this);
            this.a.a(new C0252cj("Failed to referrer from RuStore service", th));
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
