package defpackage;

import java.util.Map;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class dia extends yeo {
    public final long d;

    public dia(int i, String str, String str2, long j) {
        super(str, str2, i);
        this.d = j;
    }

    @Override // defpackage.yeo
    public final Map h() {
        return uah.i(super.h(), tah.b(new Pair("time", Long.valueOf(nsa.f(this.d)))));
    }
}
