package androidx.compose.foundation.layout;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.edi;
import defpackage.hxe;
import defpackage.kxe;
import defpackage.xci;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicWidthElement;", "Ledi;", "Lkxe;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final class IntrinsicWidthElement extends edi {
    public final hxe a;

    public IntrinsicWidthElement(hxe hxeVar) {
        this.a = hxeVar;
    }

    @Override // defpackage.edi
    public final xci e() {
        kxe kxeVar = new kxe(0);
        kxeVar.p = this.a;
        kxeVar.q = true;
        return kxeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicWidthElement intrinsicWidthElement = obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null;
        return intrinsicWidthElement != null && this.a == intrinsicWidthElement.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        kxe kxeVar = (kxe) xciVar;
        kxeVar.p = this.a;
        kxeVar.q = true;
    }
}
