package androidx.compose.foundation;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.cje;
import defpackage.edi;
import defpackage.gb5;
import defpackage.iur;
import defpackage.k5r;
import defpackage.meo;
import defpackage.neg;
import defpackage.uoi;
import defpackage.xci;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/CombinedClickableElement;", "Ledi;", "Lgb5;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public final class CombinedClickableElement extends edi {
    public final uoi a;
    public final cje b;
    public final boolean c;
    public final String d;
    public final meo e;
    public final Function0 f;
    public final String g;
    public final Function0 h;
    public final Function0 i;

    public CombinedClickableElement(cje cjeVar, uoi uoiVar, meo meoVar, String str, String str2, Function0 function0, Function0 function02, Function0 function03, boolean z) {
        this.a = uoiVar;
        this.b = cjeVar;
        this.c = z;
        this.d = str;
        this.e = meoVar;
        this.f = function0;
        this.g = str2;
        this.h = function02;
        this.i = function03;
    }

    @Override // defpackage.edi
    public final xci e() {
        String str = this.d;
        return new gb5(this.b, this.a, this.e, this.g, str, this.f, this.h, this.i, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return Intrinsics.d(this.a, combinedClickableElement.a) && Intrinsics.d(this.b, combinedClickableElement.b) && this.c == combinedClickableElement.c && Intrinsics.d(this.d, combinedClickableElement.d) && Intrinsics.d(this.e, combinedClickableElement.e) && this.f == combinedClickableElement.f && Intrinsics.d(this.g, combinedClickableElement.g) && this.h == combinedClickableElement.h && this.i == combinedClickableElement.i;
    }

    public final int hashCode() {
        uoi uoiVar = this.a;
        int hashCode = (uoiVar != null ? uoiVar.hashCode() : 0) * 31;
        cje cjeVar = this.b;
        int e = k5r.e((hashCode + (cjeVar != null ? cjeVar.hashCode() : 0)) * 31, 31, this.c);
        String str = this.d;
        int hashCode2 = (e + (str != null ? str.hashCode() : 0)) * 31;
        meo meoVar = this.e;
        int hashCode3 = (this.f.hashCode() + ((hashCode2 + (meoVar != null ? Integer.hashCode(meoVar.a) : 0)) * 31)) * 31;
        String str2 = this.g;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Function0 function0 = this.h;
        int hashCode5 = (hashCode4 + (function0 != null ? function0.hashCode() : 0)) * 31;
        Function0 function02 = this.i;
        return Boolean.hashCode(true) + ((hashCode5 + (function02 != null ? function02.hashCode() : 0)) * 31);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        boolean z;
        iur iurVar;
        gb5 gb5Var = (gb5) xciVar;
        gb5Var.K = true;
        String str = gb5Var.H;
        String str2 = this.g;
        if (!Intrinsics.d(str, str2)) {
            gb5Var.H = str2;
            neg.w(gb5Var);
        }
        boolean z2 = gb5Var.I == null;
        Function0 function0 = this.h;
        if (z2 != (function0 == null)) {
            gb5Var.X0();
            neg.w(gb5Var);
            z = true;
        } else {
            z = false;
        }
        gb5Var.I = function0;
        boolean z3 = gb5Var.J == null;
        Function0 function02 = this.i;
        if (z3 != (function02 == null)) {
            z = true;
        }
        gb5Var.J = function02;
        boolean z4 = gb5Var.u;
        boolean z5 = this.c;
        boolean z6 = z4 == z5 ? z : true;
        gb5Var.c1(this.a, this.b, z5, this.d, this.e, this.f);
        if (!z6 || (iurVar = gb5Var.x) == null) {
            return;
        }
        iurVar.U0();
    }
}
