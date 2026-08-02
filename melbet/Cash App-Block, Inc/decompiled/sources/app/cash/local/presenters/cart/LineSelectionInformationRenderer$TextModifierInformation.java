package app.cash.local.presenters.cart;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LineSelectionInformationRenderer$TextModifierInformation {
    public final String input;
    public final String name;

    public LineSelectionInformationRenderer$TextModifierInformation(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.name = str;
        this.input = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineSelectionInformationRenderer$TextModifierInformation)) {
            return false;
        }
        LineSelectionInformationRenderer$TextModifierInformation lineSelectionInformationRenderer$TextModifierInformation = (LineSelectionInformationRenderer$TextModifierInformation) obj;
        return Intrinsics.areEqual(this.name, lineSelectionInformationRenderer$TextModifierInformation.name) && Intrinsics.areEqual(this.input, lineSelectionInformationRenderer$TextModifierInformation.input);
    }

    public final int hashCode() {
        return this.input.hashCode() + (this.name.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("TextModifierInformation(name=", this.name, ", input=", this.input, ")");
    }
}
