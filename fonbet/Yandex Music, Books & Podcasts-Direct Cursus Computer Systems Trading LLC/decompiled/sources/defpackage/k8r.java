package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class k8r extends wyf {
    public final d7k a = new d7k();
    public final v94 b = new v94();
    public ojs c;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r5 != r7) goto L14;
     */
    @Override // defpackage.wyf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u2i B(y2i y2iVar, ByteBuffer byteBuffer) {
        n2i l8rVar;
        long j;
        d7k d7kVar = this.a;
        v94 v94Var = this.b;
        ojs ojsVar = this.c;
        if (ojsVar != null) {
            long j2 = y2iVar.n;
            synchronized (ojsVar) {
                long j3 = ojsVar.b;
            }
        }
        ojs ojsVar2 = new ojs(y2iVar.k);
        this.c = ojsVar2;
        ojsVar2.a(y2iVar.k - y2iVar.n);
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        d7kVar.F(limit, array);
        v94Var.o(limit, array);
        v94Var.t(39);
        long i = (v94Var.i(1) << 32) | v94Var.i(32);
        v94Var.t(20);
        int i2 = v94Var.i(12);
        int i3 = v94Var.i(8);
        d7kVar.I(14);
        if (i3 != 0) {
            int i4 = 4;
            if (i3 == 255) {
                long x = d7kVar.x();
                int i5 = i2 - 4;
                d7kVar.f(new byte[i5], 0, i5);
                l8rVar = new usm(0, x, i);
            } else if (i3 == 4) {
                int v = d7kVar.v();
                ArrayList arrayList = new ArrayList(v);
                for (int i6 = 0; i6 < v; i6++) {
                    d7kVar.x();
                    boolean z = (d7kVar.v() & 128) != 0;
                    ArrayList arrayList2 = new ArrayList();
                    if (!z) {
                        int v2 = d7kVar.v();
                        boolean z2 = (v2 & 64) != 0;
                        boolean z3 = (v2 & 32) != 0;
                        if (z2) {
                            d7kVar.x();
                        }
                        if (!z2) {
                            int v3 = d7kVar.v();
                            ArrayList arrayList3 = new ArrayList(v3);
                            for (int i7 = 0; i7 < v3; i7++) {
                                d7kVar.v();
                                d7kVar.x();
                                arrayList3.add(new l3l());
                            }
                            arrayList2 = arrayList3;
                        }
                        if (z3) {
                            d7kVar.v();
                            d7kVar.x();
                        }
                        d7kVar.B();
                        d7kVar.v();
                        d7kVar.v();
                    }
                    i5l i5lVar = new i5l();
                    Collections.unmodifiableList(arrayList2);
                    arrayList.add(i5lVar);
                }
                l8rVar = new l8r();
                Collections.unmodifiableList(arrayList);
            } else if (i3 == 5) {
                ojs ojsVar3 = this.c;
                d7kVar.x();
                boolean z4 = (d7kVar.v() & 128) != 0;
                List list = Collections.EMPTY_LIST;
                if (z4) {
                    j = -9223372036854775807L;
                } else {
                    int v4 = d7kVar.v();
                    boolean z5 = (v4 & 64) != 0;
                    boolean z6 = (v4 & 32) != 0;
                    boolean z7 = (v4 & 16) != 0;
                    long a = (!z5 || z7) ? -9223372036854775807L : usm.a(i, d7kVar);
                    if (!z5) {
                        int v5 = d7kVar.v();
                        ArrayList arrayList4 = new ArrayList(v5);
                        for (int i8 = 0; i8 < v5; i8++) {
                            d7kVar.v();
                            ojsVar3.b(!z7 ? usm.a(i, d7kVar) : -9223372036854775807L);
                            arrayList4.add(new jzk(i4));
                        }
                        list = arrayList4;
                    }
                    if (z6) {
                        d7kVar.v();
                        d7kVar.x();
                    }
                    d7kVar.B();
                    d7kVar.v();
                    d7kVar.v();
                    j = a;
                }
                l8rVar = new usm(j, ojsVar3.b(j), list);
            } else if (i3 != 6) {
                l8rVar = null;
            } else {
                ojs ojsVar4 = this.c;
                long a2 = usm.a(i, d7kVar);
                l8rVar = new usm(2, a2, ojsVar4.b(a2));
            }
        } else {
            l8rVar = new l8r();
        }
        return l8rVar == null ? new u2i(new n2i[0]) : new u2i(l8rVar);
    }
}
