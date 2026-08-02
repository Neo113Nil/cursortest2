package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class urh {
    public final String a;
    public final String b;
    public final trh c;
    public final trh d;

    public urh(String str, String str2, trh trhVar, trh trhVar2) {
        this.a = str;
        this.b = str2;
        this.c = trhVar;
        this.d = trhVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof urh)) {
            return false;
        }
        urh urhVar = (urh) obj;
        return jl40.l(this.a, urhVar.a) && jl40.l(this.b, urhVar.b) && this.c.equals(urhVar.c) && this.d.equals(urhVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("DeleteModalUiState(title=", this.a, ", subtitle=", this.b, ", rejectButtonsUiState=");
        v.append(this.c);
        v.append(", acceptButtonsUiState=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
