package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class yeu extends View {
    public static final c28 k = new c28(3);
    public final View a;
    public final pu3 b;
    public final ou3 c;
    public boolean d;
    public Outline e;
    public boolean f;
    public jx7 g;
    public xof h;
    public Function1 i;
    public xod j;

    public yeu(@NotNull View view, @NotNull pu3 pu3Var, @NotNull ou3 ou3Var) {
        super(view.getContext());
        this.a = view;
        this.b = pu3Var;
        this.c = ou3Var;
        setOutlineProvider(k);
        this.f = true;
        this.g = xv7.k;
        this.h = xof.a;
        yod.a.getClass();
        this.i = lhb.J;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        pu3 pu3Var = this.b;
        ud0 ud0Var = pu3Var.a;
        Canvas canvas2 = ud0Var.a;
        ud0Var.a = canvas;
        jx7 jx7Var = this.g;
        xof xofVar = this.h;
        float width = getWidth();
        float height = getHeight();
        long floatToRawIntBits = (Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        xod xodVar = this.j;
        Function1 function1 = this.i;
        ou3 ou3Var = this.c;
        jx7 y = ou3Var.q0().y();
        xof A = ou3Var.q0().A();
        mu3 s = ou3Var.q0().s();
        long B = ou3Var.q0().B();
        xod xodVar2 = (xod) ou3Var.q0().c;
        nsh q0 = ou3Var.q0();
        q0.O(jx7Var);
        q0.P(xofVar);
        q0.M(ud0Var);
        q0.R(floatToRawIntBits);
        q0.c = xodVar;
        ud0Var.r();
        try {
            function1.invoke(ou3Var);
            ud0Var.k();
            nsh q02 = ou3Var.q0();
            q02.O(y);
            q02.P(A);
            q02.M(s);
            q02.R(B);
            q02.c = xodVar2;
            pu3Var.a.a = canvas2;
            this.d = false;
        } catch (Throwable th) {
            ud0Var.k();
            nsh q03 = ou3Var.q0();
            q03.O(y);
            q03.P(A);
            q03.M(s);
            q03.R(B);
            q03.c = xodVar2;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.f;
    }

    @NotNull
    public final pu3 getCanvasHolder() {
        return this.b;
    }

    @NotNull
    public final View getOwnerView() {
        return this.a;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.d) {
            return;
        }
        this.d = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z) {
        if (this.f != z) {
            this.f = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.d = z;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    public /* synthetic */ yeu(View view, pu3 pu3Var, ou3 ou3Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, (i & 2) != 0 ? new pu3() : pu3Var, (i & 4) != 0 ? new ou3() : ou3Var);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
