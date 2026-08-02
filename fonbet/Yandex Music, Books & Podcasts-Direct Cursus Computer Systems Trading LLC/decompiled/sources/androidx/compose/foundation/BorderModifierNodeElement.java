package androidx.compose.foundation;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.ai3;
import defpackage.cd3;
import defpackage.cma;
import defpackage.dup;
import defpackage.edi;
import defpackage.lp3;
import defpackage.vz1;
import defpackage.xci;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/BorderModifierNodeElement;", "Ledi;", "Lcd3;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public final /* data */ class BorderModifierNodeElement extends edi {
    public final float a;
    public final ai3 b;
    public final dup c;

    public BorderModifierNodeElement(float f, ai3 ai3Var, dup dupVar) {
        this.a = f;
        this.b = ai3Var;
        this.c = dupVar;
    }

    @Override // defpackage.edi
    public final xci e() {
        return new cd3(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return cma.a(this.a, borderModifierNodeElement.a) && this.b.equals(borderModifierNodeElement.b) && Intrinsics.d(this.c, borderModifierNodeElement.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        cd3 cd3Var = (cd3) xciVar;
        float f = cd3Var.r;
        lp3 lp3Var = cd3Var.u;
        float f2 = this.a;
        if (!cma.a(f, f2)) {
            cd3Var.r = f2;
            lp3Var.S0();
        }
        ai3 ai3Var = cd3Var.s;
        ai3 ai3Var2 = this.b;
        if (!Intrinsics.d(ai3Var, ai3Var2)) {
            cd3Var.s = ai3Var2;
            lp3Var.S0();
        }
        dup dupVar = cd3Var.t;
        dup dupVar2 = this.c;
        if (Intrinsics.d(dupVar, dupVar2)) {
            return;
        }
        cd3Var.t = dupVar2;
        lp3Var.S0();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BorderModifierNodeElement(width=");
        vz1.z(this.a, ", brush=", sb);
        sb.append(this.b);
        sb.append(", shape=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
}
