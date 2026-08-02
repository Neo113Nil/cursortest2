package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.music.shared.dto.CoverPathDto;
import com.yandex.music.shared.dto.artist.ArtistCountsDto;
import com.yandex.music.shared.dto.artist.ArtistDescriptionDto;
import com.yandex.music.shared.dto.artist.ArtistDto;
import com.yandex.music.shared.dto.artist.ArtistStatsDto;
import com.yandex.music.shared.dto.artist.DecomposedDto;
import com.yandex.music.shared.dto.domainitem.ArtistDomainItemDto;
import com.yandex.music.shared.dto.domainitem.ContentRestrictionsDto;
import com.yandex.music.shared.dto.donation.DonationDomainItemDto;
import com.yandex.music.shared.dto.donation.DonationDomainItemGoalDto;
import com.yandex.music.shared.dto.trailer.TrailerDto;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.KotlinVersion;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;
import ru.yandex.music.data.audio.Album$AlbumType;
import ru.yandex.music.data.audio.WarningContent;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes5.dex */
public abstract class lxe {
    public static final wn5 a = new wn5(new t83(19), 1423064983, false);
    public static final wn5 b = new wn5(new go5(29), 1388743480, false);
    public static final wn5 c = new wn5(new po5(12), -1836227972, false);
    public static final wn5 d = new wn5(new ap5(16), 2136249453, false);
    public static final sob e = new sob(0);
    public static final i5l f = new i5l();

    public lxe() {
        new Date(System.currentTimeMillis());
    }

