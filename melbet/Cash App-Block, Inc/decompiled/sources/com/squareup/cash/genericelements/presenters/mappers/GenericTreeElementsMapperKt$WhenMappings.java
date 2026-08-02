package com.squareup.cash.genericelements.presenters.mappers;

import com.squareup.protos.cash.cashsuggest.api.ImageLayout;
import com.squareup.protos.cash.compass.api.RadioType;
import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.protos.cash.genericelements.ui.ArcadeBadgedAvatarElement;
import com.squareup.protos.cash.genericelements.ui.AvatarElement;
import com.squareup.protos.cash.genericelements.ui.BetweenSectionSpacer;
import com.squareup.protos.cash.genericelements.ui.BlankDividerComponent;
import com.squareup.protos.cash.genericelements.ui.BlankDividerElement;
import com.squareup.protos.cash.genericelements.ui.ContainerElement;
import com.squareup.protos.cash.genericelements.ui.ImageElement;
import com.squareup.protos.cash.genericelements.ui.Size;
import com.squareup.protos.cash.genericelements.ui.TwoColumnCardComponent;
import com.squareup.protos.cash.genericelements.ui.TwoColumnComponent;
import com.squareup.protos.cash.genericelements.ui.TwoColumnRowComponent;
import com.squareup.protos.cash.genericelements.ui.WithinSectionSpacer;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.grantly.api.Channel;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class GenericTreeElementsMapperKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;
    public static final /* synthetic */ int[] $EnumSwitchMapping$7;

    static {
        int[] iArr = new int[GenericContainerType.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            GenericContainerType genericContainerType = GenericContainerType.COMPONENT_CONTAINER;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            GenericContainerType genericContainerType2 = GenericContainerType.COMPONENT_CONTAINER;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            GenericContainerType genericContainerType3 = GenericContainerType.COMPONENT_CONTAINER;
            iArr[3] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[ContainerElement.Margin.MarginSize.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            Alignment.Companion companion = ContainerElement.Margin.MarginSize.Companion;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            Alignment.Companion companion2 = ContainerElement.Margin.MarginSize.Companion;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            Alignment.Companion companion3 = ContainerElement.Margin.MarginSize.Companion;
            iArr2[4] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            Alignment.Companion companion4 = ContainerElement.Margin.MarginSize.Companion;
            iArr2[3] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        int[] iArr3 = new int[GenericComponentType.values().length];
        try {
            iArr3[0] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            GenericComponentType genericComponentType = GenericComponentType.TWO_COLUMN;
            iArr3[1] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            GenericComponentType genericComponentType2 = GenericComponentType.TWO_COLUMN;
            iArr3[3] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            GenericComponentType genericComponentType3 = GenericComponentType.TWO_COLUMN;
            iArr3[4] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            GenericComponentType genericComponentType4 = GenericComponentType.TWO_COLUMN;
            iArr3[5] = 5;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            GenericComponentType genericComponentType5 = GenericComponentType.TWO_COLUMN;
            iArr3[2] = 6;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            GenericComponentType genericComponentType6 = GenericComponentType.TWO_COLUMN;
            iArr3[6] = 7;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            GenericComponentType genericComponentType7 = GenericComponentType.TWO_COLUMN;
            iArr3[7] = 8;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            GenericComponentType genericComponentType8 = GenericComponentType.TWO_COLUMN;
            iArr3[8] = 9;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            GenericComponentType genericComponentType9 = GenericComponentType.TWO_COLUMN;
            iArr3[9] = 10;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            GenericComponentType genericComponentType10 = GenericComponentType.TWO_COLUMN;
            iArr3[10] = 11;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            GenericComponentType genericComponentType11 = GenericComponentType.TWO_COLUMN;
            iArr3[11] = 12;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            GenericComponentType genericComponentType12 = GenericComponentType.TWO_COLUMN;
            iArr3[12] = 13;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            GenericComponentType genericComponentType13 = GenericComponentType.TWO_COLUMN;
            iArr3[13] = 14;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            GenericComponentType genericComponentType14 = GenericComponentType.TWO_COLUMN;
            iArr3[14] = 15;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            GenericComponentType genericComponentType15 = GenericComponentType.TWO_COLUMN;
            iArr3[15] = 16;
        } catch (NoSuchFieldError unused25) {
        }
        $EnumSwitchMapping$2 = iArr3;
        int[] iArr4 = new int[TwoColumnComponent.Spacing.values().length];
        try {
            iArr4[0] = 1;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            Action.Type.Companion companion5 = TwoColumnComponent.Spacing.Companion;
            iArr4[1] = 2;
        } catch (NoSuchFieldError unused27) {
        }
        int[] iArr5 = new int[TwoColumnCardComponent.Spacing.values().length];
        try {
            iArr5[0] = 1;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            ImageLayout.Companion companion6 = TwoColumnCardComponent.Spacing.Companion;
            iArr5[1] = 2;
        } catch (NoSuchFieldError unused29) {
        }
        int[] iArr6 = new int[TwoColumnRowComponent.Spacing.values().length];
        try {
            iArr6[0] = 1;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            Alignment.Companion companion7 = TwoColumnRowComponent.Spacing.Companion;
            iArr6[1] = 2;
        } catch (NoSuchFieldError unused31) {
        }
        int[] iArr7 = new int[BlankDividerComponent.Size.values().length];
        try {
            iArr7[0] = 1;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            Alignment.Companion companion8 = BlankDividerComponent.Size.Companion;
            iArr7[1] = 2;
        } catch (NoSuchFieldError unused33) {
        }
        int[] iArr8 = new int[GenericBaseType.values().length];
        try {
            iArr8[0] = 1;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            GenericBaseType genericBaseType = GenericBaseType.TEXT;
            iArr8[1] = 2;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            GenericBaseType genericBaseType2 = GenericBaseType.TEXT;
            iArr8[2] = 3;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            GenericBaseType genericBaseType3 = GenericBaseType.TEXT;
            iArr8[3] = 4;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            GenericBaseType genericBaseType4 = GenericBaseType.TEXT;
            iArr8[4] = 5;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            GenericBaseType genericBaseType5 = GenericBaseType.TEXT;
            iArr8[5] = 6;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            GenericBaseType genericBaseType6 = GenericBaseType.TEXT;
            iArr8[6] = 7;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            GenericBaseType genericBaseType7 = GenericBaseType.TEXT;
            iArr8[7] = 8;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            GenericBaseType genericBaseType8 = GenericBaseType.TEXT;
            iArr8[8] = 9;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            GenericBaseType genericBaseType9 = GenericBaseType.TEXT;
            iArr8[9] = 10;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            GenericBaseType genericBaseType10 = GenericBaseType.TEXT;
            iArr8[10] = 11;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            GenericBaseType genericBaseType11 = GenericBaseType.TEXT;
            iArr8[11] = 12;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            GenericBaseType genericBaseType12 = GenericBaseType.TEXT;
            iArr8[12] = 13;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            GenericBaseType genericBaseType13 = GenericBaseType.TEXT;
            iArr8[13] = 14;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            GenericBaseType genericBaseType14 = GenericBaseType.TEXT;
            iArr8[14] = 15;
        } catch (NoSuchFieldError unused48) {
        }
        $EnumSwitchMapping$7 = iArr8;
        int[] iArr9 = new int[ImageElement.Size.values().length];
        try {
            iArr9[0] = 1;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            Channel.Companion companion9 = ImageElement.Size.Companion;
            iArr9[1] = 2;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            Channel.Companion companion10 = ImageElement.Size.Companion;
            iArr9[2] = 3;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            Channel.Companion companion11 = ImageElement.Size.Companion;
            iArr9[3] = 4;
        } catch (NoSuchFieldError unused52) {
        }
        int[] iArr10 = new int[Size.values().length];
        try {
            iArr10[0] = 1;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            Channel.Companion companion12 = Size.Companion;
            iArr10[1] = 2;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            Channel.Companion companion13 = Size.Companion;
            iArr10[2] = 3;
        } catch (NoSuchFieldError unused55) {
        }
        int[] iArr11 = new int[AvatarElement.Size.values().length];
        try {
            iArr11[0] = 1;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            ImageLayout.Companion companion14 = AvatarElement.Size.Companion;
            iArr11[1] = 2;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            ImageLayout.Companion companion15 = AvatarElement.Size.Companion;
            iArr11[2] = 3;
        } catch (NoSuchFieldError unused58) {
        }
        int[] iArr12 = new int[ArcadeBadgedAvatarElement.Size.values().length];
        try {
            iArr12[0] = 1;
        } catch (NoSuchFieldError unused59) {
        }
        try {
            Channel.Companion companion16 = ArcadeBadgedAvatarElement.Size.Companion;
            iArr12[1] = 2;
        } catch (NoSuchFieldError unused60) {
        }
        try {
            Channel.Companion companion17 = ArcadeBadgedAvatarElement.Size.Companion;
            iArr12[2] = 3;
        } catch (NoSuchFieldError unused61) {
        }
        try {
            Channel.Companion companion18 = ArcadeBadgedAvatarElement.Size.Companion;
            iArr12[3] = 4;
        } catch (NoSuchFieldError unused62) {
        }
        int[] iArr13 = new int[BlankDividerElement.Size.values().length];
        try {
            iArr13[0] = 1;
        } catch (NoSuchFieldError unused63) {
        }
        try {
            Channel.Companion companion19 = BlankDividerElement.Size.Companion;
            iArr13[1] = 2;
        } catch (NoSuchFieldError unused64) {
        }
        try {
            Channel.Companion companion20 = BlankDividerElement.Size.Companion;
            iArr13[2] = 3;
        } catch (NoSuchFieldError unused65) {
        }
        int[] iArr14 = new int[WithinSectionSpacer.Size.values().length];
        try {
            iArr14[0] = 1;
        } catch (NoSuchFieldError unused66) {
        }
        try {
            RadioType.Companion companion21 = WithinSectionSpacer.Size.Companion;
            iArr14[1] = 2;
        } catch (NoSuchFieldError unused67) {
        }
        int[] iArr15 = new int[BetweenSectionSpacer.Size.values().length];
        try {
            iArr15[0] = 1;
        } catch (NoSuchFieldError unused68) {
        }
        try {
            Action.Type.Companion companion22 = BetweenSectionSpacer.Size.Companion;
            iArr15[1] = 2;
        } catch (NoSuchFieldError unused69) {
        }
        try {
            Action.Type.Companion companion23 = BetweenSectionSpacer.Size.Companion;
            iArr15[2] = 3;
        } catch (NoSuchFieldError unused70) {
        }
    }
}
