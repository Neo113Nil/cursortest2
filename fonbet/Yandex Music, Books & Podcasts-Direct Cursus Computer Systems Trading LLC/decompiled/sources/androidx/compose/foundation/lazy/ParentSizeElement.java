package androidx.compose.foundation.lazy;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.c7k;
import defpackage.edi;
import defpackage.sdr;
import defpackage.u6k;
import defpackage.xci;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/ParentSizeElement;", "Ledi;", "Lc7k;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final class ParentSizeElement extends edi {
    public final sdr a;
    public final sdr b;

    public ParentSizeElement(u6k u6kVar, u6k u6kVar2) {
        this.a = u6kVar;
        this.b = u6kVar2;
    }

    @Override // defpackage.edi
    public final xci e() {
        c7k c7kVar = new c7k();
        c7kVar.o = 1.0f;
        c7kVar.p = this.a;
        c7kVar.q = this.b;
        return c7kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentSizeElement)) {
            return false;
        }
        ParentSizeElement parentSizeElement = (ParentSizeElement) obj;
        return Intrinsics.d(this.a, parentSizeElement.a) && Intrinsics.d(this.b, parentSizeElement.b);
    }

    public final int hashCode() {
        sdr sdrVar = this.a;
        int hashCode = (sdrVar != null ? sdrVar.hashCode() : 0) * 31;
        sdr sdrVar2 = this.b;
        return Float.hashCode(1.0f) + ((hashCode + (sdrVar2 != null ? sdrVar2.hashCode() : 0)) * 31);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        c7k c7kVar = (c7k) xciVar;
        c7kVar.o = 1.0f;
        c7kVar.p = this.a;
        c7kVar.q = this.b;
    }
}
