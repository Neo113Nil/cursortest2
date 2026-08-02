package yads;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import defpackage.hn81;

/* loaded from: classes7.dex */
public final class d53 extends CheckBox implements hn81 {
    public Drawable a;
    public Drawable b;

    public d53(Context context) {
        super(context);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setButtonDrawable((Drawable) null);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, this.a);
        stateListDrawable.addState(new int[0], this.b);
        setBackground(stateListDrawable);
    }

    public final void setCheckedIcon(Drawable drawable) {
        this.a = drawable;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, this.a);
        stateListDrawable.addState(new int[0], this.b);
        setBackground(stateListDrawable);
    }

    public void setMuted(boolean z) {
        setChecked(z);
    }

    public final void setUncheckedIcon(Drawable drawable) {
        this.b = drawable;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, this.a);
        stateListDrawable.addState(new int[0], this.b);
        setBackground(stateListDrawable);
    }

    public d53(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public d53(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
