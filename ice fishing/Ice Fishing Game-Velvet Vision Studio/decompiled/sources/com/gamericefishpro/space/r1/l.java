package com.gamericefishpro.space.r1;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import com.gamericefishpro.space.g3.p;
import com.gamericefishpro.space.o1.q;
import com.gamericefishpro.space.o1.r;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends View {
    public static final p D = new p(2);
    public com.gamericefishpro.space.c3.l A;
    public Function1 B;
    public b C;
    public final com.gamericefishpro.space.s1.a d;
    public final r e;
    public final com.gamericefishpro.space.q1.b i;
    public boolean v;
    public Outline w;
    public boolean y;
    public com.gamericefishpro.space.c3.c z;

    public l(com.gamericefishpro.space.s1.a aVar, r rVar, com.gamericefishpro.space.q1.b bVar) {
        super(aVar.getContext());
        this.d = aVar;
        this.e = rVar;
        this.i = bVar;
        setOutlineProvider(D);
        this.y = true;
        this.z = com.gamericefishpro.space.q1.c.a;
        this.A = com.gamericefishpro.space.c3.l.d;
        d.a.getClass();
        this.B = a.i;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        r rVar = this.e;
        com.gamericefishpro.space.o1.b bVar = rVar.a;
        Canvas canvas2 = bVar.a;
        bVar.a = canvas;
        com.gamericefishpro.space.c3.c cVar = this.z;
        com.gamericefishpro.space.c3.l lVar = this.A;
        float width = getWidth();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        b bVar2 = this.C;
        Function1 function1 = this.B;
        com.gamericefishpro.space.q1.b bVar3 = this.i;
        com.gamericefishpro.space.a8.c cVar2 = bVar3.e;
        com.gamericefishpro.space.q1.a aVar = ((com.gamericefishpro.space.q1.b) cVar2.v).d;
        com.gamericefishpro.space.c3.c cVar3 = aVar.a;
        com.gamericefishpro.space.c3.l lVar2 = aVar.b;
        q qVarJ = cVar2.j();
        com.gamericefishpro.space.a8.c cVar4 = bVar3.e;
        long jO = cVar4.o();
        b bVar4 = (b) cVar4.i;
        cVar4.E(cVar);
        cVar4.G(lVar);
        cVar4.D(bVar);
        cVar4.H(jFloatToRawIntBits);
        cVar4.i = bVar2;
        bVar.k();
        try {
            function1.invoke(bVar3);
            bVar.i();
            cVar4.E(cVar3);
            cVar4.G(lVar2);
            cVar4.D(qVarJ);
            cVar4.H(jO);
            cVar4.i = bVar4;
            rVar.a.a = canvas2;
            this.v = false;
        } catch (Throwable th) {
            bVar.i();
            cVar4.E(cVar3);
            cVar4.G(lVar2);
            cVar4.D(qVarJ);
            cVar4.H(jO);
            cVar4.i = bVar4;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.y;
    }

    public final r getCanvasHolder() {
        return this.e;
    }

    public final View getOwnerView() {
        return this.d;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.y;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.v) {
            return;
        }
        this.v = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.y != z) {
            this.y = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.v = z;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
