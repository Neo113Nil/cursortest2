package defpackage;

import com.yandex.plus.home.plaque.repository.graphql.cache.dto.NotificationDto$Position;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class qh60 implements rh60 {
    public static final ph60 Companion = new ph60();
    public static final i3y[] c = {a.b(LazyThreadSafetyMode.PUBLICATION, new ew50(29)), null};
    public final NotificationDto$Position a;
    public final String b;

    public /* synthetic */ qh60(int i, NotificationDto$Position notificationDto$Position, String str) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, oh60.a.getDescriptor());
            throw null;
        }
        this.a = notificationDto$Position;
        this.b = str;
    }

    public final NotificationDto$Position a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh60)) {
            return false;
        }
        qh60 qh60Var = (qh60) obj;
        return this.a == qh60Var.a && jl40.l(this.b, qh60Var.b);
    }

    public final int hashCode() {
        NotificationDto$Position notificationDto$Position = this.a;
        return this.b.hashCode() + ((notificationDto$Position == null ? 0 : notificationDto$Position.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Icon(position=");
        sb.append(this.a);
        sb.append(", url=");
        return b64.p(sb, this.b, ')');
    }

    public qh60(NotificationDto$Position notificationDto$Position, String str) {
        this.a = notificationDto$Position;
        this.b = str;
    }
}
