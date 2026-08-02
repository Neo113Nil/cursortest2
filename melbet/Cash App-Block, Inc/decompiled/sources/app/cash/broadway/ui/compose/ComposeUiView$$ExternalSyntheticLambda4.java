package app.cash.broadway.ui.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.broadway.ui.Ui;
import coil3.network.NetworkFetcher$fetch$2;
import com.squareup.cash.storage.RealStorage$temp$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* loaded from: classes.dex */
public final /* synthetic */ class ComposeUiView$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ComposeUiView f$0;

    public /* synthetic */ ComposeUiView$$ExternalSyntheticLambda4(ComposeUiView composeUiView, int i) {
        this.$r8$classId = 2;
        this.f$0 = composeUiView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        ComposeUiView composeUiView = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Object value = composeUiView.updatableModel$delegate.getValue();
                    Ui.EventReceiver eventReceiver = composeUiView.eventReceiver;
                    if (eventReceiver == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    }
                    boolean changedInstance = gapComposer.changedInstance(eventReceiver);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == neverEqualPolicy) {
                        RealStorage$temp$1 realStorage$temp$1 = new RealStorage$temp$1(1, eventReceiver, Ui.EventReceiver.class, "sendEvent", "sendEvent(Ljava/lang/Object;)V", 0, 4);
                        gapComposer.updateRememberedValue(realStorage$temp$1);
                        rememberedValue = realStorage$temp$1;
                    }
                    composeUiView.Content(value, (Function1) ((KFunction) rememberedValue), gapComposer);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                int intValue2 = num.intValue();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object value2 = composeUiView.updatableModel$delegate.getValue();
                    Ui.EventReceiver eventReceiver2 = composeUiView.eventReceiver;
                    if (eventReceiver2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    }
                    boolean changedInstance2 = gapComposer2.changedInstance(eventReceiver2);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new NetworkFetcher$fetch$2(eventReceiver2);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    composeUiView.Content(value2, (Function1) ((KFunction) rememberedValue2), gapComposer2);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                num.getClass();
                composeUiView.Content(composer, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ComposeUiView$$ExternalSyntheticLambda4(ComposeUiView composeUiView, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = composeUiView;
    }
}
