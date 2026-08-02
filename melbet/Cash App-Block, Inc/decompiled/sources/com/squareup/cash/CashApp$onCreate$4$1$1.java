package com.squareup.cash;

import android.content.Context;
import androidx.compose.foundation.FocusableNode;
import androidx.compose.foundation.MagnifierNode;
import androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode;
import androidx.room.InvalidationTracker;
import androidx.room.TriggerBasedInvalidationTracker;
import androidx.work.CoroutineWorker;
import app.cash.broadway.presenter.molecule.AnswerDispatcher;
import app.cash.cdp.backend.android.AndroidSessionIdProvider;
import app.cash.cdp.integration.AppLifecycleEventEmitter;
import app.cash.local.worker.LocalActivitySetupTeardown;
import com.squareup.cash.appmessages.AppMessageSyncer;
import com.squareup.cash.attribution.InstallAttributer;
import com.squareup.cash.beacondetection.real.BeaconDetectionSetupTeardown;
import com.squareup.cash.clientsync.pipeline.SessionAwareClientSyncRequestExecutor;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.e2ee.signature.RealSignatureRepo;
import com.squareup.cash.favorites.presenters.FavoriteUpsellRefresher;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.initialscreenloader.backend.AppVersionCheckerActivityWorker;
import com.squareup.cash.initialscreenloader.backend.RealInitialScreenLoader;
import com.squareup.cash.initialscreenloader.backend.RealOpenTheAppUserJourney;
import com.squareup.cash.interaction.InteractionScreenViewLogger;
import com.squareup.cash.investing.backend.real.RealInvestingHistoricalData;
import com.squareup.cash.investing.backend.real.RealInvestingSyncer;
import com.squareup.cash.localization.LanguageDisclosureSetupTeardown;
import com.squareup.cash.localization.RealRegionProvider;
import com.squareup.cash.observability.backend.real.bugsnag.BugsnagClientSandboxSetupTeardown;
import com.squareup.cash.worker.ApplicationWorker;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.SendChannel;

/* loaded from: classes.dex */
public final class CashApp$onCreate$4$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $worker;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CashApp$onCreate$4$1$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$worker = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$worker;
        switch (i) {
            case 0:
                return new CashApp$onCreate$4$1$1((ApplicationWorker) obj2, continuation, 0);
            case 1:
                return new CashApp$onCreate$4$1$1((FocusableNode) obj2, continuation, 1);
            case 2:
                return new CashApp$onCreate$4$1$1((MagnifierNode) obj2, continuation, 2);
            case 3:
                return new CashApp$onCreate$4$1$1((TextFieldCoreModifierNode) obj2, continuation, 3);
            case 4:
                return new CashApp$onCreate$4$1$1((InvalidationTracker) obj2, continuation, 4);
            case 5:
                return new CashApp$onCreate$4$1$1((TriggerBasedInvalidationTracker) obj2, continuation, 5);
            case 6:
                return new CashApp$onCreate$4$1$1((CoroutineWorker) obj2, continuation, 6);
            case 7:
                return new CashApp$onCreate$4$1$1((AnswerDispatcher) obj2, continuation, 7);
            case 8:
                return new CashApp$onCreate$4$1$1((AndroidSessionIdProvider) obj2, continuation, 8);
            case 9:
                return new CashApp$onCreate$4$1$1((AppLifecycleEventEmitter) obj2, continuation, 9);
            case 10:
                return new CashApp$onCreate$4$1$1((LocalActivitySetupTeardown) obj2, continuation, 10);
            case 11:
                return new CashApp$onCreate$4$1$1((Context) obj2, continuation, 11);
            case 12:
                return new CashApp$onCreate$4$1$1((AppMessageSyncer) obj2, continuation, 12);
            case 13:
                return new CashApp$onCreate$4$1$1((InstallAttributer) obj2, continuation, 13);
            case 14:
                return new CashApp$onCreate$4$1$1((BeaconDetectionSetupTeardown) obj2, continuation, 14);
            case 15:
                return new CashApp$onCreate$4$1$1((SendChannel) obj2, continuation, 15);
            case 16:
                return new CashApp$onCreate$4$1$1((FeatureFlagManager) obj2, continuation, 16);
            case 17:
                return new CashApp$onCreate$4$1$1((SessionAwareClientSyncRequestExecutor) obj2, continuation, 17);
            case 18:
                return new CashApp$onCreate$4$1$1((RealProfileManager) obj2, continuation, 18);
            case 19:
                return new CashApp$onCreate$4$1$1((RealSignatureRepo) obj2, continuation, 19);
            case 20:
                return new CashApp$onCreate$4$1$1((FavoriteUpsellRefresher) obj2, continuation, 20);
            case 21:
                return new CashApp$onCreate$4$1$1((AppVersionCheckerActivityWorker) obj2, continuation, 21);
            case 22:
                return new CashApp$onCreate$4$1$1((RealInitialScreenLoader) obj2, continuation, 22);
            case 23:
                return new CashApp$onCreate$4$1$1((RealOpenTheAppUserJourney) obj2, continuation, 23);
            case 24:
                return new CashApp$onCreate$4$1$1((InteractionScreenViewLogger) obj2, continuation, 24);
            case 25:
                return new CashApp$onCreate$4$1$1((RealInvestingHistoricalData) obj2, continuation, 25);
            case 26:
                return new CashApp$onCreate$4$1$1((RealInvestingSyncer) obj2, continuation, 26);
            case 27:
                return new CashApp$onCreate$4$1$1((LanguageDisclosureSetupTeardown) obj2, continuation, 27);
            case 28:
                return new CashApp$onCreate$4$1$1((RealRegionProvider) obj2, continuation, 28);
            default:
                return new CashApp$onCreate$4$1$1((BugsnagClientSandboxSetupTeardown) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 2:
                ((CashApp$onCreate$4$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                break;
            case 8:
                ((CashApp$onCreate$4$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                break;
            case 17:
                ((CashApp$onCreate$4$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                break;
            case 24:
                ((CashApp$onCreate$4$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                break;
        }
        return ((CashApp$onCreate$4$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0554  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:299:0x0552 -> B:292:0x0543). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:301:0x055f -> B:290:0x0563). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 1518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.cash.CashApp$onCreate$4$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
