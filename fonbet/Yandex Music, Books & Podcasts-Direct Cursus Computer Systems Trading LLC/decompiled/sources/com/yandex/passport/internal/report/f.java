package com.yandex.passport.internal.report;

import com.connectsdk.device.ConnectableDevice;
import defpackage.v75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class f implements ze {
    public final /* synthetic */ int a;
    public final String b;

    public f(int i, boolean z) {
        this.a = i;
        switch (i) {
            case 9:
                this.b = String.valueOf(z);
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 22:
            default:
                this.b = String.valueOf(z);
                break;
            case 15:
                this.b = String.valueOf(z);
                break;
            case 16:
                this.b = String.valueOf(z);
                break;
            case 17:
                this.b = String.valueOf(z);
                break;
            case 18:
                this.b = String.valueOf(z);
                break;
            case 19:
                this.b = String.valueOf(z);
                break;
            case 20:
                this.b = String.valueOf(z);
                break;
            case 21:
                this.b = String.valueOf(z);
                break;
            case 23:
                this.b = String.valueOf(z);
                break;
            case 24:
                this.b = String.valueOf(z);
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
                return "esia_error";
            case 1:
                return "esia_session_id";
            case 2:
                return "way";
            case 3:
                return "event_name";
            case 4:
                return "exit_reason_description";
            case 5:
                return "exit_reason";
            case 6:
                return "exit_timestamp_epoch_ms";
            case 7:
                return "flow_id";
            case 8:
                return "force_native";
            case 9:
                return "force_update";
            case 10:
                return "fromLoginSDK";
            case 11:
                return "from";
            case 12:
                return "host";
            case 13:
                return "hosts";
            case 14:
                return ConnectableDevice.KEY_ID;
            case 15:
                return "is_actual";
            case 16:
                return "is_face_recognized";
            case 17:
                return "is_finishing";
            case 18:
                return "is_flow_successful";
            case 19:
                return "is_need_crypto_sdk_init";
            case 20:
                return "is_relogin";
            case 21:
                return "is_remove_account_explicitly";
            case 22:
                return "is_silent";
            case 23:
                return "xtoken_has_muid";
            case 24:
                return "is_webauthn_available";
            case 25:
                return "keys";
            case 26:
                return "language";
            case 27:
                return "link_mode";
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return "login_action";
            default:
                return "logout_option";
        }
    }

    @Override // com.yandex.passport.internal.report.ze
    public final String getValue() {
        switch (this.a) {
        }
        return this.b;
    }

    public f(ArrayList arrayList) {
        String str;
        this.a = 13;
        try {
            ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                str2.getClass();
                arrayList2.add(com.yandex.passport.common.url.b.d(str2));
            }
            str = CollectionsKt.X(arrayList2, null, null, null, null, 63);
        } catch (Exception unused) {
            str = "null";
        }
        this.b = str;
    }

    public f(com.yandex.passport.api.w0 w0Var) {
        this.a = 28;
        w0Var.getClass();
        this.b = w0Var.toString();
    }

    public /* synthetic */ f(String str, int i, boolean z) {
        this.a = i;
        this.b = str;
    }

    public f(com.yandex.passport.internal.links.h hVar) {
        this.a = 27;
        hVar.getClass();
        this.b = hVar.a;
    }

    public f(Set set) {
        this.a = 25;
        this.b = com.yandex.plus.core.locale.b.e(set);
    }

    public f(long j) {
        this.a = 6;
        this.b = String.valueOf(j);
    }

    public f(String str, int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = str == null ? "null" : str;
                break;
            case 7:
                this.b = String.valueOf(str);
                break;
            case 10:
                str.getClass();
                this.b = str;
                break;
            case 11:
                str.getClass();
                this.b = str;
                break;
            case 12:
                String str2 = "null";
                if (str != null) {
                    try {
                        str2 = com.yandex.passport.common.url.b.d(str);
                    } catch (Exception unused) {
                    }
                }
                this.b = str2;
                break;
            case 14:
                str.getClass();
                this.b = str;
                break;
            default:
                str.getClass();
                this.b = str;
                break;
        }
    }

    public f(Boolean bool) {
        this.a = 22;
        this.b = String.valueOf(bool);
    }
}
