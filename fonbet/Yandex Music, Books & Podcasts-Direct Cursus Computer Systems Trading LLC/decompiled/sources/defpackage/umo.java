package defpackage;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class umo {
    public static final umo a;
    public static final umo b;
    public static final umo c;
    public static final umo d;
    public static final HashMap e;
    public static final /* synthetic */ umo[] f;

    /* JADX INFO: Fake field, exist only in values array */
    umo EF1;

    static {
        umo umoVar = new umo("svg", 0);
        umo umoVar2 = new umo("a", 1);
        umo umoVar3 = new umo("circle", 2);
        umo umoVar4 = new umo("clipPath", 3);
        umo umoVar5 = new umo("defs", 4);
        umo umoVar6 = new umo("desc", 5);
        a = umoVar6;
        umo umoVar7 = new umo("ellipse", 6);
        umo umoVar8 = new umo("g", 7);
        umo umoVar9 = new umo("image", 8);
        umo umoVar10 = new umo("line", 9);
        umo umoVar11 = new umo("linearGradient", 10);
        umo umoVar12 = new umo("marker", 11);
        umo umoVar13 = new umo("mask", 12);
        umo umoVar14 = new umo("path", 13);
        umo umoVar15 = new umo("pattern", 14);
        umo umoVar16 = new umo("polygon", 15);
        umo umoVar17 = new umo("polyline", 16);
        umo umoVar18 = new umo("radialGradient", 17);
        umo umoVar19 = new umo("rect", 18);
        umo umoVar20 = new umo("solidColor", 19);
        umo umoVar21 = new umo("stop", 20);
        umo umoVar22 = new umo("style", 21);
        umo umoVar23 = new umo("SWITCH", 22);
        b = umoVar23;
        umo umoVar24 = new umo("symbol", 23);
        umo umoVar25 = new umo("text", 24);
        umo umoVar26 = new umo("textPath", 25);
        umo umoVar27 = new umo("title", 26);
        c = umoVar27;
        umo umoVar28 = new umo("tref", 27);
        umo umoVar29 = new umo("tspan", 28);
        umo umoVar30 = new umo("use", 29);
        umo umoVar31 = new umo("view", 30);
        umo umoVar32 = new umo("UNSUPPORTED", 31);
        d = umoVar32;
        f = new umo[]{umoVar, umoVar2, umoVar3, umoVar4, umoVar5, umoVar6, umoVar7, umoVar8, umoVar9, umoVar10, umoVar11, umoVar12, umoVar13, umoVar14, umoVar15, umoVar16, umoVar17, umoVar18, umoVar19, umoVar20, umoVar21, umoVar22, umoVar23, umoVar24, umoVar25, umoVar26, umoVar27, umoVar28, umoVar29, umoVar30, umoVar31, umoVar32};
        e = new HashMap();
        for (umo umoVar33 : values()) {
            if (umoVar33 == b) {
                e.put("switch", umoVar33);
            } else if (umoVar33 != d) {
                e.put(umoVar33.name(), umoVar33);
            }
        }
    }

    public static umo valueOf(String str) {
        return (umo) Enum.valueOf(umo.class, str);
    }

    public static umo[] values() {
        return (umo[]) f.clone();
    }
}
