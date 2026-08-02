package ru.yandex.video.m3.list_player_manager.impl;

import android.util.Log;
import defpackage.d7;
import defpackage.fse;
import defpackage.ljo;
import defpackage.lse;
import defpackage.mse;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"ru/yandex/video/m3/list_player_manager/impl/ListYandexPlayerManagerInstanceProvider$setupScope$$inlined$CoroutineExceptionHandler$1", "Ld7;", "Lmse;", "Lfse;", "context", "", Constants.KEY_EXCEPTION, "Lzy11;", "handleException", "(Lfse;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ListYandexPlayerManagerInstanceProvider$setupScope$$inlined$CoroutineExceptionHandler$1 extends d7 implements mse {
    public ListYandexPlayerManagerInstanceProvider$setupScope$$inlined$CoroutineExceptionHandler$1(lse lseVar) {
        super(lseVar);
    }

    @Override // defpackage.mse
    public void handleException(fse context, Throwable exception) {
        Log.e("LYPMProvider", ljo.b(exception));
    }
}
