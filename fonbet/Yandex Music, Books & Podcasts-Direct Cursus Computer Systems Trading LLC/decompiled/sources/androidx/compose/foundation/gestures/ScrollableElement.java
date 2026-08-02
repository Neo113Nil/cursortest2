package androidx.compose.foundation.gestures;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.bxj;
import defpackage.edi;
import defpackage.k5r;
import defpackage.lxo;
import defpackage.mxo;
import defpackage.uoi;
import defpackage.xci;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableElement;", "Ledi;", "Llxo;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final class ScrollableElement extends edi {
    public final mxo a;
    public final bxj b;
    public final boolean c;
    public final boolean d;
    public final uoi e;

    public ScrollableElement(mxo mxoVar, bxj bxjVar, boolean z, boolean z2, uoi uoiVar) {
        this.a = mxoVar;
        this.b = bxjVar;
        this.c = z;
        this.d = z2;
        this.e = uoiVar;
    }

    @Override // defpackage.edi
    public final xci e() {
        return new lxo(null, null, null, this.e, this.b, this.a, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return Intrinsics.d(this.a, scrollableElement.a) && this.b == scrollableElement.b && this.c == scrollableElement.c && this.d == scrollableElement.d && Intrinsics.d(this.e, scrollableElement.e);
    }

    public final int hashCode() {
        int e = k5r.e(k5r.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 961, 31, this.c), 961, this.d);
        uoi uoiVar = this.e;
        return (e + (uoiVar != null ? uoiVar.hashCode() : 0)) * 31;
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        ((lxo) xciVar).e1(null, null, null, this.e, this.b, this.a, this.c, this.d);
    }
}
