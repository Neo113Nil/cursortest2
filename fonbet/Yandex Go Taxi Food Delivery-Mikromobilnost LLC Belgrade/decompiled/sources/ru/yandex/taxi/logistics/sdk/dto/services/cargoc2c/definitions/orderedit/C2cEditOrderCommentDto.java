package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.orderedit;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.nnm;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PhotoInfoDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/C2cEditOrderCommentDto;", "", "comment", "", "commentImages", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PhotoInfoDto;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getComment", "()Ljava/lang/String;", "getCommentImages", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class C2cEditOrderCommentDto {
    private final String comment;
    private final List<PhotoInfoDto> commentImages;

    public C2cEditOrderCommentDto(@Json(name = "comment") String str, @Json(name = "comment_images") List<PhotoInfoDto> list) {
        this.comment = str;
        this.commentImages = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C2cEditOrderCommentDto copy$default(C2cEditOrderCommentDto c2cEditOrderCommentDto, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c2cEditOrderCommentDto.comment;
        }
        if ((i & 2) != 0) {
            list = c2cEditOrderCommentDto.commentImages;
        }
        return c2cEditOrderCommentDto.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    public final List<PhotoInfoDto> component2() {
        return this.commentImages;
    }

    public final C2cEditOrderCommentDto copy(@Json(name = "comment") String comment, @Json(name = "comment_images") List<PhotoInfoDto> commentImages) {
        return new C2cEditOrderCommentDto(comment, commentImages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2cEditOrderCommentDto)) {
            return false;
        }
        C2cEditOrderCommentDto c2cEditOrderCommentDto = (C2cEditOrderCommentDto) other;
        return jl40.l(this.comment, c2cEditOrderCommentDto.comment) && jl40.l(this.commentImages, c2cEditOrderCommentDto.commentImages);
    }

    public final String getComment() {
        return this.comment;
    }

    public final List<PhotoInfoDto> getCommentImages() {
        return this.commentImages;
    }

    public int hashCode() {
        return this.commentImages.hashCode() + (this.comment.hashCode() * 31);
    }

    public String toString() {
        return nnm.h("C2cEditOrderCommentDto(comment=", this.comment, ", commentImages=", Extension.C_BRAKE, this.commentImages);
    }
}
