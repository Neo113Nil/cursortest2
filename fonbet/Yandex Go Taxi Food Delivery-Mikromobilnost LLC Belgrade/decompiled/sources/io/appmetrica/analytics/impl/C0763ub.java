package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.UserInfo;
import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.Pair;

/* renamed from: io.appmetrica.analytics.impl.ub, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0763ub implements ModuleServiceEventHandler {
    public final Dr a = new Dr();
    public final Br b = new Br();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler
    public final boolean handle(ModuleEventServiceHandlerContext moduleEventServiceHandlerContext, CounterReportApi counterReportApi) {
        this.a.getClass();
        UserInfo a = Dr.a(moduleEventServiceHandlerContext);
        if (TextUtils.isEmpty(a.getUserId())) {
            return false;
        }
        Pair pair = new Pair("ai", MessageNano.toByteArray(this.b.a.a.fromModel(a)));
        counterReportApi.getExtras().put(pair.c(), pair.f());
        return false;
    }
}
