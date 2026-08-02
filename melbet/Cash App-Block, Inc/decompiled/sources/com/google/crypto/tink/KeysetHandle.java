package com.google.crypto.tink;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.datastore.core.SimpleActor;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.Room;
import androidx.room.TransactorKt;
import app.cash.api.ApiResult;
import app.cash.broadway.screen.Screen;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.svg.SvgDecoder$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzagk;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.integrity.be;
import com.google.android.play.core.integrity.bs;
import com.google.android.play.core.integrity.bx;
import com.google.android.play.core.integrity.by;
import com.google.android.play.core.integrity.k;
import com.google.android.play.integrity.internal.ae;
import com.google.android.play.integrity.internal.av;
import com.google.android.play.integrity.internal.aw;
import com.google.crypto.tink.aead.AesEaxParameters;
import com.google.crypto.tink.aead.AesGcmSivParameters;
import com.google.crypto.tink.config.GlobalTinkFlags;
import com.google.crypto.tink.daead.AesSivParameters;
import com.google.crypto.tink.internal.ConscryptUtil;
import com.google.crypto.tink.internal.LegacyProtoKey;
import com.google.crypto.tink.internal.MutablePrimitiveRegistry;
import com.google.crypto.tink.internal.MutableSerializationRegistry;
import com.google.crypto.tink.internal.PrimitiveRegistry;
import com.google.crypto.tink.internal.PrimitiveRegistry$$ExternalSyntheticLambda0;
import com.google.crypto.tink.internal.PrimitiveWrapper;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.SerializationRegistry;
import com.google.crypto.tink.internal.TinkBugException;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.KeysetInfo;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentDiscovery$$ExternalSyntheticLambda0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.firebase.installations.local.AutoValue_PersistedInstallationEntry;
import com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata;
import com.google.i18n.phonenumbers.metadata.init.ClassPathResourceMetadataLoader;
import com.google.i18n.phonenumbers.metadata.init.MetadataParser;
import com.google.i18n.phonenumbers.metadata.source.MapBackedMetadataContainer$KeyProvider;
import com.google.mlkit.common.internal.zza;
import com.google.mlkit.common.internal.zzb;
import com.google.mlkit.common.internal.zzd;
import com.google.mlkit.common.internal.zze;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.backend.PaymentHistoryActivityItem;
import com.squareup.cash.activity.backend.ZiplineActivityItemFormatter;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.ActivitiesManager$ActivityGetHandler$Failure;
import com.squareup.cash.activity.backend.loader.ActivitiesManager$ActivityGetHandler$NotFound;
import com.squareup.cash.activity.backend.loader.ActivitiesManager$ActivityGetHandler$Success;
import com.squareup.cash.activity.backend.loader.DefaultGetRequestHandler$requestItem$1;
import com.squareup.cash.api.ApiResultCallAdapterFactory$get$3$adapt$1;
import com.squareup.cash.api.ResponseBodyKt;
import com.squareup.cash.backstack.api.BackStack$Entry;
import com.squareup.cash.backstack.api.BackStack$ScreenEntry;
import com.squareup.cash.backstack.real.RealBackStack;
import com.squareup.cash.backstack.real.RealBackStackEditor;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.views.navigation.AccountPickerHandler;
import com.squareup.cash.blockers.views.navigation.BackStackHandler;
import com.squareup.cash.blockers.views.navigation.FlowData;
import com.squareup.cash.blockers.views.navigation.NonBlockersHandler;
import com.squareup.cash.clientrouting.validation.AccountRequirementValidator;
import com.squareup.cash.clientrouting.validation.BtcxValidator;
import com.squareup.cash.clientrouting.validation.LoginStateValidator;
import com.squareup.cash.clientrouting.validation.ManagedAccountClientRouteValidator;
import com.squareup.cash.clientrouting.validation.Validator;
import com.squareup.cash.clientsync.AuditLogEntryQueries$selectAll$2;
import com.squareup.cash.clientsync.SelectAll;
import com.squareup.cash.clientsync.SyncRangeQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.clientsync.database.ClientSyncDatabaseImpl;
import com.squareup.cash.clientsync.models.SyncTopic;
import com.squareup.cash.clientsync.persistence.AuditLogEntry;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs$Favorite$1;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.common.composeui.BadgedBoxKt$$ExternalSyntheticLambda0;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.family.requestsponsorship.screens.SelectSponsorScreen;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;
import com.squareup.protos.cash.activity.api.v1.ActivityGetRequest;
import com.squareup.protos.cash.activity.api.v1.ActivityGetResponse;
import com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId;
import com.squareup.protos.cash.activity.api.v1.ActivityRow;
import com.squareup.protos.cash.syncentitygateway.syncvalues.ClientSyncConfig;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.util.logging.NoOpRetrofitLogger;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Type;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.Clock;
import kotlinx.coroutines.internal.Symbol;
import okhttp3.ConnectionPool;
import okhttp3.ResponseBody;
import okhttp3.internal.http.DateFormattingKt;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.json.JSONException;
import org.json.JSONObject;
import papa.SafeTrace;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Callback;
import retrofit2.CompletableFutureCallAdapterFactory;
import retrofit2.DefaultCallAdapterFactory;
import retrofit2.Response;

/* loaded from: classes.dex */
public class KeysetHandle implements SuccessContinuation, aw, OnCompleteListener, Callback, CallAdapter {
    public final /* synthetic */ int $r8$classId;
    public Object annotationsMap;
    public Object entries;

    public final class Entry {
        public static final Drop$$ExternalSyntheticBUOutline0 NO_LOGGING = new Drop$$ExternalSyntheticBUOutline0(4);
        public final int id;
        public final boolean isPrimary;
        public final TransactorKt key;
        public final Drop$$ExternalSyntheticBUOutline0 keyExportLogger;
        public final boolean keyParsingFailed;
        public final KeyStatus keyStatus;
        public final KeyStatusType keyStatusType;

