package ru.yandex.taxi.logistics.sdk.management.storage;

import android.content.Context;
import defpackage.ceu0;
import defpackage.dxf0;
import defpackage.jl40;
import defpackage.kme0;
import defpackage.mme0;
import defpackage.ny61;
import defpackage.rle0;
import defpackage.tpr;
import defpackage.v601;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class f {
    public static final v601 c = new v601();
    public static final rle0 d = jl40.I("tracking_on_first_load_actions", new dxf0(new ceu0(12)), null, null, 12);
    public final Context a;
    public final kme0 b = new kme0("completed_actions_key");

    public f(Context context) {
        this.a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        TrackingOnFirstLoadActionDataStoreImpl$areActionsCompleted$1 trackingOnFirstLoadActionDataStoreImpl$areActionsCompleted$1;
        int i;
        if (continuationImpl instanceof TrackingOnFirstLoadActionDataStoreImpl$areActionsCompleted$1) {
            trackingOnFirstLoadActionDataStoreImpl$areActionsCompleted$1 = (TrackingOnFirstLoadActionDataStoreImpl$areActionsCompleted$1) continuationImpl;
            int i2 = trackingOnFirstLoadActionDataStoreImpl$areActionsCompleted$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackingOnFirstLoadActionDataStoreImpl$areActionsCompleted$1.label = i2 - Integer.MIN_VALUE;
                Object obj = trackingOnFirstLoadActionDataStoreImpl$areActionsCompleted$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trackingOnFirstLoadActionDataStoreImpl$areActionsCompleted$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr data = v601.a(c, this.a).getData();
                    trackingOnFirstLoadActionDataStoreImpl$areActionsCompleted$1.L$0 = str;
                    trackingOnFirstLoadActionDataStoreImpl$areActionsCompleted$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(data, trackingOnFirstLoadActionDataStoreImpl$areActionsCompleted$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) trackingOnFirstLoadActionDataStoreImpl$areActionsCompleted$1.L$0;
                    kotlin.b.b(obj);
                }
                Set set = (Set) ((mme0) obj).c(this.b);
                return Boolean.valueOf(set == null ? set.contains(str) : false);
            }
        }
        trackingOnFirstLoadActionDataStoreImpl$areActionsCompleted$1 = new TrackingOnFirstLoadActionDataStoreImpl$areActionsCompleted$1(this, continuationImpl);
        Object obj2 = trackingOnFirstLoadActionDataStoreImpl$areActionsCompleted$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingOnFirstLoadActionDataStoreImpl$areActionsCompleted$1.label;
        if (i != 0) {
        }
        Set set2 = (Set) ((mme0) obj2).c(this.b);
        return Boolean.valueOf(set2 == null ? set2.contains(str) : false);
    }

    public final Object b(ArrayList arrayList, Continuation continuation) {
        Object a = androidx.datastore.preferences.core.b.a(v601.a(c, this.a), new TrackingOnFirstLoadActionDataStoreImpl$deleteNonActualDeliveryIds$2(this, arrayList, null), continuation);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }

    public final Object c(String str, Continuation continuation) {
        Object a = androidx.datastore.preferences.core.b.a(v601.a(c, this.a), new TrackingOnFirstLoadActionDataStoreImpl$onActionsCompleted$2(this, str, null), continuation);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }
}
