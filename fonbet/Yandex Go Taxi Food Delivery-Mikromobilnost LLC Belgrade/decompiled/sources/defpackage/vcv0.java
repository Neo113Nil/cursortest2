package defpackage;

import java.util.ArrayList;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class vcv0 {
    public final ArrayList a;
    public final ArrayList b;
    public final String c;
    public final MapBuilder d;

    public vcv0(String str, ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = str;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("all_options", arrayList);
        mapBuilder.put("disabled_options", arrayList2);
        if (str != null) {
            mapBuilder.put("selected_option", str);
        }
        this.d = mapBuilder.j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vcv0)) {
            return false;
        }
        vcv0 vcv0Var = (vcv0) obj;
        return this.a.equals(vcv0Var.a) && this.b.equals(vcv0Var.b) && jl40.l(this.c, vcv0Var.c);
    }

    public final int hashCode() {
        int b = ly3.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SectionItem(allOptions=");
        sb.append(this.a);
        sb.append(", disabledOptions=");
        sb.append(this.b);
        sb.append(", selectedOption=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
