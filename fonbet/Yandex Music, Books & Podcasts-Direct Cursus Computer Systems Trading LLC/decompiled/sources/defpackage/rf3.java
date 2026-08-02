package defpackage;

import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class rf3 {
    public static final i9w g;
    public static final rf3 h;
    public static final rf3 i;
    public static final rf3 j;
    public static final rf3 k;
    public static final rf3 l;
    public static final rf3 m;
    public static final /* synthetic */ rf3[] n;
    public static final /* synthetic */ rdb o;
    public final int a;
    public final int b;
    public final Function1 c;
    public final Function1 d;
    public final float e;
    public final pyc f;

    static {
        rf3 rf3Var = new rf3("LANDING", 0, R.id.bottom_tab_landing, R.string.nng_header, new mz2(12), new mz2(17), 112);
        h = rf3Var;
        rf3 rf3Var2 = new rf3("PODCASTS", 1, R.id.bottom_tab_podcast, R.string.podcasts_and_audiobooks_title, new mz2(18), new mz2(19), 112);
        i = rf3Var2;
        rf3 rf3Var3 = new rf3("CONCERTS", 2, R.id.bottom_tab_concert, R.string.concerts, new mz2(20), new mz2(21), 112);
        j = rf3Var3;
        rf3 rf3Var4 = new rf3("KIDS", 3, R.id.bottom_tab_kids, R.string.kids_tab, new mz2(22), new mz2(23), 112);
        k = rf3Var4;
        rf3 rf3Var5 = new rf3("MY_MUSIC", 4, R.id.bottom_tab_mymusic, R.string.my_music_collections, new mz2(13), new mz2(14), 112);
        l = rf3Var5;
        rf3 rf3Var6 = new rf3("WAVE", 5, R.id.bottom_tab_wave, R.string.shortcut_long_label_play_my_vibe, new mz2(15), new mz2(16), 80);
        m = rf3Var6;
        rf3[] rf3VarArr = {rf3Var, rf3Var2, rf3Var3, rf3Var4, rf3Var5, rf3Var6};
        n = rf3VarArr;
        o = new rdb(rf3VarArr);
        g = new i9w();
    }

    public rf3(String str, int i2, int i3, int i4, Function1 function1, Function1 function12, int i5) {
        float f = 24;
        qf3 qf3Var = (i5 & 32) != 0 ? qf3.c : qf3.b;
        this.a = i3;
        this.b = i4;
        this.c = function1;
        this.d = function12;
        this.e = f;
        this.f = qf3Var;
    }

    public static rf3 valueOf(String str) {
        return (rf3) Enum.valueOf(rf3.class, str);
    }

    public static rf3[] values() {
        return (rf3[]) n.clone();
    }
}
