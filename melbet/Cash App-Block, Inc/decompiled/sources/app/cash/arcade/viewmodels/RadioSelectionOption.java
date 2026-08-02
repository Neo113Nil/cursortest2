package app.cash.arcade.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes3.dex */
public final class RadioSelectionOption {
    public static final Companion Companion = new Companion();
    public final String id;
    public final boolean isSelectable;
    public final boolean isSelected;
    public final String subtitle;
    public final String title;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/viewmodels/RadioSelectionOption$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/viewmodels/RadioSelectionOption;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return RadioSelectionOption$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RadioSelectionOption(int i, String str, String str2, String str3, boolean z, boolean z2) {
        if (7 != (i & 7)) {
            TuplesKt.throwMissingFieldException(i, 7, RadioSelectionOption$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.title = str2;
        this.subtitle = str3;
        if ((i & 8) == 0) {
            this.isSelected = false;
        } else {
            this.isSelected = z;
        }
        if ((i & 16) == 0) {
            this.isSelectable = true;
        } else {
            this.isSelectable = z2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadioSelectionOption)) {
            return false;
        }
        RadioSelectionOption radioSelectionOption = (RadioSelectionOption) obj;
        return Intrinsics.areEqual(this.id, radioSelectionOption.id) && Intrinsics.areEqual(this.title, radioSelectionOption.title) && Intrinsics.areEqual(this.subtitle, radioSelectionOption.subtitle) && this.isSelected == radioSelectionOption.isSelected && this.isSelectable == radioSelectionOption.isSelectable;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isSelectable) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.title), 31, this.subtitle), 31, this.isSelected);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RadioSelectionOption(id=", this.id, ", title=", this.title, ", subtitle=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.subtitle, ", isSelected=", this.isSelected, ", isSelectable=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.isSelectable, ")");
    }
}
