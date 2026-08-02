package app.cash.arcade.values;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
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
public abstract class ImageResource {
    public static final Companion Companion = new Companion();
    public static final Lazy $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Font$$ExternalSyntheticLambda0(20));

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/ImageResource$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/ImageResource;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return (KSerializer) ImageResource.$cachedSerializer$delegate.getValue();
        }
    }

    @SerialName("Token")
    @Serializable
    public final class Token extends ImageResource {
        public static final Companion Companion = new Companion();
        public final String id;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/ImageResource$Token$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/ImageResource$Token;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return ImageResource$Token$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Token(int i, String str) {
            if (1 == (i & 1)) {
                this.id = str;
            } else {
                TuplesKt.throwMissingFieldException(i, 1, ImageResource$Token$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Token) && Intrinsics.areEqual(this.id, ((Token) obj).id);
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Token(id=", this.id, ")");
        }
    }

    @SerialName("Url")
    @Serializable
    public final class Url extends ImageResource {
        public final String dark;
        public final String light;
        public final RenderingMode renderingMode;
        public static final Companion Companion = new Companion();
        public static final Lazy[] $childSerializers = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Font$$ExternalSyntheticLambda0(21))};

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/ImageResource$Url$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/ImageResource$Url;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return ImageResource$Url$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class RenderingMode {
            public static final /* synthetic */ RenderingMode[] $VALUES;
            public static final RenderingMode ORIGINAL;
            public static final RenderingMode TINTABLE;

            static {
                RenderingMode renderingMode = new RenderingMode("ORIGINAL", 0);
                ORIGINAL = renderingMode;
                RenderingMode renderingMode2 = new RenderingMode("TINTABLE", 1);
                TINTABLE = renderingMode2;
                $VALUES = new RenderingMode[]{renderingMode, renderingMode2};
            }

            public static RenderingMode valueOf(String str) {
                return (RenderingMode) Enum.valueOf(RenderingMode.class, str);
            }

            public static RenderingMode[] values() {
                return (RenderingMode[]) $VALUES.clone();
            }
        }

        public /* synthetic */ Url(int i, String str, String str2, RenderingMode renderingMode) {
            if (1 != (i & 1)) {
                TuplesKt.throwMissingFieldException(i, 1, ImageResource$Url$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.light = str;
            if ((i & 2) == 0) {
                this.dark = null;
            } else {
                this.dark = str2;
            }
            if ((i & 4) == 0) {
                this.renderingMode = RenderingMode.ORIGINAL;
            } else {
                this.renderingMode = renderingMode;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Url)) {
                return false;
            }
            Url url = (Url) obj;
            return Intrinsics.areEqual(this.light, url.light) && Intrinsics.areEqual(this.dark, url.dark) && this.renderingMode == url.renderingMode;
        }

        public final int hashCode() {
            int hashCode = this.light.hashCode() * 31;
            String str = this.dark;
            return this.renderingMode.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Url(light=", this.light, ", dark=", this.dark, ", renderingMode=");
            m.append(this.renderingMode);
            m.append(")");
            return m.toString();
        }
    }

    @SerialName("Id")
    @Serializable
    public final class Id extends ImageResource {
        public static final Companion Companion = new Companion();
        public final int id;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/ImageResource$Id$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/ImageResource$Id;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return ImageResource$Id$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Id(int i, int i2) {
            if (1 == (i & 1)) {
                this.id = i2;
            } else {
                TuplesKt.throwMissingFieldException(i, 1, ImageResource$Id$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Id) && this.id == ((Id) obj).id;
        }

        public final int hashCode() {
            return Integer.hashCode(this.id);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id, "Id(id=", ")");
        }

        public Id(int i) {
            this.id = i;
        }
    }
}
