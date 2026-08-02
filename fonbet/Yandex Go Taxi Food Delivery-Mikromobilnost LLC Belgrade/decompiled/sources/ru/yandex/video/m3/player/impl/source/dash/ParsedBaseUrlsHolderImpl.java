package ru.yandex.video.m3.player.impl.source.dash;

import defpackage.h5z0;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0017¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/yandex/video/m3/player/impl/source/dash/ParsedBaseUrlsHolderImpl;", "Lru/yandex/video/m3/player/impl/source/dash/ParsedBaseUrlsHolder;", "<init>", "()V", "", "baseUrl", "Lzy11;", "onNewBaseUrlParsed", "(Ljava/lang/String;)V", "", "getAllBaseUrls", "()Ljava/util/List;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "baseUrls", "Ljava/util/concurrent/CopyOnWriteArrayList;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ParsedBaseUrlsHolderImpl implements ParsedBaseUrlsHolder {
    public static final int $stable = 8;
    private final CopyOnWriteArrayList<String> baseUrls = new CopyOnWriteArrayList<>();

    @Override // ru.yandex.video.m3.player.impl.source.dash.ParsedBaseUrlsHolder
    public List<String> getAllBaseUrls() {
        return this.baseUrls;
    }

    @Override // ru.yandex.video.m3.player.impl.source.dash.ParsedBaseUrlsHolder
    public void onNewBaseUrlParsed(String baseUrl) {
        h5z0.a.h("onNewBaseUrlParsed url=".concat(baseUrl), new Object[0]);
        this.baseUrls.add(baseUrl);
    }
}
