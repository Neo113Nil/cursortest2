package app.cash.broadway.ui.compose;

import android.graphics.Typeface;
import android.text.Spannable;
import androidx.camera.video.Recorder;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.foundation.layout.FillNode$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.android.style.TypefaceSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.unit.Constraints;
import com.squareup.cash.money.views.MoneyUiFactory$$ExternalSyntheticLambda0;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;

/* loaded from: classes.dex */
public final /* synthetic */ class UiScopeKt$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ UiScopeKt$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        int i = this.$r8$classId;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj5;
                AnimatedVisibilityScope animatedVisibilityScope = (AnimatedVisibilityScope) obj4;
                SharedTransitionScope sharedTransitionScope = (SharedTransitionScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                sharedTransitionScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(sharedTransitionScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    composableLambdaImpl.invoke((Object) new UiScope(animatedVisibilityScope, sharedTransitionScope), (Object) gapComposer, (Object) 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Spannable spannable = (Spannable) obj5;
                MoneyUiFactory$$ExternalSyntheticLambda0 moneyUiFactory$$ExternalSyntheticLambda0 = (MoneyUiFactory$$ExternalSyntheticLambda0) obj4;
                SpanStyle spanStyle = (SpanStyle) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int intValue3 = ((Integer) obj3).intValue();
                FontFamily fontFamily = spanStyle.fontFamily;
                FontWeight fontWeight = spanStyle.fontWeight;
                if (fontWeight == null) {
                    fontWeight = FontWeight.Normal;
                }
                FontStyle fontStyle = spanStyle.fontStyle;
                int i2 = fontStyle != null ? fontStyle.value : 0;
                FontSynthesis fontSynthesis = spanStyle.fontSynthesis;
                int i3 = fontSynthesis != null ? fontSynthesis.value : 65535;
                AndroidParagraphIntrinsics androidParagraphIntrinsics = (AndroidParagraphIntrinsics) moneyUiFactory$$ExternalSyntheticLambda0.f$0;
                TypefaceResult m997resolveDPcqOEQ = androidParagraphIntrinsics.fontFamilyResolver.m997resolveDPcqOEQ(fontFamily, fontWeight, i2, i3);
                if (m997resolveDPcqOEQ instanceof TypefaceResult.Immutable) {
                    Object obj6 = ((TypefaceResult.Immutable) m997resolveDPcqOEQ).value;
                    obj6.getClass();
                    typeface = (Typeface) obj6;
                } else {
                    Recorder.AnonymousClass3 anonymousClass3 = new Recorder.AnonymousClass3(m997resolveDPcqOEQ, androidParagraphIntrinsics.resolvedTypefaces);
                    androidParagraphIntrinsics.resolvedTypefaces = anonymousClass3;
                    typeface = anonymousClass3.getTypeface();
                }
                spannable.setSpan(new TypefaceSpan(typeface, 0), intValue2, intValue3, 33);
                return Unit.INSTANCE;
            case 2:
                Map map = (Map) obj5;
                MeasureScope measureScope = (MeasureScope) obj;
                Measurable measurable = (Measurable) obj2;
                measureScope.getClass();
                measurable.getClass();
                Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(((Constraints) obj3).value);
                map.put((HorizontalAlignmentLine) obj4, Integer.valueOf(mo833measureBRTryo0.height / 2));
                return measureScope.layout(mo833measureBRTryo0.width, mo833measureBRTryo0.height, map, new FillNode$$ExternalSyntheticLambda0(mo833measureBRTryo0, 8));
            default:
                OnUndeliveredElementKt.callUndeliveredElement((Function1) obj5, obj4, (CoroutineContext) obj3);
                return Unit.INSTANCE;
        }
    }
}
