package app.cash.arcade.values;

import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes3.dex */
public interface BorderStyle {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/BorderStyle$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/BorderStyle;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public final KSerializer serializer() {
            ReflectionFactory reflectionFactory = Reflection.factory;
            return new SealedClassSerializer("app.cash.arcade.values.BorderStyle", reflectionFactory.getOrCreateKotlinClass(BorderStyle.class), new KClass[]{reflectionFactory.getOrCreateKotlinClass(Dashed.class), reflectionFactory.getOrCreateKotlinClass(None.class), reflectionFactory.getOrCreateKotlinClass(Solid.class)}, new KSerializer[]{BorderStyle$Dashed$$serializer.INSTANCE, new EnumSerializer("None", None.INSTANCE, new Annotation[0]), new EnumSerializer("Solid", Solid.INSTANCE, new Annotation[0])}, new Annotation[0]);
        }
    }

    @SerialName("Dashed")
    @Serializable
    public final class Dashed implements BorderStyle {
        public static final Companion Companion = new Companion();
        public final float dashWidth;
        public final float gapWidth;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/BorderStyle$Dashed$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/BorderStyle$Dashed;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return BorderStyle$Dashed$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Dashed(float f, float f2, int i) {
            if (3 != (i & 3)) {
                TuplesKt.throwMissingFieldException(i, 3, BorderStyle$Dashed$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.dashWidth = f;
            this.gapWidth = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dashed)) {
                return false;
            }
            Dashed dashed = (Dashed) obj;
            return Float.compare(this.dashWidth, dashed.dashWidth) == 0 && Float.compare(this.gapWidth, dashed.gapWidth) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.gapWidth) + (Float.hashCode(this.dashWidth) * 31);
        }

        public final String toString() {
            return "Dashed(dashWidth=" + this.dashWidth + ", gapWidth=" + this.gapWidth + ")";
        }
    }

    @SerialName("None")
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/BorderStyle$None", "Lapp/cash/arcade/values/BorderStyle;", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/BorderStyle$None;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @Serializable
    public final /* data */ class None implements BorderStyle {
        public static final None INSTANCE = new None();
        public static final /* synthetic */ Lazy $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Font$$ExternalSyntheticLambda0(8));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof None);
        }

        public final int hashCode() {
            return 1754962973;
        }

        public final KSerializer serializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final String toString() {
            return "None";
        }
    }

    @SerialName("Solid")
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/BorderStyle$Solid", "Lapp/cash/arcade/values/BorderStyle;", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/BorderStyle$Solid;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @Serializable
    public final /* data */ class Solid implements BorderStyle {
        public static final Solid INSTANCE = new Solid();
        public static final /* synthetic */ Lazy $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Font$$ExternalSyntheticLambda0(9));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Solid);
        }

        public final int hashCode() {
            return -1426106778;
        }

        public final KSerializer serializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final String toString() {
            return "Solid";
        }
    }
}
