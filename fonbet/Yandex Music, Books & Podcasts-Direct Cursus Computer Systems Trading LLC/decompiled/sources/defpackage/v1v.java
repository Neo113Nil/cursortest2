package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v1v implements w1v {
    public final String a;
    public final w2v b = new w2v("");
    public final avo c;
    public final j2v d;

    public v1v(String str) {
        this.a = str;
        avo avoVar = avo.c;
        this.c = avo.c;
        this.d = j2v.c;
    }

    @Override // defpackage.w1v
    public final /* bridge */ /* synthetic */ co6 a() {
        return null;
    }

    @Override // defpackage.w1v
    public final j2v b() {
        return this.d;
    }

    @Override // defpackage.w1v
    public final avo c() {
        return this.c;
    }

    @Override // defpackage.w1v
    public final x2v d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v1v) && Intrinsics.d(this.a, ((v1v) obj).a);
    }

    @Override // defpackage.w1v
    public final /* bridge */ /* synthetic */ Integer getBackgroundColor() {
        return null;
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return hrg.q("Unknown(title=", this.a, ")");
    }
}
