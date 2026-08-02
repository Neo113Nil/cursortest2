package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaveableHolder;
import androidx.compose.runtime.saveable.Saver;
import androidx.room.TransactorKt$$ExternalSyntheticLambda0;
import androidx.work.impl.WorkLauncherImpl;

/* loaded from: classes.dex */
public abstract class SaversKt {
    public static final WorkLauncherImpl AnnotatedStringSaver;
    public static final WorkLauncherImpl AnnotationRangeListSaver;
    public static final WorkLauncherImpl AnnotationRangeSaver;
    public static final WorkLauncherImpl BaselineShiftSaver;
    public static final WorkLauncherImpl ClickableSaver;
    public static final WorkLauncherImpl FontStyleSaver;
    public static final WorkLauncherImpl FontSynthesisSaver;
    public static final WorkLauncherImpl FontWeightSaver;
    public static final SaversKt$NonNullValueClassSaver$1 HyphensSaver;
    public static final SaversKt$NonNullValueClassSaver$1 LineHeightStyleAlignmentSaver;
    public static final WorkLauncherImpl LineHeightStyleSaver;
    public static final WorkLauncherImpl LinkSaver;
    public static final WorkLauncherImpl LocaleListSaver;
    public static final WorkLauncherImpl LocaleSaver;
    public static final SaversKt$NonNullValueClassSaver$1 OffsetSaver;
    public static final WorkLauncherImpl ParagraphStyleSaver;
    public static final WorkLauncherImpl ShadowSaver;
    public static final WorkLauncherImpl SpanStyleSaver;
    public static final SaversKt$NonNullValueClassSaver$1 TextAlignSaver;
    public static final WorkLauncherImpl TextDecorationSaver;
    public static final SaversKt$NonNullValueClassSaver$1 TextDirectionSaver;
    public static final WorkLauncherImpl TextGeometricTransformSaver;
    public static final WorkLauncherImpl TextIndentSaver;
    public static final WorkLauncherImpl TextLinkStylesSaver;
    public static final WorkLauncherImpl TextRangeSaver;
    public static final SaversKt$NonNullValueClassSaver$1 TextUnitSaver;
    public static final SaversKt$NonNullValueClassSaver$1 TextUnitTypeSaver;
    public static final WorkLauncherImpl UrlAnnotationSaver;
    public static final WorkLauncherImpl VerbatimTtsAnnotationSaver;
    public static final SaversKt$NonNullValueClassSaver$1 ColorSaver = new SaversKt$NonNullValueClassSaver$1(SaversKt$ColorSaver$1.INSTANCE, SaversKt$ColorSaver$2.INSTANCE);
    public static final SaversKt$NonNullValueClassSaver$1 LineHeightStyleTrimSaver = new SaversKt$NonNullValueClassSaver$1(new SaversKt$$ExternalSyntheticLambda0(29), new TransactorKt$$ExternalSyntheticLambda0(9));
    public static final SaversKt$NonNullValueClassSaver$1 LineHeightStyleModeSaver = new SaversKt$NonNullValueClassSaver$1(new SaversKt$$ExternalSyntheticLambda5(1), new TransactorKt$$ExternalSyntheticLambda0(11));

