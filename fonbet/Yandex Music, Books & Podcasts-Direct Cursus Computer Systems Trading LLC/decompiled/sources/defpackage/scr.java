package defpackage;

import kotlin.jvm.functions.Function2;
import ru.yandex.music.common.media.queue.YnisonPassiveLaunchException;

/* loaded from: classes5.dex */
public final /* synthetic */ class scr extends ezc implements Function2 {
    public static final scr a = new scr(2, YnisonPassiveLaunchException.class, "<init>", "<init>(Lcom/yandex/music/shared/ynison/api/queue/YnisonRemoteLaunchCommand$Tracks;Ljava/lang/String;)V", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mow mowVar = (mow) obj;
        String str = (String) obj2;
        mowVar.getClass();
        str.getClass();
        return new YnisonPassiveLaunchException(mowVar, str);
    }
}
