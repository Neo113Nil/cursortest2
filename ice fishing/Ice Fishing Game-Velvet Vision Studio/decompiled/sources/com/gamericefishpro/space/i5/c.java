package com.gamericefishpro.space.i5;

import android.os.Bundle;
import com.gamericefishpro.space.ei.b0;
import com.gamericefishpro.space.f5.k;
import com.gamericefishpro.space.f5.x;
import com.gamericefishpro.space.oh.s;
import com.gamericefishpro.space.ph.m0;
import com.gamericefishpro.space.z4.p;
import com.gamericefishpro.space.z4.p0;
import com.gamericefishpro.space.z4.w;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final k a;
    public final x b;
    public final Bundle c;
    public p d;
    public final com.gamericefishpro.space.f5.p e;
    public final String f;
    public final Bundle g;
    public final com.gamericefishpro.space.u6.c h;
    public boolean i;
    public final w j;
    public p k;
    public final p0 l;
    public final s m;

    public c(k owner) {
        Intrinsics.checkNotNullParameter(owner, "entry");
        this.a = owner;
        this.b = owner.e;
        this.c = owner.i;
        this.d = owner.v;
        this.e = owner.w;
        this.f = owner.y;
        this.g = owner.z;
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.h = new com.gamericefishpro.space.u6.c(new com.gamericefishpro.space.b6.b(owner, new com.gamericefishpro.space.a3.b(24, owner)));
        s sVarB = com.gamericefishpro.space.oh.i.b(new com.gamericefishpro.space.a5.h(21));
        this.j = new w(owner);
        this.k = p.e;
        this.l = (p0) sVarB.getValue();
        this.m = com.gamericefishpro.space.oh.i.b(new com.gamericefishpro.space.a5.h(22));
    }

    public final Bundle a() {
        Bundle from = this.c;
        if (from == null) {
            return null;
        }
        m0.c();
        Bundle source = com.gamericefishpro.space.wa.b.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(from, "from");
        source.putAll(from);
        return source;
    }

    public final void b() {
        if (!this.i) {
            com.gamericefishpro.space.u6.c cVar = this.h;
            cVar.o();
            this.i = true;
            if (this.e != null) {
                com.gamericefishpro.space.z4.m0.d(this.a);
            }
            cVar.p(this.g);
        }
        int iOrdinal = this.d.ordinal();
        int iOrdinal2 = this.k.ordinal();
        w wVar = this.j;
        if (iOrdinal < iOrdinal2) {
            wVar.g(this.d);
        } else {
            wVar.g(this.k);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(b0.a(k.class).c());
        sb.append("(" + this.f + ')');
        sb.append(" destination=");
        sb.append(this.b);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
