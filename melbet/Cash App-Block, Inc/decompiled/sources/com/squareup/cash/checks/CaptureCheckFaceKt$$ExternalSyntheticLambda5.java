package com.squareup.cash.checks;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.TextUnit;
import androidx.core.graphics.Insets;
import androidx.room.Room;
import coil3.compose.AsyncImagePainter;
import com.squareup.cash.card.onboarding.StyledCardPerspectiveView;
import com.squareup.cash.fidesmo.views.SuccessCardImageState;
import com.squareup.cash.graphics.views.GraphicsError;
import com.squareup.cash.history.viewmodels.PasscodeDialogViewModel;
import com.squareup.cash.investing.viewmodels.TransferStockViewModel;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.protos.franklin.api.CardPresentationStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class CaptureCheckFaceKt$$ExternalSyntheticLambda5 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState f$0;

    public /* synthetic */ CaptureCheckFaceKt$$ExternalSyntheticLambda5(int i, MutableState mutableState) {
        this.$r8$classId = i;
        this.f$0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.f$0;
        switch (i) {
            case 0:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                mutableState.setValue(new IntSize(layoutCoordinates.mo838getSizeYbymL2g()));
                break;
            case 1:
                Throwable th = (Throwable) obj;
                th.getClass();
                mutableState.setValue(th);
                break;
            case 2:
                Insets insets = (Insets) obj;
                insets.getClass();
                mutableState.setValue(insets);
                break;
            case 3:
                Insets insets2 = (Insets) obj;
                insets2.getClass();
                mutableState.setValue(insets2);
                break;
            case 4:
                Insets insets3 = (Insets) obj;
                insets3.getClass();
                mutableState.setValue(insets3);
                break;
            case 5:
                Insets insets4 = (Insets) obj;
                insets4.getClass();
                mutableState.setValue(insets4);
                break;
            case 6:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, (String) mutableState.getValue());
                break;
            case 7:
                mutableState.setValue(new IntSize(((IntSize) obj).packedValue));
                break;
            case 8:
                mutableState.setValue(new IntSize(((IntSize) obj).packedValue));
                break;
            case 9:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                mutableState.setValue(bool);
                break;
            case 10:
                mutableState.setValue(new IntSize(((IntSize) obj).packedValue));
                break;
            case 11:
                mutableState.setValue(new IntSize(((IntSize) obj).packedValue));
                break;
            case 12:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                mutableState.setValue(bool2);
                break;
            case 13:
                ((AsyncImagePainter.State.Loading) obj).getClass();
                mutableState.setValue(SuccessCardImageState.Loading);
                break;
            case 14:
                ((AsyncImagePainter.State.Success) obj).getClass();
                mutableState.setValue(SuccessCardImageState.Success);
                break;
            case 15:
                ((AsyncImagePainter.State.Error) obj).getClass();
                mutableState.setValue(SuccessCardImageState.Error);
                break;
            case 16:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                mutableState.setValue(Boolean.TRUE);
                GraphicsError graphicsError = new GraphicsError(th2);
                ErrorReporter errorReporter = ErrorReporter.Companion.INSTANCE;
                if (errorReporter == null) {
                    WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
                    break;
                } else {
                    errorReporter.report(graphicsError, ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                    break;
                }
            case 17:
                Context context = (Context) obj;
                context.getClass();
                StyledCardPerspectiveView styledCardPerspectiveView = new StyledCardPerspectiveView(context);
                styledCardPerspectiveView.setApplyPerspective(((CardPresentationStyle) mutableState.getValue()) == CardPresentationStyle.PSEUDO_3D);
                styledCardPerspectiveView.setInteractive(true);
                break;
            case 18:
                String str = (String) obj;
                str.getClass();
                mutableState.setValue(str);
                break;
            case 19:
                ((Throwable) obj).getClass();
                mutableState.setValue(Boolean.TRUE);
                break;
            case 20:
                ((Throwable) obj).getClass();
                mutableState.setValue(Boolean.TRUE);
                break;
            case 21:
                mutableState.setValue((PasscodeDialogViewModel) ((Function1) obj).invoke((PasscodeDialogViewModel) mutableState.getValue()));
                break;
            case 22:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                mutableState.setValue(bool3);
                break;
            case 23:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                mutableState.setValue(bool4);
                break;
            case 24:
                TextLayoutResult textLayoutResult = (TextLayoutResult) obj;
                textLayoutResult.getClass();
                TextStyle textStyle = textLayoutResult.layoutInput.style;
                long j = textStyle.spanStyle.fontSize;
                long j2 = ((TextUnit) mutableState.getValue()).packedValue;
                Room.m1168checkArithmeticNB67dxo(j, j2);
                if (Float.compare(TextUnit.m1059getValueimpl(j), TextUnit.m1059getValueimpl(j2)) < 0) {
                    mutableState.setValue(new TextUnit(textStyle.spanStyle.fontSize));
                }
                break;
            case 25:
                TextLayoutResult textLayoutResult2 = (TextLayoutResult) obj;
                textLayoutResult2.getClass();
                TextStyle textStyle2 = textLayoutResult2.layoutInput.style;
                long j3 = textStyle2.spanStyle.fontSize;
                long j4 = ((TextUnit) mutableState.getValue()).packedValue;
                Room.m1168checkArithmeticNB67dxo(j3, j4);
                if (Float.compare(TextUnit.m1059getValueimpl(j3), TextUnit.m1059getValueimpl(j4)) < 0) {
                    mutableState.setValue(new TextUnit(textStyle2.spanStyle.fontSize));
                }
                break;
            case 26:
                TextLayoutResult textLayoutResult3 = (TextLayoutResult) obj;
                textLayoutResult3.getClass();
                TextStyle textStyle3 = textLayoutResult3.layoutInput.style;
                long j5 = textStyle3.spanStyle.fontSize;
                long j6 = ((TextUnit) mutableState.getValue()).packedValue;
                Room.m1168checkArithmeticNB67dxo(j5, j6);
                if (Float.compare(TextUnit.m1059getValueimpl(j5), TextUnit.m1059getValueimpl(j6)) < 0) {
                    mutableState.setValue(new TextUnit(textStyle3.spanStyle.fontSize));
                }
                break;
            case 27:
                TextLayoutResult textLayoutResult4 = (TextLayoutResult) obj;
                textLayoutResult4.getClass();
                TextStyle textStyle4 = textLayoutResult4.layoutInput.style;
                long j7 = textStyle4.spanStyle.fontSize;
                long j8 = ((TextUnit) mutableState.getValue()).packedValue;
                Room.m1168checkArithmeticNB67dxo(j7, j8);
                if (Float.compare(TextUnit.m1059getValueimpl(j7), TextUnit.m1059getValueimpl(j8)) < 0) {
                    mutableState.setValue(new TextUnit(textStyle4.spanStyle.fontSize));
                }
                break;
            case 28:
                String str2 = (String) obj;
                str2.getClass();
                mutableState.setValue(str2);
                break;
            default:
                mutableState.setValue((TransferStockViewModel.Content.FullScreenContent.DialogContent) obj);
                break;
        }
        return Unit.INSTANCE;
    }
}
