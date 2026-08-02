package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class o46 {
    public final Context a;
    public final String b;
    public final String c;
    public final List d;

    public o46(Context context, String str, String str2, List list) {
        context.getClass();
        list.getClass();
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o46)) {
            return false;
        }
        o46 o46Var = (o46) obj;
        return Intrinsics.d(this.a, o46Var.a) && this.b.equals(o46Var.b) && this.c.equals(o46Var.c) && Intrinsics.d(this.d, o46Var.d);
    }

    public final int hashCode() {
        return k5r.d(k5r.c((((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + 637457331) * 31, 31, this.c), 29791, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Config(context=");
        sb.append(this.a);
        sb.append(", listSdkVsid=");
        sb.append(this.b);
        sb.append(", from=ru.yandex.music, deviceId=");
        sb.append(this.c);
        sb.append(", testIds=");
        return vz1.u(sb, this.d, ", yandexUid=null, strmTrackingUrl=null, perfTrackingUrl=null)");
    }
}
