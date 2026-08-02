package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: classes3.dex */
public class v1s extends qr2 {
    public qq2 I;
    public List J;
    public ogu K;
    public String L;
    public uo9 v0;
    public t1s w0;
    public boolean x0;

    public v1s(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.x0 = false;
        setTabMode(0);
        setTabIndicatorHeight(0);
        setOnTabSelectedListener(new vtm(this));
        e0n e0nVar = new e0n();
        e0nVar.b("TabTitlesLayoutView.TAB_HEADER", new u1s(getContext()), 0);
        this.K = e0nVar;
        this.L = "TabTitlesLayoutView.TAB_HEADER";
    }

    @Override // defpackage.qr2, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0) {
            this.x0 = true;
        }
        return dispatchTouchEvent;
    }

    @Override // defpackage.qr2
    public final b2s g(Context context) {
        return (b2s) this.K.a(this.L);
    }

    public xfu getCustomPageChangeListener() {
        pr2 pageChangeListener = getPageChangeListener();
        pageChangeListener.c = 0;
        pageChangeListener.b = 0;
        return pageChangeListener;
    }

    @Override // defpackage.qr2, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        t1s t1sVar = this.w0;
        if (t1sVar == null || !this.x0) {
            return;
        }
        v13 v13Var = (v13) t1sVar;
        cp9 cp9Var = (cp9) v13Var.b;
        e23 e23Var = (e23) v13Var.c;
        yb8 yb8Var = cp9Var.h;
        gc8 gc8Var = e23Var.a;
        yb8Var.l();
        this.x0 = false;
    }

    public void setHost(@NonNull qq2 qq2Var) {
        this.I = qq2Var;
    }

    public void setOnScrollChangedListener(t1s t1sVar) {
        this.w0 = t1sVar;
    }

    public void setTabTitleStyle(uo9 uo9Var) {
        this.v0 = uo9Var;
    }

    public void setTypefaceProvider(@NonNull ky9 ky9Var) {
        this.j = ky9Var;
    }

    public v1s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public v1s(Context context) {
        this(context, null, 0);
    }
}
