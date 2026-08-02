package androidx.compose.foundation.lazy.layout;

import defpackage.bxj;
import defpackage.htf;
import defpackage.luf;
import defpackage.oxa;
import defpackage.p9f;
import defpackage.yci;

/* loaded from: classes.dex */
public abstract class a {
    public static final yci a(htf htfVar, oxa oxaVar, boolean z, bxj bxjVar) {
        return new LazyLayoutBeyondBoundsModifierElement(htfVar, oxaVar, z, bxjVar);
    }

    public static final yci b(yci yciVar, p9f p9fVar, luf lufVar, bxj bxjVar, boolean z, boolean z2) {
        return yciVar.f(new LazyLayoutSemanticsModifier(p9fVar, lufVar, bxjVar, z, z2));
    }
}
