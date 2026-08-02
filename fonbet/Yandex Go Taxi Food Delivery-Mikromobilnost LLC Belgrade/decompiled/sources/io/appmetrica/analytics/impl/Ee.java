package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.SparseArray;
import io.appmetrica.analytics.AppMetrica;

/* loaded from: classes9.dex */
public abstract class Ee {
    public abstract void a(int i);

    public final synchronized void a(Context context) {
        try {
            int b = b();
            int libraryApiLevel = AppMetrica.getLibraryApiLevel();
            if (b != libraryApiLevel) {
                if (b < libraryApiLevel) {
                    SparseArray c = c();
                    while (true) {
                        b++;
                        if (b > libraryApiLevel) {
                            break;
                        }
                        De de2 = (De) c.get(b);
                        if (de2 != null) {
                            de2.a(context);
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
