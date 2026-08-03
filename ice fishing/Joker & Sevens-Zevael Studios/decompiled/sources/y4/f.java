package y4;

import androidx.work.impl.WorkDatabase;
import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase f8748a;

    public f(WorkDatabase workDatabase, int i10) {
        switch (i10) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                this.f8748a = workDatabase;
                break;
            default:
                pc.j.e(workDatabase, "workDatabase");
                this.f8748a = workDatabase;
                break;
        }
    }
}
