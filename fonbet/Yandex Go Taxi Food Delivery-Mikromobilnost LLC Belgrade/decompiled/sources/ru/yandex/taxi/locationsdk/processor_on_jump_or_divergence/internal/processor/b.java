package ru.yandex.taxi.locationsdk.processor_on_jump_or_divergence.internal.processor;

import defpackage.ez60;
import defpackage.k7z;
import defpackage.ny61;
import defpackage.q6z;
import defpackage.qke;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ ez60 b;

    public b(vpr vprVar, ez60 ez60Var) {
        this.a = vprVar;
        this.b = ez60Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GroupStateSource$createGroupStateFlow$$inlined$filter$1$2$1 groupStateSource$createGroupStateFlow$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof GroupStateSource$createGroupStateFlow$$inlined$filter$1$2$1) {
            groupStateSource$createGroupStateFlow$$inlined$filter$1$2$1 = (GroupStateSource$createGroupStateFlow$$inlined$filter$1$2$1) continuation;
            int i2 = groupStateSource$createGroupStateFlow$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                groupStateSource$createGroupStateFlow$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = groupStateSource$createGroupStateFlow$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = groupStateSource$createGroupStateFlow$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (this.b.a().contains(new q6z(qke.q((k7z) obj)))) {
                        groupStateSource$createGroupStateFlow$$inlined$filter$1$2$1.L$0 = null;
                        groupStateSource$createGroupStateFlow$$inlined$filter$1$2$1.L$1 = null;
                        groupStateSource$createGroupStateFlow$$inlined$filter$1$2$1.L$2 = null;
                        groupStateSource$createGroupStateFlow$$inlined$filter$1$2$1.L$3 = null;
                        groupStateSource$createGroupStateFlow$$inlined$filter$1$2$1.I$0 = 0;
                        groupStateSource$createGroupStateFlow$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, groupStateSource$createGroupStateFlow$$inlined$filter$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        groupStateSource$createGroupStateFlow$$inlined$filter$1$2$1 = new GroupStateSource$createGroupStateFlow$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = groupStateSource$createGroupStateFlow$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = groupStateSource$createGroupStateFlow$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
