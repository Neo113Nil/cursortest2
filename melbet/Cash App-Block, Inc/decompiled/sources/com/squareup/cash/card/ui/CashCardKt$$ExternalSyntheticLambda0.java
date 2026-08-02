package com.squareup.cash.card.ui;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.unit.Dp;
import coil3.compose.AsyncImagePainter;
import com.squareup.cash.activity.viewmodels.TabToolbarEvent;
import com.squareup.cash.bitcoin.viewmodels.deposits.copy.BitcoinDepositCopyViewModel;
import com.squareup.cash.blockers.presenters.CashtagPresenter;
import com.squareup.cash.blockers.presenters.VerifyAliasPresenter;
import com.squareup.cash.booklet.ui.BookletImageState;
import com.squareup.cash.card.onboarding.PaymentDeviceItemViewModel;
import com.squareup.cash.composeUi.foundation.image.ImageLoadingStatus;
import com.squareup.cash.graphics.views.GraphicsError;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayments;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.scrubbing.AbstractScrubber;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewEvent;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final /* synthetic */ class CashCardKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState f$0;

    public /* synthetic */ CashCardKt$$ExternalSyntheticLambda0(int i, MutableState mutableState) {
        this.$r8$classId = i;
        this.f$0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.f$0;
        switch (i) {
            case 0:
                ((Throwable) obj).getClass();
                mutableState.setValue(Boolean.TRUE);
                break;
            case 1:
                TabToolbarInternalViewEvent tabToolbarInternalViewEvent = (TabToolbarInternalViewEvent) obj;
                tabToolbarInternalViewEvent.getClass();
                ((Function1) mutableState.getValue()).invoke(new TabToolbarEvent(tabToolbarInternalViewEvent));
                break;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                mutableState.setValue(bool);
                break;
            case 3:
                Integer num = (Integer) obj;
                num.getClass();
                Function1 function1 = (Function1) mutableState.getValue();
                if (function1 != null) {
                    function1.invoke(num);
                }
                break;
            case 4:
                ImageLoadingStatus imageLoadingStatus = (ImageLoadingStatus) obj;
                imageLoadingStatus.getClass();
                mutableState.setValue(imageLoadingStatus);
                break;
            case 5:
                ImageLoadingStatus imageLoadingStatus2 = (ImageLoadingStatus) obj;
                imageLoadingStatus2.getClass();
                mutableState.setValue(imageLoadingStatus2);
                break;
            case 6:
                mutableState.setValue((BitcoinPayments) obj);
                break;
            case 7:
                mutableState.setValue((BitcoinDepositCopyViewModel) obj);
                break;
            case 8:
                mutableState.setValue((CashtagPresenter.CashtagStatus) obj);
                break;
            case 9:
                mutableState.setValue((VerifyAliasPresenter.State) ((Function1) obj).invoke((VerifyAliasPresenter.State) mutableState.getValue()));
                break;
            case 10:
                String str = (String) obj;
                str.getClass();
                String replaceAll = AbstractScrubber.STRIP_CHARS.matcher(str).replaceAll("");
                replaceAll.getClass();
                mutableState.setValue(replaceAll);
                break;
            case 11:
                ((AsyncImagePainter.State.Loading) obj).getClass();
                mutableState.setValue(BookletImageState.Loading);
                break;
            case 12:
                ((AsyncImagePainter.State.Success) obj).getClass();
                mutableState.setValue(BookletImageState.Success);
                break;
            case 13:
                ((AsyncImagePainter.State.Error) obj).getClass();
                mutableState.setValue(BookletImageState.Error);
                break;
            case 14:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                mutableState.setValue(bool2);
                break;
            case 15:
                Throwable th = (Throwable) obj;
                th.getClass();
                mutableState.setValue(Boolean.TRUE);
                GraphicsError graphicsError = new GraphicsError(th);
                ErrorReporter errorReporter = ErrorReporter.Companion.INSTANCE;
                if (errorReporter == null) {
                    WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
                    break;
                } else {
                    errorReporter.report(graphicsError, ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                    break;
                }
            case 16:
                Float f = (Float) obj;
                f.floatValue();
                mutableState.setValue(f);
                break;
            case 17:
                ((Throwable) obj).getClass();
                mutableState.setValue(Boolean.TRUE);
                break;
            case 18:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                Rect localBoundingBoxOf = ValueInsets.findRootCoordinates(layoutCoordinates).localBoundingBoxOf(layoutCoordinates, true);
                float f2 = localBoundingBoxOf.left;
                float f3 = localBoundingBoxOf.top;
                mutableState.setValue(new Offset((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & BodyPartID.bodyIdMax)));
                break;
            case 19:
                LayoutCoordinates layoutCoordinates2 = (LayoutCoordinates) obj;
                layoutCoordinates2.getClass();
                mutableState.setValue(layoutCoordinates2);
                break;
            case 20:
                ((Throwable) obj).getClass();
                mutableState.setValue(Boolean.TRUE);
                break;
            case 21:
                LayoutCoordinates layoutCoordinates3 = (LayoutCoordinates) obj;
                layoutCoordinates3.getClass();
                mutableState.setValue(new Offset(layoutCoordinates3.mo843localToWindowMKHz9U(0L)));
                break;
            case 22:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                Timber.Forest.w("CardDesignLibraryEffect failed; switching to Compose fallback", new Object[0], th2);
                mutableState.setValue(Boolean.TRUE);
                break;
            case 23:
                PaymentDeviceItemViewModel paymentDeviceItemViewModel = (PaymentDeviceItemViewModel) CollectionsKt.getOrNull(((Integer) obj).intValue(), (List) mutableState.getValue());
                if (paymentDeviceItemViewModel != null) {
                    String str2 = paymentDeviceItemViewModel.accessibilityText;
                    if (str2.length() == 0) {
                        break;
                    }
                }
                break;
            case 24:
                mutableState.setValue(new Dp(((Dp) obj).value));
                break;
            case 25:
                ((Throwable) obj).getClass();
                mutableState.setValue(Boolean.TRUE);
                break;
            case 26:
                obj.getClass();
                mutableState.setValue(obj);
                break;
            case 27:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((Function1) mutableState.getValue()).invoke(th3);
                break;
            case 28:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((Function1) mutableState.getValue()).invoke(th4);
                break;
            default:
                mutableState.setValue(new Dp(((Dp) obj).value));
                break;
        }
        return Unit.INSTANCE;
    }
}
