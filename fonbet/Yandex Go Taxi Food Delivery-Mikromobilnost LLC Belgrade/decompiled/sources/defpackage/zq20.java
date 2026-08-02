package defpackage;

import com.yandex.mob.model.MobRemoteNotificationCommand;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lzq20;", "", "Companion", "xq20", "yq20", "core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class zq20 {
    public static final yq20 Companion = new yq20();
    public static final i3y[] c;
    public final MobRemoteNotificationCommand a;
    public final List b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{a.b(lazyThreadSafetyMode, new sq20(2)), a.b(lazyThreadSafetyMode, new sq20(3))};
    }

    public /* synthetic */ zq20(int i, MobRemoteNotificationCommand mobRemoteNotificationCommand, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = mobRemoteNotificationCommand;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zq20)) {
            return false;
        }
        zq20 zq20Var = (zq20) obj;
        return this.a == zq20Var.a && jl40.l(this.b, zq20Var.b);
    }

    public final int hashCode() {
        MobRemoteNotificationCommand mobRemoteNotificationCommand = this.a;
        int hashCode = (mobRemoteNotificationCommand == null ? 0 : mobRemoteNotificationCommand.hashCode()) * 31;
        List list = this.b;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "MobRemoteNotificationPayload(action=" + this.a + ", proxyList=" + this.b + Extension.C_BRAKE;
    }

    public zq20() {
        this.a = null;
        this.b = null;
    }
}
