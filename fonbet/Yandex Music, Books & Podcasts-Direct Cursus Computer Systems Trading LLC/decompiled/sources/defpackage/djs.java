package defpackage;

import ru.yandex.video.m3.player.ui.debug.model.SessionColor;

/* loaded from: classes6.dex */
public final class djs {
    public final zmf a;
    public final String b;
    public final Long c;
    public final SessionColor d;

    public djs(zmf zmfVar, String str, Long l, SessionColor sessionColor) {
        sessionColor.getClass();
        this.a = zmfVar;
        this.b = str;
        this.c = l;
        this.d = sessionColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djs)) {
            return false;
        }
        djs djsVar = (djs) obj;
        return this.a.equals(djsVar.a) && this.b.equals(djsVar.b) && this.c.equals(djsVar.c) && this.d == djsVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "TimerData(latencyData=" + this.a + ", dateTime=" + this.b + ", targetBufferSize=" + this.c + ", sessionColor=" + this.d + ')';
    }
}
