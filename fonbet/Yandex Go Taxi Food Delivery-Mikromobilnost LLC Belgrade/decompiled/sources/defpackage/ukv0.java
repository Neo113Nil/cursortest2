package defpackage;

import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class ukv0 {
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008b, code lost:
    
        r0 = java.lang.Integer.valueOf(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008f, code lost:
    
        if (r4 == (-1)) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
    
        if (r0 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        return r0.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009a, code lost:
    
        r7 = r7.iterator();
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        if (r7.hasNext() == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a5, code lost:
    
        r4 = r7.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ab, code lost:
    
        if ((r4 instanceof defpackage.kij0) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ad, code lost:
    
        r4 = (defpackage.kij0) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b1, code lost:
    
        if (r4 == null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b5, code lost:
    
        if ((r4 instanceof defpackage.uhj0) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b7, code lost:
    
        r4 = ((defpackage.uhj0) r4).c;
        r5 = new java.util.ArrayList(defpackage.tcc.n(r4, 10));
        r4 = r4.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d0, code lost:
    
        if (r4.hasNext() == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d2, code lost:
    
        r5.add(((defpackage.ux8) r4.next()).k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x011a, code lost:
    
        if (r5 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0121, code lost:
    
        if (r5.contains(r8) != true) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0129, code lost:
    
        r7 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012d, code lost:
    
        if (r0 == (-1)) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x012f, code lost:
    
        r2 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0130, code lost:
    
        if (r2 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0136, code lost:
    
        return r2.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0124, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e2, code lost:
    
        if ((r4 instanceof defpackage.jij0) != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e6, code lost:
    
        if ((r4 instanceof defpackage.hij0) != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ea, code lost:
    
        if ((r4 instanceof defpackage.yhj0) != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ee, code lost:
    
        if ((r4 instanceof defpackage.vhj0) != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f2, code lost:
    
        if ((r4 instanceof defpackage.aij0) != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f6, code lost:
    
        if ((r4 instanceof defpackage.iij0) != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00fa, code lost:
    
        if ((r4 instanceof defpackage.dij0) != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00fe, code lost:
    
        if ((r4 instanceof defpackage.whj0) != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0102, code lost:
    
        if ((r4 instanceof defpackage.xhj0) != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0106, code lost:
    
        if ((r4 instanceof defpackage.bij0) != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x010a, code lost:
    
        if ((r4 instanceof defpackage.fij0) != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x010e, code lost:
    
        if ((r4 instanceof defpackage.zhj0) != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0112, code lost:
    
        if ((r4 instanceof defpackage.eij0) == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0115, code lost:
    
        defpackage.w511.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0118, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0119, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00b0, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0128, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087 A[LOOP:0: B:9:0x0020->B:20:0x0087, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b A[EDGE_INSN: B:21:0x008b->B:22:0x008b BREAK  A[LOOP:0: B:9:0x0020->B:20:0x0087], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(RecyclerView recyclerView, String str) {
        String str2;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        Integer num = null;
        bys bysVar = adapter instanceof bys ? (bys) adapter : null;
        if (bysVar != null && recyclerView.getLayoutManager() != null) {
            List list = bysVar.x.f;
            Iterator it = list.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Object next = it.next();
                kij0 kij0Var = next instanceof kij0 ? (kij0) next : null;
                if (kij0Var != null) {
                    if (kij0Var instanceof jij0) {
                        str2 = ((jij0) kij0Var).a.a;
                    } else if (kij0Var instanceof hij0) {
                        str2 = ((hij0) kij0Var).a.a;
                    } else if (!(kij0Var instanceof yhj0) && !(kij0Var instanceof vhj0) && !(kij0Var instanceof aij0) && !(kij0Var instanceof uhj0) && !(kij0Var instanceof iij0) && !(kij0Var instanceof dij0) && !(kij0Var instanceof whj0) && !(kij0Var instanceof xhj0) && !(kij0Var instanceof bij0) && !(kij0Var instanceof fij0) && !(kij0Var instanceof zhj0) && !(kij0Var instanceof eij0)) {
                        w511.b();
                        return 0;
                    }
                    if (!jl40.l(str, str2)) {
                        break;
                    }
                    i++;
                }
                str2 = null;
                if (!jl40.l(str, str2)) {
                }
            }
        }
        return -1;
    }

    public static void b(eh2 eh2Var, final Handler handler, final RecyclerView recyclerView, String str, String str2, int i) {
        final int a;
        final int i2;
        int a2;
        if (str != null && (a2 = a(recyclerView, str)) != -1) {
            d(recyclerView, a2, i);
            eh2Var.a(handler, true, new qkv0(recyclerView, a2, 0), 300);
            return;
        }
        if (str2 == null || (a = a(recyclerView, str2)) == -1) {
            return;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        bys bysVar = adapter instanceof bys ? (bys) adapter : null;
        if (bysVar != null) {
            for (Object obj : bysVar.x.f) {
                kij0 kij0Var = obj instanceof kij0 ? (kij0) obj : null;
                if (kij0Var != null) {
                    uhj0 uhj0Var = kij0Var instanceof uhj0 ? (uhj0) kij0Var : null;
                    if (uhj0Var != null) {
                        Iterator it = uhj0Var.c.iterator();
                        i2 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i2 = -1;
                                break;
                            } else if (jl40.l(((ux8) it.next()).k(), str2)) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                        if (i2 >= 0) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        i2 = -1;
        if (i2 == -1) {
            d(recyclerView, a, i);
            return;
        }
        d(recyclerView, a, i);
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: rkv0
                @Override // java.lang.Runnable
                public final void run() {
                    Handler handler2 = handler;
                    if (handler2 != null) {
                        handler2.post(new yp7(recyclerView, a, i2, 1));
                    }
                }
            }, 300L);
        }
    }

    public static final void c(eh2 eh2Var, Handler handler, sls slsVar, zjj0 zjj0Var, int i) {
        String str = zjj0Var.b;
        String str2 = zjj0Var.a;
        if (str == null && str2 == null) {
            return;
        }
        eh2Var.a(handler, true, new pkv0(slsVar, eh2Var, handler, str, str2, i), 1200);
    }

    public static void d(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.getLayoutManager() == null || i < 0) {
            return;
        }
        tkv0 tkv0Var = new tkv0(i2, recyclerView.getContext());
        tkv0Var.a = i;
        RecyclerView.e layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.v(tkv0Var);
        }
    }
}
