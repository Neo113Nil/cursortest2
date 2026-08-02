package androidx.media3.extractor.text.ttml;

import com.google.common.collect.ImmutableSet;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class TextEmphasis {
    public final int markFill;
    public final int markShape;
    public final int position;
    public static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\s+");
    public static final ImmutableSet SINGLE_STYLE_VALUES = ImmutableSet.of((Object) "auto", (Object) "none");
    public static final ImmutableSet MARK_SHAPE_VALUES = ImmutableSet.construct(3, "dot", "sesame", "circle");
    public static final ImmutableSet MARK_FILL_VALUES = ImmutableSet.of((Object) "filled", (Object) "open");
    public static final ImmutableSet POSITION_VALUES = ImmutableSet.construct(3, "after", "before", "outside");

    public TextEmphasis(int i, int i2, int i3) {
        this.markShape = i;
        this.markFill = i2;
        this.position = i3;
    }
}
