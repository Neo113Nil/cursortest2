package com.google.zxing;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.platform.ComposeView;
import androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3;
import app.cash.api.ApiResult;
import app.cash.local.presenters.wallet.TabContentPresenter$models$4$1$1$1;
import app.cash.zipline.internal.LogAndroidKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.xg$$ExternalSyntheticLambda9;
import coil3.network.NetworkFetcher$doFetch$fetchResult$1;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.libraries.places.api.model.zzeo;
import com.google.android.libraries.places.api.model.zzgc;
import com.google.android.libraries.places.api.net.zzu;
import com.google.android.libraries.places.internal.zzatp;
import com.google.android.libraries.places.internal.zzatw;
import com.google.android.libraries.places.internal.zzbgj;
import com.google.android.libraries.places.internal.zzbhc;
import com.google.android.libraries.places.internal.zzbhd;
import com.google.android.libraries.places.internal.zzbhx;
import com.google.android.libraries.places.internal.zzbkb;
import com.google.android.libraries.places.internal.zzbnn;
import com.google.android.libraries.places.internal.zzbno;
import com.google.android.libraries.places.internal.zzjm;
import com.google.android.play.core.appupdate.internal.zzaf;
import com.google.android.play.core.appupdate.zzi;
import com.google.android.play.core.appupdate.zzr;
import com.google.android.play.core.review.internal.zzt;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.AsyncCallable;
import com.google.common.util.concurrent.ExecutionSequencer$RunningState;
import com.google.common.util.concurrent.ExecutionSequencer$TaskNonReentrantExecutor;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.ImmediateFuture;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf;
import com.google.crypto.tink.hybrid.internal.HpkeUtil;
import com.google.crypto.tink.hybrid.internal.X25519;
import com.google.crypto.tink.internal.ConscryptUtil;
import com.google.crypto.tink.mac.MacWrapper$$ExternalSyntheticLambda0;
import com.google.crypto.tink.subtle.EllipticCurves$CurveType;
import com.google.crypto.tink.util.Bytes;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.maps.android.compose.ComposeInfoWindowAdapter$$ExternalSyntheticLambda0;
import com.google.maps.android.compose.MapComposeViewRenderKt;
import com.google.maps.android.compose.MarkerNode;
import com.google.mlkit.vision.text.zzb;
import com.google.mlkit.vision.text.zzc;
import com.google.zxing.oned.Code128Reader;
import com.squareup.cardcustomizations.stampview.StampMovingListener;
import com.squareup.cash.R;
import com.squareup.cash.aiedge.MLKitTitleGenerator$prepareModel$1;
import com.squareup.cash.appmessages.overlay.MutexProtected$access$1;
import com.squareup.cash.benefits.presenters.BenefitsHubPresenter$models$1$1;
import com.squareup.cash.bitcoin.presenters.BitcoinDepositsPresenter$special$$inlined$filter$1;
import com.squareup.cash.bitcoin.presenters.applet.widget.BitcoinHomeWidgetPresenter;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.disabled.DependentBitcoinDisabledViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.education.BitcoinStoriesWidgetViewModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.WithdrawalDetails;
import com.squareup.cash.crypto.WithdrawalDetails$WithdrawalType$DisplayId;
import com.squareup.cash.crypto.WithdrawalDetails$WithdrawalType$SendBitcoinToken;
import com.squareup.cash.crypto.WithdrawalDetails$WithdrawalType$WithdrawalDestination;
import com.squareup.cash.crypto.scenarioplans.plans.withdrawal.BitcoinWithdrawalRequestSigner$sign$1;
import com.squareup.cash.data.contacts.ContactVerifier$Result;
import com.squareup.cash.data.contacts.RealContactVerifier$verify$1;
import com.squareup.cash.data.contacts.RealContactVerifierKt$WhenMappings;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.education.stories.backend.api.GetStoriesResult;
import com.squareup.cash.family.familyhub.backend.api.DependentControlStatus;
import com.squareup.cash.family.familyhub.backend.api.DependentControlStatusRequestHandler;
import com.squareup.cash.family.familyhub.backend.real.DependentPromotionsControlStatusRequestHandler$getDependentControlStatus$1;
import com.squareup.cash.family.familyhub.backend.real.DependentPromotionsControlStatusRequestHandler$toggleDependentControl$1;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$SignInitiateBitcoinWithdrawalRequest;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.cryptosparky.api.InitiateBitcoinWithdrawal$Request;
import com.squareup.protos.cash.cryptosparky.api.InitiateBitcoinWithdrawal$Request$WithdrawalType$DisplayId;
import com.squareup.protos.cash.cryptosparky.api.InitiateBitcoinWithdrawal$Request$WithdrawalType$SendBitcoinToken;
import com.squareup.protos.cash.cryptosparky.api.InitiateBitcoinWithdrawal$Request$WithdrawalType$WithdrawalDestination;
import com.squareup.protos.cash.referly.api.incentives.client.GetPromotionControlsRequest;
import com.squareup.protos.cash.referly.api.incentives.client.GetPromotionControlsResponse;
import com.squareup.protos.cash.referly.api.incentives.client.IncentivesClientService;
import com.squareup.protos.cash.referly.api.incentives.client.PromotionControls;
import com.squareup.protos.cash.referly.api.incentives.client.SetPromotionControlsRequest;
import com.squareup.protos.cash.referly.api.incentives.client.SetPromotionControlsResponse;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.VerifyContactsRequest;
import com.squareup.protos.franklin.app.VerifyContactsResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.workflow1.internal.SubtreeManager;
import com.squareup.workflow1.ui.BackPressHandlerKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.lang.annotation.Annotation;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.crypto.KeyAgreement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.sync.MutexImpl;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class Result implements SuccessContinuation, FutureCallback, zzaf, OnCompleteListener, AsyncCallable, GoogleMap.InfoWindowAdapter, HasObservability, BitcoinHomeWidgetPresenter, StampMovingListener, DependentControlStatusRequestHandler {
    public final /* synthetic */ int $r8$classId;
    public Object resultMetadata;
    public Object text;

    public Result(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 18:
                zzb zzbVar = new zzb(15);
                zzc zzcVar = new zzc(15);
                this.text = zzbVar;
                this.resultMetadata = zzcVar;
                break;
            default:
                this.text = new Rect();
                this.resultMetadata = new Rect();
                break;
        }
    }

    public static void addPattern(ArrayList arrayList, int i, int[] iArr, int[] iArr2, int i2) {
        arrayList.add(Code128Reader.CODE_PATTERNS[i]);
        if (i2 != 0) {
            iArr2[0] = iArr2[0] + 1;
        }
        iArr[0] = (i * iArr2[0]) + iArr[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057 A[ADDED_TO_REGION, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean canEncode(int i, int i2, CharSequence charSequence) {
        char charAt;
        char charAt2 = charSequence.charAt(i2);
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i);
        if (ordinal != 0) {
            if (ordinal == 1) {
                return charAt2 == 241 || charAt2 == 242 || charAt2 == 243 || charAt2 == 244 || " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007fÿ".indexOf(charAt2) >= 0;
            }
            if (ordinal == 2) {
                if (charAt2 != 241) {
                    int i3 = i2 + 1;
                    return i3 < charSequence.length() && charAt2 >= '0' && charAt2 <= '9' && (charAt = charSequence.charAt(i3)) >= '0' && charAt <= '9';
                }
            }
        }
        if (charAt2 == 241 || charAt2 == 242 || charAt2 == 243 || charAt2 == 244 || " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fÿ".indexOf(charAt2) >= 0) {
        }
    }

    public static Result fromCurve(EllipticCurves$CurveType ellipticCurves$CurveType) {
        int ordinal = ellipticCurves$CurveType.ordinal();
        boolean z = false;
        int i = 10;
        if (ordinal == 0) {
            return new Result(new HkdfHpkeKdf("HmacSha256"), EllipticCurves$CurveType.NIST_P256, z, i);
        }
        if (ordinal == 1) {
            return new Result(new HkdfHpkeKdf("HmacSha384"), EllipticCurves$CurveType.NIST_P384, z, i);
        }
        if (ordinal == 2) {
            return new Result(new HkdfHpkeKdf("HmacSha512"), EllipticCurves$CurveType.NIST_P521, z, i);
        }
        MacWrapper$$ExternalSyntheticLambda0.m(ellipticCurves$CurveType, "invalid curve type: ");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object access(Function1 function1, ContinuationImpl continuationImpl) {
        MutexProtected$access$1 mutexProtected$access$1;
        int i;
        MutexImpl mutexImpl;
        try {
            if (continuationImpl instanceof MutexProtected$access$1) {
                mutexProtected$access$1 = (MutexProtected$access$1) continuationImpl;
                int i2 = mutexProtected$access$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    mutexProtected$access$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = mutexProtected$access$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = mutexProtected$access$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        mutexImpl = (MutexImpl) this.resultMetadata;
                        mutexProtected$access$1.L$0 = function1;
                        mutexProtected$access$1.L$1 = mutexImpl;
                        mutexProtected$access$1.label = 1;
                        if (mutexImpl.lock(mutexProtected$access$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        MutexImpl mutexImpl2 = mutexProtected$access$1.L$1;
                        Function1 function12 = mutexProtected$access$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        mutexImpl = mutexImpl2;
                        function1 = function12;
                    }
                    return function1.invoke((LinkedHashSet) this.text);
                }
            }
            return function1.invoke((LinkedHashSet) this.text);
        } finally {
            mutexImpl.unlock(null);
        }
        mutexProtected$access$1 = new MutexProtected$access$1(this, continuationImpl);
        Object obj2 = mutexProtected$access$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mutexProtected$access$1.label;
        if (i != 0) {
        }
    }

    public FieldDescriptor build() {
        return new FieldDescriptor((String) this.text, ((HashMap) this.resultMetadata) == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap((HashMap) this.resultMetadata)));
    }

    @Override // com.google.common.util.concurrent.AsyncCallable
    public ListenableFuture call() {
        ExecutionSequencer$TaskNonReentrantExecutor executionSequencer$TaskNonReentrantExecutor = (ExecutionSequencer$TaskNonReentrantExecutor) this.text;
        int i = ExecutionSequencer$TaskNonReentrantExecutor.$r8$clinit;
        if (executionSequencer$TaskNonReentrantExecutor.compareAndSet(ExecutionSequencer$RunningState.NOT_RUN, ExecutionSequencer$RunningState.STARTED)) {
            return ((AsyncCallable) this.resultMetadata).call();
        }
        ImmediateFuture.ImmediateCancelledFuture immediateCancelledFuture = ImmediateFuture.ImmediateCancelledFuture.INSTANCE;
        return immediateCancelledFuture != null ? immediateCancelledFuture : new ImmediateFuture.ImmediateCancelledFuture();
    }

    public int encode(int i, int i2, CharSequence charSequence) {
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        String str;
        int i8 = ((int[][]) this.text)[CameraSelector$$ExternalSyntheticOutline0.ordinal(i)][i2];
        if (i8 > 0) {
            return i8;
        }
        int i9 = i2 + 1;
        boolean z2 = i9 >= charSequence.length();
        int[] iArr = {1, 2};
        int i10 = 0;
        int i11 = Integer.MAX_VALUE;
        int i12 = 5;
        for (int i13 = 1; i10 <= i13; i13 = 1) {
            if (canEncode(iArr[i10], i2, charSequence)) {
                int i14 = iArr[i10];
                if (i != i14) {
                    z = z2;
                    if (i14 == i13) {
                        i5 = 4;
                        str = GpsTagConstants.GPS_TAG_GPS_STATUS_VALUE_MEASUREMENT_IN_PROGRESS;
                    } else if (i14 == 2) {
                        i5 = 4;
                        str = "B";
                    } else if (i14 != 3) {
                        i5 = 4;
                        if (i14 != 4) {
                            throw null;
                        }
                        str = "NONE";
                    } else {
                        i5 = 4;
                        str = "C";
                    }
                    if (str.equals(GpsTagConstants.GPS_TAG_GPS_STATUS_VALUE_MEASUREMENT_IN_PROGRESS)) {
                        i7 = 1;
                    } else if (str.equals("B")) {
                        i7 = 2;
                    } else if (str.equals("C")) {
                        i7 = 3;
                    } else if (str.equals("SHIFT")) {
                        i7 = i5;
                    } else if (str.equals("NONE")) {
                        i7 = 5;
                    } else {
                        a$$ExternalSyntheticBUOutline0.m$3("No enum constant com.google.zxing.oned.Code128Writer.MinimalEncoder.Latch.".concat(str));
                        i7 = 0;
                    }
                    i6 = 2;
                } else {
                    z = z2;
                    i5 = 4;
                    i6 = 1;
                    i7 = 5;
                }
                if (!z) {
                    i6 += encode(iArr[i10], i9, charSequence);
                }
                if (i6 < i11) {
                    i11 = i6;
                    i12 = i7;
                }
                if (i == iArr[(i10 + 1) % 2]) {
                    int encode = !z ? encode(i, i9, charSequence) + 2 : 2;
                    if (encode < i11) {
                        i11 = encode;
                        i12 = i5;
                    }
                }
            } else {
                z = z2;
            }
            i10++;
            z2 = z;
        }
        if (canEncode(3, i2, charSequence)) {
            if (i != 3) {
                i4 = 3;
                i3 = 2;
            } else {
                i3 = 1;
                i4 = 5;
            }
            int i15 = i2 + (charSequence.charAt(i2) == 241 ? 1 : 2);
            if (i15 < charSequence.length()) {
                i3 += encode(3, i15, charSequence);
            }
            if (i3 < i11) {
                i11 = i3;
                i12 = i4;
            }
        }
        if (i11 == Integer.MAX_VALUE) {
            a$$ExternalSyntheticBUOutline0.m(charSequence.charAt(i2), "Bad character in input: ASCII value=");
            return 0;
        }
        ((int[][]) this.text)[CameraSelector$$ExternalSyntheticOutline0.ordinal(i)][i2] = i11;
        ((int[][]) this.resultMetadata)[CameraSelector$$ExternalSyntheticOutline0.ordinal(i)][i2] = i12;
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.squareup.cash.family.familyhub.backend.api.DependentControlStatusRequestHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getDependentControlStatus(boolean z, ContinuationImpl continuationImpl) {
        DependentPromotionsControlStatusRequestHandler$getDependentControlStatus$1 dependentPromotionsControlStatusRequestHandler$getDependentControlStatus$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof DependentPromotionsControlStatusRequestHandler$getDependentControlStatus$1) {
            dependentPromotionsControlStatusRequestHandler$getDependentControlStatus$1 = (DependentPromotionsControlStatusRequestHandler$getDependentControlStatus$1) continuationImpl;
            int i2 = dependentPromotionsControlStatusRequestHandler$getDependentControlStatus$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                dependentPromotionsControlStatusRequestHandler$getDependentControlStatus$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = dependentPromotionsControlStatusRequestHandler$getDependentControlStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dependentPromotionsControlStatusRequestHandler$getDependentControlStatus$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    IncentivesClientService incentivesClientService = (IncentivesClientService) this.resultMetadata;
                    GetPromotionControlsRequest getPromotionControlsRequest = new GetPromotionControlsRequest((String) this.text, ByteString.EMPTY);
                    dependentPromotionsControlStatusRequestHandler$getDependentControlStatus$1.label = 1;
                    obj = incentivesClientService.getPromotionControls(getPromotionControlsRequest, dependentPromotionsControlStatusRequestHandler$getDependentControlStatus$1);
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
                if (apiResult instanceof ApiResult.Success) {
                    if (apiResult instanceof ApiResult.Failure) {
                        return null;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                GetPromotionControlsResponse getPromotionControlsResponse = (GetPromotionControlsResponse) ((ApiResult.Success) apiResult).response;
                PromotionControls promotionControls = getPromotionControlsResponse.controls;
                String str = promotionControls != null ? promotionControls.client_route_for_enablement : null;
                boolean areEqual = promotionControls != null ? Intrinsics.areEqual(promotionControls.enabled, Boolean.TRUE) : false;
                PromotionControls promotionControls2 = getPromotionControlsResponse.controls;
                return new DependentControlStatus.Loaded.LoadedPromotionControl(str, areEqual, promotionControls2 != null ? Intrinsics.areEqual(promotionControls2.show_toggle, Boolean.TRUE) : false);
            }
        }
        dependentPromotionsControlStatusRequestHandler$getDependentControlStatus$1 = new DependentPromotionsControlStatusRequestHandler$getDependentControlStatus$1(this, continuationImpl);
        Object obj2 = dependentPromotionsControlStatusRequestHandler$getDependentControlStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dependentPromotionsControlStatusRequestHandler$getDependentControlStatus$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public ErrorReporter getErrorReporter() {
        return (ErrorReporter) this.text;
    }

    @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
    public View getInfoContents(Marker marker) {
        Function3 function3;
        MapView mapView = (MapView) this.text;
        MarkerNode markerNode = (MarkerNode) ((xg$$ExternalSyntheticLambda9) this.resultMetadata).invoke(marker);
        if (markerNode == null || (function3 = markerNode.infoContent) == null) {
            return null;
        }
        Context context = mapView.getContext();
        context.getClass();
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(new ComposableLambdaImpl(new ComposeInfoWindowAdapter$$ExternalSyntheticLambda0(function3, marker, 0), true, 1508359207));
        MapComposeViewRenderKt.renderComposeViewOnce$default(mapView, composeView, markerNode.compositionContext);
        return composeView;
    }

    @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
    public View getInfoWindow(Marker marker) {
        Function3 function3;
        MapView mapView = (MapView) this.text;
        MarkerNode markerNode = (MarkerNode) ((xg$$ExternalSyntheticLambda9) this.resultMetadata).invoke(marker);
        if (markerNode == null || (function3 = markerNode.infoWindow) == null) {
            return null;
        }
        Context context = mapView.getContext();
        context.getClass();
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(new ComposableLambdaImpl(new ComposeInfoWindowAdapter$$ExternalSyntheticLambda0(function3, marker, 1), true, -742372995));
        MapComposeViewRenderKt.renderComposeViewOnce$default(mapView, composeView, markerNode.compositionContext);
        return composeView;
    }

    public byte[] getKemBytes() {
        return ((Bytes) this.text).toByteArray();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0022, code lost:
    
        if (r6.equals("HmacSha512") == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] getKemId() {
        byte[] bArr;
        char c = 2;
        switch (this.$r8$classId) {
            case 10:
                int ordinal = ((EllipticCurves$CurveType) this.text).ordinal();
                if (ordinal == 0) {
                    return HpkeUtil.P256_HKDF_SHA256_KEM_ID;
                }
                if (ordinal == 1) {
                    return HpkeUtil.P384_HKDF_SHA384_KEM_ID;
                }
                if (ordinal == 2) {
                    return HpkeUtil.P521_HKDF_SHA512_KEM_ID;
                }
                a$$ExternalSyntheticBUOutline0.m$6("Could not determine HPKE KEM ID");
                return null;
            default:
                String str = (String) ((HkdfHpkeKdf) this.text).macAlgorithm;
                switch (str.hashCode()) {
                    case 984523022:
                        if (str.equals("HmacSha256")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 984524074:
                        if (str.equals("HmacSha384")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 984525777:
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        bArr = HpkeUtil.HKDF_SHA256_KDF_ID;
                        break;
                    case 1:
                        bArr = HpkeUtil.HKDF_SHA384_KDF_ID;
                        break;
                    case 2:
                        bArr = HpkeUtil.HKDF_SHA512_KDF_ID;
                        break;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$6("Could not determine HPKE KDF ID");
                        return null;
                }
                if (Arrays.equals(bArr, HpkeUtil.HKDF_SHA256_KDF_ID)) {
                    return HpkeUtil.X25519_HKDF_SHA256_KEM_ID;
                }
                a$$ExternalSyntheticBUOutline0.m$6("Could not determine HPKE KEM ID");
                return null;
        }
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public SampleStrategy getOneErrorPerAppSessionStrategy() {
        return (SampleStrategy) this.resultMetadata;
    }

    public byte[] getSymmetricKey() {
        return ((Bytes) this.resultMetadata).toByteArray();
    }

    @Override // com.squareup.cash.bitcoin.presenters.applet.widget.BitcoinHomeWidgetPresenter
    public BitcoinHomeWidgetViewModel models(BetterNavigator.ScreenNavigator screenNavigator, Flow flow, GapComposer gapComposer, int i) {
        switch (this.$r8$classId) {
            case 19:
                gapComposer.startReplaceGroup(57575023);
                Updater.LaunchedEffect(gapComposer, flow, new BenefitsHubPresenter$models$1$1(flow, (Continuation) null, screenNavigator, this, 25));
                AndroidStringManager androidStringManager = (AndroidStringManager) this.text;
                DependentBitcoinDisabledViewModel dependentBitcoinDisabledViewModel = new DependentBitcoinDisabledViewModel(androidStringManager.get(R.string.bitcoin_disabled_state_title), androidStringManager.get(R.string.bitcoin_disabled_state_cta));
                gapComposer.end(false);
                return dependentBitcoinDisabledViewModel;
            default:
                gapComposer.startReplaceGroup(-1824844177);
                Object rememberedValue = gapComposer.rememberedValue();
                Object obj = Composer.Companion.Empty;
                if (rememberedValue == obj) {
                    rememberedValue = new BitcoinDepositsPresenter$special$$inlined$filter$1(flow, 24);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Flow flow2 = (Flow) rememberedValue;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == obj) {
                    rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                MutableState mutableState = (MutableState) rememberedValue2;
                Boolean bool = (Boolean) mutableState.getValue();
                bool.booleanValue();
                boolean changedInstance = gapComposer.changedInstance(this);
                Object rememberedValue3 = gapComposer.rememberedValue();
                Continuation continuation = null;
                if (changedInstance || rememberedValue3 == obj) {
                    rememberedValue3 = new MLKitTitleGenerator$prepareModel$1(this, continuation, 25);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                MutableState produceState = Updater.produceState(null, bool, (Function2) rememberedValue3, gapComposer, 6);
                BitcoinStoriesWidgetViewModel.Loading loading = new BitcoinStoriesWidgetViewModel.Loading();
                GetStoriesResult getStoriesResult = (GetStoriesResult) produceState.getValue();
                boolean changed = gapComposer.changed(produceState);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (changed || rememberedValue4 == obj) {
                    rememberedValue4 = new TabContentPresenter$models$4$1$1$1(produceState, continuation, 7);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                MutableState produceState2 = Updater.produceState(loading, getStoriesResult, (Function2) rememberedValue4, gapComposer, 0);
                Updater.LaunchedEffect(gapComposer, flow2, new NetworkFetcher$doFetch$fetchResult$1(flow2, (Continuation) null, this, screenNavigator, produceState2, mutableState, 24));
                BitcoinStoriesWidgetViewModel bitcoinStoriesWidgetViewModel = (BitcoinStoriesWidgetViewModel) produceState2.getValue();
                gapComposer.end(false);
                return bitcoinStoriesWidgetViewModel;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        zzt zztVar = (zzt) this.text;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.resultMetadata;
        synchronized (zztVar.zzg) {
            zztVar.zzf.remove(taskCompletionSource);
        }
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public void onFailure(Throwable th) {
        ((zbc) this.resultMetadata).zzc((zzatp) this.text);
    }

    @Override // com.squareup.cardcustomizations.stampview.StampMovingListener
    public void onStampMovedOffCard() {
        ((MutableState) this.resultMetadata).setValue(Boolean.FALSE);
    }

    @Override // com.squareup.cardcustomizations.stampview.StampMovingListener
    public void onStampMovedOntoCard() {
        ((MutableState) this.resultMetadata).setValue(Boolean.TRUE);
    }

    @Override // com.squareup.cardcustomizations.stampview.StampMovingListener
    public void onStampStartMoving() {
        ((MutableState) this.text).setValue(Boolean.TRUE);
    }

    @Override // com.squareup.cardcustomizations.stampview.StampMovingListener
    public void onStampStopMoving() {
        ((MutableState) this.text).setValue(Boolean.FALSE);
        ((MutableState) this.resultMetadata).setValue(Boolean.TRUE);
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public void onSuccess(Object obj) {
        zzatp zzatpVar = (zzatp) this.text;
        String str = (String) obj;
        if (!str.isEmpty()) {
            zzbnn zzc = zzbno.zzc();
            zzc.zzy();
            ((zzbno) zzc.zza).zze(str);
            zzatpVar.zzy();
            ((zzatw) zzatpVar.zza).zzm((zzbno) zzc.zzD());
        }
        ((zbc) this.resultMetadata).zzc(zzatpVar);
    }

    public void putMetadata(ResultMetadataType resultMetadataType, Object obj) {
        if (((EnumMap) this.resultMetadata) == null) {
            this.resultMetadata = new EnumMap(ResultMetadataType.class);
        }
        ((EnumMap) this.resultMetadata).put((EnumMap) resultMetadataType, (ResultMetadataType) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sign(InitiateBitcoinWithdrawal$Request initiateBitcoinWithdrawal$Request, ContinuationImpl continuationImpl) {
        BitcoinWithdrawalRequestSigner$sign$1 bitcoinWithdrawalRequestSigner$sign$1;
        int i;
        BackPressHandlerKt backPressHandlerKt;
        byte[] bArr;
        if (continuationImpl instanceof BitcoinWithdrawalRequestSigner$sign$1) {
            bitcoinWithdrawalRequestSigner$sign$1 = (BitcoinWithdrawalRequestSigner$sign$1) continuationImpl;
            int i2 = bitcoinWithdrawalRequestSigner$sign$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                bitcoinWithdrawalRequestSigner$sign$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = bitcoinWithdrawalRequestSigner$sign$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bitcoinWithdrawalRequestSigner$sign$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) this.resultMetadata)).peekCurrentValue(LaunchDarklyFeatureFlags$SignInitiateBitcoinWithdrawalRequest.INSTANCE)).enabled()) {
                        LogAndroidKt logAndroidKt = initiateBitcoinWithdrawal$Request.withdrawalType;
                        if (logAndroidKt instanceof InitiateBitcoinWithdrawal$Request$WithdrawalType$WithdrawalDestination) {
                            backPressHandlerKt = new WithdrawalDetails$WithdrawalType$WithdrawalDestination(((InitiateBitcoinWithdrawal$Request$WithdrawalType$WithdrawalDestination) logAndroidKt).value);
                        } else if (logAndroidKt instanceof InitiateBitcoinWithdrawal$Request$WithdrawalType$DisplayId) {
                            backPressHandlerKt = new WithdrawalDetails$WithdrawalType$DisplayId(((InitiateBitcoinWithdrawal$Request$WithdrawalType$DisplayId) logAndroidKt).value);
                        } else if (logAndroidKt instanceof InitiateBitcoinWithdrawal$Request$WithdrawalType$SendBitcoinToken) {
                            backPressHandlerKt = new WithdrawalDetails$WithdrawalType$SendBitcoinToken(((InitiateBitcoinWithdrawal$Request$WithdrawalType$SendBitcoinToken) logAndroidKt).value);
                        } else {
                            if (logAndroidKt != null) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            backPressHandlerKt = null;
                        }
                        WithdrawalDetails withdrawalDetails = new WithdrawalDetails(backPressHandlerKt, initiateBitcoinWithdrawal$Request.customer_supplied_amount, null, ByteString.EMPTY);
                        BinaryBitmap binaryBitmap = (BinaryBitmap) this.text;
                        byte[] encode = withdrawalDetails.encode();
                        bitcoinWithdrawalRequestSigner$sign$1.label = 1;
                        obj = binaryBitmap.sign(encode, bitcoinWithdrawalRequestSigner$sign$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                bArr = (byte[]) obj;
                if (bArr != null) {
                    ByteString.Companion companion = ByteString.Companion;
                    return ByteString.Companion.of$default(bArr).base64();
                }
                return null;
            }
        }
        bitcoinWithdrawalRequestSigner$sign$1 = new BitcoinWithdrawalRequestSigner$sign$1(this, continuationImpl);
        Object obj3 = bitcoinWithdrawalRequestSigner$sign$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bitcoinWithdrawalRequestSigner$sign$1.label;
        if (i != 0) {
        }
        bArr = (byte[]) obj3;
        if (bArr != null) {
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        SubtreeManager subtreeManager = (SubtreeManager) this.text;
        com.google.android.libraries.places.api.net.zzt zztVar = (com.google.android.libraries.places.api.net.zzt) this.resultMetadata;
        zzbhx zzbhxVar = (zzbhx) obj;
        subtreeManager.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        List zza = zzbhxVar.zza();
        zzbkb<zzbhd> zzc = zzbhxVar.zzc();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String zzd = zzbhxVar.zzd();
        Iterator it = zza.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzjm) subtreeManager.interceptor).zza((zzbgj) it.next()));
        }
        for (zzbhd zzbhdVar : zzc) {
            ArrayList arrayList3 = new ArrayList();
            for (zzbhc zzbhcVar : zzbhdVar.zza()) {
                arrayList3.add(new zzeo(Duration.ofSeconds(zzbhcVar.zza().zzc(), r12.zze()), zzbhcVar.zzc()));
                arrayList = arrayList;
            }
            ArrayList arrayList4 = arrayList;
            String zzc2 = zzbhdVar.zzc();
            Uri parse = !zzc2.isEmpty() ? Uri.parse(zzc2) : null;
            ImmutableList copyOf = ImmutableList.copyOf((Collection) arrayList3);
            if (copyOf == null) {
                a$$ExternalSyntheticBUOutline0.m$2("Null legs");
                return null;
            }
            arrayList2.add(new zzgc(parse, copyOf));
            arrayList = arrayList4;
        }
        String zze = zzbhxVar.zze();
        zzu zzuVar = new zzu();
        zzuVar.zza = arrayList;
        zzuVar.zze = 1;
        zzuVar.zzg = (byte) 1;
        zzuVar.zzb = null;
        if (true == zzd.isEmpty()) {
            zzd = null;
        }
        zzuVar.zzd = zzd;
        zzuVar.zze = zztVar.zzu;
        zzuVar.zzg = (byte) 1;
        zzuVar.zzf = zze.isEmpty() ? null : Uri.parse(zze);
        taskCompletionSource.setResult(zzuVar.build());
        return taskCompletionSource.zza;
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 0:
                return (String) this.text;
            case 9:
                return ((AsyncCallable) this.resultMetadata).toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.squareup.cash.family.familyhub.backend.api.DependentControlStatusRequestHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object toggleDependentControl(boolean z, ContinuationImpl continuationImpl) {
        DependentPromotionsControlStatusRequestHandler$toggleDependentControl$1 dependentPromotionsControlStatusRequestHandler$toggleDependentControl$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof DependentPromotionsControlStatusRequestHandler$toggleDependentControl$1) {
            dependentPromotionsControlStatusRequestHandler$toggleDependentControl$1 = (DependentPromotionsControlStatusRequestHandler$toggleDependentControl$1) continuationImpl;
            int i2 = dependentPromotionsControlStatusRequestHandler$toggleDependentControl$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                dependentPromotionsControlStatusRequestHandler$toggleDependentControl$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = dependentPromotionsControlStatusRequestHandler$toggleDependentControl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dependentPromotionsControlStatusRequestHandler$toggleDependentControl$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    IncentivesClientService incentivesClientService = (IncentivesClientService) this.resultMetadata;
                    SetPromotionControlsRequest setPromotionControlsRequest = new SetPromotionControlsRequest((String) this.text, Boolean.valueOf(z), ByteString.EMPTY);
                    dependentPromotionsControlStatusRequestHandler$toggleDependentControl$1.label = 1;
                    obj = incentivesClientService.setPromotionControls(setPromotionControlsRequest, dependentPromotionsControlStatusRequestHandler$toggleDependentControl$1);
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
                if (apiResult instanceof ApiResult.Success) {
                    if (apiResult instanceof ApiResult.Failure) {
                        return null;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                SetPromotionControlsResponse setPromotionControlsResponse = (SetPromotionControlsResponse) ((ApiResult.Success) apiResult).response;
                PromotionControls promotionControls = setPromotionControlsResponse.controls;
                String str = promotionControls != null ? promotionControls.client_route_for_enablement : null;
                boolean areEqual = promotionControls != null ? Intrinsics.areEqual(promotionControls.enabled, Boolean.TRUE) : false;
                PromotionControls promotionControls2 = setPromotionControlsResponse.controls;
                return new DependentControlStatus.Loaded.LoadedPromotionControl(str, areEqual, promotionControls2 != null ? Intrinsics.areEqual(promotionControls2.show_toggle, Boolean.TRUE) : false);
            }
        }
        dependentPromotionsControlStatusRequestHandler$toggleDependentControl$1 = new DependentPromotionsControlStatusRequestHandler$toggleDependentControl$1(this, continuationImpl);
        Object obj2 = dependentPromotionsControlStatusRequestHandler$toggleDependentControl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dependentPromotionsControlStatusRequestHandler$toggleDependentControl$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object verify(ArrayList arrayList, ClientScenario clientScenario, String str, ContinuationImpl continuationImpl) {
        RealContactVerifier$verify$1 realContactVerifier$verify$1;
        int i;
        ApiResult apiResult;
        ContactVerifier$Result.NotSuccessful.Status status;
        if (continuationImpl instanceof RealContactVerifier$verify$1) {
            realContactVerifier$verify$1 = (RealContactVerifier$verify$1) continuationImpl;
            int i2 = realContactVerifier$verify$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realContactVerifier$verify$1.label = i2 - PKIFailureInfo.systemUnavail;
                RealContactVerifier$verify$1 realContactVerifier$verify$12 = realContactVerifier$verify$1;
                Object obj = realContactVerifier$verify$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realContactVerifier$verify$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    VerifyContactsRequest verifyContactsRequest = new VerifyContactsRequest(null, arrayList, ByteString.EMPTY);
                    Signal signal = (Signal) this.resultMetadata;
                    DataStoreImpl$readDataOrHandleCorruption$3 dataStoreImpl$readDataOrHandleCorruption$3 = new DataStoreImpl$readDataOrHandleCorruption$3(this, clientScenario, str, verifyContactsRequest, null, 11);
                    realContactVerifier$verify$12.label = 1;
                    obj = StateFlowKt.until(signal, dataStoreImpl$readDataOrHandleCorruption$3, realContactVerifier$verify$12);
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
                if (apiResult instanceof ApiResult.Success) {
                    if (apiResult instanceof ApiResult.Failure) {
                        return new ContactVerifier$Result.NetworkFailure((ApiResult.Failure) apiResult);
                    }
                    return null;
                }
                VerifyContactsResponse verifyContactsResponse = (VerifyContactsResponse) ((ApiResult.Success) apiResult).response;
                VerifyContactsResponse.Status status2 = verifyContactsResponse.status;
                if (status2 == VerifyContactsResponse.Status.SUCCESS) {
                    ResponseContext responseContext = verifyContactsResponse.response_context;
                    responseContext.getClass();
                    return new ContactVerifier$Result.Successful(responseContext);
                }
                int i3 = status2 == null ? -1 : RealContactVerifierKt$WhenMappings.$EnumSwitchMapping$0[status2.ordinal()];
                if (i3 == -1 || i3 == 1) {
                    OptionalProvider$$ExternalSyntheticLambda0.m((Object) status2, "Unsupported VerifyContactsResponse.Status ");
                    return null;
                }
                if (i3 == 2) {
                    Path$$ExternalSyntheticBUOutline0.m();
                    return null;
                }
                if (i3 == 3) {
                    status = ContactVerifier$Result.NotSuccessful.Status.FAILURE;
                } else if (i3 == 4) {
                    status = ContactVerifier$Result.NotSuccessful.Status.TOO_MANY_ATTEMPTS;
                } else {
                    if (i3 != 5) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    status = ContactVerifier$Result.NotSuccessful.Status.CONCURRENT_MODIFICATION;
                }
                ResponseContext responseContext2 = verifyContactsResponse.response_context;
                responseContext2.getClass();
                return new ContactVerifier$Result.NotSuccessful(responseContext2, status);
            }
        }
        realContactVerifier$verify$1 = new RealContactVerifier$verify$1(this, continuationImpl);
        RealContactVerifier$verify$1 realContactVerifier$verify$122 = realContactVerifier$verify$1;
        Object obj2 = realContactVerifier$verify$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realContactVerifier$verify$122.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    public void withProperty(Annotation annotation) {
        if (((HashMap) this.resultMetadata) == null) {
            this.resultMetadata = new HashMap();
        }
        ((HashMap) this.resultMetadata).put(annotation.annotationType(), annotation);
    }

    @Override // com.google.android.play.core.appupdate.internal.zzaf
    public Object zza() {
        return new zzr(((zzi) ((com.google.mlkit.vision.text.internal.zzr) this.text).zza).zza, (com.google.android.play.core.appupdate.zzt) ((zzaf) this.resultMetadata).zza());
    }

    public /* synthetic */ Result(int i, boolean z) {
        this.$r8$classId = i;
    }

    public /* synthetic */ Result(Object obj, Object obj2, boolean z, int i) {
        this.$r8$classId = i;
        this.resultMetadata = obj;
        this.text = obj2;
    }

    public Result(AndroidClock androidClock) {
        this.$r8$classId = 21;
        this.text = androidClock;
    }

    public Result(IncentivesClientService incentivesClientService, String str) {
        this.$r8$classId = 29;
        str.getClass();
        this.resultMetadata = incentivesClientService;
        this.text = str;
    }

    public Result(CashAccountDatabaseImpl cashAccountDatabaseImpl) {
        this.$r8$classId = 28;
        this.text = cashAccountDatabaseImpl.storyQueries;
        this.resultMetadata = cashAccountDatabaseImpl.sceneDataQueries;
    }

    public Result(MapView mapView, xg$$ExternalSyntheticLambda9 xg__externalsyntheticlambda9) {
        this.$r8$classId = 14;
        mapView.getClass();
        this.text = mapView;
        this.resultMetadata = xg__externalsyntheticlambda9;
    }

    public Result(byte[] bArr, byte[] bArr2) {
        this.$r8$classId = 12;
        this.text = Bytes.copyFrom(bArr);
        this.resultMetadata = Bytes.copyFrom(bArr2);
    }

    public Result(String str, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 13:
                this.resultMetadata = null;
                this.text = str;
                break;
            default:
                System.currentTimeMillis();
                this.text = str;
                this.resultMetadata = null;
                break;
        }
    }

    public Result(HkdfHpkeKdf hkdfHpkeKdf) {
        X25519 zzbVar;
        Provider providerOrNull;
        this.$r8$classId = 11;
        this.text = hkdfHpkeKdf;
        try {
            providerOrNull = ConscryptUtil.providerOrNull();
        } catch (GeneralSecurityException unused) {
            zzbVar = new zzb(9);
        }
        if (providerOrNull != null) {
            KeyFactory.getInstance("XDH", providerOrNull);
            KeyAgreement.getInstance("XDH", providerOrNull);
            zzbVar = new HkdfHpkeKdf(providerOrNull);
            zzbVar.generateKeyPair();
            this.resultMetadata = zzbVar;
            return;
        }
        throw new GeneralSecurityException("Conscrypt is not available.");
    }

    public Result(LinkedHashSet linkedHashSet) {
        this.$r8$classId = 17;
        this.text = linkedHashSet;
        this.resultMetadata = new MutexImpl();
    }

    public /* synthetic */ Result(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.text = obj;
        this.resultMetadata = obj2;
    }
}
