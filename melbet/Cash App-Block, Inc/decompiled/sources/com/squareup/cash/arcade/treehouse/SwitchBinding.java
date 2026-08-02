package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.Widget;
import com.google.android.gms.dynamite.zzo;
import com.squareup.cash.mooncake.components.MooncakeSwitch;
import com.squareup.cash.mooncake.components.MooncakeToggle;

/* loaded from: classes5.dex */
public final class SwitchBinding implements Widget {
    public final /* synthetic */ int $r8$classId;
    public Modifier modifier;
    public final View value;

    public SwitchBinding(Context context, int i) {
        this.$r8$classId = i;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        switch (i) {
            case 1:
                this.modifier = companion;
                this.value = new MooncakeToggle(context, new zzo((byte) 0, ColorKt.m694toArgb8_81llA(Color.Red)), new zzo((byte) 0, ColorKt.m694toArgb8_81llA(Color.Blue)));
                break;
            case 2:
                context.getClass();
                this.value = new View(context);
                this.modifier = companion;
                break;
            default:
                this.modifier = companion;
                this.value = new MooncakeSwitch(context, null);
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
                return (MooncakeSwitch) this.value;
            case 1:
                return (MooncakeToggle) this.value;
            default:
                return this.value;
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
