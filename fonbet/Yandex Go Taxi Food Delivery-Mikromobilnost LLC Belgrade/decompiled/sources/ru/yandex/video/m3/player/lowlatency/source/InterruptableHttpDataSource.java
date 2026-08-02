package ru.yandex.video.m3.player.lowlatency.source;

import android.net.Uri;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import defpackage.cj01;
import defpackage.npg;
import defpackage.xuu;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/lowlatency/source/InterruptableHttpDataSource;", "Lxuu;", "", "tryInterruptPendingRequest", "()Z", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface InterruptableHttpDataSource extends xuu {
    @Override // defpackage.kpg
    /* synthetic */ void addTransferListener(cj01 cj01Var);

    @Override // defpackage.xuu
    /* synthetic */ void clearAllRequestProperties();

    @Override // defpackage.xuu
    /* synthetic */ void clearRequestProperty(String str);

    @Override // defpackage.kpg
    /* synthetic */ void close() throws HttpDataSource$HttpDataSourceException;

    @Override // defpackage.xuu
    /* synthetic */ int getResponseCode();

    @Override // defpackage.xuu, defpackage.kpg
    /* synthetic */ Map getResponseHeaders();

    @Override // defpackage.kpg
    /* synthetic */ Uri getUri();

    @Override // defpackage.kpg
    /* synthetic */ long open(npg npgVar) throws HttpDataSource$HttpDataSourceException;

    @Override // defpackage.apg
    /* synthetic */ int read(byte[] bArr, int i, int i2) throws HttpDataSource$HttpDataSourceException;

    @Override // defpackage.xuu
    /* synthetic */ void setRequestProperty(String str, String str2);

    boolean tryInterruptPendingRequest();
}
