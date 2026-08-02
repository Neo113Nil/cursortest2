package androidx.compose.foundation;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.edi;
import defpackage.fpc;
import defpackage.uoi;
import defpackage.xci;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/FocusableElement;", "Ledi;", "Lfpc;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final class FocusableElement extends edi {
    public final uoi a;

    public FocusableElement(uoi uoiVar) {
        this.a = uoiVar;
    }

    @Override // defpackage.edi
    public final xci e() {
        return new fpc(this.a, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusableElement) {
            return Intrinsics.d(this.a, ((FocusableElement) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        uoi uoiVar = this.a;
        if (uoiVar != null) {
            return uoiVar.hashCode();
        }
        return 0;
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        ((fpc) xciVar).X0(this.a);
    }
}
