package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import androidx.annotation.NonNull;
import defpackage.b6;
import defpackage.h7g;
import defpackage.hqa;
import defpackage.kz7;
import defpackage.m6g;
import defpackage.qie;
import defpackage.t6g;
import defpackage.v6g;
import defpackage.xq0;
import defpackage.zs2;
import java.util.Objects;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public class LinearProgressIndicator extends zs2 {
    public LinearProgressIndicator(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h7g h7gVar = this.a;
        m6g m6gVar = new m6g(h7gVar);
        m6gVar.f = 300.0f;
        m6gVar.o = new Pair(new hqa(), new hqa());
        Context context2 = getContext();
        b6 t6gVar = h7gVar.o == 0 ? new t6g(h7gVar) : new v6g(context2, h7gVar);
        qie qieVar = new qie(context2, h7gVar);
        qieVar.n = m6gVar;
        qieVar.o = t6gVar;
        t6gVar.b = qieVar;
        setIndeterminateDrawable(qieVar);
        setProgressDrawable(new kz7(getContext(), h7gVar, m6gVar));
        this.i = true;
    }

    @Override // defpackage.zs2
    public final void a(int i, boolean z) {
        h7g h7gVar = this.a;
        if (h7gVar != null && h7gVar.o == 0 && isIndeterminate()) {
            return;
        }
        super.a(i, z);
    }

    public int getIndeterminateAnimationType() {
        return this.a.o;
    }

    public int getIndicatorDirection() {
        return this.a.p;
    }

    public int getTrackInnerCornerRadius() {
        return this.a.t;
    }

    public Integer getTrackStopIndicatorPadding() {
        return this.a.s;
    }

    public int getTrackStopIndicatorSize() {
        return this.a.r;
    }

    @Override // defpackage.zs2, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        h7g h7gVar = this.a;
        boolean z2 = true;
        if (h7gVar.p != 1 && ((getLayoutDirection() != 1 || h7gVar.p != 2) && (getLayoutDirection() != 0 || h7gVar.p != 3))) {
            z2 = false;
        }
        h7gVar.q = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i2 - (getPaddingBottom() + getPaddingTop());
        qie indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        kz7 progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i) {
        h7g h7gVar = this.a;
        if (h7gVar.o == i) {
            return;
        }
        if (b() && isIndeterminate()) {
            xq0.q("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
            return;
        }
        h7gVar.o = i;
        h7gVar.d();
        if (i == 0) {
            qie indeterminateDrawable = getIndeterminateDrawable();
            t6g t6gVar = new t6g(h7gVar);
            indeterminateDrawable.o = t6gVar;
            t6gVar.b = indeterminateDrawable;
        } else {
            qie indeterminateDrawable2 = getIndeterminateDrawable();
            v6g v6gVar = new v6g(getContext(), h7gVar);
            indeterminateDrawable2.o = v6gVar;
            v6gVar.b = indeterminateDrawable2;
        }
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().o.H(this.l);
        }
        invalidate();
    }

    @Override // defpackage.zs2
    public void setIndicatorColor(@NonNull int... iArr) {
        super.setIndicatorColor(iArr);
        this.a.d();
    }

    public void setIndicatorDirection(int i) {
        h7g h7gVar = this.a;
        h7gVar.p = i;
        boolean z = true;
        if (i != 1 && ((getLayoutDirection() != 1 || h7gVar.p != 2) && (getLayoutDirection() != 0 || i != 3))) {
            z = false;
        }
        h7gVar.q = z;
        invalidate();
    }

    @Override // defpackage.zs2
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        this.a.d();
        invalidate();
    }

    public void setTrackInnerCornerRadius(int i) {
        h7g h7gVar = this.a;
        if (h7gVar.t != i) {
            h7gVar.t = Math.round(Math.min(i, h7gVar.a / 2.0f));
            h7gVar.v = false;
            h7gVar.w = true;
            h7gVar.d();
            invalidate();
        }
    }

    public void setTrackInnerCornerRadiusFraction(float f) {
        h7g h7gVar = this.a;
        if (h7gVar.u != f) {
            h7gVar.u = Math.min(f, 0.5f);
            h7gVar.v = true;
            h7gVar.w = true;
            h7gVar.d();
            invalidate();
        }
    }

    public void setTrackStopIndicatorPadding(Integer num) {
        h7g h7gVar = this.a;
        if (Objects.equals(h7gVar.s, num)) {
            return;
        }
        h7gVar.s = num;
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i) {
        h7g h7gVar = this.a;
        if (h7gVar.r != i) {
            h7gVar.r = Math.min(i, h7gVar.a);
            h7gVar.d();
            invalidate();
        }
    }

    public LinearProgressIndicator(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(@NonNull Context context) {
        this(context, null);
    }
}
