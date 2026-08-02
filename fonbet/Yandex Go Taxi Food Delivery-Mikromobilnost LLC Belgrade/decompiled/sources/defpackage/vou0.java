package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.widgets.common.ImageScaleTypeEntity;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class vou0 extends wou0 {
    public final String c;
    public final mrc d;
    public final mrc e;
    public final ColorModel f;
    public final List g;
    public final rbv h;
    public final List i;
    public final zz6 j;
    public final int k;
    public final uou0 l;
    public final ImageScaleTypeEntity m;
    public final oe1 n;

    public vou0(String str, mrc mrcVar, mrc mrcVar2, ColorModel colorModel, ArrayList arrayList, rbv rbvVar, List list, zz6 zz6Var, int i, uou0 uou0Var, ImageScaleTypeEntity imageScaleTypeEntity, oe1 oe1Var) {
        super(str, arrayList == null ? scc.h(colorModel) : arrayList);
        this.c = str;
        this.d = mrcVar;
        this.e = mrcVar2;
        this.f = colorModel;
        this.g = arrayList;
        this.h = rbvVar;
        this.i = list;
        this.j = zz6Var;
        this.k = i;
        this.l = uou0Var;
        this.m = imageScaleTypeEntity;
        this.n = oe1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vou0)) {
            return false;
        }
        vou0 vou0Var = (vou0) obj;
        return jl40.l(this.c, vou0Var.c) && jl40.l(this.d, vou0Var.d) && jl40.l(this.e, vou0Var.e) && jl40.l(this.f, vou0Var.f) && jl40.l(this.g, vou0Var.g) && jl40.l(this.h, vou0Var.h) && jl40.l(this.i, vou0Var.i) && jl40.l(this.j, vou0Var.j) && this.k == vou0Var.k && jl40.l(this.l, vou0Var.l) && this.m == vou0Var.m && jl40.l(this.n, vou0Var.n);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        mrc mrcVar = this.d;
        int hashCode2 = (hashCode + (mrcVar == null ? 0 : mrcVar.hashCode())) * 31;
        mrc mrcVar2 = this.e;
        int hashCode3 = (hashCode2 + (mrcVar2 == null ? 0 : mrcVar2.hashCode())) * 31;
        ColorModel colorModel = this.f;
        int hashCode4 = (hashCode3 + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
        List list = this.g;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        rbv rbvVar = this.h;
        int hashCode6 = (hashCode5 + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31;
        List list2 = this.i;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        zz6 zz6Var = this.j;
        int b = oyr.b(this.k, (hashCode7 + (zz6Var == null ? 0 : zz6Var.hashCode())) * 31, 31);
        uou0 uou0Var = this.l;
        int hashCode8 = (this.m.hashCode() + ((b + (uou0Var == null ? 0 : uou0Var.hashCode())) * 31)) * 31;
        oe1 oe1Var = this.n;
        return hashCode8 + (oe1Var != null ? oe1Var.hashCode() : 0);
    }

    public final String toString() {
        return "FullScreenItemEntity(id=" + this.c + ", title=" + this.d + ", subtitle=" + this.e + ", backgroundColor=" + this.f + ", gradientBackground=" + this.g + ", backgroundImageEntity=" + this.h + ", bullets=" + this.i + ", buttonGroup=" + this.j + ", maxProgressValueMs=" + this.k + ", videoSettings=" + this.l + ", imageScaleTypeEntity=" + this.m + ", advertisementDisclosure=" + this.n + Extension.C_BRAKE;
    }
}
