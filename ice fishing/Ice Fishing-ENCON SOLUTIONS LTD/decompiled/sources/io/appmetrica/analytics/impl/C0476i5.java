package io.appmetrica.analytics.impl;

import i1.AbstractC0252i;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.i5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0476i5 implements ModuleAdRevenueProcessor, ModuleAdRevenueProcessorsHolder {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6165a = new ArrayList();

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final String getDescription() {
        return AbstractC0252i.K(this.f6165a, null, "Composite processor with " + this.f6165a.size() + " children: [", "]", C0450h5.f6118a, 25);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(Object... objArr) {
        Object obj;
        boolean process;
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Processing Ad Revenue for " + Arrays.toString(objArr), new Object[0]);
        Iterator it = this.f6165a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ModuleAdRevenueProcessor moduleAdRevenueProcessor = (ModuleAdRevenueProcessor) obj;
            try {
                process = moduleAdRevenueProcessor.process(Arrays.copyOf(objArr, objArr.length));
                if (!process) {
                    LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue was not processed by " + moduleAdRevenueProcessor.getDescription(), new Object[0]);
                }
            } catch (Throwable th) {
                LoggerStorage.getMainPublicOrAnonymousLogger().error(th, "Got exception from processor " + moduleAdRevenueProcessor.getDescription(), new Object[0]);
            }
            if (process) {
                break;
            }
        }
        boolean z2 = ((ModuleAdRevenueProcessor) obj) != null;
        if (!z2) {
            LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue was not processed by " + getDescription() + " since processor for " + Arrays.toString(objArr) + " was not found", new Object[0]);
        }
        return z2;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder
    public final void register(ModuleAdRevenueProcessor moduleAdRevenueProcessor) {
        this.f6165a.add(moduleAdRevenueProcessor);
    }
}
