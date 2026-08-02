package app.cash.arcade.values;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class TextFieldState {
    public static final Companion Companion = new Companion();
    public final int selectionEnd;
    public final int selectionStart;
    public final String text;
    public final long userEditCount;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/TextFieldState$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/TextFieldState;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return TextFieldState$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TextFieldState(int i, int i2, int i3, long j, String str) {
        this.text = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.selectionStart = 0;
        } else {
            this.selectionStart = i2;
        }
        if ((i & 4) == 0) {
            this.selectionEnd = 0;
        } else {
            this.selectionEnd = i3;
        }
        if ((i & 8) == 0) {
            this.userEditCount = 0L;
        } else {
            this.userEditCount = j;
        }
        int length = this.text.length();
        int i4 = this.selectionStart;
        if (i4 < 0 || i4 > length) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            throw null;
        }
        int length2 = this.text.length();
        int i5 = this.selectionEnd;
        if (i5 < 0 || i5 > length2) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            throw null;
        }
    }

    public final boolean contentEquals(TextFieldState textFieldState) {
        long j = textFieldState.userEditCount;
        String str = this.text;
        str.getClass();
        return new TextFieldState(str, this.selectionStart, this.selectionEnd, j).equals(textFieldState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldState)) {
            return false;
        }
        TextFieldState textFieldState = (TextFieldState) obj;
        return Intrinsics.areEqual(this.text, textFieldState.text) && this.selectionStart == textFieldState.selectionStart && this.selectionEnd == textFieldState.selectionEnd && this.userEditCount == textFieldState.userEditCount;
    }

    public final int hashCode() {
        return Long.hashCode(this.userEditCount) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.selectionEnd, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.selectionStart, this.text.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder m = Recorder$$ExternalSyntheticOutline2.m("TextFieldState(text=", this.selectionStart, this.text, ", selectionStart=", ", selectionEnd=");
        m.append(this.selectionEnd);
        m.append(", userEditCount=");
        m.append(this.userEditCount);
        m.append(")");
        return m.toString();
    }

    public final TextFieldState userEdit(int i, int i2, String str) {
        str.getClass();
        return new TextFieldState(str, RangesKt___RangesKt.coerceIn(i, new IntRange(0, str.length(), 1)), RangesKt___RangesKt.coerceIn(i2, new IntRange(0, str.length(), 1)), this.userEditCount + 1);
    }

    public TextFieldState(String str, int i, int i2, long j) {
        str.getClass();
        this.text = str;
        this.selectionStart = i;
        this.selectionEnd = i2;
        this.userEditCount = j;
        int length = str.length();
        if (i >= 0 && i <= length) {
            int length2 = str.length();
            if (i2 < 0 || i2 > length2) {
                a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                throw null;
            }
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
        throw null;
    }

    public /* synthetic */ TextFieldState(String str, int i, int i2, int i3) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, 0L);
    }
}
