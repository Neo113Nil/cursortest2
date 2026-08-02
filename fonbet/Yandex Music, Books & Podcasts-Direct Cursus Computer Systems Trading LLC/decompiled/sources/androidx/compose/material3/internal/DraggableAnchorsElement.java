package androidx.compose.material3.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.bxj;
import defpackage.edi;
import defpackage.ia0;
import defpackage.roa;
import defpackage.xci;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/internal/DraggableAnchorsElement;", "T", "Ledi;", "Lroa;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final class DraggableAnchorsElement<T> extends edi {
    public final ia0 a;
    public final Function2 b;

    public DraggableAnchorsElement(ia0 ia0Var, Function2 function2) {
        bxj bxjVar = bxj.a;
        this.a = ia0Var;
        this.b = function2;
    }

    @Override // defpackage.edi
    public final xci e() {
        bxj bxjVar = bxj.a;
        roa roaVar = new roa();
        roaVar.o = this.a;
        roaVar.p = this.b;
        roaVar.q = bxjVar;
        return roaVar;
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
        roa roaVar = (roa) xciVar;
        roaVar.o = this.a;
        roaVar.p = this.b;
        roaVar.q = bxj.a;
    }
}
