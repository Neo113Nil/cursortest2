package kotlin.io.encoding;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"kotlin/io/encoding/Base64$PaddingOption", "", "Lkotlin/io/encoding/Base64$PaddingOption;", "PRESENT", "ABSENT", "PRESENT_OPTIONAL", "ABSENT_OPTIONAL", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Base64$PaddingOption {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Base64$PaddingOption[] $VALUES;
    public static final Base64$PaddingOption ABSENT;
    public static final Base64$PaddingOption ABSENT_OPTIONAL;
    public static final Base64$PaddingOption PRESENT;
    public static final Base64$PaddingOption PRESENT_OPTIONAL;

    static {
        Base64$PaddingOption base64$PaddingOption = new Base64$PaddingOption("PRESENT", 0);
        PRESENT = base64$PaddingOption;
        Base64$PaddingOption base64$PaddingOption2 = new Base64$PaddingOption("ABSENT", 1);
        ABSENT = base64$PaddingOption2;
        Base64$PaddingOption base64$PaddingOption3 = new Base64$PaddingOption("PRESENT_OPTIONAL", 2);
        PRESENT_OPTIONAL = base64$PaddingOption3;
        Base64$PaddingOption base64$PaddingOption4 = new Base64$PaddingOption("ABSENT_OPTIONAL", 3);
        ABSENT_OPTIONAL = base64$PaddingOption4;
        Base64$PaddingOption[] base64$PaddingOptionArr = {base64$PaddingOption, base64$PaddingOption2, base64$PaddingOption3, base64$PaddingOption4};
        $VALUES = base64$PaddingOptionArr;
        $ENTRIES = a.a(base64$PaddingOptionArr);
    }

    public static Base64$PaddingOption valueOf(String str) {
        return (Base64$PaddingOption) Enum.valueOf(Base64$PaddingOption.class, str);
    }

    public static Base64$PaddingOption[] values() {
        return (Base64$PaddingOption[]) $VALUES.clone();
    }
}
