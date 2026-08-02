package ru.yandex.taxi.logistics.sdk.tracking.impl.change_datetime.ui;

import defpackage.ds0;
import defpackage.ds31;
import defpackage.ha9;
import defpackage.jwh;
import defpackage.la9;
import defpackage.pez0;
import defpackage.s6i;
import defpackage.sls;
import defpackage.tje;
import defpackage.w511;
import defpackage.wu70;
import defpackage.xxz;
import defpackage.yxz;
import defpackage.zy11;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.logistics.sdk.tracking.domain.api.models.ClickSource;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class ChangeDateTimeScreenKt$ChangeDateTimeScreen$1$4$1 extends FunctionReferenceImpl implements sls {
    /* renamed from: invoke, reason: collision with other method in class */
    public final void m727invoke() {
        String str;
        d dVar = (d) this.receiver;
        ds0 ds0Var = dVar.w;
        la9 la9Var = dVar.b;
        ClickSource clickSource = la9Var.z;
        jwh jwhVar = ds0Var.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = ha9.a[clickSource.ordinal()];
        if (i == 1) {
            str = "tracking";
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            str = "recipient_information";
        }
        linkedHashMap.put("type", str);
        jwhVar.a.o("SuperApp.Delivery.ExtNDD.Rescheduling.Change", null, linkedHashMap);
        String str2 = la9Var.a;
        pez0 pez0Var = (pez0) dVar.C.a.getValue();
        s6i s6iVar = new s6i(str2, new wu70(Collections.singletonList(new yxz(pez0Var != null ? new xxz(pez0Var.b, pez0Var.c) : null))));
        String uuid = UUID.randomUUID().toString();
        r0 r0Var = dVar.E;
        Boolean bool = Boolean.FALSE;
        Pair pair = new Pair(bool, bool);
        r0Var.getClass();
        r0Var.m(null, pair);
        r0 r0Var2 = dVar.F;
        Pair pair2 = new Pair(bool, Boolean.TRUE);
        r0Var2.getClass();
        r0Var2.m(null, pair2);
        tje.N(ds31.a(dVar), null, null, new ChangeDateTimeViewModel$onDoneClicked$1(dVar, uuid, null), 3);
        dVar.x.a(s6iVar, uuid, null);
    }

    @Override // defpackage.sls
    public final /* bridge */ /* synthetic */ Object invoke() {
        m727invoke();
        return zy11.a;
    }
}
