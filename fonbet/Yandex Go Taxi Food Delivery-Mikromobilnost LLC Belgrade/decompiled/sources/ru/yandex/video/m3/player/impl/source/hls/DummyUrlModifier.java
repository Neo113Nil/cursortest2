package ru.yandex.video.m3.player.impl.source.hls;

/* loaded from: classes7.dex */
public class DummyUrlModifier implements UrlModifier {
    public static DummyUrlModifier INSTANCE = new DummyUrlModifier();

    private DummyUrlModifier() {
    }

    @Override // ru.yandex.video.m3.player.impl.source.hls.UrlModifier
    public String modifyMediaPlaylistUrl(String str) {
        return str;
    }

    @Override // ru.yandex.video.m3.player.impl.source.hls.UrlModifier
    public String modifySegmentUrl(String str) {
        return str;
    }
}
