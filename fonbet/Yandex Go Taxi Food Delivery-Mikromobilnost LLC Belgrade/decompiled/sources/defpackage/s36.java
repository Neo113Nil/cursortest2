package defpackage;

import java.util.Calendar;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.net.taxi.dto.response.BlockedUserTypeDto;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ls36;", "", "Companion", "q36", "r36", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class s36 {
    public static final r36 Companion = new r36();
    public static final i3y[] g = {a.b(LazyThreadSafetyMode.PUBLICATION, new av5(6)), null, null, null, null, null};
    public final BlockedUserTypeDto a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Calendar f;

    public /* synthetic */ s36(int i, BlockedUserTypeDto blockedUserTypeDto, String str, String str2, String str3, String str4, Calendar calendar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = blockedUserTypeDto;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = calendar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s36)) {
            return false;
        }
        s36 s36Var = (s36) obj;
        return this.a == s36Var.a && jl40.l(this.b, s36Var.b) && jl40.l(this.c, s36Var.c) && jl40.l(this.d, s36Var.d) && jl40.l(this.e, s36Var.e) && jl40.l(this.f, s36Var.f);
    }

    public final int hashCode() {
        BlockedUserTypeDto blockedUserTypeDto = this.a;
        int b = unr0.b(unr0.b((blockedUserTypeDto == null ? 0 : blockedUserTypeDto.hashCode()) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Calendar calendar = this.f;
        return hashCode2 + (calendar != null ? calendar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlockedUserDto(type=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", text=");
        g8e.D(sb, this.c, ", appealButtonText=", this.d, ", changePhoneButtonText=");
        sb.append(this.e);
        sb.append(", blockedTill=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public s36() {
        this.a = null;
        this.b = "";
        this.c = "";
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
