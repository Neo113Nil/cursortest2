package com.yandex.music.shared.myvibegenerator.repositories.dto;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.f1d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/music/shared/myvibegenerator/repositories/dto/GeneratorSeedDto;", "", "", ConnectableDevice.KEY_ID, "title", "Lcom/yandex/music/shared/myvibegenerator/repositories/dto/GeneratorSeedIconDto;", "icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/music/shared/myvibegenerator/repositories/dto/GeneratorSeedIconDto;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getTitle", "Lcom/yandex/music/shared/myvibegenerator/repositories/dto/GeneratorSeedIconDto;", "getIcon", "()Lcom/yandex/music/shared/myvibegenerator/repositories/dto/GeneratorSeedIconDto;", "shared-myvibegenerator-repositories"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final /* data */ class GeneratorSeedDto {

    @SerializedName("icon")
    private final GeneratorSeedIconDto icon;

    @SerializedName(ConnectableDevice.KEY_ID)
    private final String id;

    @SerializedName("title")
    private final String title;

    public GeneratorSeedDto(String str, String str2, GeneratorSeedIconDto generatorSeedIconDto) {
        this.id = str;
        this.title = str2;
        this.icon = generatorSeedIconDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeneratorSeedDto)) {
            return false;
        }
        GeneratorSeedDto generatorSeedDto = (GeneratorSeedDto) obj;
        return Intrinsics.d(this.id, generatorSeedDto.id) && Intrinsics.d(this.title, generatorSeedDto.title) && Intrinsics.d(this.icon, generatorSeedDto.icon);
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        GeneratorSeedIconDto generatorSeedIconDto = this.icon;
        return hashCode2 + (generatorSeedIconDto != null ? generatorSeedIconDto.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.title;
        GeneratorSeedIconDto generatorSeedIconDto = this.icon;
        StringBuilder m = f1d.m("GeneratorSeedDto(id=", str, ", title=", str2, ", icon=");
        m.append(generatorSeedIconDto);
        m.append(")");
        return m.toString();
    }
}
