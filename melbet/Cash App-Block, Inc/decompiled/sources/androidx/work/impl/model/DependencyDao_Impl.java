package androidx.work.impl.model;

import androidx.compose.foundation.ImageKt$$ExternalSyntheticLambda0;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.work.impl.model.WorkTagDao_Impl;
import java.util.List;

/* loaded from: classes.dex */
public final class DependencyDao_Impl {
    public final RoomDatabase __db;
    public final WorkTagDao_Impl.AnonymousClass1 __insertAdapterOfDependency = new WorkTagDao_Impl.AnonymousClass1(1);

    public DependencyDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
    }

    public final List getDependentWorkIds(String str) {
        str.getClass();
        return (List) DBUtil.performBlocking(this.__db, true, false, new ImageKt$$ExternalSyntheticLambda0(str, 1));
    }
}
