package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;

/* loaded from: classes10.dex */
public interface xr2 {
    void dismiss();

    Drawable getBackground();

    CharSequence getHintText();

    int getHorizontalOffset();

    int getVerticalOffset();

    boolean isShowing();

    void setAdapter(ListAdapter listAdapter);

    void setBackgroundDrawable(Drawable drawable);

    void setHorizontalOffset(int i);

    void setHorizontalOriginalOffset(int i);

    void setPromptText(CharSequence charSequence);

    void setVerticalOffset(int i);

    void show(int i, int i2);
}
