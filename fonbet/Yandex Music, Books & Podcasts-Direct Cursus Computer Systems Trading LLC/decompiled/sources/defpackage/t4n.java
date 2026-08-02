package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;

/* loaded from: classes3.dex */
public final class t4n implements u97 {
    public final LinkedList a = new LinkedList();
    public final ByteOrder b;
    public final om3 c;

    static {
        new Hashtable();
    }

    public t4n(aa7 aa7Var) {
        new ArrayList();
        this.b = ByteOrder.BIG_ENDIAN;
        this.c = new om3();
        aa7Var.c(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (r5 != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063 A[LOOP:1: B:9:0x002f->B:22:0x0063, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059 A[SYNTHETIC] */
    @Override // defpackage.u97
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q(aa7 aa7Var, om3 om3Var) {
        LinkedList linkedList;
        om3 om3Var2 = this.c;
        om3Var.f(om3Var2);
        while (true) {
            linkedList = this.a;
            if (linkedList.size() > 0 && om3Var2.c >= ((r4n) linkedList.peek()).a) {
                om3Var2.b = this.b;
                r4n r4nVar = (r4n) linkedList.poll();
                switch (r4nVar.b) {
                    case 0:
                        int i = r4nVar.a;
                        byte[] bArr = new byte[i];
                        om3Var2.getClass();
                        om3Var2.e(i, bArr);
                        ((s4n) r4nVar.c).d(bArr);
                        r4nVar = null;
                        break;
                    default:
                        om3 om3Var3 = new om3();
                        boolean z = true;
                        while (true) {
                            if (om3Var2.a.size() > 0) {
                                ByteBuffer o = om3Var2.o();
                                o.mark();
                                int i2 = 0;
                                while (o.remaining() > 0) {
                                    z = o.get() == 0;
                                    if (z) {
                                        o.reset();
                                        if (z) {
                                            om3Var3.a(o);
                                        } else {
                                            om3Var2.c(o);
                                            om3Var2.g(om3Var3, i2);
                                            om3Var2.d();
                                        }
                                    } else {
                                        i2++;
                                    }
                                }
                                o.reset();
                                if (z) {
                                }
                            }
                        }
                        ((qzc) r4nVar.c).Q(aa7Var, om3Var3);
                        break;
                }
                if (r4nVar != null) {
                    linkedList.addFirst(r4nVar);
                }
            }
        }
        if (linkedList.size() == 0) {
            om3Var2.f(om3Var);
        }
    }

    public final void a(int i, s4n s4nVar) {
        r4n r4nVar = new r4n(i, 0);
        if (i <= 0) {
            xq0.x("length should be > 0");
        } else {
            r4nVar.c = s4nVar;
            this.a.add(r4nVar);
        }
    }
}
