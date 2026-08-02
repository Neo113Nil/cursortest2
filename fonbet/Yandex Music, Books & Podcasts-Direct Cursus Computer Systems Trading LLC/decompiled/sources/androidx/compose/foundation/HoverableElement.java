package androidx.compose.foundation;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.edi;
import defpackage.p4e;
import defpackage.uoi;
import defpackage.xci;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/HoverableElement;", "Ledi;", "Lp4e;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final class HoverableElement extends edi {
    public final uoi a;

    public HoverableElement(uoi uoiVar) {
        this.a = uoiVar;
    }

    @Override // defpackage.edi
    public final xci e() {
        p4e p4eVar = new p4e();
        p4eVar.o = this.a;
        return p4eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && Intrinsics.d(((HoverableElement) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        p4e p4eVar = (p4e) xciVar;
        uoi uoiVar = p4eVar.o;
        uoi uoiVar2 = this.a;
        if (Intrinsics.d(uoiVar, uoiVar2)) {
            return;
        }
        p4eVar.U0();
        p4eVar.o = uoiVar2;
    }
}
