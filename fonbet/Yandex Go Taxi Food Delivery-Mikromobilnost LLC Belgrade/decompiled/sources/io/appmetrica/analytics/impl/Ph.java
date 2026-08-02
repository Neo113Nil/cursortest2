package io.appmetrica.analytics.impl;

import defpackage.unr0;
import java.util.List;

/* loaded from: classes9.dex */
public final class Ph implements InterfaceC0184a9 {
    public final C0251ci a;
    public final List<Oh> b;

    public Ph(C0251ci c0251ci, List<Oh> list) {
        this.a = c0251ci;
        this.b = list;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0184a9
    public final List<Oh> a() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0184a9
    public final Object b() {
        return this.a;
    }

    public final C0251ci c() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreloadInfoData{chosenPreloadInfo=");
        sb.append(this.a);
        sb.append(", candidates=");
        return unr0.t(sb, this.b, '}');
    }
}
