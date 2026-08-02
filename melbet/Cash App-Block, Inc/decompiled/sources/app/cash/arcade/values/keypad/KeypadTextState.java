package app.cash.arcade.values.keypad;

import bo.app.re$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class KeypadTextState {
    public static final Companion Companion = new Companion();
    public final String text;
    public final long version;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/keypad/KeypadTextState$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/keypad/KeypadTextState;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return KeypadTextState$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ KeypadTextState(long j, String str, int i) {
        this.text = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.version = 0L;
        } else {
            this.version = j;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeypadTextState)) {
            return false;
        }
        KeypadTextState keypadTextState = (KeypadTextState) obj;
        return Intrinsics.areEqual(this.text, keypadTextState.text) && this.version == keypadTextState.version;
    }

    public final int hashCode() {
        return Long.hashCode(this.version) + (this.text.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("KeypadTextState(text=", this.text, ", version=", this.version);
        m.append(")");
        return m.toString();
    }

    public KeypadTextState(String str, long j) {
        str.getClass();
        this.text = str;
        this.version = j;
    }
}
