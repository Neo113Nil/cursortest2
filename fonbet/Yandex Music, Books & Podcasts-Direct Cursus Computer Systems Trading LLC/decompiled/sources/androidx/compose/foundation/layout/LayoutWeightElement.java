package androidx.compose.foundation.layout;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.edi;
import defpackage.wqf;
import defpackage.xci;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/LayoutWeightElement;", "Ledi;", "Lwqf;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public final class LayoutWeightElement extends edi {
    public final float a;
    public final boolean b;

    public LayoutWeightElement(boolean z, float f) {
        this.a = f;
        this.b = z;
    }

    @Override // defpackage.edi
    public final xci e() {
        wqf wqfVar = new wqf();
        wqfVar.o = this.a;
        wqfVar.p = this.b;
        return wqfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        return layoutWeightElement != null && this.a == layoutWeightElement.a && this.b == layoutWeightElement.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        wqf wqfVar = (wqf) xciVar;
        wqfVar.o = this.a;
        wqfVar.p = this.b;
    }
}
