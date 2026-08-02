package com.yandex.messenger.websdk.api;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.h0i;
import defpackage.k5r;
import defpackage.v3w;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messenger/websdk/api/MessengerParams;", "", "websdk_release"}, k = 1, mv = {2, 1, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final /* data */ class MessengerParams {
    public final String a;
    public final MessengerEnvironment b;
    public final boolean c;
    public final boolean d;

    public MessengerParams(String str, boolean z, boolean z2, int i) {
        z2 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? false : z2;
        this.a = str;
        this.b = h0i.a;
        this.c = z;
        this.d = z2;
    }

    public final String a() {
        String str = StringsKt.U("music") ? null : "music";
        return str != null ? "android_".concat(str) : ConstantDeviceInfo.APP_PLATFORM;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessengerParams)) {
            return false;
        }
        MessengerParams messengerParams = (MessengerParams) obj;
        return Intrinsics.d(this.a, messengerParams.a) && this.b.equals(messengerParams.b) && this.c == messengerParams.c && this.d == messengerParams.d;
    }

    public final int hashCode() {
        int hashCode = (((Long.hashCode(147L) - 203313179) * 31) + 104263205) * 31;
        String str = this.a;
        return k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e((this.b.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 961, 31, this.c), 31, false), 31, false), 961, false), 31, false), 31, false), 31, true), 31, true), 31, true), 31, false), 29791, false), 31, false), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessengerParams(serviceId=ru.yandex.music_release, originService=147, workspace=music, uuid=");
        sb.append(this.a);
        sb.append(", environment=");
        sb.append(this.b);
        sb.append(", locale=null, autoCreateAnonymousAccount=");
        return v3w.g(sb, this.c, ", disableStikers=false, disableDisplayRestriction=false, voice=false, translatorParams=null, enableChatList=false, backNavigationEnabled=false, enableChatListSync=true, waitChatHistory=true, allowHttpCounters=true, detailedCounters=false, enableImportantMessages=false, themeParams=null, customWebParams=null, useWebViewPageApi=false, enableYaCertificates=", this.d, ", debugConfiguration=null)");
    }
}
