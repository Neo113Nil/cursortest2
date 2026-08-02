package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.graphics.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.music.core.ui.compose.b;
import com.yandex.music.shared.wave.shader.api.component.WaveGlShaderView;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes.dex */
public abstract class ezf {
    public static boolean a;
    public static boolean b;

    public static Object A(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        jj4.j("Both parameters are null");
        return null;
    }

    public static PublicKey B(byte[] bArr) {
        String str;
        Object nextElement = v0.E(bArr).G().nextElement();
        nextElement.getClass();
        d0[] d0VarArr = ((f67) nextElement).a;
        if (d0VarArr.length <= 0) {
            wvs.n();
            return null;
        }
        d0 d0Var = d0VarArr[0];
        d0Var.getClass();
        n0 n0Var = (n0) d0Var;
        if (n0Var.equals(zzj.a)) {
            str = "RSA";
        } else {
            if (!n0Var.equals(t6w.a)) {
                kac.j(n0Var, "Unsupported key type ");
                return null;
            }
            str = "EC";
        }
        PublicKey generatePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArr));
        generatePublic.getClass();
        return generatePublic;
    }

    public static final byte[] C(f1j f1jVar) {
        int[] v0;
        int[] v02;
        f1jVar.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            return new byte[0];
        }
        NetworkRequest networkRequest = (NetworkRequest) f1jVar.a;
        if (networkRequest == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                if (i >= 31) {
                    v0 = rf0.G(networkRequest);
                } else {
                    int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < 10; i2++) {
                        int i3 = iArr[i2];
                        if (jo0.C(networkRequest, i3)) {
                            arrayList.add(Integer.valueOf(i3));
                        }
                    }
                    v0 = CollectionsKt.v0(arrayList);
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    v02 = rf0.c(networkRequest);
                } else {
                    int[] iArr2 = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
                    ArrayList arrayList2 = new ArrayList();
                    for (int i4 = 0; i4 < 30; i4++) {
                        int i5 = iArr2[i4];
                        if (jo0.B(networkRequest, i5)) {
                            arrayList2.add(Integer.valueOf(i5));
                        }
                    }
                    v02 = CollectionsKt.v0(arrayList2);
                }
                objectOutputStream.writeInt(v0.length);
                for (int i6 : v0) {
                    objectOutputStream.writeInt(i6);
                }
                objectOutputStream.writeInt(v02.length);
                for (int i7 : v02) {
                    objectOutputStream.writeInt(i7);
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final qyf D(dzf dzfVar) {
        dzfVar.getClass();
        return wyf.F(dzfVar.getLifecycle());
    }

    public static int E(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static final bk2 F(int i) {
        if (i == 0) {
            return bk2.a;
        }
        if (i == 1) {
            return bk2.b;
        }
        xq0.x(dfi.c(i, "Could not convert ", " to BackoffPolicy"));
        return null;
    }

    public static final g2j G(int i) {
        if (i == 0) {
            return g2j.a;
        }
        if (i == 1) {
            return g2j.b;
        }
        if (i == 2) {
            return g2j.c;
        }
        if (i == 3) {
            return g2j.d;
        }
        if (i == 4) {
            return g2j.e;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return g2j.f;
        }
        xq0.x(dfi.c(i, "Could not convert ", " to NetworkType"));
        return null;
    }

    public static final nxj H(int i) {
        if (i == 0) {
            return nxj.a;
        }
        if (i == 1) {
            return nxj.b;
        }
        xq0.x(dfi.c(i, "Could not convert ", " to OutOfQuotaPolicy"));
        return null;
    }

    public static final c4w I(int i) {
        if (i == 0) {
            return c4w.a;
        }
        if (i == 1) {
            return c4w.b;
        }
        if (i == 2) {
            return c4w.c;
        }
        if (i == 3) {
            return c4w.d;
        }
        if (i == 4) {
            return c4w.e;
        }
        if (i == 5) {
            return c4w.f;
        }
        xq0.x(dfi.c(i, "Could not convert ", " to State"));
        return null;
    }

    public static qop J(Set set, hee heeVar) {
        o2g.O(set, "set1");
        o2g.O(heeVar, "set2");
        return new qop(set, heeVar);
    }

    public static final int K(g2j g2jVar) {
        g2jVar.getClass();
        int ordinal = g2jVar.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                    i = 4;
                    if (ordinal != 4) {
                        if (Build.VERSION.SDK_INT >= 30 && g2jVar == g2j.f) {
                            return 5;
                        }
                        wvs.g(g2jVar, " to int", "Could not convert ");
                        return 0;
                    }
                }
            }
        }
        return i;
    }

    public static void L(ybs ybsVar, das dasVar, cds cdsVar, wof wofVar, pcs pcsVar, boolean z, mnj mnjVar) {
        long a2;
        ynn ynnVar;
        if (z) {
            int d = mnjVar.d(rds.d(ybsVar.b));
            if (d < cdsVar.a.a.b.length()) {
                ynnVar = cdsVar.b(d);
            } else if (d != 0) {
                ynnVar = cdsVar.b(d - 1);
            } else {
                a2 = vas.a(dasVar.b, dasVar.g, dasVar.h, vas.a, 1);
                ynnVar = new ynn(0.0f, 0.0f, 1.0f, (int) (a2 & 4294967295L));
            }
            float f = ynnVar.b;
            float f2 = ynnVar.a;
            long S = wofVar.S((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
            float intBitsToFloat = Float.intBitsToFloat((int) (S >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (S & 4294967295L));
            long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
            float f3 = ynnVar.c - f2;
            float f4 = ynnVar.d - f;
            ynn d2 = ywf.d(floatToRawIntBits, (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
            if (Intrinsics.d((pcs) pcsVar.a.b.get(), pcsVar)) {
                pcsVar.b.e(d2);
            }
        }
    }

    public static final void M(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            sme.a("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float x = x(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * x);
                }
            }
            float sqrt = (float) Math.sqrt(x(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f = 1.0f / sqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr10 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr10[i13] = i13 < i9 ? 0.0f : x(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float x2 = x(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    x2 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = x2 / fArr11[i14];
        }
    }

    public static final yci N(yci yciVar, float f) {
        return f == 0.0f ? yciVar : a.b(yciVar, 0.0f, 0.0f, 0.0f, 0.0f, f, null, false, 130815);
    }

    public static final byte[] O(Set set) {
        set.getClass();
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ca6 ca6Var = (ca6) it.next();
                    objectOutputStream.writeUTF(ca6Var.a.toString());
                    objectOutputStream.writeBoolean(ca6Var.b);
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final int P(c4w c4wVar) {
        c4wVar.getClass();
        int ordinal = c4wVar.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                    i = 4;
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return 5;
                        }
                        b6e.s();
                        return 0;
                    }
                }
            }
        }
        return i;
    }

    public static final oq Q(i2t i2tVar, List list) {
        ig5 ig5Var = i2tVar.a;
        return new oq(ig5Var.F, ig5Var.E, i2tVar.i, false, null, null, null, i2tVar.h, ig5Var.G, null, 0, null, list, men.x(ig5Var.H, WebPath$Storage.AVATARS), 0, false, null, null, null, null, null, null, false, null, 536845560);
    }

    public static final pkb R(aab aabVar) {
        aabVar.getClass();
        if (!(aabVar instanceof lt)) {
            if (aabVar instanceof u51) {
                return pkb.Artist;
            }
            if (aabVar instanceof eul) {
                return pkb.Playlist;
            }
            b6e.s();
            return null;
        }
        switch (mzo.a[((lt) aabVar).b.ordinal()]) {
            case 1:
                return pkb.Album;
            case 2:
                return pkb.Album;
            case 3:
                return pkb.Album;
            case 4:
                return pkb.Podcast;
            case 5:
                return pkb.Album;
            case 6:
                return pkb.Album;
            case 7:
                return pkb.Album;
            case 8:
                return pkb.Album;
            case 9:
                return pkb.Audiobook;
            default:
                b6e.s();
                return null;
        }
    }

    public static final pkb S(j7p j7pVar) {
        j7pVar.getClass();
        if (j7pVar instanceof v6p) {
            return pkb.Artist;
        }
        if (j7pVar instanceof u6p) {
            return pkb.Album;
        }
        if (j7pVar instanceof f7p) {
            return pkb.Track;
        }
        if (j7pVar instanceof b7p) {
            return pkb.Playlist;
        }
        if (j7pVar instanceof y6p) {
            return pkb.Concert;
        }
        if (j7pVar instanceof e7p) {
            return pkb.Album;
        }
        if (j7pVar instanceof g7p) {
            return pkb.UpcomingAlbum;
        }
        if (j7pVar instanceof i7p) {
            return pkb.Wave;
        }
        if (j7pVar instanceof w6p) {
            return pkb.NonApplicable;
        }
        if (j7pVar instanceof z6p) {
            return pkb.Audiobook;
        }
        if (j7pVar instanceof a7p) {
            return pkb.NonApplicable;
        }
        if (j7pVar instanceof c7p) {
            return pkb.Podcast;
        }
        if (j7pVar instanceof d7p) {
            return pkb.PodcastEpisode;
        }
        if (j7pVar instanceof h7p) {
            return pkb.Video;
        }
        if (j7pVar instanceof x6p) {
            return pkb.AudiobookChapter;
        }
        b6e.s();
        return null;
    }

    public static final pkb T(mqs mqsVar) {
        mqsVar.getClass();
        return a4g.C(mqsVar) ? pkb.AudiobookChapter : a4g.D(gys.PodcastHolder, mqsVar) ? pkb.PodcastEpisode : pkb.Track;
    }

    public static final f1j U(byte[] bArr) {
        bArr.getClass();
        if (Build.VERSION.SDK_INT < 28 || bArr.length == 0) {
            return new f1j(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int readInt = objectInputStream.readInt();
                int[] iArr = new int[readInt];
                for (int i = 0; i < readInt; i++) {
                    iArr[i] = objectInputStream.readInt();
                }
                int readInt2 = objectInputStream.readInt();
                int[] iArr2 = new int[readInt2];
                for (int i2 = 0; i2 < readInt2; i2++) {
                    iArr2[i2] = objectInputStream.readInt();
                }
                f1j i3 = jo0.i(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return i3;
            } finally {
            }
        } finally {
        }
    }

    public static final cvl V(ytl ytlVar) {
        drt drtVar;
        u4h u4hVar;
        ytlVar.getClass();
        String str = ytlVar.x;
        String str2 = ytlVar.y;
        Date date = null;
        if (str == null || str2 == null) {
            drtVar = null;
        } else {
            cuk cukVar = drt.e;
            drtVar = cuk.B(str, str2, "");
        }
        if (drtVar != null) {
            String str3 = ytlVar.w;
            u4hVar = new u4h(drtVar, new r54(null, (str3 == null || str3.length() == 0) ? str2 : str3, null, null, null, null));
        } else {
            u4hVar = null;
        }
        String str4 = ytlVar.b;
        String str5 = ytlVar.c;
        String str6 = ytlVar.g;
        cuk cukVar2 = drt.e;
        drt B = cuk.B(ytlVar.d, ytlVar.e, ytlVar.f);
        Integer num = ytlVar.k;
        int intValue = num != null ? num.intValue() : 0;
        Integer num2 = ytlVar.j;
        int intValue2 = num2 != null ? num2.intValue() : -1;
        long j = ytlVar.a;
        byr l = f8g.l(ytlVar.n);
        Long l2 = ytlVar.p;
        long longValue = l2 != null ? l2.longValue() : -1L;
        tfs tfsVar = wc7.a;
        String str7 = ytlVar.l;
        tfs tfsVar2 = wc7.a;
        Date b2 = tfsVar2.b(str7);
        String str8 = ytlVar.v;
        if (str8 != null) {
            Date b3 = tfsVar2.b(str8);
            if (b3 == null) {
                b3 = new Date(System.currentTimeMillis());
            }
            date = b3;
        }
        Date date2 = date;
        tn6 y = vnj.y(ytlVar.o);
        String str9 = ytlVar.i;
        String str10 = ytlVar.m;
        int a2 = vz1.a(ytlVar.u);
        String str11 = ytlVar.A;
        String str12 = ytlVar.B;
        boolean z = ytlVar.z;
        Integer num3 = ytlVar.q;
        int intValue3 = num3 != null ? num3.intValue() : -1;
        Integer num4 = ytlVar.t;
        cvl cvlVar = new cvl(str5, str6, B, intValue, intValue2, true, intValue3, num4 != null ? num4.intValue() : -1, 0, 0L, j, l, longValue, b2, date2, y, str9, str10, a2, str11, str12, u4hVar, z, str4, false, null, null, 117441280);
        cvlVar.A = tfsVar2.b(ytlVar.s);
        return cvlVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final cvl W(qwl qwlVar) {
        drt drtVar;
        u4h u4hVar;
        int i;
        String str;
        long j;
        qwlVar.getClass();
        String str2 = qwlVar.s;
        String str3 = qwlVar.t;
        Date date = null;
        if (str2 == null || str3 == null) {
            drtVar = null;
        } else {
            cuk cukVar = drt.e;
            drtVar = cuk.B(str2, str3, "");
        }
        if (drtVar != null) {
            String str4 = qwlVar.v;
            u4hVar = new u4h(drtVar, new r54(null, (str4 == null || str4.length() == 0) ? str3 : str4, null, null, null, null));
        } else {
            u4hVar = null;
        }
        String str5 = qwlVar.d;
        String str6 = qwlVar.b;
        String str7 = qwlVar.g;
        cuk cukVar2 = drt.e;
        drt B = cuk.B(qwlVar.c, qwlVar.e, qwlVar.f);
        Integer num = qwlVar.j;
        int intValue = num != null ? num.intValue() : 0;
        Integer num2 = qwlVar.i;
        int intValue2 = num2 != null ? num2.intValue() : -1;
        Integer num3 = qwlVar.A;
        int intValue3 = num3 != null ? num3.intValue() : -1;
        if (intValue3 == -1) {
            Integer num4 = qwlVar.z;
            if (num4 == null) {
                i = -1;
                Integer num5 = qwlVar.p;
                int intValue4 = num5 != null ? num5.intValue() : -1;
                Integer num6 = qwlVar.C;
                int intValue5 = num6 != null ? num6.intValue() : 0;
                Long l = qwlVar.B;
                long longValue = l == null ? l.longValue() : 0L;
                long j2 = qwlVar.a;
                byr l2 = f8g.l(qwlVar.m);
                Long l3 = qwlVar.o;
                long longValue2 = l3 == null ? l3.longValue() : -1L;
                tfs tfsVar = wc7.a;
                String str8 = qwlVar.k;
                tfs tfsVar2 = wc7.a;
                Date b2 = tfsVar2.b(str8);
                str = qwlVar.u;
                if (str == null) {
                    Date b3 = tfsVar2.b(str);
                    if (b3 == null) {
                        j = j2;
                        b3 = new Date(System.currentTimeMillis());
                    } else {
                        j = j2;
                    }
                    date = b3;
                } else {
                    j = j2;
                }
                cvl cvlVar = new cvl(str6, str7, B, intValue, intValue2, false, i, intValue4, intValue5, longValue, j, l2, longValue2, b2, date, vnj.y(qwlVar.n), qwlVar.h, qwlVar.l, vz1.a(qwlVar.r), qwlVar.x, qwlVar.y, u4hVar, qwlVar.w, str5, false, null, null, 117440544);
                cvlVar.A = tfsVar2.b(qwlVar.q);
                return cvlVar;
            }
            intValue3 = num4.intValue();
        }
        i = intValue3;
        Integer num52 = qwlVar.p;
        int intValue42 = num52 != null ? num52.intValue() : -1;
        Integer num62 = qwlVar.C;
        int intValue52 = num62 != null ? num62.intValue() : 0;
        Long l4 = qwlVar.B;
        long longValue3 = l4 == null ? l4.longValue() : 0L;
        long j22 = qwlVar.a;
        byr l22 = f8g.l(qwlVar.m);
        Long l32 = qwlVar.o;
        long longValue22 = l32 == null ? l32.longValue() : -1L;
        tfs tfsVar3 = wc7.a;
        String str82 = qwlVar.k;
        tfs tfsVar22 = wc7.a;
        Date b22 = tfsVar22.b(str82);
        str = qwlVar.u;
        if (str == null) {
        }
        cvl cvlVar2 = new cvl(str6, str7, B, intValue, intValue2, false, i, intValue42, intValue52, longValue3, j, l22, longValue22, b22, date, vnj.y(qwlVar.n), qwlVar.h, qwlVar.l, vz1.a(qwlVar.r), qwlVar.x, qwlVar.y, u4hVar, qwlVar.w, str5, false, null, null, 117440544);
        cvlVar2.A = tfsVar22.b(qwlVar.q);
        return cvlVar2;
    }

    public static final nyn X(int i) {
        if (i == 0) {
            throw null;
        }
        int D = ouj.D(i);
        if (D != 0 && D != 1) {
            if (D == 2) {
                return nyn.b;
            }
            if (D == 3) {
                return nyn.c;
            }
            if (D != 4) {
                b6e.s();
                return null;
            }
        }
        return nyn.a;
    }

    public static z0j Y(Object obj) {
        return new z0j(obj.getClass().getSimpleName());
    }

    public static final xxk Z(mwk mwkVar, boolean z, jkl jklVar) {
        mwkVar.getClass();
        jklVar.getClass();
        return (xxk) dag.p(mwkVar, new zks(z, jklVar, 0));
    }

    public static final void a(yci yciVar, wn5 wn5Var, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1214482516);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(wn5Var) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            xcs.a(nu0.c(), ild.C(850289091, new pg6(yciVar, wn5Var, 3, (byte) 0), oq5Var), oq5Var, 48);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ce3(yciVar, wn5Var, i, 4);
        }
    }

    public static final Context a0(Context context, int i) {
        context.getClass();
        return i == 0 ? context : new uf6(context, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(k4k k4kVar, mxo mxoVar, String str, Function0 function0, Function0 function02, Function0 function03, wn5 wn5Var, tmb tmbVar, yci yciVar, o0k o0kVar, wn5 wn5Var2, hq5 hq5Var, int i, int i2) {
        int i3;
        Function0 function04;
        Function0 function05;
        yci yciVar2;
        int i4;
        oq5 oq5Var;
        o0k o0kVar2;
        yci yciVar3;
        xmn r;
        k4kVar.getClass();
        str.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-429222969);
        if ((i & 6) == 0) {
            i3 = (oq5Var2.f(k4kVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var2.h(mxoVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var2.f(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= oq5Var2.h(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function04 = function02;
            i3 |= oq5Var2.h(function04) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            function04 = function02;
        }
        if ((196608 & i) == 0) {
            function05 = function03;
            i3 |= oq5Var2.h(function05) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        } else {
            function05 = function03;
        }
        if ((1572864 & i) == 0) {
            i3 |= oq5Var2.h(wn5Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= (16777216 & i) == 0 ? oq5Var2.f(tmbVar) : oq5Var2.h(tmbVar) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        int i5 = i2 & 256;
        if (i5 != 0) {
            i3 |= 100663296;
        } else if ((100663296 & i) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var2.f(yciVar2) ? 67108864 : 33554432;
            i4 = 805306368 | i3;
            if (oq5Var2.P(i4 & 1, (306783379 & i4) == 306783378)) {
                oq5Var = oq5Var2;
                oq5Var.S();
                o0kVar2 = o0kVar;
                yciVar3 = yciVar2;
            } else {
                yci yciVar4 = i5 != 0 ? vci.a : yciVar2;
                q0k a2 = androidx.compose.foundation.layout.a.a(0.0f, 0.0f, 3);
                int i6 = i4 >> 18;
                oq5Var = oq5Var2;
                xp3.d(str, mxoVar, yciVar4, a2, function0, wn5Var, (Intrinsics.d(k4kVar.b, j4k.a) || k4kVar.c) ? false : true, false, null, null, null, ild.C(636983377, new lc(k4kVar, tmbVar, function04, function05, wn5Var2, 8), oq5Var2), oq5Var, ((i4 >> 6) & 14) | (i4 & 112) | (i6 & 896) | (i6 & 7168) | ((i4 << 3) & 57344) | (458752 & (i4 >> 3)), 48, ScreenMirroringConfig.Video.DEFAULT_WIDTH);
                yciVar3 = yciVar4;
                o0kVar2 = a2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new ka3(k4kVar, mxoVar, str, function0, function02, function03, wn5Var, tmbVar, yciVar3, o0kVar2, wn5Var2, i, i2);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        i4 = 805306368 | i3;
        if (oq5Var2.P(i4 & 1, (306783379 & i4) == 306783378)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static int b0(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static final void c(w6j w6jVar, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        hz2 hz2Var;
        kb5 kb5Var;
        grb grbVar;
        int i2;
        yci yciVar3;
        boolean z;
        mn0 mn0Var;
        mn0 m;
        w6jVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1151384971);
        int i3 = (oq5Var.f(w6jVar) ? 4 : 2) | i | 48;
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
            g7j g7jVar = (g7j) gld.O(w6jVar.e, oq5Var).getValue();
            iz2 iz2Var = b2c.f;
            vci vciVar = vci.a;
            float f = 16;
            yci p = androidx.compose.foundation.layout.a.p(d.c(androidx.compose.ui.platform.a.a(vciVar, "informer_no_network"), 1.0f), f, 10, f, 4);
            kfh d = ug3.d(iz2Var, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, p);
            xp5.T.getClass();
            grb grbVar2 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar2);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var2 = wp5.f;
            g0g.U(oq5Var, d, kb5Var2);
            kb5 kb5Var3 = wp5.e;
            g0g.U(oq5Var, l, kb5Var3);
            kb5 kb5Var4 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var4);
            }
            kb5 kb5Var5 = wp5.d;
            g0g.U(oq5Var, H, kb5Var5);
            lx0 lx0Var = qx0.e;
            hz2 hz2Var2 = b2c.l;
            oq5Var.Z(1450388175);
            if (g7jVar.b()) {
                boolean h = ((i3 & 14) == 4) | oq5Var.h(context) | oq5Var.h(g7jVar);
                Object K = oq5Var.K();
                if (h || K == gq5.a) {
                    K = new cte(11, w6jVar, context, g7jVar);
                    oq5Var.k0(K);
                }
                Function0 function0 = (Function0) K;
                kb5Var = kb5Var4;
                hz2Var = hz2Var2;
                grbVar = grbVar2;
                i2 = 16;
                yciVar3 = androidx.compose.foundation.a.e(vciVar, false, null, null, function0, 7);
            } else {
                hz2Var = hz2Var2;
                kb5Var = kb5Var4;
                grbVar = grbVar2;
                i2 = 16;
                yciVar3 = vciVar;
            }
            oq5Var.p(false);
            nho a2 = lho.a(lx0Var, hz2Var, oq5Var, 54);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, yciVar3);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, kb5Var2);
            g0g.U(oq5Var, l2, kb5Var3);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H2, kb5Var5);
            yme ymeVar = new yme(new psk(4, v7g.z(i2), v7g.z(i2)), ot0.e);
            yme ymeVar2 = new yme(new psk(4, v7g.z(8), v7g.z(i2)), ot0.f);
            oq5Var.Z(-1781041149);
            kn0 kn0Var = new kn0();
            a7j a7jVar = a7j.b;
            boolean equals = g7jVar.equals(a7jVar);
            f7j f7jVar = f7j.b;
            e7j e7jVar = e7j.b;
            z6j z6jVar = z6j.b;
            c7j c7jVar = c7j.b;
            b7j b7jVar = b7j.a;
            x6j x6jVar = x6j.a;
            if (equals || g7jVar.equals(x6jVar)) {
                u2x.s(kn0Var, "prefixIcon");
                u2x.s(kn0Var, "spacer");
            } else if (!g7jVar.equals(b7jVar) && !g7jVar.equals(c7jVar) && !g7jVar.equals(z6jVar) && !g7jVar.equals(e7jVar) && !g7jVar.equals(f7jVar)) {
                b6e.s();
                return;
            }
            if (g7jVar.equals(b7jVar)) {
                oq5Var.Z(-705181996);
                m = o8g.m(rvf.M(R.string.informers_no_network_offline_mode_text, oq5Var), ((dq0) oq5Var.j(eq0.a)).b.d, oq5Var, 0, 0);
                z = false;
                oq5Var.p(false);
            } else {
                z = false;
                if (g7jVar.equals(c7jVar)) {
                    oq5Var.Z(-705175647);
                    mn0Var = new mn0(rvf.M(R.string.informers_no_network_with_offline_wave_playing_text, oq5Var));
                    oq5Var.p(false);
                } else if (g7jVar.equals(z6jVar)) {
                    oq5Var.Z(-705169926);
                    m = o8g.m(f8g.Y(R.string.informers_no_network_with_wave_and_downloads_text, oq5Var), 0L, oq5Var, 0, 1);
                    z = false;
                    oq5Var.p(false);
                } else if (g7jVar.equals(a7jVar)) {
                    oq5Var.Z(-705164806);
                    m = o8g.m(f8g.Y(R.string.informers_no_network_with_downloads_text, oq5Var), 0L, oq5Var, 0, 1);
                    z = false;
                    oq5Var.p(false);
                } else if (g7jVar.equals(e7jVar)) {
                    oq5Var.Z(-705158758);
                    m = o8g.m(f8g.Y(R.string.informers_no_network_without_downloads_and_auto_cache_text, oq5Var), 0L, oq5Var, 0, 1);
                    z = false;
                    oq5Var.p(false);
                } else {
                    z = false;
                    if (g7jVar.equals(f7jVar)) {
                        oq5Var.Z(-705152511);
                        mn0Var = new mn0(rvf.M(R.string.informers_no_network_without_downloads_and_with_auto_cache_text, oq5Var));
                        oq5Var.p(false);
                    } else {
                        if (!g7jVar.equals(x6jVar)) {
                            throw vz1.i(oq5Var, -705185587, false);
                        }
                        oq5Var.Z(-705147711);
                        mn0Var = new mn0(rvf.M(R.string.informers_no_network_no_downloads_text, oq5Var));
                        oq5Var.p(false);
                    }
                }
                m = mn0Var;
            }
            kn0Var.b(m);
            mn0 h2 = kn0Var.h();
            oq5Var.p(z);
            xv7.i(h2, b.c(vciVar, "informer_no_network_downloads", Boolean.valueOf(g7jVar.b())), ((dq0) oq5Var.j(eq0.a)).b.a, 0L, 0L, 3, 0L, 2, false, 2, 0, uah.e(new Pair("prefixIcon", ymeVar), new Pair("spacer", ymeVar2)), null, ges.b(nu0.i(), 0L, 0L, null, null, 0L, 0, 0L, null, new h6g(17, e6g.b), 0, 0, 15728639), null, null, oq5Var, 0, 3120, 874232);
            oq5Var = oq5Var;
            oq5Var.p(true);
            oq5Var.p(true);
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new m2g(w6jVar, yciVar2, i, 23);
        }
    }

    public static final void d(fvf fvfVar, Function0 function0, hq5 hq5Var, int i) {
        fvfVar.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1711006655);
        int i2 = (oq5Var.f(fvfVar) ? 4 : 2) | i | (oq5Var.h(function0) ? 32 : 16);
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new h1j(fvfVar, function0, (Continuation) null, 10);
                oq5Var.k0(K);
            }
            gld.w(oq5Var, fvfVar, (Function2) K);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wcj(fvfVar, function0, i, 2);
        }
    }

    public static final void e(fvf fvfVar, Function0 function0, Function0 function02, hq5 hq5Var, int i) {
        int i2;
        Function0 function03;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1361785962);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(fvfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function0) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new s9j(11);
                oq5Var.k0(K);
            }
            Function0 function04 = (Function0) K;
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object K2 = oq5Var.K();
            if (z || K2 == kjnVar) {
                function03 = function04;
                rlg rlgVar = new rlg(fvfVar, function0, function03, null, 17);
                oq5Var.k0(rlgVar);
                K2 = rlgVar;
            } else {
                function03 = function04;
            }
            gld.w(oq5Var, fvfVar, (Function2) K2);
        } else {
            oq5Var.S();
            function03 = function02;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yja(fvfVar, function0, function03, i, 29);
        }
    }

    public static final void f(o0k o0kVar, k4k k4kVar, tmb tmbVar, Function0 function0, Function0 function02, wn5 wn5Var, hq5 hq5Var, int i) {
        int i2;
        wn5 wn5Var2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1228222618);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(o0kVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(k4kVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var.f(tmbVar) : oq5Var.h(tmbVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.h(function02) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i & 196608) == 0) {
            wn5Var2 = wn5Var;
            i2 |= oq5Var.h(wn5Var2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        } else {
            wn5Var2 = wn5Var;
        }
        int i3 = i2;
        if (oq5Var.P(i3 & 1, (74899 & i3) != 74898)) {
            bfg.f(Intrinsics.d(k4kVar.b, j4k.a), function0, o0kVar, null, k4kVar.b == null, ild.C(-1000551142, new pli(k4kVar, wn5Var2, o0kVar, function02, tmbVar), oq5Var), oq5Var, ((i3 >> 6) & 112) | 196608 | ((i3 << 6) & 896), 8);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu0(o0kVar, k4kVar, tmbVar, function0, function02, wn5Var, i, 11);
        }
    }

    public static final void g(final k4k k4kVar, final lvf lvfVar, final String str, final dib dibVar, final Function0 function0, final Function0 function02, final Function0 function03, final Function0 function04, final tmb tmbVar, final yci yciVar, final o0k o0kVar, wn5 wn5Var, hq5 hq5Var, final int i, final int i2) {
        dib dibVar2;
        Function0 function05;
        Function0 function06;
        Function0 function07;
        tmb tmbVar2;
        yci yciVar2;
        int i3;
        wn5 wn5Var2;
        oq5 oq5Var;
        k4kVar.getClass();
        lvfVar.getClass();
        str.getClass();
        dibVar.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        function04.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-787102682);
        int i4 = (oq5Var2.f(k4kVar) ? 4 : 2) | i | (oq5Var2.h(lvfVar) ? 32 : 16) | (oq5Var2.f(str) ? 256 : 128);
        if ((i & 24576) == 0) {
            dibVar2 = dibVar;
            i4 |= oq5Var2.h(dibVar2) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            dibVar2 = dibVar;
        }
        if ((196608 & i) == 0) {
            function05 = function0;
            i4 |= oq5Var2.h(function05) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        } else {
            function05 = function0;
        }
        if ((12582912 & i) == 0) {
            function06 = function03;
            i4 |= oq5Var2.h(function06) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        } else {
            function06 = function03;
        }
        if ((100663296 & i) == 0) {
            function07 = function04;
            i4 |= oq5Var2.h(function07) ? 67108864 : 33554432;
        } else {
            function07 = function04;
        }
        if ((805306368 & i) == 0) {
            tmbVar2 = tmbVar;
            i4 |= oq5Var2.h(tmbVar2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        } else {
            tmbVar2 = tmbVar;
        }
        if ((i2 & 6) == 0) {
            yciVar2 = yciVar;
            i3 = i2 | (oq5Var2.f(yciVar2) ? 4 : 2);
        } else {
            yciVar2 = yciVar;
            i3 = i2;
        }
        int i5 = i3 | (oq5Var2.f(o0kVar) ? 32 : 16);
        if (oq5Var2.P(i4 & 1, ((306783379 & i4) == 306783378 && (i5 & 147) == 146) ? false : true)) {
            wn5Var2 = wn5Var;
            wn5 C = ild.C(-2054998577, new lo1(wn5Var2, 4), oq5Var2);
            int i6 = lvf.f;
            oq5Var = oq5Var2;
            h(k4kVar, lvfVar, str, dibVar2, function05, function02, function06, function07, tmbVar2, yciVar2, o0kVar, C, oq5Var, (i4 & 14) | 64 | (i4 & 112) | (i4 & 896) | 3072 | (57344 & i4) | (458752 & i4) | ScreenMirroringConfig.Video.BITRATE_1_5MB | (29360128 & i4) | (234881024 & i4) | 1073741824 | (i4 & 1879048192), (i5 & 14) | 384 | (i5 & 112), 0);
        } else {
            wn5Var2 = wn5Var;
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            final wn5 wn5Var3 = wn5Var2;
            r.d = new Function2() { // from class: h4k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(i | 1);
                    int R2 = rvf.R(i2);
                    ezf.g(k4k.this, lvfVar, str, dibVar, function0, function02, function03, function04, tmbVar, yciVar, o0kVar, wn5Var3, (hq5) obj, R, R2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void h(k4k k4kVar, lvf lvfVar, String str, dib dibVar, Function0 function0, Function0 function02, Function0 function03, Function0 function04, tmb tmbVar, yci yciVar, o0k o0kVar, wn5 wn5Var, hq5 hq5Var, int i, int i2, int i3) {
        int i4;
        oq5 oq5Var;
        yci yciVar2;
        k4kVar.getClass();
        lvfVar.getClass();
        str.getClass();
        dibVar.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        function04.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1742623961);
        int i5 = (oq5Var2.f(k4kVar) ? 4 : 2) | i | (oq5Var2.h(lvfVar) ? 32 : 16) | (oq5Var2.f(str) ? 256 : 128);
        if ((i & 24576) == 0) {
            i5 |= oq5Var2.h(dibVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i5 |= oq5Var2.h(function0) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((12582912 & i) == 0) {
            i5 |= oq5Var2.h(function03) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((100663296 & i) == 0) {
            i5 |= oq5Var2.h(function04) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i5 |= oq5Var2.h(tmbVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        int i6 = i3 & 1024;
        if (i6 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = i2 | (oq5Var2.f(yciVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var2.f(o0kVar) ? 32 : 16;
        }
        int i7 = i4;
        int i8 = i5;
        if (oq5Var2.P(i8 & 1, ((i5 & 306783379) == 306783378 && (i7 & 147) == 146) ? false : true)) {
            yci yciVar3 = i6 != 0 ? vci.a : yciVar;
            fvf a2 = hvf.a(0, 0, oq5Var2, 0, 3);
            wyf.g(dibVar, a2, oq5Var2, (i8 >> 12) & 14);
            int i9 = i8 & 112;
            boolean z = (i9 == 32 || oq5Var2.h(lvfVar)) | ((i8 & 29360128) == 8388608);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (z || K == kjnVar) {
                K = new rl1(function03, lvfVar, 1);
                oq5Var2.k0(K);
            }
            Function0 function05 = (Function0) K;
            boolean z2 = (i9 == 32 || oq5Var2.h(lvfVar)) | ((i8 & 234881024) == 67108864);
            Object K2 = oq5Var2.K();
            if (z2 || K2 == kjnVar) {
                K2 = new rl1(function04, lvfVar, 2);
                oq5Var2.k0(K2);
            }
            int i10 = i8 >> 6;
            oq5Var = oq5Var2;
            b(k4kVar, a2, str, function0, function05, (Function0) K2, new wn5(new e4k(0, function02, false), 891452525, true), tmbVar, yciVar3, null, ild.C(-1260819689, new up(a2, o0kVar, lvfVar, wn5Var, 22), oq5Var2), oq5Var, (i8 & 910) | (i10 & 7168) | 16777216 | (i10 & 29360128) | ((i7 << 24) & 234881024), RemoteCameraConfig.Mic.BUFFER_SIZE);
            yciVar2 = yciVar3;
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new g4k(k4kVar, lvfVar, str, dibVar, function0, function02, function03, function04, tmbVar, yciVar2, o0kVar, wn5Var, i, i2, i3);
        }
    }

    public static final void i(final k4k k4kVar, final lvf lvfVar, final String str, final boolean z, final dib dibVar, final Function0 function0, final Function0 function02, final Function0 function03, final Function0 function04, final tmb tmbVar, final o0k o0kVar, wn5 wn5Var, hq5 hq5Var, final int i) {
        int i2;
        String str2;
        boolean z2;
        dib dibVar2;
        Function0 function05;
        Function0 function06;
        Function0 function07;
        wn5 wn5Var2;
        k4kVar.getClass();
        lvfVar.getClass();
        str.getClass();
        dibVar.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        function04.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1217125761);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(k4kVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? oq5Var.f(lvfVar) : oq5Var.h(lvfVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str2 = str;
            i2 |= oq5Var.f(str2) ? 256 : 128;
        } else {
            str2 = str;
        }
        if ((i & 3072) == 0) {
            z2 = z;
            i2 |= oq5Var.g(z2) ? 2048 : 1024;
        } else {
            z2 = z;
        }
        if ((i & 24576) == 0) {
            dibVar2 = dibVar;
            i2 |= oq5Var.h(dibVar2) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            dibVar2 = dibVar;
        }
        if ((196608 & i) == 0) {
            function05 = function0;
            i2 |= oq5Var.h(function05) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        } else {
            function05 = function0;
        }
        if ((1572864 & i) == 0) {
            i2 |= oq5Var.h(function02) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            function06 = function03;
            i2 |= oq5Var.h(function06) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        } else {
            function06 = function03;
        }
        if ((100663296 & i) == 0) {
            function07 = function04;
            i2 |= oq5Var.h(function07) ? 67108864 : 33554432;
        } else {
            function07 = function04;
        }
        if ((805306368 & i) == 0) {
            i2 |= (i & 1073741824) == 0 ? oq5Var.f(tmbVar) : oq5Var.h(tmbVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        int i3 = (oq5Var.f(o0kVar) ? 4 : 2) | 48;
        if (oq5Var.P(i2 & 1, ((306783379 & i2) == 306783378 && (i3 & 19) == 18) ? false : true)) {
            wn5Var2 = wn5Var;
            wn5 C = ild.C(-641375767, new lo1(wn5Var2, 3), oq5Var);
            int i4 = lvf.f;
            j(k4kVar, lvfVar, str2, z2, dibVar2, function05, function02, function06, function07, tmbVar, o0kVar, C, oq5Var, (i2 & 896) | (i2 & 14) | 64 | (i2 & 112) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (3670016 & i2) | (29360128 & i2) | (234881024 & i2) | 1073741824 | (i2 & 1879048192), (i3 & 14) | 48);
        } else {
            wn5Var2 = wn5Var;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            final wn5 wn5Var3 = wn5Var2;
            r.d = new Function2() { // from class: d4k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ezf.i(k4k.this, lvfVar, str, z, dibVar, function0, function02, function03, function04, tmbVar, o0kVar, wn5Var3, (hq5) obj, rvf.R(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void j(k4k k4kVar, lvf lvfVar, String str, boolean z, dib dibVar, Function0 function0, Function0 function02, Function0 function03, Function0 function04, tmb tmbVar, o0k o0kVar, wn5 wn5Var, hq5 hq5Var, int i, int i2) {
        int i3;
        int i4;
        oq5 oq5Var;
        k4kVar.getClass();
        lvfVar.getClass();
        str.getClass();
        dibVar.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        function04.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(261604482);
        if ((i & 6) == 0) {
            i3 = (oq5Var2.f(k4kVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? oq5Var2.f(lvfVar) : oq5Var2.h(lvfVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var2.f(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= oq5Var2.g(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= oq5Var2.h(dibVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i3 |= oq5Var2.h(function0) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((i & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
            i3 |= oq5Var2.h(function02) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= oq5Var2.h(function03) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((i & 100663296) == 0) {
            i3 |= oq5Var2.h(function04) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= (i & 1073741824) == 0 ? oq5Var2.f(tmbVar) : oq5Var2.h(tmbVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (oq5Var2.f(o0kVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i5 = i3;
        boolean z2 = false;
        if (oq5Var2.P(i5 & 1, ((i3 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            tsf a2 = wsf.a(oq5Var2);
            wyf.f(dibVar, a2, oq5Var2, (i5 >> 12) & 14);
            int i6 = i5 & 112;
            boolean z3 = ((i5 & 29360128) == 8388608) | (i6 == 32 || ((i5 & 64) != 0 && oq5Var2.h(lvfVar)));
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (z3 || K == kjnVar) {
                K = new rl1(function03, lvfVar, 3);
                oq5Var2.k0(K);
            }
            Function0 function05 = (Function0) K;
            boolean z4 = (i5 & 234881024) == 67108864;
            if (i6 == 32 || ((i5 & 64) != 0 && oq5Var2.h(lvfVar))) {
                z2 = true;
            }
            boolean z5 = z4 | z2;
            Object K2 = oq5Var2.K();
            if (z5 || K2 == kjnVar) {
                K2 = new rl1(function04, lvfVar, 4);
                oq5Var2.k0(K2);
            }
            wn5 wn5Var2 = new wn5(new e4k(0, function02, z), 891452525, true);
            wn5 C = ild.C(171481746, new up(o0kVar, a2, lvfVar, wn5Var, 23), oq5Var2);
            int i7 = i5 >> 6;
            oq5Var = oq5Var2;
            b(k4kVar, a2, str, function0, function05, (Function0) K2, wn5Var2, tmbVar, null, null, C, oq5Var, (i5 & 910) | (i7 & 7168) | 16777216 | (i7 & 29360128), 768);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lii(k4kVar, lvfVar, str, z, dibVar, function0, function02, function03, function04, tmbVar, o0kVar, wn5Var, i, i2);
        }
    }

    public static final void k(yit yitVar, Function0 function0, Function0 function02, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        String e;
        String e2;
        String e3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(45569532);
        int i2 = i | (oq5Var.h(yitVar) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.h(function02) ? 256 : 128) | 3072;
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = yitVar instanceof o20;
            yciVar2 = vci.a;
            if (z) {
                oq5Var.Z(352467312);
                irf.a(((i2 << 3) & 7168) | ((i2 >> 3) & 910), 16, oq5Var, saf.I((o20) yitVar), yciVar2, function0, function02, false);
                oq5Var.p(false);
            } else {
                String str = "";
                if (yitVar instanceof hm1) {
                    oq5Var.Z(352685583);
                    hm1 hm1Var = (hm1) yitVar;
                    u51 u51Var = hm1Var.a;
                    String str2 = u51Var.b;
                    u9b u9bVar = u51Var.c;
                    if (u9bVar != null && (e3 = u9bVar.e(wct.s(), WebPath$Storage.AVATARS)) != null) {
                        str = e3;
                    }
                    wct.a(new q91(str2, str, hm1Var.b), function0, yciVar2, false, function02, oq5Var, (i2 & 112) | 384 | ((i2 << 6) & 57344), 8);
                    yciVar2 = yciVar2;
                    oq5Var = oq5Var;
                    oq5Var.p(false);
                } else if (yitVar instanceof s3m) {
                    oq5Var.Z(352906861);
                    s3m s3mVar = (s3m) yitVar;
                    eul eulVar = s3mVar.a;
                    u9b u9bVar2 = eulVar.d;
                    swf.j((i2 & 112) | 384 | ((i2 << 6) & 57344), 8, oq5Var, new rab(eulVar.c, "", null, (u9bVar2 == null || (e2 = u9bVar2.e(wct.s(), WebPath$Storage.AVATARS)) == null) ? "" : e2, null, false, s3mVar.b), yciVar2, function0, function02, false);
                    oq5Var.p(false);
                } else if (yitVar instanceof a2g) {
                    oq5Var.Z(353144693);
                    a2g a2gVar = (a2g) yitVar;
                    eul eulVar2 = a2gVar.a;
                    z6a Q = y9w.Q(eulVar2, a2gVar.b, oq5Var);
                    u9b u9bVar3 = eulVar2.d;
                    if (u9bVar3 != null && (e = u9bVar3.e(wct.s(), WebPath$Storage.AVATARS)) != null) {
                        str = e;
                    }
                    y1g.d(function0, new v1g(eulVar2.c, str, null, qo6.e), (w3g) gld.M(Q.b(), oq5Var).getValue(), yciVar2, false, function02, oq5Var, ((i2 >> 3) & 14) | 3072 | ((i2 << 9) & 458752), 16);
                    yciVar2 = yciVar2;
                    oq5Var = oq5Var;
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(842691744);
                    oq5Var.p(false);
                }
            }
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new eim(yitVar, function0, function02, yciVar2, i, 0);
        }
    }

    public static final void l(String str, String str2, List list, Function0 function0, Function1 function1, Function1 function12, Function0 function02, hq5 hq5Var, int i) {
        str.getClass();
        list.getClass();
        function0.getClass();
        function1.getClass();
        function12.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(355978650);
        int i2 = i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.f(str2) ? 32 : 16) | (oq5Var.h(list) ? 256 : 128) | (oq5Var.h(function0) ? 2048 : 1024) | (oq5Var.h(function1) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.h(function12) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var.h(function02) ? 1048576 : 524288);
        if (oq5Var.P(i2 & 1, (i2 & 599187) != 599186)) {
            tsf a2 = wsf.a(oq5Var);
            ogp.g.e(false, false, null, oq5Var, 4150, 4);
            xp3.d(str, a2, null, null, function0, ild.C(-650634600, new f0g(4, function02), oq5Var), false, false, null, null, null, ild.C(2009017680, new lc(a2, str2, list, function1, function12), oq5Var), oq5Var, (i2 & 14) | 196608 | (57344 & (i2 << 3)), 48, 1996);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vl1(str, str2, list, function0, function1, function12, function02, i);
        }
    }

    public static final void m(nru nruVar, y yVar, pu0 pu0Var, hq5 hq5Var, int i) {
        nru nruVar2;
        y yVar2;
        pu0 pu0Var2;
        yVar.getClass();
        pu0Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-381097858);
        int i2 = (oq5Var.h(nruVar) ? 4 : 2) | i | (oq5Var.h(yVar) ? 32 : 16) | (oq5Var.f(pu0Var) ? 256 : 128);
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            nruVar2 = nruVar;
            yVar2 = yVar;
            pu0Var2 = pu0Var;
        } else {
            dzf dzfVar = (dzf) oq5Var.j(ykg.a);
            Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
            u0q f = nruVar.f();
            boolean h = ((i2 & 896) == 256) | oq5Var.h(nruVar) | oq5Var.h(dzfVar) | oq5Var.h(yVar) | oq5Var.h(context);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                nruVar2 = nruVar;
                yVar2 = yVar;
                pu0Var2 = pu0Var;
                inr inrVar = new inr(nruVar2, dzfVar, yVar2, pu0Var2, context, null, 0);
                oq5Var.k0(inrVar);
                K = inrVar;
            } else {
                nruVar2 = nruVar;
                yVar2 = yVar;
                pu0Var2 = pu0Var;
            }
            gld.y(f, dzfVar, (Function2) K, oq5Var);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new t2n(nruVar2, yVar2, pu0Var2, i, 22);
        }
    }

    public static final void n(yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1983309685);
        if (((i | 48) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            wn5 C = ild.C(1221954783, new j1p(18), oq5Var);
            vci vciVar = vci.a;
            a(vciVar, C, oq5Var, 54);
            yciVar = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cxd(yciVar, i, 17);
        }
    }

    public static final void o(vki vkiVar, yci yciVar, hq5 hq5Var, int i) {
        vkiVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1094726416);
        int i2 = (oq5Var.f(vkiVar) ? 4 : 2) | i | (oq5Var.f(yciVar) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            a(yciVar, ild.C(1449147236, new f5r(9, vkiVar), oq5Var), oq5Var, ((i2 >> 3) & 14) | 48);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k0r(vkiVar, yciVar, i, 15);
        }
    }

    public static final void p(sdr sdrVar, final long j, final boolean z, final l0v l0vVar, final m5v m5vVar, hq5 hq5Var, int i) {
        int i2;
        l0v l0vVar2;
        oq5 oq5Var;
        Object obj;
        sdrVar.getClass();
        l0vVar.getClass();
        m5vVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(825209038);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(sdrVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.h(l0vVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var2.h(m5vVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i3 = i2;
        if (oq5Var2.P(i3 & 1, (i3 & 9363) != 9362)) {
            final int U = c3x.U(((dq0) oq5Var2.j(eq0.a)).c.a);
            boolean d = ((i3 & 112) == 32) | oq5Var2.d(U) | oq5Var2.h(m5vVar) | oq5Var2.h(l0vVar) | ((i3 & 896) == 256);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (d || K == kjnVar) {
                obj = new Function1() { // from class: d0v
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        boolean z2;
                        g1v g1vVar;
                        int i4 = U;
                        m5v m5vVar2 = m5vVar;
                        l0v l0vVar3 = l0vVar;
                        long j2 = j;
                        boolean z3 = z;
                        Context context = (Context) obj2;
                        context.getClass();
                        WaveGlShaderView waveGlShaderView = new WaveGlShaderView(context, null, 0, 6, null);
                        m5vVar2.getClass();
                        Context context2 = waveGlShaderView.getRootView().getContext();
                        context2.getClass();
                        Boolean bool = u1g.a;
                        if (bool != null) {
                            z2 = bool.booleanValue();
                        } else {
                            ActivityManager b2 = l1b.b(context2);
                            if (b2 == null) {
                                z2 = false;
                            } else {
                                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                                b2.getMemoryInfo(memoryInfo);
                                ConfigurationInfo deviceConfigurationInfo = b2.getDeviceConfigurationInfo();
                                deviceConfigurationInfo.getClass();
                                z2 = !b2.isLowRamDevice() && memoryInfo.totalMem > 1073741824 && deviceConfigurationInfo.reqGlEsVersion >= 196608;
                                u1g.a = Boolean.valueOf(z2);
                            }
                        }
                        if (z2) {
                            Context context3 = waveGlShaderView.getRootView().getContext();
                            context3.getClass();
                            jsu jsuVar = new jsu(context3, i4, true, 300L);
                            waveGlShaderView.i.setValue(new wn5(new isu(jsuVar, 2, (byte) 0), 504306833, true));
                            waveGlShaderView.l = msu.b;
                            g1vVar = jsuVar;
                        } else {
                            g1v g1vVar2 = new g1v(i4, m5vVar2, (int) 300);
                            waveGlShaderView.i.setValue(new wn5(new lsu(g1vVar2), -79198003, true));
                            waveGlShaderView.l = msu.a;
                            g1vVar = g1vVar2;
                        }
                        waveGlShaderView.j = g1vVar;
                        waveGlShaderView.k = true;
                        if (waveGlShaderView.isAttachedToWindow()) {
                            waveGlShaderView.l();
                        }
                        l0vVar3.getClass();
                        waveGlShaderView.i(Float.intBitsToFloat((int) (4294967295L & j2)) - 0.5f);
                        waveGlShaderView.c(Float.intBitsToFloat((int) (j2 >> 32)) - 0.5f);
                        boolean z4 = false;
                        waveGlShaderView.h(0L, false);
                        l0vVar3.e = waveGlShaderView;
                        bjt bjtVar = l0vVar3.b;
                        vdr vdrVar = (vdr) ((jyr) bjtVar.c).getValue();
                        qyf qyfVar = l0vVar3.a;
                        l0vVar3.i = ox6.B(vdrVar, qyfVar, new f0v(l0vVar3, 0));
                        waveGlShaderView.h(300L, true);
                        pjc b0 = zsd.b0(new y4s(l0vVar3.c.a.c, 23));
                        l0vVar3.k = ox6.B(zsd.M0(b0, new j0v((Continuation) null, l0vVar3, 0)), qyfVar, new g0v(waveGlShaderView, 0));
                        l0vVar3.j = ox6.B(new bca(zsd.Q(b0, new bca(l0vVar3.n, 18), new y4s(l0vVar3.m, 22), new h0v(l0vVar3, null)), 18), qyfVar, new f0v(l0vVar3, 1));
                        l0vVar3.l = ox6.B((pjc) ((jyr) bjtVar.d).getValue(), qyfVar, new g0v(waveGlShaderView, 1));
                        ArrayList arrayList = new ArrayList();
                        vqn vqnVar = new vqn();
                        WaveGlShaderView waveGlShaderView2 = l0vVar3.e;
                        if (waveGlShaderView2 != null) {
                            waveGlShaderView2.setFpsInfoCallback(new ps7(vqnVar, arrayList, l0vVar3, z4, 3));
                        }
                        WaveGlShaderView waveGlShaderView3 = l0vVar3.e;
                        if (waveGlShaderView3 != null) {
                            waveGlShaderView3.setGradientHorizontal(z3);
                        }
                        return waveGlShaderView;
                    }
                };
                l0vVar2 = l0vVar;
                oq5Var2.k0(obj);
            } else {
                obj = K;
                l0vVar2 = l0vVar;
            }
            Function1 function1 = (Function1) obj;
            boolean h = oq5Var2.h(l0vVar2);
            Object K2 = oq5Var2.K();
            if (h || K2 == kjnVar) {
                K2 = new r3s(29, l0vVar2);
                oq5Var2.k0(K2);
            }
            Function1 function12 = (Function1) K2;
            boolean h2 = oq5Var2.h(l0vVar2) | ((i3 & 14) == 4);
            Object K3 = oq5Var2.K();
            if (h2 || K3 == kjnVar) {
                K3 = new wes(23, l0vVar2, sdrVar);
                oq5Var2.k0(K3);
            }
            oq5Var = oq5Var2;
            androidx.compose.ui.viewinterop.a.b(function1, null, null, function12, (Function1) K3, oq5Var, 0, 6);
        } else {
            l0vVar2 = l0vVar;
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new bwn(sdrVar, j, z, l0vVar2, m5vVar, i);
        }
    }

    public static final int q(sjt sjtVar) {
        if (sjtVar instanceof rjt) {
            return 0;
        }
        if (!(sjtVar instanceof qjt)) {
            b6e.s();
            return 0;
        }
        fjt fjtVar = ((qjt) sjtVar).b;
        if (fjtVar instanceof ejt) {
            return ((ejt) fjtVar).a.size();
        }
        if (fjtVar instanceof djt) {
            return 0;
        }
        b6e.s();
        return 0;
    }

    public static final void r(x8a x8aVar, lfm lfmVar) {
        boolean z = swf.z(lfmVar);
        long j = lfmVar.b;
        if (z) {
            x8aVar.f();
        }
        if (!swf.B(lfmVar)) {
            List list = lfmVar.k;
            if (list == null) {
                list = c5b.a;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                zyd zydVar = (zyd) list.get(i);
                x8aVar.a(zydVar.a, zydVar.c);
            }
            x8aVar.a(j, lfmVar.l);
        }
        if (swf.B(lfmVar) && j - x8aVar.a > 40) {
            x8aVar.f();
        }
        x8aVar.a = j;
    }

    public static final int s(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static void t(wsr wsrVar, Object[] objArr) {
        wsrVar.getClass();
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            if (obj == null) {
                wsrVar.bindNull(i);
            } else if (obj instanceof byte[]) {
                wsrVar.bindBlob(i, (byte[]) obj);
            } else if (obj instanceof Float) {
                wsrVar.bindDouble(i, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                wsrVar.bindDouble(i, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                wsrVar.bindLong(i, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                wsrVar.bindLong(i, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                wsrVar.bindLong(i, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                wsrVar.bindLong(i, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                wsrVar.bindString(i, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                wsrVar.bindLong(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
    }

    public static final LinkedHashSet u(byte[] bArr) {
        bArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int readInt = objectInputStream.readInt();
                    for (int i = 0; i < readInt; i++) {
                        Uri parse = Uri.parse(objectInputStream.readUTF());
                        boolean readBoolean = objectInputStream.readBoolean();
                        parse.getClass();
                        linkedHashSet.add(new ca6(readBoolean, parse));
                    }
                    objectInputStream.close();
                } finally {
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            byteArrayInputStream.close();
            return linkedHashSet;
        } finally {
        }
    }

    public static final ajv v(String str, String str2, String str3, String str4, String str5, String str6) {
        return new ajv(gjv.a, str, null, new hlu(new dou(str, o8g.E(t75.c(str)), str2, str3), new np(str4, new op(str5, str6, false), elu.e)));
    }

    public static final Object w(pfm pfmVar, has hasVar, Continuation continuation) {
        Object Q = gld.Q(new n71(pfmVar, hasVar, (Continuation) null, 21), continuation);
        return Q == nm6.a ? Q : Unit.a;
    }

    public static final float x(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static boolean y(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static rop z(Set set, olm olmVar) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof rop)) {
                return new sop(set2, olmVar);
            }
            rop ropVar = (rop) set2;
            olm olmVar2 = ropVar.b;
            olmVar2.getClass();
            return new sop((SortedSet) ropVar.a, new plm(Arrays.asList(olmVar2, olmVar)));
        }
        if (!(set instanceof rop)) {
            set.getClass();
            return new rop(set, olmVar);
        }
        rop ropVar2 = (rop) set;
        olm olmVar3 = ropVar2.b;
        olmVar3.getClass();
        return new rop(ropVar2.a, new plm(Arrays.asList(olmVar3, olmVar)));
    }
}
