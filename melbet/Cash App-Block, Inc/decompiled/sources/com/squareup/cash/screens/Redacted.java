package com.squareup.cash.screens;

import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class Redacted implements Parcelable {
    public abstract Object getValue();

    public final String toString() {
        return getValue() == null ? "null" : "██";
    }
}
