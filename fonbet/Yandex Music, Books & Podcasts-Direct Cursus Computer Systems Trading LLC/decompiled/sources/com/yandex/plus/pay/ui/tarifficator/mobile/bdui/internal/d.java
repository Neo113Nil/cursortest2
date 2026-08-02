package com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal;

import android.app.Activity;
import android.os.Parcelable;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.e5b;
import defpackage.esr;
import defpackage.hdg;
import defpackage.mdb;
import defpackage.neg;
import defpackage.nm6;
import defpackage.qcm;
import defpackage.qec;
import defpackage.qgg;
import defpackage.xq0;
import defpackage.yd5;
import defpackage.z7m;
import defpackage.zee;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.chat.SupportChatActivity;
import ru.yandex.music.entry.EntryScreenActivity;
import ru.yandex.music.in_app_restore.RestorePurchasesActivity;
import ru.yandex.music.payment.pay.PromoCodeWebViewActivity;

/* loaded from: classes5.dex */
public final class d {
    public final /* synthetic */ qec a;

    public d(com.yandex.plus.bdui.action.c cVar, qec qecVar) {
        this.a = qecVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Activity activity, Map map, cg6 cg6Var) {
        c cVar;
        int i;
        String obj;
        com.yandex.plus.pay.ui.tarifficator.mobile.bdui.api.d dVar;
        if (cg6Var instanceof c) {
            cVar = (c) cg6Var;
            int i2 = cVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = cVar.j;
                Object obj3 = nm6.a;
                i = cVar.l;
                if (i != 0) {
                    qgg.h0(obj2);
                    cVar.l = 1;
                    z7m z7mVar = (z7m) this.a.b;
                    if (map == null) {
                        map = e5b.a;
                        map.getClass();
                    }
                    switch (z7mVar.a) {
                        case 0:
                            activity.getClass();
                            int i3 = RestorePurchasesActivity.y;
                            Parcelable.Creator<zee> creator = zee.CREATOR;
                            neg.C(activity);
                            break;
                        case 1:
                            activity.getClass();
                            int i4 = SupportChatActivity.w;
                            activity.startActivity(qcm.d(activity, esr.PAYWALL));
                            break;
                        case 2:
                            activity.getClass();
                            int i5 = EntryScreenActivity.y;
                            activity.startActivity(yd5.y(activity, mdb.a));
                            break;
                        default:
                            activity.getClass();
                            Object obj4 = map.get("promo_code_url");
                            if (obj4 != null && (obj = obj4.toString()) != null) {
                                int i6 = PromoCodeWebViewActivity.w;
                                activity.startActivity(hdg.a0(activity, obj, null));
                                break;
                            }
                            break;
                    }
                    obj2 = new com.yandex.plus.pay.ui.tarifficator.mobile.bdui.api.c();
                    if (obj2 == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                dVar = (com.yandex.plus.pay.ui.tarifficator.mobile.bdui.api.d) obj2;
                if (!(dVar instanceof com.yandex.plus.pay.ui.tarifficator.mobile.bdui.api.c)) {
                    return new com.yandex.plus.bdui.plus.handler.b();
                }
                if (Intrinsics.d(dVar, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.api.b.a)) {
                    return com.yandex.plus.bdui.plus.handler.a.a;
                }
                b6e.s();
                return null;
            }
        }
        cVar = new c(this, cg6Var);
        Object obj22 = cVar.j;
        Object obj32 = nm6.a;
        i = cVar.l;
        if (i != 0) {
        }
        dVar = (com.yandex.plus.pay.ui.tarifficator.mobile.bdui.api.d) obj22;
        if (!(dVar instanceof com.yandex.plus.pay.ui.tarifficator.mobile.bdui.api.c)) {
        }
    }
}
