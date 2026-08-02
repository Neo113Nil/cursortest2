package defpackage;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class ejj extends ArrayList implements ajj {
    private static final long serialVersionUID = 7063189396499112664L;
    public volatile int a;

    @Override // defpackage.ajj
    public final void g() {
        add(jfj.a);
        this.a++;
    }

    @Override // defpackage.ajj
    public final void n(yij yijVar) {
        if (yijVar.getAndIncrement() != 0) {
            return;
        }
        wjj wjjVar = yijVar.b;
        int i = 1;
        while (!yijVar.d) {
            int i2 = this.a;
            Integer num = (Integer) yijVar.c;
            int intValue = num != null ? num.intValue() : 0;
            while (intValue < i2) {
                if (jfj.a(wjjVar, get(intValue)) || yijVar.d) {
                    return;
                } else {
                    intValue++;
                }
            }
            yijVar.c = Integer.valueOf(intValue);
            i = yijVar.addAndGet(-i);
            if (i == 0) {
                return;
            }
        }
    }

    @Override // defpackage.ajj
    public final void q(Throwable th) {
        add(new ifj(th));
        this.a++;
    }

    @Override // defpackage.ajj
    public final void r(Object obj) {
        add(obj);
        this.a++;
    }
}
