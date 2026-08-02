package com.google.android.filament;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public final class Viewport {
    public int height;
    public int width;

    public /* synthetic */ Viewport(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public int getEncoding() {
        int i = this.height;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public void setFrom(RecyclerView.ViewHolder viewHolder) {
        android.view.View view = viewHolder.itemView;
        this.width = view.getLeft();
        this.height = view.getTop();
        view.getRight();
        view.getBottom();
    }
}
