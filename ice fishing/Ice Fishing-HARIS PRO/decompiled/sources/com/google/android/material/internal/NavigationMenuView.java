package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import l.InterfaceC0212A;
import l.MenuC0229m;

/* loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC0212A {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    @Override // l.InterfaceC0212A
    public final void a(MenuC0229m menuC0229m) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
