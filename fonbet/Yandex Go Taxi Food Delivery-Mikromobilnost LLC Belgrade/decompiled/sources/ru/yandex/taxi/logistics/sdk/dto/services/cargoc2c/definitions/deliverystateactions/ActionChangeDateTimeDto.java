package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionChangeDateTimeDto;", "", "title", "", "badgeText", MetaDataField.SCREEN_FIELD, "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ChangeDateTimeScreenDto;", "options", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ChangeDateTimeOptionDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ChangeDateTimeScreenDto;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getBadgeText", "getScreen", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ChangeDateTimeScreenDto;", "getOptions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ActionChangeDateTimeDto {
    private final String badgeText;
    private final List<ChangeDateTimeOptionDto> options;
    private final ChangeDateTimeScreenDto screen;
    private final String title;

    public ActionChangeDateTimeDto(@Json(name = "title") String str, @Json(name = "badge_text") String str2, @Json(name = "screen") ChangeDateTimeScreenDto changeDateTimeScreenDto, @Json(name = "options") List<ChangeDateTimeOptionDto> list) {
        this.title = str;
        this.badgeText = str2;
        this.screen = changeDateTimeScreenDto;
        this.options = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActionChangeDateTimeDto copy$default(ActionChangeDateTimeDto actionChangeDateTimeDto, String str, String str2, ChangeDateTimeScreenDto changeDateTimeScreenDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = actionChangeDateTimeDto.title;
        }
        if ((i & 2) != 0) {
            str2 = actionChangeDateTimeDto.badgeText;
        }
        if ((i & 4) != 0) {
            changeDateTimeScreenDto = actionChangeDateTimeDto.screen;
        }
        if ((i & 8) != 0) {
            list = actionChangeDateTimeDto.options;
        }
        return actionChangeDateTimeDto.copy(str, str2, changeDateTimeScreenDto, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBadgeText() {
        return this.badgeText;
    }

    /* renamed from: component3, reason: from getter */
    public final ChangeDateTimeScreenDto getScreen() {
        return this.screen;
    }

    public final List<ChangeDateTimeOptionDto> component4() {
        return this.options;
    }

    public final ActionChangeDateTimeDto copy(@Json(name = "title") String title, @Json(name = "badge_text") String badgeText, @Json(name = "screen") ChangeDateTimeScreenDto screen, @Json(name = "options") List<ChangeDateTimeOptionDto> options) {
        return new ActionChangeDateTimeDto(title, badgeText, screen, options);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionChangeDateTimeDto)) {
            return false;
        }
        ActionChangeDateTimeDto actionChangeDateTimeDto = (ActionChangeDateTimeDto) other;
        return jl40.l(this.title, actionChangeDateTimeDto.title) && jl40.l(this.badgeText, actionChangeDateTimeDto.badgeText) && jl40.l(this.screen, actionChangeDateTimeDto.screen) && jl40.l(this.options, actionChangeDateTimeDto.options);
    }

    public final String getBadgeText() {
        return this.badgeText;
    }

    public final List<ChangeDateTimeOptionDto> getOptions() {
        return this.options;
    }

    public final ChangeDateTimeScreenDto getScreen() {
        return this.screen;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.badgeText;
        return this.options.hashCode() + ((this.screen.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.badgeText;
        ChangeDateTimeScreenDto changeDateTimeScreenDto = this.screen;
        List<ChangeDateTimeOptionDto> list = this.options;
        StringBuilder v = b64.v("ActionChangeDateTimeDto(title=", str, ", badgeText=", str2, ", screen=");
        v.append(changeDateTimeScreenDto);
        v.append(", options=");
        v.append(list);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
