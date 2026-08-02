package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class L0 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f26806a;

    /* renamed from: b, reason: collision with root package name */
    public final List f26807b;

    /* renamed from: c, reason: collision with root package name */
    public final C3523lC f26808c;

    static {
        String str = AbstractC3182eu.f30782a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    public L0(Uri uri, C3523lC c3523lC) {
        List list = Collections.EMPTY_LIST;
        this.f26806a = uri;
        ArrayList arrayList = H4.f25985a;
        this.f26807b = list;
        this.f26808c = c3523lC;
        PB pb = RB.f27933u;
        MA.q(4, "initialCapacity");
        Object[] objArr = new Object[4];
        if (c3523lC.f32527w <= 0) {
            RB.p(objArr, 0);
        } else {
            c3523lC.get(0);
            throw new ClassCastException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L0)) {
            return false;
        }
        L0 l02 = (L0) obj;
        return this.f26806a.equals(l02.f26806a) && this.f26807b.equals(l02.f26807b) && this.f26808c.equals(l02.f26808c);
    }

    public final int hashCode() {
        return (int) (((this.f26808c.hashCode() + ((this.f26807b.hashCode() + (this.f26806a.hashCode() * 923521)) * 961)) * 31 * 31) + com.anythink.basead.exoplayer.b.f7168b);
    }
}
