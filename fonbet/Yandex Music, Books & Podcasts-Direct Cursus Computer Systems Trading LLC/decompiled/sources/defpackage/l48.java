package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import androidx.fragment.app.y;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.KotlinVersion;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.f;
import ru.yandex.music.R;
import ru.yandex.music.catalog.artist.screen.ArtistScreenActivity;
import ru.yandex.music.common.media.context.LaunchActionInfo;
import ru.yandex.music.common.media.context.Page;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.e;
import ru.yandex.music.common.media.context.h;
import ru.yandex.music.data.stores.WebPath$Storage;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes3.dex */
public final class l48 implements e3k, v33, g88, x73, p7q, f, z2o, kpc, jd6, dfs, e1o, eih, xeg {
    public static final l48 b = new l48(1);
    public static final l48 c = new l48(2);
    public static final l48 d = new l48(3);
    public static final l48 e = new l48(4);
    public static final /* synthetic */ l48 f = new l48(5);
    public static final l48 g = new l48(6);
    public static final l48 h = new l48(7);
    public static final l48 i = new l48(8);
    public static final l48 j = new l48(9);
    public static final l48 k = new l48(10);
    public static final l48 l = new l48(11);
    public static final l48 m = new l48(12);
    public final /* synthetic */ int a;

    public l48(SSLSession sSLSession) {
        this.a = 25;
        sSLSession.getCipherSuite();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            Certificate certificate = localCertificates[0];
        }
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            if (peerCertificates != null) {
                Certificate certificate2 = peerCertificates[0];
            }
        } catch (SSLPeerUnverifiedException e2) {
            lte.f.log(Level.FINE, "Peer cert not available for peerHost=" + sSLSession.getPeerHost(), (Throwable) e2);
        }
    }

    public static boolean j(Context context, CharSequence charSequence, float f2, Typeface typeface) {
        Paint paint = new Paint(1);
        paint.setTypeface(typeface);
        paint.setTextSize(f2);
        float measureText = paint.measureText(charSequence.toString());
        jyr jyrVar = sht.a;
        context.getClass();
        return measureText <= ((float) (sht.b(context).widthPixels - ((95 * sht.b(context).densityDpi) / 160)));
    }

    public static l48 k(Context context, int i2) {
        o5g.u("Cannot create a CalendarItemStyle with a styleResId of 0", i2 != 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, vdn.A);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ivf.D(context, obtainStyledAttributes, 4);
        ivf.D(context, obtainStyledAttributes, 9);
        ivf.D(context, obtainStyledAttributes, 7);
        obtainStyledAttributes.getDimensionPixelSize(8, 0);
        eup.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0)).e();
        obtainStyledAttributes.recycle();
        l48 l48Var = new l48(16);
        o5g.v(rect.left);
        o5g.v(rect.top);
        o5g.v(rect.right);
        o5g.v(rect.bottom);
        return l48Var;
    }

    public static ArrayList l() {
        Collection values = zh5.d.values();
        values.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (((zh5) obj).c) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Intent o(Context context, c01 c01Var, PlaybackScope playbackScope, int i2) {
        int i3 = ArtistScreenActivity.w0;
        qi1 qi1Var = qi1.b;
        if ((i2 & 4) != 0) {
            playbackScope = null;
        }
        if ((i2 & 8) != 0) {
            qi1Var = qi1.a;
        }
        context.getClass();
        c01Var.getClass();
        Intent putExtra = new Intent(context, (Class<?>) ArtistScreenActivity.class).putExtra("extra.artist.params", new lh1(ghh.P(c01Var), qi1Var, new aud(ouj.t(c01Var.k)), null)).putExtra("extra.playbackScope", playbackScope);
        putExtra.getClass();
        return putExtra;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r1 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Intent p(Context context, u51 u51Var, PlaybackScope playbackScope, String str, int i2) {
        int i3 = ArtistScreenActivity.w0;
        qi1 qi1Var = qi1.b;
        if ((i2 & 8) != 0) {
            qi1Var = qi1.a;
        }
        dud dudVar = null;
        if ((i2 & 16) != 0) {
            str = null;
        }
        context.getClass();
        u51Var.getClass();
        u9b u9bVar = u51Var.c;
        int t = wct.t();
        if (u9bVar != null) {
            Integer d2 = u9bVar.d();
            if (d2 != null) {
                dudVar = new bud(d2.intValue());
            } else {
                String str2 = (String) avf.R(u9bVar.e(t, WebPath$Storage.AVATARS));
                if (str2 != null) {
                    dudVar = new aud(str2);
                }
            }
        }
        dudVar = cud.a;
        Intent putExtra = new Intent(context, (Class<?>) ArtistScreenActivity.class).putExtra("extra.artist.params", new lh1(u51Var, qi1Var, dudVar, str)).putExtra("extra.playbackScope", playbackScope);
        putExtra.getClass();
        return putExtra;
    }

    public static igr v(ArrayList arrayList) {
        return y5g.Y(arrayList, null, null, null, new a6l(new gxc(avf.G("assistant"), weo.t()), null), null, null, q0q.a, true, 478);
    }

    public static igr y(StationId stationId) {
        stationId.getClass();
        return y5g.Y(c9g.E(stationId), null, null, null, new a6l(new gxc(avf.G("assistant"), weo.t()), null), null, null, q0q.a, true, 478);
    }

    public static zh5 z(String str, boolean z, boolean z2) {
        zh5 zh5Var = new zh5(str, z, z2);
        zh5.d.put(str, zh5Var);
        return zh5Var;
    }

    @Override // defpackage.xeg
    public long C(j4x j4xVar) {
        return -9223372036854775807L;
    }

    @Override // defpackage.xeg
    public mdr L(weg wegVar, j4x j4xVar) {
        return null;
    }

    @Override // defpackage.eih
    public long b() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.eih
    public long c() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.e3k
    public int d(int i2, float f2, int i3) {
        return f2 == 0.0f ? i2 : f2 > 0.0f ? i2 + 1 : i2 - 1;
    }

    @Override // defpackage.v33
    public Object e(v2q v2qVar, Continuation continuation) {
        return Unit.a;
    }

    public boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (this == obj) {
                    return true;
                }
                return l48.class.equals(obj != null ? obj.getClass() : null);
            default:
                return super.equals(obj);
        }
    }

    @Override // defpackage.jd6
    public long f(long j2, long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
        int i2 = sso.a;
        return floatToRawIntBits;
    }

    @Override // defpackage.x73
    public Bitmap g(Bitmap bitmap, float f2) {
        int i2;
        int i3 = (int) f2;
        if (i3 < 1) {
            xq0.x("Radius should be positive");
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i4 = width * height;
        int[] iArr = new int[i4];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i5 = width - 1;
        int i6 = height - 1;
        int i7 = i3 + i3;
        int i8 = i7 + 1;
        int[] iArr2 = new int[i4];
        int[] iArr3 = new int[i4];
        int[] iArr4 = new int[i4];
        int[] iArr5 = new int[Math.max(width, height)];
        int i9 = (i7 + 2) >> 1;
        int i10 = i9 * i9;
        int i11 = i10 * 256;
        int[] iArr6 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            iArr6[i12] = i12 / i10;
        }
        int[][] iArr7 = new int[i8][];
        for (int i13 = 0; i13 < i8; i13++) {
            iArr7[i13] = new int[3];
        }
        int i14 = i3 + 1;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < height) {
            int i18 = -i3;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            while (i18 <= i3) {
                int[] iArr8 = iArr;
                int[][] iArr9 = iArr7;
                int i28 = iArr8[Math.min(i5, Math.max(i18, 0)) + i16];
                int[] iArr10 = iArr9[i18 + i3];
                iArr10[0] = (i28 & 16711680) >> 16;
                iArr10[1] = (i28 & 65280) >> 8;
                iArr10[2] = i28 & KotlinVersion.MAX_COMPONENT_VALUE;
                int abs = i14 - Math.abs(i18);
                int i29 = iArr10[0];
                i19 = (i29 * abs) + i19;
                int i30 = iArr10[1];
                i20 = (i30 * abs) + i20;
                int i31 = iArr10[2];
                i21 = (abs * i31) + i21;
                if (i18 > 0) {
                    i25 += i29;
                    i26 += i30;
                    i27 += i31;
                } else {
                    i22 += i29;
                    i23 += i30;
                    i24 += i31;
                }
                i18++;
                iArr = iArr8;
                iArr7 = iArr9;
            }
            int[] iArr11 = iArr;
            int[][] iArr12 = iArr7;
            int i32 = i3;
            int i33 = 0;
            while (i33 < width) {
                iArr2[i16] = iArr6[i19];
                iArr3[i16] = iArr6[i20];
                iArr4[i16] = iArr6[i21];
                int i34 = i19 - i22;
                int i35 = i20 - i23;
                int i36 = i21 - i24;
                int[] iArr13 = iArr12[((i32 - i3) + i8) % i8];
                int i37 = i22 - iArr13[0];
                int i38 = i23 - iArr13[1];
                int i39 = i24 - iArr13[2];
                if (i15 == 0) {
                    i2 = i33;
                    iArr5[i2] = Math.min(i33 + i3 + 1, i5);
                } else {
                    i2 = i33;
                }
                int i40 = iArr11[i17 + iArr5[i2]];
                int i41 = (i40 & 16711680) >> 16;
                iArr13[0] = i41;
                int i42 = (i40 & 65280) >> 8;
                iArr13[1] = i42;
                int i43 = i40 & KotlinVersion.MAX_COMPONENT_VALUE;
                iArr13[2] = i43;
                int i44 = i25 + i41;
                int i45 = i26 + i42;
                int i46 = i27 + i43;
                i19 = i34 + i44;
                i20 = i35 + i45;
                i21 = i36 + i46;
                i32 = (i32 + 1) % i8;
                int[] iArr14 = iArr12[i32 % i8];
                int i47 = iArr14[0];
                i22 = i37 + i47;
                int i48 = iArr14[1];
                i23 = i38 + i48;
                int i49 = iArr14[2];
                i24 = i39 + i49;
                i25 = i44 - i47;
                i26 = i45 - i48;
                i27 = i46 - i49;
                i16++;
                i33 = i2 + 1;
            }
            i17 += width;
            i15++;
            iArr = iArr11;
            iArr7 = iArr12;
        }
        int[] iArr15 = iArr;
        int[][] iArr16 = iArr7;
        int i50 = 0;
        while (i50 < width) {
            int i51 = -i3;
            int i52 = i51 * width;
            int i53 = 0;
            int i54 = 0;
            int i55 = 0;
            int i56 = 0;
            int i57 = 0;
            int i58 = 0;
            int i59 = 0;
            int i60 = 0;
            int i61 = 0;
            while (i51 <= i3) {
                int i62 = i3;
                int max = Math.max(0, i52) + i50;
                int[] iArr17 = iArr16[i51 + i62];
                iArr17[0] = iArr2[max];
                iArr17[1] = iArr3[max];
                iArr17[2] = iArr4[max];
                int abs2 = i14 - Math.abs(i51);
                i53 = (iArr2[max] * abs2) + i53;
                i54 = (iArr3[max] * abs2) + i54;
                i55 = (iArr4[max] * abs2) + i55;
                if (i51 > 0) {
                    i59 += iArr17[0];
                    i60 += iArr17[1];
                    i61 += iArr17[2];
                } else {
                    i56 += iArr17[0];
                    i57 += iArr17[1];
                    i58 += iArr17[2];
                }
                if (i51 < i6) {
                    i52 += width;
                }
                i51++;
                i3 = i62;
            }
            int i63 = i3;
            int i64 = i50;
            int i65 = i63;
            int i66 = 0;
            while (i66 < height) {
                iArr15[i64] = (iArr15[i64] & (-16777216)) | (iArr6[i53] << 16) | (iArr6[i54] << 8) | iArr6[i55];
                int i67 = i53 - i56;
                int i68 = i54 - i57;
                int i69 = i55 - i58;
                int[] iArr18 = iArr16[((i65 - i63) + i8) % i8];
                int i70 = i56 - iArr18[0];
                int i71 = i57 - iArr18[1];
                int i72 = i58 - iArr18[2];
                int i73 = i66;
                if (i50 == 0) {
                    iArr5[i73] = Math.min(i73 + i14, i6) * width;
                }
                int i74 = iArr5[i73] + i50;
                int i75 = iArr2[i74];
                iArr18[0] = i75;
                int i76 = iArr3[i74];
                iArr18[1] = i76;
                int i77 = iArr4[i74];
                iArr18[2] = i77;
                int i78 = i59 + i75;
                int i79 = i60 + i76;
                int i80 = i61 + i77;
                i53 = i67 + i78;
                i54 = i68 + i79;
                i55 = i69 + i80;
                i65 = (i65 + 1) % i8;
                int[] iArr19 = iArr16[i65];
                int i81 = iArr19[0];
                i56 = i70 + i81;
                int i82 = iArr19[1];
                i57 = i71 + i82;
                int i83 = iArr19[2];
                i58 = i72 + i83;
                i59 = i78 - i81;
                i60 = i79 - i82;
                i61 = i80 - i83;
                i64 += width;
                i66 = i73 + 1;
            }
            i50++;
            i3 = i63;
        }
        bitmap.setPixels(iArr15, 0, width, 0, 0, width, height);
        return bitmap;
    }

    public se5 h(oq oqVar) {
        LaunchActionInfo launchActionInfo = LaunchActionInfo.AUTOMOTIVE_ASSISTANT;
        launchActionInfo.getClass();
        return l3l.f(new h(Page.ALBUM, launchActionInfo).b(oqVar), new qxp(oqVar), new a6l(new gxc(avf.G("assistant"), weo.t()), null)).b();
    }

    public int hashCode() {
        switch (this.a) {
            case 0:
                return l48.class.hashCode();
            default:
                return super.hashCode();
        }
    }

    public se5 i(c01 c01Var) {
        LaunchActionInfo launchActionInfo = LaunchActionInfo.AUTOMOTIVE_ASSISTANT;
        launchActionInfo.getClass();
        return l3l.f(new h(Page.ARTIST, launchActionInfo).d(c01Var), new f4m(c01Var), new a6l(new gxc(avf.G("assistant"), weo.t()), null)).b();
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        switch (this.a) {
            case 4:
                iocVar.getClass();
                return q0q.a;
            case 5:
            default:
                iocVar.getClass();
                return dyu.a;
            case 6:
                iocVar.getClass();
                return Boolean.FALSE;
            case 7:
                iocVar.getClass();
                return zlb.Fmradio;
        }
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        switch (this.a) {
            case 4:
                szuVar.getClass();
                return szuVar.h;
            case 5:
            default:
                szuVar.getClass();
                return szuVar.l();
            case 6:
                szuVar.getClass();
                return Boolean.valueOf(szuVar.k);
            case 7:
                szuVar.getClass();
                int ordinal = hdg.W(szuVar.a).ordinal();
                if (ordinal == 0) {
                    return zlb.WaveWithFixedRecommendations;
                }
                if (ordinal == 1) {
                    return zlb.WaveWithoutFixedRecommendations;
                }
                b6e.s();
                return null;
        }
    }

    @Override // defpackage.eih
    public boolean next() {
        return false;
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        switch (this.a) {
            case 4:
                y4dVar.getClass();
                return q0q.a;
            case 5:
            default:
                y4dVar.getClass();
                return dyu.a;
            case 6:
                y4dVar.getClass();
                return Boolean.FALSE;
            case 7:
                y4dVar.getClass();
                return zlb.Generative;
        }
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        switch (this.a) {
            case 4:
                maqVar.getClass();
                return q0q.a;
            case 5:
            default:
                maqVar.getClass();
                if (maqVar instanceof jbq) {
                    return ((jbq) maqVar).s();
                }
                boolean z = maqVar instanceof vaq;
                dyu dyuVar = dyu.a;
                if (z || (maqVar instanceof eaq) || (maqVar instanceof raq)) {
                    return dyuVar;
                }
                b6e.s();
                return null;
            case 6:
                maqVar.getClass();
                return Boolean.FALSE;
            case 7:
                maqVar.getClass();
                if (maqVar instanceof eaq) {
                    return zlb.Generative;
                }
                if (maqVar instanceof raq) {
                    return zlb.Unknown;
                }
                if (maqVar instanceof vaq) {
                    return zlb.Videoclip;
                }
                if (maqVar instanceof jbq) {
                    int ordinal = avf.J(((jbq) maqVar).b).ordinal();
                    if (ordinal == 0) {
                        return zlb.WaveWithFixedRecommendations;
                    }
                    if (ordinal == 1) {
                        return zlb.WaveWithoutFixedRecommendations;
                    }
                    b6e.s();
                } else {
                    b6e.s();
                }
                return null;
        }
    }

    @Override // defpackage.xeg
    public int r(int i2) {
        return 0;
    }

    public se5 s(cvl cvlVar) {
        LaunchActionInfo launchActionInfo = LaunchActionInfo.AUTOMOTIVE_ASSISTANT;
        launchActionInfo.getClass();
        return l3l.f(e.f(new h(ivf.I(cvlVar) ? Page.OWN_PLAYLISTS : Page.USER_PLAYLIST, launchActionInfo), cvlVar), new n3m(cvlVar), new a6l(new gxc(avf.G("assistant"), weo.t()), null)).b();
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        switch (this.a) {
            case 4:
                t1qVar.getClass();
                return q0q.a;
            case 5:
            default:
                t1qVar.getClass();
                return dyu.a;
            case 6:
                t1qVar.getClass();
                return Boolean.FALSE;
            case 7:
                t1qVar.getClass();
                z3q z3qVar = t1qVar.a;
                if ((z3qVar instanceof c1q) || (z3qVar instanceof e1q) || (z3qVar instanceof r1q) || (z3qVar instanceof a2q)) {
                    return zlb.WaveWithoutFixedRecommendations;
                }
                if (z3qVar instanceof h1q) {
                    return zlb.Generative;
                }
                if (z3qVar instanceof k1q) {
                    return zlb.Unknown;
                }
                if (z3qVar instanceof u1q) {
                    return zlb.WaveWithFixedRecommendations;
                }
                b6e.s();
                return null;
        }
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        switch (this.a) {
            case 4:
                u7uVar.getClass();
                return q0q.a;
            case 5:
            default:
                u7uVar.getClass();
                return dyu.a;
            case 6:
                u7uVar.getClass();
                return Boolean.FALSE;
            case 7:
                u7uVar.getClass();
                return zlb.Videoclip;
        }
    }

    @Override // defpackage.dfs
    public int x() {
        return R.style.PaymentsdkYaTheme_Payments_Dark;
    }

    @Override // defpackage.v33
    public void a() {
    }

    @Override // defpackage.z2o
    public k2o w(k2o k2oVar, pwj pwjVar) {
        return k2oVar;
    }

    public l48(e eVar) {
        this.a = 24;
    }

    public l48(aqd aqdVar, y yVar) {
        this.a = 26;
    }

    public /* synthetic */ l48(int i2) {
        this.a = i2;
    }
}
