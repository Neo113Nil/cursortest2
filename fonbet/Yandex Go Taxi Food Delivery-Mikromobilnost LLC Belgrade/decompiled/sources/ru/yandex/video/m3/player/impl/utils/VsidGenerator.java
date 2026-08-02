package ru.yandex.video.m3.player.impl.utils;

import defpackage.c6w;
import defpackage.d6w;
import defpackage.scc;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.random.Random;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.video.m3.BuildConfig;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J\r\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u000bJ\u0006\u0010\f\u001a\u00020\u0006J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/VsidGenerator;", "", "timeProvider", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "(Lru/yandex/video/m3/player/impl/utils/TimeProvider;)V", "vsidPool", "", "generateDownloadToOfflineVsid", "generateMusicSessionVsid", "generatePreloaderVsid", "generateVideoFormatSelectorVsid", "generateVideoFormatSelectorVsid$video_player_internalRelease", "generateVsid", "getVsidFor", "serviceCode", "randomHexString", "len", "", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VsidGenerator {
    public static final String DOWNLOAD_TO_OFFLINE_SERVICE_CODE = "OFA";
    public static final String MUSIC_SERVICE_CODE = "MAN";
    public static final String PLAYER_SERVICE_CODE = "AND";
    public static final String PLELOADER_SERVICE_CODE = "PRA";
    private static final String VIDEO_FORMAT_SELECTOR_SERVICE_CODE = "SEL";
    private final TimeProvider timeProvider;
    private final String vsidPool = "0123456789abcdef";
    public static final int $stable = 8;

    public VsidGenerator(TimeProvider timeProvider) {
        this.timeProvider = timeProvider;
    }

    private final String getVsidFor(String serviceCode) {
        String randomHexString = randomHexString(44);
        Locale locale = Locale.US;
        return a.X(scc.g(randomHexString, serviceCode, String.format(locale, "%04d", Arrays.copyOf(new Object[]{Integer.valueOf(BuildConfig.VERSION_CODE)}, 1)), String.format(locale, "%010d", Arrays.copyOf(new Object[]{Long.valueOf(this.timeProvider.currentTimeMillis() / 1000)}, 1))), RemoteBioParameters.X, null, null, null, 62);
    }

    private final String randomHexString(int len) {
        d6w d6wVar = new d6w(1, len, 1);
        ArrayList arrayList = new ArrayList(tcc.n(d6wVar, 10));
        c6w it = d6wVar.iterator();
        while (it.c) {
            it.nextInt();
            Random.Default r2 = Random.a;
            int length = this.vsidPool.length();
            r2.getClass();
            arrayList.add(Integer.valueOf(Random.b.f(0, length)));
        }
        String str = this.vsidPool;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Character.valueOf(str.charAt(((Number) it2.next()).intValue())));
        }
        return a.X(arrayList2, "", null, null, null, 62);
    }

    public final String generateDownloadToOfflineVsid() {
        return getVsidFor(DOWNLOAD_TO_OFFLINE_SERVICE_CODE);
    }

    public final String generateMusicSessionVsid() {
        return getVsidFor(MUSIC_SERVICE_CODE);
    }

    public final String generatePreloaderVsid() {
        return getVsidFor(PLELOADER_SERVICE_CODE);
    }

    public final String generateVideoFormatSelectorVsid$video_player_internalRelease() {
        return getVsidFor(VIDEO_FORMAT_SELECTOR_SERVICE_CODE);
    }

    public final String generateVsid() {
        return getVsidFor(PLAYER_SERVICE_CODE);
    }
}
