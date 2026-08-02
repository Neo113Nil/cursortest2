package androidx.glance.appwidget;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class LayoutType {
    public static final /* synthetic */ LayoutType[] $VALUES;
    public static final LayoutType Box;
    public static final LayoutType Button;
    public static final LayoutType CheckBox;
    public static final LayoutType CheckBoxBackport;
    public static final LayoutType CircularProgressIndicator;
    public static final LayoutType Column;
    public static final LayoutType Frame;
    public static final LayoutType ImageCrop;
    public static final LayoutType ImageCropDecorative;
    public static final LayoutType ImageFillBounds;
    public static final LayoutType ImageFillBoundsDecorative;
    public static final LayoutType ImageFit;
    public static final LayoutType ImageFitDecorative;
    public static final LayoutType LinearProgressIndicator;
    public static final LayoutType List;
    public static final LayoutType RadioButton;
    public static final LayoutType RadioButtonBackport;
    public static final LayoutType RadioColumn;
    public static final LayoutType RadioRow;
    public static final LayoutType Row;
    public static final LayoutType Swtch;
    public static final LayoutType SwtchBackport;
    public static final LayoutType Text;
    public static final LayoutType VerticalGridAutoFit;
    public static final LayoutType VerticalGridFiveColumns;
    public static final LayoutType VerticalGridFourColumns;
    public static final LayoutType VerticalGridOneColumn;
    public static final LayoutType VerticalGridThreeColumns;
    public static final LayoutType VerticalGridTwoColumns;

    static {
        LayoutType layoutType = new LayoutType("Row", 0);
        Row = layoutType;
        LayoutType layoutType2 = new LayoutType("Column", 1);
        Column = layoutType2;
        LayoutType layoutType3 = new LayoutType("Box", 2);
        Box = layoutType3;
        LayoutType layoutType4 = new LayoutType("Text", 3);
        Text = layoutType4;
        LayoutType layoutType5 = new LayoutType("List", 4);
        List = layoutType5;
        LayoutType layoutType6 = new LayoutType("CheckBox", 5);
        CheckBox = layoutType6;
        LayoutType layoutType7 = new LayoutType("CheckBoxBackport", 6);
        CheckBoxBackport = layoutType7;
        LayoutType layoutType8 = new LayoutType("Button", 7);
        Button = layoutType8;
        LayoutType layoutType9 = new LayoutType("Frame", 8);
        Frame = layoutType9;
        LayoutType layoutType10 = new LayoutType("LinearProgressIndicator", 9);
        LinearProgressIndicator = layoutType10;
        LayoutType layoutType11 = new LayoutType("CircularProgressIndicator", 10);
        CircularProgressIndicator = layoutType11;
        LayoutType layoutType12 = new LayoutType("VerticalGridOneColumn", 11);
        VerticalGridOneColumn = layoutType12;
        LayoutType layoutType13 = new LayoutType("VerticalGridTwoColumns", 12);
        VerticalGridTwoColumns = layoutType13;
        LayoutType layoutType14 = new LayoutType("VerticalGridThreeColumns", 13);
        VerticalGridThreeColumns = layoutType14;
        LayoutType layoutType15 = new LayoutType("VerticalGridFourColumns", 14);
        VerticalGridFourColumns = layoutType15;
        LayoutType layoutType16 = new LayoutType("VerticalGridFiveColumns", 15);
        VerticalGridFiveColumns = layoutType16;
        LayoutType layoutType17 = new LayoutType("VerticalGridAutoFit", 16);
        VerticalGridAutoFit = layoutType17;
        LayoutType layoutType18 = new LayoutType("Swtch", 17);
        Swtch = layoutType18;
        LayoutType layoutType19 = new LayoutType("SwtchBackport", 18);
        SwtchBackport = layoutType19;
        LayoutType layoutType20 = new LayoutType("ImageCrop", 19);
        ImageCrop = layoutType20;
        LayoutType layoutType21 = new LayoutType("ImageFit", 20);
        ImageFit = layoutType21;
        LayoutType layoutType22 = new LayoutType("ImageFillBounds", 21);
        ImageFillBounds = layoutType22;
        LayoutType layoutType23 = new LayoutType("ImageCropDecorative", 22);
        ImageCropDecorative = layoutType23;
        LayoutType layoutType24 = new LayoutType("ImageFitDecorative", 23);
        ImageFitDecorative = layoutType24;
        LayoutType layoutType25 = new LayoutType("ImageFillBoundsDecorative", 24);
        ImageFillBoundsDecorative = layoutType25;
        LayoutType layoutType26 = new LayoutType("RadioButton", 25);
        RadioButton = layoutType26;
        LayoutType layoutType27 = new LayoutType("RadioButtonBackport", 26);
        RadioButtonBackport = layoutType27;
        LayoutType layoutType28 = new LayoutType("RadioRow", 27);
        RadioRow = layoutType28;
        LayoutType layoutType29 = new LayoutType("RadioColumn", 28);
        RadioColumn = layoutType29;
        $VALUES = new LayoutType[]{layoutType, layoutType2, layoutType3, layoutType4, layoutType5, layoutType6, layoutType7, layoutType8, layoutType9, layoutType10, layoutType11, layoutType12, layoutType13, layoutType14, layoutType15, layoutType16, layoutType17, layoutType18, layoutType19, layoutType20, layoutType21, layoutType22, layoutType23, layoutType24, layoutType25, layoutType26, layoutType27, layoutType28, layoutType29};
    }

    public static LayoutType valueOf(String str) {
        return (LayoutType) Enum.valueOf(LayoutType.class, str);
    }

    public static LayoutType[] values() {
        return (LayoutType[]) $VALUES.clone();
    }
}
