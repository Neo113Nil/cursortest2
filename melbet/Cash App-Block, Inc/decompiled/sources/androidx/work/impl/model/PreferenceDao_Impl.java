package androidx.work.impl.model;

import androidx.compose.foundation.ImageKt$$ExternalSyntheticLambda0;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.work.impl.model.WorkTagDao_Impl;

/* loaded from: classes.dex */
public final class PreferenceDao_Impl {
    public final RoomDatabase __db;
    public final WorkTagDao_Impl.AnonymousClass1 __insertAdapterOfPreference = new WorkTagDao_Impl.AnonymousClass1(2);

    public PreferenceDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
    }

    public final Long getLongValue(String str) {
        return (Long) DBUtil.performBlocking(this.__db, true, false, new ImageKt$$ExternalSyntheticLambda0(str, 2));
    }
}
