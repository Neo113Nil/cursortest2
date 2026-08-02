package defpackage;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;

/* loaded from: classes10.dex */
public abstract class rz6 {
    public static final l690 a;
    public static final l690 b;
    public static final float c;
    public static final float d;

    static {
        float f = rd5.a;
        float f2 = rd5.b;
        ShapeKeyTokens shapeKeyTokens = q27.a;
        a = new l690(f, 8.0f, f2, 8.0f);
        an91.c(16.0f, 8.0f, f2, 8.0f);
        b = new l690(12.0f, 8.0f, 12.0f, 8.0f);
        an91.c(12.0f, 8.0f, 16.0f, 8.0f);
        c = 58.0f;
        d = 40.0f;
        int i = n47.a;
        int i2 = i17.a;
        int i3 = e17.a;
        int i4 = m47.a;
    }

    public static hz6 a(long j, long j2, fid fidVar) {
        long j3 = ldc.m;
        return b((agc) ((bts) fidVar).m(dgc.a)).a(j, j2, j3, j3);
    }

    public static hz6 b(agc agcVar) {
        hz6 hz6Var = agcVar.W;
        if (hz6Var != null) {
            return hz6Var;
        }
        hz6 hz6Var2 = new hz6(dgc.c(agcVar, w3r.a), dgc.c(agcVar, w3r.g), ldc.b(dgc.c(agcVar, w3r.b), w3r.c, 0.0f, 0.0f, 0.0f, 14), ldc.b(dgc.c(agcVar, w3r.d), w3r.e, 0.0f, 0.0f, 0.0f, 14));
        agcVar.W = hz6Var2;
        return hz6Var2;
    }

    public static hz6 c(agc agcVar) {
        hz6 hz6Var = agcVar.X;
        if (hz6Var != null) {
            return hz6Var;
        }
        long j = ldc.l;
        hz6 hz6Var2 = new hz6(j, dgc.c(agcVar, ColorSchemeKeyTokens.Primary), j, ldc.b(dgc.c(agcVar, sky0.a), sky0.b, 0.0f, 0.0f, 0.0f, 14));
        agcVar.X = hz6Var2;
        return hz6Var2;
    }
}
