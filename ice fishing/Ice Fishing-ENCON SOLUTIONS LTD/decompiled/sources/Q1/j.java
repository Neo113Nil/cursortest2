package Q1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class j extends M1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1604e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1605f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1606g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, Object obj, Object obj2, int i2) {
        super(str, true);
        this.f1604e = i2;
        this.f1605f = obj;
        this.f1606g = obj2;
    }

    @Override // M1.a
    public final long a() {
        long a2;
        y[] yVarArr;
        int i2 = 0;
        switch (this.f1604e) {
            case 0:
                q qVar = (q) this.f1605f;
                qVar.f1626a.a(qVar, (D) ((kotlin.jvm.internal.p) this.f1606g).f8076a);
                return -1L;
            case 1:
                try {
                    ((q) this.f1605f).f1626a.b((y) this.f1606g);
                } catch (IOException e2) {
                    R1.n nVar = R1.n.f1772a;
                    R1.n nVar2 = R1.n.f1772a;
                    String h2 = kotlin.jvm.internal.i.h(((q) this.f1605f).f1628c, "Http2Connection.Listener failure for ");
                    nVar2.getClass();
                    R1.n.i(h2, 4, e2);
                    try {
                        ((y) this.f1606g).c(EnumC0079b.PROTOCOL_ERROR, e2);
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                l lVar = (l) this.f1605f;
                D d2 = (D) this.f1606g;
                lVar.getClass();
                kotlin.jvm.internal.p pVar = new kotlin.jvm.internal.p();
                q qVar2 = lVar.f1611b;
                synchronized (qVar2.f1647w) {
                    synchronized (qVar2) {
                        try {
                            D d3 = qVar2.f1642q;
                            D d4 = new D();
                            d4.b(d3);
                            d4.b(d2);
                            pVar.f8076a = d4;
                            a2 = d4.a() - d3.a();
                            if (a2 != 0 && !qVar2.f1627b.isEmpty()) {
                                Object[] array = qVar2.f1627b.values().toArray(new y[0]);
                                if (array == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                }
                                yVarArr = (y[]) array;
                                D d5 = (D) pVar.f8076a;
                                kotlin.jvm.internal.i.e(d5, "<set-?>");
                                qVar2.f1642q = d5;
                                qVar2.f1635j.c(new j(kotlin.jvm.internal.i.h(" onSettings", qVar2.f1628c), qVar2, pVar, i2), 0L);
                            }
                            yVarArr = null;
                            D d52 = (D) pVar.f8076a;
                            kotlin.jvm.internal.i.e(d52, "<set-?>");
                            qVar2.f1642q = d52;
                            qVar2.f1635j.c(new j(kotlin.jvm.internal.i.h(" onSettings", qVar2.f1628c), qVar2, pVar, i2), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        qVar2.f1647w.a((D) pVar.f8076a);
                    } catch (IOException e3) {
                        qVar2.b(e3);
                    }
                }
                if (yVarArr != null) {
                    int length = yVarArr.length;
                    while (i2 < length) {
                        y yVar = yVarArr[i2];
                        i2++;
                        synchronized (yVar) {
                            yVar.f1684f += a2;
                            if (a2 > 0) {
                                yVar.notifyAll();
                            }
                        }
                    }
                }
                return -1L;
        }
    }
}
