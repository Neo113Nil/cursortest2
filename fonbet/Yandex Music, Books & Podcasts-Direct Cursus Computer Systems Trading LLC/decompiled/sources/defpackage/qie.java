package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class qie extends zpa {
    public m6g n;
    public b6 o;

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.l)) {
            if (this.c != null) {
                Settings.Global.getFloat(this.a.getContentResolver(), "animator_duration_scale", 1.0f);
            }
            canvas.save();
            m6g m6gVar = this.n;
            Rect bounds = getBounds();
            float b = b();
            ObjectAnimator objectAnimator = this.d;
            boolean z = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.e;
            m6gVar.c(canvas, bounds, b, z, objectAnimator2 != null && objectAnimator2.isRunning());
            h7g h7gVar = this.b;
            int i6 = h7gVar.i;
            int i7 = this.k;
            boolean z2 = h7gVar instanceof h7g;
            boolean z3 = z2 && i6 == 0 && !h7gVar.c(false);
            Paint paint = this.j;
            if (z3) {
                this.n.g(canvas, paint, 0.0f, 1.0f, h7gVar.f, i7, 0);
            } else if (z2) {
                gqa gqaVar = (gqa) ((ArrayList) this.o.c).get(0);
                gqa gqaVar2 = (gqa) vz1.m((ArrayList) this.o.c, 1);
                m6g m6gVar2 = this.n;
                if (m6gVar2 != null) {
                    m6gVar2.g(canvas, paint, 0.0f, gqaVar.a, h7gVar.f, i7, i6);
                    this.n.g(canvas, paint, gqaVar2.b, 1.0f, h7gVar.f, i7, i6);
                    i = i7;
                    i2 = i6;
                } else {
                    canvas.save();
                    gqaVar2.getClass();
                    canvas.rotate(0.0f);
                    this.n.g(canvas, paint, gqaVar2.b, gqaVar.a + 1.0f, h7gVar.f, i7, i6);
                    i = i7;
                    i2 = i6;
                    canvas.restore();
                }
                i3 = 0;
                while (i3 < ((ArrayList) this.o.c).size()) {
                    gqa gqaVar3 = (gqa) ((ArrayList) this.o.c).get(i3);
                    gqaVar3.f = c();
                    int i8 = i3;
                    m6g m6gVar3 = this.n;
                    int i9 = this.k;
                    m6gVar3.getClass();
                    int E = qgg.E(gqaVar3.c, i9);
                    m6gVar3.m = gqaVar3.g;
                    float f = gqaVar3.a;
                    float f2 = gqaVar3.b;
                    int i10 = gqaVar3.d;
                    boolean z4 = z2;
                    m6gVar3.e(canvas, paint, f, f2, E, i10, i10, gqaVar3.e, gqaVar3.f, true);
                    if (i8 <= 0 || z3 || !z4) {
                        i4 = i2;
                        i5 = i;
                    } else {
                        i4 = i2;
                        i5 = i;
                        this.n.g(canvas, paint, ((gqa) ((ArrayList) this.o.c).get(i8 - 1)).b, gqaVar3.a, h7gVar.f, i5, i4);
                    }
                    i3 = i8 + 1;
                    i = i5;
                    i2 = i4;
                    z2 = z4;
                }
                canvas.restore();
            }
            i = i7;
            i2 = i6;
            i3 = 0;
            while (i3 < ((ArrayList) this.o.c).size()) {
            }
            canvas.restore();
        }
    }

    @Override // defpackage.zpa
    public final boolean e(boolean z, boolean z2, boolean z3) {
        boolean e = super.e(z, z2, z3);
        if (this.c != null) {
            Settings.Global.getFloat(this.a.getContentResolver(), "animator_duration_scale", 1.0f);
        }
        if (!isRunning()) {
            this.o.h();
        }
        if (z && z3) {
            this.o.L();
        }
        return e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.n.a();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        this.n.getClass();
        return -1;
    }
}
