package w5;

import android.util.Base64;
import java.util.Arrays;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f7687a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f7688b;

    /* renamed from: c, reason: collision with root package name */
    public final t5.d f7689c;

    public i(String str, byte[] bArr, t5.d dVar) {
        this.f7687a = str;
        this.f7688b = bArr;
        this.f7689c = dVar;
    }

    public static a5.c a() {
        a5.c cVar = new a5.c();
        cVar.f263i = t5.d.f6527g;
        return cVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f7687a.equals(iVar.f7687a) && Arrays.equals(this.f7688b, iVar.f7688b) && this.f7689c.equals(iVar.f7689c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f7687a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f7688b)) * 1000003) ^ this.f7689c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f7688b;
        return "TransportContext(" + this.f7687a + ", " + this.f7689c + ", " + (bArr == null ? "" : Base64.encodeToString(bArr, 2)) + ")";
    }
}
