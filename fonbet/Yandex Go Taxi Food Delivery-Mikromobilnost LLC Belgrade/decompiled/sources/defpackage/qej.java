package defpackage;

import com.yandex.delivery.utils.dialogmanager.api.DialogType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class qej {
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final boolean f;
    public final String g;
    public final DialogType h;

    public qej(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, boolean z, String str, DialogType dialogType, int i) {
        charSequence = (i & 1) != 0 ? null : charSequence;
        charSequence2 = (i & 2) != 0 ? null : charSequence2;
        charSequence3 = (i & 4) != 0 ? null : charSequence3;
        charSequence4 = (i & 8) != 0 ? null : charSequence4;
        charSequence5 = (i & 16) != 0 ? null : charSequence5;
        z = (i & 32) != 0 ? false : z;
        str = (i & 64) != 0 ? null : str;
        dialogType = (i & 128) != 0 ? DialogType.POPUP : dialogType;
        this.a = charSequence;
        this.b = charSequence2;
        this.c = charSequence3;
        this.d = charSequence4;
        this.e = charSequence5;
        this.f = z;
        this.g = str;
        this.h = dialogType;
    }

    public final String a() {
        return this.g;
    }

    public final CharSequence b() {
        return this.b;
    }

    public final CharSequence c() {
        return this.d;
    }

    public final CharSequence d() {
        return this.e;
    }

    public final CharSequence e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qej)) {
            return false;
        }
        qej qejVar = (qej) obj;
        return jl40.l(this.a, qejVar.a) && jl40.l(this.b, qejVar.b) && jl40.l(this.c, qejVar.c) && jl40.l(this.d, qejVar.d) && jl40.l(this.e, qejVar.e) && this.f == qejVar.f && jl40.l(this.g, qejVar.g) && this.h == qejVar.h;
    }

    public final CharSequence f() {
        return this.a;
    }

    public final DialogType g() {
        return this.h;
    }

    public final boolean h() {
        return this.f;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.b;
        int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.c;
        int hashCode3 = (hashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        CharSequence charSequence4 = this.d;
        int hashCode4 = (hashCode3 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31;
        CharSequence charSequence5 = this.e;
        int e = unr0.e((hashCode4 + (charSequence5 == null ? 0 : charSequence5.hashCode())) * 31, 31, this.f);
        String str = this.g;
        return this.h.hashCode() + ((e + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "DialogParams(title=", ", message=", ", positiveButtonLabel=");
        vfc.A(r, this.c, ", negativeButtonLabel=", this.d, ", neutralButtonLabel=");
        r.append((Object) this.e);
        r.append(", isDismissible=");
        r.append(this.f);
        r.append(", imageTag=");
        r.append(this.g);
        r.append(", type=");
        r.append(this.h);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }

    public qej() {
        this(null, null, null, null, null, false, null, null, 255);
    }
}
