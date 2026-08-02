package com.yandex.plus.home.datasource.openapi.apis;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.core.openapi.a;
import com.yandex.plus.home.datasource.openapi.models.b6;
import com.yandex.plus.home.datasource.openapi.models.m4;
import defpackage.a0k;
import defpackage.k83;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/yandex/plus/home/datasource/openapi/apis/PlusStateControllerApi;", "", "Lcom/yandex/plus/home/datasource/openapi/models/m4;", "networkLocationModel", "Lcom/yandex/plus/core/openapi/a;", "Lcom/yandex/plus/home/datasource/openapi/models/b6;", "a", "(Lcom/yandex/plus/home/datasource/openapi/models/m4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "plus-home-data-openapi-model_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public interface PlusStateControllerApi {
    @a0k("/v1/plus-state")
    Object a(@k83 @NotNull m4 m4Var, @NotNull Continuation<? super a<b6>> continuation);
}
