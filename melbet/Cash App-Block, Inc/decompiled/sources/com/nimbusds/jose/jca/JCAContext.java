package com.nimbusds.jose.jca;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.WrappedKeyEntry;
import android.util.Log;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.MutableState;
import androidx.glance.session.SessionWorker$doWork$2$2;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.api.ApiResult;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.Image;
import coil3.Image_androidKt;
import coil3.target.Target;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.resources.CancelableFontCallback;
import com.google.android.play.core.appupdate.internal.zzaf;
import com.google.android.play.core.appupdate.zzg;
import com.google.crypto.tink.subtle.EngineFactory;
import com.google.crypto.tink.subtle.EngineWrapper;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.maps.android.compose.DragState;
import com.google.maps.android.compose.InputHandlerNode;
import com.google.maps.android.compose.MapApplier;
import com.google.maps.android.compose.MapNode;
import com.google.maps.android.compose.MarkerNode;
import com.google.maps.android.compose.MarkerState;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.detector.AlignmentPattern;
import com.google.zxing.qrcode.detector.AlignmentPatternFinder;
import com.google.zxing.qrcode.detector.FinderPattern;
import com.squareup.cash.account.backend.AccountholderAccountRepository$LoadAccountsResult;
import com.squareup.cash.account.backend.RealAccountholderAccountRepository;
import com.squareup.cash.account.settings.backend.AccountSettingsFeatureManager$SettingsDesignMode;
import com.squareup.cash.account.settings.backend.RealAccountSettingsFeatureManager$getSettingsDesignMode$1;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.presenters.ActivityItemEventDecorator;
import com.squareup.cash.activity.presenters.ActivityItemEventHandler;
import com.squareup.cash.activity.viewmodels.ActivityItemViewEvent;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.androidsvg.SVG$Box;
import com.squareup.cash.androidsvg.SVG$Length;
import com.squareup.cash.androidsvg.SVG$Svg;
import com.squareup.cash.androidsvg.SVGParseException;
import com.squareup.cash.androidsvg.SVGParser;
import com.squareup.cash.blockers.views.FileBlockerView$6$2$1;
import com.squareup.cash.card.onboarding.InteractiveCardView$flingTo$1;
import com.squareup.cash.card.onboarding.graphics.FlowsKt;
import com.squareup.cash.card.onboarding.graphics.SolidColorPBRMaterial;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.data.blockers.FlowStarter$$ExternalSyntheticLambda0;
import com.squareup.cash.education.stories.db.StoryQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.eligibility.backend.api.EligibleFeature;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.family.familyhub.backend.real.RealManagedAccountTransferService$transferFromDependent$1;
import com.squareup.cash.family.familyhub.backend.real.RealManagedAccountTransferService$transferToDependent$1;
import com.squareup.cash.gps.backend.real.AndroidLocationSettingsChecker$check$2$1;
import com.squareup.cash.graphics.swampgl.components.Material;
import com.squareup.cash.graphics.swampgl.components.MaterialInput;
import com.squareup.cash.graphics.swampgl.components.MaterialPlugin;
import com.squareup.cash.graphics.swampgl.components.RealUniformBinder;
import com.squareup.cash.keystore.RealKeyStoreProvider;
import com.squareup.cash.keystore.RealKeyStoreProvider$getKey$2;
import com.squareup.cash.keystore.RealKeyStoreProvider$setEntry$2;
import com.squareup.cash.mooncake.components.SplitButtons;
import com.squareup.cash.taptopay.encryption.real.utils.AndroidKeyParameters;
import com.squareup.cash.taptopay.encryption.real.utils.RealKeyProvisionCompatibilityChecker$testKeyImportImpl$1;
import com.squareup.cash.taptopay.encryption.real.utils.RealKeyStoreCipherUtilities$generateKey$2;
import com.squareup.cash.taptopay.encryption.real.utils.RealKeyStoreCipherUtilities$getKeyMasterVersion$1;
import com.squareup.cash.work.data.api.MerchantClockInStatus;
import com.squareup.cash.work.data.real.RealGetMerchantsClockInStatusUseCase$fetchStatus$1;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import com.squareup.cash.work.presenters.shift.RealClockInRepository;
import com.squareup.cash.work.tinygraph.EntityStore;
import com.squareup.cash.work.tinygraph.models.EntityType;
import com.squareup.cash.work.tinygraph.models.IBaseEntity;
import com.squareup.cash.work.tinygraph.models.Membership;
import com.squareup.protos.cash.aegis.api.AddOrWithdrawMoneyForManagedAccountRequest;
import com.squareup.protos.cash.aegis.api.AddOrWithdrawMoneyForManagedAccountResponse;
import com.squareup.protos.cash.aegis.service.AegisService;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.timecards.GetClockinEssentialsRequest;
import com.squareup.protos.timecards.GetClockinEssentialsResponse;
import com.squareup.protos.timecards.Timecard;
import com.squareup.protos.timecards.TimecardBreak;
import com.squareup.protos.timecards.scheduling.Shift;
import com.squareup.protos.timecards.scheduling.ShiftSchedule;
import com.squareup.scannerview.SizeMap;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.Provider;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.zip.GZIPInputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SharingStarted;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import papa.SafeTrace;
import timber.log.Timber;
import xyz.block.protos.genie.EasingCurve;

/* loaded from: classes4.dex */
public class JCAContext implements CancelableFontCallback.ApplyFont, zzaf, EngineFactory.Policy, GoogleMap.OnMarkerDragListener, OnSuccessListener, ActivityItemEventDecorator, MaterialPlugin, Target {
    public final /* synthetic */ int $r8$classId;
    public Object provider;

