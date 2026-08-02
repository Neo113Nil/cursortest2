package com.yandex.passport.internal.ui.challenge.changecurrent;

import android.content.Intent;
import android.net.Uri;
import defpackage.gq5;
import defpackage.hq5;
import defpackage.ild;
import defpackage.oq5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class k implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;
    public final /* synthetic */ SetCurrentComposeActivity c;

    public /* synthetic */ k(i iVar, SetCurrentComposeActivity setCurrentComposeActivity, int i) {
        this.a = i;
        this.b = iVar;
        this.c = setCurrentComposeActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        final int i2 = 1;
        final SetCurrentComposeActivity setCurrentComposeActivity = this.c;
        hq5 hq5Var = (hq5) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                int i3 = SetCurrentComposeActivity.a;
                if ((intValue & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                i iVar = this.b;
                com.yandex.passport.common.ui.compose.theme.d.a(com.yandex.plus.pay.ui.core.b.z(iVar.c, hq5Var), com.yandex.passport.internal.di.a.a().getProperties().x, ild.C(-441762069, new k(iVar, setCurrentComposeActivity, i2), hq5Var), hq5Var, 384, 0);
            default:
                int i4 = SetCurrentComposeActivity.a;
                if ((intValue & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                oq5 oq5Var3 = (oq5) hq5Var;
                i iVar2 = this.b;
                boolean h = oq5Var3.h(iVar2) | oq5Var3.h(setCurrentComposeActivity);
                Object K = oq5Var3.K();
                Object obj3 = gq5.a;
                if (h || K == obj3) {
                    K = new com.yandex.passport.internal.ui.bouncer.o(7, iVar2, setCurrentComposeActivity);
                    oq5Var3.k0(K);
                }
                Function1 function1 = (Function1) K;
                boolean h2 = oq5Var3.h(setCurrentComposeActivity);
                Object K2 = oq5Var3.K();
                if (h2 || K2 == obj3) {
                    final int i5 = 0;
                    K2 = new Function1() { // from class: com.yandex.passport.internal.ui.challenge.changecurrent.l
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            int i6 = i5;
                            SetCurrentComposeActivity setCurrentComposeActivity2 = setCurrentComposeActivity;
                            switch (i6) {
                                case 0:
                                    String str = (String) obj4;
                                    int i7 = SetCurrentComposeActivity.a;
                                    str.getClass();
                                    com.yandex.passport.internal.util.a.a(setCurrentComposeActivity2, new Intent("android.intent.action.VIEW", Uri.parse(str)));
                                    break;
                                default:
                                    Exception exc = (Exception) obj4;
                                    int i8 = SetCurrentComposeActivity.a;
                                    exc.getClass();
                                    com.yandex.plus.core.locale.b.i(setCurrentComposeActivity2, exc);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var3.k0(K2);
                }
                Function1 function12 = (Function1) K2;
                boolean h3 = oq5Var3.h(setCurrentComposeActivity);
                Object K3 = oq5Var3.K();
                if (h3 || K3 == obj3) {
                    K3 = new Function1() { // from class: com.yandex.passport.internal.ui.challenge.changecurrent.l
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            int i6 = i2;
                            SetCurrentComposeActivity setCurrentComposeActivity2 = setCurrentComposeActivity;
                            switch (i6) {
                                case 0:
                                    String str = (String) obj4;
                                    int i7 = SetCurrentComposeActivity.a;
                                    str.getClass();
                                    com.yandex.passport.internal.util.a.a(setCurrentComposeActivity2, new Intent("android.intent.action.VIEW", Uri.parse(str)));
                                    break;
                                default:
                                    Exception exc = (Exception) obj4;
                                    int i8 = SetCurrentComposeActivity.a;
                                    exc.getClass();
                                    com.yandex.plus.core.locale.b.i(setCurrentComposeActivity2, exc);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var3.k0(K3);
                }
                com.yandex.passport.common.ui.progress.g gVar = com.yandex.passport.common.ui.progress.g.e;
                com.yandex.plus.core.network.api.utils.a.g(iVar2, function1, function12, (Function1) K3, oq5Var3, 0);
        }
        return Unit.a;
    }
}
