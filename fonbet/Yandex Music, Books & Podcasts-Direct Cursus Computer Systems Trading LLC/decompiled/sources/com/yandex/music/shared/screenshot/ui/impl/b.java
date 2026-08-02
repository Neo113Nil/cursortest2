package com.yandex.music.shared.screenshot.ui.impl;

import android.net.Uri;
import defpackage.aur;
import defpackage.ca8;
import defpackage.dq7;
import defpackage.gm5;
import defpackage.mm6;
import defpackage.mn7;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.qvo;
import defpackage.rvo;
import defpackage.ssg;
import defpackage.svo;
import defpackage.vvo;
import defpackage.x97;
import defpackage.xod;
import defpackage.xq0;
import defpackage.xqn;
import defpackage.yvo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class b extends aur implements Function2 {
    public xqn j;
    public int k;
    public final /* synthetic */ Function1 l;
    public final /* synthetic */ gm5 m;
    public final /* synthetic */ xod n;
    public final /* synthetic */ vvo o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Function1 function1, gm5 gm5Var, xod xodVar, vvo vvoVar, Continuation continuation) {
        super(2, continuation);
        yvo[] yvoVarArr = yvo.a;
        this.l = function1;
        this.m = gm5Var;
        this.n = xodVar;
        this.o = vvoVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        yvo[] yvoVarArr = yvo.a;
        return new b(this.l, this.m, this.n, this.o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        if (r9.m.s(r9) == r0) goto L21;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        xqn xqnVar;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        Function1 function1 = this.l;
        try {
        } catch (ScreenshotSaveException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            ssg.a(3, "ScreenshotCreatorImpl", message, null);
            function1.invoke(new qvo(e));
        } catch (IllegalArgumentException e2) {
            ssg.a(6, "ScreenshotCreatorImpl", "Passed empty screenshot UI. Error: " + e2.getMessage(), null);
            function1.invoke(new qvo(e2));
        }
        if (i == 0) {
            qgg.h0(obj);
            function1.invoke(rvo.a);
            this.k = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xqnVar = this.j;
                qgg.h0(obj);
                function1.invoke(new svo((Uri) xqnVar.a));
                return Unit.a;
            }
            qgg.h0(obj);
        }
        xqn xqnVar2 = new xqn();
        dq7 dq7Var = ca8.a;
        mn7 mn7Var = mn7.d;
        xod xodVar = this.n;
        yvo[] yvoVarArr = yvo.a;
        a aVar = new a(xodVar, xqnVar2, this.o, null);
        this.j = xqnVar2;
        this.k = 2;
        if (x97.V(mn7Var, aVar, this) != nm6Var) {
            xqnVar = xqnVar2;
            function1.invoke(new svo((Uri) xqnVar.a));
            return Unit.a;
        }
        return nm6Var;
    }
}
