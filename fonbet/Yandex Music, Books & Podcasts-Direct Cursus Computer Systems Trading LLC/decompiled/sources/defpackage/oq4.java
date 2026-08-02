package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class oq4 {
    public static final x2i b;
    public static final List c;
    public static final oq4 d;
    public static final oq4 e;
    public static final oq4 f;
    public static final oq4 g;
    public static final oq4 h;
    public static final oq4 i;
    public static final oq4 j;
    public static final oq4 k;
    public static final /* synthetic */ oq4[] l;
    public static final /* synthetic */ rdb m;
    public final String a;

    static {
        oq4 oq4Var = new oq4("HE_AAC", 0, "he-aac");
        d = oq4Var;
        oq4 oq4Var2 = new oq4("MP3", 1, "mp3");
        e = oq4Var2;
        oq4 oq4Var3 = new oq4(ScreenMirroringConfig.Audio.CODEC, 2, "aac");
        f = oq4Var3;
        oq4 oq4Var4 = new oq4("FLAC", 3, "flac");
        g = oq4Var4;
        oq4 oq4Var5 = new oq4("HE_AAC_MP4", 4, "he-aac-mp4");
        h = oq4Var5;
        oq4 oq4Var6 = new oq4("AAC_MP4", 5, "aac-mp4");
        i = oq4Var6;
        oq4 oq4Var7 = new oq4("FLAC_MP4", 6, "flac-mp4");
        j = oq4Var7;
        oq4 oq4Var8 = new oq4("UNKNOWN", 7, "unknown");
        k = oq4Var8;
        oq4[] oq4VarArr = {oq4Var, oq4Var2, oq4Var3, oq4Var4, oq4Var5, oq4Var6, oq4Var7, oq4Var8};
        l = oq4VarArr;
        m = new rdb(oq4VarArr);
        b = new x2i(17);
        c = u75.h(oq4Var2, oq4Var, oq4Var3, oq4Var4, oq4Var5, oq4Var6, oq4Var7);
    }

    public oq4(String str, int i2, String str2) {
        this.a = str2;
    }

    public static oq4 valueOf(String str) {
        return (oq4) Enum.valueOf(oq4.class, str);
    }

    public static oq4[] values() {
        return (oq4[]) l.clone();
    }
}
