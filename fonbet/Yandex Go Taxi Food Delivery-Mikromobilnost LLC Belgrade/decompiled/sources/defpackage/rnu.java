package defpackage;

import androidx.media3.common.DrmInitData;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class rnu extends snu {
    public final String E;
    public final ImmutableList F;

    public rnu(String str, rnu rnuVar, String str2, long j, int i, long j2, DrmInitData drmInitData, String str3, String str4, long j3, long j4, boolean z, List list) {
        super(str, rnuVar, j, i, j2, drmInitData, str3, str4, j3, j4, z);
        this.E = str2;
        this.F = ImmutableList.l(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final rnu a(int i, long j) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        long j2 = j;
        while (true) {
            ImmutableList immutableList = this.F;
            if (i2 >= immutableList.size()) {
                return new rnu(this.a, this.b, this.E, this.c, i, j, this.y, this.z, this.A, this.B, this.C, this.D, arrayList);
            }
            pnu pnuVar = (pnu) immutableList.get(i2);
            arrayList.add(new pnu(pnuVar.a, pnuVar.b, pnuVar.c, i, j2, pnuVar.y, pnuVar.z, pnuVar.A, pnuVar.B, pnuVar.C, pnuVar.D, pnuVar.E, pnuVar.F));
            j2 += pnuVar.c;
            i2++;
        }
    }

    public rnu(long j, long j2, String str, String str2, String str3) {
        this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j, j2, false, ImmutableList.p());
    }
}
