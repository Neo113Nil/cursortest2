package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.api.clientapi;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.CoordinateDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.PaymentInfoDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b\u0012\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bHÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bHÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001dJj\u0010&\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b2\u0010\b\u0003\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001d¨\u0006-"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/api/clientapi/DashboardContentRequestDto;", "", "coordinate", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/CoordinateDto;", "accuracy", "", "corpClientId", "", "paymentInfo", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/PaymentInfoDto;", "supportedWidgets", "", "supportedActions", "flatNavigationEnabled", "", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/CoordinateDto;DLjava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/PaymentInfoDto;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;)V", "getCoordinate", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/CoordinateDto;", "getAccuracy", "()D", "getCorpClientId", "()Ljava/lang/String;", "getPaymentInfo", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/PaymentInfoDto;", "getSupportedWidgets", "()Ljava/util/List;", "getSupportedActions", "getFlatNavigationEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/CoordinateDto;DLjava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/PaymentInfoDto;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/api/clientapi/DashboardContentRequestDto;", "equals", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DashboardContentRequestDto {
    private final double accuracy;
    private final CoordinateDto coordinate;
    private final String corpClientId;
    private final Boolean flatNavigationEnabled;
    private final PaymentInfoDto paymentInfo;
    private final List<String> supportedActions;
    private final List<String> supportedWidgets;

    public DashboardContentRequestDto(@Json(name = "coordinate") CoordinateDto coordinateDto, @Json(name = "accuracy") double d, @Json(name = "corp_client_id") String str, @Json(name = "payment_info") PaymentInfoDto paymentInfoDto, @Json(name = "supported_widgets") List<String> list, @Json(name = "supported_actions") List<String> list2, @Json(name = "flat_navigation_enabled") Boolean bool) {
        this.coordinate = coordinateDto;
        this.accuracy = d;
        this.corpClientId = str;
        this.paymentInfo = paymentInfoDto;
        this.supportedWidgets = list;
        this.supportedActions = list2;
        this.flatNavigationEnabled = bool;
    }

    public static /* synthetic */ DashboardContentRequestDto copy$default(DashboardContentRequestDto dashboardContentRequestDto, CoordinateDto coordinateDto, double d, String str, PaymentInfoDto paymentInfoDto, List list, List list2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            coordinateDto = dashboardContentRequestDto.coordinate;
        }
        if ((i & 2) != 0) {
            d = dashboardContentRequestDto.accuracy;
        }
        if ((i & 4) != 0) {
            str = dashboardContentRequestDto.corpClientId;
        }
        if ((i & 8) != 0) {
            paymentInfoDto = dashboardContentRequestDto.paymentInfo;
        }
        if ((i & 16) != 0) {
            list = dashboardContentRequestDto.supportedWidgets;
        }
        if ((i & 32) != 0) {
            list2 = dashboardContentRequestDto.supportedActions;
        }
        if ((i & 64) != 0) {
            bool = dashboardContentRequestDto.flatNavigationEnabled;
        }
        Boolean bool2 = bool;
        List list3 = list;
        String str2 = str;
        return dashboardContentRequestDto.copy(coordinateDto, d, str2, paymentInfoDto, list3, list2, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final CoordinateDto getCoordinate() {
        return this.coordinate;
    }

    /* renamed from: component2, reason: from getter */
    public final double getAccuracy() {
        return this.accuracy;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCorpClientId() {
        return this.corpClientId;
    }

    /* renamed from: component4, reason: from getter */
    public final PaymentInfoDto getPaymentInfo() {
        return this.paymentInfo;
    }

    public final List<String> component5() {
        return this.supportedWidgets;
    }

    public final List<String> component6() {
        return this.supportedActions;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getFlatNavigationEnabled() {
        return this.flatNavigationEnabled;
    }

    public final DashboardContentRequestDto copy(@Json(name = "coordinate") CoordinateDto coordinate, @Json(name = "accuracy") double accuracy, @Json(name = "corp_client_id") String corpClientId, @Json(name = "payment_info") PaymentInfoDto paymentInfo, @Json(name = "supported_widgets") List<String> supportedWidgets, @Json(name = "supported_actions") List<String> supportedActions, @Json(name = "flat_navigation_enabled") Boolean flatNavigationEnabled) {
        return new DashboardContentRequestDto(coordinate, accuracy, corpClientId, paymentInfo, supportedWidgets, supportedActions, flatNavigationEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DashboardContentRequestDto)) {
            return false;
        }
        DashboardContentRequestDto dashboardContentRequestDto = (DashboardContentRequestDto) other;
        return jl40.l(this.coordinate, dashboardContentRequestDto.coordinate) && Double.compare(this.accuracy, dashboardContentRequestDto.accuracy) == 0 && jl40.l(this.corpClientId, dashboardContentRequestDto.corpClientId) && jl40.l(this.paymentInfo, dashboardContentRequestDto.paymentInfo) && jl40.l(this.supportedWidgets, dashboardContentRequestDto.supportedWidgets) && jl40.l(this.supportedActions, dashboardContentRequestDto.supportedActions) && jl40.l(this.flatNavigationEnabled, dashboardContentRequestDto.flatNavigationEnabled);
    }

    public final double getAccuracy() {
        return this.accuracy;
    }

    public final CoordinateDto getCoordinate() {
        return this.coordinate;
    }

    public final String getCorpClientId() {
        return this.corpClientId;
    }

    public final Boolean getFlatNavigationEnabled() {
        return this.flatNavigationEnabled;
    }

    public final PaymentInfoDto getPaymentInfo() {
        return this.paymentInfo;
    }

    public final List<String> getSupportedActions() {
        return this.supportedActions;
    }

    public final List<String> getSupportedWidgets() {
        return this.supportedWidgets;
    }

    public int hashCode() {
        int a = unr0.a(this.coordinate.hashCode() * 31, 31, this.accuracy);
        String str = this.corpClientId;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        PaymentInfoDto paymentInfoDto = this.paymentInfo;
        int hashCode2 = (hashCode + (paymentInfoDto == null ? 0 : paymentInfoDto.hashCode())) * 31;
        List<String> list = this.supportedWidgets;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.supportedActions;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.flatNavigationEnabled;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "DashboardContentRequestDto(coordinate=" + this.coordinate + ", accuracy=" + this.accuracy + ", corpClientId=" + this.corpClientId + ", paymentInfo=" + this.paymentInfo + ", supportedWidgets=" + this.supportedWidgets + ", supportedActions=" + this.supportedActions + ", flatNavigationEnabled=" + this.flatNavigationEnabled + Extension.C_BRAKE;
    }
}
