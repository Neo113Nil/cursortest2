package androidx.compose.foundation;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.edi;
import defpackage.k5r;
import defpackage.pwo;
import defpackage.two;
import defpackage.xci;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ScrollingLayoutElement;", "Ledi;", "Lpwo;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public final class ScrollingLayoutElement extends edi {
    public final two a;
    public final boolean b;

    public ScrollingLayoutElement(two twoVar, boolean z) {
        this.a = twoVar;
        this.b = z;
    }

    @Override // defpackage.edi
    public final xci e() {
        pwo pwoVar = new pwo();
        pwoVar.o = this.a;
        pwoVar.p = this.b;
        return pwoVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return Intrinsics.d(this.a, scrollingLayoutElement.a) && this.b == scrollingLayoutElement.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + k5r.e(this.a.hashCode() * 31, 31, false);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        pwo pwoVar = (pwo) xciVar;
        pwoVar.o = this.a;
        pwoVar.p = this.b;
    }
}
