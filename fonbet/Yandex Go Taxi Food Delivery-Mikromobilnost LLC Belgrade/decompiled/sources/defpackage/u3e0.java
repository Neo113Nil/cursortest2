package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lu3e0;", "", "Companion", "s3e0", "t3e0", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class u3e0 {
    public static final t3e0 Companion = new t3e0();
    public final String a;
    public final String b;
    public final Integer c;
    public final Float d;
    public final p3r e;

    public /* synthetic */ u3e0(int i, String str, String str2, Integer num, Float f, p3r p3rVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = f;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = p3rVar;
        }
    }

    /* renamed from: a, reason: from getter */
    public final p3r getE() {
        return this.e;
    }

    /* renamed from: b, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: c, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: d, reason: from getter */
    public final Integer getC() {
        return this.c;
    }

    /* renamed from: e, reason: from getter */
    public final Float getD() {
        return this.d;
    }

    public u3e0() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
