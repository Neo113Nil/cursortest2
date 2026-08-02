package app.cash.arcade.values;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@SerialName("IconAction")
@Serializable
/* loaded from: classes3.dex */
public final class IconAction implements TitleBarAction {
    public final ImageResource icon;
    public final String label;
    public static final Companion Companion = new Companion();
    public static final Lazy[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Font$$ExternalSyntheticLambda0(18)), null};

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/IconAction$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/IconAction;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return IconAction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ IconAction(int i, ImageResource imageResource, String str) {
        if (3 != (i & 3)) {
            TuplesKt.throwMissingFieldException(i, 3, IconAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.icon = imageResource;
        this.label = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IconAction)) {
            return false;
        }
        IconAction iconAction = (IconAction) obj;
        return Intrinsics.areEqual(this.icon, iconAction.icon) && Intrinsics.areEqual(this.label, iconAction.label);
    }

    public final int hashCode() {
        return this.label.hashCode() + (this.icon.hashCode() * 31);
    }

    public final String toString() {
        return "IconAction(icon=" + this.icon + ", label=" + this.label + ")";
    }
}
