package com.gamericefishpro.space.i9;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b4 {
    public final Context a;
    public final com.gamericefishpro.space.ta.d b;

    public b4(Context context, com.gamericefishpro.space.ta.d dVar) {
        this.a = context;
        this.b = dVar;
    }

    public final boolean equals(Object obj) {
        com.gamericefishpro.space.ta.d dVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b4) {
            b4 b4Var = (b4) obj;
            com.gamericefishpro.space.ta.d dVar2 = b4Var.b;
            if (this.a.equals(b4Var.a) && ((dVar = this.b) != null ? dVar.equals(dVar2) : dVar2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        com.gamericefishpro.space.ta.d dVar = this.b;
        return (iHashCode * 1000003) ^ (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        String string = this.a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(length + 45 + strValueOf.length() + 1);
        sb.append("FlagsContext{context=");
        sb.append(string);
        sb.append(", hermeticFileOverrides=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
