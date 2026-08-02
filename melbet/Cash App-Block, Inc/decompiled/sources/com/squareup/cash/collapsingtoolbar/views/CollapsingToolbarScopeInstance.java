package com.squareup.cash.collapsingtoolbar.views;

import androidx.compose.ui.Modifier;

/* loaded from: classes6.dex */
public final class CollapsingToolbarScopeInstance {
    public static final CollapsingToolbarScopeInstance INSTANCE = new CollapsingToolbarScopeInstance();

    public static Modifier road(Modifier modifier) {
        modifier.getClass();
        return modifier.then(new RoadModifier());
    }
}
