package androidx.glance.appwidget;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.unit.DpSize;
import androidx.glance.BackgroundModifier$Image;
import androidx.glance.GlanceModifier;
import androidx.glance.action.ActionModifier;
import androidx.glance.layout.HeightModifier;
import androidx.glance.layout.WidthModifier;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class SizeBoxKt$SizeBox$1$2$1 extends Lambda implements Function2 {
    public static final SizeBoxKt$SizeBox$1$2$1 INSTANCE;
    public static final SizeBoxKt$SizeBox$1$2$1 INSTANCE$1;
    public static final SizeBoxKt$SizeBox$1$2$1 INSTANCE$10;
    public static final SizeBoxKt$SizeBox$1$2$1 INSTANCE$11;
    public static final SizeBoxKt$SizeBox$1$2$1 INSTANCE$12;
    public static final SizeBoxKt$SizeBox$1$2$1 INSTANCE$13;
    public static final SizeBoxKt$SizeBox$1$2$1 INSTANCE$14;
    public static final SizeBoxKt$SizeBox$1$2$1 INSTANCE$15;
    public static final SizeBoxKt$SizeBox$1$2$1 INSTANCE$16;
    public static final SizeBoxKt$SizeBox$1$2$1 INSTANCE$17;
    public static final SizeBoxKt$SizeBox$1$2$1 INSTANCE$18;
    public static final SizeBoxKt$SizeBox$1$2$1 INSTANCE$19;
    public static final SizeBoxKt$SizeBox$1$2$1 INSTANCE$2;
    public static final SizeBoxKt$SizeBox$1$2$1 INSTANCE$20;
    public static final SizeBoxKt$SizeBox$1$2$1 INSTANCE$21;
    public static final SizeBoxKt$SizeBox$1$2$1 INSTANCE$22;
    public static final SizeBoxKt$SizeBox$1$2$1 INSTANCE$23;
    public static final SizeBoxKt$SizeBox$1$2$1 INSTANCE$3;
    public static final SizeBoxKt$SizeBox$1$2$1 INSTANCE$4;
    public static final SizeBoxKt$SizeBox$1$2$1 INSTANCE$5;
    public static final SizeBoxKt$SizeBox$1$2$1 INSTANCE$6;
    public static final SizeBoxKt$SizeBox$1$2$1 INSTANCE$7;
    public static final SizeBoxKt$SizeBox$1$2$1 INSTANCE$8;
    public static final SizeBoxKt$SizeBox$1$2$1 INSTANCE$9;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 2;
        INSTANCE$1 = new SizeBoxKt$SizeBox$1$2$1(i, 1);
        INSTANCE$2 = new SizeBoxKt$SizeBox$1$2$1(i, 2);
        INSTANCE$3 = new SizeBoxKt$SizeBox$1$2$1(i, 3);
        INSTANCE$4 = new SizeBoxKt$SizeBox$1$2$1(i, 4);
        INSTANCE$5 = new SizeBoxKt$SizeBox$1$2$1(i, 5);
        INSTANCE$6 = new SizeBoxKt$SizeBox$1$2$1(i, 6);
        INSTANCE$7 = new SizeBoxKt$SizeBox$1$2$1(i, 7);
        INSTANCE$8 = new SizeBoxKt$SizeBox$1$2$1(i, 8);
        INSTANCE$9 = new SizeBoxKt$SizeBox$1$2$1(i, 9);
        INSTANCE$10 = new SizeBoxKt$SizeBox$1$2$1(i, 10);
        INSTANCE$11 = new SizeBoxKt$SizeBox$1$2$1(i, 11);
        INSTANCE$12 = new SizeBoxKt$SizeBox$1$2$1(i, 12);
        INSTANCE$13 = new SizeBoxKt$SizeBox$1$2$1(i, 13);
        INSTANCE$14 = new SizeBoxKt$SizeBox$1$2$1(i, 14);
        INSTANCE$15 = new SizeBoxKt$SizeBox$1$2$1(i, 15);
        INSTANCE$16 = new SizeBoxKt$SizeBox$1$2$1(i, 16);
        INSTANCE$17 = new SizeBoxKt$SizeBox$1$2$1(i, 17);
        INSTANCE$18 = new SizeBoxKt$SizeBox$1$2$1(i, 18);
        INSTANCE = new SizeBoxKt$SizeBox$1$2$1(i, 0);
        INSTANCE$19 = new SizeBoxKt$SizeBox$1$2$1(i, 19);
        INSTANCE$20 = new SizeBoxKt$SizeBox$1$2$1(i, 20);
        INSTANCE$21 = new SizeBoxKt$SizeBox$1$2$1(i, 21);
        INSTANCE$22 = new SizeBoxKt$SizeBox$1$2$1(i, 22);
        INSTANCE$23 = new SizeBoxKt$SizeBox$1$2$1(i, 23);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeBoxKt$SizeBox$1$2$1(int i) {
        super(2);
        this.$r8$classId = 24;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((EmittableSizeBox) obj).size = ((DpSize) obj2).packedValue;
                return Unit.INSTANCE;
            case 1:
                GlanceModifier.Element element = (GlanceModifier.Element) obj2;
                return element instanceof WidthModifier ? element : obj;
            case 2:
                GlanceModifier.Element element2 = (GlanceModifier.Element) obj2;
                return element2 instanceof HeightModifier ? element2 : obj;
            case 3:
                GlanceModifier.Element element3 = (GlanceModifier.Element) obj2;
                return element3 instanceof WidthModifier ? element3 : obj;
            case 4:
                GlanceModifier.Element element4 = (GlanceModifier.Element) obj2;
                return element4 instanceof HeightModifier ? element4 : obj;
            case 5:
                GlanceModifier.Element element5 = (GlanceModifier.Element) obj2;
                return element5 instanceof WidthModifier ? element5 : obj;
            case 6:
                GlanceModifier.Element element6 = (GlanceModifier.Element) obj2;
                return element6 instanceof HeightModifier ? element6 : obj;
            case 7:
                GlanceModifier.Element element7 = (GlanceModifier.Element) obj2;
                return element7 instanceof AlignmentModifier ? element7 : obj;
            case 8:
                GlanceModifier.Element element8 = (GlanceModifier.Element) obj2;
                return element8 instanceof WidthModifier ? element8 : obj;
            case 9:
                GlanceModifier.Element element9 = (GlanceModifier.Element) obj2;
                return element9 instanceof HeightModifier ? element9 : obj;
            case 10:
                Pair pair = (Pair) obj;
                GlanceModifier.Element element10 = (GlanceModifier.Element) obj2;
                return element10 instanceof ActionModifier ? new Pair(element10, pair.second) : new Pair(pair.first, ((GlanceModifier) pair.second).then(element10));
            case 11:
                ExtractedSizeModifiers extractedSizeModifiers = (ExtractedSizeModifiers) obj;
                GlanceModifier.Element element11 = (GlanceModifier.Element) obj2;
                if ((element11 instanceof WidthModifier) || (element11 instanceof HeightModifier) || (element11 instanceof CornerRadiusModifier)) {
                    return new ExtractedSizeModifiers(extractedSizeModifiers.sizeModifiers.then(element11), extractedSizeModifiers.nonSizeModifiers);
                }
                return new ExtractedSizeModifiers(extractedSizeModifiers.sizeModifiers, extractedSizeModifiers.nonSizeModifiers.then(element11));
            case 12:
                GlanceModifier.Element element12 = (GlanceModifier.Element) obj2;
                return element12 instanceof HeightModifier ? element12 : obj;
            case 13:
                GlanceModifier.Element element13 = (GlanceModifier.Element) obj2;
                return element13 instanceof WidthModifier ? element13 : obj;
            case 14:
                GlanceModifier.Element element14 = (GlanceModifier.Element) obj2;
                return element14 instanceof HeightModifier ? element14 : obj;
            case 15:
                GlanceModifier.Element element15 = (GlanceModifier.Element) obj2;
                return element15 instanceof WidthModifier ? element15 : obj;
            case 16:
                Pair pair2 = (Pair) obj;
                GlanceModifier.Element element16 = (GlanceModifier.Element) obj2;
                return element16 instanceof BackgroundModifier$Image ? new Pair(element16, pair2.second) : new Pair(pair2.first, ((GlanceModifier) pair2.second).then(element16));
            case 17:
                Pair pair3 = (Pair) obj;
                GlanceModifier.Element element17 = (GlanceModifier.Element) obj2;
                return element17 instanceof ActionModifier ? new Pair(element17, pair3.second) : new Pair(pair3.first, ((GlanceModifier) pair3.second).then(element17));
            case 18:
                int intValue = ((Number) obj).intValue();
                if (((GlanceModifier.Element) obj2) instanceof ActionModifier) {
                    intValue++;
                }
                return Integer.valueOf(intValue);
            case 19:
                ((EmittableSizeBox) obj).sizeMode = (SizeMode) obj2;
                return Unit.INSTANCE;
            case 20:
                GlanceModifier.Element element18 = (GlanceModifier.Element) obj2;
                return element18 instanceof ActionModifier ? element18 : obj;
            case 21:
                return obj;
            case 22:
                GlanceModifier.Element element19 = (GlanceModifier.Element) obj2;
                return element19 instanceof WidthModifier ? element19 : obj;
            case 23:
                GlanceModifier.Element element20 = (GlanceModifier.Element) obj2;
                return element20 instanceof HeightModifier ? element20 : obj;
            default:
                ((Number) obj2).intValue();
                IgnoreResultKt.IgnoreResult((Composer) obj, 1);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SizeBoxKt$SizeBox$1$2$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }
}
