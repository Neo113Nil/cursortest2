package app.cash.arcade.values;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes3.dex */
public final class LegacyDialogAction {
    public final Style style;
    public final String title;
    public static final Companion Companion = new Companion();
    public static final Lazy[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Shape$$ExternalSyntheticLambda0(1))};

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/LegacyDialogAction$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/LegacyDialogAction;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return LegacyDialogAction$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Style {
        public static final /* synthetic */ Style[] $VALUES = {new Style("Default", 0), new Style("Destructive", 1), new Style("Cancel", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        Style EF5;

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }

    public /* synthetic */ LegacyDialogAction(int i, String str, Style style) {
        if (3 != (i & 3)) {
            TuplesKt.throwMissingFieldException(i, 3, LegacyDialogAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.title = str;
        this.style = style;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyDialogAction)) {
            return false;
        }
        LegacyDialogAction legacyDialogAction = (LegacyDialogAction) obj;
        return Intrinsics.areEqual(this.title, legacyDialogAction.title) && this.style == legacyDialogAction.style;
    }

    public final int hashCode() {
        return this.style.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return "LegacyDialogAction(title=" + this.title + ", style=" + this.style + ")";
    }
}
