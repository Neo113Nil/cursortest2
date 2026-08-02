package com.yandex.plus.pay.adapter.api;

import defpackage.cg6;
import defpackage.fd;
import defpackage.gm5;
import defpackage.hld;
import defpackage.hpc;
import defpackage.ipc;
import defpackage.nm6;
import defpackage.ouj;
import defpackage.psd;
import defpackage.pz2;
import defpackage.qgg;
import defpackage.uz2;
import defpackage.xq0;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class h0 implements com.yandex.plus.pay.inapp.google.common.internal.operation.b {
    public final /* synthetic */ int a;
    public final String b;
    public final String c;

    public h0(String str, int i) {
        this.a = i;
        switch (i) {
            case 2:
                str.getClass();
                this.b = str;
                this.c = ouj.k(')', "consume(", str);
                break;
            case 3:
                this.b = str;
                this.c = ouj.k(')', "getPurchases(", str);
                break;
            default:
                str.getClass();
                this.b = str;
                this.c = ouj.k(')', "acknowledge(", str);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(pz2 pz2Var, cg6 cg6Var) {
        com.yandex.plus.pay.inapp.google.internal.operation.a aVar;
        int i;
        com.yandex.plus.pay.inapp.google.internal.operation.b bVar;
        int i2;
        com.yandex.plus.pay.inapp.google.internal.operation.e eVar;
        int i3;
        switch (this.a) {
            case 1:
                if (cg6Var instanceof com.yandex.plus.pay.inapp.google.internal.operation.a) {
                    aVar = (com.yandex.plus.pay.inapp.google.internal.operation.a) cg6Var;
                    int i4 = aVar.l;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        aVar.l = i4 - Integer.MIN_VALUE;
                        Object obj = aVar.j;
                        nm6 nm6Var = nm6.a;
                        i = aVar.l;
                        if (i == 0) {
                            if (i == 1) {
                                qgg.h0(obj);
                                return new com.yandex.plus.pay.inapp.google.common.internal.operation.c(Unit.a, com.yandex.plus.bdui.flex.ui.a.G((uz2) obj));
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        String str = this.b;
                        if (str == null) {
                            xq0.x("Purchase token must be set");
                            return null;
                        }
                        fd fdVar = new fd();
                        fdVar.a = str;
                        aVar.l = 1;
                        gm5 j = hld.j();
                        pz2Var.a(fdVar, new com.yandex.plus.pay.inapp.google.internal.a(j));
                        obj = j.s(aVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        return new com.yandex.plus.pay.inapp.google.common.internal.operation.c(Unit.a, com.yandex.plus.bdui.flex.ui.a.G((uz2) obj));
                    }
                }
                aVar = new com.yandex.plus.pay.inapp.google.internal.operation.a(this, cg6Var);
                Object obj2 = aVar.j;
                nm6 nm6Var2 = nm6.a;
                i = aVar.l;
                if (i == 0) {
                }
            case 2:
                if (cg6Var instanceof com.yandex.plus.pay.inapp.google.internal.operation.b) {
                    bVar = (com.yandex.plus.pay.inapp.google.internal.operation.b) cg6Var;
                    int i5 = bVar.l;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        bVar.l = i5 - Integer.MIN_VALUE;
                        Object obj3 = bVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = bVar.l;
                        if (i2 == 0) {
                            if (i2 == 1) {
                                qgg.h0(obj3);
                                return new com.yandex.plus.pay.inapp.google.common.internal.operation.c(Unit.a, com.yandex.plus.bdui.flex.ui.a.G((uz2) obj3));
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj3);
                        String str2 = this.b;
                        if (str2 == null) {
                            xq0.x("Purchase token must be set");
                            return null;
                        }
                        psd psdVar = new psd(1);
                        psdVar.b = str2;
                        bVar.l = 1;
                        gm5 j2 = hld.j();
                        pz2Var.b(psdVar, new com.yandex.plus.pay.inapp.google.internal.a(j2));
                        obj3 = j2.s(bVar);
                        if (obj3 == nm6Var3) {
                            return nm6Var3;
                        }
                        return new com.yandex.plus.pay.inapp.google.common.internal.operation.c(Unit.a, com.yandex.plus.bdui.flex.ui.a.G((uz2) obj3));
                    }
                }
                bVar = new com.yandex.plus.pay.inapp.google.internal.operation.b(this, cg6Var);
                Object obj32 = bVar.j;
                nm6 nm6Var32 = nm6.a;
                i2 = bVar.l;
                if (i2 == 0) {
                }
            default:
                if (cg6Var instanceof com.yandex.plus.pay.inapp.google.internal.operation.e) {
                    eVar = (com.yandex.plus.pay.inapp.google.internal.operation.e) cg6Var;
                    int i6 = eVar.l;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        eVar.l = i6 - Integer.MIN_VALUE;
                        Object obj4 = eVar.j;
                        nm6 nm6Var4 = nm6.a;
                        i3 = eVar.l;
                        if (i3 != 0) {
                            qgg.h0(obj4);
                            hpc hpcVar = new hpc();
                            hpcVar.b = this.b;
                            ipc b = hpcVar.b();
                            eVar.l = 1;
                            gm5 j3 = hld.j();
                            pz2Var.g(b, new com.yandex.plus.pay.inapp.google.internal.a(j3));
                            obj4 = j3.s(eVar);
                            if (obj4 == nm6Var4) {
                                return nm6Var4;
                            }
                        } else {
                            if (i3 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj4);
                        }
                        com.yandex.plus.pay.inapp.google.internal.j jVar = (com.yandex.plus.pay.inapp.google.internal.j) obj4;
                        return new com.yandex.plus.pay.inapp.google.common.internal.operation.c(jVar.b, com.yandex.plus.bdui.flex.ui.a.G(jVar.a));
                    }
                }
                eVar = new com.yandex.plus.pay.inapp.google.internal.operation.e(this, cg6Var);
                Object obj42 = eVar.j;
                nm6 nm6Var42 = nm6.a;
                i3 = eVar.l;
                if (i3 != 0) {
                }
                com.yandex.plus.pay.inapp.google.internal.j jVar2 = (com.yandex.plus.pay.inapp.google.internal.j) obj42;
                return new com.yandex.plus.pay.inapp.google.common.internal.operation.c(jVar2.b, com.yandex.plus.bdui.flex.ui.a.G(jVar2.a));
        }
    }

    @Override // com.yandex.plus.pay.inapp.google.common.internal.operation.b
    public /* bridge */ /* synthetic */ Object g(Object obj, cg6 cg6Var) {
        switch (this.a) {
        }
        return a((pz2) obj, cg6Var);
    }

    @Override // com.yandex.plus.pay.inapp.google.common.internal.operation.b
    public String getName() {
        switch (this.a) {
        }
        return this.c;
    }

    public h0(String str, String str2) {
        this.a = 0;
        this.b = str;
        this.c = str2;
    }
}
