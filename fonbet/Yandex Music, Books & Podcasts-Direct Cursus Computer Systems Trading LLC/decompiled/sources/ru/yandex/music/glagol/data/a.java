package ru.yandex.music.glagol.data;

import defpackage.aur;
import defpackage.hgp;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.qqi;
import defpackage.xq0;
import defpackage.yhd;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class a extends aur implements Function2 {
    public qqi j;
    public b k;
    public int l;
    public final /* synthetic */ b m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.m = bVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.m, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        if (r1.d(r8) == r0) goto L23;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        qqi qqiVar;
        b bVar;
        nm6 nm6Var = nm6.a;
        int i = this.l;
        b bVar2 = this.m;
        try {
            if (i == 0) {
                qgg.h0(obj);
                qqi qqiVar2 = bVar2.h;
                this.j = qqiVar2;
                this.k = bVar2;
                this.l = 1;
                if (qqiVar2.a(this) != nm6Var) {
                    qqiVar = qqiVar2;
                    bVar = bVar2;
                }
                return nm6Var;
            }
            if (i != 1) {
                if (i == 2) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = this.k;
            qqiVar = this.j;
            qgg.h0(obj);
            yhd yhdVar = bVar.i;
            if (yhdVar != null) {
                yhdVar.c.u(new GlagolQueueTracksInfoAppender$RefreshJobCancellationException("release"));
            }
            bVar.i = null;
            qqiVar.b(null);
            hgp hgpVar = bVar2.j;
            this.j = null;
            this.k = null;
            this.l = 2;
        } catch (Throwable th) {
            qqiVar.b(null);
            throw th;
        }
    }
}
