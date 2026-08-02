package defpackage;

import com.yandex.plus.core.graphql.type.PLAQUE_ACTION_PERFORM_STATUS;

/* loaded from: classes2.dex */
public final class toc0 implements za70 {
    public final PLAQUE_ACTION_PERFORM_STATUS a;

    public toc0(PLAQUE_ACTION_PERFORM_STATUS plaque_action_perform_status) {
        this.a = plaque_action_perform_status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof toc0) && this.a == ((toc0) obj).a;
    }

    public final int hashCode() {
        PLAQUE_ACTION_PERFORM_STATUS plaque_action_perform_status = this.a;
        if (plaque_action_perform_status == null) {
            return 0;
        }
        return plaque_action_perform_status.hashCode();
    }

    public final String toString() {
        return "Data(plaquePerformAction=" + this.a + ')';
    }
}