    public JCAContext(RealFeatureEligibilityRepository realFeatureEligibilityRepository, CoroutineScope coroutineScope) {
        this.$r8$classId = 20;
        int i = 10;
        this.provider = StateFlowKt.mapState(FlowKt.stateIn(new FinishSetupTileBadgeCounter(i, realFeatureEligibilityRepository.currentEligibleFeatures(), new EligibleFeature[]{EligibleFeature.MONEY_EARNINGS_APPLET}), coroutineScope, SharingStarted.Companion.Lazily, null), new StoryQueries$$ExternalSyntheticLambda0(2));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$fetchStatus(JCAContext jCAContext, MerchantIdentifier merchantIdentifier, ContinuationImpl continuationImpl) {
        RealGetMerchantsClockInStatusUseCase$fetchStatus$1 realGetMerchantsClockInStatusUseCase$fetchStatus$1;
        int i;
        try {
            if (continuationImpl instanceof RealGetMerchantsClockInStatusUseCase$fetchStatus$1) {
                realGetMerchantsClockInStatusUseCase$fetchStatus$1 = (RealGetMerchantsClockInStatusUseCase$fetchStatus$1) continuationImpl;
                int i2 = realGetMerchantsClockInStatusUseCase$fetchStatus$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    realGetMerchantsClockInStatusUseCase$fetchStatus$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = realGetMerchantsClockInStatusUseCase$fetchStatus$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realGetMerchantsClockInStatusUseCase$fetchStatus$1.label;
                    Continuation continuation = null;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealClockInRepository realClockInRepository = (RealClockInRepository) jCAContext.provider;
                        String str = merchantIdentifier.token;
                        realGetMerchantsClockInStatusUseCase$fetchStatus$1.L$0 = merchantIdentifier;
                        realGetMerchantsClockInStatusUseCase$fetchStatus$1.label = 1;
                        obj = realClockInRepository.performRequest(new SessionWorker$doWork$2$2(realClockInRepository, new GetClockinEssentialsRequest(new EasingCurve.EaseIn.Builder(8).buildUnknownFields()), str, continuation, 25), realGetMerchantsClockInStatusUseCase$fetchStatus$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        merchantIdentifier = realGetMerchantsClockInStatusUseCase$fetchStatus$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    return toStatus((GetClockinEssentialsResponse) obj, merchantIdentifier);
                }
            }
            if (i != 0) {
            }
            return toStatus((GetClockinEssentialsResponse) obj, merchantIdentifier);
        } catch (Exception e) {
            Timber.Forest.w(Recorder$$ExternalSyntheticOutline2.m("Failed to fetch clock-in status for merchant ", merchantIdentifier.token), new Object[0], e);
            return null;
        }
        realGetMerchantsClockInStatusUseCase$fetchStatus$1 = new RealGetMerchantsClockInStatusUseCase$fetchStatus$1(jCAContext, continuationImpl);
        Object obj2 = realGetMerchantsClockInStatusUseCase$fetchStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realGetMerchantsClockInStatusUseCase$fetchStatus$1.label;
        Continuation continuation2 = null;
    }

    public static JCAContext getFromString(String str) {
        SVGParser sVGParser = new SVGParser();
        sVGParser.svgDocument = null;
        sVGParser.currentElement = null;
        sVGParser.ignoring = false;
        InputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        if (!byteArrayInputStream.markSupported()) {
            byteArrayInputStream = new BufferedInputStream(byteArrayInputStream);
        }
        try {
            byteArrayInputStream.mark(3);
            int read = byteArrayInputStream.read() + (byteArrayInputStream.read() << 8);
            byteArrayInputStream.reset();
            if (read == 35615) {
                byteArrayInputStream = new GZIPInputStream(byteArrayInputStream);
            }
        } catch (IOException unused) {
        }
        SAXParserFactory newInstance = SAXParserFactory.newInstance();
        newInstance.setNamespaceAware(true);
        try {
            try {
                XMLReader xMLReader = newInstance.newSAXParser().getXMLReader();
                xMLReader.setContentHandler(sVGParser);
                xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", sVGParser);
                xMLReader.parse(new InputSource(byteArrayInputStream));
                return sVGParser.svgDocument;
            } catch (IOException e) {
                throw new SVGParseException("File error", e);
            } catch (ParserConfigurationException e2) {
                throw new SVGParseException("XML Parser problem", e2);
            } catch (SAXException e3) {
                throw new SVGParseException("SVG parse error: " + e3.getMessage(), e3);
            }
        } finally {
            try {
                byteArrayInputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }

    public static MerchantClockInStatus toStatus(GetClockinEssentialsResponse getClockinEssentialsResponse, MerchantIdentifier merchantIdentifier) {
        Shift shift = getClockinEssentialsResponse.clocked_in_shift;
        if (shift == null) {
            return new MerchantClockInStatus.ClockedOut(merchantIdentifier, getClockinEssentialsResponse.next_shift_schedule);
        }
        Timecard timecard = shift.timecard;
        Object obj = null;
        if (timecard == null) {
            Timber.Forest.w(Recorder$$ExternalSyntheticOutline2.m("Missing timecard for merchant ", merchantIdentifier.token), new Object[0]);
            return null;
        }
        Iterator it = shift.timecard_breaks.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((TimecardBreak) next).stop_timestamp_seconds == null) {
                obj = next;
                break;
            }
        }
        TimecardBreak timecardBreak = (TimecardBreak) obj;
        ShiftSchedule shiftSchedule = shift.shift_schedule;
        return timecardBreak != null ? new MerchantClockInStatus.OnBreak(merchantIdentifier, timecard, shiftSchedule, timecardBreak) : new MerchantClockInStatus.ClockedIn(merchantIdentifier, timecard, shiftSchedule);
    }

    public static Object wrapKey(KeyPair keyPair, SizeMap sizeMap, byte[] bArr, byte[] bArr2) {
        Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPPadding");
        cipher.init(1, keyPair.getPublic(), AndroidKeyParameters.TRANSPORT_WRAPPING_PARAMS);
        byte[] doFinal = cipher.doFinal(bArr);
        Cipher cipher2 = Cipher.getInstance("AES/GCM/NoPadding");
        cipher2.init(1, new SecretKeySpec(bArr, "AES"));
        byte[] encoded = ((DERSequence) sizeMap.mRatios).getEncoded();
        encoded.getClass();
        cipher2.updateAAD(encoded);
        byte[] doFinal2 = cipher2.doFinal(bArr2);
        byte[] iv = cipher2.getIV();
        iv.getClass();
        doFinal2.getClass();
        int length = doFinal2.length - 16;
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(0L));
        aSN1EncodableVector.add(new DEROctetString(doFinal));
        aSN1EncodableVector.add(new DEROctetString(iv));
        aSN1EncodableVector.add((DERSequence) sizeMap.mRatios);
        aSN1EncodableVector.add(new DEROctetString(ArraysKt___ArraysJvmKt.copyOfRange(doFinal2, 0, length)));
        aSN1EncodableVector.add(new DEROctetString(ArraysKt___ArraysJvmKt.copyOfRange(doFinal2, length, doFinal2.length)));
        byte[] encoded2 = new DERSequence(aSN1EncodableVector).getEncoded(ASN1Encoding.DER);
        encoded2.getClass();
        return encoded2;
    }

    @Override // com.google.android.material.resources.CancelableFontCallback.ApplyFont
    public void apply(Typeface typeface) {
        CollapsingTextHelper collapsingTextHelper = (CollapsingTextHelper) this.provider;
        if (collapsingTextHelper.setExpandedTypefaceInternal(typeface)) {
            collapsingTextHelper.recalculate(false);
        }
    }

    @Override // com.squareup.cash.graphics.swampgl.components.MaterialPlugin
    public void bindCustomUniforms(RealUniformBinder realUniformBinder) {
        ((SolidColorPBRMaterial) this.provider).bindWandLightingUniforms(realUniformBinder);
    }

