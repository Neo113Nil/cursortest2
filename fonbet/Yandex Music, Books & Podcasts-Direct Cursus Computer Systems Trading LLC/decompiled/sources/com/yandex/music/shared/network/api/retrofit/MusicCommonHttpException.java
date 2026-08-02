package com.yandex.music.shared.network.api.retrofit;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.vz1;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/music/shared/network/api/retrofit/MusicCommonHttpException;", "Ljava/io/IOException;", "shared-network"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class MusicCommonHttpException extends IOException {
    public final int a;
    public final String b;
    public final String c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MusicCommonHttpException(int i, String str, String str2) {
        super(vz1.s(r0, str, ", Call ", str2));
        str.getClass();
        str2.getClass();
        StringBuilder sb = new StringBuilder("HTTP ");
        sb.append(i);
        sb.append(StringUtil.SPACE);
        this.a = i;
        this.b = str;
        this.c = str2;
    }
}
