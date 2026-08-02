package ru.yandex.taxi.masstransit.main.flex;

import android.content.Context;
import defpackage.aks0;
import defpackage.bgu;
import defpackage.bi30;
import defpackage.bzp0;
import defpackage.cnr0;
import defpackage.cvu0;
import defpackage.czp0;
import defpackage.dzp0;
import defpackage.hi30;
import defpackage.ny61;
import defpackage.oz30;
import defpackage.qje;
import defpackage.u1m;
import defpackage.ui30;
import defpackage.uwl;
import defpackage.xng0;
import defpackage.ywl;
import defpackage.zy11;
import java.util.Collections;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class b {
    public final flex.engine.a a;
    public final Context b;
    public final c c;
    public final hi30 d;

    public b(flex.engine.a aVar, Context context, ui30 ui30Var, c cVar, hi30 hi30Var) {
        this.a = aVar;
        this.b = context;
        this.c = cVar;
        this.d = hi30Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        MtLoadDocumentInteractor$loadDocument$1 mtLoadDocumentInteractor$loadDocument$1;
        int i;
        String str;
        if (continuationImpl instanceof MtLoadDocumentInteractor$loadDocument$1) {
            mtLoadDocumentInteractor$loadDocument$1 = (MtLoadDocumentInteractor$loadDocument$1) continuationImpl;
            int i2 = mtLoadDocumentInteractor$loadDocument$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtLoadDocumentInteractor$loadDocument$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtLoadDocumentInteractor$loadDocument$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtLoadDocumentInteractor$loadDocument$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mtLoadDocumentInteractor$loadDocument$1.label = 1;
                    obj = this.c.b(mtLoadDocumentInteractor$loadDocument$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                u1m u1mVar = (u1m) obj;
                bi30 bi30Var = (bi30) this.d.b.getValue();
                this.a.p(u1mVar, new ywl((bi30Var != null || (str = bi30Var.b) == null || str.length() == 0) ? new dzp0(new czp0(false, new bzp0(null)), Collections.singletonList(oz30.INSTANCE), null, null, null, null) : new aks0(cvu0.v(str, "$COLOR$", bgu.d(qje.u(this.b.getTheme(), xng0.bgMinor)).toUpperCase(Locale.ROOT), false), null), null, cnr0.b, new uwl(null, null, null, null, null, null), null, null), true);
                return zy11.a;
            }
        }
        mtLoadDocumentInteractor$loadDocument$1 = new MtLoadDocumentInteractor$loadDocument$1(this, continuationImpl);
        Object obj2 = mtLoadDocumentInteractor$loadDocument$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtLoadDocumentInteractor$loadDocument$1.label;
        if (i != 0) {
        }
        u1m u1mVar2 = (u1m) obj2;
        bi30 bi30Var2 = (bi30) this.d.b.getValue();
        this.a.p(u1mVar2, new ywl((bi30Var2 != null || (str = bi30Var2.b) == null || str.length() == 0) ? new dzp0(new czp0(false, new bzp0(null)), Collections.singletonList(oz30.INSTANCE), null, null, null, null) : new aks0(cvu0.v(str, "$COLOR$", bgu.d(qje.u(this.b.getTheme(), xng0.bgMinor)).toUpperCase(Locale.ROOT), false), null), null, cnr0.b, new uwl(null, null, null, null, null, null), null, null), true);
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Continuation continuation) {
        MtLoadDocumentInteractor$silentLoadDocument$1 mtLoadDocumentInteractor$silentLoadDocument$1;
        int i;
        if (continuation instanceof MtLoadDocumentInteractor$silentLoadDocument$1) {
            mtLoadDocumentInteractor$silentLoadDocument$1 = (MtLoadDocumentInteractor$silentLoadDocument$1) continuation;
            int i2 = mtLoadDocumentInteractor$silentLoadDocument$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtLoadDocumentInteractor$silentLoadDocument$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtLoadDocumentInteractor$silentLoadDocument$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtLoadDocumentInteractor$silentLoadDocument$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mtLoadDocumentInteractor$silentLoadDocument$1.label = 1;
                    obj = this.c.b(mtLoadDocumentInteractor$silentLoadDocument$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                flex.engine.a.q(this.a, (u1m) obj, null, true, 2);
                return zy11.a;
            }
        }
        mtLoadDocumentInteractor$silentLoadDocument$1 = new MtLoadDocumentInteractor$silentLoadDocument$1(this, continuation);
        Object obj2 = mtLoadDocumentInteractor$silentLoadDocument$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtLoadDocumentInteractor$silentLoadDocument$1.label;
        if (i != 0) {
        }
        flex.engine.a.q(this.a, (u1m) obj2, null, true, 2);
        return zy11.a;
    }
}
