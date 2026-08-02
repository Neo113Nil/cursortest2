package com.braze.storage;

import android.content.Context;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreImpl;
import androidx.datastore.core.FileStorage;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.PreferenceDataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFileSerializer;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.molecule.GatedFrameClock;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.jf;
import bo.app.m9;
import bo.app.r7;
import coil3.memory.MemoryCacheService;
import coil3.size.DimensionKt;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.support.BrazeLogger;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.contour.ContourLayout$geometry$1;
import com.squareup.util.Strings;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.internal.ContextScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 S2\u00020\u0001:\u0001SB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f\u0012\u0004\u0012\u00020\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010%J1\u0010)\u001a\u00020\t2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u001e2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00120'H\u0016¢\u0006\u0004\b)\u0010*J+\u0010.\u001a\u00020\t\"\u0004\b\u0000\u0010+2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010\b\u001a\u00028\u0000H\u0001¢\u0006\u0004\b,\u0010-J3\u00102\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010+*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\b\u0010/\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b0\u00101J'\u00105\u001a\u00020\u000f\"\b\b\u0000\u0010+*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0001¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b5\u00106J\u001f\u00108\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f\u0012\u0004\u0012\u00020\u00010\u001eH\u0001¢\u0006\u0004\b7\u0010!J#\u0010;\u001a\u00020\t\"\u0004\b\u0000\u0010+2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0001¢\u0006\u0004\b9\u0010:J\u000f\u0010=\u001a\u00020\tH\u0001¢\u0006\u0004\b<\u0010%J1\u0010?\u001a\u00020\t2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u001e2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00120'H\u0001¢\u0006\u0004\b>\u0010*J+\u0010E\u001a\b\u0012\u0004\u0012\u00020B0D2\u0014\b\u0002\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0A0@H\u0004¢\u0006\u0004\bE\u0010FJ\u001f\u0010J\u001a\u00020\t2\u0006\u0010G\u001a\u00020\u00122\u0006\u0010I\u001a\u00020HH\u0002¢\u0006\u0004\bJ\u0010KR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010L\u001a\u0004\bM\u0010NR\u0014\u0010R\u001a\u00020O8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006T"}, d2 = {"Lcom/braze/storage/DataStoreProvider;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/braze/enums/DataStoreKey;", "key", "value", "", "writeData", "(Lcom/braze/enums/DataStoreKey;Ljava/lang/Object;)V", "default", "readData", "(Lcom/braze/enums/DataStoreKey;Ljava/lang/Object;)Ljava/lang/Object;", "", "readBoolean", "(Lcom/braze/enums/DataStoreKey;Ljava/lang/Boolean;)Ljava/lang/Boolean;", "", "readString", "(Lcom/braze/enums/DataStoreKey;Ljava/lang/String;)Ljava/lang/String;", "", "readInt", "(Lcom/braze/enums/DataStoreKey;Ljava/lang/Integer;)Ljava/lang/Integer;", "", "readFloat", "(Lcom/braze/enums/DataStoreKey;Ljava/lang/Float;)Ljava/lang/Float;", "", "readLong", "(Lcom/braze/enums/DataStoreKey;Ljava/lang/Long;)Ljava/lang/Long;", "", "Landroidx/datastore/preferences/core/Preferences$Key;", "readAllData", "()Ljava/util/Map;", "clearData", "(Lcom/braze/enums/DataStoreKey;)V", "clearAllData", "()V", "updates", "", "removals", "batchUpdate", "(Ljava/util/Map;Ljava/util/Set;)V", "T", "write$android_sdk_base_release", "(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V", "write", "defaultValue", "read$android_sdk_base_release", "(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)Ljava/lang/Object;", "read", "contains$android_sdk_base_release", "(Landroidx/datastore/preferences/core/Preferences$Key;)Z", "contains", "(Lcom/braze/enums/DataStoreKey;)Z", "readAll$android_sdk_base_release", "readAll", "clear$android_sdk_base_release", "(Landroidx/datastore/preferences/core/Preferences$Key;)V", "clear", "clearAll$android_sdk_base_release", "clearAll", "batchUpdates$android_sdk_base_release", "batchUpdates", "", "Landroidx/datastore/migrations/SharedPreferencesMigration;", "Landroidx/datastore/preferences/core/Preferences;", "migrations", "Landroidx/datastore/core/DataStore;", "createOrGetDataStore", "(Ljava/util/List;)Landroidx/datastore/core/DataStore;", "message", "", "throwable", "publishException", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lkotlinx/coroutines/CoroutineScope;", "getDataStoreScope$android_sdk_base_release", "()Lkotlinx/coroutines/CoroutineScope;", "dataStoreScope", "Companion", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class DataStoreProvider {
    private static m9 eventPublisher;
    private final Context context;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) DataStoreProvider.class);
    private static final ConcurrentHashMap<String, DataStore> dataStoreInstanceCache = new ConcurrentHashMap<>();
    private static final Object scopeCreationLock = new Object();
    private static final ConcurrentHashMap<String, CoroutineScope> dataStoreScopeMap = new ConcurrentHashMap<>();

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[DataStoreValueType.values().length];
            try {
                iArr[DataStoreValueType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DataStoreValueType.DOUBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DataStoreValueType.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DataStoreValueType.BOOLEAN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DataStoreValueType.FLOAT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DataStoreValueType.LONG.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DataStoreValueType.MAP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DataStoreValueType.LIST.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.braze.storage.DataStoreProvider$publishException$1", f = "DataStoreProvider.kt", l = {}, m = "invokeSuspend", v = 1)
    /* loaded from: classes4.dex */
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int a;
        final /* synthetic */ m9 b;
        final /* synthetic */ String c;
        final /* synthetic */ Throwable d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(m9 m9Var, String str, Throwable th, Continuation<? super f> continuation) {
            super(2, continuation);
            this.b = m9Var;
            this.c = str;
            this.d = th;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.a != 0) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
            ((r7) this.b).b(new jf(this.c, this.d), jf.class);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    /* loaded from: classes4.dex */
    public final class i implements Function0<String> {
        final /* synthetic */ DataStoreKey a;

        public i(DataStoreKey dataStoreKey) {
            this.a = dataStoreKey;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Key ", this.a.getKey(), " is not a LIST type. Returning empty list.");
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    /* loaded from: classes4.dex */
    public final class j implements Function0<String> {
        final /* synthetic */ DataStoreKey a;

        public j(DataStoreKey dataStoreKey) {
            this.a = dataStoreKey;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Recorder$$ExternalSyntheticOutline2.m("Failed to read list from DataStore for key: ", this.a.getKey());
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    /* loaded from: classes4.dex */
    public final class l implements Function0<String> {
        final /* synthetic */ DataStoreKey a;

        public l(DataStoreKey dataStoreKey) {
            this.a = dataStoreKey;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Key ", this.a.getKey(), " is not a MAP type. Returning empty map.");
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    /* loaded from: classes4.dex */
    public final class m implements Function0<String> {
        final /* synthetic */ DataStoreKey a;

        public m(DataStoreKey dataStoreKey) {
            this.a = dataStoreKey;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Recorder$$ExternalSyntheticOutline2.m("Failed to read map from DataStore for key: ", this.a.getKey());
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    /* loaded from: classes4.dex */
    public final class o implements Function0<String> {
        final /* synthetic */ DataStoreKey a;

        public o(DataStoreKey dataStoreKey) {
            this.a = dataStoreKey;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return CameraSelector$$ExternalSyntheticOutline0.m("Key ", this.a.getKey(), " is not a LIST type. Cannot write key:", this.a.getKey());
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    /* loaded from: classes4.dex */
    public final class p implements Function0<String> {
        final /* synthetic */ DataStoreKey a;

        public p(DataStoreKey dataStoreKey) {
            this.a = dataStoreKey;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Recorder$$ExternalSyntheticOutline2.m("Failed to write list to DataStore for key: ", this.a.getKey());
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    /* loaded from: classes4.dex */
    public final class q implements Function0<String> {
        final /* synthetic */ DataStoreKey a;

        public q(DataStoreKey dataStoreKey) {
            this.a = dataStoreKey;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return CameraSelector$$ExternalSyntheticOutline0.m("Key ", this.a.getKey(), " is not a MAP type. Cannot write key:", this.a.getKey());
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    /* loaded from: classes4.dex */
    public final class r implements Function0<String> {
        final /* synthetic */ DataStoreKey a;

        public r(DataStoreKey dataStoreKey) {
            this.a = dataStoreKey;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Recorder$$ExternalSyntheticOutline2.m("Failed to write map to DataStore for key: ", this.a.getKey());
        }
    }

    public DataStoreProvider(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.context = applicationContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DataStore createOrGetDataStore$default(DataStoreProvider dataStoreProvider, List list, int i2, Object obj) {
        if (obj != null) {
            a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: createOrGetDataStore");
            return null;
        }
        if ((i2 & 1) != 0) {
            list = EmptyList.INSTANCE;
        }
        return dataStoreProvider.createOrGetDataStore(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File createOrGetDataStore$lambda$0$0(DataStoreProvider dataStoreProvider, String str) {
        File filesDir = dataStoreProvider.context.getFilesDir();
        filesDir.getClass();
        return FilesKt__UtilsKt.resolve(filesDir, "datastore/" + str + ".preferences_pb");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Preferences createOrGetDataStore$lambda$0$1(String str, DataStoreProvider dataStoreProvider, CorruptionException corruptionException) {
        corruptionException.getClass();
        String str2 = "DataStore file corrupted for " + str + ", resetting to empty preferences";
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) corruptionException, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda9(str2, 8), 8, (Object) null);
        dataStoreProvider.publishException(str2, corruptionException);
        return new MutablePreferences(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createOrGetDataStore$lambda$0$1$0(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void publishException(String message, Throwable throwable) {
        m9 m9Var = eventPublisher;
        if (m9Var == null) {
            return;
        }
        try {
            JobKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new f(m9Var, message, throwable, null), 3);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda7(0), 8, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String publishException$lambda$0() {
        return "Failed to publish exception";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readBoolean$lambda$0(DataStoreKey dataStoreKey, Boolean bool) {
        DataStoreValueType type2 = dataStoreKey.getType();
        StringBuilder sb = new StringBuilder("Not reading data with with key:'");
        sb.append(dataStoreKey);
        sb.append("' type:'");
        sb.append(type2);
        sb.append("' due to mismatched data type - expected boolean. Returning default value:'");
        return Thread$State$EnumUnboxingLocalUtility.m(sb, bool, "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readData$lambda$0(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readFloat$lambda$0(DataStoreKey dataStoreKey, Float f2) {
        return "Not reading data with key:'" + dataStoreKey + "' type:'" + dataStoreKey.getType() + "' due to mismatched data type - expected float. Returning default value:'" + f2 + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readInt$lambda$0(DataStoreKey dataStoreKey, Integer num) {
        DataStoreValueType type2 = dataStoreKey.getType();
        StringBuilder sb = new StringBuilder("Not reading data with key:'");
        sb.append(dataStoreKey);
        sb.append("' type:'");
        sb.append(type2);
        sb.append("' due to mismatched data type - expected int. Returning default value:'");
        return NavAction$$ExternalSyntheticOutline0.m(sb, num, "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readLong$lambda$0(DataStoreKey dataStoreKey, Long l2) {
        DataStoreValueType type2 = dataStoreKey.getType();
        StringBuilder sb = new StringBuilder("Not reading data with key:'");
        sb.append(dataStoreKey);
        sb.append("' type:'");
        sb.append(type2);
        sb.append("' due to mismatched data type - expected long. Returning default value:'");
        return Thread$State$EnumUnboxingLocalUtility.m(sb, l2, "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readString$lambda$0(DataStoreKey dataStoreKey, String str) {
        DataStoreValueType type2 = dataStoreKey.getType();
        StringBuilder sb = new StringBuilder("Not reading data with key:'");
        sb.append(dataStoreKey);
        sb.append("' type:'");
        sb.append(type2);
        sb.append("' due to mismatched data type - expected string. Returning default value:'");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, str, "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String writeData$lambda$0(String str) {
        return str;
    }

    public void batchUpdate(Map<String, ? extends Object> updates, Set<String> removals) {
        updates.getClass();
        removals.getClass();
        batchUpdates$android_sdk_base_release(updates, removals);
    }

    public final void batchUpdates$android_sdk_base_release(Map<String, ? extends Object> updates, Set<String> removals) {
        updates.getClass();
        removals.getClass();
        JobKt.runBlockingK(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new b(updates, removals, null));
    }

    public final <T> void clear$android_sdk_base_release(Preferences.Key key) {
        key.getClass();
        JobKt.runBlockingK(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new c(key, null));
    }

    public final void clearAll$android_sdk_base_release() {
        JobKt.runBlockingK(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new d(null));
    }

    public void clearAllData() {
        clearAll$android_sdk_base_release();
    }

    public void clearData(DataStoreKey key) {
        key.getClass();
        switch (a.a[key.getType().ordinal()]) {
            case 1:
                clear$android_sdk_base_release(Strings.intKey(key.getKey()));
                break;
            case 2:
                clear$android_sdk_base_release(Strings.doubleKey(key.getKey()));
                break;
            case 3:
                clear$android_sdk_base_release(Strings.stringKey(key.getKey()));
                break;
            case 4:
                clear$android_sdk_base_release(Strings.booleanKey(key.getKey()));
                break;
            case 5:
                clear$android_sdk_base_release(Strings.floatKey(key.getKey()));
                break;
            case 6:
                clear$android_sdk_base_release(Strings.longKey(key.getKey()));
                break;
            case 7:
                clear$android_sdk_base_release(Strings.stringKey(key.getKey()));
                break;
            case 8:
                clear$android_sdk_base_release(Strings.stringKey(key.getKey()));
                break;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                break;
        }
    }

    public boolean contains(DataStoreKey key) {
        key.getClass();
        switch (a.a[key.getType().ordinal()]) {
            case 1:
                return contains$android_sdk_base_release(Strings.intKey(key.getKey()));
            case 2:
                return contains$android_sdk_base_release(Strings.doubleKey(key.getKey()));
            case 3:
                return contains$android_sdk_base_release(Strings.stringKey(key.getKey()));
            case 4:
                return contains$android_sdk_base_release(Strings.booleanKey(key.getKey()));
            case 5:
                return contains$android_sdk_base_release(Strings.floatKey(key.getKey()));
            case 6:
                return contains$android_sdk_base_release(Strings.longKey(key.getKey()));
            case 7:
                return contains$android_sdk_base_release(Strings.stringKey(key.getKey()));
            case 8:
                return contains$android_sdk_base_release(Strings.stringKey(key.getKey()));
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return false;
        }
    }

    public final <T> boolean contains$android_sdk_base_release(Preferences.Key key) {
        key.getClass();
        return ((Boolean) JobKt.runBlockingK(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new e(key, null))).booleanValue();
    }

    public final DataStore createOrGetDataStore(List<? extends SharedPreferencesMigration> migrations) {
        migrations.getClass();
        final String dataStoreFileName = getDataStoreFileName();
        ConcurrentHashMap<String, DataStore> concurrentHashMap = dataStoreInstanceCache;
        DataStore dataStore = concurrentHashMap.get(dataStoreFileName);
        if (dataStore == null) {
            DataStoreProvider$$ExternalSyntheticLambda5 dataStoreProvider$$ExternalSyntheticLambda5 = new DataStoreProvider$$ExternalSyntheticLambda5(0, this, dataStoreFileName);
            MemoryCacheService memoryCacheService = new MemoryCacheService(new Function1(this) { // from class: com.braze.storage.DataStoreProvider$$ExternalSyntheticLambda6
                public final /* synthetic */ DataStoreProvider f$1;

                {
                    this.f$1 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Preferences createOrGetDataStore$lambda$0$1;
                    createOrGetDataStore$lambda$0$1 = DataStoreProvider.createOrGetDataStore$lambda$0$1(dataStoreFileName, this.f$1, (CorruptionException) obj);
                    return createOrGetDataStore$lambda$0$1;
                }
            }, 17);
            CoroutineScope dataStoreScope$android_sdk_base_release = getDataStoreScope$android_sdk_base_release();
            dataStoreScope$android_sdk_base_release.getClass();
            PreferenceDataStore preferenceDataStore = new PreferenceDataStore(new PreferenceDataStore(new DataStoreImpl(new FileStorage(PreferencesFileSerializer.INSTANCE, new ContourLayout$geometry$1(dataStoreProvider$$ExternalSyntheticLambda5, 14)), CollectionsKt__CollectionsJVMKt.listOf(new GatedFrameClock.AnonymousClass1(migrations, (Continuation) null, 12)), memoryCacheService, dataStoreScope$android_sdk_base_release)));
            dataStore = concurrentHashMap.putIfAbsent(dataStoreFileName, preferenceDataStore);
            if (dataStore == null) {
                dataStore = preferenceDataStore;
            }
        }
        return dataStore;
    }

    public final Context getContext() {
        return this.context;
    }

    public abstract /* synthetic */ DataStore getDataStore();

    public abstract /* synthetic */ String getDataStoreFileName();

    public final CoroutineScope getDataStoreScope$android_sdk_base_release() {
        return INSTANCE.getOrCreateScopeForKey$android_sdk_base_release(getDataStoreFileName());
    }

    public final <T> T read$android_sdk_base_release(Preferences.Key key, T defaultValue) {
        key.getClass();
        return (T) JobKt.runBlockingK(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new g(key, defaultValue, null));
    }

    public final Map<Preferences.Key, Object> readAll$android_sdk_base_release() {
        return (Map) JobKt.runBlockingK(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new h(null));
    }

    public Map<Preferences.Key, Object> readAllData() {
        return readAll$android_sdk_base_release();
    }

    public Boolean readBoolean(DataStoreKey key, Boolean r10) {
        key.getClass();
        try {
            return (Boolean) read$android_sdk_base_release(Strings.booleanKey(key.getKey()), r10);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new a$$ExternalSyntheticLambda0(3, key, r10), 8, (Object) null);
            return r10;
        }
    }

    public Object readData(DataStoreKey key, Object r11) {
        key.getClass();
        try {
            switch (a.a[key.getType().ordinal()]) {
                case 1:
                    Preferences.Key intKey = Strings.intKey(key.getKey());
                    r11.getClass();
                    return read$android_sdk_base_release(intKey, (Integer) r11);
                case 2:
                    Preferences.Key doubleKey = Strings.doubleKey(key.getKey());
                    r11.getClass();
                    return read$android_sdk_base_release(doubleKey, (Double) r11);
                case 3:
                    Preferences.Key stringKey = Strings.stringKey(key.getKey());
                    r11.getClass();
                    return read$android_sdk_base_release(stringKey, (String) r11);
                case 4:
                    Preferences.Key booleanKey = Strings.booleanKey(key.getKey());
                    r11.getClass();
                    return read$android_sdk_base_release(booleanKey, (Boolean) r11);
                case 5:
                    Preferences.Key floatKey = Strings.floatKey(key.getKey());
                    r11.getClass();
                    return read$android_sdk_base_release(floatKey, (Float) r11);
                case 6:
                    Preferences.Key longKey = Strings.longKey(key.getKey());
                    r11.getClass();
                    return read$android_sdk_base_release(longKey, (Long) r11);
                case 7:
                    Preferences.Key stringKey2 = Strings.stringKey(key.getKey());
                    r11.getClass();
                    return read$android_sdk_base_release(stringKey2, (String) r11);
                case 8:
                    Preferences.Key stringKey3 = Strings.stringKey(key.getKey());
                    r11.getClass();
                    return read$android_sdk_base_release(stringKey3, (String) r11);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e2) {
            DataStoreValueType type2 = key.getType();
            StringBuilder sb = new StringBuilder("Not reading data with key:'");
            sb.append(key);
            sb.append("' type:'");
            sb.append(type2);
            sb.append("' due to mismatched data type. Returning default value:'");
            String m2 = Recorder$$ExternalSyntheticOutline1.m(sb, r11, "'");
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda9(m2, 0), 8, (Object) null);
            publishException(m2, e2);
            return r11;
        }
    }

    public Float readFloat(DataStoreKey key, Float r10) {
        key.getClass();
        try {
            return (Float) read$android_sdk_base_release(Strings.floatKey(key.getKey()), r10);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new a$$ExternalSyntheticLambda0(1, key, r10), 8, (Object) null);
            return r10;
        }
    }

    public Integer readInt(DataStoreKey key, Integer r10) {
        key.getClass();
        try {
            return (Integer) read$android_sdk_base_release(Strings.intKey(key.getKey()), r10);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new a$$ExternalSyntheticLambda0(5, key, r10), 8, (Object) null);
            return r10;
        }
    }

    public Long readLong(DataStoreKey key, Long r11) {
        key.getClass();
        try {
            return (Long) read$android_sdk_base_release(Strings.longKey(key.getKey()), r11);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new a$$ExternalSyntheticLambda0(2, key, r11), 4, (Object) null);
            return r11;
        }
    }

    public String readString(DataStoreKey key, String r10) {
        key.getClass();
        try {
            return (String) read$android_sdk_base_release(Strings.stringKey(key.getKey()), r10);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new a$$ExternalSyntheticLambda0(4, key, r10), 8, (Object) null);
            return r10;
        }
    }

    public final <T> void write$android_sdk_base_release(Preferences.Key key, T value) {
        key.getClass();
        JobKt.runBlockingK(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new n(value, key, null));
    }

    public void writeData(DataStoreKey key, Object value) {
        key.getClass();
        value.getClass();
        try {
            switch (a.a[key.getType().ordinal()]) {
                case 1:
                    write$android_sdk_base_release(Strings.intKey(key.getKey()), (Integer) value);
                    return;
                case 2:
                    write$android_sdk_base_release(Strings.doubleKey(key.getKey()), (Double) value);
                    return;
                case 3:
                    write$android_sdk_base_release(Strings.stringKey(key.getKey()), (String) value);
                    return;
                case 4:
                    write$android_sdk_base_release(Strings.booleanKey(key.getKey()), (Boolean) value);
                    return;
                case 5:
                    write$android_sdk_base_release(Strings.floatKey(key.getKey()), (Float) value);
                    return;
                case 6:
                    write$android_sdk_base_release(Strings.longKey(key.getKey()), (Long) value);
                    return;
                case 7:
                    write$android_sdk_base_release(Strings.stringKey(key.getKey()), (String) value);
                    return;
                case 8:
                    write$android_sdk_base_release(Strings.stringKey(key.getKey()), (String) value);
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e2) {
            String str = "Not storing data with key:'" + key + "' value:'" + value + "' type:'" + key.getType() + "' due to mismatched data type.";
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda2(str, 0), 8, (Object) null);
            publishException(str, e2);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000bR\u0014\u0010\u0016\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000bR\u0014\u0010\u0017\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000bR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/braze/storage/DataStoreProvider$Companion;", "", "<init>", "()V", "", "key", "Lkotlinx/coroutines/CoroutineScope;", "getOrCreateScopeForKey$android_sdk_base_release", "(Ljava/lang/String;)Lkotlinx/coroutines/CoroutineScope;", "getOrCreateScopeForKey", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "Lbo/app/m9;", "eventPublisher", "Lbo/app/m9;", "getEventPublisher$android_sdk_base_release", "()Lbo/app/m9;", "setEventPublisher$android_sdk_base_release", "(Lbo/app/m9;)V", "PERSISTENT_DATASTORE_PREFIX", "BRAZE_DATASTORE_PREFIX", "RUNTIME_CONFIG_PREFIX", "", "FILE_DELETE_MAX_RETRIES", "I", "", "FILE_DELETE_RETRY_DELAY_MS", "J", "scopeCreationLock", "Ljava/lang/Object;", "Ljava/util/concurrent/ConcurrentHashMap;", "dataStoreScopeMap", "Ljava/util/concurrent/ConcurrentHashMap;", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getOrCreateScopeForKey$lambda$1$1(String str, CoroutineScope coroutineScope) {
            return "Creating new CoroutineScope for DataStore for key: " + str + " scope: " + coroutineScope;
        }

        public final CoroutineScope getOrCreateScopeForKey$android_sdk_base_release(String key) {
            CoroutineScope coroutineScope;
            key.getClass();
            CoroutineScope coroutineScope2 = (CoroutineScope) DataStoreProvider.dataStoreScopeMap.get(key);
            if (coroutineScope2 != null && JobKt.isActive(coroutineScope2)) {
                return coroutineScope2;
            }
            synchronized (DataStoreProvider.scopeCreationLock) {
                try {
                    CoroutineScope coroutineScope3 = (CoroutineScope) DataStoreProvider.dataStoreScopeMap.get(key);
                    if (coroutineScope3 == null || !JobKt.isActive(coroutineScope3)) {
                        ContextScope CoroutineScope = JobKt.CoroutineScope(BrazeCoroutineScope.INSTANCE.getCoroutineContext().plus(JobKt.SupervisorJob$default()));
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) DataStoreProvider.INSTANCE, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda5(key, CoroutineScope), 6, (Object) null);
                        DataStoreProvider.dataStoreScopeMap.put(key, CoroutineScope);
                        coroutineScope = CoroutineScope;
                    }
                } finally {
                }
            }
            return coroutineScope;
        }

        public final String getTAG() {
            return DataStoreProvider.TAG;
        }

        public final void setEventPublisher$android_sdk_base_release(m9 m9Var) {
            DataStoreProvider.eventPublisher = m9Var;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.braze.storage.DataStoreProvider$batchUpdates$1", f = "DataStoreProvider.kt", l = {512}, m = "invokeSuspend", v = 1)
    /* loaded from: classes4.dex */
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
        int a;
        final /* synthetic */ Map<String, Object> c;
        final /* synthetic */ Set<String> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Map<String, ? extends Object> map, Set<String> set, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = map;
            this.d = set;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<Object> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DataStoreProvider.this.new b(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            int i2 = 1;
            try {
                if (i != 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                DataStore dataStore = DataStoreProvider.this.getDataStore();
                a aVar = new a(this.d, this.c, null);
                this.a = 1;
                Object edit = DimensionKt.edit(dataStore, aVar, this);
                return edit == coroutineSingletons ? coroutineSingletons : edit;
            } catch (Exception e) {
                String str = "Failed to perform batch update with updates:" + this.c + " and removals:" + this.d;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda9(str, i2), 8, (Object) null);
                DataStoreProvider.this.publishException(str, e);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a(String str) {
            return str;
        }

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "preferences", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 2, 0}, xi = 48)
        @DebugMetadata(c = "com.braze.storage.DataStoreProvider$batchUpdates$1$1", f = "DataStoreProvider.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
            int a;
            /* synthetic */ Object b;
            final /* synthetic */ Set<String> c;
            final /* synthetic */ Map<String, Object> d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Set<String> set, Map<String, ? extends Object> map, Continuation<? super a> continuation) {
                super(2, continuation);
                this.c = set;
                this.d = map;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String a(String str, Object obj) {
                return "Adding/updating key: " + str + " with value: " + obj + " in DataStore.";
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String b(String str, Object obj) {
                return CameraSelector$$ExternalSyntheticOutline0.m("Unsupported value type for key '", str, "': ", Reflection.factory.getOrCreateKotlinClass(obj.getClass()).getSimpleName());
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.c, this.d, continuation);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                MutablePreferences mutablePreferences = (MutablePreferences) this.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.a != 0) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                for (String str : this.c) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda9(str, 2), 12, (Object) null);
                    mutablePreferences.remove(Strings.stringKey(str));
                    mutablePreferences.remove(new Preferences.Key(str));
                    mutablePreferences.remove(new Preferences.Key(str));
                    mutablePreferences.remove(new Preferences.Key(str));
                    mutablePreferences.remove(new Preferences.Key(str));
                    mutablePreferences.remove(new Preferences.Key(str));
                }
                for (Map.Entry<String, Object> entry : this.d.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                    Companion companion = DataStoreProvider.INSTANCE;
                    BrazeLogger.brazelog$default(brazeLogger, companion.getTAG(), BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new DataStoreProvider$b$a$$ExternalSyntheticLambda1(key, 0, value), 12, (Object) null);
                    if (value instanceof String) {
                        Preferences.Key stringKey = Strings.stringKey(key);
                        mutablePreferences.getClass();
                        mutablePreferences.setUnchecked$datastore_preferences_core_release(stringKey, value);
                    } else if (value instanceof Integer) {
                        Preferences.Key intKey = Strings.intKey(key);
                        mutablePreferences.getClass();
                        mutablePreferences.setUnchecked$datastore_preferences_core_release(intKey, value);
                    } else if (value instanceof Long) {
                        Preferences.Key longKey = Strings.longKey(key);
                        mutablePreferences.getClass();
                        mutablePreferences.setUnchecked$datastore_preferences_core_release(longKey, value);
                    } else if (value instanceof Float) {
                        Preferences.Key floatKey = Strings.floatKey(key);
                        mutablePreferences.getClass();
                        mutablePreferences.setUnchecked$datastore_preferences_core_release(floatKey, value);
                    } else if (value instanceof Double) {
                        Preferences.Key doubleKey = Strings.doubleKey(key);
                        mutablePreferences.getClass();
                        mutablePreferences.setUnchecked$datastore_preferences_core_release(doubleKey, value);
                    } else if (value instanceof Boolean) {
                        Preferences.Key booleanKey = Strings.booleanKey(key);
                        mutablePreferences.getClass();
                        mutablePreferences.setUnchecked$datastore_preferences_core_release(booleanKey, value);
                    } else {
                        BrazeLogger.brazelog$default(brazeLogger, companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider$b$a$$ExternalSyntheticLambda1(key, 1, value), 12, (Object) null);
                    }
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String a(String str) {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Removing key: ", str, " from DataStore.");
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
                return ((a) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.braze.storage.DataStoreProvider$clearAll$1", f = "DataStoreProvider.kt", l = {490}, m = "invokeSuspend", v = 1)
    /* loaded from: classes4.dex */
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
        Object a;
        int b;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "storage", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 2, 0}, xi = 48)
        @DebugMetadata(c = "com.braze.storage.DataStoreProvider$clearAll$1$2", f = "DataStoreProvider.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
            int a;
            /* synthetic */ Object b;

            public a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
                return ((a) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(continuation);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                MutablePreferences mutablePreferences = (MutablePreferences) this.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.a != 0) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                mutablePreferences.checkNotFrozen$datastore_preferences_core_release();
                mutablePreferences.preferencesMap.clear();
                return Unit.INSTANCE;
            }
        }

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<Object> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DataStoreProvider.this.new d(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.b;
            int i2 = 1;
            try {
                if (i != 0) {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                SafeTrace.throwOnFailure(obj);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda7(i2), 12, (Object) null);
                DataStore dataStore = DataStoreProvider.this.getDataStore();
                a aVar = new a(null);
                this.a = null;
                this.b = 1;
                Object edit = DimensionKt.edit(dataStore, aVar, this);
                return edit == coroutineSingletons ? coroutineSingletons : edit;
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda7(2), 8, (Object) null);
                DataStoreProvider.this.publishException("Failed to clear all data in file.", e);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a(String str) {
            return str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a() {
            return "Clearing all data in file.";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.braze.storage.DataStoreProvider$contains$1", f = "DataStoreProvider.kt", l = {HttpStatusCode.TOO_MANY_REQUESTS_429}, m = "invokeSuspend", v = 1)
    /* loaded from: classes4.dex */
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        Object a;
        int b;
        final /* synthetic */ Preferences.Key d;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Flow {
            final /* synthetic */ Flow a;
            final /* synthetic */ Preferences.Key b;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            /* renamed from: com.braze.storage.DataStoreProvider$e$a$a, reason: collision with other inner class name */
            public static final class C0003a<T> implements FlowCollector {
                final /* synthetic */ FlowCollector a;
                final /* synthetic */ Preferences.Key b;

                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                @DebugMetadata(c = "com.braze.storage.DataStoreProvider$contains$1$invokeSuspend$$inlined$map$1$2", f = "DataStoreProvider.kt", l = {50}, m = "emit", v = 1)
                /* renamed from: com.braze.storage.DataStoreProvider$e$a$a$a, reason: collision with other inner class name */
                public static final class C0004a extends ContinuationImpl {
                    /* synthetic */ Object a;
                    int b;
                    Object c;
                    Object e;
                    Object f;
                    Object g;
                    int h;

                    public C0004a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= PKIFailureInfo.systemUnavail;
                        return C0003a.this.emit(null, this);
                    }
                }

                public C0003a(FlowCollector flowCollector, Preferences.Key key) {
                    this.a = flowCollector;
                    this.b = key;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C0004a c0004a;
                    int i;
                    if (continuation instanceof C0004a) {
                        c0004a = (C0004a) continuation;
                        int i2 = c0004a.b;
                        if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                            c0004a.b = i2 - PKIFailureInfo.systemUnavail;
                            Object obj2 = c0004a.a;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = c0004a.b;
                            if (i != 0) {
                                SafeTrace.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.a;
                                Object obj3 = ((Preferences) obj).get(this.b);
                                c0004a.c = null;
                                c0004a.e = null;
                                c0004a.f = null;
                                c0004a.g = null;
                                c0004a.h = 0;
                                c0004a.b = 1;
                                if (flowCollector.emit(obj3, c0004a) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c0004a = new C0004a(continuation);
                    Object obj22 = c0004a.a;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = c0004a.b;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            public a(Flow flow, Preferences.Key key) {
                this.a = flow;
                this.b = key;
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object collect = this.a.collect(new C0003a(flowCollector, this.b), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Preferences.Key key, Continuation<? super e> continuation) {
            super(2, continuation);
            this.d = key;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DataStoreProvider.this.new e(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.b;
            boolean z = false;
            int i2 = 1;
            try {
                if (i == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new DataStoreProvider$c$$ExternalSyntheticLambda0(this.d, i2), 12, (Object) null);
                    a aVar = new a(DataStoreProvider.this.getDataStore().getData(), this.d);
                    this.a = null;
                    this.b = 1;
                    obj = FlowKt.firstOrNull(aVar, this);
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
                if (obj != null) {
                    z = true;
                }
            } catch (Exception e) {
                String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to check if data store contains key: ", this.d.name, ". Using default value: false.");
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda9(m, 4), 8, (Object) null);
                DataStoreProvider.this.publishException(m, e);
            }
            return Boolean.valueOf(z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a(String str) {
            return str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a(Preferences.Key key) {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Checking if data store contains data for key: ", key.name, ".");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u0003H\n"}, d2 = {"<anonymous>", "T", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.braze.storage.DataStoreProvider$read$1", f = "DataStoreProvider.kt", l = {411}, m = "invokeSuspend", v = 1)
    /* loaded from: classes4.dex */
    public static final class g<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
        Object a;
        int b;
        final /* synthetic */ Preferences.Key d;
        final /* synthetic */ T e;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Flow {
            final /* synthetic */ Flow a;
            final /* synthetic */ Preferences.Key b;
            final /* synthetic */ Object c;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            /* renamed from: com.braze.storage.DataStoreProvider$g$a$a, reason: collision with other inner class name */
            public static final class C0005a<T> implements FlowCollector {
                final /* synthetic */ FlowCollector a;
                final /* synthetic */ Preferences.Key b;
                final /* synthetic */ Object c;

                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                @DebugMetadata(c = "com.braze.storage.DataStoreProvider$read$1$invokeSuspend$$inlined$map$1$2", f = "DataStoreProvider.kt", l = {50}, m = "emit", v = 1)
                /* renamed from: com.braze.storage.DataStoreProvider$g$a$a$a, reason: collision with other inner class name */
                public static final class C0006a extends ContinuationImpl {
                    /* synthetic */ Object a;
                    int b;
                    Object c;
                    Object e;
                    Object f;
                    Object g;
                    int h;

                    public C0006a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= PKIFailureInfo.systemUnavail;
                        return C0005a.this.emit(null, this);
                    }
                }

                public C0005a(FlowCollector flowCollector, Preferences.Key key, Object obj) {
                    this.a = flowCollector;
                    this.b = key;
                    this.c = obj;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C0006a c0006a;
                    int i;
                    if (continuation instanceof C0006a) {
                        c0006a = (C0006a) continuation;
                        int i2 = c0006a.b;
                        if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                            c0006a.b = i2 - PKIFailureInfo.systemUnavail;
                            Object obj2 = c0006a.a;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = c0006a.b;
                            if (i != 0) {
                                SafeTrace.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.a;
                                Object obj3 = ((Preferences) obj).get(this.b);
                                if (obj3 == null) {
                                    obj3 = this.c;
                                }
                                c0006a.c = null;
                                c0006a.e = null;
                                c0006a.f = null;
                                c0006a.g = null;
                                c0006a.h = 0;
                                c0006a.b = 1;
                                if (flowCollector.emit(obj3, c0006a) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c0006a = new C0006a(continuation);
                    Object obj22 = c0006a.a;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = c0006a.b;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            public a(Flow flow, Preferences.Key key, Object obj) {
                this.a = flow;
                this.b = key;
                this.c = obj;
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object collect = this.a.collect(new C0005a(flowCollector, this.b, this.c), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Preferences.Key key, T t, Continuation<? super g> continuation) {
            super(2, continuation);
            this.d = key;
            this.e = t;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DataStoreProvider.this.new g(this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.b;
            try {
                if (i != 0) {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                SafeTrace.throwOnFailure(obj);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new DataStoreProvider$c$$ExternalSyntheticLambda0(this.d, 2), 12, (Object) null);
                a aVar = new a(DataStoreProvider.this.getDataStore().getData(), this.d, this.e);
                this.a = null;
                this.b = 1;
                Object first = FlowKt.first(aVar, this);
                return first == coroutineSingletons ? coroutineSingletons : first;
            } catch (Exception e) {
                String str = "Failed to read data for key: " + this.d.name + ". Using default value: " + this.e + ".";
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda9(str, 5), 8, (Object) null);
                DataStoreProvider.this.publishException(str, e);
                return this.e;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a(String str) {
            return str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a(Preferences.Key key) {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Reading data for key: ", key.name, ".");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.braze.storage.DataStoreProvider$readAll$1", f = "DataStoreProvider.kt", l = {457}, m = "invokeSuspend", v = 1)
    /* loaded from: classes4.dex */
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<Preferences.Key, ? extends Object>>, Object> {
        int a;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<Preferences.Key, ? extends Object>> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DataStoreProvider.this.new h(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            try {
                if (i == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda7(3), 12, (Object) null);
                    Flow data = DataStoreProvider.this.getDataStore().getData();
                    this.a = 1;
                    obj = FlowKt.first(data, this);
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
                return ((Preferences) obj).asMap();
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda7(4), 8, (Object) null);
                DataStoreProvider.this.publishException("Failed to read all data from DataStore", e);
                EmptyMap emptyMap = EmptyMap.INSTANCE;
                emptyMap.getClass();
                return emptyMap;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a(String str) {
            return str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a() {
            return "Reading all data from DataStore.";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.braze.storage.DataStoreProvider$clear$1", f = "DataStoreProvider.kt", l = {473}, m = "invokeSuspend", v = 1)
    /* loaded from: classes4.dex */
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
        Object a;
        int b;
        final /* synthetic */ Preferences.Key d;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "storage", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 2, 0}, xi = 48)
        @DebugMetadata(c = "com.braze.storage.DataStoreProvider$clear$1$2", f = "DataStoreProvider.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
            int a;
            /* synthetic */ Object b;
            final /* synthetic */ Preferences.Key c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Preferences.Key key, Continuation<? super a> continuation) {
                super(2, continuation);
                this.c = key;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
                return ((a) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.c, continuation);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                MutablePreferences mutablePreferences = (MutablePreferences) this.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.a != 0) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                mutablePreferences.remove(this.c);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Preferences.Key key, Continuation<? super c> continuation) {
            super(2, continuation);
            this.d = key;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a(Preferences.Key key) {
            return "Clearing all data for key: " + key + ".";
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DataStoreProvider.this.new c(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.b;
            try {
                if (i != 0) {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                SafeTrace.throwOnFailure(obj);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new DataStoreProvider$c$$ExternalSyntheticLambda0(this.d, 0), 12, (Object) null);
                DataStore dataStore = DataStoreProvider.this.getDataStore();
                a aVar = new a(this.d, null);
                this.a = null;
                this.b = 1;
                Object edit = DimensionKt.edit(dataStore, aVar, this);
                return edit == coroutineSingletons ? coroutineSingletons : edit;
            } catch (Exception e) {
                String str = "Failed to clear data for key: " + this.d + ".";
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda9(str, 3), 8, (Object) null);
                DataStoreProvider.this.publishException(str, e);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<Object> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a(String str) {
            return str;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.braze.storage.DataStoreProvider$write$1", f = "DataStoreProvider.kt", l = {392}, m = "invokeSuspend", v = 1)
    public static final class n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
        Object a;
        int b;
        final /* synthetic */ T d;
        final /* synthetic */ Preferences.Key e;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "storage", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 2, 0}, xi = 48)
        @DebugMetadata(c = "com.braze.storage.DataStoreProvider$write$1$2", f = "DataStoreProvider.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
            int a;
            /* synthetic */ Object b;
            final /* synthetic */ Preferences.Key c;
            final /* synthetic */ T d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Preferences.Key key, T t, Continuation<? super a> continuation) {
                super(2, continuation);
                this.c = key;
                this.d = t;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
                return ((a) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.c, this.d, continuation);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                MutablePreferences mutablePreferences = (MutablePreferences) this.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.a != 0) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                mutablePreferences.set(this.c, this.d);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(T t, Preferences.Key key, Continuation<? super n> continuation) {
            super(2, continuation);
            this.d = t;
            this.e = key;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a(Object obj, Preferences.Key key) {
            return "Writing data:" + obj + " for key: " + key.name + ".";
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DataStoreProvider.this.new n(this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.b;
            int i2 = 1;
            try {
                if (i != 0) {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                SafeTrace.throwOnFailure(obj);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda5(i2, this.d, this.e), 12, (Object) null);
                DataStore dataStore = DataStoreProvider.this.getDataStore();
                a aVar = new a(this.e, this.d, null);
                this.a = null;
                this.b = 1;
                Object edit = DimensionKt.edit(dataStore, aVar, this);
                return edit == coroutineSingletons ? coroutineSingletons : edit;
            } catch (Exception e) {
                String str = "Failed to write data:" + this.d + " for key: " + this.e.name + ".";
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda2(str, i2), 8, (Object) null);
                DataStoreProvider.this.publishException(str, e);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<Object> continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a(String str) {
            return str;
        }
    }
}
