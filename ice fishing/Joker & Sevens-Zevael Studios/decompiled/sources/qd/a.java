package qd;

import com.onesignal.inAppMessages.internal.display.impl.n;
import java.io.Serializable;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements Serializable {

    /* renamed from: g, reason: collision with root package name */
    public final l f5820g;

    /* renamed from: h, reason: collision with root package name */
    public final long f5821h;

    /* renamed from: i, reason: collision with root package name */
    public final long f5822i;

    public a(l lVar, long j3, long j6) {
        pc.j.e(lVar, n.EVENT_TYPE_KEY);
        this.f5820g = lVar;
        this.f5821h = j3;
        this.f5822i = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f5820g == aVar.f5820g && this.f5821h == aVar.f5821h && this.f5822i == aVar.f5822i;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5822i) + a4.d.c(this.f5820g.hashCode() * 31, 31, this.f5821h);
    }

    public final String toString() {
        return "ActivePowerUp(type=" + this.f5820g + ", startTime=" + this.f5821h + ", durationMillis=" + this.f5822i + ")";
    }
}
