package ru.kinopoisk.sdk.easylogin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.w3f;
import defpackage.w4f;
import defpackage.x3f;
import defpackage.z4f;
import defpackage.z7o;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class C2 implements InterfaceC1281x2 {

    @NotNull
    public static final I8 e;

    @NotNull
    public final E1 a;

    @NotNull
    public final Q2 b;
    public final SharedPreferences c;

    @NotNull
    public final w3f d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/C2$a;", "", "", "PREFERENCES_NAME", "Ljava/lang/String;", "TAG", "Lru/kinopoisk/sdk/easylogin/internal/M1;", "VALUE_META", "Lru/kinopoisk/sdk/easylogin/internal/M1;", "android_config_remoteconfig_impl"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
        M1.a.getClass();
        e = new I8("dev-panel");
    }

    public C2(@NotNull Context context, @NotNull E1 e1, @NotNull Q2 q2) {
        context.getClass();
        e1.getClass();
        q2.getClass();
        this.a = e1;
        this.b = q2;
        this.c = context.getSharedPreferences("kp_dev_panel_config", 0);
        this.d = x3f.d;
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1281x2
    public final K7 a(@NotNull String str) {
        Object t7oVar;
        str.getClass();
        String string = this.c.getString(str, null);
        if (string == null) {
            return null;
        }
        w3f w3fVar = this.d;
        try {
            r7o r7oVar = z7o.b;
            w3fVar.getClass();
            t7oVar = (w4f) w3fVar.b(z4f.a, string);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        if (z7o.a(t7oVar) != null) {
            Timber.INSTANCE.tag("DevPanelConfigDataSource").e("Failed to parse to JsonElement %s", string);
        }
        if (t7oVar instanceof t7o) {
            t7oVar = null;
        }
        w4f w4fVar = (w4f) t7oVar;
        if (w4fVar != null) {
            return new K7(w4fVar, e);
        }
        return null;
    }
}
