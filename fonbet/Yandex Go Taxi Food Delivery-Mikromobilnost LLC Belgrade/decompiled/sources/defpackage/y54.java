package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class y54 extends u8f {
    public final Context a;
    public final s3c b;
    public final s3c c;
    public final String d;

    public y54(Context context, s3c s3cVar, s3c s3cVar2, String str) {
        if (context == null) {
            ny61.t("Null applicationContext");
            throw null;
        }
        this.a = context;
        if (s3cVar == null) {
            ny61.t("Null wallClock");
            throw null;
        }
        this.b = s3cVar;
        if (s3cVar2 == null) {
            ny61.t("Null monotonicClock");
            throw null;
        }
        this.c = s3cVar2;
        if (str != null) {
            this.d = str;
        } else {
            ny61.t("Null backendName");
            throw null;
        }
    }

    @Override // defpackage.u8f
    public final Context a() {
        return this.a;
    }

    @Override // defpackage.u8f
    public final String b() {
        return this.d;
    }

    @Override // defpackage.u8f
    public final s3c c() {
        return this.c;
    }

    @Override // defpackage.u8f
    public final s3c d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u8f)) {
            return false;
        }
        u8f u8fVar = (u8f) obj;
        return this.a.equals(u8fVar.a()) && this.b.equals(u8fVar.d()) && this.c.equals(u8fVar.c()) && this.d.equals(u8fVar.b());
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return oyr.t(sb, this.d, "}");
    }
}
