package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class qbk0 implements zjk0 {
    public final String a;
    public final String b;
    public final pbk0 c;
    public final obk0 d;
    public final nqs0 e;
    public final List f;
    public final akk0 g;

    static {
        ut11 ut11Var = UiStateDrawableWrapper.Companion;
    }

    public qbk0(String str, String str2, pbk0 pbk0Var, obk0 obk0Var, nqs0 nqs0Var, List list) {
        this.a = str;
        this.b = str2;
        this.c = pbk0Var;
        this.d = obk0Var;
        this.e = nqs0Var;
        this.f = list;
        this.g = qpa1.e(str2, EmptyList.a, new nqs0[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qbk0)) {
            return false;
        }
        qbk0 qbk0Var = (qbk0) obj;
        return jl40.l(this.a, qbk0Var.a) && jl40.l(this.b, qbk0Var.b) && jl40.l(this.c, qbk0Var.c) && jl40.l(this.d, qbk0Var.d) && jl40.l(this.e, qbk0Var.e) && jl40.l(this.f, qbk0Var.f);
    }

    @Override // defpackage.zjk0
    public final wrs0 getAnalytics() {
        return this.g;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("RideCardAiBubbleItemUiState(id=", this.a, ", analyticsId=", this.b, ", title=");
        v.append(this.c);
        v.append(", content=");
        v.append(this.d);
        v.append(", action=");
        v.append(this.e);
        v.append(", buttons=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
