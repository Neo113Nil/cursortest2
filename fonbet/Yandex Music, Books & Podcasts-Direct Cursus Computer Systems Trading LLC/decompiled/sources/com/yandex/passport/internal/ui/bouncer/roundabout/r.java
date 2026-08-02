package com.yandex.passport.internal.ui.bouncer.roundabout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.passport.R;
import defpackage.asa;
import defpackage.at5;
import defpackage.bsa;
import defpackage.csa;
import defpackage.dfi;
import defpackage.fxf;
import defpackage.g4i;
import defpackage.gn0;
import defpackage.hrg;
import defpackage.o57;
import defpackage.ro6;
import defpackage.vz1;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r extends ViewGroup {
    public final BitmapDrawable a;
    public final Paint b;
    public final Rect c;
    public final int d;
    public final int e;
    public int f;
    public Path g;
    public asa h;
    public final int i;

    public r(Context context) {
        super(context);
        Drawable a = com.yandex.passport.common.resources.c.a(com.yandex.plus.pay.ui.core.b.u(), R.drawable.passport_background_main);
        BitmapDrawable bitmapDrawable = a instanceof BitmapDrawable ? (BitmapDrawable) a : null;
        if (bitmapDrawable == null) {
            xq0.q("Not a bitmap drawable");
            throw null;
        }
        this.a = bitmapDrawable;
        this.b = new Paint(3);
        this.c = new Rect();
        float f = g4i.a.density;
        this.d = (int) (32 * f);
        this.e = (int) (8 * f);
        this.f = -1;
        this.i = a0.v;
    }

    public static Path a(float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        Path path = new Path();
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        float f7 = f3 - f;
        float f8 = f4 - f2;
        float f9 = 2;
        float f10 = f7 / f9;
        if (f5 > f10) {
            f5 = f10;
        }
        float f11 = f8 / f9;
        if (f6 > f11) {
            f6 = f11;
        }
        float f12 = f7 - (f9 * f5);
        float f13 = f8 - (f9 * f6);
        path.moveTo(f3, f2 + f6);
        float f14 = -f6;
        float f15 = -f5;
        path.rQuadTo(0.0f, f14, f15, f14);
        path.rLineTo(-f12, 0.0f);
        path.rQuadTo(f15, 0.0f, f15, f6);
        path.rLineTo(0.0f, f13);
        if (z) {
            path.rLineTo(0.0f, f6);
            path.rLineTo(f7, 0.0f);
            path.rLineTo(0.0f, f14);
        } else {
            path.rQuadTo(0.0f, f6, f5, f6);
            path.rLineTo(f12, 0.0f);
            path.rQuadTo(f5, 0.0f, f5, f14);
        }
        path.rLineTo(0.0f, -f13);
        path.close();
        return path;
    }

    public final boolean b() {
        return getPaddingTop() + (getPaddingBottom() + c().getMeasuredHeight()) <= getMeasuredHeight();
    }

    public final View c() {
        View childAt = getChildAt(0);
        if (childAt != null) {
            return childAt;
        }
        xq0.q("roundabout innerView is missing");
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        canvas.drawBitmap(this.a.getBitmap(), (Rect) null, this.c, this.b);
        canvas.save();
        Path path = this.g;
        if (path == null) {
            Intrinsics.j("clipPath");
            throw null;
        }
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        final int i5;
        long X;
        long X2;
        int i6 = i;
        int i7 = i2;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.b bVar = com.yandex.passport.common.logger.b.b;
            StringBuilder sb = new StringBuilder("onLayout(");
            sb.append(z);
            sb.append(", ");
            sb.append(i6);
            sb.append(", ");
            hrg.w(i7, i3, ", ", ", ", sb);
            com.yandex.passport.common.logger.a.c(bVar, null, vz1.r(sb, i4, ')'), 8);
        }
        Rect rect = this.c;
        rect.left = i6;
        rect.right = i3;
        rect.top = i7;
        rect.bottom = i4;
        if (b()) {
            i7 = (i4 - c().getMeasuredHeight()) - getPaddingBottom();
        }
        final int i8 = i7;
        int i9 = i3 - i6;
        int i10 = this.i;
        if (i9 > i10) {
            int i11 = i9 / 2;
            int i12 = i10 / 2;
            i6 = i11 - i12;
            i5 = i11 + i12;
        } else {
            i5 = i3;
        }
        final int i13 = i6;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.b bVar2 = com.yandex.passport.common.logger.b.b;
            StringBuilder l = dfi.l("layout child(", i13, i8, ", ", ", ");
            l.append(i5);
            l.append(", ");
            l.append(i4);
            l.append(')');
            com.yandex.passport.common.logger.a.c(bVar2, null, l.toString(), 8);
        }
        c().layout(i13, i8, i5, i4 - getPaddingBottom());
        final int i14 = this.f;
        if (i14 >= 0) {
            asa asaVar = new asa();
            asaVar.b(new Function1() { // from class: com.yandex.passport.internal.ui.bouncer.roundabout.q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    csa csaVar = (csa) obj;
                    csaVar.getClass();
                    r rVar = this;
                    ro6 ro6Var = new ro6(rVar, i13, i5, 3);
                    o57 o57Var = csaVar.a;
                    o57Var.invoke(new gn0(new bsa(i14, i8, ro6Var, 0)));
                    o57Var.invoke(new gn0(new at5(18, new View[]{rVar})));
                    return Unit.a;
                }
            });
            X2 = fxf.X((r2 & 8) != 0 ? 0 : 1, (r2 & 16) == 0 ? 200 : 0);
            asaVar.setDuration(X2);
            asa asaVar2 = this.h;
            if (asaVar2 != null) {
                asaVar2.cancel();
            }
            asaVar.start();
            this.h = asaVar;
            return;
        }
        float f = this.e;
        float f2 = i13 + f;
        float bottom = getBottom() + f;
        float f3 = i5 - f;
        float f4 = this.d;
        this.g = a(f2, bottom, f3, getBottom() - (b() ? getPaddingBottom() + r2 : 0), f4, f4, !b());
        final int bottom2 = getBottom();
        asa asaVar3 = new asa();
        asaVar3.b(new Function1() { // from class: com.yandex.passport.internal.ui.bouncer.roundabout.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                csa csaVar = (csa) obj;
                csaVar.getClass();
                r rVar = this;
                ro6 ro6Var = new ro6(rVar, i13, i5, 3);
                o57 o57Var = csaVar.a;
                o57Var.invoke(new gn0(new bsa(bottom2, i8, ro6Var, 0)));
                o57Var.invoke(new gn0(new at5(18, new View[]{rVar})));
                return Unit.a;
            }
        });
        X = fxf.X((r2 & 8) != 0 ? 0 : 1, (r2 & 16) == 0 ? 200 : 0);
        asaVar3.setDuration(X);
        asa asaVar4 = this.h;
        if (asaVar4 != null) {
            asaVar4.cancel();
        }
        asaVar3.start();
        this.h = asaVar3;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(getMeasuredWidth(), this.i), 1073741824);
        c().measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, 0));
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "first measure step " + c().getMeasuredHeight(), 8);
        }
        if (b()) {
            return;
        }
        c().measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingBottom()) - getPaddingTop(), 1073741824));
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "second measure step " + c().getMeasuredHeight(), 8);
        }
    }
}
