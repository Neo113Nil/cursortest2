package com.plaid.internal;

import android.app.Application;
import android.content.Context;
import com.plaid.internal.H5;
import dagger.internal.Factory;

/* loaded from: classes5.dex */
public final class C5 implements Factory {
    public final Factory a;

    public C5(C0266q5 c0266q5, Factory factory) {
        this.a = factory;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        H5 h5;
        Application application = (Application) this.a.get();
        application.getClass();
        H5.a aVar = H5.b;
        H5 h52 = H5.c;
        if (h52 != null) {
            return h52;
        }
        synchronized (aVar) {
            h5 = H5.c;
            if (h5 == null) {
                Context applicationContext = application.getApplicationContext();
                applicationContext.getClass();
                h5 = new H5(applicationContext);
                H5.c = h5;
            }
        }
        return h5;
    }
}
