package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.SparseArray;
import io.appmetrica.analytics.AppMetrica;

/* renamed from: io.appmetrica.analytics.impl.pe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0548pe {
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
                        InterfaceC0519oe interfaceC0519oe = (InterfaceC0519oe) c.get(b);
                        if (interfaceC0519oe != null) {
                            interfaceC0519oe.a(context);
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
