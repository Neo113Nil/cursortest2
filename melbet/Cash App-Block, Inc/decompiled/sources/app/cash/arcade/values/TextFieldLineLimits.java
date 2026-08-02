package app.cash.arcade.values;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
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

@Serializable
/* loaded from: classes3.dex */
public interface TextFieldLineLimits {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/TextFieldLineLimits$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/TextFieldLineLimits;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public final KSerializer serializer() {
            ReflectionFactory reflectionFactory = Reflection.factory;
            return new SealedClassSerializer("app.cash.arcade.values.TextFieldLineLimits", reflectionFactory.getOrCreateKotlinClass(TextFieldLineLimits.class), new KClass[]{reflectionFactory.getOrCreateKotlinClass(MultiLine.class), reflectionFactory.getOrCreateKotlinClass(SingleLine.class)}, new KSerializer[]{TextFieldLineLimits$MultiLine$$serializer.INSTANCE, new EnumSerializer("SingleLine", SingleLine.INSTANCE, new Annotation[0])}, new Annotation[0]);
        }
    }

    @SerialName("MultiLine")
    @Serializable
    public final class MultiLine implements TextFieldLineLimits {
        public static final Companion Companion = new Companion();
        public final int maxHeightInLines;
        public final int minHeightInLines;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/TextFieldLineLimits$MultiLine$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/TextFieldLineLimits$MultiLine;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return TextFieldLineLimits$MultiLine$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ MultiLine(int i, int i2, int i3) {
            this.minHeightInLines = (i & 1) == 0 ? 1 : i2;
            if ((i & 2) == 0) {
                this.maxHeightInLines = Integer.MAX_VALUE;
            } else {
                this.maxHeightInLines = i3;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MultiLine)) {
                return false;
            }
            MultiLine multiLine = (MultiLine) obj;
            return this.minHeightInLines == multiLine.minHeightInLines && this.maxHeightInLines == multiLine.maxHeightInLines;
        }

        public final int hashCode() {
            return Integer.hashCode(this.maxHeightInLines) + (Integer.hashCode(this.minHeightInLines) * 31);
        }

        public final String toString() {
            return Recorder$$ExternalSyntheticOutline2.m(this.minHeightInLines, this.maxHeightInLines, "MultiLine(minHeightInLines=", ", maxHeightInLines=", ")");
        }
    }

    @SerialName("SingleLine")
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/TextFieldLineLimits$SingleLine", "Lapp/cash/arcade/values/TextFieldLineLimits;", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/TextFieldLineLimits$SingleLine;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @Serializable
    public final class SingleLine implements TextFieldLineLimits {
        public static final SingleLine INSTANCE = new SingleLine();
        public static final /* synthetic */ Lazy $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Shape$$ExternalSyntheticLambda0(10));

        public final KSerializer serializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }
    }
}
