package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class uzd extends vzd {
    public final String l;
    public final yde m;

    public uzd(String str, uzd uzdVar, String str2, long j, int i, long j2, pqa pqaVar, String str3, String str4, long j3, long j4, boolean z, List list) {
        super(str, uzdVar, j, i, j2, pqaVar, str3, str4, j3, j4, z);
        this.l = str2;
        this.m = yde.v(list);
    }

    public final uzd a(int i, long j) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        long j2 = j;
        while (true) {
            yde ydeVar = this.m;
            if (i2 >= ydeVar.size()) {
                return new uzd(this.a, this.b, this.l, this.c, i, j, this.f, this.g, this.h, this.i, this.j, this.k, arrayList);
            }
            szd szdVar = (szd) ydeVar.get(i2);
            arrayList.add(new szd(szdVar.a, szdVar.b, szdVar.c, i, j2, szdVar.f, szdVar.g, szdVar.h, szdVar.i, szdVar.j, szdVar.k, szdVar.l, szdVar.m));
            j2 += szdVar.c;
            i2++;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public uzd(long j, long j2, String str, String str2, String str3) {
        this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j, j2, false, qsn.e);
        ude udeVar = yde.b;
    }
}
