package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.platform.AndroidPlatformTextInputSession;
import androidx.compose.ui.platform.PlatformTextInputMethodRequest;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.room.util.DBUtil;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.molecule.GatedFrameClock;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharingConfig;
import papa.SafeTrace;
import retrofit2.RequestFactory;

/* loaded from: classes.dex */
public final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ WorkLauncherImpl $composeImm;
    public final /* synthetic */ ImeOptions $imeOptions;
    public final /* synthetic */ TextLayoutState $layoutState;
    public final /* synthetic */ Function1 $onImeAction;
    public final /* synthetic */ TransformedTextFieldState $state;
    public final /* synthetic */ MutableSharedFlow $stylusHandwritingTrigger;
    public final /* synthetic */ AndroidPlatformTextInputSession $this_platformSpecificTextInputSession;
    public final /* synthetic */ Function0 $updateSelectionState;
    public final /* synthetic */ Function1 $updateTouchMode;
    public final /* synthetic */ ViewConfiguration $viewConfiguration;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3(MutableSharedFlow mutableSharedFlow, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, WorkLauncherImpl workLauncherImpl, AndroidPlatformTextInputSession androidPlatformTextInputSession, ImeOptions imeOptions, Function1 function1, Function0 function0, ViewConfiguration viewConfiguration, Function1 function12, Continuation continuation) {
        super(2, continuation);
        this.$stylusHandwritingTrigger = mutableSharedFlow;
        this.$state = transformedTextFieldState;
        this.$layoutState = textLayoutState;
        this.$composeImm = workLauncherImpl;
        this.$this_platformSpecificTextInputSession = androidPlatformTextInputSession;
        this.$imeOptions = imeOptions;
        this.$onImeAction = function1;
        this.$updateSelectionState = function0;
        this.$viewConfiguration = viewConfiguration;
        this.$updateTouchMode = function12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 androidTextInputSession_androidKt$platformSpecificTextInputSession$3 = new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3(this.$stylusHandwritingTrigger, this.$state, this.$layoutState, this.$composeImm, this.$this_platformSpecificTextInputSession, this.$imeOptions, this.$onImeAction, this.$updateSelectionState, this.$viewConfiguration, this.$updateTouchMode, continuation);
        androidTextInputSession_androidKt$platformSpecificTextInputSession$3.L$0 = obj;
        return androidTextInputSession_androidKt$platformSpecificTextInputSession$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                throw Recorder$$ExternalSyntheticOutline2.m(obj);
            }
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
        TransformedTextFieldState transformedTextFieldState = this.$state;
        WorkLauncherImpl workLauncherImpl = this.$composeImm;
        JobKt.launch$default(coroutineScope, null, coroutineStart, new GatedFrameClock.AnonymousClass1(transformedTextFieldState, workLauncherImpl, null, 2), 1);
        MutableSharedFlow mutableSharedFlow = this.$stylusHandwritingTrigger;
        if (mutableSharedFlow != null) {
            JobKt.launch$default(coroutineScope, null, null, new GatedFrameClock.AnonymousClass1(mutableSharedFlow, workLauncherImpl, null, 3), 3);
        }
        final RequestFactory requestFactory = new RequestFactory(transformedTextFieldState, this.$layoutState, workLauncherImpl, coroutineScope);
        final TransformedTextFieldState transformedTextFieldState2 = this.$state;
        final ImeOptions imeOptions = this.$imeOptions;
        final WorkLauncherImpl workLauncherImpl2 = this.$composeImm;
        final Function1 function1 = this.$onImeAction;
        final TextLayoutState textLayoutState = this.$layoutState;
        final Function0 function0 = this.$updateSelectionState;
        final ViewConfiguration viewConfiguration = this.$viewConfiguration;
        final Function1 function12 = this.$updateTouchMode;
        PlatformTextInputMethodRequest platformTextInputMethodRequest = new PlatformTextInputMethodRequest() { // from class: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$$ExternalSyntheticLambda0
            @Override // androidx.compose.ui.platform.PlatformTextInputMethodRequest
            public final InputConnection createInputConnection(EditorInfo editorInfo) {
                TransformedTextFieldState transformedTextFieldState3 = TransformedTextFieldState.this;
                NodeChain nodeChain = new NodeChain(new SharingConfig(transformedTextFieldState3), transformedTextFieldState3, workLauncherImpl2, function1, requestFactory, textLayoutState, function0, viewConfiguration, function12);
                DBUtil.m1188updatepLxbY9I(editorInfo, transformedTextFieldState3.getVisualText(), transformedTextFieldState3.getVisualText().selection, imeOptions);
                return new StatelessInputConnection(nodeChain, editorInfo);
            }
        };
        this.label = 1;
        this.$this_platformSpecificTextInputSession.startInputMethod(platformTextInputMethodRequest, this);
        return coroutineSingletons;
    }
}
