package ru.yandex.video.m3.data.dto;

import com.google.gson.reflect.TypeToken;
import defpackage.i3y;
import defpackage.sls;
import defpackage.u3u;
import defpackage.v3u;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.impl.data.dto.AdapterFactory;
import ru.yandex.video.m3.player.utils.JsonConverter;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u0004\u0018\u0001H\u0004\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\tJ\u001d\u0010\n\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00042\b\u0010\u000b\u001a\u0004\u0018\u0001H\u0004H\u0016¢\u0006\u0002\u0010\f¨\u0006\u000e"}, d2 = {"Lru/yandex/video/m3/data/dto/JsonConverterImpl;", "Lru/yandex/video/m3/player/utils/JsonConverter;", "()V", "from", "T", "json", "", "type", "Ljava/lang/reflect/Type;", "(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "to", "model", "(Ljava/lang/Object;)Ljava/lang/String;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class JsonConverterImpl implements JsonConverter {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final i3y GSON$delegate = a.a(new sls() { // from class: ru.yandex.video.m3.data.dto.JsonConverterImpl$Companion$GSON$2
        @Override // defpackage.sls
        public final u3u invoke() {
            v3u v3uVar = new v3u();
            v3uVar.e.add(new AdapterFactory());
            v3uVar.i = false;
            return new u3u(v3uVar);
        }
    });

    @Override // ru.yandex.video.m3.player.utils.JsonConverter
    public <T> T from(String json2, Type type) {
        u3u gson = INSTANCE.getGSON();
        gson.getClass();
        return (T) gson.d(json2, TypeToken.get(type));
    }

    @Override // ru.yandex.video.m3.player.utils.JsonConverter
    public <T> String to(T model) {
        return INSTANCE.getGSON().h(model);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\f\u0010\rR#\u0010\u0014\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/yandex/video/m3/data/dto/JsonConverterImpl$Companion;", "Lru/yandex/video/m3/player/utils/JsonConverter;", "<init>", "()V", "T", "", "json", "Ljava/lang/reflect/Type;", "type", "from", "(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "model", "to", "(Ljava/lang/Object;)Ljava/lang/String;", "Lu3u;", "kotlin.jvm.PlatformType", "GSON$delegate", "Li3y;", "getGSON", "()Lu3u;", "GSON", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements JsonConverter {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final u3u getGSON() {
            return (u3u) JsonConverterImpl.GSON$delegate.getValue();
        }

        @Override // ru.yandex.video.m3.player.utils.JsonConverter
        public <T> T from(String json2, Type type) {
            u3u gson = getGSON();
            gson.getClass();
            return (T) gson.d(json2, TypeToken.get(type));
        }

        @Override // ru.yandex.video.m3.player.utils.JsonConverter
        public <T> String to(T model) {
            return getGSON().h(model);
        }

        private Companion() {
        }
    }
}
