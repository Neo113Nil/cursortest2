package com.datadog.trace.util;

import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.extractor.ChunkIndexMerger;
import androidx.navigation.NavBackStackEntry;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.auth.api.identity.Identity;
import com.squareup.cash.cdf.ContactSyncResult;
import com.squareup.cash.cdf.ContactSyncTriggerReason;
import com.squareup.cash.cdf.contact.ContactSyncSendToServer;
import com.squareup.cash.data.contacts.ContactSync$SyncReason;
import com.squareup.cash.data.contacts.ContactsSyncToServerRoutineKt$WhenMappings;
import com.squareup.cash.work.views.pay.PayCellViewKt$$ExternalSyntheticLambda0;
import com.squareup.protos.franklin.app.SyncContactsResponse;
import com.squareup.scannerview.ScannerView;
import com.stripe.android.core.networking.MarkdownParser$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;
import com.stripe.android.financialconnections.features.accountupdate.AccountUpdateRequiredState;
import com.stripe.android.financialconnections.features.accountupdate.AccountUpdateRequiredViewModel;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.features.exit.ExitModalKt$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.exit.ExitViewModel$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.FinancialConnectionsGenericInfoScreen;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KFunction;

/* loaded from: classes6.dex */
public abstract class Strings {
    public static final void AccountUpdateRequiredModal(NavBackStackEntry navBackStackEntry, Composer composer, int i) {
        int i2;
        NeverEqualPolicy neverEqualPolicy;
        navBackStackEntry.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1641380532);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(navBackStackEntry) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl = Identity.parentActivity(gapComposer).getViewModel().activityRetainedComponent;
            FinancialConnectionsSessionManifest.Pane pane = AccountUpdateRequiredViewModel.PANE;
            Bundle arguments$navigation_common_release = navBackStackEntry.impl.getArguments$navigation_common_release();
            daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.getClass();
            ChunkIndexMerger chunkIndexMerger = new ChunkIndexMerger(1);
            ExitViewModel$Companion$$ExternalSyntheticLambda0 exitViewModel$Companion$$ExternalSyntheticLambda0 = new ExitViewModel$Companion$$ExternalSyntheticLambda0(daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl, arguments$navigation_common_release, i3);
            ReflectionFactory reflectionFactory = Reflection.factory;
            chunkIndexMerger.addInitializer(reflectionFactory.getOrCreateKotlinClass(AccountUpdateRequiredViewModel.class), exitViewModel$Companion$$ExternalSyntheticLambda0);
            InitializerViewModelFactory build = chunkIndexMerger.build();
            ViewModelStoreOwner current = LocalViewModelStoreOwner.getCurrent(gapComposer);
            if (current == null) {
                a$$ExternalSyntheticBUOutline0.m$1("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            AccountUpdateRequiredViewModel accountUpdateRequiredViewModel = (AccountUpdateRequiredViewModel) ((FinancialConnectionsViewModel) ViewModelKt.viewModel(reflectionFactory.getOrCreateKotlinClass(AccountUpdateRequiredViewModel.class), current, build, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, gapComposer));
            NoticeSheetState.NoticeSheetContent.UpdateRequired updateRequired = (NoticeSheetState.NoticeSheetContent.UpdateRequired) ((AccountUpdateRequiredState) StateFlowsComposeKt.collectAsState(accountUpdateRequiredViewModel.stateFlow, gapComposer).getValue()).payload.invoke();
            boolean changedInstance = gapComposer.changedInstance(accountUpdateRequiredViewModel);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy2) {
                neverEqualPolicy = neverEqualPolicy2;
                ScannerView.AnonymousClass1 anonymousClass1 = new ScannerView.AnonymousClass1(0, accountUpdateRequiredViewModel, AccountUpdateRequiredViewModel.class, "handleContinue", "handleContinue()V", 0, 11);
                gapComposer.updateRememberedValue(anonymousClass1);
                rememberedValue = anonymousClass1;
            } else {
                neverEqualPolicy = neverEqualPolicy2;
            }
            Function0 function0 = (Function0) ((KFunction) rememberedValue);
            boolean changedInstance2 = gapComposer.changedInstance(accountUpdateRequiredViewModel);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                ScannerView.AnonymousClass1 anonymousClass12 = new ScannerView.AnonymousClass1(0, accountUpdateRequiredViewModel, AccountUpdateRequiredViewModel.class, "handleCancel", "handleCancel()V", 0, 12);
                gapComposer.updateRememberedValue(anonymousClass12);
                rememberedValue2 = anonymousClass12;
            }
            AccountUpdateRequiredModalContent(updateRequired, function0, (Function0) ((KFunction) rememberedValue2), gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ExitModalKt$$ExternalSyntheticLambda0(navBackStackEntry, i, i3);
        }
    }

    public static final void AccountUpdateRequiredModalContent(NoticeSheetState.NoticeSheetContent.UpdateRequired updateRequired, Function0 function0, Function0 function02, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(139634609);
        int i2 = (gapComposer.changedInstance(updateRequired) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16) | (gapComposer.changedInstance(function02) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            if ((updateRequired != null ? updateRequired.generic : null) != null) {
                gapComposer.startReplaceGroup(-1968505052);
                FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen = updateRequired.generic;
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new MarkdownParser$$ExternalSyntheticLambda0(14);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                int i3 = i2 << 3;
                ListItemKt.GenericBottomSheetContent(financialConnectionsGenericInfoScreen, (Function1) rememberedValue, function0, function02, gapComposer, (i3 & 896) | 48 | (i3 & 7168));
            } else {
                gapComposer.startReplaceGroup(-1970327759);
            }
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PayCellViewKt$$ExternalSyntheticLambda0((Object) updateRequired, (Object) function0, (Object) function02, i, 14);
        }
    }

    public static final boolean isNetworkError(ContactSyncResult contactSyncResult) {
        int i = contactSyncResult == null ? -1 : ContactsSyncToServerRoutineKt$WhenMappings.$EnumSwitchMapping$1[contactSyncResult.ordinal()];
        if (i == -1 || i == 1 || i == 2) {
            return false;
        }
        if (i == 3 || i == 4 || i == 5) {
            return true;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return false;
    }

    public static String normalizedHeaderTag(String str) {
        if (str.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(str.length());
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            if (Character.isWhitespace(charAt)) {
                sb.append('_');
            } else {
                if (i == -1) {
                    i = i3;
                }
                if (Character.isLetterOrDigit(charAt) || charAt == '_' || charAt == '-' || charAt == '/') {
                    sb.append(Character.toLowerCase(charAt));
                } else {
                    sb.append('_');
                }
                i2 = i3;
            }
        }
        return i == -1 ? "" : sb.substring(i, i2 + 1);
    }

    public static final ContactSyncTriggerReason toCdfTriggerReason(ContactSync$SyncReason contactSync$SyncReason) {
        contactSync$SyncReason.getClass();
        if (Intrinsics.areEqual(contactSync$SyncReason, ContactSync$SyncReason.AppLaunch.INSTANCE)) {
            return ContactSyncTriggerReason.APP_LAUNCH;
        }
        if (Intrinsics.areEqual(contactSync$SyncReason, ContactSync$SyncReason.Refresh.INSTANCE)) {
            return null;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final ContactSyncSendToServer.ServerResponse toServerResponse(ApiResult apiResult) {
        apiResult.getClass();
        boolean z = apiResult instanceof ApiResult.Success;
        return (z && ((SyncContactsResponse) ((ApiResult.Success) apiResult).response).status == SyncContactsResponse.Status.TOO_MANY_ATTEMPTS) ? ContactSyncSendToServer.ServerResponse.TOO_MANY_ATTEMPTS : (z && ((SyncContactsResponse) ((ApiResult.Success) apiResult).response).status == SyncContactsResponse.Status.INVALID) ? ContactSyncSendToServer.ServerResponse.INVALID : z ? ContactSyncSendToServer.ServerResponse.SUCCESS : apiResult instanceof ApiResult.Failure ? ContactSyncSendToServer.ServerResponse.ERROR : ContactSyncSendToServer.ServerResponse.UNKNOWN;
    }

    public static final ContactSyncResult toSyncResult(ContactSyncSendToServer.ServerResponse serverResponse) {
        int ordinal = serverResponse.ordinal();
        if (ordinal == 0) {
            return ContactSyncResult.SUCCESS;
        }
        if (ordinal == 1) {
            return ContactSyncResult.FAILURE;
        }
        if (ordinal == 2) {
            return ContactSyncResult.REQUEST_SKIPPED;
        }
        if (ordinal == 3) {
            return ContactSyncResult.TOO_MANY_ATTEMPTS;
        }
        if (ordinal == 4) {
            return ContactSyncResult.INVALID;
        }
        if (ordinal == 5) {
            return null;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static String trim(String str) {
        return str == null ? "" : str.trim();
    }
}
