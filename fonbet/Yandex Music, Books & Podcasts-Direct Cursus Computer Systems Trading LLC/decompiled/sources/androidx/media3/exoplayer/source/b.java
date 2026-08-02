package androidx.media3.exoplayer.source;

import android.net.Uri;
import defpackage.anh;
import defpackage.bnh;
import defpackage.cnh;
import defpackage.dnh;
import defpackage.fnh;
import defpackage.gnh;
import defpackage.hoh;
import defpackage.jnh;
import defpackage.ois;
import defpackage.onh;
import defpackage.qsn;
import defpackage.ris;
import defpackage.sis;
import defpackage.vq1;
import defpackage.xmh;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class b extends sis {
    public static final Object q = new Object();
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final Object n;
    public final onh o;
    public final fnh p;

    static {
        xmh xmhVar = new xmh();
        bnh bnhVar = new bnh();
        List list = Collections.EMPTY_LIST;
        qsn qsnVar = qsn.e;
        dnh dnhVar = new dnh();
        jnh jnhVar = jnh.d;
        Uri uri = Uri.EMPTY;
        vq1.A(((Uri) bnhVar.e) == null || ((UUID) bnhVar.d) != null);
        if (uri != null) {
            new gnh(uri, null, ((UUID) bnhVar.d) != null ? new cnh(bnhVar) : null, null, list, null, qsnVar, -9223372036854775807L);
        }
        new anh(xmhVar);
        new fnh(dnhVar);
        hoh hohVar = hoh.K;
    }

    public b(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, Object obj, onh onhVar) {
        this(-9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, false, obj, onhVar, z3 ? onhVar.c : null);
    }

    @Override // defpackage.sis
    public final int b(Object obj) {
        return q.equals(obj) ? 0 : -1;
    }

    @Override // defpackage.sis
    public final ois f(int i, ois oisVar, boolean z) {
        vq1.w(i, 1);
        oisVar.i(0, this.g, -this.i, null, z ? q : null);
        return oisVar;
    }

    @Override // defpackage.sis
    public final int h() {
        return 1;
    }

    @Override // defpackage.sis
    public final Object l(int i) {
        vq1.w(i, 1);
        return q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r1 > r3) goto L10;
     */
    @Override // defpackage.sis
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ris m(int i, ris risVar, long j) {
        long j2;
        vq1.w(i, 1);
        long j3 = this.j;
        boolean z = this.l;
        if (z && !this.m && j != 0) {
            long j4 = this.h;
            if (j4 != -9223372036854775807L) {
                j3 += j;
            }
            j2 = -9223372036854775807L;
            risVar.b(ris.q, this.o, this.n, this.e, this.f, -9223372036854775807L, this.k, z, this.p, j2, this.h, 0, 0, this.i);
            return risVar;
        }
        j2 = j3;
        risVar.b(ris.q, this.o, this.n, this.e, this.f, -9223372036854775807L, this.k, z, this.p, j2, this.h, 0, 0, this.i);
        return risVar;
    }

    @Override // defpackage.sis
    public final int o() {
        return 1;
    }

    public b(long j, boolean z, boolean z2, onh onhVar) {
        this(j, j, 0L, 0L, z, false, z2, null, onhVar);
    }

    public b(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, Object obj, onh onhVar, fnh fnhVar) {
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
        this.i = j5;
        this.j = j6;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = obj;
        onhVar.getClass();
        this.o = onhVar;
        this.p = fnhVar;
    }
}
