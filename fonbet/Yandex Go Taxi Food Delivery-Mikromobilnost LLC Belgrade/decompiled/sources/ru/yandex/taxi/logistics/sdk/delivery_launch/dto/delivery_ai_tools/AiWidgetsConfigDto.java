package ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_ai_tools;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/AiWidgetsConfigDto;", "", "aiChatWidget", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/AiChatWidgetDto;", "smartCameraWidget", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/SmartCameraWidgetDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/AiChatWidgetDto;Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/SmartCameraWidgetDto;)V", "getAiChatWidget", "()Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/AiChatWidgetDto;", "getSmartCameraWidget", "()Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/SmartCameraWidgetDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AiWidgetsConfigDto {
    private final AiChatWidgetDto aiChatWidget;
    private final SmartCameraWidgetDto smartCameraWidget;

    public AiWidgetsConfigDto(@Json(name = "ai_chat_widget") AiChatWidgetDto aiChatWidgetDto, @Json(name = "smart_camera_widget") SmartCameraWidgetDto smartCameraWidgetDto) {
        this.aiChatWidget = aiChatWidgetDto;
        this.smartCameraWidget = smartCameraWidgetDto;
    }

    public static /* synthetic */ AiWidgetsConfigDto copy$default(AiWidgetsConfigDto aiWidgetsConfigDto, AiChatWidgetDto aiChatWidgetDto, SmartCameraWidgetDto smartCameraWidgetDto, int i, Object obj) {
        if ((i & 1) != 0) {
            aiChatWidgetDto = aiWidgetsConfigDto.aiChatWidget;
        }
        if ((i & 2) != 0) {
            smartCameraWidgetDto = aiWidgetsConfigDto.smartCameraWidget;
        }
        return aiWidgetsConfigDto.copy(aiChatWidgetDto, smartCameraWidgetDto);
    }

    /* renamed from: component1, reason: from getter */
    public final AiChatWidgetDto getAiChatWidget() {
        return this.aiChatWidget;
    }

    /* renamed from: component2, reason: from getter */
    public final SmartCameraWidgetDto getSmartCameraWidget() {
        return this.smartCameraWidget;
    }

    public final AiWidgetsConfigDto copy(@Json(name = "ai_chat_widget") AiChatWidgetDto aiChatWidget, @Json(name = "smart_camera_widget") SmartCameraWidgetDto smartCameraWidget) {
        return new AiWidgetsConfigDto(aiChatWidget, smartCameraWidget);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiWidgetsConfigDto)) {
            return false;
        }
        AiWidgetsConfigDto aiWidgetsConfigDto = (AiWidgetsConfigDto) other;
        return jl40.l(this.aiChatWidget, aiWidgetsConfigDto.aiChatWidget) && jl40.l(this.smartCameraWidget, aiWidgetsConfigDto.smartCameraWidget);
    }

    public final AiChatWidgetDto getAiChatWidget() {
        return this.aiChatWidget;
    }

    public final SmartCameraWidgetDto getSmartCameraWidget() {
        return this.smartCameraWidget;
    }

    public int hashCode() {
        AiChatWidgetDto aiChatWidgetDto = this.aiChatWidget;
        int hashCode = (aiChatWidgetDto == null ? 0 : aiChatWidgetDto.hashCode()) * 31;
        SmartCameraWidgetDto smartCameraWidgetDto = this.smartCameraWidget;
        return hashCode + (smartCameraWidgetDto != null ? smartCameraWidgetDto.hashCode() : 0);
    }

    public String toString() {
        return "AiWidgetsConfigDto(aiChatWidget=" + this.aiChatWidget + ", smartCameraWidget=" + this.smartCameraWidget + Extension.C_BRAKE;
    }
}
