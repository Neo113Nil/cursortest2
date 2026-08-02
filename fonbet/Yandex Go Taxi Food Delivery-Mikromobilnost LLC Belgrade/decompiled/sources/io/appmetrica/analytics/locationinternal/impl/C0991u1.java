package io.appmetrica.analytics.locationinternal.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.io.GZIPCompressor;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.networktasks.internal.ConfigProvider;
import io.appmetrica.analytics.networktasks.internal.DefaultNetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.appmetrica.analytics.networktasks.internal.SendingDataTaskHelper;
import io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.u1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0991u1 implements UnderlyingNetworkTask {
    public final ServiceContext a;
    public final C0962k1 b;
    public final ModulePreferences c;
    public final C0997w1 d;
    public final E1 e;
    public final C1000x1 f;
    public final FullUrlFormer g;
    public final ConfigProvider h;
    public final RequestDataHolder i;
    public final ResponseDataHolder j;
    public final SendingDataTaskHelper k;
    public long l;
    public C0994v1 m;

    public C0991u1(ServiceContext serviceContext, C0948g c0948g, C0948g c0948g2, ModulePreferences modulePreferences, E1 e1, C1000x1 c1000x1, ConfigProvider<C0936c2> configProvider, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, FullUrlFormer<C0936c2> fullUrlFormer, RequestBodyEncrypter requestBodyEncrypter) {
        this(serviceContext, e1, modulePreferences, c1000x1, new C0997w1(serviceContext.getContext(), c0948g, c0948g2), fullUrlFormer, requestDataHolder, responseDataHolder, configProvider, new SendingDataTaskHelper(requestBodyEncrypter, new GZIPCompressor(), requestDataHolder, responseDataHolder, new DefaultNetworkResponseHandler()));
    }

    public final void a() {
        long j = this.c.getLong("loc_req_id", -1L) + 1;
        this.l = j;
        this.f.d = j;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final String description() {
        return "LocationTask";
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.g;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RequestDataHolder getRequestDataHolder() {
        return this.i;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final ResponseDataHolder getResponseDataHolder() {
        return this.j;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((C0936c2) this.h.getConfig()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final SSLSocketFactory getSslSocketFactory() {
        return this.a.getNetworkContext().getSslSocketFactoryProvider().getSslSocketFactory();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7 A[SYNTHETIC] */
    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onCreateTask() {
        List<String> allHosts;
        F0 a;
        C0977p1 a2;
        C0936c2 c0936c2 = (C0936c2) this.h.getConfig();
        if (this.a.getDataSendingRestrictionController().isRestrictedForSdk() || TextUtils.isEmpty(c0936c2.getDeviceId()) || TextUtils.isEmpty(c0936c2.getUuid()) || (allHosts = this.g.getAllHosts()) == null || allHosts.isEmpty()) {
            return false;
        }
        C0997w1 c0997w1 = this.d;
        int i = this.b.b;
        LinkedHashMap a3 = c0997w1.a.a(i);
        LinkedHashMap a4 = c0997w1.b.a(i);
        C0982r1 c0982r1 = new C0982r1();
        ArrayList arrayList = new ArrayList();
        Iterator it = a3.entrySet().iterator();
        while (true) {
            C0980q1 c0980q1 = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            C0968m1 c0968m1 = c0997w1.c;
            long longValue = ((Long) entry.getKey()).longValue();
            String str = (String) entry.getValue();
            c0968m1.getClass();
            if (!TextUtils.isEmpty(str)) {
                try {
                    F1 b = c0968m1.a.b(longValue, str);
                    if (b != null) {
                        c0980q1 = c0968m1.b.a(b);
                    }
                } catch (Exception unused) {
                }
            }
            if (c0980q1 != null) {
                arrayList.add(c0980q1);
            }
        }
        c0982r1.a = (C0980q1[]) arrayList.toArray(new C0980q1[arrayList.size()]);
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry2 : a4.entrySet()) {
            C0996w0 c0996w0 = c0997w1.d;
            long longValue2 = ((Long) entry2.getKey()).longValue();
            String str2 = (String) entry2.getValue();
            c0996w0.getClass();
            if (!TextUtils.isEmpty(str2)) {
                try {
                    a = c0996w0.a.a(longValue2, str2);
                } catch (Exception unused2) {
                }
                if (a != null) {
                    a2 = c0996w0.b.a(a);
                    if (a2 == null) {
                        arrayList2.add(a2);
                    }
                }
            }
            a2 = null;
            if (a2 == null) {
            }
        }
        c0982r1.b = (C0977p1[]) arrayList2.toArray(new C0977p1[arrayList2.size()]);
        this.m = new C0994v1(a3.isEmpty() ? -1L : ((Long) Collections.max(a3.keySet())).longValue(), a4.isEmpty() ? -1L : ((Long) Collections.max(a4.keySet())).longValue(), c0982r1);
        if (c0982r1.b.length == 0 && c0982r1.a.length == 0) {
            return false;
        }
        return this.k.prepareAndSetPostData(MessageNano.toByteArray(c0982r1));
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
        this.k.onPerformRequest();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z) {
        if (z || this.j.getResponseCode() == 400) {
            C0997w1 c0997w1 = this.d;
            C0994v1 c0994v1 = this.m;
            c0997w1.getClass();
            long j = c0994v1.a;
            if (j >= 0) {
                c0997w1.a.a(j);
            }
            long j2 = c0994v1.b;
            if (j2 >= 0) {
                c0997w1.b.a(j2);
            }
        }
        this.c.putLong("loc_req_id", this.l);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        return this.k.isResponseValid();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(Throwable th) {
        this.c.putLong("loc_req_id", this.l);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        this.e.b();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskAdded() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskFinished() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskRemoved() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onUnsuccessfulTaskFinished() {
    }

    public C0991u1(ServiceContext serviceContext, E1 e1, ModulePreferences modulePreferences, C1000x1 c1000x1, C0997w1 c0997w1, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, ConfigProvider configProvider, SendingDataTaskHelper sendingDataTaskHelper) {
        this.a = serviceContext;
        this.k = sendingDataTaskHelper;
        this.e = e1;
        this.h = configProvider;
        C0936c2 c0936c2 = (C0936c2) configProvider.getConfig();
        this.b = c0936c2.a();
        this.c = modulePreferences;
        this.d = c0997w1;
        this.f = c1000x1;
        this.i = requestDataHolder;
        this.j = responseDataHolder;
        this.g = fullUrlFormer;
        a();
        fullUrlFormer.setHosts(c0936c2.b());
    }
}
