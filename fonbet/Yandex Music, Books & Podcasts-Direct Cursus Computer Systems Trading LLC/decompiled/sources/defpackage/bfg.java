package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.foundation.ScrollingLayoutElement;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.music.core.ui.compose.b;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;
import ru.yandex.music.data.wave.recommendations.StationId;
import ru.yandex.music.nonmusic.shelf.data.MyShelfBlockElementDto;
import ru.yandex.music.nonmusic.yandexbooks.data.MenuTabDataDto;
import ru.yandex.music.nonmusic.yandexbooks.data.MenuTabDto;
import ru.yandex.music.nonmusic.yandexbooks.data.YandexBooksBannerDataDto;
import ru.yandex.music.nonmusic.yandexbooks.data.YandexBooksBannerDto;
import ru.yandex.music.novelties.podcasts.catalog.data.AlbumsChartBlockDto;
import ru.yandex.music.novelties.podcasts.catalog.data.CategoriesPodcastsBlockDto;
import ru.yandex.music.novelties.podcasts.catalog.data.ContinueListenBlockDto;
import ru.yandex.music.novelties.podcasts.catalog.data.MenuBlockDto;
import ru.yandex.music.novelties.podcasts.catalog.data.MenuTabsBlockDto;
import ru.yandex.music.novelties.podcasts.catalog.data.PlaylistPodcastsBlockDto;
import ru.yandex.music.novelties.podcasts.catalog.data.PlaylistsAlbumsPodcastsBlockDto;
import ru.yandex.music.novelties.podcasts.catalog.data.PodcastsBlockDto;
import ru.yandex.music.novelties.podcasts.catalog.data.PodcastsCatalogDto;
import ru.yandex.music.novelties.podcasts.catalog.data.PromotionsPodcastsBlockDto;
import ru.yandex.music.novelties.podcasts.catalog.data.RadioBlockDto;
import ru.yandex.music.novelties.podcasts.catalog.data.TracksChartBlockDto;
import ru.yandex.music.novelties.podcasts.catalog.data.YandexBooksBannerBlockDto;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;
import ru.yandex.video.m3.data.exception.network.e;
import ru.yandex.video.m3.player.tracking.LoadError;

/* loaded from: classes6.dex */
public abstract class bfg {
    public static final ArrayList B(List list, e5q e5qVar) {
        e6v b6vVar;
        list.getClass();
        List<jzs> list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        for (jzs jzsVar : list2) {
            izs izsVar = jzsVar.g;
            mqs mqsVar = jzsVar.a;
            if (Intrinsics.d(izsVar, hzs.a)) {
                if (e5qVar instanceof u4q) {
                    b6vVar = new d6v((z4q) e5qVar, c6v.a);
                } else if (e5qVar instanceof s4q) {
                    b6vVar = new d6v((z4q) e5qVar, c6v.b);
                } else if (e5qVar instanceof w4q) {
                    b6vVar = new d6v((z4q) e5qVar, c6v.a);
                } else {
                    boolean z = e5qVar instanceof y4q;
                    ryt rytVar = ryt.a;
                    if (z) {
                        b6vVar = new b6v(new m3q(new cd5(t75.c(mqsVar.a)), rytVar));
                    } else {
                        if (!(e5qVar instanceof b5q)) {
                            b6e.s();
                            return null;
                        }
                        b6vVar = new b6v(new m3q(new cd5(t75.c(mqsVar.a)), rytVar));
                    }
                }
                CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
                jzsVar = jzs.d(jzsVar, null, b6vVar, 447);
            } else if (!(izsVar instanceof e6v)) {
                b6e.s();
                return null;
            }
            arrayList.add(jzsVar);
        }
        return arrayList;
    }

    public static final two C(hq5 hq5Var) {
        int i = 0;
        Object[] objArr = new Object[0];
        apo apoVar = two.i;
        boolean d = ((oq5) hq5Var).d(0);
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        if (d || K == gq5.a) {
            K = new s6f(i, 10);
            oq5Var.k0(K);
        }
        return (two) o2g.g0(objArr, apoVar, (Function0) K, oq5Var, 0, 4);
    }

