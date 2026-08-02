package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.k4o;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ContentAlignmentDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.HorizontalPaddingsDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001:\u0002-.B]\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\t\u0010&\u001a\u00020\u000fHÆ\u0003Jd\u0010'\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\b\b\u0003\u0010\u000e\u001a\u00020\u000fHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0006HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\t\u0010\u001aR\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006/"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DividerWidgetDto;", "", "widgetId", "", "groupTitleText", "spacerHeight", "", "horizontalPaddings", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/HorizontalPaddingsDto;", "isFlexible", "", "groupSeparateTitles", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DividerWidgetDto$GroupSeparateTitlesDto;", "style", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DividerWidgetDto$StyleDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/HorizontalPaddingsDto;Ljava/lang/Boolean;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DividerWidgetDto$StyleDto;)V", "getWidgetId", "()Ljava/lang/String;", "getGroupTitleText", "getSpacerHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHorizontalPaddings", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/HorizontalPaddingsDto;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getGroupSeparateTitles", "()Ljava/util/List;", "getStyle", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DividerWidgetDto$StyleDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/HorizontalPaddingsDto;Ljava/lang/Boolean;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DividerWidgetDto$StyleDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DividerWidgetDto;", "equals", "other", "hashCode", "toString", "GroupSeparateTitlesDto", "StyleDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DividerWidgetDto {
    private final List<GroupSeparateTitlesDto> groupSeparateTitles;
    private final String groupTitleText;
    private final HorizontalPaddingsDto horizontalPaddings;
    private final Boolean isFlexible;
    private final Integer spacerHeight;
    private final StyleDto style;
    private final String widgetId;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DividerWidgetDto$GroupSeparateTitlesDto;", "", "text", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "align", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ContentAlignmentDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ContentAlignmentDto;)V", "getText", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getAlign", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ContentAlignmentDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GroupSeparateTitlesDto {
        private final ContentAlignmentDto align;
        private final AttributedTextDto text;

        public GroupSeparateTitlesDto(@Json(name = "text") AttributedTextDto attributedTextDto, @Json(name = "align") ContentAlignmentDto contentAlignmentDto) {
            this.text = attributedTextDto;
            this.align = contentAlignmentDto;
        }

        public static /* synthetic */ GroupSeparateTitlesDto copy$default(GroupSeparateTitlesDto groupSeparateTitlesDto, AttributedTextDto attributedTextDto, ContentAlignmentDto contentAlignmentDto, int i, Object obj) {
            if ((i & 1) != 0) {
                attributedTextDto = groupSeparateTitlesDto.text;
            }
            if ((i & 2) != 0) {
                contentAlignmentDto = groupSeparateTitlesDto.align;
            }
            return groupSeparateTitlesDto.copy(attributedTextDto, contentAlignmentDto);
        }

        /* renamed from: component1, reason: from getter */
        public final AttributedTextDto getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final ContentAlignmentDto getAlign() {
            return this.align;
        }

        public final GroupSeparateTitlesDto copy(@Json(name = "text") AttributedTextDto text, @Json(name = "align") ContentAlignmentDto align) {
            return new GroupSeparateTitlesDto(text, align);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GroupSeparateTitlesDto)) {
                return false;
            }
            GroupSeparateTitlesDto groupSeparateTitlesDto = (GroupSeparateTitlesDto) other;
            return jl40.l(this.text, groupSeparateTitlesDto.text) && this.align == groupSeparateTitlesDto.align;
        }

        public final ContentAlignmentDto getAlign() {
            return this.align;
        }

        public final AttributedTextDto getText() {
            return this.text;
        }

        public int hashCode() {
            return this.align.hashCode() + (this.text.hashCode() * 31);
        }

        public String toString() {
            return "GroupSeparateTitlesDto(text=" + this.text + ", align=" + this.align + Extension.C_BRAKE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DividerWidgetDto$StyleDto;", "", "<init>", "(Ljava/lang/String;I)V", "GROUP_TITLE", "LINE", "LINE_MARGIN", "LINE_SLOT", "LINE_SLOT_MARGIN", "FOCUS", "FOCUS_MARGIN", "SPACER", "GROUP_SEPARATE_TITLES", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StyleDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ StyleDto[] $VALUES;

        @Json(name = "group_title")
        public static final StyleDto GROUP_TITLE = new StyleDto("GROUP_TITLE", 0);

        @Json(name = "line")
        public static final StyleDto LINE = new StyleDto("LINE", 1);

        @Json(name = "line_margin")
        public static final StyleDto LINE_MARGIN = new StyleDto("LINE_MARGIN", 2);

        @Json(name = "line_slot")
        public static final StyleDto LINE_SLOT = new StyleDto("LINE_SLOT", 3);

        @Json(name = "line_slot_margin")
        public static final StyleDto LINE_SLOT_MARGIN = new StyleDto("LINE_SLOT_MARGIN", 4);

        @Json(name = "focus")
        public static final StyleDto FOCUS = new StyleDto("FOCUS", 5);

        @Json(name = "focus_margin")
        public static final StyleDto FOCUS_MARGIN = new StyleDto("FOCUS_MARGIN", 6);

        @Json(name = "spacer")
        public static final StyleDto SPACER = new StyleDto("SPACER", 7);

        @Json(name = "group_separate_titles")
        public static final StyleDto GROUP_SEPARATE_TITLES = new StyleDto("GROUP_SEPARATE_TITLES", 8);

        private static final /* synthetic */ StyleDto[] $values() {
            return new StyleDto[]{GROUP_TITLE, LINE, LINE_MARGIN, LINE_SLOT, LINE_SLOT_MARGIN, FOCUS, FOCUS_MARGIN, SPACER, GROUP_SEPARATE_TITLES};
        }

        static {
            StyleDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private StyleDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static StyleDto valueOf(String str) {
            return (StyleDto) Enum.valueOf(StyleDto.class, str);
        }

        public static StyleDto[] values() {
            return (StyleDto[]) $VALUES.clone();
        }
    }

    public DividerWidgetDto(@Json(name = "widget_id") String str, @Json(name = "group_title_text") String str2, @Json(name = "spacer_height") Integer num, @Json(name = "horizontal_paddings") HorizontalPaddingsDto horizontalPaddingsDto, @Json(name = "is_flexible") Boolean bool, @Json(name = "group_separate_titles") List<GroupSeparateTitlesDto> list, @Json(name = "style") StyleDto styleDto) {
        this.widgetId = str;
        this.groupTitleText = str2;
        this.spacerHeight = num;
        this.horizontalPaddings = horizontalPaddingsDto;
        this.isFlexible = bool;
        this.groupSeparateTitles = list;
        this.style = styleDto;
    }

    public static /* synthetic */ DividerWidgetDto copy$default(DividerWidgetDto dividerWidgetDto, String str, String str2, Integer num, HorizontalPaddingsDto horizontalPaddingsDto, Boolean bool, List list, StyleDto styleDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dividerWidgetDto.widgetId;
        }
        if ((i & 2) != 0) {
            str2 = dividerWidgetDto.groupTitleText;
        }
        if ((i & 4) != 0) {
            num = dividerWidgetDto.spacerHeight;
        }
        if ((i & 8) != 0) {
            horizontalPaddingsDto = dividerWidgetDto.horizontalPaddings;
        }
        if ((i & 16) != 0) {
            bool = dividerWidgetDto.isFlexible;
        }
        if ((i & 32) != 0) {
            list = dividerWidgetDto.groupSeparateTitles;
        }
        if ((i & 64) != 0) {
            styleDto = dividerWidgetDto.style;
        }
        List list2 = list;
        StyleDto styleDto2 = styleDto;
        Boolean bool2 = bool;
        Integer num2 = num;
        return dividerWidgetDto.copy(str, str2, num2, horizontalPaddingsDto, bool2, list2, styleDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getGroupTitleText() {
        return this.groupTitleText;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getSpacerHeight() {
        return this.spacerHeight;
    }

    /* renamed from: component4, reason: from getter */
    public final HorizontalPaddingsDto getHorizontalPaddings() {
        return this.horizontalPaddings;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getIsFlexible() {
        return this.isFlexible;
    }

    public final List<GroupSeparateTitlesDto> component6() {
        return this.groupSeparateTitles;
    }

    /* renamed from: component7, reason: from getter */
    public final StyleDto getStyle() {
        return this.style;
    }

    public final DividerWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "group_title_text") String groupTitleText, @Json(name = "spacer_height") Integer spacerHeight, @Json(name = "horizontal_paddings") HorizontalPaddingsDto horizontalPaddings, @Json(name = "is_flexible") Boolean isFlexible, @Json(name = "group_separate_titles") List<GroupSeparateTitlesDto> groupSeparateTitles, @Json(name = "style") StyleDto style) {
        return new DividerWidgetDto(widgetId, groupTitleText, spacerHeight, horizontalPaddings, isFlexible, groupSeparateTitles, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DividerWidgetDto)) {
            return false;
        }
        DividerWidgetDto dividerWidgetDto = (DividerWidgetDto) other;
        return jl40.l(this.widgetId, dividerWidgetDto.widgetId) && jl40.l(this.groupTitleText, dividerWidgetDto.groupTitleText) && jl40.l(this.spacerHeight, dividerWidgetDto.spacerHeight) && jl40.l(this.horizontalPaddings, dividerWidgetDto.horizontalPaddings) && jl40.l(this.isFlexible, dividerWidgetDto.isFlexible) && jl40.l(this.groupSeparateTitles, dividerWidgetDto.groupSeparateTitles) && this.style == dividerWidgetDto.style;
    }

    public final List<GroupSeparateTitlesDto> getGroupSeparateTitles() {
        return this.groupSeparateTitles;
    }

    public final String getGroupTitleText() {
        return this.groupTitleText;
    }

    public final HorizontalPaddingsDto getHorizontalPaddings() {
        return this.horizontalPaddings;
    }

    public final Integer getSpacerHeight() {
        return this.spacerHeight;
    }

    public final StyleDto getStyle() {
        return this.style;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int hashCode = this.widgetId.hashCode() * 31;
        String str = this.groupTitleText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.spacerHeight;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        HorizontalPaddingsDto horizontalPaddingsDto = this.horizontalPaddings;
        int hashCode4 = (hashCode3 + (horizontalPaddingsDto == null ? 0 : horizontalPaddingsDto.hashCode())) * 31;
        Boolean bool = this.isFlexible;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<GroupSeparateTitlesDto> list = this.groupSeparateTitles;
        return this.style.hashCode() + ((hashCode5 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final Boolean isFlexible() {
        return this.isFlexible;
    }

    public String toString() {
        String str = this.widgetId;
        String str2 = this.groupTitleText;
        Integer num = this.spacerHeight;
        HorizontalPaddingsDto horizontalPaddingsDto = this.horizontalPaddings;
        Boolean bool = this.isFlexible;
        List<GroupSeparateTitlesDto> list = this.groupSeparateTitles;
        StyleDto styleDto = this.style;
        StringBuilder v = b64.v("DividerWidgetDto(widgetId=", str, ", groupTitleText=", str2, ", spacerHeight=");
        v.append(num);
        v.append(", horizontalPaddings=");
        v.append(horizontalPaddingsDto);
        v.append(", isFlexible=");
        v.append(bool);
        v.append(", groupSeparateTitles=");
        v.append(list);
        v.append(", style=");
        v.append(styleDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
