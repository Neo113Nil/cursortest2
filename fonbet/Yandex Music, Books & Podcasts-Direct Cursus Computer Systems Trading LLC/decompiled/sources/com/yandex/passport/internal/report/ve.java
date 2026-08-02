package com.yandex.passport.internal.report;

import com.yandex.metrica.push.common.CoreConstants;
import defpackage.b6e;
import defpackage.v75;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class ve implements ze {
    public final /* synthetic */ int a;
    public final String b;

    public ve(String str, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = str != null ? String.valueOf(com.yandex.passport.internal.util.l.b(str)) : "null";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 12:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 26:
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
            default:
                this.b = String.valueOf(com.yandex.passport.internal.util.l.b(str));
                break;
            case 7:
                str.getClass();
                this.b = str;
                break;
            case 8:
                this.b = str == null ? "" : str;
                break;
            case 9:
                this.b = String.valueOf(str);
                break;
            case 10:
                this.b = String.valueOf(str);
                break;
            case 11:
                this.b = str == null ? "" : str;
                break;
            case 13:
                this.b = str == null ? "" : str;
                break;
            case 14:
                this.b = String.valueOf(str);
                break;
            case 17:
                str.getClass();
                this.b = str;
                break;
            case 22:
                str.getClass();
                this.b = str;
                break;
            case 23:
                str.getClass();
                this.b = str;
                break;
            case 24:
                this.b = String.valueOf(str);
                break;
            case 25:
                this.b = str == null ? "null" : str;
                break;
            case 27:
                str.getClass();
                this.b = str;
                break;
            case 29:
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
                return "mask_master_token";
            case 1:
                return "mask_new_master_token";
            case 2:
                return "muid_list";
            case 3:
                return "muid";
            case 4:
                return "members_to_logout";
            case 5:
                return "method";
            case 6:
                return "minutes";
            case 7:
                return "new_state";
            case 8:
                return "notification_message";
            case 9:
                return "old_state";
            case 10:
                return "place";
            case 11:
                return "push_id";
            case 12:
                return "push_platform";
            case 13:
                return "push_platform";
            case 14:
                return "push_service";
            case 15:
                return "push_permission";
            case 16:
                return "pushes_enabled_on_device";
            case 17:
                return "reason";
            case 18:
                return "recipient_package_names";
            case 19:
                return "request_code";
            case 20:
                return CommonUrlParts.REQUEST_ID;
            case 21:
                return "result_code";
            case 22:
                return "scope";
            case 23:
                return "sender";
            case 24:
                return "service";
            case 25:
                return "session_hash";
            case 26:
                return "should_revoke_token";
            case 27:
                return "sid";
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return "size";
            default:
                return "social_application_value";
        }
    }

    @Override // com.yandex.passport.internal.report.ze
    public final String getValue() {
        switch (this.a) {
        }
        return this.b;
    }

    public ve(int i, int i2) {
        this.a = i2;
        switch (i2) {
            case 19:
                this.b = String.valueOf(i);
                break;
            case 21:
                this.b = String.valueOf(i);
                break;
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                this.b = String.valueOf(i);
                break;
            default:
                this.b = String.valueOf(i);
                break;
        }
    }

    public ve(ArrayList arrayList, int i) {
        this.a = i;
        switch (i) {
            case 4:
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
                break;
            default:
                arrayList.getClass();
                ArrayList arrayList3 = new ArrayList(v75.o(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    com.yandex.passport.common.core.f fVar2 = (com.yandex.passport.common.core.f) it2.next();
                    fVar2.getClass();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(fVar2.a.a);
                    sb2.append(':');
                    sb2.append(fVar2.b);
                    arrayList3.add(sb2.toString());
                }
                this.b = com.yandex.plus.core.locale.b.e(arrayList3);
                break;
        }
    }

    public ve(Long l) {
        this.a = 3;
        this.b = String.valueOf(l);
    }

    public ve(int i, boolean z) {
        this.a = i;
        switch (i) {
            case 16:
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

    public ve(com.yandex.passport.api.v2 v2Var) {
        String str;
        this.a = 12;
        v2Var.getClass();
        int ordinal = v2Var.ordinal();
        if (ordinal == 0) {
            str = "fcm";
        } else if (ordinal == 1) {
            str = CoreConstants.Transport.HMS;
        } else if (ordinal == 2) {
            str = CoreConstants.Transport.RUSTORE;
        } else {
            b6e.s();
            throw null;
        }
        this.b = str;
    }

    public ve(List list) {
        this.a = 18;
        this.b = list.toString();
    }

    public /* synthetic */ ve(String str, int i, boolean z) {
        this.a = i;
        this.b = str;
    }
}
