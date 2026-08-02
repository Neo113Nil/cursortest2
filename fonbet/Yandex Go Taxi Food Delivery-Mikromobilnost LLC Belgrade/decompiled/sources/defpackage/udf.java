package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.z;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public final class udf implements e2v0 {
    public static final z c = z.c().f(new x8e(13));
    public final ImmutableList a;
    public final long[] b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0119 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public udf(List list) {
        int i = 0;
        if (list.size() == 1) {
            piv listIterator = ((ImmutableList) list).listIterator(0);
            Object next = listIterator.next();
            if (listIterator.hasNext()) {
                StringBuilder sb = new StringBuilder("expected one element but was: <");
                sb.append(next);
                while (i < 4 && listIterator.hasNext()) {
                    sb.append(Extension.FIX_SPACE);
                    sb.append(listIterator.next());
                    i++;
                }
                if (listIterator.hasNext()) {
                    sb.append(", ...");
                }
                sb.append('>');
                throw new IllegalArgumentException(sb.toString());
            }
            tdf tdfVar = (tdf) next;
            long j = tdfVar.b;
            long j2 = tdfVar.c;
            long j3 = j == -9223372036854775807L ? 0L : j;
            ImmutableList immutableList = tdfVar.a;
            if (j2 == -9223372036854775807L) {
                this.a = ImmutableList.r(immutableList);
                this.b = new long[]{j3};
                return;
            } else {
                this.a = ImmutableList.s(immutableList, ImmutableList.p());
                this.b = new long[]{j3, j2 + j3};
                return;
            }
        }
        long[] jArr = new long[list.size() * 2];
        this.b = jArr;
        Arrays.fill(jArr, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
        ArrayList arrayList = new ArrayList();
        ImmutableList x = ImmutableList.x(c, (AbstractCollection) list);
        int i2 = 0;
        while (i < x.size()) {
            tdf tdfVar2 = (tdf) x.get(i);
            long j4 = tdfVar2.b;
            long j5 = tdfVar2.c;
            ImmutableList immutableList2 = tdfVar2.a;
            j4 = j4 == -9223372036854775807L ? 0L : j4;
            long j6 = j4 + j5;
            if (i2 != 0) {
                int i3 = i2 - 1;
                long j7 = this.b[i3];
                if (j7 >= j4) {
                    if (j7 == j4 && ((ImmutableList) arrayList.get(i3)).isEmpty()) {
                        arrayList.set(i3, immutableList2);
                    } else {
                        lk91.j("Truncating unsupported overlapping cues.");
                        this.b[i3] = j4;
                        arrayList.set(i3, immutableList2);
                    }
                    if (j5 == -9223372036854775807L) {
                        this.b[i2] = j6;
                        arrayList.add(ImmutableList.p());
                        i2++;
                    }
                    i++;
                }
            }
            this.b[i2] = j4;
            arrayList.add(immutableList2);
            i2++;
            if (j5 == -9223372036854775807L) {
            }
            i++;
        }
        this.a = ImmutableList.l(arrayList);
    }

    @Override // defpackage.e2v0
    public final long c(int i) {
        d6z.l(i < this.a.size());
        return this.b[i];
    }

    @Override // defpackage.e2v0
    public final int g() {
        return this.a.size();
    }

    @Override // defpackage.e2v0
    public final int h(long j) {
        int a = tw21.a(this.b, j, false);
        if (a < this.a.size()) {
            return a;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.e2v0
    public final List i(long j) {
        int e = tw21.e(this.b, j, false);
        return e == -1 ? ImmutableList.p() : (ImmutableList) this.a.get(e);
    }
}
