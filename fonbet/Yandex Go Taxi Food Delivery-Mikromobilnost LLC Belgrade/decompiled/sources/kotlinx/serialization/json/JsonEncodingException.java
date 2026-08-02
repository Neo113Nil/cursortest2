package kotlinx.serialization.json;

import defpackage.evu0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lkotlinx/serialization/json/JsonEncodingException;", "Lkotlinx/serialization/json/JsonException;", "", "shortMessage", "Ljava/lang/String;", "getShortMessage", "()Ljava/lang/String;", "classSerialName", "getClassSerialName", "hint", "getHint", "kotlinx-serialization-json"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JsonEncodingException extends JsonException {
    private final String classSerialName;
    private final String hint;
    private final String shortMessage;

    public JsonEncodingException(String str, String str2, String str3) {
        super(str.concat((str3 == null || evu0.J(str3)) ? "" : "\n".concat(str3)));
        this.shortMessage = str;
        this.classSerialName = str2;
        this.hint = str3;
    }

    public /* synthetic */ JsonEncodingException(String str, String str2, String str3, int i) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
