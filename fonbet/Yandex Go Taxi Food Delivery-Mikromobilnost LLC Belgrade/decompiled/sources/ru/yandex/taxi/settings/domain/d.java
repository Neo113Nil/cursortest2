package ru.yandex.taxi.settings.domain;

import defpackage.ha2;
import defpackage.hbp0;
import defpackage.i1g0;
import defpackage.i4g0;
import defpackage.jl40;
import defpackage.mdh;
import defpackage.mth;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.szu0;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.tzu0;
import defpackage.u3g0;
import defpackage.uyj;
import defpackage.wh9;
import defpackage.y4g0;
import defpackage.y5r0;
import defpackage.yxf0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class d {
    public final i4g0 a;
    public final e b;
    public final yxf0 c;
    public final y4g0 d;
    public final i1g0 e;
    public final wh9 f;
    public final tzu0 g;
    public final tt2 h;
    public final ru.yandex.taxi.settings.domain.factory.b i;

    public d(i4g0 i4g0Var, e eVar, yxf0 yxf0Var, y4g0 y4g0Var, i1g0 i1g0Var, wh9 wh9Var, tzu0 tzu0Var, tt2 tt2Var, ru.yandex.taxi.settings.domain.factory.b bVar) {
        this.a = i4g0Var;
        this.b = eVar;
        this.c = yxf0Var;
        this.d = y4g0Var;
        this.e = i1g0Var;
        this.f = wh9Var;
        this.g = tzu0Var;
        this.h = tt2Var;
        this.i = bVar;
    }

    public final void a() {
        i4g0 i4g0Var = this.a;
        i4g0Var.b.f();
        hbp0.e(i4g0Var.b, null, null, new PushSettingsInteractor$fetchSettings$1(this, null), 3);
    }

    public final tpr b() {
        ha2 n = kotlinx.coroutines.flow.e.n(new mth(this.a.a, 6), this.e.a.a, this.f.a.a, new PushSettingsInteractor$listenSettings$1(this, null));
        this.h.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.F(n, mdh.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (r13 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (r13 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        PushSettingsInteractor$pushSubscribeSettingOnServer$1 pushSettingsInteractor$pushSubscribeSettingOnServer$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object a;
        if (continuationImpl instanceof PushSettingsInteractor$pushSubscribeSettingOnServer$1) {
            pushSettingsInteractor$pushSubscribeSettingOnServer$1 = (PushSettingsInteractor$pushSubscribeSettingOnServer$1) continuationImpl;
            int i2 = pushSettingsInteractor$pushSubscribeSettingOnServer$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pushSettingsInteractor$pushSubscribeSettingOnServer$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pushSettingsInteractor$pushSubscribeSettingOnServer$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pushSettingsInteractor$pushSubscribeSettingOnServer$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pushSettingsInteractor$pushSubscribeSettingOnServer$1.label = 1;
                    obj = this.i.a(pushSettingsInteractor$pushSubscribeSettingOnServer$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return (u3g0) this.a.a.getValue();
                    }
                    kotlin.b.b(obj);
                }
                pushSettingsInteractor$pushSubscribeSettingOnServer$1.L$0 = null;
                pushSettingsInteractor$pushSubscribeSettingOnServer$1.label = 2;
                tzu0 tzu0Var = this.g;
                a = ru.yandex.taxi.network.api.a.a(tzu0Var.a.b((szu0) obj), new SubscribePushSettingsInteractor$subscribe$2(1, tzu0Var, tzu0.class, "handleSubscribeError", "handleSubscribeError(Ljava/lang/Throwable;)V", 0), pushSettingsInteractor$pushSubscribeSettingOnServer$1);
                if (a != coroutineSingletons) {
                    a = zy11.a;
                }
            }
        }
        pushSettingsInteractor$pushSubscribeSettingOnServer$1 = new PushSettingsInteractor$pushSubscribeSettingOnServer$1(this, continuationImpl);
        Object obj2 = pushSettingsInteractor$pushSubscribeSettingOnServer$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pushSettingsInteractor$pushSubscribeSettingOnServer$1.label;
        if (i != 0) {
        }
        pushSettingsInteractor$pushSubscribeSettingOnServer$1.L$0 = null;
        pushSettingsInteractor$pushSubscribeSettingOnServer$1.label = 2;
        tzu0 tzu0Var2 = this.g;
        a = ru.yandex.taxi.network.api.a.a(tzu0Var2.a.b((szu0) obj2), new SubscribePushSettingsInteractor$subscribe$2(1, tzu0Var2, tzu0.class, "handleSubscribeError", "handleSubscribeError(Ljava/lang/Throwable;)V", 0), pushSettingsInteractor$pushSubscribeSettingOnServer$1);
        if (a != coroutineSingletons) {
        }
    }

    public final void d(List list) {
        Object obj;
        List<y5r0> list2 = list;
        for (y5r0 y5r0Var : list2) {
            this.d.a(y5r0Var.j, y5r0Var.i);
        }
        i4g0 i4g0Var = this.a;
        u3g0 u3g0Var = (u3g0) i4g0Var.a.getValue();
        if (u3g0Var == null) {
            return;
        }
        List<Object> list3 = u3g0Var.a;
        ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
        for (Object obj2 : list3) {
            if (obj2 instanceof y5r0) {
                Iterator it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (jl40.l(((y5r0) obj).j.a, ((y5r0) obj2).j.a)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                y5r0 y5r0Var2 = (y5r0) obj;
                if (y5r0Var2 != null) {
                    obj2 = y5r0.b((y5r0) obj2, y5r0Var2.i);
                }
            }
            arrayList.add(obj2);
        }
        i4g0Var.a.l(u3g0.a(u3g0Var, arrayList, 2));
    }
}
