package defpackage;

import com.yandex.mapkit.geometry.BoundingBox;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class wm80 extends ym80 {
    public final int a;
    public final Integer b;
    public final String c;
    public final List d;
    public final BoundingBox e;

    public wm80(int i, Integer num, String str, List list, BoundingBox boundingBox) {
        this.a = i;
        this.b = num;
        this.c = str;
        this.d = list;
        this.e = boundingBox;
    }

    @Override // defpackage.ym80
    public final Integer a() {
        return this.b;
    }

    @Override // defpackage.ym80
    public final String b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm80)) {
            return false;
        }
        wm80 wm80Var = (wm80) obj;
        return this.a == wm80Var.a && jl40.l(this.b, wm80Var.b) && jl40.l(this.c, wm80Var.c) && jl40.l(this.d, wm80Var.d) && jl40.l(this.e, wm80Var.e);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        int c = unr0.c((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        BoundingBox boundingBox = this.e;
        return c + (boundingBox != null ? boundingBox.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrganizationsInfoContent(page=");
        sb.append(this.a);
        sb.append(", nextPage=");
        sb.append(this.b);
        sb.append(", paginationContext=");
        tse0.x(this.c, ", items=", ", bbox=", sb, this.d);
        sb.append(this.e);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
