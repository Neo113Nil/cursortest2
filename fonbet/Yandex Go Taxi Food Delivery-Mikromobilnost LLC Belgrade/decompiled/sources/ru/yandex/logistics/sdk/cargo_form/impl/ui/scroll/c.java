package ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll;

import defpackage.ny61;
import defpackage.qip0;
import defpackage.scc;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;
    public final /* synthetic */ Anchor c;

    public c(vpr vprVar, e eVar, Anchor anchor) {
        this.a = vprVar;
        this.b = eVar;
        this.c = anchor;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScrollTagStateHolder$tagFlow$lambda$1$$inlined$map$1$2$1 scrollTagStateHolder$tagFlow$lambda$1$$inlined$map$1$2$1;
        int i;
        qip0 qip0Var;
        if (continuation instanceof ScrollTagStateHolder$tagFlow$lambda$1$$inlined$map$1$2$1) {
            scrollTagStateHolder$tagFlow$lambda$1$$inlined$map$1$2$1 = (ScrollTagStateHolder$tagFlow$lambda$1$$inlined$map$1$2$1) continuation;
            int i2 = scrollTagStateHolder$tagFlow$lambda$1$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scrollTagStateHolder$tagFlow$lambda$1$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scrollTagStateHolder$tagFlow$lambda$1$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scrollTagStateHolder$tagFlow$lambda$1$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = (List) obj;
                    this.b.getClass();
                    qip0 qip0Var2 = this.c == Anchor.TOP ? (qip0) kotlin.collections.a.b0(list) : (qip0) kotlin.collections.a.R(list);
                    if (qip0Var2 == null) {
                        qip0Var = null;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        int i3 = 0;
                        for (Object obj3 : list) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                scc.m();
                                throw null;
                            }
                            qip0 qip0Var3 = (qip0) obj3;
                            sb.append(i3 == 0 ? qip0Var3.b : qip0Var3.b.toLowerCase(Locale.ROOT));
                            if (i3 != scc.f(list)) {
                                sb.append(Extension.FIX_SPACE);
                            }
                            i3 = i4;
                        }
                        qip0Var = new qip0(qip0Var2.a, sb.toString(), qip0Var2.c);
                    }
                    scrollTagStateHolder$tagFlow$lambda$1$$inlined$map$1$2$1.L$0 = null;
                    scrollTagStateHolder$tagFlow$lambda$1$$inlined$map$1$2$1.L$1 = null;
                    scrollTagStateHolder$tagFlow$lambda$1$$inlined$map$1$2$1.L$2 = null;
                    scrollTagStateHolder$tagFlow$lambda$1$$inlined$map$1$2$1.L$3 = null;
                    scrollTagStateHolder$tagFlow$lambda$1$$inlined$map$1$2$1.I$0 = 0;
                    scrollTagStateHolder$tagFlow$lambda$1$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(qip0Var, scrollTagStateHolder$tagFlow$lambda$1$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        scrollTagStateHolder$tagFlow$lambda$1$$inlined$map$1$2$1 = new ScrollTagStateHolder$tagFlow$lambda$1$$inlined$map$1$2$1(this, continuation);
        Object obj22 = scrollTagStateHolder$tagFlow$lambda$1$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scrollTagStateHolder$tagFlow$lambda$1$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
