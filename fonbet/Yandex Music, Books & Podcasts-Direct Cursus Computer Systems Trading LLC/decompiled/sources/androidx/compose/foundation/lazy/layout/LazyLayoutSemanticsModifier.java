package androidx.compose.foundation.lazy.layout;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.bxj;
import defpackage.edi;
import defpackage.k5r;
import defpackage.luf;
import defpackage.neg;
import defpackage.puf;
import defpackage.xci;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;", "Ledi;", "Lpuf;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final class LazyLayoutSemanticsModifier extends edi {
    public final Function0 a;
    public final luf b;
    public final bxj c;
    public final boolean d;
    public final boolean e;

    public LazyLayoutSemanticsModifier(Function0 function0, luf lufVar, bxj bxjVar, boolean z, boolean z2) {
        this.a = function0;
        this.b = lufVar;
        this.c = bxjVar;
        this.d = z;
        this.e = z2;
    }

    @Override // defpackage.edi
    public final xci e() {
        return new puf(this.a, this.b, this.c, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.a == lazyLayoutSemanticsModifier.a && Intrinsics.d(this.b, lazyLayoutSemanticsModifier.b) && this.c == lazyLayoutSemanticsModifier.c && this.d == lazyLayoutSemanticsModifier.d && this.e == lazyLayoutSemanticsModifier.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + k5r.e((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        puf pufVar = (puf) xciVar;
        pufVar.o = this.a;
        pufVar.p = this.b;
        bxj bxjVar = pufVar.q;
        bxj bxjVar2 = this.c;
        if (bxjVar != bxjVar2) {
            pufVar.q = bxjVar2;
            neg.w(pufVar);
        }
        boolean z = pufVar.r;
        boolean z2 = this.d;
        boolean z3 = this.e;
        if (z == z2 && pufVar.s == z3) {
            return;
        }
        pufVar.r = z2;
        pufVar.s = z3;
        pufVar.S0();
        neg.w(pufVar);
    }
}
