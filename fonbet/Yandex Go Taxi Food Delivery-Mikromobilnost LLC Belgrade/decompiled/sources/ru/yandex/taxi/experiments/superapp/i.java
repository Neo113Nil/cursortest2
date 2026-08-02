package ru.yandex.taxi.experiments.superapp;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.shortcuts.impl.interactors.n;
import defpackage.abf0;
import defpackage.bvf0;
import defpackage.j3s0;
import defpackage.ny61;
import defpackage.sm40;
import defpackage.t9f0;
import defpackage.vc80;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class i implements vc80 {
    public final com.yandex.go.superapp.order.multi.old.provider.g a;
    public final com.yandex.go.navigation.screen.c b;
    public final a c;
    public final abf0 d;
    public final n e;
    public final sm40 f;
    public final t9f0 g;
    public volatile j3s0 h = new j3s0(Screen.NONE, 0, 0, null);

    public i(com.yandex.go.superapp.order.multi.old.provider.g gVar, com.yandex.go.navigation.screen.c cVar, a aVar, abf0 abf0Var, n nVar, sm40 sm40Var, t9f0 t9f0Var) {
        this.a = gVar;
        this.b = cVar;
        this.c = aVar;
        this.d = abf0Var;
        this.e = nVar;
        this.f = sm40Var;
        this.g = t9f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vc80
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        ShortcutsOnOrderAvailabilityTracker$start$1 shortcutsOnOrderAvailabilityTracker$start$1;
        int i;
        if (continuation instanceof ShortcutsOnOrderAvailabilityTracker$start$1) {
            shortcutsOnOrderAvailabilityTracker$start$1 = (ShortcutsOnOrderAvailabilityTracker$start$1) continuation;
            int i2 = shortcutsOnOrderAvailabilityTracker$start$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                shortcutsOnOrderAvailabilityTracker$start$1.label = i2 - Integer.MIN_VALUE;
                Object obj = shortcutsOnOrderAvailabilityTracker$start$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shortcutsOnOrderAvailabilityTracker$start$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ShortcutsOnOrderAvailabilityTracker$start$2 shortcutsOnOrderAvailabilityTracker$start$2 = new ShortcutsOnOrderAvailabilityTracker$start$2(this, null);
                    shortcutsOnOrderAvailabilityTracker$start$1.label = 1;
                    if (bvf0.n(shortcutsOnOrderAvailabilityTracker$start$2, shortcutsOnOrderAvailabilityTracker$start$1) == coroutineSingletons) {
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
        shortcutsOnOrderAvailabilityTracker$start$1 = new ShortcutsOnOrderAvailabilityTracker$start$1(this, (ContinuationImpl) continuation);
        Object obj2 = shortcutsOnOrderAvailabilityTracker$start$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shortcutsOnOrderAvailabilityTracker$start$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
