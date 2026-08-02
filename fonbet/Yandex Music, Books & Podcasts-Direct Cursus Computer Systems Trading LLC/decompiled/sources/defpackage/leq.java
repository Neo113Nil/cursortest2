package defpackage;

import java.util.Map;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class leq extends yeo {
    public final long d;
    public final String e;

    public leq(int i, long j, String str, String str2, String str3) {
        super(str, str2, i);
        this.d = j;
        this.e = str3;
    }

    @Override // defpackage.yeo
    public final Map h() {
        return uah.i(super.h(), uah.e(new Pair("time", Long.valueOf(nsa.f(this.d))), new Pair("source", this.e)));
    }
}
