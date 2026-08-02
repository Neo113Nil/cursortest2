package com.squareup.cash.money.applets.common.views;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.text.TextStyle;

/* loaded from: classes6.dex */
public final class InstalledServiceAppletTileLayoutConfig {
    public final float contentRowGap;
    public final BiasAlignment.Vertical contentVerticalAlignment;
    public final float headerToContentGap;
    public final TextStyle titleStyle;
    public final VisualPosition visualPosition;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class VisualPosition {
        public static final /* synthetic */ VisualPosition[] $VALUES;
        public static final VisualPosition END;
        public static final VisualPosition START;

        static {
            VisualPosition visualPosition = new VisualPosition("START", 0);
            START = visualPosition;
            VisualPosition visualPosition2 = new VisualPosition("END", 1);
            END = visualPosition2;
            $VALUES = new VisualPosition[]{visualPosition, visualPosition2};
        }

        public static VisualPosition valueOf(String str) {
            return (VisualPosition) Enum.valueOf(VisualPosition.class, str);
        }

        public static VisualPosition[] values() {
            return (VisualPosition[]) $VALUES.clone();
        }
    }

    public InstalledServiceAppletTileLayoutConfig(float f, float f2, TextStyle textStyle, VisualPosition visualPosition, BiasAlignment.Vertical vertical) {
        textStyle.getClass();
        visualPosition.getClass();
        this.headerToContentGap = f;
        this.contentRowGap = f2;
        this.titleStyle = textStyle;
        this.visualPosition = visualPosition;
        this.contentVerticalAlignment = vertical;
    }

    public /* synthetic */ InstalledServiceAppletTileLayoutConfig(float f, TextStyle textStyle, int i) {
        this(f, 8.0f, textStyle, (i & 8) != 0 ? VisualPosition.START : VisualPosition.END, Alignment.Companion.CenterVertically);
    }
}
