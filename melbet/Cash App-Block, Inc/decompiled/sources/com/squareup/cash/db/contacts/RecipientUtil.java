package com.squareup.cash.db.contacts;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.extractor.ChunkIndexMerger;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.featuretoggle.repository.JsonToggleCollectionDeserializer;
import com.fillr.featuretoggle.repository.ToggleCollection;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.squareup.cash.db2.activity.ActivityRecipient;
import com.squareup.cash.db2.contacts.Recipients;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.protos.franklin.ui.MerchantData;
import com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.features.error.ErrorViewModel$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.reset.ResetScreenKt$$ExternalSyntheticLambda2;
import com.stripe.android.financialconnections.features.reset.ResetState;
import com.stripe.android.financialconnections.features.reset.ResetViewModel;
import com.stripe.android.financialconnections.model.Body$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.uicore.elements.PhoneNumberController$$ExternalSyntheticLambda5;
import com.stripe.android.uicore.elements.TextFieldUIKt$TextField$4$1;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import java.io.BufferedReader;
import java.io.Reader;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KFunction;
import radiography.Radiography$$ExternalSyntheticLambda1;

/* loaded from: classes6.dex */
public abstract class RecipientUtil {
    public static final void ResetContent(Async async, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-412510809);
        int i2 = (gapComposer.changed(async) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            if (Intrinsics.areEqual(async, Async.Uninitialized.INSTANCE) || (async instanceof Async.Loading) || (async instanceof Async.Success)) {
                gapComposer.startReplaceGroup(2039839419);
                ListItemKt.FullScreenGenericLoading(gapComposer, 0);
                gapComposer.end(false);
            } else {
                if (!(async instanceof Async.Fail)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 2039837348, false);
                }
                gapComposer.startReplaceGroup(2039841058);
                boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
                Object rememberedValue = gapComposer.rememberedValue();
                if (z || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ResetScreenKt$$ExternalSyntheticLambda2(function1, async, 0);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                ListItemKt.UnclassifiedErrorContent(false, (Function0) rememberedValue, gapComposer, 0, 1);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Radiography$$ExternalSyntheticLambda1(async, function1, i, 23);
        }
    }

