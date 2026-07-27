package com.anythink.core.common.d;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public final class e {

    public final class a {

        /* renamed from: b, reason: collision with root package name */
        private final String f12479b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f12480c;

        public a(String str, boolean z8) {
            this.f12479b = str;
            this.f12480c = z8;
        }

        private boolean b() {
            return this.f12480c;
        }

        public final String a() {
            return this.f12479b;
        }
    }

    public final class c implements IInterface {

        /* renamed from: b, reason: collision with root package name */
        private IBinder f12485b;

        public c(IBinder iBinder) {
            this.f12485b = iBinder;
        }

        public final String a() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f12485b.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.f12485b;
        }

        public final boolean b() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                this.f12485b.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public final a a(Context context) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        b bVar = new b(this, (byte) 0);
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.size() <= 0 || !context.bindService(intent, bVar, 1)) {
            throw new IOException("Google Play connection failed");
        }
        try {
            c cVar = new c(bVar.a());
            return new a(cVar.a(), cVar.b());
        } finally {
        }
    }

    public final class b implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        boolean f12481a;

        /* renamed from: c, reason: collision with root package name */
        private final LinkedBlockingQueue<IBinder> f12483c;

        private b() {
            this.f12481a = false;
            this.f12483c = new LinkedBlockingQueue<>(1);
        }

        public final IBinder a() {
            if (this.f12481a) {
                throw new IllegalStateException();
            }
            this.f12481a = true;
            return this.f12483c.take();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f12483c.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }

        public /* synthetic */ b(e eVar, byte b9) {
            this();
        }
    }
}
