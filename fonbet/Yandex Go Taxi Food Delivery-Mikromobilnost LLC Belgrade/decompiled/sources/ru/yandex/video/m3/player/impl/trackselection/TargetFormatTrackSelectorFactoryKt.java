package ru.yandex.video.m3.player.impl.trackselection;

import android.content.Context;
import defpackage.omh;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.player.impl.trackselection.TargetFormatTrackSelectorFactory;
import ru.yandex.video.m3.player.mesure.TargetFormatProvider;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroid/content/Context;", "context", "Lru/yandex/video/m3/player/mesure/TargetFormatProvider;", "targetFormatProvider", "Lomh;", "trackSelectorParameters", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/impl/trackselection/TargetFormatTrackSelectorFactory$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/player/impl/trackselection/TargetFormatTrackSelectorFactory;", "TargetFormatTrackSelectorFactory", "(Landroid/content/Context;Lru/yandex/video/m3/player/mesure/TargetFormatProvider;Lomh;Ltls;)Lru/yandex/video/m3/player/impl/trackselection/TargetFormatTrackSelectorFactory;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TargetFormatTrackSelectorFactoryKt {
    public static final /* synthetic */ TargetFormatTrackSelectorFactory TargetFormatTrackSelectorFactory(Context context, TargetFormatProvider targetFormatProvider, omh omhVar, tls tlsVar) {
        TargetFormatTrackSelectorFactory.Builder builder = new TargetFormatTrackSelectorFactory.Builder(context, targetFormatProvider, omhVar);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ TargetFormatTrackSelectorFactory TargetFormatTrackSelectorFactory$default(Context context, TargetFormatProvider targetFormatProvider, omh omhVar, tls tlsVar, int i, Object obj) {
        if ((i & 8) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.player.impl.trackselection.TargetFormatTrackSelectorFactoryKt$TargetFormatTrackSelectorFactory$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((TargetFormatTrackSelectorFactory.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(TargetFormatTrackSelectorFactory.Builder builder) {
                }
            };
        }
        return TargetFormatTrackSelectorFactory(context, targetFormatProvider, omhVar, tlsVar);
    }
}
