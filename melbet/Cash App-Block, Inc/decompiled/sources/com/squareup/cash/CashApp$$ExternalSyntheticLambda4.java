package com.squareup.cash;

import android.app.Application;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.BoundsTransform;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.platform.TestTagKt;
import androidx.datastore.core.SimpleActor;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.tracing.Trace;
import app.cash.broadway.screen.Screen;
import app.cash.util.leakdetector.api.LeakDetector;
import com.squareup.cash.appmessages.InAppNotificationModel;
import com.squareup.cash.appmessages.views.RealAppMessageImageLoader;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionKt$$ExternalSyntheticLambda4;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.viewmodels.RegisterAliasViewModel;
import com.squareup.cash.blockers.views.RegisterAliasView;
import com.squareup.cash.blockers.views.RegisterAliasViewKt$$ExternalSyntheticLambda18;
import com.squareup.cash.blockers.views.RegisterAliasViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.core.navigationcontainer.UiContainerKt;
import com.squareup.cash.storage.StorageLink;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import papa.internal.LaunchTracker$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public final /* synthetic */ class CashApp$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ CashApp$$ExternalSyntheticLambda4(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        VariantSandboxedComponent runSandboxedComponentStateFlow$lambda$0;
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj3 = this.f$2;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        int i2 = 1;
        switch (i) {
            case 0:
                runSandboxedComponentStateFlow$lambda$0 = CashApp.runSandboxedComponentStateFlow$lambda$0((CashApp) obj5, (Application) obj4, (LeakDetector) obj3, (CoroutineScope) obj, (StorageLink) obj2);
                break;
            case 1:
                SimpleActor simpleActor = (SimpleActor) obj5;
                Icons icons = (Icons) obj4;
                String str = (String) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier modifier = Modifier.Companion.$$INSTANCE;
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(modifier, 24.0f);
                    if (simpleActor != null) {
                        gapComposer.startReplaceGroup(-990610333);
                        SharedTransitionScope sharedTransitionScope = (SharedTransitionScope) simpleActor.consumeMessage;
                        SharedTransitionScope.SharedContentState rememberSharedContentState = sharedTransitionScope.rememberSharedContentState(simpleActor.remainingMessages, gapComposer, 0);
                        AnimatedVisibilityScope animatedVisibilityScope = (AnimatedVisibilityScope) simpleActor.scope;
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (rememberedValue == neverEqualPolicy) {
                            rememberedValue = new TitleBarActionKt$$ExternalSyntheticLambda4(1);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        modifier = SharedTransitionScope.sharedBounds$default(sharedTransitionScope, modifier, rememberSharedContentState, animatedVisibilityScope, null, null, (BoundsTransform) rememberedValue, null, null, 1004);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-990043653);
                        gapComposer.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons, str, m285size3ABfNKs.then(modifier), ((Color) gapComposer.consume(ArcadeThemeKt.LocalIconColor)).value, gapComposer, 0, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((RegisterAliasView) obj5).Content((RegisterAliasViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 3:
                RegisterAliasViewModel registerAliasViewModel = (RegisterAliasViewModel) obj5;
                TextFieldState textFieldState = (TextFieldState) obj4;
                Function1 function1 = (Function1) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changedInstance = gapComposer2.changedInstance(registerAliasViewModel) | gapComposer2.changed(textFieldState) | gapComposer2.changed(function1);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new LaunchTracker$$ExternalSyntheticLambda0(4, registerAliasViewModel, textFieldState, function1);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, fillMaxWidth, null, false, false, null, Expect_jvmKt.rememberComposableLambda(869910022, new RegisterAliasViewKt$$ExternalSyntheticLambda18(registerAliasViewModel, i2), gapComposer2), gapComposer2, 1572912, 60);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 4:
                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj5;
                Function1 function12 = (Function1) obj4;
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Icons icons2 = Icons.NavigationHelp;
                    String stringResource = Room.stringResource(gapComposer3, R.string.blockers_help);
                    boolean changed = gapComposer3.changed(function12) | gapComposer3.changed(delegatingSoftwareKeyboardController);
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    if (changed || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new RegisterAliasViewKt$$ExternalSyntheticLambda7(function12, delegatingSoftwareKeyboardController);
                        gapComposer3.updateRememberedValue(rememberedValue3);
                    }
                    TransactorKt.IconAction(titleBarActionScope, icons2, stringResource, (Function0) rememberedValue3, TestTagKt.testTag(companion, "help_button"), null, null, null, null, null, false, gapComposer3, 24624, IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                UiContainerKt.AttachUiModelReceivedSideEffect(obj5, (Screen) obj4, (List) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            default:
                ((Integer) obj2).getClass();
                UiContainerKt.InAppNotification((RealAppMessageImageLoader) obj5, (Function1) obj4, (InAppNotificationModel) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ CashApp$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }
}
