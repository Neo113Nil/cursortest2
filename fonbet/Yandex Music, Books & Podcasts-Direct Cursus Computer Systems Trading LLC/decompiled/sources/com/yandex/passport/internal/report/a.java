package com.yandex.passport.internal.report;

import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraService;
import defpackage.b6e;
import defpackage.dfi;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class a implements ze {
    public final /* synthetic */ int a;
    public final String b;

    public a(String str, int i) {
        this.a = i;
        switch (i) {
            case 2:
                str.getClass();
                this.b = str;
                break;
            case 3:
                str.getClass();
                this.b = str;
                break;
            case 7:
                str.getClass();
                this.b = str;
                break;
            case 8:
                str.getClass();
                this.b = str;
                break;
            case 13:
                this.b = String.valueOf(str);
                break;
            case 15:
                this.b = String.valueOf(str);
                break;
            case 19:
                str.getClass();
                this.b = str;
                break;
            case 22:
                str.getClass();
                this.b = str;
                break;
            case 24:
                str.getClass();
                this.b = str;
                break;
            case 25:
                str.getClass();
                this.b = str;
                break;
            case 26:
                str.getClass();
                this.b = str;
                break;
            case 27:
                this.b = String.valueOf(str);
                break;
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                str.getClass();
                this.b = str;
                break;
            default:
                str.getClass();
                this.b = str;
                break;
        }
    }

    @Override // com.yandex.passport.internal.report.ze
    public final boolean a() {
        switch (this.a) {
        }
        return true;
    }

    @Override // com.yandex.passport.internal.report.ze
    public final String getName() {
        switch (this.a) {
            case 0:
                return Constants.KEY_ACTION;
            case 1:
                return CommonUrlParts.APP_ID;
            case 2:
                return "app_signature";
            case 3:
                return "application";
            case 4:
                return "attempt_number";
            case 5:
                return "passport_auto_login_mode";
            case 6:
                return "badges";
            case 7:
                return "backend_base_url";
            case 8:
                return "biometric_session_id";
            case 9:
                return "challenge_state";
            case 10:
                return "bouncer_parameters";
            case 11:
                return CameraService.RESULT;
            case 12:
                return "state";
            case 13:
                return "brand";
            case 14:
                return "browser";
            case 15:
                return "cache_install_id";
            case 16:
                return "can_go_back";
            case 17:
                return "state";
            case 18:
                return "code";
            case 19:
                return "consumer";
            case 20:
                return "count";
            case 21:
                return "current_install_id";
            case 22:
                return "device_id";
            case 23:
                return "count";
            case 24:
                return "method";
            case 25:
                return "param";
            case 26:
                return "param_value";
            case 27:
                return "error_message";
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return "error";
            default:
                return "binding_result";
        }
    }

    @Override // com.yandex.passport.internal.report.ze
    public final String getValue() {
        switch (this.a) {
        }
        return this.b;
    }

    public /* synthetic */ a(String str, int i, boolean z) {
        this.a = i;
        this.b = str;
    }

    public a(com.yandex.passport.internal.usecase.i0 i0Var) {
        String str;
        this.a = 17;
        i0Var.getClass();
        if (i0Var instanceof com.yandex.passport.internal.usecase.f0) {
            str = "denied";
        } else if (i0Var instanceof com.yandex.passport.internal.usecase.g0) {
            str = "needed:" + ((Object) com.yandex.passport.common.url.b.m(((com.yandex.passport.internal.usecase.g0) i0Var).a));
        } else {
            if (!i0Var.equals(com.yandex.passport.internal.usecase.h0.a)) {
                b6e.s();
                throw null;
            }
            str = "passed";
        }
        this.b = str;
    }

    public a(com.yandex.passport.internal.ui.bouncer.model.v1 v1Var) {
        this.a = 12;
        this.b = com.yandex.passport.internal.ui.bouncer.model.b.c(v1Var);
    }

    public a(com.yandex.passport.internal.ui.bouncer.model.k1 k1Var) {
        String str;
        this.a = 11;
        k1Var.getClass();
        if (k1Var instanceof com.yandex.passport.internal.ui.bouncer.model.d1) {
            str = "Cancelled";
        } else if (k1Var instanceof com.yandex.passport.internal.ui.bouncer.model.g1) {
            str = "Forbidden";
        } else if (k1Var instanceof com.yandex.passport.internal.ui.bouncer.model.i1) {
            str = "Pending";
        } else if (k1Var instanceof com.yandex.passport.internal.ui.bouncer.model.e1) {
            StringBuilder sb = new StringBuilder("Error(");
            com.yandex.passport.internal.ui.bouncer.model.e1 e1Var = (com.yandex.passport.internal.ui.bouncer.model.e1) k1Var;
            sb.append(e1Var.a);
            sb.append(", ");
            str = dfi.i(sb, e1Var.b, ')');
        } else if (k1Var instanceof com.yandex.passport.internal.ui.bouncer.model.f1) {
            str = "Exception";
        } else if (k1Var instanceof com.yandex.passport.internal.ui.bouncer.model.j1) {
            str = "Success";
        } else {
            if (!(k1Var instanceof com.yandex.passport.internal.ui.bouncer.model.h1)) {
                b6e.s();
                throw null;
            }
            str = "OpenUrl";
        }
        this.b = str;
    }

    public a(com.yandex.passport.internal.ui.bouncer.model.b1 b1Var) {
        String a;
        this.a = 10;
        this.b = (b1Var == null || (a = com.yandex.passport.internal.ui.bouncer.model.b.a(b1Var)) == null) ? "null" : a;
    }

    public a(com.yandex.passport.internal.ui.bouncer.model.i2 i2Var) {
        String str;
        this.a = 9;
        i2Var.getClass();
        int ordinal = i2Var.ordinal();
        if (ordinal == 0) {
            str = "UNKNOWN";
        } else if (ordinal == 1) {
            str = "REQUIRED";
        } else if (ordinal == 2) {
            str = "PASSED";
        } else if (ordinal == 3) {
            str = "DENIED";
        } else if (ordinal == 4) {
            str = "NOT_NEEDED";
        } else {
            b6e.s();
            throw null;
        }
        this.b = str;
    }

    public a(boolean z) {
        this.a = 16;
        this.b = String.valueOf(z);
    }

    public a(com.yandex.passport.common.browser.b bVar) {
        this.a = 14;
        this.b = bVar.a;
    }

    public a(com.yandex.passport.api.x xVar) {
        String str;
        this.a = 5;
        xVar.getClass();
        int ordinal = xVar.ordinal();
        if (ordinal == 0) {
            str = "OneAccount";
        } else if (ordinal == 1) {
            str = "OneOrMoreAccounts";
        } else {
            b6e.s();
            throw null;
        }
        this.b = str;
    }

    public a(ArrayList arrayList) {
        this.a = 6;
        this.b = com.yandex.plus.core.locale.b.e(arrayList);
    }

    public a(int i, int i2) {
        this.a = i2;
        switch (i2) {
            case 18:
                this.b = String.valueOf(i);
                break;
            case 20:
                this.b = String.valueOf(i);
                break;
            case 23:
                this.b = String.valueOf(i);
                break;
            default:
                this.b = String.valueOf(i);
                break;
        }
    }
}
