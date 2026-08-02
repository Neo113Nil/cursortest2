package androidx.compose.foundation;

import android.view.View;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.bcx;
import defpackage.cma;
import defpackage.edi;
import defpackage.eta;
import defpackage.fma;
import defpackage.jx7;
import defpackage.k5r;
import defpackage.kg5;
import defpackage.tlm;
import defpackage.uif;
import defpackage.utk;
import defpackage.w4h;
import defpackage.x4h;
import defpackage.xci;
import defpackage.xfp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/MagnifierElement;", "Ledi;", "Lw4h;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public final class MagnifierElement extends edi {
    public final uif a;
    public final uif b;
    public final utk c;

    /* JADX WARN: Multi-variable type inference failed */
    public MagnifierElement(Function1 function1, Function1 function12, utk utkVar) {
        this.a = (uif) function1;
        this.b = (uif) function12;
        this.c = utkVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // defpackage.edi
    public final xci e() {
        return new w4h(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + k5r.e(eta.a(eta.a(tlm.c(9205357640488583168L, k5r.e(eta.a(this.a.hashCode() * 961, Float.NaN, 31), 31, true), 31), Float.NaN, 31), Float.NaN, 31), 31, true)) * 31);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        w4h w4hVar = (w4h) xciVar;
        w4hVar.getClass();
        utk utkVar = w4hVar.q;
        View view = w4hVar.r;
        jx7 jx7Var = w4hVar.s;
        w4hVar.o = this.a;
        w4hVar.p = this.b;
        utk utkVar2 = this.c;
        w4hVar.q = utkVar2;
        View I = kg5.I(w4hVar);
        jx7 jx7Var2 = bcx.F(w4hVar).y;
        if (w4hVar.t != null) {
            xfp xfpVar = x4h.a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) && !utkVar2.c()) || !fma.a(9205357640488583168L, 9205357640488583168L) || !cma.a(Float.NaN, Float.NaN) || !cma.a(Float.NaN, Float.NaN) || !utkVar2.equals(utkVar) || !I.equals(view) || !Intrinsics.d(jx7Var2, jx7Var)) {
                w4hVar.T0();
            }
        }
        w4hVar.U0();
    }
}
