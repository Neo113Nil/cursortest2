package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final class wl4 {
    public final String a;
    public final FormattedText b;
    public final FormattedText c;
    public final int d;
    public final String e;
    public final Drawable f;
    public final Rect g;
    public final int h;
    public final nbx0 i;
    public final FormattedText j;
    public final kdc k;
    public final q1d l;
    public final boolean m;
    public final kdc n;
    public final kdc o;
    public final Runnable p;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ wl4(String str, FormattedText formattedText, FormattedText formattedText2, int i, String str2, Drawable drawable, Rect rect, nbx0 nbx0Var, FormattedText formattedText3, zj60 zj60Var, bdc bdcVar, bdc bdcVar2, Runnable runnable, int i2) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? FormattedText.c : formattedText, (i2 & 4) != 0 ? FormattedText.c : formattedText2, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : drawable, (i2 & 64) != 0 ? new Rect() : rect, (i2 & 128) != 0 ? 0 : 2, (i2 & 256) != 0 ? vvb1.R : nbx0Var, (i2 & 512) != 0 ? new FormattedText(0) : formattedText3, new bdc(xng0.textMain), (i2 & 2048) != 0 ? null : zj60Var, (i2 & 4096) == 0 ? 1 : 0, (i2 & 16384) != 0 ? null : bdcVar, (32768 & i2) != 0 ? null : bdcVar2, (i2 & 65536) != 0 ? null : runnable);
    }

    public static wl4 a(wl4 wl4Var, FormattedText formattedText, FormattedText formattedText2, Rect rect, nbx0 nbx0Var, FormattedText formattedText3, kdc kdcVar, Runnable runnable, int i) {
        String str = wl4Var.a;
        FormattedText formattedText4 = (i & 2) != 0 ? wl4Var.b : formattedText;
        FormattedText formattedText5 = (i & 4) != 0 ? wl4Var.c : formattedText2;
        return new wl4(str, formattedText4, formattedText5, wl4Var.d, wl4Var.e, wl4Var.f, (i & 64) != 0 ? wl4Var.g : rect, (i & 128) != 0 ? wl4Var.h : 2, (i & 256) != 0 ? wl4Var.i : nbx0Var, (i & 512) != 0 ? wl4Var.j : formattedText3, (i & 1024) != 0 ? wl4Var.k : kdcVar, wl4Var.l, wl4Var.m, wl4Var.n, wl4Var.o, (i & 65536) != 0 ? wl4Var.p : runnable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl4)) {
            return false;
        }
        wl4 wl4Var = (wl4) obj;
        return jl40.l(this.a, wl4Var.a) && jl40.l(this.b, wl4Var.b) && jl40.l(this.c, wl4Var.c) && this.d == wl4Var.d && jl40.l(this.e, wl4Var.e) && jl40.l(this.f, wl4Var.f) && jl40.l(this.g, wl4Var.g) && this.h == wl4Var.h && jl40.l(this.i, wl4Var.i) && jl40.l(this.j, wl4Var.j) && jl40.l(this.k, wl4Var.k) && jl40.l(this.l, wl4Var.l) && this.m == wl4Var.m && jl40.l(this.n, wl4Var.n) && jl40.l(this.o, wl4Var.o) && jl40.l(this.p, wl4Var.p);
    }

    public final int hashCode() {
        int b = oyr.b(this.d, unr0.c(unr0.c(this.a.hashCode() * 31, 31, this.b.a), 31, this.c.a), 31);
        String str = this.e;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Drawable drawable = this.f;
        int d = smw0.d(this.k, unr0.c((this.i.hashCode() + oyr.b(this.h, (this.g.hashCode() + ((hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31)) * 31, 31)) * 31, 31, this.j.a), 31);
        q1d q1dVar = this.l;
        int e = unr0.e(unr0.e((d + (q1dVar == null ? 0 : q1dVar.hashCode())) * 31, 31, this.m), 31, false);
        kdc kdcVar = this.n;
        int hashCode2 = (e + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31;
        kdc kdcVar2 = this.o;
        int hashCode3 = (hashCode2 + (kdcVar2 == null ? 0 : kdcVar2.hashCode())) * 31;
        Runnable runnable = this.p;
        return hashCode3 + (runnable != null ? runnable.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder q = xvz.q("BadgeModel(id=", this.a, ", title=", ", subtitle=", this.b);
        q.append(this.c);
        q.append(", leadIcon=");
        q.append(this.d);
        q.append(", leadIconUrl=");
        q.append(this.e);
        q.append(", leadDrawable=");
        q.append(this.f);
        q.append(", leadIconPadding=");
        q.append(this.g);
        q.append(", trailMode=");
        q.append(this.h);
        q.append(", trail=");
        q.append(this.i);
        q.append(", trailCompanionText=");
        q.append(this.j);
        q.append(", navigationIconColor=");
        q.append(this.k);
        q.append(", titleSubtitleMaxLinesPolicy=");
        q.append(this.l);
        q.append(", isLoading=");
        q.append(this.m);
        q.append(", showProgressAnimation=false, titleTextColor=");
        q.append(this.n);
        q.append(", subtitleTextColor=");
        q.append(this.o);
        q.append(", clickListener=");
        q.append(this.p);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }

    public wl4(String str, FormattedText formattedText, FormattedText formattedText2, int i, String str2, Drawable drawable, Rect rect, int i2, nbx0 nbx0Var, FormattedText formattedText3, kdc kdcVar, q1d q1dVar, boolean z, kdc kdcVar2, kdc kdcVar3, Runnable runnable) {
        this.a = str;
        this.b = formattedText;
        this.c = formattedText2;
        this.d = i;
        this.e = str2;
        this.f = drawable;
        this.g = rect;
        this.h = i2;
        this.i = nbx0Var;
        this.j = formattedText3;
        this.k = kdcVar;
        this.l = q1dVar;
        this.m = z;
        this.n = kdcVar2;
        this.o = kdcVar3;
        this.p = runnable;
    }

    public wl4() {
        this(null, null, null, 0, null, null, null, null, null, null, null, null, null, 131071);
    }
}
