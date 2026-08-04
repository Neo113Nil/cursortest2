package com.gamericefishpro.space.ta;

import com.gamericefishpro.space.i9.v5;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements d {
    public volatile v5 d;
    public volatile boolean e;
    public Object i;

    @Override // com.gamericefishpro.space.ta.d
    public final Object get() {
        if (!this.e) {
            synchronized (this) {
                try {
                    if (!this.e) {
                        v5 v5Var = this.d;
                        Objects.requireNonNull(v5Var);
                        Object obj = v5Var.get();
                        this.i = obj;
                        this.e = true;
                        this.d = null;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.i;
    }

    public final String toString() {
        Object string = this.d;
        if (string == null) {
            String strValueOf = String.valueOf(this.i);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(strValueOf);
            sb.append(">");
            string = sb.toString();
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(strValueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
