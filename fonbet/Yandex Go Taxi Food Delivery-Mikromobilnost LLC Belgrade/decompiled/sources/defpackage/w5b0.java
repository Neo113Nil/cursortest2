package defpackage;

import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class w5b0 implements ga5 {
    public final String a;
    public final ea5 b;
    public final tbu c;
    public final sp8 d;
    public final boolean e;
    public final ProductMode$Taxi.SectionType f;
    public final ArrayList g;
    public final dl4 h;
    public final rl4 i;
    public final gl4 j;
    public final hl4 k;

    public w5b0(String str, ea5 ea5Var, tbu tbuVar, sp8 sp8Var, boolean z, ProductMode$Taxi.SectionType sectionType) {
        this.a = str;
        this.b = ea5Var;
        this.c = tbuVar;
        this.d = sp8Var;
        this.e = z;
        this.f = sectionType;
        List list = ea5Var.l;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            xl4 xl4Var = (xl4) obj;
            if ((xl4Var instanceof fl4) || (xl4Var instanceof cl4)) {
                arrayList.add(obj);
            }
        }
        this.g = arrayList;
        List list2 = this.b.l;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (obj2 instanceof dl4) {
                arrayList2.add(obj2);
            }
        }
        this.h = (dl4) a.R(arrayList2);
        List list3 = this.b.l;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list3) {
            if (obj3 instanceof rl4) {
                arrayList3.add(obj3);
            }
        }
        this.i = (rl4) a.R(arrayList3);
        List list4 = this.b.l;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list4) {
            if (obj4 instanceof gl4) {
                arrayList4.add(obj4);
            }
        }
        this.j = (gl4) a.R(arrayList4);
        List list5 = this.b.l;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj5 : list5) {
            if (obj5 instanceof hl4) {
                arrayList5.add(obj5);
            }
        }
        this.k = (hl4) a.R(arrayList5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5b0)) {
            return false;
        }
        w5b0 w5b0Var = (w5b0) obj;
        return jl40.l(this.a, w5b0Var.a) && jl40.l(this.b, w5b0Var.b) && jl40.l(this.c, w5b0Var.c) && jl40.l(this.d, w5b0Var.d) && this.e == w5b0Var.e && this.f == w5b0Var.f;
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
        int e = unr0.e((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e);
        ProductMode$Taxi.SectionType sectionType = this.f;
        return e + (sectionType == null ? 0 : sectionType.hashCode());
    }

    @Override // defpackage.ga5
    public final ga5 r(boolean z, ProductMode$Taxi.SectionType sectionType) {
        return new w5b0(this.a, this.b, this.c, this.d, z, sectionType);
    }

    @Override // defpackage.ga5
    public final boolean t() {
        return this.e;
    }

    public final String toString() {
        return "PersonalShortcutModel(id=" + this.a + ", base=" + this.b + ", service=" + this.c + ", cardType=" + this.d + ", useNavWidth=" + this.e + ", sectionType=" + this.f + Extension.C_BRAKE;
    }

    public final tbu v() {
        return this.c;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ w5b0(String str, ea5 ea5Var, tbu tbuVar, int i) {
        this(str, ea5Var, tbuVar, r11, false, null);
        sp8 sp8Var;
        if ((i & 8) != 0) {
            sp8Var = op8.a;
        } else {
            sp8Var = pp8.a;
        }
    }
}
