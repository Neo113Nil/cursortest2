package defpackage;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class j5e extends f8s {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j5e(String str, Object obj, Object obj2, int i) {
        super(str, true);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.f8s
    public final long a() {
        int i;
        long a;
        x5e[] x5eVarArr;
        x5e[] x5eVarArr2;
        switch (this.e) {
            case 0:
                o5e o5eVar = (o5e) this.f;
                o5eVar.a.a(o5eVar, (app) ((xqn) this.g).a);
                return -1L;
            case 1:
                try {
                    ((o5e) this.f).a.b((x5e) this.g);
                } catch (IOException e) {
                    otk otkVar = otk.a;
                    otk otkVar2 = otk.a;
                    String str = "Http2Connection.Listener failure for " + ((o5e) this.f).c;
                    otkVar2.getClass();
                    otk.i(4, str, e);
                    try {
                        ((x5e) this.g).c(2, e);
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                uv uvVar = (uv) this.f;
                app appVar = (app) this.g;
                xqn xqnVar = new xqn();
                o5e o5eVar2 = (o5e) uvVar.c;
                synchronized (o5eVar2.w) {
                    synchronized (o5eVar2) {
                        try {
                            app appVar2 = o5eVar2.q;
                            app appVar3 = new app();
                            appVar2.getClass();
                            i = 0;
                            for (int i2 = 0; i2 < 10; i2++) {
                                if (((1 << i2) & appVar2.a) != 0) {
                                    appVar3.b(i2, appVar2.b[i2]);
                                }
                            }
                            for (int i3 = 0; i3 < 10; i3++) {
                                if (((1 << i3) & appVar.a) != 0) {
                                    appVar3.b(i3, appVar.b[i3]);
                                }
                            }
                            xqnVar.a = appVar3;
                            a = appVar3.a() - appVar2.a();
                            if (a != 0 && !o5eVar2.b.isEmpty()) {
                                x5eVarArr = (x5e[]) o5eVar2.b.values().toArray(new x5e[0]);
                                x5eVarArr2 = x5eVarArr;
                                app appVar4 = (app) xqnVar.a;
                                appVar4.getClass();
                                o5eVar2.q = appVar4;
                                o5eVar2.j.c(new j5e(o5eVar2.c + " onSettings", o5eVar2, xqnVar, i), 0L);
                            }
                            x5eVarArr = null;
                            x5eVarArr2 = x5eVarArr;
                            app appVar42 = (app) xqnVar.a;
                            appVar42.getClass();
                            o5eVar2.q = appVar42;
                            o5eVar2.j.c(new j5e(o5eVar2.c + " onSettings", o5eVar2, xqnVar, i), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        o5eVar2.w.a((app) xqnVar.a);
                    } catch (IOException e2) {
                        o5eVar2.a(2, 2, e2);
                    }
                }
                if (x5eVarArr2 != null) {
                    int length = x5eVarArr2.length;
                    while (i < length) {
                        x5e x5eVar = x5eVarArr2[i];
                        synchronized (x5eVar) {
                            x5eVar.f += a;
                            if (a > 0) {
                                x5eVar.notifyAll();
                            }
                        }
                        i++;
                    }
                }
                return -1L;
        }
    }
}
