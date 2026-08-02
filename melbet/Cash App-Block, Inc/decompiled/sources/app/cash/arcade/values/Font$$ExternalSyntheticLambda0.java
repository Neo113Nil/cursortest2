package app.cash.arcade.values;

import app.cash.arcade.values.Attribute;
import app.cash.arcade.values.AvatarSize;
import app.cash.arcade.values.BorderStyle;
import app.cash.arcade.values.ButtonProminence;
import app.cash.arcade.values.ButtonSize;
import app.cash.arcade.values.ButtonStyle;
import app.cash.arcade.values.Color;
import app.cash.arcade.values.ColorFilter;
import app.cash.arcade.values.DisplayCurrency;
import app.cash.arcade.values.DividerStyle;
import app.cash.arcade.values.Font;
import app.cash.arcade.values.IconSize;
import app.cash.arcade.values.ImageResource;
import app.cash.arcade.values.InputMode;
import app.cash.arcade.values.LegacyAmountInputSuffixBuilder;
import app.cash.arcade.values.LegacyAmountPickerConfig;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.HashSetSerializer;

/* loaded from: classes3.dex */
public final /* synthetic */ class Font$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Font$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                ReflectionFactory reflectionFactory = Reflection.factory;
                return new SealedClassSerializer("app.cash.arcade.values.Font", reflectionFactory.getOrCreateKotlinClass(Font.class), new KClass[]{reflectionFactory.getOrCreateKotlinClass(Font.Token.class)}, new KSerializer[]{Font$Token$$serializer.INSTANCE}, new Annotation[0]);
            case 1:
                return new EnumSerializer("StrikeThrough", Attribute.StrikeThrough.INSTANCE, new Annotation[0]);
            case 2:
                return new EnumSerializer("Underline", Attribute.Underline.INSTANCE, new Annotation[0]);
            case 3:
                return new EnumSerializer("UnorderedListItem", Attribute.UnorderedListItem.INSTANCE, new Annotation[0]);
            case 4:
                return Attribute.Companion.serializer();
            case 5:
                return new HashSetSerializer(AttributeRange$$serializer.INSTANCE, 1);
            case 6:
                return new EnumSerializer("AvatarAction", AvatarAction.INSTANCE, new Annotation[0]);
            case 7:
                ReflectionFactory reflectionFactory2 = Reflection.factory;
                return new SealedClassSerializer("app.cash.arcade.values.AvatarSize", reflectionFactory2.getOrCreateKotlinClass(AvatarSize.class), new KClass[]{reflectionFactory2.getOrCreateKotlinClass(AvatarSize.Pt.class)}, new KSerializer[]{AvatarSize$Pt$$serializer.INSTANCE}, new Annotation[0]);
            case 8:
                return new EnumSerializer("None", BorderStyle.None.INSTANCE, new Annotation[0]);
            case 9:
                return new EnumSerializer("Solid", BorderStyle.Solid.INSTANCE, new Annotation[0]);
            case 10:
                ReflectionFactory reflectionFactory3 = Reflection.factory;
                return new SealedClassSerializer("app.cash.arcade.values.ButtonProminence", reflectionFactory3.getOrCreateKotlinClass(ButtonProminence.class), new KClass[]{reflectionFactory3.getOrCreateKotlinClass(ButtonProminence.Id.class)}, new KSerializer[]{ButtonProminence$Id$$serializer.INSTANCE}, new Annotation[0]);
            case 11:
                ReflectionFactory reflectionFactory4 = Reflection.factory;
                return new SealedClassSerializer("app.cash.arcade.values.ButtonSize", reflectionFactory4.getOrCreateKotlinClass(ButtonSize.class), new KClass[]{reflectionFactory4.getOrCreateKotlinClass(ButtonSize.Id.class)}, new KSerializer[]{ButtonSize$Id$$serializer.INSTANCE}, new Annotation[0]);
            case 12:
                ReflectionFactory reflectionFactory5 = Reflection.factory;
                return new SealedClassSerializer("app.cash.arcade.values.ButtonStyle", reflectionFactory5.getOrCreateKotlinClass(ButtonStyle.class), new KClass[]{reflectionFactory5.getOrCreateKotlinClass(ButtonStyle.Id.class)}, new KSerializer[]{ButtonStyle$Id$$serializer.INSTANCE}, new Annotation[0]);
            case 13:
                return Color.Companion.serializer();
            case 14:
                ReflectionFactory reflectionFactory6 = Reflection.factory;
                return new SealedClassSerializer("app.cash.arcade.values.Color", reflectionFactory6.getOrCreateKotlinClass(Color.class), new KClass[]{reflectionFactory6.getOrCreateKotlinClass(Color.Code.class), reflectionFactory6.getOrCreateKotlinClass(Color.Id.class), reflectionFactory6.getOrCreateKotlinClass(Color.Token.class)}, new KSerializer[]{Color$Code$$serializer.INSTANCE, Color$Id$$serializer.INSTANCE, Color$Token$$serializer.INSTANCE}, new Annotation[0]);
            case 15:
                ReflectionFactory reflectionFactory7 = Reflection.factory;
                return new SealedClassSerializer("app.cash.arcade.values.ColorFilter", reflectionFactory7.getOrCreateKotlinClass(ColorFilter.class), new KClass[]{reflectionFactory7.getOrCreateKotlinClass(ColorFilter.SetToSaturation.class)}, new KSerializer[]{ColorFilter$SetToSaturation$$serializer.INSTANCE}, new Annotation[0]);
            case 16:
                DisplayCurrency.BitcoinDisplayUnits[] values = DisplayCurrency.BitcoinDisplayUnits.values();
                values.getClass();
                return new EnumSerializer("app.cash.arcade.values.DisplayCurrency.BitcoinDisplayUnits", (Enum[]) values);
            case 17:
                ReflectionFactory reflectionFactory8 = Reflection.factory;
                return new SealedClassSerializer("app.cash.arcade.values.DividerStyle", reflectionFactory8.getOrCreateKotlinClass(DividerStyle.class), new KClass[]{reflectionFactory8.getOrCreateKotlinClass(DividerStyle.Id.class)}, new KSerializer[]{DividerStyle$Id$$serializer.INSTANCE}, new Annotation[0]);
            case 18:
                return ImageResource.Companion.serializer();
            case 19:
                ReflectionFactory reflectionFactory9 = Reflection.factory;
                return new SealedClassSerializer("app.cash.arcade.values.IconSize", reflectionFactory9.getOrCreateKotlinClass(IconSize.class), new KClass[]{reflectionFactory9.getOrCreateKotlinClass(IconSize.Pt.class)}, new KSerializer[]{IconSize$Pt$$serializer.INSTANCE}, new Annotation[0]);
            case 20:
                ReflectionFactory reflectionFactory10 = Reflection.factory;
                return new SealedClassSerializer("app.cash.arcade.values.ImageResource", reflectionFactory10.getOrCreateKotlinClass(ImageResource.class), new KClass[]{reflectionFactory10.getOrCreateKotlinClass(ImageResource.Id.class), reflectionFactory10.getOrCreateKotlinClass(ImageResource.Token.class), reflectionFactory10.getOrCreateKotlinClass(ImageResource.Url.class)}, new KSerializer[]{ImageResource$Id$$serializer.INSTANCE, ImageResource$Token$$serializer.INSTANCE, ImageResource$Url$$serializer.INSTANCE}, new Annotation[0]);
            case 21:
                ImageResource.Url.RenderingMode[] values2 = ImageResource.Url.RenderingMode.values();
                values2.getClass();
                return new EnumSerializer("app.cash.arcade.values.ImageResource.Url.RenderingMode", (Enum[]) values2);
            case 22:
                return ImageResource.Companion.serializer();
            case 23:
                ReflectionFactory reflectionFactory11 = Reflection.factory;
                return new SealedClassSerializer("app.cash.arcade.values.InputMode", reflectionFactory11.getOrCreateKotlinClass(InputMode.class), new KClass[]{reflectionFactory11.getOrCreateKotlinClass(InputMode.Id.class)}, new KSerializer[]{InputMode$Id$$serializer.INSTANCE}, new Annotation[0]);
            case 24:
                KeypadExtraKey[] values3 = KeypadExtraKey.values();
                values3.getClass();
                return new EnumSerializer("app.cash.arcade.values.KeypadExtraKey", (Enum[]) values3);
            case 25:
                return new EnumSerializer("Empty", LegacyAmountInputSuffixBuilder.Empty.INSTANCE, new Annotation[0]);
            case 26:
                return new EnumSerializer("Satoshis", LegacyAmountInputSuffixBuilder.Satoshis.INSTANCE, new Annotation[0]);
            case 27:
                return LegacyAmountInputSuffixBuilder.Companion.serializer();
            case 28:
                return LegacyAmountContentLabelBuilder.Companion.serializer();
            default:
                return new EnumSerializer("PercentInput", LegacyAmountPickerConfig.PercentInput.INSTANCE, new Annotation[0]);
        }
    }
}
