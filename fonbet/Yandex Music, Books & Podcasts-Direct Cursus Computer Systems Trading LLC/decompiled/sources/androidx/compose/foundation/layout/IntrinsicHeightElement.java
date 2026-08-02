package androidx.compose.foundation.layout;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.edi;
import defpackage.exe;
import defpackage.hxe;
import defpackage.xci;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicHeightElement;", "Ledi;", "Lexe;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final class IntrinsicHeightElement extends edi {
    public final hxe a;

    public IntrinsicHeightElement(hxe hxeVar) {
        this.a = hxeVar;
    }

    @Override // defpackage.edi
    public final xci e() {
        exe exeVar = new exe(0);
        exeVar.p = this.a;
        exeVar.q = true;
        return exeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicHeightElement intrinsicHeightElement = obj instanceof IntrinsicHeightElement ? (IntrinsicHeightElement) obj : null;
        return intrinsicHeightElement != null && this.a == intrinsicHeightElement.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        exe exeVar = (exe) xciVar;
        exeVar.p = this.a;
        exeVar.q = true;
    }
}
