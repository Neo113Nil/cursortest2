package com.squareup.cash.arcade.components;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.ValueInsets;
import app.cash.broadway.ui.compose.UiScopeKt$$ExternalSyntheticLambda0;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class AlignmentLinesKt {
    public static final HorizontalAlignmentLine InteractiveCenter = new HorizontalAlignmentLine(AlignmentLinesKt$InteractiveCenter$1.INSTANCE);
    public static final HorizontalAlignmentLine FirstLineCenter = new HorizontalAlignmentLine(AlignmentLinesKt$FirstLineCenter$1.INSTANCE);
    public static final HorizontalAlignmentLine FirstLineTop = new HorizontalAlignmentLine(AlignmentLinesKt$FirstLineTop$1.INSTANCE);
    public static final HorizontalAlignmentLine FirstLineBottom = new HorizontalAlignmentLine(AlignmentLinesKt$FirstLineBottom$1.INSTANCE);

    public static final Modifier recordVerticalCenter(Modifier modifier, HorizontalAlignmentLine horizontalAlignmentLine, Map map) {
        modifier.getClass();
        horizontalAlignmentLine.getClass();
        map.getClass();
        return ValueInsets.layout(modifier, new UiScopeKt$$ExternalSyntheticLambda0(2, map, horizontalAlignmentLine));
    }
}
