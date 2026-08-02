package ru.yandex.video.m3.ab.util;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;
import ru.yandex.video.m3.ab.config.AbConfigWithMeta;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/yandex/video/m3/ab/util/VsidToAbConfigHolder;", "", "", "", "Lru/yandex/video/m3/ab/config/AbConfigWithMeta;", PolicyMappingsExtension.MAP, "<init>", "(Ljava/util/Map;)V", "key", "get", "(Ljava/lang/String;)Lru/yandex/video/m3/ab/config/AbConfigWithMeta;", "value", "Lzy11;", "set", "(Ljava/lang/String;Lru/yandex/video/m3/ab/config/AbConfigWithMeta;)V", "Ljava/util/Map;", "lock", "Ljava/lang/Object;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VsidToAbConfigHolder {
    public static final int $stable = 8;
    private final Object lock;
    private final Map<String, AbConfigWithMeta> map;

    public VsidToAbConfigHolder(Map<String, AbConfigWithMeta> map) {
        this.map = map;
        this.lock = new Object();
    }

    public final AbConfigWithMeta get(String key) {
        AbConfigWithMeta abConfigWithMeta;
        synchronized (this.lock) {
            abConfigWithMeta = this.map.get(key);
        }
        return abConfigWithMeta;
    }

    public final void set(String key, AbConfigWithMeta value) {
        synchronized (this.lock) {
            this.map.put(key, value);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VsidToAbConfigHolder() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ VsidToAbConfigHolder(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedHashMap() : map);
    }
}