        public Entry(TransactorKt transactorKt, KeyStatusType keyStatusType, int i, boolean z, boolean z2) {
            this.key = transactorKt;
            this.keyStatusType = keyStatusType;
            int ordinal = keyStatusType.ordinal();
            this.keyStatus = ordinal != 1 ? ordinal != 3 ? KeyStatus.DISABLED : KeyStatus.DESTROYED : KeyStatus.ENABLED;
            this.id = i;
            this.isPrimary = z;
            this.keyParsingFailed = z2;
            this.keyExportLogger = NO_LOGGING;
        }

        public final TransactorKt getKey() {
            this.keyExportLogger.getClass();
            return this.key;
        }
    }

    public KeysetHandle(List list, Map map) {
        boolean z = false;
        this.$r8$classId = 0;
        this.entries = list;
        this.annotationsMap = map;
        if (((AtomicBoolean) GlobalTinkFlags.validateKeysetsOnParsing.delegate).get()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                int i = entry.id;
                if (hashSet.contains(Integer.valueOf(i))) {
                    throw new GeneralSecurityException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "KeyID ", " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."));
                }
                hashSet.add(Integer.valueOf(i));
                if (entry.isPrimary) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$6("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            throw null;
        }
    }

    public static KeysetHandle acquire(Context context) {
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
            } catch (IOException | Error | OverlappingFileLockException e) {
                e = e;
                fileLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e2) {
            e = e2;
            fileChannel = null;
            fileLock = null;
        }
        try {
            return new KeysetHandle(7, fileChannel, fileLock);
        } catch (IOException | Error | OverlappingFileLockException e3) {
            e = e3;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
                try {
                    fileLock.release();
                } catch (IOException unused) {
                }
            }
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (IOException unused2) {
                }
            }
            return null;
        }
    }

    public static void assertNoSecretKeyMaterial(Keyset keyset) {
        for (Keyset.Key key : keyset.getKeyList()) {
            if (key.getKeyData().getKeyMaterialType() == KeyData.KeyMaterialType.UNKNOWN_KEYMATERIAL || key.getKeyData().getKeyMaterialType() == KeyData.KeyMaterialType.SYMMETRIC || key.getKeyData().getKeyMaterialType() == KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE) {
                throw new GeneralSecurityException(CameraSelector$$ExternalSyntheticOutline0.m("keyset contains key material of type ", key.getKeyData().getKeyMaterialType().name(), " for type url ", key.getKeyData().getTypeUrl()));
            }
        }
    }

    public static Keyset.Key createKeysetKey(TransactorKt transactorKt, KeyStatusType keyStatusType, int i) {
        ProtoKeySerialization protoKeySerialization = (ProtoKeySerialization) MutableSerializationRegistry.GLOBAL_INSTANCE.serializeKey(transactorKt);
        Integer idRequirementOrNull = transactorKt.getIdRequirementOrNull();
        if (idRequirementOrNull != null && idRequirementOrNull.intValue() != i) {
            a$$ExternalSyntheticBUOutline0.m$6("Wrong ID set for key with ID requirement");
            return null;
        }
        Keyset.Key.Builder newBuilder = Keyset.Key.newBuilder();
        KeyData.Builder newBuilder2 = KeyData.newBuilder();
        String str = protoKeySerialization.typeUrl;
        newBuilder2.copyOnWrite();
        KeyData.access$100((KeyData) newBuilder2.instance, str);
        ByteString byteString = protoKeySerialization.value;
        newBuilder2.copyOnWrite();
        KeyData.access$400((KeyData) newBuilder2.instance, byteString);
        KeyData.KeyMaterialType keyMaterialType = protoKeySerialization.keyMaterialType;
        newBuilder2.copyOnWrite();
        KeyData.access$700((KeyData) newBuilder2.instance, keyMaterialType);
        newBuilder.copyOnWrite();
        Keyset.Key.access$100((Keyset.Key) newBuilder.instance, (KeyData) newBuilder2.build());
        newBuilder.copyOnWrite();
        Keyset.Key.access$500((Keyset.Key) newBuilder.instance, keyStatusType);
        newBuilder.copyOnWrite();
        ((Keyset.Key) newBuilder.instance).keyId_ = i;
        OutputPrefixType outputPrefixType = protoKeySerialization.outputPrefixType;
        newBuilder.copyOnWrite();
        Keyset.Key.access$1000((Keyset.Key) newBuilder.instance, outputPrefixType);
        return (Keyset.Key) newBuilder.build();
    }

    public static final KeysetHandle fromKeyset(Keyset keyset) {
        TransactorKt legacyProtoKey;
        boolean z;
        boolean z2;
        KeyStatusType keyStatusType;
        TransactorKt transactorKt;
        if (keyset == null || keyset.getKeyCount() <= 0) {
            a$$ExternalSyntheticBUOutline0.m$6("empty keyset");
            return null;
        }
        ArrayList arrayList = new ArrayList(keyset.getKeyCount());
        for (Keyset.Key key : keyset.getKeyList()) {
            int keyId = key.getKeyId();
            try {
                legacyProtoKey = toKey(key);
                z = false;
            } catch (GeneralSecurityException e) {
                if (((AtomicBoolean) GlobalTinkFlags.validateKeysetsOnParsing.delegate).get()) {
                    throw e;
                }
                legacyProtoKey = new LegacyProtoKey(toProtoKeySerialization(key));
                z = true;
            }
            if (((AtomicBoolean) GlobalTinkFlags.validateKeysetsOnParsing.delegate).get() && !isValidKeyStatusType(key.getStatus())) {
                a$$ExternalSyntheticBUOutline0.m$6("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
                return null;
            }
            KeyStatusType status = key.getStatus();
            if (keyId == keyset.getPrimaryKeyId()) {
                z2 = true;
                transactorKt = legacyProtoKey;
                keyStatusType = status;
            } else {
                z2 = false;
                keyStatusType = status;
                transactorKt = legacyProtoKey;
            }
            arrayList.add(new Entry(transactorKt, keyStatusType, keyId, z2, z));
        }
        return new KeysetHandle(Collections.unmodifiableList(arrayList), new HashMap());
    }

    public static boolean isValidKeyStatusType(KeyStatusType keyStatusType) {
        int ordinal = keyStatusType.ordinal();
        return ordinal == 1 || ordinal == 2 || ordinal == 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        if (r9 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0055, code lost:
    
        if (r9 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object requestItem$suspendImpl(KeysetHandle keysetHandle, ActivitiesManager.ActivityContext activityContext, ActivityItemGlobalId activityItemGlobalId, ContinuationImpl continuationImpl) {
        DefaultGetRequestHandler$requestItem$1 defaultGetRequestHandler$requestItem$1;
        int i;
        ApiResult apiResult;
        ActivityItem activityData;
        if (continuationImpl instanceof DefaultGetRequestHandler$requestItem$1) {
            defaultGetRequestHandler$requestItem$1 = (DefaultGetRequestHandler$requestItem$1) continuationImpl;
            int i2 = defaultGetRequestHandler$requestItem$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                defaultGetRequestHandler$requestItem$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = defaultGetRequestHandler$requestItem$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultGetRequestHandler$requestItem$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityContext.getClass();
                    activityItemGlobalId.getClass();
                    ActivityGetRequest activityGetRequest = new ActivityGetRequest(activityItemGlobalId, activityContext.activityToken, activityContext.activityScope);
                    ActivityClientService activityClientService = (ActivityClientService) keysetHandle.entries;
                    defaultGetRequestHandler$requestItem$1.L$0 = keysetHandle;
                    defaultGetRequestHandler$requestItem$1.label = 1;
                    obj = activityClientService.activityGet(activityGetRequest, defaultGetRequestHandler$requestItem$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        obj.getClass();
                        activityData = (PaymentHistoryActivityItem) obj;
                        return new ActivitiesManager$ActivityGetHandler$Success(activityData);
                    }
                    keysetHandle = defaultGetRequestHandler$requestItem$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    ActivityRow activityRow = ((ActivityGetResponse) ((ApiResult.Success) apiResult).response).activityRow;
                    if (activityRow != null && (activityData = ActivitiesManager.ActivityPage.Companion.toActivityData(activityRow)) != null) {
                        if (activityData instanceof PaymentHistoryActivityItem) {
                            defaultGetRequestHandler$requestItem$1.L$0 = null;
                            defaultGetRequestHandler$requestItem$1.label = 2;
                            obj = ZiplineActivityItemFormatter.format$default((ZiplineActivityItemFormatter) keysetHandle.annotationsMap, (PaymentHistoryActivityItem) activityData, defaultGetRequestHandler$requestItem$1);
                        }
                        return new ActivitiesManager$ActivityGetHandler$Success(activityData);
                    }
                } else if ((apiResult instanceof ApiResult.Failure.HttpFailure) && ((ApiResult.Failure.HttpFailure) apiResult).code == 404) {
                    return ActivitiesManager$ActivityGetHandler$NotFound.INSTANCE;
                }
                return ActivitiesManager$ActivityGetHandler$Failure.INSTANCE;
            }
        }
        defaultGetRequestHandler$requestItem$1 = new DefaultGetRequestHandler$requestItem$1(keysetHandle, continuationImpl);
        Object obj2 = defaultGetRequestHandler$requestItem$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultGetRequestHandler$requestItem$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return ActivitiesManager$ActivityGetHandler$Failure.INSTANCE;
    }

    public static TransactorKt toKey(Keyset.Key key) {
        ProtoKeySerialization protoKeySerialization = toProtoKeySerialization(key);
        MutableSerializationRegistry mutableSerializationRegistry = MutableSerializationRegistry.GLOBAL_INSTANCE;
        SerializationRegistry serializationRegistry = (SerializationRegistry) mutableSerializationRegistry.registry.get();
        serializationRegistry.getClass();
        return !serializationRegistry.keyParserMap.containsKey(new SerializationRegistry.ParserIndex(ProtoKeySerialization.class, protoKeySerialization.objectIdentifier)) ? new LegacyProtoKey(protoKeySerialization) : mutableSerializationRegistry.parseKey(protoKeySerialization);
    }

    public static ProtoKeySerialization toProtoKeySerialization(Keyset.Key key) {
        return ProtoKeySerialization.create(key.getKeyData().getTypeUrl(), key.getKeyData().getValue(), key.getKeyData().getKeyMaterialType(), key.getOutputPrefixType(), key.getOutputPrefixType() == OutputPrefixType.RAW ? null : Integer.valueOf(key.getKeyId()));
    }

    @Override // com.google.android.play.integrity.internal.az
    public /* bridge */ /* synthetic */ Object a() {
        av avVar = (av) this.annotationsMap;
        return new be((bs) ((av) this.entries).a(), (by) avVar.a());
    }

    public void accept(Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata) {
        ((ConcurrentHashMap) this.entries).put(((MapBackedMetadataContainer$KeyProvider) this.annotationsMap).getKeyOf(phonemetadata$PhoneMetadata), phonemetadata$PhoneMetadata);
    }

    @Override // retrofit2.CallAdapter
    public Object adapt(Call call) {
        return ((CallAdapter) this.entries).adapt(new DefaultCallAdapterFactory.ExecutorCallbackCall((NoOpRetrofitLogger) this.annotationsMap, call, 1));
    }

    public void appendMessage(String str) {
        ((SessionQueries) this.annotationsMap).transactionWithWrapper(new BadgedBoxKt$$ExternalSyntheticLambda0(10, this, str));
    }

    /* renamed from: build, reason: collision with other method in class */
    public AesSivParameters m2033build() {
        Integer num = (Integer) this.entries;
        if (num == null) {
            a$$ExternalSyntheticBUOutline0.m$6("Key size is not set");
            return null;
        }
        if (((AesSivParameters.Variant) this.annotationsMap) != null) {
            return new AesSivParameters(num.intValue(), (AesSivParameters.Variant) this.annotationsMap);
        }
        a$$ExternalSyntheticBUOutline0.m$6("Variant is not set");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.List] */
    public ArrayList discoverLazy() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        ConnectionPool connectionPool = (ConnectionPool) this.annotationsMap;
        Context context = (Context) this.entries;
        Class cls = (Class) connectionPool.delegate;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) cls), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ComponentDiscovery$$ExternalSyntheticLambda0((String) it.next(), 0));
        }
        return arrayList2;
    }

    public void getAnnotationsOrNull() {
        if (((Map) this.annotationsMap).get(ConscryptUtil.class) == null) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1();
    }

    public Entry getAt(int i) {
        List list = (List) this.entries;
        if (i < 0 || i >= list.size()) {
            Path$$ExternalSyntheticBUOutline0.m(list.size(), JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "Invalid index ", " for keyset of size "));
            return null;
        }
        Entry entry = (Entry) list.get(i);
        if (!isValidKeyStatusType(entry.keyStatusType)) {
            a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Keyset-Entry at position ", " has wrong status"));
            return null;
        }
        if (!entry.keyParsingFailed) {
            return (Entry) list.get(i);
        }
        a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Keyset-Entry at position ", " didn't parse correctly"));
        return null;
    }

    public File getDataFile() {
        if (((File) this.entries) == null) {
            synchronized (this) {
                try {
                    if (((File) this.entries) == null) {
                        String str = "PersistedInstallation." + ((FirebaseApp) this.annotationsMap).getPersistenceKey() + ".json";
                        FirebaseApp firebaseApp = (FirebaseApp) this.annotationsMap;
                        firebaseApp.checkNotDeleted();
                        File file = new File(firebaseApp.applicationContext.getNoBackupFilesDir(), str);
                        this.entries = file;
                        if (file.exists()) {
                            return (File) this.entries;
                        }
                        FirebaseApp firebaseApp2 = (FirebaseApp) this.annotationsMap;
                        firebaseApp2.checkNotDeleted();
                        File file2 = new File(firebaseApp2.applicationContext.getFilesDir(), str);
                        if (file2.exists() && !file2.renameTo((File) this.entries)) {
                            Log.e("PersistedInstallation", "Unable to move the file from back up to non back up directory", new IOException("Unable to move the file from back up to non back up directory"));
                            return file2;
                        }
                    }
                } finally {
                }
            }
        }
        return (File) this.entries;
    }

    public ArrayList getEntries() {
        SessionQueries sessionQueries = (SessionQueries) this.annotationsMap;
        sessionQueries.getClass();
        AuditLogEntryQueries$selectAll$2 auditLogEntryQueries$selectAll$2 = AuditLogEntryQueries$selectAll$2.INSTANCE;
        SqlDriver sqlDriver = sessionQueries.driver;
        SyncRangeQueries$$ExternalSyntheticLambda1 syncRangeQueries$$ExternalSyntheticLambda1 = new SyncRangeQueries$$ExternalSyntheticLambda1();
        sqlDriver.getClass();
        List<SelectAll> executeAsList = new SimpleQuery(-133543376, new String[]{"audit_log_entry"}, sqlDriver, "AuditLogEntry.sq", "selectAll", "SELECT timestamp_ms, message\nFROM audit_log_entry", syncRangeQueries$$ExternalSyntheticLambda1).executeAsList();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(executeAsList, 10));
        for (SelectAll selectAll : executeAsList) {
            arrayList.add(new AuditLogEntry(selectAll.getTimestamp_ms(), selectAll.getMessage()));
        }
        return arrayList;
    }

    public Keyset getKeyset() {
        try {
            Keyset.Builder newBuilder = Keyset.newBuilder();
            for (Entry entry : (List) this.entries) {
                TransactorKt key = entry.getKey();
                int i = entry.id;
                Keyset.Key createKeysetKey = createKeysetKey(key, entry.keyStatusType, i);
                newBuilder.copyOnWrite();
                Keyset.access$1700((Keyset) newBuilder.instance, createKeysetKey);
                if (entry.isPrimary) {
                    newBuilder.copyOnWrite();
                    ((Keyset) newBuilder.instance).primaryKeyId_ = i;
                }
            }
            return (Keyset) newBuilder.build();
        } catch (GeneralSecurityException e) {
            throw new TinkBugException(e);
        }
    }

    public Entry getPrimary$1() {
        for (Entry entry : (List) this.entries) {
            if (entry != null && entry.isPrimary) {
                if (entry.keyStatus == KeyStatus.ENABLED) {
                    return entry;
                }
                a$$ExternalSyntheticBUOutline0.m$1("Keyset has primary which isn't enabled");
                return null;
            }
        }
        a$$ExternalSyntheticBUOutline0.m$1("Keyset has no valid primary");
        return null;
    }

    public Object getPrimitive(Class cls) {
        List list = (List) this.entries;
        Keyset keyset = getKeyset();
        int i = Util.$r8$clinit;
        int primaryKeyId = keyset.getPrimaryKeyId();
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        boolean z2 = true;
        for (Keyset.Key key : keyset.getKeyList()) {
            if (key.getStatus() == KeyStatusType.ENABLED) {
                if (!key.hasKeyData()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(key.getKeyId())));
                }
                if (key.getOutputPrefixType() == OutputPrefixType.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(key.getKeyId())));
                }
                if (key.getStatus() == KeyStatusType.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(key.getKeyId())));
                }
                if (key.getKeyId() == primaryKeyId) {
                    if (z) {
                        a$$ExternalSyntheticBUOutline0.m$6("keyset contains multiple primary keys");
                        return null;
                    }
                    z = true;
                }
                if (key.getKeyData().getKeyMaterialType() != KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC) {
                    z2 = false;
                }
                i3++;
            }
        }
        if (i3 == 0) {
            a$$ExternalSyntheticBUOutline0.m$6("keyset must contain at least one ENABLED key");
            return null;
        }
        if (!z && !z2) {
            a$$ExternalSyntheticBUOutline0.m$6("keyset doesn't contain a valid primary key");
            return null;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (((Entry) list.get(i4)).keyParsingFailed || !isValidKeyStatusType(((Entry) list.get(i4)).keyStatusType)) {
                Keyset.Key key2 = keyset.getKey(i4);
                StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i4, "Key parsing of key with index ", " and type_url ");
                m2m.append(key2.getKeyData().getTypeUrl());
                m2m.append(" failed, unable to get primitive");
                throw new GeneralSecurityException(m2m.toString());
            }
        }
        PrimitiveRegistry primitiveRegistry = (PrimitiveRegistry) MutablePrimitiveRegistry.globalInstance.registry.get();
        HashMap hashMap = primitiveRegistry.primitiveWrapperMap;
        if (!hashMap.containsKey(cls)) {
            throw new GeneralSecurityException(Boxes$$ExternalSyntheticOutline1.m(cls, "No wrapper found for "));
        }
        PrimitiveWrapper primitiveWrapper = (PrimitiveWrapper) hashMap.get(cls);
        return primitiveWrapper.wrap(this, new PrimitiveRegistry$$ExternalSyntheticLambda0(i2, primitiveRegistry, primitiveWrapper));
    }

    public Set getTopicsEligibleForTopicSync() {
        Object value = ((SyncValueReader) this.entries).getSingleValue((AndroidSyncValueSpecs$Favorite$1) this.annotationsMap).getValue();
        if (value != null) {
            List list = ((ClientSyncConfig) value).topic_sync_allowlist;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new SyncTopic(((Number) it.next()).intValue()));
            }
            Set set = CollectionsKt.toSet(arrayList);
            if (set != null) {
                return set;
            }
        }
        return EmptySet.INSTANCE;
    }

    public void insertOrUpdatePersistedInstallationEntry(AutoValue_PersistedInstallationEntry autoValue_PersistedInstallationEntry) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", autoValue_PersistedInstallationEntry.firebaseInstallationId);
            jSONObject.put("Status", CameraSelector$$ExternalSyntheticOutline0.ordinal(autoValue_PersistedInstallationEntry.registrationStatus));
            jSONObject.put("AuthToken", autoValue_PersistedInstallationEntry.authToken);
            jSONObject.put("RefreshToken", autoValue_PersistedInstallationEntry.refreshToken);
            jSONObject.put("TokenCreationEpochInSecs", autoValue_PersistedInstallationEntry.tokenCreationEpochInSecs);
            jSONObject.put("ExpiresInSecs", autoValue_PersistedInstallationEntry.expiresInSecs);
            jSONObject.put("FisError", autoValue_PersistedInstallationEntry.fisError);
            FirebaseApp firebaseApp = (FirebaseApp) this.annotationsMap;
            firebaseApp.checkNotDeleted();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", firebaseApp.applicationContext.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(getDataFile())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ae aeVar = (ae) this.entries;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.annotationsMap;
        synchronized (aeVar.g) {
            aeVar.f.remove(taskCompletionSource);
        }
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th) {
        Object httpFailure;
        switch (this.$r8$classId) {
            case 12:
                ((Callback) this.entries).onFailure(call, th);
                break;
            default:
                ApiResultCallAdapterFactory$get$3$adapt$1 apiResultCallAdapterFactory$get$3$adapt$1 = (ApiResultCallAdapterFactory$get$3$adapt$1) this.annotationsMap;
                if (th instanceof IOException) {
                    httpFailure = new ApiResult.Failure.NetworkFailure(th);
                } else {
                    String message = th.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    httpFailure = StringsKt.contains((CharSequence) message, (CharSequence) "Unexpected call to beginMessage()", false) ? new ApiResult.Failure.HttpFailure(500, null, null) : null;
                }
                Callback callback = (Callback) this.entries;
                ApiResultCallAdapterFactory$get$3$adapt$1 apiResultCallAdapterFactory$get$3$adapt$12 = apiResultCallAdapterFactory$get$3$adapt$1.newCall;
                if (httpFailure == null) {
                    callback.onFailure(apiResultCallAdapterFactory$get$3$adapt$12, th);
                    break;
                } else {
                    callback.onResponse(apiResultCallAdapterFactory$get$3$adapt$12, Response.success(httpFailure));
                    break;
                }
        }
    }

    public void onNewScreen(RealBackStackEditor realBackStackEditor, Screen screen) {
        BlockersData blockersData;
        BlockersData blockersData2;
        RealBackStack realBackStack = realBackStackEditor.view;
        screen.getClass();
        Iterator it = ((List) this.entries).iterator();
        while (it.hasNext()) {
            if (!((BackStackHandler) it.next()).handleAndContinue(realBackStackEditor, screen)) {
                return;
            }
        }
        boolean z = screen instanceof BlockersScreens;
        if (z) {
            ClientScenario clientScenario = null;
            if (screen instanceof BlockersScreens.InviteContactsScreen) {
                Screen screen2 = ((BlockersScreens.InviteContactsScreen) screen).blockersData.exitScreen;
                if (screen2 instanceof BlockersScreens.InviteContactsScreen) {
                    RealBackStack.FlowEntry currentFlow$real = realBackStack.getCurrentFlow$real();
                    if (Intrinsics.areEqual(currentFlow$real != null ? currentFlow$real.getName() : null, "blockers")) {
                        realBackStackEditor.popCurrentFlowsWithNames("blockers");
                    }
                    realBackStackEditor.push(new BackStack$ScreenEntry(screen2, null, null, null));
                    return;
                }
                if (!realBackStack.isCurrentFlowScreensEmpty()) {
                    BackStack$ScreenEntry peekScreenInCurrentFlow = realBackStack.peekScreenInCurrentFlow();
                    peekScreenInCurrentFlow.getClass();
                    if (BlockersScreens.InviteContactsScreen.class.isAssignableFrom(peekScreenInCurrentFlow.args.getClass())) {
                        Iterator it2 = realBackStack.getCurrentFlowScreens().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            } else if (BlockersScreens.InviteContactsScreen.class.isAssignableFrom(((BackStack$ScreenEntry) it2.next()).args.getClass())) {
                                while (!BlockersScreens.InviteContactsScreen.class.isAssignableFrom(realBackStackEditor.popScreen().args.getClass())) {
                                }
                            }
                        }
                    }
                }
                RealBackStack.FlowEntry currentFlow$real2 = realBackStack.getCurrentFlow$real();
                if (Intrinsics.areEqual(currentFlow$real2 != null ? currentFlow$real2.getName() : null, "blockers")) {
                    realBackStackEditor.popCurrentFlowsWithNames("blockers");
                }
            }
            BlockersScreens blockersScreens = (BlockersScreens) screen;
            BlockersData blockersData3 = blockersScreens.getBlockersData();
            RealBackStack.FlowEntry currentFlow$real3 = realBackStack.getCurrentFlow$real();
            String name = currentFlow$real3 != null ? currentFlow$real3.getName() : null;
            if (Intrinsics.areEqual(name, "blockers")) {
                RealBackStack.FlowEntry currentFlow$real4 = realBackStack.getCurrentFlow$real();
                Parcelable data = currentFlow$real4 != null ? currentFlow$real4.getData() : null;
                data.getClass();
                FlowData flowData = (FlowData) data;
                if (blockersData3.clientScenario == ClientScenario.RESET_PASSCODE) {
                    realBackStackEditor.startFlow("passcode", null);
                } else if (flowData.getFlow() != blockersData3.flow) {
                    realBackStackEditor.startFlow("blockers", zzagk.access$toFlowData(blockersData3));
                }
            } else if (Intrinsics.areEqual(name, "passcode")) {
                if (blockersData3.clientScenario != ClientScenario.RESET_PASSCODE) {
                    realBackStackEditor.popFlow("passcode");
                }
            } else if (name == null) {
                realBackStackEditor.startFlow("blockers", zzagk.access$toFlowData(blockersData3));
                if (blockersData3.flow == BlockersData.Flow.ONBOARDING && realBackStack.isEmpty()) {
                    if (screen instanceof BlockersScreens.VerifyAliasScreen) {
                        realBackStackEditor.push(new BackStack$ScreenEntry(new BlockersScreens.RegisterAliasScreen(blockersData3, null, null, null, null, null, null, null, false, false, null, 2046), null, null, null));
                    } else if (screen instanceof BlockersScreens.VerifyMagic) {
                        realBackStackEditor.push(new BackStack$ScreenEntry(new BlockersScreens.RegisterAliasScreen(((BlockersScreens.VerifyMagic) screen).blockersData, null, null, null, null, null, null, null, false, false, null, 2046), null, null, null));
                    }
                }
            }
            if (blockersScreens instanceof BlockersScreens.RegisterAliasScreen) {
                Iterator it3 = realBackStack.getCurrentFlowScreens().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    } else if (BlockersScreens.RegisterAliasScreen.class.isAssignableFrom(((BackStack$ScreenEntry) it3.next()).args.getClass())) {
                        while (!BlockersScreens.RegisterAliasScreen.class.isAssignableFrom(realBackStackEditor.popScreen().args.getClass())) {
                        }
                    }
                }
            } else if (blockersScreens instanceof BlockersScreens.SetNameScreen) {
                Iterator it4 = realBackStack.getCurrentFlowScreens().iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    } else if (BlockersScreens.SetNameScreen.class.isAssignableFrom(((BackStack$ScreenEntry) it4.next()).args.getClass())) {
                        while (!BlockersScreens.SetNameScreen.class.isAssignableFrom(realBackStackEditor.popScreen().args.getClass())) {
                        }
                    }
                }
            }
            if (blockersData3.flow == BlockersData.Flow.TRANSFER && !realBackStack.isCurrentFlowScreensEmpty()) {
                BackStack$ScreenEntry peekScreenInCurrentFlow2 = realBackStack.peekScreenInCurrentFlow();
                peekScreenInCurrentFlow2.getClass();
                if (BlockersScreens.InputCardInfoScreen.class.isAssignableFrom(peekScreenInCurrentFlow2.args.getClass())) {
                    Iterator it5 = realBackStack.getCurrentFlowScreens().iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            break;
                        } else if (BlockersScreens.InputCardInfoScreen.class.isAssignableFrom(((BackStack$ScreenEntry) it5.next()).args.getClass())) {
                            while (!BlockersScreens.InputCardInfoScreen.class.isAssignableFrom(realBackStackEditor.popScreen().args.getClass())) {
                            }
                        }
                    }
                }
            }
            Screen screen3 = blockersData3.currentScreenToReplace;
            if (screen3 != null) {
                BackStack$ScreenEntry peekScreen = realBackStack.peekScreen();
                if (screen3.equals(peekScreen != null ? peekScreen.args : null)) {
                    realBackStackEditor.popScreen();
                }
            }
            if (screen instanceof BlockersScreens.SwappingBlockersScreens) {
                Iterator it6 = realBackStack.getCurrentFlowScreens().iterator();
                while (it6.hasNext()) {
                    if (BlockersScreens.SwappingBlockersScreens.class.isAssignableFrom(((BackStack$ScreenEntry) it6.next()).args.getClass())) {
                        while (!BlockersScreens.SwappingBlockersScreens.class.isAssignableFrom(realBackStackEditor.popScreen().args.getClass())) {
                        }
                        return;
                    }
                }
                return;
            }
            if (screen instanceof BlockersScreens.ChildBlockersScreens) {
                return;
            }
            if (!realBackStack.isCurrentFlowScreensEmpty()) {
                BackStack$ScreenEntry peekScreenInCurrentFlow3 = realBackStack.peekScreenInCurrentFlow();
                peekScreenInCurrentFlow3.getClass();
                if (BlockersScreens.ChildBlockersScreens.class.isAssignableFrom(peekScreenInCurrentFlow3.args.getClass())) {
                    while (!realBackStack.isCurrentFlowScreensEmpty()) {
                        BackStack$ScreenEntry peekScreenInCurrentFlow4 = realBackStack.peekScreenInCurrentFlow();
                        peekScreenInCurrentFlow4.getClass();
                        if (!BlockersScreens.ChildBlockersScreens.class.isAssignableFrom(peekScreenInCurrentFlow4.args.getClass())) {
                            break;
                        }
                        Iterator it7 = realBackStack.getCurrentFlowScreens().iterator();
                        while (true) {
                            if (!it7.hasNext()) {
                                break;
                            } else if (BlockersScreens.ChildBlockersScreens.class.isAssignableFrom(((BackStack$ScreenEntry) it7.next()).args.getClass())) {
                                while (!BlockersScreens.ChildBlockersScreens.class.isAssignableFrom(realBackStackEditor.popScreen().args.getClass())) {
                                }
                            }
                        }
                    }
                    Iterator it8 = realBackStack.getCurrentFlowScreens().iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            break;
                        } else if (BlockersScreens.class.isAssignableFrom(((BackStack$ScreenEntry) it8.next()).args.getClass())) {
                            while (!BlockersScreens.class.isAssignableFrom(realBackStackEditor.popScreen().args.getClass())) {
                            }
                        }
                    }
                }
            }
            if (!realBackStack.isCurrentFlowScreensEmpty()) {
                BackStack$ScreenEntry peekScreenInCurrentFlow5 = realBackStack.peekScreenInCurrentFlow();
                peekScreenInCurrentFlow5.getClass();
                if (SelectSponsorScreen.class.isAssignableFrom(peekScreenInCurrentFlow5.args.getClass()) && (screen instanceof SelectSponsorScreen)) {
                    Iterator it9 = realBackStack.getCurrentFlowScreens().iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            break;
                        } else if (SelectSponsorScreen.class.isAssignableFrom(((BackStack$ScreenEntry) it9.next()).args.getClass())) {
                            while (!SelectSponsorScreen.class.isAssignableFrom(realBackStackEditor.popScreen().args.getClass())) {
                            }
                        }
                    }
                }
            }
            ClientScenario clientScenario2 = ClientScenario.GOOGLE_PAY_PROVISIONING;
            BlockersScreens blockersScreens2 = z ? (BlockersScreens) screen : null;
            if (((blockersScreens2 == null || (blockersData2 = blockersScreens2.getBlockersData()) == null) ? null : blockersData2.clientScenario) == clientScenario2) {
                Iterator it10 = realBackStack.getCurrentFlowScreens().iterator();
                while (true) {
                    if (!it10.hasNext()) {
                        break;
                    } else if (BlockersScreens.GooglePayProvisioningExitScreen.class.isAssignableFrom(((BackStack$ScreenEntry) it10.next()).args.getClass())) {
                        while (!BlockersScreens.GooglePayProvisioningExitScreen.class.isAssignableFrom(realBackStackEditor.popScreen().args.getClass())) {
                        }
                    }
                }
                realBackStackEditor.push(new BackStack$ScreenEntry(blockersData3.exitScreen, null, null, null));
                return;
            }
            ClientScenario clientScenario3 = ClientScenario.RESOLVE_SUSPENSION;
            BlockersScreens blockersScreens3 = z ? (BlockersScreens) screen : null;
            if (blockersScreens3 != null && (blockersData = blockersScreens3.getBlockersData()) != null) {
                clientScenario = blockersData.clientScenario;
            }
            if ((clientScenario != clientScenario3 || realBackStack.isCurrentFlowScreensEmpty() || !BlockersScreens.SelectionScreen.class.isAssignableFrom(((BackStack$ScreenEntry) CollectionsKt.first((List) realBackStack.getCurrentFlowScreens())).args.getClass()) || (screen instanceof BlockersScreens.SelectionScreen)) && !((BlockersDataNavigator) this.annotationsMap).canGoBack(screen, blockersData3)) {
                ArrayDeque arrayDeque = realBackStackEditor.entries;
                ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                while (!arrayDeque.isEmpty() && !(arrayDeque.last() instanceof RealBackStack.FlowEntry)) {
                    BackStack$Entry backStack$Entry = (BackStack$Entry) arrayDeque.removeLast();
                    backStack$Entry.getClass();
                    createListBuilder.add(backStack$Entry);
                }
                ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
                ArrayList arrayList = realBackStackEditor.ledger;
                arrayList.getClass();
                build.getClass();
                arrayList.add(new RealBackStackEditor.ClearCurrentFlow(build));
            }
        }
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, Response response) {
        Object httpFailure;
        switch (this.$r8$classId) {
            case 12:
                ((DefaultCallAdapterFactory.ExecutorCallbackCall) this.annotationsMap).logResponse(response);
                ((Callback) this.entries).onResponse(call, response);
                break;
            default:
                call.getClass();
                Callback callback = (Callback) this.entries;
                ApiResultCallAdapterFactory$get$3$adapt$1 apiResultCallAdapterFactory$get$3$adapt$1 = ((ApiResultCallAdapterFactory$get$3$adapt$1) this.annotationsMap).newCall;
                okhttp3.Response response2 = response.rawResponse;
                if (response2.isSuccessful) {
                    Object obj = response.body;
                    if (obj == null) {
                        a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                        break;
                    } else {
                        httpFailure = new ApiResult.Success(obj);
                    }
                } else {
                    int i = response2.code;
                    String str = response2.headers.get("Date");
                    Date httpDateOrNull = str != null ? DateFormattingKt.toHttpDateOrNull(str) : null;
                    ResponseBody responseBody = response.errorBody;
                    httpFailure = new ApiResult.Failure.HttpFailure(i, httpDateOrNull, responseBody != null ? ResponseBodyKt.peekString(responseBody) : null);
                }
                callback.onResponse(apiResultCallAdapterFactory$get$3$adapt$1, Response.success(httpFailure));
                break;
        }
    }

    public AutoValue_PersistedInstallationEntry readPersistedInstallationEntryValue() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(getDataFile());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i = AutoValue_PersistedInstallationEntry.$r8$clinit;
        byte b = (byte) (((byte) (0 | 2)) | 1);
        int i2 = zzel$EnumUnboxingLocalUtility._values()[optInt];
        if (i2 == 0) {
            a$$ExternalSyntheticBUOutline0.m$2("Null registrationStatus");
            return null;
        }
        byte b2 = (byte) (((byte) (b | 2)) | 1);
        if (b2 == 3 && i2 != 0) {
            return new AutoValue_PersistedInstallationEntry(optString, i2, optString2, optString3, optLong2, optLong, optString4);
        }
        StringBuilder sb = new StringBuilder();
        if (i2 == 0) {
            sb.append(" registrationStatus");
        }
        if ((b2 & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((b2 & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$1(sb, "Missing required properties:");
        return null;
    }

    public void releaseAndClose() {
        try {
            ((FileLock) this.annotationsMap).release();
            ((FileChannel) this.entries).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    public Object requestItem(ActivitiesManager.ActivityContext activityContext, ActivityItemGlobalId activityItemGlobalId, ContinuationImpl continuationImpl) {
        return requestItem$suspendImpl(this, activityContext, activityItemGlobalId, continuationImpl);
    }

    @Override // retrofit2.CallAdapter
    public Type responseType() {
        return ((CallAdapter) this.entries).responseType();
    }

    public void setKeySizeBytes(int i) {
        switch (this.$r8$classId) {
            case 4:
                if (i != 16 && i != 32) {
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
                }
                this.entries = Integer.valueOf(i);
                return;
            default:
                if (i != 32 && i != 48 && i != 64) {
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", Integer.valueOf(i)));
                }
                this.entries = Integer.valueOf(i);
                return;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        be beVar = (be) this.entries;
        return Room.forResult(new bx(beVar.b, ((k) this.annotationsMap).a, ((Long) obj).longValue()));
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 0:
                Keyset keyset = getKeyset();
                int i = Util.$r8$clinit;
                KeysetInfo.Builder newBuilder = KeysetInfo.newBuilder();
                newBuilder.setPrimaryKeyId$1(keyset.getPrimaryKeyId());
                for (Keyset.Key key : keyset.getKeyList()) {
                    KeysetInfo.KeyInfo.Builder newBuilder2 = KeysetInfo.KeyInfo.newBuilder();
                    newBuilder2.setTypeUrl$2(key.getKeyData().getTypeUrl());
                    newBuilder2.setStatus$1(key.getStatus());
                    newBuilder2.setOutputPrefixType$2(key.getOutputPrefixType());
                    newBuilder2.setKeyId$1(key.getKeyId());
                    newBuilder.addKeyInfo((KeysetInfo.KeyInfo) newBuilder2.build());
                }
                return ((KeysetInfo) newBuilder.build()).toString();
            default:
                return super.toString();
        }
    }

    public AesGcmSivParameters build() {
        Integer num = (Integer) this.entries;
        if (num != null) {
            if (((AesEaxParameters.Variant) this.annotationsMap) != null) {
                return new AesGcmSivParameters(num.intValue(), (AesEaxParameters.Variant) this.annotationsMap);
            }
            a$$ExternalSyntheticBUOutline0.m$6("Variant is not set");
            return null;
        }
        a$$ExternalSyntheticBUOutline0.m$6("Key size is not set");
        return null;
    }

    public /* synthetic */ KeysetHandle(int i, boolean z) {
        this.$r8$classId = i;
    }

    public KeysetHandle(SyncValueReader syncValueReader, AndroidSyncValueSpecs$Favorite$1 androidSyncValueSpecs$Favorite$1) {
        this.$r8$classId = 25;
        androidSyncValueSpecs$Favorite$1.getClass();
        this.entries = syncValueReader;
        this.annotationsMap = androidSyncValueSpecs$Favorite$1;
    }

    public KeysetHandle(ClientSyncDatabaseImpl clientSyncDatabaseImpl) {
        this.$r8$classId = 24;
        this.entries = Clock.System.INSTANCE;
        this.annotationsMap = clientSyncDatabaseImpl.auditLogEntryQueries;
    }

    public KeysetHandle(Analytics analytics, AccountRequirementValidator accountRequirementValidator, BtcxValidator btcxValidator, LoginStateValidator loginStateValidator, LoginStateValidator loginStateValidator2, ManagedAccountClientRouteValidator managedAccountClientRouteValidator) {
        this.$r8$classId = 23;
        this.annotationsMap = analytics;
        this.entries = CollectionsKt__CollectionsKt.listOf((Object[]) new Validator[]{accountRequirementValidator, btcxValidator, loginStateValidator, loginStateValidator2, managedAccountClientRouteValidator});
    }

    public KeysetHandle(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 18:
                int i2 = 13;
                this.entries = new zza(i2);
                this.annotationsMap = new zzb(i2);
                break;
            default:
                int i3 = 10;
                this.entries = new KeysetHandle(new zze(i3));
                this.annotationsMap = new KeysetHandle(new zzd(i3));
                break;
        }
    }

    public KeysetHandle(Symbol symbol, ClassPathResourceMetadataLoader classPathResourceMetadataLoader, MetadataParser metadataParser) {
        this.$r8$classId = 11;
        SimpleActor simpleActor = new SimpleActor(classPathResourceMetadataLoader, metadataParser, new KeysetHandle(9));
        this.entries = symbol;
        this.annotationsMap = simpleActor;
    }

    public KeysetHandle(MapBackedMetadataContainer$KeyProvider mapBackedMetadataContainer$KeyProvider) {
        this.$r8$classId = 10;
        this.entries = new ConcurrentHashMap();
        this.annotationsMap = mapBackedMetadataContainer$KeyProvider;
    }

    public KeysetHandle(BlockersDataNavigator blockersDataNavigator) {
        this.$r8$classId = 19;
        this.annotationsMap = blockersDataNavigator;
        this.entries = CollectionsKt__CollectionsKt.listOf((Object[]) new BackStackHandler[]{new AccountPickerHandler(0), new NonBlockersHandler(CollectionsKt__CollectionsJVMKt.listOf(new SvgDecoder$$ExternalSyntheticLambda0(this, 28)), CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"blockers", "passcode"})), new AccountPickerHandler(1)});
    }

    public KeysetHandle(Callback callback, ApiResultCallAdapterFactory$get$3$adapt$1 apiResultCallAdapterFactory$get$3$adapt$1, CompletableFutureCallAdapterFactory completableFutureCallAdapterFactory) {
        this.$r8$classId = 16;
        this.entries = callback;
        this.annotationsMap = apiResultCallAdapterFactory$get$3$adapt$1;
    }

    public KeysetHandle(FirebaseApp firebaseApp) {
        this.$r8$classId = 8;
        this.annotationsMap = firebaseApp;
    }

    public KeysetHandle(DefaultCallAdapterFactory.ExecutorCallbackCall executorCallbackCall, Callback callback) {
        this.$r8$classId = 12;
        this.annotationsMap = executorCallbackCall;
        this.entries = callback;
    }

    public /* synthetic */ KeysetHandle(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.entries = obj;
        this.annotationsMap = obj2;
    }
}
