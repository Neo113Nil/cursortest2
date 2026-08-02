package com.squareup.cash.db2;

import android.database.Cursor;
import android.os.Trace;
import app.cash.local.primitives.BrandCollectionDataKt;
import app.cash.sqldelight.driver.android.AndroidCursor;
import com.squareup.cash.db2.payment.PendingPaymentQueries$nextRetry$2;
import com.squareup.cash.db2.payment.PendingTransferQueries$nextRetry$2;
import com.squareup.cash.db2.profile.ProfileQueries$profileToken$2;
import com.squareup.cash.family.familyhub.backend.api.Dependent;
import com.squareup.cash.initialscreenloader.screens.InitialScreenPlaceholder;
import com.squareup.cash.interaction.ScreenNavigationEnd;
import com.squareup.cash.interaction.ScreenNavigationStart;
import com.squareup.cash.interaction.ScreenPresentationStart;
import com.squareup.cash.interaction.UiCreate;
import com.squareup.cash.interaction.UiInteractionLatencyAnalyzer;
import com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda5;
import com.squareup.protos.cash.aegis.sync_values.FamilyAccount;
import com.squareup.protos.cash.aegis.sync_values.FamilyAccount$Type$Sponsor;
import com.squareup.protos.cash.aegis.sync_values.Sponsor;
import com.squareup.protos.cash.aegis.sync_values.SponsorshipState;
import com.squareup.protos.cash.aegis.sync_values.UiFamilyAccount;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt___StringsKt;
import okhttp3.Cache;
import papa.InteractionEngine;
import papa.InteractionEngine$sendEvent$realEventScope$1;
import papa.InteractionScope;
import papa.InteractionUpdated;
import papa.SentEvent;

