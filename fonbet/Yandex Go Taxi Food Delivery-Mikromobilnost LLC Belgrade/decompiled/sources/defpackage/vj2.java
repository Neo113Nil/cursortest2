package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lvj2;", "", "Companion", "tj2", "uj2", "flex-divkit-scaffold-feature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class vj2 {
    public static final uj2 Companion = new uj2();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new ly1(18))};
    public final tg2 a;

    public /* synthetic */ vj2(int i, tg2 tg2Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = tg2Var;
        }
    }

    /* renamed from: a, reason: from getter */
    public final tg2 getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return vj2.class.equals(obj != null ? obj.getClass() : null) && jl40.l(this.a, ((vj2) obj).a);
    }

    public final int hashCode() {
        tg2 tg2Var = this.a;
        if (tg2Var != null) {
            return tg2Var.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Animations(onShow=" + this.a + Extension.C_BRAKE;
    }

    public vj2() {
        this.a = null;
    }
}
