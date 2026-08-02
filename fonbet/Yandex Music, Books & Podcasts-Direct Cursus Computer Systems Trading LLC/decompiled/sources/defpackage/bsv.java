package defpackage;

import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes4.dex */
public final class bsv implements xrv {
    public final String a;
    public final String b;
    public final CoverPath c;

    public bsv(String str, String str2, CoverPath coverPath) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = coverPath;
    }

    @Override // defpackage.xrv
    public final CoverPath a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsv)) {
            return false;
        }
        bsv bsvVar = (bsv) obj;
        return Intrinsics.d(this.a, bsvVar.a) && Intrinsics.d(this.b, bsvVar.b) && Intrinsics.d(this.c, bsvVar.c);
    }

    @Override // defpackage.csv
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.xrv
    public final String getName() {
        return this.b;
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        CoverPath coverPath = this.c;
        return c + (coverPath == null ? 0 : coverPath.hashCode());
    }

    public final String toString() {
        StringBuilder m = f1d.m("WithDomainInfo(id=", this.a, ", name=", this.b, ", coverPath=");
        m.append(this.c);
        m.append(")");
        return m.toString();
    }
}
