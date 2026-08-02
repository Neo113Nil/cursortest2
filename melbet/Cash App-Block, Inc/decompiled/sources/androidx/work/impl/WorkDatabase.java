package androidx.work.impl;

import androidx.room.RoomDatabase;
import androidx.work.impl.model.DependencyDao_Impl;
import androidx.work.impl.model.PreferenceDao_Impl;
import androidx.work.impl.model.SystemIdInfoDao_Impl;
import androidx.work.impl.model.WorkNameDao_Impl;
import androidx.work.impl.model.WorkProgressDao_Impl;
import androidx.work.impl.model.WorkSpecDao_Impl;
import androidx.work.impl.model.WorkTagDao_Impl;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class WorkDatabase extends RoomDatabase {
    public abstract DependencyDao_Impl dependencyDao();

    public abstract PreferenceDao_Impl preferenceDao();

    public abstract SystemIdInfoDao_Impl systemIdInfoDao();

    public abstract WorkNameDao_Impl workNameDao();

    public abstract WorkProgressDao_Impl workProgressDao();

    public abstract WorkSpecDao_Impl workSpecDao();

    public abstract WorkTagDao_Impl workTagDao();
}
