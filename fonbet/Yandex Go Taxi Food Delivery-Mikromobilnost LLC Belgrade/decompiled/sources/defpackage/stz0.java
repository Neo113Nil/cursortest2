package defpackage;

import android.widget.ImageView;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.ToolbarView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class stz0 {
    public final Text a;
    public final Text b;
    public final ColorModel c;
    public final rbv d;
    public final Text e;
    public final rtz0 f;
    public final boolean g;
    public final boolean h;
    public final ColorModel i;
    public final ColorModel j;
    public final Text k;
    public final rbv l;
    public final ImageView.ScaleType m;
    public final Text n;
    public final int o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public stz0(Text text, Text text2, ColorModel colorModel, rbv rbvVar, Text.Resource resource, rtz0 rtz0Var, boolean z, ColorModel.Attr attr, ColorModel.Attr attr2, Text text3, rbv rbvVar2, Text.Constant constant, int i) {
        this(text, r6, r7, r8, r9, r10, false, r12, r13, (i & 512) != 0 ? new ColorModel.Attr(ung0.ybColor_textIcon_secondary) : attr2, (i & 1024) != 0 ? null : text3, (i & 2048) != 0 ? null : rbvVar2, (i & 4096) != 0 ? ImageView.ScaleType.FIT_CENTER : r1, (i & 8192) != 0 ? null : constant, 1);
        ColorModel.Attr attr3;
        mtz0 mtz0Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        Text text4 = (i & 2) != 0 ? null : text2;
        ColorModel colorModel2 = (i & 4) != 0 ? null : colorModel;
        rbv rbvVar3 = (i & 8) != 0 ? null : rbvVar;
        Text.Resource resource2 = (i & 16) != 0 ? null : resource;
        rtz0 ntz0Var = (i & 32) != 0 ? new ntz0(0) : rtz0Var;
        boolean z2 = (i & 128) != 0 ? false : z;
        if ((i & 256) != 0) {
            mtz0Var = ToolbarView.Companion;
            mtz0Var.getClass();
            attr3 = new ColorModel.Attr(ung0.ybColor_textIcon_primary);
        } else {
            attr3 = attr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [com.ybsdk.core.utils.ColorModel] */
    /* JADX WARN: Type inference failed for: r3v16, types: [com.ybsdk.core.utils.text.Text] */
    public static stz0 a(stz0 stz0Var, Text text, Text text2, ColorModel colorModel, rbv rbvVar, Text.Resource resource, rtz0 rtz0Var, boolean z, boolean z2, ColorModel colorModel2, ColorModel.Attr attr, int i, int i2) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        Text text3 = (i2 & 1) != 0 ? stz0Var.a : text;
        Text text4 = (i2 & 2) != 0 ? stz0Var.b : text2;
        ColorModel colorModel3 = (i2 & 4) != 0 ? stz0Var.c : colorModel;
        rbv rbvVar2 = (i2 & 8) != 0 ? stz0Var.d : rbvVar;
        Text.Resource resource2 = (i2 & 16) != 0 ? stz0Var.e : resource;
        rtz0 rtz0Var2 = (i2 & 32) != 0 ? stz0Var.f : rtz0Var;
        boolean z3 = (i2 & 64) != 0 ? stz0Var.g : z;
        boolean z4 = (i2 & 128) != 0 ? stz0Var.h : z2;
        ColorModel colorModel4 = (i2 & 256) != 0 ? stz0Var.i : colorModel2;
        ColorModel.Attr attr2 = (i2 & 512) != 0 ? stz0Var.j : attr;
        Text text5 = stz0Var.k;
        rbv rbvVar3 = stz0Var.l;
        if ((i2 & 4096) != 0) {
            scaleType = stz0Var.m;
        }
        ImageView.ScaleType scaleType2 = scaleType;
        Text text6 = stz0Var.n;
        int i3 = (i2 & 16384) != 0 ? stz0Var.o : i;
        stz0Var.getClass();
        return new stz0(text3, text4, colorModel3, rbvVar2, resource2, rtz0Var2, z3, z4, colorModel4, attr2, text5, rbvVar3, scaleType2, text6, i3);
    }

    public final rtz0 b() {
        return this.f;
    }

    public final Text c() {
        return this.b;
    }

    public final Text d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof stz0)) {
            return false;
        }
        stz0 stz0Var = (stz0) obj;
        return jl40.l(this.a, stz0Var.a) && jl40.l(this.b, stz0Var.b) && jl40.l(this.c, stz0Var.c) && jl40.l(this.d, stz0Var.d) && jl40.l(this.e, stz0Var.e) && jl40.l(this.f, stz0Var.f) && this.g == stz0Var.g && this.h == stz0Var.h && jl40.l(this.i, stz0Var.i) && jl40.l(this.j, stz0Var.j) && jl40.l(this.k, stz0Var.k) && jl40.l(this.l, stz0Var.l) && this.m == stz0Var.m && jl40.l(this.n, stz0Var.n) && this.o == stz0Var.o;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Text text = this.b;
        int hashCode2 = (hashCode + (text == null ? 0 : text.hashCode())) * 31;
        ColorModel colorModel = this.c;
        int hashCode3 = (hashCode2 + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
        rbv rbvVar = this.d;
        int hashCode4 = (hashCode3 + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31;
        Text text2 = this.e;
        int d = vfc.d(this.j, vfc.d(this.i, unr0.e(unr0.e((this.f.hashCode() + ((hashCode4 + (text2 == null ? 0 : text2.hashCode())) * 31)) * 31, 31, this.g), 31, this.h), 31), 31);
        Text text3 = this.k;
        int hashCode5 = (d + (text3 == null ? 0 : text3.hashCode())) * 31;
        rbv rbvVar2 = this.l;
        int hashCode6 = (this.m.hashCode() + ((hashCode5 + (rbvVar2 == null ? 0 : rbvVar2.hashCode())) * 31)) * 31;
        Text text4 = this.n;
        return Integer.hashCode(this.o) + ((hashCode6 + (text4 != null ? text4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder p = n.p("State(title=", this.a, ", subtitle=", this.b, ", backgroundColor=");
        p.append(this.c);
        p.append(", leftImage=");
        p.append(this.d);
        p.append(", imageContentDescription=");
        p.append(this.e);
        p.append(", rightPart=");
        p.append(this.f);
        p.append(", animateChanges=");
        nnm.v(", transparentBackground=", ", titleColor=", p, this.g, this.h);
        smw0.z(p, this.i, ", subtitleColor=", this.j, ", amount=");
        p.append(this.k);
        p.append(", leftSubtitleIcon=");
        p.append(this.l);
        p.append(", leftImageScaleType=");
        p.append(this.m);
        p.append(", rightImageContentDescription=");
        p.append(this.n);
        p.append(", titleMaxLines=");
        return oyr.m(this.o, Extension.C_BRAKE, p);
    }

    public stz0(Text text, Text text2, ColorModel colorModel, rbv rbvVar, Text text3, rtz0 rtz0Var, boolean z, boolean z2, ColorModel colorModel2, ColorModel colorModel3, Text text4, rbv rbvVar2, ImageView.ScaleType scaleType, Text text5, int i) {
        this.a = text;
        this.b = text2;
        this.c = colorModel;
        this.d = rbvVar;
        this.e = text3;
        this.f = rtz0Var;
        this.g = z;
        this.h = z2;
        this.i = colorModel2;
        this.j = colorModel3;
        this.k = text4;
        this.l = rbvVar2;
        this.m = scaleType;
        this.n = text5;
        this.o = i;
    }
}
