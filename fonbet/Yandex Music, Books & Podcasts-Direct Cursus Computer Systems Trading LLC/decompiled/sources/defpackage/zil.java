package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class zil {
    public static final zil f = new zil(null, "", zlb.Unknown, ylb.Device, hmb.OwnSpeaker);
    public final mwk a;
    public final String b;
    public final zlb c;
    public final ylb d;
    public final hmb e;

    public zil(mwk mwkVar, String str, zlb zlbVar, ylb ylbVar, hmb hmbVar) {
        str.getClass();
        zlbVar.getClass();
        ylbVar.getClass();
        this.a = mwkVar;
        this.b = str;
        this.c = zlbVar;
        this.d = ylbVar;
        this.e = hmbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zil)) {
            return false;
        }
        zil zilVar = (zil) obj;
        return Intrinsics.d(this.a, zilVar.a) && Intrinsics.d(this.b, zilVar.b) && this.c == zilVar.c && this.d == zilVar.d && this.e == zilVar.e;
    }

    public final int hashCode() {
        mwk mwkVar = this.a;
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + k5r.c((mwkVar == null ? 0 : mwkVar.hashCode()) * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        return "PlayerScreenAnalyticsQueueState(playable=" + this.a + ", mainObjectId=" + this.b + ", queueType=" + this.c + ", queueSource=" + this.d + ", targetDevice=" + this.e + ")";
    }
}
