package androidx.compose.foundation.layout;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.edi;
import defpackage.g40;
import defpackage.qg3;
import defpackage.xci;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/BoxChildDataElement;", "Ledi;", "Lqg3;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final class BoxChildDataElement extends edi {
    public final g40 a;
    public final boolean b;

    public BoxChildDataElement(g40 g40Var, boolean z) {
        this.a = g40Var;
        this.b = z;
    }

    @Override // defpackage.edi
    public final xci e() {
        qg3 qg3Var = new qg3();
        qg3Var.o = this.a;
        qg3Var.p = this.b;
        return qg3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        return boxChildDataElement != null && Intrinsics.d(this.a, boxChildDataElement.a) && this.b == boxChildDataElement.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        qg3 qg3Var = (qg3) xciVar;
        qg3Var.o = this.a;
        qg3Var.p = this.b;
    }
}