    static {
        int i = 0;
        int i2 = 16;
        int i3 = 8;
        AnnotatedStringSaver = new WorkLauncherImpl(i3, new SaversKt$$ExternalSyntheticLambda0(i), new SaversKt$$ExternalSyntheticLambda2(i2));
        int i4 = 12;
        AnnotationRangeListSaver = new WorkLauncherImpl(i3, new SaversKt$$ExternalSyntheticLambda0(i4), new SaversKt$$ExternalSyntheticLambda2(27));
        int i5 = 24;
        int i6 = 10;
        AnnotationRangeSaver = new WorkLauncherImpl(i3, new SaversKt$$ExternalSyntheticLambda0(i5), new TransactorKt$$ExternalSyntheticLambda0(i6));
        int i7 = 2;
        VerbatimTtsAnnotationSaver = new WorkLauncherImpl(i3, new SaversKt$$ExternalSyntheticLambda5(i7), new TransactorKt$$ExternalSyntheticLambda0(i4));
        int i8 = 3;
        int i9 = 13;
        UrlAnnotationSaver = new WorkLauncherImpl(i3, new SaversKt$$ExternalSyntheticLambda5(i8), new TransactorKt$$ExternalSyntheticLambda0(i9));
        LinkSaver = new WorkLauncherImpl(i3, new SaversKt$$ExternalSyntheticLambda0(i6), new SaversKt$$ExternalSyntheticLambda2(i));
        int i10 = 21;
        int i11 = 6;
        ClickableSaver = new WorkLauncherImpl(i3, new SaversKt$$ExternalSyntheticLambda0(i10), new TransactorKt$$ExternalSyntheticLambda0(i11));
        int i12 = 14;
        ParagraphStyleSaver = new WorkLauncherImpl(i3, new SaversKt$$ExternalSyntheticLambda5(i), new TransactorKt$$ExternalSyntheticLambda0(i12));
        int i13 = 15;
        SpanStyleSaver = new WorkLauncherImpl(i3, new SaversKt$$ExternalSyntheticLambda5(4), new TransactorKt$$ExternalSyntheticLambda0(i13));
        TextLinkStylesSaver = new WorkLauncherImpl(i3, new SaversKt$$ExternalSyntheticLambda5(5), new SaversKt$$ExternalSyntheticLambda2(i13));
        int i14 = 17;
        TextDecorationSaver = new WorkLauncherImpl(i3, new SaversKt$$ExternalSyntheticLambda0(i11), new SaversKt$$ExternalSyntheticLambda2(i14));
        int i15 = 18;
        TextGeometricTransformSaver = new WorkLauncherImpl(i3, new SaversKt$$ExternalSyntheticLambda0(7), new SaversKt$$ExternalSyntheticLambda2(i15));
        int i16 = 19;
        TextIndentSaver = new WorkLauncherImpl(i3, new SaversKt$$ExternalSyntheticLambda0(i3), new SaversKt$$ExternalSyntheticLambda2(i16));
        int i17 = 20;
        FontWeightSaver = new WorkLauncherImpl(i3, new SaversKt$$ExternalSyntheticLambda0(9), new SaversKt$$ExternalSyntheticLambda2(i17));
        BaselineShiftSaver = new WorkLauncherImpl(i3, new SaversKt$$ExternalSyntheticLambda0(11), new SaversKt$$ExternalSyntheticLambda2(i10));
        TextRangeSaver = new WorkLauncherImpl(i3, new SaversKt$$ExternalSyntheticLambda0(i9), new SaversKt$$ExternalSyntheticLambda2(22));
        ShadowSaver = new WorkLauncherImpl(i3, new SaversKt$$ExternalSyntheticLambda0(i12), new SaversKt$$ExternalSyntheticLambda2(23));
        TextAlignSaver = new SaversKt$NonNullValueClassSaver$1(new SaversKt$$ExternalSyntheticLambda0(i13), new SaversKt$$ExternalSyntheticLambda2(i5));
        TextDirectionSaver = new SaversKt$NonNullValueClassSaver$1(new SaversKt$$ExternalSyntheticLambda0(i2), new SaversKt$$ExternalSyntheticLambda2(25));
        HyphensSaver = new SaversKt$NonNullValueClassSaver$1(new SaversKt$$ExternalSyntheticLambda0(i14), new SaversKt$$ExternalSyntheticLambda2(26));
        FontStyleSaver = new WorkLauncherImpl(i3, new SaversKt$$ExternalSyntheticLambda0(i15), new SaversKt$$ExternalSyntheticLambda2(28));
        FontSynthesisSaver = new WorkLauncherImpl(i3, new SaversKt$$ExternalSyntheticLambda0(i16), new SaversKt$$ExternalSyntheticLambda2(29));
        TextUnitSaver = new SaversKt$NonNullValueClassSaver$1(new SaversKt$$ExternalSyntheticLambda0(i17), new TransactorKt$$ExternalSyntheticLambda0(1));
        TextUnitTypeSaver = new SaversKt$NonNullValueClassSaver$1(new SaversKt$$ExternalSyntheticLambda0(22), new TransactorKt$$ExternalSyntheticLambda0(i7));
        OffsetSaver = new SaversKt$NonNullValueClassSaver$1(new SaversKt$$ExternalSyntheticLambda0(23), new TransactorKt$$ExternalSyntheticLambda0(i8));
        LocaleListSaver = new WorkLauncherImpl(i3, new SaversKt$$ExternalSyntheticLambda0(25), new TransactorKt$$ExternalSyntheticLambda0(4));
        LocaleSaver = new WorkLauncherImpl(i3, new SaversKt$$ExternalSyntheticLambda0(26), new TransactorKt$$ExternalSyntheticLambda0(5));
        LineHeightStyleSaver = new WorkLauncherImpl(i3, new SaversKt$$ExternalSyntheticLambda0(27), new TransactorKt$$ExternalSyntheticLambda0(7));
        LineHeightStyleAlignmentSaver = new SaversKt$NonNullValueClassSaver$1(new SaversKt$$ExternalSyntheticLambda0(28), new TransactorKt$$ExternalSyntheticLambda0(i3));
    }

    public static final Object save(Object obj, Saver saver, SaveableHolder saveableHolder) {
        Object save;
        return (obj == null || (save = saver.save(saveableHolder, obj)) == null) ? Boolean.FALSE : save;
    }
}
