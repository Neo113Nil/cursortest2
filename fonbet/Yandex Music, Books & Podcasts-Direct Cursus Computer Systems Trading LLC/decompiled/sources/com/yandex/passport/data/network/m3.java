package com.yandex.passport.data.network;

import com.yandex.passport.internal.ui.sloth.menu.UserMenuActivity;
import defpackage.eir;
import defpackage.i5f;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        com.yandex.passport.api.h2 e2Var;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                i5f i5fVar = (i5f) ((com.yandex.passport.common.network.n) obj2).c;
                i5fVar.getClass();
                return i5fVar.c(k3.Companion.serializer(), obj);
            case 1:
                com.yandex.passport.internal.social.esia.a0 a0Var = (com.yandex.passport.internal.social.esia.a0) ((eir) obj2).getValue();
                ((com.yandex.passport.internal.social.esia.n0) obj).l.b("KEY_STATE", a0Var);
                return a0Var.b;
            case 2:
                com.yandex.passport.internal.ui.sloth.ebs.s0 s0Var = (com.yandex.passport.internal.ui.sloth.ebs.s0) ((eir) obj2).getValue();
                ((com.yandex.passport.internal.ui.sloth.ebs.g1) obj).m.b("KEY_EBS_STATE", s0Var);
                return s0Var;
            default:
                UserMenuActivity userMenuActivity = (UserMenuActivity) obj2;
                com.yandex.passport.sloth.m mVar = (com.yandex.passport.sloth.m) ((com.yandex.passport.sloth.b1) obj);
                int i2 = UserMenuActivity.d;
                mVar.getClass();
                List list = mVar.a;
                com.yandex.passport.sloth.k kVar = (com.yandex.passport.sloth.k) CollectionsKt.firstOrNull(list);
                if (kVar == null || !Intrinsics.d(kVar.a, "lost_connection")) {
                    com.yandex.passport.api.exception.o.Companion.getClass();
                    e2Var = new com.yandex.passport.api.e2(com.yandex.passport.api.exception.n.a(list));
                } else {
                    e2Var = com.yandex.passport.api.d2.a;
                }
                com.yandex.passport.internal.ui.a.r(userMenuActivity, com.yandex.plus.core.network.api.utils.a.G(e2Var));
                return Unit.a;
        }
    }
}
