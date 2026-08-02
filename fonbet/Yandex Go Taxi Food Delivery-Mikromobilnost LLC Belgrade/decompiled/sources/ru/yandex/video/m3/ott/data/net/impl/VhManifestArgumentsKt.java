package ru.yandex.video.m3.ott.data.net.impl;

import android.content.Context;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.net.impl.VhManifestArguments;
import ru.yandex.video.m3.player.impl.utils.InfoProviderImpl;

@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"", "userAgent", "Lkotlin/Function1;", "Lru/yandex/video/m3/ott/data/net/impl/VhManifestArguments$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/ott/data/net/impl/VhManifestArguments;", "VhManifestArguments", "(Ljava/lang/String;Ltls;)Lru/yandex/video/m3/ott/data/net/impl/VhManifestArguments;", "Landroid/content/Context;", "context", "(Landroid/content/Context;Ltls;)Lru/yandex/video/m3/ott/data/net/impl/VhManifestArguments;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VhManifestArgumentsKt {
    public static final /* synthetic */ VhManifestArguments VhManifestArguments(Context context, tls tlsVar) {
        return VhManifestArguments(new InfoProviderImpl(context).getUserAgent(), tlsVar);
    }

    public static /* synthetic */ VhManifestArguments VhManifestArguments$default(String str, tls tlsVar, int i, Object obj) {
        if ((i & 2) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.ott.data.net.impl.VhManifestArgumentsKt$VhManifestArguments$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((VhManifestArguments.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(VhManifestArguments.Builder builder) {
                }
            };
        }
        return VhManifestArguments(str, tlsVar);
    }

    public static /* synthetic */ VhManifestArguments VhManifestArguments$default(Context context, tls tlsVar, int i, Object obj) {
        if ((i & 2) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.ott.data.net.impl.VhManifestArgumentsKt$VhManifestArguments$2
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((VhManifestArguments.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(VhManifestArguments.Builder builder) {
                }
            };
        }
        return VhManifestArguments(context, tlsVar);
    }

    public static final /* synthetic */ VhManifestArguments VhManifestArguments(String str, tls tlsVar) {
        VhManifestArguments.Builder builder = new VhManifestArguments.Builder(str);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }
}
