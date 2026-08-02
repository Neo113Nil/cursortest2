package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent;

import androidx.fragment.app.o;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import defpackage.s9f;
import defpackage.zne;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements com.yandex.plus.core.insets.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ o f;
    public final /* synthetic */ Object g;

    public /* synthetic */ b(o oVar, int i, int i2, int i3, int i4, Object obj, int i5) {
        this.a = i5;
        this.f = oVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.g = obj;
    }

    @Override // com.yandex.plus.core.insets.g
    public final void b(zne zneVar) {
        int i = this.a;
        Object obj = this.g;
        int i2 = this.e;
        int i3 = this.d;
        int i4 = this.c;
        int i5 = this.b;
        o oVar = this.f;
        switch (i) {
            case 0:
                s9f[] s9fVarArr = e.m;
                zneVar.getClass();
                r1.P(((e) oVar).x(), i5 + zneVar.a, i4 + zneVar.b, i3 + zneVar.c, i2 + zneVar.d);
                ((com.yandex.plus.pay.ui.core.internal.tarifficator.ui.loading.b) obj).a(zneVar);
                break;
            default:
                s9f[] s9fVarArr2 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.f.q;
                zneVar.getClass();
                r1.P(((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.f) oVar).A(), i5 + zneVar.a, i4 + zneVar.b, i3 + zneVar.c, i2 + zneVar.d);
                ((com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.c) obj).a(zneVar);
                break;
        }
    }
}
