package com.plaid.internal;

import android.os.Bundle;
import com.google.protobuf.Timestamp;
import com.plaid.internal.C0095a6;
import com.plaid.internal.H6;
import com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent;
import com.plaid.internal.core.protos.link.api.Mobile$MobileSDKPloggerLog;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.coroutines.scheduling.UnlimitedIoScheduler;

/* loaded from: classes5.dex */
public final class N6 {
    public final i8 a;
    public final String b;
    public final I c;
    public final CoroutineDispatcher d;
    public volatile String e;
    public volatile String f;
    public volatile String g;

    public N6(i8 i8Var, String str, I i) {
        i8Var.getClass();
        str.getClass();
        i.getClass();
        this.a = i8Var;
        this.b = str;
        this.c = i;
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        DefaultIoScheduler.INSTANCE.getClass();
        this.d = UnlimitedIoScheduler.INSTANCE.limitedParallelism(1);
    }

    public static final Workflow$LinkWorkflowEventRequest a(N6 n6, ArrayList arrayList, String str) {
        Mobile$MobileSDKPloggerLog.b bVar;
        n6.getClass();
        Mobile$MobileSDKPloggerLog.MobileSDKSession.a newBuilder = Mobile$MobileSDKPloggerLog.MobileSDKSession.newBuilder();
        String str2 = n6.f;
        if (str2 != null) {
            newBuilder.a(str2);
        }
        newBuilder.b(n6.b);
        newBuilder.c(str);
        String str3 = n6.g;
        if (str3 != null) {
            newBuilder.d(str3);
        }
        I i = n6.c;
        I5 i5 = i.a;
        Bundle bundle = i5.a.getPackageManager().getApplicationInfo(i5.a.getPackageName(), 128).metaData;
        String string2 = bundle != null ? bundle.getString("com.github.jorgefspereira.plaid_flutter.version") : null;
        I5 i52 = i.a;
        Bundle bundle2 = i52.a.getPackageManager().getApplicationInfo(i52.a.getPackageName(), 128).metaData;
        String string3 = bundle2 != null ? bundle2.getString("com.plaid.link.react_native") : null;
        newBuilder.a((string2 == null || StringsKt.isBlank(string2)) ? (string3 == null || StringsKt.isBlank(string3)) ? Mobile$MobileSDKPloggerLog.MobileSDKSession.b.CLIENT_TYPE_ANDROID : Mobile$MobileSDKPloggerLog.MobileSDKSession.b.CLIENT_TYPE_REACTNATIVEANDROID : Mobile$MobileSDKPloggerLog.MobileSDKSession.b.CLIENT_TYPE_FLUTTERANDROID);
        Mobile$MobileSDKPloggerLog.MobileSDKSession build = newBuilder.build();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            I6 i6 = (I6) it.next();
            Mobile$MobileSDKPloggerLog.a newBuilder2 = Mobile$MobileSDKPloggerLog.newBuilder();
            J6 j6 = i6.d;
            j6.getClass();
            int i2 = K6.a[j6.ordinal()];
            if (i2 == 1) {
                bVar = Mobile$MobileSDKPloggerLog.b.MOBILE_SDK_LOG_LEVEL_DEBUG;
            } else if (i2 == 2) {
                bVar = Mobile$MobileSDKPloggerLog.b.MOBILE_SDK_LOG_LEVEL_INFO;
            } else if (i2 == 3) {
                bVar = Mobile$MobileSDKPloggerLog.b.MOBILE_SDK_LOG_LEVEL_WARN;
            } else {
                if (i2 != 4) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                bVar = Mobile$MobileSDKPloggerLog.b.MOBILE_SDK_LOG_LEVEL_ERROR;
            }
            arrayList2.add(ClientEventOuterClass$ClientEvent.newBuilder().a(Timestamp.newBuilder().setSeconds(i6.b / 1000).setNanos((int) ((i6.b % 1000) * 1000000))).a(str).a(newBuilder2.a(bVar).a(i6.a).a(i6.c).a(build).build()).build());
        }
        Workflow$LinkWorkflowEventRequest build2 = Workflow$LinkWorkflowEventRequest.newBuilder().b(str).a(arrayList2).build();
        build2.getClass();
        return build2;
    }

    public final void a(String str) {
        if (this.e != null && !Intrinsics.areEqual(this.e, str)) {
            C0095a6.a.e(C0095a6.a, "RemoteLogSender: Link session ID is being changed from " + this.e + " to " + str);
        }
        this.e = str;
        C0095a6.a.a(C0095a6.a, "RemoteLogSender: link_session_id set: " + str);
    }

    public final void a(String str, String str2) {
        this.f = str;
        this.g = str2;
        C0095a6.a.a(C0095a6.a, "RemoteLogSender: session data set: linkOpenId=" + str + ", linkToken=" + str2);
    }

    public final Object a(ArrayList arrayList, H6.b bVar) {
        String str = this.e;
        if (str == null) {
            C0095a6.a.b(C0095a6.a, "RemoteLogSender: Cannot send events without link_session_id");
            return Unit.INSTANCE;
        }
        Object withContext = JobKt.withContext(this.d, new M6(this, arrayList, str, null), bVar);
        return withContext == CoroutineSingletons.COROUTINE_SUSPENDED ? withContext : Unit.INSTANCE;
    }
}
