package androidx.glance.appwidget;

import android.app.Application;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.glance.appwidget.ContentReceiver;
import androidx.room.Room;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda1;
import com.squareup.cash.shopping.sup.views.SingleUsePaymentAddCardSheetKt;
import com.squareup.cash.shopping.views.BrandsSearchView$$ExternalSyntheticLambda6;
import com.squareup.cash.ui.qrcodes.widget.CashQrWidget;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public abstract class GlanceAppWidgetKt {
    public static final void SpendingLimitReachedErrorContent(Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1769743741);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z = false;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            String stringResource = Room.stringResource(gapComposer, R.string.sup_spending_limit_reached_error_header);
            String stringResource2 = Room.stringResource(gapComposer, R.string.sup_spending_limit_reached_error_message);
            String stringResource3 = Room.stringResource(gapComposer, R.string.ok);
            boolean z2 = true;
            ButtonProminence buttonProminence = ButtonProminence.STANDARD;
            if ((i2 & 14) != 4) {
                z2 = false;
            }
            Object rememberedValue = gapComposer.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BrandsSearchView$$ExternalSyntheticLambda6(16, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SingleUsePaymentAddCardSheetKt.SingleUsePaymentHalfSheetContent(stringResource, stringResource2, stringResource3, buttonProminence, true, null, (Function0) rememberedValue, gapComposer, 27648, 32);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NfcNotAvailableKt$$ExternalSyntheticLambda1(function1, i, 28, z);
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.SerializedFlow.deepLinkSpecs;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void provideContent(ComposableLambdaImpl composableLambdaImpl, ContinuationImpl continuationImpl) {
        GlanceAppWidgetKt$provideContent$1 glanceAppWidgetKt$provideContent$1;
        int i;
        if (continuationImpl instanceof GlanceAppWidgetKt$provideContent$1) {
            glanceAppWidgetKt$provideContent$1 = (GlanceAppWidgetKt$provideContent$1) continuationImpl;
            int i2 = glanceAppWidgetKt$provideContent$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                glanceAppWidgetKt$provideContent$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = glanceAppWidgetKt$provideContent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = glanceAppWidgetKt$provideContent$1.label;
                if (i == 0) {
                    if (i == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return;
                }
                SafeTrace.throwOnFailure(obj);
                ContentReceiver contentReceiver = (ContentReceiver) glanceAppWidgetKt$provideContent$1.getContext().get(ContentReceiver.Key.$$INSTANCE);
                if (contentReceiver == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("provideContent requires a ContentReceiver and should only be called from GlanceAppWidget.provideGlance");
                    return;
                } else {
                    glanceAppWidgetKt$provideContent$1.label = 1;
                    ((AppWidgetUtilsKt$runGlance$1$receiver$1) contentReceiver).provideContent(composableLambdaImpl, glanceAppWidgetKt$provideContent$1);
                    return;
                }
            }
        }
        glanceAppWidgetKt$provideContent$1 = new GlanceAppWidgetKt$provideContent$1(continuationImpl);
        Object obj2 = glanceAppWidgetKt$provideContent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = glanceAppWidgetKt$provideContent$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0055, code lost:
    
        if (r9 == r2) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object updateAll(CashQrWidget cashQrWidget, Application application, Continuation continuation) {
        GlanceAppWidgetKt$updateAll$1 glanceAppWidgetKt$updateAll$1;
        int i;
        Application application2;
        CashQrWidget cashQrWidget2;
        Iterator it;
        Application application3;
        int i2;
        if (continuation instanceof GlanceAppWidgetKt$updateAll$1) {
            glanceAppWidgetKt$updateAll$1 = (GlanceAppWidgetKt$updateAll$1) continuation;
            int i3 = glanceAppWidgetKt$updateAll$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                glanceAppWidgetKt$updateAll$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = glanceAppWidgetKt$updateAll$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = glanceAppWidgetKt$updateAll$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    GlanceAppWidgetManager glanceAppWidgetManager = new GlanceAppWidgetManager(application);
                    Class<?> cls = cashQrWidget.getClass();
                    glanceAppWidgetKt$updateAll$1.L$0 = cashQrWidget;
                    glanceAppWidgetKt$updateAll$1.L$1 = application;
                    glanceAppWidgetKt$updateAll$1.label = 1;
                    obj = glanceAppWidgetManager.getGlanceIds(cls, glanceAppWidgetKt$updateAll$1);
                    application2 = application;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        it = glanceAppWidgetKt$updateAll$1.L$2;
                        ?? r8 = glanceAppWidgetKt$updateAll$1.L$1;
                        cashQrWidget2 = glanceAppWidgetKt$updateAll$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        application3 = r8;
                        while (it.hasNext()) {
                            AppWidgetId appWidgetId = (AppWidgetId) it.next();
                            glanceAppWidgetKt$updateAll$1.L$0 = cashQrWidget2;
                            glanceAppWidgetKt$updateAll$1.L$1 = application3;
                            glanceAppWidgetKt$updateAll$1.L$2 = it;
                            glanceAppWidgetKt$updateAll$1.label = 2;
                            cashQrWidget2.getClass();
                            if (appWidgetId == null || (Integer.MIN_VALUE <= (i2 = appWidgetId.appWidgetId) && i2 < -1)) {
                                a$$ExternalSyntheticBUOutline0.m$3("Invalid Glance ID");
                                return null;
                            }
                            Object update$glance_appwidget_release$default = CashQrWidget.update$glance_appwidget_release$default(cashQrWidget2, application3, i2, glanceAppWidgetKt$updateAll$1);
                            if (update$glance_appwidget_release$default != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                update$glance_appwidget_release$default = Unit.INSTANCE;
                            }
                            if (update$glance_appwidget_release$default == obj2) {
                                return obj2;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    ?? r82 = glanceAppWidgetKt$updateAll$1.L$1;
                    cashQrWidget = glanceAppWidgetKt$updateAll$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    application2 = r82;
                }
                cashQrWidget2 = cashQrWidget;
                it = ((Iterable) obj).iterator();
                application3 = application2;
                while (it.hasNext()) {
                }
                return Unit.INSTANCE;
            }
        }
        glanceAppWidgetKt$updateAll$1 = new GlanceAppWidgetKt$updateAll$1(continuation);
        Object obj3 = glanceAppWidgetKt$updateAll$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = glanceAppWidgetKt$updateAll$1.label;
        if (i != 0) {
        }
        cashQrWidget2 = cashQrWidget;
        it = ((Iterable) obj3).iterator();
        application3 = application2;
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }
}
