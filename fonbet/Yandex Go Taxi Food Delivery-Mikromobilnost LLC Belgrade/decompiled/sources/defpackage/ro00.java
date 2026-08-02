package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.map_common.map.intersection.Participant;

/* loaded from: classes6.dex */
public final class ro00 {
    public static final ro00 d = new ro00("", Participant.NONE, null);
    public final String a;
    public final Participant b;
    public final sfr c;

    public ro00(String str, Participant participant, sfr sfrVar) {
        this.a = str;
        this.b = participant;
        this.c = sfrVar;
    }

    public final sfr a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final Participant c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ro00.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ro00 ro00Var = (ro00) obj;
        return jl40.l(this.a, ro00Var.a) && this.b == ro00Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MapObjectSpace(id='" + this.a + "', participant=" + this.b + Extension.C_BRAKE;
    }

    public /* synthetic */ ro00(String str, Participant participant) {
        this(str, participant, null);
    }
}
