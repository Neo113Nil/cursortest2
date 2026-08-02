package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout;

import android.view.ViewGroup;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.webview.api.WebViewContainer;
import defpackage.s9f;
import defpackage.zne;

/* loaded from: classes5.dex */
public final /* synthetic */ class j implements com.yandex.plus.core.insets.g {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ com.yandex.plus.pay.ui.core.internal.tarifficator.ui.common.b f;
    public final /* synthetic */ androidx.fragment.app.o g;
    public final /* synthetic */ Object h;

    public /* synthetic */ j(q qVar, int i, int i2, int i3, int i4, com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.j jVar, com.yandex.plus.pay.ui.core.internal.tarifficator.ui.common.b bVar) {
        this.g = qVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.h = jVar;
        this.f = bVar;
    }

    @Override // com.yandex.plus.core.insets.g
    public final void b(zne zneVar) {
        int i = this.a;
        Object obj = this.h;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.common.b bVar = this.f;
        int i2 = this.e;
        int i3 = this.d;
        int i4 = this.c;
        int i5 = this.b;
        androidx.fragment.app.o oVar = this.g;
        switch (i) {
            case 0:
                s9f[] s9fVarArr = q.s;
                zneVar.getClass();
                WebViewContainer B = ((q) oVar).B();
                int i6 = zneVar.a;
                int i7 = i4 + zneVar.b;
                int i8 = zneVar.c;
                int i9 = zneVar.d;
                r1.P(B, i5 + i6, i7, i3 + i8, i2 + i9);
                ((com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.j) obj).a(zneVar);
                ViewGroup a = bVar.a();
                a.setPadding(i6, a.getPaddingTop(), i8, i9);
                break;
            default:
                s9f[] s9fVarArr2 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.d.o;
                zneVar.getClass();
                WebViewContainer A = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.d) oVar).A();
                int i10 = zneVar.a;
                int i11 = i4 + zneVar.b;
                int i12 = zneVar.c;
                int i13 = zneVar.d;
                r1.P(A, i5 + i10, i11, i3 + i12, i2 + i13);
                ViewGroup a2 = bVar.a();
                a2.setPadding(i10, a2.getPaddingTop(), i12, i13);
                ((com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.c) obj).a(zneVar);
                break;
        }
    }

    public /* synthetic */ j(com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.d dVar, int i, int i2, int i3, int i4, com.yandex.plus.pay.ui.core.internal.tarifficator.ui.common.b bVar, com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.c cVar) {
        this.g = dVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = bVar;
        this.h = cVar;
    }
}
