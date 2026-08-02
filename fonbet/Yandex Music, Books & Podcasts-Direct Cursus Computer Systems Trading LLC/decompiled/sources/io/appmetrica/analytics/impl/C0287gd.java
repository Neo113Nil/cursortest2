package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.gd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0287gd implements X2 {
    public final C0193d5 a;

    public C0287gd(@NonNull C0193d5 c0193d5) {
        this.a = c0193d5;
    }

    @Override // io.appmetrica.analytics.impl.X2
    public final C0561pr a(@NonNull C0503nr c0503nr, @NonNull C0561pr c0561pr) {
        int i = c0503nr.b;
        int i2 = this.a.a;
        if (i == i2) {
            if (((C0561pr) ((HashMap) c0503nr.a.get(c0561pr.b)).get(new String(c0561pr.a))) != null) {
                ((HashMap) c0503nr.a.get(c0561pr.b)).put(new String(c0561pr.a), c0561pr);
                return c0561pr;
            }
        } else if (i < i2) {
            ((HashMap) c0503nr.a.get(c0561pr.b)).put(new String(c0561pr.a), c0561pr);
            c0503nr.b++;
        }
        return c0561pr;
    }
}
