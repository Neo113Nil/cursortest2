package defpackage;

import java.util.Date;

/* loaded from: classes5.dex */
public interface u34 {
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        if (r8 > 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        r5 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if (r5 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        r6 = r5.longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        return new defpackage.e24(r1, r2, r3, null, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
    
        if (r8 > 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        if (r8 > 0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b A[LOOP:0: B:2:0x000d->B:16:0x005b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e A[EDGE_INSN: B:17:0x005e->B:18:0x005e BREAK  A[LOOP:0: B:2:0x000d->B:16:0x005b], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static e24 a(cvl cvlVar, t34... t34VarArr) {
        Long valueOf;
        cvlVar.getClass();
        String str = cvlVar.b;
        co6 c = op7.c(cvlVar);
        qo6 qo6Var = qo6.e;
        int length = t34VarArr.length;
        int i = 0;
        while (true) {
            Long l = null;
            long j = 0;
            if (i >= length) {
                break;
            }
            int ordinal = t34VarArr[i].ordinal();
            if (ordinal == 0) {
                Date date = cvlVar.A;
                if (date != null) {
                    long time = date.getTime();
                    valueOf = Long.valueOf(time);
                }
                if (l != null) {
                }
            } else if (ordinal == 1) {
                Date date2 = cvlVar.n;
                if (date2 != null) {
                    long time2 = date2.getTime();
                    valueOf = Long.valueOf(time2);
                }
                if (l != null) {
                }
            } else {
                if (ordinal != 2) {
                    b6e.s();
                    return null;
                }
                Date date3 = cvlVar.o;
                if (date3 != null) {
                    long time3 = date3.getTime();
                    valueOf = Long.valueOf(time3);
                }
                if (l != null) {
                    break;
                }
                i++;
            }
        }
    }

    static e24 b(mqs mqsVar) {
        mqsVar.getClass();
        String str = mqsVar.c;
        co6 co6Var = mqsVar.x0;
        qo6 qo6Var = qo6.a;
        Integer R = pd.R(mqsVar.f().a);
        Date date = mqsVar.w0;
        return new e24(str, co6Var, qo6Var, R, date != null ? date.getTime() : 0L);
    }

    static e24 c(oq oqVar) {
        oqVar.getClass();
        String str = oqVar.b;
        co6 co6Var = oqVar.D;
        qo6 qo6Var = qo6.b;
        Date date = oqVar.E;
        return new e24(str, co6Var, qo6Var, null, date != null ? date.getTime() : 0L);
    }
}
