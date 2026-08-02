package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.UserInfo;
import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.kb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0400kb implements ModuleServiceEventHandler {
    public final C0416kr a = new C0416kr();
    public final C0358ir b = new C0358ir();

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler
    public final boolean handle(@NotNull ModuleEventServiceHandlerContext moduleEventServiceHandlerContext, @NotNull CounterReportApi counterReportApi) {
        this.a.getClass();
        UserInfo a = C0416kr.a(moduleEventServiceHandlerContext);
        if (TextUtils.isEmpty(a.getUserId())) {
            return false;
        }
        counterReportApi.getExtras().put("ai", MessageNano.toByteArray(this.b.a.a.fromModel(a)));
        return false;
    }
}