    public float calculateModuleSizeOneWay(FinderPattern finderPattern, FinderPattern finderPattern2) {
        int i = (int) finderPattern.x;
        int i2 = (int) finderPattern.y;
        int i3 = (int) finderPattern2.x;
        int i4 = (int) finderPattern2.y;
        float sizeOfBlackWhiteBlackRunBothWays = sizeOfBlackWhiteBlackRunBothWays(i, i2, i3, i4);
        float sizeOfBlackWhiteBlackRunBothWays2 = sizeOfBlackWhiteBlackRunBothWays((int) finderPattern2.x, i4, (int) finderPattern.x, i2);
        return Float.isNaN(sizeOfBlackWhiteBlackRunBothWays) ? sizeOfBlackWhiteBlackRunBothWays2 / 7.0f : Float.isNaN(sizeOfBlackWhiteBlackRunBothWays2) ? sizeOfBlackWhiteBlackRunBothWays / 7.0f : (sizeOfBlackWhiteBlackRunBothWays + sizeOfBlackWhiteBlackRunBothWays2) / 14.0f;
    }

    @Override // com.squareup.cash.activity.presenters.ActivityItemEventDecorator
    public Flow decorate(ActivityItemEventHandler activityItemEventHandler, ActivityItemViewModel activityItemViewModel, ActivityItemViewEvent activityItemViewEvent, ActivityItem activityItem) {
        activityItemEventHandler.getClass();
        return new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(activityItemEventHandler.handleEvent(activityItemViewModel, activityItemViewEvent, activityItem), new InteractiveCardView$flingTo$1.AnonymousClass2(this, null, 1), 3);
    }

    @Override // com.squareup.cash.graphics.swampgl.components.MaterialPlugin
    public void dispose() {
    }

