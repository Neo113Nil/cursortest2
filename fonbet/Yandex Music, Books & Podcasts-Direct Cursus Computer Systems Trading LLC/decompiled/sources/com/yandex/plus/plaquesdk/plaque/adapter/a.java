package com.yandex.plus.plaquesdk.plaque.adapter;

import com.yandex.passport.internal.methods.performer.v0;
import defpackage.bw1;
import defpackage.j66;
import java.util.List;

/* loaded from: classes5.dex */
public final class a extends j66 {
    public final /* synthetic */ List n;
    public final /* synthetic */ List o;
    public final /* synthetic */ bw1 p;

    public a(List list, List list2, bw1 bw1Var) {
        this.n = list;
        this.o = list2;
        this.p = bw1Var;
    }

    @Override // defpackage.j66
    public final boolean I(int i, int i2) {
        return ((Boolean) ((v0) this.p.f).invoke(this.n.get(i), this.o.get(i2))).booleanValue();
    }

    @Override // defpackage.j66
    public final boolean J(int i, int i2) {
        return ((Boolean) ((v0) this.p.e).invoke(this.n.get(i), this.o.get(i2))).booleanValue();
    }

    @Override // defpackage.j66
    public final int Z() {
        return this.o.size();
    }

    @Override // defpackage.j66
    public final int a0() {
        return this.n.size();
    }
}
