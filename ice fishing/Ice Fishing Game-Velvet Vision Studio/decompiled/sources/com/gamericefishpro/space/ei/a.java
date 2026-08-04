package com.gamericefishpro.space.ei;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements h, Serializable {
    public final Object d;
    public final Class e;
    public final String i;
    public final String v;
    public final boolean w = false;
    public final int y;
    public final int z;

    public a(int i, int i2, Class cls, Object obj, String str, String str2) {
        this.d = obj;
        this.e = cls;
        this.i = str;
        this.v = str2;
        this.y = i;
        this.z = i2 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.w == aVar.w && this.y == aVar.y && this.z == aVar.z && this.d.equals(aVar.d) && this.e.equals(aVar.e) && this.i.equals(aVar.i) && this.v.equals(aVar.v);
    }

    @Override // com.gamericefishpro.space.ei.h
    public final int getArity() {
        return this.y;
    }

    public final int hashCode() {
        return ((((((this.v.hashCode() + ((this.i.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31)) * 31)) * 31) + (this.w ? 1231 : 1237)) * 31) + this.y) * 31) + this.z;
    }

    public final String toString() {
        b0.a.getClass();
        return c0.a(this);
    }
}
