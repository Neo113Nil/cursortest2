package androidx.compose.material;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.bxj;
import defpackage.edi;
import defpackage.ka0;
import defpackage.toa;
import defpackage.xci;
import defpackage.y5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/DraggableAnchorsElement;", "T", "Ledi;", "Ltoa;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final class DraggableAnchorsElement<T> extends edi {
    public final ka0 a;
    public final y5 b;

    public DraggableAnchorsElement(ka0 ka0Var, y5 y5Var) {
        bxj bxjVar = bxj.a;
        this.a = ka0Var;
        this.b = y5Var;
    }

    @Override // defpackage.edi
    public final xci e() {
        bxj bxjVar = bxj.a;
        toa toaVar = new toa();
        toaVar.o = this.a;
        toaVar.p = this.b;
        toaVar.q = bxjVar;
        return toaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
        if (!Intrinsics.d(this.a, draggableAnchorsElement.a) || this.b != draggableAnchorsElement.b) {
            return false;
        }
        bxj bxjVar = bxj.a;
        return true;
    }

    public final int hashCode() {
        return bxj.a.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        toa toaVar = (toa) xciVar;
        toaVar.o = this.a;
        toaVar.p = this.b;
        toaVar.q = bxj.a;
    }
}
