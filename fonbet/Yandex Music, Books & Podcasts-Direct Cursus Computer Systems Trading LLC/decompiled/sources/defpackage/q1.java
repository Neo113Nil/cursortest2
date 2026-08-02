package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.yandex.video.m3.ab.validation.AbValidationType;

@vhp
/* loaded from: classes6.dex */
public final class q1 {

    @NotNull
    public static final p1 Companion = new p1();
    public static final t9f[] f;
    public static final q1 g;
    public final long a;
    public final String b;
    public final m2 c;
    public final m2 d;
    public final yse e;

    static {
        w1 w1Var = m2.Companion;
        f = new t9f[]{null, null, w1Var.serializer(), w1Var.serializer(), null};
        f2 f2Var = new f2(AbValidationType.Experiment);
        f2 f2Var2 = new f2(AbValidationType.FeatureToggle);
        yse.Companion.getClass();
        g = new q1(-9223372036854775807L, null, f2Var, f2Var2, yse.e);
    }

    public q1(int i, long j, String str, m2 m2Var, m2 m2Var2, yse yseVar) {
        this.a = (i & 1) == 0 ? -9223372036854775807L : j;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = new f2(AbValidationType.Experiment);
        } else {
            this.c = m2Var;
        }
        if ((i & 8) == 0) {
            this.d = new f2(AbValidationType.FeatureToggle);
        } else {
            this.d = m2Var2;
        }
        if ((i & 16) != 0) {
            this.e = yseVar;
        } else {
            yse.Companion.getClass();
            this.e = yse.e;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return this.a == q1Var.a && Intrinsics.d(this.b, q1Var.b) && Intrinsics.d(this.c, q1Var.c) && Intrinsics.d(this.d, q1Var.d) && Intrinsics.d(this.e, q1Var.e);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AbConfigWithMeta(fetchTimestamp=" + this.a + ", etag=" + this.b + ", experimentValidationResult=" + this.c + ", featureToggleValidationResult=" + this.d + ", internalAbConfig=" + this.e + ')';
    }

    public q1(long j, String str, m2 m2Var, m2 m2Var2, yse yseVar) {
        m2Var.getClass();
        m2Var2.getClass();
        yseVar.getClass();
        this.a = j;
        this.b = str;
        this.c = m2Var;
        this.d = m2Var2;
        this.e = yseVar;
    }
}