    public static final TypedValue D(int i, Resources.Theme theme) {
        theme.getClass();
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static final boolean E(Resources.Theme theme, int i, boolean z) {
        theme.getClass();
        TypedValue D = D(i, theme);
        return D != null ? D.data != 0 : z;
    }

    public static final int F(int i, Resources.Theme theme) {
        theme.getClass();
        TypedValue D = D(i, theme);
        if (D != null) {
            return D.data;
        }
        wvs.p(k5r.i(i, "Theme does not contains required color "));
        return 0;
    }

    public static yci G(yci yciVar, two twoVar, boolean z, boolean z2) {
        return a.n(yciVar, twoVar, z2 ? bxj.a : bxj.b, z, false, null, twoVar.c, true, null, null).f(new ScrollingLayoutElement(twoVar, z2));
    }

    public static void H(ImageView imageView, String str) {
        imageView.getClass();
        if (str == null) {
            qo6 qo6Var = qo6.a;
            imageView.getContext().getClass();
            imageView.setImageResource(R.drawable.bg_placeholder_oval);
            return;
        }
        jcv jcvVar = new jcv(str, WebPath$Storage.ENTITY_BACKGROUND_IMG);
        qo6 qo6Var2 = qo6.a;
        Context context = imageView.getContext();
        context.getClass();
        pce pceVar = new pce(context);
        pceVar.c = jcvVar.getPathForSize(0);
        pceVar.c(R.drawable.bg_placeholder_oval);
        pceVar.v = Integer.valueOf(R.drawable.bg_placeholder_oval);
        pceVar.w = null;
        pceVar.f(imageView);
        rce a = pceVar.a();
        l18 l18Var = l18.b;
        bdt I = hag.I(cce.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        ((cce) qdcVar.C(I)).d(a);
    }

    public static rnj I(byte[] bArr) {
        int i;
        int i2;
        char c;
        float f;
        z6n z6nVar;
        int i3;
        int i4;
        float f2;
        int i5;
        boolean z;
        int i6 = (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
        int i7 = (bArr[3] & 255) | ((bArr[4] & 255) << 8);
        float f3 = (i6 & 63) / 63.0f;
        float f4 = (((i6 >> 6) & 63) / 31.5f) - 1.0f;
        float f5 = (((i6 >> 12) & 63) / 31.5f) - 1.0f;
        float f6 = ((i6 >> 18) & 31) / 31.0f;
        boolean z2 = (i6 >> 23) != 0;
        float f7 = ((i7 >> 3) & 63) / 63.0f;
        float f8 = ((i7 >> 9) & 63) / 63.0f;
        boolean z3 = (i7 >> 15) != 0;
        if (z3) {
            i = 1;
            i2 = z2 ? 5 : 7;
        } else {
            i = 1;
            i2 = i7 & 7;
        }
        int max = Math.max(3, i2);
        int max2 = Math.max(3, z3 ? i7 & 7 : z2 ? 5 : 7);
        if (z2) {
            c = 2;
            f = (bArr[5] & 15) / 15.0f;
        } else {
            c = 2;
            f = 1.0f;
        }
        float f9 = ((bArr[5] >> 4) & 15) / 15.0f;
        int i8 = z2 ? 6 : 5;
        int i9 = 0;
        int i10 = 0;
        while (i9 < max2) {
            for (int i11 = i9 > 0 ? 0 : i; i11 * max2 < (max2 - i9) * max; i11++) {
                i10++;
            }
            i9++;
        }
        float[] fArr = new float[i10];
        int i12 = 0;
        int i13 = 0;
        while (true) {
            char c2 = 3;
            if (i12 >= 3) {
                break;
            }
            int i14 = i12 > 0 ? 0 : i;
            while (true) {
                z = z2;
                if (i14 * 3 < (3 - i12) * 3) {
                    i13++;
                    i14++;
                    z2 = z;
                    c2 = 3;
                }
            }
            i12++;
            z2 = z;
        }
        boolean z4 = z2;
        float[] fArr2 = new float[i13];
        int i15 = 0;
        int i16 = 0;
        while (true) {
            char c3 = 3;
            if (i15 >= 3) {
                break;
            }
            int i17 = i15 > 0 ? 0 : i;
            while (true) {
                i5 = i15;
                if (i17 * 3 < (3 - i15) * 3) {
                    i16++;
                    i17++;
                    i15 = i5;
                    c3 = 3;
                }
            }
            i15 = i5 + 1;
        }
        float[] fArr3 = new float[i16];
        int i18 = 0;
        int i19 = 0;
        while (i18 < i10) {
            fArr[i18] = ((((bArr[i8 + (i19 >> 1)] >> ((i19 & 1) << 2)) & 15) / 7.5f) - 1.0f) * f6;
            i19++;
            i18++;
            fArr3 = fArr3;
        }
        float[] fArr4 = fArr3;
        float f10 = f7 * 1.25f;
        for (int i20 = 0; i20 < i13; i20++) {
            fArr2[i20] = ((((bArr[(i19 >> 1) + i8] >> ((i19 & 1) << 2)) & 15) / 7.5f) - 1.0f) * f10;
            i19++;
        }
        float f11 = f8 * 1.25f;
        for (int i21 = 0; i21 < i16; i21++) {
            fArr4[i21] = ((((bArr[(i19 >> 1) + i8] >> ((i19 & 1) << 2)) & 15) / 7.5f) - 1.0f) * f11;
            i19++;
        }
        if (z4) {
            z6nVar = new z6n(12);
            int i22 = 0;
            int i23 = 0;
            while (true) {
                if (i22 >= 5) {
                    break;
                }
                int i24 = i22 > 0 ? 0 : i;
                for (int i25 = 5; i24 * 5 < (5 - i22) * i25; i25 = 5) {
                    i23++;
                    i24++;
                }
                i22++;
            }
            z6nVar.b = new float[i23];
            int i26 = 0;
            while (true) {
                float[] fArr5 = (float[]) z6nVar.b;
                if (i26 >= fArr5.length) {
                    break;
                }
                fArr5[i26] = ((((bArr[(i19 >> 1) + i8] >> ((i19 & 1) << 2)) & 15) / 7.5f) - 1.0f) * f9;
                i19++;
                i26++;
            }
        } else {
            z6nVar = null;
        }
        float[] fArr6 = z4 ? (float[]) z6nVar.b : null;
        byte b = bArr[3];
        int i27 = (bArr[c] & 128) != 0 ? i : 0;
        int i28 = (bArr[4] & 128) != 0 ? i : 0;
        float f12 = (i28 != 0 ? i27 != 0 ? 5 : 7 : b & 7) / (i28 != 0 ? b & 7 : i27 != 0 ? 5 : 7);
        int round = Math.round(f12 > 1.0f ? 32.0f : f12 * 32.0f);
        int round2 = Math.round(f12 > 1.0f ? 32.0f / f12 : 32.0f);
        int[] iArr = new int[round * round2];
        int max3 = Math.max(max, z4 ? 5 : 3);
        int max4 = Math.max(max2, z4 ? 5 : 3);
        float[] fArr7 = new float[max3];
        float[] fArr8 = new float[max4];
        int i29 = 0;
        int i30 = 0;
        while (i29 < round2) {
            float[] fArr9 = fArr6;
            int i31 = 0;
            while (i31 < round) {
                int i32 = max;
                int i33 = 0;
                while (i33 < max3) {
                    fArr7[i33] = (float) Math.cos((3.141592653589793d / round) * (i31 + 0.5f) * i33);
                    i33++;
                    max3 = max3;
                    f3 = f3;
                }
                int i34 = max3;
                float f13 = f3;
                int i35 = 0;
                while (i35 < max4) {
                    fArr8[i35] = (float) Math.cos(i35 * (i29 + 0.5f) * (3.141592653589793d / round2));
                    i35++;
                    i31 = i31;
                }
                int i36 = i31;
                float f14 = f13;
                int i37 = 0;
                int i38 = 0;
                while (i37 < max2) {
                    float f15 = fArr8[i37] * 2.0f;
                    int i39 = i37 > 0 ? 0 : i;
                    int i40 = i37;
                    while (true) {
                        f2 = f14;
                        if (i39 * max2 < (max2 - i40) * i32) {
                            f14 = (fArr[i38] * fArr7[i39] * f15) + f2;
                            i39++;
                            i38++;
                        }
                    }
                    i37 = i40 + 1;
                    f14 = f2;
                }
                float f16 = f4;
                float f17 = f5;
                int i41 = 0;
                int i42 = 0;
                while (i41 < 3) {
                    float f18 = fArr8[i41] * 2.0f;
                    int i43 = i41 > 0 ? 0 : i;
                    while (true) {
                        i4 = i41;
                        if (i43 < 3 - i4) {
                            float f19 = fArr7[i43] * f18;
                            f16 = (fArr2[i42] * f19) + f16;
                            f17 = (fArr4[i42] * f19) + f17;
                            i43++;
                            i42++;
                            i41 = i4;
                        }
                    }
                    i41 = i4 + 1;
                }
                float f20 = f14;
                float f21 = f;
                if (z4) {
                    int i44 = 0;
                    int i45 = 0;
                    while (i44 < 5) {
                        float f22 = fArr8[i44] * 2.0f;
                        int i46 = i44 > 0 ? 0 : i;
                        while (true) {
                            i3 = i44;
                            if (i46 < 5 - i3) {
                                f21 += fArr9[i45] * fArr7[i46] * f22;
                                i46++;
                                i45++;
                                i44 = i3;
                            }
                        }
                        i44 = i3 + 1;
                    }
                }
                float f23 = f20 - (f16 * 0.6666667f);
                float f24 = (((3.0f * f20) - f23) + f17) / 2.0f;
                iArr[i30] = Color.argb(s(f21), s(f24), s(f24 - f17), s(f23));
                i31 = i36 + 1;
                i30++;
                max3 = i34;
                max = i32;
                f3 = f13;
            }
            i29++;
            fArr6 = fArr9;
        }
        rnj rnjVar = new rnj(8);
        rnjVar.b = round;
        rnjVar.c = round2;
        rnjVar.d = iArr;
        return rnjVar;
    }

    public static final eul J(cvl cvlVar) {
        LinkedList linkedList;
        CoverPath coverPath;
        String uri;
        cvlVar.getClass();
        String str = cvlVar.w;
        String str2 = cvlVar.c.a;
        String str3 = cvlVar.a;
        String str4 = cvlVar.b;
        tn6 tn6Var = cvlVar.p;
        return new eul(str2, str3, str4, (tn6Var == null || (linkedList = tn6Var.b) == null || (coverPath = (CoverPath) CollectionsKt.firstOrNull(linkedList)) == null || (uri = coverPath.getUri()) == null) ? null : new u9b(uri, null, null), str);
    }

    public static final eu7 K(xsu xsuVar) {
        int size;
        int i;
        xsuVar.getClass();
        if (xsuVar.equals(rsu.a) || (xsuVar instanceof qsu)) {
            return new eu7(new cu7(y4b.a, c5b.a), new du7(-1, -1));
        }
        if (!(xsuVar instanceof wsu)) {
            b6e.s();
            return null;
        }
        wsu wsuVar = (wsu) xsuVar;
        List list = wsuVar.a;
        vsu vsuVar = wsuVar.c;
        if (vsuVar instanceof ssu) {
            ssu ssuVar = (ssu) vsuVar;
            size = ssuVar.a;
            i = ssuVar.b;
        } else {
            if (vsuVar instanceof tsu) {
                size = u75.g(list);
            } else {
                if (!Intrinsics.d(vsuVar, usu.a)) {
                    b6e.s();
                    return null;
                }
                size = list.size();
            }
            i = size;
        }
        eu7 eu7Var = new eu7(new cu7(new km7(list), wsuVar.b), new du7(size, i));
        teq teqVar = wsuVar.d;
        if (teqVar instanceof seq) {
            seq seqVar = (seq) teqVar;
            eu7Var = ksw.M(eu7Var, true, null, seqVar.a, seqVar.b, 2);
        } else if (!teqVar.equals(req.a)) {
            b6e.s();
            return null;
        }
        return bow.B(eu7Var, wsuVar.e);
    }

    public static final oxs L(fss fssVar) {
        fssVar.getClass();
        Boolean bool = fssVar.a;
        dss dssVar = fssVar.b;
        return new oxs(bool, dssVar != null ? new vzg(dssVar.a, dssVar.b) : null);
    }

    public static final iow M(int i) {
        if (i == 0) {
            throw null;
        }
        switch (ouj.D(i)) {
            case 0:
                return iow.a;
            case 1:
                return iow.b;
            case 2:
                return iow.c;
            case 3:
                return iow.d;
            case 4:
                return iow.e;
            case 5:
                return iow.f;
            case 6:
                return iow.g;
            case 7:
                return iow.h;
            case 8:
                return iow.a;
            default:
                b6e.s();
                return null;
        }
    }

    public static final y4q N(xsu xsuVar, iyu iyuVar) {
        xsuVar.getClass();
        iyuVar.getClass();
        return new y4q(new wnu(btf.b(new wfs(24, iyuVar)), m(xsuVar)), iyuVar.b);
    }

    public static final int O(iow iowVar) {
        switch (iowVar.ordinal()) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                b6e.s();
                return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:214:0x03e2, code lost:
    
        if (r4.isEmpty() == false) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x03f8, code lost:
    
        if (r4.isEmpty() == false) goto L235;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x020f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[LOOP:3: B:117:0x01c5->B:138:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x064c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [jyh] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [i8w] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r22v2, types: [vcm] */
    /* JADX WARN: Type inference failed for: r3v11, types: [ifn] */
    /* JADX WARN: Type inference failed for: r3v17, types: [w20] */
    /* JADX WARN: Type inference failed for: r3v24, types: [t3t] */
    /* JADX WARN: Type inference failed for: r3v28, types: [tcm, zwl] */
    /* JADX WARN: Type inference failed for: r3v31, types: [n94] */
    /* JADX WARN: Type inference failed for: r3v38, types: [o4m] */
    /* JADX WARN: Type inference failed for: r3v42, types: [sxm] */
    /* JADX WARN: Type inference failed for: r3v44, types: [h8w] */
    /* JADX WARN: Type inference failed for: r3v47, types: [lyh] */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v53, types: [kyh] */
    /* JADX WARN: Type inference failed for: r3v62, types: [fg6] */
    /* JADX WARN: Type inference failed for: r3v74 */
    /* JADX WARN: Type inference failed for: r3v75 */
    /* JADX WARN: Type inference failed for: r3v8, types: [exh] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25, types: [g8w] */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v36, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v11, types: [ypt] */
    /* JADX WARN: Type inference failed for: r7v14, types: [ypt] */
    /* JADX WARN: Type inference failed for: r7v4, types: [ypt] */
    /* JADX WARN: Type inference failed for: r7v8, types: [ypt] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v11, types: [s4m, srl] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static vcm P(PodcastsCatalogDto podcastsCatalogDto) {
        Iterator it;
        Throwable th;
        Throwable th2;
        String id;
        String id2;
        String id3;
        String id4;
        vcm vcmVar;
        Object obj;
        String id5;
        String id6;
        Throwable th3;
        String id7;
        String id8;
        String id9;
        List entities;
        ?? r6;
        Object obj2;
        YandexBooksBannerDataDto data;
        String id10;
        List entities2;
        Iterator it2;
        Throwable th4;
        MenuTabsBlockDto menuTabsBlockDto;
        String str;
        Object obj3;
        ?? r13;
        String title;
        String urlScheme;
        Throwable th5;
        String id11;
        l94 l94Var = l94.a;
        podcastsCatalogDto.getClass();
        vcm vcmVar2 = new vcm(podcastsCatalogDto.getTitle(), "main", l94Var, c5b.a);
        List blocks = podcastsCatalogDto.getBlocks();
        Throwable th6 = null;
        if (blocks == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it3 = blocks.iterator();
        int i = 0;
        while (it3.hasNext()) {
            Object next = it3.next();
            int i2 = i + 1;
            if (i < 0) {
                Throwable th7 = th6;
                u75.n();
                throw th7;
            }
            PodcastsBlockDto podcastsBlockDto = (PodcastsBlockDto) next;
            if (podcastsBlockDto != null) {
                if (podcastsBlockDto instanceof ContinueListenBlockDto) {
                    ContinueListenBlockDto continueListenBlockDto = (ContinueListenBlockDto) podcastsBlockDto;
                    String title2 = continueListenBlockDto.getTitle();
                    String typeForFrom = continueListenBlockDto.getTypeForFrom();
                    if (typeForFrom != null && (id11 = continueListenBlockDto.getId()) != null) {
                        c5b c5bVar = c5b.a;
                        bs4 bs4Var = g94.b;
                        String type = continueListenBlockDto.getType();
                        bs4Var.getClass();
                        g94 r = bs4.r(type);
                        if (r != null) {
                            c5bVar.getClass();
                            List entities3 = continueListenBlockDto.getEntities();
                            if (entities3 != null) {
                                ArrayList arrayList2 = new ArrayList();
                                int i3 = 0;
                                for (Object obj4 : entities3) {
                                    int i4 = i3 + 1;
                                    if (i3 < 0) {
                                        u75.n();
                                        throw th6;
                                    }
                                    MyShelfBlockElementDto myShelfBlockElementDto = (MyShelfBlockElementDto) obj4;
                                    Object a = myShelfBlockElementDto != null ? ru.yandex.music.nonmusic.shelf.data.a.a(myShelfBlockElementDto, i3) : th6;
                                    if (a != null) {
                                        arrayList2.add(a);
                                    }
                                    i3 = i4;
                                }
                                boolean isEmpty = arrayList2.isEmpty();
                                ?? r62 = arrayList2;
                                if (isEmpty) {
                                    r62 = th6;
                                }
                                if (r62 != 0) {
                                    it = it3;
                                    th = th6;
                                    th5 = new fg6(title2, id11, r62, vcmVar2, i, r, typeForFrom);
                                }
                            }
                        }
                    }
                    it = it3;
                    th = th6;
                    th5 = th;
                } else if (podcastsBlockDto instanceof MenuTabsBlockDto) {
                    MenuTabsBlockDto menuTabsBlockDto2 = (MenuTabsBlockDto) podcastsBlockDto;
                    String title3 = menuTabsBlockDto2.getTitle();
                    String typeForFrom2 = menuTabsBlockDto2.getTypeForFrom();
                    if (typeForFrom2 != null && (id10 = menuTabsBlockDto2.getId()) != null && (entities2 = menuTabsBlockDto2.getEntities()) != null) {
                        ArrayList arrayList3 = new ArrayList();
                        int i5 = 0;
                        for (Object obj5 : entities2) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                Throwable th8 = th6;
                                u75.n();
                                throw th8;
                            }
                            MenuTabDto menuTabDto = (MenuTabDto) obj5;
                            if (menuTabDto != null) {
                                th4 = th6;
                                String id12 = menuTabDto.getId();
                                MenuTabDataDto data2 = menuTabDto.getData();
                                if (data2 != null) {
                                    it2 = it3;
                                    String id13 = data2.getId();
                                    menuTabsBlockDto = menuTabsBlockDto2;
                                    String type2 = data2.getType();
                                    str = title3;
                                    if (type2 != null) {
                                        ?? r3 = type2.equals("bookmate-books") ? kyh.a : type2.equals("bookmate-podcasts") ? kyh.b : th4;
                                        if (r3 != 0 && (title = data2.getTitle()) != null && (urlScheme = data2.getUrlScheme()) != null) {
                                            r13 = new jyh(id13, r3, title, urlScheme);
                                            if (r13 != 0) {
                                                obj3 = new iyh(id12, r13, i5);
                                                if (obj3 == null) {
                                                    arrayList3.add(obj3);
                                                }
                                                th6 = th4;
                                                i5 = i6;
                                                menuTabsBlockDto2 = menuTabsBlockDto;
                                                title3 = str;
                                                it3 = it2;
                                            }
                                            obj3 = th4;
                                            if (obj3 == null) {
                                            }
                                            th6 = th4;
                                            i5 = i6;
                                            menuTabsBlockDto2 = menuTabsBlockDto;
                                            title3 = str;
                                            it3 = it2;
                                        }
                                    }
                                    r13 = th4;
                                    if (r13 != 0) {
                                    }
                                    obj3 = th4;
                                    if (obj3 == null) {
                                    }
                                    th6 = th4;
                                    i5 = i6;
                                    menuTabsBlockDto2 = menuTabsBlockDto;
                                    title3 = str;
                                    it3 = it2;
                                } else {
                                    it2 = it3;
                                }
                            } else {
                                it2 = it3;
                                th4 = th6;
                            }
                            menuTabsBlockDto = menuTabsBlockDto2;
                            str = title3;
                            obj3 = th4;
                            if (obj3 == null) {
                            }
                            th6 = th4;
                            i5 = i6;
                            menuTabsBlockDto2 = menuTabsBlockDto;
                            title3 = str;
                            it3 = it2;
                        }
                        it = it3;
                        th = th6;
                        MenuTabsBlockDto menuTabsBlockDto3 = menuTabsBlockDto2;
                        String str2 = title3;
                        ?? r63 = !arrayList3.isEmpty() ? arrayList3 : th;
                        if (r63 != 0) {
                            bs4 bs4Var2 = g94.b;
                            String type3 = menuTabsBlockDto3.getType();
                            bs4Var2.getClass();
                            g94 r2 = bs4.r(type3);
                            if (r2 != null) {
                                th5 = new lyh(str2, id10, r63, vcmVar2, i, r2, typeForFrom2);
                            }
                        }
                        th5 = th;
                    }
                    it = it3;
                    th = th6;
                    th5 = th;
                } else {
                    it = it3;
                    th = th6;
                    if (podcastsBlockDto instanceof YandexBooksBannerBlockDto) {
                        YandexBooksBannerBlockDto yandexBooksBannerBlockDto = (YandexBooksBannerBlockDto) podcastsBlockDto;
                        String title4 = yandexBooksBannerBlockDto.getTitle();
                        String typeForFrom3 = yandexBooksBannerBlockDto.getTypeForFrom();
                        if (typeForFrom3 != null && (id9 = yandexBooksBannerBlockDto.getId()) != null && (entities = yandexBooksBannerBlockDto.getEntities()) != null) {
                            Iterator it4 = entities.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    r6 = th;
                                    break;
                                }
                                YandexBooksBannerDto yandexBooksBannerDto = (YandexBooksBannerDto) it4.next();
                                if (yandexBooksBannerDto != null) {
                                    String id14 = yandexBooksBannerDto.getId();
                                    String type4 = yandexBooksBannerDto.getType();
                                    if (type4 != null && (data = yandexBooksBannerDto.getData()) != null) {
                                        String text = data.getText();
                                        ?? i8wVar = text == null ? th : new i8w(text, data.getButtonText(), data.getUrlScheme());
                                        if (i8wVar != 0) {
                                            obj2 = new g8w(id14, type4, i8wVar, i, vcmVar2.a);
                                            if (obj2 == null) {
                                                r6 = obj2;
                                                break;
                                            }
                                        }
                                    }
                                }
                                obj2 = th;
                                if (obj2 == null) {
                                }
                            }
                            if (r6 != 0) {
                                bs4 bs4Var3 = g94.b;
                                String type5 = yandexBooksBannerBlockDto.getType();
                                bs4Var3.getClass();
                                g94 r4 = bs4.r(type5);
                                if (r4 != null) {
                                    th5 = new h8w(title4, id9, r6, vcmVar2, i, r4, typeForFrom3);
                                }
                            }
                        }
                        th5 = th;
                    } else if (podcastsBlockDto instanceof PromotionsPodcastsBlockDto) {
                        PromotionsPodcastsBlockDto promotionsPodcastsBlockDto = (PromotionsPodcastsBlockDto) podcastsBlockDto;
                        String title5 = promotionsPodcastsBlockDto.getTitle();
                        String typeForFrom4 = promotionsPodcastsBlockDto.getTypeForFrom();
                        if (typeForFrom4 != null && (id8 = promotionsPodcastsBlockDto.getId()) != null) {
                            c5b c5bVar2 = c5b.a;
                            bs4 bs4Var4 = g94.b;
                            String type6 = promotionsPodcastsBlockDto.getType();
                            bs4Var4.getClass();
                            g94 r5 = bs4.r(type6);
                            if (r5 != null) {
                                sxm sxmVar = new sxm(title5, id8, c5bVar2, vcmVar2, i, r5, typeForFrom4);
                                List entities4 = promotionsPodcastsBlockDto.getEntities();
                                if (entities4 != null) {
                                    List k = jhp.k(jhp.h(new lcc(new wz0(1, entities4), true, h01.v), new ucm(1, sxmVar)));
                                    if (k != null) {
                                        ?? r64 = !k.isEmpty() ? k : th;
                                        if (r64 != 0) {
                                            th5 = new sxm(title5, id8, r64, vcmVar2, i, r5, typeForFrom4);
                                        }
                                    }
                                }
                            }
                        }
                        th5 = th;
                    } else if (podcastsBlockDto instanceof PlaylistsAlbumsPodcastsBlockDto) {
                        PlaylistsAlbumsPodcastsBlockDto playlistsAlbumsPodcastsBlockDto = (PlaylistsAlbumsPodcastsBlockDto) podcastsBlockDto;
                        String title6 = playlistsAlbumsPodcastsBlockDto.getTitle();
                        String typeForFrom5 = playlistsAlbumsPodcastsBlockDto.getTypeForFrom();
                        if (typeForFrom5 != null && (id7 = playlistsAlbumsPodcastsBlockDto.getId()) != null) {
                            String description = playlistsAlbumsPodcastsBlockDto.getDescription();
                            String viewAllUrlScheme = playlistsAlbumsPodcastsBlockDto.getViewAllUrlScheme();
                            Object a2 = viewAllUrlScheme != null ? fqt.a(viewAllUrlScheme, true, false) : th;
                            int i7 = i;
                            c5b c5bVar3 = c5b.a;
                            bs4 bs4Var5 = g94.b;
                            String type7 = playlistsAlbumsPodcastsBlockDto.getType();
                            bs4Var5.getClass();
                            g94 r7 = bs4.r(type7);
                            if (r7 != null) {
                                vcm vcmVar3 = vcmVar2;
                                ?? r72 = a2;
                                o4m o4mVar = new o4m(title6, id7, description, r72, c5bVar3, vcmVar3, i7, r7, typeForFrom5);
                                vcmVar2 = vcmVar3;
                                List entities5 = playlistsAlbumsPodcastsBlockDto.getEntities();
                                if (entities5 != null) {
                                    Object k2 = jhp.k(jhp.h(new lcc(new wz0(1, entities5), true, h01.x), new ykf(28, o4mVar)));
                                    if (k2 != null) {
                                        boolean isEmpty2 = ((Collection) k2).isEmpty();
                                        Object obj6 = k2;
                                        if (isEmpty2) {
                                            obj6 = th;
                                        }
                                        if (obj6 != null) {
                                            vcmVar = vcmVar2;
                                            th3 = new o4m(title6, id7, description, r72, obj6, vcmVar, i7, r7, typeForFrom5);
                                            vcmVar2 = vcmVar;
                                            th5 = th3;
                                        }
                                    }
                                }
                            }
                        }
                        th5 = th;
                    } else if (podcastsBlockDto instanceof CategoriesPodcastsBlockDto) {
                        CategoriesPodcastsBlockDto categoriesPodcastsBlockDto = (CategoriesPodcastsBlockDto) podcastsBlockDto;
                        String title7 = categoriesPodcastsBlockDto.getTitle();
                        String typeForFrom6 = categoriesPodcastsBlockDto.getTypeForFrom();
                        if (typeForFrom6 != null && (id6 = categoriesPodcastsBlockDto.getId()) != null) {
                            c5b c5bVar4 = c5b.a;
                            bs4 bs4Var6 = g94.b;
                            String type8 = categoriesPodcastsBlockDto.getType();
                            bs4Var6.getClass();
                            g94 r8 = bs4.r(type8);
                            if (r8 != null) {
                                n94 n94Var = new n94(title7, id6, c5bVar4, vcmVar2, i, r8, typeForFrom6);
                                List entities6 = categoriesPodcastsBlockDto.getEntities();
                                if (entities6 != null) {
                                    List k3 = jhp.k(jhp.h(new lcc(new wz0(1, entities6), true, h01.y), new ykf(27, n94Var)));
                                    if (k3 != null) {
                                        ?? r65 = !k3.isEmpty() ? k3 : th;
                                        if (r65 != 0) {
                                            th5 = new n94(title7, id6, r65, vcmVar2, i, r8, typeForFrom6);
                                        }
                                    }
                                }
                            }
                        }
                        th5 = th;
                    } else {
                        if (podcastsBlockDto instanceof PlaylistPodcastsBlockDto) {
                            PlaylistPodcastsBlockDto playlistPodcastsBlockDto = (PlaylistPodcastsBlockDto) podcastsBlockDto;
                            List entities7 = playlistPodcastsBlockDto.getEntities();
                            if (entities7 != null) {
                                obj = (s4m) jhp.f(jhp.e(new o7t(new lcc(new wz0(1, entities7), true, h01.w), new fam(6))));
                                if (obj != null) {
                                    if (obj instanceof tmk) {
                                        List list = ((tmk) obj).a.b.c;
                                        if (list != null) {
                                        }
                                    } else {
                                        if (!(obj instanceof axl)) {
                                            b6e.s();
                                            return null;
                                        }
                                        List list2 = ((axl) obj).a.c;
                                        if (list2 != null) {
                                        }
                                    }
                                }
                            }
                            obj = th;
                            String title8 = playlistPodcastsBlockDto.getTitle();
                            String description2 = playlistPodcastsBlockDto.getDescription();
                            String typeForFrom7 = playlistPodcastsBlockDto.getTypeForFrom();
                            if (typeForFrom7 != null && (id5 = playlistPodcastsBlockDto.getId()) != null) {
                                String viewAllUrlScheme2 = playlistPodcastsBlockDto.getViewAllUrlScheme();
                                Object a3 = viewAllUrlScheme2 != null ? fqt.a(viewAllUrlScheme2, true, false) : th;
                                bs4 bs4Var7 = g94.b;
                                String type9 = playlistPodcastsBlockDto.getType();
                                bs4Var7.getClass();
                                g94 r9 = bs4.r(type9);
                                if (r9 != null && obj != null) {
                                    vcm vcmVar4 = vcmVar2;
                                    int i8 = i;
                                    ?? r82 = obj;
                                    ?? zwlVar = new zwl(title8, description2, id5, a3, r82, vcmVar4, i8, r9, typeForFrom7);
                                    vcmVar2 = vcmVar4;
                                    r82.n0(zwlVar);
                                    th5 = zwlVar;
                                }
                            }
                        } else if (podcastsBlockDto instanceof TracksChartBlockDto) {
                            TracksChartBlockDto tracksChartBlockDto = (TracksChartBlockDto) podcastsBlockDto;
                            String title9 = tracksChartBlockDto.getTitle();
                            String description3 = tracksChartBlockDto.getDescription();
                            String typeForFrom8 = tracksChartBlockDto.getTypeForFrom();
                            if (typeForFrom8 != null && (id4 = tracksChartBlockDto.getId()) != null) {
                                String viewAllUrlScheme3 = tracksChartBlockDto.getViewAllUrlScheme();
                                Object a4 = viewAllUrlScheme3 != null ? fqt.a(viewAllUrlScheme3, true, false) : th;
                                int i9 = i;
                                c5b c5bVar5 = c5b.a;
                                bs4 bs4Var8 = g94.b;
                                String type10 = tracksChartBlockDto.getType();
                                bs4Var8.getClass();
                                g94 r10 = bs4.r(type10);
                                if (r10 != null) {
                                    vcm vcmVar5 = vcmVar2;
                                    ?? r73 = a4;
                                    t3t t3tVar = new t3t(title9, description3, id4, r73, c5bVar5, vcmVar5, i9, r10, typeForFrom8);
                                    vcmVar2 = vcmVar5;
                                    List entities8 = tracksChartBlockDto.getEntities();
                                    if (entities8 != null) {
                                        Object k4 = jhp.k(jhp.h(new lcc(new wz0(1, entities8), true, h01.z), new ucm(2, t3tVar)));
                                        if (k4 != null) {
                                            boolean isEmpty3 = ((Collection) k4).isEmpty();
                                            Object obj7 = k4;
                                            if (isEmpty3) {
                                                obj7 = th;
                                            }
                                            if (obj7 != null) {
                                                vcmVar = vcmVar2;
                                                th3 = new t3t(title9, description3, id4, r73, obj7, vcmVar, i9, r10, typeForFrom8);
                                                vcmVar2 = vcmVar;
                                                th5 = th3;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (podcastsBlockDto instanceof AlbumsChartBlockDto) {
                                AlbumsChartBlockDto albumsChartBlockDto = (AlbumsChartBlockDto) podcastsBlockDto;
                                String title10 = albumsChartBlockDto.getTitle();
                                String description4 = albumsChartBlockDto.getDescription();
                                String typeForFrom9 = albumsChartBlockDto.getTypeForFrom();
                                if (typeForFrom9 != null && (id3 = albumsChartBlockDto.getId()) != null) {
                                    String viewAllUrlScheme4 = albumsChartBlockDto.getViewAllUrlScheme();
                                    Object a5 = viewAllUrlScheme4 != null ? fqt.a(viewAllUrlScheme4, true, false) : th;
                                    int i10 = i;
                                    c5b c5bVar6 = c5b.a;
                                    bs4 bs4Var9 = g94.b;
                                    String type11 = albumsChartBlockDto.getType();
                                    bs4Var9.getClass();
                                    g94 r11 = bs4.r(type11);
                                    if (r11 != null) {
                                        vcm vcmVar6 = vcmVar2;
                                        ?? r74 = a5;
                                        w20 w20Var = new w20(title10, description4, id3, r74, c5bVar6, vcmVar6, i10, r11, typeForFrom9);
                                        vcmVar2 = vcmVar6;
                                        List entities9 = albumsChartBlockDto.getEntities();
                                        if (entities9 != null) {
                                            Object k5 = jhp.k(jhp.h(new lcc(new wz0(1, entities9), true, h01.A), new ykf(29, w20Var)));
                                            if (k5 != null) {
                                                boolean isEmpty4 = ((Collection) k5).isEmpty();
                                                Object obj8 = k5;
                                                if (isEmpty4) {
                                                    obj8 = th;
                                                }
                                                if (obj8 != null) {
                                                    ?? w20Var2 = new w20(title10, description4, id3, r74, obj8, vcmVar2, i10, r11, typeForFrom9);
                                                    vcmVar2 = vcmVar2;
                                                    th2 = w20Var2;
                                                }
                                            }
                                        }
                                    }
                                    th2 = th;
                                }
                            } else if (podcastsBlockDto instanceof RadioBlockDto) {
                                RadioBlockDto radioBlockDto = (RadioBlockDto) podcastsBlockDto;
                                String title11 = radioBlockDto.getTitle();
                                String typeForFrom10 = radioBlockDto.getTypeForFrom();
                                if (typeForFrom10 != null && (id2 = radioBlockDto.getId()) != null) {
                                    c5b c5bVar7 = c5b.a;
                                    bs4 bs4Var10 = g94.b;
                                    String type12 = radioBlockDto.getType();
                                    bs4Var10.getClass();
                                    g94 r12 = bs4.r(type12);
                                    if (r12 != null) {
                                        ifn ifnVar = new ifn(title11, id2, c5bVar7, vcmVar2, i, r12, typeForFrom10);
                                        List entities10 = radioBlockDto.getEntities();
                                        if (entities10 != null) {
                                            List k6 = jhp.k(jhp.h(new lcc(new wz0(1, entities10), true, h01.B), new ucm(0, ifnVar)));
                                            if (k6 != null) {
                                                ?? r66 = !k6.isEmpty() ? k6 : th;
                                                if (r66 != 0) {
                                                    th2 = new ifn(title11, id2, r66, vcmVar2, i, r12, typeForFrom10);
                                                }
                                            }
                                        }
                                    }
                                }
                                th2 = th;
                            } else {
                                if (!(podcastsBlockDto instanceof MenuBlockDto)) {
                                    b6e.s();
                                    return null;
                                }
                                MenuBlockDto menuBlockDto = (MenuBlockDto) podcastsBlockDto;
                                bs4 bs4Var11 = g94.b;
                                String type13 = menuBlockDto.getType();
                                bs4Var11.getClass();
                                g94 r14 = bs4.r(type13);
                                if (r14 != null) {
                                    String title12 = menuBlockDto.getTitle();
                                    String typeForFrom11 = menuBlockDto.getTypeForFrom();
                                    if (typeForFrom11 != null && (id = menuBlockDto.getId()) != null) {
                                        exh exhVar = new exh(title12, id, c5b.a, vcmVar2, i, r14, typeForFrom11);
                                        List entities11 = menuBlockDto.getEntities();
                                        if (entities11 != null) {
                                            List k7 = jhp.k(jhp.h(new lcc(new wz0(1, entities11), true, h01.C), new ucm(3, exhVar)));
                                            if (k7 != null) {
                                                ?? r67 = !k7.isEmpty() ? k7 : th;
                                                if (r67 != 0) {
                                                    th2 = new exh(title12, id, r67, vcmVar2, i, r14, typeForFrom11);
                                                }
                                            }
                                        }
                                    }
                                }
                                th2 = th;
                            }
                            if (th2 != null) {
                                arrayList.add(th2);
                            }
                            th6 = th;
                            i = i2;
                            it3 = it;
                        }
                        th5 = th;
                    }
                }
                th2 = th5;
                if (th2 != null) {
                }
                th6 = th;
                i = i2;
                it3 = it;
            } else {
                it = it3;
                th = th6;
            }
            th2 = th;
            if (th2 != null) {
            }
            th6 = th;
            i = i2;
            it3 = it;
        }
        ?? r22 = th6;
        if (arrayList.isEmpty()) {
            arrayList = r22;
        }
        return arrayList != null ? vcm.a(vcmVar2, arrayList) : r22;
    }

    public static yci Q(yci yciVar, two twoVar, boolean z, int i) {
        if ((i & 2) != 0) {
            z = true;
        }
        return G(yciVar, twoVar, z, true);
    }

    public static int R(u5x u5xVar) {
        Iterator it = u5xVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    public static final void a(String str, jzb jzbVar, boolean z, e9g e9gVar, hq5 hq5Var, int i) {
        str.getClass();
        e9gVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1583252516);
        int i2 = i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.d(jzbVar == null ? -1 : jzbVar.ordinal()) ? 32 : 16) | (oq5Var.g(z) ? 256 : 128) | (oq5Var.d(e9gVar.ordinal()) ? 2048 : 1024);
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            bg3.a(null, null, false, ild.C(236690098, new pu(z, jzbVar, str, e9gVar, 8), oq5Var), oq5Var, 3072, 7);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new s43(str, jzbVar, z, e9gVar, i, 22);
        }
    }

    public static final void b(String str, String str2, String str3, yci yciVar, hq5 hq5Var, int i) {
        ach achVar;
        xmn r;
        wbh wbhVar;
        yci yciVar2 = yciVar;
        str2.getClass();
        str3.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1043994887);
        int i2 = i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.f(str2) ? 32 : 16) | (oq5Var.f(str3) ? 256 : 128) | (oq5Var.f(yciVar2) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            agr agrVar = koe.a;
            if (((Boolean) oq5Var.j(agrVar)).booleanValue()) {
                oq5Var.Z(1793668610);
                swf.d(qo6.k, gce.d, yciVar, null, 0L, 0L, false, oq5Var, ((i2 >> 3) & 896) | 54, 120);
                oq5Var.p(false);
                r = oq5Var.r();
                if (r != null) {
                    wbhVar = new wbh(str, str2, str3, yciVar, i, 0);
                    r.d = wbhVar;
                }
                return;
            }
            oq5Var.Z(1792867291);
            oq5Var.p(false);
            cce cceVar = (cce) oq5Var.j(tkg.a);
            int i3 = ((i2 << 3) & 112) | (i2 & 896) | ((i2 << 6) & 7168);
            cceVar.getClass();
            oq5Var.Z(1778002851);
            if (((Boolean) oq5Var.j(agrVar)).booleanValue()) {
                achVar = new jzk(1);
                oq5Var.p(false);
            } else {
                Object K = oq5Var.K();
                kjn kjnVar = gq5.a;
                if (K == kjnVar) {
                    K = new fs5(gld.R(dm6.b(), oq5Var));
                    oq5Var.k0(K);
                }
                mm6 mm6Var = ((fs5) K).a;
                Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
                boolean z = true;
                boolean f = ((((i3 & 112) ^ 48) > 32 && oq5Var.f(str)) || (i3 & 48) == 32) | oq5Var.f(context) | oq5Var.f(mm6Var) | ((((i3 & 896) ^ 384) > 256 && oq5Var.f(str3)) || (i3 & 384) == 256);
                if ((((i3 & 7168) ^ 3072) <= 2048 || !oq5Var.f(str2)) && (i3 & 3072) != 2048) {
                    z = false;
                }
                boolean f2 = f | z | oq5Var.f(cceVar);
                Object K2 = oq5Var.K();
                if (f2 || K2 == kjnVar) {
                    dch dchVar = new dch(context, cceVar, mm6Var, str, str3, str2);
                    oq5Var.k0(dchVar);
                    K2 = dchVar;
                }
                achVar = (dch) K2;
                oq5Var.p(false);
            }
            zbh d = achVar.d();
            if (d instanceof ybh) {
                oq5Var.Z(1794230237);
                irf.r(((ybh) d).a, null, yciVar, null, hd6.a, 0.0f, null, oq5Var, ((i2 >> 3) & 896) | 24624, 104);
                oq5Var.p(false);
                yciVar2 = yciVar;
            } else if (Intrinsics.d(d, xbh.a)) {
                oq5Var.Z(1794495225);
                swf.d(qo6.k, gce.d, yciVar, null, 0L, 0L, false, oq5Var, ((i2 >> 3) & 896) | 54, 120);
                yciVar2 = yciVar;
                oq5Var.p(false);
            } else {
                yciVar2 = yciVar;
                if (!Intrinsics.d(d, xbh.b)) {
                    throw vz1.i(oq5Var, -1743241144, false);
                }
                oq5Var.Z(1794751719);
                swf.e((i2 >> 9) & 14, 0, oq5Var, yciVar2);
                oq5Var.p(false);
            }
        }
        r = oq5Var.r();
        if (r != null) {
            wbhVar = new wbh(str, str2, str3, yciVar2, i, 1);
            r.d = wbhVar;
        }
    }

    public static final void c(l8i l8iVar, p7i p7iVar, hq5 hq5Var, int i) {
        l8iVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1306272914);
        int i2 = (oq5Var.f(l8iVar) ? 4 : 2) | i | (oq5Var.f(p7iVar) ? 32 : 16);
        if (!oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            oq5Var.S();
        } else if (p7iVar instanceof o7i) {
            oq5Var.Z(-1522124245);
            e(l8iVar, ((o7i) p7iVar).a, null, oq5Var, i2 & 14);
            oq5Var.p(false);
        } else {
            if (!(p7iVar instanceof n7i)) {
                throw vz1.i(oq5Var, 1197823620, false);
            }
            oq5Var.Z(-1521946832);
            n7i n7iVar = (n7i) p7iVar;
            d(n7iVar.a, n7iVar.b, null, oq5Var, 0);
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new m2g(l8iVar, p7iVar, i, 6);
        }
    }

    public static final void d(ArrayList arrayList, boolean z, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-434332451);
        int i2 = i | (oq5Var.f(arrayList) ? 4 : 2) | (oq5Var.g(z) ? 32 : 16) | 384;
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            vci vciVar = vci.a;
            yci d = d.d(vciVar, 1.0f);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new p1i(9);
                oq5Var.k0(K);
            }
            yci a = nfp.a(d, (Function1) K);
            int i3 = irv.h(oq5Var) ? 8 : 2;
            float f = 16;
            q0k a2 = androidx.compose.foundation.layout.a.a(f, 0.0f, 2);
            float f2 = lqd.a;
            lqd.a(arrayList, a, i3, a2, new mqd(f, f), ild.C(1479142053, new xu0(12, z), oq5Var), oq5Var, (i2 & 14) | 199680);
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x7i(arrayList, z, yciVar2, i, 0);
        }
    }

    public static final void e(l8i l8iVar, List list, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        l8iVar.getClass();
        list.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(53068800);
        int i2 = i | (oq5Var.f(l8iVar) ? 4 : 2) | (oq5Var.f(list) ? 32 : 16) | 384;
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            ynn i3 = irv.i(oq5Var);
            vci vciVar = vci.a;
            yci d = d.d(vciVar, 1.0f);
            int i4 = irv.h(oq5Var) ? 8 : 2;
            float f = 16;
            q0k a = androidx.compose.foundation.layout.a.a(f, 0.0f, 2);
            float f2 = lqd.a;
            lqd.b(list, d, i4, a, new mqd(f, f), ild.C(1622885421, new jv(10, i3, l8iVar), oq5Var), oq5Var, ((i2 >> 3) & 14) | 199680, 0);
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q6h(l8iVar, list, yciVar2, i, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(final boolean z, final Function0 function0, o0k o0kVar, o0k o0kVar2, boolean z2, final wn5 wn5Var, hq5 hq5Var, final int i, final int i2) {
        int i3;
        o0k o0kVar3;
        int i4;
        o0k o0kVar4;
        int i5;
        boolean z3;
        o0k o0kVar5;
        float f;
        final o0k o0kVar6;
        final o0k o0kVar7;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1530863782);
        if ((i & 6) == 0) {
            i3 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.h(function0) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            o0kVar3 = o0kVar;
            i3 |= oq5Var.f(o0kVar3) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                o0kVar4 = o0kVar2;
                i3 |= oq5Var.f(o0kVar4) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    z3 = z2;
                    i3 |= oq5Var.g(z3) ? 16384 : RemoteCameraConfig.Notification.ID;
                    if ((196608 & i) == 0) {
                        i3 |= oq5Var.h(wn5Var) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                    }
                    if ((74899 & i3) == 74898 || !oq5Var.z()) {
                        if (i6 != 0) {
                            float f2 = 0;
                            o0kVar3 = new q0k(f2, f2, f2, f2);
                        }
                        o0k o0kVar8 = o0kVar3;
                        if (i4 == 0) {
                            float f3 = 0;
                            o0kVar5 = new q0k(f3, f3, f3, f3);
                        } else {
                            o0kVar5 = o0kVar4;
                        }
                        if (i5 != 0) {
                            z3 = true;
                        }
                        float d = o0kVar5.d() + u0n.b;
                        int i7 = i3 & 14;
                        f = u0n.a;
                        if (Float.compare(f, 0) > 0) {
                            xq0.x("The refresh trigger must be greater than zero!");
                            return;
                        }
                        Object K = oq5Var.K();
                        kjn kjnVar = gq5.a;
                        if (K == kjnVar) {
                            K = gld.R(g.a, oq5Var);
                            oq5Var.k0(K);
                        }
                        mm6 mm6Var = (mm6) K;
                        aqi o0 = szf.o0(function0, oq5Var);
                        uqn uqnVar = new uqn();
                        int i8 = i3;
                        uqn uqnVar2 = new uqn();
                        jx7 jx7Var = (jx7) oq5Var.j(es5.h);
                        uqnVar.a = jx7Var.n0(f);
                        uqnVar2.a = jx7Var.n0(d);
                        boolean f4 = oq5Var.f(mm6Var);
                        Object K2 = oq5Var.K();
                        if (f4 || K2 == kjnVar) {
                            K2 = new d1n(mm6Var, o0, uqnVar2.a, uqnVar.a);
                            oq5Var.k0(K2);
                        }
                        d1n d1nVar = (d1n) K2;
                        boolean h = oq5Var.h(d1nVar) | (((i7 ^ 6) > 4 && oq5Var.g(z)) || (i8 & 6) == 4) | oq5Var.c(uqnVar.a) | oq5Var.c(uqnVar2.a);
                        Object K3 = oq5Var.K();
                        if (h || K3 == kjnVar) {
                            K3 = new qbi(d1nVar, z, uqnVar, uqnVar2);
                            oq5Var.k0(K3);
                        }
                        gld.D((Function0) K3, oq5Var);
                        vci vciVar = vci.a;
                        yci c = d.c(androidx.compose.ui.input.nestedscroll.a.a(b.c(androidx.compose.ui.platform.a.a(vciVar, "swipe_refresh"), "isRefreshing", Boolean.valueOf(z)), new b1n(new bml(1, d1nVar, d1n.class, "onPull", "onPull$material_release(F)F", 0, 16), new tn5(2, d1nVar, d1n.class, "onRelease", "onRelease$material_release(F)F", 4, 1), z3), null), 1.0f);
                        kfh d2 = ug3.d(b2c.b, false);
                        int i9 = oq5Var.P;
                        androidx.compose.runtime.internal.a l = oq5Var.l();
                        yci H = vnj.H(oq5Var, c);
                        xp5.T.getClass();
                        grb grbVar = wp5.b;
                        oq5Var.d0();
                        if (oq5Var.O) {
                            oq5Var.k(grbVar);
                        } else {
                            oq5Var.n0();
                        }
                        g0g.U(oq5Var, d2, wp5.f);
                        g0g.U(oq5Var, l, wp5.e);
                        kb5 kb5Var = wp5.g;
                        if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i9))) {
                            ouj.x(i9, oq5Var, i9, kb5Var);
                        }
                        g0g.U(oq5Var, H, wp5.d);
                        wn5Var.invoke(oq5Var, Integer.valueOf((i8 >> 15) & 14));
                        yci a = androidx.compose.foundation.layout.b.a.a(androidx.compose.foundation.layout.a.l(vciVar, o0kVar8), b2c.c);
                        agr agrVar = eq0.a;
                        z0n.a(z, d1nVar, a, ((dq0) oq5Var.j(agrVar)).c.b, ((dq0) oq5Var.j(agrVar)).a.a, oq5Var, i7 | 64);
                        oq5Var.p(true);
                        o0kVar6 = o0kVar8;
                        o0kVar7 = o0kVar5;
                    } else {
                        oq5Var.S();
                        o0kVar6 = o0kVar3;
                        o0kVar7 = o0kVar4;
                    }
                    final boolean z4 = z3;
                    xmn r = oq5Var.r();
                    if (r != null) {
                        r.d = new Function2() { // from class: j0k
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                bfg.f(z, function0, o0kVar6, o0kVar7, z4, wn5Var, (hq5) obj, rvf.R(i | 1), i2);
                                return Unit.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                z3 = z2;
                if ((196608 & i) == 0) {
                }
                if ((74899 & i3) == 74898) {
                }
                if (i6 != 0) {
                }
                o0k o0kVar82 = o0kVar3;
                if (i4 == 0) {
                }
                if (i5 != 0) {
                }
                float d3 = o0kVar5.d() + u0n.b;
                int i72 = i3 & 14;
                f = u0n.a;
                if (Float.compare(f, 0) > 0) {
                }
            }
            o0kVar4 = o0kVar2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            z3 = z2;
            if ((196608 & i) == 0) {
            }
            if ((74899 & i3) == 74898) {
            }
            if (i6 != 0) {
            }
            o0k o0kVar822 = o0kVar3;
            if (i4 == 0) {
            }
            if (i5 != 0) {
            }
            float d32 = o0kVar5.d() + u0n.b;
            int i722 = i3 & 14;
            f = u0n.a;
            if (Float.compare(f, 0) > 0) {
            }
        }
        o0kVar3 = o0kVar;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        o0kVar4 = o0kVar2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        z3 = z2;
        if ((196608 & i) == 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        if (i6 != 0) {
        }
        o0k o0kVar8222 = o0kVar3;
        if (i4 == 0) {
        }
        if (i5 != 0) {
        }
        float d322 = o0kVar5.d() + u0n.b;
        int i7222 = i3 & 14;
        f = u0n.a;
        if (Float.compare(f, 0) > 0) {
        }
    }

    public static final qfp g(mpf mpfVar, boolean z) {
        xci xciVar = (xci) mpfVar.F.f;
        sv7 sv7Var = null;
        if ((xciVar.d & 8) != 0) {
            loop0: while (true) {
                if (xciVar == null) {
                    break;
                }
                if ((xciVar.c & 8) != 0) {
                    xci xciVar2 = xciVar;
                    eqi eqiVar = null;
                    while (xciVar2 != null) {
                        if (xciVar2 instanceof ofp) {
                            sv7Var = xciVar2;
                            break loop0;
                        }
                        if ((xciVar2.c & 8) != 0 && (xciVar2 instanceof cw7)) {
                            int i = 0;
                            for (xci xciVar3 = ((cw7) xciVar2).p; xciVar3 != null; xciVar3 = xciVar3.f) {
                                if ((xciVar3.c & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        xciVar2 = xciVar3;
                                    } else {
                                        if (eqiVar == null) {
                                            eqiVar = new eqi(new xci[16]);
                                        }
                                        if (xciVar2 != null) {
                                            eqiVar.d(xciVar2);
                                            xciVar2 = null;
                                        }
                                        eqiVar.d(xciVar3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        xciVar2 = bcx.p(eqiVar);
                    }
                }
                if ((xciVar.d & 8) == 0) {
                    break;
                }
                xciVar = xciVar.f;
            }
        }
        sv7Var.getClass();
        xci xciVar4 = ((xci) ((ofp) sv7Var)).a;
        jfp w = mpfVar.w();
        if (w == null) {
            w = new jfp();
        }
        return new qfp(xciVar4, z, mpfVar, w);
    }

    public static final void h(final ep4 ep4Var, final hp4 hp4Var, final boolean z, final boolean z2, final Function0 function0, final Function0 function02, final Function0 function03, final wn5 wn5Var, final wn5 wn5Var2, final yci yciVar, final e9g e9gVar, final c0g c0gVar, final Function0 function04, hq5 hq5Var, final int i, final int i2) {
        int i3;
        int i4;
        oq5 oq5Var;
        hp4Var.getClass();
        function0.getClass();
        function03.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1152898430);
        if ((i & 6) == 0) {
            i3 = (oq5Var2.d(ep4Var.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var2.d(hp4Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var2.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= oq5Var2.g(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= oq5Var2.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i & 196608) == 0) {
            i3 |= oq5Var2.h(function02) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((i & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
            i3 |= oq5Var2.h(function03) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= oq5Var2.h(wn5Var) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((i & 100663296) == 0) {
            i3 |= oq5Var2.h(wn5Var2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= oq5Var2.f(yciVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = (oq5Var2.d(e9gVar == null ? -1 : e9gVar.ordinal()) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var2.d(c0gVar.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= oq5Var2.h(function04) ? 256 : 128;
        }
        boolean z3 = true;
        if (oq5Var2.P(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 147) == 146) ? false : true)) {
            if (hp4Var == hp4.a) {
                z3 = false;
            }
            yci f = b.d(d.d(d.g(yciVar, mu0.c, 0.0f, 2), 1.0f), uah.e(new Pair("clip_selected", Boolean.valueOf(z)), new Pair("playing_state", hp4Var))).f(new ubf("com.yandex.music.design.components.clip.common.overflowCustomActions", ep4Var, function03, new f6p(8, ep4Var, function03)));
            boolean z4 = (i3 & 7168) == 2048;
            Object K = oq5Var2.K();
            if (z4 || K == gq5.a) {
                K = new i32(9, z2);
                oq5Var2.k0(K);
            }
            yci b = nfp.b(f, false, (Function1) K);
            int i5 = i3;
            int i6 = i5 >> 3;
            oq5Var = oq5Var2;
            tyf.j(z3, z, function0, b, function02, false, ild.C(-1375651795, new vl1(e9gVar, c0gVar, function04, ep4Var, function03, wn5Var, wn5Var2), oq5Var2), oq5Var, (i6 & 112) | ScreenMirroringConfig.Video.BITRATE_1_5MB | ((i5 >> 6) & 896) | (i6 & 57344), 32);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: cxq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(i | 1);
                    int R2 = rvf.R(i2);
                    bfg.h(ep4.this, hp4Var, z, z2, function0, function02, function03, wn5Var, wn5Var2, yciVar, e9gVar, c0gVar, function04, (hq5) obj, R, R2);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(k4k k4kVar, String str, lvf lvfVar, dib dibVar, v3s v3sVar, tmb tmbVar, hq5 hq5Var, int i) {
        v3s v3sVar2;
        int i2;
        kjn kjnVar;
        int i3;
        kjn kjnVar2;
        boolean z;
        kjn kjnVar3;
        kjn kjnVar4;
        boolean z2;
        Object K;
        k4kVar.getClass();
        str.getClass();
        lvfVar.getClass();
        dibVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1780834015);
        int i4 = i | (oq5Var.f(k4kVar) ? 4 : 2) | (oq5Var.f(str) ? 32 : 16) | (oq5Var.h(lvfVar) ? 256 : 128) | (oq5Var.h(dibVar) ? 2048 : 1024) | (oq5Var.f(v3sVar) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.h(tmbVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        if (oq5Var.P(i4 & 1, (i4 & 74899) != 74898)) {
            ogp.g.e(k4kVar.c, k4kVar.b != null, null, oq5Var, 4096, 4);
            int i5 = i4 & 57344;
            boolean z3 = i5 == 16384;
            Object K2 = oq5Var.K();
            kjn kjnVar5 = gq5.a;
            if (z3 || K2 == kjnVar5) {
                i2 = 57344;
                kjnVar = kjnVar5;
                i3 = i5;
                vuq vuqVar = new vuq(0, v3sVar, v3s.class, "onBackClick", "onBackClick()V", 0, 19);
                oq5Var.k0(vuqVar);
                K2 = vuqVar;
            } else {
                kjnVar = kjnVar5;
                i2 = 57344;
                i3 = i5;
            }
            Function0 function0 = (Function0) ((h9f) K2);
            boolean z4 = i3 == 16384;
            Object K3 = oq5Var.K();
            if (!z4) {
                kjn kjnVar6 = kjnVar;
                if (K3 == kjnVar6) {
                    kjnVar = kjnVar6;
                } else {
                    kjnVar2 = kjnVar6;
                    Function0 function02 = (Function0) ((h9f) K3);
                    z = i3 != 16384;
                    Object K4 = oq5Var.K();
                    if (z) {
                        kjn kjnVar7 = kjnVar2;
                        if (K4 == kjnVar7) {
                            kjnVar3 = kjnVar7;
                        } else {
                            kjnVar4 = kjnVar7;
                            Function0 function03 = (Function0) ((h9f) K4);
                            z2 = i3 == 16384;
                            K = oq5Var.K();
                            if (!z2 || K == kjnVar4) {
                                K = new vuq(0, v3sVar, v3s.class, "onRetry", "onRetry()V", 0, 22);
                                v3sVar2 = v3sVar;
                                oq5Var.k0(K);
                            } else {
                                v3sVar2 = v3sVar;
                            }
                            Function0 function04 = (Function0) ((h9f) K);
                            vm C = ghh.C(zs4.g(oq5Var), ogp.A(oq5Var));
                            wn5 C2 = ild.C(1858254239, new tik(26, v3sVar2), oq5Var);
                            int i6 = lvf.f;
                            int i7 = i4 << 3;
                            ezf.i(k4kVar, lvfVar, str, true, dibVar, function0, function02, function03, function04, tmbVar, C, C2, oq5Var, (i4 & 14) | 3136 | ((i4 >> 3) & 112) | (i7 & 896) | (i7 & i2) | 1073741824 | ((i4 << 12) & 1879048192));
                            oq5Var = oq5Var;
                        }
                    } else {
                        kjnVar3 = kjnVar2;
                    }
                    kjnVar4 = kjnVar3;
                    vuq vuqVar2 = new vuq(0, v3sVar, v3s.class, "onPullRefresh", "onPullRefresh()V", 0, 21);
                    oq5Var.k0(vuqVar2);
                    K4 = vuqVar2;
                    Function0 function032 = (Function0) ((h9f) K4);
                    if (i3 == 16384) {
                    }
                    K = oq5Var.K();
                    if (z2) {
                    }
                    K = new vuq(0, v3sVar, v3s.class, "onRetry", "onRetry()V", 0, 22);
                    v3sVar2 = v3sVar;
                    oq5Var.k0(K);
                    Function0 function042 = (Function0) ((h9f) K);
                    vm C3 = ghh.C(zs4.g(oq5Var), ogp.A(oq5Var));
                    wn5 C22 = ild.C(1858254239, new tik(26, v3sVar2), oq5Var);
                    int i62 = lvf.f;
                    int i72 = i4 << 3;
                    ezf.i(k4kVar, lvfVar, str, true, dibVar, function0, function02, function032, function042, tmbVar, C3, C22, oq5Var, (i4 & 14) | 3136 | ((i4 >> 3) & 112) | (i72 & 896) | (i72 & i2) | 1073741824 | ((i4 << 12) & 1879048192));
                    oq5Var = oq5Var;
                }
            }
            kjnVar2 = kjnVar;
            vuq vuqVar3 = new vuq(0, v3sVar, v3s.class, "onSortClick", "onSortClick()V", 0, 20);
            oq5Var.k0(vuqVar3);
            K3 = vuqVar3;
            Function0 function022 = (Function0) ((h9f) K3);
            if (i3 != 16384) {
            }
            Object K42 = oq5Var.K();
            if (z) {
            }
            kjnVar4 = kjnVar3;
            vuq vuqVar22 = new vuq(0, v3sVar, v3s.class, "onPullRefresh", "onPullRefresh()V", 0, 21);
            oq5Var.k0(vuqVar22);
            K42 = vuqVar22;
            Function0 function0322 = (Function0) ((h9f) K42);
            if (i3 == 16384) {
            }
            K = oq5Var.K();
            if (z2) {
            }
            K = new vuq(0, v3sVar, v3s.class, "onRetry", "onRetry()V", 0, 22);
            v3sVar2 = v3sVar;
            oq5Var.k0(K);
            Function0 function0422 = (Function0) ((h9f) K);
            vm C32 = ghh.C(zs4.g(oq5Var), ogp.A(oq5Var));
            wn5 C222 = ild.C(1858254239, new tik(26, v3sVar2), oq5Var);
            int i622 = lvf.f;
            int i722 = i4 << 3;
            ezf.i(k4kVar, lvfVar, str, true, dibVar, function0, function022, function0322, function0422, tmbVar, C32, C222, oq5Var, (i4 & 14) | 3136 | ((i4 >> 3) & 112) | (i722 & 896) | (i722 & i2) | 1073741824 | ((i4 << 12) & 1879048192));
            oq5Var = oq5Var;
        } else {
            v3sVar2 = v3sVar;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pr(k4kVar, str, lvfVar, dibVar, v3sVar2, tmbVar, i, 23);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(final cyv cyvVar, fvf fvfVar, rxv rxvVar, d8t d8tVar, yci yciVar, hq5 hq5Var, int i) {
        xdr xdrVar;
        vci vciVar;
        xdr xdrVar2;
        boolean z;
        yci yciVar2;
        lyv lyvVar;
        Object obj;
        oq5 oq5Var;
        rwv rwvVar;
        boolean c;
        cyvVar.getClass();
        fvfVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(866828419);
        final int i2 = 2;
        int i3 = i | (oq5Var2.f(cyvVar) ? 4 : 2) | (oq5Var2.f(fvfVar) ? 32 : 16) | (oq5Var2.f(rxvVar) ? 256 : 128) | (oq5Var2.f(d8tVar) ? 2048 : 1024) | 24576;
        if ((i3 & 9363) == 9362 && oq5Var2.z()) {
            oq5Var2.S();
            yciVar2 = yciVar;
            oq5Var = oq5Var2;
        } else {
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = tlm.f(gld.R(g.a, oq5Var2), oq5Var2);
            }
            mm6 mm6Var = ((fs5) K).a;
            int i4 = i3 & 14;
            final int i5 = 1;
            final int i6 = 0;
            Object[] objArr = i4 == 4;
            Object K2 = oq5Var2.K();
            if (objArr != false || K2 == kjnVar) {
                K2 = new Function0() { // from class: txv
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i6) {
                            case 0:
                                ((j1w) cyvVar.c.a).a.m0();
                                break;
                            case 1:
                                ((j1w) cyvVar.c.a).a.l0();
                                break;
                            default:
                                ((j1w) cyvVar.c.a).a.l0();
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var2.k0(K2);
            }
            Function0 function0 = (Function0) K2;
            Object[] objArr2 = i4 == 4;
            Object K3 = oq5Var2.K();
            if (objArr2 != false || K3 == kjnVar) {
                K3 = new Function0() { // from class: txv
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i5) {
                            case 0:
                                ((j1w) cyvVar.c.a).a.m0();
                                break;
                            case 1:
                                ((j1w) cyvVar.c.a).a.l0();
                                break;
                            default:
                                ((j1w) cyvVar.c.a).a.l0();
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var2.k0(K3);
            }
            Function0 function02 = (Function0) K3;
            Object[] objArr3 = i4 == 4;
            Object K4 = oq5Var2.K();
            if (objArr3 != false || K4 == kjnVar) {
                K4 = new Function0() { // from class: txv
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                ((j1w) cyvVar.c.a).a.m0();
                                break;
                            case 1:
                                ((j1w) cyvVar.c.a).a.l0();
                                break;
                            default:
                                ((j1w) cyvVar.c.a).a.l0();
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var2.k0(K4);
            }
            wyf.c(function0, null, null, function02, (Function0) K4, oq5Var2, 0, 13);
            Unit unit = Unit.a;
            boolean z2 = (i4 == 4) | ((i3 & 896) == 256);
            Object K5 = oq5Var2.K();
            int i7 = 8;
            Continuation continuation = null;
            if (z2 || K5 == kjnVar) {
                K5 = new l1p(rxvVar, cyvVar, continuation, i7);
                oq5Var2.k0(K5);
            }
            gld.w(oq5Var2, unit, (Function2) K5);
            vci vciVar2 = vci.a;
            yci c2 = d.c(vciVar2, 1.0f);
            kfh d = ug3.d(b2c.b, false);
            int i8 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, c2);
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
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i8))) {
                ouj.x(i8, oq5Var2, i8, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            long d2 = rxvVar.d();
            xdr xdrVar3 = cyvVar.j;
            xdr xdrVar4 = cyvVar.h;
            vdr vdrVar = cyvVar.b;
            vdr vdrVar2 = cyvVar.a;
            Object K6 = oq5Var2.K();
            if (K6 == kjnVar) {
                K6 = tlm.f(gld.R(g.a, oq5Var2), oq5Var2);
            }
            mm6 mm6Var2 = ((fs5) K6).a;
            Object K7 = oq5Var2.K();
            if (K7 == kjnVar) {
                vdr a0 = sk3.a0(mm6Var2, new l8v(vdrVar2, cyvVar, 3));
                xdr xdrVar5 = cyvVar.g;
                xdr xdrVar6 = cyvVar.i;
                vxv vxvVar = new vxv();
                vdrVar2.getClass();
                vdrVar.getClass();
                xdrVar5.getClass();
                xdrVar4.getClass();
                xdrVar6.getClass();
                xdrVar3.getClass();
                vciVar = vciVar2;
                lmc L = lg3.L(vdrVar2, vdrVar, xdrVar5, xdrVar4, xdrVar6, xdrVar3, new cb5(vxvVar, null));
                xdrVar2 = xdrVar4;
                xdrVar = xdrVar3;
                K7 = new uyv(d2, a0, lg3.u0(L, mm6Var2, vxvVar.b(vdrVar2.getValue(), vdrVar.getValue(), xdrVar5.getValue(), xdrVar2.getValue(), xdrVar6.getValue(), xdrVar.getValue())), new hjp(16, cyvVar), cyvVar.d, cyvVar.e, mm6Var2);
                oq5Var2.k0(K7);
            } else {
                xdrVar = xdrVar3;
                vciVar = vciVar2;
                xdrVar2 = xdrVar4;
            }
            uyv uyvVar = (uyv) K7;
            dyv dyvVar = ((d3w) oq5Var2.j(e3w.a)).b;
            heh hehVar = heh.a;
            Object K8 = oq5Var2.K();
            if (K8 == kjnVar) {
                K8 = new lyv(rxvVar, uyvVar, mm6Var);
                oq5Var2.k0(K8);
            }
            lyv lyvVar2 = (lyv) K8;
            Object[] objArr4 = new Object[0];
            Object K9 = oq5Var2.K();
            if (K9 == kjnVar) {
                z = true;
                K9 = new nxv(1 == true ? 1 : 0);
                oq5Var2.k0(K9);
            } else {
                z = true;
            }
            boolean z3 = z;
            xdr xdrVar7 = xdrVar;
            xdr xdrVar8 = xdrVar2;
            yciVar2 = vciVar;
            Continuation continuation2 = null;
            aqi aqiVar = (aqi) o2g.g0(objArr4, null, (Function0) K9, oq5Var2, 0, 6);
            Object value = d8tVar.d.getValue();
            boolean f = oq5Var2.f(aqiVar) | ((i3 & 7168) == 2048 ? z3 : false) | oq5Var2.h(lyvVar2);
            Object K10 = oq5Var2.K();
            if (f || K10 == kjnVar) {
                lyvVar = lyvVar2;
                obj = value;
                h0t h0tVar = new h0t(d8tVar, lyvVar, aqiVar, continuation2, 27);
                oq5Var2.k0(h0tVar);
                K10 = h0tVar;
            } else {
                lyvVar = lyvVar2;
                obj = value;
            }
            gld.w(oq5Var2, obj, (Function2) K10);
            Object K11 = oq5Var2.K();
            if (K11 == kjnVar) {
                K11 = new jwv(4);
                oq5Var2.k0(K11);
            }
            qgg.A(uyvVar, lyvVar, nfp.b(yciVar2, false, (Function1) K11), rxvVar, oq5Var2, (i3 << 3) & 7168);
            Object K12 = oq5Var2.K();
            if (K12 == kjnVar) {
                K12 = tlm.f(gld.R(g.a, oq5Var2), oq5Var2);
            }
            mm6 mm6Var3 = ((fs5) K12).a;
            Object K13 = oq5Var2.K();
            int i9 = 6;
            t7l t7lVar = lbq.a;
            if (K13 == kjnVar) {
                e7v e7vVar = new e7v(vdrVar2, i9);
                ArrayList arrayList = ((k1w) vdrVar2.getValue()).b;
                fkn F0 = zsd.F0(e7vVar, mm6Var3, t7lVar, arrayList.isEmpty() ? nwv.a : new mwv(arrayList));
                int i10 = 7;
                e7v e7vVar2 = new e7v(vdrVar, i10);
                xyv xyvVar = (xyv) vdrVar.getValue();
                if (xyvVar instanceof vyv) {
                    rwvVar = rwv.a;
                } else {
                    if (!(xyvVar instanceof wyv)) {
                        b6e.s();
                        return;
                    }
                    rwvVar = rwv.b;
                }
                fkn F02 = zsd.F0(e7vVar2, mm6Var3, t7lVar, rwvVar);
                fkn E = vq1.E(mm6Var3, cyvVar.f, xdrVar8, new jiv(i10));
                e7v e7vVar3 = new e7v(vdrVar, 8);
                xyv xyvVar2 = (xyv) vdrVar.getValue();
                if (xyvVar2 instanceof vyv) {
                    c = false;
                } else {
                    if (!(xyvVar2 instanceof wyv)) {
                        b6e.s();
                        return;
                    }
                    c = ((wyv) xyvVar2).b.c();
                }
                K13 = new lwv(F0, F02, E, zsd.F0(e7vVar3, mm6Var3, t7lVar, Boolean.valueOf(c)), zsd.F0(new e7v(vdrVar2, 9), mm6Var3, t7lVar, ((k1w) vdrVar2.getValue()).d), new knn(20, cyvVar));
                oq5Var2.k0(K13);
            }
            lwv lwvVar = (lwv) K13;
            iz2 iz2Var = b2c.c;
            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.a;
            yci a = bVar.a(yciVar2, iz2Var);
            Object K14 = oq5Var2.K();
            int i11 = 5;
            if (K14 == kjnVar) {
                K14 = new jwv(i11);
                oq5Var2.k0(K14);
            }
            oq5Var = oq5Var2;
            wdg.t(lwvVar, fvfVar, nfp.b(a, false, (Function1) K14), oq5Var, i3 & 112, 0);
            Object K15 = oq5Var.K();
            if (K15 == kjnVar) {
                K15 = tlm.f(gld.R(g.a, oq5Var), oq5Var);
            }
            mm6 mm6Var4 = ((fs5) K15).a;
            Object K16 = oq5Var.K();
            if (K16 == kjnVar) {
                e7v e7vVar4 = new e7v(vdrVar2, i11);
                g0w g0wVar = ((k1w) vdrVar2.getValue()).c;
                wvv wvvVar = new wvv(zsd.F0(e7vVar4, mm6Var4, t7lVar, g0wVar == null ? yvv.a : new xvv(g0wVar)), vq1.E(mm6Var4, vdrVar, xdrVar7, new jiv(8)), new f4m(24, cyvVar));
                oq5Var.k0(wvvVar);
                K16 = wvvVar;
            }
            wvv wvvVar2 = (wvv) K16;
            float f2 = 12;
            yci q = androidx.compose.foundation.layout.a.q(bVar.a(yciVar2, b2c.i), f2, 0.0f, f2, f2, 2);
            Object K17 = oq5Var.K();
            if (K17 == kjnVar) {
                K17 = new jwv(i9);
                oq5Var.k0(K17);
            }
            hdg.z(wvvVar2, nfp.b(q, false, (Function1) K17), oq5Var, 0);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pli(cyvVar, fvfVar, rxvVar, d8tVar, yciVar2, i, 28);
        }
    }

    public static final thj k(StationId stationId, int i) {
        stationId.getClass();
        return new thj(pkb.Wave, stationId.h(), 1, i + 1, "");
    }

    public static final String l(g06 g06Var, jhb jhbVar, int i, String str) {
        if (str.length() != 0 && i > 0) {
            StringBuilder sb = new StringBuilder(i);
            ype it = yhn.m(0, i).iterator();
            while (it.c) {
                sb.append(str.charAt(it.nextInt() % str.length()));
            }
            return sb.toString();
        }
        if (str.length() != 0) {
            return "";
        }
        ((dfb) ((pv9) g06Var.d).b).e(new Throwable(hrg.q("Warning occurred while evaluating '", jhbVar.a, "':"), new Throwable("String for padding is empty.")));
        return "";
    }

    public static final int m(xsu xsuVar) {
        if ((xsuVar instanceof qsu) || Intrinsics.d(xsuVar, rsu.a)) {
            return 0;
        }
        if (!(xsuVar instanceof wsu)) {
            b6e.s();
            return 0;
        }
        wsu wsuVar = (wsu) xsuVar;
        vsu vsuVar = wsuVar.c;
        if (!(vsuVar instanceof ssu) && !(vsuVar instanceof tsu)) {
            if (Intrinsics.d(vsuVar, usu.a)) {
                return 0;
            }
            b6e.s();
            return 0;
        }
        List<jzs> list = wsuVar.a;
        cd5 cd5Var = vr3.a;
        list.getClass();
        int i = 0;
        for (jzs jzsVar : list) {
            if (jzsVar.d != null) {
                return 0;
            }
            rr5 d = jzsVar.a.d();
            int c = k5r.c(i * 31, 31, d.a);
            String str = d.b;
            int hashCode = (c + (str != null ? str.hashCode() : 0)) * 31;
            fa7 b = vr3.b(jzsVar.g);
            i = hashCode + (b != null ? b.hashCode() : 0);
        }
        return i;
    }

    public static final o4q n(cu7 cu7Var) {
        cu7Var.getClass();
        List elements = cu7Var.a.getElements();
        if (!(elements instanceof Collection) || !elements.isEmpty()) {
            Iterator it = elements.iterator();
            while (it.hasNext()) {
                if (((jzs) ((mwk) it.next())).d != null) {
                    return o4q.a;
                }
            }
        }
        return o4q.b;
    }

    public static final o4q o(xsu xsuVar) {
        xsuVar.getClass();
        if ((xsuVar instanceof qsu) || Intrinsics.d(xsuVar, rsu.a)) {
            return o4q.a;
        }
        if (!(xsuVar instanceof wsu)) {
            b6e.s();
            return null;
        }
        wsu wsuVar = (wsu) xsuVar;
        vsu vsuVar = wsuVar.c;
        if (!(vsuVar instanceof ssu) && !(vsuVar instanceof tsu)) {
            if (Intrinsics.d(vsuVar, usu.a)) {
                return o4q.a;
            }
            b6e.s();
            return null;
        }
        List list = wsuVar.a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((jzs) it.next()).d != null) {
                    return o4q.a;
                }
            }
        }
        return o4q.b;
    }

    public static final yqk p(cc7 cc7Var, String str) {
        str.getClass();
        return new yqk(((dc7) cc7Var).c(str, "phonoteka_sync_local_data"));
    }

    public static final List q(gc8 gc8Var, String str) {
        gc8 view = gc8Var.getView();
        if (str == null) {
            return c5b.a;
        }
        ArrayList arrayList = new ArrayList();
        r(view, str, arrayList);
        return arrayList;
    }

    public static void r(View view, Object obj, ArrayList arrayList) {
        if (Intrinsics.d(obj, view.getTag())) {
            arrayList.add(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                r(viewGroup.getChildAt(i), obj, arrayList);
            }
        }
    }

    public static int s(float f) {
        return Math.max(0, Math.round(Math.min(1.0f, f) * 255.0f));
    }

    public static final NetworkRequestException t(k1j k1jVar, LoadError loadError) {
        List list;
        k1jVar.getClass();
        Throwable throwable = loadError.getThrowable();
        String str = null;
        if ((throwable instanceof i6e) && (list = (List) ((i6e) throwable).e.get("xRequestId")) != null) {
            str = (String) CollectionsKt.firstOrNull(list);
        }
        return ((e) k1jVar).a(uwf.a(new afg(0, loadError, str)));
    }

    public static final ofp u(mpf mpfVar) {
        xci xciVar = (xci) mpfVar.F.f;
        Object obj = null;
        if ((xciVar.d & 8) != 0) {
            loop0: while (true) {
                if (xciVar == null) {
                    break;
                }
                if ((xciVar.c & 8) != 0) {
                    xci xciVar2 = xciVar;
                    eqi eqiVar = null;
                    while (xciVar2 != null) {
                        if (xciVar2 instanceof ofp) {
                            if (((ofp) xciVar2).E0()) {
                                obj = xciVar2;
                                break loop0;
                            }
                        } else if ((xciVar2.c & 8) != 0 && (xciVar2 instanceof cw7)) {
                            int i = 0;
                            for (xci xciVar3 = ((cw7) xciVar2).p; xciVar3 != null; xciVar3 = xciVar3.f) {
                                if ((xciVar3.c & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        xciVar2 = xciVar3;
                                    } else {
                                        if (eqiVar == null) {
                                            eqiVar = new eqi(new xci[16]);
                                        }
                                        if (xciVar2 != null) {
                                            eqiVar.d(xciVar2);
                                            xciVar2 = null;
                                        }
                                        eqiVar.d(xciVar3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        xciVar2 = bcx.p(eqiVar);
                    }
                }
                if ((xciVar.d & 8) == 0) {
                    break;
                }
                xciVar = xciVar.f;
            }
        }
        return (ofp) obj;
    }

    public static final String v(aaq aaqVar) {
        aaqVar.getClass();
        if ((aaqVar instanceof z9q) || (aaqVar instanceof caq) || (aaqVar instanceof paq) || (aaqVar instanceof uaq)) {
            return null;
        }
        if (aaqVar instanceof ebq) {
            return ((ebq) aaqVar).b;
        }
        if (aaqVar instanceof fbq) {
            return ((fbq) aaqVar).b;
        }
        if (aaqVar instanceof dbq) {
            return ((dbq) aaqVar).b;
        }
        if (aaqVar instanceof cbq) {
            return null;
        }
        b6e.s();
        return null;
    }

    public static final rr5 w(xsu xsuVar) {
        xsuVar.getClass();
        if (xsuVar instanceof qsu) {
            return ((qsu) xsuVar).a;
        }
        if (Intrinsics.d(xsuVar, rsu.a) || (xsuVar instanceof wsu)) {
            return null;
        }
        b6e.s();
        return null;
    }

    public static yci x(yci yciVar, two twoVar, boolean z, int i) {
        if ((i & 2) != 0) {
            z = true;
        }
        return G(yciVar, twoVar, z, false);
    }

    public static final boolean y(gjn gjnVar, String str) {
        gjnVar.getClass();
        Iterator it = gjnVar.e.iterator();
        while (it.hasNext()) {
            if (((d6b) it.next()).a.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public abstract void A(mwi mwiVar);

    public abstract void z(sgr sgrVar);
}
