package com.yandex.plus.home.internal.di;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;

/* loaded from: classes5.dex */
public final class i {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ i(l lVar, int i) {
        this.a = i;
        this.b = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        h hVar;
        int i;
        j jVar;
        int i2;
        switch (this.a) {
            case 0:
                if (cg6Var instanceof h) {
                    hVar = (h) cg6Var;
                    int i3 = hVar.l;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        hVar.l = i3 - Integer.MIN_VALUE;
                        Object obj = hVar.j;
                        nm6 nm6Var = nm6.a;
                        i = hVar.l;
                        if (i != 0) {
                            qgg.h0(obj);
                            com.yandex.plus.domain.auth.impl.i iVar = this.b.g;
                            hVar.l = 1;
                            obj = iVar.e(hVar);
                            if (obj == nm6Var) {
                                return nm6Var;
                            }
                        } else {
                            if (i != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj);
                        }
                        return ((com.yandex.plus.domain.auth.api.e) obj).getId();
                    }
                }
                hVar = new h(this, cg6Var);
                Object obj2 = hVar.j;
                nm6 nm6Var2 = nm6.a;
                i = hVar.l;
                if (i != 0) {
                }
                return ((com.yandex.plus.domain.auth.api.e) obj2).getId();
            default:
                if (cg6Var instanceof j) {
                    jVar = (j) cg6Var;
                    int i4 = jVar.l;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        jVar.l = i4 - Integer.MIN_VALUE;
                        Object obj3 = jVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = jVar.l;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            com.yandex.plus.domain.auth.impl.i iVar2 = this.b.g;
                            jVar.l = 1;
                            obj3 = iVar2.e(jVar);
                            if (obj3 == nm6Var3) {
                                return nm6Var3;
                            }
                        } else {
                            if (i2 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj3);
                        }
                        return ((com.yandex.plus.domain.auth.api.e) obj3).getId();
                    }
                }
                jVar = new j(this, cg6Var);
                Object obj32 = jVar.j;
                nm6 nm6Var32 = nm6.a;
                i2 = jVar.l;
                if (i2 != 0) {
                }
                return ((com.yandex.plus.domain.auth.api.e) obj32).getId();
        }
    }
}
