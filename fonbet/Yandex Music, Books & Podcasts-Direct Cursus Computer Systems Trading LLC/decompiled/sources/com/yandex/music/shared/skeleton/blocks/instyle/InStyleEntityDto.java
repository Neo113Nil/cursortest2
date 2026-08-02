package com.yandex.music.shared.skeleton.blocks.instyle;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import com.yandex.music.shared.dto.domainitem.EntityCoverDto;
import defpackage.c3x;
import defpackage.dhe;
import defpackage.f1d;
import defpackage.u9b;
import defpackage.zge;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/music/shared/skeleton/blocks/instyle/InStyleEntityDto;", "", "", ConnectableDevice.KEY_ID, "title", "Lcom/yandex/music/shared/dto/domainitem/EntityCoverDto;", "cover", "", "Lcom/yandex/music/shared/skeleton/blocks/instyle/InStyleItemDto;", "items", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/music/shared/dto/domainitem/EntityCoverDto;Ljava/util/List;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getTitle", "Lcom/yandex/music/shared/dto/domainitem/EntityCoverDto;", "getCover", "()Lcom/yandex/music/shared/dto/domainitem/EntityCoverDto;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "shared-skeleton-blocks"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final /* data */ class InStyleEntityDto {

    @SerializedName("cover")
    private final EntityCoverDto cover;

    @SerializedName(ConnectableDevice.KEY_ID)
    private final String id;

    @SerializedName("items")
    private final List<InStyleItemDto> items;

    @SerializedName("title")
    private final String title;

    public InStyleEntityDto(String str, String str2, EntityCoverDto entityCoverDto, List<InStyleItemDto> list) {
        this.id = str;
        this.title = str2;
        this.cover = entityCoverDto;
        this.items = list;
    }

    public final zge a() {
        String str;
        String str2 = this.id;
        if (str2 == null || (str = this.title) == null) {
            return null;
        }
        EntityCoverDto entityCoverDto = this.cover;
        u9b V = entityCoverDto != null ? c3x.V(entityCoverDto) : null;
        List<InStyleItemDto> list = this.items;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (InStyleItemDto inStyleItemDto : list) {
            dhe a = inStyleItemDto != null ? inStyleItemDto.a() : null;
            if (a != null) {
                arrayList.add(a);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        return new zge(str2, str, V, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InStyleEntityDto)) {
            return false;
        }
        InStyleEntityDto inStyleEntityDto = (InStyleEntityDto) obj;
        return Intrinsics.d(this.id, inStyleEntityDto.id) && Intrinsics.d(this.title, inStyleEntityDto.title) && Intrinsics.d(this.cover, inStyleEntityDto.cover) && Intrinsics.d(this.items, inStyleEntityDto.items);
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        EntityCoverDto entityCoverDto = this.cover;
        int hashCode3 = (hashCode2 + (entityCoverDto == null ? 0 : entityCoverDto.hashCode())) * 31;
        List<InStyleItemDto> list = this.items;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.title;
        EntityCoverDto entityCoverDto = this.cover;
        List<InStyleItemDto> list = this.items;
        StringBuilder m = f1d.m("InStyleEntityDto(id=", str, ", title=", str2, ", cover=");
        m.append(entityCoverDto);
        m.append(", items=");
        m.append(list);
        m.append(")");
        return m.toString();
    }
}
