package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class gss {
    public static final gss a;
    public static final gss b;
    public static final gss c;
    public static final gss d;
    public static final gss e;
    public static final gss f;
    public static final gss g;
    public static final gss h;
    public static final /* synthetic */ gss[] i;

    static {
        gss gssVar = new gss("HE_AAC", 0);
        a = gssVar;
        gss gssVar2 = new gss(ScreenMirroringConfig.Audio.CODEC, 1);
        b = gssVar2;
        gss gssVar3 = new gss("MP3", 2);
        c = gssVar3;
        gss gssVar4 = new gss("FLAC", 3);
        d = gssVar4;
        gss gssVar5 = new gss("HE_AAC_MP4", 4);
        e = gssVar5;
        gss gssVar6 = new gss("AAC_MP4", 5);
        f = gssVar6;
        gss gssVar7 = new gss("FLAC_MP4", 6);
        g = gssVar7;
        gss gssVar8 = new gss("UNKNOWN", 7);
        h = gssVar8;
        i = new gss[]{gssVar, gssVar2, gssVar3, gssVar4, gssVar5, gssVar6, gssVar7, gssVar8};
    }

    public static gss valueOf(String str) {
        return (gss) Enum.valueOf(gss.class, str);
    }

    public static gss[] values() {
        return (gss[]) i.clone();
    }
}
