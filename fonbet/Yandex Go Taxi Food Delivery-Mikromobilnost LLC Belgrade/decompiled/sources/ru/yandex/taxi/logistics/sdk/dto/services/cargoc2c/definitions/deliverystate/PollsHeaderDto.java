package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PollsHeaderDto;", "", "titleDefault", "", "titleCompleted", "completedEmojiImageTag", "imageTag", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitleDefault", "()Ljava/lang/String;", "getTitleCompleted", "getCompletedEmojiImageTag", "getImageTag", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PollsHeaderDto {
    private final String completedEmojiImageTag;
    private final String imageTag;
    private final String titleCompleted;
    private final String titleDefault;

    public PollsHeaderDto(@Json(name = "title_default") String str, @Json(name = "title_completed") String str2, @Json(name = "completed_emoji_image_tag") String str3, @Json(name = "image_tag") String str4) {
        this.titleDefault = str;
        this.titleCompleted = str2;
        this.completedEmojiImageTag = str3;
        this.imageTag = str4;
    }

    public static /* synthetic */ PollsHeaderDto copy$default(PollsHeaderDto pollsHeaderDto, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pollsHeaderDto.titleDefault;
        }
        if ((i & 2) != 0) {
            str2 = pollsHeaderDto.titleCompleted;
        }
        if ((i & 4) != 0) {
            str3 = pollsHeaderDto.completedEmojiImageTag;
        }
        if ((i & 8) != 0) {
            str4 = pollsHeaderDto.imageTag;
        }
        return pollsHeaderDto.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitleDefault() {
        return this.titleDefault;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitleCompleted() {
        return this.titleCompleted;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCompletedEmojiImageTag() {
        return this.completedEmojiImageTag;
    }

    /* renamed from: component4, reason: from getter */
    public final String getImageTag() {
        return this.imageTag;
    }

    public final PollsHeaderDto copy(@Json(name = "title_default") String titleDefault, @Json(name = "title_completed") String titleCompleted, @Json(name = "completed_emoji_image_tag") String completedEmojiImageTag, @Json(name = "image_tag") String imageTag) {
        return new PollsHeaderDto(titleDefault, titleCompleted, completedEmojiImageTag, imageTag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollsHeaderDto)) {
            return false;
        }
        PollsHeaderDto pollsHeaderDto = (PollsHeaderDto) other;
        return jl40.l(this.titleDefault, pollsHeaderDto.titleDefault) && jl40.l(this.titleCompleted, pollsHeaderDto.titleCompleted) && jl40.l(this.completedEmojiImageTag, pollsHeaderDto.completedEmojiImageTag) && jl40.l(this.imageTag, pollsHeaderDto.imageTag);
    }

    public final String getCompletedEmojiImageTag() {
        return this.completedEmojiImageTag;
    }

    public final String getImageTag() {
        return this.imageTag;
    }

    public final String getTitleCompleted() {
        return this.titleCompleted;
    }

    public final String getTitleDefault() {
        return this.titleDefault;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(this.titleDefault.hashCode() * 31, 31, this.titleCompleted), 31, this.completedEmojiImageTag);
        String str = this.imageTag;
        return b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.titleDefault;
        String str2 = this.titleCompleted;
        return g8e.r(b64.v("PollsHeaderDto(titleDefault=", str, ", titleCompleted=", str2, ", completedEmojiImageTag="), this.completedEmojiImageTag, ", imageTag=", this.imageTag, Extension.C_BRAKE);
    }
}
