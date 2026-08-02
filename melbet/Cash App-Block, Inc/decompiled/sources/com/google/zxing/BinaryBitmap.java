package com.google.zxing;

import android.content.Context;
import android.content.SharedPreferences;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.os.Handler;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.lazy.LazyListState$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.glance.session.SessionWorker$doWork$2$2;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.api.ApiResult;
import app.cash.local.backend.real.RealCartBuilderManager$$ExternalSyntheticLambda1;
import app.cash.local.views.internal.DismissableToastKt$$ExternalSyntheticLambda4;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.treehouse.RealTreehouseApp;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.internal.UtilsKt$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzot;
import com.google.android.gms.internal.mlkit_genai_prompt.zzzx;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.internal.ViewUtils;
import com.google.android.play.core.appupdate.internal.zzx;
import com.google.android.play.core.review.zzi;
import com.google.common.util.concurrent.AsyncCallable;
import com.google.common.util.concurrent.DirectExecutor;
import com.google.common.util.concurrent.ExecutionSequencer$RunningState;
import com.google.common.util.concurrent.ExecutionSequencer$TaskNonReentrantExecutor;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ImmediateFuture;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.TrustedListenableFutureTask;
import com.google.common.util.concurrent.TrustedListenableFutureTask.TrustedFutureInterruptibleAsyncTask;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.crypto.tink.prf.Prf;
import com.google.crypto.tink.prf.internal.PrfAesCmac;
import com.google.mlkit.genai.prompt.Candidate;
import com.google.mlkit.genai.prompt.GenerateContentRequest;
import com.google.mlkit.genai.prompt.GenerateContentResponse;
import com.google.mlkit.genai.prompt.TextPart;
import com.google.mlkit.vision.text.internal.zzr;
import com.google.mlkit.vision.text.zza;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.GenericGFPoly;
import com.lyft.kronos.internal.ntp.SntpClient;
import com.miteksystems.misnap.camera.a.b;
import com.miteksystems.misnap.camera.a.n;
import com.squareup.address.typeahead.backend.api.AddressSearchResult;
import com.squareup.address.typeahead.backend.real.PlacesAddressSearcher;
import com.squareup.cash.activity.presenters.RealContactHeaderPresenter$Factory$Impl;
import com.squareup.cash.aiedge.AmbiguousDescriptionException;
import com.squareup.cash.aiedge.MLKitTitleGenerator$1;
import com.squareup.cash.aiedge.MLKitTitleGenerator$generateTitle$1;
import com.squareup.cash.aiedge.MLKitTitleGenerator$isAvailable$1;
import com.squareup.cash.aiedge.MLKitTitleGenerator$prepareModel$1;
import com.squareup.cash.amountslider.AmountPickerCondensedView;
import com.squareup.cash.appmessages.views.sheet.RealEmbeddedTreehouseContent$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda5;
import com.squareup.cash.autofillweb.api.AutofillWebField;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.bitcoin.presenters.BitcoinDepositsPresenter$special$$inlined$filter$1;
import com.squareup.cash.bitcoin.presenters.applet.BitcoinHomePresenterKt$$ExternalSyntheticLambda0;
import com.squareup.cash.bitcoin.presenters.applet.widget.BitcoinHomeWidgetPresenter;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.disclosure.BitcoinHomeDisclosureWidgetViewModel;
import com.squareup.cash.blockers.flow.RealMultiBlockerFacilitator;
import com.squareup.cash.blockers.flow.RealMultiBlockerFacilitator$SingleBlockerResolver$resolve$1;
import com.squareup.cash.blockers.flow.RealMultiBlockerFacilitator$SingleBlockerResolver$resolve$3;
import com.squareup.cash.blockers.flow.RealMultiBlockerFacilitator$SingleBlockerResolver$resolve$5;
import com.squareup.cash.blockers.flow.RealMultiBlockerFacilitator$SingleBlockerResolver$resolve$7;
import com.squareup.cash.blockers.flow.api.MultiBlockerFacilitator$Resolver;
import com.squareup.cash.blockers.presenters.AmountBlockerPresenter$models$1$2;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.card.onboarding.core.instancing.InstancedCardBatch;
import com.squareup.cash.clientroutes.DeepLinksConfig;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.RealUriFormatter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo;
import com.squareup.cash.crypto.backend.disclosures.CryptoDisclosure;
import com.squareup.cash.crypto.backend.disclosures.RealCryptoDisclosuresRepo;
import com.squareup.cash.crypto.backend.disclosures.RealCryptoDisclosuresRepo$$ExternalSyntheticLambda0;
import com.squareup.cash.crypto.backend.disclosures.RealCryptoDisclosuresRepo$Factory$Impl;
import com.squareup.cash.cryptonauts.api.CryptoCustomerControlsService;
import com.squareup.cash.cryptonauts.api.CryptoExchangeCustomerControl;
import com.squareup.cash.cryptonauts.api.GetCryptoControlsRequest;
import com.squareup.cash.cryptonauts.api.GetCryptoControlsResponse;
import com.squareup.cash.cryptonauts.api.SetCryptoControlsRequest;
import com.squareup.cash.cryptonauts.api.SetCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl;
import com.squareup.cash.cryptonauts.api.SetCryptoControlsResponse;
import com.squareup.cash.cryptonauts.api.SetCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl;
import com.squareup.cash.data.blockers.FlowStarter$$ExternalSyntheticLambda0;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.profile.SingleAccountHolderEligibility;
import com.squareup.cash.e2ee.signature.RealSignatureRepo;
import com.squareup.cash.e2ee.signature.RealSignatureRepo$retrieveSignature$2;
import com.squareup.cash.e2ee.signature.SignatureFetch;
import com.squareup.cash.e2ee.signing.RealDataSigner$sign$1;
import com.squareup.cash.e2ee.trifle.RealTrifleService;
import com.squareup.cash.e2ee.trifle.TrifleService;
import com.squareup.cash.family.familyhub.backend.api.DependentControlStatusRequestHandler;
import com.squareup.cash.family.familyhub.backend.real.DependentBitcoinInvestingControlStatusRequestHandler$getDependentControlStatus$1;
import com.squareup.cash.family.familyhub.backend.real.DependentBitcoinInvestingControlStatusRequestHandler$toggleDependentControl$1;
import com.squareup.cash.family.familyhub.backend.real.DependentStockInvestingControlStatusRequestHandler$getDependentControlStatus$1;
import com.squareup.cash.family.familyhub.backend.real.DependentStockInvestingControlStatusRequestHandler$toggleDependentControl$1;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$BugReportGenerateTitle;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.fidesmo.views.haptic.WaveformHapticPattern;
import com.squareup.cash.globalsearch.screens.GlobalSearchScreen;
import com.squareup.cash.graphics.swampgl.Engine;
import com.squareup.cash.graphics.swampgl.EngineFrameScheduler$SceneGroup;
import com.squareup.cash.graphics.swampgl.components.AABB;
import com.squareup.cash.graphics.swampgl.components.Geometry;
import com.squareup.cash.graphics.swampgl.components.MeshGeometry;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.observability.backend.api.Action;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.treehouse.android.RegisteredTreehouseApp;
import com.squareup.cash.treehouse.android.platform.CashTreehouseLayout;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.C4bEligibilityState;
import com.squareup.protos.cash.investcustomer.api.v1.CustomerControls;
import com.squareup.protos.cash.investcustomer.api.v1.CustomerLimit;
import com.squareup.protos.cash.investcustomer.api.v1.GetCustomerControlsRequest;
import com.squareup.protos.cash.investcustomer.api.v1.GetCustomerControlsResponse;
import com.squareup.protos.cash.investcustomer.api.v1.InvestCustomerService;
import com.squareup.protos.cash.investcustomer.api.v1.SetCustomerControlsRequest;
import com.squareup.protos.cash.investcustomer.api.v1.SetCustomerControlsResponse;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.EndFlowRequest;
import com.squareup.protos.franklin.app.EndFlowResponse;
import com.squareup.protos.franklin.app.SetDateRequest;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.protos.franklin.app.SubmitFormResponse;
import com.squareup.protos.franklin.app.UploadFileRequest;
import com.squareup.protos.franklin.app.UploadFileResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.persona.ResolvePersonaDidvBlockerRequest;
import com.squareup.protos.franklin.persona.ResolvePersonaDidvBlockerResponse;
import com.squareup.scannerview.SizeMap;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.workflow1.ui.ViewRegistryKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.Provider;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StartedLazily;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.Pipe$sink$1;
import okio.RealBufferedSink;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import radiography.Radiography$$ExternalSyntheticLambda0;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final class BinaryBitmap implements OnApplyWindowInsetsListener, OnCompleteListener, Prf, OnFailureListener, Action, BitcoinHomeWidgetPresenter, MultiBlockerFacilitator$Resolver, Geometry, DependentControlStatusRequestHandler {
    public final /* synthetic */ int $r8$classId;
    public final Object binarizer;
    public Object matrix;

    public BinaryBitmap(String str, List list, String str2, List list2, String str3, SizeMap sizeMap) {
        this.$r8$classId = 14;
        this.binarizer = Action.Type.CUSTOM;
        Pair pair = new Pair("url", String.valueOf(str));
        Pair pair2 = new Pair("cash_fill_fields_detected_calls", list.toString());
        Pair pair3 = new Pair("cash_fill_version", str2);
        Pair pair4 = new Pair("fillr_fields_detected_calls", list2.toString());
        Pair pair5 = new Pair("fillr_sdk_version", "11.2.0");
        Pair pair6 = new Pair("fillr_widget_version", str3);
        Pair pair7 = new Pair("all_fields_match", String.valueOf(list.equals(list2)));
        List<Set> list3 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
        for (Set set : list3) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : set) {
                AutofillWebField.Companion.getClass();
                if (((List) AutofillWebField.cardFieldValues$delegate.getValue()).contains((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            arrayList.add(arrayList2);
        }
        List<Set> list4 = list2;
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
        for (Set set2 : list4) {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : set2) {
                Pair pair8 = pair;
                AutofillWebField.Companion.getClass();
                Pair pair9 = pair2;
                if (((List) AutofillWebField.cardFieldValues$delegate.getValue()).contains((String) obj2)) {
                    arrayList4.add(obj2);
                }
                pair = pair8;
                pair2 = pair9;
            }
            arrayList3.add(arrayList4);
        }
        Pair pair10 = pair;
        Pair pair11 = pair2;
        Pair pair12 = new Pair("credit_card_fields_match", String.valueOf(arrayList.equals(arrayList3)));
        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
        for (Set set3 : list3) {
            ArrayList arrayList6 = new ArrayList();
            for (Object obj3 : set3) {
                AutofillWebField.Companion.getClass();
                if (((List) AutofillWebField.addressFieldValues$delegate.getValue()).contains((String) obj3)) {
                    arrayList6.add(obj3);
                }
            }
            arrayList5.add(arrayList6);
        }
        ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
        for (Set set4 : list4) {
            ArrayList arrayList8 = new ArrayList();
            for (Object obj4 : set4) {
                AutofillWebField.Companion.getClass();
                if (((List) AutofillWebField.addressFieldValues$delegate.getValue()).contains((String) obj4)) {
                    arrayList8.add(obj4);
                }
            }
            arrayList7.add(arrayList8);
        }
        this.matrix = MapsKt__MapsKt.mapOf(pair10, pair11, pair3, pair4, pair5, pair6, pair7, pair12, new Pair("address_fields_match", String.valueOf(arrayList5.equals(arrayList7))));
    }

    public static ArrayList getEligibilityPropertiesAndValues(SingleAccountHolderEligibility singleAccountHolderEligibility) {
        Field[] declaredFields = SingleAccountHolderEligibility.class.getDeclaredFields();
        declaredFields.getClass();
        ArrayList arrayList = new ArrayList();
        for (Field field : declaredFields) {
            if (Intrinsics.areEqual(field.getType(), C4bEligibilityState.class)) {
                arrayList.add(field);
            }
        }
        List<Field> sortedWith = CollectionsKt.sortedWith(arrayList, new b.C0008b(7));
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith, 10));
        for (Field field2 : sortedWith) {
            field2.setAccessible(true);
            String name = field2.getName();
            Object obj = field2.get(singleAccountHolderEligibility);
            arrayList2.add(new Pair(name, obj instanceof C4bEligibilityState ? (C4bEligibilityState) obj : null));
        }
        return arrayList2;
    }

    public void Content(Modifier modifier, String str, BetterNavigator.ScreenNavigator screenNavigator, Composer composer, int i) {
        modifier.getClass();
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(428968078);
        int i2 = i | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changedInstance(screenNavigator) ? 256 : 128) | (gapComposer.changed(this) ? 2048 : 1024);
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            View view = (View) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalView);
            OnBackPressedDispatcherOwner current = LocalOnBackPressedDispatcherOwner.getCurrent(gapComposer);
            boolean z = (i2 & 7168) == 2048;
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (z || rememberedValue == obj) {
                Provider provider = (Provider) ((Map) this.matrix).get("discover");
                RegisteredTreehouseApp registeredTreehouseApp = provider != null ? (RegisteredTreehouseApp) provider.invoke() : null;
                if (registeredTreehouseApp == null) {
                    Path$$ExternalSyntheticBUOutline0.m((Object) "No treehouse app found for 'discover'");
                    return;
                }
                CashTreehouseLayout.Factory factory = (CashTreehouseLayout.Factory) this.binarizer;
                Context context = view.getContext();
                context.getClass();
                RealTreehouseApp treehouseApp = registeredTreehouseApp.getTreehouseApp();
                current.getClass();
                rememberedValue = CashTreehouseLayout.Factory.create$default(factory, context, treehouseApp, current.getOnBackPressedDispatcher());
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CashTreehouseLayout cashTreehouseLayout = (CashTreehouseLayout) rememberedValue;
            boolean changedInstance = gapComposer.changedInstance(cashTreehouseLayout) | ((i2 & 112) == 32) | gapComposer.changedInstance(screenNavigator);
            Object rememberedValue2 = gapComposer.rememberedValue();
            int i4 = 22;
            if (changedInstance || rememberedValue2 == obj) {
                rememberedValue2 = new UtilsKt$$ExternalSyntheticLambda0(i4, cashTreehouseLayout, str, screenNavigator);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.DisposableEffect(str, (Function1) rememberedValue2, gapComposer);
            boolean changedInstance2 = gapComposer.changedInstance(cashTreehouseLayout);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == obj) {
                rememberedValue3 = new RealEmbeddedTreehouseContent$$ExternalSyntheticLambda1(cashTreehouseLayout, i3);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Function1 function1 = (Function1) rememberedValue3;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (rememberedValue4 == obj) {
                rememberedValue4 = new CopyCodeKt$$ExternalSyntheticLambda5(21);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            Function1 function12 = (Function1) rememberedValue4;
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (rememberedValue5 == obj) {
                rememberedValue5 = new CopyCodeKt$$ExternalSyntheticLambda5(i4);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            AndroidView_androidKt.AndroidView(function1, modifier, null, function12, (Function1) rememberedValue5, gapComposer, 27696, 4);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DismissableToastKt$$ExternalSyntheticLambda4(modifier, this, str, screenNavigator, i, 25);
        }
    }

    public void HandleDefaultDisplayPreference(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-691790799);
        int i2 = (gapComposer.changed(this) ? 4 : 2) | i;
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Unit unit = Unit.INSTANCE;
            boolean z = (i2 & 14) == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new AmountPickerCondensedView.AnonymousClass14(this, null, 21);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinHomePresenterKt$$ExternalSyntheticLambda0(this, i, i3);
        }
    }

    public void cancel() {
        ((Vibrator) this.binarizer).cancel();
    }

    @Override // com.google.crypto.tink.prf.Prf
    public byte[] compute(int i, byte[] bArr) {
        int i2 = this.$r8$classId;
        Object obj = this.binarizer;
        switch (i2) {
            case 7:
                if (i > 16) {
                    AesGcmSiv$$ExternalSyntheticLambda0.m$1("outputLength must not be larger than 16");
                    return null;
                }
                Mac mac = Mac.getInstance("AESCMAC", (java.security.Provider) this.matrix);
                mac.init((SecretKeySpec) obj);
                byte[] doFinal = mac.doFinal(bArr);
                return i == doFinal.length ? doFinal : Arrays.copyOf(doFinal, i);
            default:
                return bArr.length <= 64 ? ((PrfAesCmac) obj).compute(i, bArr) : ((BinaryBitmap) this.matrix).compute(i, bArr);
        }
    }

    @Override // com.squareup.cash.graphics.swampgl.components.Geometry
    public void draw() {
        int i;
        InstancedCardBatch instancedCardBatch = (InstancedCardBatch) this.matrix;
        MeshGeometry meshGeometry = instancedCardBatch.sharedGeometry;
        if (meshGeometry == null || instancedCardBatch.culledInstanceCount == 0 || (i = meshGeometry.vboId) == 0 || meshGeometry.iboId == 0) {
            return;
        }
        GLES20.glBindBuffer(34962, i);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(0, 3, 5126, false, 56, 0);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glVertexAttribPointer(1, 3, 5126, false, 56, 12);
        GLES20.glEnableVertexAttribArray(2);
        GLES20.glVertexAttribPointer(2, 3, 5126, false, 56, 24);
        GLES20.glEnableVertexAttribArray(3);
        GLES20.glVertexAttribPointer(3, 3, 5126, false, 56, 36);
        GLES20.glEnableVertexAttribArray(4);
        GLES20.glVertexAttribPointer(4, 2, 5126, false, 56, 48);
        GLES20.glBindBuffer(34962, instancedCardBatch.instanceVboId);
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i2 + 5;
            GLES20.glEnableVertexAttribArray(i3);
            GLES20.glVertexAttribPointer(i3, 4, 5126, false, 80, i2 * 16);
            GLES30.glVertexAttribDivisor(i3, 1);
        }
        GLES20.glEnableVertexAttribArray(9);
        GLES20.glVertexAttribPointer(9, 4, 5126, false, 80, 64);
        GLES30.glVertexAttribDivisor(9, 1);
        GLES20.glBindBuffer(34963, meshGeometry.iboId);
        GLES30.glDrawElementsInstanced(4, meshGeometry.indexCount, 5125, 0, instancedCardBatch.culledInstanceCount);
        GLES20.glDisableVertexAttribArray(0);
        GLES20.glDisableVertexAttribArray(1);
        GLES20.glDisableVertexAttribArray(2);
        GLES20.glDisableVertexAttribArray(3);
        GLES20.glDisableVertexAttribArray(4);
        for (int i4 = 0; i4 < 4; i4++) {
            int i5 = i4 + 5;
            GLES20.glDisableVertexAttribArray(i5);
            GLES30.glVertexAttribDivisor(i5, 0);
        }
        GLES20.glDisableVertexAttribArray(9);
        GLES30.glVertexAttribDivisor(9, 0);
        GLES20.glBindBuffer(34962, 0);
        GLES20.glBindBuffer(34963, 0);
    }

    public void dump(Pipe$sink$1 pipe$sink$1) {
        String str;
        String activeAccountTokenOrNull = PlatformKt.activeAccountTokenOrNull((SessionManager) this.binarizer);
        if (activeAccountTokenOrNull != null) {
            SingleAccountHolderEligibility singleAccountHolderEligibility = (SingleAccountHolderEligibility) ((CashAccountDatabaseImpl) this.matrix).singleAccountHolderEligibilityQueries.eligibility(activeAccountTokenOrNull).executeAsOneOrNull();
            if (singleAccountHolderEligibility != null) {
                try {
                    str = CollectionsKt.joinToString$default(getEligibilityPropertiesAndValues(singleAccountHolderEligibility), "\n", null, null, 0, null, new FlowStarter$$ExternalSyntheticLambda0(23), 30);
                } catch (Exception e) {
                    str = Recorder$$ExternalSyntheticOutline2.m("Error generating eligibility info: ", e.getMessage());
                }
            } else {
                str = "null";
            }
        } else {
            str = "No account logged in";
        }
        RealBufferedSink realBufferedSink = new RealBufferedSink(pipe$sink$1);
        try {
            realBufferedSink.writeUtf8(str);
            realBufferedSink.close();
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00bc A[Catch: Exception -> 0x00e5, TryCatch #0 {Exception -> 0x00e5, blocks: (B:10:0x0025, B:11:0x009a, B:13:0x00a6, B:15:0x00aa, B:17:0x00b6, B:19:0x00bc, B:22:0x00cb, B:24:0x00d3, B:26:0x00e2, B:39:0x0069), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb A[Catch: Exception -> 0x00e5, TryCatch #0 {Exception -> 0x00e5, blocks: (B:10:0x0025, B:11:0x009a, B:13:0x00a6, B:15:0x00aa, B:17:0x00b6, B:19:0x00bc, B:22:0x00cb, B:24:0x00d3, B:26:0x00e2, B:39:0x0069), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: generateTitle-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable m2100generateTitlegIAlus(String str, ContinuationImpl continuationImpl) {
        MLKitTitleGenerator$generateTitle$1 mLKitTitleGenerator$generateTitle$1;
        int i;
        Candidate candidate;
        String str2;
        String str3;
        try {
            if (continuationImpl instanceof MLKitTitleGenerator$generateTitle$1) {
                mLKitTitleGenerator$generateTitle$1 = (MLKitTitleGenerator$generateTitle$1) continuationImpl;
                int i2 = mLKitTitleGenerator$generateTitle$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    mLKitTitleGenerator$generateTitle$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = mLKitTitleGenerator$generateTitle$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = mLKitTitleGenerator$generateTitle$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (!((Boolean) ((ReadonlyStateFlow) this.matrix).$$delegate_0.getValue()).booleanValue()) {
                            Result.Companion companion = kotlin.Result.Companion;
                            return new Result.Failure(new Exception("Title generation is not available (feature flag disabled or model not ready)"));
                        }
                        if (StringsKt.isBlank(str)) {
                            Result.Companion companion2 = kotlin.Result.Companion;
                            return new Result.Failure(new IllegalArgumentException("Description cannot be blank"));
                        }
                        String replaceIndent = StringsKt__IndentKt.replaceIndent("\n        Generate a bug report title from the description. Only generate a title if the description is clearly written and describes a specific problem. If the description has too many typos, is gibberish, or is too vague, respond with: AMBIGUOUS\n        \n        Examples:\n        \n        Description: \"asdfgh qwerty zxcvbn\"\n        Response: AMBIGUOUS\n        \n        Description: \"thnigs aree bkroen\"\n        Response: AMBIGUOUS\n        \n        Description: \"doesn't work\"\n        Response: AMBIGUOUS\n        \n        Description: \"When I tap the Send button on the payment screen, the app crashes\"\n        Response: Payment screen: App crashes when tapping Send button\n        \n        Description: \"The balance shown on my card tab is incorrect after making a deposit\"\n        Response: Card tab: Incorrect balance after deposit\n        \n        Now generate a title for this description:\n        \n        Description: \"" + str + "\"\n        Response:\n      ");
                        zzot zzotVar = (zzot) this.binarizer;
                        GenerateContentRequest generateContentRequest = new GenerateContentRequest(RecyclerView.DECELERATION_RATE, 1, 1, 30, new TextPart(replaceIndent));
                        mLKitTitleGenerator$generateTitle$1.label = 1;
                        obj = zzotVar.zzq(generateContentRequest, mLKitTitleGenerator$generateTitle$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    candidate = (Candidate) CollectionsKt.firstOrNull(((GenerateContentResponse) obj).zza);
                    if (candidate != null || (str3 = candidate.zza) == null || (str2 = StringsKt.trim(str3).toString()) == null) {
                        str2 = "";
                    }
                    if (!StringsKt.isBlank(str2)) {
                        Result.Companion companion3 = kotlin.Result.Companion;
                        return new Result.Failure(new Exception("Generated title was empty"));
                    }
                    if (StringsKt.contains((CharSequence) str2, (CharSequence) "AMBIGUOUS", true)) {
                        Result.Companion companion4 = kotlin.Result.Companion;
                        return new Result.Failure(new AmbiguousDescriptionException("Description is too ambiguous"));
                    }
                    Result.Companion companion5 = kotlin.Result.Companion;
                    return str2;
                }
            }
            if (i != 0) {
            }
            candidate = (Candidate) CollectionsKt.firstOrNull(((GenerateContentResponse) obj).zza);
            if (candidate != null) {
            }
            str2 = "";
            if (!StringsKt.isBlank(str2)) {
            }
        } catch (Exception e) {
            Timber.Forest.w("Failed to generate bug report title", new Object[0], e);
            Result.Companion companion6 = kotlin.Result.Companion;
            return new Result.Failure(e);
        }
        mLKitTitleGenerator$generateTitle$1 = new MLKitTitleGenerator$generateTitle$1(this, continuationImpl);
        Object obj2 = mLKitTitleGenerator$generateTitle$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mLKitTitleGenerator$generateTitle$1.label;
    }

    @Override // com.squareup.cash.graphics.swampgl.components.Geometry
    public AABB getAABB() {
        MeshGeometry meshGeometry = ((InstancedCardBatch) this.matrix).sharedGeometry;
        return meshGeometry != null ? meshGeometry.getAABB() : new AABB(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
    }

    @Override // com.squareup.cash.observability.backend.api.Action
    public Map getAttributes() {
        return (Map) this.matrix;
    }

    public BitMatrix getBlackMatrix() {
        int[] iArr;
        if (((BitMatrix) this.matrix) == null) {
            HybridBinarizer hybridBinarizer = (HybridBinarizer) this.binarizer;
            BitMatrix bitMatrix = hybridBinarizer.matrix;
            if (bitMatrix == null) {
                LuminanceSource luminanceSource = hybridBinarizer.source;
                int i = luminanceSource.width;
                int i2 = luminanceSource.height;
                int i3 = 0;
                boolean z = true;
                if (i < 40 || i2 < 40) {
                    BitMatrix bitMatrix2 = new BitMatrix(i, i2);
                    if (hybridBinarizer.luminances.length < i) {
                        hybridBinarizer.luminances = new byte[i];
                    }
                    int i4 = 0;
                    while (true) {
                        iArr = hybridBinarizer.buckets;
                        if (i4 >= 32) {
                            break;
                        }
                        iArr[i4] = 0;
                        i4++;
                    }
                    for (int i5 = 1; i5 < 5; i5++) {
                        byte[] row = luminanceSource.getRow((i2 * i5) / 5, hybridBinarizer.luminances);
                        int i6 = (i * 4) / 5;
                        for (int i7 = i / 5; i7 < i6; i7++) {
                            int i8 = (row[i7] & 255) >> 3;
                            iArr[i8] = iArr[i8] + 1;
                        }
                    }
                    int length = iArr.length;
                    int i9 = 0;
                    int i10 = 0;
                    int i11 = 0;
                    for (int i12 = 0; i12 < length; i12++) {
                        int i13 = iArr[i12];
                        if (i13 > i9) {
                            i11 = i12;
                            i9 = i13;
                        }
                        if (i13 > i10) {
                            i10 = i13;
                        }
                    }
                    int i14 = 0;
                    int i15 = 0;
                    for (int i16 = 0; i16 < length; i16++) {
                        int i17 = i16 - i11;
                        int i18 = iArr[i16] * i17 * i17;
                        if (i18 > i15) {
                            i14 = i16;
                            i15 = i18;
                        }
                    }
                    if (i11 <= i14) {
                        int i19 = i11;
                        i11 = i14;
                        i14 = i19;
                    }
                    if (i11 - i14 <= length / 16) {
                        throw NotFoundException.getNotFoundInstance();
                    }
                    int i20 = i11 - 1;
                    int i21 = -1;
                    int i22 = i20;
                    while (i20 > i14) {
                        int i23 = i20 - i14;
                        int i24 = (i10 - iArr[i20]) * (i11 - i20) * i23 * i23;
                        if (i24 > i21) {
                            i22 = i20;
                            i21 = i24;
                        }
                        i20--;
                    }
                    int i25 = i22 << 3;
                    byte[] matrix = luminanceSource.getMatrix();
                    for (int i26 = 0; i26 < i2; i26++) {
                        int i27 = i26 * i;
                        for (int i28 = 0; i28 < i; i28++) {
                            if ((matrix[i27 + i28] & 255) < i25) {
                                bitMatrix2.set(i28, i26);
                            }
                        }
                    }
                    hybridBinarizer.matrix = bitMatrix2;
                } else {
                    byte[] matrix2 = luminanceSource.getMatrix();
                    int i29 = i >> 3;
                    if ((i & 7) != 0) {
                        i29++;
                    }
                    int i30 = i2 >> 3;
                    if ((i2 & 7) != 0) {
                        i30++;
                    }
                    int i31 = i2 - 8;
                    int i32 = i - 8;
                    int i33 = 2;
                    int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i30, i29);
                    int i34 = 0;
                    while (true) {
                        int i35 = 8;
                        if (i34 >= i30) {
                            break;
                        }
                        int i36 = i3;
                        int i37 = i34 << 3;
                        if (i37 > i31) {
                            i37 = i31;
                        }
                        boolean z2 = z;
                        int i38 = i36;
                        while (i38 < i29) {
                            int i39 = i33;
                            int i40 = i38 << 3;
                            if (i40 > i32) {
                                i40 = i32;
                            }
                            int i41 = (i37 * i) + i40;
                            int i42 = i36;
                            int i43 = i42;
                            int i44 = i43;
                            int i45 = 255;
                            while (i42 < i35) {
                                byte[] bArr = matrix2;
                                int i46 = i37;
                                int i47 = i36;
                                int i48 = i44;
                                int i49 = i45;
                                while (i47 < i35) {
                                    int i50 = i47;
                                    int i51 = bArr[i41 + i47] & 255;
                                    i43 += i51;
                                    if (i51 < i49) {
                                        i49 = i51;
                                    }
                                    if (i51 > i48) {
                                        i48 = i51;
                                    }
                                    i47 = i50 + 1;
                                    i35 = 8;
                                }
                                if (i48 - i49 > 24) {
                                    while (true) {
                                        i42++;
                                        i41 += i;
                                        if (i42 < 8) {
                                            int i52 = i36;
                                            for (int i53 = 8; i52 < i53; i53 = 8) {
                                                i43 += bArr[i41 + i52] & 255;
                                                i52++;
                                                i49 = i49;
                                            }
                                        }
                                    }
                                }
                                i42++;
                                i41 += i;
                                i45 = i49;
                                matrix2 = bArr;
                                i37 = i46;
                                i35 = 8;
                                i44 = i48;
                            }
                            byte[] bArr2 = matrix2;
                            int i54 = i37;
                            int i55 = i43 >> 6;
                            int i56 = i45;
                            if (i44 - i56 <= 24) {
                                i55 = i56 / 2;
                                if (i34 > 0 && i38 > 0) {
                                    int[] iArr3 = iArr2[i34 - 1];
                                    int i57 = i38 - 1;
                                    int i58 = (((iArr2[i34][i57] * 2) + iArr3[i38]) + iArr3[i57]) / 4;
                                    if (i56 < i58) {
                                        i55 = i58;
                                    }
                                }
                            }
                            iArr2[i34][i38] = i55;
                            i38++;
                            i33 = i39;
                            matrix2 = bArr2;
                            i37 = i54;
                            i35 = 8;
                        }
                        i34++;
                        i3 = i36;
                        z = z2;
                    }
                    byte[] bArr3 = matrix2;
                    int i59 = i3;
                    int i60 = i33;
                    BitMatrix bitMatrix3 = new BitMatrix(i, i2);
                    int i61 = i59;
                    while (i61 < i30) {
                        int i62 = i61 << 3;
                        if (i62 > i31) {
                            i62 = i31;
                        }
                        int min = i61 < i60 ? 2 : Math.min(i61, i30 - 3);
                        int i63 = i59;
                        while (i63 < i29) {
                            int i64 = i63 << 3;
                            if (i64 > i32) {
                                i64 = i32;
                            }
                            int min2 = i63 < 2 ? 2 : Math.min(i63, i29 - 3);
                            int i65 = i61;
                            int i66 = -2;
                            int i67 = i59;
                            for (int i68 = 2; i66 <= i68; i68 = 2) {
                                int[] iArr4 = iArr2[min + i66];
                                i67 = iArr4[min2 - 2] + iArr4[min2 - 1] + iArr4[min2] + iArr4[min2 + 1] + iArr4[min2 + 2] + i67;
                                i66++;
                            }
                            int i69 = i67 / 25;
                            int i70 = (i62 * i) + i64;
                            int i71 = i29;
                            int i72 = i59;
                            while (true) {
                                if (i72 < 8) {
                                    int i73 = i62;
                                    int i74 = i59;
                                    for (int i75 = 8; i74 < i75; i75 = 8) {
                                        int i76 = i74;
                                        if ((bArr3[i70 + i74] & 255) <= i69) {
                                            bitMatrix3.set(i64 + i76, i73 + i72);
                                        }
                                        i74 = i76 + 1;
                                    }
                                    i72++;
                                    i70 += i;
                                    i62 = i73;
                                }
                            }
                            i63++;
                            i61 = i65;
                            i29 = i71;
                        }
                        i60 = 2;
                        i61++;
                    }
                    hybridBinarizer.matrix = bitMatrix3;
                }
                bitMatrix = hybridBinarizer.matrix;
            }
            this.matrix = bitMatrix;
        }
        return (BitMatrix) this.matrix;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c9  */
    @Override // com.squareup.cash.family.familyhub.backend.api.DependentControlStatusRequestHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getDependentControlStatus(boolean z, ContinuationImpl continuationImpl) {
        DependentBitcoinInvestingControlStatusRequestHandler$getDependentControlStatus$1 dependentBitcoinInvestingControlStatusRequestHandler$getDependentControlStatus$1;
        int i;
        ApiResult apiResult;
        List list;
        DependentStockInvestingControlStatusRequestHandler$getDependentControlStatus$1 dependentStockInvestingControlStatusRequestHandler$getDependentControlStatus$1;
        int i2;
        ApiResult apiResult2;
        List list2;
        int i3 = this.$r8$classId;
        Object obj = this.binarizer;
        switch (i3) {
            case 25:
                if (continuationImpl instanceof DependentBitcoinInvestingControlStatusRequestHandler$getDependentControlStatus$1) {
                    dependentBitcoinInvestingControlStatusRequestHandler$getDependentControlStatus$1 = (DependentBitcoinInvestingControlStatusRequestHandler$getDependentControlStatus$1) continuationImpl;
                    int i4 = dependentBitcoinInvestingControlStatusRequestHandler$getDependentControlStatus$1.label;
                    if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                        dependentBitcoinInvestingControlStatusRequestHandler$getDependentControlStatus$1.label = i4 - PKIFailureInfo.systemUnavail;
                        Object obj2 = dependentBitcoinInvestingControlStatusRequestHandler$getDependentControlStatus$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = dependentBitcoinInvestingControlStatusRequestHandler$getDependentControlStatus$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            GetCryptoControlsRequest getCryptoControlsRequest = new GetCryptoControlsRequest((String) this.matrix, ByteString.EMPTY);
                            dependentBitcoinInvestingControlStatusRequestHandler$getDependentControlStatus$1.label = 1;
                            obj2 = ((CryptoCustomerControlsService) obj).getCryptoControls(getCryptoControlsRequest, dependentBitcoinInvestingControlStatusRequestHandler$getDependentControlStatus$1);
                            if (obj2 == coroutineSingletons) {
                                break;
                            }
                        } else if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj2);
                        }
                        apiResult = (ApiResult) obj2;
                        if (!(apiResult instanceof ApiResult.Success)) {
                            GetCryptoControlsResponse getCryptoControlsResponse = (GetCryptoControlsResponse) ((ApiResult.Success) apiResult).response;
                            String str = getCryptoControlsResponse.prerequisite_link;
                            CryptoExchangeCustomerControl cryptoExchangeCustomerControl = getCryptoControlsResponse.crypto_exchange_customer_control;
                            CryptoExchangeCustomerControl.CryptoExchangeLimit cryptoExchangeLimit = (cryptoExchangeCustomerControl == null || (list = cryptoExchangeCustomerControl.limits) == null) ? null : (CryptoExchangeCustomerControl.CryptoExchangeLimit) CollectionsKt.firstOrNull(list);
                            break;
                        } else if (!(apiResult instanceof ApiResult.Failure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        }
                    }
                }
                dependentBitcoinInvestingControlStatusRequestHandler$getDependentControlStatus$1 = new DependentBitcoinInvestingControlStatusRequestHandler$getDependentControlStatus$1(this, continuationImpl);
                Object obj22 = dependentBitcoinInvestingControlStatusRequestHandler$getDependentControlStatus$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dependentBitcoinInvestingControlStatusRequestHandler$getDependentControlStatus$1.label;
                if (i != 0) {
                }
                apiResult = (ApiResult) obj22;
                if (!(apiResult instanceof ApiResult.Success)) {
                }
                break;
            default:
                if (continuationImpl instanceof DependentStockInvestingControlStatusRequestHandler$getDependentControlStatus$1) {
                    dependentStockInvestingControlStatusRequestHandler$getDependentControlStatus$1 = (DependentStockInvestingControlStatusRequestHandler$getDependentControlStatus$1) continuationImpl;
                    int i5 = dependentStockInvestingControlStatusRequestHandler$getDependentControlStatus$1.label;
                    if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                        dependentStockInvestingControlStatusRequestHandler$getDependentControlStatus$1.label = i5 - PKIFailureInfo.systemUnavail;
                        Object obj3 = dependentStockInvestingControlStatusRequestHandler$getDependentControlStatus$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = dependentStockInvestingControlStatusRequestHandler$getDependentControlStatus$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            GetCustomerControlsRequest getCustomerControlsRequest = new GetCustomerControlsRequest((String) this.matrix, ByteString.EMPTY);
                            dependentStockInvestingControlStatusRequestHandler$getDependentControlStatus$1.label = 1;
                            obj3 = ((InvestCustomerService) obj).getCustomerControls(getCustomerControlsRequest, dependentStockInvestingControlStatusRequestHandler$getDependentControlStatus$1);
                            if (obj3 == coroutineSingletons3) {
                                break;
                            }
                        } else if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj3);
                        }
                        apiResult2 = (ApiResult) obj3;
                        if (!(apiResult2 instanceof ApiResult.Success)) {
                            GetCustomerControlsResponse getCustomerControlsResponse = (GetCustomerControlsResponse) ((ApiResult.Success) apiResult2).response;
                            String str2 = getCustomerControlsResponse.prerequisite_link;
                            CustomerControls customerControls = getCustomerControlsResponse.customer_controls;
                            CustomerLimit customerLimit = (customerControls == null || (list2 = customerControls.trading_limits) == null) ? null : (CustomerLimit) CollectionsKt.firstOrNull(list2);
                            CustomerControls customerControls2 = getCustomerControlsResponse.customer_controls;
                            break;
                        } else if (!(apiResult2 instanceof ApiResult.Failure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        }
                    }
                }
                dependentStockInvestingControlStatusRequestHandler$getDependentControlStatus$1 = new DependentStockInvestingControlStatusRequestHandler$getDependentControlStatus$1(this, continuationImpl);
                Object obj32 = dependentStockInvestingControlStatusRequestHandler$getDependentControlStatus$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = dependentStockInvestingControlStatusRequestHandler$getDependentControlStatus$1.label;
                if (i2 != 0) {
                }
                apiResult2 = (ApiResult) obj32;
                if (!(apiResult2 instanceof ApiResult.Success)) {
                }
                break;
        }
        return null;
    }

    @Override // com.squareup.cash.observability.backend.api.Action
    public String getName() {
        return "Cash Fill field detection comparison";
    }

    @Override // com.squareup.cash.graphics.swampgl.components.Geometry
    public StateFlow getReady() {
        return (StateFlowImpl) this.binarizer;
    }

    @Override // com.squareup.cash.blockers.flow.api.MultiBlockerFacilitator$Resolver
    public boolean getResolvesSynchronously() {
        return false;
    }

    @Override // com.squareup.cash.observability.backend.api.Action
    public Action.Type getType() {
        return (Action.Type) this.binarizer;
    }

    public WaveformHapticPattern loadFromResource(Context context, int i) {
        Object computeIfAbsent = ((ConcurrentHashMap) this.matrix).computeIfAbsent(Integer.valueOf(i), new RealCartBuilderManager$$ExternalSyntheticLambda1(2, new LazyListState$$ExternalSyntheticLambda3(context, i, 11)));
        computeIfAbsent.getClass();
        return (WaveformHapticPattern) computeIfAbsent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.cash.bitcoin.presenters.applet.widget.BitcoinHomeWidgetPresenter
    public BitcoinHomeWidgetViewModel models(BetterNavigator.ScreenNavigator screenNavigator, Flow flow, GapComposer gapComposer, int i) {
        gapComposer.startReplaceGroup(238371933);
        RealCryptoDisclosuresRepo cryptoDisclosureRepo = ViewRegistryKt.cryptoDisclosureRepo((RealCryptoDisclosuresRepo$Factory$Impl) this.binarizer, gapComposer);
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new BitcoinDepositsPresenter$special$$inlined$filter$1(flow, 23);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Flow flow2 = (Flow) rememberedValue;
        MutableState collectAsState = Updater.collectAsState(StateFlowKt.mapState(cryptoDisclosureRepo.disclosureStateFlow, new RealCryptoDisclosuresRepo$$ExternalSyntheticLambda0(cryptoDisclosureRepo, 0)), null, gapComposer, 1);
        Updater.LaunchedEffect(gapComposer, flow2, new AmountBlockerPresenter$models$1$2(flow2, (Continuation) (0 == true ? 1 : 0), (Object) this, 3));
        CryptoDisclosure cryptoDisclosure = (CryptoDisclosure) collectAsState.getValue();
        BitcoinHomeDisclosureWidgetViewModel bitcoinHomeDisclosureWidgetViewModel = cryptoDisclosure != null ? new BitcoinHomeDisclosureWidgetViewModel(cryptoDisclosure.disclosure, cryptoDisclosure.url) : null;
        gapComposer.end(false);
        return bitcoinHomeDisclosureWidgetViewModel;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        ViewUtils.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (ViewUtils.OnApplyWindowInsetsListener) this.binarizer;
        ViewUtils.RelativePadding relativePadding = (ViewUtils.RelativePadding) this.matrix;
        ViewUtils.RelativePadding relativePadding2 = new ViewUtils.RelativePadding();
        relativePadding2.start = relativePadding.start;
        relativePadding2.top = relativePadding.top;
        relativePadding2.end = relativePadding.end;
        relativePadding2.bottom = relativePadding.bottom;
        return onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsetsCompat, relativePadding2);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        zzx zzxVar = (zzx) this.binarizer;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.matrix;
        synchronized (zzxVar.zzg) {
            zzxVar.zzf.remove(taskCompletionSource);
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        ((PlacesAddressSearcher) this.binarizer).sessionToken = null;
        CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) this.matrix;
        Result.Companion companion = kotlin.Result.Companion;
        cancellableContinuationImpl.resumeWith(AddressSearchResult.ComputedAddressResult.Failure.INSTANCE);
    }

    public void play(WaveformHapticPattern waveformHapticPattern) {
        Triple triple;
        Vibrator vibrator = (Vibrator) this.binarizer;
        waveformHapticPattern.getClass();
        long[] jArr = waveformHapticPattern.timings;
        int[] iArr = waveformHapticPattern.amplitudes;
        int i = waveformHapticPattern.repeat;
        if (jArr.length <= 128) {
            triple = new Triple(jArr, iArr, Integer.valueOf(i));
        } else {
            while (jArr.length > 128) {
                int length = (jArr.length + 1) / 2;
                long[] jArr2 = new long[length];
                int[] iArr2 = new int[length];
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = i2 * 2;
                    int i4 = i3 + 1;
                    if (i4 < jArr.length) {
                        jArr2[i2] = jArr[i3] + jArr[i4];
                        iArr2[i2] = (iArr[i3] + iArr[i4]) / 2;
                    } else {
                        jArr2[i2] = jArr[i3];
                        iArr2[i2] = iArr[i3];
                    }
                }
                if (i >= 0) {
                    i = RangesKt___RangesKt.coerceIn(i / 2, 0, length - 1);
                }
                jArr = jArr2;
                iArr = iArr2;
            }
            triple = new Triple(jArr, iArr, Integer.valueOf(i));
        }
        long[] jArr3 = (long[]) triple.first;
        int[] iArr3 = (int[]) triple.second;
        int intValue = ((Number) triple.third).intValue();
        if (!vibrator.hasAmplitudeControl()) {
            ArrayList arrayList = new ArrayList(iArr3.length);
            for (int i5 : iArr3) {
                arrayList.add(Integer.valueOf(i5 > 0 ? 255 : 0));
            }
            iArr3 = CollectionsKt.toIntArray(arrayList);
        }
        vibrator.vibrate(VibrationEffect.createWaveform(jArr3, iArr3, intValue));
    }

    public void registerTarget(Scene scene, Object obj, EGLSurface eGLSurface, int i, int i2, float f) {
        Object putIfAbsent;
        scene.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.matrix;
        Object obj2 = concurrentHashMap.get(scene);
        if (obj2 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(scene, (obj2 = new EngineFrameScheduler$SceneGroup((Engine) this.binarizer, scene)))) != null) {
            obj2 = putIfAbsent;
        }
        EngineFrameScheduler$SceneGroup engineFrameScheduler$SceneGroup = (EngineFrameScheduler$SceneGroup) obj2;
        synchronized (engineFrameScheduler$SceneGroup.lock) {
            engineFrameScheduler$SceneGroup.targets.put(obj, new EngineFrameScheduler$SceneGroup.RenderTarget(eGLSurface, i, i2, f, false));
            engineFrameScheduler$SceneGroup.targetFrameIntervalNs = Math.min(engineFrameScheduler$SceneGroup.targetFrameIntervalNs, (long) (1.0E9f / f));
            if (engineFrameScheduler$SceneGroup.dirtyJob == null) {
                engineFrameScheduler$SceneGroup.dirtyJob = (JobSupport) engineFrameScheduler$SceneGroup.engine.launch(new Scene.AnonymousClass1(engineFrameScheduler$SceneGroup, (Continuation) null, 22));
            }
            engineFrameScheduler$SceneGroup.requestRender("register");
        }
    }

    public void requestRender(Scene scene) {
        scene.getClass();
        EngineFrameScheduler$SceneGroup engineFrameScheduler$SceneGroup = (EngineFrameScheduler$SceneGroup) ((ConcurrentHashMap) this.matrix).get(scene);
        if (engineFrameScheduler$SceneGroup != null) {
            engineFrameScheduler$SceneGroup.requestRender("explicit");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.squareup.cash.blockers.flow.api.MultiBlockerFacilitator$Resolver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object resolve(EndFlowRequest endFlowRequest, Continuation continuation) {
        RealMultiBlockerFacilitator$SingleBlockerResolver$resolve$7 realMultiBlockerFacilitator$SingleBlockerResolver$resolve$7;
        int i;
        ApiResult apiResult;
        BlockersScreens blockersScreens = (BlockersScreens) this.binarizer;
        if (continuation instanceof RealMultiBlockerFacilitator$SingleBlockerResolver$resolve$7) {
            realMultiBlockerFacilitator$SingleBlockerResolver$resolve$7 = (RealMultiBlockerFacilitator$SingleBlockerResolver$resolve$7) continuation;
            int i2 = realMultiBlockerFacilitator$SingleBlockerResolver$resolve$7.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realMultiBlockerFacilitator$SingleBlockerResolver$resolve$7.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realMultiBlockerFacilitator$SingleBlockerResolver$resolve$7.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realMultiBlockerFacilitator$SingleBlockerResolver$resolve$7.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppService appService = ((RealMultiBlockerFacilitator) this.matrix).franklinAppService;
                    ClientScenario clientScenario = blockersScreens.getBlockersData().clientScenario;
                    clientScenario.getClass();
                    String str = blockersScreens.getBlockersData().flowToken;
                    realMultiBlockerFacilitator$SingleBlockerResolver$resolve$7.label = 1;
                    obj = appService.endFlow(clientScenario, str, endFlowRequest, realMultiBlockerFacilitator$SingleBlockerResolver$resolve$7);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    ResponseContext responseContext = ((EndFlowResponse) ((ApiResult.Success) apiResult).response).response_context;
                    return Matcher$$ExternalSyntheticOutline0.m(responseContext, responseContext);
                }
                if (apiResult instanceof ApiResult.Failure) {
                    return apiResult;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        realMultiBlockerFacilitator$SingleBlockerResolver$resolve$7 = new RealMultiBlockerFacilitator$SingleBlockerResolver$resolve$7(this, (ContinuationImpl) continuation);
        Object obj2 = realMultiBlockerFacilitator$SingleBlockerResolver$resolve$7.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realMultiBlockerFacilitator$SingleBlockerResolver$resolve$7.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }

    public void setTargetPaused(Scene scene, Object obj, boolean z) {
        scene.getClass();
        obj.getClass();
        EngineFrameScheduler$SceneGroup engineFrameScheduler$SceneGroup = (EngineFrameScheduler$SceneGroup) ((ConcurrentHashMap) this.matrix).get(scene);
        if (engineFrameScheduler$SceneGroup != null) {
            synchronized (engineFrameScheduler$SceneGroup.lock) {
                EngineFrameScheduler$SceneGroup.RenderTarget renderTarget = (EngineFrameScheduler$SceneGroup.RenderTarget) engineFrameScheduler$SceneGroup.targets.get(obj);
                if (renderTarget == null) {
                    return;
                }
                engineFrameScheduler$SceneGroup.targets.put(obj, EngineFrameScheduler$SceneGroup.RenderTarget.copy$default(renderTarget, 0, 0, z, 15));
                if (!z) {
                    engineFrameScheduler$SceneGroup.requestRender("resume");
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r5v4, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable sign(byte[] bArr, ContinuationImpl continuationImpl) {
        RealDataSigner$sign$1 realDataSigner$sign$1;
        int i;
        SignatureFetch signatureFetch;
        if (continuationImpl instanceof RealDataSigner$sign$1) {
            realDataSigner$sign$1 = (RealDataSigner$sign$1) continuationImpl;
            int i2 = realDataSigner$sign$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realDataSigner$sign$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realDataSigner$sign$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realDataSigner$sign$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealSignatureRepo realSignatureRepo = (RealSignatureRepo) this.binarizer;
                    realDataSigner$sign$1.L$0 = bArr;
                    realDataSigner$sign$1.label = 1;
                    obj = JobKt.withContext(realSignatureRepo.ioDispatcher, new RealSignatureRepo$retrieveSignature$2(realSignatureRepo, null), realDataSigner$sign$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bArr = realDataSigner$sign$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                signatureFetch = (SignatureFetch) obj;
                if (!(signatureFetch instanceof SignatureFetch.Success)) {
                    try {
                        return ((RealTrifleService) ((TrifleService) this.matrix)).signData(bArr, ((SignatureFetch.Success) signatureFetch).signature);
                    } catch (Exception unused) {
                    }
                } else if (!(signatureFetch instanceof SignatureFetch.Failure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return null;
            }
        }
        realDataSigner$sign$1 = new RealDataSigner$sign$1(this, continuationImpl);
        Object obj2 = realDataSigner$sign$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realDataSigner$sign$1.label;
        if (i != 0) {
        }
        signatureFetch = (SignatureFetch) obj2;
        if (!(signatureFetch instanceof SignatureFetch.Success)) {
        }
        return null;
    }

    public ListenableFuture submitAsync(AsyncCallable asyncCallable, Executor executor) {
        executor.getClass();
        ExecutionSequencer$TaskNonReentrantExecutor executionSequencer$TaskNonReentrantExecutor = new ExecutionSequencer$TaskNonReentrantExecutor(ExecutionSequencer$RunningState.NOT_RUN);
        executionSequencer$TaskNonReentrantExecutor.delegate = executor;
        executionSequencer$TaskNonReentrantExecutor.sequencer = this;
        Result result = new Result(9, executionSequencer$TaskNonReentrantExecutor, asyncCallable);
        SettableFuture settableFuture = new SettableFuture();
        ListenableFuture listenableFuture = (ListenableFuture) ((AtomicReference) this.binarizer).getAndSet(settableFuture);
        TrustedListenableFutureTask trustedListenableFutureTask = new TrustedListenableFutureTask();
        trustedListenableFutureTask.task = trustedListenableFutureTask.new TrustedFutureInterruptibleAsyncTask(result);
        listenableFuture.addListener(trustedListenableFutureTask, executionSequencer$TaskNonReentrantExecutor);
        ListenableFuture nonCancellationPropagating = Futures.nonCancellationPropagating(trustedListenableFutureTask);
        Radiography$$ExternalSyntheticLambda0 radiography$$ExternalSyntheticLambda0 = new Radiography$$ExternalSyntheticLambda0(trustedListenableFutureTask, settableFuture, listenableFuture, nonCancellationPropagating, executionSequencer$TaskNonReentrantExecutor, 4);
        DirectExecutor directExecutor = DirectExecutor.INSTANCE;
        nonCancellationPropagating.addListener(radiography$$ExternalSyntheticLambda0, directExecutor);
        trustedListenableFutureTask.addListener(radiography$$ExternalSyntheticLambda0, directExecutor);
        return nonCancellationPropagating;
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 0:
                try {
                    return getBlackMatrix().toString();
                } catch (NotFoundException unused) {
                    return "";
                }
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00c5  */
    @Override // com.squareup.cash.family.familyhub.backend.api.DependentControlStatusRequestHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object toggleDependentControl(boolean z, ContinuationImpl continuationImpl) {
        DependentBitcoinInvestingControlStatusRequestHandler$toggleDependentControl$1 dependentBitcoinInvestingControlStatusRequestHandler$toggleDependentControl$1;
        int i;
        ApiResult apiResult;
        Boolean bool;
        List list;
        DependentStockInvestingControlStatusRequestHandler$toggleDependentControl$1 dependentStockInvestingControlStatusRequestHandler$toggleDependentControl$1;
        int i2;
        ApiResult apiResult2;
        List list2;
        int i3 = this.$r8$classId;
        Object obj = this.binarizer;
        switch (i3) {
            case 25:
                if (continuationImpl instanceof DependentBitcoinInvestingControlStatusRequestHandler$toggleDependentControl$1) {
                    dependentBitcoinInvestingControlStatusRequestHandler$toggleDependentControl$1 = (DependentBitcoinInvestingControlStatusRequestHandler$toggleDependentControl$1) continuationImpl;
                    int i4 = dependentBitcoinInvestingControlStatusRequestHandler$toggleDependentControl$1.label;
                    if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                        dependentBitcoinInvestingControlStatusRequestHandler$toggleDependentControl$1.label = i4 - PKIFailureInfo.systemUnavail;
                        Object obj2 = dependentBitcoinInvestingControlStatusRequestHandler$toggleDependentControl$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = dependentBitcoinInvestingControlStatusRequestHandler$toggleDependentControl$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            String str = (String) this.matrix;
                            Boolean valueOf = Boolean.valueOf(z);
                            EmptyList emptyList = EmptyList.INSTANCE;
                            ByteString byteString = ByteString.EMPTY;
                            SetCryptoControlsRequest setCryptoControlsRequest = new SetCryptoControlsRequest(str, new SetCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl(new CryptoExchangeCustomerControl(valueOf, emptyList, byteString)), byteString);
                            dependentBitcoinInvestingControlStatusRequestHandler$toggleDependentControl$1.Z$0 = z;
                            dependentBitcoinInvestingControlStatusRequestHandler$toggleDependentControl$1.label = 1;
                            obj2 = ((CryptoCustomerControlsService) obj).setCryptoControls(setCryptoControlsRequest, dependentBitcoinInvestingControlStatusRequestHandler$toggleDependentControl$1);
                            if (obj2 == coroutineSingletons) {
                                break;
                            }
                        } else if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            z = dependentBitcoinInvestingControlStatusRequestHandler$toggleDependentControl$1.Z$0;
                            SafeTrace.throwOnFailure(obj2);
                        }
                        apiResult = (ApiResult) obj2;
                        if (!(apiResult instanceof ApiResult.Success)) {
                            SetCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl setCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl = ((SetCryptoControlsResponse) ((ApiResult.Success) apiResult).response).customer_control;
                            CryptoExchangeCustomerControl cryptoExchangeCustomerControl = setCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl != null ? setCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl.value : null;
                            CryptoExchangeCustomerControl.CryptoExchangeLimit cryptoExchangeLimit = (cryptoExchangeCustomerControl == null || (list = cryptoExchangeCustomerControl.limits) == null) ? null : (CryptoExchangeCustomerControl.CryptoExchangeLimit) CollectionsKt.firstOrNull(list);
                            if (cryptoExchangeCustomerControl != null && (bool = cryptoExchangeCustomerControl.is_enabled) != null) {
                                z = bool.booleanValue();
                            }
                            break;
                        } else if (!(apiResult instanceof ApiResult.Failure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        }
                    }
                }
                dependentBitcoinInvestingControlStatusRequestHandler$toggleDependentControl$1 = new DependentBitcoinInvestingControlStatusRequestHandler$toggleDependentControl$1(this, continuationImpl);
                Object obj22 = dependentBitcoinInvestingControlStatusRequestHandler$toggleDependentControl$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dependentBitcoinInvestingControlStatusRequestHandler$toggleDependentControl$1.label;
                if (i != 0) {
                }
                apiResult = (ApiResult) obj22;
                if (!(apiResult instanceof ApiResult.Success)) {
                }
                break;
            default:
                if (continuationImpl instanceof DependentStockInvestingControlStatusRequestHandler$toggleDependentControl$1) {
                    dependentStockInvestingControlStatusRequestHandler$toggleDependentControl$1 = (DependentStockInvestingControlStatusRequestHandler$toggleDependentControl$1) continuationImpl;
                    int i5 = dependentStockInvestingControlStatusRequestHandler$toggleDependentControl$1.label;
                    if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                        dependentStockInvestingControlStatusRequestHandler$toggleDependentControl$1.label = i5 - PKIFailureInfo.systemUnavail;
                        Object obj3 = dependentStockInvestingControlStatusRequestHandler$toggleDependentControl$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = dependentStockInvestingControlStatusRequestHandler$toggleDependentControl$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            SetCustomerControlsRequest setCustomerControlsRequest = new SetCustomerControlsRequest((String) this.matrix, Boolean.valueOf(z), null, ByteString.EMPTY);
                            dependentStockInvestingControlStatusRequestHandler$toggleDependentControl$1.label = 1;
                            obj3 = ((InvestCustomerService) obj).setCustomerControls(setCustomerControlsRequest, dependentStockInvestingControlStatusRequestHandler$toggleDependentControl$1);
                            if (obj3 == coroutineSingletons3) {
                                break;
                            }
                        } else if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj3);
                        }
                        apiResult2 = (ApiResult) obj3;
                        if (!(apiResult2 instanceof ApiResult.Success)) {
                            SetCustomerControlsResponse setCustomerControlsResponse = (SetCustomerControlsResponse) ((ApiResult.Success) apiResult2).response;
                            CustomerControls customerControls = setCustomerControlsResponse.customer_controls;
                            CustomerLimit customerLimit = (customerControls == null || (list2 = customerControls.trading_limits) == null) ? null : (CustomerLimit) CollectionsKt.firstOrNull(list2);
                            CustomerControls customerControls2 = setCustomerControlsResponse.customer_controls;
                            break;
                        } else if (!(apiResult2 instanceof ApiResult.Failure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        }
                    }
                }
                dependentStockInvestingControlStatusRequestHandler$toggleDependentControl$1 = new DependentStockInvestingControlStatusRequestHandler$toggleDependentControl$1(this, continuationImpl);
                Object obj32 = dependentStockInvestingControlStatusRequestHandler$toggleDependentControl$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = dependentStockInvestingControlStatusRequestHandler$toggleDependentControl$1.label;
                if (i2 != 0) {
                }
                apiResult2 = (ApiResult) obj32;
                if (!(apiResult2 instanceof ApiResult.Success)) {
                }
                break;
        }
        return null;
    }

    public void unregisterTarget(Scene scene, Object obj) {
        boolean isEmpty;
        scene.getClass();
        EngineFrameScheduler$SceneGroup engineFrameScheduler$SceneGroup = (EngineFrameScheduler$SceneGroup) ((ConcurrentHashMap) this.matrix).get(scene);
        if (engineFrameScheduler$SceneGroup == null) {
            return;
        }
        synchronized (engineFrameScheduler$SceneGroup.lock) {
        }
        synchronized (engineFrameScheduler$SceneGroup.lock) {
            isEmpty = engineFrameScheduler$SceneGroup.targets.isEmpty();
        }
        if (isEmpty) {
            synchronized (engineFrameScheduler$SceneGroup.lock) {
                try {
                    JobSupport jobSupport = engineFrameScheduler$SceneGroup.dirtyJob;
                    if (jobSupport != null) {
                        jobSupport.cancel(null);
                    }
                    engineFrameScheduler$SceneGroup.dirtyJob = null;
                    JobSupport jobSupport2 = engineFrameScheduler$SceneGroup.scheduledRenderJob;
                    if (jobSupport2 != null) {
                        jobSupport2.cancel(null);
                    }
                    engineFrameScheduler$SceneGroup.scheduledRenderJob = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            ((ConcurrentHashMap) this.matrix).remove(scene);
        }
    }

    public void update(SntpClient.Response response) {
        synchronized (this) {
            zzr zzrVar = (zzr) this.binarizer;
            ((SharedPreferences) zzrVar.zza).edit().putLong("com.lyft.kronos.cached_current_time", response.deviceCurrentTimestampMs).apply();
            zzr zzrVar2 = (zzr) this.binarizer;
            ((SharedPreferences) zzrVar2.zza).edit().putLong("com.lyft.kronos.cached_elapsed_time", response.deviceElapsedTimestampMs).apply();
            zzr zzrVar3 = (zzr) this.binarizer;
            ((SharedPreferences) zzrVar3.zza).edit().putLong("com.lyft.kronos.cached_offset", response.offsetMs).apply();
        }
    }

    public void updateTargetSize(Scene scene, Object obj, int i, int i2) {
        scene.getClass();
        EngineFrameScheduler$SceneGroup engineFrameScheduler$SceneGroup = (EngineFrameScheduler$SceneGroup) ((ConcurrentHashMap) this.matrix).get(scene);
        if (engineFrameScheduler$SceneGroup != null) {
            synchronized (engineFrameScheduler$SceneGroup.lock) {
                EngineFrameScheduler$SceneGroup.RenderTarget renderTarget = (EngineFrameScheduler$SceneGroup.RenderTarget) engineFrameScheduler$SceneGroup.targets.get(obj);
                if (renderTarget == null) {
                    return;
                }
                engineFrameScheduler$SceneGroup.targets.put(obj, EngineFrameScheduler$SceneGroup.RenderTarget.copy$default(renderTarget, i, i2, false, 25));
                engineFrameScheduler$SceneGroup.requestRender("resize");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.squareup.cash.blockers.flow.api.MultiBlockerFacilitator$Resolver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object resolve(SubmitFormRequest submitFormRequest, ContinuationImpl continuationImpl) {
        RealMultiBlockerFacilitator$SingleBlockerResolver$resolve$3 realMultiBlockerFacilitator$SingleBlockerResolver$resolve$3;
        int i;
        ApiResult apiResult;
        BlockersScreens blockersScreens = (BlockersScreens) this.binarizer;
        if (continuationImpl instanceof RealMultiBlockerFacilitator$SingleBlockerResolver$resolve$3) {
            realMultiBlockerFacilitator$SingleBlockerResolver$resolve$3 = (RealMultiBlockerFacilitator$SingleBlockerResolver$resolve$3) continuationImpl;
            int i2 = realMultiBlockerFacilitator$SingleBlockerResolver$resolve$3.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realMultiBlockerFacilitator$SingleBlockerResolver$resolve$3.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realMultiBlockerFacilitator$SingleBlockerResolver$resolve$3.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realMultiBlockerFacilitator$SingleBlockerResolver$resolve$3.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppService appService = ((RealMultiBlockerFacilitator) this.matrix).franklinAppService;
                    ClientScenario clientScenario = blockersScreens.getBlockersData().clientScenario;
                    clientScenario.getClass();
                    String str = blockersScreens.getBlockersData().flowToken;
                    realMultiBlockerFacilitator$SingleBlockerResolver$resolve$3.label = 1;
                    obj = appService.submitForm(clientScenario, str, submitFormRequest, realMultiBlockerFacilitator$SingleBlockerResolver$resolve$3);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    ResponseContext responseContext = ((SubmitFormResponse) ((ApiResult.Success) apiResult).response).response_context;
                    return Matcher$$ExternalSyntheticOutline0.m(responseContext, responseContext);
                }
                if (apiResult instanceof ApiResult.Failure) {
                    return apiResult;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        realMultiBlockerFacilitator$SingleBlockerResolver$resolve$3 = new RealMultiBlockerFacilitator$SingleBlockerResolver$resolve$3(this, continuationImpl);
        Object obj2 = realMultiBlockerFacilitator$SingleBlockerResolver$resolve$3.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realMultiBlockerFacilitator$SingleBlockerResolver$resolve$3.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.squareup.cash.blockers.flow.api.MultiBlockerFacilitator$Resolver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object resolve(UploadFileRequest uploadFileRequest, Continuation continuation) {
        RealMultiBlockerFacilitator$SingleBlockerResolver$resolve$5 realMultiBlockerFacilitator$SingleBlockerResolver$resolve$5;
        int i;
        ApiResult apiResult;
        BlockersScreens blockersScreens = (BlockersScreens) this.binarizer;
        if (continuation instanceof RealMultiBlockerFacilitator$SingleBlockerResolver$resolve$5) {
            realMultiBlockerFacilitator$SingleBlockerResolver$resolve$5 = (RealMultiBlockerFacilitator$SingleBlockerResolver$resolve$5) continuation;
            int i2 = realMultiBlockerFacilitator$SingleBlockerResolver$resolve$5.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realMultiBlockerFacilitator$SingleBlockerResolver$resolve$5.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realMultiBlockerFacilitator$SingleBlockerResolver$resolve$5.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realMultiBlockerFacilitator$SingleBlockerResolver$resolve$5.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppService appService = ((RealMultiBlockerFacilitator) this.matrix).franklinAppService;
                    ClientScenario clientScenario = blockersScreens.getBlockersData().clientScenario;
                    clientScenario.getClass();
                    String str = blockersScreens.getBlockersData().flowToken;
                    realMultiBlockerFacilitator$SingleBlockerResolver$resolve$5.label = 1;
                    obj = appService.uploadFile(clientScenario, str, uploadFileRequest, realMultiBlockerFacilitator$SingleBlockerResolver$resolve$5);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    ResponseContext responseContext = ((UploadFileResponse) ((ApiResult.Success) apiResult).response).response_context;
                    return Matcher$$ExternalSyntheticOutline0.m(responseContext, responseContext);
                }
                if (apiResult instanceof ApiResult.Failure) {
                    return apiResult;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        realMultiBlockerFacilitator$SingleBlockerResolver$resolve$5 = new RealMultiBlockerFacilitator$SingleBlockerResolver$resolve$5(this, (ContinuationImpl) continuation);
        Object obj2 = realMultiBlockerFacilitator$SingleBlockerResolver$resolve$5.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realMultiBlockerFacilitator$SingleBlockerResolver$resolve$5.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.squareup.cash.blockers.flow.api.MultiBlockerFacilitator$Resolver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object resolve(ResolvePersonaDidvBlockerRequest resolvePersonaDidvBlockerRequest, Continuation continuation) {
        RealMultiBlockerFacilitator$SingleBlockerResolver$resolve$1 realMultiBlockerFacilitator$SingleBlockerResolver$resolve$1;
        int i;
        ApiResult apiResult;
        BlockersScreens blockersScreens = (BlockersScreens) this.binarizer;
        if (continuation instanceof RealMultiBlockerFacilitator$SingleBlockerResolver$resolve$1) {
            realMultiBlockerFacilitator$SingleBlockerResolver$resolve$1 = (RealMultiBlockerFacilitator$SingleBlockerResolver$resolve$1) continuation;
            int i2 = realMultiBlockerFacilitator$SingleBlockerResolver$resolve$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realMultiBlockerFacilitator$SingleBlockerResolver$resolve$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realMultiBlockerFacilitator$SingleBlockerResolver$resolve$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realMultiBlockerFacilitator$SingleBlockerResolver$resolve$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppService appService = ((RealMultiBlockerFacilitator) this.matrix).appService;
                    ClientScenario clientScenario = blockersScreens.getBlockersData().clientScenario;
                    clientScenario.getClass();
                    String str = blockersScreens.getBlockersData().flowToken;
                    realMultiBlockerFacilitator$SingleBlockerResolver$resolve$1.label = 1;
                    obj = appService.resolvePersonaDidv(clientScenario, str, resolvePersonaDidvBlockerRequest, realMultiBlockerFacilitator$SingleBlockerResolver$resolve$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    ResponseContext responseContext = ((ResolvePersonaDidvBlockerResponse) ((ApiResult.Success) apiResult).response).response_context;
                    return Matcher$$ExternalSyntheticOutline0.m(responseContext, responseContext);
                }
                if (apiResult instanceof ApiResult.Failure) {
                    return apiResult;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        realMultiBlockerFacilitator$SingleBlockerResolver$resolve$1 = new RealMultiBlockerFacilitator$SingleBlockerResolver$resolve$1(this, (ContinuationImpl) continuation);
        Object obj2 = realMultiBlockerFacilitator$SingleBlockerResolver$resolve$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realMultiBlockerFacilitator$SingleBlockerResolver$resolve$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }

    @Override // com.squareup.cash.blockers.flow.api.MultiBlockerFacilitator$Resolver
    public Object resolve(SetDateRequest setDateRequest, SessionWorker$doWork$2$2 sessionWorker$doWork$2$2) {
        RealMultiBlockerFacilitator realMultiBlockerFacilitator = (RealMultiBlockerFacilitator) this.matrix;
        return JobKt.withContext(realMultiBlockerFacilitator.ioDispatcher, new AmountBlockerPresenter$models$1$2(realMultiBlockerFacilitator, this, setDateRequest, (Continuation) null, 28), sessionWorker$doWork$2$2);
    }

    public BinaryBitmap(zzi zziVar) {
        this.$r8$classId = 3;
        this.matrix = new Handler(Looper.getMainLooper());
        this.binarizer = zziVar;
    }

    public BinaryBitmap(InvestCustomerService investCustomerService, String str) {
        this.$r8$classId = 26;
        str.getClass();
        this.binarizer = investCustomerService;
        this.matrix = str;
    }

    public BinaryBitmap(RealBitcoinCapabilityProvider realBitcoinCapabilityProvider, RealBalanceSnapshotManager realBalanceSnapshotManager, RealCryptoBalanceRepo realCryptoBalanceRepo) {
        this.$r8$classId = 16;
        this.binarizer = realBalanceSnapshotManager;
        this.matrix = realCryptoBalanceRepo;
    }

    public BinaryBitmap(CryptoCustomerControlsService cryptoCustomerControlsService, String str) {
        this.$r8$classId = 25;
        str.getClass();
        this.binarizer = cryptoCustomerControlsService;
        this.matrix = str;
    }

    public /* synthetic */ BinaryBitmap(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.binarizer = obj;
        this.matrix = obj2;
    }

    public BinaryBitmap(RealContactHeaderPresenter$Factory$Impl realContactHeaderPresenter$Factory$Impl, AndroidStringManager androidStringManager, BetterNavigator.ScreenNavigator screenNavigator, GlobalSearchScreen globalSearchScreen) {
        this.$r8$classId = 28;
        globalSearchScreen.getClass();
        this.binarizer = androidStringManager;
        this.matrix = realContactHeaderPresenter$Factory$Impl.create$1(globalSearchScreen, screenNavigator);
    }

    public BinaryBitmap(Engine engine) {
        this.$r8$classId = 29;
        this.binarizer = engine;
        this.matrix = new ConcurrentHashMap();
    }

    public BinaryBitmap(Vibrator vibrator) {
        this.$r8$classId = 27;
        this.binarizer = vibrator;
        this.matrix = new ConcurrentHashMap();
    }

    public BinaryBitmap(FeatureFlagManager featureFlagManager, CoroutineScope coroutineScope) {
        this.$r8$classId = 12;
        zza zzaVar = new zza(10);
        zzzx.zza();
        this.binarizer = new zzot(zzaVar);
        Continuation continuation = null;
        int i = 0;
        SafeFlow safeFlow = new SafeFlow(new MLKitTitleGenerator$prepareModel$1(this, continuation, i));
        Boolean bool = Boolean.FALSE;
        StartedLazily startedLazily = SharingStarted.Companion.Eagerly;
        this.matrix = FlowKt.stateIn(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(FlowKt.stateIn(safeFlow, coroutineScope, startedLazily, bool), ((RealFeatureFlagManager) featureFlagManager).peekValues(LaunchDarklyFeatureFlags$BugReportGenerateTitle.INSTANCE), new MLKitTitleGenerator$isAvailable$1(3, continuation, i), i), coroutineScope, startedLazily, bool);
        JobKt.launch$default(coroutineScope, null, null, new MLKitTitleGenerator$1(this, continuation, i), 3);
    }

    public BinaryBitmap(HybridBinarizer hybridBinarizer) {
        this.$r8$classId = 0;
        this.binarizer = hybridBinarizer;
    }

    public BinaryBitmap(GenericGF genericGF) {
        this.$r8$classId = 9;
        this.binarizer = genericGF;
        ArrayList arrayList = new ArrayList();
        this.matrix = arrayList;
        arrayList.add(new GenericGFPoly(genericGF, new int[]{1}));
    }

    public BinaryBitmap(RealMultiBlockerFacilitator realMultiBlockerFacilitator, BlockersScreens blockersScreens) {
        this.$r8$classId = 18;
        blockersScreens.getClass();
        this.matrix = realMultiBlockerFacilitator;
        this.binarizer = blockersScreens;
    }

    public BinaryBitmap(byte[] bArr, java.security.Provider provider) {
        this.$r8$classId = 7;
        if (re$$ExternalSyntheticOutline0._isCompatible(1)) {
            this.binarizer = new SecretKeySpec(bArr, "AES");
            this.matrix = provider;
        } else {
            a$$ExternalSyntheticBUOutline0.m$6("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
            throw null;
        }
    }

    public BinaryBitmap(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 21:
                DeepLinksConfig deepLinksConfig = DeepLinksConfig.production;
                deepLinksConfig.getClass();
                this.binarizer = deepLinksConfig;
                this.matrix = RealUriFormatter.INSTANCE;
                break;
            default:
                this.binarizer = new AtomicReference(ImmediateFuture.NULL);
                this.matrix = new n(5);
                break;
        }
    }

    public BinaryBitmap(InstancedCardBatch instancedCardBatch) {
        this.$r8$classId = 20;
        this.matrix = instancedCardBatch;
        this.binarizer = instancedCardBatch._ready;
        Timber.Forest.d("BatchedGeometry created", new Object[0]);
    }
}
