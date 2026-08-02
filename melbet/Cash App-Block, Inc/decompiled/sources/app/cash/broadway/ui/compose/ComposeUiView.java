package app.cash.broadway.ui.compose;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.Ui;
import app.cash.broadway.ui.compose.DialogListenerEvent;
import com.squareup.cash.common.composeui.CashComposeInsets;
import com.squareup.cash.common.composeui.CashInsetsKt;
import com.squareup.cash.common.composeui.CashWindowInsets;
import com.squareup.cash.ui.CashInsets;
import com.squareup.cash.ui.CashInsetsListener;
import com.squareup.cash.ui.DialogResultListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public abstract class ComposeUiView extends AbstractComposeView implements Ui, CashInsetsListener, DialogResultListener {
    public final CashComposeInsets cashInsets;
    public final ChromeConfigAggregator chromeConfigAggregator;
    public final DialogEventDispatcher dialogEventDispatcher;
    public Ui.EventReceiver eventReceiver;
    public final FullScreenAggregator fullScreenAggregator;
    public final OrientationAggregator orientationAggregator;
    public Function0 requestUpdateWindowFlags;
    public final SecureScreenAggregator secureScreenAggregator;
    public final ParcelableSnapshotMutableState updatableModel$delegate;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ComposeUiView(Context context) {
        super(context, null, 4, r2);
        context.getClass();
        final int i = 0;
        this.updatableModel$delegate = Updater.mutableStateOf$default(null);
        this.cashInsets = new CashComposeInsets();
        ChromeConfigAggregator chromeConfigAggregator = new ChromeConfigAggregator();
        this.chromeConfigAggregator = chromeConfigAggregator;
        this.dialogEventDispatcher = new DialogEventDispatcher();
        FullScreenAggregator fullScreenAggregator = new FullScreenAggregator();
        this.fullScreenAggregator = fullScreenAggregator;
        OrientationAggregator orientationAggregator = new OrientationAggregator();
        this.orientationAggregator = orientationAggregator;
        SecureScreenAggregator secureScreenAggregator = new SecureScreenAggregator();
        this.secureScreenAggregator = secureScreenAggregator;
        chromeConfigAggregator.configChangedCallback = new Function0(this) { // from class: app.cash.broadway.ui.compose.ComposeUiView$$ExternalSyntheticLambda0
            public final /* synthetic */ ComposeUiView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ComposeUiView composeUiView = this.f$0;
                switch (i2) {
                    case 0:
                        Function0 function0 = composeUiView.requestUpdateWindowFlags;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        break;
                    case 1:
                        Function0 function02 = composeUiView.requestUpdateWindowFlags;
                        if (function02 != null) {
                            function02.invoke();
                        }
                        break;
                    case 2:
                        Function0 function03 = composeUiView.requestUpdateWindowFlags;
                        if (function03 != null) {
                            function03.invoke();
                        }
                        break;
                    default:
                        Function0 function04 = composeUiView.requestUpdateWindowFlags;
                        if (function04 != null) {
                            function04.invoke();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        final int i2 = 1;
        fullScreenAggregator.enabledChangedCallback = new Function0(this) { // from class: app.cash.broadway.ui.compose.ComposeUiView$$ExternalSyntheticLambda0
            public final /* synthetic */ ComposeUiView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ComposeUiView composeUiView = this.f$0;
                switch (i22) {
                    case 0:
                        Function0 function0 = composeUiView.requestUpdateWindowFlags;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        break;
                    case 1:
                        Function0 function02 = composeUiView.requestUpdateWindowFlags;
                        if (function02 != null) {
                            function02.invoke();
                        }
                        break;
                    case 2:
                        Function0 function03 = composeUiView.requestUpdateWindowFlags;
                        if (function03 != null) {
                            function03.invoke();
                        }
                        break;
                    default:
                        Function0 function04 = composeUiView.requestUpdateWindowFlags;
                        if (function04 != null) {
                            function04.invoke();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        final int i3 = 2;
        orientationAggregator.orientationChangedCallback = new Function0(this) { // from class: app.cash.broadway.ui.compose.ComposeUiView$$ExternalSyntheticLambda0
            public final /* synthetic */ ComposeUiView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ComposeUiView composeUiView = this.f$0;
                switch (i22) {
                    case 0:
                        Function0 function0 = composeUiView.requestUpdateWindowFlags;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        break;
                    case 1:
                        Function0 function02 = composeUiView.requestUpdateWindowFlags;
                        if (function02 != null) {
                            function02.invoke();
                        }
                        break;
                    case 2:
                        Function0 function03 = composeUiView.requestUpdateWindowFlags;
                        if (function03 != null) {
                            function03.invoke();
                        }
                        break;
                    default:
                        Function0 function04 = composeUiView.requestUpdateWindowFlags;
                        if (function04 != null) {
                            function04.invoke();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        final int i4 = 3;
        secureScreenAggregator.enabledChangedCallback = new Function0(this) { // from class: app.cash.broadway.ui.compose.ComposeUiView$$ExternalSyntheticLambda0
            public final /* synthetic */ ComposeUiView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                ComposeUiView composeUiView = this.f$0;
                switch (i22) {
                    case 0:
                        Function0 function0 = composeUiView.requestUpdateWindowFlags;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        break;
                    case 1:
                        Function0 function02 = composeUiView.requestUpdateWindowFlags;
                        if (function02 != null) {
                            function02.invoke();
                        }
                        break;
                    case 2:
                        Function0 function03 = composeUiView.requestUpdateWindowFlags;
                        if (function03 != null) {
                            function03.invoke();
                        }
                        break;
                    default:
                        Function0 function04 = composeUiView.requestUpdateWindowFlags;
                        if (function04 != null) {
                            function04.invoke();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        };
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1772064498);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        byte b = 0;
        int i3 = 1;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            gapComposer.skipToGroupEnd();
        } else if (this.eventReceiver == null) {
            Path$$ExternalSyntheticBUOutline0.m((Object) Boxes$$ExternalSyntheticOutline1.m(getClass(), "setEventReceiver must be called before Content() is invoked for ", ".\nThis may happen if you failed to supply a presenter to Broadway."));
            return;
        } else if (((Boolean) gapComposer.consume(ComposeUiViewKt.LocalInComposeContainer)).booleanValue()) {
            gapComposer.startReplaceGroup(2130711875);
            Updater.CompositionLocalProvider(UiScopeKt.LocalContainerSharedTransitionScope.defaultProvidedValue$runtime(null), Expect_jvmKt.rememberComposableLambda(1251998071, new ComposeUiView$$ExternalSyntheticLambda4(this, b, b), gapComposer), gapComposer, 56);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(2131053247);
            Updater.CompositionLocalProvider(new ProvidedValue[]{CashInsetsKt.LocalCashInsets.defaultProvidedValue$runtime(this.cashInsets), ChromeConfigKt.LocalChromeConfigAggregator.defaultProvidedValue$runtime(this.chromeConfigAggregator), DialogEventHandlerKt.LocalDialogEventDispatcher.defaultProvidedValue$runtime(this.dialogEventDispatcher), FullScreenKt.LocalFullScreenAggregator.defaultProvidedValue$runtime(this.fullScreenAggregator), OrientationKt.LocalOrientationAggregator.defaultProvidedValue$runtime(this.orientationAggregator), SecureScreenKt.LocalSecureScreenAggregator.defaultProvidedValue$runtime(this.secureScreenAggregator)}, Expect_jvmKt.rememberComposableLambda(-1951146738, new ComposeUiView$$ExternalSyntheticLambda4(this, i3, b), gapComposer), gapComposer, 56);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ComposeUiView$$ExternalSyntheticLambda4(this, i);
        }
    }

    public abstract void Content(Object obj, Function1 function1, GapComposer gapComposer);

    @Override // com.squareup.cash.ui.CashInsetsListener
    public final void onApplyCashInsets(CashInsets cashInsets) {
        CashComposeInsets cashComposeInsets = this.cashInsets;
        cashComposeInsets.getClass();
        CashWindowInsets cashWindowInsets = cashComposeInsets.cashFloatingBottomNavigation;
        cashWindowInsets.getClass();
        cashWindowInsets.insets$delegate.setValue(cashInsets.get(cashWindowInsets.f1116type));
        CashWindowInsets cashWindowInsets2 = cashComposeInsets.cashInlineBottomNavigation;
        cashWindowInsets2.getClass();
        cashWindowInsets2.insets$delegate.setValue(cashInsets.get(cashWindowInsets2.f1116type));
    }

    @Override // com.squareup.cash.ui.DialogResultListener
    public void onDialogCanceled(Screen screen) {
        screen.getClass();
        this.dialogEventDispatcher.dispatch(new DialogListenerEvent.OnDialogCanceled(screen));
    }

    @Override // com.squareup.cash.ui.DialogResultListener
    public void onDialogResult(Screen screen, Object obj) {
        screen.getClass();
        this.dialogEventDispatcher.dispatch(new DialogListenerEvent.OnDialogResult(screen, obj));
    }

    @Override // app.cash.broadway.ui.Ui
    public final void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public final void setModel(Object obj) {
        this.updatableModel$delegate.setValue(obj);
    }

    public void setRequestUpdateWindowFlags(Function0<Unit> function0) {
        this.requestUpdateWindowFlags = function0;
    }
}
