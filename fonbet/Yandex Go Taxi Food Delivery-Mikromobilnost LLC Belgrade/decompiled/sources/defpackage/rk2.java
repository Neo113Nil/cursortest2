package defpackage;

import com.yandex.mapkit.annotations.AnnotationLanguage;
import ru.CryptoPro.JCP.Util.ClearCryptoProPrefs;

/* loaded from: classes15.dex */
public final class rk2 {
    public final j5z a;
    public final bf50 b;

    public rk2(j5z j5zVar, bf50 bf50Var) {
        this.a = j5zVar;
        this.b = bf50Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final AnnotationLanguage a() {
        AnnotationLanguage annotationLanguage;
        String a = this.b.a();
        switch (a.hashCode()) {
            case 3121:
                if (a.equals("ar")) {
                    annotationLanguage = AnnotationLanguage.ARABIC;
                    break;
                }
                annotationLanguage = null;
                break;
            case 3129:
                if (a.equals("az")) {
                    annotationLanguage = AnnotationLanguage.AZERBAIJANI;
                    break;
                }
                annotationLanguage = null;
                break;
            case 3241:
                if (a.equals("en")) {
                    annotationLanguage = AnnotationLanguage.ENGLISH;
                    break;
                }
                annotationLanguage = null;
                break;
            case 3246:
                if (a.equals("es")) {
                    annotationLanguage = AnnotationLanguage.LATIN_AMERICAN_SPANISH;
                    break;
                }
                annotationLanguage = null;
                break;
            case 3247:
                if (a.equals("et")) {
                    annotationLanguage = AnnotationLanguage.ESTONIAN;
                    break;
                }
                annotationLanguage = null;
                break;
            case 3267:
                if (a.equals("fi")) {
                    annotationLanguage = AnnotationLanguage.FINNISH;
                    break;
                }
                annotationLanguage = null;
                break;
            case 3276:
                if (a.equals("fr")) {
                    annotationLanguage = AnnotationLanguage.FRENCH;
                    break;
                }
                annotationLanguage = null;
                break;
            case 3325:
                if (a.equals("he")) {
                    annotationLanguage = AnnotationLanguage.HEBREW;
                    break;
                }
                annotationLanguage = null;
                break;
            case 3345:
                if (a.equals("hy")) {
                    annotationLanguage = AnnotationLanguage.ARMENIAN;
                    break;
                }
                annotationLanguage = null;
                break;
            case 3414:
                if (a.equals("ka")) {
                    annotationLanguage = AnnotationLanguage.GEORGIAN;
                    break;
                }
                annotationLanguage = null;
                break;
            case 3424:
                if (a.equals("kk")) {
                    annotationLanguage = AnnotationLanguage.KAZAKH;
                    break;
                }
                annotationLanguage = null;
                break;
            case 3438:
                if (a.equals("ky")) {
                    annotationLanguage = AnnotationLanguage.KYRGYZ;
                    break;
                }
                annotationLanguage = null;
                break;
            case 3464:
                if (a.equals("lt")) {
                    annotationLanguage = AnnotationLanguage.LITHUANIAN;
                    break;
                }
                annotationLanguage = null;
                break;
            case 3466:
                if (a.equals("lv")) {
                    annotationLanguage = AnnotationLanguage.LATVIAN;
                    break;
                }
                annotationLanguage = null;
                break;
            case 3588:
                if (a.equals("pt")) {
                    annotationLanguage = AnnotationLanguage.PORTUGUESE;
                    break;
                }
                annotationLanguage = null;
                break;
            case 3645:
                if (a.equals("ro")) {
                    annotationLanguage = AnnotationLanguage.ROMANIAN;
                    break;
                }
                annotationLanguage = null;
                break;
            case 3651:
                if (a.equals(ClearCryptoProPrefs.COUNTRY)) {
                    annotationLanguage = AnnotationLanguage.RUSSIAN;
                    break;
                }
                annotationLanguage = null;
                break;
            case 3679:
                if (a.equals("sr")) {
                    annotationLanguage = AnnotationLanguage.SERBIAN;
                    break;
                }
                annotationLanguage = null;
                break;
            case 3710:
                if (a.equals("tr")) {
                    annotationLanguage = AnnotationLanguage.TURKISH;
                    break;
                }
                annotationLanguage = null;
                break;
            case 3734:
                if (a.equals("uk")) {
                    annotationLanguage = AnnotationLanguage.UKRAINIAN;
                    break;
                }
                annotationLanguage = null;
                break;
            case 3749:
                if (a.equals("uz")) {
                    annotationLanguage = AnnotationLanguage.UZBEK;
                    break;
                }
                annotationLanguage = null;
                break;
            default:
                annotationLanguage = null;
                break;
        }
        if (annotationLanguage != null) {
            return annotationLanguage;
        }
        j5z j5zVar = this.a;
        i5z a2 = j5zVar.a.a();
        i5z i5zVar = i5z.d;
        if (!jl40.l(a2, i5zVar) && !jl40.l(a2, i5z.e) && !jl40.l(a2, i5z.s) && !jl40.l(a2, i5z.y) && !jl40.l(a2, i5z.i) && !jl40.l(a2, i5z.u) && !jl40.l(a2, i5z.q) && !jl40.l(a2, i5z.n) && !jl40.l(a2, i5z.t) && !jl40.l(a2, i5z.k) && !jl40.l(a2, i5z.m) && !jl40.l(a2, i5z.g) && !jl40.l(a2, i5z.r) && !jl40.l(a2, i5z.p) && !jl40.l(a2, i5z.h) && !jl40.l(a2, i5z.o) && !jl40.l(a2, i5z.f) && !jl40.l(a2, i5z.j) && !jl40.l(a2, i5z.z) && !jl40.l(a2, i5z.w) && !jl40.l(a2, i5z.x)) {
            return null;
        }
        i5z a3 = j5zVar.a.a();
        return jl40.l(a3, i5zVar) ? AnnotationLanguage.RUSSIAN : jl40.l(a3, i5z.e) ? AnnotationLanguage.ENGLISH : jl40.l(a3, i5z.s) ? AnnotationLanguage.FRENCH : jl40.l(a3, i5z.y) ? AnnotationLanguage.TURKISH : jl40.l(a3, i5z.i) ? AnnotationLanguage.UKRAINIAN : jl40.l(a3, i5z.u) ? AnnotationLanguage.HEBREW : jl40.l(a3, i5z.q) ? AnnotationLanguage.SERBIAN : jl40.l(a3, i5z.n) ? AnnotationLanguage.LATVIAN : jl40.l(a3, i5z.t) ? AnnotationLanguage.FINNISH : jl40.l(a3, i5z.k) ? AnnotationLanguage.ROMANIAN : jl40.l(a3, i5z.m) ? AnnotationLanguage.KYRGYZ : jl40.l(a3, i5z.g) ? AnnotationLanguage.KAZAKH : jl40.l(a3, i5z.r) ? AnnotationLanguage.LITHUANIAN : jl40.l(a3, i5z.p) ? AnnotationLanguage.ESTONIAN : jl40.l(a3, i5z.h) ? AnnotationLanguage.GEORGIAN : jl40.l(a3, i5z.o) ? AnnotationLanguage.UZBEK : jl40.l(a3, i5z.f) ? AnnotationLanguage.ARMENIAN : jl40.l(a3, i5z.j) ? AnnotationLanguage.AZERBAIJANI : jl40.l(a3, i5z.z) ? AnnotationLanguage.ARABIC : jl40.l(a3, i5z.w) ? AnnotationLanguage.PORTUGUESE : jl40.l(a3, i5z.x) ? AnnotationLanguage.LATIN_AMERICAN_SPANISH : AnnotationLanguage.ENGLISH;
    }
}
