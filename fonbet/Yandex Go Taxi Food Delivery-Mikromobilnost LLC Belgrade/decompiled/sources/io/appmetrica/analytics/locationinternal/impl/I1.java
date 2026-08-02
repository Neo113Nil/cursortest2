package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.modulesapi.internal.common.TableDescription;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class I1 implements TableDescription {
    public final String a = l2.a;
    public final String b = l2.b;
    public final List c = k2.a;
    public final Map d = kotlin.collections.b.f();

    @Override // io.appmetrica.analytics.modulesapi.internal.common.TableDescription
    public final List<String> getColumnNames() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.TableDescription
    public final String getCreateTableScript() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.TableDescription
    public final Map<Integer, DatabaseScript> getDatabaseProviderUpgradeScript() {
        return this.d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.TableDescription
    public final String getDropTableScript() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.TableDescription
    public final String getTableName() {
        return "lbs_dat";
    }
}
