package com.yandex.passport.internal.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import com.yandex.passport.api.w0;
import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<a> CREATOR = new com.yandex.passport.api.impl.a(28);
    public static final a d;
    public static final a e;
    public static final a f;
    public static final a g;
    public static final a h;
    public static final a i;
    public static final a j;
    public static final a k;
    public static final a l;
    public static final a m;
    public static final a n;
    public static final a o;
    public static final a p;
    public static final a q;
    public static final a r;
    public static final a s;
    public static final a t;
    public static final a u;
    public static final a v;
    public static final a w;
    public static final a x;
    public static final a y;
    public static final a z;
    public final String a;
    public final w0 b;
    public final boolean c;

    static {
        w0 w0Var = w0.c;
        d = new a("Login", w0Var, false);
        new a("captcha", w0Var, false);
        new a("Registration", w0.e, false);
        new a("credential_manager", w0Var, false);
        new a("upgrade_social_account", null, false);
        new a("upgrade_neophonish_account", null, false);
        new a("upgrade_lite_account", null, false);
        e = new a("phonish", w0.f, false);
        new a("totp", w0.d, false);
        f = new a("device_code", null, false);
        g = new a("external_action_webview", w0Var, false);
        h = new a("cookie", null, false);
        i = new a("qr_on_tv_webview", w0.k, false);
        w0 w0Var2 = w0.b;
        j = new a("social_browser", w0Var2, false);
        k = new a("social_webview", w0Var2, false);
        l = new a("social_native", w0Var2, false);
        m = new a("code", null, false);
        n = new a("autologin", w0.g, false);
        o = new a("mailish_native", null, false);
        p = new a("mailish_external", null, false);
        q = new a("mailish_webview", null, false);
        r = new a("mailish_password", null, false);
        s = new a("mailish_gimap", w0.i, false);
        new a("credentials", null, false);
        w0 w0Var3 = w0.j;
        new a("magic_link_auth", w0Var3, false);
        new a("magic_link_reg", w0Var3, false);
        t = new a("track_id", w0Var3, false);
        u = new a("auth_by_sms", w0.l, false);
        new a("auth_neo_phonish", w0.m, false);
        w0 w0Var4 = w0.n;
        new a("reg_neo_phonish", w0Var4, false);
        v = new a("update_phonish", w0Var4, false);
        new a("web_login", w0Var, false);
        w = new a("raw_json", null, false);
        x = new a("sloth", null, false);
        y = new a(CameraProperty.ROTATION, null, false);
        z = new a("muid", null, false);
    }

    public a(String str, w0 w0Var, boolean z2) {
        str.getClass();
        this.a = str;
        this.b = w0Var;
        this.c = z2;
    }

    public final p d() {
        return new p(this.a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        w0 w0Var = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (w0Var == null ? 0 : w0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnalyticsFromValue(fromValue=");
        sb.append(this.a);
        sb.append(", loginAction=");
        sb.append(this.b);
        sb.append(", fromLoginSdk=");
        return dfi.j(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.getClass();
        parcel.writeString(this.a);
        w0 w0Var = this.b;
        if (w0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(w0Var.name());
        }
        parcel.writeInt(this.c ? 1 : 0);
    }
}
