package kotlinx.serialization.json;

import com.yandex.div.state.db.StateEntry;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"Lkotlinx/serialization/json/JsonDecodingException;", "Lkotlinx/serialization/json/JsonException;", "", "shortMessage", "Ljava/lang/String;", "getShortMessage", "()Ljava/lang/String;", "", "offset", CA20Status.STATUS_USER_I, "getOffset", "()I", StateEntry.COLUMN_PATH, "getPath", "input", "getInput", "hint", "getHint", "kotlinx-serialization-json"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class JsonDecodingException extends JsonException {
    private final String hint;
    private final String input;
    private final int offset;
    private final String path;
    private final String shortMessage;

    public JsonDecodingException(String str, String str2, String str3, String str4, int i, String str5) {
        super(str);
        this.shortMessage = str2;
        this.offset = i;
        this.path = str3;
        this.input = str4;
        this.hint = str5;
    }
}
