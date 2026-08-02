package ru.yandex.taxi.logistics.sdk.concurrency;

import defpackage.bvf0;
import defpackage.fse;
import defpackage.fyc;
import defpackage.ike;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.sb2;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public abstract class b implements tse {
    public final /* synthetic */ ike a;
    public final kotlinx.coroutines.channels.a b = sb2.a(Integer.MAX_VALUE, null, null, 6);

    public b(fse fseVar) {
        this.a = bvf0.a(fseVar.plus(jl40.a()));
        tje.N(this, null, null, new Actor$1(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(tls tlsVar, ContinuationImpl continuationImpl) {
        Actor$act$1 actor$act$1;
        int i;
        a aVar;
        if (continuationImpl instanceof Actor$act$1) {
            actor$act$1 = (Actor$act$1) continuationImpl;
            int i2 = actor$act$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                actor$act$1.label = i2 - Integer.MIN_VALUE;
                Object obj = actor$act$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = actor$act$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar2 = new a(tlsVar);
                    actor$act$1.L$0 = null;
                    actor$act$1.L$1 = aVar2;
                    actor$act$1.label = 1;
                    if (this.b.o(aVar2, actor$act$1) != coroutineSingletons) {
                        aVar = aVar2;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                aVar = (a) actor$act$1.L$1;
                kotlin.b.b(obj);
                fyc fycVar = aVar.c;
                actor$act$1.L$0 = null;
                actor$act$1.L$1 = null;
                actor$act$1.label = 2;
                Object s = fycVar.s(actor$act$1);
                return s != coroutineSingletons ? coroutineSingletons : s;
            }
        }
        actor$act$1 = new Actor$act$1(this, continuationImpl);
        Object obj2 = actor$act$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = actor$act$1.label;
        if (i != 0) {
        }
        fyc fycVar2 = aVar.c;
        actor$act$1.L$0 = null;
        actor$act$1.L$1 = null;
        actor$act$1.label = 2;
        Object s2 = fycVar2.s(actor$act$1);
        if (s2 != coroutineSingletons2) {
        }
    }

    public abstract Object b(ContinuationImpl continuationImpl);

    public final void c(tls tlsVar) {
        this.b.d(new a(tlsVar));
    }

    @Override // defpackage.tse
    public final fse getCoroutineContext() {
        return this.a.a;
    }
}
