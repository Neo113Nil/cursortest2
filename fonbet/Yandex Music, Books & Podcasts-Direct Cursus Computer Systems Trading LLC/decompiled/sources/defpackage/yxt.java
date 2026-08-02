package defpackage;

import com.connectsdk.service.airplay.PListParser;

/* loaded from: classes5.dex */
public enum yxt {
    Int("int"),
    Double("double"),
    Boolean("boolean"),
    String_(PListParser.TAG_STRING),
    Version("version"),
    Array(PListParser.TAG_ARRAY),
    Map("map");

    public final String a;

    yxt(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
