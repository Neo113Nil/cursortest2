package kotlin.text;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lkotlin/text/RegexOption;", "", "", "value", CA20Status.STATUS_USER_I, "a", "()I", "mask", "getMask", "IGNORE_CASE", "MULTILINE", "LITERAL", "UNIX_LINES", "COMMENTS", "DOT_MATCHES_ALL", "CANON_EQ", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RegexOption {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RegexOption[] $VALUES;
    public static final RegexOption CANON_EQ;
    public static final RegexOption COMMENTS;
    public static final RegexOption DOT_MATCHES_ALL;
    public static final RegexOption IGNORE_CASE;
    public static final RegexOption LITERAL;
    public static final RegexOption MULTILINE;
    public static final RegexOption UNIX_LINES;
    private final int mask;
    private final int value;

    static {
        RegexOption regexOption = new RegexOption("IGNORE_CASE", 0, 2);
        IGNORE_CASE = regexOption;
        RegexOption regexOption2 = new RegexOption("MULTILINE", 1, 8);
        MULTILINE = regexOption2;
        RegexOption regexOption3 = new RegexOption("LITERAL", 2, 16);
        LITERAL = regexOption3;
        RegexOption regexOption4 = new RegexOption("UNIX_LINES", 3, 1);
        UNIX_LINES = regexOption4;
        RegexOption regexOption5 = new RegexOption("COMMENTS", 4, 4);
        COMMENTS = regexOption5;
        RegexOption regexOption6 = new RegexOption("DOT_MATCHES_ALL", 5, 32);
        DOT_MATCHES_ALL = regexOption6;
        RegexOption regexOption7 = new RegexOption("CANON_EQ", 6, 128);
        CANON_EQ = regexOption7;
        RegexOption[] regexOptionArr = {regexOption, regexOption2, regexOption3, regexOption4, regexOption5, regexOption6, regexOption7};
        $VALUES = regexOptionArr;
        $ENTRIES = a.a(regexOptionArr);
    }

    public RegexOption(String str, int i, int i2) {
        this.value = i2;
        this.mask = i2;
    }

    public static RegexOption valueOf(String str) {
        return (RegexOption) Enum.valueOf(RegexOption.class, str);
    }

    public static RegexOption[] values() {
        return (RegexOption[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getValue() {
        return this.value;
    }
}
