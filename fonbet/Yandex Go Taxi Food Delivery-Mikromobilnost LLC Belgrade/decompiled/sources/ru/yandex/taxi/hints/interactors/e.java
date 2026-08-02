package ru.yandex.taxi.hints.interactors;

import defpackage.ny61;
import defpackage.pv0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zxs0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class e implements tpr {
    public final /* synthetic */ ru.yandex.taxi.logistics.address.b a;
    public final /* synthetic */ pv0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ zxs0 x;

    public e(ru.yandex.taxi.logistics.address.b bVar, pv0 pv0Var, String str, boolean z, zxs0 zxs0Var) {
        this.a = bVar;
        this.b = pv0Var;
        this.c = str;
        this.w = z;
        this.x = zxs0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TitleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$1 titleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof TitleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$1) {
            titleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$1 = (TitleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$1) continuation;
            int i2 = titleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                titleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = titleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = titleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar, this.b, this.c, this.w, this.x);
                    titleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$1.L$0 = null;
                    titleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$1.L$1 = null;
                    titleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$1.L$2 = null;
                    titleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(dVar, titleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        titleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$1 = new TitleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = titleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = titleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
