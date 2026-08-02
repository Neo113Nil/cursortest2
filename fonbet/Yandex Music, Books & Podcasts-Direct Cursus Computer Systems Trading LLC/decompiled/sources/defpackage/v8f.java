package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class v8f {
    public static final v8f a;
    public static final v8f b;
    public static final v8f c;
    public static final v8f d;
    public static final v8f e;
    public static final v8f f;
    public static final v8f g;
    public static final /* synthetic */ v8f[] h;

    static {
        v8f v8fVar = new v8f("HEADER", 0);
        a = v8fVar;
        v8f v8fVar2 = new v8f("DESCRIPTION", 1);
        b = v8fVar2;
        v8f v8fVar3 = new v8f("WAVE_BUTTON", 2);
        c = v8fVar3;
        v8f v8fVar4 = new v8f("COMMON_ACTION_ENTITY", 3);
        d = v8fVar4;
        v8f v8fVar5 = new v8f("TEXT_ACTION_ENTITY", 4);
        e = v8fVar5;
        v8f v8fVar6 = new v8f("FOOTER", 5);
        f = v8fVar6;
        v8f v8fVar7 = new v8f("DISCLAIMERS_BLOCK", 6);
        g = v8fVar7;
        h = new v8f[]{v8fVar, v8fVar2, v8fVar3, v8fVar4, v8fVar5, v8fVar6, v8fVar7};
    }

    public static v8f valueOf(String str) {
        return (v8f) Enum.valueOf(v8f.class, str);
    }

    public static v8f[] values() {
        return (v8f[]) h.clone();
    }
}
