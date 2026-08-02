package defpackage;

import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes4.dex */
public final class yrv implements asv, xrv {
    public final String a;
    public final wrv b;
    public final String c;
    public final CoverPath d;
    public final boolean e;

    public yrv(String str, wrv wrvVar, String str2, CoverPath coverPath, boolean z) {
        this.a = str;
        this.b = wrvVar;
        this.c = str2;
        this.d = coverPath;
        this.e = z;
    }

    @Override // defpackage.xrv
    public final CoverPath a() {
        return this.d;
    }

    @Override // defpackage.asv
    public final wrv b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrv)) {
            return false;
        }
        yrv yrvVar = (yrv) obj;
        return this.a.equals(yrvVar.a) && this.b.equals(yrvVar.b) && this.c.equals(yrvVar.c) && Intrinsics.d(this.d, yrvVar.d) && this.e == yrvVar.e;
    }

    @Override // defpackage.csv
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.xrv
    public final String getName() {
        return this.c;
    }

    public final int hashCode() {
        int c = k5r.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        CoverPath coverPath = this.d;
        return Boolean.hashCode(this.e) + ((c + (coverPath == null ? 0 : coverPath.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Full(id=");
        sb.append(this.a);
        sb.append(", coordinates=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", coverPath=");
        sb.append(this.d);
        sb.append(", isRecommended=");
        return ouj.r(sb, this.e, ")");
    }
}
