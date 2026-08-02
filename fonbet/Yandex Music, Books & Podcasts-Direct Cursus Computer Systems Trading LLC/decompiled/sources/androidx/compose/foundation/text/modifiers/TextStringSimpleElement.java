package androidx.compose.foundation.text.modifiers;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.a95;
import defpackage.edi;
import defpackage.ees;
import defpackage.f1d;
import defpackage.ges;
import defpackage.h4a;
import defpackage.k5r;
import defpackage.neg;
import defpackage.ppc;
import defpackage.tlm;
import defpackage.vq1;
import defpackage.w5k;
import defpackage.xci;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;", "Ledi;", "Lees;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public final class TextStringSimpleElement extends edi {
    public final String a;
    public final ges b;
    public final ppc c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;
    public final a95 h;

    public TextStringSimpleElement(String str, ges gesVar, ppc ppcVar, int i, boolean z, int i2, int i3, a95 a95Var) {
        this.a = str;
        this.b = gesVar;
        this.c = ppcVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.h = a95Var;
    }

    @Override // defpackage.edi
    public final xci e() {
        ees eesVar = new ees();
        eesVar.o = this.a;
        eesVar.p = this.b;
        eesVar.q = this.c;
        eesVar.r = this.d;
        eesVar.s = this.e;
        eesVar.t = this.f;
        eesVar.u = this.g;
        eesVar.v = this.h;
        return eesVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return Intrinsics.d(this.h, textStringSimpleElement.h) && Intrinsics.d(this.a, textStringSimpleElement.a) && Intrinsics.d(this.b, textStringSimpleElement.b) && Intrinsics.d(this.c, textStringSimpleElement.c) && this.d == textStringSimpleElement.d && this.e == textStringSimpleElement.e && this.f == textStringSimpleElement.f && this.g == textStringSimpleElement.g;
    }

    public final int hashCode() {
        int e = (((k5r.e(f1d.a(this.d, (this.c.hashCode() + tlm.d(this.b, this.a.hashCode() * 31, 31)) * 31, 31), 31, this.e) + this.f) * 31) + this.g) * 31;
        a95 a95Var = this.h;
        return e + (a95Var != null ? a95Var.hashCode() : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r3.a.b(r0.a) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0071  */
    @Override // defpackage.edi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(xci xciVar) {
        boolean z;
        String str;
        String str2;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        ppc ppcVar;
        ppc ppcVar2;
        int i5;
        int i6;
        ees eesVar = (ees) xciVar;
        a95 a95Var = eesVar.v;
        a95 a95Var2 = this.h;
        boolean d = Intrinsics.d(a95Var2, a95Var);
        eesVar.v = a95Var2;
        boolean z4 = false;
        boolean z5 = true;
        ges gesVar = this.b;
        if (d) {
            ges gesVar2 = eesVar.p;
            if (gesVar == gesVar2) {
                gesVar.getClass();
            }
            z = false;
            str = eesVar.o;
            str2 = this.a;
            if (!Intrinsics.d(str, str2)) {
                eesVar.o = str2;
                eesVar.z = null;
                z4 = true;
            }
            boolean z6 = !eesVar.p.d(gesVar);
            eesVar.p = gesVar;
            i = eesVar.u;
            i2 = this.g;
            if (i != i2) {
                eesVar.u = i2;
                z6 = true;
            }
            i3 = eesVar.t;
            i4 = this.f;
            if (i3 != i4) {
                eesVar.t = i4;
                z6 = true;
            }
            z2 = eesVar.s;
            z3 = this.e;
            if (z2 != z3) {
                eesVar.s = z3;
                z6 = true;
            }
            ppcVar = eesVar.q;
            ppcVar2 = this.c;
            if (!Intrinsics.d(ppcVar, ppcVar2)) {
                eesVar.q = ppcVar2;
                z6 = true;
            }
            i5 = eesVar.r;
            i6 = this.d;
            if (i5 != i6) {
                z5 = z6;
            } else {
                eesVar.r = i6;
            }
            if (!z4 || z5) {
                w5k S0 = eesVar.S0();
                String str3 = eesVar.o;
                ges gesVar3 = eesVar.p;
                ppc ppcVar3 = eesVar.q;
                int i7 = eesVar.r;
                boolean z7 = eesVar.s;
                int i8 = eesVar.t;
                int i9 = eesVar.u;
                S0.a = str3;
                S0.b = gesVar3;
                S0.c = ppcVar3;
                S0.d = i7;
                S0.e = z7;
                S0.f = i8;
                S0.g = i9;
                S0.b();
            }
            if (eesVar.n) {
                return;
            }
            if (z4 || (z && eesVar.y != null)) {
                neg.w(eesVar);
            }
            if (z4 || z5) {
                h4a.z(eesVar);
                vq1.Z(eesVar);
            }
            if (z) {
                vq1.Z(eesVar);
                return;
            }
            return;
        }
        z = true;
        str = eesVar.o;
        str2 = this.a;
        if (!Intrinsics.d(str, str2)) {
        }
        boolean z62 = !eesVar.p.d(gesVar);
        eesVar.p = gesVar;
        i = eesVar.u;
        i2 = this.g;
        if (i != i2) {
        }
        i3 = eesVar.t;
        i4 = this.f;
        if (i3 != i4) {
        }
        z2 = eesVar.s;
        z3 = this.e;
        if (z2 != z3) {
        }
        ppcVar = eesVar.q;
        ppcVar2 = this.c;
        if (!Intrinsics.d(ppcVar, ppcVar2)) {
        }
        i5 = eesVar.r;
        i6 = this.d;
        if (i5 != i6) {
        }
        if (!z4) {
        }
        w5k S02 = eesVar.S0();
        String str32 = eesVar.o;
        ges gesVar32 = eesVar.p;
        ppc ppcVar32 = eesVar.q;
        int i72 = eesVar.r;
        boolean z72 = eesVar.s;
        int i82 = eesVar.t;
        int i92 = eesVar.u;
        S02.a = str32;
        S02.b = gesVar32;
        S02.c = ppcVar32;
        S02.d = i72;
        S02.e = z72;
        S02.f = i82;
        S02.g = i92;
        S02.b();
        if (eesVar.n) {
        }
    }
}
