package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenChatDto;", "", "title", "", "messengerParams", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/MessengerParametersDto;", "imageTag", "metricaLabel", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/MessengerParametersDto;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getMessengerParams", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/MessengerParametersDto;", "getImageTag", "getMetricaLabel", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ActionOpenChatDto {
    private final String imageTag;
    private final MessengerParametersDto messengerParams;
    private final String metricaLabel;
    private final String title;

    public ActionOpenChatDto(@Json(name = "title") String str, @Json(name = "messenger_params") MessengerParametersDto messengerParametersDto, @Json(name = "image_tag") String str2, @Json(name = "metrica_label") String str3) {
        this.title = str;
        this.messengerParams = messengerParametersDto;
        this.imageTag = str2;
        this.metricaLabel = str3;
    }

    public static /* synthetic */ ActionOpenChatDto copy$default(ActionOpenChatDto actionOpenChatDto, String str, MessengerParametersDto messengerParametersDto, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = actionOpenChatDto.title;
        }
        if ((i & 2) != 0) {
            messengerParametersDto = actionOpenChatDto.messengerParams;
        }
        if ((i & 4) != 0) {
            str2 = actionOpenChatDto.imageTag;
        }
        if ((i & 8) != 0) {
            str3 = actionOpenChatDto.metricaLabel;
        }
        return actionOpenChatDto.copy(str, messengerParametersDto, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final MessengerParametersDto getMessengerParams() {
        return this.messengerParams;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImageTag() {
        return this.imageTag;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final ActionOpenChatDto copy(@Json(name = "title") String title, @Json(name = "messenger_params") MessengerParametersDto messengerParams, @Json(name = "image_tag") String imageTag, @Json(name = "metrica_label") String metricaLabel) {
        return new ActionOpenChatDto(title, messengerParams, imageTag, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionOpenChatDto)) {
            return false;
        }
        ActionOpenChatDto actionOpenChatDto = (ActionOpenChatDto) other;
        return jl40.l(this.title, actionOpenChatDto.title) && jl40.l(this.messengerParams, actionOpenChatDto.messengerParams) && jl40.l(this.imageTag, actionOpenChatDto.imageTag) && jl40.l(this.metricaLabel, actionOpenChatDto.metricaLabel);
    }

    public final String getImageTag() {
        return this.imageTag;
    }

    public final MessengerParametersDto getMessengerParams() {
        return this.messengerParams;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = (this.messengerParams.hashCode() + (this.title.hashCode() * 31)) * 31;
        String str = this.imageTag;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.metricaLabel;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        MessengerParametersDto messengerParametersDto = this.messengerParams;
        String str2 = this.imageTag;
        String str3 = this.metricaLabel;
        StringBuilder sb = new StringBuilder("ActionOpenChatDto(title=");
        sb.append(str);
        sb.append(", messengerParams=");
        sb.append(messengerParametersDto);
        sb.append(", imageTag=");
        return g8e.r(sb, str2, ", metricaLabel=", str3, Extension.C_BRAKE);
    }
}
