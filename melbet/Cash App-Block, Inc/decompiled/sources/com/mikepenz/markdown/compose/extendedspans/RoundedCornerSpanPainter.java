package com.mikepenz.markdown.compose.extendedspans;

import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.Room;

/* loaded from: classes6.dex */
public final class RoundedCornerSpanPainter {
    public final long bottomMargin;
    public final long cornerRadius;
    public final TextPaddingValues padding;
    public final AndroidPath path;
    public final long topMargin;

    public final class TextPaddingValues {
        public final long horizontal;
        public final long vertical;

        public TextPaddingValues(long j, long j2) {
            this.horizontal = j;
            this.vertical = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextPaddingValues)) {
                return false;
            }
            TextPaddingValues textPaddingValues = (TextPaddingValues) obj;
            return TextUnit.m1057equalsimpl0(this.horizontal, textPaddingValues.horizontal) && TextUnit.m1057equalsimpl0(this.vertical, textPaddingValues.vertical);
        }

        public final int hashCode() {
            TextUnitType[] textUnitTypeArr = TextUnit.TextUnitTypes;
            return Long.hashCode(this.vertical) + (Long.hashCode(this.horizontal) * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("TextPaddingValues(horizontal=", TextUnit.m1061toStringimpl(this.horizontal), ", vertical=", TextUnit.m1061toStringimpl(this.vertical), ")");
        }
    }

    public RoundedCornerSpanPainter(TextPaddingValues textPaddingValues) {
        long sp = Room.getSp(8);
        long sp2 = Room.getSp(1);
        long sp3 = Room.getSp(1);
        this.cornerRadius = sp;
        this.padding = textPaddingValues;
        this.topMargin = sp2;
        this.bottomMargin = sp3;
        this.path = AndroidPath_androidKt.Path();
    }
}
