package com.yandex.plus.core.activity.result.internal;

import defpackage.oj;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class a extends oj implements Function1 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                m mVar = (m) obj;
                mVar.getClass();
                ((List) this.receiver).remove(mVar);
                break;
            default:
                com.yandex.plus.core.benchmark.l lVar = (com.yandex.plus.core.benchmark.l) obj;
                lVar.getClass();
                ((com.yandex.plus.home.benchmark.d) this.receiver).c(lVar, null);
                break;
        }
        return Unit.a;
    }
}
