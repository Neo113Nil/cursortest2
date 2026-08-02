package com.yandex.passport.internal.social;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import com.yandex.passport.R;
import defpackage.hq0;
import defpackage.xy0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData$UgcLiveStatus;

/* loaded from: classes4.dex */
public class VkNativeSocialAuthActivity extends hq0 {
    public static final List b = Collections.singletonList(UgcLiveVideoData$UgcLiveStatus.OFFLINE);
    public static final xy0 c;
    public Integer a;

    static {
        xy0 xy0Var = new xy0(0);
        c = xy0Var;
        xy0Var.put("com.yandex.browser", 4168423);
        xy0Var.put("com.yandex.mobile.drive", 6266343);
        xy0Var.put("com.yandex.yamb", 6223342);
        xy0Var.put("com.yandex.zen", 6407405);
        xy0Var.put("com.yandex.zen.logged", 6451395);
        xy0Var.put("com.yandex.zen.logged.debug", 6451404);
        xy0Var.put("ru.yandex.direct", 6223332);
        xy0Var.put("ru.yandex.disk", 5396931);
        xy0Var.put("ru.yandex.mail", 6222625);
        xy0Var.put("ru.yandex.market", 5205642);
        xy0Var.put("ru.yandex.med", 6119393);
        xy0Var.put("ru.yandex.mobile.avia", 6222647);
        xy0Var.put("ru.yandex.mobile.metrica", 5785050);
        xy0Var.put("ru.yandex.money", 5707554);
        xy0Var.put("ru.yandex.music", 4579733);
        xy0Var.put("ru.yandex.parking", 4878344);
        xy0Var.put("ru.yandex.radio", 4944202);
        xy0Var.put("ru.yandex.rasp", 6222636);
        xy0Var.put("ru.yandex.searchplugin", 6222615);
        xy0Var.put("ru.yandex.taxi", 6223320);
        xy0Var.put("ru.yandex.translate", 6222643);
        xy0Var.put("ru.yandex.weatherplugin", 6125442);
        xy0Var.put("ru.yandex.yandexbus", 6222472);
        xy0Var.put("ru.yandex.yandexmaps", 6222456);
        xy0Var.put("ru.yandex.yandexnavi", 6222075);
        xy0Var.put("ru.yandex.market.fulfillment", 6362460);
        xy0Var.put("com.yandex.passport.testapp1", 6044616);
        xy0Var.put("ru.yandex.auth.client", 5743171);
    }

    @Override // androidx.fragment.app.t, defpackage.hn5, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        HashMap hashMap;
        super.onActivityResult(i, i2, intent);
        if (i != 1 || i2 != -1 || intent == null) {
            NativeSocialHelper.onCancel(this);
            return;
        }
        if (intent.getExtras() != null) {
            hashMap = new HashMap();
            for (String str : intent.getExtras().keySet()) {
                hashMap.put(str, String.valueOf(intent.getExtras().get(str)));
            }
        } else {
            hashMap = null;
        }
        String str2 = hashMap != null ? (String) hashMap.get("access_token") : null;
        if (str2 != null) {
            NativeSocialHelper.onTokenReceived(this, str2, Integer.toString(this.a.intValue()));
            return;
        }
        d dVar = new d();
        dVar.b = -101;
        dVar.d = (String) hashMap.get("error_reason");
        String decode = Uri.decode((String) hashMap.get("error_description"));
        dVar.c = decode;
        if (hashMap.containsKey("fail")) {
            dVar.d = "Action failed";
        }
        if (hashMap.containsKey("cancel")) {
            dVar.b = -102;
            dVar.d = "User canceled request";
        }
        if (decode != null || ((String) dVar.d) != null) {
            dVar = new d();
            dVar.b = -102;
        }
        if (dVar.b == -102) {
            NativeSocialHelper.onCancel(this);
        } else {
            NativeSocialHelper.onFailure(this, new Exception((String) dVar.c));
        }
    }

    @Override // androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Integer num;
        super.onCreate(bundle);
        try {
            num = Integer.valueOf(getResources().getInteger(R.integer.passport_vk_application_id));
        } catch (Resources.NotFoundException unused) {
            num = (Integer) c.get(getPackageName());
        }
        this.a = num;
        if (num == null) {
            com.yandex.passport.legacy.a.e(3, "Native authorization not available: vk application ID for you application not found . Please contact with library developers", null);
            NativeSocialHelper.onNativeNotSupported(this);
            return;
        }
        if (bundle == null) {
            Iterator<ResolveInfo> it = getPackageManager().queryIntentActivities(new Intent("com.vkontakte.android.action.SDK_AUTH", (Uri) null), 0).iterator();
            while (it.hasNext()) {
                if (it.next().activityInfo.enabled) {
                    try {
                        startActivityForResult(com.yandex.plus.pay.ui.core.b.n(b, this.a.intValue()), 1);
                        return;
                    } catch (Exception e) {
                        com.yandex.passport.legacy.a.d(e);
                        NativeSocialHelper.onNativeNotSupported(this);
                        return;
                    }
                }
            }
            NativeSocialHelper.onNativeNotSupported(this);
        }
    }
}