/* loaded from: classes.dex */
public final /* synthetic */ class WebLoginConfigQueries$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ WebLoginConfigQueries$$ExternalSyntheticLambda0(UiInteractionLatencyAnalyzer uiInteractionLatencyAnalyzer) {
        this.$r8$classId = 27;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BrandCollectionDataKt brandCollectionDataKt;
        Object obj2;
        final int i = 3;
        final int i2 = 2;
        boolean z = true;
        z = true;
        final int i3 = 0;
        switch (this.$r8$classId) {
            case 0:
                WebLoginConfigQueries$select$2 webLoginConfigQueries$select$2 = WebLoginConfigQueries$select$2.INSTANCE;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                androidCursor.getClass();
                break;
            case 1:
                int i4 = TreehouseAppConfigQueries$selectAll$2.$r8$clinit;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                androidCursor2.getClass();
                break;
            case 2:
                AndroidCursor androidCursor3 = (AndroidCursor) obj;
                androidCursor3.getClass();
                Boolean bool = androidCursor3.getBoolean(0);
                bool.getClass();
                break;
            case 3:
                PendingPaymentQueries$nextRetry$2 pendingPaymentQueries$nextRetry$2 = PendingPaymentQueries$nextRetry$2.INSTANCE;
                AndroidCursor androidCursor4 = (AndroidCursor) obj;
                androidCursor4.getClass();
                break;
            case 4:
                PendingTransferQueries$nextRetry$2 pendingTransferQueries$nextRetry$2 = PendingTransferQueries$nextRetry$2.INSTANCE;
                AndroidCursor androidCursor5 = (AndroidCursor) obj;
                androidCursor5.getClass();
                break;
            case 5:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                function1.invoke("featureFlags");
                break;
            case 6:
                Function1 function12 = (Function1) obj;
                function12.getClass();
                function12.invoke("featureFlags");
                break;
            case 7:
                ProfileQueries$profileToken$2 profileQueries$profileToken$2 = ProfileQueries$profileToken$2.INSTANCE;
                AndroidCursor androidCursor6 = (AndroidCursor) obj;
                androidCursor6.getClass();
                break;
            case 8:
                Function1 function13 = (Function1) obj;
                function13.getClass();
                function13.invoke("balanceData");
                function13.invoke("instrumentLinkingOption");
                function13.invoke("notificationPreference");
                function13.invoke("profile");
                function13.invoke("profileAlias");
                function13.invoke("scenarioPlan");
                break;
            case 9:
                List list = (List) obj;
                list.getClass();
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        SponsorshipState sponsorshipState = ((Sponsor) it.next()).status;
                        if (sponsorshipState != SponsorshipState.ACTIVE && sponsorshipState != SponsorshipState.SUSPENDED) {
                        }
                        break;
                    }
                }
                z = false;
                break;
            case 10:
                Dependent dependent = (Dependent) obj;
                dependent.getClass();
                break;
            case 11:
                UiFamilyAccount uiFamilyAccount = (UiFamilyAccount) obj;
                uiFamilyAccount.getClass();
                FamilyAccount familyAccount = uiFamilyAccount.family_account;
                if (familyAccount != null && (brandCollectionDataKt = familyAccount.f1246type) != null) {
                    FamilyAccount$Type$Sponsor familyAccount$Type$Sponsor = brandCollectionDataKt instanceof FamilyAccount$Type$Sponsor ? (FamilyAccount$Type$Sponsor) brandCollectionDataKt : null;
                    if (familyAccount$Type$Sponsor != null) {
                        break;
                    }
                }
                break;
            case 12:
                List list3 = (List) obj;
                list3.getClass();
                break;
            case 13:
                break;
            case 14:
                final Cursor cursor = (Cursor) obj;
                cursor.getClass();
                break;
            case 15:
                Cursor cursor2 = (Cursor) obj;
                cursor2.getClass();
                break;
            case 16:
                Cursor cursor3 = (Cursor) obj;
                cursor3.getClass();
                break;
            case 17:
                Cursor cursor4 = (Cursor) obj;
                cursor4.getClass();
                break;
            case 18:
                final Cursor cursor5 = (Cursor) obj;
                cursor5.getClass();
                break;
            case 19:
                final Cursor cursor6 = (Cursor) obj;
                cursor6.getClass();
                break;
            case 20:
                final Cursor cursor7 = (Cursor) obj;
                cursor7.getClass();
                break;
            case 21:
                final Cursor cursor8 = (Cursor) obj;
                cursor8.getClass();
                final int i5 = 4;
                break;
            case 22:
                final Cursor cursor9 = (Cursor) obj;
                cursor9.getClass();
                break;
            case 23:
                final Cursor cursor10 = (Cursor) obj;
                cursor10.getClass();
                final int i6 = z ? 1 : 0;
                break;
            case 24:
                final Cursor cursor11 = (Cursor) obj;
                cursor11.getClass();
                break;
            case 25:
                String str = (String) obj;
                str.getClass();
                break;
            case 26:
                break;
            case 27:
                InteractionScope interactionScope = (InteractionScope) obj;
                interactionScope.getClass();
                WebLoginConfigQueries$$ExternalSyntheticLambda0 webLoginConfigQueries$$ExternalSyntheticLambda0 = new WebLoginConfigQueries$$ExternalSyntheticLambda0(28);
                ArrayList arrayList = interactionScope.onEventCallbacks;
                TypeIntrinsics.beforeCheckcastToFunctionOfArity(1, webLoginConfigQueries$$ExternalSyntheticLambda0);
                arrayList.add(new Pair(ScreenNavigationStart.class, webLoginConfigQueries$$ExternalSyntheticLambda0));
                WebLoginConfigQueries$$ExternalSyntheticLambda0 webLoginConfigQueries$$ExternalSyntheticLambda02 = new WebLoginConfigQueries$$ExternalSyntheticLambda0(29);
                TypeIntrinsics.beforeCheckcastToFunctionOfArity(1, webLoginConfigQueries$$ExternalSyntheticLambda02);
                arrayList.add(new Pair(ScreenNavigationEnd.class, webLoginConfigQueries$$ExternalSyntheticLambda02));
                MainActivity$$ExternalSyntheticLambda5 mainActivity$$ExternalSyntheticLambda5 = new MainActivity$$ExternalSyntheticLambda5(z ? 1 : 0);
                TypeIntrinsics.beforeCheckcastToFunctionOfArity(1, mainActivity$$ExternalSyntheticLambda5);
                arrayList.add(new Pair(ScreenPresentationStart.class, mainActivity$$ExternalSyntheticLambda5));
                MainActivity$$ExternalSyntheticLambda5 mainActivity$$ExternalSyntheticLambda52 = new MainActivity$$ExternalSyntheticLambda5(i2);
                TypeIntrinsics.beforeCheckcastToFunctionOfArity(1, mainActivity$$ExternalSyntheticLambda52);
                arrayList.add(new Pair(UiCreate.class, mainActivity$$ExternalSyntheticLambda52));
                break;
            case 28:
                InteractionEngine$sendEvent$realEventScope$1 interactionEngine$sendEvent$realEventScope$1 = (InteractionEngine$sendEvent$realEventScope$1) obj;
                interactionEngine$sendEvent$realEventScope$1.getClass();
                InteractionEngine interactionEngine = interactionEngine$sendEvent$realEventScope$1.this$0;
                Iterator it2 = CollectionsKt.toList(interactionEngine.runningInteractions).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        SentEvent sentEvent = (SentEvent) CollectionsKt.firstOrNull((List) ((InteractionEngine.RealRunningInteraction) obj2).sentEvents);
                        if ((sentEvent != null ? sentEvent.event.getScreen() : null) instanceof InitialScreenPlaceholder) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                if (((InteractionEngine.RealRunningInteraction) obj2) == null) {
                    SentEvent sentEvent2 = interactionEngine.eventInScope;
                    sentEvent2.getClass();
                    String obj3 = sentEvent2.event.toString();
                    obj3.getClass();
                    for (InteractionEngine.RealRunningInteraction realRunningInteraction : CollectionsKt.toList(interactionEngine.runningInteractions)) {
                        realRunningInteraction.getClass();
                        InteractionEngine interactionEngine2 = InteractionEngine.this;
                        SentEvent sentEvent3 = interactionEngine2.eventInScope;
                        sentEvent3.getClass();
                        if (Trace.isEnabled()) {
                            Trace.beginSection(androidx.tracing.Trace.truncatedTraceSectionLabel(StringsKt___StringsKt.take(127, "PAPA-cancel:" + sentEvent3.event + ':' + obj3)));
                            Trace.endSection();
                        }
                        realRunningInteraction.stopRunning();
                        realRunningInteraction.trace.endTrace();
                        interactionEngine2.updateListener.onInteractionUpdate(new InteractionUpdated.CanceledOnEvent(sentEvent3, realRunningInteraction, obj3));
                    }
                }
                Cache.Companion.m4319startInteractionSxA4cEA$default(interactionEngine$sendEvent$realEventScope$1, null, null, 7).recordEvent();
                break;
            default:
                InteractionEngine$sendEvent$realEventScope$1 interactionEngine$sendEvent$realEventScope$12 = (InteractionEngine$sendEvent$realEventScope$1) obj;
                interactionEngine$sendEvent$realEventScope$12.getClass();
                InteractionEngine.RealRunningInteraction realRunningInteraction2 = (InteractionEngine.RealRunningInteraction) CollectionsKt.singleOrNull(CollectionsKt.toList(interactionEngine$sendEvent$realEventScope$12.this$0.runningInteractions));
                if (realRunningInteraction2 == null) {
                    Cache.Companion.m4319startInteractionSxA4cEA$default(interactionEngine$sendEvent$realEventScope$12, null, null, 7).recordEvent();
                } else {
                    realRunningInteraction2.recordEvent();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ WebLoginConfigQueries$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }
}
