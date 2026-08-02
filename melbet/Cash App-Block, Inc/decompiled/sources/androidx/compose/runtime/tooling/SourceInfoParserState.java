package androidx.compose.runtime.tooling;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class SourceInfoParserState {
    public final String data;
    public int i;

    public SourceInfoParserState(String str) {
        this.data = str;
    }

    public final boolean atEnd() {
        return this.i >= this.data.length();
    }

    public final void expect() {
        if (matches(')')) {
            return;
        }
        throwParseError("expected )");
        throw null;
    }

    public final boolean matches(char c) {
        int i = this.i;
        String str = this.data;
        return i < str.length() && str.charAt(this.i) == c;
    }

    public final int takeIntUntil(String str) {
        Integer intOrNull = StringsKt.toIntOrNull(takeUntil(str));
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        throwParseError("expected int");
        throw null;
    }

    public final String takeUntil(String str) {
        String str2;
        int i = this.i;
        while (true) {
            int i2 = this.i;
            str2 = this.data;
            if (i2 >= str2.length() || StringsKt.contains((CharSequence) str, str2.charAt(this.i), false)) {
                break;
            }
            this.i++;
        }
        int i3 = this.i;
        return i3 > i ? str2.substring(i, i3) : "";
    }

    public final void throwParseError(String str) {
        int i = this.i;
        String str2 = this.data;
        int min = Math.min(i, str2.length());
        StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Error while parsing source information: ", str, " at ");
        m3m.append(str2.substring(0, min));
        m3m.append('|');
        m3m.append(str2.substring(min));
        throw new ParseException(m3m.toString());
    }
}
