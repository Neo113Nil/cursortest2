package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ:\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PollQuestionAnswerDto;", "", "id", "", "nextQuestionId", "text", "emojiDecimalCode", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getId", "()Ljava/lang/String;", "getNextQuestionId", "getText", "getEmojiDecimalCode", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PollQuestionAnswerDto;", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PollQuestionAnswerDto {
    private final Long emojiDecimalCode;
    private final String id;
    private final String nextQuestionId;
    private final String text;

    public PollQuestionAnswerDto(@Json(name = "id") String str, @Json(name = "next_question_id") String str2, @Json(name = "text") String str3, @Json(name = "emoji_decimal_code") Long l) {
        this.id = str;
        this.nextQuestionId = str2;
        this.text = str3;
        this.emojiDecimalCode = l;
    }

    public static /* synthetic */ PollQuestionAnswerDto copy$default(PollQuestionAnswerDto pollQuestionAnswerDto, String str, String str2, String str3, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pollQuestionAnswerDto.id;
        }
        if ((i & 2) != 0) {
            str2 = pollQuestionAnswerDto.nextQuestionId;
        }
        if ((i & 4) != 0) {
            str3 = pollQuestionAnswerDto.text;
        }
        if ((i & 8) != 0) {
            l = pollQuestionAnswerDto.emojiDecimalCode;
        }
        return pollQuestionAnswerDto.copy(str, str2, str3, l);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNextQuestionId() {
        return this.nextQuestionId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getEmojiDecimalCode() {
        return this.emojiDecimalCode;
    }

    public final PollQuestionAnswerDto copy(@Json(name = "id") String id, @Json(name = "next_question_id") String nextQuestionId, @Json(name = "text") String text, @Json(name = "emoji_decimal_code") Long emojiDecimalCode) {
        return new PollQuestionAnswerDto(id, nextQuestionId, text, emojiDecimalCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollQuestionAnswerDto)) {
            return false;
        }
        PollQuestionAnswerDto pollQuestionAnswerDto = (PollQuestionAnswerDto) other;
        return jl40.l(this.id, pollQuestionAnswerDto.id) && jl40.l(this.nextQuestionId, pollQuestionAnswerDto.nextQuestionId) && jl40.l(this.text, pollQuestionAnswerDto.text) && jl40.l(this.emojiDecimalCode, pollQuestionAnswerDto.emojiDecimalCode);
    }

    public final Long getEmojiDecimalCode() {
        return this.emojiDecimalCode;
    }

    public final String getId() {
        return this.id;
    }

    public final String getNextQuestionId() {
        return this.nextQuestionId;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.nextQuestionId;
        int b = unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.text);
        Long l = this.emojiDecimalCode;
        return b + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.nextQuestionId;
        String str3 = this.text;
        Long l = this.emojiDecimalCode;
        StringBuilder v = b64.v("PollQuestionAnswerDto(id=", str, ", nextQuestionId=", str2, ", text=");
        v.append(str3);
        v.append(", emojiDecimalCode=");
        v.append(l);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
