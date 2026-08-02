package com.yandex.plus.home.feature.webviews.internal.home;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import defpackage.s9f;
import defpackage.vck;
import defpackage.wck;

/* loaded from: classes5.dex */
public final /* synthetic */ class i implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                s9f[] s9fVarArr = k.B;
                Intent addFlags = new Intent("android.intent.action.VIEW", Uri.parse("https://wiki.yandex-team.ru/security/ssl/sslclientfix/#vandroid")).addFlags(268435456);
                addFlags.getClass();
                ((k) obj).getContext().startActivity(addFlags);
                break;
            case 1:
                com.yandex.plus.home.feature.webviews.internal.purchase.pay.f fVar = (com.yandex.plus.home.feature.webviews.internal.purchase.pay.f) obj;
                fVar.d(true);
                fVar.c.b();
                break;
            case 2:
                new com.yandex.plus.pay.ui.core.debug.internal.c().show(((com.yandex.plus.pay.ui.common.api.b) obj).getSupportFragmentManager(), "DebugMenuDialogFragment");
                break;
            case 3:
                s9f[] s9fVarArr2 = com.yandex.plus.pay.ui.core.debug.internal.ui.form.e.o;
                ((com.yandex.plus.pay.ui.core.debug.internal.ui.form.j) ((com.yandex.plus.pay.ui.core.debug.internal.ui.form.e) obj).h.getValue()).l.a();
                break;
            case 4:
                com.yandex.plus.pay.ui.core.mobile.view.accordion.a aVar = (com.yandex.plus.pay.ui.core.mobile.view.accordion.a) obj;
                if (aVar.a().getVisibility() != 0) {
                    if (aVar.a().getVisibility() != 0) {
                        aVar.a().setVisibility(0);
                        aVar.b().animate().rotationBy(-180.0f).start();
                        aVar.a().requestFocus();
                        break;
                    }
                } else if (aVar.a().getVisibility() == 0) {
                    aVar.a().setVisibility(8);
                    aVar.b().animate().rotationBy(180.0f).start();
                    break;
                }
                break;
            case 5:
                com.yandex.plus.pay.ui.core.mobile.view.payment.methods.adapter.a aVar2 = (com.yandex.plus.pay.ui.core.mobile.view.payment.methods.adapter.a) obj;
                com.yandex.plus.pay.ui.core.mobile.view.payment.methods.c cVar = aVar2.D;
                if (cVar != null) {
                    aVar2.w.invoke(cVar);
                    break;
                }
                break;
            case 6:
                ((com.yandex.plus.pay.ui.core.mobile.view.toolbar.i) obj).b.invoke();
                break;
            case 7:
                s9f[] s9fVarArr3 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.g.q;
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.k z = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.g) obj).z();
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.a aVar3 = z.o;
                if (aVar3 != null) {
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a = z.k.a.a();
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b bVar = z.n;
                    String uuid = a.a.toString();
                    uuid.getClass();
                    String str = aVar3.a;
                    String str2 = aVar3.b;
                    bVar.getClass();
                    str.getClass();
                    str2.getClass();
                    bVar.a.a(uuid, str, str2, vck.SkipButton);
                }
                z.G();
                break;
            default:
                s9f[] s9fVarArr4 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.e.p;
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.j z2 = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.e) obj).z();
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.a aVar4 = z2.p;
                if (aVar4 != null) {
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a2 = z2.k.a.a();
                    com.yandex.plus.pay.ui.webview.family.domain.a aVar5 = z2.n;
                    String uuid2 = a2.a.toString();
                    uuid2.getClass();
                    String str3 = aVar4.a;
                    String str4 = aVar4.c;
                    aVar5.getClass();
                    str4.getClass();
                    aVar5.b.b(uuid2, str3, str4, wck.SkipButton);
                }
                z2.G();
                break;
        }
    }
}
