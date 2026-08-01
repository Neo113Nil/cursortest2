package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class L0 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f26006a;

    /* renamed from: b, reason: collision with root package name */
    public final List f26007b;

    /* renamed from: c, reason: collision with root package name */
    public final C3500lC f26008c;

    static {
        String str = AbstractC3159eu.f29993a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    public L0(Uri uri, C3500lC c3500lC) {
        List list = Collections.EMPTY_LIST;
        this.f26006a = uri;
        ArrayList arrayList = H4.f25213a;
        this.f26007b = list;
        this.f26008c = c3500lC;
        PB pb = RB.f27177u;
        MA.q(4, "initialCapacity");
        Object[] objArr = new Object[4];
        if (c3500lC.f31747w <= 0) {
            RB.p(objArr, 0);
        } else {
            c3500lC.get(0);
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
        return this.f26006a.equals(l02.f26006a) && this.f26007b.equals(l02.f26007b) && this.f26008c.equals(l02.f26008c);
    }

    public final int hashCode() {
        return (int) (((this.f26008c.hashCode() + ((this.f26007b.hashCode() + (this.f26006a.hashCode() * 923521)) * 961)) * 31 * 31) + com.anythink.basead.exoplayer.b.f6382b);
    }
}
