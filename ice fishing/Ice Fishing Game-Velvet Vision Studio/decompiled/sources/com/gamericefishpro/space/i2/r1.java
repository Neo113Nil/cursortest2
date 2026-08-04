package com.gamericefishpro.space.i2;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 implements com.gamericefishpro.space.h2.p1 {
    public final int d;
    public final List e;
    public Float i = null;
    public Float v = null;
    public com.gamericefishpro.space.o2.i w = null;
    public com.gamericefishpro.space.o2.i y = null;

    public r1(int i, ArrayList arrayList) {
        this.d = i;
        this.e = arrayList;
    }

    @Override // com.gamericefishpro.space.h2.p1
    public final boolean t() {
        return this.e.contains(this);
    }
}
