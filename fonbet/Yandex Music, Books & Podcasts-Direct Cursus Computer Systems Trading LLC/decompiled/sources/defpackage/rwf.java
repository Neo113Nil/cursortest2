package defpackage;

import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class rwf {
    public static final hee a;

    static {
        int i = hee.c;
        Object[] objArr = new Object[32];
        objArr[0] = "android.media.metadata.TITLE";
        objArr[1] = "android.media.metadata.ARTIST";
        objArr[2] = "android.media.metadata.DURATION";
        objArr[3] = "android.media.metadata.ALBUM";
        objArr[4] = "android.media.metadata.AUTHOR";
        objArr[5] = "android.media.metadata.WRITER";
        System.arraycopy(new String[]{"android.media.metadata.COMPOSER", "android.media.metadata.COMPILATION", "android.media.metadata.DATE", "android.media.metadata.YEAR", "android.media.metadata.GENRE", "android.media.metadata.TRACK_NUMBER", "android.media.metadata.NUM_TRACKS", "android.media.metadata.DISC_NUMBER", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.ART", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART", "android.media.metadata.ALBUM_ART_URI", "android.media.metadata.USER_RATING", "android.media.metadata.RATING", "android.media.metadata.DISPLAY_TITLE", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION", "android.media.metadata.DISPLAY_ICON", "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.MEDIA_ID", "android.media.metadata.MEDIA_URI", "android.media.metadata.BT_FOLDER_TYPE", "android.media.metadata.ADVERTISEMENT", "android.media.metadata.DOWNLOAD_STATUS", "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"}, 0, objArr, 6, 26);
        a = hee.u(32, objArr);
    }

    public static long a(i6l i6lVar, ioh iohVar, long j) {
        long j2 = i6lVar == null ? 0L : i6lVar.c;
        long c = c(i6lVar, iohVar, j);
        long d = d(iohVar);
        return d == -9223372036854775807L ? Math.max(c, j2) : dvt.j(j2, c, d);
    }

    public static byte[] b(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long c(i6l i6lVar, ioh iohVar, long j) {
        if (i6lVar == null) {
            return 0L;
        }
        long j2 = i6lVar.b;
        if (i6lVar.a == 3) {
            j2 = Math.max(0L, j2 + ((long) (i6lVar.d * ((j == -9223372036854775807L ? null : Long.valueOf(j)) != null ? r4.longValue() : SystemClock.elapsedRealtime() - i6lVar.h))));
        }
        long j3 = j2;
        long d = d(iohVar);
        return d == -9223372036854775807L ? Math.max(0L, j3) : dvt.j(j3, 0L, d);
    }

    public static long d(ioh iohVar) {
        if (iohVar == null || !iohVar.a.containsKey("android.media.metadata.DURATION")) {
            return -9223372036854775807L;
        }
        long a2 = iohVar.a("android.media.metadata.DURATION");
        if (a2 <= 0) {
            return -9223372036854775807L;
        }
        return a2;
    }

    public static long e(int i) {
        switch (i) {
            case 0:
                return 0L;
            case 1:
                return 1L;
            case 2:
                return 2L;
            case 3:
                return 3L;
            case 4:
                return 4L;
            case 5:
                return 5L;
            case 6:
                return 6L;
            default:
                xq0.x(k5r.i(i, "Unrecognized FolderType: "));
                return 0L;
        }
    }

    public static int f(long j) {
        if (j == 0) {
            return 0;
        }
        if (j == 1) {
            return 1;
        }
        if (j == 2) {
            return 2;
        }
        if (j == 3) {
            return 3;
        }
        if (j == 4) {
            return 4;
        }
        if (j == 5) {
            return 5;
        }
        return j == 6 ? 6 : 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ee, code lost:
    
        if (r11.equals("android.media.metadata.DISPLAY_SUBTITLE") == false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static pmh g(onh onhVar, Bitmap bitmap) {
        int i;
        CharSequence charSequence;
        CharSequence charSequence2;
        String str = onhVar.a.equals("") ? null : onhVar.a;
        hoh hohVar = onhVar.d;
        Bitmap bitmap2 = bitmap != null ? bitmap : null;
        Bundle bundle = hohVar.I;
        CharSequence charSequence3 = hohVar.a;
        CharSequence charSequence4 = hohVar.f;
        yde ydeVar = hohVar.J;
        Integer num = hohVar.H;
        Integer num2 = hohVar.p;
        if (bundle != null) {
            bundle = new Bundle(bundle);
        }
        boolean z = (num2 == null || num2.intValue() == -1) ? false : true;
        boolean z2 = num != null;
        if (z || z2) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            if (z) {
                num2.getClass();
                i = 0;
                bundle.putLong("android.media.extra.BT_FOLDER_TYPE", e(num2.intValue()));
            } else {
                i = 0;
            }
            if (z2) {
                num.getClass();
                bundle.putLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT", num.intValue());
            }
        } else {
            i = 0;
        }
        if (!ydeVar.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST", new ArrayList<>(ydeVar));
        }
        CharSequence charSequence5 = hohVar.e;
        if (charSequence5 != null) {
            charSequence = hohVar.g;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putCharSequence("androidx.media3.mediadescriptioncompat.title", charSequence3);
        } else {
            CharSequence[] charSequenceArr = new CharSequence[3];
            int i2 = i;
            int i3 = i2;
            while (true) {
                int i4 = 2;
                if (i2 < 3) {
                    String[] strArr = ioh.d;
                    if (i3 < strArr.length) {
                        int i5 = i3 + 1;
                        String str2 = strArr[i3];
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -1853648227:
                                if (str2.equals("android.media.metadata.ARTIST")) {
                                    i4 = i;
                                    break;
                                }
                                i4 = -1;
                                break;
                            case -1224124471:
                                if (str2.equals("android.media.metadata.WRITER")) {
                                    i4 = 1;
                                    break;
                                }
                                i4 = -1;
                                break;
                            case 194702059:
                                break;
                            case 1684534006:
                                if (str2.equals("android.media.metadata.COMPOSER")) {
                                    i4 = 3;
                                    break;
                                }
                                i4 = -1;
                                break;
                            case 1879671865:
                                if (str2.equals("android.media.metadata.ALBUM")) {
                                    i4 = 4;
                                    break;
                                }
                                i4 = -1;
                                break;
                            case 1897146402:
                                if (str2.equals("android.media.metadata.TITLE")) {
                                    i4 = 5;
                                    break;
                                }
                                i4 = -1;
                                break;
                            case 1965214221:
                                if (str2.equals("android.media.metadata.ALBUM_ARTIST")) {
                                    i4 = 6;
                                    break;
                                }
                                i4 = -1;
                                break;
                            default:
                                i4 = -1;
                                break;
                        }
                        switch (i4) {
                            case 0:
                                charSequence2 = hohVar.b;
                                break;
                            case 1:
                                charSequence2 = hohVar.z;
                                break;
                            case 2:
                                charSequence2 = charSequence4;
                                break;
                            case 3:
                                charSequence2 = hohVar.A;
                                break;
                            case 4:
                                charSequence2 = hohVar.c;
                                break;
                            case 5:
                                charSequence2 = charSequence3;
                                break;
                            case 6:
                                charSequence2 = hohVar.d;
                                break;
                            default:
                                charSequence2 = null;
                                break;
                        }
                        if (!TextUtils.isEmpty(charSequence2)) {
                            charSequenceArr[i2] = charSequence2;
                            i2++;
                        }
                        i3 = i5;
                    }
                }
            }
            charSequence5 = charSequenceArr[i];
            charSequence4 = charSequenceArr[1];
            charSequence = charSequenceArr[2];
        }
        return new pmh(str, charSequence5, charSequence4, charSequence, bitmap2, hohVar.m, bundle, onhVar.f.a);
    }

    public static onh h(pmh pmhVar) {
        pmhVar.getClass();
        String str = pmhVar.a;
        xmh xmhVar = new xmh();
        ude udeVar = yde.b;
        qsn qsnVar = qsn.e;
        List list = Collections.EMPTY_LIST;
        dnh dnhVar = new dnh();
        jnh jnhVar = jnh.d;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        t1f t1fVar = new t1f(8, false);
        t1fVar.b = pmhVar.h;
        jnh jnhVar2 = new jnh(t1fVar);
        hoh j = j(pmhVar, 0);
        anh anhVar = new anh(xmhVar);
        fnh fnhVar = new fnh(dnhVar);
        if (j == null) {
            j = hoh.K;
        }
        return new onh(str2, anhVar, null, fnhVar, j, jnhVar2);
    }

    public static onh i(String str, ioh iohVar, int i) {
        jnh jnhVar;
        xmh xmhVar = new xmh();
        ude udeVar = yde.b;
        qsn qsnVar = qsn.e;
        List list = Collections.EMPTY_LIST;
        qsn qsnVar2 = qsn.e;
        dnh dnhVar = new dnh();
        jnh jnhVar2 = jnh.d;
        if (str == null) {
            str = null;
        }
        CharSequence charSequence = iohVar.a.getCharSequence("android.media.metadata.MEDIA_URI");
        String charSequence2 = charSequence != null ? charSequence.toString() : null;
        if (charSequence2 != null) {
            t1f t1fVar = new t1f(8, false);
            t1fVar.b = Uri.parse(charSequence2);
            jnhVar = new jnh(t1fVar);
        } else {
            jnhVar = jnhVar2;
        }
        hoh k = k(iohVar, i);
        if (str == null) {
            str = "";
        }
        String str2 = str;
        anh anhVar = new anh(xmhVar);
        fnh fnhVar = new fnh(dnhVar);
        if (k == null) {
            k = hoh.K;
        }
        return new onh(str2, anhVar, null, fnhVar, k, jnhVar);
    }

    public static hoh j(pmh pmhVar, int i) {
        iin iinVar;
        byte[] bArr;
        if (pmhVar == null) {
            return hoh.K;
        }
        CharSequence charSequence = pmhVar.b;
        eoh eohVar = new eoh();
        eohVar.f = pmhVar.c;
        eohVar.g = pmhVar.d;
        eohVar.m = pmhVar.f;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                iinVar = new iin(i, -1.0f);
                break;
            default:
                iinVar = null;
                break;
        }
        eohVar.i = o(iinVar);
        Bitmap bitmap = pmhVar.e;
        if (bitmap != null) {
            try {
                bArr = b(bitmap);
            } catch (IOException e) {
                vq1.o0("LegacyConversions", "Failed to convert iconBitmap to artworkData", e);
                bArr = null;
            }
            eohVar.b(bArr, 3);
        }
        Bundle bundle = pmhVar.g;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : null;
        if (bundle2 != null && bundle2.containsKey("android.media.extra.BT_FOLDER_TYPE")) {
            eohVar.p = Integer.valueOf(f(bundle2.getLong("android.media.extra.BT_FOLDER_TYPE")));
            bundle2.remove("android.media.extra.BT_FOLDER_TYPE");
        }
        eohVar.q = Boolean.FALSE;
        if (bundle2 != null && bundle2.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            eohVar.G = Integer.valueOf((int) bundle2.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
            bundle2.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle2 != null && bundle2.containsKey("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST")) {
            ArrayList<String> stringArrayList = bundle2.getStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST");
            stringArrayList.getClass();
            eohVar.I = yde.v(yde.v(stringArrayList));
        }
        if (bundle2 == null || !bundle2.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            eohVar.a = charSequence;
        } else {
            eohVar.a = bundle2.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            eohVar.e = charSequence;
            bundle2.remove("androidx.media3.mediadescriptioncompat.title");
        }
        if (bundle2 != null && !bundle2.isEmpty()) {
            eohVar.H = bundle2;
        }
        eohVar.r = Boolean.TRUE;
        return new hoh(eohVar);
    }

    public static hoh k(ioh iohVar, int i) {
        iin iinVar;
        iin iinVar2;
        iin iinVar3;
        String str;
        if (iohVar == null) {
            return hoh.K;
        }
        Bundle bundle = iohVar.a;
        eoh eohVar = new eoh();
        CharSequence charSequence = bundle.getCharSequence("android.media.metadata.TITLE");
        CharSequence charSequence2 = bundle.getCharSequence("android.media.metadata.DISPLAY_TITLE");
        eohVar.a = charSequence != null ? charSequence : charSequence2;
        Bitmap bitmap = null;
        if (charSequence == null) {
            charSequence2 = null;
        }
        eohVar.e = charSequence2;
        eohVar.f = bundle.getCharSequence("android.media.metadata.DISPLAY_SUBTITLE");
        eohVar.g = bundle.getCharSequence("android.media.metadata.DISPLAY_DESCRIPTION");
        eohVar.b = bundle.getCharSequence("android.media.metadata.ARTIST");
        eohVar.c = bundle.getCharSequence("android.media.metadata.ALBUM");
        eohVar.d = bundle.getCharSequence("android.media.metadata.ALBUM_ARTIST");
        try {
            iinVar = iin.a(bundle.getParcelable("android.media.metadata.RATING"));
        } catch (Exception e) {
            Log.w("MediaMetadata", "Failed to retrieve a key as Rating.", e);
            iinVar = null;
        }
        eohVar.j = o(iinVar);
        if (bundle.containsKey("android.media.metadata.DURATION")) {
            long a2 = iohVar.a("android.media.metadata.DURATION");
            if (a2 >= 0) {
                eohVar.c(Long.valueOf(a2));
            }
        }
        try {
            iinVar2 = iin.a(bundle.getParcelable("android.media.metadata.USER_RATING"));
        } catch (Exception e2) {
            Log.w("MediaMetadata", "Failed to retrieve a key as Rating.", e2);
            iinVar2 = null;
        }
        gin o = o(iinVar2);
        if (o != null) {
            eohVar.i = o;
        } else {
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    iinVar3 = new iin(i, -1.0f);
                    break;
                default:
                    iinVar3 = null;
                    break;
            }
            eohVar.i = o(iinVar3);
        }
        if (bundle.containsKey("android.media.metadata.YEAR")) {
            eohVar.s = Integer.valueOf((int) iohVar.a("android.media.metadata.YEAR"));
        }
        String[] strArr = {"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ALBUM_ART_URI", "android.media.metadata.ART_URI"};
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 < 3) {
                String str2 = strArr[i3];
                if (bundle.containsKey(str2)) {
                    CharSequence charSequence3 = bundle.getCharSequence(str2);
                    if (charSequence3 != null) {
                        str = charSequence3.toString();
                    }
                } else {
                    i3++;
                }
            }
        }
        str = null;
        if (str != null) {
            eohVar.m = Uri.parse(str);
        }
        String[] strArr2 = {"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ALBUM_ART", "android.media.metadata.ART"};
        while (true) {
            if (i2 < 3) {
                String str3 = strArr2[i2];
                if (bundle.containsKey(str3)) {
                    try {
                        bitmap = (Bitmap) bundle.getParcelable(str3);
                    } catch (Exception e3) {
                        Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", e3);
                    }
                } else {
                    i2++;
                }
            }
        }
        if (bitmap != null) {
            try {
                eohVar.b(b(bitmap), 3);
            } catch (IOException e4) {
                vq1.o0("LegacyConversions", "Failed to convert artworkBitmap to artworkData", e4);
            }
        }
        boolean containsKey = bundle.containsKey("android.media.metadata.BT_FOLDER_TYPE");
        eohVar.q = Boolean.valueOf(containsKey);
        if (containsKey) {
            eohVar.p = Integer.valueOf(f(iohVar.a("android.media.metadata.BT_FOLDER_TYPE")));
        }
        if (bundle.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            eohVar.G = Integer.valueOf((int) iohVar.a("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
        }
        eohVar.r = Boolean.TRUE;
        Bundle bundle2 = new Bundle(bundle);
        xkt it = a.iterator();
        while (it.hasNext()) {
            bundle2.remove((String) it.next());
        }
        if (!bundle2.isEmpty()) {
            eohVar.H = bundle2;
        }
        return new hoh(eohVar);
    }

    public static ioh l(hoh hohVar, String str, Uri uri, long j, Bitmap bitmap) {
        Long l;
        oxa oxaVar = new oxa(15, (byte) 0);
        oxaVar.D("android.media.metadata.MEDIA_ID", str);
        CharSequence charSequence = hohVar.a;
        Bundle bundle = hohVar.I;
        Integer num = hohVar.p;
        Uri uri2 = hohVar.m;
        if (charSequence != null) {
            oxaVar.E(charSequence, "android.media.metadata.TITLE");
        }
        CharSequence charSequence2 = hohVar.e;
        if (charSequence2 != null) {
            oxaVar.E(charSequence2, "android.media.metadata.DISPLAY_TITLE");
        }
        CharSequence charSequence3 = hohVar.f;
        if (charSequence3 != null) {
            oxaVar.E(charSequence3, "android.media.metadata.DISPLAY_SUBTITLE");
        }
        CharSequence charSequence4 = hohVar.g;
        if (charSequence4 != null) {
            oxaVar.E(charSequence4, "android.media.metadata.DISPLAY_DESCRIPTION");
        }
        CharSequence charSequence5 = hohVar.b;
        if (charSequence5 != null) {
            oxaVar.E(charSequence5, "android.media.metadata.ARTIST");
        }
        CharSequence charSequence6 = hohVar.c;
        if (charSequence6 != null) {
            oxaVar.E(charSequence6, "android.media.metadata.ALBUM");
        }
        CharSequence charSequence7 = hohVar.d;
        if (charSequence7 != null) {
            oxaVar.E(charSequence7, "android.media.metadata.ALBUM_ARTIST");
        }
        if (hohVar.t != null) {
            oxaVar.A("android.media.metadata.YEAR", r7.intValue());
        }
        if (uri != null) {
            oxaVar.D("android.media.metadata.MEDIA_URI", uri.toString());
        }
        if (uri2 != null) {
            oxaVar.D("android.media.metadata.DISPLAY_ICON_URI", uri2.toString());
            oxaVar.D("android.media.metadata.ALBUM_ART_URI", uri2.toString());
            oxaVar.D("android.media.metadata.ART_URI", uri2.toString());
        }
        if (bitmap != null) {
            oxaVar.z("android.media.metadata.DISPLAY_ICON", bitmap);
            oxaVar.z("android.media.metadata.ALBUM_ART", bitmap);
        }
        if (num != null && num.intValue() != -1) {
            oxaVar.A("android.media.metadata.BT_FOLDER_TYPE", e(num.intValue()));
        }
        if (j == -9223372036854775807L && (l = hohVar.h) != null) {
            j = l.longValue();
        }
        if (j != -9223372036854775807L) {
            oxaVar.A("android.media.metadata.DURATION", j);
        }
        iin p = p(hohVar.i);
        if (p != null) {
            oxaVar.C("android.media.metadata.USER_RATING", p);
        }
        iin p2 = p(hohVar.j);
        if (p2 != null) {
            oxaVar.C("android.media.metadata.RATING", p2);
        }
        if (hohVar.H != null) {
            oxaVar.A("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT", r6.intValue());
        }
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj == null || (obj instanceof CharSequence)) {
                    oxaVar.E((CharSequence) obj, str2);
                } else if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
                    oxaVar.A(str2, ((Number) obj).longValue());
                }
            }
        }
        return new ioh((Bundle) oxaVar.b);
    }

    public static hzk m(i6l i6lVar) {
        if (i6lVar == null || i6lVar.a != 7) {
            return null;
        }
        CharSequence charSequence = i6lVar.g;
        Bundle bundle = i6lVar.k;
        String charSequence2 = charSequence != null ? charSequence.toString() : null;
        int r = r(i6lVar.f);
        if (r == -5) {
            r = 2000;
        } else if (r == -1) {
            r = 1000;
        }
        int i = r;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        return new hzk(charSequence2, null, i, bundle, SystemClock.elapsedRealtime());
    }

    public static int n(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                vq1.n0("LegacyConversions", "Unrecognized RepeatMode: " + i + " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`");
                return 0;
            }
        }
        return i2;
    }

    public static gin o(iin iinVar) {
        if (iinVar == null) {
            return null;
        }
        float f = iinVar.b;
        int i = iinVar.a;
        switch (i) {
            case 1:
                if (iinVar.e()) {
                    return new uwd(i == 1 && f == 1.0f);
                }
                return new uwd();
            case 2:
                if (iinVar.e()) {
                    return new hgs(i == 2 && f == 1.0f);
                }
                return new hgs();
            case 3:
                return iinVar.e() ? new ibr(3, iinVar.d()) : new ibr(3);
            case 4:
                return iinVar.e() ? new ibr(4, iinVar.d()) : new ibr(4);
            case 5:
                return iinVar.e() ? new ibr(5, iinVar.d()) : new ibr(5);
            case 6:
                if (!iinVar.e()) {
                    return new gkk();
                }
                if (i != 6 || !iinVar.e()) {
                    f = -1.0f;
                }
                return new gkk(f);
            default:
                return null;
        }
    }

    public static iin p(gin ginVar) {
        if (ginVar != null) {
            int v = v(ginVar);
            if (!ginVar.b()) {
                switch (v) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return new iin(v, -1.0f);
                    default:
                        return null;
                }
            }
            switch (v) {
                case 1:
                    return new iin(1, ((uwd) ginVar).c ? 1.0f : 0.0f);
                case 2:
                    return new iin(2, ((hgs) ginVar).c ? 1.0f : 0.0f);
                case 3:
                case 4:
                case 5:
                    return iin.g(v, ((ibr) ginVar).c);
                case 6:
                    return iin.f(((gkk) ginVar).b);
            }
        }
        return null;
    }

    public static int q(int i) {
        if (i == -1 || i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 3) {
                vq1.n0("LegacyConversions", "Unrecognized PlaybackStateCompat.RepeatMode: " + i + " was converted to `Player.REPEAT_MODE_OFF`");
                return 0;
            }
        }
        return i2;
    }

    public static int r(int i) {
        switch (i) {
            case 1:
                return -2;
            case 2:
                return -6;
            case 3:
                return -102;
            case 4:
                return -103;
            case 5:
                return -104;
            case 6:
                return -105;
            case 7:
                return -106;
            case 8:
                return -110;
            case 9:
                return -107;
            case 10:
                return 1;
            case 11:
                return -109;
            default:
                return -1;
        }
    }

    public static boolean s(int i) {
        if (i == -1 || i == 0) {
            return false;
        }
        if (i == 1 || i == 2) {
            return true;
        }
        xq0.x(k5r.i(i, "Unrecognized ShuffleMode: "));
        return false;
    }

    public static void t(lcg lcgVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        long j = 3000;
        while (true) {
            try {
                try {
                    lcgVar.get(j, TimeUnit.MILLISECONDS);
                    if (z) {
                        return;
                    } else {
                        return;
                    }
                } catch (InterruptedException unused) {
                    z = true;
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (elapsedRealtime2 >= 3000) {
                        throw new TimeoutException();
                    }
                    j = 3000 - elapsedRealtime2;
                }
            } finally {
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public static int u(dv1 dv1Var) {
        int i = hv1.b;
        int i2 = 8;
        xzi fv1Var = Build.VERSION.SDK_INT >= 26 ? new fv1(8) : new xzi(8);
        AudioAttributes.Builder builder = (AudioAttributes.Builder) fv1Var.a;
        builder.setContentType(dv1Var.a);
        builder.setFlags(dv1Var.b);
        fv1Var.j0(dv1Var.c);
        ev1 U = fv1Var.U();
        int i3 = U.b;
        if (i3 == -1) {
            int a2 = U.a();
            int b = U.b();
            int i4 = hv1.b;
            if ((a2 & 1) != 1) {
                if ((a2 & 4) != 4) {
                    switch (b) {
                        case 2:
                            i2 = 0;
                            break;
                        case 3:
                            break;
                        case 4:
                            i2 = 4;
                            break;
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            i2 = 5;
                            break;
                        case 6:
                            i2 = 2;
                            break;
                        case 11:
                            i2 = 10;
                            break;
                        case 12:
                        default:
                            i2 = 3;
                            break;
                        case 13:
                            i2 = 1;
                            break;
                    }
                } else {
                    i2 = 6;
                }
            } else {
                i2 = 7;
            }
        } else {
            i2 = i3;
        }
        if (i2 == Integer.MIN_VALUE) {
            return 3;
        }
        return i2;
    }

    public static int v(gin ginVar) {
        if (ginVar instanceof uwd) {
            return 1;
        }
        if (ginVar instanceof hgs) {
            return 2;
        }
        if (!(ginVar instanceof ibr)) {
            return ginVar instanceof gkk ? 6 : 0;
        }
        int i = ((ibr) ginVar).b;
        int i2 = 3;
        if (i != 3) {
            i2 = 4;
            if (i != 4) {
                i2 = 5;
                if (i != 5) {
                    return 0;
                }
            }
        }
        return i2;
    }

    public static boolean w(long j, long j2) {
        return (j & j2) != 0;
    }
}
