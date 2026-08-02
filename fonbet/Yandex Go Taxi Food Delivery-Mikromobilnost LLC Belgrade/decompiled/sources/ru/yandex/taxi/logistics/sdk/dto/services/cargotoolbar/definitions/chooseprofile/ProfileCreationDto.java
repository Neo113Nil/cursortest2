package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.chooseprofile;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.jl40;
import defpackage.x4e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ButtonDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/chooseprofile/ProfileCreationDto;", "", "title", "", "button", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ButtonDto;", BackendConfig.Restrictions.ENABLED, "", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ButtonDto;Z)V", "getTitle", "()Ljava/lang/String;", "getButton", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ButtonDto;", "getEnabled", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ProfileCreationDto {
    private final ButtonDto button;
    private final boolean enabled;
    private final String title;

    public ProfileCreationDto(@Json(name = "title") String str, @Json(name = "button") ButtonDto buttonDto, @Json(name = "enabled") boolean z) {
        this.title = str;
        this.button = buttonDto;
        this.enabled = z;
    }

    public static /* synthetic */ ProfileCreationDto copy$default(ProfileCreationDto profileCreationDto, String str, ButtonDto buttonDto, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profileCreationDto.title;
        }
        if ((i & 2) != 0) {
            buttonDto = profileCreationDto.button;
        }
        if ((i & 4) != 0) {
            z = profileCreationDto.enabled;
        }
        return profileCreationDto.copy(str, buttonDto, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final ButtonDto getButton() {
        return this.button;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final ProfileCreationDto copy(@Json(name = "title") String title, @Json(name = "button") ButtonDto button, @Json(name = "enabled") boolean enabled) {
        return new ProfileCreationDto(title, button, enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileCreationDto)) {
            return false;
        }
        ProfileCreationDto profileCreationDto = (ProfileCreationDto) other;
        return jl40.l(this.title, profileCreationDto.title) && jl40.l(this.button, profileCreationDto.button) && this.enabled == profileCreationDto.enabled;
    }

    public final ButtonDto getButton() {
        return this.button;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Boolean.hashCode(this.enabled) + ((this.button.hashCode() + (this.title.hashCode() * 31)) * 31);
    }

    public String toString() {
        String str = this.title;
        ButtonDto buttonDto = this.button;
        boolean z = this.enabled;
        StringBuilder sb = new StringBuilder("ProfileCreationDto(title=");
        sb.append(str);
        sb.append(", button=");
        sb.append(buttonDto);
        sb.append(", enabled=");
        return x4e.i(sb, z, Extension.C_BRAKE);
    }

    public /* synthetic */ ProfileCreationDto(String str, ButtonDto buttonDto, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, buttonDto, (i & 4) != 0 ? true : z);
    }
}
