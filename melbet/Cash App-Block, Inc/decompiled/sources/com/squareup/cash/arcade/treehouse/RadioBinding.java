package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import app.cash.arcade.values.BooleanState;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.Widget;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;

/* loaded from: classes5.dex */
public final class RadioBinding implements Widget {
    public final ThemeInfo themeInfo;
    public final RadioBinding$value$1 value;
    public Modifier modifier = Modifier.Companion.$$INSTANCE;
    public final ParcelableSnapshotMutableState state$delegate = Updater.mutableStateOf$default(new BooleanState());
    public final ParcelableSnapshotMutableState tint$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState enabled$delegate = Updater.mutableStateOf$default(Boolean.FALSE);
    public final ParcelableSnapshotMutableState onChange$delegate = Updater.mutableStateOf$default(null);

    public RadioBinding(Context context) {
        this.themeInfo = ThemeHelpersKt.findThemeInfo(context);
        this.value = new RadioBinding$value$1(context, this, 0);
    }

    @Override // app.cash.redwood.widget.Widget
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        return this.value;
    }

    @Override // app.cash.redwood.widget.Widget
    public final void setModifier(Modifier modifier) {
        modifier.getClass();
        this.modifier = modifier;
    }
}
