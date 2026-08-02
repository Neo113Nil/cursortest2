package androidx.glance.appwidget;

import android.content.Context;
import androidx.compose.material3.SliderState$drag$2;
import androidx.glance.appwidget.AppWidgetSession;
import androidx.glance.session.SessionManagerImpl$scope$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.ui.qrcodes.widget.CashQrWidget;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ProducerScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class GlanceAppWidget$update$4 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AppWidgetId $glanceId;
    public final /* synthetic */ int $r8$classId = 0;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ CashQrWidget this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidget$update$4(Context context, AppWidgetId appWidgetId, CashQrWidget cashQrWidget, Continuation continuation) {
        super(2, continuation);
        this.$context = context;
        this.$glanceId = appWidgetId;
        this.this$0 = cashQrWidget;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        AppWidgetId appWidgetId = this.$glanceId;
        Context context = this.$context;
        CashQrWidget cashQrWidget = this.this$0;
        switch (i) {
            case 0:
                GlanceAppWidget$update$4 glanceAppWidget$update$4 = new GlanceAppWidget$update$4(context, appWidgetId, cashQrWidget, continuation);
                glanceAppWidget$update$4.L$0 = obj;
                return glanceAppWidget$update$4;
            default:
                GlanceAppWidget$update$4 glanceAppWidget$update$42 = new GlanceAppWidget$update$4(cashQrWidget, context, appWidgetId, continuation);
                glanceAppWidget$update$42.L$0 = obj;
                return glanceAppWidget$update$42;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((GlanceAppWidget$update$4) create((SessionManagerImpl$scope$1) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((GlanceAppWidget$update$4) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009d, code lost:
    
        if (r1.startSession(r7, r11, r10) == r5) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c1, code lost:
    
        if (r10 == r5) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0081, code lost:
    
        if (r11 == r5) goto L37;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SessionManagerImpl$scope$1 sessionManagerImpl$scope$1;
        switch (this.$r8$classId) {
            case 0:
                AppWidgetId appWidgetId = this.$glanceId;
                int i = appWidgetId.appWidgetId;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                Context context = this.$context;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    sessionManagerImpl$scope$1 = (SessionManagerImpl$scope$1) this.L$0;
                    String createUniqueRemoteUiName = AppWidgetUtilsKt.createUniqueRemoteUiName(i);
                    this.L$0 = sessionManagerImpl$scope$1;
                    this.label = 1;
                    obj = sessionManagerImpl$scope$1.isSessionRunning(context, createUniqueRemoteUiName, this);
                    break;
                } else if (i2 == 1) {
                    sessionManagerImpl$scope$1 = (SessionManagerImpl$scope$1) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                } else if (i2 == 2) {
                    SafeTrace.throwOnFailure(obj);
                    break;
                } else if (i2 != 3) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                if (!((Boolean) obj).booleanValue()) {
                    AppWidgetSession appWidgetSession = new AppWidgetSession(this.this$0, appWidgetId, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                    this.L$0 = null;
                    this.label = 2;
                    break;
                } else {
                    AppWidgetSession appWidgetSession2 = (AppWidgetSession) sessionManagerImpl$scope$1.sessions.get(AppWidgetUtilsKt.createUniqueRemoteUiName(i));
                    appWidgetSession2.getClass();
                    this.L$0 = null;
                    this.label = 3;
                    Object sendEvent = appWidgetSession2.sendEvent(AppWidgetSession.UpdateGlanceState.INSTANCE, this);
                    if (sendEvent != coroutineSingletons) {
                        sendEvent = Unit.INSTANCE;
                        break;
                    }
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppWidgetUtilsKt$runGlance$1$receiver$1 appWidgetUtilsKt$runGlance$1$receiver$1 = new AppWidgetUtilsKt$runGlance$1$receiver$1(new AtomicReference(null), (ProducerScope) this.L$0);
                    AppWidgetId appWidgetId2 = this.$glanceId;
                    SliderState$drag$2 sliderState$drag$2 = new SliderState$drag$2(this.this$0, this.$context, appWidgetId2, null, 3);
                    this.label = 1;
                    if (JobKt.withContext(appWidgetUtilsKt$runGlance$1$receiver$1, sliderState$drag$2, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidget$update$4(CashQrWidget cashQrWidget, Context context, AppWidgetId appWidgetId, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cashQrWidget;
        this.$context = context;
        this.$glanceId = appWidgetId;
    }
}
