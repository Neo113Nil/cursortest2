package com.yandex.music.shared.network.repositories.dto.infinityfeed;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import defpackage.uje;
import java.lang.reflect.Type;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/yandex/music/shared/network/repositories/dto/infinityfeed/InfiniteFeedDto$EntityDto$GsonDeserializer", "Lcom/google/gson/JsonDeserializer;", "Luje;", "<init>", "()V", "shared-network-repositories"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class InfiniteFeedDto$EntityDto$GsonDeserializer implements JsonDeserializer<uje> {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060 A[RETURN] */
    @Override // com.google.gson.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        Class cls;
        jsonElement.getClass();
        type.getClass();
        jsonDeserializationContext.getClass();
        JsonElement v = jsonElement.m().v("type");
        String q = v != null ? v.q() : null;
        if (q != null) {
            switch (q.hashCode()) {
                case -1409097913:
                    if (q.equals("artist")) {
                        cls = InfiniteFeedDto$EntityDto$ArtistEntityDto.class;
                        break;
                    }
                    break;
                case -950199248:
                    if (q.equals("auto-playlist")) {
                        cls = InfiniteFeedDto$EntityDto$AutoPlaylistEntityDto.class;
                        break;
                    }
                    break;
                case 92896879:
                    if (q.equals("album")) {
                        cls = InfiniteFeedDto$EntityDto$AlbumEntityDto.class;
                        break;
                    }
                    break;
                case 1879474642:
                    if (q.equals("playlist")) {
                        cls = InfiniteFeedDto$EntityDto$PlaylistEntityDto.class;
                        break;
                    }
                    break;
            }
            if (cls == null) {
                return (uje) jsonDeserializationContext.a(jsonElement, cls);
            }
            return null;
        }
        cls = null;
        if (cls == null) {
        }
    }
}
