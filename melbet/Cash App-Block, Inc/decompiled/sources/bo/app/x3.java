package bo.app;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.braze.enums.CardKey;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.models.cards.Card;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.ICardStorageProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.TransformingSequence;
import kotlin.text.StringsKt;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class x3 implements ICardStorageProvider {
    public static final Set k = ArraysKt___ArraysKt.toSet(new String[]{CardKey.VIEWED.getKey(), CardKey.DISMISSED.getKey()});
    public final String a;
    public final e2 b;
    public final com.braze.storage.b c;
    public long d;
    public long e;
    public final LinkedHashSet f;
    public final LinkedHashSet g;
    public final LinkedHashSet h;
    public Map i;
    public final r3 j;

    public x3(Context context, String str, String str2, e2 e2Var) {
        ArrayList arrayList;
        Collection collection;
        ArrayList arrayList2;
        Collection collection2;
        ArrayList arrayList3;
        Collection collection3;
        context.getClass();
        str.getClass();
        str2.getClass();
        e2Var.getClass();
        this.a = str;
        this.b = e2Var;
        com.braze.storage.b bVar = new com.braze.storage.b(context, str, str2);
        this.c = bVar;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f = linkedHashSet;
        this.g = new LinkedHashSet();
        this.h = new LinkedHashSet();
        this.i = new LinkedHashMap();
        this.j = new r3();
        c();
        DataStoreKey dataStoreKey = DataStoreKey.DISMISSED_CARDS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.i(dataStoreKey), 12, (Object) null);
            arrayList = new ArrayList();
        } else {
            try {
                Object readData = bVar.readData(dataStoreKey, "");
                readData.getClass();
                String str3 = (String) readData;
                if (StringsKt.isBlank(str3)) {
                    arrayList = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (StringsKt.isBlank(str3)) {
                        collection = EmptyList.INSTANCE;
                    } else if (Intrinsics.areEqual(StringsKt.trim(str3).toString(), "null")) {
                        collection = EmptyList.INSTANCE;
                    } else {
                        try {
                            Json.Default r0 = Json.Default;
                            r0.getClass();
                            collection = (List) r0.decodeFromString(str3, new HashSetSerializer(StringSerializer.INSTANCE, 1));
                        } catch (Exception e) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new DataStoreUtils.a(str3), 4, (Object) null);
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
        linkedHashSet.addAll(arrayList);
        LinkedHashSet linkedHashSet2 = this.h;
        com.braze.storage.b bVar2 = this.c;
        DataStoreKey dataStoreKey2 = DataStoreKey.EXPIRED_CARDS;
        if (dataStoreKey2.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.i(dataStoreKey2), 12, (Object) null);
            arrayList2 = new ArrayList();
        } else {
            try {
                Object readData2 = bVar2.readData(dataStoreKey2, "");
                readData2.getClass();
                String str4 = (String) readData2;
                if (StringsKt.isBlank(str4)) {
                    arrayList2 = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                    if (StringsKt.isBlank(str4)) {
                        collection2 = EmptyList.INSTANCE;
                    } else if (Intrinsics.areEqual(StringsKt.trim(str4).toString(), "null")) {
                        collection2 = EmptyList.INSTANCE;
                    } else {
                        try {
                            Json.Default r02 = Json.Default;
                            r02.getClass();
                            collection2 = (List) r02.decodeFromString(str4, new HashSetSerializer(StringSerializer.INSTANCE, 1));
                        } catch (Exception e3) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) new DataStoreUtils.a(str4), 4, (Object) null);
                            collection2 = EmptyList.INSTANCE;
                        }
                    }
                    arrayList2 = CollectionsKt.toMutableList(collection2);
                }
            } catch (Exception e4) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) new DataStoreProvider.j(dataStoreKey2), 8, (Object) null);
                arrayList2 = new ArrayList();
            }
        }
        linkedHashSet2.addAll(arrayList2);
        LinkedHashSet linkedHashSet3 = this.g;
        com.braze.storage.b bVar3 = this.c;
        DataStoreKey dataStoreKey3 = DataStoreKey.TEST_CARDS;
        if (dataStoreKey3.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.i(dataStoreKey3), 12, (Object) null);
            arrayList3 = new ArrayList();
        } else {
            try {
                Object readData3 = bVar3.readData(dataStoreKey3, "");
                readData3.getClass();
                String str5 = (String) readData3;
                if (StringsKt.isBlank(str5)) {
                    arrayList3 = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
                    if (StringsKt.isBlank(str5)) {
                        collection3 = EmptyList.INSTANCE;
                    } else if (Intrinsics.areEqual(StringsKt.trim(str5).toString(), "null")) {
                        collection3 = EmptyList.INSTANCE;
                    } else {
                        try {
                            Json.Default r03 = Json.Default;
                            r03.getClass();
                            collection3 = (List) r03.decodeFromString(str5, new HashSetSerializer(StringSerializer.INSTANCE, 1));
                        } catch (Exception e5) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new DataStoreUtils.a(str5), 4, (Object) null);
                            collection3 = EmptyList.INSTANCE;
                        }
                    }
                    arrayList3 = CollectionsKt.toMutableList(collection3);
                }
            } catch (Exception e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e6, false, (Function0) new DataStoreProvider.j(dataStoreKey3), 8, (Object) null);
                arrayList3 = new ArrayList();
            }
        }
        linkedHashSet3.addAll(arrayList3);
        com.braze.storage.b bVar4 = this.c;
        DataStoreKey dataStoreKey4 = DataStoreKey.LAST_ACCESSED_SDK_VERSION;
        Object readData4 = bVar4.readData(dataStoreKey4, "");
        readData4.getClass();
        String str6 = (String) readData4;
        if (!"42.2.0".equals(str6)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new o6$$ExternalSyntheticLambda2(str6, 29), 6, (Object) null);
            this.c.writeData(DataStoreKey.LAST_FULL_CARD_SYNC_AT, 0L);
            this.c.writeData(dataStoreKey4, "42.2.0");
        }
        Object readData5 = this.c.readData(DataStoreKey.LAST_CARD_UPDATED_AT, 0L);
        readData5.getClass();
        this.d = ((Long) readData5).longValue();
        Object readData6 = this.c.readData(DataStoreKey.LAST_FULL_CARD_SYNC_AT, 0L);
        readData6.getClass();
        this.e = ((Long) readData6).longValue();
    }

    public static final String d(JSONObject jSONObject) {
        return "Server card was locally dismissed already. Not adding card to storage. Server card: " + jSONObject;
    }

    public static final String e(JSONObject jSONObject) {
        return "Server card has expired already. Not adding card to storage. Server card: " + jSONObject;
    }

    public static final String g(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Card not present in storage for id: ", str);
    }

    public static final String h(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to read card json from storage. Json: ", str);
    }

    public static final String j(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Removing card from test cache: ", str);
    }

    public static final String k(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Removing card from storage with id: ", str);
    }

    public static final String l(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Server card is marked as removed. Removing from card storage with id: ", str);
    }

    public static final String m(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Server card is marked as dismissed. Adding to dismissed cached and removing from card storage with id: ", str);
    }

    public static final String n(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Can't update card field. Json cannot be parsed from disk or is not present. Id: ", str);
    }

    public static final String o(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Removing card from storage with id: ", str);
    }

    public static final String p(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Writing card to storage with id: ", str);
    }

    public final ContentCardsUpdatedEvent a(u3 u3Var, String str) {
        x3 x3Var;
        String str2;
        u3Var.getClass();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = str;
        if (str == null) {
            x3Var = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) x3Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new z$$ExternalSyntheticLambda0(1), 7, (Object) null);
            ref$ObjectRef.element = "";
        } else {
            x3Var = this;
        }
        if (!Intrinsics.areEqual(x3Var.a, ref$ObjectRef.element)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) x3Var, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new t7$$ExternalSyntheticLambda4(2, ref$ObjectRef, x3Var), 6, (Object) null);
            return null;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new b2$$ExternalSyntheticLambda0(5, ref$ObjectRef), 6, (Object) null);
        long j = u3Var.a;
        if (j != -1) {
            this.d = j;
            this.c.writeData(DataStoreKey.LAST_CARD_UPDATED_AT, Long.valueOf(j));
        }
        long j2 = u3Var.b;
        if (j2 != -1) {
            this.e = j2;
            this.c.writeData(DataStoreKey.LAST_FULL_CARD_SYNC_AT, Long.valueOf(j2));
        }
        this.c.writeData(DataStoreKey.LAST_CARD_STORAGE_UPDATE_TIMESTAMP, Long.valueOf(DateTimeUtils.nowInSeconds()));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        JSONArray jSONArray = u3Var.d;
        if (jSONArray != null && jSONArray.length() != 0) {
            TransformingSequence map = SequencesKt___SequencesKt.map(SequencesKt___SequencesKt.filter(CollectionsKt.asSequence(RangesKt___RangesKt.until(0, jSONArray.length())), new v3(jSONArray)), new w3(jSONArray));
            Iterator it = map.sequence.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = (JSONObject) map.transformer.invoke(it.next());
                a(jSONObject);
                String string2 = jSONObject.getString(CardKey.ID.getKey());
                string2.getClass();
                linkedHashSet.add(string2);
            }
        }
        if (u3Var.c) {
            this.f.retainAll(linkedHashSet);
            com.braze.storage.b bVar = this.c;
            DataStoreKey dataStoreKey = DataStoreKey.DISMISSED_CARDS;
            List list = CollectionsKt.toList(this.f);
            String str3 = "[]";
            if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    try {
                        Json.Default r0 = Json.Default;
                        r0.getClass();
                        str2 = r0.encodeToString(new HashSetSerializer(StringSerializer.INSTANCE, 1), list);
                    } catch (Exception e) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                        str2 = (!(list instanceof Map) && (list instanceof List)) ? "[]" : "{}";
                    }
                    bVar.writeData(dataStoreKey, str2);
                } catch (Exception e2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
                }
            }
            LinkedHashSet linkedHashSet2 = this.h;
            linkedHashSet2.retainAll(linkedHashSet);
            com.braze.storage.b bVar2 = this.c;
            DataStoreKey dataStoreKey2 = DataStoreKey.EXPIRED_CARDS;
            List list2 = CollectionsKt.toList(linkedHashSet2);
            if (dataStoreKey2.getType() != DataStoreValueType.LIST) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.o(dataStoreKey2), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                    try {
                        Json.Default r02 = Json.Default;
                        r02.getClass();
                        str3 = r02.encodeToString(new HashSetSerializer(StringSerializer.INSTANCE, 1), list2);
                    } catch (Exception e3) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                        if ((list2 instanceof Map) || !(list2 instanceof List)) {
                            str3 = "{}";
                        }
                    }
                    bVar2.writeData(dataStoreKey2, str3);
                } catch (Exception e4) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) new DataStoreProvider.p(dataStoreKey2), 8, (Object) null);
                }
            }
            linkedHashSet.addAll(this.g);
            a(linkedHashSet);
        }
        return a(false, (Long) null);
    }

    public final void b(String str) {
        String str2;
        str.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new x3$$ExternalSyntheticLambda2(str, 3), 6, (Object) null);
        LinkedHashSet linkedHashSet = this.g;
        linkedHashSet.add(str);
        com.braze.storage.b bVar = this.c;
        DataStoreKey dataStoreKey = DataStoreKey.TEST_CARDS;
        List list = CollectionsKt.toList(linkedHashSet);
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Default r0 = Json.Default;
                r0.getClass();
                str2 = r0.encodeToString(new HashSetSerializer(StringSerializer.INSTANCE, 1), list);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                str2 = (!(list instanceof Map) && (list instanceof List)) ? "[]" : "{}";
            }
            bVar.writeData(dataStoreKey, str2);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
        }
    }

    public final void c() {
        ArrayList<String> arrayList;
        Collection collection;
        x3 x3Var;
        Pair pair;
        com.braze.storage.b bVar = this.c;
        DataStoreKey dataStoreKey = DataStoreKey.CONTENT_CARDS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.i(dataStoreKey), 12, (Object) null);
            arrayList = new ArrayList();
        } else {
            try {
                Object readData = bVar.readData(dataStoreKey, "");
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
                            collection = (List) r0.decodeFromString(str, new HashSetSerializer(StringSerializer.INSTANCE, 1));
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
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : arrayList) {
            try {
                pair = new Pair(new JSONObject(str2).getString(CardKey.ID.getKey()), str2);
                x3Var = this;
            } catch (JSONException e3) {
                x3Var = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) x3Var, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) new x3$$ExternalSyntheticLambda2(str2, 6), 4, (Object) null);
                pair = null;
            }
            if (pair != null) {
                arrayList2.add(pair);
            }
            this = x3Var;
        }
        this.i = MapsKt__MapsKt.toMutableMap(MapsKt__MapsKt.toMap(arrayList2));
    }

    public final JSONObject f(String str) {
        str.getClass();
        String str2 = (String) this.i.get(str);
        if (str2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o6$$ExternalSyntheticLambda2(str, 26), 7, (Object) null);
            return null;
        }
        try {
            return new JSONObject(str2);
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new o6$$ExternalSyntheticLambda2(str2, 27), 4, (Object) null);
            return null;
        }
    }

    public final void i(String str) {
        String str2;
        str.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new x3$$ExternalSyntheticLambda2(str, 5), 6, (Object) null);
        LinkedHashSet linkedHashSet = this.g;
        linkedHashSet.remove(str);
        com.braze.storage.b bVar = this.c;
        DataStoreKey dataStoreKey = DataStoreKey.TEST_CARDS;
        List list = CollectionsKt.toList(linkedHashSet);
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Default r0 = Json.Default;
                r0.getClass();
                str2 = r0.encodeToString(new HashSetSerializer(StringSerializer.INSTANCE, 1), list);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                str2 = (!(list instanceof Map) && (list instanceof List)) ? "[]" : "{}";
            }
            bVar.writeData(dataStoreKey, str2);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
        }
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final void markCardAsClicked(String str) {
        str.getClass();
        a(str, CardKey.CLICKED);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final void markCardAsDismissed(String str) {
        str.getClass();
        a(str);
        a(str, (JSONObject) null);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final void markCardAsViewed(String str) {
        str.getClass();
        a(str, CardKey.VIEWED);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final void markCardAsVisuallyRead(String str) {
        str.getClass();
        a(str, CardKey.READ);
    }

    public static final String d() {
        return "The server card received is older than the cached card. Not updating the cached card.";
    }

    public static final String e() {
        return "Input user id was null. Defaulting to the empty user id";
    }

    public static final String d(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to parse card JSON, skipping: ", str);
    }

    public static final String e(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Deleting expired card from storage with id: ", str);
    }

    public static final String b(JSONObject jSONObject) {
        return "Server card json: " + jSONObject;
    }

    public static final String b() {
        return "Clearing content card storage.";
    }

    public static final String c(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Adding card to test cache: ", str);
    }

    public static final String c(JSONObject jSONObject) {
        return "Cached card json: " + jSONObject;
    }

    public final void a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        String str;
        Set set = CollectionsKt.toSet(this.f);
        Set set2 = CollectionsKt.toSet(this.h);
        String string2 = jSONObject.getString(CardKey.ID.getKey());
        string2.getClass();
        JSONObject f = f(string2);
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda2(jSONObject, 11), 7, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda2(f, 12), 7, (Object) null);
        if (f != null) {
            String key = CardKey.CREATED.getKey();
            if (f.has(key) && jSONObject.has(key) && f.getLong(key) > jSONObject.getLong(key)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new w$$ExternalSyntheticLambda0(29), 6, (Object) null);
                return;
            }
        }
        CardKey cardKey = CardKey.REMOVED;
        cardKey.getClass();
        String key2 = cardKey.getKey();
        if (jSONObject.has(key2) ? jSONObject.getBoolean(key2) : false) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o6$$ExternalSyntheticLambda2(string2, 28), 7, (Object) null);
            this.f.remove(string2);
            com.braze.storage.b bVar = this.c;
            DataStoreKey dataStoreKey = DataStoreKey.DISMISSED_CARDS;
            List list = CollectionsKt.toList(this.f);
            if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    try {
                        Json.Default r0 = Json.Default;
                        r0.getClass();
                        str = r0.encodeToString(new HashSetSerializer(StringSerializer.INSTANCE, 1), list);
                    } catch (Exception e) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                        str = (!(list instanceof Map) && (list instanceof List)) ? "[]" : "{}";
                    }
                    bVar.writeData(dataStoreKey, str);
                } catch (Exception e2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
                }
            }
            i(string2);
            a(string2, (JSONObject) null);
            return;
        }
        if (set.contains(string2)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda2(jSONObject, 13), 7, (Object) null);
            return;
        }
        if (set2.contains(string2)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda2(jSONObject, 14), 7, (Object) null);
            return;
        }
        CardKey cardKey2 = CardKey.DISMISSED;
        cardKey2.getClass();
        String key3 = cardKey2.getKey();
        if (jSONObject.has(key3) ? jSONObject.getBoolean(key3) : false) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new x3$$ExternalSyntheticLambda2(string2, 1), 7, (Object) null);
            a(string2);
            a(string2, (JSONObject) null);
            return;
        }
        if (f == null) {
            jSONObject2 = jSONObject;
        } else {
            jSONObject2 = new JSONObject();
            Iterator<String> keys = f.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject2.put(next, f.get(next));
            }
            Iterator<String> keys2 = jSONObject.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                if (k.contains(next2)) {
                    jSONObject2.put(next2, f.getBoolean(next2) || jSONObject.getBoolean(next2));
                } else {
                    jSONObject2.put(next2, jSONObject.get(next2));
                }
            }
        }
        a(string2, jSONObject2);
        CardKey cardKey3 = CardKey.IS_TEST;
        cardKey3.getClass();
        String key4 = cardKey3.getKey();
        if (jSONObject.has(key4) ? jSONObject.getBoolean(key4) : false) {
            b(string2);
        }
    }

    public static final String a(String str, String str2) {
        return Boxes$$ExternalSyntheticOutline1.m("Detected SDK update from '", str, "' -> '", str2, "'. Clearing config update time.");
    }

    public static final String a(Ref$ObjectRef ref$ObjectRef, x3 x3Var) {
        return "The received cards are for user " + ref$ObjectRef.element + " and the current user is " + x3Var.a + " , the cards will be discarded and no changes will be made.";
    }

    public static final String a(Ref$ObjectRef ref$ObjectRef) {
        return Boxes$$ExternalSyntheticOutline1.m("Updating offline Content Cards for user with id: ", ref$ObjectRef.element);
    }

    public final ContentCardsUpdatedEvent a(boolean z, Long l) {
        long longValue;
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        List a = n3.a(jSONArray, this.b, this, this.j);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : a) {
            if (((Card) obj).isExpired()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = arrayList2;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            a((Card) it2.next());
        }
        String str = this.a;
        if (l != null) {
            longValue = l.longValue();
        } else {
            Object readData = this.c.readData(DataStoreKey.LAST_CARD_STORAGE_UPDATE_TIMESTAMP, 0L);
            readData.getClass();
            longValue = ((Long) readData).longValue();
        }
        return new ContentCardsUpdatedEvent(arrayList3, str, longValue, z);
    }

    public final void a(Card card) {
        String str;
        card.getClass();
        String id = card.getId();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o6$$ExternalSyntheticLambda2(id, 25), 7, (Object) null);
        a(id, (JSONObject) null);
        id.getClass();
        this.h.add(id);
        com.braze.storage.b bVar = this.c;
        DataStoreKey dataStoreKey = DataStoreKey.EXPIRED_CARDS;
        List list = CollectionsKt.toList(this.h);
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                try {
                    Json.Default r0 = Json.Default;
                    r0.getClass();
                    str = r0.encodeToString(new HashSetSerializer(StringSerializer.INSTANCE, 1), list);
                } catch (Exception e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                    str = (!(list instanceof Map) && (list instanceof List)) ? "[]" : "{}";
                }
                bVar.writeData(dataStoreKey, str);
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
            }
        }
        i(id);
    }

    public final void a(String str, CardKey cardKey) {
        Boolean bool = Boolean.TRUE;
        str.getClass();
        cardKey.getClass();
        JSONObject f = f(str);
        if (f == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new x3$$ExternalSyntheticLambda2(str, 7), 7, (Object) null);
            return;
        }
        try {
            f.put(cardKey.getKey(), bool);
            a(str, f);
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new h$$ExternalSyntheticLambda0(cardKey, 25), 4, (Object) null);
        }
    }

    public static final String a(Object obj, CardKey cardKey) {
        return "Failed to update card json field to " + obj + " with key: " + cardKey;
    }

    public final void a(String str, JSONObject jSONObject) {
        x3 x3Var;
        String str2;
        str.getClass();
        if (jSONObject == null) {
            x3Var = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) x3Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new x3$$ExternalSyntheticLambda2(str, 0), 7, (Object) null);
            x3Var.i.remove(str);
        } else {
            x3Var = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) x3Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new x3$$ExternalSyntheticLambda2(str, 4), 7, (Object) null);
            x3Var.i.put(str, jSONObject.toString());
        }
        List list = CollectionsKt.toList(x3Var.i.values());
        com.braze.storage.b bVar = x3Var.c;
        DataStoreKey dataStoreKey = DataStoreKey.CONTENT_CARDS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Default r0 = Json.Default;
                r0.getClass();
                str2 = r0.encodeToString(new HashSetSerializer(StringSerializer.INSTANCE, 1), list);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                str2 = (!(list instanceof Map) && (list instanceof List)) ? "[]" : "{}";
            }
            bVar.writeData(dataStoreKey, str2);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
        }
    }

    public final void a(String str) {
        String str2;
        str.getClass();
        this.f.add(str);
        com.braze.storage.b bVar = this.c;
        DataStoreKey dataStoreKey = DataStoreKey.DISMISSED_CARDS;
        List list = CollectionsKt.toList(this.f);
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Default r0 = Json.Default;
                r0.getClass();
                str2 = r0.encodeToString(new HashSetSerializer(StringSerializer.INSTANCE, 1), list);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                str2 = (!(list instanceof Map) && (list instanceof List)) ? "[]" : "{}";
            }
            bVar.writeData(dataStoreKey, str2);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
        }
    }

    public final void a(LinkedHashSet linkedHashSet) {
        String str;
        linkedHashSet.getClass();
        Set keySet = this.i.keySet();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new t7$$ExternalSyntheticLambda4(linkedHashSet, keySet), 7, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (!linkedHashSet.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str2 = (String) arrayList.get(i);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new x3$$ExternalSyntheticLambda2(str2, 2), 7, (Object) null);
            this.i.remove(str2);
        }
        List list = CollectionsKt.toList(this.i.values());
        com.braze.storage.b bVar = this.c;
        DataStoreKey dataStoreKey = DataStoreKey.CONTENT_CARDS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Default r0 = Json.Default;
                r0.getClass();
                str = r0.encodeToString(new HashSetSerializer(StringSerializer.INSTANCE, 1), list);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                str = (!(list instanceof Map) && (list instanceof List)) ? "[]" : "{}";
            }
            bVar.writeData(dataStoreKey, str);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
        }
    }

    public static final String a(Set set, Set set2) {
        return "Retaining card ids: " + set + " among cached card ids: " + set2;
    }

    public final void a() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new w$$ExternalSyntheticLambda0(28), 7, (Object) null);
        this.i.clear();
        this.h.clear();
        this.c.clearAllData();
    }
}
