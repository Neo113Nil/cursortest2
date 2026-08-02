package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.u3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0681u3 {
    public final AbstractC0177ci a;
    public final Pb b;

    public AbstractC0681u3(AbstractC0177ci abstractC0177ci, Pb pb) {
        this.a = abstractC0177ci;
        this.b = pb;
    }

    public final boolean a(@NonNull H6 h6, @NonNull InterfaceC0652t3 interfaceC0652t3) {
        Iterator it = ((C0198da) this.a.a(h6.d)).a.iterator();
        while (it.hasNext()) {
            if (interfaceC0652t3.a(it.next(), h6)) {
                return true;
            }
        }
        return false;
    }

    public final AbstractC0177ci b() {
        return this.a;
    }

    public final Pb a() {
        return this.b;
    }
}
