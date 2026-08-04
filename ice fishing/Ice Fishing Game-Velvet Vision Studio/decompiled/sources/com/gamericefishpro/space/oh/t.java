package com.gamericefishpro.space.oh;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements Serializable {
    public final Boolean d;
    public final Boolean e;
    public final Boolean i;

    public t(Boolean bool, Boolean bool2, Boolean bool3) {
        this.d = bool;
        this.e = bool2;
        this.i = bool3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.d.equals(tVar.d) && this.e.equals(tVar.e) && this.i.equals(tVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "(" + this.d + ", " + this.e + ", " + this.i + ')';
    }
}
