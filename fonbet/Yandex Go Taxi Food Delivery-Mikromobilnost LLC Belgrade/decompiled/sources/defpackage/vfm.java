package defpackage;

import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class vfm implements ga5 {
    public final String a;
    public final ea5 b;
    public final boolean c;
    public final ProductMode$Taxi.SectionType d;
    public final il4 e;

    public vfm(String str, ea5 ea5Var, boolean z, ProductMode$Taxi.SectionType sectionType) {
        Object obj;
        this.a = str;
        this.b = ea5Var;
        this.c = z;
        this.d = sectionType;
        Iterator it = ea5Var.l.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((xl4) obj) instanceof il4) {
                    break;
                }
            }
        }
        xl4 xl4Var = (xl4) obj;
        this.e = xl4Var != null ? (il4) xl4Var : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfm)) {
            return false;
        }
        vfm vfmVar = (vfm) obj;
        return jl40.l(this.a, vfmVar.a) && jl40.l(this.b, vfmVar.b) && this.c == vfmVar.c && this.d == vfmVar.d;
    }

    @Override // defpackage.ga5
    public final ea5 getBase() {
        return this.b;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int e = unr0.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        ProductMode$Taxi.SectionType sectionType = this.d;
        return e + (sectionType == null ? 0 : sectionType.hashCode());
    }

    @Override // defpackage.ga5
    public final ga5 r(boolean z, ProductMode$Taxi.SectionType sectionType) {
        return new vfm(this.a, this.b, z, sectionType);
    }

    @Override // defpackage.ga5
    public final boolean t() {
        return this.c;
    }

    public final String toString() {
        return "DriveShortcutModel(id=" + this.a + ", base=" + this.b + ", useNavWidth=" + this.c + ", sectionType=" + this.d + Extension.C_BRAKE;
    }

    public final nl4 v() {
        List list = this.b.l;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof nl4) {
                arrayList.add(obj);
            }
        }
        return (nl4) a.R(arrayList);
    }
}
