package androidx.compose.ui.input.nestedscroll;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.cyi;
import defpackage.edi;
import defpackage.gyi;
import defpackage.wxi;
import defpackage.xci;
import defpackage.ypb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;", "Ledi;", "Lgyi;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final class NestedScrollElement extends edi {
    public final wxi a;
    public final cyi b;

    public NestedScrollElement(wxi wxiVar, cyi cyiVar) {
        this.a = wxiVar;
        this.b = cyiVar;
    }

    @Override // defpackage.edi
    public final xci e() {
        return new gyi(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        return Intrinsics.d(nestedScrollElement.a, this.a) && Intrinsics.d(nestedScrollElement.b, this.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        cyi cyiVar = this.b;
        return hashCode + (cyiVar != null ? cyiVar.hashCode() : 0);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        gyi gyiVar = (gyi) xciVar;
        gyiVar.o = this.a;
        cyi cyiVar = gyiVar.p;
        if (cyiVar.a == gyiVar) {
            cyiVar.a = null;
        }
        cyi cyiVar2 = this.b;
        if (cyiVar2 == null) {
            gyiVar.p = new cyi();
        } else if (!cyiVar2.equals(cyiVar)) {
            gyiVar.p = cyiVar2;
        }
        if (gyiVar.n) {
            cyi cyiVar3 = gyiVar.p;
            cyiVar3.a = gyiVar;
            cyiVar3.b = null;
            gyiVar.q = null;
            cyiVar3.c = new ypb(21, gyiVar);
            cyiVar3.d = gyiVar.G0();
        }
    }
}
