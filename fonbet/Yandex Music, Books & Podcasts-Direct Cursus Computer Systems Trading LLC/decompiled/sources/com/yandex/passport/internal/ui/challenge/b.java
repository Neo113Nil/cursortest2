package com.yandex.passport.internal.ui.challenge;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.yandex.passport.R;
import com.yandex.passport.api.q0;
import com.yandex.passport.internal.properties.k0;
import com.yandex.passport.internal.ui.challenge.delete.DeleteForeverActivity;
import com.yandex.passport.internal.ui.challenge.delete.a1;
import com.yandex.passport.internal.ui.challenge.delete.b1;
import com.yandex.passport.internal.ui.challenge.delete.o0;
import com.yandex.passport.internal.ui.challenge.delete.w0;
import com.yandex.passport.internal.ui.challenge.delete.x0;
import com.yandex.passport.internal.ui.challenge.delete.y0;
import com.yandex.passport.internal.ui.challenge.delete.z0;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.i0;
import defpackage.b6e;
import defpackage.dsa;
import defpackage.jyr;
import defpackage.ndu;
import defpackage.oj;
import defpackage.ps;
import defpackage.tot;
import defpackage.trq;
import defpackage.vrq;
import defpackage.wdu;
import defpackage.wyf;
import defpackage.x97;
import defpackage.zh;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class b extends oj implements Function2 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Continuation continuation = null;
        switch (this.a) {
            case 0:
                ((e) this.receiver).k((a0) obj);
                break;
            case 1:
                b1 b1Var = (b1) obj;
                final DeleteForeverActivity deleteForeverActivity = (DeleteForeverActivity) this.receiver;
                int i = DeleteForeverActivity.j;
                deleteForeverActivity.getClass();
                if (!(b1Var instanceof x0)) {
                    final int i2 = 1;
                    final int i3 = 0;
                    if (!(b1Var instanceof w0)) {
                        if (!(b1Var instanceof y0)) {
                            if (!(b1Var instanceof z0)) {
                                if (!Intrinsics.d(b1Var, a1.a)) {
                                    b6e.s();
                                    break;
                                } else {
                                    if (!deleteForeverActivity.f) {
                                        deleteForeverActivity.setContentView(((o0) deleteForeverActivity.m()).getDeleteForeverSlothUi().e());
                                        deleteForeverActivity.f = true;
                                        View h = ((com.yandex.passport.sloth.ui.b0) ((o0) deleteForeverActivity.m()).getDeleteForeverSlothUi().b.e.getValue()).h();
                                        tot totVar = new tot(21, deleteForeverActivity);
                                        WeakHashMap weakHashMap = wdu.a;
                                        ndu.n(h, totVar);
                                    }
                                    x97.y(wyf.F(deleteForeverActivity.getLifecycle()), null, null, new com.yandex.passport.internal.storage.a(deleteForeverActivity, continuation, 9), 3);
                                }
                            }
                        } else {
                            zh zhVar = deleteForeverActivity.h;
                            y0 y0Var = (y0) b1Var;
                            com.yandex.passport.common.core.f fVar = y0Var.a;
                            boolean z = y0Var.b;
                            com.yandex.passport.internal.properties.k kVar = new com.yandex.passport.internal.properties.k();
                            kVar.b(null);
                            com.yandex.passport.internal.entities.j jVar = new com.yandex.passport.internal.entities.j();
                            jVar.N(com.yandex.plus.core.network.api.utils.a.O(fVar.a));
                            if (z) {
                                jVar.y(com.yandex.passport.api.n.PHONISH);
                            }
                            kVar.b = jVar.l();
                            q0 q0Var = q0.a;
                            com.yandex.passport.api.e eVar = com.yandex.passport.api.e.a;
                            com.yandex.passport.internal.properties.v vVar = ((o0) deleteForeverActivity.m()).getProperties().b;
                            vVar.getClass();
                            kVar.o = new k0(false, false, false, q0Var, true, null, null, null, null, false, false, null, new com.yandex.passport.internal.properties.a(eVar, com.yandex.passport.api.c.a, true, false), com.yandex.plus.core.locale.b.z(vVar), false, true);
                            kVar.h = com.yandex.plus.pay.ui.core.b.J(fVar);
                            zhVar.a(com.yandex.plus.pay.ui.core.b.t(com.yandex.plus.pay.ui.core.b.t(kVar)));
                        }
                    } else {
                        trq trqVar = ((w) deleteForeverActivity.b.getValue()).a;
                        trqVar.getClass();
                        Context context = trqVar.a.getContext();
                        context.getClass();
                        trqVar.a(new dsa(new vrq(context, 0)));
                        com.yandex.passport.internal.ui.i iVar = new com.yandex.passport.internal.ui.i(deleteForeverActivity);
                        iVar.b(R.string.passport_phonish_permanent_deletion_alert_text);
                        iVar.c(R.string.passport_native_to_browser_prompt_confirmation_title, new DialogInterface.OnClickListener() { // from class: com.yandex.passport.internal.ui.challenge.delete.k0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i4) {
                                int i5 = i3;
                                DeleteForeverActivity deleteForeverActivity2 = deleteForeverActivity;
                                switch (i5) {
                                    case 0:
                                        int i6 = DeleteForeverActivity.j;
                                        deleteForeverActivity2.n().H(s.d);
                                        break;
                                    default:
                                        int i7 = DeleteForeverActivity.j;
                                        deleteForeverActivity2.n().H(s.b);
                                        break;
                                }
                            }
                        });
                        int i4 = R.string.passport_native_to_browser_prompt_refusal_title;
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.yandex.passport.internal.ui.challenge.delete.k0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i42) {
                                int i5 = i2;
                                DeleteForeverActivity deleteForeverActivity2 = deleteForeverActivity;
                                switch (i5) {
                                    case 0:
                                        int i6 = DeleteForeverActivity.j;
                                        deleteForeverActivity2.n().H(s.d);
                                        break;
                                    default:
                                        int i7 = DeleteForeverActivity.j;
                                        deleteForeverActivity2.n().H(s.b);
                                        break;
                                }
                            }
                        };
                        iVar.i = deleteForeverActivity.getText(i4);
                        iVar.j = onClickListener;
                        iVar.d = new com.yandex.passport.internal.ui.b(2, deleteForeverActivity);
                        iVar.a();
                    }
                }
                break;
            case 2:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                com.yandex.plus.home.feature.webviews.internal.d dVar = (com.yandex.plus.home.feature.webviews.internal.d) this.receiver;
                dVar.getClass();
                com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
                String str = "handleAuthorizationStateChanged() openedForAuthorizationState=" + dVar.j + " isAuthorized=" + booleanValue;
                jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, str, null);
                dVar.a(new ps(dVar, booleanValue, 14));
                break;
            default:
                com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.g gVar = (com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.g) obj;
                com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.c cVar = (com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.c) this.receiver;
                cVar.getClass();
                com.yandex.plus.acquisition.sdk.common.api.di.b bVar2 = cVar.a;
                if (gVar.getConfig() == null) {
                    com.yandex.plus.acquisition.sdk.common.api.di.b.f(bVar2, null, com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.k0.e, i0.c, gVar.s(), 1);
                    ((com.yandex.plus.home.analytics.payment.c) bVar2.f).a(com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.a.a, com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.c.a, null);
                }
                break;
        }
        return Unit.a;
    }
}
