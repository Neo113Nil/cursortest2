package com.squareup.cash.notification.photo;

import bo.app.a$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.internal.Factory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class NotificationPhotoLookupKeyRegistry {
    public final ArrayList activeProviders = new ArrayList();

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new NotificationPhotoLookupKeyRegistry();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007e -> B:10:0x0084). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getValidLookupKeys(String str, ContinuationImpl continuationImpl) {
        NotificationPhotoLookupKeyRegistry$getValidLookupKeys$1 notificationPhotoLookupKeyRegistry$getValidLookupKeys$1;
        int i;
        int i2;
        Iterator it;
        ArrayList arrayList;
        int i3;
        int i4;
        if (continuationImpl instanceof NotificationPhotoLookupKeyRegistry$getValidLookupKeys$1) {
            notificationPhotoLookupKeyRegistry$getValidLookupKeys$1 = (NotificationPhotoLookupKeyRegistry$getValidLookupKeys$1) continuationImpl;
            int i5 = notificationPhotoLookupKeyRegistry$getValidLookupKeys$1.label;
            if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                notificationPhotoLookupKeyRegistry$getValidLookupKeys$1.label = i5 - PKIFailureInfo.systemUnavail;
                Object obj = notificationPhotoLookupKeyRegistry$getValidLookupKeys$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = notificationPhotoLookupKeyRegistry$getValidLookupKeys$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    List list = CollectionsKt.toList(this.activeProviders);
                    ArrayList arrayList2 = new ArrayList();
                    i2 = 0;
                    it = list.iterator();
                    arrayList = arrayList2;
                    i3 = 0;
                    i4 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = notificationPhotoLookupKeyRegistry$getValidLookupKeys$1.I$2;
                    int i6 = notificationPhotoLookupKeyRegistry$getValidLookupKeys$1.I$1;
                    int i7 = notificationPhotoLookupKeyRegistry$getValidLookupKeys$1.I$0;
                    Iterator it2 = notificationPhotoLookupKeyRegistry$getValidLookupKeys$1.L$5;
                    Collection collection = notificationPhotoLookupKeyRegistry$getValidLookupKeys$1.L$3;
                    String str2 = notificationPhotoLookupKeyRegistry$getValidLookupKeys$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    int i8 = i6;
                    str = str2;
                    ArrayList arrayList3 = collection;
                    Iterator it3 = it2;
                    String str3 = (String) obj;
                    if (str3 != null) {
                        arrayList3.add(str3);
                    }
                    i4 = i7;
                    i2 = i8;
                    it = it3;
                    arrayList = arrayList3;
                    if (it.hasNext()) {
                        NotificationPhotoLookupKeyProvider notificationPhotoLookupKeyProvider = (NotificationPhotoLookupKeyProvider) it.next();
                        notificationPhotoLookupKeyRegistry$getValidLookupKeys$1.L$0 = str;
                        notificationPhotoLookupKeyRegistry$getValidLookupKeys$1.L$3 = arrayList;
                        notificationPhotoLookupKeyRegistry$getValidLookupKeys$1.L$5 = it;
                        notificationPhotoLookupKeyRegistry$getValidLookupKeys$1.I$0 = i4;
                        notificationPhotoLookupKeyRegistry$getValidLookupKeys$1.I$1 = i2;
                        notificationPhotoLookupKeyRegistry$getValidLookupKeys$1.I$2 = i3;
                        notificationPhotoLookupKeyRegistry$getValidLookupKeys$1.label = 1;
                        Object lookupKey = notificationPhotoLookupKeyProvider.getLookupKey(str, notificationPhotoLookupKeyRegistry$getValidLookupKeys$1);
                        if (lookupKey == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        int i9 = i2;
                        i7 = i4;
                        obj = lookupKey;
                        arrayList3 = arrayList;
                        it3 = it;
                        i8 = i9;
                        String str32 = (String) obj;
                        if (str32 != null) {
                        }
                        i4 = i7;
                        i2 = i8;
                        it = it3;
                        arrayList = arrayList3;
                        if (it.hasNext()) {
                            return arrayList;
                        }
                    }
                }
            }
        }
        notificationPhotoLookupKeyRegistry$getValidLookupKeys$1 = new NotificationPhotoLookupKeyRegistry$getValidLookupKeys$1(this, continuationImpl);
        Object obj2 = notificationPhotoLookupKeyRegistry$getValidLookupKeys$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = notificationPhotoLookupKeyRegistry$getValidLookupKeys$1.label;
        if (i != 0) {
        }
    }
}
