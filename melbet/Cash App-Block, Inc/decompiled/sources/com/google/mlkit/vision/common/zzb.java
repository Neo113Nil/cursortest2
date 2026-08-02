package com.google.mlkit.vision.common;

import android.animation.AnimatorSet;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.saveable.SaveableHolder;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.core.os.BundleKt;
import androidx.core.view.WindowInsetsCompat;
import androidx.media3.extractor.mkv.Sniffer;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.Response;
import com.google.android.filament.Viewport;
import com.google.android.gms.maps.zzah;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.CancelableFontCallback;
import com.google.android.material.shape.AdjustedCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RelativeCornerSize;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.play.core.appupdate.internal.zzad;
import com.google.android.play.core.appupdate.zzd;
import com.google.android.play.core.appupdate.zzi;
import com.google.crypto.tink.subtle.EngineFactory;
import com.google.crypto.tink.subtle.EngineWrapper;
import com.google.mlkit.vision.text.internal.zzr;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.BitSource;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.qrcode.decoder.DataBlock;
import com.google.zxing.qrcode.decoder.DataMask$EnumUnboxingLocalUtility;
import com.google.zxing.qrcode.decoder.DecodedBitStreamParser;
import com.google.zxing.qrcode.decoder.FormatInformation;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;
import com.nimbusds.jose.CommonSEHeader;
import com.nimbusds.jose.jca.JCAContext;
import com.robinhood.spark.SparkView;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.presenters.ActivityItemEventDecorator;
import com.squareup.cash.activity.presenters.ActivityItemEventHandler;
import com.squareup.cash.activity.viewmodels.ActivityItemViewEvent;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.biometrics.CashBiometricsInfo;
import com.squareup.cash.blockers.presenters.PasscodeGatedEndpoint;
import com.squareup.cash.blockers.presenters.PasscodeGatedEndpoint$Request$Fingerprint;
import com.squareup.cash.blockers.presenters.PasscodeGatedEndpoint$Request$Passcode;
import com.squareup.cash.blockers.presenters.UnlockAppEndpoint$WhenMappings;
import com.squareup.cash.blockers.presenters.UnlockAppEndpoint$call$1;
import com.squareup.cash.blockers.viewmodels.PasscodeViewModel;
import com.squareup.cash.card.onboarding.graphics.FlowsKt;
import com.squareup.cash.card.onboarding.graphics.FresnelPBRMaterial;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScaffoldState;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarState;
import com.squareup.cash.deposits.physical.backend.api.retailer.RetailerLocationResult;
import com.squareup.cash.deposits.physical.backend.real.retailer.RealRetailerLocationManager$getRetailers$1;
import com.squareup.cash.education.stories.db.StoryQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.gps.backend.real.AndroidLocationProvider$currentLocation$2$1;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.graphics.swampgl.components.Material;
import com.squareup.cash.graphics.swampgl.components.MaterialInput;
import com.squareup.cash.graphics.swampgl.components.MaterialPlugin;
import com.squareup.cash.graphics.swampgl.components.RealUniformBinder;
import com.squareup.cash.graphics.views.GLSceneScopeProvider$SceneScope$2$1$1;
import com.squareup.cash.localization.PoolsAsset;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.moneybot.backend.api.model.chat.Widget;
import com.squareup.cash.overlays.FakeOverlayLayerKt;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.portfolio.graphs.views.InvestingGraphAdapter;
import com.squareup.cash.portfolio.graphs.views.InvestingGraphPathType;
import com.squareup.cash.portfolio.graphs.views.MooncakeInvestingGraphView;
import com.squareup.cash.portfolio.graphs.views.NormalGray;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.scrubbing.CurrencyConfig;
import com.squareup.cash.scrubbing.OffsetMappingStrategy;
import com.squareup.cash.video.views.ExoPlayerVideoViewListener;
import com.squareup.protos.cash.janus.api.PasscodeService;
import com.squareup.protos.cash.papermate.app.GetRetailerLocationsRequest;
import com.squareup.protos.cash.papermate.app.GetRetailerLocationsResponse;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.VerifyPasscodeRequest;
import com.squareup.protos.franklin.app.VerifyPasscodeResponse;
import com.squareup.scannerview.SizeMap;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.papermate.app.PapermateClientService;

/* loaded from: classes4.dex */
public final class zzb implements ViewUtils.OnApplyWindowInsetsListener, ChipGroup.OnCheckedStateChangeListener, ExtendedFloatingActionButton.Size, CancelableFontCallback.ApplyFont, EngineFactory.Policy, ExoPlayerVideoViewListener, PasscodeGatedEndpoint, MaterialPlugin, Saver, ActivityItemEventDecorator, OnSuccessListener, Grouping, SparkView.OnScrubListener, OffsetMappingStrategy {
    public Object zza;

