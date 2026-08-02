package app.cash.arcade.values;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
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
public final class InputFieldHelperText {
    public final ImageResource icon;
    public final String iconContentDescription;
    public final String text;
    public static final Companion Companion = new Companion();
    public static final Lazy[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Font$$ExternalSyntheticLambda0(22)), null, null};

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/InputFieldHelperText$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/InputFieldHelperText;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return InputFieldHelperText$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InputFieldHelperText(int i, ImageResource imageResource, String str, String str2) {
        if (4 != (i & 4)) {
            TuplesKt.throwMissingFieldException(i, 4, InputFieldHelperText$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.icon = null;
        } else {
            this.icon = imageResource;
        }
        if ((i & 2) == 0) {
            this.iconContentDescription = null;
        } else {
            this.iconContentDescription = str;
        }
        this.text = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputFieldHelperText)) {
            return false;
        }
        InputFieldHelperText inputFieldHelperText = (InputFieldHelperText) obj;
        return Intrinsics.areEqual(this.icon, inputFieldHelperText.icon) && Intrinsics.areEqual(this.iconContentDescription, inputFieldHelperText.iconContentDescription) && Intrinsics.areEqual(this.text, inputFieldHelperText.text);
    }

    public final int hashCode() {
        ImageResource imageResource = this.icon;
        int hashCode = (imageResource == null ? 0 : imageResource.hashCode()) * 31;
        String str = this.iconContentDescription;
        return this.text.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InputFieldHelperText(icon=");
        sb.append(this.icon);
        sb.append(", iconContentDescription=");
        sb.append(this.iconContentDescription);
        sb.append(", text=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.text, ")");
    }
}
