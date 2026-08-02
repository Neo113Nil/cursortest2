package androidx.compose.foundation.lazy.layout;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.bxj;
import defpackage.edi;
import defpackage.gtf;
import defpackage.htf;
import defpackage.k5r;
import defpackage.oxa;
import defpackage.xci;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierElement;", "Ledi;", "Lgtf;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final class LazyLayoutBeyondBoundsModifierElement extends edi {
    public final htf a;
    public final oxa b;
    public final boolean c;
    public final bxj d;

    public LazyLayoutBeyondBoundsModifierElement(htf htfVar, oxa oxaVar, boolean z, bxj bxjVar) {
        this.a = htfVar;
        this.b = oxaVar;
        this.c = z;
        this.d = bxjVar;
    }

    @Override // defpackage.edi
    public final xci e() {
        gtf gtfVar = new gtf();
        gtfVar.o = this.a;
        gtfVar.p = this.b;
        gtfVar.q = this.c;
        gtfVar.r = this.d;
        return gtfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutBeyondBoundsModifierElement)) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierElement lazyLayoutBeyondBoundsModifierElement = (LazyLayoutBeyondBoundsModifierElement) obj;
        return Intrinsics.d(this.a, lazyLayoutBeyondBoundsModifierElement.a) && Intrinsics.d(this.b, lazyLayoutBeyondBoundsModifierElement.b) && this.c == lazyLayoutBeyondBoundsModifierElement.c && this.d == lazyLayoutBeyondBoundsModifierElement.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + k5r.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        gtf gtfVar = (gtf) xciVar;
        gtfVar.o = this.a;
        gtfVar.p = this.b;
        gtfVar.q = this.c;
        gtfVar.r = this.d;
    }
}
