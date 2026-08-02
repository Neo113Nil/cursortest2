package com.squareup.cash.charting.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.ParagraphStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.TextUnit;
import androidx.room.Room;
import com.squareup.cash.offers.views.FittedTextState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt___StringsKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class SegmentedBarChartKt$$ExternalSyntheticLambda9 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ float f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ SegmentedBarChartKt$$ExternalSyntheticLambda9(float f, long j, TextMeasurer textMeasurer, int i) {
        this.f$1 = f;
        this.f$2 = j;
        this.f$0 = textMeasurer;
        this.f$3 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0127  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        FittedTextState fittedTextState;
        TextStyle textStyle;
        long j;
        String str;
        float f;
        int i = this.$r8$classId;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                SegmentedBarChartKt.m3464GridLinesJKjFIXU((List) obj3, this.f$1, this.f$2, (Composer) obj, Updater.updateChangedFlags(this.f$3 | 1));
                return Unit.INSTANCE;
            default:
                TextMeasurer textMeasurer = (TextMeasurer) obj3;
                FittedTextState fittedTextState2 = (FittedTextState) obj;
                Constraints constraints = (Constraints) obj2;
                fittedTextState2.getClass();
                TextStyle textStyle2 = fittedTextState2.style;
                String str2 = fittedTextState2.text;
                long j2 = textStyle2.spanStyle.fontSize;
                ParagraphStyle paragraphStyle = textStyle2.paragraphStyle;
                long j3 = paragraphStyle.lineHeight;
                boolean z = false;
                boolean z2 = ((double) this.f$1) > 1.0d;
                long j4 = j3;
                boolean z3 = false;
                while (true) {
                    long j5 = this.f$2;
                    Room.m1168checkArithmeticNB67dxo(j2, j5);
                    if (Float.compare(TextUnit.m1059getValueimpl(j2), TextUnit.m1059getValueimpl(j5)) > 0) {
                        String str3 = fittedTextState2.text;
                        long j6 = j2;
                        ParagraphStyle paragraphStyle2 = paragraphStyle;
                        fittedTextState = fittedTextState2;
                        str = str2;
                        TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(textStyle2, 0L, j6, null, null, 0L, null, 0L, null, null, null, paragraphStyle.textAlign, j4, null, null, 0, 16613373);
                        textStyle = textStyle2;
                        j = j6;
                        TextLayoutResult m979measurewNUYSr0$default = TextMeasurer.m979measurewNUYSr0$default(textMeasurer, str3, m994copyp1EtxEg$default, this.f$3, constraints.value, 972);
                        MultiParagraph multiParagraph = m979measurewNUYSr0$default.multiParagraph;
                        float f2 = 2.0f;
                        if (m979measurewNUYSr0$default.getDidOverflowHeight() && z2) {
                            long pack = Room.pack(4294967296L, TextUnit.m1059getValueimpl(j) - 2.0f);
                            Room.m1168checkArithmeticNB67dxo(pack, j5);
                            j4 = Float.compare(TextUnit.m1059getValueimpl(pack), TextUnit.m1059getValueimpl(j5)) < 0 ? j5 : pack;
                            fittedTextState2 = fittedTextState;
                            textStyle2 = textStyle;
                            j2 = j4;
                        } else {
                            int i2 = multiParagraph.lineCount;
                            int i3 = 1;
                            if (i2 > 1 && !z3) {
                                int i4 = i2 - 1;
                                int i5 = 0;
                                while (i5 < i4) {
                                    int lineEnd = multiParagraph.getLineEnd(i5, false) - i3;
                                    MultiParagraph multiParagraph2 = multiParagraph;
                                    str2 = str;
                                    Character orNull = StringsKt___StringsKt.getOrNull(lineEnd, str2);
                                    if (orNull != null) {
                                        f = f2;
                                        if (Character.isLetterOrDigit(orNull.charValue()) == i3) {
                                            long pack2 = Room.pack(4294967296L, TextUnit.m1059getValueimpl(j) - f);
                                            Room.m1168checkArithmeticNB67dxo(pack2, j5);
                                            j4 = Float.compare(TextUnit.m1059getValueimpl(pack2), TextUnit.m1059getValueimpl(j5)) >= 0 ? j5 : pack2;
                                            fittedTextState2 = fittedTextState;
                                            textStyle2 = textStyle;
                                            z = false;
                                            z3 = false;
                                            j2 = j4;
                                            paragraphStyle = paragraphStyle2;
                                        }
                                    } else {
                                        f = f2;
                                    }
                                    if (orNull != null && orNull.charValue() == '.') {
                                        long pack22 = Room.pack(4294967296L, TextUnit.m1059getValueimpl(j) - f);
                                        Room.m1168checkArithmeticNB67dxo(pack22, j5);
                                        if (Float.compare(TextUnit.m1059getValueimpl(pack22), TextUnit.m1059getValueimpl(j5)) >= 0) {
                                        }
                                        fittedTextState2 = fittedTextState;
                                        textStyle2 = textStyle;
                                        z = false;
                                        z3 = false;
                                        j2 = j4;
                                        paragraphStyle = paragraphStyle2;
                                    } else {
                                        i5++;
                                        f2 = f;
                                        str = str2;
                                        multiParagraph = multiParagraph2;
                                        i3 = 1;
                                        z3 = true;
                                    }
                                }
                                fittedTextState2 = fittedTextState;
                                textStyle2 = textStyle;
                                j2 = j;
                            }
                        }
                        paragraphStyle = paragraphStyle2;
                        str2 = str;
                        z = false;
                    } else {
                        fittedTextState = fittedTextState2;
                        textStyle = textStyle2;
                        j = j2;
                    }
                }
                str2 = str;
                String str4 = str2;
                TextStyle m994copyp1EtxEg$default2 = TextStyle.m994copyp1EtxEg$default(textStyle, 0L, j, null, null, 0L, null, 0L, null, null, null, 0, j4, null, null, 0, 16646141);
                FittedTextState fittedTextState3 = fittedTextState;
                int i6 = fittedTextState3.maxLines;
                long j7 = fittedTextState3.minFontSize;
                int i7 = fittedTextState3.overflow;
                str4.getClass();
                return new FittedTextState(str4, m994copyp1EtxEg$default2, i6, j7, i7);
        }
    }

    public /* synthetic */ SegmentedBarChartKt$$ExternalSyntheticLambda9(List list, float f, long j, int i) {
        this.f$0 = list;
        this.f$1 = f;
        this.f$2 = j;
        this.f$3 = i;
    }
}
