package defpackage;

import androidx.compose.runtime.internal.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class z8m {
    public final a a;
    public final wls b;
    public final y7m c;
    public final y7m d;
    public final int e;
    public final tls f;
    public final boolean g;
    public final sls h;

    public z8m(a aVar, wls wlsVar, y7m y7mVar, y7m y7mVar2, int i, tls tlsVar, boolean z, sls slsVar) {
        this.a = aVar;
        this.b = wlsVar;
        this.c = y7mVar;
        this.d = y7mVar2;
        this.e = i;
        this.f = tlsVar;
        this.g = z;
        this.h = slsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z8m) {
            z8m z8mVar = (z8m) obj;
            if (this.a == z8mVar.a && jl40.l(this.b, z8mVar.b) && jl40.l(this.c, z8mVar.c) && jl40.l(this.d, z8mVar.d) && this.e == z8mVar.e && jl40.l(this.f, z8mVar.f) && this.g == z8mVar.g && jl40.l(this.h, z8mVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        wls wlsVar = this.b;
        int hashCode2 = (hashCode + (wlsVar == null ? 0 : wlsVar.hashCode())) * 31;
        y7m y7mVar = this.c;
        int hashCode3 = (hashCode2 + (y7mVar == null ? 0 : Float.hashCode(y7mVar.a))) * 31;
        y7m y7mVar2 = this.d;
        int e = unr0.e(ly3.a(oyr.b(this.e, (hashCode3 + (y7mVar2 == null ? 0 : Float.hashCode(y7mVar2.a))) * 31, 31), 31, this.f), 31, this.g);
        sls slsVar = this.h;
        return e + (slsVar != null ? slsVar.hashCode() : 0);
    }

    public final String toString() {
        return "DragDropColumnItemModel(content=" + this.a + ", divider=" + this.b + ", contentHeight=" + this.c + ", dividerHeight=" + this.d + ", id=" + this.e + ", isRemovable=" + this.f + ", isDraggable=" + this.g + ", onShown=" + this.h + Extension.C_BRAKE;
    }
}
