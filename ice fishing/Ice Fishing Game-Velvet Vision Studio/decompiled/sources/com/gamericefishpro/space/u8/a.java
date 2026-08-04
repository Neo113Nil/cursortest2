package com.gamericefishpro.space.u8;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final int a;
    public final com.gamericefishpro.space.t8.c b;
    public final com.gamericefishpro.space.v8.o c;
    public final String d;

    public a(com.gamericefishpro.space.t8.c cVar, com.gamericefishpro.space.v8.o oVar, String str) {
        this.b = cVar;
        this.c = oVar;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{cVar, oVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return com.gamericefishpro.space.v8.c0.j(this.b, aVar.b) && com.gamericefishpro.space.v8.c0.j(this.c, aVar.c) && com.gamericefishpro.space.v8.c0.j(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
