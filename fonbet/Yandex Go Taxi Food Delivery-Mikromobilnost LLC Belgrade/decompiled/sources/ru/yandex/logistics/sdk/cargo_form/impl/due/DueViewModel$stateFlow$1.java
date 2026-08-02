package ru.yandex.logistics.sdk.cargo_form.impl.due;

import defpackage.bms;
import defpackage.cvu0;
import defpackage.evm;
import defpackage.fsg;
import defpackage.fvm;
import defpackage.g8e;
import defpackage.gvm;
import defpackage.hvm;
import defpackage.jvm;
import defpackage.jxm;
import defpackage.ldc;
import defpackage.lvi0;
import defpackage.m2n;
import defpackage.nvm;
import defpackage.pwm;
import defpackage.qzh0;
import defpackage.ri20;
import defpackage.sbv;
import defpackage.tcc;
import defpackage.ysu;
import defpackage.zez0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class DueViewModel$stateFlow$1 extends AdaptedFunctionReference implements bms {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ysu ysuVar;
        ri20 ri20Var;
        List list;
        String str;
        ArrayList arrayList;
        String v;
        ArrayList arrayList2;
        String a;
        gvm gvmVar;
        List list2;
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        nvm nvmVar = (nvm) this.receiver;
        evm evmVar = nvmVar.a;
        m2n m2nVar = evmVar.x;
        hvm hvmVar = evmVar.A;
        fsg fsgVar = (fsg) kotlin.collections.a.S(intValue, m2nVar.a);
        if (fsgVar == null || (ysuVar = (ysu) kotlin.collections.a.S(intValue2, fsgVar.c)) == null) {
            ysuVar = fsgVar != null ? (ysu) kotlin.collections.a.Z(fsgVar.c) : null;
        }
        if (ysuVar == null || (list2 = ysuVar.c) == null || (ri20Var = (ri20) kotlin.collections.a.S(intValue3, list2)) == null) {
            ri20Var = (ysuVar == null || (list = ysuVar.c) == null) ? null : (ri20) kotlin.collections.a.Z(list);
        }
        if (fsgVar == null || ysuVar == null) {
            return null;
        }
        String str2 = evmVar.a;
        String str3 = evmVar.b;
        sbv sbvVar = evmVar.w;
        String str4 = sbvVar.a;
        if (str4 == null || (str = nvmVar.b.a(str4)) == null) {
            str = sbvVar.b;
        }
        String str5 = str;
        ldc f = nvmVar.c.f(sbvVar.c);
        lvi0 lvi0Var = new lvi0(str5, null, null, null, f != null ? new zez0(f.a) : null, 46);
        String str6 = ysuVar.d;
        String str7 = ri20Var != null ? ri20Var.c : null;
        String str8 = fsgVar.b;
        if (str7 != null) {
            arrayList = null;
            v = cvu0.v(str8, "%option", g8e.p(str6, ":", str7), false);
        } else {
            arrayList = null;
            v = cvu0.v(str8, "%option", str6, false);
        }
        jvm jvmVar = new jvm(lvi0Var, v, evmVar.c);
        ArrayList arrayList3 = m2nVar.a;
        ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList4.add(((fsg) it.next()).a);
        }
        ArrayList arrayList5 = fsgVar.c;
        ArrayList arrayList6 = new ArrayList(tcc.n(arrayList5, 10));
        Iterator it2 = arrayList5.iterator();
        while (it2.hasNext()) {
            arrayList6.add(((ysu) it2.next()).a);
        }
        List list3 = ysuVar.c;
        if (list3 != null) {
            List list4 = list3;
            arrayList2 = new ArrayList(tcc.n(list4, 10));
            Iterator it3 = list4.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((ri20) it3.next()).a);
            }
        } else {
            arrayList2 = arrayList;
        }
        pwm pwmVar = new pwm(arrayList4, arrayList6, arrayList2);
        gvm gvmVar2 = hvmVar != null ? hvmVar.a : arrayList;
        if (gvmVar2 == 0 || (a = gvmVar2.a) == null) {
            a = nvmVar.d.a(qzh0.cargoform_due_button_title, new Object[0]);
        }
        return new jxm(str2, str3, jvmVar, pwmVar, new fvm(a, gvmVar2 != 0 ? gvmVar2.b : arrayList), (hvmVar == null || (gvmVar = hvmVar.b) == null) ? arrayList : new fvm(gvmVar.a, gvmVar.b));
    }
}
