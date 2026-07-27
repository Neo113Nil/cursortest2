package Z1;

import android.util.Base64;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f4225a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f4226b;

    /* renamed from: c, reason: collision with root package name */
    public final W1.d f4227c;

    public i(String str, byte[] bArr, W1.d dVar) {
        this.f4225a = str;
        this.f4226b = bArr;
        this.f4227c = dVar;
    }

    public static Y2.e a() {
        Y2.e eVar = new Y2.e(17, false);
        eVar.f3965w = W1.d.f3419n;
        return eVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f4225a.equals(iVar.f4225a) && Arrays.equals(this.f4226b, iVar.f4226b) && this.f4227c.equals(iVar.f4227c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f4225a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f4226b)) * 1000003) ^ this.f4227c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f4226b;
        return "TransportContext(" + this.f4225a + ", " + this.f4227c + ", " + (bArr == null ? "" : Base64.encodeToString(bArr, 2)) + ")";
    }
}
