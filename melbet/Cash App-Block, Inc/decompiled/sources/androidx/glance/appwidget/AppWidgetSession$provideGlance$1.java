package androidx.glance.appwidget;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.unit.DpSize;
import androidx.paging.FlowExtKt$simpleScan$1;
import app.cash.trifle.KeyHandle$keyPair$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes3.dex */
public final class AppWidgetSession$provideGlance$1 extends Lambda implements Function2 {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ AppWidgetSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppWidgetSession$provideGlance$1(Context context, AppWidgetSession appWidgetSession) {
        super(2);
        this.$context = context;
        this.this$0 = appWidgetSession;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        AppWidgetSession appWidgetSession;
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    GapComposer gapComposer = (GapComposer) composer;
                    if (gapComposer.getSkipping()) {
                        gapComposer.skipToGroupEnd();
                        break;
                    }
                }
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = androidx.glance.CompositionLocalsKt.LocalContext;
                Context context = this.$context;
                ProvidedValue defaultProvidedValue$runtime = staticProvidableCompositionLocal.defaultProvidedValue$runtime(context);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = androidx.glance.CompositionLocalsKt.LocalGlanceId;
                AppWidgetSession appWidgetSession2 = this.this$0;
                ProvidedValue defaultProvidedValue$runtime2 = staticProvidableCompositionLocal2.defaultProvidedValue$runtime(appWidgetSession2.id);
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = CompositionLocalsKt.LocalAppWidgetOptions;
                Bundle bundle = (Bundle) appWidgetSession2.options$delegate.getValue();
                if (bundle == null) {
                    bundle = Bundle.EMPTY;
                }
                Updater.CompositionLocalProvider(new ProvidedValue[]{defaultProvidedValue$runtime, defaultProvidedValue$runtime2, dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(bundle), androidx.glance.CompositionLocalsKt.LocalState.defaultProvidedValue$runtime(appWidgetSession2.glanceState$delegate.getValue())}, Expect_jvmKt.composableLambda(composer, 1688971311, new AppWidgetSession$provideGlance$1(appWidgetSession2, context)), composer, 48);
            default:
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    if (gapComposer2.getSkipping()) {
                        gapComposer2.skipToGroupEnd();
                        break;
                    }
                }
                GapComposer gapComposer3 = (GapComposer) composer2;
                gapComposer3.startReplaceableGroup(1881995740);
                Object rememberedValue = gapComposer3.rememberedValue();
                Object obj3 = Composer.Companion.Empty;
                if (rememberedValue == obj3) {
                    rememberedValue = Updater.mutableStateOf$default(new DpSize(0L));
                    gapComposer3.updateRememberedValue(rememberedValue);
                }
                MutableState mutableState = (MutableState) rememberedValue;
                gapComposer3.end(false);
                Boolean bool = Boolean.FALSE;
                gapComposer3.startReplaceableGroup(1881999935);
                AppWidgetSession appWidgetSession3 = this.this$0;
                boolean changed = gapComposer3.changed(appWidgetSession3);
                Context context2 = this.$context;
                boolean changed2 = gapComposer3.changed(context2) | changed | gapComposer3.changed(mutableState);
                Object rememberedValue2 = gapComposer3.rememberedValue();
                Unit unit = null;
                if (changed2 || rememberedValue2 == obj3) {
                    Object flowExtKt$simpleScan$1 = new FlowExtKt$simpleScan$1(appWidgetSession3, context2, mutableState, null, 17);
                    appWidgetSession = appWidgetSession3;
                    gapComposer3.updateRememberedValue(flowExtKt$simpleScan$1);
                    rememberedValue2 = flowExtKt$simpleScan$1;
                } else {
                    appWidgetSession = appWidgetSession3;
                }
                gapComposer3.end(false);
                if (((Boolean) Updater.produceState(gapComposer3, bool, (Function2) rememberedValue2).getValue()).booleanValue()) {
                    gapComposer3.startReplaceableGroup(-1786326291);
                    gapComposer3.startReplaceableGroup(1882039614);
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    if (rememberedValue3 == obj3) {
                        rememberedValue3 = FlowKt.channelFlow(new GlanceAppWidget$update$4(appWidgetSession.widget, context2, appWidgetSession.id, (Continuation) null));
                        gapComposer3.updateRememberedValue(rememberedValue3);
                    }
                    gapComposer3.end(false);
                    Function2 function2 = (Function2) Updater.collectAsState((Flow) rememberedValue3, null, null, gapComposer3, 48, 2).getValue();
                    gapComposer3.startReplaceableGroup(1882043230);
                    if (function2 != null) {
                        SizeBoxKt.m1118ForEachSizeeVKgIn8(0, ((DpSize) mutableState.getValue()).packedValue, gapComposer3, appWidgetSession.sizeMode, function2);
                        unit = Unit.INSTANCE;
                    }
                    gapComposer3.end(false);
                    if (unit == null) {
                        IgnoreResultKt.IgnoreResult(gapComposer3, 0);
                    }
                    gapComposer3.end(false);
                } else {
                    gapComposer3.startReplaceableGroup(-1786102688);
                    IgnoreResultKt.IgnoreResult(gapComposer3, 0);
                    gapComposer3.end(false);
                }
                gapComposer3.startReplaceableGroup(1882053955);
                boolean changed3 = gapComposer3.changed(appWidgetSession);
                Object rememberedValue4 = gapComposer3.rememberedValue();
                if (changed3 || rememberedValue4 == obj3) {
                    rememberedValue4 = new KeyHandle$keyPair$2(appWidgetSession, 6);
                    gapComposer3.updateRememberedValue(rememberedValue4);
                }
                gapComposer3.end(false);
                Updater.SideEffect((Function0) rememberedValue4, gapComposer3);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppWidgetSession$provideGlance$1(AppWidgetSession appWidgetSession, Context context) {
        super(2);
        this.this$0 = appWidgetSession;
        this.$context = context;
    }
}
