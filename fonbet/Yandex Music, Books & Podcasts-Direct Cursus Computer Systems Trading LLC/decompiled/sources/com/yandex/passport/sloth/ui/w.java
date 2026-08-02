package com.yandex.passport.sloth.ui;

import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.net.Uri;
import defpackage.aur;
import defpackage.dxd;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.qxe;
import defpackage.sh;
import defpackage.vnj;
import defpackage.x0q;
import defpackage.xq0;
import defpackage.zh;
import defpackage.zt3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class w extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ b0 l;
    public final /* synthetic */ String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(b0 b0Var, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = b0Var;
        this.m = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new w(this.l, this.m, continuation, 0);
            default:
                return new w(this.l, this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((w) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    ComponentCallbacks2 componentCallbacks2 = this.l.l;
                    sh shVar = componentCallbacks2 instanceof sh ? (sh) componentCallbacks2 : null;
                    if (shVar != null) {
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.m));
                        this.k = 1;
                        zt3 zt3Var = new zt3(1, qxe.b(this));
                        zt3Var.s();
                        zh v = vnj.v(shVar, new dxd(0, intent), new v(zt3Var, 0));
                        v.a(Unit.a);
                        zt3Var.u(new com.yandex.passport.common.util.e(5, v));
                        obj = zt3Var.q();
                        if (obj == nm6Var) {
                            break;
                        }
                    }
                    break;
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    x0q x0qVar = this.l.A;
                    this.k = 1;
                    if (x0qVar.emit(this.m, this) == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }
}
