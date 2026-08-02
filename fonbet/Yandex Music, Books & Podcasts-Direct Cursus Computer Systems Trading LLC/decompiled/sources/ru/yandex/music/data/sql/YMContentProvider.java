package ru.yandex.music.data.sql;

import android.content.Context;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.c5b;
import defpackage.lme;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/music/data/sql/YMContentProvider;", "Llme;", "", "<init>", "()V", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class YMContentProvider implements lme {
    public static volatile boolean a;

    @Override // defpackage.lme
    public final List a() {
        return c5b.a;
    }

    @Override // defpackage.lme
    public final Object create(Context context) {
        context.getClass();
        a = true;
        return Unit.a;
    }
}
