package app.cash.arcade.values.benefitsTable;

import app.cash.arcade.values.Color;
import app.cash.arcade.values.ImageResource;
import app.cash.arcade.values.Shape$$ExternalSyntheticLambda0;
import app.cash.arcade.values.TextAlign;
import app.cash.arcade.values.TextStyle;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import designsystem.arcade.ArcadeColors;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@Serializable
/* loaded from: classes3.dex */
public interface BenefitsComparisonTableCell {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/benefitsTable/BenefitsComparisonTableCell$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/benefitsTable/BenefitsComparisonTableCell;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public final KSerializer serializer() {
            ReflectionFactory reflectionFactory = Reflection.factory;
            return new SealedClassSerializer("app.cash.arcade.values.benefitsTable.BenefitsComparisonTableCell", reflectionFactory.getOrCreateKotlinClass(BenefitsComparisonTableCell.class), new KClass[]{reflectionFactory.getOrCreateKotlinClass(IconCell.class), reflectionFactory.getOrCreateKotlinClass(TextCell.class)}, new KSerializer[]{BenefitsComparisonTableCell$IconCell$$serializer.INSTANCE, BenefitsComparisonTableCell$TextCell$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    @SerialName("Icon")
    @Serializable
    public final class IconCell implements BenefitsComparisonTableCell {
        public static final Lazy[] $childSerializers;
        public static final Companion Companion = new Companion();
        public final TextAlign alignment;
        public final Color backgroundColor;
        public final Color contentColor;
        public final String contentDescription;
        public final ImageResource icon;
        public final TextStyle style;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/benefitsTable/BenefitsComparisonTableCell$IconCell$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/benefitsTable/BenefitsComparisonTableCell$IconCell;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return BenefitsComparisonTableCell$IconCell$$serializer.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Shape$$ExternalSyntheticLambda0(13)), null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Shape$$ExternalSyntheticLambda0(14)), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Shape$$ExternalSyntheticLambda0(15)), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Shape$$ExternalSyntheticLambda0(16)), null};
        }

        public IconCell(int i, ImageResource imageResource, String str, TextAlign textAlign, Color color, Color color2, TextStyle textStyle) {
            if (3 != (i & 3)) {
                TuplesKt.throwMissingFieldException(i, 3, BenefitsComparisonTableCell$IconCell$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.icon = imageResource;
            this.contentDescription = str;
            if ((i & 4) == 0) {
                this.alignment = TextAlign.Natural;
            } else {
                this.alignment = textAlign;
            }
            if ((i & 8) == 0) {
                this.contentColor = ArcadeColors.IconStandard;
            } else {
                this.contentColor = color;
            }
            if ((i & 16) == 0) {
                this.backgroundColor = ArcadeColors.BackgroundApp;
            } else {
                this.backgroundColor = color2;
            }
            if ((i & 32) == 0) {
                this.style = new TextStyle.Token(AnnotatedPrivateKey.LABEL);
            } else {
                this.style = textStyle;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconCell)) {
                return false;
            }
            IconCell iconCell = (IconCell) obj;
            return Intrinsics.areEqual(this.icon, iconCell.icon) && Intrinsics.areEqual(this.contentDescription, iconCell.contentDescription) && this.alignment == iconCell.alignment && Intrinsics.areEqual(this.contentColor, iconCell.contentColor) && Intrinsics.areEqual(this.backgroundColor, iconCell.backgroundColor) && Intrinsics.areEqual(this.style, iconCell.style);
        }

        public final int hashCode() {
            return this.style.hashCode() + ((this.backgroundColor.hashCode() + ((this.contentColor.hashCode() + ((this.alignment.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.icon.hashCode() * 31, 31, this.contentDescription)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "IconCell(icon=" + this.icon + ", contentDescription=" + this.contentDescription + ", alignment=" + this.alignment + ", contentColor=" + this.contentColor + ", backgroundColor=" + this.backgroundColor + ", style=" + this.style + ")";
        }
    }

    @SerialName("Text")
    @Serializable
    public final class TextCell implements BenefitsComparisonTableCell {
        public static final Lazy[] $childSerializers;
        public static final Companion Companion = new Companion();
        public final TextAlign alignment;
        public final Color backgroundColor;
        public final Color contentColor;
        public final String contentDescription;
        public final TextStyle style;
        public final String text;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/benefitsTable/BenefitsComparisonTableCell$TextCell$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/benefitsTable/BenefitsComparisonTableCell$TextCell;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return BenefitsComparisonTableCell$TextCell$$serializer.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Shape$$ExternalSyntheticLambda0(17)), null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Shape$$ExternalSyntheticLambda0(18)), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Shape$$ExternalSyntheticLambda0(19)), null};
        }

        public TextCell(int i, String str, TextAlign textAlign, String str2, Color color, Color color2, TextStyle textStyle) {
            if (1 != (i & 1)) {
                TuplesKt.throwMissingFieldException(i, 1, BenefitsComparisonTableCell$TextCell$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.text = str;
            this.alignment = (i & 2) == 0 ? TextAlign.Natural : textAlign;
            if ((i & 4) == 0) {
                this.contentDescription = str;
            } else {
                this.contentDescription = str2;
            }
            if ((i & 8) == 0) {
                this.contentColor = ArcadeColors.TextStandard;
            } else {
                this.contentColor = color;
            }
            if ((i & 16) == 0) {
                this.backgroundColor = ArcadeColors.BackgroundApp;
            } else {
                this.backgroundColor = color2;
            }
            if ((i & 32) == 0) {
                this.style = new TextStyle.Token(AnnotatedPrivateKey.LABEL);
            } else {
                this.style = textStyle;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextCell)) {
                return false;
            }
            TextCell textCell = (TextCell) obj;
            return Intrinsics.areEqual(this.text, textCell.text) && this.alignment == textCell.alignment && Intrinsics.areEqual(this.contentDescription, textCell.contentDescription) && Intrinsics.areEqual(this.contentColor, textCell.contentColor) && Intrinsics.areEqual(this.backgroundColor, textCell.backgroundColor) && Intrinsics.areEqual(this.style, textCell.style);
        }

        public final int hashCode() {
            return this.style.hashCode() + ((this.backgroundColor.hashCode() + ((this.contentColor.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.alignment.hashCode() + (this.text.hashCode() * 31)) * 31, 31, this.contentDescription)) * 31)) * 31);
        }

        public final String toString() {
            return "TextCell(text=" + this.text + ", alignment=" + this.alignment + ", contentDescription=" + this.contentDescription + ", contentColor=" + this.contentColor + ", backgroundColor=" + this.backgroundColor + ", style=" + this.style + ")";
        }
    }
}
