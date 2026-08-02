package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.nnm;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/AiChatMessageDto;", "", "template", "", "formStateKeys", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTemplate", "()Ljava/lang/String;", "getFormStateKeys", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AiChatMessageDto {
    private final List<String> formStateKeys;
    private final String template;

    public AiChatMessageDto(@Json(name = "template") String str, @Json(name = "form_state_keys") List<String> list) {
        this.template = str;
        this.formStateKeys = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AiChatMessageDto copy$default(AiChatMessageDto aiChatMessageDto, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aiChatMessageDto.template;
        }
        if ((i & 2) != 0) {
            list = aiChatMessageDto.formStateKeys;
        }
        return aiChatMessageDto.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTemplate() {
        return this.template;
    }

    public final List<String> component2() {
        return this.formStateKeys;
    }

    public final AiChatMessageDto copy(@Json(name = "template") String template, @Json(name = "form_state_keys") List<String> formStateKeys) {
        return new AiChatMessageDto(template, formStateKeys);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiChatMessageDto)) {
            return false;
        }
        AiChatMessageDto aiChatMessageDto = (AiChatMessageDto) other;
        return jl40.l(this.template, aiChatMessageDto.template) && jl40.l(this.formStateKeys, aiChatMessageDto.formStateKeys);
    }

    public final List<String> getFormStateKeys() {
        return this.formStateKeys;
    }

    public final String getTemplate() {
        return this.template;
    }

    public int hashCode() {
        int hashCode = this.template.hashCode() * 31;
        List<String> list = this.formStateKeys;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return nnm.h("AiChatMessageDto(template=", this.template, ", formStateKeys=", Extension.C_BRAKE, this.formStateKeys);
    }
}
