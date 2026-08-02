package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.api.clientapi;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.chooseprofile.ProfileSelectionSectionDto;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/api/clientapi/DashboardChooseProfileResponseDto;", "", "title", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "sections", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/chooseprofile/ProfileSelectionSectionDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getSections", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DashboardChooseProfileResponseDto {
    private final String description;
    private final List<ProfileSelectionSectionDto> sections;
    private final String title;

    public DashboardChooseProfileResponseDto(@Json(name = "title") String str, @Json(name = "description") String str2, @Json(name = "sections") List<ProfileSelectionSectionDto> list) {
        this.title = str;
        this.description = str2;
        this.sections = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DashboardChooseProfileResponseDto copy$default(DashboardChooseProfileResponseDto dashboardChooseProfileResponseDto, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dashboardChooseProfileResponseDto.title;
        }
        if ((i & 2) != 0) {
            str2 = dashboardChooseProfileResponseDto.description;
        }
        if ((i & 4) != 0) {
            list = dashboardChooseProfileResponseDto.sections;
        }
        return dashboardChooseProfileResponseDto.copy(str, str2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final List<ProfileSelectionSectionDto> component3() {
        return this.sections;
    }

    public final DashboardChooseProfileResponseDto copy(@Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "sections") List<ProfileSelectionSectionDto> sections) {
        return new DashboardChooseProfileResponseDto(title, description, sections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DashboardChooseProfileResponseDto)) {
            return false;
        }
        DashboardChooseProfileResponseDto dashboardChooseProfileResponseDto = (DashboardChooseProfileResponseDto) other;
        return jl40.l(this.title, dashboardChooseProfileResponseDto.title) && jl40.l(this.description, dashboardChooseProfileResponseDto.description) && jl40.l(this.sections, dashboardChooseProfileResponseDto.sections);
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<ProfileSelectionSectionDto> getSections() {
        return this.sections;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.sections.hashCode() + unr0.b(this.title.hashCode() * 31, 31, this.description);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        return ly3.s(b64.v("DashboardChooseProfileResponseDto(title=", str, ", description=", str2, ", sections="), this.sections, Extension.C_BRAKE);
    }
}
