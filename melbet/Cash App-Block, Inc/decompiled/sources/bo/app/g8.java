package bo.app;

import android.content.Context;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.events.FeatureFlagsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.models.FeatureFlag;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.TransformingSequence;
import kotlin.text.StringsKt;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.json.Json;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class g8 {
    public final r7 a;
    public final m9 b;
    public final ue c;
    public final e2 d;
    public final com.braze.storage.h e;
    public List f;
    public final AtomicBoolean g;
    public final AtomicInteger h;

    public g8(Context context, String str, String str2, r7 r7Var, m9 m9Var, ue ueVar, e2 e2Var) {
        context.getClass();
        str.getClass();
        r7Var.getClass();
        m9Var.getClass();
        ueVar.getClass();
        e2Var.getClass();
        this.a = r7Var;
        this.b = m9Var;
        this.c = ueVar;
        this.d = e2Var;
        this.e = new com.braze.storage.h(context, str2, str);
        this.f = EmptyList.INSTANCE;
        this.g = new AtomicBoolean(false);
        this.h = new AtomicInteger(0);
        c();
        f();
    }

    public static final String b(g8 g8Var) {
        return CameraState$Type$EnumUnboxingLocalUtility.m("Added new Feature Flags:", " to DataStore.", g8Var.f);
    }

    public static final String d() {
        return "Did not find stored Feature Flags in DataStore.";
    }

    public static final String g() {
        return "Features flags have moved to disabled. Clearing feature flag data.";
    }

    public final FeatureFlagsUpdatedEvent a(JSONArray jSONArray) {
        String str;
        jSONArray.getClass();
        ArrayList arrayList = new ArrayList();
        TransformingSequence map = SequencesKt___SequencesKt.map(SequencesKt___SequencesKt.filter(CollectionsKt.asSequence(RangesKt___RangesKt.until(0, jSONArray.length())), new l8(jSONArray)), new m8(jSONArray));
        Iterator it = map.sequence.iterator();
        while (it.hasNext()) {
            FeatureFlag a = com.braze.support.e.a.a((JSONObject) map.transformer.invoke(it.next()));
            if (a != null) {
                arrayList.add(a);
            }
        }
        this.f = arrayList;
        com.braze.storage.h hVar = this.e;
        DataStoreKey dataStoreKey = DataStoreKey.FEATURE_FLAGS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                try {
                    Json.Default r0 = Json.Default;
                    r0.getClass();
                    str = r0.encodeToString(new HashSetSerializer(FeatureFlag.Companion.serializer(), 1), arrayList);
                } catch (Exception e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                    str = arrayList instanceof Map ? "{}" : "[]";
                }
                hVar.writeData(dataStoreKey, str);
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g8$$ExternalSyntheticLambda9(this, 0), 7, (Object) null);
        List list = this.f;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((FeatureFlag) it2.next()).deepcopy$android_sdk_base_release());
        }
        return new FeatureFlagsUpdatedEvent(arrayList2);
    }

    public final void c() {
        ArrayList arrayList;
        Collection collection;
        com.braze.storage.h hVar = this.e;
        DataStoreKey dataStoreKey = DataStoreKey.FEATURE_FLAGS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.i(dataStoreKey), 12, (Object) null);
            arrayList = new ArrayList();
        } else {
            try {
                Object readData = hVar.readData(dataStoreKey, "");
                readData.getClass();
                String str = (String) readData;
                if (StringsKt.isBlank(str)) {
                    arrayList = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (StringsKt.isBlank(str)) {
                        collection = EmptyList.INSTANCE;
                    } else if (Intrinsics.areEqual(StringsKt.trim(str).toString(), "null")) {
                        collection = EmptyList.INSTANCE;
                    } else {
                        try {
                            Json.Default r0 = Json.Default;
                            r0.getClass();
                            collection = (List) r0.decodeFromString(str, new HashSetSerializer(FeatureFlag.Companion.serializer(), 1));
                        } catch (Exception e) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new DataStoreUtils.a(str), 4, (Object) null);
                            collection = EmptyList.INSTANCE;
                        }
                    }
                    arrayList = CollectionsKt.toMutableList(collection);
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreProvider.j(dataStoreKey), 8, (Object) null);
                arrayList = new ArrayList();
            }
        }
        if (arrayList.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new g$$ExternalSyntheticLambda0(19), 6, (Object) null);
            this.f = EmptyList.INSTANCE;
        } else {
            this.f = arrayList;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new n$$ExternalSyntheticLambda2(3, arrayList), 7, (Object) null);
        }
    }

    public final void e() {
        j2 j2Var = j2.CLIENT_INITIATED;
        j2Var.getClass();
        if (this.h.get() > 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g8$$ExternalSyntheticLambda9(this, 1), 7, (Object) null);
            return;
        }
        int n = this.c.n();
        if (n <= 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new jg$$ExternalSyntheticLambda1(n, 3), 6, (Object) null);
            this.a.b(new i8(), i8.class);
            return;
        }
        long nowInSeconds = DateTimeUtils.nowInSeconds();
        Object readData = this.e.readData(DataStoreKey.LAST_REFRESH_IN_SECONDS, 0L);
        readData.getClass();
        if (nowInSeconds - ((Long) readData).longValue() >= n) {
            this.d.a(j2Var);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new c7$$ExternalSyntheticLambda4(this, nowInSeconds, n, 1), 6, (Object) null);
            this.a.b(new i8(), i8.class);
        }
    }

    public final void f() {
        final int i = 0;
        this.a.c(ad.class, new IEventSubscriber(this) { // from class: bo.app.g8$$ExternalSyntheticLambda0
            public final /* synthetic */ g8 f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i2 = i;
                g8 g8Var = this.f$0;
                switch (i2) {
                    case 0:
                        g8.a(g8Var, (ad) obj);
                        break;
                    case 1:
                        g8.a(g8Var, (zc) obj);
                        break;
                    case 2:
                        g8.a(g8Var, (j8) obj);
                        break;
                    case 3:
                        g8.a(g8Var, (i8) obj);
                        break;
                    default:
                        g8.a(g8Var, (o3) obj);
                        break;
                }
            }
        });
        final int i2 = 1;
        this.a.c(zc.class, new IEventSubscriber(this) { // from class: bo.app.g8$$ExternalSyntheticLambda0
            public final /* synthetic */ g8 f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i22 = i2;
                g8 g8Var = this.f$0;
                switch (i22) {
                    case 0:
                        g8.a(g8Var, (ad) obj);
                        break;
                    case 1:
                        g8.a(g8Var, (zc) obj);
                        break;
                    case 2:
                        g8.a(g8Var, (j8) obj);
                        break;
                    case 3:
                        g8.a(g8Var, (i8) obj);
                        break;
                    default:
                        g8.a(g8Var, (o3) obj);
                        break;
                }
            }
        });
        final int i3 = 2;
        this.a.c(j8.class, new IEventSubscriber(this) { // from class: bo.app.g8$$ExternalSyntheticLambda0
            public final /* synthetic */ g8 f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i22 = i3;
                g8 g8Var = this.f$0;
                switch (i22) {
                    case 0:
                        g8.a(g8Var, (ad) obj);
                        break;
                    case 1:
                        g8.a(g8Var, (zc) obj);
                        break;
                    case 2:
                        g8.a(g8Var, (j8) obj);
                        break;
                    case 3:
                        g8.a(g8Var, (i8) obj);
                        break;
                    default:
                        g8.a(g8Var, (o3) obj);
                        break;
                }
            }
        });
        final int i4 = 3;
        this.a.c(i8.class, new IEventSubscriber(this) { // from class: bo.app.g8$$ExternalSyntheticLambda0
            public final /* synthetic */ g8 f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i22 = i4;
                g8 g8Var = this.f$0;
                switch (i22) {
                    case 0:
                        g8.a(g8Var, (ad) obj);
                        break;
                    case 1:
                        g8.a(g8Var, (zc) obj);
                        break;
                    case 2:
                        g8.a(g8Var, (j8) obj);
                        break;
                    case 3:
                        g8.a(g8Var, (i8) obj);
                        break;
                    default:
                        g8.a(g8Var, (o3) obj);
                        break;
                }
            }
        });
        final int i5 = 4;
        this.a.c(o3.class, new IEventSubscriber(this) { // from class: bo.app.g8$$ExternalSyntheticLambda0
            public final /* synthetic */ g8 f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i22 = i5;
                g8 g8Var = this.f$0;
                switch (i22) {
                    case 0:
                        g8.a(g8Var, (ad) obj);
                        break;
                    case 1:
                        g8.a(g8Var, (zc) obj);
                        break;
                    case 2:
                        g8.a(g8Var, (j8) obj);
                        break;
                    case 3:
                        g8.a(g8Var, (i8) obj);
                        break;
                    default:
                        g8.a(g8Var, (o3) obj);
                        break;
                }
            }
        });
    }

    public final void h() {
        long nowInSeconds = DateTimeUtils.nowInSeconds();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new c6$$ExternalSyntheticLambda0(nowInSeconds, 6), 6, (Object) null);
        this.e.writeData(DataStoreKey.LAST_REFRESH_IN_SECONDS, Long.valueOf(nowInSeconds));
    }

    public static final String b() {
        return "Clearing Feature Flags.";
    }

    public static final void a(g8 g8Var, o3 o3Var) {
        o3Var.getClass();
        if (!o3Var.a.m || o3Var.b.m) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) g8Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g$$ExternalSyntheticLambda0(20), 7, (Object) null);
        g8Var.a();
    }

    public static final void a(g8 g8Var, ad adVar) {
        adVar.getClass();
        if (adVar.a instanceof k8) {
            g8Var.h.incrementAndGet();
        }
    }

    public static final void a(g8 g8Var, zc zcVar) {
        zcVar.getClass();
        if (zcVar.a instanceof k8) {
            g8Var.h.decrementAndGet();
        }
    }

    public static final String a(g8 g8Var, long j, int i) {
        Object readData = g8Var.e.readData(DataStoreKey.LAST_REFRESH_IN_SECONDS, 0L);
        readData.getClass();
        return Boxes$$ExternalSyntheticOutline1.m((((Long) readData).longValue() - j) + i, "Not enough time has passed since last Feature Flags refresh. Not refreshing Feature Flags. ", " seconds remaining until next available refresh.");
    }

    public static final void a(g8 g8Var, j8 j8Var) {
        j8Var.getClass();
        g8Var.g.set(true);
        g8Var.h();
    }

    public static final void a(g8 g8Var, i8 i8Var) {
        i8Var.getClass();
        g8Var.g.set(true);
        if (g8Var.g.get()) {
            List list = g8Var.f;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((FeatureFlag) it.next()).deepcopy$android_sdk_base_release());
            }
            ((r7) g8Var.b).b(new FeatureFlagsUpdatedEvent(arrayList), FeatureFlagsUpdatedEvent.class);
        }
    }

    public static final String a(g8 g8Var) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(g8Var.h.get(), "Not refreshing Feature Flags since another ", " request is currently in-flight.");
    }

    public static final String a(int i) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Feature Flags refresh rate limit is ", "; refreshes are disabled by server config. Not refreshing Feature Flags.");
    }

    public static final String a(long j) {
        return Recorder$$ExternalSyntheticOutline2.m(j, "Updating last Feature Flags refresh time: ");
    }

    public static final String a(List list) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(list.size(), "Loaded ", " Feature Flags from DataStore.");
    }

    public final void a() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g$$ExternalSyntheticLambda0(18), 7, (Object) null);
        this.e.clearData(DataStoreKey.FEATURE_FLAGS);
        this.f = EmptyList.INSTANCE;
        if (this.g.get()) {
            List list = this.f;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((FeatureFlag) it.next()).deepcopy$android_sdk_base_release());
            }
            ((r7) this.b).b(new FeatureFlagsUpdatedEvent(arrayList), FeatureFlagsUpdatedEvent.class);
        }
    }
}
