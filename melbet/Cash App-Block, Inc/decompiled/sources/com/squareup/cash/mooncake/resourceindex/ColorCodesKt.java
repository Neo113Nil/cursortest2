package com.squareup.cash.mooncake.resourceindex;

import android.view.ActionMode;
import app.cash.arcade.values.Color;
import java.util.Arrays;

/* loaded from: classes6.dex */
public abstract class ColorCodesKt {
    public static final Color.Code colorCode(int i, int i2) {
        return new Color.Code(new Color.ModeVariant(String.format("#%08x", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1))), new Color.ModeVariant(String.format("#%08x", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1))));
    }

    public static void invalidateContentRect(ActionMode actionMode) {
        actionMode.invalidateContentRect();
    }

    public static final Color.Code colorCode(int i) {
        return new Color.Code(new Color.ModeVariant(String.format("#%08x", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1))), null);
    }
}
