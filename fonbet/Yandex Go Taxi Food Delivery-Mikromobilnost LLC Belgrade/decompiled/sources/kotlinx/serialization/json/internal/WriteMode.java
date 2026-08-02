package kotlinx.serialization.json.internal;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\f\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lkotlinx/serialization/json/internal/WriteMode;", "", "", "begin", CA20Status.STATUS_REQUEST_C, "end", "OBJ", "LIST", "MAP", "POLY_OBJ", "kotlinx-serialization-json"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class WriteMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WriteMode[] $VALUES;
    public static final WriteMode LIST;
    public static final WriteMode MAP;
    public static final WriteMode OBJ;
    public static final WriteMode POLY_OBJ;
    public final char begin;
    public final char end;

    static {
        WriteMode writeMode = new WriteMode("OBJ", 0, '{', '}');
        OBJ = writeMode;
        WriteMode writeMode2 = new WriteMode("LIST", 1, '[', ']');
        LIST = writeMode2;
        WriteMode writeMode3 = new WriteMode("MAP", 2, '{', '}');
        MAP = writeMode3;
        WriteMode writeMode4 = new WriteMode("POLY_OBJ", 3, '[', ']');
        POLY_OBJ = writeMode4;
        WriteMode[] writeModeArr = {writeMode, writeMode2, writeMode3, writeMode4};
        $VALUES = writeModeArr;
        $ENTRIES = kotlin.enums.a.a(writeModeArr);
    }

    public WriteMode(String str, int i, char c, char c2) {
        this.begin = c;
        this.end = c2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static WriteMode valueOf(String str) {
        return (WriteMode) Enum.valueOf(WriteMode.class, str);
    }

    public static WriteMode[] values() {
        return (WriteMode[]) $VALUES.clone();
    }
}