    public static final void A(TextPaint textPaint, float f2) {
        if (Float.isNaN(f2)) {
            return;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f2 * KotlinVersion.MAX_COMPONENT_VALUE));
    }

    public static final lt B(oq oqVar) {
        oqVar.getClass();
        String str = oqVar.a;
        Album$AlbumType d2 = oqVar.d();
        String str2 = oqVar.b;
        WarningContent warningContent = oqVar.g;
        String uri = oqVar.o.getUri();
        return new lt(str, d2, str2, warningContent, uri != null ? new u9b(uri, null, null) : null, new gd6(oqVar.h(), oqVar.g(), true));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0096, code lost:
    
        if (r3 != null) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final c01 C(ArtistDto artistDto) {
        ArrayList arrayList;
        a01 a01Var;
        b01 b01Var;
        CoverPath none;
        CoverPath none2;
        Boolean available;
        String type;
        List<ArtistDto> decomposed;
        String id = artistDto.getId();
        x41 x41Var = null;
        String str = (id == null || StringsKt.U(id)) ? null : id;
        if (str == null) {
            return null;
        }
        DecomposedDto decomposed2 = artistDto.getDecomposed();
        if (decomposed2 == null || (decomposed = decomposed2.getDecomposed()) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (ArtistDto artistDto2 : decomposed) {
                c01 C = artistDto2 != null ? C(artistDto2) : null;
                if (C != null) {
                    arrayList2.add(C);
                }
            }
            arrayList = arrayList2;
        }
        DecomposedDto decomposed3 = artistDto.getDecomposed();
        String joinSymbol = decomposed3 != null ? decomposed3.getJoinSymbol() : null;
        String name = artistDto.getName();
        if (name == null) {
            name = "unknown";
        }
        String str2 = name;
        ArtistCountsDto counts = artistDto.getCounts();
        boolean z = false;
        if (counts != null) {
            Integer tracks = counts.getTracks();
            if (tracks != null) {
                int intValue = tracks.intValue();
                Integer directAlbums = counts.getDirectAlbums();
                if (directAlbums != null) {
                    int intValue2 = directAlbums.intValue();
                    Integer alsoAlbums = counts.getAlsoAlbums();
                    if (alsoAlbums != null) {
                        int intValue3 = alsoAlbums.intValue();
                        Integer discography = counts.getDiscography();
                        a01Var = new a01(intValue, intValue2, intValue3, discography != null ? discography.intValue() : 0);
                    }
                }
            }
            a01Var = null;
        }
        a01Var = a01.h;
        a01 a01Var2 = a01Var;
        ArtistDescriptionDto description = artistDto.getDescription();
        if (description != null) {
            String text = description.getText();
            b01Var = text == null ? null : new b01(text);
        } else {
            b01Var = null;
        }
        String error = artistDto.getError();
        boolean booleanValue = (error == null || error.length() <= 0) ? artistDto.getAvailable() != null ? artistDto.getAvailable().booleanValue() : true : false;
        String coverUri = artistDto.getCoverUri();
        if (coverUri != null) {
            WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS;
            webPath$Storage.getClass();
            none = etn.B(coverUri, webPath$Storage);
        } else {
            CoverPathDto cover = artistDto.getCover();
            if (cover != null) {
                none = q6k.H(cover, WebPath$Storage.AVATARS);
            } else {
                none = CoverPath.none();
                none.getClass();
            }
        }
        CoverPath coverPath = none;
        CoverPathDto cutoutCover = artistDto.getCutoutCover();
        if (cutoutCover != null) {
            none2 = q6k.H(cutoutCover, WebPath$Storage.AVATARS_NO_CROP);
        } else {
            none2 = CoverPath.none();
            none2.getClass();
        }
        CoverPath coverPath2 = none2;
        Boolean composer = artistDto.getComposer();
        boolean booleanValue2 = composer != null ? composer.booleanValue() : false;
        Integer likesCount = artistDto.getLikesCount();
        int intValue4 = likesCount != null ? likesCount.intValue() : 0;
        Boolean various = artistDto.getVarious();
        boolean booleanValue3 = various != null ? various.booleanValue() : false;
        Boolean childContent = artistDto.getChildContent();
        boolean booleanValue4 = childContent != null ? childContent.booleanValue() : false;
        List disclaimer = artistDto.getDisclaimer();
        List O = disclaimer != null ? CollectionsKt.O(disclaimer) : c5b.a;
        CoverPathDto cover2 = artistDto.getCover();
        if (cover2 != null && (type = cover2.getType()) != null) {
            x41Var = type.equals("from-artist-photos") ? x41.a : x41.b;
        }
        x41 x41Var2 = x41Var;
        TrailerDto trailerDto = artistDto.getTrailerDto();
        if (trailerDto != null && (available = trailerDto.getAvailable()) != null) {
            z = available.booleanValue();
        }
        return new c01(str, str2, booleanValue3, booleanValue2, booleanValue, b01Var, intValue4, arrayList, joinSymbol, a01Var2, coverPath, coverPath2, booleanValue4, O, x41Var2, z);
    }

    public static final fk1 D(ArtistStatsDto artistStatsDto) {
        Integer lastMonthListeners = artistStatsDto.getLastMonthListeners();
        if (lastMonthListeners != null) {
            return new fk1(lastMonthListeners.intValue(), artistStatsDto.getLastMonthListenersDelta());
        }
        return null;
    }

    public static final List E(List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return t75.c(c01.v);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ArtistDto artistDto = (ArtistDto) it.next();
            c01 C = artistDto != null ? C(artistDto) : null;
            if (C != null) {
                arrayList.add(C);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [c5b] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [c5b] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public static final gd6 F(ContentRestrictionsDto contentRestrictionsDto) {
        ?? r2;
        ?? r3;
        h94 h94Var;
        List<String> disclaimers = contentRestrictionsDto.getDisclaimers();
        if (disclaimers != null) {
            r2 = new ArrayList();
            for (String str : disclaimers) {
                hs5 g0 = str != null ? wdp.g0(str) : null;
                if (g0 != null) {
                    r2.add(g0);
                }
            }
        } else {
            r2 = c5b.a;
        }
        List<String> disclaimers2 = contentRestrictionsDto.getDisclaimers();
        if (disclaimers2 != null) {
            r3 = new ArrayList();
            for (String str2 : disclaimers2) {
                if (str2 != null) {
                    h94.b.getClass();
                    h94Var = hs4.z(str2);
                } else {
                    h94Var = null;
                }
                if (h94Var != null) {
                    r3.add(h94Var);
                }
            }
        } else {
            r3 = c5b.a;
        }
        Boolean available = contentRestrictionsDto.getAvailable();
        return new gd6(r2, r3, available != null ? available.booleanValue() : true);
    }

    public static final m7a G(DonationDomainItemDto donationDomainItemDto) {
        ArtistDomainItemDto artist;
        u51 K;
        String title;
        String tipUrl = donationDomainItemDto.getTipUrl();
        u7a u7aVar = null;
        if (tipUrl != null) {
            if (!t7a.a.e(tipUrl)) {
                tipUrl = null;
            }
            if (tipUrl != null && (artist = donationDomainItemDto.getArtist()) != null && (K = ltg.K(artist)) != null) {
                DonationDomainItemGoalDto goal = donationDomainItemDto.getGoal();
                if (goal != null && (title = goal.getTitle()) != null) {
                    u7aVar = new u7a(title);
                }
                return new m7a(tipUrl, u7aVar, K);
            }
        }
        return null;
    }

    public static String H(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof String) {
            StringBuffer stringBuffer = new StringBuffer("\"");
            StringBuffer stringBuffer2 = new StringBuffer();
            k((String) obj, stringBuffer2);
            stringBuffer.append(stringBuffer2.toString());
            stringBuffer.append("\"");
            return stringBuffer.toString();
        }
        if (obj instanceof Double) {
            Double d2 = (Double) obj;
            return (d2.isInfinite() || d2.isNaN()) ? "null" : obj.toString();
        }
        if (!(obj instanceof Float)) {
            return obj instanceof Number ? obj.toString() : obj instanceof Boolean ? obj.toString() : obj instanceof p1f ? ((p1f) obj).g() : obj instanceof Map ? s1f.b((Map) obj) : obj instanceof List ? o1f.n((List) obj) : obj.toString();
        }
        Float f2 = (Float) obj;
        return (f2.isInfinite() || f2.isNaN()) ? "null" : obj.toString();
    }

    public static final Map I(t5a t5aVar) {
        if (t5aVar != null) {
            return uah.e(new Pair("queryPath", t5aVar.a), new Pair("queryParams", t5aVar.b.toString()));
        }
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        return e5bVar;
    }

    public static String J(int i) {
        return i == 0 ? "Clear" : i == 1 ? "Src" : i == 2 ? "Dst" : i == 3 ? "SrcOver" : i == 4 ? "DstOver" : i == 5 ? "SrcIn" : i == 6 ? "DstIn" : i == 7 ? "SrcOut" : i == 8 ? "DstOut" : i == 9 ? "SrcAtop" : i == 10 ? "DstAtop" : i == 11 ? "Xor" : i == 12 ? "Plus" : i == 13 ? "Modulate" : i == 14 ? "Screen" : i == 15 ? "Overlay" : i == 16 ? "Darken" : i == 17 ? "Lighten" : i == 18 ? "ColorDodge" : i == 19 ? "ColorBurn" : i == 20 ? "HardLight" : i == 21 ? "Softlight" : i == 22 ? "Difference" : i == 23 ? "Exclusion" : i == 24 ? "Multiply" : i == 25 ? "Hue" : i == 26 ? "Saturation" : i == 27 ? "Color" : i == 28 ? "Luminosity" : "Unknown";
    }

    public static final String K(long j) {
        msa msaVar = nsa.b;
        long N = yd5.N(j, ssa.MILLISECONDS);
        long s = nsa.s(N, ssa.HOURS);
        int g = nsa.g(N);
        int i = nsa.i(N);
        nsa.h(N);
        String format = s > 0 ? String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(g)}, 1)) : String.valueOf(g);
        String format2 = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        if (s <= 0) {
            return ouj.o(format, StringUtils.PROCESS_POSTFIX_DELIMITER, format2);
        }
        return s + StringUtils.PROCESS_POSTFIX_DELIMITER + format + StringUtils.PROCESS_POSTFIX_DELIMITER + format2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v25, types: [int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void L(Context context, Executor executor, wtm wtmVar, boolean z) {
        boolean z2;
        ?? r7;
        fio[] fioVarArr;
        fio[] fioVarArr2;
        fio[] fioVarArr3;
        byte[] bArr;
        boolean z3;
        boolean z4;
        Throwable th;
        Throwable th2;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        ?? byteArrayOutputStream;
        d18 d18Var;
        String str;
        String str2;
        FileInputStream e2;
        boolean z9;
        boolean z10;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z10 = readLong == packageInfo.lastUpdateTime;
                            if (z10) {
                                wtmVar.g(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z10) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        jum.c(context, false);
                        return;
                    }
                }
                z10 = false;
                if (z10) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            byte[] bArr2 = saf.l;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            d18 d18Var2 = new d18(assets, executor, wtmVar, name, file2);
            byte[] bArr3 = (byte[]) d18Var2.d;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        d18Var2.f(4, null);
                    }
                    d18Var2.a = true;
                    try {
                        try {
                            r7 = d18Var2.e(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e3) {
                            wtmVar.g(6, e3);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            fioVarArr2 = (fio[]) d18Var2.h;
                            if (fioVarArr2 != null) {
                            }
                            wtm wtmVar2 = (wtm) d18Var2.c;
                            fioVarArr3 = (fio[]) d18Var2.h;
                            byte[] bArr4 = (byte[]) d18Var2.d;
                            boolean z11 = r7;
                            z11 = r7;
                            if (fioVarArr3 != null) {
                            }
                            bArr = (byte[]) d18Var2.e;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z9 = z5;
                            jum.c(context, (z6 || !z) ? false : z9);
                        } catch (IOException e4) {
                            wtmVar.g(7, e4);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            fioVarArr2 = (fio[]) d18Var2.h;
                            if (fioVarArr2 != null) {
                            }
                            wtm wtmVar22 = (wtm) d18Var2.c;
                            fioVarArr3 = (fio[]) d18Var2.h;
                            byte[] bArr42 = (byte[]) d18Var2.d;
                            boolean z112 = r7;
                            z112 = r7;
                            if (fioVarArr3 != null) {
                            }
                            bArr = (byte[]) d18Var2.e;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z9 = z5;
                            jum.c(context, (z6 || !z) ? false : z9);
                        }
                        if (r7 != 0) {
                            try {
                                try {
                                } catch (IOException e5) {
                                    wtmVar.g(7, e5);
                                    try {
                                        r7.close();
                                    } catch (IOException e6) {
                                        wtmVar.g(7, e6);
                                    }
                                    fioVarArr = null;
                                    d18Var2.h = fioVarArr;
                                    fioVarArr2 = (fio[]) d18Var2.h;
                                    if (fioVarArr2 != null) {
                                    }
                                    wtm wtmVar222 = (wtm) d18Var2.c;
                                    fioVarArr3 = (fio[]) d18Var2.h;
                                    byte[] bArr422 = (byte[]) d18Var2.d;
                                    boolean z1122 = r7;
                                    z1122 = r7;
                                    if (fioVarArr3 != null) {
                                    }
                                    bArr = (byte[]) d18Var2.e;
                                    if (bArr != null) {
                                    }
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    jum.c(context, (z6 || !z) ? false : z9);
                                }
                            } catch (IllegalStateException e7) {
                                wtmVar.g(8, e7);
                                r7.close();
                                fioVarArr = null;
                                d18Var2.h = fioVarArr;
                                fioVarArr2 = (fio[]) d18Var2.h;
                                if (fioVarArr2 != null) {
                                }
                                wtm wtmVar2222 = (wtm) d18Var2.c;
                                fioVarArr3 = (fio[]) d18Var2.h;
                                byte[] bArr4222 = (byte[]) d18Var2.d;
                                boolean z11222 = r7;
                                z11222 = r7;
                                if (fioVarArr3 != null) {
                                }
                                bArr = (byte[]) d18Var2.e;
                                if (bArr != null) {
                                }
                                if (z4) {
                                }
                                z6 = z4;
                                z9 = z5;
                                jum.c(context, (z6 || !z) ? false : z9);
                            }
                            if (!Arrays.equals(bArr2, n7w.Y(4, r7))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            fioVarArr = saf.i0(r7, n7w.Y(4, r7), (String) d18Var2.g);
                            try {
                                r7.close();
                            } catch (IOException e8) {
                                wtmVar.g(7, e8);
                            }
                            d18Var2.h = fioVarArr;
                        }
                        fioVarArr2 = (fio[]) d18Var2.h;
                        if (fioVarArr2 != null && ((r7 = Build.VERSION.SDK_INT) >= 31 || r7 == 24 || r7 == 25)) {
                            try {
                                str2 = "dexopt/baseline.profm";
                                e2 = d18Var2.e(assets, "dexopt/baseline.profm");
                                str = str2;
                            } catch (FileNotFoundException e9) {
                                wtmVar.g(9, e9);
                                str = r7;
                            } catch (IOException e10) {
                                wtmVar.g(7, e10);
                                str = r7;
                            } catch (IllegalStateException e11) {
                                d18Var2.h = null;
                                wtmVar.g(8, e11);
                                str = r7;
                            }
                            if (e2 == null) {
                                try {
                                    if (!Arrays.equals(saf.m, n7w.Y(4, e2))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] Y = n7w.Y(4, e2);
                                    d18Var2.h = saf.f0(e2, Y, bArr3, fioVarArr2);
                                    e2.close();
                                    d18Var = d18Var2;
                                    r7 = Y;
                                    if (d18Var != null) {
                                        d18Var2 = d18Var;
                                    }
                                } finally {
                                }
                            } else {
                                if (e2 != null) {
                                    e2.close();
                                    str = str2;
                                }
                                d18Var = null;
                                r7 = str;
                                if (d18Var != null) {
                                }
                            }
                        }
                        wtm wtmVar22222 = (wtm) d18Var2.c;
                        fioVarArr3 = (fio[]) d18Var2.h;
                        byte[] bArr42222 = (byte[]) d18Var2.d;
                        boolean z112222 = r7;
                        z112222 = r7;
                        if (fioVarArr3 != null && bArr42222 != null) {
                            z7 = d18Var2.a;
                            if (z7) {
                                xq0.q("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr2);
                                    byteArrayOutputStream.write(bArr42222);
                                } finally {
                                }
                            } catch (IOException e12) {
                                wtmVar22222.g(7, e12);
                                z8 = z7;
                            } catch (IllegalStateException e13) {
                                wtmVar22222.g(8, e13);
                                z8 = z7;
                            }
                            if (saf.s0(byteArrayOutputStream, bArr42222, fioVarArr3)) {
                                d18Var2.e = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                z8 = byteArrayOutputStream;
                                d18Var2.h = null;
                                z112222 = z8;
                            } else {
                                wtmVar22222.g(5, null);
                                d18Var2.h = null;
                                byteArrayOutputStream.close();
                                z112222 = byteArrayOutputStream;
                            }
                        }
                        bArr = (byte[]) d18Var2.e;
                        if (bArr != null) {
                            z4 = false;
                            z5 = true;
                        } else {
                            try {
                                if (!d18Var2.a) {
                                    xq0.q("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream((File) d18Var2.f);
                                                try {
                                                    try {
                                                        FileChannel channel = fileOutputStream.getChannel();
                                                        try {
                                                            FileLock tryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (tryLock != null) {
                                                                        try {
                                                                            if (tryLock.isValid()) {
                                                                                byte[] bArr5 = new byte[RemoteCameraConfig.Mic.BUFFER_SIZE];
                                                                                while (true) {
                                                                                    int read = byteArrayInputStream.read(bArr5);
                                                                                    if (read <= 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr5, 0, read);
                                                                                    }
                                                                                }
                                                                                z5 = true;
                                                                                d18Var2.f(1, null);
                                                                                tryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                d18Var2.e = null;
                                                                                d18Var2.h = null;
                                                                                z4 = true;
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            Throwable th4 = th;
                                                                            if (tryLock == null) {
                                                                                throw th4;
                                                                            }
                                                                            try {
                                                                                tryLock.close();
                                                                                throw th4;
                                                                            } catch (Throwable th5) {
                                                                                th4.addSuppressed(th5);
                                                                                throw th4;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    Throwable th7 = th;
                                                                    if (channel == null) {
                                                                        throw th7;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th7;
                                                                    } catch (Throwable th8) {
                                                                        th7.addSuppressed(th8);
                                                                        throw th7;
                                                                    }
                                                                }
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                            }
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                        }
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th12) {
                                                            th2.addSuppressed(th12);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th14) {
                                                th = th14;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th15) {
                                                    th.addSuppressed(th15);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e14) {
                                        e = e14;
                                        z112222 = true;
                                        d18Var2.f(6, e);
                                        z3 = z112222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z9 = z5;
                                        jum.c(context, (z6 || !z) ? false : z9);
                                    } catch (IOException e15) {
                                        e = e15;
                                        z112222 = true;
                                        d18Var2.f(7, e);
                                        z3 = z112222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z9 = z5;
                                        jum.c(context, (z6 || !z) ? false : z9);
                                    }
                                } catch (FileNotFoundException e16) {
                                    e = e16;
                                    d18Var2.f(6, e);
                                    z3 = z112222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    jum.c(context, (z6 || !z) ? false : z9);
                                } catch (IOException e17) {
                                    e = e17;
                                    d18Var2.f(7, e);
                                    z3 = z112222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    jum.c(context, (z6 || !z) ? false : z9);
                                }
                            } finally {
                                d18Var2.e = null;
                                d18Var2.h = null;
                            }
                        }
                        if (z4) {
                            y(packageInfo, filesDir);
                        }
                        z6 = z4;
                        z9 = z5;
                    } finally {
                    }
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            d18Var2.f(4, null);
                        }
                        d18Var2.a = true;
                        r7 = d18Var2.e(assets, "dexopt/baseline.prof");
                        if (r7 != 0) {
                        }
                        fioVarArr2 = (fio[]) d18Var2.h;
                        if (fioVarArr2 != null) {
                            str2 = "dexopt/baseline.profm";
                            e2 = d18Var2.e(assets, "dexopt/baseline.profm");
                            str = str2;
                            if (e2 == null) {
                            }
                        }
                        wtm wtmVar222222 = (wtm) d18Var2.c;
                        fioVarArr3 = (fio[]) d18Var2.h;
                        byte[] bArr422222 = (byte[]) d18Var2.d;
                        boolean z1122222 = r7;
                        z1122222 = r7;
                        if (fioVarArr3 != null) {
                            z7 = d18Var2.a;
                            if (z7) {
                            }
                        }
                        bArr = (byte[]) d18Var2.e;
                        if (bArr != null) {
                        }
                        if (z4) {
                        }
                        z6 = z4;
                        z9 = z5;
                    } catch (IOException unused2) {
                        z2 = true;
                        d18Var2.f(4, null);
                    }
                }
                jum.c(context, (z6 || !z) ? false : z9);
            }
            d18Var2.f(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z2 = true;
            z6 = false;
            z9 = z2;
            jum.c(context, (z6 || !z) ? false : z9);
        } catch (PackageManager.NameNotFoundException e18) {
            wtmVar.g(7, e18);
            jum.c(context, false);
        }
    }

    public static final void a(Function0 function0, hq5 hq5Var, int i) {
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-962762143);
        int i2 = (oq5Var.h(function0) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            vci vciVar = vci.a;
            float f2 = 24;
            yci q = a.q(gut.a0(a.o(d.d(vciVar, 1.0f), f2, 0.0f, 2)), 0.0f, 0.0f, 0.0f, 32, 7);
            ta5 a2 = sa5.a(qx0.c, b2c.o, oq5Var, 48);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, q);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            u1g.l(oq5Var, d.e(vciVar, f2));
            if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
                oq5Var.Z(474418026);
                ug3.a(androidx.compose.foundation.a.b(d.e(d.r(vciVar, 300), 160), d85.k, vnj.i), oq5Var, 6);
                oq5Var.p(false);
            } else {
                oq5Var.Z(474100493);
                p1g.a("https://avatars.mds.yandex.net/get-music-misc/49997/img.675c083d12011b3d7ba472a1/1000x1000", null, d.e(d.r(vciVar, 300), 160), null, null, null, null, 0.0f, null, 0, oq5Var, 438, 1016);
                oq5Var.p(false);
            }
            String o = vz1.o(vciVar, f2, oq5Var, R.string.artists_top_onboarding_title, oq5Var);
            ges c2 = nu0.c();
            agr agrVar = eq0.a;
            xcs.b(o, androidx.compose.foundation.a.k(vciVar, true, null), ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, c2, oq5Var, 48, 0, 65016);
            xcs.b(vz1.o(vciVar, 12, oq5Var, R.string.artists_top_onboarding_description, oq5Var), null, ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var, 0, 0, 65018);
            oq5Var = oq5Var;
            hdg.o(vz1.o(vciVar, f2, oq5Var, R.string.artists_top_onboarding_action, oq5Var), function0, null, 0.0f, oq5Var, (i2 << 3) & 112, 12);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new zk(function0, i, 5);
        }
    }

    public static final void b(Function1 function1, q84 q84Var, v84 v84Var, pv9 pv9Var, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        boolean z;
        long j;
        function1.getClass();
        v84Var.getClass();
        pv9Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-498040624);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(q84Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.d(v84Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(pv9Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if (oq5Var.P(i2 & 1, (i2 & 9363) != 9362)) {
            agr agrVar = eq0.a;
            int U = c3x.U(((dq0) oq5Var.j(agrVar)).a.c);
            int i3 = i2 & 14;
            boolean d2 = ((i2 & 7168) == 2048) | oq5Var.d(U) | (i3 == 4);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (d2 || K == kjnVar) {
                K = new v50(pv9Var, U, function1, 4);
                oq5Var.k0(K);
            }
            Function1 function12 = (Function1) K;
            int ordinal = v84Var.ordinal();
            if (ordinal == 0) {
                oq5Var.Z(1985395430);
                int i4 = q84Var.n.a;
                if (q84Var.m) {
                    oq5Var.Z(-1875610184);
                    j = ((dq0) oq5Var.j(agrVar)).a.h;
                    z = false;
                } else {
                    z = false;
                    oq5Var.Z(-1875609095);
                    j = ((dq0) oq5Var.j(agrVar)).a.c;
                }
                oq5Var.p(z);
                boolean z2 = i3 == 4;
                Object K2 = oq5Var.K();
                if (z2 || K2 == kjnVar) {
                    K2 = new pl3(2, function1);
                    oq5Var.k0(K2);
                }
                hld.h(i4, (i2 >> 3) & 7168, j, oq5Var, yciVar, (Function0) K2);
                oq5Var = oq5Var;
                oq5Var.p(false);
            } else if (ordinal == 1) {
                oq5Var.Z(1985740522);
                androidx.compose.ui.viewinterop.a.a((i2 >> 9) & 112, 4, oq5Var, yciVar, function12, null);
                oq5Var.p(false);
            } else {
                if (ordinal != 2) {
                    throw vz1.i(oq5Var, -1875619235, false);
                }
                oq5Var.Z(1985904016);
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tu(i, 3, function1, q84Var, v84Var, pv9Var, yciVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(z9u z9uVar, hp4 hp4Var, yci yciVar, e9g e9gVar, boolean z, hq5 hq5Var, int i) {
        yci yciVar2;
        long m;
        kb5 kb5Var;
        kb5 kb5Var2;
        b bVar;
        kb5 kb5Var3;
        grb grbVar;
        boolean z2;
        kb5 kb5Var4;
        vci vciVar;
        float f2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        hp4Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(484026655);
        int i2 = i | (oq5Var.f(z9uVar) ? 4 : 2) | (oq5Var.d(hp4Var.ordinal()) ? 32 : 16) | 384 | (oq5Var.d(e9gVar == null ? -1 : e9gVar.ordinal()) ? 2048 : 1024) | (oq5Var.g(z) ? 16384 : RemoteCameraConfig.Notification.ID);
        if (oq5Var.P(i2 & 1, (i2 & 9363) != 9362)) {
            Object[] objArr = (i2 & 7168) == 2048;
            Object K = oq5Var.K();
            if (objArr != false || K == gq5.a) {
                int ordinal = e9gVar.ordinal();
                if (ordinal == 0) {
                    m = xv.m(80, 60);
                } else {
                    if (ordinal != 1) {
                        b6e.s();
                        return;
                    }
                    m = xv.m(52, 36);
                }
                K = new fma(m);
                oq5Var.k0(K);
            }
            long j = ((fma) K).a;
            float f3 = 16;
            float f4 = 20;
            vci vciVar2 = vci.a;
            yci a2 = androidx.compose.ui.platform.a.a(d.n(j, a.q(vciVar2, f3, f4, 0.0f, f4, 4)), "clip_cover");
            kfh d2 = ug3.d(b2c.f, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a2);
            xp5.T.getClass();
            grb grbVar2 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar2);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var5 = wp5.f;
            g0g.U(oq5Var, d2, kb5Var5);
            kb5 kb5Var6 = wp5.e;
            g0g.U(oq5Var, l, kb5Var6);
            kb5 kb5Var7 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var7);
            }
            kb5 kb5Var8 = wp5.d;
            g0g.U(oq5Var, H, kb5Var8);
            b bVar2 = b.a;
            if (z) {
                oq5Var.Z(-290560452);
                kb5Var2 = kb5Var6;
                f2 = f3;
                bVar = bVar2;
                kb5Var3 = kb5Var7;
                vciVar = vciVar2;
                grbVar = grbVar2;
                kb5Var = kb5Var8;
                z2 = true;
                kb5Var4 = kb5Var5;
                swf.d(qo6.j, gce.d, null, null, 0L, 0L, false, oq5Var, 54, 124);
                oq5Var = oq5Var;
                oq5Var.p(false);
            } else {
                kb5Var = kb5Var8;
                kb5Var2 = kb5Var6;
                bVar = bVar2;
                kb5Var3 = kb5Var7;
                grbVar = grbVar2;
                z2 = true;
                kb5Var4 = kb5Var5;
                vciVar = vciVar2;
                f2 = f3;
                oq5Var.Z(-290384589);
                String str = z9uVar.d;
                qo6 qo6Var = qo6.j;
                yci b2 = bVar.b(vciVar);
                hp4 hp4Var2 = hp4.a;
                irf.y(str, qo6Var, b2, hp4Var != hp4Var2, false, null, null, null, oq5Var, 48, 240);
                oq5Var = oq5Var;
                if (hp4Var != hp4Var2) {
                    oq5Var.Z(-290061042);
                    orl.a(0, 6, 0L, oq5Var, null, hp4Var == hp4.b);
                    z3 = false;
                } else {
                    z3 = false;
                    oq5Var.Z(-296033347);
                }
                oq5Var.p(z3);
                oq5Var.p(z3);
            }
            if (e9gVar == e9g.a) {
                oq5Var.Z(-289831859);
                yci m2 = a.m(d.d(bVar.a(vciVar, b2c.j), 1.0f), 4);
                nho a3 = lho.a(qx0.g, b2c.k, oq5Var, 6);
                int i4 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, m2);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, a3, kb5Var4);
                g0g.U(oq5Var, l2, kb5Var2);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var, i4, kb5Var3);
                }
                g0g.U(oq5Var, H2, kb5Var);
                jzb jzbVar = z9uVar.h;
                if (jzbVar != null) {
                    oq5Var.Z(1702122711);
                    z6 = !ksw.F(oq5Var);
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(1226197726);
                    oq5Var.p(false);
                    z6 = false;
                }
                if (z6) {
                    oq5Var.Z(1226258491);
                    vci vciVar3 = vciVar;
                    yciVar2 = vciVar3;
                    lg3.q(jzbVar, androidx.compose.ui.platform.a.a(d.m(a.q(vciVar3, 2, 0.0f, 0.0f, 0.0f, 14), f2), "video_clip_explicit"), kg5.r(R.color.icon_primary_night, oq5Var), oq5Var, 48, 0);
                    z5 = false;
                    oq5Var.p(false);
                } else {
                    yciVar2 = vciVar;
                    z5 = false;
                    oq5Var.Z(1226634769);
                    u1g.l(oq5Var, d.z(yciVar2, 3));
                    oq5Var.p(false);
                }
                o5g.a(z5 ? 1 : 0, oq5Var, null, z9uVar.g, z9uVar.j);
                z4 = z2;
                oq5Var.p(z4);
            } else {
                z4 = z2;
                yciVar2 = vciVar;
                z5 = false;
                oq5Var.Z(-296033347);
            }
            oq5Var.p(z5);
            oq5Var.p(z4);
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new qr(z9uVar, hp4Var, z, yciVar2, e9gVar, i, 4);
        }
    }

    public static final void d(o0k o0kVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        o0kVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(626442587);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(o0kVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            pm0.a(null, ild.C(-1660302300, new kv4(o0kVar), oq5Var), oq5Var, 48, 1);
            yciVar = vci.a;
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lv4(o0kVar, yciVar, i, 0);
        }
    }

    public static final void e(final z9u z9uVar, final hp4 hp4Var, final uo4 uo4Var, final boolean z, final Function0 function0, final Function0 function02, final Function0 function03, final yci yciVar, final e9g e9gVar, final c0g c0gVar, final Function0 function04, hq5 hq5Var, final int i) {
        int i2;
        oq5 oq5Var;
        hp4Var.getClass();
        uo4Var.getClass();
        function0.getClass();
        function03.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1700213481);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var2.f(z9uVar) : oq5Var2.h(z9uVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.d(hp4Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.d(uo4Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.g(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var2.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var2.h(function02) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            i2 |= oq5Var2.h(function03) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((100663296 & i) == 0) {
            i2 |= oq5Var2.d(e9gVar == null ? -1 : e9gVar.ordinal()) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= oq5Var2.d(c0gVar.ordinal()) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        int i3 = i2;
        int i4 = oq5Var2.h(function04) ? 4 : 2;
        if (oq5Var2.P(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            oq5Var = oq5Var2;
            v3g.h(new sc5(z9uVar.e, z9uVar.f, z9uVar.i, z9uVar.h), hp4Var, uo4Var, z, function0, function02, function03, yciVar, e9gVar, c0gVar, function04, ild.C(2013893382, new av5(uo4Var, z9uVar, hp4Var, e9gVar, 6), oq5Var2), oq5Var, i3 & 2147483632, (i4 & 14) | 48);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: kn6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lxe.e(z9u.this, hp4Var, uo4Var, z, function0, function02, function03, yciVar, e9gVar, c0gVar, function04, (hq5) obj, rvf.R(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(z9u z9uVar, pc5 pc5Var, yci yciVar, e9g e9gVar, hq5 hq5Var, int i, int i2) {
        oq5 oq5Var;
        e9g e9gVar2;
        aqi aqiVar;
        int i3;
        kjn kjnVar;
        pc5 pc5Var2 = pc5Var;
        pc5Var2.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1033825039);
        int i4 = (oq5Var2.f(z9uVar) ? 4 : 2) | i | (oq5Var2.f(pc5Var2) ? 32 : 16) | (oq5Var2.f(yciVar) ? 256 : 128);
        int i5 = i2 & 8;
        if (i5 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= oq5Var2.d(e9gVar == null ? -1 : e9gVar.ordinal()) ? 2048 : 1024;
        }
        int i6 = i4;
        if (oq5Var2.P(i6 & 1, (i6 & 1171) != 1170)) {
            e9g e9gVar3 = i5 != 0 ? e9g.b : e9gVar;
            aqi M = gld.M(pc5Var2.c(), oq5Var2);
            aqi M2 = gld.M(pc5Var2.h(), oq5Var2);
            aqi M3 = gld.M(pc5Var2.b(), oq5Var2);
            hp4 hp4Var = (hp4) M.getValue();
            uo4 uo4Var = (uo4) M2.getValue();
            boolean i7 = pc5Var2.i();
            int i8 = i6 & 112;
            boolean z = i8 == 32;
            Object K = oq5Var2.K();
            kjn kjnVar2 = gq5.a;
            if (z || K == kjnVar2) {
                aqiVar = M3;
                i3 = i8;
                kjnVar = kjnVar2;
                ej6 ej6Var = new ej6(0, pc5Var2, pc5.class, "onClick", "onClick()V", 0, 3);
                oq5Var2.k0(ej6Var);
                K = ej6Var;
            } else {
                i3 = i8;
                aqiVar = M3;
                kjnVar = kjnVar2;
            }
            h9f h9fVar = (h9f) K;
            boolean z2 = i3 == 32;
            Object K2 = oq5Var2.K();
            if (z2 || K2 == kjnVar) {
                ln6 ln6Var = new ln6(0, pc5Var, pc5.class, "onLongClick", "onLongClick()Z", 8, 0);
                oq5Var2.k0(ln6Var);
                K2 = ln6Var;
            }
            Function0 function0 = (Function0) K2;
            boolean z3 = i3 == 32;
            Object K3 = oq5Var2.K();
            if (z3 || K3 == kjnVar) {
                pc5Var2 = pc5Var;
                ej6 ej6Var2 = new ej6(0, pc5Var2, pc5.class, "onOverflowClick", "onOverflowClick()V", 0, 4);
                oq5Var2.k0(ej6Var2);
                K3 = ej6Var2;
            } else {
                pc5Var2 = pc5Var;
            }
            c0g R = a4g.R((j1g) aqiVar.getValue());
            Function0 function02 = (Function0) h9fVar;
            Function0 function03 = (Function0) ((h9f) K3);
            aqi aqiVar2 = aqiVar;
            boolean f2 = oq5Var2.f(aqiVar2) | (i3 == 32);
            Object K4 = oq5Var2.K();
            if (f2 || K4 == kjnVar) {
                K4 = new aw5(8, pc5Var2, aqiVar2);
                oq5Var2.k0(K4);
            }
            int i9 = i6 << 15;
            oq5Var = oq5Var2;
            e(z9uVar, hp4Var, uo4Var, i7, function02, function0, function03, yciVar, e9gVar3, R, (Function0) K4, oq5Var, (i6 & 14) | (29360128 & i9) | (i9 & 234881024));
            e9gVar2 = e9gVar3;
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
            e9gVar2 = e9gVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hq(z9uVar, pc5Var2, yciVar, e9gVar2, i, i2, 8);
        }
    }

    public static final void g(n9b n9bVar, boolean z, Function0 function0) {
        n9bVar.getClass();
        function0.getClass();
        n9bVar.a.a(new wn5(new j93(z, function0, 1, (byte) 0), 1382858542, true));
    }

    public static final void h(int i, hq5 hq5Var, yci yciVar, String str) {
        str.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2069122472);
        if ((((oq5Var.f(str) ? 4 : 2) | i) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            bg3.a(null, null, false, ild.C(-1879246782, new gab(2, str, yciVar), oq5Var), oq5Var, 3072, 7);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cb1(str, yciVar, i, 8);
        }
    }

    public static final void i(cwk cwkVar, Function0 function0, yci yciVar, long j, hq5 hq5Var, int i) {
        long j2;
        int i2;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1419351572);
        int i3 = i | (oq5Var.d(cwkVar.ordinal()) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128) | 1024;
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            oq5Var.U();
            if ((i & 1) == 0 || oq5Var.y()) {
                i2 = i3 & (-7169);
                j2 = ((dq0) oq5Var.j(eq0.a)).a.a;
            } else {
                oq5Var.S();
                i2 = i3 & (-7169);
                j2 = j;
            }
            oq5Var.q();
            int i4 = i2 >> 3;
            aae.a(function0, yciVar, false, ild.C(-1200368760, new cu0(cwkVar, j2, 2), oq5Var), oq5Var, (i4 & 14) | 24576 | (i4 & 112), 12);
        } else {
            oq5Var.S();
            j2 = j;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new df1(cwkVar, function0, yciVar, j2, i, 1);
        }
    }

    public static final void j(lac lacVar, cak cakVar) {
        try {
            IOException iOException = null;
            for (cak cakVar2 : lacVar.g(cakVar)) {
                try {
                    if (lacVar.h(cakVar2).c) {
                        j(lacVar, cakVar2);
                    }
                    lacVar.d(cakVar2);
                } catch (IOException e2) {
                    if (iOException == null) {
                        iOException = e2;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static void k(String str, StringBuffer stringBuffer) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '\f') {
                stringBuffer.append("\\f");
            } else if (charAt == '\r') {
                stringBuffer.append("\\r");
            } else if (charAt == '\"') {
                stringBuffer.append("\\\"");
            } else if (charAt == '/') {
                stringBuffer.append("\\/");
            } else if (charAt != '\\') {
                switch (charAt) {
                    case '\b':
                        stringBuffer.append("\\b");
                        break;
                    case '\t':
                        stringBuffer.append("\\t");
                        break;
                    case '\n':
                        stringBuffer.append("\\n");
                        break;
                    default:
                        if ((charAt < 0 || charAt > 31) && ((charAt < 127 || charAt > 159) && (charAt < 8192 || charAt > 8447))) {
                            stringBuffer.append(charAt);
                            break;
                        } else {
                            String hexString = Integer.toHexString(charAt);
                            stringBuffer.append("\\u");
                            for (int i2 = 0; i2 < 4 - hexString.length(); i2++) {
                                stringBuffer.append('0');
                            }
                            stringBuffer.append(hexString.toUpperCase());
                            break;
                        }
                        break;
                }
            } else {
                stringBuffer.append("\\\\");
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static d0b l() {
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        String b2 = ((e0b) ((byb) qdcVar.C(I)).c(ern.a(e0b.class))).b();
        int hashCode = b2.hashCode();
        if (hashCode != 3551) {
            switch (hashCode) {
                case 110131:
                    if (b2.equals("on2")) {
                        return new c0b(false, true, true);
                    }
                    break;
                case 110132:
                    if (b2.equals("on3")) {
                        return new c0b(true, true, true);
                    }
                    break;
            }
        } else if (b2.equals("on")) {
            return new c0b(false, false, false);
        }
        return b0b.a;
    }

    public static final ArrayList m(List list) {
        list.getClass();
        gs5 gs5Var = gs5.e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((hs5) obj).a == gs5Var) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final hs5 n(List list) {
        list.getClass();
        return p(list, gs5.g);
    }

    public static final hs5 o(List list) {
        list.getClass();
        return p(list, gs5.f);
    }

    public static final hs5 p(List list, gs5 gs5Var) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((hs5) obj).a == gs5Var) {
                break;
            }
        }
        return (hs5) obj;
    }

    public static hsd q(SSLSession sSLSession) {
        List list;
        sSLSession.getClass();
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            xq0.q("cipherSuite == null");
            return null;
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            kac.f("cipherSuite == ".concat(cipherSuite));
            return null;
        }
        el4 P = el4.b.P(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            xq0.q("tlsVersion == null");
            return null;
        }
        if ("NONE".equals(protocol)) {
            kac.f("tlsVersion == NONE");
            return null;
        }
        sks y = a0g.y(protocol);
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            list = peerCertificates != null ? cvt.l(Arrays.copyOf(peerCertificates, peerCertificates.length)) : c5b.a;
        } catch (SSLPeerUnverifiedException unused) {
            list = c5b.a;
        }
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new hsd(y, P, localCertificates != null ? cvt.l(Arrays.copyOf(localCertificates, localCertificates.length)) : c5b.a, new ep7(list, 2));
    }

    public static int r(List list, InputStream inputStream, z98 z98Var) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new non(inputStream, z98Var);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                int a2 = ((rbe) list.get(i)).a(inputStream, z98Var);
                if (a2 != -1) {
                    return a2;
                }
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType t(List list, InputStream inputStream, z98 z98Var) {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new non(inputStream, z98Var);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType c2 = ((rbe) list.get(i)).c(inputStream);
                inputStream.reset();
                if (c2 != ImageHeaderParser$ImageType.UNKNOWN) {
                    return c2;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static ImageHeaderParser$ImageType u(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType b2 = ((rbe) list.get(i)).b(byteBuffer);
                AtomicReference atomicReference = tm3.a;
                if (b2 != ImageHeaderParser$ImageType.UNKNOWN) {
                    return b2;
                }
            } catch (Throwable th) {
                AtomicReference atomicReference2 = tm3.a;
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static final void v() {
        throw new IllegalStateException("Invalid applier");
    }

    public static final boolean w(lt ltVar) {
        ltVar.getClass();
        return ltVar.b == Album$AlbumType.AUDIOBOOK;
    }

    public static final boolean x(lt ltVar) {
        ltVar.getClass();
        return ltVar.b == Album$AlbumType.PODCAST;
    }

    public static void y(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static final mq5 z(hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.V(206, pq5.e);
        if (oq5Var.O) {
            oxq.x(oq5Var.H);
        }
        Object C = oq5Var.C();
        lq5 lq5Var = C instanceof lq5 ? (lq5) C : null;
        if (lq5Var == null) {
            lq5Var = new lq5(new mq5(oq5Var, oq5Var.P, oq5Var.p, oq5Var.B, oq5Var.g.r));
            oq5Var.l0(lq5Var);
        }
        mq5 mq5Var = lq5Var.a;
        mq5Var.f.setValue(oq5Var.l());
        oq5Var.p(false);
        return mq5Var;
    }

    public abstract Date s();
}