    public AlignmentPattern findAlignmentInRegion(float f, float f2, int i, int i2) {
        AlignmentPattern handlePossibleCenter;
        AlignmentPattern handlePossibleCenter2;
        int i3 = (int) (f2 * f);
        int max = Math.max(0, i - i3);
        BitMatrix bitMatrix = (BitMatrix) this.provider;
        int min = Math.min(bitMatrix.width - 1, i + i3) - max;
        float f3 = 3.0f * f;
        if (min < f3) {
            throw NotFoundException.getNotFoundInstance();
        }
        int max2 = Math.max(0, i2 - i3);
        int min2 = Math.min(bitMatrix.height - 1, i2 + i3) - max2;
        if (min2 < f3) {
            throw NotFoundException.getNotFoundInstance();
        }
        BitMatrix bitMatrix2 = (BitMatrix) this.provider;
        AlignmentPatternFinder alignmentPatternFinder = new AlignmentPatternFinder(bitMatrix2, max, max2, min, min2, f);
        int i4 = alignmentPatternFinder.width;
        int i5 = alignmentPatternFinder.startX;
        int i6 = i4 + i5;
        int i7 = alignmentPatternFinder.height;
        int i8 = (i7 / 2) + alignmentPatternFinder.startY;
        int[] iArr = new int[3];
        for (int i9 = 0; i9 < i7; i9++) {
            int i10 = ((i9 & 1) == 0 ? (i9 + 1) / 2 : -((i9 + 1) / 2)) + i8;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i11 = i5;
            while (i11 < i6 && !bitMatrix2.get(i11, i10)) {
                i11++;
            }
            int i12 = 0;
            while (i11 < i6) {
                if (!bitMatrix2.get(i11, i10)) {
                    if (i12 == 1) {
                        i12++;
                    }
                    iArr[i12] = iArr[i12] + 1;
                } else if (i12 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i12 != 2) {
                    i12++;
                    iArr[i12] = iArr[i12] + 1;
                } else {
                    if (alignmentPatternFinder.foundPatternCross(iArr) && (handlePossibleCenter2 = alignmentPatternFinder.handlePossibleCenter(i10, i11, iArr)) != null) {
                        return handlePossibleCenter2;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i12 = 1;
                }
                i11++;
            }
            if (alignmentPatternFinder.foundPatternCross(iArr) && (handlePossibleCenter = alignmentPatternFinder.handlePossibleCenter(i10, i6, iArr)) != null) {
                return handlePossibleCenter;
            }
        }
        ArrayList arrayList = alignmentPatternFinder.possibleCenters;
        if (arrayList.isEmpty()) {
            throw NotFoundException.getNotFoundInstance();
        }
        return (AlignmentPattern) arrayList.get(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        if (r0.deleteEntry(r9, r1) == r10) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
    
        if (r7 == r10) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object generateKey(int i, String str, ContinuationImpl continuationImpl) {
        RealKeyStoreCipherUtilities$generateKey$2 realKeyStoreCipherUtilities$generateKey$2;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i2;
        RealKeyStoreProvider realKeyStoreProvider = (RealKeyStoreProvider) this.provider;
        if (continuationImpl instanceof RealKeyStoreCipherUtilities$generateKey$2) {
            realKeyStoreCipherUtilities$generateKey$2 = (RealKeyStoreCipherUtilities$generateKey$2) continuationImpl;
            int i3 = realKeyStoreCipherUtilities$generateKey$2.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                realKeyStoreCipherUtilities$generateKey$2.label = i3 - PKIFailureInfo.systemUnavail;
                obj = realKeyStoreCipherUtilities$generateKey$2.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = realKeyStoreCipherUtilities$generateKey$2.label;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realKeyStoreCipherUtilities$generateKey$2.L$0 = str;
                    realKeyStoreCipherUtilities$generateKey$2.I$0 = i;
                    realKeyStoreCipherUtilities$generateKey$2.label = 1;
                    obj = realKeyStoreProvider.containsAlias(str, realKeyStoreCipherUtilities$generateKey$2);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                SafeTrace.throwOnFailure(obj);
                                return obj;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i = realKeyStoreCipherUtilities$generateKey$2.I$0;
                        str = realKeyStoreCipherUtilities$generateKey$2.L$0;
                        SafeTrace.throwOnFailure(obj);
                        Calendar calendar = Calendar.getInstance();
                        Date time = calendar.getTime();
                        calendar.add(5, 365);
                        KeyGenParameterSpec.Builder keyValidityEnd = new KeyGenParameterSpec.Builder(str, 32).setDigests("SHA-256").setEncryptionPaddings("OAEPPadding").setBlockModes("ECB").setIsStrongBoxBacked(false).setKeySize(i).setKeyValidityStart(time).setKeyValidityEnd(calendar.getTime());
                        String date = time.toString();
                        date.getClass();
                        byte[] bytes = date.getBytes(Charsets.UTF_8);
                        bytes.getClass();
                        KeyGenParameterSpec build = keyValidityEnd.setAttestationChallenge(bytes).build();
                        build.getClass();
                        realKeyStoreCipherUtilities$generateKey$2.L$0 = null;
                        realKeyStoreCipherUtilities$generateKey$2.I$0 = i;
                        realKeyStoreCipherUtilities$generateKey$2.label = 3;
                        Object generateRSAKey = realKeyStoreProvider.generateRSAKey(build, realKeyStoreCipherUtilities$generateKey$2);
                        return generateRSAKey == coroutineSingletons ? coroutineSingletons : generateRSAKey;
                    }
                    i = realKeyStoreCipherUtilities$generateKey$2.I$0;
                    str = realKeyStoreCipherUtilities$generateKey$2.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    realKeyStoreCipherUtilities$generateKey$2.L$0 = str;
                    realKeyStoreCipherUtilities$generateKey$2.I$0 = i;
                    realKeyStoreCipherUtilities$generateKey$2.label = 2;
                }
                Calendar calendar2 = Calendar.getInstance();
                Date time2 = calendar2.getTime();
                calendar2.add(5, 365);
                KeyGenParameterSpec.Builder keyValidityEnd2 = new KeyGenParameterSpec.Builder(str, 32).setDigests("SHA-256").setEncryptionPaddings("OAEPPadding").setBlockModes("ECB").setIsStrongBoxBacked(false).setKeySize(i).setKeyValidityStart(time2).setKeyValidityEnd(calendar2.getTime());
                String date2 = time2.toString();
                date2.getClass();
                byte[] bytes2 = date2.getBytes(Charsets.UTF_8);
                bytes2.getClass();
                KeyGenParameterSpec build2 = keyValidityEnd2.setAttestationChallenge(bytes2).build();
                build2.getClass();
                realKeyStoreCipherUtilities$generateKey$2.L$0 = null;
                realKeyStoreCipherUtilities$generateKey$2.I$0 = i;
                realKeyStoreCipherUtilities$generateKey$2.label = 3;
                Object generateRSAKey2 = realKeyStoreProvider.generateRSAKey(build2, realKeyStoreCipherUtilities$generateKey$2);
                if (generateRSAKey2 == coroutineSingletons) {
                }
            }
        }
        realKeyStoreCipherUtilities$generateKey$2 = new RealKeyStoreCipherUtilities$generateKey$2(this, continuationImpl);
        obj = realKeyStoreCipherUtilities$generateKey$2.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = realKeyStoreCipherUtilities$generateKey$2.label;
        if (i2 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        Calendar calendar22 = Calendar.getInstance();
        Date time22 = calendar22.getTime();
        calendar22.add(5, 365);
        KeyGenParameterSpec.Builder keyValidityEnd22 = new KeyGenParameterSpec.Builder(str, 32).setDigests("SHA-256").setEncryptionPaddings("OAEPPadding").setBlockModes("ECB").setIsStrongBoxBacked(false).setKeySize(i).setKeyValidityStart(time22).setKeyValidityEnd(calendar22.getTime());
        String date22 = time22.toString();
        date22.getClass();
        byte[] bytes22 = date22.getBytes(Charsets.UTF_8);
        bytes22.getClass();
        KeyGenParameterSpec build22 = keyValidityEnd22.setAttestationChallenge(bytes22).build();
        build22.getClass();
        realKeyStoreCipherUtilities$generateKey$2.L$0 = null;
        realKeyStoreCipherUtilities$generateKey$2.I$0 = i;
        realKeyStoreCipherUtilities$generateKey$2.label = 3;
        Object generateRSAKey22 = realKeyStoreProvider.generateRSAKey(build22, realKeyStoreCipherUtilities$generateKey$2);
        if (generateRSAKey22 == coroutineSingletons) {
        }
    }

    public ArrayList getAll() {
        List<IBaseEntity> allByType = ((EntityStore) this.provider).getAllByType(EntityType.MEMBERSHIP);
        ArrayList arrayList = new ArrayList();
        for (IBaseEntity iBaseEntity : allByType) {
            Membership membership = iBaseEntity instanceof Membership ? (Membership) iBaseEntity : null;
            if (membership != null) {
                arrayList.add(membership);
            }
        }
        return arrayList;
    }

    public SVG$Box getDocumentDimensions() {
        int i;
        float f;
        int i2;
        SVG$Svg sVG$Svg = (SVG$Svg) this.provider;
        SVG$Length sVG$Length = sVG$Svg.width;
        SVG$Length sVG$Length2 = sVG$Svg.height;
        if (sVG$Length == null || sVG$Length.isZero() || (i = sVG$Length.unit) == 9 || i == 2 || i == 3) {
            return new SVG$Box(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float floatValue$1 = sVG$Length.floatValue$1();
        if (sVG$Length2 == null) {
            SVG$Box sVG$Box = ((SVG$Svg) this.provider).viewBox;
            f = sVG$Box != null ? (sVG$Box.height * floatValue$1) / sVG$Box.width : floatValue$1;
        } else {
            if (sVG$Length2.isZero() || (i2 = sVG$Length2.unit) == 9 || i2 == 2 || i2 == 3) {
                return new SVG$Box(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            f = sVG$Length2.floatValue$1();
        }
        return new SVG$Box(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, floatValue$1, f);
    }

    public RectF getDocumentViewBox() {
        SVG$Svg sVG$Svg = (SVG$Svg) this.provider;
        if (sVG$Svg == null) {
            a$$ExternalSyntheticBUOutline0.m$3("SVG document is empty");
            return null;
        }
        SVG$Box sVG$Box = sVG$Svg.viewBox;
        if (sVG$Box == null) {
            return null;
        }
        sVG$Box.getClass();
        float f = sVG$Box.minX;
        float f2 = sVG$Box.minY;
        return new RectF(f, f2, sVG$Box.width + f, sVG$Box.height + f2);
    }

    @Override // com.google.crypto.tink.subtle.EngineFactory.Policy
    public Object getInstance(String str) {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return ((EngineWrapper) this.provider).getInstance(str, (Provider) it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x006e, code lost:
    
        if (r10 == r2) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0070, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x005e, code lost:
    
        if (generateKey(2048, "provision-wrapping-key", r1) == r2) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x004b, code lost:
    
        if (r10 == r2) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getKeyMasterVersion(ContinuationImpl continuationImpl) {
        RealKeyStoreCipherUtilities$getKeyMasterVersion$1 realKeyStoreCipherUtilities$getKeyMasterVersion$1;
        Object obj;
        int i;
        int intValue;
        RealKeyStoreProvider realKeyStoreProvider = (RealKeyStoreProvider) this.provider;
        if (continuationImpl instanceof RealKeyStoreCipherUtilities$getKeyMasterVersion$1) {
            realKeyStoreCipherUtilities$getKeyMasterVersion$1 = (RealKeyStoreCipherUtilities$getKeyMasterVersion$1) continuationImpl;
            int i2 = realKeyStoreCipherUtilities$getKeyMasterVersion$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realKeyStoreCipherUtilities$getKeyMasterVersion$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = realKeyStoreCipherUtilities$getKeyMasterVersion$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realKeyStoreCipherUtilities$getKeyMasterVersion$1.label;
                Continuation continuation = null;
                int i3 = 3;
                String str = "provision-wrapping-key";
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realKeyStoreCipherUtilities$getKeyMasterVersion$1.label = 1;
                    obj = realKeyStoreProvider.containsAlias("provision-wrapping-key", realKeyStoreCipherUtilities$getKeyMasterVersion$1);
                } else if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i == 2) {
                    SafeTrace.throwOnFailure(obj);
                    realKeyStoreCipherUtilities$getKeyMasterVersion$1.label = 3;
                    obj = JobKt.withContext(realKeyStoreProvider.ioContext, new RealKeyStoreProvider$getKey$2(realKeyStoreProvider, str, continuation, i3), realKeyStoreCipherUtilities$getKeyMasterVersion$1);
                } else {
                    if (i != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    obj.getClass();
                    Certificate[] certificateArr = (Certificate[]) ((Collection) obj).toArray(new Certificate[0]);
                    CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                    certificateFactory.getClass();
                    Certificate generateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(certificateArr[0].getEncoded()));
                    generateCertificate.getClass();
                    byte[] extensionValue = ((X509Certificate) generateCertificate).getExtensionValue("1.3.6.1.4.1.11129.2.1.17");
                    extensionValue.getClass();
                    if (extensionValue.length == 0) {
                        a$$ExternalSyntheticBUOutline0.m$3("Couldn't find the keystore attestation extension data.");
                        return null;
                    }
                    ASN1InputStream aSN1InputStream = new ASN1InputStream(extensionValue);
                    try {
                        ASN1Primitive readObject = aSN1InputStream.readObject();
                        readObject.getClass();
                        byte[] octets = ((ASN1OctetString) readObject).getOctets();
                        octets.getClass();
                        aSN1InputStream = new ASN1InputStream(octets);
                        try {
                            ASN1Primitive readObject2 = aSN1InputStream.readObject();
                            readObject2.getClass();
                            ASN1Sequence aSN1Sequence = (ASN1Sequence) readObject2;
                            aSN1InputStream.close();
                            aSN1InputStream.close();
                            ASN1Encodable objectAt = aSN1Sequence.getObjectAt(2);
                            objectAt.getClass();
                            if (objectAt instanceof ASN1Integer) {
                                intValue = ((ASN1Integer) objectAt).getValue().intValue();
                            } else {
                                if (!(objectAt instanceof ASN1Enumerated)) {
                                    OptionalProvider$$ExternalSyntheticLambda0.m$2("Integer value expected; found ", objectAt, " instead.");
                                    return null;
                                }
                                intValue = ((ASN1Enumerated) objectAt).getValue().intValue();
                            }
                            return new Integer(intValue);
                        } finally {
                        }
                    } finally {
                    }
                }
                if (!((Boolean) obj).booleanValue()) {
                    realKeyStoreCipherUtilities$getKeyMasterVersion$1.label = 2;
                }
                realKeyStoreCipherUtilities$getKeyMasterVersion$1.label = 3;
                obj = JobKt.withContext(realKeyStoreProvider.ioContext, new RealKeyStoreProvider$getKey$2(realKeyStoreProvider, str, continuation, i3), realKeyStoreCipherUtilities$getKeyMasterVersion$1);
            }
        }
        realKeyStoreCipherUtilities$getKeyMasterVersion$1 = new RealKeyStoreCipherUtilities$getKeyMasterVersion$1(this, continuationImpl);
        obj = realKeyStoreCipherUtilities$getKeyMasterVersion$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realKeyStoreCipherUtilities$getKeyMasterVersion$1.label;
        Continuation continuation2 = null;
        int i32 = 3;
        String str2 = "provision-wrapping-key";
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        realKeyStoreCipherUtilities$getKeyMasterVersion$1.label = 3;
        obj = JobKt.withContext(realKeyStoreProvider.ioContext, new RealKeyStoreProvider$getKey$2(realKeyStoreProvider, str2, continuation2, i32), realKeyStoreCipherUtilities$getKeyMasterVersion$1);
    }

    @Override // com.squareup.cash.graphics.swampgl.components.MaterialPlugin
    public Material.ProgramSource getProgramSource() {
        return ((SolidColorPBRMaterial) this.provider).instanced ? new Material.ProgramSource("\n    precision highp float;\n\n    // Per-vertex attributes\n    attribute vec3 aPosition;\n    attribute vec3 aNormal;\n    attribute vec3 aTangent;\n    attribute vec3 aBitangent;\n    attribute vec2 aUV;\n\n    // Per-instance attributes — set up with glVertexAttribDivisor(loc, 1).\n    attribute vec4 aInstanceModel0;\n    attribute vec4 aInstanceModel1;\n    attribute vec4 aInstanceModel2;\n    attribute vec4 aInstanceModel3;\n    attribute float aInstanceOpacity;\n\n    // Scene uniforms (uModelMatrix from per-instance attrs above; not used).\n    uniform mat4 uProjectionMatrix;\n    uniform mat4 uViewMatrix;\n\n    // Varyings (to fragment shader)\n    varying vec3 vPosition;\n    varying vec3 vObjectPosition;\n    varying vec3 vNormal;\n    varying vec3 vTangent;\n    varying vec3 vBitangent;\n    varying vec2 vUV;\n    varying float vInstanceOpacity;\n\n    void main() {\n      mat4 modelMatrix = mat4(aInstanceModel0, aInstanceModel1, aInstanceModel2, aInstanceModel3);\n\n      vec4 worldPos = modelMatrix * vec4(aPosition, 1.0);\n      vPosition = worldPos.xyz;\n      vObjectPosition = aPosition;\n\n      mat3 normalMatrix = mat3(modelMatrix);\n      vNormal = normalize(normalMatrix * aNormal);\n      vTangent = normalize(normalMatrix * aTangent);\n      vBitangent = normalize(normalMatrix * aBitangent);\n\n      vUV = aUV;\n      vInstanceOpacity = aInstanceOpacity;\n\n      gl_Position = uProjectionMatrix * uViewMatrix * worldPos;\n    }\n  ", FlowsKt.buildFragmentShader("", "void material(inout MaterialInputs inputs) {\n  prepareMaterial(inputs);\n}", true)) : new Material.ProgramSource("\n    precision highp float;\n    \n    // Attributes\n    attribute vec3 aPosition;\n    attribute vec3 aNormal;\n    attribute vec3 aTangent;\n    attribute vec3 aBitangent;\n    attribute vec2 aUV;\n\n    // Uniforms\n    uniform mat4 uProjectionMatrix;\n    uniform mat4 uViewMatrix;\n    uniform mat4 uModelMatrix;\n\n    // Varyings (to fragment shader)\n    varying vec3 vPosition;\n    varying vec3 vObjectPosition;  // pre-transform aPosition; used by procedural noise materials\n                                   // that need a stable, model-space sample point\n    varying vec3 vNormal;\n    varying vec3 vTangent;\n    varying vec3 vBitangent;\n    varying vec2 vUV;\n\n    void main() {\n      // Transform position to world space\n      vec4 worldPos = uModelMatrix * vec4(aPosition, 1.0);\n      vPosition = worldPos.xyz;\n      vObjectPosition = aPosition;\n\n      // Transform normal, tangent, bitangent to world space\n      mat3 normalMatrix = mat3(uModelMatrix);\n      vNormal = normalize(normalMatrix * aNormal);\n      vTangent = normalize(normalMatrix * aTangent);\n      vBitangent = normalize(normalMatrix * aBitangent);\n\n      // Pass through UV\n      vUV = aUV;\n\n      // Calculate final position\n      gl_Position = uProjectionMatrix * uViewMatrix * worldPos;\n    }\n  ", FlowsKt.buildFragmentShader("", "void material(inout MaterialInputs inputs) {\n  prepareMaterial(inputs);\n}", false));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getSettingsDesignMode(ContinuationImpl continuationImpl) {
        RealAccountSettingsFeatureManager$getSettingsDesignMode$1 realAccountSettingsFeatureManager$getSettingsDesignMode$1;
        int i;
        AccountholderAccountRepository$LoadAccountsResult accountholderAccountRepository$LoadAccountsResult;
        if (continuationImpl instanceof RealAccountSettingsFeatureManager$getSettingsDesignMode$1) {
            realAccountSettingsFeatureManager$getSettingsDesignMode$1 = (RealAccountSettingsFeatureManager$getSettingsDesignMode$1) continuationImpl;
            int i2 = realAccountSettingsFeatureManager$getSettingsDesignMode$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realAccountSettingsFeatureManager$getSettingsDesignMode$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realAccountSettingsFeatureManager$getSettingsDesignMode$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realAccountSettingsFeatureManager$getSettingsDesignMode$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealAccountholderAccountRepository realAccountholderAccountRepository = (RealAccountholderAccountRepository) this.provider;
                    realAccountSettingsFeatureManager$getSettingsDesignMode$1.label = 1;
                    obj = realAccountholderAccountRepository.loadAccounts(realAccountSettingsFeatureManager$getSettingsDesignMode$1);
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
                accountholderAccountRepository$LoadAccountsResult = (AccountholderAccountRepository$LoadAccountsResult) obj;
                if (accountholderAccountRepository$LoadAccountsResult instanceof AccountholderAccountRepository$LoadAccountsResult.Successful) {
                    List list = ((AccountholderAccountRepository$LoadAccountsResult.Successful) accountholderAccountRepository$LoadAccountsResult).accounts;
                    if (list.size() > 1) {
                        return new AccountSettingsFeatureManager$SettingsDesignMode.MultiAccount(list);
                    }
                }
                return AccountSettingsFeatureManager$SettingsDesignMode.SingleAccount.INSTANCE;
            }
        }
        realAccountSettingsFeatureManager$getSettingsDesignMode$1 = new RealAccountSettingsFeatureManager$getSettingsDesignMode$1(this, continuationImpl);
        Object obj2 = realAccountSettingsFeatureManager$getSettingsDesignMode$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAccountSettingsFeatureManager$getSettingsDesignMode$1.label;
        if (i != 0) {
        }
        accountholderAccountRepository$LoadAccountsResult = (AccountholderAccountRepository$LoadAccountsResult) obj2;
        if (accountholderAccountRepository$LoadAccountsResult instanceof AccountholderAccountRepository$LoadAccountsResult.Successful) {
        }
        return AccountSettingsFeatureManager$SettingsDesignMode.SingleAccount.INSTANCE;
    }

    public Object importKey(byte[] bArr, String str, RealKeyProvisionCompatibilityChecker$testKeyImportImpl$1 realKeyProvisionCompatibilityChecker$testKeyImportImpl$1) {
        KeyGenParameterSpec build = new KeyGenParameterSpec.Builder("test-wrapping-key", 32).setDigests("SHA-256").setKeySize(2048).build();
        build.getClass();
        WrappedKeyEntry wrappedKeyEntry = new WrappedKeyEntry(bArr, "test-wrapping-key", "RSA/ECB/OAEPPadding", build);
        RealKeyStoreProvider realKeyStoreProvider = (RealKeyStoreProvider) this.provider;
        Object withContext = JobKt.withContext(realKeyStoreProvider.ioContext, new RealKeyStoreProvider$setEntry$2(realKeyStoreProvider, str, wrappedKeyEntry, (Continuation) null, 0), realKeyProvisionCompatibilityChecker$testKeyImportImpl$1);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (withContext != coroutineSingletons) {
            withContext = Unit.INSTANCE;
        }
        return withContext == coroutineSingletons ? withContext : Unit.INSTANCE;
    }

    @Override // coil3.target.Target
    public void onError(Image image) {
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public void onMarkerDrag(Marker marker) {
        Iterator it = ((MapApplier) this.provider).decorations.iterator();
        while (it.hasNext()) {
            MapNode mapNode = (MapNode) it.next();
            if (mapNode instanceof MarkerNode) {
                MarkerNode markerNode = (MarkerNode) mapNode;
                MarkerState markerState = markerNode.markerState;
                if (markerNode.marker.equals(marker)) {
                    LatLng position = marker.getPosition();
                    position.getClass();
                    markerState.setDragging$maps_compose_release(true);
                    markerState.position$delegate.setValue(position);
                    markerState.dragState$delegate.setValue(DragState.DRAG);
                    if (Intrinsics.areEqual(Unit.INSTANCE, Boolean.TRUE)) {
                        return;
                    }
                }
            }
            if (mapNode instanceof InputHandlerNode) {
                Function1 function1 = (Function1) ((InputHandlerNode) mapNode).onMarkerDrag$delegate.getValue();
                if (function1 != null ? Intrinsics.areEqual(function1.invoke(marker), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public void onMarkerDragEnd(Marker marker) {
        Iterator it = ((MapApplier) this.provider).decorations.iterator();
        while (it.hasNext()) {
            MapNode mapNode = (MapNode) it.next();
            if (mapNode instanceof MarkerNode) {
                MarkerNode markerNode = (MarkerNode) mapNode;
                MarkerState markerState = markerNode.markerState;
                if (markerNode.marker.equals(marker)) {
                    LatLng position = marker.getPosition();
                    position.getClass();
                    markerState.setDragging$maps_compose_release(true);
                    markerState.position$delegate.setValue(position);
                    markerState.setDragging$maps_compose_release(false);
                    markerState.dragState$delegate.setValue(DragState.END);
                    if (Intrinsics.areEqual(Unit.INSTANCE, Boolean.TRUE)) {
                        return;
                    }
                }
            }
            if (mapNode instanceof InputHandlerNode) {
                Function1 function1 = (Function1) ((InputHandlerNode) mapNode).onMarkerDragEnd$delegate.getValue();
                if (function1 != null ? Intrinsics.areEqual(function1.invoke(marker), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public void onMarkerDragStart(Marker marker) {
        Iterator it = ((MapApplier) this.provider).decorations.iterator();
        while (it.hasNext()) {
            MapNode mapNode = (MapNode) it.next();
            if (mapNode instanceof MarkerNode) {
                MarkerNode markerNode = (MarkerNode) mapNode;
                MarkerState markerState = markerNode.markerState;
                if (markerNode.marker.equals(marker)) {
                    LatLng position = marker.getPosition();
                    position.getClass();
                    markerState.setDragging$maps_compose_release(true);
                    markerState.position$delegate.setValue(position);
                    markerState.dragState$delegate.setValue(DragState.START);
                    if (Intrinsics.areEqual(Unit.INSTANCE, Boolean.TRUE)) {
                        return;
                    }
                }
            }
            if (mapNode instanceof InputHandlerNode) {
                Function1 function1 = (Function1) ((InputHandlerNode) mapNode).onMarkerDragStart$delegate.getValue();
                if (function1 != null ? Intrinsics.areEqual(function1.invoke(marker), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    @Override // coil3.target.Target
    public void onStart(Image image) {
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public /* synthetic */ void onSuccess(Object obj) {
        switch (this.$r8$classId) {
            case 15:
                ((AndroidLocationSettingsChecker$check$2$1) this.provider).invoke(obj);
                break;
            default:
                ((AndroidLocationSettingsChecker$check$2$1) this.provider).invoke(obj);
                break;
        }
    }

    @Override // com.squareup.cash.graphics.swampgl.components.MaterialPlugin
    public void prepareMaterialInput(MaterialInput materialInput) {
        materialInput.getClass();
        materialInput.baseColor = ((SolidColorPBRMaterial) this.provider).baseColor;
        materialInput.roughness = ((SolidColorPBRMaterial) this.provider).roughness;
        materialInput.metallic = ((SolidColorPBRMaterial) this.provider).metallic;
        materialInput.opacity = ((SolidColorPBRMaterial) this.provider).opacity;
        materialInput.dimmer = ((SolidColorPBRMaterial) this.provider).dimmer;
        materialInput.saturation = ((SolidColorPBRMaterial) this.provider).saturation;
    }

    public float sizeOfBlackWhiteBlackRun(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        double sqrt;
        int i11;
        JCAContext jCAContext;
        int i12;
        int i13 = 1;
        boolean z = Math.abs(i4 - i2) > Math.abs(i3 - i);
        if (z) {
            i6 = i;
            i5 = i2;
            i8 = i3;
            i7 = i4;
        } else {
            i5 = i;
            i6 = i2;
            i7 = i3;
            i8 = i4;
        }
        int abs = Math.abs(i7 - i5);
        int i14 = i8 - i6;
        int abs2 = Math.abs(i14);
        int i15 = 2;
        int i16 = (-abs) / 2;
        int i17 = i5 < i7 ? 1 : -1;
        int i18 = i6 < i8 ? 1 : -1;
        int i19 = i7 + i17;
        int i20 = i5;
        int i21 = i6;
        int i22 = 0;
        while (true) {
            if (i20 == i19) {
                i9 = i5;
                i10 = i15;
                break;
            }
            int i23 = z ? i21 : i20;
            boolean z2 = z;
            int i24 = z ? i20 : i21;
            i9 = i5;
            if (i22 == i13) {
                i11 = i13;
                i12 = i6;
                jCAContext = this;
            } else {
                i11 = 0;
                jCAContext = this;
                i12 = i6;
            }
            if (i11 == ((BitMatrix) jCAContext.provider).get(i23, i24)) {
                if (i22 == 2) {
                    double d = i20 - i9;
                    double d2 = i21 - i12;
                    sqrt = Math.sqrt((d2 * d2) + (d * d));
                    break;
                }
                i22++;
            }
            i16 += abs2;
            if (i16 > 0) {
                if (i21 == i8) {
                    i10 = 2;
                    break;
                }
                i21 += i18;
                i16 -= abs;
            }
            i20 += i17;
            i5 = i9;
            i6 = i12;
            z = z2;
            i13 = 1;
            i15 = 2;
        }
        if (i22 != i10) {
            return Float.NaN;
        }
        double d3 = i19 - i9;
        double d4 = i14;
        sqrt = Math.sqrt((d4 * d4) + (d3 * d3));
        return (float) sqrt;
    }

    public float sizeOfBlackWhiteBlackRunBothWays(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        BitMatrix bitMatrix = (BitMatrix) this.provider;
        float sizeOfBlackWhiteBlackRun = sizeOfBlackWhiteBlackRun(i, i2, i3, i4);
        int i5 = i - (i3 - i);
        int i6 = 0;
        if (i5 < 0) {
            f = i / (i - i5);
            i5 = 0;
        } else {
            int i7 = bitMatrix.width;
            if (i5 >= i7) {
                float f3 = ((i7 - 1) - i) / (i5 - i);
                int i8 = i7 - 1;
                f = f3;
                i5 = i8;
            } else {
                f = 1.0f;
            }
        }
        float f4 = i2;
        int i9 = (int) (f4 - ((i4 - i2) * f));
        if (i9 < 0) {
            f2 = f4 / (i2 - i9);
        } else {
            int i10 = bitMatrix.height;
            if (i9 >= i10) {
                f2 = ((i10 - 1) - i2) / (i9 - i2);
                i6 = i10 - 1;
            } else {
                i6 = i9;
                f2 = 1.0f;
            }
        }
        return (sizeOfBlackWhiteBlackRun(i, i2, (int) (((i5 - i) * f2) + i), i6) + sizeOfBlackWhiteBlackRun) - 1.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: transferFromDependent-eH_QyT8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable m2171transferFromDependenteH_QyT8(ClientScenario clientScenario, String str, String str2, Money money, String str3, ContinuationImpl continuationImpl) {
        RealManagedAccountTransferService$transferFromDependent$1 realManagedAccountTransferService$transferFromDependent$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealManagedAccountTransferService$transferFromDependent$1) {
            realManagedAccountTransferService$transferFromDependent$1 = (RealManagedAccountTransferService$transferFromDependent$1) continuationImpl;
            int i2 = realManagedAccountTransferService$transferFromDependent$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realManagedAccountTransferService$transferFromDependent$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realManagedAccountTransferService$transferFromDependent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realManagedAccountTransferService$transferFromDependent$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AddOrWithdrawMoneyForManagedAccountRequest addOrWithdrawMoneyForManagedAccountRequest = new AddOrWithdrawMoneyForManagedAccountRequest(str2, money, str3, AddOrWithdrawMoneyForManagedAccountRequest.Action.WITHDRAW);
                    AegisService aegisService = (AegisService) this.provider;
                    realManagedAccountTransferService$transferFromDependent$1.label = 1;
                    obj = aegisService.addOrWithdrawMoneyForManagedAccount(clientScenario, str, addOrWithdrawMoneyForManagedAccountRequest, realManagedAccountTransferService$transferFromDependent$1);
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
                    ResponseContext responseContext = ((AddOrWithdrawMoneyForManagedAccountResponse) ((ApiResult.Success) apiResult).response).response_context;
                    if (responseContext != null) {
                        Result.Companion companion = Result.Companion;
                        return responseContext;
                    }
                    Result.Companion companion2 = Result.Companion;
                    return new Result.Failure(new IllegalStateException("No response context"));
                }
                if (apiResult instanceof ApiResult.Failure.NetworkFailure) {
                    Result.Companion companion3 = Result.Companion;
                    return new Result.Failure(((ApiResult.Failure.NetworkFailure) apiResult).error);
                }
                if (apiResult instanceof ApiResult.Failure.HttpFailure) {
                    Result.Companion companion4 = Result.Companion;
                    return new Result.Failure(new Exception("Failed to withdraw money"));
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        realManagedAccountTransferService$transferFromDependent$1 = new RealManagedAccountTransferService$transferFromDependent$1(this, continuationImpl);
        Object obj2 = realManagedAccountTransferService$transferFromDependent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realManagedAccountTransferService$transferFromDependent$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: transferToDependent-eH_QyT8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable m2172transferToDependenteH_QyT8(ClientScenario clientScenario, String str, String str2, Money money, String str3, ContinuationImpl continuationImpl) {
        RealManagedAccountTransferService$transferToDependent$1 realManagedAccountTransferService$transferToDependent$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealManagedAccountTransferService$transferToDependent$1) {
            realManagedAccountTransferService$transferToDependent$1 = (RealManagedAccountTransferService$transferToDependent$1) continuationImpl;
            int i2 = realManagedAccountTransferService$transferToDependent$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realManagedAccountTransferService$transferToDependent$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realManagedAccountTransferService$transferToDependent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realManagedAccountTransferService$transferToDependent$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AddOrWithdrawMoneyForManagedAccountRequest addOrWithdrawMoneyForManagedAccountRequest = new AddOrWithdrawMoneyForManagedAccountRequest(str2, money, str3, AddOrWithdrawMoneyForManagedAccountRequest.Action.ADD);
                    AegisService aegisService = (AegisService) this.provider;
                    realManagedAccountTransferService$transferToDependent$1.label = 1;
                    obj = aegisService.addOrWithdrawMoneyForManagedAccount(clientScenario, str, addOrWithdrawMoneyForManagedAccountRequest, realManagedAccountTransferService$transferToDependent$1);
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
                    ResponseContext responseContext = ((AddOrWithdrawMoneyForManagedAccountResponse) ((ApiResult.Success) apiResult).response).response_context;
                    if (responseContext != null) {
                        Result.Companion companion = Result.Companion;
                        return responseContext;
                    }
                    Result.Companion companion2 = Result.Companion;
                    return new Result.Failure(new IllegalStateException("No response context"));
                }
                if (apiResult instanceof ApiResult.Failure.NetworkFailure) {
                    Result.Companion companion3 = Result.Companion;
                    return new Result.Failure(((ApiResult.Failure.NetworkFailure) apiResult).error);
                }
                if (apiResult instanceof ApiResult.Failure.HttpFailure) {
                    Result.Companion companion4 = Result.Companion;
                    return new Result.Failure(new Exception("Failed to add money"));
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        realManagedAccountTransferService$transferToDependent$1 = new RealManagedAccountTransferService$transferToDependent$1(this, continuationImpl);
        Object obj2 = realManagedAccountTransferService$transferToDependent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realManagedAccountTransferService$transferToDependent$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }

    @Override // com.google.android.play.core.appupdate.internal.zzaf
    public Object zza() {
        zzg zzgVar = (zzg) ((zzaf) this.provider).zza();
        if (zzgVar != null) {
            return zzgVar;
        }
        a$$ExternalSyntheticBUOutline0.m$2("Cannot return null from a non-@Nullable @Provides method");
        return null;
    }

    @Override // coil3.target.Target
    public void onSuccess(Image image) {
        Bitmap bitmap;
        MutableState mutableState = (MutableState) this.provider;
        bitmap = Image_androidKt.toBitmap(image, image.getWidth(), image.getHeight());
        mutableState.setValue(bitmap);
    }

    public /* synthetic */ JCAContext(byte b, int i) {
        this.$r8$classId = i;
    }

    public /* synthetic */ JCAContext(Object obj, int i) {
        this.$r8$classId = i;
        this.provider = obj;
    }

    public JCAContext(SyncValueReader syncValueReader, RealFamilyAccountsManager realFamilyAccountsManager) {
        this.$r8$classId = 19;
        DerivedStateFlow isActivelySponsored = realFamilyAccountsManager.isActivelySponsored();
        this.provider = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(syncValueReader.getFirstValueOrDefault(AndroidSyncValueSpecs.SponsorshipCryptoAuthorization, Boolean.FALSE, new FlowStarter$$ExternalSyntheticLambda0(11)), isActivelySponsored, new FileBlockerView$6$2$1(3, null, 1), 0);
    }

    public JCAContext() {
        this.$r8$classId = 12;
        this.provider = new ConcurrentLinkedDeque();
    }

    public JCAContext(int i) {
        this.$r8$classId = 0;
        this.provider = null;
    }

    public JCAContext(SolidColorPBRMaterial solidColorPBRMaterial) {
        this.$r8$classId = 18;
        this.provider = solidColorPBRMaterial;
        solidColorPBRMaterial.markReady();
    }

    public JCAContext(SplitButtons splitButtons, AppCompatImageButton appCompatImageButton) {
        this.$r8$classId = 17;
        splitButtons.getClass();
        this.provider = splitButtons;
    }
}
