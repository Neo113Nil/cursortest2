package com.squareup.cash.integration.contacts;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import androidx.compose.material.SwipeableState$special$$inlined$filter$1;
import androidx.datastore.core.DataStoreImpl$data$1;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.copper.ContentResolverQuery;
import app.cash.copper.flow.FlowContentResolver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.maps.android.compose.MapComposeViewRenderKt;
import com.squareup.cash.db2.WebLoginConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.formview.components.FormCashtag$8$invokeSuspend$$inlined$map$1;
import com.squareup.cash.graphics.swampgl.components.Camera$special$$inlined$map$1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.SequenceBuilderIterator;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealContactBook {
    public final Flow contactAccounts;
    public final Flow contacts;
    public final Context context;
    public final Flow detailedContacts;
    public final CoroutineContext ioDispatcher;
    public static final Uri URI = ContactsContract.Data.CONTENT_URI.buildUpon().appendQueryParameter("visible_contacts_only", "true").build();
    public static final Uri RAW_CONTACTS_URI = ContactsContract.RawContacts.CONTENT_URI;
    public static final String[] ARGS_ALL = {"vnd.android.cursor.item/email_v2", "vnd.android.cursor.item/phone_v2"};
    public static final String[] PROJECTION = {"lookup", "display_name", "mimetype", "data1", "data1"};
    public static final String[] PROJECTION_CONTACT_ACCOUNTS = {"contact_id", "account_name", "account_type"};
    public static final String[] DETAILED_PROJECTION = {"lookup", "display_name", "mimetype", "contact_id", "data1", "data2", "data3", "data4", "data5", "data6", "data7", "data8", "data9", "data10", "data14"};
    public static final String[] PROJECTION_CONTACT_DETAILS = {"lookup", "_id"};
    public static final Map contactCursorFetchers = MapsKt__MapsKt.mapOf(new Pair("vnd.android.cursor.item/name", new WebLoginConfigQueries$$ExternalSyntheticLambda0(14)), new Pair("vnd.android.cursor.item/nickname", new WebLoginConfigQueries$$ExternalSyntheticLambda0(17)), new Pair("vnd.android.cursor.item/postal-address_v2", new WebLoginConfigQueries$$ExternalSyntheticLambda0(18)), new Pair("vnd.android.cursor.item/organization", new WebLoginConfigQueries$$ExternalSyntheticLambda0(19)), new Pair("vnd.android.cursor.item/email_v2", new WebLoginConfigQueries$$ExternalSyntheticLambda0(20)), new Pair("vnd.android.cursor.item/website", new WebLoginConfigQueries$$ExternalSyntheticLambda0(21)), new Pair("vnd.android.cursor.item/phone_v2", new WebLoginConfigQueries$$ExternalSyntheticLambda0(22)), new Pair("vnd.android.cursor.item/contact_event", new WebLoginConfigQueries$$ExternalSyntheticLambda0(23)), new Pair("vnd.android.cursor.item/relation", new WebLoginConfigQueries$$ExternalSyntheticLambda0(24)), new Pair("vnd.android.cursor.item/note", new WebLoginConfigQueries$$ExternalSyntheticLambda0(15)), new Pair("vnd.android.cursor.item/photo", new WebLoginConfigQueries$$ExternalSyntheticLambda0(16)));

    /* loaded from: classes6.dex */
    public final class CopperContactAccountDetails implements ContactBook$ContactAccountDetailsQuery {
        public final ContentResolverQuery query;

        public CopperContactAccountDetails(ContentResolverQuery contentResolverQuery) {
            contentResolverQuery.getClass();
            this.query = contentResolverQuery;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x003b A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x001f A[SYNTHETIC] */
        @Override // com.squareup.cash.integration.contacts.ContactBook$ContactAccountDetailsQuery
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final List execute() {
            Object invoke;
            Long l;
            Cursor run = this.query.run();
            if (run == null) {
                return EmptyList.INSTANCE;
            }
            try {
                Integer access$maybeGetColumnIndex = MapComposeViewRenderKt.access$maybeGetColumnIndex(run, "contact_id");
                Integer access$maybeGetColumnIndex2 = MapComposeViewRenderKt.access$maybeGetColumnIndex(run, "account_name");
                Integer access$maybeGetColumnIndex3 = MapComposeViewRenderKt.access$maybeGetColumnIndex(run, "account_type");
                ArrayList arrayList = new ArrayList();
                while (run.moveToNext()) {
                    RealContactBookKt$maybeGetLong$1 realContactBookKt$maybeGetLong$1 = RealContactBookKt$maybeGetLong$1.INSTANCE;
                    if (access$maybeGetColumnIndex != null) {
                        try {
                            invoke = realContactBookKt$maybeGetLong$1.invoke(run, Integer.valueOf(access$maybeGetColumnIndex.intValue()));
                        } catch (Exception unused) {
                        }
                        l = (Long) invoke;
                        if (l == null) {
                            arrayList.add(new ContactBook$ContactAccountDetails(l.longValue(), MapComposeViewRenderKt.access$maybeGetString(run, access$maybeGetColumnIndex2), MapComposeViewRenderKt.access$maybeGetString(run, access$maybeGetColumnIndex3)));
                        }
                    }
                    invoke = null;
                    l = (Long) invoke;
                    if (l == null) {
                    }
                }
                run.close();
                return arrayList;
            } finally {
            }
        }
    }

    /* loaded from: classes6.dex */
    public final class CopperContactAccountLookup {
        public final ContentResolverQuery query;

        public CopperContactAccountLookup(ContentResolverQuery contentResolverQuery) {
            contentResolverQuery.getClass();
            this.query = contentResolverQuery;
        }
    }

    /* loaded from: classes6.dex */
    public final class CopperContactsQuery implements ContactBook$ContactsQuery {
        public final ContentResolverQuery query;

        public CopperContactsQuery(ContentResolverQuery contentResolverQuery) {
            contentResolverQuery.getClass();
            this.query = contentResolverQuery;
        }

        @Override // com.squareup.cash.integration.contacts.ContactBook$ContactsQuery
        public final SequenceBuilderIterator execute() {
            return SequencesKt__SequenceBuilderKt.iterator(new RealContactBook$CopperContactsQuery$execute$1(this, null));
        }
    }

    /* loaded from: classes6.dex */
    public final class CopperDetailsContactsQuery implements ContactBook$DetailedContactQuery {
        public final ContentResolverQuery query;

        public CopperDetailsContactsQuery(ContentResolverQuery contentResolverQuery) {
            contentResolverQuery.getClass();
            this.query = contentResolverQuery;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x007f A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0063 A[SYNTHETIC] */
        @Override // com.squareup.cash.integration.contacts.ContactBook$DetailedContactQuery
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final List execute() {
            Object invoke;
            Long l;
            String access$maybeGetString;
            Cursor run = this.query.run();
            if (run != null) {
                try {
                    Integer access$maybeGetColumnIndex = MapComposeViewRenderKt.access$maybeGetColumnIndex(run, "mimetype");
                    Integer access$maybeGetColumnIndex2 = MapComposeViewRenderKt.access$maybeGetColumnIndex(run, "contact_id");
                    Integer access$maybeGetColumnIndex3 = MapComposeViewRenderKt.access$maybeGetColumnIndex(run, "lookup");
                    Integer access$maybeGetColumnIndex4 = MapComposeViewRenderKt.access$maybeGetColumnIndex(run, "display_name");
                    HashMap hashMap = new HashMap();
                    Map map = RealContactBook.contactCursorFetchers;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(map.size()));
                    for (Object obj : map.entrySet()) {
                        linkedHashMap.put(((Map.Entry) obj).getKey(), (RealContactBook$Companion$ContactCursorFetcher) ((Function1) ((Map.Entry) obj).getValue()).invoke(run));
                    }
                    while (run.moveToNext()) {
                        RealContactBookKt$maybeGetLong$1 realContactBookKt$maybeGetLong$1 = RealContactBookKt$maybeGetLong$1.INSTANCE;
                        if (access$maybeGetColumnIndex2 != null) {
                            try {
                                invoke = realContactBookKt$maybeGetLong$1.invoke(run, Integer.valueOf(access$maybeGetColumnIndex2.intValue()));
                            } catch (Exception unused) {
                            }
                            l = (Long) invoke;
                            if (l == null) {
                                long longValue = l.longValue();
                                String access$maybeGetString2 = MapComposeViewRenderKt.access$maybeGetString(run, access$maybeGetColumnIndex3);
                                if (access$maybeGetString2 != null && (access$maybeGetString = MapComposeViewRenderKt.access$maybeGetString(run, access$maybeGetColumnIndex4)) != null) {
                                    ContactBook$Contact$DetailedContact contactBook$Contact$DetailedContact = (ContactBook$Contact$DetailedContact) hashMap.get(access$maybeGetString2);
                                    if (contactBook$Contact$DetailedContact == null) {
                                        contactBook$Contact$DetailedContact = new ContactBook$Contact$DetailedContact(longValue, access$maybeGetString, access$maybeGetString2);
                                    }
                                    RealContactBook$Companion$ContactCursorFetcher realContactBook$Companion$ContactCursorFetcher = (RealContactBook$Companion$ContactCursorFetcher) linkedHashMap.get(MapComposeViewRenderKt.access$maybeGetString(run, access$maybeGetColumnIndex));
                                    if (realContactBook$Companion$ContactCursorFetcher != null) {
                                        realContactBook$Companion$ContactCursorFetcher.update(contactBook$Contact$DetailedContact, run);
                                    }
                                    hashMap.put(access$maybeGetString2, contactBook$Contact$DetailedContact);
                                }
                            }
                        }
                        invoke = null;
                        l = (Long) invoke;
                        if (l == null) {
                        }
                    }
                    Collection values = hashMap.values();
                    values.getClass();
                    List list = CollectionsKt.toList(values);
                    run.close();
                    if (list != null) {
                        return list;
                    }
                } finally {
                }
            }
            return EmptyList.INSTANCE;
        }
    }

    /* loaded from: classes6.dex */
    public final class PhotoFetcher implements RealContactBook$Companion$ContactCursorFetcher {
        public final /* synthetic */ int $r8$classId;
        public final Integer photo;

        public PhotoFetcher(Cursor cursor, int i) {
            this.$r8$classId = i;
            cursor.getClass();
            switch (i) {
                case 1:
                    this.photo = MapComposeViewRenderKt.access$maybeGetColumnIndex(cursor, "data1");
                    break;
                case 2:
                    this.photo = MapComposeViewRenderKt.access$maybeGetColumnIndex(cursor, "data1");
                    break;
                default:
                    this.photo = MapComposeViewRenderKt.access$maybeGetColumnIndex(cursor, "data14");
                    break;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
        @Override // com.squareup.cash.integration.contacts.RealContactBook$Companion$ContactCursorFetcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void update(ContactBook$Contact$DetailedContact contactBook$Contact$DetailedContact, Cursor cursor) {
            Object invoke;
            int i = this.$r8$classId;
            Integer num = this.photo;
            switch (i) {
                case 0:
                    RealContactBookKt$maybeGetLong$1 realContactBookKt$maybeGetLong$1 = RealContactBookKt$maybeGetLong$1.INSTANCE;
                    if (num != null) {
                        try {
                            invoke = realContactBookKt$maybeGetLong$1.invoke(cursor, Integer.valueOf(num.intValue()));
                        } catch (Exception unused) {
                        }
                        Long l = (Long) invoke;
                        contactBook$Contact$DetailedContact.imagePath = l != null ? ContentUris.withAppendedId(ContactsContract.DisplayPhoto.CONTENT_URI, l.longValue()).toString() : null;
                        break;
                    }
                    invoke = null;
                    Long l2 = (Long) invoke;
                    contactBook$Contact$DetailedContact.imagePath = l2 != null ? ContentUris.withAppendedId(ContactsContract.DisplayPhoto.CONTENT_URI, l2.longValue()).toString() : null;
                case 1:
                    contactBook$Contact$DetailedContact.nickname = MapComposeViewRenderKt.access$maybeGetString(cursor, num);
                    break;
                default:
                    contactBook$Contact$DetailedContact.hasNote = contactBook$Contact$DetailedContact.hasNote || MapComposeViewRenderKt.access$maybeGetString(cursor, num) != null;
                    break;
            }
        }
    }

    public RealContactBook(Context context, CoroutineContext coroutineContext) {
        this.context = context;
        this.ioDispatcher = coroutineContext;
        ContentResolver contentResolver = context.getContentResolver();
        contentResolver.getClass();
        Uri uri = URI;
        uri.getClass();
        final SafeFlow observeQuery$default = FlowContentResolver.observeQuery$default(contentResolver, uri, PROJECTION, ARGS_ALL, 48);
        final int i = 0;
        int i2 = 3;
        Continuation continuation = null;
        int i3 = 21;
        this.contacts = FlowKt.flowOn(new FinishSetupTileBadgeCounter(i3, new Flow() { // from class: com.squareup.cash.integration.contacts.RealContactBook$special$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation2) {
                int i4 = i;
                SafeFlow safeFlow = observeQuery$default;
                switch (i4) {
                    case 0:
                        Object collect = safeFlow.collect(new Camera$special$$inlined$map$1.AnonymousClass2(flowCollector, 26), continuation2);
                        if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            break;
                        }
                        break;
                    case 1:
                        Object collect2 = safeFlow.collect(new Camera$special$$inlined$map$1.AnonymousClass2(flowCollector, 27), continuation2);
                        if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            break;
                        }
                        break;
                    default:
                        Object collect3 = safeFlow.collect(new Camera$special$$inlined$map$1.AnonymousClass2(flowCollector, 28), continuation2);
                        if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            break;
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }, new RealContactBook$contacts$4(i2, continuation, i)), coroutineContext);
        ContentResolver contentResolver2 = context.getContentResolver();
        contentResolver2.getClass();
        final SafeFlow observeQuery$default2 = FlowContentResolver.observeQuery$default(contentResolver2, uri, DETAILED_PROJECTION, null, 60);
        final int i4 = 1;
        final int i5 = 2;
        this.detailedContacts = FlowKt.flowOn(new FinishSetupTileBadgeCounter(i3, new Flow() { // from class: com.squareup.cash.integration.contacts.RealContactBook$special$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation2) {
                int i42 = i4;
                SafeFlow safeFlow = observeQuery$default2;
                switch (i42) {
                    case 0:
                        Object collect = safeFlow.collect(new Camera$special$$inlined$map$1.AnonymousClass2(flowCollector, 26), continuation2);
                        if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            break;
                        }
                        break;
                    case 1:
                        Object collect2 = safeFlow.collect(new Camera$special$$inlined$map$1.AnonymousClass2(flowCollector, 27), continuation2);
                        if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            break;
                        }
                        break;
                    default:
                        Object collect3 = safeFlow.collect(new Camera$special$$inlined$map$1.AnonymousClass2(flowCollector, 28), continuation2);
                        if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            break;
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }, new RealContactBook$contacts$4(i2, continuation, i5)), coroutineContext);
        ContentResolver contentResolver3 = context.getContentResolver();
        contentResolver3.getClass();
        Uri uri2 = RAW_CONTACTS_URI;
        uri2.getClass();
        final SafeFlow observeQuery$default3 = FlowContentResolver.observeQuery$default(contentResolver3, uri2, PROJECTION_CONTACT_ACCOUNTS, null, 60);
        this.contactAccounts = FlowKt.flowOn(new FinishSetupTileBadgeCounter(i3, new Flow() { // from class: com.squareup.cash.integration.contacts.RealContactBook$special$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation2) {
                int i42 = i5;
                SafeFlow safeFlow = observeQuery$default3;
                switch (i42) {
                    case 0:
                        Object collect = safeFlow.collect(new Camera$special$$inlined$map$1.AnonymousClass2(flowCollector, 26), continuation2);
                        if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            break;
                        }
                        break;
                    case 1:
                        Object collect2 = safeFlow.collect(new Camera$special$$inlined$map$1.AnonymousClass2(flowCollector, 27), continuation2);
                        if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            break;
                        }
                        break;
                    default:
                        Object collect3 = safeFlow.collect(new Camera$special$$inlined$map$1.AnonymousClass2(flowCollector, 28), continuation2);
                        if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            break;
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }, new RealContactBook$contacts$4(i2, continuation, i4)), coroutineContext);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:15|16))(3:17|(2:19|(1:21))|22)|11|12))|24|6|7|(0)(0)|11|12) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object latestRowId(long j, String str, ContinuationImpl continuationImpl) {
        RealContactBook$latestRowId$1 realContactBook$latestRowId$1;
        int i;
        if (continuationImpl instanceof RealContactBook$latestRowId$1) {
            realContactBook$latestRowId$1 = (RealContactBook$latestRowId$1) continuationImpl;
            int i2 = realContactBook$latestRowId$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realContactBook$latestRowId$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realContactBook$latestRowId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realContactBook$latestRowId$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Uri lookupUri = ContactsContract.Contacts.getLookupUri(j, str);
                    if (lookupUri != null) {
                        ContentResolver contentResolver = this.context.getContentResolver();
                        contentResolver.getClass();
                        Flow flowOn = FlowKt.flowOn(new FinishSetupTileBadgeCounter(21, new FormCashtag$8$invokeSuspend$$inlined$map$1(new SwipeableState$special$$inlined$filter$1(FlowContentResolver.observeQuery$default(contentResolver, lookupUri, PROJECTION_CONTACT_DETAILS, null, 60), 14), 11), new DataStoreImpl$data$1.AnonymousClass5()), this.ioDispatcher);
                        realContactBook$latestRowId$1.label = 1;
                        obj = FlowKt.first(flowOn, realContactBook$latestRowId$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                return (Long) obj;
            }
        }
        realContactBook$latestRowId$1 = new RealContactBook$latestRowId$1(this, continuationImpl);
        Object obj2 = realContactBook$latestRowId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realContactBook$latestRowId$1.label;
        if (i != 0) {
        }
        return (Long) obj2;
    }
}
