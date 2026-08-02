package ru.yandex.taxi.communications.api.dto.ticket;

import defpackage.g3z0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.qje;
import defpackage.x1z0;
import kotlin.LazyThreadSafetyMode;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.communications.api.dto.ticket.TicketTopAsset;

@gsq0
/* loaded from: classes5.dex */
public final class h {
    public static final g3z0 Companion = new g3z0();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new x1z0(6)), null};
    public final TicketTopAsset.TicketTopAssetReplayMode a;
    public final Integer b;

    public /* synthetic */ h(int i, TicketTopAsset.TicketTopAssetReplayMode ticketTopAssetReplayMode, Integer num) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, g.a.getDescriptor());
            throw null;
        }
        this.a = ticketTopAssetReplayMode;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && jl40.l(this.b, hVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "TicketTopAssetReplayConfig(type=" + this.a + ", count=" + this.b + Extension.C_BRAKE;
    }
}
