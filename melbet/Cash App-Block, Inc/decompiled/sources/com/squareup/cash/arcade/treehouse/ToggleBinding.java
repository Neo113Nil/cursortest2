package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import app.cash.arcade.values.BooleanState;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.Widget;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import kotlin.collections.EmptyList;

/* loaded from: classes5.dex */
public final class ToggleBinding implements Widget {
    public final /* synthetic */ int $r8$classId;
    public final Object enabled$delegate;
    public Modifier modifier;
    public final StateObjectImpl onChange$delegate;
    public final ParcelableSnapshotMutableState state$delegate;
    public final Object value;

    public ToggleBinding(Context context, int i) {
        this.$r8$classId = i;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        switch (i) {
            case 1:
                this.value = new RadioBinding$value$1(context, this, 1);
                this.modifier = companion;
                this.state$delegate = Updater.mutableStateOf$default(new BooleanState());
                this.enabled$delegate = Updater.mutableStateOf$default(Boolean.FALSE);
                this.onChange$delegate = Updater.mutableStateOf$default(null);
                break;
            case 2:
                this.value = ThemeHelpersKt.findThemeInfo(context);
                this.enabled$delegate = new RadioBinding$value$1(context, this, 3);
                this.onChange$delegate = new ParcelableSnapshotMutableLongState(0L);
                this.state$delegate = Updater.mutableStateOf$default(EmptyList.INSTANCE);
                this.modifier = companion;
                break;
            default:
                this.value = new RadioBinding$value$1(context, this, 4);
                this.modifier = companion;
                this.state$delegate = Updater.mutableStateOf$default(new BooleanState());
                this.enabled$delegate = Updater.mutableStateOf$default(Boolean.FALSE);
                this.onChange$delegate = Updater.mutableStateOf$default(null);
                break;
        }
    }

    @Override // app.cash.redwood.widget.Widget
    public final Modifier getModifier() {
        switch (this.$r8$classId) {
        }
        return this.modifier;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        switch (this.$r8$classId) {
            case 0:
                return (RadioBinding$value$1) this.value;
            case 1:
                return (RadioBinding$value$1) this.value;
            default:
                return (RadioBinding$value$1) this.enabled$delegate;
        }
    }

    @Override // app.cash.redwood.widget.Widget
    public final void setModifier(Modifier modifier) {
        int i = this.$r8$classId;
        modifier.getClass();
        switch (i) {
            case 0:
                this.modifier = modifier;
                break;
            case 1:
                this.modifier = modifier;
                break;
            default:
                this.modifier = modifier;
                break;
        }
    }
}
