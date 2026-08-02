package ru.yandex.video.m3.offline;

import defpackage.tls;
import defpackage.zy11;
import java.io.File;
import kotlin.Metadata;
import ru.yandex.video.m3.offline.DownloadDirectory;

@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "isActive", "isExternal", "isCreated", "Ljava/io/File;", "file", "Lkotlin/Function1;", "Lru/yandex/video/m3/offline/DownloadDirectory$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/offline/DownloadDirectory;", "DownloadDirectory", "(ZZZLjava/io/File;Ltls;)Lru/yandex/video/m3/offline/DownloadDirectory;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DownloadDirectoryKt {
    public static final /* synthetic */ DownloadDirectory DownloadDirectory(boolean z, boolean z2, boolean z3, File file, tls tlsVar) {
        DownloadDirectory.Builder builder = new DownloadDirectory.Builder(z, z2, z3, file);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ DownloadDirectory DownloadDirectory$default(boolean z, boolean z2, boolean z3, File file, tls tlsVar, int i, Object obj) {
        if ((i & 16) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.offline.DownloadDirectoryKt$DownloadDirectory$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((DownloadDirectory.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(DownloadDirectory.Builder builder) {
                }
            };
        }
        return DownloadDirectory(z, z2, z3, file, tlsVar);
    }
}
