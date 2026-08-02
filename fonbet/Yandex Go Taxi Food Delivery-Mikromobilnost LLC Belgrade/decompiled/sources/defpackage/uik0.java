package defpackage;

import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class uik0 implements zjk0 {
    public final String a;
    public final String b;
    public final xtq c;
    public final akk0 d;

    static {
        xtq xtqVar = xtq.f;
    }

    public uik0(String str, String str2, xtq xtqVar) {
        this.a = str;
        this.b = str2;
        this.c = xtqVar;
        this.d = qpa1.e(str2, EmptyList.a, new nqs0[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uik0)) {
            return false;
        }
        uik0 uik0Var = (uik0) obj;
        return jl40.l(this.a, uik0Var.a) && jl40.l(this.b, uik0Var.b) && this.c.equals(uik0Var.c);
    }

    @Override // defpackage.zjk0
    public final wrs0 getAnalytics() {
        return this.d;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("RideCardFeedbackQuestionUiState(id=", this.a, ", analyticsId=", this.b, ", uiState=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