    public /* synthetic */ zzb(zzi zziVar) {
        zzr zzrVar = new zzr(zziVar, 8);
        int i = 29;
        this.zza = zzad.zzb(new JCAContext(zzad.zzb(new zzah(i, zzad.zzb(new Result(7, zzrVar, zzad.zzb(new zzd(zzrVar, 1)))), zzad.zzb(new zzd(zzrVar, 0)), zzrVar)), 4));
    }

    public CornerSize apply(CornerSize cornerSize) {
        return cornerSize instanceof RelativeCornerSize ? cornerSize : new AdjustedCornerSize(-((MaterialShapeDrawable) this.zza).getStrokeInsetLength(), cornerSize);
    }

    @Override // com.squareup.cash.graphics.swampgl.components.MaterialPlugin
    public void bindCustomUniforms(RealUniformBinder realUniformBinder) {
        Object obj;
        int i = 0;
        while (true) {
            FresnelPBRMaterial fresnelPBRMaterial = (FresnelPBRMaterial) this.zza;
            if (i >= 4) {
                realUniformBinder.setFloat("uFresnelExp", fresnelPBRMaterial.fresnelExponent);
                realUniformBinder.setFloat("uFresnelStrength", ((FresnelPBRMaterial) this.zza).strength);
                realUniformBinder.setFloat("uNoiseScale", ((FresnelPBRMaterial) this.zza).noiseScale);
                realUniformBinder.setFloat("uNoiseStrength", ((FresnelPBRMaterial) this.zza).noiseStrength);
                ((FresnelPBRMaterial) this.zza).bindWandLightingUniforms(realUniformBinder);
                return;
            }
            List list = fresnelPBRMaterial.rampStops;
            FresnelPBRMaterial fresnelPBRMaterial2 = (FresnelPBRMaterial) this.zza;
            if (i < 0 || i >= list.size()) {
                obj = (Pair) CollectionsKt.lastOrNull(fresnelPBRMaterial2.rampStops);
                if (obj == null) {
                    obj = FresnelPBRMaterial.DEFAULT_STOP;
                }
            } else {
                obj = list.get(i);
            }
            Pair pair = (Pair) obj;
            float floatValue = ((Number) pair.first).floatValue();
            float[] fArr = (float[]) pair.second;
            realUniformBinder.setFloat("uP" + i, floatValue);
            realUniformBinder.setFloat3("uC" + i, fArr[0], fArr[1], fArr[2]);
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.squareup.cash.blockers.presenters.PasscodeGatedEndpoint
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object call(PasscodeService passcodeService, AppService appService, FakeOverlayLayerKt fakeOverlayLayerKt, ContinuationImpl continuationImpl) {
        UnlockAppEndpoint$call$1 unlockAppEndpoint$call$1;
        int i;
        VerifyPasscodeRequest copy$default;
        ApiResult apiResult;
        if (continuationImpl instanceof UnlockAppEndpoint$call$1) {
            unlockAppEndpoint$call$1 = (UnlockAppEndpoint$call$1) continuationImpl;
            int i2 = unlockAppEndpoint$call$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                unlockAppEndpoint$call$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = unlockAppEndpoint$call$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = unlockAppEndpoint$call$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    VerifyPasscodeRequest verifyPasscodeRequest = new VerifyPasscodeRequest(fakeOverlayLayerKt.getRequestContext(), (String) null, (String) null, 14);
                    if (fakeOverlayLayerKt instanceof PasscodeGatedEndpoint$Request$Fingerprint) {
                        copy$default = VerifyPasscodeRequest.copy$default(verifyPasscodeRequest, null, null, ((PasscodeGatedEndpoint$Request$Fingerprint) fakeOverlayLayerKt).token, 11);
                    } else {
                        if (!(fakeOverlayLayerKt instanceof PasscodeGatedEndpoint$Request$Passcode)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        copy$default = VerifyPasscodeRequest.copy$default(verifyPasscodeRequest, null, ((PasscodeGatedEndpoint$Request$Passcode) fakeOverlayLayerKt).passcode, null, 13);
                    }
                    unlockAppEndpoint$call$1.label = 1;
                    obj = passcodeService.unlockApp(copy$default, unlockAppEndpoint$call$1);
                    if (obj == obj2) {
                        return obj2;
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
                        return new PasscodeGatedEndpoint.Response.Failure((ApiResult.Failure) apiResult);
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                VerifyPasscodeResponse verifyPasscodeResponse = (VerifyPasscodeResponse) ((ApiResult.Success) apiResult).response;
                VerifyPasscodeResponse.Status status = verifyPasscodeResponse.status;
                int i3 = status == null ? -1 : UnlockAppEndpoint$WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
                return i3 != 1 ? i3 != 2 ? i3 != 3 ? new PasscodeGatedEndpoint.Response.ServiceLevelError(verifyPasscodeResponse.response_context) : new PasscodeGatedEndpoint.Response.TooManyAttempts(verifyPasscodeResponse.response_context) : PasscodeGatedEndpoint.Response.InvalidPasscodeOrToken.INSTANCE : new PasscodeGatedEndpoint.Response.Success(verifyPasscodeResponse.passcode_token, verifyPasscodeResponse.response_context);
            }
        }
        unlockAppEndpoint$call$1 = new UnlockAppEndpoint$call$1(this, continuationImpl);
        Object obj3 = unlockAppEndpoint$call$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = unlockAppEndpoint$call$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj3;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    @Override // com.squareup.cash.scrubbing.OffsetMappingStrategy
    public OffsetMapping createOffsetMapping(String str, ArrayList arrayList) {
        str.getClass();
        return new EglCore(29, arrayList, this, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:234:0x0345, code lost:
    
        throw com.google.zxing.FormatException.getFormatInstance();
     */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03b7 A[LOOP:21: B:146:0x022f->B:175:0x03b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x036c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DecoderResult decode(Response response) {
        int readBits;
        Mode mode;
        int i;
        int i2;
        String str;
        int readBits2;
        Version readVersion = response.readVersion();
        int i3 = response.readFormatInformation().errorCorrectionLevel;
        FormatInformation readFormatInformation = response.readFormatInformation();
        Version readVersion2 = response.readVersion();
        int i4 = CameraSelector$$ExternalSyntheticOutline0.values(8)[readFormatInformation.dataMask];
        BitMatrix bitMatrix = (BitMatrix) response.result;
        int i5 = bitMatrix.height;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            for (int i8 = 0; i8 < i5; i8++) {
                if (DataMask$EnumUnboxingLocalUtility._dispatch_isMasked(i4, i7, i8)) {
                    bitMatrix.flip(i8, i7);
                }
            }
        }
        int i9 = readVersion2.versionNumber * 4;
        int i10 = i9 + 17;
        int i11 = readVersion2.totalCodewords;
        BitMatrix bitMatrix2 = new BitMatrix(i10, i10);
        bitMatrix2.setRegion(0, 0, 9, 9);
        int i12 = i9 + 9;
        bitMatrix2.setRegion(i12, 0, 8, 9);
        bitMatrix2.setRegion(0, i12, 9, 8);
        int[] iArr = readVersion2.alignmentPatternCenters;
        int length = iArr.length;
        int i13 = 0;
        while (i13 < length) {
            int i14 = iArr[i13] - 2;
            for (int i15 = i6; i15 < length; i15++) {
                if ((i13 != 0 || (i15 != 0 && i15 != length - 1)) && (i13 != length - 1 || i15 != 0)) {
                    bitMatrix2.setRegion(iArr[i15] - 2, i14, 5, 5);
                }
            }
            i13++;
            i6 = 0;
        }
        int i16 = 2;
        int i17 = 6;
        int i18 = 1;
        bitMatrix2.setRegion(6, 9, 1, i9);
        bitMatrix2.setRegion(9, 6, i9, 1);
        if (readVersion2.versionNumber > 6) {
            int i19 = i9 + 6;
            bitMatrix2.setRegion(i19, 0, 3, 6);
            bitMatrix2.setRegion(0, i19, 6, 3);
        }
        byte[] bArr = new byte[i11];
        int i20 = i5 - 1;
        int i21 = i20;
        boolean z = true;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        while (i21 > 0) {
            if (i21 == i17) {
                i21--;
            }
            int i25 = 0;
            while (i25 < i5) {
                int i26 = z ? i20 - i25 : i25;
                int i27 = i18;
                int i28 = 0;
                for (int i29 = i16; i28 < i29; i29 = 2) {
                    int i30 = i21 - i28;
                    if (!bitMatrix2.get(i30, i26)) {
                        i23++;
                        i24 <<= 1;
                        if (bitMatrix.get(i30, i26)) {
                            i24 |= 1;
                        }
                        if (i23 == 8) {
                            bArr[i22] = (byte) i24;
                            i22++;
                            i23 = 0;
                            i24 = 0;
                        }
                    }
                    i28++;
                }
                i25++;
                i18 = i27;
                i16 = 2;
            }
            z = !z;
            i21 -= 2;
            i17 = 6;
            i16 = 2;
        }
        int i31 = i18;
        if (i22 != i11) {
            throw FormatException.getFormatInstance();
        }
        if (i11 != readVersion.totalCodewords) {
            Path$$ExternalSyntheticBUOutline0.m$3();
            return null;
        }
        Sniffer sniffer = readVersion.ecBlocks[CameraSelector$$ExternalSyntheticOutline0.ordinal(i3)];
        Viewport[] viewportArr = (Viewport[]) sniffer.scratch;
        int i32 = sniffer.peekLength;
        int i33 = 0;
        for (Viewport viewport : viewportArr) {
            i33 += viewport.width;
        }
        DataBlock[] dataBlockArr = new DataBlock[i33];
        int i34 = 0;
        for (Viewport viewport2 : viewportArr) {
            int i35 = 0;
            while (i35 < viewport2.width) {
                int i36 = viewport2.height;
                dataBlockArr[i34] = new DataBlock(i36, new byte[i32 + i36]);
                i35++;
                i34++;
            }
        }
        int length2 = dataBlockArr[0].codewords.length;
        int i37 = i33 - 1;
        while (i37 >= 0 && dataBlockArr[i37].codewords.length != length2) {
            i37--;
        }
        int i38 = i37 + 1;
        int i39 = length2 - i32;
        int i40 = 0;
        int i41 = 0;
        while (i40 < i39) {
            int i42 = i41;
            int i43 = 0;
            while (i43 < i34) {
                dataBlockArr[i43].codewords[i40] = bArr[i42];
                i43++;
                i42++;
            }
            i40++;
            i41 = i42;
        }
        int i44 = i38;
        while (i44 < i34) {
            dataBlockArr[i44].codewords[i39] = bArr[i41];
            i44++;
            i41++;
        }
        boolean z2 = false;
        int length3 = dataBlockArr[0].codewords.length;
        while (i39 < length3) {
            int i45 = i41;
            int i46 = 0;
            while (i46 < i34) {
                dataBlockArr[i46].codewords[i46 < i38 ? i39 : i39 + 1] = bArr[i45];
                i46++;
                i45++;
            }
            i39++;
            i41 = i45;
        }
        int i47 = 0;
        for (int i48 = 0; i48 < i33; i48++) {
            i47 += dataBlockArr[i48].numDataCodewords;
        }
        byte[] bArr2 = new byte[i47];
        int i49 = 0;
        int i50 = 0;
        int i51 = 0;
        while (i50 < i33) {
            DataBlock dataBlock = dataBlockArr[i50];
            byte[] bArr3 = dataBlock.codewords;
            int i52 = dataBlock.numDataCodewords;
            int length4 = bArr3.length;
            int[] iArr2 = new int[length4];
            for (int i53 = 0; i53 < length4; i53++) {
                iArr2[i53] = bArr3[i53] & 255;
            }
            try {
                int decodeWithECCount = ((SizeMap) this.zza).decodeWithECCount(bArr3.length - i52, iArr2);
                for (int i54 = 0; i54 < i52; i54++) {
                    bArr3[i54] = (byte) iArr2[i54];
                }
                i49 += decodeWithECCount;
                int i55 = i51;
                int i56 = 0;
                while (i56 < i52) {
                    bArr2[i55] = bArr3[i56];
                    i56++;
                    i55++;
                }
                i50++;
                i51 = i55;
            } catch (ReedSolomonException unused) {
                ChecksumException checksumException = ChecksumException.INSTANCE;
                if (ReaderException.isStackTrace) {
                    throw new ChecksumException();
                }
                throw ChecksumException.INSTANCE;
            }
        }
        BitSource bitSource = new BitSource(bArr2);
        StringBuilder sb = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(i31);
        int i57 = -1;
        int i58 = -1;
        boolean z3 = false;
        boolean z4 = false;
        CharacterSetECI characterSetECI = null;
        while (true) {
            try {
                int available = bitSource.available();
                Mode mode2 = Mode.TERMINATOR;
                if (available < 4 || (readBits = bitSource.readBits(4)) == 0) {
                    mode = mode2;
                } else if (readBits == 1) {
                    mode = Mode.NUMERIC;
                } else if (readBits == 2) {
                    mode = Mode.ALPHANUMERIC;
                } else if (readBits == 3) {
                    mode = Mode.STRUCTURED_APPEND;
                } else if (readBits == 4) {
                    mode = Mode.BYTE;
                } else if (readBits == 5) {
                    mode = Mode.FNC1_FIRST_POSITION;
                } else if (readBits == 7) {
                    mode = Mode.ECI;
                } else if (readBits == 8) {
                    mode = Mode.KANJI;
                } else if (readBits == 9) {
                    mode = Mode.FNC1_SECOND_POSITION;
                } else {
                    if (readBits != 13) {
                        throw new IllegalArgumentException();
                    }
                    mode = Mode.HANZI;
                }
                int ordinal = mode.ordinal();
                if (ordinal == 0) {
                    i = i49;
                } else if (ordinal != 3) {
                    if (ordinal == 5) {
                        i = i49;
                        int readBits3 = bitSource.readBits(8);
                        if ((readBits3 & 128) == 0) {
                            readBits2 = readBits3 & 127;
                        } else if ((readBits3 & 192) == 128) {
                            readBits2 = ((readBits3 & 63) << 8) | bitSource.readBits(8);
                        } else {
                            if ((readBits3 & 224) != 192) {
                                throw FormatException.getFormatInstance();
                            }
                            readBits2 = ((readBits3 & 31) << 16) | bitSource.readBits(16);
                        }
                        HashMap hashMap = CharacterSetECI.VALUE_TO_ECI;
                        if (readBits2 < 0 || readBits2 >= 900) {
                            break;
                        }
                        characterSetECI = (CharacterSetECI) CharacterSetECI.VALUE_TO_ECI.get(Integer.valueOf(readBits2));
                        if (characterSetECI == null) {
                            throw FormatException.getFormatInstance();
                        }
                        i2 = i57;
                    } else if (ordinal == 7) {
                        i = i49;
                        i2 = i57;
                        z3 = true;
                        z2 = true;
                    } else if (ordinal == 8) {
                        i = i49;
                        i2 = i57;
                        z3 = true;
                        z4 = true;
                    } else if (ordinal != 9) {
                        int readBits4 = bitSource.readBits(mode.getCharacterCountBits(readVersion));
                        int ordinal2 = mode.ordinal();
                        i = i49;
                        if (ordinal2 == 1) {
                            DecodedBitStreamParser.decodeNumericSegment(bitSource, sb, readBits4);
                        } else if (ordinal2 == 2) {
                            DecodedBitStreamParser.decodeAlphanumericSegment(bitSource, sb, readBits4, z3);
                        } else if (ordinal2 == 4) {
                            DecodedBitStreamParser.decodeByteSegment(bitSource, sb, readBits4, characterSetECI, arrayList);
                        } else {
                            if (ordinal2 != 6) {
                                throw FormatException.getFormatInstance();
                            }
                            DecodedBitStreamParser.decodeKanjiSegment(bitSource, sb, readBits4);
                        }
                    } else {
                        i = i49;
                        int readBits5 = bitSource.readBits(4);
                        int readBits6 = bitSource.readBits(mode.getCharacterCountBits(readVersion));
                        if (readBits5 == 1) {
                            DecodedBitStreamParser.decodeHanziSegment(bitSource, sb, readBits6);
                        }
                    }
                    if (mode == mode2) {
                        int i59 = characterSetECI != null ? z2 ? 4 : z4 ? 6 : 2 : z2 ? 3 : z4 ? 5 : 1;
                        String sb2 = sb.toString();
                        ArrayList arrayList2 = arrayList.isEmpty() ? null : arrayList;
                        if (i3 == 1) {
                            str = "L";
                        } else if (i3 == 2) {
                            str = "M";
                        } else if (i3 == 3) {
                            str = "Q";
                        } else {
                            if (i3 != 4) {
                                throw null;
                            }
                            str = "H";
                        }
                        DecoderResult decoderResult = new DecoderResult(bArr2, sb2, arrayList2, str, i2, i58, i59);
                        decoderResult.errorsCorrected = Integer.valueOf(i);
                        return decoderResult;
                    }
                    i57 = i2;
                    i49 = i;
                } else {
                    i = i49;
                    if (bitSource.available() < 16) {
                        throw FormatException.getFormatInstance();
                    }
                    i57 = bitSource.readBits(8);
                    i58 = bitSource.readBits(8);
                    i2 = i57;
                    if (mode == mode2) {
                    }
                }
                i2 = i57;
                if (mode == mode2) {
                }
            } catch (IllegalArgumentException unused2) {
                throw FormatException.getFormatInstance();
            }
        }
    }

    @Override // com.squareup.cash.activity.presenters.ActivityItemEventDecorator
    public Flow decorate(ActivityItemEventHandler activityItemEventHandler, ActivityItemViewModel activityItemViewModel, ActivityItemViewEvent activityItemViewEvent, ActivityItem activityItem) {
        activityItemEventHandler.getClass();
        return new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(activityItemEventHandler.handleEvent(activityItemViewModel, activityItemViewEvent, activityItem), new GLSceneScopeProvider$SceneScope$2$1$1(activityItem, this, (Continuation) null, 6), 3);
    }

    @Override // com.squareup.cash.graphics.swampgl.components.MaterialPlugin
    public void dispose() {
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
    public int getHeight() {
        return ((ExtendedFloatingActionButton) this.zza).getCollapsedSize();
    }

    @Override // com.google.crypto.tink.subtle.EngineFactory.Policy
    public Object getInstance(String str) {
        return ((EngineWrapper) this.zza).getInstance(str, null);
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
    public ViewGroup.LayoutParams getLayoutParams() {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.zza;
        return new ViewGroup.LayoutParams(extendedFloatingActionButton.getCollapsedSize(), extendedFloatingActionButton.getCollapsedSize());
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
    public int getPaddingEnd() {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.zza;
        return (extendedFloatingActionButton.getCollapsedSize() - extendedFloatingActionButton.iconSize) / 2;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
    public int getPaddingStart() {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.zza;
        return (extendedFloatingActionButton.getCollapsedSize() - extendedFloatingActionButton.iconSize) / 2;
    }

    @Override // com.squareup.cash.graphics.swampgl.components.MaterialPlugin
    public Material.ProgramSource getProgramSource() {
        if (((FresnelPBRMaterial) this.zza).instanced) {
            String str = FresnelPBRMaterial.MATERIAL_UNIFORMS;
            String str2 = FresnelPBRMaterial.MATERIAL_FUNCTION;
            str.getClass();
            str2.getClass();
            return new Material.ProgramSource("\n    precision highp float;\n\n    // Per-vertex attributes\n    attribute vec3 aPosition;\n    attribute vec3 aNormal;\n    attribute vec3 aTangent;\n    attribute vec3 aBitangent;\n    attribute vec2 aUV;\n\n    // Per-instance attributes — set up with glVertexAttribDivisor(loc, 1).\n    attribute vec4 aInstanceModel0;\n    attribute vec4 aInstanceModel1;\n    attribute vec4 aInstanceModel2;\n    attribute vec4 aInstanceModel3;\n    attribute float aInstanceOpacity;\n\n    // Scene uniforms (uModelMatrix from per-instance attrs above; not used).\n    uniform mat4 uProjectionMatrix;\n    uniform mat4 uViewMatrix;\n\n    // Varyings (to fragment shader)\n    varying vec3 vPosition;\n    varying vec3 vObjectPosition;\n    varying vec3 vNormal;\n    varying vec3 vTangent;\n    varying vec3 vBitangent;\n    varying vec2 vUV;\n    varying float vInstanceOpacity;\n\n    void main() {\n      mat4 modelMatrix = mat4(aInstanceModel0, aInstanceModel1, aInstanceModel2, aInstanceModel3);\n\n      vec4 worldPos = modelMatrix * vec4(aPosition, 1.0);\n      vPosition = worldPos.xyz;\n      vObjectPosition = aPosition;\n\n      mat3 normalMatrix = mat3(modelMatrix);\n      vNormal = normalize(normalMatrix * aNormal);\n      vTangent = normalize(normalMatrix * aTangent);\n      vBitangent = normalize(normalMatrix * aBitangent);\n\n      vUV = aUV;\n      vInstanceOpacity = aInstanceOpacity;\n\n      gl_Position = uProjectionMatrix * uViewMatrix * worldPos;\n    }\n  ", FlowsKt.buildFragmentShader(str, str2, true));
        }
        String str3 = FresnelPBRMaterial.MATERIAL_UNIFORMS;
        String str4 = FresnelPBRMaterial.MATERIAL_FUNCTION;
        str3.getClass();
        str4.getClass();
        return new Material.ProgramSource("\n    precision highp float;\n    \n    // Attributes\n    attribute vec3 aPosition;\n    attribute vec3 aNormal;\n    attribute vec3 aTangent;\n    attribute vec3 aBitangent;\n    attribute vec2 aUV;\n\n    // Uniforms\n    uniform mat4 uProjectionMatrix;\n    uniform mat4 uViewMatrix;\n    uniform mat4 uModelMatrix;\n\n    // Varyings (to fragment shader)\n    varying vec3 vPosition;\n    varying vec3 vObjectPosition;  // pre-transform aPosition; used by procedural noise materials\n                                   // that need a stable, model-space sample point\n    varying vec3 vNormal;\n    varying vec3 vTangent;\n    varying vec3 vBitangent;\n    varying vec2 vUV;\n\n    void main() {\n      // Transform position to world space\n      vec4 worldPos = uModelMatrix * vec4(aPosition, 1.0);\n      vPosition = worldPos.xyz;\n      vObjectPosition = aPosition;\n\n      // Transform normal, tangent, bitangent to world space\n      mat3 normalMatrix = mat3(uModelMatrix);\n      vNormal = normalize(normalMatrix * aNormal);\n      vTangent = normalize(normalMatrix * aTangent);\n      vBitangent = normalize(normalMatrix * aBitangent);\n\n      // Pass through UV\n      vUV = aUV;\n\n      // Calculate final position\n      gl_Position = uProjectionMatrix * uViewMatrix * worldPos;\n    }\n  ", FlowsKt.buildFragmentShader(str3, str4, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getRetailers(double d, double d2, double d3, ContinuationImpl continuationImpl) {
        RealRetailerLocationManager$getRetailers$1 realRetailerLocationManager$getRetailers$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealRetailerLocationManager$getRetailers$1) {
            realRetailerLocationManager$getRetailers$1 = (RealRetailerLocationManager$getRetailers$1) continuationImpl;
            int i2 = realRetailerLocationManager$getRetailers$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realRetailerLocationManager$getRetailers$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realRetailerLocationManager$getRetailers$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realRetailerLocationManager$getRetailers$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    PapermateClientService papermateClientService = (PapermateClientService) this.zza;
                    GetRetailerLocationsRequest getRetailerLocationsRequest = new GetRetailerLocationsRequest(new Double(d), new Double(d2), new Double(d3), ByteString.EMPTY);
                    realRetailerLocationManager$getRetailers$1.label = 1;
                    obj = papermateClientService.getRetailerLocations(getRetailerLocationsRequest, realRetailerLocationManager$getRetailers$1);
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
                    return new RetailerLocationResult.Results(((GetRetailerLocationsResponse) ((ApiResult.Success) apiResult).response).locations);
                }
                if ((apiResult instanceof ApiResult.Failure.HttpFailure) || (apiResult instanceof ApiResult.Failure.NetworkFailure)) {
                    return RetailerLocationResult.Failed.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        realRetailerLocationManager$getRetailers$1 = new RealRetailerLocationManager$getRetailers$1(this, continuationImpl);
        Object obj2 = realRetailerLocationManager$getRetailers$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realRetailerLocationManager$getRetailers$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
    public int getWidth() {
        return ((ExtendedFloatingActionButton) this.zza).getCollapsedSize();
    }

    public boolean headerPasses(CommonSEHeader commonSEHeader) {
        Set<String> set = commonSEHeader.crit;
        if (set == null) {
            return true;
        }
        for (String str : set) {
            if (!Collections.singleton("b64").contains(str) && !Collections.unmodifiableSet((Set) this.zza).contains(str)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.collections.Grouping
    public String keyOf(Object obj) {
        return ((Widget) obj).widgetId;
    }

    public String localizePoolsAsset(PoolsAsset poolsAsset) {
        boolean isSpanish = BundleKt.isSpanish((Locale) ((RealLocaleManager) this.zza).resolvedLocale.$$delegate_0.getValue());
        int ordinal = poolsAsset.ordinal();
        if (ordinal == 0) {
            return isSpanish ? "https://cash-f.squarecdn.com/static/pools_nux_details.es.png" : "https://cash-f.squarecdn.com/static/pools_nux_details.png";
        }
        if (ordinal == 1) {
            return isSpanish ? "https://cash-f.squarecdn.com/static/pools_nux_activity.es.png" : "https://cash-f.squarecdn.com/static/pools_nux_activity.png";
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
        boolean z;
        BottomAppBar bottomAppBar = (BottomAppBar) this.zza;
        if (bottomAppBar.paddingBottomSystemWindowInsets) {
            bottomAppBar.bottomInset = windowInsetsCompat.getSystemWindowInsetBottom();
        }
        boolean z2 = false;
        if (bottomAppBar.paddingLeftSystemWindowInsets) {
            z = bottomAppBar.leftInset != windowInsetsCompat.getSystemWindowInsetLeft();
            bottomAppBar.leftInset = windowInsetsCompat.getSystemWindowInsetLeft();
        } else {
            z = false;
        }
        if (bottomAppBar.paddingRightSystemWindowInsets) {
            boolean z3 = bottomAppBar.rightInset != windowInsetsCompat.getSystemWindowInsetRight();
            bottomAppBar.rightInset = windowInsetsCompat.getSystemWindowInsetRight();
            z2 = z3;
        }
        if (!z && !z2) {
            return windowInsetsCompat;
        }
        AnimatorSet animatorSet = bottomAppBar.menuAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = bottomAppBar.modeAnimator;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        bottomAppBar.setCutoutStateAndTranslateFab();
        bottomAppBar.setActionMenuViewPosition();
        return windowInsetsCompat;
    }

    public void onDismiss(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        ((BaseTransientBottomBar) this.zza).dispatchDismiss(0);
    }

    public void onScrubbed(InvestingGraphContentModel.Point point, Float f, InvestingGraphPathType investingGraphPathType) {
        MooncakeInvestingGraphView mooncakeInvestingGraphView = (MooncakeInvestingGraphView) this.zza;
        InvestingGraphAdapter investingGraphAdapter = mooncakeInvestingGraphView.graphAdapter;
        TextView textView = mooncakeInvestingGraphView.eventLabel;
        boolean z = point != null;
        if (investingGraphAdapter.isScrubbing != z) {
            mooncakeInvestingGraphView.performHapticFeedback(0);
        }
        if (investingGraphAdapter.isScrubbing != z) {
            investingGraphAdapter.isScrubbing = z;
            investingGraphAdapter.observable.notifyChanged();
        }
        textView.setVisibility(z ? 0 : mooncakeInvestingGraphView.scrubListener != null ? 4 : 8);
        textView.setText((CharSequence) null);
        Function1 function1 = mooncakeInvestingGraphView.scrubListener;
        if (function1 != null) {
            function1.invoke(point != null ? point : null);
        }
        if (point == null || f == null) {
            return;
        }
        if (point.treatment == InvestingGraphContentModel.PointTreatment.DOT) {
            if (!mooncakeInvestingGraphView.performedHaptic) {
                mooncakeInvestingGraphView.performHapticFeedback(0);
            }
            mooncakeInvestingGraphView.performedHaptic = true;
        } else {
            mooncakeInvestingGraphView.performedHaptic = false;
        }
        textView.setText((String) point.scrubTextProvider.provider.invoke());
        textView.measure(0, 0);
        textView.setSelected(!(investingGraphPathType instanceof NormalGray));
        float measuredWidth = textView.getMeasuredWidth();
        textView.setX(Math.max(Math.min(f.floatValue() - (measuredWidth / 2.0f), mooncakeInvestingGraphView.sparkView.getWidth() - measuredWidth), RecyclerView.DECELERATION_RATE));
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public /* synthetic */ void onSuccess(Object obj) {
        ((AndroidLocationProvider$currentLocation$2$1) this.zza).invoke(obj);
    }

    @Override // com.squareup.cash.graphics.swampgl.components.MaterialPlugin
    public void prepareMaterialInput(MaterialInput materialInput) {
        materialInput.getClass();
        materialInput.baseColor = -1315861;
        materialInput.roughness = ((FresnelPBRMaterial) this.zza).roughness;
        materialInput.metallic = ((FresnelPBRMaterial) this.zza).metallic;
        materialInput.opacity = ((FresnelPBRMaterial) this.zza).opacity;
        materialInput.dimmer = ((FresnelPBRMaterial) this.zza).dimmer;
        materialInput.saturation = ((FresnelPBRMaterial) this.zza).saturation;
    }

    @Override // com.squareup.cash.blockers.presenters.PasscodeGatedEndpoint
    public PasscodeViewModel.VerifyPasscodeModel.BiometricsPrompt promptModel(AndroidStringManager androidStringManager) {
        androidStringManager.getClass();
        return new PasscodeViewModel.VerifyPasscodeModel.BiometricsPrompt(((CashBiometricsInfo) this.zza).unlock);
    }

    @Override // androidx.compose.runtime.saveable.Saver
    /* renamed from: restore */
    public Object mo380restore(Object obj) {
        List list = (List) obj;
        CollapsingToolbarState collapsingToolbarState = (CollapsingToolbarState) this.zza;
        Object obj2 = list.get(0);
        obj2.getClass();
        collapsingToolbarState.height$delegate.setIntValue(((Integer) obj2).intValue());
        Object obj3 = list.get(1);
        obj3.getClass();
        return new CollapsingToolbarScaffoldState(collapsingToolbarState, ((Integer) obj3).intValue());
    }

    @Override // androidx.compose.runtime.saveable.Saver
    public Object save(SaveableHolder saveableHolder, Object obj) {
        CollapsingToolbarScaffoldState collapsingToolbarScaffoldState = (CollapsingToolbarScaffoldState) obj;
        saveableHolder.getClass();
        collapsingToolbarScaffoldState.getClass();
        Integer valueOf = Integer.valueOf(collapsingToolbarScaffoldState.toolbarState.height$delegate.getIntValue());
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = collapsingToolbarScaffoldState.offsetYState;
        parcelableSnapshotMutableIntState.getClass();
        return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{valueOf, Integer.valueOf(parcelableSnapshotMutableIntState.getIntValue())});
    }

    @Override // kotlin.collections.Grouping
    public Iterator sourceIterator() {
        return ((Iterable) this.zza).iterator();
    }

    @Override // com.google.android.material.resources.CancelableFontCallback.ApplyFont
    public void apply(Typeface typeface) {
        CollapsingTextHelper collapsingTextHelper = (CollapsingTextHelper) this.zza;
        if (collapsingTextHelper.setCollapsedTypefaceInternal(typeface)) {
            collapsingTextHelper.recalculate(false);
        }
    }

    public /* synthetic */ zzb(Object obj) {
        this.zza = obj;
    }

    public zzb(RealFamilyProfileManager realFamilyProfileManager) {
        this.zza = StateFlowKt.mapState(realFamilyProfileManager.familyProfile, new StoryQueries$$ExternalSyntheticLambda0(21));
    }

    public zzb(int i) {
        switch (i) {
            case 12:
                this.zza = Collections.EMPTY_SET;
                break;
            default:
                this.zza = new SizeMap(GenericGF.QR_CODE_FIELD_256, 10);
                break;
        }
    }

    public zzb(CurrencyConfig currencyConfig) {
        currencyConfig.getClass();
        this.zza = currencyConfig;
    }
}
