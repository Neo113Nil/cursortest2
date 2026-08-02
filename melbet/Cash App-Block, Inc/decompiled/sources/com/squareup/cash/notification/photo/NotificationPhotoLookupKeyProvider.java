package com.squareup.cash.notification.photo;

import androidx.room.util.DBUtil;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.data.contacts.RealContactRepository;
import com.squareup.cash.db2.contacts.ContactQueries;
import com.squareup.cash.db2.contacts.ContactQueries$$ExternalSyntheticLambda1;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class NotificationPhotoLookupKeyProvider {
    public final RealContactRepository contactRepository;

    public NotificationPhotoLookupKeyProvider(RealContactRepository realContactRepository) {
        this.contactRepository = realContactRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getLookupKey(String str, ContinuationImpl continuationImpl) {
        NotificationPhotoLookupKeyProvider$getLookupKey$1 notificationPhotoLookupKeyProvider$getLookupKey$1;
        int i;
        List list;
        if (continuationImpl instanceof NotificationPhotoLookupKeyProvider$getLookupKey$1) {
            notificationPhotoLookupKeyProvider$getLookupKey$1 = (NotificationPhotoLookupKeyProvider$getLookupKey$1) continuationImpl;
            int i2 = notificationPhotoLookupKeyProvider$getLookupKey$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                notificationPhotoLookupKeyProvider$getLookupKey$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = notificationPhotoLookupKeyProvider$getLookupKey$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = notificationPhotoLookupKeyProvider$getLookupKey$1.label;
                int i3 = 1;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealContactRepository realContactRepository = this.contactRepository;
                    str.getClass();
                    ContactQueries contactQueries = realContactRepository.contactQueries;
                    contactQueries.getClass();
                    FlowQuery$mapToList$$inlined$map$1 mapToList = DBUtil.mapToList(DBUtil.toFlow(new ContactQueries.ContactByIdQuery(contactQueries, str, new ContactQueries$$ExternalSyntheticLambda1(5), i3)), realContactRepository.ioDispatcher);
                    notificationPhotoLookupKeyProvider$getLookupKey$1.label = 1;
                    obj = FlowKt.firstOrNull(mapToList, notificationPhotoLookupKeyProvider$getLookupKey$1);
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
                list = (List) obj;
                if (list == null) {
                    return (String) CollectionsKt.singleOrNull(list);
                }
                return null;
            }
        }
        notificationPhotoLookupKeyProvider$getLookupKey$1 = new NotificationPhotoLookupKeyProvider$getLookupKey$1(this, continuationImpl);
        Object obj2 = notificationPhotoLookupKeyProvider$getLookupKey$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = notificationPhotoLookupKeyProvider$getLookupKey$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        list = (List) obj2;
        if (list == null) {
        }
    }
}
