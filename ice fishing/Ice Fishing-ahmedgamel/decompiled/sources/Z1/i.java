package Z1;

import android.util.Base64;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f4148a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f4149b;

    /* renamed from: c, reason: collision with root package name */
    public final W1.d f4150c;

    public i(String str, byte[] bArr, W1.d dVar) {
        this.f4148a = str;
        this.f4149b = bArr;
        this.f4150c = dVar;
    }

    public static Z2.e a() {
        Z2.e eVar = new Z2.e(19, false);
        eVar.f4172w = W1.d.f3407n;
        return eVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f4148a.equals(iVar.f4148a) && Arrays.equals(this.f4149b, iVar.f4149b) && this.f4150c.equals(iVar.f4150c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f4148a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f4149b)) * 1000003) ^ this.f4150c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f4149b;
        return "TransportContext(" + this.f4148a + ", " + this.f4150c + ", " + (bArr == null ? "" : Base64.encodeToString(bArr, 2)) + ")";
    }
}
