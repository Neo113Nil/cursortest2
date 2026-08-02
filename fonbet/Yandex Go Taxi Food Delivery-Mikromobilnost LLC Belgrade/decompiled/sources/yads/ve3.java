package yads;

import ru.CryptoPro.JCSP.Key.tls.TlsConstants;
import ru.yandex.video.m3.player.impl.tracking.data.DefaultErrorCategoryProvider;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ve3 {
    public static final ve3 b;
    public static final ve3 c;
    public static final ve3 d;
    public static final ve3 e;
    public static final ve3 f;
    public static final ve3 g;
    public static final ve3 h;
    public static final ve3 i;
    public static final ve3 j;
    public static final ve3 k;
    public static final /* synthetic */ ve3[] l;

    static {
        ve3 ve3Var = new ve3("INITIAL", 0);
        b = ve3Var;
        ve3 ve3Var2 = new ve3(DefaultErrorCategoryProvider.PREPARING, 1);
        c = ve3Var2;
        ve3 ve3Var3 = new ve3("PREPARED", 2);
        d = ve3Var3;
        ve3 ve3Var4 = new ve3("PLAYING", 3);
        e = ve3Var4;
        ve3 ve3Var5 = new ve3("STOPPED", 4);
        f = ve3Var5;
        ve3 ve3Var6 = new ve3(TlsConstants.TLS_FINISHED, 5);
        g = ve3Var6;
        ve3 ve3Var7 = new ve3("PAUSED", 6);
        h = ve3Var7;
        ve3 ve3Var8 = new ve3("BUFFERING", 7);
        i = ve3Var8;
        ve3 ve3Var9 = new ve3("PLAYING_ERROR", 8);
        j = ve3Var9;
        ve3 ve3Var10 = new ve3("PREPARING_ERROR", 9);
        k = ve3Var10;
        l = new ve3[]{ve3Var, ve3Var2, ve3Var3, ve3Var4, ve3Var5, ve3Var6, ve3Var7, ve3Var8, ve3Var9, ve3Var10};
    }

    public static ve3 valueOf(String str) {
        return (ve3) Enum.valueOf(ve3.class, str);
    }

    public static ve3[] values() {
        return (ve3[]) l.clone();
    }
}
