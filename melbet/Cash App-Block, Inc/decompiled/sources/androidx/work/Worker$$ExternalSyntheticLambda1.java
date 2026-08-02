package androidx.work;

import app.cash.arcade.values.AccessibilityRoleType;
import app.cash.arcade.values.ArcadeTimelineItemState;
import app.cash.arcade.values.Attribute;
import app.cash.arcade.values.Attribute$ForegroundColor$$serializer;
import app.cash.arcade.values.Attribute$Icon$$serializer;
import app.cash.arcade.values.Attribute$Link$$serializer;
import app.cash.arcade.values.Attribute$OrderedListItem$$serializer;
import app.cash.arcade.values.Color;
import app.cash.arcade.values.ImageResource;
import app.cash.redwood.layout.api.CrossAxisAlignment;
import app.cash.redwood.layout.api.CrossAxisAlignment$$serializer;
import app.cash.redwood.ui.Dp;
import app.cash.redwood.ui.Dp$$serializer;
import app.cash.redwood.ui.Margin;
import app.cash.redwood.ui.Margin$$serializer;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes3.dex */
public final /* synthetic */ class Worker$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Class cls = Boolean.TYPE;
        Class cls2 = Double.TYPE;
        switch (i) {
            case 0:
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
            case 1:
                return new HashSetSerializer(IntSerializer.INSTANCE, 1);
            case 2:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(String.class), StringSerializer.INSTANCE, new KSerializer[0]);
            case 3:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(String.class), StringSerializer.INSTANCE, new KSerializer[0]);
            case 4:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(cls), BooleanSerializer.INSTANCE, new KSerializer[0]);
            case 5:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(String.class), StringSerializer.INSTANCE, new KSerializer[0]);
            case 6:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(AccessibilityRoleType.class), AccessibilityRoleType.Companion.serializer(), new KSerializer[0]);
            case 7:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(Color.class), Color.Companion.serializer(), new KSerializer[0]);
            case 8:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(Dp.class), Dp$$serializer.INSTANCE, new KSerializer[0]);
            case 9:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(Dp.class), Dp$$serializer.INSTANCE, new KSerializer[0]);
            case 10:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(Dp.class), Dp$$serializer.INSTANCE, new KSerializer[0]);
            case 11:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(Dp.class), Dp$$serializer.INSTANCE, new KSerializer[0]);
            case 12:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(cls), BooleanSerializer.INSTANCE, new KSerializer[0]);
            case 13:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(cls2), DoubleSerializer.INSTANCE, new KSerializer[0]);
            case 14:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(cls2), DoubleSerializer.INSTANCE, new KSerializer[0]);
            case 15:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(Dp.class), Dp$$serializer.INSTANCE, new KSerializer[0]);
            case 16:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(CrossAxisAlignment.class), CrossAxisAlignment$$serializer.INSTANCE, new KSerializer[0]);
            case 17:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(Margin.class), Margin$$serializer.INSTANCE, new KSerializer[0]);
            case 18:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(cls2), DoubleSerializer.INSTANCE, new KSerializer[0]);
            case 19:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(Dp.class), Dp$$serializer.INSTANCE, new KSerializer[0]);
            case 20:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(Dp.class), Dp$$serializer.INSTANCE, new KSerializer[0]);
            case 21:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(CrossAxisAlignment.class), CrossAxisAlignment$$serializer.INSTANCE, new KSerializer[0]);
            case 22:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(Dp.class), Dp$$serializer.INSTANCE, new KSerializer[0]);
            case 23:
                AccessibilityRoleType[] values = AccessibilityRoleType.values();
                values.getClass();
                return new EnumSerializer("app.cash.arcade.values.AccessibilityRoleType", (Enum[]) values);
            case 24:
                ArcadeTimelineItemState[] values2 = ArcadeTimelineItemState.values();
                values2.getClass();
                return new EnumSerializer("app.cash.arcade.values.ArcadeTimelineItemState", (Enum[]) values2);
            case 25:
                ReflectionFactory reflectionFactory = Reflection.factory;
                return new SealedClassSerializer("app.cash.arcade.values.Attribute", reflectionFactory.getOrCreateKotlinClass(Attribute.class), new KClass[]{reflectionFactory.getOrCreateKotlinClass(Attribute.Bold.class), reflectionFactory.getOrCreateKotlinClass(Attribute.Faded.class), reflectionFactory.getOrCreateKotlinClass(Attribute.ForegroundColor.class), reflectionFactory.getOrCreateKotlinClass(Attribute.Icon.class), reflectionFactory.getOrCreateKotlinClass(Attribute.Link.class), reflectionFactory.getOrCreateKotlinClass(Attribute.OrderedListItem.class), reflectionFactory.getOrCreateKotlinClass(Attribute.StrikeThrough.class), reflectionFactory.getOrCreateKotlinClass(Attribute.Underline.class), reflectionFactory.getOrCreateKotlinClass(Attribute.UnorderedListItem.class)}, new KSerializer[]{new EnumSerializer("Bold", Attribute.Bold.INSTANCE, new Annotation[0]), new EnumSerializer("Faded", Attribute.Faded.INSTANCE, new Annotation[0]), Attribute$ForegroundColor$$serializer.INSTANCE, Attribute$Icon$$serializer.INSTANCE, Attribute$Link$$serializer.INSTANCE, Attribute$OrderedListItem$$serializer.INSTANCE, new EnumSerializer("StrikeThrough", Attribute.StrikeThrough.INSTANCE, new Annotation[0]), new EnumSerializer("Underline", Attribute.Underline.INSTANCE, new Annotation[0]), new EnumSerializer("UnorderedListItem", Attribute.UnorderedListItem.INSTANCE, new Annotation[0])}, new Annotation[0]);
            case 26:
                return new EnumSerializer("Bold", Attribute.Bold.INSTANCE, new Annotation[0]);
            case 27:
                return new EnumSerializer("Faded", Attribute.Faded.INSTANCE, new Annotation[0]);
            case 28:
                return Color.Companion.serializer();
            default:
                return ImageResource.Companion.serializer();
        }
    }

    public /* synthetic */ Worker$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }
}
