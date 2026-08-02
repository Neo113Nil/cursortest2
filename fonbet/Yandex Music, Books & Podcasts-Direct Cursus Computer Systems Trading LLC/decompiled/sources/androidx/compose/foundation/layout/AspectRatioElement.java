package androidx.compose.foundation.layout;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.edi;
import defpackage.qme;
import defpackage.qq1;
import defpackage.xci;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioElement;", "Ledi;", "Lqq1;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final class AspectRatioElement extends edi {
    public final float a;

    public AspectRatioElement(float f) {
        this.a = f;
        if (f > 0.0f) {
            return;
        }
        qme.a("aspectRatio " + f + " must be > 0");
    }

    @Override // defpackage.edi
    public final xci e() {
        qq1 qq1Var = new qq1();
        qq1Var.o = this.a;
        return qq1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AspectRatioElement aspectRatioElement = obj instanceof AspectRatioElement ? (AspectRatioElement) obj : null;
        if (aspectRatioElement == null || this.a != aspectRatioElement.a) {
            return false;
        }
        ((AspectRatioElement) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Float.hashCode(this.a) * 31);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        ((qq1) xciVar).o = this.a;
    }
}
