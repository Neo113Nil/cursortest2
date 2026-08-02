package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.RemoteViews;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.data.audio.Album$AlbumType;
import ru.yandex.music.data.audio.WarningContent;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.video.m3.ott.data.dto.VhVideoData;
import ru.yandex.video.m3.ott.data.dto.c;
import ru.yandex.video.m3.preload_manager.QualityInfo;

/* loaded from: classes3.dex */
public abstract class p1g {
    public static String A(nn3 nn3Var) {
        StringBuilder sb = new StringBuilder(nn3Var.size());
        for (int i = 0; i < nn3Var.size(); i++) {
            byte a = nn3Var.a(i);
            if (a == 34) {
                sb.append("\\\"");
            } else if (a == 39) {
                sb.append("\\'");
            } else if (a != 92) {
                switch (a) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a < 32 || a > 126) {
                            sb.append('\\');
                            sb.append((char) (((a >>> 6) & 3) + 48));
                            sb.append((char) (((a >>> 3) & 7) + 48));
                            sb.append((char) ((a & 7) + 48));
                            break;
                        } else {
                            sb.append((char) a);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final String B(yxl yxlVar) {
        if (yxlVar instanceof qxl) {
            return "action_button_block";
        }
        if (yxlVar instanceof xxl) {
            xxl xxlVar = (xxl) yxlVar;
            if (xxlVar instanceof uxl) {
                return "no_tracks_block";
            }
            if (xxlVar instanceof vxl) {
                return "track_filters_block";
            }
            if (xxlVar instanceof wxl) {
                return "track_simple_block";
            }
            b6e.s();
            return null;
        }
        if (yxlVar.equals(pxl.a)) {
            return "add_tracks_button_block";
        }
        if (yxlVar instanceof sxl) {
            return "similar_entities_block";
        }
        if (yxlVar instanceof txl) {
            return "playlist_similar_block";
        }
        if (yxlVar.equals(rxl.a)) {
            return "offline_stub_block";
        }
        b6e.s();
        return null;
    }

    public static final int C(long j, cds cdsVar) {
        int i = (int) (4294967295L & j);
        if (Float.intBitsToFloat(i) <= 0.0f) {
            return 0;
        }
        float intBitsToFloat = Float.intBitsToFloat(i);
        ogi ogiVar = cdsVar.b;
        return intBitsToFloat >= ogiVar.e ? cdsVar.a.a.b.length() : ogiVar.i(j);
    }

    public static b1v D(int i) {
        Object obj;
        b1v b1vVar;
        float[] fArr = new float[3];
        aa5.h(i, fArr);
        s1v.d.getClass();
        if (fArr[1] == 0.0f) {
            float f = fArr[2];
            return (0.0f > f || f > 0.21f) ? (0.22f > f || f > 0.31f) ? (0.32f > f || f > 0.41f) ? (0.42f > f || f > 0.51f) ? (0.52f > f || f > 1.0f) ? s1v.g.c : s1v.f.c : s1v.i.c : s1v.e.c : s1v.g.c : s1v.h.c;
        }
        int b = eeh.b(fArr[0]);
        Iterator it = s1v.k.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            s1v s1vVar = (s1v) obj;
            int i2 = s1vVar.a;
            int i3 = s1vVar.b;
            if (i2 <= i3) {
                if (i2 <= b && b <= i3) {
                    break;
                }
            } else if (i3 > b || b > i2) {
                break;
            }
        }
        s1v s1vVar2 = (s1v) obj;
        return (s1vVar2 == null || (b1vVar = s1vVar2.c) == null) ? s1v.g.c : b1vVar;
    }

    public static final vwg E(vwg vwgVar) {
        mpf mpfVar = vwgVar.l.l;
        while (true) {
            mpf u = mpfVar.u();
            mpf mpfVar2 = null;
            if ((u != null ? u.h : null) == null) {
                vwg Z0 = ((f8j) mpfVar.F.d).Z0();
                Z0.getClass();
                return Z0;
            }
            mpf u2 = mpfVar.u();
            if (u2 != null) {
                mpfVar2 = u2.h;
            }
            mpfVar2.getClass();
            mpf u3 = mpfVar.u();
            u3.getClass();
            mpfVar = u3.h;
            mpfVar.getClass();
        }
    }

    public static int[] F(String str) {
        int i;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i2 = indexOf4 + 2;
        if (i2 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i2) == '/') {
            i = str.indexOf(47, indexOf4 + 3);
            if (i == -1 || i > indexOf2) {
                i = indexOf2;
            }
        } else {
            i = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static final boolean G(hq5 hq5Var) {
        return !Intrinsics.d(((oq5) hq5Var).j(t8r.a), imr.a);
    }

    public static String H(ct7 ct7Var, e3t e3tVar) {
        String str;
        qah qahVar;
        int i;
        String str2;
        ct7Var.getClass();
        e3tVar.getClass();
        qah qahVar2 = ct7Var.c;
        if (qahVar2 != null) {
            StringBuilder sb = new StringBuilder("tracks [");
            int i2 = qahVar2.a;
            int i3 = 0;
            while (i3 < i2) {
                yvs yvsVar = qahVar2.c[i3];
                yvsVar.getClass();
                int i4 = yvsVar.a;
                yde ydeVar = e3tVar.a;
                ydeVar.getClass();
                if (i4 > 0) {
                    sb.append("\n  Renderer:" + i3 + " [");
                    int i5 = 0;
                    while (i5 < i4) {
                        sb.append("\n    Group:" + i5 + ", [");
                        Object obj = ydeVar.get(i5);
                        obj.getClass();
                        d3t d3tVar = (d3t) obj;
                        int i6 = d3tVar.a;
                        int i7 = 0;
                        while (i7 < i6) {
                            String str3 = d3tVar.e[i7] ? "[X]" : "[ ]";
                            int i8 = qahVar2.e[i3][i5][i7] & 7;
                            if (i8 == 0) {
                                str2 = "NO";
                            } else if (i8 == 1) {
                                str2 = "NO_UNSUPPORTED_TYPE";
                            } else if (i8 == 2) {
                                str2 = "NO_UNSUPPORTED_DRM";
                            } else if (i8 == 3) {
                                str2 = "NO_EXCEEDS_CAPABILITIES";
                            } else {
                                if (i8 != 4) {
                                    e7o.n();
                                    return null;
                                }
                                str2 = "YES";
                            }
                            StringBuilder l = f1d.l(i7, "\n      ", str3, " Track:", ", ");
                            l.append(dsc.c(d3tVar.a(i7)));
                            l.append(", supported=");
                            l.append(str2);
                            u2i u2iVar = d3tVar.a(i7).l;
                            StringBuilder sb2 = new StringBuilder();
                            if (u2iVar != null) {
                                n2i[] n2iVarArr = u2iVar.a;
                                if (n2iVarArr.length > 0) {
                                    sb2.append(", metadata=");
                                }
                                int length = n2iVarArr.length;
                                int i9 = 0;
                                while (i9 < length) {
                                    sb2.append("  " + n2iVarArr[i9]);
                                    i9++;
                                    qahVar2 = qahVar2;
                                    i2 = i2;
                                }
                            }
                            l.append(sb2.toString());
                            sb.append(l.toString());
                            i7++;
                            qahVar2 = qahVar2;
                            i2 = i2;
                        }
                        sb.append("\n    ]");
                        i5++;
                        qahVar2 = qahVar2;
                    }
                    qahVar = qahVar2;
                    i = i2;
                    sb.append("\n  ]");
                } else {
                    qahVar = qahVar2;
                    i = i2;
                }
                i3++;
                qahVar2 = qahVar;
                i2 = i;
            }
            str = sb.toString();
        } else {
            str = null;
        }
        return str == null ? "tracks []" : str;
    }

    public static final void I(vuf vufVar, ArrayList arrayList, u0s u0sVar, Function0 function0, s3e s3eVar, Function2 function2, long j, ryc rycVar) {
        vufVar.Z(arrayList.size(), new afg(18, new d6h(16), arrayList), new vv(arrayList, 29), new wn5(new jyl(arrayList, u0sVar, s3eVar, function0, function2, rycVar, j), -1091073711, true));
    }

    public static void J(gc8 gc8Var, gc8 gc8Var2) {
        int i = 0;
        while (true) {
            if (!(i < gc8Var.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = gc8Var.getChildAt(i);
            if (childAt == null) {
                rj7.m();
                return;
            } else {
                yd5.R(gc8Var2.getReleaseViewVisitor$div_release(), childAt);
                i = i2;
            }
        }
    }

    public static final clu K(int i, elu eluVar, hq5 hq5Var, int i2) {
        p85 p85Var;
        int U;
        clu cluVar;
        eluVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        boolean g = ((ma5) oq5Var.j(pa5.a)).g();
        boolean g2 = ((((i2 & 112) ^ 48) > 32 && oq5Var.d(eluVar.ordinal())) || (i2 & 48) == 32) | ((((i2 & 14) ^ 6) > 4 && oq5Var.d(i)) || (i2 & 6) == 4) | oq5Var.g(!g);
        Object K = oq5Var.K();
        if (g2 || K == gq5.a) {
            if (eluVar == elu.e) {
                p85 b0 = pd.b0(c3x.f(i));
                float f = b0.a;
                float f2 = b0.c;
                float f3 = b0.b;
                if (g) {
                    float c = yhn.c(f3 - 0.02f, 0.5f, 1.0f);
                    float c2 = yhn.c(0.43f + f2, 0.8f, 0.95f);
                    int i3 = d85.o;
                    cluVar = new clu(c3x.U(mvt.z(f, c, c2, 1.0f, 16)), c3x.U(mvt.z(f, c, yhn.c(0.05f + f2, 0.45f, 0.75f), 1.0f, 16)), c3x.U(mvt.z(f, c, yhn.c(f2, 0.35f, 0.55f), 1.0f, 16)));
                } else {
                    float c3 = yhn.c(f3 + 0.05f, 0.5f, 1.0f);
                    float c4 = yhn.c(f2 - 0.4f, 0.12f, 0.25f);
                    int i4 = d85.o;
                    cluVar = new clu(c3x.U(mvt.z(f, c3, c4, 1.0f, 16)), c3x.U(mvt.z(f, c3, yhn.c(f2 - 0.05f, 0.45f, 0.6f), 1.0f, 16)), c3x.U(mvt.z(f, c3, yhn.c(f2 + 0.35f, 0.8f, 0.9f), 1.0f, 16)));
                }
                K = cluVar;
            } else {
                long f4 = c3x.f(i);
                p85 b02 = pd.b0(f4);
                if (b02.b > 0.12f) {
                    U = D(c3x.U(f4)).a;
                } else {
                    boolean z = b02.c > 0.35f;
                    if (z) {
                        p85Var = new p85(0.1f, 0.65f);
                    } else {
                        if (z) {
                            b6e.s();
                            return null;
                        }
                        p85Var = new p85(0.15f, 0.2f);
                    }
                    U = c3x.U(p85Var.b());
                }
                int U2 = c3x.U(d85.n);
                K = new clu(U, U2, U2);
            }
            oq5Var.k0(K);
        }
        return (clu) K;
    }

    public static String L(StringBuilder sb, int i, int i2) {
        int i3;
        int i4;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i5 = i;
        int i6 = i5;
        while (i5 <= i2) {
            if (i5 == i2) {
                i3 = i5;
            } else if (sb.charAt(i5) == '/') {
                i3 = i5 + 1;
            } else {
                i5++;
            }
            int i7 = i6 + 1;
            if (i5 == i7 && sb.charAt(i6) == '.') {
                sb.delete(i6, i3);
                i2 -= i3 - i6;
            } else {
                if (i5 == i6 + 2 && sb.charAt(i6) == '.' && sb.charAt(i7) == '.') {
                    i4 = sb.lastIndexOf("/", i6 - 2) + 1;
                    int i8 = i4 > i ? i4 : i;
                    sb.delete(i8, i3);
                    i2 -= i3 - i8;
                } else {
                    i4 = i5 + 1;
                }
                i6 = i4;
            }
            i5 = i6;
        }
        return sb.toString();
    }

    public static String M(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] F = F(str2);
        if (F[0] != -1) {
            sb.append(str2);
            L(sb, F[1], F[2]);
            return sb.toString();
        }
        int[] F2 = F(str);
        if (F[3] == 0) {
            sb.append((CharSequence) str, 0, F2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (F[2] == 0) {
            sb.append((CharSequence) str, 0, F2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i = F[1];
        if (i != 0) {
            int i2 = F2[0] + 1;
            sb.append((CharSequence) str, 0, i2);
            sb.append(str2);
            return L(sb, F[1] + i2, i2 + F[2]);
        }
        if (str2.charAt(i) == '/') {
            sb.append((CharSequence) str, 0, F2[1]);
            sb.append(str2);
            int i3 = F2[1];
            return L(sb, i3, F[2] + i3);
        }
        int i4 = F2[0] + 2;
        int i5 = F2[1];
        if (i4 >= i5 || i5 != F2[2]) {
            int lastIndexOf = str.lastIndexOf(47, F2[2] - 1);
            int i6 = lastIndexOf == -1 ? F2[1] : lastIndexOf + 1;
            sb.append((CharSequence) str, 0, i6);
            sb.append(str2);
            return L(sb, F2[1], i6 + F[2]);
        }
        sb.append((CharSequence) str, 0, i5);
        sb.append('/');
        sb.append(str2);
        int i7 = F2[1];
        return L(sb, i7, F[2] + i7 + 1);
    }

    public static Uri N(String str, String str2) {
        return Uri.parse(M(str, str2));
    }

    public static final ikm O(kjm kjmVar) {
        Album$AlbumType album$AlbumType;
        String uri;
        kjmVar.getClass();
        List list = kjmVar.a;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ghh.L((ljm) it.next()));
        }
        String str = kjmVar.b;
        switch (kjmVar.d().ordinal()) {
            case 0:
                album$AlbumType = Album$AlbumType.COMMON;
                break;
            case 1:
                album$AlbumType = Album$AlbumType.COMPILATION;
                break;
            case 2:
                album$AlbumType = Album$AlbumType.SINGLE;
                break;
            case 3:
                album$AlbumType = Album$AlbumType.PODCAST;
                break;
            case 4:
                album$AlbumType = Album$AlbumType.ASMR;
                break;
            case 5:
                album$AlbumType = Album$AlbumType.NOISE;
                break;
            case 6:
                album$AlbumType = Album$AlbumType.RADIO_RECORD;
                break;
            case 7:
                album$AlbumType = Album$AlbumType.FAIRY_TALE;
                break;
            case 8:
                album$AlbumType = Album$AlbumType.AUDIOBOOK;
                break;
            default:
                b6e.s();
                return null;
        }
        Album$AlbumType album$AlbumType2 = album$AlbumType;
        String str2 = kjmVar.f;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        WarningContent warningContent = kjmVar.h;
        CoverPath coverPath = kjmVar.e;
        u9b u9bVar = (coverPath == null || (uri = coverPath.getUri()) == null) ? null : new u9b(uri, null, null);
        zjm zjmVar = kjmVar.k;
        return new ikm(arrayList, new lt(str, album$AlbumType2, str3, warningContent, u9bVar, zjmVar != null ? new gd6((List) zjmVar.d.getValue(), (List) zjmVar.c.getValue(), zjmVar.b) : null), kjmVar.c);
    }

    public static g3v P(String str, boolean z) {
        return new g3v(m3v.d, str, z);
    }

    public static final z1p Q(n5p n5pVar) {
        l18 l18Var = l18.b;
        if (n5pVar instanceof j5p) {
            oq oqVar = ((j5p) n5pVar).b;
            bdt I = hag.I(y8s.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            y8s y8sVar = (y8s) qdcVar.C(I);
            String str = oqVar.a;
            str.getClass();
            Object orDefault = y8sVar.d.getOrDefault(str, c5b.a);
            orDefault.getClass();
            return new u1p(oqVar, (List) orDefault);
        }
        if (n5pVar instanceof m5p) {
            cvl cvlVar = ((m5p) n5pVar).b;
            if (ivf.I(cvlVar)) {
                return new x1p(cvlVar);
            }
            bdt I2 = hag.I(y8s.class);
            qdc qdcVar2 = l18Var.a;
            qdcVar2.getClass();
            y8s y8sVar2 = (y8s) qdcVar2.C(I2);
            Object orDefault2 = y8sVar2.e.getOrDefault(cvlVar.e(), c5b.a);
            orDefault2.getClass();
            return new y1p(cvlVar, (List) orDefault2);
        }
        if (n5pVar instanceof k5p) {
            return new v1p(((k5p) n5pVar).b);
        }
        if (!(n5pVar instanceof l5p)) {
            b6e.s();
            return null;
        }
        l5p l5pVar = (l5p) n5pVar;
        p0p p0pVar = l5pVar.b;
        c0p c0pVar = l5pVar.c;
        switch (p0pVar.ordinal()) {
            case 0:
                if (c0pVar == c0p.c) {
                    return w1p.c;
                }
                return null;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                return null;
            case 15:
                return w1p.b;
            case 16:
                return w1p.d;
            case 17:
                return w1p.e;
            default:
                b6e.s();
                return null;
        }
    }

    public static /* synthetic */ boolean R(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, tjx tjxVar, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(tjxVar, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(tjxVar) != obj && atomicReferenceFieldUpdater.get(tjxVar) != obj) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(Object obj, String str, yci yciVar, Function1 function1, Function1 function12, g40 g40Var, jd6 jd6Var, float f, m85 m85Var, int i, hq5 hq5Var, int i2, int i3) {
        int i4;
        Function1 function13;
        int i5;
        g40 g40Var2;
        int i6;
        jd6 jd6Var2;
        int i7;
        int i8;
        int i9;
        float f2;
        m85 m85Var2;
        Function1 function14;
        int i10;
        Function1 function15;
        Function1 function16;
        jd6 jd6Var3;
        float f3;
        m85 m85Var3;
        int i11;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(600850889);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.h(obj) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.f(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= 1024;
        }
        int i12 = i3 & 16;
        if (i12 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            function13 = function12;
            i4 |= oq5Var.h(function13) ? 16384 : RemoteCameraConfig.Notification.ID;
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= 196608;
            } else if ((196608 & i2) == 0) {
                g40Var2 = g40Var;
                i4 |= oq5Var.f(g40Var2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
                } else if ((1572864 & i2) == 0) {
                    jd6Var2 = jd6Var;
                    i4 |= oq5Var.f(jd6Var2) ? 1048576 : 524288;
                    i7 = 12582912 | i4;
                    i8 = i3 & 256;
                    if (i8 == 0) {
                        i7 = 113246208 | i4;
                    } else if ((100663296 & i2) == 0) {
                        i7 |= oq5Var.f(m85Var) ? 67108864 : 33554432;
                        if ((805306368 & i2) == 0) {
                            i7 |= 268435456;
                        }
                        if ((306783379 & i7) == 306783378 || !oq5Var.z()) {
                            oq5Var.U();
                            if ((i2 & 1) != 0 || oq5Var.y()) {
                                rq1 rq1Var = rq1.u;
                                if (i12 != 0) {
                                    function13 = null;
                                }
                                if (i5 != 0) {
                                    g40Var2 = b2c.f;
                                }
                                if (i6 != 0) {
                                    jd6Var2 = hd6.b;
                                }
                                i9 = 1;
                                f2 = 1.0f;
                                m85Var2 = i8 == 0 ? m85Var : null;
                                function14 = rq1Var;
                                i10 = i7 & (-1879055361);
                            } else {
                                oq5Var.S();
                                i10 = i7 & (-1879055361);
                                function14 = function1;
                                f2 = f;
                                m85Var2 = m85Var;
                                i9 = i;
                            }
                            Function1 function17 = function13;
                            g40 g40Var3 = g40Var2;
                            jd6 jd6Var4 = jd6Var2;
                            oq5Var.q();
                            if (G(oq5Var)) {
                                oq5Var.Z(-1474399548);
                                float f4 = f2;
                                m85 m85Var4 = m85Var2;
                                int i13 = i9;
                                saf.u(obj, str, yciVar, function14, function17, g40Var3, jd6Var4, f4, m85Var4, i13, oq5Var, i10 & 2147483646);
                                i9 = i13;
                                m85Var2 = m85Var4;
                                f2 = f4;
                                jd6Var4 = jd6Var4;
                                g40Var3 = g40Var3;
                                oq5Var.p(false);
                            } else {
                                oq5Var.Z(-1473989976);
                                int i14 = i10 & 126;
                                int i15 = i10 << 3;
                                Function1 function18 = function14;
                                h4a.b(obj, str, (cce) oq5Var.j(tkg.a), yciVar, function18, function17, g40Var3, jd6Var4, f2, m85Var2, i9, oq5Var, i14 | (i15 & 7168) | (458752 & i15) | (3670016 & i15) | (29360128 & i15) | (234881024 & i15) | (i15 & 1879048192), 0);
                                function14 = function18;
                                function17 = function17;
                                oq5Var.p(false);
                            }
                            function15 = function14;
                            function16 = function17;
                            g40Var2 = g40Var3;
                            jd6Var3 = jd6Var4;
                            f3 = f2;
                            m85Var3 = m85Var2;
                            i11 = i9;
                        } else {
                            oq5Var.S();
                            m85Var3 = m85Var;
                            i11 = i;
                            function16 = function13;
                            jd6Var3 = jd6Var2;
                            function15 = function1;
                            f3 = f;
                        }
                        r = oq5Var.r();
                        if (r != null) {
                            r.d = new np5(obj, str, yciVar, function15, function16, g40Var2, jd6Var3, f3, m85Var3, i11, i2, i3);
                            return;
                        }
                        return;
                    }
                    if ((805306368 & i2) == 0) {
                    }
                    if ((306783379 & i7) == 306783378) {
                    }
                    oq5Var.U();
                    if ((i2 & 1) != 0) {
                    }
                    rq1 rq1Var2 = rq1.u;
                    if (i12 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    i9 = 1;
                    f2 = 1.0f;
                    m85Var2 = i8 == 0 ? m85Var : null;
                    function14 = rq1Var2;
                    i10 = i7 & (-1879055361);
                    Function1 function172 = function13;
                    g40 g40Var32 = g40Var2;
                    jd6 jd6Var42 = jd6Var2;
                    oq5Var.q();
                    if (G(oq5Var)) {
                    }
                    function15 = function14;
                    function16 = function172;
                    g40Var2 = g40Var32;
                    jd6Var3 = jd6Var42;
                    f3 = f2;
                    m85Var3 = m85Var2;
                    i11 = i9;
                    r = oq5Var.r();
                    if (r != null) {
                    }
                }
                jd6Var2 = jd6Var;
                i7 = 12582912 | i4;
                i8 = i3 & 256;
                if (i8 == 0) {
                }
                if ((805306368 & i2) == 0) {
                }
                if ((306783379 & i7) == 306783378) {
                }
                oq5Var.U();
                if ((i2 & 1) != 0) {
                }
                rq1 rq1Var22 = rq1.u;
                if (i12 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                i9 = 1;
                f2 = 1.0f;
                m85Var2 = i8 == 0 ? m85Var : null;
                function14 = rq1Var22;
                i10 = i7 & (-1879055361);
                Function1 function1722 = function13;
                g40 g40Var322 = g40Var2;
                jd6 jd6Var422 = jd6Var2;
                oq5Var.q();
                if (G(oq5Var)) {
                }
                function15 = function14;
                function16 = function1722;
                g40Var2 = g40Var322;
                jd6Var3 = jd6Var422;
                f3 = f2;
                m85Var3 = m85Var2;
                i11 = i9;
                r = oq5Var.r();
                if (r != null) {
                }
            }
            g40Var2 = g40Var;
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            jd6Var2 = jd6Var;
            i7 = 12582912 | i4;
            i8 = i3 & 256;
            if (i8 == 0) {
            }
            if ((805306368 & i2) == 0) {
            }
            if ((306783379 & i7) == 306783378) {
            }
            oq5Var.U();
            if ((i2 & 1) != 0) {
            }
            rq1 rq1Var222 = rq1.u;
            if (i12 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            i9 = 1;
            f2 = 1.0f;
            m85Var2 = i8 == 0 ? m85Var : null;
            function14 = rq1Var222;
            i10 = i7 & (-1879055361);
            Function1 function17222 = function13;
            g40 g40Var3222 = g40Var2;
            jd6 jd6Var4222 = jd6Var2;
            oq5Var.q();
            if (G(oq5Var)) {
            }
            function15 = function14;
            function16 = function17222;
            g40Var2 = g40Var3222;
            jd6Var3 = jd6Var4222;
            f3 = f2;
            m85Var3 = m85Var2;
            i11 = i9;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        function13 = function12;
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        g40Var2 = g40Var;
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        jd6Var2 = jd6Var;
        i7 = 12582912 | i4;
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        if ((805306368 & i2) == 0) {
        }
        if ((306783379 & i7) == 306783378) {
        }
        oq5Var.U();
        if ((i2 & 1) != 0) {
        }
        rq1 rq1Var2222 = rq1.u;
        if (i12 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        i9 = 1;
        f2 = 1.0f;
        m85Var2 = i8 == 0 ? m85Var : null;
        function14 = rq1Var2222;
        i10 = i7 & (-1879055361);
        Function1 function172222 = function13;
        g40 g40Var32222 = g40Var2;
        jd6 jd6Var42222 = jd6Var2;
        oq5Var.q();
        if (G(oq5Var)) {
        }
        function15 = function14;
        function16 = function172222;
        g40Var2 = g40Var32222;
        jd6Var3 = jd6Var42222;
        f3 = f2;
        m85Var3 = m85Var2;
        i11 = i9;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final Object obj, final String str, yci yciVar, final w4k w4kVar, w4k w4kVar2, w4k w4kVar3, g40 g40Var, jd6 jd6Var, float f, int i, hq5 hq5Var, final int i2, final int i3, final int i4) {
        yci yciVar2;
        int i5;
        w4k w4kVar4;
        int i6;
        w4k w4kVar5;
        int i7;
        int i8;
        int i9;
        jd6 jd6Var2;
        int i10;
        int i11;
        yci yciVar3;
        int i12;
        w4k w4kVar6;
        w4k w4kVar7;
        float f2;
        int i13;
        jd6 jd6Var3;
        g40 g40Var2;
        final yci yciVar4;
        oq5 oq5Var;
        final w4k w4kVar8;
        final int i14;
        final float f3;
        final jd6 jd6Var4;
        final g40 g40Var3;
        final w4k w4kVar9;
        xmn r;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1772583187);
        int i15 = i2 | (oq5Var2.h(obj) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i15 |= oq5Var2.f(str) ? 32 : 16;
        }
        int i16 = i4 & 4;
        if (i16 != 0) {
            i5 = i15 | 384;
            yciVar2 = yciVar;
        } else {
            yciVar2 = yciVar;
            i5 = i15 | (oq5Var2.f(yciVar2) ? 256 : 128);
        }
        int i17 = i5 | (oq5Var2.h(w4kVar) ? 2048 : 1024);
        int i18 = i4 & 16;
        if (i18 != 0) {
            i6 = i17 | 24576;
            w4kVar4 = w4kVar2;
        } else {
            w4kVar4 = w4kVar2;
            i6 = i17 | (oq5Var2.h(w4kVar4) ? 16384 : RemoteCameraConfig.Notification.ID);
        }
        if ((i4 & 32) == 0) {
            w4kVar5 = w4kVar3;
            if (oq5Var2.h(w4kVar5)) {
                i7 = SQLiteDatabase.OPEN_SHAREDCACHE;
                i8 = i6 | i7 | 920125440;
                i9 = i4 & 1024;
                if (i9 == 0) {
                    i10 = 6;
                    jd6Var2 = jd6Var;
                } else if ((i3 & 6) == 0) {
                    jd6Var2 = jd6Var;
                    i10 = i3 | (oq5Var2.f(jd6Var2) ? 4 : 2);
                } else {
                    jd6Var2 = jd6Var;
                    i10 = i3;
                }
                i11 = i10 | 1456;
                if ((306783379 & i8) != 306783378 && (i11 & 1171) == 1170 && oq5Var2.z()) {
                    oq5Var2.S();
                    f3 = f;
                    yciVar4 = yciVar2;
                    w4kVar8 = w4kVar4;
                    w4kVar9 = w4kVar5;
                    oq5Var = oq5Var2;
                    jd6Var4 = jd6Var2;
                    g40Var3 = g40Var;
                    i14 = i;
                } else {
                    oq5Var2.U();
                    if ((i2 & 1) != 0 || oq5Var2.y()) {
                        yciVar3 = i16 == 0 ? vci.a : yciVar2;
                        w4k w4kVar10 = i18 == 0 ? null : w4kVar4;
                        if ((i4 & 32) != 0) {
                            i8 &= -458753;
                            w4kVar5 = w4kVar10;
                        }
                        iz2 iz2Var = b2c.f;
                        jd6 jd6Var5 = i9 == 0 ? hd6.b : jd6Var2;
                        i12 = i11 & (-7169);
                        w4kVar6 = w4kVar10;
                        w4kVar7 = w4kVar5;
                        f2 = 1.0f;
                        i13 = 1;
                        jd6Var3 = jd6Var5;
                        g40Var2 = iz2Var;
                    } else {
                        oq5Var2.S();
                        if ((i4 & 32) != 0) {
                            i8 &= -458753;
                        }
                        i12 = i11 & (-7169);
                        g40Var2 = g40Var;
                        i13 = i;
                        yciVar3 = yciVar2;
                        w4kVar6 = w4kVar4;
                        w4kVar7 = w4kVar5;
                        jd6Var3 = jd6Var2;
                        f2 = f;
                    }
                    oq5Var2.q();
                    if (G(oq5Var2)) {
                        oq5Var2.Z(403969048);
                        int i19 = i8 & 126;
                        int i20 = i8 << 3;
                        h4a.c(obj, str, (cce) oq5Var2.j(tkg.a), yciVar3, w4kVar, w4kVar6, w4kVar7, null, null, null, g40Var2, jd6Var3, f2, i13, oq5Var2, (i20 & 3670016) | i19 | (i20 & 7168) | (57344 & i20) | (458752 & i20) | 918552576, ((i12 << 3) & 112) | 3462);
                        oq5Var2.p(false);
                    } else {
                        oq5Var2.Z(403426548);
                        saf.v(obj, str, yciVar3, w4kVar, w4kVar6, w4kVar7, g40Var2, jd6Var3, f2, i13, oq5Var2, i8 & 2147483646, i12 & 8190);
                        oq5Var2.p(false);
                    }
                    yciVar4 = yciVar3;
                    oq5Var = oq5Var2;
                    w4kVar8 = w4kVar6;
                    i14 = i13;
                    f3 = f2;
                    jd6Var4 = jd6Var3;
                    g40Var3 = g40Var2;
                    w4kVar9 = w4kVar7;
                }
                r = oq5Var.r();
                if (r == null) {
                    r.d = new Function2() { // from class: cmq
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            p1g.b(obj, str, yciVar4, w4kVar, w4kVar8, w4kVar9, g40Var3, jd6Var4, f3, i14, (hq5) obj2, rvf.R(i2 | 1), rvf.R(i3), i4);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
        } else {
            w4kVar5 = w4kVar3;
        }
        i7 = SQLiteDatabase.OPEN_FULLMUTEX;
        i8 = i6 | i7 | 920125440;
        i9 = i4 & 1024;
        if (i9 == 0) {
        }
        i11 = i10 | 1456;
        if ((306783379 & i8) != 306783378) {
        }
        oq5Var2.U();
        if ((i2 & 1) != 0) {
        }
        if (i16 == 0) {
        }
        if (i18 == 0) {
        }
        if ((i4 & 32) != 0) {
        }
        iz2 iz2Var2 = b2c.f;
        if (i9 == 0) {
        }
        i12 = i11 & (-7169);
        w4kVar6 = w4kVar10;
        w4kVar7 = w4kVar5;
        f2 = 1.0f;
        i13 = 1;
        jd6Var3 = jd6Var5;
        g40Var2 = iz2Var2;
        oq5Var2.q();
        if (G(oq5Var2)) {
        }
        yciVar4 = yciVar3;
        oq5Var = oq5Var2;
        w4kVar8 = w4kVar6;
        i14 = i13;
        f3 = f2;
        jd6Var4 = jd6Var3;
        g40Var3 = g40Var2;
        w4kVar9 = w4kVar7;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(Function0 function0, v1g v1gVar, w3g w3gVar, yci yciVar, boolean z, Function0 function02, hq5 hq5Var, int i, int i2) {
        int i3;
        boolean z2;
        Function0 function03;
        boolean z3;
        xmn r;
        function0.getClass();
        w3gVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(582192931);
        if ((i & 6) == 0) {
            i3 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? oq5Var.f(v1gVar) : oq5Var.h(v1gVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var.f(w3gVar) : oq5Var.h(w3gVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            z2 = z;
            i3 |= oq5Var.g(z2) ? 16384 : RemoteCameraConfig.Notification.ID;
            if ((196608 & i) != 0) {
                function03 = function02;
                i3 |= oq5Var.h(function03) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            } else {
                function03 = function02;
            }
            if (oq5Var.P(i3 & 1, (74899 & i3) == 74898)) {
                oq5Var.S();
                z3 = z2;
            } else {
                boolean z4 = i4 != 0 ? false : z2;
                u1g.c(function0, v1gVar, w3gVar, yciVar, z4, null, null, function03, oq5Var, (65534 & i3) | ((i3 << 6) & 29360128), 96);
                z3 = z4;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new o1g(function0, v1gVar, w3gVar, yciVar, z3, function02, i, i2, 0);
                return;
            }
            return;
        }
        z2 = z;
        if ((196608 & i) != 0) {
        }
        if (oq5Var.P(i3 & 1, (74899 & i3) == 74898)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void d(l9j l9jVar, int i, hq5 hq5Var, int i2) {
        oq5 oq5Var;
        l9jVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-2057816157);
        int i3 = (oq5Var2.h(l9jVar) ? 4 : 2) | i2;
        if (oq5Var2.P(i3 & 1, (i3 & 19) != 18)) {
            fvf a = hvf.a(0, 0, oq5Var2, 0, 3);
            boolean h = oq5Var2.h(l9jVar);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                sui suiVar = new sui(0, l9jVar, l9j.class, "onBackClick", "onBackClick()V", 0, 27);
                oq5Var2.k0(suiVar);
                K = suiVar;
            }
            h9f h9fVar = (h9f) K;
            boolean h2 = oq5Var2.h(l9jVar);
            Object K2 = oq5Var2.K();
            if (h2 || K2 == kjnVar) {
                sui suiVar2 = new sui(0, l9jVar, l9j.class, "onSearchClick", "onSearchClick()V", 0, 28);
                oq5Var2.k0(suiVar2);
                K2 = suiVar2;
            }
            h9f h9fVar2 = (h9f) K2;
            boolean h3 = oq5Var2.h(l9jVar);
            Object K3 = oq5Var2.K();
            if (h3 || K3 == kjnVar) {
                sui suiVar3 = new sui(0, l9jVar, l9j.class, "openSortBottomSheet", "openSortBottomSheet()V", 0, 29);
                oq5Var2.k0(suiVar3);
                K3 = suiVar3;
            }
            oq5Var = oq5Var2;
            u7g.i(i, a, (Function0) h9fVar, (Function0) ((h9f) K3), (Function0) h9fVar2, ild.C(-1926474809, new gab(15, l9jVar, a), oq5Var2), oq5Var, 196614);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new i4(l9jVar, i, i2, 14);
        }
    }

    public static final void e(wn5 wn5Var, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(178662115);
        if (oq5Var.P(i & 1, (i & 3) != 2)) {
            pd.b(new qzm[0], true, ild.C(-1021435444, new y61(wn5Var, 17), oq5Var), oq5Var, 432, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new y61(i, 18, wn5Var);
        }
    }

    public static final void f(dvl dvlVar, eul eulVar, List list, qzl qzlVar, hq5 hq5Var, int i) {
        fvf fvfVar;
        sdr sdrVar;
        Object ckgVar;
        int i2;
        fvf fvfVar2;
        float f;
        int i3;
        tvd tvdVar;
        vci vciVar;
        fvf fvfVar3;
        ea2 ea2Var;
        jx7 jx7Var;
        fvf fvfVar4;
        Object aa3Var;
        thj thjVar;
        Unit unit;
        jx7 jx7Var2;
        vci vciVar2;
        kjn kjnVar;
        nab nabVar;
        fvf fvfVar5;
        oq5 oq5Var;
        eoe eoeVar;
        tvd tvdVar2;
        sdr sdrVar2;
        qzl qzlVar2;
        boolean z;
        sdr sdrVar3;
        Unit unit2;
        fvf fvfVar6;
        list.getClass();
        qzlVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1596115832);
        int i4 = i | (oq5Var2.f(dvlVar) ? 4 : 2) | (oq5Var2.h(eulVar) ? 32 : 16) | (oq5Var2.f(list) ? 256 : 128) | (oq5Var2.f(qzlVar) ? 2048 : 1024);
        if (oq5Var2.P(i4 & 1, (i4 & 1171) != 1170)) {
            int i5 = 3;
            fvf a = hvf.a(0, 0, oq5Var2, 0, 3);
            fvf a2 = hvf.a(0, 0, oq5Var2, 0, 3);
            fvf a3 = hvf.a(0, 0, oq5Var2, 0, 3);
            float f2 = edo.b;
            tvd X = zwf.X(a, oq5Var2, 6);
            Object K = oq5Var2.K();
            kjn kjnVar2 = gq5.a;
            if (K == kjnVar2) {
                K = szf.U(new nr(X, 25));
                oq5Var2.k0(K);
            }
            sdr sdrVar4 = (sdr) K;
            WeakHashMap weakHashMap = rqv.w;
            eoe n = p6g.n(z7l.h(oq5Var2).f, oq5Var2);
            jx7 jx7Var3 = (jx7) oq5Var2.j(es5.h);
            boolean c = oq5Var2.c(f2) | oq5Var2.f(n);
            Object K2 = oq5Var2.K();
            if (c || K2 == kjnVar2) {
                K2 = new mv(n, i5);
                oq5Var2.k0(K2);
            }
            ea2 v = u2x.v(a, (Function1) K2, oq5Var2);
            iab iabVar = dvlVar.a;
            int i6 = i4 & 7168;
            boolean f3 = (i6 == 2048) | oq5Var2.f(iabVar);
            Object K3 = oq5Var2.K();
            if (f3 || K3 == kjnVar2) {
                fvfVar = a2;
                sdrVar = sdrVar4;
                jab jabVar = new jab(qkb.Header, 1, 1, 1);
                qzlVar.b(jabVar);
                oq5Var2.k0(jabVar);
                K3 = jabVar;
            } else {
                fvfVar = a2;
                sdrVar = sdrVar4;
            }
            nab nabVar2 = (nab) K3;
            boolean f4 = oq5Var2.f(eulVar);
            Object K4 = oq5Var2.K();
            if (f4 || K4 == kjnVar2) {
                K4 = t7g.m(eulVar, 0);
                oq5Var2.k0(K4);
            }
            thj thjVar2 = (thj) K4;
            vci vciVar3 = vci.a;
            yci a4 = a.a(d.c(vciVar3, 1.0f), "playlist_screen_success");
            kfh d = ug3.d(b2c.b, false);
            int i7 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, a4);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, d, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i7))) {
                ouj.x(i7, oq5Var2, i7, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            j0q j0qVar = qzlVar.k;
            boolean h = oq5Var2.h(nabVar2) | (i6 == 2048) | oq5Var2.h(thjVar2);
            Object K5 = oq5Var2.K();
            if (h || K5 == kjnVar2) {
                K5 = new esl(qzlVar, nabVar2, thjVar2, 4);
                oq5Var2.k0(K5);
            }
            y5g.j(j0qVar, (Function0) K5, oq5Var2, 0);
            Unit unit3 = Unit.a;
            boolean f5 = oq5Var2.f(a) | oq5Var2.f(v) | (i6 == 2048) | oq5Var2.f(jx7Var3) | oq5Var2.c(f2) | oq5Var2.f(n);
            Object K6 = oq5Var2.K();
            if (f5 || K6 == kjnVar2) {
                i2 = i6;
                fvfVar2 = a3;
                f = f2;
                i3 = 0;
                tvdVar = X;
                vciVar = vciVar3;
                ckgVar = new ckg(a, qzlVar, v, jx7Var3, n, (Continuation) null);
                fvfVar3 = a;
                ea2Var = v;
                jx7Var = jx7Var3;
                oq5Var2.k0(ckgVar);
            } else {
                ea2Var = v;
                i3 = 0;
                ckgVar = K6;
                fvfVar2 = a3;
                tvdVar = X;
                vciVar = vciVar3;
                f = f2;
                i2 = i6;
                fvfVar3 = a;
                jx7Var = jx7Var3;
            }
            gld.w(oq5Var2, unit3, (Function2) ckgVar);
            Object[] objArr = new Object[i3];
            Object K7 = oq5Var2.K();
            if (K7 == kjnVar2) {
                K7 = new hvl(2);
                oq5Var2.k0(K7);
            }
            jx7 jx7Var4 = jx7Var;
            poi poiVar = (poi) o2g.g0(objArr, null, (Function0) K7, oq5Var2, 0, 6);
            boolean f6 = oq5Var2.f(poiVar);
            Object K8 = oq5Var2.K();
            Continuation continuation = null;
            if (f6 || K8 == kjnVar2) {
                K8 = new qv(poiVar, continuation, 2);
                oq5Var2.k0(K8);
            }
            gld.w(oq5Var2, unit3, (Function2) K8);
            vci vciVar4 = vciVar;
            yci a5 = a.a(d.c(vciVar4, 1.0f), "lazy_column");
            vm C = ghh.C(zs4.g(oq5Var2), ogp.A(oq5Var2));
            boolean h2 = ((i4 & 14) == 4) | oq5Var2.h(nabVar2) | oq5Var2.h(thjVar2) | (i2 == 2048) | oq5Var2.f(tvdVar) | ((i4 & 896) == 256) | oq5Var2.f(fvfVar2) | oq5Var2.f(poiVar) | oq5Var2.f(n) | oq5Var2.f(fvfVar3);
            Object K9 = oq5Var2.K();
            if (h2 || K9 == kjnVar2) {
                fvfVar4 = fvfVar2;
                thjVar = thjVar2;
                unit = unit3;
                jx7Var2 = jx7Var4;
                sdr sdrVar5 = sdrVar;
                vciVar2 = vciVar4;
                kjnVar = kjnVar2;
                nabVar = nabVar2;
                fvfVar5 = fvfVar3;
                tvd tvdVar3 = tvdVar;
                oq5Var = oq5Var2;
                aa3Var = new aa3(list, fvfVar5, n, dvlVar, nabVar, thjVar, qzlVar, tvdVar3, fvfVar4, sdrVar5, poiVar);
                eoeVar = n;
                tvdVar2 = tvdVar3;
                sdrVar2 = sdrVar5;
                oq5Var.k0(aa3Var);
            } else {
                fvfVar5 = fvfVar3;
                eoeVar = n;
                unit = unit3;
                jx7Var2 = jx7Var4;
                sdrVar2 = sdrVar;
                fvfVar4 = fvfVar2;
                vciVar2 = vciVar4;
                aa3Var = K9;
                thjVar = thjVar2;
                kjnVar = kjnVar2;
                tvdVar2 = tvdVar;
                nabVar = nabVar2;
                oq5Var = oq5Var2;
            }
            Function1 function1 = (Function1) aa3Var;
            thj thjVar3 = thjVar;
            eoe eoeVar2 = eoeVar;
            fvf fvfVar7 = fvfVar5;
            fvf fvfVar8 = fvfVar4;
            oq5 oq5Var3 = oq5Var;
            nab nabVar3 = nabVar;
            weo.f(a5, fvfVar7, C, null, null, ea2Var, false, null, function1, oq5Var3, 6, 440);
            oq5Var3.p(true);
            String str = iabVar.a;
            boolean z2 = i2 == 2048;
            Object K10 = oq5Var3.K();
            if (z2 || K10 == kjnVar) {
                K10 = new ayl(0, qzlVar, qzl.class, "onBackClick", "onBackClick()V", 0, 5);
                qzlVar2 = qzlVar;
                oq5Var3.k0(K10);
            } else {
                qzlVar2 = qzlVar;
            }
            yci a6 = a.a(vciVar2, "playlist_top_bar");
            Function0 function0 = (Function0) ((h9f) K10);
            boolean h3 = oq5Var3.h(nabVar3) | (i2 == 2048) | oq5Var3.h(thjVar3);
            Object K11 = oq5Var3.K();
            int i8 = 5;
            if (h3 || K11 == kjnVar) {
                K11 = new esl(qzlVar2, nabVar3, thjVar3, i8);
                oq5Var3.k0(K11);
            }
            Function0 function02 = (Function0) K11;
            boolean h4 = (i2 == 2048) | oq5Var3.h(nabVar3) | oq5Var3.h(thjVar3);
            Object K12 = oq5Var3.K();
            if (h4 || K12 == kjnVar) {
                K12 = new esl(qzlVar2, nabVar3, thjVar3, 6);
                oq5Var3.k0(K12);
            }
            float f7 = f;
            edo.c(tvdVar2, str, a6, function0, function02, (Function0) K12, f7, oq5Var3, 384, 0);
            oq5Var2 = oq5Var3;
            if (dvlVar.b != null) {
                oq5Var2.Z(316429479);
                boolean f8 = oq5Var2.f(fvfVar8) | (i2 == 2048);
                Object K13 = oq5Var2.K();
                if (f8 || K13 == kjnVar) {
                    K13 = new b5l(qzlVar, fvfVar8, (Continuation) null, 19);
                    oq5Var2.k0(K13);
                }
                Unit unit4 = unit;
                gld.w(oq5Var2, unit4, (Function2) K13);
                jx7 jx7Var5 = jx7Var2;
                boolean f9 = oq5Var2.f(fvfVar7) | (i2 == 2048) | oq5Var2.f(jx7Var5) | oq5Var2.c(f7) | oq5Var2.f(eoeVar2);
                Object K14 = oq5Var2.K();
                if (f9 || K14 == kjnVar) {
                    sdrVar3 = sdrVar2;
                    unit2 = unit4;
                    ckg ckgVar2 = new ckg(qzlVar, fvfVar7, sdrVar3, jx7Var5, eoeVar2, (Continuation) null);
                    fvfVar6 = fvfVar7;
                    oq5Var2.k0(ckgVar2);
                    K14 = ckgVar2;
                } else {
                    fvfVar6 = fvfVar7;
                    sdrVar3 = sdrVar2;
                    unit2 = unit4;
                }
                gld.w(oq5Var2, unit2, (Function2) K14);
                fvf fvfVar9 = fvfVar;
                ksw.h(fvfVar8, fvfVar9, oq5Var2, 0);
                Object K15 = oq5Var2.K();
                if (K15 == kjnVar) {
                    K15 = new xtb(sdrVar3, 21);
                    oq5Var2.k0(K15);
                }
                sk3.a(fvfVar6, d.d(wyf.s(vciVar2, (Function0) K15), 1.0f), androidx.compose.foundation.layout.a.c(0.0f, 48, 0.0f, 36, 5), ild.C(-447950613, new up(dvlVar, qzlVar, fvfVar9, sdrVar3, 25), oq5Var2), oq5Var2, 3504);
                z = false;
            } else {
                z = false;
                oq5Var2.Z(298789642);
            }
            oq5Var2.p(z);
        } else {
            oq5Var2.S();
        }
        xmn r = oq5Var2.r();
        if (r != null) {
            r.d = new gvl(i, 5, dvlVar, eulVar, list, qzlVar);
        }
    }

    public static QualityInfo g(Integer num, Integer num2, Integer num3) {
        return new QualityInfo(num, num2, num3, null);
    }

    public static final void h(ukd ukdVar, b95 b95Var, boolean z, wn5 wn5Var, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1183534803);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(ukdVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(b95Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(wn5Var) ? 2048 : 1024;
        }
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            vq2.c(ukdVar, null, ild.C(-690011087, new oc1(z, b95Var, wn5Var, 16), oq5Var), oq5Var, (i2 & 14) | 384, 2);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pp(ukdVar, b95Var, z, wn5Var, i, 15);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(ukd ukdVar, float f, b95 b95Var, d85 d85Var, boolean z, wn5 wn5Var, hq5 hq5Var, int i, int i2) {
        int i3;
        d85 d85Var2;
        d85 d85Var3;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2126261445);
        if ((i & 6) == 0) {
            i3 = (oq5Var.f(ukdVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.c(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.h(b95Var) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            d85Var2 = d85Var;
            i3 |= oq5Var.f(d85Var2) ? 2048 : 1024;
            if ((i & 24576) == 0) {
                i3 |= oq5Var.g(z) ? 16384 : RemoteCameraConfig.Notification.ID;
            }
            if ((196608 & i) == 0) {
                i3 |= oq5Var.h(wn5Var) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            }
            if (oq5Var.P(i3 & 1, (74899 & i3) == 74898)) {
                oq5Var.S();
                d85Var3 = d85Var2;
            } else {
                d85 d85Var4 = i4 != 0 ? null : d85Var2;
                vq2.c(ukdVar.d(z ? new uj2(b95Var).d(new yl6(new n38(f))) : skd.a), null, ild.C(-34370919, new hon(5, wn5Var, d85Var4), oq5Var), oq5Var, 384, 2);
                d85Var3 = d85Var4;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new mo6(ukdVar, f, b95Var, d85Var3, z, wn5Var, i, i2);
                return;
            }
            return;
        }
        d85Var2 = d85Var;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if (oq5Var.P(i3 & 1, (74899 & i3) == 74898)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void j(float f, ukd ukdVar, plv plvVar, boolean z, wn5 wn5Var, hq5 hq5Var, int i) {
        int i2;
        boolean z2;
        b95 b95Var;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1237662026);
        if ((i & 6) == 0) {
            i2 = (oq5Var.c(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(ukdVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var.f(plvVar) : oq5Var.h(plvVar) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= oq5Var.h(wn5Var) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        boolean z3 = true;
        if (oq5Var.P(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z4 = plvVar instanceof nlv;
            if (z4) {
                oq5Var.Z(312744486);
                oq5Var.p(false);
                b95Var = new sfc(((nlv) plvVar).c);
            } else {
                if (!Intrinsics.d(plvVar, olv.b)) {
                    throw vz1.i(oq5Var, 312742674, false);
                }
                oq5Var.Z(312747752);
                b95Var = ((fxa) oq5Var.j(cs5.e)).g;
                oq5Var.p(false);
            }
            nlv nlvVar = z4 ? (nlv) plvVar : null;
            d85 d85Var = nlvVar != null ? new d85(nlvVar.b) : null;
            if ((i3 & 896) != 256 && ((i3 & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 || !oq5Var.h(plvVar))) {
                z3 = false;
            }
            Object K = oq5Var.K();
            if (z3 || K == gq5.a) {
                K = new mjm(19, plvVar);
                oq5Var.k0(K);
            }
            i(zdg.E(ukdVar, (Function1) K), f, b95Var, d85Var, true, wn5Var, oq5Var, (i3 << 3) & 516208, 0);
            z2 = true;
        } else {
            oq5Var.S();
            z2 = z;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new rgo(f, ukdVar, plvVar, z2, wn5Var, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void k(float f, ukd ukdVar, plv plvVar, boolean z, wn5 wn5Var, hq5 hq5Var, int i, int i2) {
        int i3;
        boolean z2;
        boolean z3;
        xmn r;
        b95 b95Var;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1806277211);
        if ((i & 6) == 0) {
            i3 = (oq5Var.c(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.f(ukdVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var.f(plvVar) : oq5Var.h(plvVar) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            z2 = z;
            i3 |= oq5Var.g(z2) ? 2048 : 1024;
            if ((i & 24576) == 0) {
                i3 |= oq5Var.h(wn5Var) ? 16384 : RemoteCameraConfig.Notification.ID;
            }
            if (oq5Var.P(i3 & 1, (i3 & 9363) == 9362)) {
                oq5Var.S();
                z3 = z2;
            } else {
                boolean z4 = i4 == 0 ? z2 : true;
                if (plvVar instanceof nlv) {
                    oq5Var.Z(665622601);
                    oq5Var.p(false);
                    b95Var = new sfc(((nlv) plvVar).b);
                } else {
                    if (!Intrinsics.d(plvVar, olv.b)) {
                        throw vz1.i(oq5Var, 665620787, false);
                    }
                    oq5Var.Z(665625803);
                    b95Var = ((fxa) oq5Var.j(cs5.e)).A;
                    oq5Var.p(false);
                }
                if (qv0.a()) {
                    oq5Var.Z(-840363456);
                    int i5 = (i3 >> 3) & 14;
                    int i6 = i3 << 3;
                    boolean z5 = z4;
                    i(ukdVar, f, b95Var, null, z5, wn5Var, oq5Var, i5 | (i6 & 112) | (57344 & i6) | (i6 & 458752), 8);
                    z4 = z5;
                    oq5Var = oq5Var;
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(-840129592);
                    h(ukdVar, b95Var, z4, wn5Var, oq5Var, (i3 >> 3) & 8078);
                    oq5Var.p(false);
                }
                z3 = z4;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new e7m(f, ukdVar, plvVar, z3, wn5Var, i, i2);
                return;
            }
            return;
        }
        z2 = z;
        if ((i & 24576) == 0) {
        }
        if (oq5Var.P(i3 & 1, (i3 & 9363) == 9362)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void l(long j, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1577862805);
        int i2 = (oq5Var.e(j) ? 4 : 2) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            agr agrVar = cs5.b;
            final RemoteViews remoteViews = new RemoteViews(((Context) oq5Var.j(agrVar)).getPackageName(), R.layout.rounded_corners_left);
            remoteViews.setInt(R.id.roundedCornerImgL, "setColorFilter", c3x.U(j));
            final RemoteViews remoteViews2 = new RemoteViews(((Context) oq5Var.j(agrVar)).getPackageName(), R.layout.rounded_corners_right);
            remoteViews2.setInt(R.id.roundedCornerImgR, "setColorFilter", c3x.U(j));
            skd skdVar = skd.a;
            vq2.c(o5g.z(skdVar), f40.e, ild.C(-816214413, new Function2() { // from class: sgo
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i3;
                    hq5 hq5Var2 = (hq5) obj;
                    int intValue = ((Integer) obj2).intValue();
                    switch (i5) {
                        case 0:
                            oq5 oq5Var2 = (oq5) hq5Var2;
                            if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                                ild.a(remoteViews, o5g.z(skd.a), oq5Var2, 0);
                            } else {
                                oq5Var2.S();
                            }
                            break;
                        default:
                            oq5 oq5Var3 = (oq5) hq5Var2;
                            if (oq5Var3.P(intValue & 1, (intValue & 3) != 2)) {
                                ild.a(remoteViews, o5g.z(skd.a), oq5Var3, 0);
                            } else {
                                oq5Var3.S();
                            }
                            break;
                    }
                    return Unit.a;
                }
            }, oq5Var), oq5Var, 384, 0);
            vq2.c(o5g.z(skdVar), f40.g, ild.C(976447210, new Function2() { // from class: sgo
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    hq5 hq5Var2 = (hq5) obj;
                    int intValue = ((Integer) obj2).intValue();
                    switch (i5) {
                        case 0:
                            oq5 oq5Var2 = (oq5) hq5Var2;
                            if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                                ild.a(remoteViews2, o5g.z(skd.a), oq5Var2, 0);
                            } else {
                                oq5Var2.S();
                            }
                            break;
                        default:
                            oq5 oq5Var3 = (oq5) hq5Var2;
                            if (oq5Var3.P(intValue & 1, (intValue & 3) != 2)) {
                                ild.a(remoteViews2, o5g.z(skd.a), oq5Var3, 0);
                            } else {
                                oq5Var3.S();
                            }
                            break;
                    }
                    return Unit.a;
                }
            }, oq5Var), oq5Var, 384, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new bu0(j, i, 7);
        }
    }

    public static final void m(List list, qzl qzlVar, jab jabVar, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1814418387);
        int i2 = i | (oq5Var2.f(list) ? 4 : 2) | (oq5Var2.f(qzlVar) ? 32 : 16) | (oq5Var2.h(jabVar) ? 256 : 128);
        if (oq5Var2.P(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = (i2 & 896) | ((i2 >> 3) & 14) | ((i2 << 3) & 112);
            qzlVar.getClass();
            list.getClass();
            boolean z = (((i3 & 112) ^ 48) > 32 && oq5Var2.f(list)) || (i3 & 48) == 32;
            Object K = oq5Var2.K();
            if (z || K == gq5.a) {
                zr zrVar = new zr(new ygt(jabVar.f, list), qzlVar.c, qzlVar.h.a(jabVar, null), qzlVar.i);
                oq5Var2.k0(zrVar);
                K = zrVar;
            }
            f14 f14Var = (f14) K;
            ta5 a = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
            int i4 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var2, i4, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            oq5Var = oq5Var2;
            irf.h(rvf.M(R.string.similar_entities_block_title, oq5Var2), vci.a, null, null, null, false, null, false, null, oq5Var, 48, 508);
            bg3.c(f14Var, zpd.k, null, null, 0.0f, oq5Var, 48, 28);
            oq5Var.p(true);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gvl(i, 4, list, qzlVar, jabVar, yciVar);
        }
    }

    public static final void n(List list, eqp eqpVar, fvf fvfVar, o0k o0kVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var;
        list.getClass();
        eqpVar.getClass();
        fvfVar.getClass();
        o0kVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(237316305);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? oq5Var2.f(eqpVar) : oq5Var2.h(eqpVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.f(fvfVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.f(o0kVar) ? 2048 : 1024;
        }
        boolean z = false;
        if (oq5Var2.P(i2 & 1, (i2 & 1171) != 1170)) {
            vm C = ghh.C(o0kVar, androidx.compose.foundation.layout.a.c(0.0f, 0.0f, 0.0f, 16, 7));
            yci c = d.c(a.a(vci.a, "settings_main_screen"), 1.0f);
            boolean z2 = (i2 & 14) == 4;
            if ((i2 & 112) == 32 || ((i2 & 64) != 0 && oq5Var2.h(eqpVar))) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object K = oq5Var2.K();
            if (z3 || K == gq5.a) {
                K = new xum(13, list, eqpVar);
                oq5Var2.k0(K);
            }
            oq5Var = oq5Var2;
            weo.f(c, fvfVar, C, null, null, null, false, null, (Function1) K, oq5Var, ((i2 >> 3) & 112) | 6, 504);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new zkl(i, 6, list, eqpVar, fvfVar, o0kVar);
        }
    }

    public static final void o(ukd ukdVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1380468206);
        if ((((oq5Var.f(ukdVar) ? 4 : 2) | i) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            t3r t3rVar = t3r.a;
            oq5Var.a0(-1115894518);
            oq5Var.a0(1886828752);
            if (!(oq5Var.a instanceof mw0)) {
                lxe.v();
                throw null;
            }
            oq5Var.X();
            if (oq5Var.O) {
                oq5Var.k(new ypb(t3rVar));
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, ukdVar, epo.x0);
            oq5Var.p(true);
            oq5Var.p(false);
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q2r(ukdVar, i, 2);
        }
    }

    public static final void p(Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var;
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1360488581);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 32 : 16;
        }
        if (oq5Var2.P(i2 & 1, (i2 & 19) != 18)) {
            yci e = androidx.compose.foundation.a.e(xp3.u(d.g(yciVar, 48, 0.0f, 2), ugo.a), false, null, null, function0, 7);
            kfh d = ug3.d(b2c.f, false);
            int i3 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, e);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, d, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var2, i3, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            b bVar = b.a;
            vci vciVar = vci.a;
            jzk jzkVar = vnj.i;
            yci s = men.s(bVar.b(vciVar), 30, jzkVar);
            agr agrVar = eq0.a;
            ug3.a(androidx.compose.foundation.a.b(s, ((dq0) oq5Var2.j(agrVar)).c.c, jzkVar), oq5Var2, 0);
            xcs.b(rvf.M(R.string.freemium_wave_button_fallback_text, oq5Var2), androidx.compose.foundation.layout.a.n(vciVar, 32, 14), d85.b(((dq0) oq5Var2.j(agrVar)).b.a, 0.9f, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.i(), oq5Var2, 48, 3120, 55288);
            oq5Var = oq5Var2;
            oq5Var.p(true);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ni6(function0, yciVar, i, 7);
        }
    }

    public static final void q(p5t p5tVar, wn5 wn5Var, Function0 function0, Function0 function02, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        function0.getClass();
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1694383073);
        int i2 = i | (oq5Var.f(p5tVar) ? 4 : 2) | (oq5Var.h(function0) ? 256 : 128) | (oq5Var.h(function02) ? 2048 : 1024) | 24576;
        if (oq5Var.P(i2 & 1, (i2 & 9363) != 9362)) {
            wn5 C = ild.C(787027509, new kws(3, p5tVar, function0, function02), oq5Var);
            vci vciVar = vci.a;
            zsd.t(54, 8, C, wn5Var, oq5Var, a.a(vciVar, "trailer_bottom_sheet"), false);
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pli(i, 20, p5tVar, wn5Var, function0, function02, yciVar2);
        }
    }

    public static final void r(qo6 qo6Var, wn5 wn5Var, hq5 hq5Var, int i) {
        wn5 wn5Var2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1360200784);
        int i2 = (oq5Var.d(qo6Var.ordinal()) ? 4 : 2) | i | (oq5Var.g(true) ? 32 : 16);
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            wn5Var2 = wn5Var;
            zsd.t(3126, 4, ild.C(-855914682, new qp(qo6Var, 4), oq5Var), wn5Var2, oq5Var, null, false);
        } else {
            wn5Var2 = wn5Var;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k0r(qo6Var, wn5Var2, i, 21);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void s(p5t p5tVar, Function0 function0, Function0 function02, yci yciVar, hq5 hq5Var, int i) {
        Function0 function03;
        yci yciVar2;
        yci a;
        boolean z;
        function0.getClass();
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-897059986);
        int i2 = i | (oq5Var.f(p5tVar) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.h(function02) ? 256 : 128) | 3072;
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            hz2 hz2Var = b2c.l;
            float f = 16;
            float f2 = 8;
            vci vciVar = vci.a;
            float f3 = 80;
            yci d = d.d(d.g(androidx.compose.foundation.layout.a.q(vciVar, f, f, 0.0f, f2, 4), f3, 0.0f, 2), 1.0f);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new h4t(3);
                oq5Var.k0(K);
            }
            yci b = nfp.b(d, false, (Function1) K);
            nho a2 = lho.a(qx0.a, hz2Var, oq5Var, 48);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, b);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            yci m = d.m(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 0.0f, f2, 0.0f, 11), f3);
            iz2 iz2Var = b2c.b;
            kfh d2 = ug3.d(iz2Var, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, m);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            String str = p5tVar.c;
            qo6 qo6Var = p5tVar.d;
            yci a3 = b.a.a(d.m(vciVar, 72), iz2Var);
            Float f4 = p5tVar.h;
            if (f4 == null) {
                oq5Var.Z(-79388855);
                oq5Var.p(false);
                z = false;
                a = null;
            } else {
                oq5Var.Z(-79388854);
                float floatValue = f4.floatValue();
                boolean c = oq5Var.c(floatValue);
                Object K2 = oq5Var.K();
                if (c || K2 == kjnVar) {
                    K2 = new vp(3, floatValue);
                    oq5Var.k0(K2);
                }
                a = androidx.compose.ui.draw.a.a(vciVar, (Function1) K2);
                z = false;
                oq5Var.p(false);
            }
            if (a == null) {
                a = vciVar;
            }
            int i5 = z;
            irf.y(str, qo6Var, a.a(a3.f(a), "trailer_entity_cover"), false, false, null, null, null, oq5Var, 0, 248);
            pd.b(new qzm[i5], true, ild.C(337568079, new f5r(11, p5tVar), oq5Var), oq5Var, 432, 0);
            oq5Var.p(true);
            lx0 lx0Var = qx0.e;
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, 1.0f);
            ta5 a4 = sa5.a(lx0Var, b2c.n, oq5Var, 6);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l3 = oq5Var.l();
            yci H3 = vnj.H(oq5Var, layoutWeightElement);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a4, kb5Var);
            g0g.U(oq5Var, l3, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var3);
            }
            g0g.U(oq5Var, H3, kb5Var4);
            Object K3 = oq5Var.K();
            if (K3 == kjnVar) {
                K3 = new h4t(4);
                oq5Var.k0(K3);
            }
            yci a5 = a.a(androidx.compose.foundation.a.k(nfp.b(vciVar, i5, (Function1) K3), true, null), "trailer_entity_header");
            String str2 = p5tVar.a;
            ges b2 = nu0.b();
            agr agrVar = eq0.a;
            xv7.j(str2, a5, ((dq0) oq5Var.j(agrVar)).b.a, 0L, 0L, 0, 0L, 0, false, 1, 0, null, b2, oq5Var, 0, 3072, 57336);
            float f5 = 4;
            u1g.l(oq5Var, d.m(vciVar, f5));
            Object K4 = oq5Var.K();
            if (K4 == kjnVar) {
                K4 = new h4t(5);
                oq5Var.k0(K4);
            }
            xv7.j(p5tVar.b, a.a(nfp.b(vciVar, i5, (Function1) K4), "trailer_entity_title"), ((dq0) oq5Var.j(agrVar)).b.b, 0L, 0L, 0, 0L, 0, false, 2, 0, null, nu0.b(), oq5Var, 0, 3072, 57336);
            oq5Var = oq5Var;
            oq5Var.p(true);
            if (p5tVar.g) {
                oq5Var.Z(-691907192);
                Object K5 = oq5Var.K();
                if (K5 == kjnVar) {
                    K5 = new h4t(2);
                    oq5Var.k0(K5);
                }
                function03 = function02;
                y5g.M(function03, nfp.b(vciVar, i5, (Function1) K5), oq5Var, (i2 >> 6) & 14, i5);
            } else {
                function03 = function02;
                oq5Var.Z(-699046864);
            }
            oq5Var.p(i5);
            boolean z2 = p5tVar.f;
            yci c2 = com.yandex.music.core.ui.compose.b.c(a.a(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 0.0f, f5, 0.0f, 11), "trailer_playback_button"), "isPlaying", Boolean.valueOf(p5tVar.f));
            boolean z3 = (i2 & 14) == 4 ? true : i5;
            Object K6 = oq5Var.K();
            if (z3 || K6 == kjnVar) {
                K6 = new r3s(9, p5tVar);
                oq5Var.k0(K6);
            }
            rvf.m(function0, z2, nfp.b(c2, i5, (Function1) K6), 0L, oq5Var, (i2 >> 3) & 14, 8);
            oq5Var.p(true);
            yciVar2 = vciVar;
        } else {
            function03 = function02;
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new mqr(i, 5, p5tVar, function0, function03, yciVar2);
        }
    }

    public static final void t(qo6 qo6Var, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(597485896);
        int i2 = (oq5Var.d(qo6Var.ordinal()) ? 4 : 2) | i | (oq5Var.g(true) ? 32 : 16) | 384;
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            hz2 hz2Var = b2c.l;
            float f = 16;
            float f2 = 8;
            vci vciVar = vci.a;
            float f3 = 80;
            yci d = d.d(d.g(androidx.compose.foundation.layout.a.q(vciVar, f, f, 0.0f, f2, 4), f3, 0.0f, 2), 1.0f);
            nho a = lho.a(qx0.a, hz2Var, oq5Var, 48);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, d);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            yciVar2 = vciVar;
            yci m = d.m(androidx.compose.foundation.layout.a.q(yciVar2, 0.0f, 0.0f, f2, 0.0f, 11), f3);
            iz2 iz2Var = b2c.b;
            kfh d2 = ug3.d(iz2Var, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, m);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            int i5 = (i2 >> 3) & 14;
            ivf.k(i5, 0, oq5Var, xp3.u(b.a.a(d.m(yciVar2, 72), iz2Var), irf.R(qo6Var, oq5Var)), true);
            oq5Var.p(true);
            lx0 lx0Var = qx0.e;
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            float f4 = 4;
            yci e = d.e(new LayoutWeightElement(true, 1.0f), (w1g.p(nu0.b(), 0, oq5Var, 0, 2) * 3) + f4);
            ta5 a2 = sa5.a(lx0Var, b2c.n, oq5Var, 6);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l3 = oq5Var.l();
            yci H3 = vnj.H(oq5Var, e);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, kb5Var);
            g0g.U(oq5Var, l3, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var3);
            }
            g0g.U(oq5Var, H3, kb5Var4);
            int i7 = i5 | 48;
            ivf.l(true, d.r(yciVar2, 160), nu0.b(), oq5Var, i7, 0);
            u1g.l(oq5Var, d.m(yciVar2, f4));
            ivf.l(true, d.r(yciVar2, 100), nu0.b(), oq5Var, i7, 0);
            oq5Var.p(true);
            oq5Var.p(true);
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k0r(qo6Var, yciVar2, i, 22);
        }
    }

    public static final /* synthetic */ VhVideoData u(String str, String str2, Function1 function1) {
        str.getClass();
        str2.getClass();
        c cVar = new c(str, str2);
        function1.invoke(cVar);
        return cVar.a();
    }

    public static final void v(int i, ukd ukdVar, plv plvVar, boolean z, hq5 hq5Var, int i2, int i3) {
        int i4;
        boolean z2;
        l85 l85Var;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1538572911);
        int i5 = i2 | (oq5Var.d(i) ? 4 : 2) | (oq5Var.f(ukdVar) ? 32 : 16) | (oq5Var.f(plvVar) ? 256 : 128);
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 = i5 | 3072;
        } else {
            i4 = i5 | (oq5Var.g(z) ? 2048 : 1024);
        }
        if (oq5Var.P(i4 & 1, (i4 & 1171) != 1170)) {
            boolean z3 = i6 != 0 ? true : z;
            gi0 gi0Var = new gi0(i);
            olv olvVar = olv.b;
            if (z3) {
                oq5Var.Z(-265048945);
                if (plvVar instanceof nlv) {
                    oq5Var.Z(1099831098);
                    oq5Var.p(false);
                    l85Var = new l85(new rjs(new sfc(((nlv) plvVar).d)));
                } else {
                    if (!Intrinsics.d(plvVar, olvVar)) {
                        throw vz1.i(oq5Var, 1099828691, false);
                    }
                    oq5Var.Z(1099834257);
                    l85 l85Var2 = new l85(new rjs(((fxa) oq5Var.j(cs5.e)).e));
                    oq5Var.p(false);
                    l85Var = l85Var2;
                }
                oq5Var.p(false);
            } else {
                oq5Var.Z(-264792761);
                if (plvVar instanceof nlv) {
                    oq5Var.Z(1099839355);
                    oq5Var.p(false);
                    l85Var = new l85(new rjs(new sfc(((nlv) plvVar).e)));
                } else {
                    if (!Intrinsics.d(plvVar, olvVar)) {
                        throw vz1.i(oq5Var, 1099836955, false);
                    }
                    oq5Var.Z(1099842552);
                    l85 l85Var3 = new l85(new rjs(((fxa) oq5Var.j(cs5.e)).A));
                    oq5Var.p(false);
                    l85Var = l85Var3;
                }
                oq5Var.p(false);
            }
            saf.o(gi0Var, ukdVar, 0, l85Var, oq5Var, ((i4 << 3) & 896) | 32816, 8);
            z2 = z3;
        } else {
            oq5Var.S();
            z2 = z;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new qu(i, ukdVar, plvVar, z2, i2, i3);
        }
    }

    public static final String w(mqs mqsVar, h3v h3vVar) {
        if (mqsVar == null) {
            dfi.r("Unexpected behaviour track must not be null", "WaveScreen");
            return h3vVar.a.c(R.string.unknown_album);
        }
        k10 k10Var = mqsVar.d;
        if (a4g.D(gys.FairyTaleHolder, mqsVar)) {
            return h3vVar.a.c(R.string.header_now_playing_fairy_tale_just);
        }
        if (a4g.D(gys.AudioBookHolder, mqsVar)) {
            return h3vVar.a.c(R.string.book);
        }
        if (a4g.D(gys.PodcastHolder, mqsVar)) {
            return h3vVar.a.c(R.string.podcast);
        }
        Parcelable.Creator<k10> creator = k10.CREATOR;
        k10Var.getClass();
        return k10Var.equals(k10.i) ? h3vVar.a.c(R.string.unknown_album) : k10Var.d;
    }

    public static final j48 x(j48 j48Var, j48 j48Var2, rep repVar, long j, xdp xdpVar) {
        if (xdpVar == null) {
            return ldg.F(j48Var, j48Var2);
        }
        int compare = repVar.f.compare(Long.valueOf(xdpVar.c), Long.valueOf(j));
        return compare < 0 ? j48.a : compare > 0 ? j48.c : j48.b;
    }

    public static boolean z(BaseBundle baseBundle, BaseBundle baseBundle2) {
        if (baseBundle == baseBundle2) {
            return true;
        }
        if (baseBundle == null || baseBundle2 == null) {
            return false;
        }
        Set<String> keySet = baseBundle.keySet();
        Set<String> keySet2 = baseBundle2.keySet();
        if (!(keySet == keySet2 ? true : (keySet == null || keySet2 == null) ? false : keySet.equals(keySet2))) {
            return false;
        }
        for (String str : keySet) {
            Object obj = baseBundle.get(str);
            Object obj2 = baseBundle2.get(str);
            if (obj instanceof BaseBundle) {
                if (!(obj2 instanceof BaseBundle) || !z((BaseBundle) obj, (BaseBundle) obj2)) {
                    return false;
                }
            } else if (!Objects.equals(obj, obj2)) {
                return false;
            }
        }
        return true;
    }

    public abstract void y(j0o j0oVar, Object obj);
}
