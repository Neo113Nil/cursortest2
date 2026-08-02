package com.yandex.passport.internal.report;

import com.connectsdk.service.command.ServiceCommand;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraService;
import defpackage.b6e;
import defpackage.fob;
import defpackage.v75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class ff implements ze {
    public final /* synthetic */ int a;
    public final String b;

    public ff(String str, int i) {
        this.a = i;
        switch (i) {
            case 1:
                str.getClass();
                this.b = str;
                break;
            case 6:
                str.getClass();
                this.b = str;
                break;
            case 11:
                this.b = String.valueOf(str);
                break;
            case 12:
                str.getClass();
                this.b = str;
                break;
            case 13:
                this.b = str != null ? com.yandex.plus.core.locale.b.x(str) : "null";
                break;
            case 14:
                this.b = str != null ? com.yandex.plus.core.locale.b.x(str) : "null";
                break;
            case 15:
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
                return "social_consumer";
            case 1:
                return "social_scopes";
            case 2:
                return "source_2fa";
            case 3:
                return "speed";
            case 4:
                return "sso_announcing_required";
            case 5:
                return "status";
            case 6:
                return "storage_name";
            case 7:
                return "subtype";
            case 8:
                return "success";
            case 9:
                return "support_webauthn";
            case 10:
                return "throwable";
            case 11:
                return "tib_host";
            case 12:
                return "state";
            case 13:
                return "track_id_hash";
            case 14:
                return "track_id";
            case 15:
                return "trigger";
            case 16:
                return "type_crypt";
            case 17:
                return "type";
            case 18:
                return "uid_disabled_autologin";
            case 19:
                return "uid_list";
            case 20:
                return "uid";
            case 21:
                return "uids_disabled_autologin";
            case 22:
                return "source";
            case 23:
                return "type";
            case 24:
                return "backend_url_path";
            case 25:
                return "user_id_logged_in";
            case 26:
                return "was_transferred_token";
            default:
                return CameraService.RESULT;
        }
    }

    @Override // com.yandex.passport.internal.report.ze
    public final String getValue() {
        switch (this.a) {
        }
        return this.b;
    }

    public /* synthetic */ ff(String str, int i, boolean z) {
        this.a = i;
        this.b = str;
    }

    public ff(ArrayList arrayList) {
        this.a = 19;
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.yandex.passport.common.core.f fVar = (com.yandex.passport.common.core.f) it.next();
            fVar.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append(fVar.a.a);
            sb.append(':');
            sb.append(fVar.b);
            arrayList2.add(sb.toString());
        }
        this.b = com.yandex.plus.core.locale.b.e(arrayList2);
    }

    public ff(com.yandex.passport.common.core.f fVar) {
        this.a = 20;
        fVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(fVar.a.a);
        sb.append(':');
        sb.append(fVar.b);
        this.b = sb.toString();
    }

    public ff(com.yandex.passport.internal.upgrader.p pVar) {
        String str;
        this.a = 23;
        int ordinal = pVar.ordinal();
        if (ordinal == 0) {
            str = "cached";
        } else if (ordinal == 1) {
            str = "actual";
        } else if (ordinal == 2) {
            str = "relevance_check";
        } else {
            b6e.s();
            throw null;
        }
        this.b = str;
    }

    public ff(com.yandex.passport.internal.upgrader.o oVar) {
        String str;
        this.a = 22;
        oVar.getClass();
        int ordinal = oVar.ordinal();
        if (ordinal == 0) {
            str = "regular";
        } else if (ordinal == 1) {
            str = "relevance";
        } else if (ordinal == 2) {
            str = ServiceCommand.TYPE_REQ;
        } else {
            b6e.s();
            throw null;
        }
        this.b = str;
    }

    public ff(Throwable th) {
        this.a = 10;
        th.getClass();
        this.b = fob.b(th);
    }

    public ff(com.yandex.passport.internal.ui.sloth.webcard.s0 s0Var) {
        this.a = 27;
        s0Var.getClass();
        this.b = s0Var.toString();
    }

    public ff(List list) {
        this.a = 21;
        this.b = list.toString();
    }

    public ff(long j, int i) {
        this.a = i;
        switch (i) {
            case 18:
                this.b = String.valueOf(j);
                break;
            default:
                this.b = String.valueOf(j);
                break;
        }
    }

    public ff(com.yandex.passport.internal.report.reporters.q1 q1Var) {
        String str;
        this.a = 2;
        int ordinal = q1Var.ordinal();
        if (ordinal == 0) {
            str = "data push";
        } else if (ordinal == 1) {
            str = "notification push";
        } else {
            b6e.s();
            throw null;
        }
        this.b = str;
    }

    public ff(int i, boolean z) {
        this.a = i;
        switch (i) {
            case 8:
                this.b = String.valueOf(z);
                break;
            case 9:
                this.b = String.valueOf(z);
                break;
            case 25:
                this.b = String.valueOf(z);
                break;
            case 26:
                this.b = String.valueOf(z);
                break;
            default:
                this.b = String.valueOf(z);
                break;
        }
    }
}
