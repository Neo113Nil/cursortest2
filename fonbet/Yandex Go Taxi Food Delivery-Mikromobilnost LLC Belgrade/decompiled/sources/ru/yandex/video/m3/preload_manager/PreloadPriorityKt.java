package ru.yandex.video.m3.preload_manager;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.preload_manager.PreloadPriority;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0007\u0010\b\"\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "priority", "Lkotlin/Function1;", "Lru/yandex/video/m3/preload_manager/PreloadPriority$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/preload_manager/PreloadPriority;", "PreloadPriority", "(ILtls;)Lru/yandex/video/m3/preload_manager/PreloadPriority;", "HIGHEST_PRIORITY", "Lru/yandex/video/m3/preload_manager/PreloadPriority;", "getHIGHEST_PRIORITY", "()Lru/yandex/video/m3/preload_manager/PreloadPriority;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PreloadPriorityKt {
    private static final PreloadPriority HIGHEST_PRIORITY = PreloadPriority$default(Integer.MAX_VALUE, null, 2, null);

    public static final /* synthetic */ PreloadPriority PreloadPriority(int i, tls tlsVar) {
        PreloadPriority.Builder builder = new PreloadPriority.Builder(i);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ PreloadPriority PreloadPriority$default(int i, tls tlsVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.preload_manager.PreloadPriorityKt$PreloadPriority$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((PreloadPriority.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(PreloadPriority.Builder builder) {
                }
            };
        }
        return PreloadPriority(i, tlsVar);
    }

    public static final PreloadPriority getHIGHEST_PRIORITY() {
        return HIGHEST_PRIORITY;
    }
}
