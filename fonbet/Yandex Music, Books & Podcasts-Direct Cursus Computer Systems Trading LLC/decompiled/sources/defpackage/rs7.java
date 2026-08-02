package defpackage;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.media3.exoplayer.trackselection.a;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public final class rs7 extends at7 implements Comparable {
    public final int e;
    public final boolean f;
    public final String g;
    public final a h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final int o;
    public final int p;
    public final boolean q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final boolean v;
    public final boolean w;
    public final boolean x;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x013f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0100 A[LOOP:1: B:39:0x00fd->B:41:0x0100, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rs7(int i, xvs xvsVar, int i2, a aVar, int i3, boolean z, qs7 qs7Var, int i4) {
        super(i, xvsVar, i2);
        int i5;
        int i6;
        boolean z2;
        String[] split;
        int i7;
        int i8;
        int i9;
        int i10;
        dsc dscVar;
        boolean z3;
        a aVar2;
        boolean z4;
        u0t u0tVar;
        boolean z5;
        this.h = aVar;
        boolean z6 = aVar.s0;
        yde ydeVar = aVar.t;
        yde ydeVar2 = aVar.p;
        int i11 = z6 ? 24 : 16;
        int i12 = 0;
        this.m = false;
        this.g = ct7.f(this.d.d);
        this.i = at2.o(i3, false);
        int i13 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i13 >= ydeVar2.size()) {
                i6 = 0;
                i13 = Integer.MAX_VALUE;
                break;
            } else {
                i6 = ct7.c(this.d, (String) ydeVar2.get(i13), false);
                if (i6 > 0) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        this.k = i13;
        this.j = i6;
        int i14 = this.d.f;
        int i15 = aVar.q;
        this.l = (i14 == 0 || i14 != i15) ? Integer.bitCount(i14 & i15) : Integer.MAX_VALUE;
        dsc dscVar2 = this.d;
        int i16 = dscVar2.f;
        this.n = i16 == 0 || (i16 & 1) != 0;
        this.q = (dscVar2.e & 1) != 0;
        String str = dscVar2.n;
        if (str != null) {
            switch (str.hashCode()) {
                case -2123537834:
                    if (str.equals("audio/eac3-joc")) {
                        z5 = false;
                        break;
                    }
                    z5 = -1;
                    break;
                case 187078297:
                    if (str.equals("audio/ac4")) {
                        z5 = true;
                        break;
                    }
                    z5 = -1;
                    break;
                case 1504698186:
                    if (str.equals("audio/iamf")) {
                        z5 = 2;
                        break;
                    }
                    z5 = -1;
                    break;
                default:
                    z5 = -1;
                    break;
            }
            switch (z5) {
                case false:
                case true:
                case true:
                    z2 = true;
                    break;
            }
            this.x = z2;
            int i17 = dscVar2.D;
            this.r = i17;
            this.s = dscVar2.E;
            int i18 = dscVar2.j;
            this.t = i18;
            this.f = (i18 != -1 || i18 <= aVar.s) && (i17 == -1 || i17 <= aVar.r) && qs7Var.apply(dscVar2);
            Configuration configuration = Resources.getSystem().getConfiguration();
            split = dvt.a < 24 ? configuration.getLocales().toLanguageTags().split(StringUtils.COMMA, -1) : new String[]{configuration.locale.toLanguageTag()};
            for (i7 = 0; i7 < split.length; i7++) {
                split[i7] = dvt.Z(split[i7]);
            }
            i8 = 0;
            while (true) {
                if (i8 >= split.length) {
                    i9 = ct7.c(this.d, split[i8], false);
                    if (i9 <= 0) {
                        i8++;
                    }
                } else {
                    i9 = 0;
                    i8 = Integer.MAX_VALUE;
                }
            }
            this.o = i8;
            this.p = i9;
            i10 = 0;
            while (true) {
                if (i10 < ydeVar.size()) {
                    String str2 = this.d.n;
                    if (str2 == null || !str2.equals(ydeVar.get(i10))) {
                        i10++;
                    } else {
                        i5 = i10;
                    }
                }
            }
            this.u = i5;
            this.v = (i3 & 384) != 128;
            this.w = (i3 & 64) != 64;
            dscVar = this.d;
            z3 = this.f;
            aVar2 = this.h;
            z4 = aVar2.u0;
            u0tVar = aVar2.u;
            if (at2.o(i3, z4) && ((z3 || aVar2.r0) && (u0tVar.a != 2 || ct7.g(aVar2, i3, dscVar)))) {
                i12 = (at2.o(i3, false) || !z3 || dscVar.j == -1 || aVar2.C || aVar2.B || (!aVar2.v0 && z) || u0tVar.a == 2 || (i11 & i3) == 0) ? 1 : 2;
            }
            this.e = i12;
        }
        z2 = false;
        this.x = z2;
        int i172 = dscVar2.D;
        this.r = i172;
        this.s = dscVar2.E;
        int i182 = dscVar2.j;
        this.t = i182;
        this.f = (i182 != -1 || i182 <= aVar.s) && (i172 == -1 || i172 <= aVar.r) && qs7Var.apply(dscVar2);
        Configuration configuration2 = Resources.getSystem().getConfiguration();
        if (dvt.a < 24) {
        }
        while (i7 < split.length) {
        }
        i8 = 0;
        while (true) {
            if (i8 >= split.length) {
            }
            i8++;
        }
        this.o = i8;
        this.p = i9;
        i10 = 0;
        while (true) {
            if (i10 < ydeVar.size()) {
            }
            i10++;
        }
        this.u = i5;
        this.v = (i3 & 384) != 128;
        this.w = (i3 & 64) != 64;
        dscVar = this.d;
        z3 = this.f;
        aVar2 = this.h;
        z4 = aVar2.u0;
        u0tVar = aVar2.u;
        if (at2.o(i3, z4)) {
            if (at2.o(i3, false)) {
            }
        }
        this.e = i12;
    }

    @Override // defpackage.at7
    public final int a() {
        return this.e;
    }

    @Override // defpackage.at7
    public final boolean b(at7 at7Var) {
        int i;
        String str;
        rs7 rs7Var = (rs7) at7Var;
        dsc dscVar = rs7Var.d;
        this.h.getClass();
        dsc dscVar2 = this.d;
        int i2 = dscVar2.D;
        if (i2 == -1 || i2 != dscVar.D) {
            return false;
        }
        return (this.m || ((str = dscVar2.n) != null && TextUtils.equals(str, dscVar.n))) && (i = dscVar2.E) != -1 && i == dscVar.E && this.v == rs7Var.v && this.w == rs7Var.w;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(rs7 rs7Var) {
        boolean z = this.i;
        boolean z2 = this.f;
        zwj a = (z2 && z) ? ct7.j : ct7.j.a();
        boolean z3 = rs7Var.i;
        int i = rs7Var.t;
        dl5 c = dl5.a.c(z, z3);
        Integer valueOf = Integer.valueOf(this.k);
        Integer valueOf2 = Integer.valueOf(rs7Var.k);
        gdo gdoVar = gdo.a;
        dl5 b = c.b(valueOf, valueOf2, gdoVar).a(this.j, rs7Var.j).a(this.l, rs7Var.l).c(this.q, rs7Var.q).c(this.n, rs7Var.n).b(Integer.valueOf(this.o), Integer.valueOf(rs7Var.o), gdoVar).a(this.p, rs7Var.p).c(z2, rs7Var.f).b(Integer.valueOf(this.u), Integer.valueOf(rs7Var.u), gdoVar);
        boolean z4 = this.h.B;
        int i2 = this.t;
        if (z4) {
            b = b.b(Integer.valueOf(i2), Integer.valueOf(i), ct7.j.a());
        }
        dl5 b2 = b.c(this.v, rs7Var.v).c(this.w, rs7Var.w).c(this.x, rs7Var.x).b(Integer.valueOf(this.r), Integer.valueOf(rs7Var.r), a).b(Integer.valueOf(this.s), Integer.valueOf(rs7Var.s), a);
        if (Objects.equals(this.g, rs7Var.g)) {
            b2 = b2.b(Integer.valueOf(i2), Integer.valueOf(i), a);
        }
        return b2.e();
    }
}
