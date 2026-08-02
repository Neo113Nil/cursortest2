package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class or0 extends PopupWindow {
    public final /* synthetic */ int a = 0;

    public /* synthetic */ or0(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        switch (this.a) {
            case 1:
                try {
                    super.dismiss();
                    break;
                } catch (IllegalArgumentException | IllegalStateException unused) {
                    return;
                }
            default:
                super.dismiss();
                break;
        }
    }

    @Override // android.widget.PopupWindow
    public void setContentView(View view) {
        switch (this.a) {
            case 1:
                if (view != null) {
                    view.setFilterTouchesWhenObscured(true);
                }
                super.setContentView(view);
                break;
            default:
                super.setContentView(view);
                break;
        }
    }

    public /* synthetic */ or0(View view, int i, int i2, boolean z) {
        super(view, i, i2, z);
    }
}
