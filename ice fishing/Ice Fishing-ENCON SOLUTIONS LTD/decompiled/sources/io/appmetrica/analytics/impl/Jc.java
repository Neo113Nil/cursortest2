package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.SparseArray;
import io.appmetrica.analytics.AppMetrica;

/* loaded from: classes.dex */
public abstract class Jc {
    public abstract void a(int i2);

    public final synchronized void a(Context context) {
        try {
            int b2 = b();
            int libraryApiLevel = AppMetrica.getLibraryApiLevel();
            if (b2 != libraryApiLevel) {
                if (b2 < libraryApiLevel) {
                    SparseArray c2 = c();
                    while (true) {
                        b2++;
                        if (b2 > libraryApiLevel) {
                            break;
                        }
                        Ic ic = (Ic) c2.get(b2);
                        if (ic != null) {
                            ic.a(context);
                        }
                    }
                }
                a(libraryApiLevel);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract int b();

    public abstract SparseArray c();

    public final int a() {
        return AppMetrica.getLibraryApiLevel();
    }
}
