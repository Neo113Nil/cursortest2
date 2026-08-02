package androidx.compose.ui.semantics;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.edi;
import defpackage.gl6;
import defpackage.jfp;
import defpackage.mfp;
import defpackage.xci;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/semantics/AppendedSemanticsElement;", "Ledi;", "Lgl6;", "Lmfp;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public final /* data */ class AppendedSemanticsElement extends edi implements mfp {
    public final boolean a;
    public final Function1 b;

    public AppendedSemanticsElement(boolean z, Function1 function1) {
        this.a = z;
        this.b = function1;
    }

    @Override // defpackage.edi
    public final xci e() {
        return new gl6(this.a, false, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.a == appendedSemanticsElement.a && Intrinsics.d(this.b, appendedSemanticsElement.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    @Override // defpackage.mfp
    public final jfp i() {
        jfp jfpVar = new jfp();
        jfpVar.c = this.a;
        this.b.invoke(jfpVar);
        return jfpVar;
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        gl6 gl6Var = (gl6) xciVar;
        gl6Var.o = this.a;
        gl6Var.q = this.b;
    }

    public final String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.a + ", properties=" + this.b + ')';
    }
}
