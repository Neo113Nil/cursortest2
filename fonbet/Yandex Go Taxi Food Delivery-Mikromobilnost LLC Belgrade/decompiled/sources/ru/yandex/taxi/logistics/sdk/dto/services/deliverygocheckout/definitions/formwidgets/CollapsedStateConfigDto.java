package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CollapsedStateConfigDto;", "", "initialState", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CollapsedStateConfigDto$InitialStateDto;", "collapseButton", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScenarioSelectorButtonDto;", "expandButton", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CollapsedStateConfigDto$InitialStateDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScenarioSelectorButtonDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScenarioSelectorButtonDto;)V", "getInitialState", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CollapsedStateConfigDto$InitialStateDto;", "getCollapseButton", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScenarioSelectorButtonDto;", "getExpandButton", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "InitialStateDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CollapsedStateConfigDto {
    private final ScenarioSelectorButtonDto collapseButton;
    private final ScenarioSelectorButtonDto expandButton;
    private final InitialStateDto initialState;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CollapsedStateConfigDto$InitialStateDto;", "", "<init>", "(Ljava/lang/String;I)V", "COLLAPSED", "EXPANDED", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InitialStateDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ InitialStateDto[] $VALUES;

        @Json(name = "collapsed")
        public static final InitialStateDto COLLAPSED = new InitialStateDto("COLLAPSED", 0);

        @Json(name = "expanded")
        public static final InitialStateDto EXPANDED = new InitialStateDto("EXPANDED", 1);

        private static final /* synthetic */ InitialStateDto[] $values() {
            return new InitialStateDto[]{COLLAPSED, EXPANDED};
        }

        static {
            InitialStateDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private InitialStateDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static InitialStateDto valueOf(String str) {
            return (InitialStateDto) Enum.valueOf(InitialStateDto.class, str);
        }

        public static InitialStateDto[] values() {
            return (InitialStateDto[]) $VALUES.clone();
        }
    }

    public CollapsedStateConfigDto(@Json(name = "initial_state") InitialStateDto initialStateDto, @Json(name = "collapse_button") ScenarioSelectorButtonDto scenarioSelectorButtonDto, @Json(name = "expand_button") ScenarioSelectorButtonDto scenarioSelectorButtonDto2) {
        this.initialState = initialStateDto;
        this.collapseButton = scenarioSelectorButtonDto;
        this.expandButton = scenarioSelectorButtonDto2;
    }

    public static /* synthetic */ CollapsedStateConfigDto copy$default(CollapsedStateConfigDto collapsedStateConfigDto, InitialStateDto initialStateDto, ScenarioSelectorButtonDto scenarioSelectorButtonDto, ScenarioSelectorButtonDto scenarioSelectorButtonDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            initialStateDto = collapsedStateConfigDto.initialState;
        }
        if ((i & 2) != 0) {
            scenarioSelectorButtonDto = collapsedStateConfigDto.collapseButton;
        }
        if ((i & 4) != 0) {
            scenarioSelectorButtonDto2 = collapsedStateConfigDto.expandButton;
        }
        return collapsedStateConfigDto.copy(initialStateDto, scenarioSelectorButtonDto, scenarioSelectorButtonDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final InitialStateDto getInitialState() {
        return this.initialState;
    }

    /* renamed from: component2, reason: from getter */
    public final ScenarioSelectorButtonDto getCollapseButton() {
        return this.collapseButton;
    }

    /* renamed from: component3, reason: from getter */
    public final ScenarioSelectorButtonDto getExpandButton() {
        return this.expandButton;
    }

    public final CollapsedStateConfigDto copy(@Json(name = "initial_state") InitialStateDto initialState, @Json(name = "collapse_button") ScenarioSelectorButtonDto collapseButton, @Json(name = "expand_button") ScenarioSelectorButtonDto expandButton) {
        return new CollapsedStateConfigDto(initialState, collapseButton, expandButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollapsedStateConfigDto)) {
            return false;
        }
        CollapsedStateConfigDto collapsedStateConfigDto = (CollapsedStateConfigDto) other;
        return this.initialState == collapsedStateConfigDto.initialState && jl40.l(this.collapseButton, collapsedStateConfigDto.collapseButton) && jl40.l(this.expandButton, collapsedStateConfigDto.expandButton);
    }

    public final ScenarioSelectorButtonDto getCollapseButton() {
        return this.collapseButton;
    }

    public final ScenarioSelectorButtonDto getExpandButton() {
        return this.expandButton;
    }

    public final InitialStateDto getInitialState() {
        return this.initialState;
    }

    public int hashCode() {
        return this.expandButton.hashCode() + ((this.collapseButton.hashCode() + (this.initialState.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "CollapsedStateConfigDto(initialState=" + this.initialState + ", collapseButton=" + this.collapseButton + ", expandButton=" + this.expandButton + Extension.C_BRAKE;
    }
}
