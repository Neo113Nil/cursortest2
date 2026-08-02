package androidx.compose.ui.text;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.runtime.NextFrameEndCallbackQueue$NextFrameEndAwaiter;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import coil3.size.SizeKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final /* synthetic */ class SaversKt$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SaversKt$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SpanStyle spanStyle = null;
        spanStyle = null;
        switch (this.$r8$classId) {
            case 0:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                String str = obj2 != null ? (String) obj2 : null;
                str.getClass();
                Object obj3 = list.get(1);
                return new LinkAnnotation.Url(str, (Intrinsics.areEqual(obj3, Boolean.FALSE) || obj3 == null) ? null : (TextLinkStyles) ((Function1) SaversKt.TextLinkStylesSaver.workTaskExecutor).invoke(obj3), null, 4);
            case 1:
                return ((WindowInsetsHolder) obj).statusBars;
            case 2:
                return ((WindowInsetsHolder) obj).ime;
            case 3:
                return ((WindowInsetsHolder) obj).navigationBars;
            case 4:
                return Unit.INSTANCE;
            case 5:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 6:
                return Boolean.valueOf(((Rect) obj) == null);
            case 7:
                Offset offset = (Offset) obj;
                long j = offset.packedValue;
                return (9223372034707292159L & j) != 9205357640488583168L ? new AnimationVector2D(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & offset.packedValue))) : SelectionMagnifierKt.UnspecifiedAnimationVector2D;
            case 8:
                AnimationVector2D animationVector2D = (AnimationVector2D) obj;
                return new Offset((Float.floatToRawIntBits(animationVector2D.v2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(animationVector2D.v1) << 32));
            case 9:
                ((NextFrameEndCallbackQueue$NextFrameEndAwaiter) obj).resume$1();
                return Unit.INSTANCE;
            case 10:
                return new SaveableStateHolderImpl((Map) obj);
            case 11:
                return obj;
            case 12:
                synchronized (SnapshotKt.lock) {
                    List list2 = SnapshotKt.globalWriteObservers;
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        ((Function1) list2.get(i)).invoke(obj);
                    }
                }
                return Unit.INSTANCE;
            case 13:
                return Unit.INSTANCE;
            case 14:
                return Boolean.valueOf(!(((AnnotatedString.Annotation) obj) instanceof ParagraphStyle));
            case 15:
                obj.getClass();
                List list3 = (List) obj;
                Object obj4 = list3.get(0);
                Function1 function1 = (Function1) SaversKt.SpanStyleSaver.workTaskExecutor;
                Boolean bool = Boolean.FALSE;
                SpanStyle spanStyle2 = (Intrinsics.areEqual(obj4, bool) || obj4 == null) ? null : (SpanStyle) function1.invoke(obj4);
                Object obj5 = list3.get(1);
                SpanStyle spanStyle3 = (Intrinsics.areEqual(obj5, bool) || obj5 == null) ? null : (SpanStyle) function1.invoke(obj5);
                Object obj6 = list3.get(2);
                SpanStyle spanStyle4 = (Intrinsics.areEqual(obj6, bool) || obj6 == null) ? null : (SpanStyle) function1.invoke(obj6);
                Object obj7 = list3.get(3);
                if (!Intrinsics.areEqual(obj7, bool) && obj7 != null) {
                    spanStyle = (SpanStyle) function1.invoke(obj7);
                }
                return new TextLinkStyles(spanStyle2, spanStyle3, spanStyle4, spanStyle);
            case 16:
                obj.getClass();
                List list4 = (List) obj;
                Object obj8 = list4.get(1);
                List list5 = (Intrinsics.areEqual(obj8, Boolean.FALSE) || obj8 == null) ? null : (List) ((Function1) SaversKt.AnnotationRangeListSaver.workTaskExecutor).invoke(obj8);
                Object obj9 = list4.get(0);
                String str2 = obj9 != null ? (String) obj9 : null;
                str2.getClass();
                return new AnnotatedString(list5, str2);
            case 17:
                obj.getClass();
                return new TextDecoration(((Integer) obj).intValue());
            case 18:
                obj.getClass();
                List list6 = (List) obj;
                return new TextGeometricTransform(((Number) list6.get(0)).floatValue(), ((Number) list6.get(1)).floatValue());
            case 19:
                obj.getClass();
                List list7 = (List) obj;
                Object obj10 = list7.get(0);
                TextUnitType[] textUnitTypeArr = TextUnit.TextUnitTypes;
                Function1 function12 = SaversKt.TextUnitSaver.$restore;
                Boolean bool2 = Boolean.FALSE;
                Intrinsics.areEqual(obj10, bool2);
                TextUnit textUnit = obj10 != null ? (TextUnit) function12.invoke(obj10) : null;
                textUnit.getClass();
                long j2 = textUnit.packedValue;
                Object obj11 = list7.get(1);
                Intrinsics.areEqual(obj11, bool2);
                TextUnit textUnit2 = obj11 != null ? (TextUnit) function12.invoke(obj11) : null;
                textUnit2.getClass();
                return new TextIndent(j2, textUnit2.packedValue);
            case 20:
                obj.getClass();
                return new FontWeight(((Integer) obj).intValue());
            case 21:
                obj.getClass();
                return new BaselineShift(((Float) obj).floatValue());
            case 22:
                obj.getClass();
                List list8 = (List) obj;
                Object obj12 = list8.get(0);
                Integer num = obj12 != null ? (Integer) obj12 : null;
                num.getClass();
                int intValue = num.intValue();
                Object obj13 = list8.get(1);
                Integer num2 = obj13 != null ? (Integer) obj13 : null;
                num2.getClass();
                return new TextRange(SizeKt.TextRange(intValue, num2.intValue()));
            case 23:
                obj.getClass();
                List list9 = (List) obj;
                Object obj14 = list9.get(0);
                int i2 = Color.$r8$clinit;
                Boolean bool3 = Boolean.FALSE;
                Intrinsics.areEqual(obj14, bool3);
                Color color = obj14 != null ? obj14.equals(bool3) ? new Color(Color.Unspecified) : new Color(ColorKt.Color(((Integer) obj14).intValue())) : null;
                color.getClass();
                long j3 = color.value;
                Object obj15 = list9.get(1);
                SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$1 = SaversKt.OffsetSaver;
                Intrinsics.areEqual(obj15, bool3);
                Offset offset2 = obj15 != null ? (Offset) saversKt$NonNullValueClassSaver$1.$restore.invoke(obj15) : null;
                offset2.getClass();
                long j4 = offset2.packedValue;
                Object obj16 = list9.get(2);
                Float f = obj16 != null ? (Float) obj16 : null;
                f.getClass();
                return new Shadow(f.floatValue(), j3, j4);
            case 24:
                obj.getClass();
                return new TextAlign(((Integer) obj).intValue());
            case 25:
                obj.getClass();
                return new TextDirection(((Integer) obj).intValue());
            case 26:
                obj.getClass();
                return new Hyphens(((Integer) obj).intValue());
            case 27:
                obj.getClass();
                List list10 = (List) obj;
                ArrayList arrayList = new ArrayList(list10.size());
                int size2 = list10.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Object obj17 = list10.get(i3);
                    AnnotatedString.Range range = (Intrinsics.areEqual(obj17, Boolean.FALSE) || obj17 == null) ? null : (AnnotatedString.Range) ((Function1) SaversKt.AnnotationRangeSaver.workTaskExecutor).invoke(obj17);
                    range.getClass();
                    arrayList.add(range);
                }
                return arrayList;
            case 28:
                obj.getClass();
                return new FontStyle(((Integer) obj).intValue());
            default:
                obj.getClass();
                return new FontSynthesis(((Integer) obj).intValue());
        }
    }
}
