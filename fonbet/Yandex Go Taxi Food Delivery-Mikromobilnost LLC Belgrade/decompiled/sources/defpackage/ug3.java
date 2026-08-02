package defpackage;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final /* synthetic */ class ug3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long w;
    public final /* synthetic */ Object x;

    public /* synthetic */ ug3(Object obj, String str, long j, long j2, int i) {
        this.a = i;
        this.x = obj;
        this.b = str;
        this.c = j;
        this.w = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.x;
        switch (i) {
            case 0:
                xg3 xg3Var = (xg3) ((h0w) obj).c;
                int i2 = tw21.a;
                xg3Var.onAudioDecoderInitialized(this.b, this.c, this.w);
                break;
            case 1:
                a1r a1rVar = (a1r) obj;
                w53 w53Var = a1rVar.c;
                String str = this.b;
                w53Var.remove(str);
                x0r x0rVar = (x0r) a1rVar.b.get(str);
                if (x0rVar != null) {
                    long j = this.c;
                    x0rVar.a = j;
                    long j2 = this.w;
                    x0rVar.b = j2;
                    zq60 zq60Var = (zq60) a1rVar.a.get(str);
                    if (zq60Var != null) {
                        Iterator it = zq60Var.iterator();
                        while (true) {
                            sq60 sq60Var = (sq60) it;
                            if (!sq60Var.hasNext()) {
                                break;
                            } else {
                                z0r z0rVar = (z0r) sq60Var.next();
                                z0rVar.c.post(new y0r(z0rVar, j, j2));
                            }
                        }
                    }
                }
                break;
            default:
                co31 co31Var = (co31) ((a201) obj).c;
                int i3 = tw21.a;
                co31Var.onVideoDecoderInitialized(this.b, this.c, this.w);
                break;
        }
    }
}
