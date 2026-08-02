package com.squareup.cash.money.views;

import androidx.compose.runtime.saveable.SaveableHolder;
import androidx.compose.runtime.saveable.Saver;

/* loaded from: classes6.dex */
public final class ToolbarNestedScrollExpanderSaver implements Saver {
    @Override // androidx.compose.runtime.saveable.Saver
    /* renamed from: restore */
    public final Object mo380restore(Object obj) {
        SavedToolbarNestedScrollState savedToolbarNestedScrollState = (SavedToolbarNestedScrollState) obj;
        return new ToolbarNestedScrollExpander(savedToolbarNestedScrollState.toolbarHeight, savedToolbarNestedScrollState.toolbarScrollDelta);
    }

    @Override // androidx.compose.runtime.saveable.Saver
    public final Object save(SaveableHolder saveableHolder, Object obj) {
        ToolbarNestedScrollExpander toolbarNestedScrollExpander = (ToolbarNestedScrollExpander) obj;
        saveableHolder.getClass();
        toolbarNestedScrollExpander.getClass();
        return new SavedToolbarNestedScrollState(toolbarNestedScrollExpander._toolbarHeight.getFloatValue(), toolbarNestedScrollExpander._toolbarScrollDelta.getFloatValue());
    }
}