    public static final void ResetScreen(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(594421417);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl = Identity.parentActivity(gapComposer).getViewModel().activityRetainedComponent;
            FinancialConnectionsSessionManifest.Pane pane = ResetViewModel.PANE;
            daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.getClass();
            ChunkIndexMerger chunkIndexMerger = new ChunkIndexMerger(1);
            ErrorViewModel$Companion$$ExternalSyntheticLambda0 errorViewModel$Companion$$ExternalSyntheticLambda0 = new ErrorViewModel$Companion$$ExternalSyntheticLambda0(daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl, 10);
            ReflectionFactory reflectionFactory = Reflection.factory;
            chunkIndexMerger.addInitializer(reflectionFactory.getOrCreateKotlinClass(ResetViewModel.class), errorViewModel$Companion$$ExternalSyntheticLambda0);
            InitializerViewModelFactory build = chunkIndexMerger.build();
            ViewModelStoreOwner current = LocalViewModelStoreOwner.getCurrent(gapComposer);
            if (current == null) {
                a$$ExternalSyntheticBUOutline0.m$1("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            ResetViewModel resetViewModel = (ResetViewModel) ((FinancialConnectionsViewModel) ViewModelKt.viewModel(reflectionFactory.getOrCreateKotlinClass(ResetViewModel.class), current, build, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, gapComposer));
            FinancialConnectionsSheetNativeViewModel parentViewModel = TaskUtil.parentViewModel(gapComposer);
            MutableState collectAsState = StateFlowsComposeKt.collectAsState(resetViewModel.stateFlow, gapComposer);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new Body$$ExternalSyntheticLambda0(8);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(true, (Function0) rememberedValue, gapComposer, 54, 0);
            Async async = ((ResetState) collectAsState.getValue()).payload;
            boolean changedInstance = gapComposer.changedInstance(parentViewModel);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new TextFieldUIKt$TextField$4$1(1, parentViewModel, FinancialConnectionsSheetNativeViewModel.class, "onCloseFromErrorClick", "onCloseFromErrorClick(Ljava/lang/Throwable;)V", 0, 16);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            ResetContent(async, (Function1) ((KFunction) rememberedValue2), gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PhoneNumberController$$ExternalSyntheticLambda5(i, 13);
        }
    }

    public static Recipient createRecipient(ActivityRecipient activityRecipient, boolean z) {
        boolean z2;
        boolean z3;
        activityRecipient.getClass();
        String str = activityRecipient.lookup_key;
        String str2 = activityRecipient.email;
        String str3 = activityRecipient.sms;
        String str4 = activityRecipient.cashtag;
        String str5 = activityRecipient.customer_id;
        String str6 = activityRecipient.threaded_customer_id;
        boolean z4 = activityRecipient.can_accept_payments;
        boolean z5 = activityRecipient.is_cash_customer;
        String str7 = activityRecipient.contact_display_name;
        String str8 = activityRecipient.customer_display_name;
        String str9 = ((z5 || str7 == null || str == null) && str8 != null) ? str8 : str7;
        MerchantData merchantData = activityRecipient.merchant_data;
        Region region = activityRecipient.region;
        String str10 = activityRecipient.category;
        Color color = activityRecipient.themed_accent_color;
        long j = activityRecipient.credit_card_fee;
        boolean z6 = activityRecipient.is_verified;
        boolean z7 = activityRecipient.is_business;
        Image image = activityRecipient.photo;
        Boolean bool = activityRecipient.already_invited;
        if (bool != null) {
            z2 = bool.booleanValue();
            z3 = false;
        } else {
            z2 = false;
            z3 = false;
        }
        String str11 = activityRecipient.email_addresses;
        boolean z8 = z2;
        Boolean bool2 = activityRecipient.has_multiple_customers;
        return new Recipient(str, z8, bool2 != null ? bool2.booleanValue() : z3, str5, str6, str4, z5, z6, z7, str2, str3, image, str11, activityRecipient.sms_numbers, z4, j, activityRecipient.blocked, merchantData, z, null, color, region, str10, null, str9, str7, activityRecipient.investment_entity_token, null, activityRecipient.lookup_key != null ? true : z3, null, false, false, activityRecipient.render_data, null, -394264576, 55);
    }

    public static ToggleCollection fromJson(BufferedReader bufferedReader) {
        try {
            ToggleCollection toggleCollection = (ToggleCollection) new GsonBuilder().registerTypeAdapter(ToggleCollection.class, new JsonToggleCollectionDeserializer()).create().fromJson((Reader) bufferedReader, ToggleCollection.class);
            if (toggleCollection == null) {
                return null;
            }
            if (toggleCollection.features != null) {
                return toggleCollection;
            }
            return null;
        } catch (JsonIOException | JsonSyntaxException unused) {
            return null;
        }
    }

    public static Recipient createRecipient(Recipients recipients) {
        boolean z;
        boolean z2;
        boolean z3;
        recipients.getClass();
        String str = recipients.lookup_key;
        String str2 = recipients.email;
        String str3 = recipients.sms;
        String str4 = recipients.cashtag;
        String str5 = recipients.customer_id;
        String str6 = recipients.threaded_customer_id;
        boolean z4 = recipients.can_accept_payments;
        boolean z5 = recipients.is_cash_customer;
        String str7 = recipients.contact_display_name;
        String str8 = recipients.customer_display_name;
        String str9 = ((z5 || str7 == null || str == null) && str8 != null) ? str8 : str7;
        MerchantData merchantData = recipients.merchant_data;
        Region region = recipients.region;
        String str10 = recipients.category;
        Color color = recipients.themed_accent_color;
        long j = recipients.credit_card_fee;
        boolean z6 = recipients.is_verified;
        boolean z7 = recipients.is_business;
        Image image = recipients.photo;
        boolean z8 = recipients.already_invited;
        String str11 = recipients.email_addresses;
        boolean z9 = recipients.has_multiple_customers;
        BlockState blockState = recipients.blocked;
        if (blockState == null) {
            blockState = BlockState.NOT_BLOCKED;
        }
        BlockState blockState2 = blockState;
        if (recipients.is_recent == 1) {
            z = false;
            z2 = z8;
            z3 = true;
        } else {
            z = false;
            z2 = z8;
            z3 = false;
        }
        return new Recipient(str, z2, z9, str5, str6, str4, z5, z6, z7, str2, str3, image, str11, recipients.sms_numbers, z4, j, blockState2, merchantData, z3, null, color, region, str10, null, str9, str7, null, null, str != null ? true : z, null, false, false, null, null, -327155712, 63);
    }
}
