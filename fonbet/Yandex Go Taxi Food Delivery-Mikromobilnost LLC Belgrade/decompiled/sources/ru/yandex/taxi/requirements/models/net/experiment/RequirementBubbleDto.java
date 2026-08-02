package ru.yandex.taxi.requirements.models.net.experiment;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.mdj0;
import defpackage.vci0;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/requirements/models/net/experiment/RequirementBubbleDto;", "", "Companion", "RequirementBubbleActionDto", "ru/yandex/taxi/requirements/models/net/experiment/a", "mdj0", "go-client-android.features.requirements:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RequirementBubbleDto {
    public static final mdj0 Companion = new mdj0();
    public static final i3y[] h;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Map f;
    public final RequirementBubbleActionDto g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/requirements/models/net/experiment/RequirementBubbleDto$RequirementBubbleActionDto;", "", "Companion", "ru/yandex/taxi/requirements/models/net/experiment/b", "SHOW_SCHEDULE", "SHOW_COMPOUND_SELECT_OPTIONS", "CHANGE_COUNT", "SHOW_INTERCITY_CONTACT", "DEFAULT", "go-client-android.features.requirements:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class RequirementBubbleActionDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ RequirementBubbleActionDto[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final RequirementBubbleActionDto CHANGE_COUNT;
        public static final b Companion;
        public static final RequirementBubbleActionDto DEFAULT;
        public static final RequirementBubbleActionDto SHOW_COMPOUND_SELECT_OPTIONS;
        public static final RequirementBubbleActionDto SHOW_INTERCITY_CONTACT;
        public static final RequirementBubbleActionDto SHOW_SCHEDULE;

        static {
            RequirementBubbleActionDto requirementBubbleActionDto = new RequirementBubbleActionDto("SHOW_SCHEDULE", 0);
            SHOW_SCHEDULE = requirementBubbleActionDto;
            RequirementBubbleActionDto requirementBubbleActionDto2 = new RequirementBubbleActionDto("SHOW_COMPOUND_SELECT_OPTIONS", 1);
            SHOW_COMPOUND_SELECT_OPTIONS = requirementBubbleActionDto2;
            RequirementBubbleActionDto requirementBubbleActionDto3 = new RequirementBubbleActionDto("CHANGE_COUNT", 2);
            CHANGE_COUNT = requirementBubbleActionDto3;
            RequirementBubbleActionDto requirementBubbleActionDto4 = new RequirementBubbleActionDto("SHOW_INTERCITY_CONTACT", 3);
            SHOW_INTERCITY_CONTACT = requirementBubbleActionDto4;
            RequirementBubbleActionDto requirementBubbleActionDto5 = new RequirementBubbleActionDto("DEFAULT", 4);
            DEFAULT = requirementBubbleActionDto5;
            RequirementBubbleActionDto[] requirementBubbleActionDtoArr = {requirementBubbleActionDto, requirementBubbleActionDto2, requirementBubbleActionDto3, requirementBubbleActionDto4, requirementBubbleActionDto5};
            $VALUES = requirementBubbleActionDtoArr;
            $ENTRIES = kotlin.enums.a.a(requirementBubbleActionDtoArr);
            Companion = new b();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vci0(19));
        }

        public static RequirementBubbleActionDto valueOf(String str) {
            return (RequirementBubbleActionDto) Enum.valueOf(RequirementBubbleActionDto.class, str);
        }

        public static RequirementBubbleActionDto[] values() {
            return (RequirementBubbleActionDto[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new vci0(17)), kotlin.a.b(lazyThreadSafetyMode, new vci0(18))};
    }

    public /* synthetic */ RequirementBubbleDto(int i, String str, String str2, String str3, String str4, String str5, Map map, RequirementBubbleActionDto requirementBubbleActionDto) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = kotlin.collections.b.f();
        } else {
            this.f = map;
        }
        if ((i & 64) == 0) {
            this.g = RequirementBubbleActionDto.DEFAULT;
        } else {
            this.g = requirementBubbleActionDto;
        }
    }

    public RequirementBubbleDto() {
        this(0);
    }

    public RequirementBubbleDto(int i) {
        Map f = kotlin.collections.b.f();
        RequirementBubbleActionDto requirementBubbleActionDto = RequirementBubbleActionDto.DEFAULT;
        this.a = "";
        this.b = "";
        this.c = null;
        this.d = "";
        this.e = null;
        this.f = f;
        this.g = requirementBubbleActionDto;
    }
}
