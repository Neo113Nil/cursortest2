package com.squareup.cash.cashapplite.presenters;

import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.mlkit.vision.text.internal.zzr;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.CardStudioPresenter$models$1$1;
import com.squareup.cash.cashapplite.screens.LiteCashInScreen;
import com.squareup.cash.cashapplite.screens.PasskeySignatureBlockerScreen;
import com.squareup.cash.cashapplite.viewmodels.LiteCashInViewModel;
import com.squareup.cash.cashapplite.viewmodels.PasskeySignatureBlockerViewModel;
import com.squareup.cash.clientsync.EntitySyncerKt$hasSyncedFlow$1;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.passkeys.backend.CredentialManagerPasskeyCreator;
import com.squareup.cash.passkeys.backend.PasskeyCredentialCreator$FetchCredentialResult;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.BuildAndPrepareUserOpRequest;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.BuildAndPrepareUserOpResponse;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.ExecuteUserOpRequest;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.OrchestratorService;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.SignatureRequest;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.SignedEnvelope;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.PasskeySignatureBlocker;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.protos.franklin.app.SubmitFormResponse;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.json.JSONArray;
import org.json.JSONObject;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class LiteCashInPresenter implements MoleculePresenter {
    public final /* synthetic */ int $r8$classId = 0;
    public final Screen args;
    public final BlockersDataNavigator blockersDataNavigator;
    public final Object clipboardManager;
    public final Object flowStarter;
    public final Object liteCashInRepo;
    public final BetterNavigator.ScreenNavigator navigator;

    public LiteCashInPresenter(OrchestratorService orchestratorService, CredentialManagerPasskeyCreator credentialManagerPasskeyCreator, AppService appService, BlockersDataNavigator blockersDataNavigator, PasskeySignatureBlockerScreen passkeySignatureBlockerScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        passkeySignatureBlockerScreen.getClass();
        this.liteCashInRepo = orchestratorService;
        this.clipboardManager = credentialManagerPasskeyCreator;
        this.flowStarter = appService;
        this.blockersDataNavigator = blockersDataNavigator;
        this.args = passkeySignatureBlockerScreen;
        this.navigator = screenNavigator;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r8.submitFormAndAdvance(r0) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (r8.executeUserOp(r2, (java.util.List) r9, r0) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        if (r9 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
    
        if (r9 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$runSignatureFlow(LiteCashInPresenter liteCashInPresenter, ContinuationImpl continuationImpl) {
        PasskeySignatureBlockerPresenter$runSignatureFlow$1 passkeySignatureBlockerPresenter$runSignatureFlow$1;
        int i;
        BuildAndPrepareUserOpResponse buildAndPrepareUserOpResponse;
        if (continuationImpl instanceof PasskeySignatureBlockerPresenter$runSignatureFlow$1) {
            passkeySignatureBlockerPresenter$runSignatureFlow$1 = (PasskeySignatureBlockerPresenter$runSignatureFlow$1) continuationImpl;
            int i2 = passkeySignatureBlockerPresenter$runSignatureFlow$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                passkeySignatureBlockerPresenter$runSignatureFlow$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = passkeySignatureBlockerPresenter$runSignatureFlow$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passkeySignatureBlockerPresenter$runSignatureFlow$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    passkeySignatureBlockerPresenter$runSignatureFlow$1.label = 1;
                    obj = liteCashInPresenter.getOrBuildAndPrepare(passkeySignatureBlockerPresenter$runSignatureFlow$1);
                } else if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i == 2) {
                    buildAndPrepareUserOpResponse = passkeySignatureBlockerPresenter$runSignatureFlow$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    passkeySignatureBlockerPresenter$runSignatureFlow$1.L$0 = null;
                    passkeySignatureBlockerPresenter$runSignatureFlow$1.label = 3;
                } else {
                    if (i != 3) {
                        if (i == 4) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    passkeySignatureBlockerPresenter$runSignatureFlow$1.L$0 = null;
                    passkeySignatureBlockerPresenter$runSignatureFlow$1.label = 4;
                }
                buildAndPrepareUserOpResponse = (BuildAndPrepareUserOpResponse) obj;
                passkeySignatureBlockerPresenter$runSignatureFlow$1.L$0 = buildAndPrepareUserOpResponse;
                passkeySignatureBlockerPresenter$runSignatureFlow$1.label = 2;
                obj = liteCashInPresenter.signAllRequests(buildAndPrepareUserOpResponse, passkeySignatureBlockerPresenter$runSignatureFlow$1);
            }
        }
        passkeySignatureBlockerPresenter$runSignatureFlow$1 = new PasskeySignatureBlockerPresenter$runSignatureFlow$1(liteCashInPresenter, continuationImpl);
        Object obj3 = passkeySignatureBlockerPresenter$runSignatureFlow$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passkeySignatureBlockerPresenter$runSignatureFlow$1.label;
        if (i != 0) {
        }
        buildAndPrepareUserOpResponse = (BuildAndPrepareUserOpResponse) obj3;
        passkeySignatureBlockerPresenter$runSignatureFlow$1.L$0 = buildAndPrepareUserOpResponse;
        passkeySignatureBlockerPresenter$runSignatureFlow$1.label = 2;
        obj3 = liteCashInPresenter.signAllRequests(buildAndPrepareUserOpResponse, passkeySignatureBlockerPresenter$runSignatureFlow$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object executeUserOp(BuildAndPrepareUserOpResponse buildAndPrepareUserOpResponse, List list, ContinuationImpl continuationImpl) {
        PasskeySignatureBlockerPresenter$executeUserOp$1 passkeySignatureBlockerPresenter$executeUserOp$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof PasskeySignatureBlockerPresenter$executeUserOp$1) {
            passkeySignatureBlockerPresenter$executeUserOp$1 = (PasskeySignatureBlockerPresenter$executeUserOp$1) continuationImpl;
            int i2 = passkeySignatureBlockerPresenter$executeUserOp$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                passkeySignatureBlockerPresenter$executeUserOp$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = passkeySignatureBlockerPresenter$executeUserOp$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passkeySignatureBlockerPresenter$executeUserOp$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ExecuteUserOpRequest executeUserOpRequest = new ExecuteUserOpRequest(buildAndPrepareUserOpResponse.prepared_calls, buildAndPrepareUserOpResponse.source_chain, list, buildAndPrepareUserOpResponse.operation_token, ByteString.EMPTY);
                    OrchestratorService orchestratorService = (OrchestratorService) this.liteCashInRepo;
                    passkeySignatureBlockerPresenter$executeUserOp$1.label = 1;
                    obj = orchestratorService.executeUserOp(executeUserOpRequest, passkeySignatureBlockerPresenter$executeUserOp$1);
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
                    return Unit.INSTANCE;
                }
                if (apiResult instanceof ApiResult.Failure) {
                    throw new PasskeySignatureBlockerPresenter$SignatureFlowException();
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        passkeySignatureBlockerPresenter$executeUserOp$1 = new PasskeySignatureBlockerPresenter$executeUserOp$1(this, continuationImpl);
        Object obj2 = passkeySignatureBlockerPresenter$executeUserOp$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passkeySignatureBlockerPresenter$executeUserOp$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable getOrBuildAndPrepare(ContinuationImpl continuationImpl) {
        PasskeySignatureBlockerPresenter$getOrBuildAndPrepare$1 passkeySignatureBlockerPresenter$getOrBuildAndPrepare$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof PasskeySignatureBlockerPresenter$getOrBuildAndPrepare$1) {
            passkeySignatureBlockerPresenter$getOrBuildAndPrepare$1 = (PasskeySignatureBlockerPresenter$getOrBuildAndPrepare$1) continuationImpl;
            int i2 = passkeySignatureBlockerPresenter$getOrBuildAndPrepare$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                passkeySignatureBlockerPresenter$getOrBuildAndPrepare$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = passkeySignatureBlockerPresenter$getOrBuildAndPrepare$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passkeySignatureBlockerPresenter$getOrBuildAndPrepare$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    PasskeySignatureBlocker passkeySignatureBlocker = ((PasskeySignatureBlockerScreen) this.args).blocker;
                    BuildAndPrepareUserOpResponse buildAndPrepareUserOpResponse = passkeySignatureBlocker.response;
                    if (buildAndPrepareUserOpResponse != null) {
                        return buildAndPrepareUserOpResponse;
                    }
                    BuildAndPrepareUserOpRequest buildAndPrepareUserOpRequest = passkeySignatureBlocker.request;
                    if (buildAndPrepareUserOpRequest == null) {
                        throw new PasskeySignatureBlockerPresenter$SignatureFlowException();
                    }
                    OrchestratorService orchestratorService = (OrchestratorService) this.liteCashInRepo;
                    passkeySignatureBlockerPresenter$getOrBuildAndPrepare$1.label = 1;
                    obj = orchestratorService.buildAndPrepareUserOp(buildAndPrepareUserOpRequest, passkeySignatureBlockerPresenter$getOrBuildAndPrepare$1);
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
                    return (BuildAndPrepareUserOpResponse) ((ApiResult.Success) apiResult).response;
                }
                if (apiResult instanceof ApiResult.Failure) {
                    throw new PasskeySignatureBlockerPresenter$SignatureFlowException();
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        passkeySignatureBlockerPresenter$getOrBuildAndPrepare$1 = new PasskeySignatureBlockerPresenter$getOrBuildAndPrepare$1(this, continuationImpl);
        Object obj2 = passkeySignatureBlockerPresenter$getOrBuildAndPrepare$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passkeySignatureBlockerPresenter$getOrBuildAndPrepare$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        int i2 = this.$r8$classId;
        Continuation continuation = null;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        switch (i2) {
            case 0:
                flow.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(1580926341);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = Updater.mutableStateOf$default(LiteCashInViewModel.Loading.INSTANCE);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                MutableState mutableState = (MutableState) rememberedValue;
                Unit unit = Unit.INSTANCE;
                boolean changedInstance = gapComposer.changedInstance(this);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new EntitySyncerKt$hasSyncedFlow$1(this, mutableState, continuation, 3);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
                Updater.LaunchedEffect(gapComposer, flow, new CardStudioPresenter$models$1$1(flow, continuation, this, 24));
                LiteCashInViewModel liteCashInViewModel = (LiteCashInViewModel) mutableState.getValue();
                gapComposer.end(false);
                return liteCashInViewModel;
            default:
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(695806747);
                Unit unit2 = Unit.INSTANCE;
                boolean changedInstance2 = gapComposer2.changedInstance(this);
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new CardModelView.AnonymousClass1.C00581(this, continuation, 19);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                }
                Updater.LaunchedEffect(gapComposer2, unit2, (Function2) rememberedValue3);
                gapComposer2.end(false);
                return PasskeySignatureBlockerViewModel.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00ec -> B:10:0x00ed). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object signAllRequests(BuildAndPrepareUserOpResponse buildAndPrepareUserOpResponse, ContinuationImpl continuationImpl) {
        PasskeySignatureBlockerPresenter$signAllRequests$1 passkeySignatureBlockerPresenter$signAllRequests$1;
        int i;
        Iterator it;
        Collection collection;
        int i2;
        int i3;
        if (continuationImpl instanceof PasskeySignatureBlockerPresenter$signAllRequests$1) {
            passkeySignatureBlockerPresenter$signAllRequests$1 = (PasskeySignatureBlockerPresenter$signAllRequests$1) continuationImpl;
            int i4 = passkeySignatureBlockerPresenter$signAllRequests$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                passkeySignatureBlockerPresenter$signAllRequests$1.label = i4 - PKIFailureInfo.systemUnavail;
                Object obj = passkeySignatureBlockerPresenter$signAllRequests$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passkeySignatureBlockerPresenter$signAllRequests$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    List<SignatureRequest> list = buildAndPrepareUserOpResponse.signature_requests;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    it = list.iterator();
                    collection = arrayList;
                    i2 = 0;
                    i3 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = passkeySignatureBlockerPresenter$signAllRequests$1.I$1;
                    i3 = passkeySignatureBlockerPresenter$signAllRequests$1.I$0;
                    collection = passkeySignatureBlockerPresenter$signAllRequests$1.L$8;
                    SignatureRequest signatureRequest = passkeySignatureBlockerPresenter$signAllRequests$1.L$6;
                    it = passkeySignatureBlockerPresenter$signAllRequests$1.L$4;
                    Collection collection2 = passkeySignatureBlockerPresenter$signAllRequests$1.L$3;
                    SafeTrace.throwOnFailure(obj);
                    boolean z = true;
                    Collection collection3 = collection2;
                    PasskeyCredentialCreator$FetchCredentialResult passkeyCredentialCreator$FetchCredentialResult = (PasskeyCredentialCreator$FetchCredentialResult) obj;
                    if (!(passkeyCredentialCreator$FetchCredentialResult instanceof PasskeyCredentialCreator$FetchCredentialResult.Success)) {
                        JSONObject jSONObject = new JSONObject(((PasskeyCredentialCreator$FetchCredentialResult.Success) passkeyCredentialCreator$FetchCredentialResult).credentialJson);
                        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
                        collection.add(new SignedEnvelope(signatureRequest.signing_envelope, jSONObject2.getString("clientDataJSON"), jSONObject2.getString("authenticatorData"), jSONObject2.getString("signature"), jSONObject.getString("id"), ByteString.EMPTY));
                        collection = collection3;
                        if (it.hasNext()) {
                            return (List) collection;
                        }
                        signatureRequest = (SignatureRequest) it.next();
                        PasskeySignatureBlockerScreen passkeySignatureBlockerScreen = (PasskeySignatureBlockerScreen) this.args;
                        JSONObject jSONObject3 = new JSONObject();
                        ByteString byteString = signatureRequest.challenge;
                        if (byteString == null) {
                            throw new PasskeySignatureBlockerPresenter$SignatureFlowException();
                        }
                        jSONObject3.put("challenge", byteString.base64Url());
                        jSONObject3.put("rpId", passkeySignatureBlockerScreen.blocker.relying_party_id);
                        JSONArray jSONArray = new JSONArray();
                        for (ByteString byteString2 : passkeySignatureBlockerScreen.blocker.allow_credential_ids) {
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("type", "public-key");
                            jSONObject4.put("id", byteString2.base64Url());
                            jSONArray.put(jSONObject4);
                        }
                        jSONObject3.put("allowCredentials", jSONArray);
                        String jSONObject5 = jSONObject3.toString();
                        jSONObject5.getClass();
                        CredentialManagerPasskeyCreator credentialManagerPasskeyCreator = (CredentialManagerPasskeyCreator) this.clipboardManager;
                        Collection collection4 = collection;
                        passkeySignatureBlockerPresenter$signAllRequests$1.L$3 = collection4;
                        passkeySignatureBlockerPresenter$signAllRequests$1.L$4 = it;
                        passkeySignatureBlockerPresenter$signAllRequests$1.L$6 = signatureRequest;
                        passkeySignatureBlockerPresenter$signAllRequests$1.L$8 = collection4;
                        passkeySignatureBlockerPresenter$signAllRequests$1.I$0 = i3;
                        passkeySignatureBlockerPresenter$signAllRequests$1.I$1 = i2;
                        z = true;
                        passkeySignatureBlockerPresenter$signAllRequests$1.label = 1;
                        obj = credentialManagerPasskeyCreator.getCredential(jSONObject5, false, passkeySignatureBlockerPresenter$signAllRequests$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        collection3 = collection;
                        PasskeyCredentialCreator$FetchCredentialResult passkeyCredentialCreator$FetchCredentialResult2 = (PasskeyCredentialCreator$FetchCredentialResult) obj;
                        if (!(passkeyCredentialCreator$FetchCredentialResult2 instanceof PasskeyCredentialCreator$FetchCredentialResult.Success)) {
                            throw new PasskeySignatureBlockerPresenter$SignatureFlowException();
                        }
                    }
                }
            }
        }
        passkeySignatureBlockerPresenter$signAllRequests$1 = new PasskeySignatureBlockerPresenter$signAllRequests$1(this, continuationImpl);
        Object obj2 = passkeySignatureBlockerPresenter$signAllRequests$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passkeySignatureBlockerPresenter$signAllRequests$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object submitFormAndAdvance(ContinuationImpl continuationImpl) {
        PasskeySignatureBlockerPresenter$submitFormAndAdvance$1 passkeySignatureBlockerPresenter$submitFormAndAdvance$1;
        int i;
        BlockersData blockersData;
        ApiResult apiResult;
        PasskeySignatureBlockerScreen passkeySignatureBlockerScreen = (PasskeySignatureBlockerScreen) this.args;
        if (continuationImpl instanceof PasskeySignatureBlockerPresenter$submitFormAndAdvance$1) {
            passkeySignatureBlockerPresenter$submitFormAndAdvance$1 = (PasskeySignatureBlockerPresenter$submitFormAndAdvance$1) continuationImpl;
            int i2 = passkeySignatureBlockerPresenter$submitFormAndAdvance$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                passkeySignatureBlockerPresenter$submitFormAndAdvance$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = passkeySignatureBlockerPresenter$submitFormAndAdvance$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passkeySignatureBlockerPresenter$submitFormAndAdvance$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    BlockersData blockersData2 = passkeySignatureBlockerScreen.blockersData;
                    AppService appService = (AppService) this.flowStarter;
                    ClientScenario clientScenario = blockersData2.clientScenario;
                    if (clientScenario == null) {
                        throw new PasskeySignatureBlockerPresenter$SignatureFlowException();
                    }
                    String str = blockersData2.flowToken;
                    EmptyList emptyList = EmptyList.INSTANCE;
                    RequestContext requestContext = blockersData2.requestContext;
                    SubmitFormRequest submitFormRequest = new SubmitFormRequest(requestContext, requestContext.blocker_descriptor_id, emptyList, 8);
                    passkeySignatureBlockerPresenter$submitFormAndAdvance$1.L$0 = blockersData2;
                    passkeySignatureBlockerPresenter$submitFormAndAdvance$1.label = 1;
                    Object submitForm = appService.submitForm(clientScenario, str, submitFormRequest, passkeySignatureBlockerPresenter$submitFormAndAdvance$1);
                    if (submitForm == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    blockersData = blockersData2;
                    obj = submitForm;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    blockersData = passkeySignatureBlockerPresenter$submitFormAndAdvance$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    if (apiResult instanceof ApiResult.Failure) {
                        throw new PasskeySignatureBlockerPresenter$SignatureFlowException();
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ResponseContext responseContext = ((SubmitFormResponse) ((ApiResult.Success) apiResult).response).response_context;
                if (responseContext != null) {
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    blockersData = blockersData.updateFromResponseContext(responseContext, false);
                }
                this.navigator.goTo(this.blockersDataNavigator.getNext(passkeySignatureBlockerScreen, blockersData));
                return Unit.INSTANCE;
            }
        }
        passkeySignatureBlockerPresenter$submitFormAndAdvance$1 = new PasskeySignatureBlockerPresenter$submitFormAndAdvance$1(this, continuationImpl);
        Object obj2 = passkeySignatureBlockerPresenter$submitFormAndAdvance$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passkeySignatureBlockerPresenter$submitFormAndAdvance$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    public LiteCashInPresenter(zzr zzrVar, RealClipboardManager realClipboardManager, FlowStarter flowStarter, BlockersDataNavigator blockersDataNavigator, LiteCashInScreen liteCashInScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        liteCashInScreen.getClass();
        this.liteCashInRepo = zzrVar;
        this.clipboardManager = realClipboardManager;
        this.flowStarter = flowStarter;
        this.blockersDataNavigator = blockersDataNavigator;
        this.args = liteCashInScreen;
        this.navigator = screenNavigator;
    }
}
