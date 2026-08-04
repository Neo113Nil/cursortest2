package com.gamericefishpro.space.i2;

import com.gamericefishpro.space.MainActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends a {
    public final com.gamericefishpro.space.t0.f1 B;
    public boolean C;

    public a1(MainActivity mainActivity) {
        super(mainActivity);
        this.B = com.gamericefishpro.space.t0.i.v(null);
    }

    @Override // com.gamericefishpro.space.i2.a
    public final void a(com.gamericefishpro.space.t0.r rVar, int i) {
        rVar.b0(420213850);
        int i2 = (rVar.h(this) ? 4 : 2) | i;
        if (rVar.S(i2 & 1, (i2 & 3) != 2)) {
            Function2 function2 = (Function2) this.B.getValue();
            if (function2 == null) {
                rVar.a0(-1238823553);
            } else {
                rVar.a0(98585282);
                function2.invoke(rVar, 0);
            }
            rVar.p(false);
        } else {
            rVar.V();
        }
        com.gamericefishpro.space.t0.p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.g3.e(this, i, 4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return a1.class.getName();
    }

    @Override // com.gamericefishpro.space.i2.a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.C;
    }

    public final void setContent(Function2<? super com.gamericefishpro.space.t0.r, ? super Integer, Unit> function2) {
        this.C = true;
        this.B.setValue(function2);
        if (isAttachedToWindow()) {
            if (this.v == null && !isAttachedToWindow()) {
                throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
            }
            c();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
