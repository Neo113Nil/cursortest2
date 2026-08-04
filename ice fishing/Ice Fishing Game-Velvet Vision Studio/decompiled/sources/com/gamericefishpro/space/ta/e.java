package com.gamericefishpro.space.ta;

import com.gamericefishpro.space.i9.v5;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements d, Serializable {
    public final v5 d;
    public volatile transient boolean e;
    public transient Object i;

    public e(v5 v5Var) {
        this.d = v5Var;
    }

    @Override // com.gamericefishpro.space.ta.d
    public final Object get() {
        if (!this.e) {
            synchronized (this) {
                try {
                    if (!this.e) {
                        Object obj = this.d.get();
                        this.i = obj;
                        this.e = true;
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
        Object string;
        if (this.e) {
            String strValueOf = String.valueOf(this.i);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(strValueOf);
            sb.append(">");
            string = sb.toString();
        } else {
            string = this.d;
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(strValueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
