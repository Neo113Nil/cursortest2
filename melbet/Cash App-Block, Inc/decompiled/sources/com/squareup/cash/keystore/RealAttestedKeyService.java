package com.squareup.cash.keystore;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.JsonFeatureFlags$GenerationAttemptMri;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.keystore.AttestedKeyService;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.GenericDatadogError;
import com.squareup.protos.cash.security.mri.api.v1.AttestedKeySigningData;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Charsets;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import retrofit2.OkHttpCall;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealAttestedKeyService implements AttestedKeyService {
    public final List KEY_GENERATION_ATTEMPTS;
    public final boolean isDevicePropertiesAvailable;
    public final String keyAlias;
    public final WireAdapter keyLifecycle;
    public final RealKeyStoreProvider keyStore;
    public final OkHttpCall.AnonymousClass1 metrics;
    public final MutexImpl mutex;
    public EglCore state;

    public final class GenerationAttempt {
        public final boolean fromFF;
        public final String identifier;
        public final int keySize;
        public final long timeout;

        /* renamed from: type, reason: collision with root package name */
        public final KeyAlgorithm f1168type;
        public final boolean withDeviceProperties;
        public final boolean withStrongBox;

        public GenerationAttempt(KeyAlgorithm keyAlgorithm, boolean z, boolean z2, int i, long j, boolean z3) {
            this.f1168type = keyAlgorithm;
            this.withStrongBox = z;
            this.withDeviceProperties = z2;
            this.keySize = i;
            this.timeout = j;
            this.fromFF = z3;
            String name = keyAlgorithm.name();
            Duration.Companion companion = Duration.Companion;
            long m4176toLongimpl = Duration.m4176toLongimpl(j, DurationUnit.SECONDS);
            StringBuilder m = Recorder$$ExternalSyntheticOutline2.m("attempt/type:", i, name, "/size:", "/strong:");
            re$$ExternalSyntheticOutline0.m(m, z, "/prop:", z2, "/time:");
            m.append(m4176toLongimpl);
            m.append("/ff:");
            m.append(z3);
            this.identifier = m.toString();
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
        /* renamed from: attemptGeneration-IoAF18A, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object m3590attemptGenerationIoAF18A(ContinuationImpl continuationImpl) {
            RealAttestedKeyService$GenerationAttempt$attemptGeneration$1 realAttestedKeyService$GenerationAttempt$attemptGeneration$1;
            int i;
            String str;
            long j;
            RealAttestedKeyService realAttestedKeyService = RealAttestedKeyService.this;
            OkHttpCall.AnonymousClass1 anonymousClass1 = realAttestedKeyService.metrics;
            try {
                if (continuationImpl instanceof RealAttestedKeyService$GenerationAttempt$attemptGeneration$1) {
                    realAttestedKeyService$GenerationAttempt$attemptGeneration$1 = (RealAttestedKeyService$GenerationAttempt$attemptGeneration$1) continuationImpl;
                    int i2 = realAttestedKeyService$GenerationAttempt$attemptGeneration$1.label;
                    if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                        realAttestedKeyService$GenerationAttempt$attemptGeneration$1.label = i2 - PKIFailureInfo.systemUnavail;
                        Object obj = realAttestedKeyService$GenerationAttempt$attemptGeneration$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = realAttestedKeyService$GenerationAttempt$attemptGeneration$1.label;
                        Continuation continuation = null;
                        str = this.identifier;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj);
                            long currentTimeMillis = System.currentTimeMillis();
                            long j2 = this.timeout;
                            MusicPresenter$models$2$1 musicPresenter$models$2$1 = new MusicPresenter$models$2$1(realAttestedKeyService, this, continuation, 6);
                            realAttestedKeyService$GenerationAttempt$attemptGeneration$1.J$0 = currentTimeMillis;
                            realAttestedKeyService$GenerationAttempt$attemptGeneration$1.label = 1;
                            if (JobKt.m4184withTimeoutKLykuaI(j2, musicPresenter$models$2$1, realAttestedKeyService$GenerationAttempt$attemptGeneration$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            j = currentTimeMillis;
                        } else {
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            j = realAttestedKeyService$GenerationAttempt$attemptGeneration$1.J$0;
                            SafeTrace.throwOnFailure(obj);
                        }
                        ((RealObservabilityManager) anonymousClass1.val$callback).logEvent("generateKeyAttemptSuccess", MapsKt__MapsKt.plus(MapsKt__MapsJVMKt.mapOf(new Pair("elapsedTimeInMillis", String.valueOf(System.currentTimeMillis() - j))), OkHttpCall.AnonymousClass1.getMetadataForAttempt(realAttestedKeyService, this)));
                        Timber.Forest forest = Timber.Forest;
                        forest.tag("attestedKey");
                        forest.d("Attested key generation %s succeeded.", str);
                        Result.Companion companion = Result.Companion;
                        return Unit.INSTANCE;
                    }
                }
                if (i != 0) {
                }
                ((RealObservabilityManager) anonymousClass1.val$callback).logEvent("generateKeyAttemptSuccess", MapsKt__MapsKt.plus(MapsKt__MapsJVMKt.mapOf(new Pair("elapsedTimeInMillis", String.valueOf(System.currentTimeMillis() - j))), OkHttpCall.AnonymousClass1.getMetadataForAttempt(realAttestedKeyService, this)));
                Timber.Forest forest2 = Timber.Forest;
                forest2.tag("attestedKey");
                forest2.d("Attested key generation %s succeeded.", str);
                Result.Companion companion2 = Result.Companion;
                return Unit.INSTANCE;
            } catch (Exception e) {
                if ((e instanceof CancellationException) && !JobKt.isActive(realAttestedKeyService$GenerationAttempt$attemptGeneration$1.getContext())) {
                    Timber.Forest forest3 = Timber.Forest;
                    forest3.tag("attestedKey");
                    forest3.d("Attested key generation %s failed due to caller cancellation.", str);
                    throw e;
                }
                Timber.Forest forest4 = Timber.Forest;
                forest4.tag("attestedKey");
                forest4.d("Attested key generation %s failed.", str);
                ((ErrorReporter) anonymousClass1.this$0).report(new GenericDatadogError(SetsKt__SetsJVMKt.setOf(ErrorFeature.AttestedKey.INSTANCE), "generateKeyAttemptError", MapsKt__MapsJVMKt.mapOf(new Pair("AttestedKey", MapsKt__MapsKt.plus(Thread$State$EnumUnboxingLocalUtility.m("isTimeout", String.valueOf(e instanceof TimeoutCancellationException)), OkHttpCall.AnonymousClass1.getMetadataForAttempt(realAttestedKeyService, this)))), e), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                Result.Companion companion3 = Result.Companion;
                return new Result.Failure(e);
            }
            realAttestedKeyService$GenerationAttempt$attemptGeneration$1 = new RealAttestedKeyService$GenerationAttempt$attemptGeneration$1(this, continuationImpl);
            Object obj2 = realAttestedKeyService$GenerationAttempt$attemptGeneration$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = realAttestedKeyService$GenerationAttempt$attemptGeneration$1.label;
            Continuation continuation2 = null;
            str = this.identifier;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class KeyAlgorithm {
        public static final /* synthetic */ EnumEntriesList $ENTRIES;
        public static final /* synthetic */ KeyAlgorithm[] $VALUES;
        public static final Companion Companion;
        public static final KeyAlgorithm P256;
        public static final KeyAlgorithm RSA;

        public final class Companion {
        }

        static {
            KeyAlgorithm keyAlgorithm = new KeyAlgorithm("P256", 0);
            P256 = keyAlgorithm;
            KeyAlgorithm keyAlgorithm2 = new KeyAlgorithm("RSA", 1);
            RSA = keyAlgorithm2;
            KeyAlgorithm[] keyAlgorithmArr = {keyAlgorithm, keyAlgorithm2};
            $VALUES = keyAlgorithmArr;
            $ENTRIES = new EnumEntriesList(keyAlgorithmArr);
            Companion = new Companion();
        }

        public static KeyAlgorithm valueOf(String str) {
            return (KeyAlgorithm) Enum.valueOf(KeyAlgorithm.class, str);
        }

        public static KeyAlgorithm[] values() {
            return (KeyAlgorithm[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.ArrayList] */
    public RealAttestedKeyService(OkHttpCall.AnonymousClass1 anonymousClass1, RealKeyStoreProvider realKeyStoreProvider, FeatureFlagManager featureFlagManager, String str) {
        Iterable listOf;
        Object obj;
        AttestedKeyService.GenerationMode generationMode = AttestedKeyService.GenerationMode.RECREATE_AT_STARTUP;
        this.metrics = anonymousClass1;
        this.keyStore = realKeyStoreProvider;
        this.keyAlias = str;
        this.mutex = new MutexImpl();
        this.keyLifecycle = new WireAdapter(this);
        this.isDevicePropertiesAvailable = Build.VERSION.SDK_INT >= 31;
        try {
            Iterable<JsonFeatureFlags$GenerationAttemptMri.GenerationAttempt> iterable = (Iterable) ((FeatureFlag$JsonFeatureFlag.Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(JsonFeatureFlags$GenerationAttemptMri.INSTANCE)).value;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
            for (JsonFeatureFlags$GenerationAttemptMri.GenerationAttempt generationAttempt : iterable) {
                KeyAlgorithm.Companion companion = KeyAlgorithm.Companion;
                String str2 = generationAttempt.f1133type;
                companion.getClass();
                Iterator it = KeyAlgorithm.$ENTRIES.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (Intrinsics.areEqual(((KeyAlgorithm) obj).name(), str2)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                if (obj == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                KeyAlgorithm keyAlgorithm = (KeyAlgorithm) obj;
                boolean z = generationAttempt.withStrongBox;
                boolean z2 = generationAttempt.withDeviceProperties;
                int i = generationAttempt.keySize;
                Duration.Companion companion2 = Duration.Companion;
                arrayList.add(new GenerationAttempt(keyAlgorithm, z, z2, i, DurationKt.toDuration(generationAttempt.timeout, DurationUnit.SECONDS), true));
            }
            listOf = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                GenerationAttempt generationAttempt2 = (GenerationAttempt) next;
                if (!generationAttempt2.withStrongBox || this.keyStore.context.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                    if (!generationAttempt2.withDeviceProperties || this.isDevicePropertiesAvailable) {
                        listOf.add(next);
                    }
                }
            }
        } catch (Exception unused) {
            KeyAlgorithm keyAlgorithm2 = KeyAlgorithm.P256;
            boolean hasSystemFeature = this.keyStore.context.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore");
            Duration.Companion companion3 = Duration.Companion;
            DurationUnit durationUnit = DurationUnit.SECONDS;
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new GenerationAttempt[]{new GenerationAttempt(keyAlgorithm2, hasSystemFeature, true, 256, DurationKt.toDuration(10, durationUnit), false), new GenerationAttempt(keyAlgorithm2, this.keyStore.context.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore"), false, 256, DurationKt.toDuration(10, durationUnit), false)});
        }
        Timber.Forest forest = Timber.Forest;
        forest.tag("attestedKey");
        Iterable iterable2 = listOf;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
        Iterator it3 = iterable2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((GenerationAttempt) it3.next()).identifier);
        }
        forest.d("Attested key generation attempts: %s", arrayList2);
        this.KEY_GENERATION_ATTEMPTS = listOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Unit] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$eraseKey(RealAttestedKeyService realAttestedKeyService, ContinuationImpl continuationImpl) {
        RealAttestedKeyService$eraseKey$1 realAttestedKeyService$eraseKey$1;
        int i;
        OkHttpCall.AnonymousClass1 anonymousClass1 = realAttestedKeyService.metrics;
        try {
            if (continuationImpl instanceof RealAttestedKeyService$eraseKey$1) {
                realAttestedKeyService$eraseKey$1 = (RealAttestedKeyService$eraseKey$1) continuationImpl;
                int i2 = realAttestedKeyService$eraseKey$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    realAttestedKeyService$eraseKey$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = realAttestedKeyService$eraseKey$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realAttestedKeyService$eraseKey$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        anonymousClass1.recordAction(realAttestedKeyService, AttestedKeyMetrics$ActionType.ERASE_KEY);
                        RealKeyStoreProvider realKeyStoreProvider = realAttestedKeyService.keyStore;
                        String str = realAttestedKeyService.keyAlias;
                        realAttestedKeyService$eraseKey$1.label = 1;
                        if (realKeyStoreProvider.deleteEntry(str, realAttestedKeyService$eraseKey$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    realAttestedKeyService = Unit.INSTANCE;
                    return realAttestedKeyService;
                }
            }
            if (i != 0) {
            }
            realAttestedKeyService = Unit.INSTANCE;
            return realAttestedKeyService;
        } catch (Exception e) {
            anonymousClass1.recordError(realAttestedKeyService, AttestedKeyMetrics$ErrorType.ERASE_KEY, e);
            throw e;
        }
        realAttestedKeyService$eraseKey$1 = new RealAttestedKeyService$eraseKey$1(realAttestedKeyService, continuationImpl);
        Object obj2 = realAttestedKeyService$eraseKey$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAttestedKeyService$eraseKey$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        if (r5.fetchFromKeyStore(r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        if (r5.generateKey(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$generateAndFetchWhenKeyIsMissing(RealAttestedKeyService realAttestedKeyService, ContinuationImpl continuationImpl) {
        RealAttestedKeyService$generateAndFetchWhenKeyIsMissing$1 realAttestedKeyService$generateAndFetchWhenKeyIsMissing$1;
        int i;
        if (continuationImpl instanceof RealAttestedKeyService$generateAndFetchWhenKeyIsMissing$1) {
            realAttestedKeyService$generateAndFetchWhenKeyIsMissing$1 = (RealAttestedKeyService$generateAndFetchWhenKeyIsMissing$1) continuationImpl;
            int i2 = realAttestedKeyService$generateAndFetchWhenKeyIsMissing$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realAttestedKeyService$generateAndFetchWhenKeyIsMissing$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realAttestedKeyService$generateAndFetchWhenKeyIsMissing$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realAttestedKeyService$generateAndFetchWhenKeyIsMissing$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realAttestedKeyService$generateAndFetchWhenKeyIsMissing$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                realAttestedKeyService$generateAndFetchWhenKeyIsMissing$1.label = 2;
            }
        }
        realAttestedKeyService$generateAndFetchWhenKeyIsMissing$1 = new RealAttestedKeyService$generateAndFetchWhenKeyIsMissing$1(realAttestedKeyService, continuationImpl);
        Object obj3 = realAttestedKeyService$generateAndFetchWhenKeyIsMissing$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAttestedKeyService$generateAndFetchWhenKeyIsMissing$1.label;
        if (i != 0) {
        }
        realAttestedKeyService$generateAndFetchWhenKeyIsMissing$1.label = 2;
    }

    public static final KeyGenParameterSpec.Builder access$getKeyParameterSpecBuilder(RealAttestedKeyService realAttestedKeyService, boolean z, boolean z2, Integer num) {
        String str = realAttestedKeyService.keyAlias;
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(str, 4);
        builder.setDigests("SHA-256");
        byte[] bytes = "attested_key_challenge_".concat(str).getBytes(Charsets.UTF_8);
        bytes.getClass();
        builder.setAttestationChallenge(bytes);
        builder.setIsStrongBoxBacked(z);
        if (Build.VERSION.SDK_INT >= 31) {
            builder.setDevicePropertiesAttestationIncluded(z2);
        }
        if (num != null) {
            builder.setKeySize(num.intValue());
        }
        return builder;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc A[Catch: Exception -> 0x0037, TryCatch #1 {Exception -> 0x0037, blocks: (B:12:0x0033, B:13:0x0071, B:16:0x0077, B:18:0x0083, B:19:0x0090, B:27:0x00a8, B:28:0x00ad, B:29:0x0086, B:31:0x008e, B:32:0x00ae, B:33:0x00c3, B:34:0x00c4, B:35:0x00cb, B:36:0x00cc, B:37:0x00d3, B:40:0x0040, B:41:0x005b, B:46:0x004c, B:21:0x0099), top: B:7:0x002b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchFromKeyStore(ContinuationImpl continuationImpl) {
        RealAttestedKeyService$fetchFromKeyStore$1 realAttestedKeyService$fetchFromKeyStore$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        OkHttpCall.AnonymousClass1 anonymousClass1;
        Object withContext;
        PrivateKey privateKey;
        KeyAlgorithm keyAlgorithm;
        RealKeyStoreProvider realKeyStoreProvider = this.keyStore;
        CoroutineContext coroutineContext = realKeyStoreProvider.ioContext;
        try {
            if (continuationImpl instanceof RealAttestedKeyService$fetchFromKeyStore$1) {
                realAttestedKeyService$fetchFromKeyStore$1 = (RealAttestedKeyService$fetchFromKeyStore$1) continuationImpl;
                int i2 = realAttestedKeyService$fetchFromKeyStore$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    realAttestedKeyService$fetchFromKeyStore$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = realAttestedKeyService$fetchFromKeyStore$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realAttestedKeyService$fetchFromKeyStore$1.label;
                    Continuation continuation = null;
                    String str = this.keyAlias;
                    anonymousClass1 = this.metrics;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        anonymousClass1.recordAction(this, AttestedKeyMetrics$ActionType.KEYSTORE_FETCH);
                        realAttestedKeyService$fetchFromKeyStore$1.label = 1;
                        obj = JobKt.withContext(coroutineContext, new RealKeyStoreProvider$getKey$2(realKeyStoreProvider, str, continuation, 0), realAttestedKeyService$fetchFromKeyStore$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            privateKey = realAttestedKeyService$fetchFromKeyStore$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                            List list = (List) obj;
                            if (privateKey != null) {
                                throw new IllegalStateException("Key was not fetched correctly.");
                            }
                            if (list == null) {
                                throw new IllegalStateException("Certificate chain was not fetched correctly.");
                            }
                            String algorithm = privateKey.getAlgorithm();
                            if (Intrinsics.areEqual(algorithm, "RSA")) {
                                keyAlgorithm = KeyAlgorithm.RSA;
                            } else {
                                if (!Intrinsics.areEqual(algorithm, "EC")) {
                                    throw new IllegalStateException("Unsupported key algorithm " + privateKey.getAlgorithm());
                                }
                                keyAlgorithm = KeyAlgorithm.P256;
                            }
                            EglCore eglCore = new EglCore(19, privateKey, list, keyAlgorithm);
                            this.state = eglCore;
                            try {
                                initSign(eglCore.getKeyAlgorithm(), eglCore.getKeyHandler());
                                return Unit.INSTANCE;
                            } catch (Exception e) {
                                anonymousClass1.recordError(this, AttestedKeyMetrics$ErrorType.UNUSABLE_KEY, e);
                                throw e;
                            }
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    PrivateKey privateKey2 = (PrivateKey) obj;
                    realAttestedKeyService$fetchFromKeyStore$1.L$0 = privateKey2;
                    realAttestedKeyService$fetchFromKeyStore$1.label = 2;
                    withContext = JobKt.withContext(coroutineContext, new RealKeyStoreProvider$getKey$2(realKeyStoreProvider, str, continuation, 3), realAttestedKeyService$fetchFromKeyStore$1);
                    if (withContext != coroutineSingletons) {
                        privateKey = privateKey2;
                        obj = withContext;
                        List list2 = (List) obj;
                        if (privateKey != null) {
                        }
                    }
                    return coroutineSingletons;
                }
            }
            if (i != 0) {
            }
            PrivateKey privateKey22 = (PrivateKey) obj;
            realAttestedKeyService$fetchFromKeyStore$1.L$0 = privateKey22;
            realAttestedKeyService$fetchFromKeyStore$1.label = 2;
            withContext = JobKt.withContext(coroutineContext, new RealKeyStoreProvider$getKey$2(realKeyStoreProvider, str, continuation, 3), realAttestedKeyService$fetchFromKeyStore$1);
            if (withContext != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Exception e2) {
            anonymousClass1.recordError(this, AttestedKeyMetrics$ErrorType.KEYSTORE_FETCH, e2);
            throw e2;
        }
        realAttestedKeyService$fetchFromKeyStore$1 = new RealAttestedKeyService$fetchFromKeyStore$1(this, continuationImpl);
        Object obj2 = realAttestedKeyService$fetchFromKeyStore$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAttestedKeyService$fetchFromKeyStore$1.label;
        Continuation continuation2 = null;
        String str2 = this.keyAlias;
        anonymousClass1 = this.metrics;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0084 A[Catch: CancellationException -> 0x0034, TryCatch #0 {CancellationException -> 0x0034, blocks: (B:11:0x002c, B:12:0x007e, B:14:0x0084, B:18:0x0089, B:20:0x005c, B:22:0x0062, B:31:0x008f, B:37:0x0052), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089 A[Catch: CancellationException -> 0x0034, TryCatch #0 {CancellationException -> 0x0034, blocks: (B:11:0x002c, B:12:0x007e, B:14:0x0084, B:18:0x0089, B:20:0x005c, B:22:0x0062, B:31:0x008f, B:37:0x0052), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[Catch: CancellationException -> 0x0034, TryCatch #0 {CancellationException -> 0x0034, blocks: (B:11:0x002c, B:12:0x007e, B:14:0x0084, B:18:0x0089, B:20:0x005c, B:22:0x0062, B:31:0x008f, B:37:0x0052), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, kotlin.Unit] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007b -> B:12:0x007e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object generateKey(ContinuationImpl continuationImpl) {
        RealAttestedKeyService$generateKey$1 realAttestedKeyService$generateKey$1;
        int i;
        OkHttpCall.AnonymousClass1 anonymousClass1;
        Ref$ObjectRef ref$ObjectRef;
        int i2;
        Iterator it;
        try {
            if (continuationImpl instanceof RealAttestedKeyService$generateKey$1) {
                realAttestedKeyService$generateKey$1 = (RealAttestedKeyService$generateKey$1) continuationImpl;
                int i3 = realAttestedKeyService$generateKey$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    realAttestedKeyService$generateKey$1.label = i3 - PKIFailureInfo.systemUnavail;
                    Object obj = realAttestedKeyService$generateKey$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realAttestedKeyService$generateKey$1.label;
                    anonymousClass1 = this.metrics;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        anonymousClass1.recordAction(this, AttestedKeyMetrics$ActionType.GENERATE_KEY);
                        List list = this.KEY_GENERATION_ATTEMPTS;
                        if (list.isEmpty()) {
                            Exception illegalStateException = new IllegalStateException("No key generation attempts were available.");
                            anonymousClass1.recordError(this, AttestedKeyMetrics$ErrorType.GENERATE_KEY, illegalStateException);
                            throw illegalStateException;
                        }
                        ref$ObjectRef = new Ref$ObjectRef();
                        i2 = 0;
                        it = list.iterator();
                        if (it.hasNext()) {
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = realAttestedKeyService$generateKey$1.I$0;
                        it = realAttestedKeyService$generateKey$1.L$2;
                        ref$ObjectRef = realAttestedKeyService$generateKey$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        Object m3590attemptGenerationIoAF18A = ((Result) obj).value;
                        Result.Companion companion = Result.Companion;
                        if (!(m3590attemptGenerationIoAF18A instanceof Result.Failure)) {
                            Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(m3590attemptGenerationIoAF18A);
                            if (m4120exceptionOrNullimpl != null) {
                                ref$ObjectRef.element = (Exception) m4120exceptionOrNullimpl;
                            }
                            if (it.hasNext()) {
                                Object obj2 = ref$ObjectRef.element;
                                if (obj2 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$1("All key generation attempts failed unexpectedly.");
                                    return null;
                                }
                                Exception exc = (Exception) obj2;
                                anonymousClass1.recordError(this, AttestedKeyMetrics$ErrorType.GENERATE_KEY, exc);
                                throw exc;
                            }
                            GenerationAttempt generationAttempt = (GenerationAttempt) it.next();
                            JobKt.ensureActive(realAttestedKeyService$generateKey$1.getContext());
                            realAttestedKeyService$generateKey$1.L$0 = ref$ObjectRef;
                            realAttestedKeyService$generateKey$1.L$2 = it;
                            realAttestedKeyService$generateKey$1.I$0 = i2;
                            realAttestedKeyService$generateKey$1.label = 1;
                            m3590attemptGenerationIoAF18A = generationAttempt.m3590attemptGenerationIoAF18A(realAttestedKeyService$generateKey$1);
                            if (m3590attemptGenerationIoAF18A == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            Result.Companion companion2 = Result.Companion;
                            if (!(m3590attemptGenerationIoAF18A instanceof Result.Failure)) {
                                this = Unit.INSTANCE;
                                return this;
                            }
                        }
                    }
                }
            }
            if (i != 0) {
            }
        } catch (CancellationException e) {
            anonymousClass1.recordError(this, AttestedKeyMetrics$ErrorType.GENERATE_KEY_CALLER_TIMEOUT, e);
            throw JobKt.CancellationException("Key generation cancelled due to caller cancellation.", e);
        }
        realAttestedKeyService$generateKey$1 = new RealAttestedKeyService$generateKey$1(this, continuationImpl);
        Object obj3 = realAttestedKeyService$generateKey$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAttestedKeyService$generateKey$1.label;
        anonymousClass1 = this.metrics;
    }

    public final Signature initSign(KeyAlgorithm keyAlgorithm, PrivateKey privateKey) {
        Signature signature;
        int ordinal = keyAlgorithm.ordinal();
        if (ordinal == 0) {
            signature = Signature.getInstance("SHA256withECDSA");
            signature.getClass();
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            signature = Signature.getInstance("SHA256withRSA");
            signature.getClass();
        }
        signature.initSign(privateKey);
        return signature;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(12:5|6|7|(1:(1:(1:(6:12|13|14|15|16|17)(2:23|24))(5:25|26|27|28|29))(1:45))(2:55|(2:57|58)(3:59|(1:61)|31))|46|47|(1:49)(1:54)|(3:51|(2:53|31)|29)|32|15|16|17))|63|6|7|(0)(0)|46|47|(0)(0)|(0)|32|15|16|17|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
    
        if (r10.initializeAndLoadKey(r0) != r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a3, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a4, code lost:
    
        r9 = r11;
        r11 = r10;
        r10 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009e, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
    
        r9 = r11;
        r11 = r10;
        r10 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007e A[Catch: all -> 0x009e, Exception -> 0x00a3, TryCatch #5 {Exception -> 0x00a3, all -> 0x009e, blocks: (B:29:0x008d, B:47:0x0076, B:51:0x007e), top: B:46:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.squareup.cash.keystore.RealAttestedKeyService] */
    /* JADX WARN: Type inference failed for: r10v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r8v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* renamed from: prepare-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3588prepareIoAF18A(ContinuationImpl continuationImpl) {
        RealAttestedKeyService$prepare$1 realAttestedKeyService$prepare$1;
        int i;
        boolean z;
        MutexImpl mutexImpl;
        int i2;
        Exception e;
        Mutex mutex;
        Object failure;
        try {
            if (continuationImpl instanceof RealAttestedKeyService$prepare$1) {
                realAttestedKeyService$prepare$1 = (RealAttestedKeyService$prepare$1) continuationImpl;
                int i3 = realAttestedKeyService$prepare$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    realAttestedKeyService$prepare$1.label = i3 - PKIFailureInfo.systemUnavail;
                    Object obj = realAttestedKeyService$prepare$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realAttestedKeyService$prepare$1.label;
                    int i4 = 0;
                    z = true;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (this.state != null) {
                            Result.Companion companion = Result.Companion;
                            return Unit.INSTANCE;
                        }
                        mutexImpl = this.mutex;
                        realAttestedKeyService$prepare$1.L$0 = mutexImpl;
                        realAttestedKeyService$prepare$1.I$0 = 0;
                        realAttestedKeyService$prepare$1.label = 1;
                        if (mutexImpl.lock(realAttestedKeyService$prepare$1) != coroutineSingletons) {
                            i2 = 0;
                        }
                        return coroutineSingletons;
                    }
                    if (i == 1) {
                        i2 = realAttestedKeyService$prepare$1.I$0;
                        ?? r8 = realAttestedKeyService$prepare$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        mutexImpl = r8;
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            mutex = realAttestedKeyService$prepare$1.L$0;
                            try {
                                SafeTrace.throwOnFailure(obj);
                                Result.Companion companion2 = Result.Companion;
                                failure = Unit.INSTANCE;
                            } catch (Exception e2) {
                                e = e2;
                                Result.Companion companion3 = Result.Companion;
                                failure = new Result.Failure(e);
                                mutex.unlock(null);
                                return failure;
                            }
                            mutex.unlock(null);
                            return failure;
                        }
                        i4 = realAttestedKeyService$prepare$1.I$1;
                        i2 = realAttestedKeyService$prepare$1.I$0;
                        ?? r5 = realAttestedKeyService$prepare$1.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            mutexImpl = r5;
                            WireAdapter wireAdapter = this.keyLifecycle;
                            realAttestedKeyService$prepare$1.L$0 = mutexImpl;
                            realAttestedKeyService$prepare$1.I$0 = i2;
                            realAttestedKeyService$prepare$1.I$1 = i4;
                            realAttestedKeyService$prepare$1.label = 3;
                        } catch (Exception e3) {
                            e = e3;
                            mutex = r5;
                            Result.Companion companion32 = Result.Companion;
                            failure = new Result.Failure(e);
                            mutex.unlock(null);
                            return failure;
                        } catch (Throwable th) {
                            th = th;
                            this = r5;
                            this.unlock(null);
                            throw th;
                        }
                    }
                    if (this.state != null) {
                        z = false;
                    }
                    if (!z) {
                        realAttestedKeyService$prepare$1.L$0 = mutexImpl;
                        realAttestedKeyService$prepare$1.I$0 = i2;
                        realAttestedKeyService$prepare$1.I$1 = 0;
                        realAttestedKeyService$prepare$1.label = 2;
                        if (prepareKeyStore(realAttestedKeyService$prepare$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        WireAdapter wireAdapter2 = this.keyLifecycle;
                        realAttestedKeyService$prepare$1.L$0 = mutexImpl;
                        realAttestedKeyService$prepare$1.I$0 = i2;
                        realAttestedKeyService$prepare$1.I$1 = i4;
                        realAttestedKeyService$prepare$1.label = 3;
                    }
                    mutex = mutexImpl;
                    Result.Companion companion22 = Result.Companion;
                    failure = Unit.INSTANCE;
                    mutex.unlock(null);
                    return failure;
                }
            }
            if (i != 0) {
            }
            if (this.state != null) {
            }
            if (!z) {
            }
            mutex = mutexImpl;
            Result.Companion companion222 = Result.Companion;
            failure = Unit.INSTANCE;
            mutex.unlock(null);
            return failure;
        } catch (Throwable th2) {
            th = th2;
        }
        realAttestedKeyService$prepare$1 = new RealAttestedKeyService$prepare$1(this, continuationImpl);
        Object obj2 = realAttestedKeyService$prepare$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAttestedKeyService$prepare$1.label;
        int i42 = 0;
        z = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Unit] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object prepareKeyStore(ContinuationImpl continuationImpl) {
        RealAttestedKeyService$prepareKeyStore$1 realAttestedKeyService$prepareKeyStore$1;
        int i;
        try {
            if (continuationImpl instanceof RealAttestedKeyService$prepareKeyStore$1) {
                realAttestedKeyService$prepareKeyStore$1 = (RealAttestedKeyService$prepareKeyStore$1) continuationImpl;
                int i2 = realAttestedKeyService$prepareKeyStore$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    realAttestedKeyService$prepareKeyStore$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = realAttestedKeyService$prepareKeyStore$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realAttestedKeyService$prepareKeyStore$1.label;
                    Continuation continuation = null;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealKeyStoreProvider realKeyStoreProvider = this.keyStore;
                        realAttestedKeyService$prepareKeyStore$1.label = 1;
                        if (JobKt.withContext(realKeyStoreProvider.ioContext, new RealKeyStoreProvider$load$2(realKeyStoreProvider, continuation, 0), realAttestedKeyService$prepareKeyStore$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    this = Unit.INSTANCE;
                    return this;
                }
            }
            if (i != 0) {
            }
            this = Unit.INSTANCE;
            return this;
        } catch (Exception e) {
            this.metrics.recordError(this, AttestedKeyMetrics$ErrorType.KEYSTORE_LOAD, e);
            throw e;
        }
        realAttestedKeyService$prepareKeyStore$1 = new RealAttestedKeyService$prepareKeyStore$1(this, continuationImpl);
        Object obj2 = realAttestedKeyService$prepareKeyStore$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAttestedKeyService$prepareKeyStore$1.label;
        Continuation continuation2 = null;
    }

    /* renamed from: sign-gIAlu-s, reason: not valid java name */
    public final Serializable m3589signgIAlus(byte[] bArr) {
        ArrayList arrayList;
        if (this.state == null) {
            Result.Companion companion = Result.Companion;
            return new Result.Failure(new AttestedKeyService.ServiceNotAvailable());
        }
        try {
            Result.Companion companion2 = Result.Companion;
            String str = this.keyAlias;
            EglCore eglCore = this.state;
            if (eglCore != null) {
                List certificateChain = eglCore.getCertificateChain();
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(certificateChain, 10));
                Iterator it = certificateChain.iterator();
                while (it.hasNext()) {
                    arrayList.add(((X509Certificate) it.next()).getEncoded());
                }
            } else {
                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                arrayList = null;
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] bArr2 = (byte[]) it2.next();
                ByteString.Companion companion3 = ByteString.Companion;
                arrayList2.add(ByteString.Companion.of$default(bArr2));
            }
            ByteString.Companion companion4 = ByteString.Companion;
            OkHttpCall.AnonymousClass1 anonymousClass1 = this.metrics;
            anonymousClass1.recordAction(this, AttestedKeyMetrics$ActionType.SIGN);
            try {
                EglCore eglCore2 = this.state;
                if (eglCore2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Signature initSign = initSign(eglCore2.getKeyAlgorithm(), eglCore2.getKeyHandler());
                initSign.update(bArr);
                byte[] sign = initSign.sign();
                sign.getClass();
                return new AttestedKeySigningData(str, arrayList2, ByteString.Companion.of$default(sign), ByteString.EMPTY);
            } catch (Exception e) {
                anonymousClass1.recordError(this, AttestedKeyMetrics$ErrorType.SIGN, e);
                throw e;
            }
        } catch (Exception e2) {
            Result.Companion companion5 = Result.Companion;
            return new Result.Failure(e2);
        }
    }
}
