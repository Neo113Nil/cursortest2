package defpackage;

import com.yandex.mobile.drive.sdk.full.GreenArea;
import com.yandex.mobile.drive.sdk.full.SessionState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class qfm {
    public final String a;
    public final Long b;
    public final Long c;
    public final SessionState d;
    public final GreenArea e;
    public final umt f;

    public qfm(String str, Long l, Long l2, SessionState sessionState, GreenArea greenArea, umt umtVar) {
        this.a = str;
        this.b = l;
        this.c = l2;
        this.d = sessionState;
        this.e = greenArea;
        this.f = umtVar;
    }

    public final SessionState a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qfm)) {
            return false;
        }
        qfm qfmVar = (qfm) obj;
        return this.a.equals(qfmVar.a) && jl40.l(this.b, qfmVar.b) && jl40.l(this.c, qfmVar.c) && this.d == qfmVar.d && jl40.l(this.e, qfmVar.e) && this.f.equals(qfmVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31)) * 31;
        GreenArea greenArea = this.e;
        return this.f.hashCode() + ((hashCode3 + (greenArea != null ? greenArea.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DriveSession(id=" + this.a + ", freeTime=" + this.b + ", freeTimeTimestamp=" + this.c + ", state=" + this.d + ", zone=" + this.e + ", goButtonInfo=" + this.f + Extension.C_BRAKE;
    }
}
