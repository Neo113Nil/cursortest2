package app.cash.arcade.viewmodels;

import app.cash.arcade.values.Color;
import app.cash.arcade.values.ImageResource;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class AvatarViewModel {
    public static final Lazy[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final Color backgroundColor;
    public final Color borderColor;
    public final String character;
    public final String contentDescription;
    public final Color foregroundColor;
    public final ImageResource image;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/viewmodels/AvatarViewModel$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/viewmodels/AvatarViewModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return AvatarViewModel$$serializer.INSTANCE;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        $childSerializers = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, (Function0) new AvatarViewModel$$ExternalSyntheticLambda0(0)), null, null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new AvatarViewModel$$ExternalSyntheticLambda0(4)), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new AvatarViewModel$$ExternalSyntheticLambda0(5)), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new AvatarViewModel$$ExternalSyntheticLambda0(6))};
    }

    public /* synthetic */ AvatarViewModel(int i, Color color, String str, String str2, Color color2, ImageResource imageResource, Color color3) {
        if ((i & 1) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = color;
        }
        if ((i & 2) == 0) {
            this.character = null;
        } else {
            this.character = str;
        }
        if ((i & 4) == 0) {
            this.contentDescription = null;
        } else {
            this.contentDescription = str2;
        }
        if ((i & 8) == 0) {
            this.foregroundColor = null;
        } else {
            this.foregroundColor = color2;
        }
        if ((i & 16) == 0) {
            this.image = null;
        } else {
            this.image = imageResource;
        }
        if ((i & 32) == 0) {
            this.borderColor = null;
        } else {
            this.borderColor = color3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvatarViewModel)) {
            return false;
        }
        AvatarViewModel avatarViewModel = (AvatarViewModel) obj;
        return Intrinsics.areEqual(this.backgroundColor, avatarViewModel.backgroundColor) && Intrinsics.areEqual(this.character, avatarViewModel.character) && Intrinsics.areEqual(this.contentDescription, avatarViewModel.contentDescription) && Intrinsics.areEqual(this.foregroundColor, avatarViewModel.foregroundColor) && Intrinsics.areEqual(this.image, avatarViewModel.image) && Intrinsics.areEqual(this.borderColor, avatarViewModel.borderColor);
    }

    public final int hashCode() {
        Color color = this.backgroundColor;
        int hashCode = (color == null ? 0 : color.hashCode()) * 31;
        String str = this.character;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.contentDescription;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Color color2 = this.foregroundColor;
        int hashCode4 = (hashCode3 + (color2 == null ? 0 : color2.hashCode())) * 31;
        ImageResource imageResource = this.image;
        int hashCode5 = (hashCode4 + (imageResource == null ? 0 : imageResource.hashCode())) * 31;
        Color color3 = this.borderColor;
        return hashCode5 + (color3 != null ? color3.hashCode() : 0);
    }

    public final String toString() {
        return "AvatarViewModel(backgroundColor=" + this.backgroundColor + ", character=" + this.character + ", contentDescription=" + this.contentDescription + ", foregroundColor=" + this.foregroundColor + ", image=" + this.image + ", borderColor=" + this.borderColor + ")";
    }
}
