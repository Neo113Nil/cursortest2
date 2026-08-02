package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public class cf3 extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {
    public static final /* synthetic */ int j = 0;
    public final AccessibilityManager a;
    public BottomSheetBehavior b;
    public final GestureDetector c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final String g;
    public final String h;
    public final xe3 i;

    public cf3(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(bg3.p0(context, attributeSet, i, R.style.Widget_Material3_BottomSheet_DragHandle), attributeSet, i);
        this.e = false;
        this.f = false;
        this.g = getResources().getString(R.string.bottomsheet_action_expand);
        this.h = getResources().getString(R.string.bottomsheet_action_collapse);
        int i2 = 2;
        this.i = new xe3(i2, this);
        bf3 bf3Var = new bf3(0, this);
        Context context2 = getContext();
        this.c = new GestureDetector(context2, bf3Var, new Handler(Looper.getMainLooper()));
        this.a = (AccessibilityManager) context2.getSystemService("accessibility");
        wdu.q(this, new fu2(i2, this));
    }

    private void setBottomSheetBehavior(BottomSheetBehavior<?> bottomSheetBehavior) {
        BottomSheetBehavior bottomSheetBehavior2 = this.b;
        xe3 xe3Var = this.i;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.removeBottomSheetCallback(xe3Var);
            this.b.setAccessibilityDelegateView(null);
            this.b.setDragHandleView(null);
        }
        this.b = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setAccessibilityDelegateView(this);
            this.b.setDragHandleView(this);
            n(this.b.getState());
            this.b.addBottomSheetCallback(xe3Var);
        }
        setClickable(this.b != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r1 != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        BottomSheetBehavior bottomSheetBehavior = this.b;
        boolean z = false;
        if (bottomSheetBehavior == null) {
            return false;
        }
        if (!bottomSheetBehavior.isFitToContents() && !this.b.shouldSkipHalfExpandedStateWhenDragging()) {
            z = true;
        }
        int state = this.b.getState();
        int i = 6;
        int i2 = 3;
        if (state != 4) {
            if (state == 3) {
                if (!z) {
                    i = 4;
                }
                this.b.setState(i);
                return true;
            }
            if (!this.d) {
                i2 = 4;
            }
            i = i2;
            this.b.setState(i);
            return true;
        }
    }

    public final void n(int i) {
        if (i == 4) {
            this.d = true;
        } else if (i == 3) {
            this.d = false;
        }
        wdu.o(this, qb.e, this.d ? this.g : this.h, new n(5, this));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        BottomSheetBehavior<?> bottomSheetBehavior;
        super.onAttachedToWindow();
        View view = this;
        while (true) {
            Object parent = view.getParent();
            bottomSheetBehavior = null;
            view = parent instanceof View ? (View) parent : null;
            if (view == null) {
                break;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof xk6) {
                uk6 uk6Var = ((xk6) layoutParams).a;
                if (uk6Var instanceof BottomSheetBehavior) {
                    bottomSheetBehavior = (BottomSheetBehavior) uk6Var;
                    break;
                }
            }
        }
        setBottomSheetBehavior(bottomSheetBehavior);
        AccessibilityManager accessibilityManager = this.a;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this);
            accessibilityManager.isEnabled();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager = this.a;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this);
        }
        setBottomSheetBehavior(null);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return (this.f || this.e) ? super.onTouchEvent(motionEvent) : this.c.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f = onClickListener != null;
        super.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.e = onTouchListener != null;
        super.setOnTouchListener(onTouchListener);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
    }

    public cf3(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomSheetDragHandleStyle);
    }

    public cf3(@NonNull Context context) {
        this(context, null);
    }
}
