package androidx.compose.ui.graphics;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.bcx;
import defpackage.edi;
import defpackage.f8j;
import defpackage.xci;
import defpackage.y43;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;", "Ledi;", "Ly43;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final /* data */ class BlockGraphicsLayerElement extends edi {
    public final Function1 a;

    public BlockGraphicsLayerElement(Function1 function1) {
        this.a = function1;
    }

    @Override // defpackage.edi
    public final xci e() {
        return new y43(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && Intrinsics.d(this.a, ((BlockGraphicsLayerElement) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        y43 y43Var = (y43) xciVar;
        y43Var.o = this.a;
        f8j f8jVar = bcx.D(y43Var, 2).m;
        if (f8jVar != null) {
            f8jVar.x1(true, y43Var.o);
        }
    }

    public final String toString() {
        return "BlockGraphicsLayerElement(block=" + this.a + ')';
    }
}
