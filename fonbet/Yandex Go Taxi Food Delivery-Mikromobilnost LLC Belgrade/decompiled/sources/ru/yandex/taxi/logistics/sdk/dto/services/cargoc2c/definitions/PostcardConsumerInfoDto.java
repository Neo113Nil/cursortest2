package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PostcardConsumerInfoDto;", "", "content", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PostcardContentDto;", "userMessage", "", "summaryPostcard", "cellTitle", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PostcardContentDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PostcardContentDto;", "getUserMessage", "()Ljava/lang/String;", "getSummaryPostcard", "getCellTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class PostcardConsumerInfoDto {
    private final String cellTitle;
    private final PostcardContentDto content;
    private final String summaryPostcard;
    private final String userMessage;

    public PostcardConsumerInfoDto(@Json(name = "content") PostcardContentDto postcardContentDto, @Json(name = "user_message") String str, @Json(name = "summary_postcard") String str2, @Json(name = "cell_title") String str3) {
        this.content = postcardContentDto;
        this.userMessage = str;
        this.summaryPostcard = str2;
        this.cellTitle = str3;
    }

    public static /* synthetic */ PostcardConsumerInfoDto copy$default(PostcardConsumerInfoDto postcardConsumerInfoDto, PostcardContentDto postcardContentDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            postcardContentDto = postcardConsumerInfoDto.content;
        }
        if ((i & 2) != 0) {
            str = postcardConsumerInfoDto.userMessage;
        }
        if ((i & 4) != 0) {
            str2 = postcardConsumerInfoDto.summaryPostcard;
        }
        if ((i & 8) != 0) {
            str3 = postcardConsumerInfoDto.cellTitle;
        }
        return postcardConsumerInfoDto.copy(postcardContentDto, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final PostcardContentDto getContent() {
        return this.content;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUserMessage() {
        return this.userMessage;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSummaryPostcard() {
        return this.summaryPostcard;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCellTitle() {
        return this.cellTitle;
    }

    public final PostcardConsumerInfoDto copy(@Json(name = "content") PostcardContentDto content, @Json(name = "user_message") String userMessage, @Json(name = "summary_postcard") String summaryPostcard, @Json(name = "cell_title") String cellTitle) {
        return new PostcardConsumerInfoDto(content, userMessage, summaryPostcard, cellTitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostcardConsumerInfoDto)) {
            return false;
        }
        PostcardConsumerInfoDto postcardConsumerInfoDto = (PostcardConsumerInfoDto) other;
        return jl40.l(this.content, postcardConsumerInfoDto.content) && jl40.l(this.userMessage, postcardConsumerInfoDto.userMessage) && jl40.l(this.summaryPostcard, postcardConsumerInfoDto.summaryPostcard) && jl40.l(this.cellTitle, postcardConsumerInfoDto.cellTitle);
    }

    public final String getCellTitle() {
        return this.cellTitle;
    }

    public final PostcardContentDto getContent() {
        return this.content;
    }

    public final String getSummaryPostcard() {
        return this.summaryPostcard;
    }

    public final String getUserMessage() {
        return this.userMessage;
    }

    public int hashCode() {
        return this.cellTitle.hashCode() + unr0.b(unr0.b(this.content.hashCode() * 31, 31, this.userMessage), 31, this.summaryPostcard);
    }

    public String toString() {
        PostcardContentDto postcardContentDto = this.content;
        String str = this.userMessage;
        String str2 = this.summaryPostcard;
        String str3 = this.cellTitle;
        StringBuilder sb = new StringBuilder("PostcardConsumerInfoDto(content=");
        sb.append(postcardContentDto);
        sb.append(", userMessage=");
        sb.append(str);
        sb.append(", summaryPostcard=");
        return g8e.r(sb, str2, ", cellTitle=", str3, Extension.C_BRAKE);
    }
}
