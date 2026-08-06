package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j implements BillingInfoSender {

    /* renamed from: a, reason: collision with root package name */
    public final ServiceComponentModuleReporter f3556a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f3557b;

    /* renamed from: c, reason: collision with root package name */
    public final o f3558c;

    public j(ServiceComponentModuleReporter serviceComponentModuleReporter, Executor executor, o oVar) {
        this.f3556a = serviceComponentModuleReporter;
        this.f3557b = executor;
        this.f3558c = oVar;
    }

    public static final void a(j jVar, ProductInfo productInfo) {
        ServiceComponentModuleReporter serviceComponentModuleReporter = jVar.f3556a;
        ServiceModuleCounterReport.Builder withType = ServiceModuleCounterReport.Companion.newBuilder().withType(40976);
        jVar.f3558c.getClass();
        serviceComponentModuleReporter.handleReport(withType.withValueBytes(o.a(productInfo)).build());
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender
    public final void sendInfo(List<? extends ProductInfo> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.f3557b.execute(new F0.c(1, this, (ProductInfo) it.next()));
        }
    }

    public /* synthetic */ j(ServiceComponentModuleReporter serviceComponentModuleReporter, Executor executor, o oVar, int i2, kotlin.jvm.internal.e eVar) {
        this(serviceComponentModuleReporter, executor, (i2 & 4) != 0 ? new o() : oVar);
    }
}
