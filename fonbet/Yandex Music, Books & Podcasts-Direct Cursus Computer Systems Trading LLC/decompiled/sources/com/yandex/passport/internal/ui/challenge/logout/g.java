package com.yandex.passport.internal.ui.challenge.logout;

import android.content.Intent;
import android.net.Uri;
import defpackage.gq5;
import defpackage.hq5;
import defpackage.ild;
import defpackage.kjn;
import defpackage.oq5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class g implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ j b;
    public final /* synthetic */ t c;
    public final /* synthetic */ LogoutComposeActivity d;

    public /* synthetic */ g(j jVar, t tVar, LogoutComposeActivity logoutComposeActivity) {
        this.b = jVar;
        this.c = tVar;
        this.d = logoutComposeActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        final LogoutComposeActivity logoutComposeActivity = this.d;
        t tVar = this.c;
        hq5 hq5Var = (hq5) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                int i2 = LogoutComposeActivity.a;
                if ((intValue & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                boolean z = com.yandex.plus.pay.ui.core.b.z(tVar.b, hq5Var);
                j jVar = this.b;
                com.yandex.passport.common.ui.compose.theme.d.a(z, jVar.isWhiteLabel(), ild.C(-1749428788, new g(jVar, tVar, logoutComposeActivity), hq5Var), hq5Var, 384, 0);
            default:
                int i3 = LogoutComposeActivity.a;
                if ((intValue & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                oq5 oq5Var3 = (oq5) hq5Var;
                boolean h = oq5Var3.h(tVar) | oq5Var3.h(logoutComposeActivity);
                Object K = oq5Var3.K();
                kjn kjnVar = gq5.a;
                if (h || K == kjnVar) {
                    K = new com.yandex.passport.internal.ui.bouncer.o(8, tVar, logoutComposeActivity);
                    oq5Var3.k0(K);
                }
                Function1 function1 = (Function1) K;
                boolean h2 = oq5Var3.h(logoutComposeActivity);
                Object K2 = oq5Var3.K();
                if (h2 || K2 == kjnVar) {
                    final int i4 = 0;
                    K2 = new Function1() { // from class: com.yandex.passport.internal.ui.challenge.logout.h
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            int i5 = i4;
                            LogoutComposeActivity logoutComposeActivity2 = logoutComposeActivity;
                            switch (i5) {
                                case 0:
                                    String str = (String) obj3;
                                    int i6 = LogoutComposeActivity.a;
                                    str.getClass();
                                    com.yandex.passport.internal.util.a.a(logoutComposeActivity2, new Intent("android.intent.action.VIEW", Uri.parse(str)));
                                    break;
                                default:
                                    Exception exc = (Exception) obj3;
                                    int i7 = LogoutComposeActivity.a;
                                    exc.getClass();
                                    com.yandex.plus.core.locale.b.i(logoutComposeActivity2, exc);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var3.k0(K2);
                }
                Function1 function12 = (Function1) K2;
                boolean h3 = oq5Var3.h(logoutComposeActivity);
                Object K3 = oq5Var3.K();
                if (h3 || K3 == kjnVar) {
                    final int i5 = 1;
                    K3 = new Function1() { // from class: com.yandex.passport.internal.ui.challenge.logout.h
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            int i52 = i5;
                            LogoutComposeActivity logoutComposeActivity2 = logoutComposeActivity;
                            switch (i52) {
                                case 0:
                                    String str = (String) obj3;
                                    int i6 = LogoutComposeActivity.a;
                                    str.getClass();
                                    com.yandex.passport.internal.util.a.a(logoutComposeActivity2, new Intent("android.intent.action.VIEW", Uri.parse(str)));
                                    break;
                                default:
                                    Exception exc = (Exception) obj3;
                                    int i7 = LogoutComposeActivity.a;
                                    exc.getClass();
                                    com.yandex.plus.core.locale.b.i(logoutComposeActivity2, exc);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var3.k0(K3);
                }
                com.yandex.plus.pay.ui.core.b.c(this.b, function1, function12, (Function1) K3, oq5Var3, 0);
        }
        return Unit.a;
    }

    public /* synthetic */ g(t tVar, j jVar, LogoutComposeActivity logoutComposeActivity) {
        this.c = tVar;
        this.b = jVar;
        this.d = logoutComposeActivity;
    }
}
