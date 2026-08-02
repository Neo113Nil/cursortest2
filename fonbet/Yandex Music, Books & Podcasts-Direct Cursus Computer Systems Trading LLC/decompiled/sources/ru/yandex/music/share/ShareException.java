package ru.yandex.music.share;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.ugb;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/music/share/ShareException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public class ShareException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareException(String str) {
        super(str, null);
        ugb ugbVar = ugb.a;
    }

    public ShareException(ugb ugbVar, String str, IOException iOException) {
        super(str, iOException);
    }
}
