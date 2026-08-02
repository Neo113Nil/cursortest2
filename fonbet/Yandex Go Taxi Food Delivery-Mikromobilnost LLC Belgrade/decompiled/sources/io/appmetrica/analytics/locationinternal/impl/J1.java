package io.appmetrica.analytics.locationinternal.impl;

import defpackage.scc;
import io.appmetrica.analytics.modulesapi.internal.common.TableDescription;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import java.util.List;

/* loaded from: classes9.dex */
public final class J1 extends ModuleServicesDatabase {
    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase
    public final List<TableDescription> getTables() {
        return scc.g(new H1(), new I1());
    }
}
