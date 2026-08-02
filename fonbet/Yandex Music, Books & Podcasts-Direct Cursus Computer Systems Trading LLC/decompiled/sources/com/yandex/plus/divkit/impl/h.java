package com.yandex.plus.divkit.impl;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import defpackage.aur;
import defpackage.mm6;
import defpackage.n7w;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.qq3;
import defpackage.t33;
import defpackage.t7o;
import defpackage.vq2;
import defpackage.x97;
import defpackage.xq0;
import defpackage.z7o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class h extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ i l;
    public final /* synthetic */ String m;
    public final /* synthetic */ n7w n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, String str, n7w n7wVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = iVar;
        this.m = str;
        this.n = n7wVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new h(this.l, this.m, this.n, continuation, 0);
            default:
                return new h(this.l, this.m, this.n, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((h) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                String str = this.m;
                if (i == 0) {
                    qgg.h0(obj);
                    i iVar = this.l;
                    kotlinx.coroutines.a aVar = iVar.c;
                    g gVar = new g(iVar, str, null, 0);
                    this.k = 1;
                    obj = x97.V(aVar, gVar, this);
                    if (obj == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                Object obj2 = ((z7o) obj).a;
                boolean z = obj2 instanceof t7o;
                n7w n7wVar = this.n;
                if (!z) {
                    n7wVar.X(new qq3(vq2.N((Drawable) obj2, 0, 0, 7), Uri.parse(str), t33.a, 0));
                }
                if (z7o.a(obj2) != null) {
                    n7wVar.T();
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                String str2 = this.m;
                if (i2 == 0) {
                    qgg.h0(obj);
                    i iVar2 = this.l;
                    kotlinx.coroutines.a aVar2 = iVar2.c;
                    g gVar2 = new g(iVar2, str2, null, 1);
                    this.k = 1;
                    obj = x97.V(aVar2, gVar2, this);
                    if (obj == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                Object obj3 = ((z7o) obj).a;
                boolean z2 = obj3 instanceof t7o;
                n7w n7wVar2 = this.n;
                if (!z2) {
                    n7wVar2.X(new qq3(vq2.N((Drawable) obj3, 0, 0, 7), Uri.parse(str2), t33.a, 0));
                }
                if (z7o.a(obj3) != null) {
                    n7wVar2.T();
                }
                break;
        }
        return Unit.a;
    }
}
