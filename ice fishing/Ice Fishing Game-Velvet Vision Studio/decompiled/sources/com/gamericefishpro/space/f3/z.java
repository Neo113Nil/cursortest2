package com.gamericefishpro.space.f3;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import com.gamericefishpro.space.h2.o1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends j {
    public final View T;
    public final com.gamericefishpro.space.a2.e U;
    public com.gamericefishpro.space.e1.e V;
    public Function1 W;
    public Function1 a0;
    public Function1 b0;

    public z(Context context, Function1 function1, com.gamericefishpro.space.t0.q qVar, com.gamericefishpro.space.e1.f fVar, int i, o1 o1Var) {
        View view = (View) function1.invoke(context);
        com.gamericefishpro.space.a2.e eVar = new com.gamericefishpro.space.a2.e();
        super(context, qVar, i, eVar, view, o1Var);
        this.T = view;
        this.U = eVar;
        setClipChildren(false);
        String strValueOf = String.valueOf(i);
        Object objE = fVar != null ? fVar.e(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objE instanceof SparseArray ? (SparseArray) objE : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (fVar != null) {
            setSavableRegistryEntry(fVar.f(strValueOf, new i(this, 2)));
        }
        c cVar = c.w;
        this.W = cVar;
        this.a0 = cVar;
        this.b0 = cVar;
    }

    public static final void n(z zVar) {
        zVar.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(com.gamericefishpro.space.e1.e eVar) {
        com.gamericefishpro.space.e1.e eVar2 = this.V;
        if (eVar2 != null) {
            ((com.gamericefishpro.space.a8.c) eVar2).J();
        }
        this.V = eVar;
    }

    public final com.gamericefishpro.space.a2.e getDispatcher() {
        return this.U;
    }

    public final Function1<View, Unit> getReleaseBlock() {
        return this.b0;
    }

    public final Function1<View, Unit> getResetBlock() {
        return this.a0;
    }

    public /* bridge */ /* synthetic */ com.gamericefishpro.space.i2.a getSubCompositionView() {
        return null;
    }

    public final Function1<View, Unit> getUpdateBlock() {
        return this.W;
    }

    public final void setReleaseBlock(Function1<View, Unit> function1) {
        this.b0 = function1;
        setRelease(new i(this, 3));
    }

    public final void setResetBlock(Function1<View, Unit> function1) {
        this.a0 = function1;
        setReset(new i(this, 4));
    }

    public final void setUpdateBlock(Function1<View, Unit> function1) {
        this.W = function1;
        setUpdate(new i(this, 5));
    }

    public View getViewRoot() {
        return this;
    }
}
