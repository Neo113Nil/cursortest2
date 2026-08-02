package ru.yandex.video.m3.list_player_manager.impl;

import defpackage.tls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.list_player_manager.impl.InitParameters;

@Metadata(d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aI\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "from", "deviceId", "", "testIds", "", "isFailFast", "Lkotlin/Function1;", "Lru/yandex/video/m3/list_player_manager/impl/InitParameters$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/list_player_manager/impl/InitParameters;", "InitParameters", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLtls;)Lru/yandex/video/m3/list_player_manager/impl/InitParameters;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InitParametersKt {
    public static final /* synthetic */ InitParameters InitParameters(String str, String str2, List list, boolean z, tls tlsVar) {
        InitParameters.Builder builder = new InitParameters.Builder(str, str2, list, z);
        tlsVar.invoke(builder);
        return builder.build();
    }

    public static /* synthetic */ InitParameters InitParameters$default(String str, String str2, List list, boolean z, tls tlsVar, int i, Object obj) {
        if ((i & 16) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.list_player_manager.impl.InitParametersKt$InitParameters$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((InitParameters.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(InitParameters.Builder builder) {
                }
            };
        }
        return InitParameters(str, str2, list, z, tlsVar);
    }
}
