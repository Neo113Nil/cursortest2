package io.appmetrica.analytics.locationinternal.impl;

import defpackage.u75;
import io.appmetrica.analytics.modulesapi.internal.common.TableDescription;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class J1 extends ModuleServicesDatabase {
    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase
    @NotNull
    public final List<TableDescription> getTables() {
        return u75.h(new H1(), new I1());
    }
}
