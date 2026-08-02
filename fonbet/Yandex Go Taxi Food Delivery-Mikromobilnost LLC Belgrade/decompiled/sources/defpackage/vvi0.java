package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes11.dex */
public final class vvi0 {
    public final String a;
    public final String b;

    public vvi0(fl10 fl10Var) {
        this.a = fl10Var.y("gcm.n.title");
        fl10Var.w("gcm.n.title");
        Object[] v = fl10Var.v("gcm.n.title");
        if (v != null) {
            String[] strArr = new String[v.length];
            for (int i = 0; i < v.length; i++) {
                strArr[i] = String.valueOf(v[i]);
            }
        }
        this.b = fl10Var.y("gcm.n.body");
        fl10Var.w("gcm.n.body");
        Object[] v2 = fl10Var.v("gcm.n.body");
        if (v2 != null) {
            String[] strArr2 = new String[v2.length];
            for (int i2 = 0; i2 < v2.length; i2++) {
                strArr2[i2] = String.valueOf(v2[i2]);
            }
        }
        fl10Var.y("gcm.n.icon");
        if (TextUtils.isEmpty(fl10Var.y("gcm.n.sound2"))) {
            fl10Var.y("gcm.n.sound");
        }
        fl10Var.y("gcm.n.tag");
        fl10Var.y("gcm.n.color");
        fl10Var.y("gcm.n.click_action");
        fl10Var.y("gcm.n.android_channel_id");
        String y = fl10Var.y("gcm.n.link_android");
        y = TextUtils.isEmpty(y) ? fl10Var.y("gcm.n.link") : y;
        if (!TextUtils.isEmpty(y)) {
            Uri.parse(y);
        }
        fl10Var.y("gcm.n.image");
        fl10Var.y("gcm.n.ticker");
        fl10Var.s("gcm.n.notification_priority");
        fl10Var.s("gcm.n.visibility");
        fl10Var.s("gcm.n.notification_count");
        fl10Var.p("gcm.n.sticky");
        fl10Var.p("gcm.n.local_only");
        fl10Var.p("gcm.n.default_sound");
        fl10Var.p("gcm.n.default_vibrate_timings");
        fl10Var.p("gcm.n.default_light_settings");
        String y2 = fl10Var.y("gcm.n.event_time");
        if (!TextUtils.isEmpty(y2)) {
            try {
                Long.parseLong(y2);
            } catch (NumberFormatException unused) {
            }
        }
        fl10Var.u();
        fl10Var.z();
    }
}
