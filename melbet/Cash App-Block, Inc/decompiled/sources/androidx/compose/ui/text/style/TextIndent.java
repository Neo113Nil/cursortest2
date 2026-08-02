package androidx.compose.ui.text.style;

import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.room.Room;

/* loaded from: classes.dex */
public final class TextIndent {
    public static final TextIndent None = new TextIndent(Room.getSp(0), Room.getSp(0));
    public final long firstLine;
    public final long restLine;

    public TextIndent(long j, long j2) {
        this.firstLine = j;
        this.restLine = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextIndent)) {
            return false;
        }
        TextIndent textIndent = (TextIndent) obj;
        return TextUnit.m1057equalsimpl0(this.firstLine, textIndent.firstLine) && TextUnit.m1057equalsimpl0(this.restLine, textIndent.restLine);
    }

    public final int hashCode() {
        TextUnitType[] textUnitTypeArr = TextUnit.TextUnitTypes;
        return Long.hashCode(this.restLine) + (Long.hashCode(this.firstLine) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) TextUnit.m1061toStringimpl(this.firstLine)) + ", restLine=" + ((Object) TextUnit.m1061toStringimpl(this.restLine)) + ')';
    }
}
