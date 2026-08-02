package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.header;

import defpackage.a9n;
import defpackage.cbu;
import defpackage.dqi;
import defpackage.fa01;
import defpackage.ga01;
import defpackage.gri;
import defpackage.ha01;
import defpackage.i5v;
import defpackage.i8n;
import defpackage.ia01;
import defpackage.ja01;
import defpackage.kvi0;
import defpackage.lqi;
import defpackage.lvi0;
import defpackage.u531;
import defpackage.vau;
import defpackage.vwa0;
import defpackage.w511;
import defpackage.wzg0;
import defpackage.zls;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class HeaderStateHolder$headerFlow$2 extends AdaptedFunctionReference implements zls {
    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        lvi0 lvi0Var;
        u531 u531Var;
        String str;
        gri griVar = (gri) obj;
        i8n i8nVar = (i8n) obj2;
        vau vauVar = (vau) this.receiver;
        i5v i5vVar = griVar.h;
        ja01 ja01Var = null;
        if (i5vVar != null) {
            lvi0Var = new lvi0(vauVar.a.a(i5vVar.a), new kvi0(wzg0.ic_delivery), null, null, null, 60);
        } else {
            vauVar.getClass();
            if (i5vVar != null) {
                w511.b();
                return null;
            }
            lvi0Var = null;
        }
        dqi dqiVar = griVar.b;
        lqi lqiVar = dqiVar.d;
        boolean z = dqiVar.e || !(lqiVar == null || ((lqiVar != null ? lqiVar.d : null) instanceof a9n));
        Long l = lqiVar != null ? lqiVar.a : null;
        vwa0 vwa0Var = griVar.k;
        if (vwa0Var == null || (str = vwa0Var.d) == null) {
            u531Var = null;
        } else {
            String str2 = vwa0Var.c;
            if (str2 == null) {
                str2 = "";
            }
            u531Var = new u531(str, str2);
        }
        String str3 = i8nVar.a;
        String str4 = i8nVar.b;
        String str5 = i8nVar.c;
        String str6 = i8nVar.d;
        if (l != null) {
            ja01Var = new ia01(l.longValue());
        } else if (lvi0Var != null && u531Var != null) {
            ja01Var = new fa01(lvi0Var, u531Var);
        } else if (lvi0Var != null) {
            ja01Var = new ga01(lvi0Var);
        } else if (u531Var != null) {
            ja01Var = new ha01(u531Var);
        }
        return new cbu(str3, str4, ja01Var, z, str5, str6);
    }
}
