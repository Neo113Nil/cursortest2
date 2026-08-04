package com.gamericefishpro.space.c8;

import android.util.Base64;
import com.gamericefishpro.space.t0.y0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public final String a;
    public final byte[] b;
    public final com.gamericefishpro.space.z7.d c;

    public j(String str, byte[] bArr, com.gamericefishpro.space.z7.d dVar) {
        this.a = str;
        this.b = bArr;
        this.c = dVar;
    }

    public static com.gamericefishpro.space.a8.c a() {
        com.gamericefishpro.space.a8.c cVar = new com.gamericefishpro.space.a8.c(2, false);
        cVar.i = com.gamericefishpro.space.z7.d.d;
        return cVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.a.equals(jVar.a) && Arrays.equals(this.b, jVar.b) && this.c.equals(jVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.b;
        String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return y0.j(sb, strEncodeToString, ")");
    }
}
