package b2;

import android.util.Base64;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f5537a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f5538b;

    /* renamed from: c, reason: collision with root package name */
    public final Y1.d f5539c;

    public i(String str, byte[] bArr, Y1.d dVar) {
        this.f5537a = str;
        this.f5538b = bArr;
        this.f5539c = dVar;
    }

    public static b3.e a() {
        b3.e eVar = new b3.e(22, false);
        eVar.f5559w = Y1.d.f3904n;
        return eVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f5537a.equals(iVar.f5537a) && Arrays.equals(this.f5538b, iVar.f5538b) && this.f5539c.equals(iVar.f5539c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f5537a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5538b)) * 1000003) ^ this.f5539c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f5538b;
        return "TransportContext(" + this.f5537a + ", " + this.f5539c + ", " + (bArr == null ? "" : Base64.encodeToString(bArr, 2)) + ")";
    }
}
