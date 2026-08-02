package com.datadog.trace.core.util;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_common.zzsr;
import com.google.android.gms.internal.mlkit_vision_face.zznq;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.cash.data.contacts.ContactDetailsSyncState$ContactRow;
import com.squareup.cash.data.contacts.ContactDetailsSyncState$LatestAndRow;
import com.squareup.cash.data.contacts.ContactDetailsSyncState$LatestLookupKey;
import com.squareup.cash.data.contacts.ContactDetailsSyncState$PrimaryKey;
import com.squareup.cash.data.contacts.ContactResolverKt$recoverLostContacts$1;
import com.squareup.cash.integration.contacts.ContactBook$Contact$DetailedContact;
import com.squareup.cash.integration.contacts.RealContactBook;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.exception.FinancialConnectionsError;
import com.stripe.android.financialconnections.exception.WebAuthFlowFailedException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt___StringsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public abstract class JsonObjectUtils {
    public static zzsr zza;

    public static String getAsString(JsonObject jsonObject, String str) {
        JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement == null || !jsonElement.isJsonPrimitive()) {
            return null;
        }
        return jsonElement.getAsJsonPrimitive().getAsString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x020b A[LOOP:1: B:35:0x0205->B:37:0x020b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x026d A[LOOP:2: B:43:0x0267->B:45:0x026d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r11v21, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x01be -> B:10:0x01ca). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable recoverLostContacts(RealContactBook realContactBook, List list, LinkedHashMap linkedHashMap, ContinuationImpl continuationImpl) {
        ContactResolverKt$recoverLostContacts$1 contactResolverKt$recoverLostContacts$1;
        int i;
        int i2;
        Map map;
        Map map2;
        RealContactBook realContactBook2;
        Iterator it;
        ContactResolverKt$recoverLostContacts$1 contactResolverKt$recoverLostContacts$12;
        LinkedHashMap linkedHashMap2;
        if (continuationImpl instanceof ContactResolverKt$recoverLostContacts$1) {
            contactResolverKt$recoverLostContacts$1 = (ContactResolverKt$recoverLostContacts$1) continuationImpl;
            int i3 = contactResolverKt$recoverLostContacts$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                contactResolverKt$recoverLostContacts$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = contactResolverKt$recoverLostContacts$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = contactResolverKt$recoverLostContacts$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        arrayList.add(new Pair(new ContactDetailsSyncState$LatestLookupKey(((ContactDetailsSyncState$LatestAndRow) entry.getValue()).latestLookupKey), entry.getKey()));
                    }
                    Map map3 = MapsKt__MapsKt.toMap(arrayList);
                    List<ContactBook$Contact$DetailedContact> list2 = list;
                    ArrayList arrayList2 = new ArrayList();
                    for (ContactBook$Contact$DetailedContact contactBook$Contact$DetailedContact : list2) {
                        String str = contactBook$Contact$DetailedContact.lookupKey;
                        str.getClass();
                        ContactDetailsSyncState$PrimaryKey contactDetailsSyncState$PrimaryKey = (ContactDetailsSyncState$PrimaryKey) map3.get(new ContactDetailsSyncState$LatestLookupKey(str));
                        String str2 = contactDetailsSyncState$PrimaryKey != null ? contactDetailsSyncState$PrimaryKey.key : null;
                        Pair pair = str2 != null ? new Pair(contactBook$Contact$DetailedContact, new ContactDetailsSyncState$PrimaryKey(str2)) : null;
                        if (pair != null) {
                            arrayList2.add(pair);
                        }
                    }
                    Map map4 = MapsKt__MapsKt.toMap(arrayList2);
                    int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    if (mapCapacity < 16) {
                        mapCapacity = 16;
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(mapCapacity);
                    for (Object obj2 : list2) {
                        String str3 = ((ContactBook$Contact$DetailedContact) obj2).lookupKey;
                        str3.getClass();
                        linkedHashMap3.put(obj2, new ContactDetailsSyncState$PrimaryKey(str3));
                    }
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(MapsKt__MapsKt.plus(linkedHashMap3, map4));
                    Set minus = SetsKt___SetsKt.minus(linkedHashMap.keySet(), (Iterable) CollectionsKt.toSet(linkedHashMap4.values()));
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : list2) {
                        if (!map4.containsKey((ContactBook$Contact$DetailedContact) obj3)) {
                            arrayList3.add(obj3);
                        }
                    }
                    int mapCapacity2 = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                    if (mapCapacity2 < 16) {
                        mapCapacity2 = 16;
                    }
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap(mapCapacity2);
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        linkedHashMap5.put(new Long(((ContactBook$Contact$DetailedContact) next).contactId), next);
                    }
                    LinkedHashMap linkedHashMap6 = new LinkedHashMap(linkedHashMap5);
                    Iterator it3 = minus.iterator();
                    i2 = 0;
                    map = linkedHashMap6;
                    map2 = linkedHashMap4;
                    realContactBook2 = realContactBook;
                    it = it3;
                    contactResolverKt$recoverLostContacts$12 = contactResolverKt$recoverLostContacts$1;
                    linkedHashMap2 = linkedHashMap;
                    while (it.hasNext()) {
                    }
                    ArrayList arrayList4 = new ArrayList(map2.size());
                    while (r1.hasNext()) {
                    }
                    Map map5 = MapsKt__MapsKt.toMap(arrayList4);
                    Collection values = map.values();
                    int mapCapacity3 = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(values, 10));
                    LinkedHashMap linkedHashMap7 = new LinkedHashMap(mapCapacity3 >= 16 ? mapCapacity3 : 16);
                    while (r1.hasNext()) {
                    }
                    return MapsKt__MapsKt.plus(map5, linkedHashMap7);
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i4 = contactResolverKt$recoverLostContacts$1.I$0;
                String str4 = contactResolverKt$recoverLostContacts$1.L$11;
                it = contactResolverKt$recoverLostContacts$1.L$9;
                map = contactResolverKt$recoverLostContacts$1.L$7;
                map2 = contactResolverKt$recoverLostContacts$1.L$4;
                Map map6 = contactResolverKt$recoverLostContacts$1.L$2;
                RealContactBook realContactBook3 = contactResolverKt$recoverLostContacts$1.L$0;
                SafeTrace.throwOnFailure(obj);
                LinkedHashMap linkedHashMap8 = map6;
                Long l = (Long) obj;
                if (l != null) {
                    long longValue = l.longValue();
                    ContactBook$Contact$DetailedContact contactBook$Contact$DetailedContact2 = (ContactBook$Contact$DetailedContact) map.get(new Long(longValue));
                    if (contactBook$Contact$DetailedContact2 != null) {
                        map2.put(contactBook$Contact$DetailedContact2, new ContactDetailsSyncState$PrimaryKey(str4));
                        map.remove(new Long(longValue));
                    }
                }
                i2 = i4;
                realContactBook2 = realContactBook3;
                contactResolverKt$recoverLostContacts$12 = contactResolverKt$recoverLostContacts$1;
                linkedHashMap2 = linkedHashMap8;
                while (it.hasNext()) {
                    String str5 = ((ContactDetailsSyncState$PrimaryKey) it.next()).key;
                    ContactDetailsSyncState$LatestAndRow contactDetailsSyncState$LatestAndRow = (ContactDetailsSyncState$LatestAndRow) linkedHashMap2.get(new ContactDetailsSyncState$PrimaryKey(str5));
                    if (contactDetailsSyncState$LatestAndRow != null) {
                        String str6 = contactDetailsSyncState$LatestAndRow.latestLookupKey;
                        ContactDetailsSyncState$ContactRow contactDetailsSyncState$ContactRow = contactDetailsSyncState$LatestAndRow.row;
                        if (contactDetailsSyncState$ContactRow != null) {
                            long j = contactDetailsSyncState$ContactRow.row;
                            contactResolverKt$recoverLostContacts$12.L$0 = realContactBook2;
                            contactResolverKt$recoverLostContacts$12.L$2 = linkedHashMap2;
                            contactResolverKt$recoverLostContacts$12.L$4 = map2;
                            contactResolverKt$recoverLostContacts$12.L$7 = map;
                            contactResolverKt$recoverLostContacts$12.L$9 = it;
                            contactResolverKt$recoverLostContacts$12.L$11 = str5;
                            contactResolverKt$recoverLostContacts$12.I$0 = i2;
                            contactResolverKt$recoverLostContacts$12.label = 1;
                            Object latestRowId = realContactBook2.latestRowId(j, str6, contactResolverKt$recoverLostContacts$12);
                            if (latestRowId == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            realContactBook3 = realContactBook2;
                            obj = latestRowId;
                            linkedHashMap8 = linkedHashMap2;
                            contactResolverKt$recoverLostContacts$1 = contactResolverKt$recoverLostContacts$12;
                            i4 = i2;
                            str4 = str5;
                            Long l2 = (Long) obj;
                            if (l2 != null) {
                            }
                            i2 = i4;
                            realContactBook2 = realContactBook3;
                            contactResolverKt$recoverLostContacts$12 = contactResolverKt$recoverLostContacts$1;
                            linkedHashMap2 = linkedHashMap8;
                            while (it.hasNext()) {
                            }
                        }
                    }
                }
                ArrayList arrayList42 = new ArrayList(map2.size());
                for (Map.Entry entry2 : map2.entrySet()) {
                    ContactBook$Contact$DetailedContact contactBook$Contact$DetailedContact3 = (ContactBook$Contact$DetailedContact) entry2.getKey();
                    ContactBook$Contact$DetailedContact copy$default = ContactBook$Contact$DetailedContact.copy$default(contactBook$Contact$DetailedContact3, ((ContactDetailsSyncState$PrimaryKey) entry2.getValue()).key, null, null, null, null, null, null, -5);
                    long j2 = contactBook$Contact$DetailedContact3.contactId;
                    String str7 = contactBook$Contact$DetailedContact3.lookupKey;
                    str7.getClass();
                    arrayList42.add(new Pair(copy$default, new ContactDetailsSyncState$LatestAndRow(str7, new ContactDetailsSyncState$ContactRow(j2))));
                }
                Map map52 = MapsKt__MapsKt.toMap(arrayList42);
                Collection values2 = map.values();
                int mapCapacity32 = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(values2, 10));
                LinkedHashMap linkedHashMap72 = new LinkedHashMap(mapCapacity32 >= 16 ? mapCapacity32 : 16);
                for (Object obj4 : values2) {
                    ContactBook$Contact$DetailedContact contactBook$Contact$DetailedContact4 = (ContactBook$Contact$DetailedContact) obj4;
                    long j3 = contactBook$Contact$DetailedContact4.contactId;
                    String str8 = contactBook$Contact$DetailedContact4.lookupKey;
                    str8.getClass();
                    linkedHashMap72.put(obj4, new ContactDetailsSyncState$LatestAndRow(str8, new ContactDetailsSyncState$ContactRow(j3)));
                }
                return MapsKt__MapsKt.plus(map52, linkedHashMap72);
            }
        }
        contactResolverKt$recoverLostContacts$1 = new ContactResolverKt$recoverLostContacts$1(continuationImpl);
        Object obj5 = contactResolverKt$recoverLostContacts$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = contactResolverKt$recoverLostContacts$1.label;
        if (i != 0) {
        }
    }

    public static HashMap safeGetAsMap(JsonObject jsonObject) {
        JsonElement jsonElement = jsonObject.get("tags");
        if (jsonElement == null || !jsonElement.isJsonObject()) {
            return null;
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
            JsonElement value = entry.getValue();
            if (value.isJsonPrimitive()) {
                hashMap.put(entry.getKey(), value.getAsJsonPrimitive().getAsString());
            }
        }
        return hashMap;
    }

    public static final Map toEventParams(String str, Throwable th) {
        String simpleName;
        String simpleName2;
        String message;
        String valueOf;
        String message2;
        String valueOf2;
        th.getClass();
        if (th instanceof WebAuthFlowFailedException) {
            String str2 = ((WebAuthFlowFailedException) th).reason;
            return MapsKt__MapsKt.mapOf(new Pair(BreadcrumbHelper.Category.ERROR, str2), new Pair("error_type", str2), new Pair("error_stacktrace", ExceptionsKt__ExceptionsKt.stackTraceToString(th)), new Pair("error_message", CollectionsKt.joinToString$default(ArraysKt___ArraysKt.filterNotNull(new String[]{th.getMessage(), str}), " ", null, null, 0, null, null, 62)), new Pair("code", null));
        }
        if (th instanceof FinancialConnectionsError) {
            FinancialConnectionsError financialConnectionsError = (FinancialConnectionsError) th;
            StripeError stripeError = financialConnectionsError.stripeError;
            String str3 = financialConnectionsError.name;
            Pair pair = new Pair(BreadcrumbHelper.Category.ERROR, str3);
            Pair pair2 = new Pair("error_type", str3);
            Pair pair3 = new Pair("error_stacktrace", ExceptionsKt__ExceptionsKt.stackTraceToString(th));
            if (stripeError == null || (message2 = stripeError.message) == null) {
                message2 = th.getMessage();
            }
            Pair pair4 = new Pair("error_message", CollectionsKt.joinToString$default(ArraysKt___ArraysKt.filterNotNull(new String[]{message2, str}), " ", null, null, 0, null, null, 62));
            if (stripeError == null || (valueOf2 = stripeError.code) == null) {
                valueOf2 = String.valueOf(financialConnectionsError.statusCode);
            }
            return MapsKt__MapsKt.mapOf(pair, pair2, pair3, pair4, new Pair("code", valueOf2));
        }
        if (!(th instanceof StripeException)) {
            Pair pair5 = new Pair(BreadcrumbHelper.Category.ERROR, th.getClass().getSimpleName());
            Pair pair6 = new Pair("error_type", th.getClass().getSimpleName());
            Pair pair7 = new Pair("error_stacktrace", ExceptionsKt__ExceptionsKt.stackTraceToString(th));
            String message3 = th.getMessage();
            return MapsKt__MapsKt.mapOf(pair5, pair6, pair7, new Pair("error_message", CollectionsKt.joinToString$default(ArraysKt___ArraysKt.filterNotNull(new String[]{message3 != null ? StringsKt___StringsKt.take(100, message3) : null, str}), " ", null, null, 0, null, null, 62)), new Pair("code", null));
        }
        StripeException stripeException = (StripeException) th;
        StripeError stripeError2 = stripeException.stripeError;
        if (stripeError2 == null || (simpleName = stripeError2.f1428type) == null) {
            simpleName = th.getClass().getSimpleName();
        }
        Pair pair8 = new Pair(BreadcrumbHelper.Category.ERROR, simpleName);
        if (stripeError2 == null || (simpleName2 = stripeError2.f1428type) == null) {
            simpleName2 = th.getClass().getSimpleName();
        }
        Pair pair9 = new Pair("error_type", simpleName2);
        Pair pair10 = new Pair("error_stacktrace", ExceptionsKt__ExceptionsKt.stackTraceToString(th));
        if (stripeError2 == null || (message = stripeError2.message) == null) {
            message = th.getMessage();
        }
        Pair pair11 = new Pair("error_message", CollectionsKt.joinToString$default(ArraysKt___ArraysKt.filterNotNull(new String[]{message != null ? StringsKt___StringsKt.take(100, message) : null, str}), " ", null, null, 0, null, null, 62));
        if (stripeError2 == null || (valueOf = stripeError2.code) == null) {
            valueOf = String.valueOf(stripeException.statusCode);
        }
        return MapsKt__MapsKt.mapOf(pair8, pair9, pair10, pair11, new Pair("code", valueOf));
    }

    public static synchronized zzoc zzb(String str) {
        zzoc zzocVar;
        synchronized (JsonObjectUtils.class) {
            zznq zznqVar = new zznq(str);
            synchronized (JsonObjectUtils.class) {
                try {
                    if (zza == null) {
                        zza = new zzsr(4);
                    }
                    zzocVar = (zzoc) zza.get(zznqVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzocVar;
        }
        return zzocVar;
    }
}
