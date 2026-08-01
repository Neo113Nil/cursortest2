package com.google.android.datatransport;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import com.android.installreferrer.api.InstallReferrerClient;
import com.icewinter.flow.winter.icecatch.R;
import com.icewinter.flow.winter.icecatch.db.AppDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowVersionControlTransactionManager implements WinterFlowUserManagerUserManager {
    public final WinterFlowRendererNode WinterFlowArrayNetwork;
    public final WinterFlowRendererNode WinterFlowCacheManagerAgent;
    public final WinterFlowRendererNode WinterFlowHookDataSource;
    public final Context WinterFlowRouterStructure;

    public WinterFlowVersionControlTransactionManager(Context context) {
        context.getClass();
        this.WinterFlowRouterStructure = context;
        final int i = 0;
        this.WinterFlowHookDataSource = new WinterFlowRendererNode(new WinterFlowObjectUI(this) { // from class: com.google.android.datatransport.WinterFlowAdapterServer
            public final /* synthetic */ WinterFlowVersionControlTransactionManager WinterFlowTransactionManagerStrategy;

            {
                this.WinterFlowTransactionManagerStrategy = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:76:0x01db, code lost:
            
                com.google.android.datatransport.WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
             */
            /* JADX WARN: Removed duplicated region for block: B:123:0x02f2  */
            /* JADX WARN: Removed duplicated region for block: B:135:0x0311  */
            /* JADX WARN: Removed duplicated region for block: B:96:0x0249 A[LOOP:5: B:84:0x021f->B:96:0x0249, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:97:0x0259 A[SYNTHETIC] */
            @Override // com.google.android.datatransport.WinterFlowObjectUI
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object WinterFlowRouterStructure() {
                Object obj;
                String str;
                WinterFlowRepositoryProtocol winterFlowRepositoryProtocol;
                WinterFlowConsumerServiceProvider winterFlowConsumerServiceProvider;
                int i2 = i;
                WinterFlowVersionControlTransactionManager winterFlowVersionControlTransactionManager = this.WinterFlowTransactionManagerStrategy;
                switch (i2) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        Context context2 = winterFlowVersionControlTransactionManager.WinterFlowRouterStructure;
                        context2.getClass();
                        if (WinterFlowFrameworkStrategy.WinterFlowArrayHelper("fish_archive.db")) {
                            obj = null;
                            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                        } else {
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            WinterFlowConfigurationModule winterFlowConfigurationModule = new WinterFlowConfigurationModule(29);
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                            ArrayList arrayList3 = new ArrayList();
                            WinterFlowEventEmitterCacheManager WinterFlowRouterStructure = WinterFlowListenerProtocol.WinterFlowRouterStructure(AppDatabase.class);
                            if (!linkedHashSet2.isEmpty()) {
                                Iterator it = linkedHashSet2.iterator();
                                while (it.hasNext()) {
                                    int intValue = ((Number) it.next()).intValue();
                                    if (linkedHashSet.contains(Integer.valueOf(intValue))) {
                                        WinterFlowCompilerMechanism.WinterFlowCacheManagerAgent(WinterFlowResolverBackend.WinterFlowSyntax("Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: ", intValue));
                                        return null;
                                    }
                                }
                            }
                            WinterFlowThreadPoolProcess winterFlowThreadPoolProcess = new WinterFlowThreadPoolProcess(11);
                            obj = null;
                            Object systemService = context2.getSystemService("activity");
                            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                            WinterFlowClassView winterFlowClassView = (activityManager == null || activityManager.isLowRamDevice()) ? WinterFlowClassView.WinterFlowVariableVersionControl : WinterFlowClassView.WinterFlowTransactionManagerStrategy;
                            WinterFlowOrchestrationSession winterFlowOrchestrationSession = WinterFlowMiddlewareService.WinterFlowArrayNetwork;
                            WinterFlowConfigurationMiddleware winterFlowConfigurationMiddleware = new WinterFlowConfigurationMiddleware(context2, "fish_archive.db", winterFlowThreadPoolProcess, winterFlowConfigurationModule, arrayList, false, winterFlowClassView, winterFlowOrchestrationSession, winterFlowOrchestrationSession, null, true, false, linkedHashSet, null, null, null, arrayList2, arrayList3, false, null, null);
                            Class WinterFlowConfigurationSubsystem = WinterFlowEncryptionSubsystem.WinterFlowConfigurationSubsystem(WinterFlowRouterStructure);
                            Package r3 = WinterFlowConfigurationSubsystem.getPackage();
                            if (r3 == null || (str = r3.getName()) == null) {
                                str = "";
                            }
                            String canonicalName = WinterFlowConfigurationSubsystem.getCanonicalName();
                            canonicalName.getClass();
                            if (str.length() != 0) {
                                canonicalName = canonicalName.substring(str.length() + 1);
                            }
                            String replace = canonicalName.replace('.', '_');
                            replace.getClass();
                            String concat = replace.concat("_Impl");
                            try {
                                Class<?> cls = Class.forName(str.length() == 0 ? concat : str + '.' + concat, true, WinterFlowConfigurationSubsystem.getClassLoader());
                                cls.getClass();
                                WinterFlowCloudFramework winterFlowCloudFramework = (WinterFlowCloudFramework) cls.getDeclaredConstructor(null).newInstance(null);
                                winterFlowCloudFramework.getClass();
                                winterFlowCloudFramework.WinterFlowResponseEngine = true;
                                try {
                                    winterFlowRepositoryProtocol = winterFlowCloudFramework.WinterFlowCacheManagerAgent();
                                    winterFlowRepositoryProtocol.getClass();
                                } catch (WinterFlowDecoratorEventEmitter unused) {
                                    winterFlowRepositoryProtocol = null;
                                }
                                if (winterFlowRepositoryProtocol == null) {
                                    new WinterFlowConsumerServiceProvider(winterFlowConfigurationMiddleware, new WinterFlowSessionJava(8, winterFlowCloudFramework), new WinterFlowServerSingleton(2, winterFlowCloudFramework, WinterFlowTestingCloud.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 2));
                                    throw null;
                                }
                                winterFlowCloudFramework.WinterFlowVariableVersionControl = new WinterFlowConsumerServiceProvider(winterFlowConfigurationMiddleware, winterFlowRepositoryProtocol, new WinterFlowServerSingleton(2, winterFlowCloudFramework, WinterFlowTestingCloud.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 3));
                                winterFlowCloudFramework.WinterFlowTransactionManagerStrategy = winterFlowCloudFramework.WinterFlowHookDataSource();
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                Set WinterFlowVariableVersionControl = winterFlowCloudFramework.WinterFlowVariableVersionControl();
                                List list = winterFlowConfigurationMiddleware.WinterFlowThreadListener;
                                int size = list.size();
                                boolean[] zArr = new boolean[size];
                                Iterator it2 = WinterFlowVariableVersionControl.iterator();
                                while (true) {
                                    int i3 = -1;
                                    if (it2.hasNext()) {
                                        WinterFlowEventEmitterCacheManager winterFlowEventEmitterCacheManager = (WinterFlowEventEmitterCacheManager) it2.next();
                                        int size2 = list.size() - 1;
                                        if (size2 >= 0) {
                                            while (true) {
                                                int i4 = size2 - 1;
                                                if (winterFlowEventEmitterCacheManager.WinterFlowArrayNetwork(list.get(size2))) {
                                                    zArr[size2] = true;
                                                    i3 = size2;
                                                } else if (i4 >= 0) {
                                                    size2 = i4;
                                                }
                                            }
                                        }
                                        if (i3 >= 0) {
                                            linkedHashMap.put(winterFlowEventEmitterCacheManager, list.get(i3));
                                        } else {
                                            WinterFlowEventEmitterOrchestration.WinterFlowRouterAdapter("A required auto migration spec (", winterFlowEventEmitterCacheManager.WinterFlowHookDataSource(), ") is missing in the database configuration.");
                                        }
                                    } else {
                                        int size3 = list.size() - 1;
                                        if (size3 >= 0) {
                                            while (true) {
                                                int i5 = size3 - 1;
                                                if (size3 < size && zArr[size3]) {
                                                    if (i5 >= 0) {
                                                        size3 = i5;
                                                    }
                                                }
                                            }
                                        }
                                        Iterator it3 = winterFlowCloudFramework.WinterFlowRouterStructure(linkedHashMap).iterator();
                                        if (it3.hasNext()) {
                                            it3.next().getClass();
                                            WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
                                        } else {
                                            LinkedHashMap WinterFlowTransactionManagerStrategy = winterFlowCloudFramework.WinterFlowTransactionManagerStrategy();
                                            List list2 = winterFlowConfigurationMiddleware.WinterFlowServerProtocol;
                                            boolean[] zArr2 = new boolean[list2.size()];
                                            for (Map.Entry entry : WinterFlowTransactionManagerStrategy.entrySet()) {
                                                WinterFlowEventEmitterCacheManager winterFlowEventEmitterCacheManager2 = (WinterFlowEventEmitterCacheManager) entry.getKey();
                                                for (WinterFlowEventEmitterCacheManager winterFlowEventEmitterCacheManager3 : (List) entry.getValue()) {
                                                    int size4 = list2.size() - 1;
                                                    if (size4 >= 0) {
                                                        while (true) {
                                                            int i6 = size4 - 1;
                                                            if (winterFlowEventEmitterCacheManager3.WinterFlowArrayNetwork(list2.get(size4))) {
                                                                zArr2[size4] = true;
                                                            } else if (i6 >= 0) {
                                                                size4 = i6;
                                                            }
                                                        }
                                                        if (size4 < 0) {
                                                            Object obj2 = list2.get(size4);
                                                            winterFlowEventEmitterCacheManager3.getClass();
                                                            obj2.getClass();
                                                            winterFlowCloudFramework.WinterFlowSyntax.put(winterFlowEventEmitterCacheManager3, obj2);
                                                        } else {
                                                            WinterFlowEventEmitterOrchestration.WinterFlowSingletonPlatform("A required type converter (", winterFlowEventEmitterCacheManager3.WinterFlowHookDataSource(), ") for ", winterFlowEventEmitterCacheManager2.WinterFlowHookDataSource(), " is missing in the database configuration.");
                                                        }
                                                    }
                                                    size4 = -1;
                                                    if (size4 < 0) {
                                                    }
                                                }
                                            }
                                            int size5 = list2.size() - 1;
                                            if (size5 >= 0) {
                                                while (true) {
                                                    int i7 = size5 - 1;
                                                    if (!zArr2[size5]) {
                                                        throw new IllegalArgumentException("Unexpected type converter " + list2.get(size5) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                                    }
                                                    if (i7 >= 0) {
                                                        size5 = i7;
                                                    }
                                                }
                                            }
                                            winterFlowCloudFramework.WinterFlowCacheManagerAgent = winterFlowConfigurationMiddleware.WinterFlowUnitTestResponse;
                                            winterFlowCloudFramework.WinterFlowArrayNetwork = new WinterFlowWorkerStructure(winterFlowConfigurationMiddleware.WinterFlowRouterRouter);
                                            Executor executor = winterFlowCloudFramework.WinterFlowCacheManagerAgent;
                                            if (executor == null) {
                                                WinterFlowManagerRequest.WinterFlowCloudMicroservice("internalQueryExecutor");
                                                throw null;
                                            }
                                            WinterFlowEventEmitterFramework WinterFlowHookDataSource = WinterFlowEncryptionSubsystem.WinterFlowHookDataSource(WinterFlowTestingCloud.WinterFlowArrayHelper(WinterFlowTestingCloud.WinterFlowConcurrencyThread(executor), WinterFlowFrameworkMechanism.WinterFlowHookDataSource()));
                                            winterFlowCloudFramework.WinterFlowRouterStructure = WinterFlowHookDataSource;
                                            WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice = WinterFlowHookDataSource.WinterFlowVariableVersionControl;
                                            WinterFlowWorkerStructure winterFlowWorkerStructure = winterFlowCloudFramework.WinterFlowArrayNetwork;
                                            if (winterFlowWorkerStructure == null) {
                                                WinterFlowManagerRequest.WinterFlowCloudMicroservice("internalTransactionExecutor");
                                                throw null;
                                            }
                                            winterFlowCloudFramework.WinterFlowHookDataSource = winterFlowEncryptionMicroservice.WinterFlowOrchestrationSubsystem(WinterFlowTestingCloud.WinterFlowConcurrencyThread(winterFlowWorkerStructure));
                                            WinterFlowConsumerServiceProvider winterFlowConsumerServiceProvider2 = winterFlowCloudFramework.WinterFlowVariableVersionControl;
                                            if (winterFlowConsumerServiceProvider2 == null) {
                                                WinterFlowManagerRequest.WinterFlowCloudMicroservice("connectionManager");
                                                throw null;
                                            }
                                            WinterFlowSyntaxDebug winterFlowSyntaxDebug = (WinterFlowSyntaxDebug) winterFlowConsumerServiceProvider2.WinterFlowUnitTestResponse;
                                            if (winterFlowSyntaxDebug != null) {
                                                while (!(winterFlowSyntaxDebug instanceof WinterFlowDebugRepository)) {
                                                    if (winterFlowSyntaxDebug instanceof WinterFlowWorker) {
                                                        winterFlowSyntaxDebug = ((WinterFlowWorker) winterFlowSyntaxDebug).WinterFlowHookDataSource();
                                                    }
                                                }
                                                winterFlowConsumerServiceProvider = winterFlowCloudFramework.WinterFlowVariableVersionControl;
                                                if (winterFlowConsumerServiceProvider != null) {
                                                    WinterFlowManagerRequest.WinterFlowCloudMicroservice("connectionManager");
                                                    throw null;
                                                }
                                                WinterFlowSyntaxDebug winterFlowSyntaxDebug2 = (WinterFlowSyntaxDebug) winterFlowConsumerServiceProvider.WinterFlowUnitTestResponse;
                                                if (winterFlowSyntaxDebug2 != null) {
                                                    while (!(winterFlowSyntaxDebug2 instanceof WinterFlowAPINetwork)) {
                                                        if (winterFlowSyntaxDebug2 instanceof WinterFlowWorker) {
                                                            winterFlowSyntaxDebug2 = ((WinterFlowWorker) winterFlowSyntaxDebug2).WinterFlowHookDataSource();
                                                        }
                                                    }
                                                    return (AppDatabase) winterFlowCloudFramework;
                                                }
                                                winterFlowSyntaxDebug2 = null;
                                                return (AppDatabase) winterFlowCloudFramework;
                                            }
                                            winterFlowSyntaxDebug = null;
                                            winterFlowConsumerServiceProvider = winterFlowCloudFramework.WinterFlowVariableVersionControl;
                                            if (winterFlowConsumerServiceProvider != null) {
                                            }
                                        }
                                    }
                                }
                            } catch (ClassNotFoundException e) {
                                throw new RuntimeException("Cannot find implementation for " + WinterFlowConfigurationSubsystem.getCanonicalName() + ". " + concat + " does not exist. Is Room annotation processor correctly configured?", e);
                            } catch (IllegalAccessException e2) {
                                throw new RuntimeException("Cannot access the constructor " + WinterFlowConfigurationSubsystem.getCanonicalName(), e2);
                            } catch (InstantiationException e3) {
                                throw new RuntimeException("Failed to create an instance of " + WinterFlowConfigurationSubsystem.getCanonicalName(), e3);
                            }
                        }
                        return obj;
                    case 1:
                        Context context3 = winterFlowVersionControlTransactionManager.WinterFlowRouterStructure;
                        return context3.getSharedPreferences(context3.getString(R.string.app_name) + "_preferences", 0);
                    default:
                        return new WinterFlowControllerInterface(((AppDatabase) winterFlowVersionControlTransactionManager.WinterFlowHookDataSource.getValue()).WinterFlowTransactionAgent());
                }
            }
        });
        final int i2 = 1;
        this.WinterFlowCacheManagerAgent = new WinterFlowRendererNode(new WinterFlowObjectUI(this) { // from class: com.google.android.datatransport.WinterFlowAdapterServer
            public final /* synthetic */ WinterFlowVersionControlTransactionManager WinterFlowTransactionManagerStrategy;

            {
                this.WinterFlowTransactionManagerStrategy = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:76:0x01db, code lost:
            
                com.google.android.datatransport.WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
             */
            /* JADX WARN: Removed duplicated region for block: B:123:0x02f2  */
            /* JADX WARN: Removed duplicated region for block: B:135:0x0311  */
            /* JADX WARN: Removed duplicated region for block: B:96:0x0249 A[LOOP:5: B:84:0x021f->B:96:0x0249, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:97:0x0259 A[SYNTHETIC] */
            @Override // com.google.android.datatransport.WinterFlowObjectUI
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object WinterFlowRouterStructure() {
                Object obj;
                String str;
                WinterFlowRepositoryProtocol winterFlowRepositoryProtocol;
                WinterFlowConsumerServiceProvider winterFlowConsumerServiceProvider;
                int i22 = i2;
                WinterFlowVersionControlTransactionManager winterFlowVersionControlTransactionManager = this.WinterFlowTransactionManagerStrategy;
                switch (i22) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        Context context2 = winterFlowVersionControlTransactionManager.WinterFlowRouterStructure;
                        context2.getClass();
                        if (WinterFlowFrameworkStrategy.WinterFlowArrayHelper("fish_archive.db")) {
                            obj = null;
                            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                        } else {
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            WinterFlowConfigurationModule winterFlowConfigurationModule = new WinterFlowConfigurationModule(29);
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                            ArrayList arrayList3 = new ArrayList();
                            WinterFlowEventEmitterCacheManager WinterFlowRouterStructure = WinterFlowListenerProtocol.WinterFlowRouterStructure(AppDatabase.class);
                            if (!linkedHashSet2.isEmpty()) {
                                Iterator it = linkedHashSet2.iterator();
                                while (it.hasNext()) {
                                    int intValue = ((Number) it.next()).intValue();
                                    if (linkedHashSet.contains(Integer.valueOf(intValue))) {
                                        WinterFlowCompilerMechanism.WinterFlowCacheManagerAgent(WinterFlowResolverBackend.WinterFlowSyntax("Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: ", intValue));
                                        return null;
                                    }
                                }
                            }
                            WinterFlowThreadPoolProcess winterFlowThreadPoolProcess = new WinterFlowThreadPoolProcess(11);
                            obj = null;
                            Object systemService = context2.getSystemService("activity");
                            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                            WinterFlowClassView winterFlowClassView = (activityManager == null || activityManager.isLowRamDevice()) ? WinterFlowClassView.WinterFlowVariableVersionControl : WinterFlowClassView.WinterFlowTransactionManagerStrategy;
                            WinterFlowOrchestrationSession winterFlowOrchestrationSession = WinterFlowMiddlewareService.WinterFlowArrayNetwork;
                            WinterFlowConfigurationMiddleware winterFlowConfigurationMiddleware = new WinterFlowConfigurationMiddleware(context2, "fish_archive.db", winterFlowThreadPoolProcess, winterFlowConfigurationModule, arrayList, false, winterFlowClassView, winterFlowOrchestrationSession, winterFlowOrchestrationSession, null, true, false, linkedHashSet, null, null, null, arrayList2, arrayList3, false, null, null);
                            Class WinterFlowConfigurationSubsystem = WinterFlowEncryptionSubsystem.WinterFlowConfigurationSubsystem(WinterFlowRouterStructure);
                            Package r3 = WinterFlowConfigurationSubsystem.getPackage();
                            if (r3 == null || (str = r3.getName()) == null) {
                                str = "";
                            }
                            String canonicalName = WinterFlowConfigurationSubsystem.getCanonicalName();
                            canonicalName.getClass();
                            if (str.length() != 0) {
                                canonicalName = canonicalName.substring(str.length() + 1);
                            }
                            String replace = canonicalName.replace('.', '_');
                            replace.getClass();
                            String concat = replace.concat("_Impl");
                            try {
                                Class<?> cls = Class.forName(str.length() == 0 ? concat : str + '.' + concat, true, WinterFlowConfigurationSubsystem.getClassLoader());
                                cls.getClass();
                                WinterFlowCloudFramework winterFlowCloudFramework = (WinterFlowCloudFramework) cls.getDeclaredConstructor(null).newInstance(null);
                                winterFlowCloudFramework.getClass();
                                winterFlowCloudFramework.WinterFlowResponseEngine = true;
                                try {
                                    winterFlowRepositoryProtocol = winterFlowCloudFramework.WinterFlowCacheManagerAgent();
                                    winterFlowRepositoryProtocol.getClass();
                                } catch (WinterFlowDecoratorEventEmitter unused) {
                                    winterFlowRepositoryProtocol = null;
                                }
                                if (winterFlowRepositoryProtocol == null) {
                                    new WinterFlowConsumerServiceProvider(winterFlowConfigurationMiddleware, new WinterFlowSessionJava(8, winterFlowCloudFramework), new WinterFlowServerSingleton(2, winterFlowCloudFramework, WinterFlowTestingCloud.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 2));
                                    throw null;
                                }
                                winterFlowCloudFramework.WinterFlowVariableVersionControl = new WinterFlowConsumerServiceProvider(winterFlowConfigurationMiddleware, winterFlowRepositoryProtocol, new WinterFlowServerSingleton(2, winterFlowCloudFramework, WinterFlowTestingCloud.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 3));
                                winterFlowCloudFramework.WinterFlowTransactionManagerStrategy = winterFlowCloudFramework.WinterFlowHookDataSource();
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                Set WinterFlowVariableVersionControl = winterFlowCloudFramework.WinterFlowVariableVersionControl();
                                List list = winterFlowConfigurationMiddleware.WinterFlowThreadListener;
                                int size = list.size();
                                boolean[] zArr = new boolean[size];
                                Iterator it2 = WinterFlowVariableVersionControl.iterator();
                                while (true) {
                                    int i3 = -1;
                                    if (it2.hasNext()) {
                                        WinterFlowEventEmitterCacheManager winterFlowEventEmitterCacheManager = (WinterFlowEventEmitterCacheManager) it2.next();
                                        int size2 = list.size() - 1;
                                        if (size2 >= 0) {
                                            while (true) {
                                                int i4 = size2 - 1;
                                                if (winterFlowEventEmitterCacheManager.WinterFlowArrayNetwork(list.get(size2))) {
                                                    zArr[size2] = true;
                                                    i3 = size2;
                                                } else if (i4 >= 0) {
                                                    size2 = i4;
                                                }
                                            }
                                        }
                                        if (i3 >= 0) {
                                            linkedHashMap.put(winterFlowEventEmitterCacheManager, list.get(i3));
                                        } else {
                                            WinterFlowEventEmitterOrchestration.WinterFlowRouterAdapter("A required auto migration spec (", winterFlowEventEmitterCacheManager.WinterFlowHookDataSource(), ") is missing in the database configuration.");
                                        }
                                    } else {
                                        int size3 = list.size() - 1;
                                        if (size3 >= 0) {
                                            while (true) {
                                                int i5 = size3 - 1;
                                                if (size3 < size && zArr[size3]) {
                                                    if (i5 >= 0) {
                                                        size3 = i5;
                                                    }
                                                }
                                            }
                                        }
                                        Iterator it3 = winterFlowCloudFramework.WinterFlowRouterStructure(linkedHashMap).iterator();
                                        if (it3.hasNext()) {
                                            it3.next().getClass();
                                            WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
                                        } else {
                                            LinkedHashMap WinterFlowTransactionManagerStrategy = winterFlowCloudFramework.WinterFlowTransactionManagerStrategy();
                                            List list2 = winterFlowConfigurationMiddleware.WinterFlowServerProtocol;
                                            boolean[] zArr2 = new boolean[list2.size()];
                                            for (Map.Entry entry : WinterFlowTransactionManagerStrategy.entrySet()) {
                                                WinterFlowEventEmitterCacheManager winterFlowEventEmitterCacheManager2 = (WinterFlowEventEmitterCacheManager) entry.getKey();
                                                for (WinterFlowEventEmitterCacheManager winterFlowEventEmitterCacheManager3 : (List) entry.getValue()) {
                                                    int size4 = list2.size() - 1;
                                                    if (size4 >= 0) {
                                                        while (true) {
                                                            int i6 = size4 - 1;
                                                            if (winterFlowEventEmitterCacheManager3.WinterFlowArrayNetwork(list2.get(size4))) {
                                                                zArr2[size4] = true;
                                                            } else if (i6 >= 0) {
                                                                size4 = i6;
                                                            }
                                                        }
                                                        if (size4 < 0) {
                                                            Object obj2 = list2.get(size4);
                                                            winterFlowEventEmitterCacheManager3.getClass();
                                                            obj2.getClass();
                                                            winterFlowCloudFramework.WinterFlowSyntax.put(winterFlowEventEmitterCacheManager3, obj2);
                                                        } else {
                                                            WinterFlowEventEmitterOrchestration.WinterFlowSingletonPlatform("A required type converter (", winterFlowEventEmitterCacheManager3.WinterFlowHookDataSource(), ") for ", winterFlowEventEmitterCacheManager2.WinterFlowHookDataSource(), " is missing in the database configuration.");
                                                        }
                                                    }
                                                    size4 = -1;
                                                    if (size4 < 0) {
                                                    }
                                                }
                                            }
                                            int size5 = list2.size() - 1;
                                            if (size5 >= 0) {
                                                while (true) {
                                                    int i7 = size5 - 1;
                                                    if (!zArr2[size5]) {
                                                        throw new IllegalArgumentException("Unexpected type converter " + list2.get(size5) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                                    }
                                                    if (i7 >= 0) {
                                                        size5 = i7;
                                                    }
                                                }
                                            }
                                            winterFlowCloudFramework.WinterFlowCacheManagerAgent = winterFlowConfigurationMiddleware.WinterFlowUnitTestResponse;
                                            winterFlowCloudFramework.WinterFlowArrayNetwork = new WinterFlowWorkerStructure(winterFlowConfigurationMiddleware.WinterFlowRouterRouter);
                                            Executor executor = winterFlowCloudFramework.WinterFlowCacheManagerAgent;
                                            if (executor == null) {
                                                WinterFlowManagerRequest.WinterFlowCloudMicroservice("internalQueryExecutor");
                                                throw null;
                                            }
                                            WinterFlowEventEmitterFramework WinterFlowHookDataSource = WinterFlowEncryptionSubsystem.WinterFlowHookDataSource(WinterFlowTestingCloud.WinterFlowArrayHelper(WinterFlowTestingCloud.WinterFlowConcurrencyThread(executor), WinterFlowFrameworkMechanism.WinterFlowHookDataSource()));
                                            winterFlowCloudFramework.WinterFlowRouterStructure = WinterFlowHookDataSource;
                                            WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice = WinterFlowHookDataSource.WinterFlowVariableVersionControl;
                                            WinterFlowWorkerStructure winterFlowWorkerStructure = winterFlowCloudFramework.WinterFlowArrayNetwork;
                                            if (winterFlowWorkerStructure == null) {
                                                WinterFlowManagerRequest.WinterFlowCloudMicroservice("internalTransactionExecutor");
                                                throw null;
                                            }
                                            winterFlowCloudFramework.WinterFlowHookDataSource = winterFlowEncryptionMicroservice.WinterFlowOrchestrationSubsystem(WinterFlowTestingCloud.WinterFlowConcurrencyThread(winterFlowWorkerStructure));
                                            WinterFlowConsumerServiceProvider winterFlowConsumerServiceProvider2 = winterFlowCloudFramework.WinterFlowVariableVersionControl;
                                            if (winterFlowConsumerServiceProvider2 == null) {
                                                WinterFlowManagerRequest.WinterFlowCloudMicroservice("connectionManager");
                                                throw null;
                                            }
                                            WinterFlowSyntaxDebug winterFlowSyntaxDebug = (WinterFlowSyntaxDebug) winterFlowConsumerServiceProvider2.WinterFlowUnitTestResponse;
                                            if (winterFlowSyntaxDebug != null) {
                                                while (!(winterFlowSyntaxDebug instanceof WinterFlowDebugRepository)) {
                                                    if (winterFlowSyntaxDebug instanceof WinterFlowWorker) {
                                                        winterFlowSyntaxDebug = ((WinterFlowWorker) winterFlowSyntaxDebug).WinterFlowHookDataSource();
                                                    }
                                                }
                                                winterFlowConsumerServiceProvider = winterFlowCloudFramework.WinterFlowVariableVersionControl;
                                                if (winterFlowConsumerServiceProvider != null) {
                                                    WinterFlowManagerRequest.WinterFlowCloudMicroservice("connectionManager");
                                                    throw null;
                                                }
                                                WinterFlowSyntaxDebug winterFlowSyntaxDebug2 = (WinterFlowSyntaxDebug) winterFlowConsumerServiceProvider.WinterFlowUnitTestResponse;
                                                if (winterFlowSyntaxDebug2 != null) {
                                                    while (!(winterFlowSyntaxDebug2 instanceof WinterFlowAPINetwork)) {
                                                        if (winterFlowSyntaxDebug2 instanceof WinterFlowWorker) {
                                                            winterFlowSyntaxDebug2 = ((WinterFlowWorker) winterFlowSyntaxDebug2).WinterFlowHookDataSource();
                                                        }
                                                    }
                                                    return (AppDatabase) winterFlowCloudFramework;
                                                }
                                                winterFlowSyntaxDebug2 = null;
                                                return (AppDatabase) winterFlowCloudFramework;
                                            }
                                            winterFlowSyntaxDebug = null;
                                            winterFlowConsumerServiceProvider = winterFlowCloudFramework.WinterFlowVariableVersionControl;
                                            if (winterFlowConsumerServiceProvider != null) {
                                            }
                                        }
                                    }
                                }
                            } catch (ClassNotFoundException e) {
                                throw new RuntimeException("Cannot find implementation for " + WinterFlowConfigurationSubsystem.getCanonicalName() + ". " + concat + " does not exist. Is Room annotation processor correctly configured?", e);
                            } catch (IllegalAccessException e2) {
                                throw new RuntimeException("Cannot access the constructor " + WinterFlowConfigurationSubsystem.getCanonicalName(), e2);
                            } catch (InstantiationException e3) {
                                throw new RuntimeException("Failed to create an instance of " + WinterFlowConfigurationSubsystem.getCanonicalName(), e3);
                            }
                        }
                        return obj;
                    case 1:
                        Context context3 = winterFlowVersionControlTransactionManager.WinterFlowRouterStructure;
                        return context3.getSharedPreferences(context3.getString(R.string.app_name) + "_preferences", 0);
                    default:
                        return new WinterFlowControllerInterface(((AppDatabase) winterFlowVersionControlTransactionManager.WinterFlowHookDataSource.getValue()).WinterFlowTransactionAgent());
                }
            }
        });
        final int i3 = 2;
        this.WinterFlowArrayNetwork = new WinterFlowRendererNode(new WinterFlowObjectUI(this) { // from class: com.google.android.datatransport.WinterFlowAdapterServer
            public final /* synthetic */ WinterFlowVersionControlTransactionManager WinterFlowTransactionManagerStrategy;

            {
                this.WinterFlowTransactionManagerStrategy = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:76:0x01db, code lost:
            
                com.google.android.datatransport.WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
             */
            /* JADX WARN: Removed duplicated region for block: B:123:0x02f2  */
            /* JADX WARN: Removed duplicated region for block: B:135:0x0311  */
            /* JADX WARN: Removed duplicated region for block: B:96:0x0249 A[LOOP:5: B:84:0x021f->B:96:0x0249, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:97:0x0259 A[SYNTHETIC] */
            @Override // com.google.android.datatransport.WinterFlowObjectUI
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object WinterFlowRouterStructure() {
                Object obj;
                String str;
                WinterFlowRepositoryProtocol winterFlowRepositoryProtocol;
                WinterFlowConsumerServiceProvider winterFlowConsumerServiceProvider;
                int i22 = i3;
                WinterFlowVersionControlTransactionManager winterFlowVersionControlTransactionManager = this.WinterFlowTransactionManagerStrategy;
                switch (i22) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        Context context2 = winterFlowVersionControlTransactionManager.WinterFlowRouterStructure;
                        context2.getClass();
                        if (WinterFlowFrameworkStrategy.WinterFlowArrayHelper("fish_archive.db")) {
                            obj = null;
                            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                        } else {
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            WinterFlowConfigurationModule winterFlowConfigurationModule = new WinterFlowConfigurationModule(29);
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                            ArrayList arrayList3 = new ArrayList();
                            WinterFlowEventEmitterCacheManager WinterFlowRouterStructure = WinterFlowListenerProtocol.WinterFlowRouterStructure(AppDatabase.class);
                            if (!linkedHashSet2.isEmpty()) {
                                Iterator it = linkedHashSet2.iterator();
                                while (it.hasNext()) {
                                    int intValue = ((Number) it.next()).intValue();
                                    if (linkedHashSet.contains(Integer.valueOf(intValue))) {
                                        WinterFlowCompilerMechanism.WinterFlowCacheManagerAgent(WinterFlowResolverBackend.WinterFlowSyntax("Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: ", intValue));
                                        return null;
                                    }
                                }
                            }
                            WinterFlowThreadPoolProcess winterFlowThreadPoolProcess = new WinterFlowThreadPoolProcess(11);
                            obj = null;
                            Object systemService = context2.getSystemService("activity");
                            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                            WinterFlowClassView winterFlowClassView = (activityManager == null || activityManager.isLowRamDevice()) ? WinterFlowClassView.WinterFlowVariableVersionControl : WinterFlowClassView.WinterFlowTransactionManagerStrategy;
                            WinterFlowOrchestrationSession winterFlowOrchestrationSession = WinterFlowMiddlewareService.WinterFlowArrayNetwork;
                            WinterFlowConfigurationMiddleware winterFlowConfigurationMiddleware = new WinterFlowConfigurationMiddleware(context2, "fish_archive.db", winterFlowThreadPoolProcess, winterFlowConfigurationModule, arrayList, false, winterFlowClassView, winterFlowOrchestrationSession, winterFlowOrchestrationSession, null, true, false, linkedHashSet, null, null, null, arrayList2, arrayList3, false, null, null);
                            Class WinterFlowConfigurationSubsystem = WinterFlowEncryptionSubsystem.WinterFlowConfigurationSubsystem(WinterFlowRouterStructure);
                            Package r3 = WinterFlowConfigurationSubsystem.getPackage();
                            if (r3 == null || (str = r3.getName()) == null) {
                                str = "";
                            }
                            String canonicalName = WinterFlowConfigurationSubsystem.getCanonicalName();
                            canonicalName.getClass();
                            if (str.length() != 0) {
                                canonicalName = canonicalName.substring(str.length() + 1);
                            }
                            String replace = canonicalName.replace('.', '_');
                            replace.getClass();
                            String concat = replace.concat("_Impl");
                            try {
                                Class<?> cls = Class.forName(str.length() == 0 ? concat : str + '.' + concat, true, WinterFlowConfigurationSubsystem.getClassLoader());
                                cls.getClass();
                                WinterFlowCloudFramework winterFlowCloudFramework = (WinterFlowCloudFramework) cls.getDeclaredConstructor(null).newInstance(null);
                                winterFlowCloudFramework.getClass();
                                winterFlowCloudFramework.WinterFlowResponseEngine = true;
                                try {
                                    winterFlowRepositoryProtocol = winterFlowCloudFramework.WinterFlowCacheManagerAgent();
                                    winterFlowRepositoryProtocol.getClass();
                                } catch (WinterFlowDecoratorEventEmitter unused) {
                                    winterFlowRepositoryProtocol = null;
                                }
                                if (winterFlowRepositoryProtocol == null) {
                                    new WinterFlowConsumerServiceProvider(winterFlowConfigurationMiddleware, new WinterFlowSessionJava(8, winterFlowCloudFramework), new WinterFlowServerSingleton(2, winterFlowCloudFramework, WinterFlowTestingCloud.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 2));
                                    throw null;
                                }
                                winterFlowCloudFramework.WinterFlowVariableVersionControl = new WinterFlowConsumerServiceProvider(winterFlowConfigurationMiddleware, winterFlowRepositoryProtocol, new WinterFlowServerSingleton(2, winterFlowCloudFramework, WinterFlowTestingCloud.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 3));
                                winterFlowCloudFramework.WinterFlowTransactionManagerStrategy = winterFlowCloudFramework.WinterFlowHookDataSource();
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                Set WinterFlowVariableVersionControl = winterFlowCloudFramework.WinterFlowVariableVersionControl();
                                List list = winterFlowConfigurationMiddleware.WinterFlowThreadListener;
                                int size = list.size();
                                boolean[] zArr = new boolean[size];
                                Iterator it2 = WinterFlowVariableVersionControl.iterator();
                                while (true) {
                                    int i32 = -1;
                                    if (it2.hasNext()) {
                                        WinterFlowEventEmitterCacheManager winterFlowEventEmitterCacheManager = (WinterFlowEventEmitterCacheManager) it2.next();
                                        int size2 = list.size() - 1;
                                        if (size2 >= 0) {
                                            while (true) {
                                                int i4 = size2 - 1;
                                                if (winterFlowEventEmitterCacheManager.WinterFlowArrayNetwork(list.get(size2))) {
                                                    zArr[size2] = true;
                                                    i32 = size2;
                                                } else if (i4 >= 0) {
                                                    size2 = i4;
                                                }
                                            }
                                        }
                                        if (i32 >= 0) {
                                            linkedHashMap.put(winterFlowEventEmitterCacheManager, list.get(i32));
                                        } else {
                                            WinterFlowEventEmitterOrchestration.WinterFlowRouterAdapter("A required auto migration spec (", winterFlowEventEmitterCacheManager.WinterFlowHookDataSource(), ") is missing in the database configuration.");
                                        }
                                    } else {
                                        int size3 = list.size() - 1;
                                        if (size3 >= 0) {
                                            while (true) {
                                                int i5 = size3 - 1;
                                                if (size3 < size && zArr[size3]) {
                                                    if (i5 >= 0) {
                                                        size3 = i5;
                                                    }
                                                }
                                            }
                                        }
                                        Iterator it3 = winterFlowCloudFramework.WinterFlowRouterStructure(linkedHashMap).iterator();
                                        if (it3.hasNext()) {
                                            it3.next().getClass();
                                            WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
                                        } else {
                                            LinkedHashMap WinterFlowTransactionManagerStrategy = winterFlowCloudFramework.WinterFlowTransactionManagerStrategy();
                                            List list2 = winterFlowConfigurationMiddleware.WinterFlowServerProtocol;
                                            boolean[] zArr2 = new boolean[list2.size()];
                                            for (Map.Entry entry : WinterFlowTransactionManagerStrategy.entrySet()) {
                                                WinterFlowEventEmitterCacheManager winterFlowEventEmitterCacheManager2 = (WinterFlowEventEmitterCacheManager) entry.getKey();
                                                for (WinterFlowEventEmitterCacheManager winterFlowEventEmitterCacheManager3 : (List) entry.getValue()) {
                                                    int size4 = list2.size() - 1;
                                                    if (size4 >= 0) {
                                                        while (true) {
                                                            int i6 = size4 - 1;
                                                            if (winterFlowEventEmitterCacheManager3.WinterFlowArrayNetwork(list2.get(size4))) {
                                                                zArr2[size4] = true;
                                                            } else if (i6 >= 0) {
                                                                size4 = i6;
                                                            }
                                                        }
                                                        if (size4 < 0) {
                                                            Object obj2 = list2.get(size4);
                                                            winterFlowEventEmitterCacheManager3.getClass();
                                                            obj2.getClass();
                                                            winterFlowCloudFramework.WinterFlowSyntax.put(winterFlowEventEmitterCacheManager3, obj2);
                                                        } else {
                                                            WinterFlowEventEmitterOrchestration.WinterFlowSingletonPlatform("A required type converter (", winterFlowEventEmitterCacheManager3.WinterFlowHookDataSource(), ") for ", winterFlowEventEmitterCacheManager2.WinterFlowHookDataSource(), " is missing in the database configuration.");
                                                        }
                                                    }
                                                    size4 = -1;
                                                    if (size4 < 0) {
                                                    }
                                                }
                                            }
                                            int size5 = list2.size() - 1;
                                            if (size5 >= 0) {
                                                while (true) {
                                                    int i7 = size5 - 1;
                                                    if (!zArr2[size5]) {
                                                        throw new IllegalArgumentException("Unexpected type converter " + list2.get(size5) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                                    }
                                                    if (i7 >= 0) {
                                                        size5 = i7;
                                                    }
                                                }
                                            }
                                            winterFlowCloudFramework.WinterFlowCacheManagerAgent = winterFlowConfigurationMiddleware.WinterFlowUnitTestResponse;
                                            winterFlowCloudFramework.WinterFlowArrayNetwork = new WinterFlowWorkerStructure(winterFlowConfigurationMiddleware.WinterFlowRouterRouter);
                                            Executor executor = winterFlowCloudFramework.WinterFlowCacheManagerAgent;
                                            if (executor == null) {
                                                WinterFlowManagerRequest.WinterFlowCloudMicroservice("internalQueryExecutor");
                                                throw null;
                                            }
                                            WinterFlowEventEmitterFramework WinterFlowHookDataSource = WinterFlowEncryptionSubsystem.WinterFlowHookDataSource(WinterFlowTestingCloud.WinterFlowArrayHelper(WinterFlowTestingCloud.WinterFlowConcurrencyThread(executor), WinterFlowFrameworkMechanism.WinterFlowHookDataSource()));
                                            winterFlowCloudFramework.WinterFlowRouterStructure = WinterFlowHookDataSource;
                                            WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice = WinterFlowHookDataSource.WinterFlowVariableVersionControl;
                                            WinterFlowWorkerStructure winterFlowWorkerStructure = winterFlowCloudFramework.WinterFlowArrayNetwork;
                                            if (winterFlowWorkerStructure == null) {
                                                WinterFlowManagerRequest.WinterFlowCloudMicroservice("internalTransactionExecutor");
                                                throw null;
                                            }
                                            winterFlowCloudFramework.WinterFlowHookDataSource = winterFlowEncryptionMicroservice.WinterFlowOrchestrationSubsystem(WinterFlowTestingCloud.WinterFlowConcurrencyThread(winterFlowWorkerStructure));
                                            WinterFlowConsumerServiceProvider winterFlowConsumerServiceProvider2 = winterFlowCloudFramework.WinterFlowVariableVersionControl;
                                            if (winterFlowConsumerServiceProvider2 == null) {
                                                WinterFlowManagerRequest.WinterFlowCloudMicroservice("connectionManager");
                                                throw null;
                                            }
                                            WinterFlowSyntaxDebug winterFlowSyntaxDebug = (WinterFlowSyntaxDebug) winterFlowConsumerServiceProvider2.WinterFlowUnitTestResponse;
                                            if (winterFlowSyntaxDebug != null) {
                                                while (!(winterFlowSyntaxDebug instanceof WinterFlowDebugRepository)) {
                                                    if (winterFlowSyntaxDebug instanceof WinterFlowWorker) {
                                                        winterFlowSyntaxDebug = ((WinterFlowWorker) winterFlowSyntaxDebug).WinterFlowHookDataSource();
                                                    }
                                                }
                                                winterFlowConsumerServiceProvider = winterFlowCloudFramework.WinterFlowVariableVersionControl;
                                                if (winterFlowConsumerServiceProvider != null) {
                                                    WinterFlowManagerRequest.WinterFlowCloudMicroservice("connectionManager");
                                                    throw null;
                                                }
                                                WinterFlowSyntaxDebug winterFlowSyntaxDebug2 = (WinterFlowSyntaxDebug) winterFlowConsumerServiceProvider.WinterFlowUnitTestResponse;
                                                if (winterFlowSyntaxDebug2 != null) {
                                                    while (!(winterFlowSyntaxDebug2 instanceof WinterFlowAPINetwork)) {
                                                        if (winterFlowSyntaxDebug2 instanceof WinterFlowWorker) {
                                                            winterFlowSyntaxDebug2 = ((WinterFlowWorker) winterFlowSyntaxDebug2).WinterFlowHookDataSource();
                                                        }
                                                    }
                                                    return (AppDatabase) winterFlowCloudFramework;
                                                }
                                                winterFlowSyntaxDebug2 = null;
                                                return (AppDatabase) winterFlowCloudFramework;
                                            }
                                            winterFlowSyntaxDebug = null;
                                            winterFlowConsumerServiceProvider = winterFlowCloudFramework.WinterFlowVariableVersionControl;
                                            if (winterFlowConsumerServiceProvider != null) {
                                            }
                                        }
                                    }
                                }
                            } catch (ClassNotFoundException e) {
                                throw new RuntimeException("Cannot find implementation for " + WinterFlowConfigurationSubsystem.getCanonicalName() + ". " + concat + " does not exist. Is Room annotation processor correctly configured?", e);
                            } catch (IllegalAccessException e2) {
                                throw new RuntimeException("Cannot access the constructor " + WinterFlowConfigurationSubsystem.getCanonicalName(), e2);
                            } catch (InstantiationException e3) {
                                throw new RuntimeException("Failed to create an instance of " + WinterFlowConfigurationSubsystem.getCanonicalName(), e3);
                            }
                        }
                        return obj;
                    case 1:
                        Context context3 = winterFlowVersionControlTransactionManager.WinterFlowRouterStructure;
                        return context3.getSharedPreferences(context3.getString(R.string.app_name) + "_preferences", 0);
                    default:
                        return new WinterFlowControllerInterface(((AppDatabase) winterFlowVersionControlTransactionManager.WinterFlowHookDataSource.getValue()).WinterFlowTransactionAgent());
                }
            }
        });
    }

    @Override // com.google.android.datatransport.WinterFlowUserManagerUserManager
    public final WinterFlowTransactionVariable WinterFlowRouterStructure(Class cls) {
        boolean isAssignableFrom = cls.isAssignableFrom(WinterFlowConfigurationSubsystem.class);
        WinterFlowRendererNode winterFlowRendererNode = this.WinterFlowArrayNetwork;
        WinterFlowRendererNode winterFlowRendererNode2 = this.WinterFlowCacheManagerAgent;
        if (isAssignableFrom) {
            WinterFlowControllerInterface winterFlowControllerInterface = (WinterFlowControllerInterface) winterFlowRendererNode.getValue();
            SharedPreferences sharedPreferences = (SharedPreferences) winterFlowRendererNode2.getValue();
            sharedPreferences.getClass();
            return new WinterFlowConfigurationSubsystem(winterFlowControllerInterface, sharedPreferences);
        }
        if (cls.isAssignableFrom(WinterFlowSyntaxMechanism.class)) {
            SharedPreferences sharedPreferences2 = (SharedPreferences) winterFlowRendererNode2.getValue();
            sharedPreferences2.getClass();
            return new WinterFlowSyntaxMechanism(sharedPreferences2);
        }
        if (cls.isAssignableFrom(WinterFlowObjectLayer.class)) {
            WinterFlowControllerInterface winterFlowControllerInterface2 = (WinterFlowControllerInterface) winterFlowRendererNode.getValue();
            SharedPreferences sharedPreferences3 = (SharedPreferences) winterFlowRendererNode2.getValue();
            sharedPreferences3.getClass();
            return new WinterFlowObjectLayer(winterFlowControllerInterface2, sharedPreferences3);
        }
        if (!cls.isAssignableFrom(WinterFlowRequestHandler.class)) {
            throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        }
        SharedPreferences sharedPreferences4 = (SharedPreferences) winterFlowRendererNode2.getValue();
        sharedPreferences4.getClass();
        return new WinterFlowRequestHandler(sharedPreferences4);
    }
}
