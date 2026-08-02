package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class qnr {
    public static final boolean a(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static final boolean b(RecyclerView.e eVar, View view, int i, int i2, ViewGroup.LayoutParams layoutParams) {
        return (!view.isLayoutRequested() && eVar.B && a(view.getWidth(), i, layoutParams.width) && a(view.getHeight(), i2, layoutParams.height)) ? false : true;
    }
}
