package defpackage;

import com.yandex.messaging.auth.AuthEnvironment;

/* loaded from: classes15.dex */
public final class xm3 extends cn3 {
    public final boolean equals(Object obj) {
        return obj instanceof cn3 ? ((cn3) obj) instanceof xm3 : this == obj;
    }

    @Override // defpackage.cn3
    public final cn3 h(String str, AuthEnvironment authEnvironment) {
        return cn3.g(str, authEnvironment);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "No header";
    }
}
