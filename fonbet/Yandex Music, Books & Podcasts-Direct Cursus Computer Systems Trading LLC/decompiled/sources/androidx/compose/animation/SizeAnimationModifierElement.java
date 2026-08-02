package androidx.compose.animation;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.b2c;
import defpackage.edi;
import defpackage.iz2;
import defpackage.qmq;
import defpackage.wdc;
import defpackage.xci;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifierElement;", "Ledi;", "Lqmq;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final /* data */ class SizeAnimationModifierElement extends edi {
    public final wdc a;

    public SizeAnimationModifierElement(wdc wdcVar) {
        this.a = wdcVar;
    }

    @Override // defpackage.edi
    public final xci e() {
        return new qmq(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeAnimationModifierElement) || !Intrinsics.d(this.a, ((SizeAnimationModifierElement) obj).a)) {
            return false;
        }
        iz2 iz2Var = b2c.b;
        return iz2Var.equals(iz2Var);
    }

    public final int hashCode() {
        return (Float.hashCode(-1.0f) + (Float.hashCode(-1.0f) * 31) + (this.a.hashCode() * 31)) * 31;
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        ((qmq) xciVar).p = this.a;
    }

    public final String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.a + ", alignment=" + b2c.b + ", finishedListener=null)";
    }
}
