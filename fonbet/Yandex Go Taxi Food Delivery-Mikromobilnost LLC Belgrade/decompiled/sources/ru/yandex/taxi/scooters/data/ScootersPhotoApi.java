package ru.yandex.taxi.scooters.data;

import defpackage.cmt;
import defpackage.djg0;
import defpackage.l60;
import defpackage.m5j0;
import defpackage.neu;
import defpackage.q76;
import defpackage.s490;
import defpackage.uau;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J9\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\n\u0010\u000bJW\u0010\u0011\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\f\u001a\u00020\u00032\b\b\u0001\u0010\r\u001a\u00020\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lru/yandex/taxi/scooters/data/ScootersPhotoApi;", "", "", "", "headers", "Ll60;", "actualizationParams", "Lcmt;", "Lzy11;", "Lru/yandex/taxi/network/api/GoApiEffect;", "b", "(Ljava/util/Map;Ll60;)Lcmt;", "objectId", "photoId", "photoType", "Lm5j0;", "image", "a", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm5j0;)Lcmt;", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ScootersPhotoApi {
    @s490("scooters/api/yandex/trace/photo/upload")
    @neu({"Content-Type: image/jpeg"})
    cmt<zy11> a(@uau Map<String, String> headers, @djg0("object_id") String objectId, @djg0("photo_id") String photoId, @djg0("photo_type") String photoType, @q76 m5j0 image);

    @s490("scooters/api/yandex/car/actualization")
    cmt<zy11> b(@uau Map<String, String> headers, @q76 l60 actualizationParams);
}
