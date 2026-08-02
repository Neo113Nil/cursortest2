package ru.yandex.taxi.summary.personalaction.notification;

import defpackage.c4r0;
import defpackage.jl40;
import defpackage.k3b0;
import defpackage.m3b0;
import defpackage.ri60;
import defpackage.rpt0;
import defpackage.tls;
import defpackage.v3b0;
import defpackage.w511;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.personalstate.api.network.objects.OptionType;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class PersonalActionNotificationComponentFactory$create$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Object obj2;
        ri60.a aVar;
        String str;
        m3b0 m3b0Var = (m3b0) obj;
        a aVar2 = (a) this.receiver;
        ru.yandex.taxi.personalstate.data.remote.a aVar3 = aVar2.c;
        String str2 = m3b0Var.f;
        String str3 = m3b0Var.f;
        String str4 = m3b0Var.g;
        String str5 = m3b0Var.h;
        aVar3.a.a(str2, str4, str5, "NotificationTapped");
        Iterator it = m3b0Var.j.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (jl40.l(((ri60) obj2).a, "tap")) {
                break;
            }
        }
        ri60 ri60Var = (ri60) obj2;
        if (ri60Var != null && (aVar = ri60Var.b) != null && (str = aVar.b) != null) {
            OptionType optionType = aVar.a;
            int i = optionType == null ? -1 : k3b0.a[optionType.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    c4r0.e(aVar2.d, SelectionOrigin.REDIRECT, str, null, 12);
                } else if (i == 2) {
                    ((rpt0) aVar2.e).b(null, str);
                } else if (i != 3 && i != 4) {
                    w511.b();
                    return null;
                }
            }
            aVar2.c.a.a(str3, str4, str5, "NotificationDismissed");
            ((v3b0) aVar2.b.a).a.add(str3);
        }
        return zy11.a;
    }
}
