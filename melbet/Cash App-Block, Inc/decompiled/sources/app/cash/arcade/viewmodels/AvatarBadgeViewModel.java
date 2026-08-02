package app.cash.arcade.viewmodels;

import app.cash.arcade.values.Color;
import app.cash.arcade.values.ColorFilter;
import app.cash.arcade.values.ImageResource;
import app.cash.arcade.values.Shape$$ExternalSyntheticLambda0;
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

@Serializable
/* loaded from: classes3.dex */
public abstract class AvatarBadgeViewModel {
    public static final Companion Companion = new Companion();
    public static final Lazy $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Shape$$ExternalSyntheticLambda0(27));

    @SerialName("CardUrl")
    @Serializable
    public final class CardUrl extends AvatarBadgeViewModel {
        public static final Companion Companion = new Companion();
        public final ImageResource.Url image;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/viewmodels/AvatarBadgeViewModel$CardUrl$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/viewmodels/AvatarBadgeViewModel$CardUrl;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return AvatarBadgeViewModel$CardUrl$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ CardUrl(int i, ImageResource.Url url) {
            if (1 == (i & 1)) {
                this.image = url;
            } else {
                TuplesKt.throwMissingFieldException(i, 1, AvatarBadgeViewModel$CardUrl$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CardUrl) && Intrinsics.areEqual(this.image, ((CardUrl) obj).image);
        }

        public final int hashCode() {
            return this.image.hashCode();
        }

        public final String toString() {
            return "CardUrl(image=" + this.image + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/viewmodels/AvatarBadgeViewModel$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/viewmodels/AvatarBadgeViewModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return (KSerializer) AvatarBadgeViewModel.$cachedSerializer$delegate.getValue();
        }
    }

    @SerialName("IconRes")
    @Serializable
    public final class IconRes extends AvatarBadgeViewModel {
        public static final Lazy[] $childSerializers;
        public static final Companion Companion = new Companion();
        public final Color backgroundColor;
        public final ColorFilter colorFilter;
        public final ImageResource.Id image;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/viewmodels/AvatarBadgeViewModel$IconRes$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/viewmodels/AvatarBadgeViewModel$IconRes;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return AvatarBadgeViewModel$IconRes$$serializer.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Shape$$ExternalSyntheticLambda0(28)), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Shape$$ExternalSyntheticLambda0(29))};
        }

        public /* synthetic */ IconRes(int i, ImageResource.Id id, Color color, ColorFilter colorFilter) {
            if (3 != (i & 3)) {
                TuplesKt.throwMissingFieldException(i, 3, AvatarBadgeViewModel$IconRes$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.image = id;
            this.backgroundColor = color;
            if ((i & 4) == 0) {
                this.colorFilter = null;
            } else {
                this.colorFilter = colorFilter;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconRes)) {
                return false;
            }
            IconRes iconRes = (IconRes) obj;
            return Intrinsics.areEqual(this.image, iconRes.image) && Intrinsics.areEqual(this.backgroundColor, iconRes.backgroundColor) && Intrinsics.areEqual(this.colorFilter, iconRes.colorFilter);
        }

        public final int hashCode() {
            int hashCode = (this.backgroundColor.hashCode() + (Integer.hashCode(this.image.id) * 31)) * 31;
            ColorFilter colorFilter = this.colorFilter;
            return hashCode + (colorFilter == null ? 0 : colorFilter.hashCode());
        }

        public final String toString() {
            return "IconRes(image=" + this.image + ", backgroundColor=" + this.backgroundColor + ", colorFilter=" + this.colorFilter + ")";
        }
    }

    @SerialName("IconToken")
    @Serializable
    public final class IconToken extends AvatarBadgeViewModel {
        public static final Lazy[] $childSerializers;
        public static final Companion Companion = new Companion();
        public final Color backgroundColor;
        public final ColorFilter colorFilter;
        public final ImageResource.Token image;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/viewmodels/AvatarBadgeViewModel$IconToken$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/viewmodels/AvatarBadgeViewModel$IconToken;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return AvatarBadgeViewModel$IconToken$$serializer.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new AvatarViewModel$$ExternalSyntheticLambda0(1)), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new AvatarViewModel$$ExternalSyntheticLambda0(2))};
        }

        public /* synthetic */ IconToken(int i, ImageResource.Token token, Color color, ColorFilter colorFilter) {
            if (3 != (i & 3)) {
                TuplesKt.throwMissingFieldException(i, 3, AvatarBadgeViewModel$IconToken$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.image = token;
            this.backgroundColor = color;
            if ((i & 4) == 0) {
                this.colorFilter = null;
            } else {
                this.colorFilter = colorFilter;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconToken)) {
                return false;
            }
            IconToken iconToken = (IconToken) obj;
            return Intrinsics.areEqual(this.image, iconToken.image) && Intrinsics.areEqual(this.backgroundColor, iconToken.backgroundColor) && Intrinsics.areEqual(this.colorFilter, iconToken.colorFilter);
        }

        public final int hashCode() {
            int hashCode = (this.backgroundColor.hashCode() + (this.image.id.hashCode() * 31)) * 31;
            ColorFilter colorFilter = this.colorFilter;
            return hashCode + (colorFilter == null ? 0 : Float.hashCode(((ColorFilter.SetToSaturation) colorFilter).saturation));
        }

        public final String toString() {
            return "IconToken(image=" + this.image + ", backgroundColor=" + this.backgroundColor + ", colorFilter=" + this.colorFilter + ")";
        }
    }

    @SerialName("IconUrl")
    @Serializable
    public final class IconUrl extends AvatarBadgeViewModel {
        public final Color backgroundColor;
        public final ImageResource.Url image;
        public static final Companion Companion = new Companion();
        public static final Lazy[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new AvatarViewModel$$ExternalSyntheticLambda0(3))};

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/viewmodels/AvatarBadgeViewModel$IconUrl$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/viewmodels/AvatarBadgeViewModel$IconUrl;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return AvatarBadgeViewModel$IconUrl$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ IconUrl(int i, ImageResource.Url url, Color color) {
            if (1 != (i & 1)) {
                TuplesKt.throwMissingFieldException(i, 1, AvatarBadgeViewModel$IconUrl$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.image = url;
            if ((i & 2) == 0) {
                this.backgroundColor = null;
            } else {
                this.backgroundColor = color;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconUrl)) {
                return false;
            }
            IconUrl iconUrl = (IconUrl) obj;
            return Intrinsics.areEqual(this.image, iconUrl.image) && Intrinsics.areEqual(this.backgroundColor, iconUrl.backgroundColor);
        }

        public final int hashCode() {
            int hashCode = this.image.hashCode() * 31;
            Color color = this.backgroundColor;
            return hashCode + (color == null ? 0 : color.hashCode());
        }

        public final String toString() {
            return "IconUrl(image=" + this.image + ", backgroundColor=" + this.backgroundColor + ")";
        }
    }
}
