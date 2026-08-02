package androidx.work;

import androidx.work.impl.model.WorkSpec;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public final class OneTimeWorkRequest {
    public final UUID id;
    public final Set tags;
    public final WorkSpec workSpec;

    public OneTimeWorkRequest(UUID uuid, WorkSpec workSpec, Set set) {
        uuid.getClass();
        workSpec.getClass();
        set.getClass();
        this.id = uuid;
        this.workSpec = workSpec;
        this.tags = set;
    }
}
