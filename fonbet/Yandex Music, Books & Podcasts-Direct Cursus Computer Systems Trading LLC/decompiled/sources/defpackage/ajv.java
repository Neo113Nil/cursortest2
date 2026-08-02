package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ajv implements bjv {
    public final jjv a;
    public final String b;
    public final String c;
    public final hlu d;
    public final int e;

    public ajv(jjv jjvVar, String str, String str2, hlu hluVar) {
        this.a = jjvVar;
        this.b = str;
        this.c = str2;
        this.d = hluVar;
        Integer b0 = y2x.b0(hluVar.b.b.b);
        this.e = b0 != null ? b0.intValue() : -10716261;
    }

    @Override // defpackage.bjv
    public final jjv a() {
        return this.a;
    }

    @Override // defpackage.bjv
    public final int b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajv)) {
            return false;
        }
        ajv ajvVar = (ajv) obj;
        return this.a.equals(ajvVar.a) && this.b.equals(ajvVar.b) && Intrinsics.d(this.c, ajvVar.c) && this.d.equals(ajvVar.d);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((c + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "Wave(style=" + this.a + ", feedbackId=" + this.b + ", descriptionWheelItem=" + this.c + ", agentItem=" + this.d + ")";
    }
}
