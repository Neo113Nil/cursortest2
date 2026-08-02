package com.yandex.plus.paymentsdk.internal;

import android.content.Context;
import android.os.Parcelable;
import com.yandex.plus.home.plaque.plugin.internal.di.c;
import com.yandex.plus.paymentsdk.api.d;
import defpackage.b6e;
import defpackage.btf;
import defpackage.c5b;
import defpackage.dnd;
import defpackage.g86;
import defpackage.hmd;
import defpackage.j8o;
import defpackage.jdk;
import defpackage.jyr;
import defpackage.lmk;
import defpackage.ln;
import defpackage.pyh;
import defpackage.shc;
import defpackage.u7w;
import defpackage.ues;
import defpackage.ugk;
import defpackage.vdr;
import defpackage.x3i;
import defpackage.xek;
import defpackage.xfk;
import defpackage.xq0;
import defpackage.xt0;
import defpackage.xx3;
import defpackage.xz0;
import defpackage.ysn;
import defpackage.z6w;
import defpackage.zov;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class a {
    public final c a;
    public final com.yandex.plus.core.config.b b;
    public final vdr c;
    public final jyr d;

    public a(c cVar, com.yandex.plus.core.config.b bVar, vdr vdrVar) {
        cVar.getClass();
        bVar.getClass();
        vdrVar.getClass();
        this.a = cVar;
        this.b = bVar;
        this.c = vdrVar;
        this.d = btf.b(new d(2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f9, code lost:
    
        if (r1 != null) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ysn a(Context context, com.yandex.plus.core.data.pay.d dVar, String str, String str2, String str3, com.yandex.plus.paymentsdk.internal.method.card.a aVar, boolean z) {
        String str4;
        ugk ugkVar;
        String str5;
        ues uesVar;
        context.getClass();
        String str6 = str2 == null ? null : str2;
        com.yandex.plus.core.config.b bVar = this.b;
        if (str3 == null) {
            int ordinal = bVar.a().ordinal();
            if (ordinal == 0) {
                str4 = "union_mediaservices_9ce4193462e8fe3efdc7b31f60f4d74a";
            } else {
                if (ordinal != 1) {
                    b6e.s();
                    return null;
                }
                str4 = "union_mediaservices_be17bb5c43e8a179db49b123454678ed";
            }
        } else {
            str4 = str3;
        }
        pyh pyhVar = new pyh(str4);
        Parcelable.Creator<ugk> creator = ugk.CREATOR;
        Parcelable.Creator<g86> creator2 = g86.CREATOR;
        Context applicationContext = context.getApplicationContext();
        int ordinal2 = bVar.a().ordinal();
        if (ordinal2 == 0) {
            ugkVar = ugk.TESTING;
        } else {
            if (ordinal2 != 1) {
                b6e.s();
                return null;
            }
            ugkVar = ugk.PRODUCTION;
        }
        ugk ugkVar2 = ugkVar;
        g86 g86Var = g86.a;
        if (applicationContext == null) {
            xq0.x("Provide application context");
            return null;
        }
        new xek(applicationContext, ugkVar2, g86Var, x3i.b);
        String str7 = dVar.b;
        Long l = dVar.a;
        jdk jdkVar = new jdk(str7, null, l != null ? l.toString() : null, null, null, null);
        List list = dVar.c;
        Parcelable.Creator<xx3> creator3 = xx3.CREATOR;
        u7w u7wVar = u7w.b;
        u7w u7wVar2 = u7w.c;
        u7w u7wVar3 = u7w.a;
        xz0.Y(new u7w[]{u7wVar, u7wVar2, u7wVar3}).getClass();
        c5b c5bVar = c5b.a;
        j8o j8oVar = new j8o(-1L, true, false);
        Parcelable.Creator<lmk> creator4 = lmk.CREATOR;
        dnd dndVar = dnd.b;
        z6w z6wVar = z6w.a;
        xt0 xt0Var = new xt0(null, null, context.getPackageName());
        xx3 xx3Var = xx3.c;
        xx3Var.getClass();
        lmk lmkVar = (lmk) this.d.getValue();
        lmkVar.getClass();
        Set Y = xz0.Y(new u7w[]{u7wVar, u7wVar2, u7wVar3});
        Y.getClass();
        zov zovVar = zov.a;
        if (z) {
            j8oVar = new j8o(-1L, true, true);
        }
        j8o j8oVar2 = j8oVar;
        if (str6 == null) {
            str6 = null;
        }
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            str5 = list != null ? CollectionsKt.X(list, StringUtils.COMMA, null, null, null, 62) : null;
        }
        str5 = null;
        ln lnVar = new ln(xx3Var, new xfk(true, true, false, true, false, false, Y), c5bVar, xt0Var, j8oVar2, false, lmkVar, null, str5, false, true, false, null, str, str6, 225, false, true, false, dndVar, false, zovVar, true, true, null, null, null, z6wVar);
        com.yandex.plus.ui.core.theme.a aVar2 = (com.yandex.plus.ui.core.theme.a) this.c.getValue();
        c cVar = this.a;
        cVar.getClass();
        aVar2.getClass();
        int ordinal3 = aVar2.ordinal();
        if (ordinal3 == 0) {
            uesVar = (ues) cVar.b.getValue();
        } else if (ordinal3 == 1) {
            uesVar = (ues) cVar.a.getValue();
        } else {
            if (ordinal3 != 2) {
                b6e.s();
                return null;
            }
            uesVar = (ues) cVar.c.getValue();
        }
        uesVar.getClass();
        Context applicationContext2 = applicationContext.getApplicationContext();
        applicationContext2.getClass();
        ysn ysnVar = new ysn(applicationContext2, jdkVar, pyhVar, ugkVar2, lnVar, g86Var, aVar);
        hmd.a = uesVar;
        shc.a = uesVar;
        return ysnVar;
    }
}
