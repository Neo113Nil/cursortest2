package ru.yandex.taxi.zalogin;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.t;
import ru.yandex.taxi.analytics.Events$Zalogin$LinkageContext;

/* loaded from: classes6.dex */
public final class i implements tpr {
    public final /* synthetic */ t a;
    public final /* synthetic */ j b;
    public final /* synthetic */ Events$Zalogin$LinkageContext c;

    public i(t tVar, j jVar, Events$Zalogin$LinkageContext events$Zalogin$LinkageContext) {
        this.a = tVar;
        this.b = jVar;
        this.c = events$Zalogin$LinkageContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        LinkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$1 linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$1;
        int i;
        if (continuation instanceof LinkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$1) {
            linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$1 = (LinkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$1) continuation;
            int i2 = linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    h hVar = new h(vprVar, this.b, this.c);
                    linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$1.L$0 = null;
                    linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$1.L$1 = null;
                    linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$1.L$2 = null;
                    linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$1.label = 1;
                    if (this.a.collect(hVar, linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$1 = new LinkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$1(this, continuation);
        Object obj2 = linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = linkAccountsController$openLinkAccountLoginActivityyxL6bBk$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
