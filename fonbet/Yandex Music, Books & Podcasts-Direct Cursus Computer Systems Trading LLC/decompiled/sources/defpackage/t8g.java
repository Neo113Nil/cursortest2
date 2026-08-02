package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class t8g extends u8g {
    @Override // defpackage.u8g
    public final void a(long j, Object obj) {
        ((t8) ((qse) cmt.d.i(j, obj))).a = false;
    }

    @Override // defpackage.u8g
    public final void b(long j, Object obj, Object obj2) {
        zlt zltVar = cmt.d;
        qse qseVar = (qse) zltVar.i(j, obj);
        qse qseVar2 = (qse) zltVar.i(j, obj2);
        int size = qseVar.size();
        int size2 = qseVar2.size();
        if (size > 0 && size2 > 0) {
            if (!((t8) qseVar).a) {
                qseVar = qseVar.b(size2 + size);
            }
            qseVar.addAll(qseVar2);
        }
        if (size > 0) {
            qseVar2 = qseVar;
        }
        cmt.o(j, obj, qseVar2);
    }

    @Override // defpackage.u8g
    public final List c(long j, Object obj) {
        qse qseVar = (qse) cmt.d.i(j, obj);
        if (((t8) qseVar).a) {
            return qseVar;
        }
        int size = qseVar.size();
        qse b = qseVar.b(size == 0 ? 10 : size * 2);
        cmt.o(j, obj, b);
        return b;
    }
}
