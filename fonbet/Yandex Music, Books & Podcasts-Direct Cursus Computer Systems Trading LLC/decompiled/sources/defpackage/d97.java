package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class d97 implements icc {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final y3e i;
    public final dnh j;
    public final Uri k;
    public final mum l;
    public final List m;

    public d97(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, mum mumVar, y3e y3eVar, dnh dnhVar, Uri uri, ArrayList arrayList) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.l = mumVar;
        this.i = y3eVar;
        this.k = uri;
        this.j = dnhVar;
        this.m = arrayList;
    }

    @Override // defpackage.icc
    public final Object a(List list) {
        long j;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new kjr(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        int i = 0;
        while (true) {
            if (i >= this.m.size()) {
                break;
            }
            if (((kjr) linkedList.peek()).a != i) {
                long c = c(i);
                if (c != -9223372036854775807L) {
                    j2 += c;
                }
            } else {
                pkk b = b(i);
                List list2 = b.c;
                kjr kjrVar = (kjr) linkedList.poll();
                int i2 = kjrVar.a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i3 = kjrVar.b;
                    nj njVar = (nj) list2.get(i3);
                    List list3 = njVar.c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((a0o) list3.get(kjrVar.c));
                        kjrVar = (kjr) linkedList.poll();
                        if (kjrVar.a != i2) {
                            break;
                        }
                    } while (kjrVar.b == i3);
                    j = j2;
                    arrayList2.add(new nj(njVar.a, njVar.b, arrayList3, njVar.d, njVar.e, njVar.f));
                    if (kjrVar.a != i2) {
                        break;
                    }
                    j2 = j;
                }
                linkedList.addFirst(kjrVar);
                arrayList.add(new pkk(b.a, b.b - j, arrayList2, b.d));
                j2 = j;
            }
            i++;
        }
        long j3 = j2;
        long j4 = this.b;
        return new d97(this.a, j4 != -9223372036854775807L ? j4 - j3 : -9223372036854775807L, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this.i, this.j, this.k, arrayList);
    }

    public final pkk b(int i) {
        return (pkk) this.m.get(i);
    }

    public final long c(int i) {
        long j;
        long j2;
        List list = this.m;
        if (i == list.size() - 1) {
            j = this.b;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j2 = ((pkk) list.get(i)).b;
        } else {
            j = ((pkk) list.get(i + 1)).b;
            j2 = ((pkk) list.get(i)).b;
        }
        return j - j2;
    }

    public final long d(int i) {
        return dvt.Y(c(i));
    }
}
