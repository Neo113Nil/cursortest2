package com.gamericefishpro.space.i9;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements n {
    public final String d;
    public final ArrayList e;

    public o(String str, ArrayList arrayList) {
        this.d = str;
        ArrayList arrayList2 = new ArrayList();
        this.e = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // com.gamericefishpro.space.i9.n
    public final Boolean b() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.gamericefishpro.space.i9.n
    public final Double c() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        String str = oVar.d;
        String str2 = this.d;
        if (str2 == null ? str == null : str2.equals(str)) {
            return this.e.equals(oVar.e);
        }
        return false;
    }

    @Override // com.gamericefishpro.space.i9.n
    public final Iterator h() {
        return null;
    }

    public final int hashCode() {
        String str = this.d;
        return this.e.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    @Override // com.gamericefishpro.space.i9.n
    public final n l(String str, com.gamericefishpro.space.u6.n nVar, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // com.gamericefishpro.space.i9.n
    public final String m() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.gamericefishpro.space.i9.n
    public final n o() {
        return this;
    }
}
