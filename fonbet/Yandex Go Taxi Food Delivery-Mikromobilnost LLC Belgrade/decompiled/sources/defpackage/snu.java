package defpackage;

import androidx.media3.common.DrmInitData;

/* loaded from: classes10.dex */
public abstract class snu implements Comparable {
    public final String A;
    public final long B;
    public final long C;
    public final boolean D;
    public final String a;
    public final rnu b;
    public final long c;
    public final int w;
    public final long x;
    public final DrmInitData y;
    public final String z;

    public snu(String str, rnu rnuVar, long j, int i, long j2, DrmInitData drmInitData, String str2, String str3, long j3, long j4, boolean z) {
        this.a = str;
        this.b = rnuVar;
        this.c = j;
        this.w = i;
        this.x = j2;
        this.y = drmInitData;
        this.z = str2;
        this.A = str3;
        this.B = j3;
        this.C = j4;
        this.D = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l = (Long) obj;
        long longValue = l.longValue();
        long j = this.x;
        if (j > longValue) {
            return 1;
        }
        return j < l.longValue() ? -1 : 0;
    }
}
