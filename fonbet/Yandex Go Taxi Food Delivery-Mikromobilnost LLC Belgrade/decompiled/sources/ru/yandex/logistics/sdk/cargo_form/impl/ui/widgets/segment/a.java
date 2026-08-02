package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.segment;

import defpackage.j6s;
import defpackage.k9q0;
import defpackage.n8q0;
import defpackage.ny61;
import defpackage.v7q0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class a {
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a a;

    public a(ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v7q0 v7q0Var, j6s j6sVar, String str, ContinuationImpl continuationImpl) {
        SegmentMapper$map$1 segmentMapper$map$1;
        int i;
        if (continuationImpl instanceof SegmentMapper$map$1) {
            segmentMapper$map$1 = (SegmentMapper$map$1) continuationImpl;
            int i2 = segmentMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                segmentMapper$map$1.label = i2 - Integer.MIN_VALUE;
                Object obj = segmentMapper$map$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = segmentMapper$map$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    segmentMapper$map$1.L$0 = null;
                    segmentMapper$map$1.L$1 = null;
                    segmentMapper$map$1.L$2 = null;
                    segmentMapper$map$1.L$3 = str;
                    segmentMapper$map$1.label = 1;
                    obj = this.a.l(v7q0Var, j6sVar, segmentMapper$map$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) segmentMapper$map$1.L$3;
                    kotlin.b.b(obj);
                }
                return new n8q0((k9q0) obj, str);
            }
        }
        segmentMapper$map$1 = new SegmentMapper$map$1(this, continuationImpl);
        Object obj2 = segmentMapper$map$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = segmentMapper$map$1.label;
        if (i != 0) {
        }
        return new n8q0((k9q0) obj2, str);
    }
}
