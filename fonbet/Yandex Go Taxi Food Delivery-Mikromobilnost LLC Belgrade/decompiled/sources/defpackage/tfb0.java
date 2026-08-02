package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.widget.SlideableModalView;

/* loaded from: classes6.dex */
public final class tfb0 {
    public final String a;
    public final List b;
    public final String c;
    public final bgq0 d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final SlideableModalView.CardMode o;
    public final Integer p;
    public final Integer q;

    public tfb0(String str, List list, String str2, bgq0 bgq0Var, boolean z, SlideableModalView.CardMode cardMode, Integer num, int i) {
        List list2 = (i & 2) != 0 ? EmptyList.a : list;
        String str3 = (i & 4) != 0 ? null : str2;
        bgq0 bgq0Var2 = (i & 8) != 0 ? bgq0.f : bgq0Var;
        boolean z2 = (i & 32) == 0;
        boolean z3 = (i & 128) == 0;
        boolean z4 = (i & 256) == 0;
        boolean z5 = (i & 1024) == 0;
        boolean z6 = (i & 2048) == 0;
        boolean z7 = (i & 4096) == 0;
        boolean z8 = (i & 8192) != 0;
        boolean z9 = (i & 16384) != 0 ? true : z;
        SlideableModalView.CardMode cardMode2 = (i & 32768) != 0 ? SlideableModalView.CardMode.SLIDEABLE_CARD : cardMode;
        Integer num2 = (i & 65536) != 0 ? null : 1;
        Integer num3 = (i & 131072) != 0 ? null : num;
        this.a = str;
        this.b = list2;
        this.c = str3;
        this.d = bgq0Var2;
        this.e = "";
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = true;
        this.j = z5;
        this.k = z6;
        this.l = z7;
        this.m = z8;
        this.n = z9;
        this.o = cardMode2;
        this.p = num2;
        this.q = num3;
    }
}
