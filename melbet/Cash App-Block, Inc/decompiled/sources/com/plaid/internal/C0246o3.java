package com.plaid.internal;

import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.plaid.link.Plaid;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.plaid.internal.o3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0246o3 implements Factory {
    public final Factory a;
    public final Provider b;
    public final Provider c;
    public final C0156e3 d;
    public final Provider e;

    public C0246o3(C0147d3 c0147d3, Factory factory, Provider provider, Provider provider2, C0156e3 c0156e3, Provider provider3) {
        this.a = factory;
        this.b = provider;
        this.c = provider2;
        this.d = c0156e3;
        this.e = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.a.get();
        I5 i5 = (I5) this.b.get();
        C0100b1 c0100b1 = (C0100b1) this.c.get();
        C0161f c0161f = (C0161f) this.d.get();
        String str = (String) this.e.get();
        application.getClass();
        i5.getClass();
        c0100b1.getClass();
        c0161f.getClass();
        str.getClass();
        O4 o4 = O4.a;
        String a = G0.a(application);
        c0100b1.getClass();
        String version_name = Plaid.getVERSION_NAME();
        Bundle bundle = i5.a.getPackageManager().getApplicationInfo(i5.a.getPackageName(), 128).metaData;
        String string2 = bundle != null ? bundle.getString("com.plaid.link.react_native") : null;
        Bundle bundle2 = i5.a.getPackageManager().getApplicationInfo(i5.a.getPackageName(), 128).metaData;
        String string3 = bundle2 != null ? bundle2.getString("com.github.jorgefspereira.plaid_flutter.version") : null;
        String packageName = application.getPackageName();
        packageName.getClass();
        String a2 = Q.a(application);
        PackageManager packageManager = application.getPackageManager();
        packageManager.getClass();
        return new n8(a, version_name, string2, string3, str, packageName, a2, packageManager, c0161f.a(application), new C0102b3(c0100b1));
    }
}
