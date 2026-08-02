package ru.yandex.taxi.zalogin;

import defpackage.ny61;
import defpackage.r40;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.analytics.Events$Zalogin$LinkageContext;

/* loaded from: classes6.dex */
public final class h implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ j b;
    public final /* synthetic */ Events$Zalogin$LinkageContext c;

    public h(vpr vprVar, j jVar, Events$Zalogin$LinkageContext events$Zalogin$LinkageContext) {
        this.a = vprVar;
        this.b = jVar;
        this.c = events$Zalogin$LinkageContext;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0093, code lost:
    
        if (r6.emit(r8, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LinkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1 linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1;
        int i;
        Object b;
        vpr vprVar;
        if (continuation instanceof LinkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1) {
            linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1 = (LinkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1) continuation;
            int i2 = linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1.L$0 = null;
                    linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1.L$1 = null;
                    linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1.L$2 = null;
                    linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1.L$4 = vprVar2;
                    linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1.L$5 = null;
                    linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1.L$6 = null;
                    linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1.label = 1;
                    b = j.b(this.b, (r40) obj, this.c, linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1);
                    if (b != coroutineSingletons) {
                        vprVar = vprVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                vprVar = (vpr) linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                b = ((Result) obj2).getValue();
                Result result = new Result(b);
                linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1.L$0 = null;
                linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1.L$1 = null;
                linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1.L$2 = null;
                linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1.L$3 = null;
                linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1.L$4 = null;
                linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1.L$5 = null;
                linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1.L$6 = null;
                linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1.label = 2;
            }
        }
        linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1 = new LinkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1(this, continuation);
        Object obj22 = linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        Result result2 = new Result(b);
        linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1.L$0 = null;
        linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1.L$1 = null;
        linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1.L$2 = null;
        linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1.L$3 = null;
        linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1.L$4 = null;
        linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1.L$5 = null;
        linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1.L$6 = null;
        linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$2$1.label = 2;
    }
}
