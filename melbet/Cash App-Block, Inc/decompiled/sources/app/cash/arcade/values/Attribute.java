package app.cash.arcade.values;

import androidx.work.Worker$$ExternalSyntheticLambda1;
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
public abstract class Attribute {
    public static final Companion Companion = new Companion();
    public static final Lazy $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Worker$$ExternalSyntheticLambda1(25));

    @SerialName("Bold")
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/Attribute$Bold", "Lapp/cash/arcade/values/Attribute;", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/Attribute$Bold;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @Serializable
    public final /* data */ class Bold extends Attribute {
        public static final Bold INSTANCE = new Bold();
        public static final /* synthetic */ Lazy $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Worker$$ExternalSyntheticLambda1(26));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Bold);
        }

        public final int hashCode() {
            return -530935021;
        }

        public final KSerializer serializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final String toString() {
            return "Bold";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/Attribute$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/Attribute;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return (KSerializer) Attribute.$cachedSerializer$delegate.getValue();
        }
    }

    @SerialName("Faded")
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/Attribute$Faded", "Lapp/cash/arcade/values/Attribute;", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/Attribute$Faded;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @Serializable
    public final /* data */ class Faded extends Attribute {
        public static final Faded INSTANCE = new Faded();
        public static final /* synthetic */ Lazy $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Worker$$ExternalSyntheticLambda1(27));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Faded);
        }

        public final int hashCode() {
            return 724152986;
        }

        public final KSerializer serializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final String toString() {
            return "Faded";
        }
    }

    @SerialName("ForegroundColor")
    @Serializable
    public final class ForegroundColor extends Attribute {
        public final Color color;
        public static final Companion Companion = new Companion();
        public static final Lazy[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Worker$$ExternalSyntheticLambda1(28))};

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/Attribute$ForegroundColor$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/Attribute$ForegroundColor;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return Attribute$ForegroundColor$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ ForegroundColor(int i, Color color) {
            if (1 == (i & 1)) {
                this.color = color;
            } else {
                TuplesKt.throwMissingFieldException(i, 1, Attribute$ForegroundColor$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ForegroundColor) && Intrinsics.areEqual(this.color, ((ForegroundColor) obj).color);
        }

        public final int hashCode() {
            return this.color.hashCode();
        }

        public final String toString() {
            return "ForegroundColor(color=" + this.color + ")";
        }
    }

    @SerialName("Icon")
    @Serializable
    public final class Icon extends Attribute {
        public final ImageResource image;
        public static final Companion Companion = new Companion();
        public static final Lazy[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Worker$$ExternalSyntheticLambda1(29))};

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/Attribute$Icon$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/Attribute$Icon;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return Attribute$Icon$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Icon(int i, ImageResource imageResource) {
            if (1 == (i & 1)) {
                this.image = imageResource;
            } else {
                TuplesKt.throwMissingFieldException(i, 1, Attribute$Icon$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Icon) && Intrinsics.areEqual(this.image, ((Icon) obj).image);
        }

        public final int hashCode() {
            return this.image.hashCode();
        }

        public final String toString() {
            return "Icon(image=" + this.image + ")";
        }
    }

    @SerialName("StrikeThrough")
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/Attribute$StrikeThrough", "Lapp/cash/arcade/values/Attribute;", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/Attribute$StrikeThrough;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @Serializable
    public final /* data */ class StrikeThrough extends Attribute {
        public static final StrikeThrough INSTANCE = new StrikeThrough();
        public static final /* synthetic */ Lazy $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Font$$ExternalSyntheticLambda0(1));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof StrikeThrough);
        }

        public final int hashCode() {
            return 2050260453;
        }

        public final KSerializer serializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final String toString() {
            return "StrikeThrough";
        }
    }

    @SerialName("Underline")
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/Attribute$Underline", "Lapp/cash/arcade/values/Attribute;", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/Attribute$Underline;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @Serializable
    public final /* data */ class Underline extends Attribute {
        public static final Underline INSTANCE = new Underline();
        public static final /* synthetic */ Lazy $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Font$$ExternalSyntheticLambda0(2));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Underline);
        }

        public final int hashCode() {
            return 988059390;
        }

        public final KSerializer serializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final String toString() {
            return "Underline";
        }
    }

    @SerialName("UnorderedListItem")
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/Attribute$UnorderedListItem", "Lapp/cash/arcade/values/Attribute;", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/Attribute$UnorderedListItem;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @Serializable
    public final /* data */ class UnorderedListItem extends Attribute {
        public static final UnorderedListItem INSTANCE = new UnorderedListItem();
        public static final /* synthetic */ Lazy $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Font$$ExternalSyntheticLambda0(3));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UnorderedListItem);
        }

        public final int hashCode() {
            return -994374953;
        }

        public final KSerializer serializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final String toString() {
            return "UnorderedListItem";
        }
    }

    @SerialName("Link")
    @Serializable
    public final class Link extends Attribute {
        public static final Companion Companion = new Companion();
        public final String url;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/Attribute$Link$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/Attribute$Link;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return Attribute$Link$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Link(int i, String str) {
            if (1 == (i & 1)) {
                this.url = str;
            } else {
                TuplesKt.throwMissingFieldException(i, 1, Attribute$Link$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Link) && Intrinsics.areEqual(this.url, ((Link) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Link(url=", this.url, ")");
        }

        public Link(String str) {
            str.getClass();
            this.url = str;
        }
    }

    @SerialName("OrderedListItem")
    @Serializable
    public final class OrderedListItem extends Attribute {
        public static final Companion Companion = new Companion();
        public final String number;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/Attribute$OrderedListItem$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/Attribute$OrderedListItem;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return Attribute$OrderedListItem$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ OrderedListItem(int i, String str) {
            if (1 == (i & 1)) {
                this.number = str;
            } else {
                TuplesKt.throwMissingFieldException(i, 1, Attribute$OrderedListItem$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OrderedListItem) && Intrinsics.areEqual(this.number, ((OrderedListItem) obj).number);
        }

        public final int hashCode() {
            return this.number.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OrderedListItem(number=", this.number, ")");
        }

        public OrderedListItem(String str) {
            str.getClass();
            this.number = str;
        }
    }
}
