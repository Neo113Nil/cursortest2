package androidx.glance.appwidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.PreferenceDataStoreSingletonDelegate;
import androidx.datastore.preferences.core.Preferences;
import androidx.paging.PageFetcher$flow$1;
import androidx.tracing.Trace;
import app.cash.badging.backend.RealBadger2$clear$2;
import app.cash.trifle.KeyHandle$keyPair$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.gif.AnimatedImageDecoder$wrapDrawable$2;
import com.squareup.cash.ui.qrcodes.widget.CashQrWidget;
import com.squareup.cash.ui.qrcodes.widget.CashQrWidgetReceiver;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class GlanceAppWidgetManager {
    public static DataStore dataStoreSingleton;
    public final AppWidgetManager appWidgetManager;
    public final Context context;
    public final Lazy dataStore$delegate = LazyKt.lazy(new KeyHandle$keyPair$2(this, 7));
    public static final Companion Companion = new Companion();
    public static final PreferenceDataStoreSingletonDelegate appManagerDataStore$delegate = Trace.preferencesDataStore$default("GlanceAppWidgetManager", null, null, 14);
    public static final Preferences.Key providersKey = new Preferences.Key("list::Providers");

    public final class Companion {
        public static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.factory.property2(new PropertyReference2Impl(Companion.class, "appManagerDataStore", "getAppManagerDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"))};

        public static final Preferences.Key access$providerKey(Companion companion, String str) {
            companion.getClass();
            return new Preferences.Key("provider:" + str);
        }
    }

    public final class State {
        public final Map providerNameToReceivers;
        public final Map receiverToProviderName;

        public State(Map map, Map map2) {
            this.receiverToProviderName = map;
            this.providerNameToReceivers = map2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.areEqual(this.receiverToProviderName, state.receiverToProviderName) && Intrinsics.areEqual(this.providerNameToReceivers, state.providerNameToReceivers);
        }

        public final int hashCode() {
            return this.providerNameToReceivers.hashCode() + (this.receiverToProviderName.hashCode() * 31);
        }

        public final String toString() {
            return "State(receiverToProviderName=" + this.receiverToProviderName + ", providerNameToReceivers=" + this.providerNameToReceivers + ')';
        }
    }

    public GlanceAppWidgetManager(Context context) {
        this.context = context;
        this.appWidgetManager = AppWidgetManager.getInstance(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable getGlanceIds(Class cls, ContinuationImpl continuationImpl) {
        GlanceAppWidgetManager$getGlanceIds$1 glanceAppWidgetManager$getGlanceIds$1;
        int i;
        String canonicalName;
        if (continuationImpl instanceof GlanceAppWidgetManager$getGlanceIds$1) {
            glanceAppWidgetManager$getGlanceIds$1 = (GlanceAppWidgetManager$getGlanceIds$1) continuationImpl;
            int i2 = glanceAppWidgetManager$getGlanceIds$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                glanceAppWidgetManager$getGlanceIds$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = glanceAppWidgetManager$getGlanceIds$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = glanceAppWidgetManager$getGlanceIds$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    glanceAppWidgetManager$getGlanceIds$1.L$0 = this;
                    glanceAppWidgetManager$getGlanceIds$1.L$1 = cls;
                    glanceAppWidgetManager$getGlanceIds$1.label = 1;
                    obj = getState(glanceAppWidgetManager$getGlanceIds$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cls = glanceAppWidgetManager$getGlanceIds$1.L$1;
                    this = glanceAppWidgetManager$getGlanceIds$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                State state = (State) obj;
                canonicalName = cls.getCanonicalName();
                if (canonicalName != null) {
                    a$$ExternalSyntheticBUOutline0.m$3("no canonical provider name");
                    return null;
                }
                List list = (List) state.providerNameToReceivers.get(canonicalName);
                if (list == null) {
                    return EmptyList.INSTANCE;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int[] appWidgetIds = this.appWidgetManager.getAppWidgetIds((ComponentName) it.next());
                    ArrayList arrayList2 = new ArrayList(appWidgetIds.length);
                    for (int i3 : appWidgetIds) {
                        arrayList2.add(new AppWidgetId(i3));
                    }
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList2, arrayList);
                }
                return arrayList;
            }
        }
        glanceAppWidgetManager$getGlanceIds$1 = new GlanceAppWidgetManager$getGlanceIds$1(this, continuationImpl);
        Object obj2 = glanceAppWidgetManager$getGlanceIds$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = glanceAppWidgetManager$getGlanceIds$1.label;
        if (i != 0) {
        }
        State state2 = (State) obj2;
        canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f2, code lost:
    
        if (r11 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getState(ContinuationImpl continuationImpl) {
        GlanceAppWidgetManager$getState$1 glanceAppWidgetManager$getState$1;
        Object obj;
        int i;
        Preferences.Key key;
        GlanceAppWidgetManager glanceAppWidgetManager;
        Preferences preferences;
        Set<String> set;
        if (continuationImpl instanceof GlanceAppWidgetManager$getState$1) {
            glanceAppWidgetManager$getState$1 = (GlanceAppWidgetManager$getState$1) continuationImpl;
            int i2 = glanceAppWidgetManager$getState$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                glanceAppWidgetManager$getState$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = glanceAppWidgetManager$getState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = glanceAppWidgetManager$getState$1.label;
                Companion companion = Companion;
                key = providersKey;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow data = ((DataStore) this.dataStore$delegate.getValue()).getData();
                    glanceAppWidgetManager$getState$1.L$0 = this;
                    glanceAppWidgetManager$getState$1.L$1 = this;
                    glanceAppWidgetManager$getState$1.label = 1;
                    obj = FlowKt.first(data, glanceAppWidgetManager$getState$1);
                    if (obj != coroutineSingletons) {
                        glanceAppWidgetManager = this;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = glanceAppWidgetManager$getState$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    preferences = (Preferences) obj;
                    String packageName = this.context.getPackageName();
                    set = (Set) preferences.get(key);
                    if (set == null) {
                        EmptyMap emptyMap = EmptyMap.INSTANCE;
                        emptyMap.getClass();
                        return new State(emptyMap, emptyMap);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (String str : set) {
                        ComponentName componentName = new ComponentName(packageName, str);
                        String str2 = (String) preferences.get(Companion.access$providerKey(companion, str));
                        Pair pair = str2 == null ? null : new Pair(componentName, str2);
                        if (pair != null) {
                            arrayList.add(pair);
                        }
                    }
                    Map map = MapsKt__MapsKt.toMap(arrayList);
                    Set<Map.Entry> entrySet = map.entrySet();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : entrySet) {
                        String str3 = (String) entry.getValue();
                        Object obj2 = linkedHashMap.get(str3);
                        if (obj2 == null) {
                            obj2 = new ArrayList();
                            linkedHashMap.put(str3, obj2);
                        }
                        ((List) obj2).add((ComponentName) entry.getKey());
                    }
                    return new State(map, linkedHashMap);
                }
                this = glanceAppWidgetManager$getState$1.L$1;
                glanceAppWidgetManager = glanceAppWidgetManager$getState$1.L$0;
                SafeTrace.throwOnFailure(obj);
                if (((Preferences) obj).get(key) == null) {
                    obj = null;
                }
                preferences = (Preferences) obj;
                if (preferences == null) {
                    glanceAppWidgetManager$getState$1.L$0 = this;
                    glanceAppWidgetManager$getState$1.L$1 = null;
                    glanceAppWidgetManager$getState$1.label = 2;
                    List<AppWidgetProviderInfo> installedProviders = glanceAppWidgetManager.appWidgetManager.getInstalledProviders();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : installedProviders) {
                        if (Intrinsics.areEqual(((AppWidgetProviderInfo) obj3).provider.getPackageName(), glanceAppWidgetManager.context.getPackageName())) {
                            arrayList2.add(obj3);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        AppWidgetProviderInfo appWidgetProviderInfo = (AppWidgetProviderInfo) it.next();
                        companion.getClass();
                        Object newInstance = Class.forName(appWidgetProviderInfo.provider.getClassName()).getDeclaredConstructor(null).newInstance(null);
                        CashQrWidgetReceiver cashQrWidgetReceiver = newInstance instanceof CashQrWidgetReceiver ? (CashQrWidgetReceiver) newInstance : null;
                        if (cashQrWidgetReceiver != null) {
                            arrayList3.add(cashQrWidgetReceiver);
                        }
                    }
                    obj = ((DataStore) glanceAppWidgetManager.dataStore$delegate.getValue()).updateData(new RealBadger2$clear$2(arrayList3, continuation, 15), glanceAppWidgetManager$getState$1);
                }
                String packageName2 = this.context.getPackageName();
                set = (Set) preferences.get(key);
                if (set == null) {
                }
            }
        }
        glanceAppWidgetManager$getState$1 = new GlanceAppWidgetManager$getState$1(this, continuationImpl);
        obj = glanceAppWidgetManager$getState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = glanceAppWidgetManager$getState$1.label;
        Companion companion2 = Companion;
        key = providersKey;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        if (((Preferences) obj).get(key) == null) {
        }
        preferences = (Preferences) obj;
        if (preferences == null) {
        }
        String packageName22 = this.context.getPackageName();
        set = (Set) preferences.get(key);
        if (set == null) {
        }
    }

    public final Object updateReceiver$glance_appwidget_release(CashQrWidgetReceiver cashQrWidgetReceiver, CashQrWidget cashQrWidget, PageFetcher$flow$1 pageFetcher$flow$1) {
        Companion.getClass();
        String canonicalName = cashQrWidgetReceiver.getClass().getCanonicalName();
        Continuation continuation = null;
        if (canonicalName == null) {
            a$$ExternalSyntheticBUOutline0.m$3("no receiver name");
            return null;
        }
        String canonicalName2 = cashQrWidget.getClass().getCanonicalName();
        if (canonicalName2 != null) {
            Object updateData = ((DataStore) this.dataStore$delegate.getValue()).updateData(new AnimatedImageDecoder$wrapDrawable$2(canonicalName, canonicalName2, continuation, 5), pageFetcher$flow$1);
            return updateData == CoroutineSingletons.COROUTINE_SUSPENDED ? updateData : Unit.INSTANCE;
        }
        a$$ExternalSyntheticBUOutline0.m$3("no provider name");
        return null;
    }
}
