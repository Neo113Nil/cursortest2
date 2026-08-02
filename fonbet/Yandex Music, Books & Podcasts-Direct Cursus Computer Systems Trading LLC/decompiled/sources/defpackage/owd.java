package defpackage;

import io.grpc.internal.a;
import java.net.SocketAddress;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class owd implements beg {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ owd(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // defpackage.beg
    public final void a(s76 s76Var) {
        zdg zdgVar;
        aeg askVar;
        switch (this.a) {
            case 0:
                ((beg) this.b).a(s76Var);
                ((pwd) this.c).c.a(s76Var);
                break;
            case 1:
                xxj xxjVar = (xxj) this.c;
                xxjVar.e = s76Var;
                if (!xxjVar.d) {
                    ((beg) this.b).a(s76Var);
                    break;
                }
                break;
            case 2:
                a aVar = (a) this.c;
                zdg zdgVar2 = (zdg) this.b;
                wdg wdgVar = aVar.g;
                r76 r76Var = s76Var.a;
                HashMap hashMap = aVar.h;
                yrk yrkVar = (yrk) hashMap.get((SocketAddress) zdgVar2.s().a.get(0));
                if (yrkVar != null && (zdgVar = yrkVar.a) == zdgVar2 && r76Var != r76.e) {
                    r76 r76Var2 = r76.d;
                    if (r76Var == r76Var2) {
                        wdgVar.W();
                    }
                    yrkVar.b = r76Var;
                    r76 r76Var3 = aVar.j;
                    r76 r76Var4 = r76.a;
                    r76 r76Var5 = r76.c;
                    if (r76Var3 == r76Var5 || aVar.k == r76Var5) {
                        if (r76Var != r76Var4) {
                            if (r76Var == r76Var2) {
                                aVar.x();
                                break;
                            }
                        }
                    }
                    int ordinal = r76Var.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal == 3) {
                                    lwe lweVar = aVar.i;
                                    lweVar.b = 0;
                                    lweVar.c = 0;
                                    aVar.j = r76Var2;
                                    aVar.A(r76Var2, new xrk(aVar, aVar));
                                    break;
                                } else {
                                    kac.j(r76Var, "Unsupported state:");
                                    break;
                                }
                            } else if (aVar.i.c() && ((yrk) hashMap.get(aVar.i.a())).a == zdgVar2) {
                                aVar.i.b();
                                aVar.x();
                                if (!aVar.i.c()) {
                                    wdgVar.W();
                                    aVar.j = r76Var5;
                                    aVar.A(r76Var5, new wrk(xdg.a(s76Var.b), 0));
                                    break;
                                }
                            }
                        } else {
                            for (yrk yrkVar2 : hashMap.values()) {
                                if (!yrkVar2.a.equals(zdgVar)) {
                                    yrkVar2.a.F();
                                }
                            }
                            hashMap.clear();
                            r76 r76Var6 = r76.b;
                            yrkVar.b = r76Var6;
                            hashMap.put((SocketAddress) zdgVar.s().a.get(0), yrkVar);
                            aVar.i.e((SocketAddress) zdgVar2.s().a.get(0));
                            aVar.j = r76Var6;
                            aVar.B(yrkVar);
                            break;
                        }
                    } else {
                        aVar.j = r76Var4;
                        aVar.A(r76Var4, new wrk(xdg.e, 0));
                        break;
                    }
                }
                break;
            default:
                bsk bskVar = (bsk) this.c;
                wdg wdgVar2 = bskVar.g;
                zdg zdgVar3 = (zdg) this.b;
                r76 r76Var7 = s76Var.a;
                if (r76Var7 != r76.e) {
                    r76 r76Var8 = r76.d;
                    r76 r76Var9 = r76.c;
                    if (r76Var7 == r76Var9 || r76Var7 == r76Var8) {
                        wdgVar2.W();
                    }
                    if (bskVar.i == r76Var9) {
                        if (r76Var7 != r76.a) {
                            if (r76Var7 == r76Var8) {
                                bskVar.x();
                                break;
                            }
                        }
                    }
                    int ordinal2 = r76Var7.ordinal();
                    if (ordinal2 == 0) {
                        askVar = new ask(xdg.e);
                    } else if (ordinal2 == 1) {
                        askVar = new ask(xdg.b(zdgVar3, null));
                    } else if (ordinal2 == 2) {
                        askVar = new ask(xdg.a(s76Var.b));
                    } else if (ordinal2 != 3) {
                        kac.j(r76Var7, "Unsupported state:");
                        break;
                    } else {
                        askVar = new xrk(bskVar, zdgVar3);
                    }
                    bskVar.i = r76Var7;
                    wdgVar2.Z(r76Var7, askVar);
                    break;
                }
                break;
        }
    }
}
