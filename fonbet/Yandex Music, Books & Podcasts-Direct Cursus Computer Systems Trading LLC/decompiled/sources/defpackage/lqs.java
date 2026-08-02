package defpackage;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class lqs implements Serializable {
    public static final quk b;
    public static final lqs c;
    public static final lqs d;
    public static final lqs e;
    public static final lqs f;
    public static final /* synthetic */ lqs[] g;
    public static final /* synthetic */ rdb h;
    public final String a;

    static {
        lqs lqsVar = new lqs("COMMON", 0, "music");
        c = lqsVar;
        lqs lqsVar2 = new lqs("PODCAST", 1, "podcast-episode");
        d = lqsVar2;
        lqs lqsVar3 = new lqs("ARTICLE", 2, "article");
        lqs lqsVar4 = new lqs("ASMR", 3, "asmr");
        lqs lqsVar5 = new lqs("NOISE", 4, "noise");
        lqs lqsVar6 = new lqs("RADIO_RECORD", 5, "radio-record");
        lqs lqsVar7 = new lqs("SHOW", 6, "show");
        lqs lqsVar8 = new lqs("LECTURE", 7, "lecture");
        lqs lqsVar9 = new lqs("FAIRY_TALE", 8, "fairy-tale");
        lqs lqsVar10 = new lqs("BOOK", 9, "book");
        lqs lqsVar11 = new lqs("AUDIOBOOK", 10, "audiobook");
        e = lqsVar11;
        lqs lqsVar12 = new lqs("POETRY", 11, "poetry");
        lqs lqsVar13 = new lqs("TRAILER", 12, "trailer");
        lqs lqsVar14 = new lqs("COMMENT", 13, "comment");
        f = lqsVar14;
        lqs[] lqsVarArr = {lqsVar, lqsVar2, lqsVar3, lqsVar4, lqsVar5, lqsVar6, lqsVar7, lqsVar8, lqsVar9, lqsVar10, lqsVar11, lqsVar12, lqsVar13, lqsVar14, new lqs("BONUS", 14, "bonus")};
        g = lqsVarArr;
        h = new rdb(lqsVarArr);
        b = new quk();
    }

    public lqs(String str, int i, String str2) {
        this.a = str2;
    }

    public static lqs valueOf(String str) {
        return (lqs) Enum.valueOf(lqs.class, str);
    }

    public static lqs[] values() {
        return (lqs[]) g.clone();
    }
}
