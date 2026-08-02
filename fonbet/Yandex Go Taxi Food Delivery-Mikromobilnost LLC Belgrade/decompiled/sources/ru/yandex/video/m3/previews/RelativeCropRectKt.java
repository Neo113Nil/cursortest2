package ru.yandex.video.m3.previews;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.previews.RelativeCropRect;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "left", "top", "right", "bottom", "Lkotlin/Function1;", "Lru/yandex/video/m3/previews/RelativeCropRect$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/previews/RelativeCropRect;", "RelativeCropRect", "(FFFFLtls;)Lru/yandex/video/m3/previews/RelativeCropRect;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RelativeCropRectKt {
    public static final /* synthetic */ RelativeCropRect RelativeCropRect(float f, float f2, float f3, float f4, tls tlsVar) {
        RelativeCropRect.Builder builder = new RelativeCropRect.Builder(f, f2, f3, f4);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ RelativeCropRect RelativeCropRect$default(float f, float f2, float f3, float f4, tls tlsVar, int i, Object obj) {
        if ((i & 16) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.previews.RelativeCropRectKt$RelativeCropRect$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((RelativeCropRect.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(RelativeCropRect.Builder builder) {
                }
            };
        }
        return RelativeCropRect(f, f2, f3, f4, tlsVar);
    }
}
