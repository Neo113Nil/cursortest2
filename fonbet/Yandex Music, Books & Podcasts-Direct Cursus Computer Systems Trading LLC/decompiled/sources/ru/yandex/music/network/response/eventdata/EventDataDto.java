package ru.yandex.music.network.response.eventdata;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u000fB1\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b\u0082\u0001\u0001\u0010¨\u0006\u0011"}, d2 = {"Lru/yandex/music/network/response/eventdata/EventDataDto;", "", "", "typeForFrom", ConnectableDevice.KEY_ID, "title", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "a", "c", "b", "GsonDeserializer", "Lru/yandex/music/network/response/eventdata/PromotionEventDataDto;", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public abstract class EventDataDto {

    @SerializedName(ConnectableDevice.KEY_ID)
    private final String id;

    @SerializedName("subtitle")
    private final String subtitle;

    @SerializedName("title")
    private final String title;

    @SerializedName("typeForFrom")
    private final String typeForFrom;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/music/network/response/eventdata/EventDataDto$GsonDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lru/yandex/music/network/response/eventdata/EventDataDto;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class GsonDeserializer implements JsonDeserializer<EventDataDto>, JsonSerializer<EventDataDto> {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.d(r0 != null ? r0.q() : null, "promo") != false) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
        
            if (r5.equals("albums") == false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
        
            r5 = ru.yandex.music.network.response.eventdata.AlbumsPromoEventDataDto.class;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
        
            if (r5.equals("albums-for-unknown-user") == false) goto L15;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x008a A[RETURN] */
        @Override // com.google.gson.JsonDeserializer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            Class cls;
            jsonElement.getClass();
            type.getClass();
            jsonDeserializationContext.getClass();
            JsonObject m = jsonElement.m();
            JsonElement v = m.v("type");
            if (!Intrinsics.d(v != null ? v.q() : null, "promotion")) {
                JsonElement v2 = m.v("category");
            }
            JsonElement v3 = m.v("promotionType");
            String q = v3 != null ? v3.q() : null;
            if (q != null) {
                switch (q.hashCode()) {
                    case -1865828127:
                        if (q.equals("playlists")) {
                            cls = PlaylistsPromoEventDataDto.class;
                            break;
                        }
                        break;
                    case -1604984645:
                        break;
                    case -1415163932:
                        break;
                    case -732362228:
                        if (q.equals("artists")) {
                            cls = ArtistsPromoEventDataDto.class;
                            break;
                        }
                        break;
                }
                if (cls == null) {
                    return (EventDataDto) jsonDeserializationContext.a(jsonElement, cls);
                }
                return null;
            }
            cls = null;
            if (cls == null) {
            }
        }

        @Override // com.google.gson.JsonSerializer
        public final JsonElement b(Object obj, Type type, JsonSerializationContext jsonSerializationContext) {
            EventDataDto eventDataDto = (EventDataDto) obj;
            eventDataDto.getClass();
            jsonSerializationContext.getClass();
            JsonElement b = jsonSerializationContext.b(eventDataDto);
            b.getClass();
            return b;
        }
    }

    private EventDataDto(String str, String str2, String str3, String str4) {
        this.typeForFrom = str;
        this.id = str2;
        this.title = str3;
        this.subtitle = str4;
    }

    /* renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: b, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: d, reason: from getter */
    public final String getTypeForFrom() {
        return this.typeForFrom;
    }

    public /* synthetic */ EventDataDto(String str, String str2, String str3, String str4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4);
    }
}
