package androidx.compose.foundation.relocation;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.edi;
import defpackage.lh3;
import defpackage.mh3;
import defpackage.xci;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;", "Ledi;", "Lmh3;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final class BringIntoViewRequesterElement extends edi {
    public final lh3 a;

    public BringIntoViewRequesterElement(lh3 lh3Var) {
        this.a = lh3Var;
    }

    @Override // defpackage.edi
    public final xci e() {
        mh3 mh3Var = new mh3();
        mh3Var.o = this.a;
        return mh3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BringIntoViewRequesterElement) {
            return Intrinsics.d(this.a, ((BringIntoViewRequesterElement) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        mh3 mh3Var = (mh3) xciVar;
        lh3 lh3Var = mh3Var.o;
        if (lh3Var != null) {
            lh3Var.a.l(mh3Var);
        }
        lh3 lh3Var2 = this.a;
        if (lh3Var2 != null) {
            lh3Var2.a.d(mh3Var);
        }
        mh3Var.o = lh3Var2;
    }
}
