package androidx.compose.runtime.snapshots;

import app.cash.broadway.ui.compose.DialogListenerEvent;
import app.cash.sqldelight.driver.android.AndroidStatement;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.RegisterAliasViewEvent;
import com.squareup.cash.initialscreenloader.screens.InitiateSessionFailedScreen;
import com.squareup.cash.initialscreenloader.screens.InitiateSessionFailedScreen$Result$Retry;
import com.squareup.cash.initialscreenloader.screens.ScenarioPlanErrorScreen;
import com.squareup.cash.initialscreenloader.screens.ScenarioPlanErrorScreen$Result$Retry;
import com.squareup.cash.initialscreenloader.viewmodels.InitialScreenPlaceholderViewEvent;
import com.squareup.cash.onboarding.screens.SelectedCountry;
import com.squareup.protos.franklin.api.HelpItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class SnapshotKt$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ SnapshotKt$$ExternalSyntheticLambda3(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                Snapshot snapshot = (Snapshot) function1.invoke((SnapshotIdSet) obj);
                synchronized (SnapshotKt.lock) {
                    SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(snapshot.getSnapshotId());
                }
                return snapshot;
            case 1:
                Long l = (Long) obj;
                l.getClass();
                return function1.invoke(l);
            case 2:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                return androidStatement.executeQuery(function1);
            case 3:
                DialogListenerEvent dialogListenerEvent = (DialogListenerEvent) obj;
                RegisterAliasViewEvent.AcknowledgeErrorScreen acknowledgeErrorScreen = RegisterAliasViewEvent.AcknowledgeErrorScreen.INSTANCE;
                dialogListenerEvent.getClass();
                if (dialogListenerEvent instanceof DialogListenerEvent.OnDialogResult) {
                    DialogListenerEvent.OnDialogResult onDialogResult = (DialogListenerEvent.OnDialogResult) dialogListenerEvent;
                    if (onDialogResult.getResult() instanceof HelpItem) {
                        Object result = onDialogResult.getResult();
                        result.getClass();
                        function1.invoke(new RegisterAliasViewEvent.HelpItemClick((HelpItem) result));
                    } else if (onDialogResult.getResult() instanceof SelectedCountry) {
                        Object result2 = onDialogResult.getResult();
                        result2.getClass();
                        function1.invoke(new RegisterAliasViewEvent.OnNewCountrySelected(((SelectedCountry) result2).getCountry()));
                    } else if (onDialogResult.getScreen() instanceof BlockersScreens.RegisterErrorScreen) {
                        function1.invoke(acknowledgeErrorScreen);
                    }
                } else if ((dialogListenerEvent instanceof DialogListenerEvent.OnDialogCanceled) && (((DialogListenerEvent.OnDialogCanceled) dialogListenerEvent).getScreen() instanceof BlockersScreens.RegisterErrorScreen)) {
                    function1.invoke(acknowledgeErrorScreen);
                }
                return Unit.INSTANCE;
            case 4:
                AppMessageViewEvent appMessageViewEvent = (AppMessageViewEvent) obj;
                appMessageViewEvent.getClass();
                function1.invoke(appMessageViewEvent);
                return Unit.INSTANCE;
            default:
                DialogListenerEvent dialogListenerEvent2 = (DialogListenerEvent) obj;
                dialogListenerEvent2.getClass();
                if ((dialogListenerEvent2.getScreen() instanceof ScenarioPlanErrorScreen) || (dialogListenerEvent2.getScreen() instanceof InitiateSessionFailedScreen)) {
                    if (dialogListenerEvent2 instanceof DialogListenerEvent.OnDialogResult) {
                        DialogListenerEvent.OnDialogResult onDialogResult2 = (DialogListenerEvent.OnDialogResult) dialogListenerEvent2;
                        if (Intrinsics.areEqual(onDialogResult2.getResult(), ScenarioPlanErrorScreen$Result$Retry.INSTANCE) || Intrinsics.areEqual(onDialogResult2.getResult(), InitiateSessionFailedScreen$Result$Retry.INSTANCE)) {
                            obj2 = InitialScreenPlaceholderViewEvent.RetryError.INSTANCE;
                            function1.invoke(obj2);
                        }
                    }
                    obj2 = InitialScreenPlaceholderViewEvent.IgnoreError.INSTANCE;
                    function1.invoke(obj2);
                }
                return Unit.INSTANCE;
        }
    }
}
