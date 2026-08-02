package defpackage;

import java.util.ArrayList;
import kotlin.Pair;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class s1v {
    public static final qcm d;
    public static final s1v e;
    public static final s1v f;
    public static final s1v g;
    public static final s1v h;
    public static final s1v i;
    public static final /* synthetic */ s1v[] j;
    public static final /* synthetic */ rdb k;
    public final int a;
    public final int b;
    public final b1v c;

    static {
        Float valueOf = Float.valueOf(0.0f);
        Pair pair = new Pair(-12838896, valueOf);
        Float valueOf2 = Float.valueOf(40.0f);
        s1v s1vVar = new s1v("Coral", 0, 2, 19, -706816, -10292, -7375243, fgq.u(pair, new Pair(-10279912, valueOf2), new Pair(-12839152, valueOf2)));
        s1v s1vVar2 = new s1v("Tangerine", 1, 20, 64, -692736, -7220, -6980753, fgq.u(new Pair(-12835056, valueOf), new Pair(-10273000, valueOf2), new Pair(-12835056, valueOf2)));
        s1v s1vVar3 = new s1v("Clover", 2, 65, 149, -13320130, -2624295, -8419968, fgq.u(new Pair(-16179950, valueOf), new Pair(-15249615, valueOf2), new Pair(-16046312, valueOf2)));
        e = s1vVar3;
        s1v s1vVar4 = new s1v("Emerald", 3, 150, 164, -16726135, -3342353, -8419968, fgq.u(new Pair(-16179948, valueOf), new Pair(-15249615, valueOf2), new Pair(-16046310, valueOf2)));
        s1v s1vVar5 = new s1v("Turquoise", 4, 165, 179, -16726106, -3342345, -8615802, fgq.u(new Pair(-15713997, valueOf), new Pair(-15249594, valueOf2), new Pair(-16046301, valueOf2)));
        s1v s1vVar6 = new s1v("Aquamarine", 5, 180, 189, -16731444, -3343873, -8812149, fgq.u(new Pair(-15650500, valueOf), new Pair(-15253169, valueOf2), new Pair(-15650500, valueOf2)));
        f = s1vVar6;
        s1v s1vVar7 = new s1v("Glacier", 6, 190, 204, -10711397, -2102804, -8616568, fgq.u(new Pair(-15322566, valueOf), new Pair(-14925750, valueOf2), new Pair(-15454924, valueOf2)));
        s1v s1vVar8 = new s1v("Slate", 7, 205, 219, -11572069, -2235154, -8749174, fgq.u(new Pair(-15653819, valueOf), new Pair(-15389096, valueOf2), new Pair(-15653561, valueOf2)));
        s1v s1vVar9 = new s1v("Sapphire", 8, 220, 234, -15973912, -3155204, -8749686, fgq.u(new Pair(-15656121, valueOf), new Pair(-14996881, valueOf2), new Pair(-15656121, valueOf2)));
        s1v s1vVar10 = new s1v("Indigo", 9, 235, 249, -15332120, -3026948, -8618871, fgq.u(new Pair(-15396801, valueOf), new Pair(-15260320, valueOf2), new Pair(-15199929, valueOf2)));
        g = s1vVar10;
        s1v s1vVar11 = new s1v("Amethyst", 10, 250, 259, -11520576, -2238476, -8684663, fgq.u(new Pair(-14807232, valueOf), new Pair(-13887650, valueOf2), new Pair(-14610105, valueOf2)));
        h = s1vVar11;
        s1v s1vVar12 = new s1v("Plum", 11, 260, 269, -8636992, -1648652, -8226419, fgq.u(new Pair(-13495993, valueOf), new Pair(-14150570, valueOf2), new Pair(-13495993, valueOf2)));
        s1v s1vVar13 = new s1v("Orchid", 12, 270, 299, -4515109, -798214, -7898486, fgq.u(new Pair(-12972231, valueOf), new Pair(-12382143, valueOf2), new Pair(-12119739, valueOf2)));
        s1v s1vVar14 = new s1v("Raspberry", 13, 300, 329, -2418051, -339482, -6737536, fgq.u(new Pair(-11463637, valueOf), new Pair(-10742223, valueOf2), new Pair(-12119770, valueOf2)));
        i = s1vVar14;
        s1v[] s1vVarArr = {s1vVar, s1vVar2, s1vVar3, s1vVar4, s1vVar5, s1vVar6, s1vVar7, s1vVar8, s1vVar9, s1vVar10, s1vVar11, s1vVar12, s1vVar13, s1vVar14, new s1v("Fuchsia", 14, 330, 339, -720772, -13082, -7310208, fgq.u(new Pair(-11725263, valueOf), new Pair(-10544323, valueOf2), new Pair(-12116943, valueOf2))), new s1v("Carmine", 15, 340, 1, -720850, -13098, -7571336, fgq.u(new Pair(-12512486, valueOf), new Pair(-10019287, valueOf2), new Pair(-12774117, valueOf2)))};
        j = s1vVarArr;
        k = new rdb(s1vVarArr);
        d = new qcm();
    }

    public s1v(String str, int i2, int i3, int i4, int i5, int i6, int i7, ArrayList arrayList) {
        this.a = i3;
        this.b = i4;
        this.c = new b1v(i5, i6, i7, arrayList);
    }

    public static s1v valueOf(String str) {
        return (s1v) Enum.valueOf(s1v.class, str);
    }

    public static s1v[] values() {
        return (s1v[]) j.clone();
    }
}
