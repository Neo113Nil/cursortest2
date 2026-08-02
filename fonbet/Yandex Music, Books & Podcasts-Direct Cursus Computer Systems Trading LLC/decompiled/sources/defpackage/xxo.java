package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import java.util.Set;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public class xxo extends uho {
    public final sxi N0;
    public heu O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;
    public boolean S0;
    public Set T0;
    public bqj U0;

    public xxo(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.N0 = new sxi(this, ViewConfiguration.get(getContext()).getScaledTouchSlop());
        this.P0 = true;
        this.Q0 = true;
        this.R0 = false;
        this.S0 = false;
    }

    public final boolean C(MotionEvent motionEvent) {
        if (!this.Q0 && this.O0 != null) {
            if ((motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE) == 0) {
                this.R0 = false;
            }
            this.O0.k(motionEvent);
        }
        Set set = this.T0;
        if (set != null) {
            this.S0 = this.P0 && set.contains(Integer.valueOf(getCurrentItem()));
        }
        return (this.R0 || this.S0 || !this.P0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        this.N0.a(motionEvent);
        return dispatchTouchEvent;
    }

    public bqj getOnInterceptTouchEventListener() {
        return this.U0;
    }

    @Override // defpackage.lgu, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        bqj bqjVar = this.U0;
        if (bqjVar != null) {
            ((o6c) bqjVar).E(this, motionEvent);
        }
        return C(motionEvent) && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.N0.b = false;
    }

    @Override // defpackage.lgu, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return C(motionEvent) && super.onTouchEvent(motionEvent);
    }

    public void setDisabledScrollPages(Set<Integer> set) {
        this.T0 = set;
    }

    public void setEdgeScrollEnabled(boolean z) {
        this.Q0 = z;
        if (z) {
            return;
        }
        heu heuVar = new heu(getContext(), this, new wxo(0, this));
        this.O0 = heuVar;
        heuVar.p = 3;
    }

    public void setOnInterceptTouchEventListener(bqj bqjVar) {
        this.U0 = bqjVar;
    }

    public void setScrollEnabled(boolean z) {
        this.P0 = z;
    }

    public xxo(@NonNull Context context) {
        this(context, null);
    }
}
