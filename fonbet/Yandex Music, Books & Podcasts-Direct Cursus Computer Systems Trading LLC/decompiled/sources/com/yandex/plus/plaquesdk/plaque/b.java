package com.yandex.plus.plaquesdk.plaque;

import android.content.Context;
import defpackage.cvo;
import defpackage.jyr;
import defpackage.ni1;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = c.j;
                Context context = ((c) obj).getContext();
                context.getClass();
                return new a(context);
            default:
                return (cvo) ((jyr) ((ni1) obj).k.b).getValue();
        }
    }
}
