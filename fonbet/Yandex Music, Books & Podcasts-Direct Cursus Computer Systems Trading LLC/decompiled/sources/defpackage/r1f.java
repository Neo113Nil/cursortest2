package defpackage;

import com.connectsdk.service.airplay.PListParser;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class r1f {
    public static final r1f a;
    public static final r1f b;
    public static final r1f c;
    public static final r1f d;
    public static final r1f e;
    public static final r1f f;
    public static final r1f g;
    public static final /* synthetic */ r1f[] h;

    static {
        r1f r1fVar = new r1f(PListParser.TAG_INTEGER, 0);
        a = r1fVar;
        r1f r1fVar2 = new r1f("double", 1);
        b = r1fVar2;
        r1f r1fVar3 = new r1f(PListParser.TAG_STRING, 2);
        c = r1fVar3;
        r1f r1fVar4 = new r1f("boolean", 3);
        d = r1fVar4;
        r1f r1fVar5 = new r1f("nullItem", 4);
        e = r1fVar5;
        r1f r1fVar6 = new r1f("map", 5);
        f = r1fVar6;
        r1f r1fVar7 = new r1f(PListParser.TAG_ARRAY, 6);
        g = r1fVar7;
        h = new r1f[]{r1fVar, r1fVar2, r1fVar3, r1fVar4, r1fVar5, r1fVar6, r1fVar7};
    }

    public static r1f valueOf(String str) {
        return (r1f) Enum.valueOf(r1f.class, str);
    }

    public static r1f[] values() {
        return (r1f[]) h.clone();
    }
}
