package defpackage;

import com.connectsdk.service.airplay.PListParser;

/* loaded from: classes3.dex */
public enum nx8 {
    STRING(PListParser.TAG_STRING),
    INTEGER(PListParser.TAG_INTEGER),
    NUMBER("number"),
    BOOLEAN("boolean"),
    DATETIME("datetime"),
    COLOR("color"),
    URL("url"),
    DICT(PListParser.TAG_DICT),
    ARRAY(PListParser.TAG_ARRAY);

    public final String a;

    nx8(String str) {
        this.a = str;
    }
}
