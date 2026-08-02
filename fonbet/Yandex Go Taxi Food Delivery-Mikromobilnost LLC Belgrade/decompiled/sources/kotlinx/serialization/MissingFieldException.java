package kotlinx.serialization;

import defpackage.g8e;
import defpackage.unr0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlinx/serialization/MissingFieldException;", "Lkotlinx/serialization/SerializationException;", "", "", "missingFields", "Ljava/util/List;", "getMissingFields", "()Ljava/util/List;", "serialName", "Ljava/lang/String;", "getSerialName", "()Ljava/lang/String;", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MissingFieldException extends SerializationException {
    private final List<String> missingFields;
    private final String serialName;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MissingFieldException(ArrayList arrayList, String str) {
        this(r0, null, arrayList, str);
        String str2;
        if (arrayList.size() == 1) {
            str2 = g8e.r(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", str, "', but it was missing");
        } else {
            str2 = "Fields " + arrayList + " are required for type with serial name '" + str + "', but they were missing";
        }
    }

    public final MissingFieldException a(String str) {
        return new MissingFieldException(str, this, this.missingFields, this.serialName);
    }

    public MissingFieldException(String str, MissingFieldException missingFieldException, List list, String str2) {
        super(str, missingFieldException);
        this.missingFields = list;
        this.serialName = str2;
    }

    public MissingFieldException(String str, String str2) {
        this(unr0.p("Field '", str, "' is required for type with serial name '", str2, "', but it was missing"), null, Collections.singletonList(str), str2);
    }
}
