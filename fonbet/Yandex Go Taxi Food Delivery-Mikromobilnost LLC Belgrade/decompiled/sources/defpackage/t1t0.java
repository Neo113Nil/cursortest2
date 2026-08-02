package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lt1t0;", "", "Companion", "r1t0", "s1t0", "just-adapter-snapping_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class t1t0 {
    public static final s1t0 Companion = new s1t0();
    public static final i3y[] e;
    public final kr a;
    public final kr b;
    public final kr c;
    public final kr d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{a.b(lazyThreadSafetyMode, new tqs0(19)), a.b(lazyThreadSafetyMode, new tqs0(20)), a.b(lazyThreadSafetyMode, new tqs0(21)), a.b(lazyThreadSafetyMode, new tqs0(22))};
    }

    public /* synthetic */ t1t0(int i, kr krVar, kr krVar2, kr krVar3, kr krVar4) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = krVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = krVar2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = krVar3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = krVar4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t1t0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        t1t0 t1t0Var = (t1t0) obj;
        return jl40.l(this.a, t1t0Var.a) && jl40.l(this.b, t1t0Var.b) && jl40.l(this.c, t1t0Var.c) && jl40.l(this.d, t1t0Var.d);
    }

    public final int hashCode() {
        kr krVar = this.a;
        int hashCode = (krVar != null ? krVar.hashCode() : 0) * 31;
        kr krVar2 = this.b;
        int hashCode2 = (hashCode + (krVar2 != null ? krVar2.hashCode() : 0)) * 31;
        kr krVar3 = this.c;
        int hashCode3 = (hashCode2 + (krVar3 != null ? krVar3.hashCode() : 0)) * 31;
        kr krVar4 = this.d;
        return hashCode3 + (krVar4 != null ? krVar4.hashCode() : 0);
    }

    public final String toString() {
        return "SnappingCallbacks(onStarted=" + this.a + ", onCancelled=" + this.b + ", onCompleted=" + this.c + ", onMovedAway=" + this.d + Extension.C_BRAKE;
    }

    public t1t0() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
