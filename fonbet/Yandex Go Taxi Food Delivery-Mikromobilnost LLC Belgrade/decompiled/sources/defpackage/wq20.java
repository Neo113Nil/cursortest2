package defpackage;

import com.yandex.mob.params.MobRemoteNotificationStatus;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes15.dex */
public final class wq20 {
    public static final vq20 Companion = new vq20();
    public static final i3y[] d = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new sq20(1))};
    public final String a;
    public final String b;
    public final MobRemoteNotificationStatus c;

    public /* synthetic */ wq20(int i, String str, String str2, MobRemoteNotificationStatus mobRemoteNotificationStatus) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, uq20.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = mobRemoteNotificationStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wq20)) {
            return false;
        }
        wq20 wq20Var = (wq20) obj;
        return jl40.l(this.a, wq20Var.a) && jl40.l(this.b, wq20Var.b) && this.c == wq20Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("MobRemoteNotificationNotifyParams(pushId=", this.a, ", clientTime=", this.b, ", status=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public wq20(String str, String str2, MobRemoteNotificationStatus mobRemoteNotificationStatus) {
        this.a = str;
        this.b = str2;
        this.c = mobRemoteNotificationStatus;
    }
}
