package com.squareup.cash.collapsingtoolbar.views;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public abstract class ScrollStrategy {
    public static final /* synthetic */ ScrollStrategy[] $VALUES = {new ScrollStrategy() { // from class: com.squareup.cash.collapsingtoolbar.views.ScrollStrategy.EnterAlways
    }, new ScrollStrategy() { // from class: com.squareup.cash.collapsingtoolbar.views.ScrollStrategy.EnterAlwaysCollapsed
    }, new ScrollStrategy() { // from class: com.squareup.cash.collapsingtoolbar.views.ScrollStrategy.ExitUntilCollapsed
    }};

    /* JADX INFO: Fake field, exist only in values array */
    ScrollStrategy EF2;

    public static ScrollStrategy valueOf(String str) {
        return (ScrollStrategy) Enum.valueOf(ScrollStrategy.class, str);
    }

    public static ScrollStrategy[] values() {
        return (ScrollStrategy[]) $VALUES.clone();
    }
}
