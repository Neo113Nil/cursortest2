package ru.yandex.taxi.experiments.storage;

import androidx.room.d;
import defpackage.gku0;
import defpackage.i3y;
import defpackage.mku0;
import defpackage.p2l;
import defpackage.qhq0;
import defpackage.qoi0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/experiments/storage/StoredExperimentsDatabase_Impl;", "Lru/yandex/taxi/experiments/storage/StoredExperimentsDatabase;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class StoredExperimentsDatabase_Impl extends StoredExperimentsDatabase {
    public final i3y l = kotlin.a.a(new qhq0(16, this));

    @Override // androidx.room.RoomDatabase
    public final Set E0() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final LinkedHashMap G0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(qoi0.a(gku0.class), EmptyList.a);
        return linkedHashMap;
    }

    @Override // ru.yandex.taxi.experiments.storage.StoredExperimentsDatabase
    public final gku0 S0() {
        return (gku0) this.l.getValue();
    }

    @Override // androidx.room.RoomDatabase
    public final List x0(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    public final d y0() {
        return new d(this, new LinkedHashMap(), new LinkedHashMap(), "stored_experiments");
    }

    @Override // androidx.room.RoomDatabase
    public final p2l z0() {
        return new mku0(this);
    }
}
