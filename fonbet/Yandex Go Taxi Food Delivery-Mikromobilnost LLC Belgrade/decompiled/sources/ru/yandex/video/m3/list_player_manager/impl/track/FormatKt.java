package ru.yandex.video.m3.list_player_manager.impl.track;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.list_player_manager.impl.track.Format;

@Metadata(d1 = {"\u0000$\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "width", "height", "bitrate", "", "frameRate", "Lkotlin/Function1;", "Lru/yandex/video/m3/list_player_manager/impl/track/Format$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/list_player_manager/impl/track/Format;", "Format", "(IIIFLtls;)Lru/yandex/video/m3/list_player_manager/impl/track/Format;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FormatKt {
    public static final /* synthetic */ Format Format(int i, int i2, int i3, float f, tls tlsVar) {
        Format.Builder builder = new Format.Builder(i, i2, i3, f);
        tlsVar.invoke(builder);
        return builder.build();
    }

    public static /* synthetic */ Format Format$default(int i, int i2, int i3, float f, tls tlsVar, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.list_player_manager.impl.track.FormatKt$Format$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Format.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(Format.Builder builder) {
                }
            };
        }
        return Format(i, i2, i3, f, tlsVar);
    }
}
