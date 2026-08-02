package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import l.InterfaceC4650A;
import l.m;

/* loaded from: classes2.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC4650A {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // l.InterfaceC4650A
    public final void c(m mVar) {
    }
}
