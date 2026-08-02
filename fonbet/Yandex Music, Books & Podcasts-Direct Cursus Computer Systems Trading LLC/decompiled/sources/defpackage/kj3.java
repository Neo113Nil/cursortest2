package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.connectsdk.etc.helper.HttpMessage;
import com.yandex.music.databases.main.MainDatabase;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.FilterOutputStream;
import java.io.Serializable;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.text.Charsets;

/* loaded from: classes4.dex */
public final class kj3 implements ra7, mod {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public Object d;
    public Object e;

    public kj3(Context context, Looper looper, dzr dzrVar, int i) {
        this.a = i;
        switch (i) {
            case 6:
                this.d = new y8p(context.getApplicationContext(), 13);
                this.e = dzrVar.a(looper, null);
                break;
            default:
                this.d = new rjp(context.getApplicationContext(), 10);
                this.e = dzrVar.a(looper, null);
                break;
        }
    }

    @Override // defpackage.mod
    public void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        f(str, null, null);
        i("%s", str2);
        k();
        ((lsg) this.e).a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f3, code lost:
    
        if (r15 != r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f5, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x004f, code lost:
    
        if (r15 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable b(String str, String str2, Continuation continuation) {
        aej aejVar;
        int i;
        int ordinal;
        List list;
        if (continuation instanceof aej) {
            aejVar = (aej) continuation;
            int i2 = aejVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aejVar.m = i2 - Integer.MIN_VALUE;
                Object obj = aejVar.k;
                nm6 nm6Var = nm6.a;
                i = aejVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    i5h i5hVar = (i5h) ((jyr) this.e).getValue();
                    aejVar.j = str2;
                    aejVar.m = 1;
                    obj = i5hVar.b(str, aejVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        List<rxs> list2 = (List) obj;
                        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                        for (rxs rxsVar : list2) {
                            arrayList.add(new Pair(rxsVar.i, ngg.M(rxsVar)));
                        }
                        return arrayList;
                    }
                    str2 = aejVar.j;
                    qgg.h0(obj);
                }
                uxs Q = ((MainDatabase) obj).Q();
                ysr ysrVar = new ysr("track_mview");
                StringBuilder sb = new StringBuilder("name_surrogate LIKE ? ");
                ordinal = ((zdj) this.d).ordinal();
                if (ordinal != 0) {
                    list = gys.MyMusic.a;
                } else if (ordinal == 1) {
                    list = gys.MyMusicPodcastEpisodes.a;
                } else {
                    if (ordinal != 2) {
                        b6e.s();
                        return null;
                    }
                    list = gys.MyMusicAudioBooksChapters.a;
                }
                sb.append("AND track_type IN (" + CollectionsKt.X(list, StringUtils.COMMA, null, null, bej.a, 30) + ") ");
                sb.append("AND liked = 1 ");
                if (this.c) {
                    sb.append("AND track_for_kids = 0 ");
                }
                if (this.b) {
                    sb.append("AND is_permanent = 1 ");
                }
                jyr jyrVar = txd.e;
                if (n7w.Q()) {
                    sb.append(" AND (  (playlist_original_ids != '-15' )  OR (playlist_original_ids IS NULL) OR (is_permanent = 1) ) ");
                }
                String sb2 = sb.toString();
                String S = q7g.S(str2);
                S.getClass();
                ysrVar.d = sb2;
                ysrVar.e = new String[]{S};
                ysrVar.f = "timestamp DESC";
                atn a = ysrVar.a();
                aejVar.j = null;
                aejVar.m = 2;
                obj = Q.b(a, aejVar);
            }
        }
        aejVar = new aej(this, (cg6) continuation);
        Object obj2 = aejVar.k;
        nm6 nm6Var2 = nm6.a;
        i = aejVar.m;
        if (i != 0) {
        }
        uxs Q2 = ((MainDatabase) obj2).Q();
        ysr ysrVar2 = new ysr("track_mview");
        StringBuilder sb3 = new StringBuilder("name_surrogate LIKE ? ");
        ordinal = ((zdj) this.d).ordinal();
        if (ordinal != 0) {
        }
        sb3.append("AND track_type IN (" + CollectionsKt.X(list, StringUtils.COMMA, null, null, bej.a, 30) + ") ");
        sb3.append("AND liked = 1 ");
        if (this.c) {
        }
        if (this.b) {
        }
        jyr jyrVar2 = txd.e;
        if (n7w.Q()) {
        }
        String sb22 = sb3.toString();
        String S2 = q7g.S(str2);
        S2.getClass();
        ysrVar2.d = sb22;
        ysrVar2.e = new String[]{S2};
        ysrVar2.f = "timestamp DESC";
        atn a2 = ysrVar2.a();
        aejVar.j = null;
        aejVar.m = 2;
        obj2 = Q2.b(a2, aejVar);
    }

    public void c(boolean z) {
        switch (this.a) {
            case 5:
                if (this.c != z) {
                    this.c = z;
                    if (this.b) {
                        ((hzr) this.e).e(new dy1(this, z, 4));
                        break;
                    }
                }
                break;
            default:
                if (this.c != z) {
                    this.c = z;
                    if (this.b) {
                        ((hzr) this.e).e(new dy1(this, z, 5));
                        break;
                    }
                }
                break;
        }
    }

    public void d(String str, Object... objArr) {
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.d;
        if (this.c) {
            Locale locale = Locale.US;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            String encode = URLEncoder.encode(String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length)), "UTF-8");
            encode.getClass();
            byte[] bytes = encode.getBytes(Charsets.UTF_8);
            bytes.getClass();
            filterOutputStream.write(bytes);
            return;
        }
        if (this.b) {
            Charset charset = Charsets.UTF_8;
            byte[] bytes2 = "--".getBytes(charset);
            bytes2.getClass();
            filterOutputStream.write(bytes2);
            String str2 = ood.j;
            if (str2 == null) {
                jj4.j("null cannot be cast to non-null type java.lang.String");
                return;
            }
            byte[] bytes3 = str2.getBytes(charset);
            bytes3.getClass();
            filterOutputStream.write(bytes3);
            byte[] bytes4 = "\r\n".getBytes(charset);
            bytes4.getClass();
            filterOutputStream.write(bytes4);
            this.b = false;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, objArr.length);
        byte[] bytes5 = String.format(str, Arrays.copyOf(copyOf2, copyOf2.length)).getBytes(Charsets.UTF_8);
        bytes5.getClass();
        filterOutputStream.write(bytes5);
    }

    @Override // defpackage.ra7
    public ta7 e() {
        return new lj3((so3) this.d, (xol) this.e, this.b, this.c);
    }

    public void f(String str, String str2, String str3) {
        if (this.c) {
            FilterOutputStream filterOutputStream = (FilterOutputStream) this.d;
            byte[] bytes = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1)).getBytes(Charsets.UTF_8);
            bytes.getClass();
            filterOutputStream.write(bytes);
            return;
        }
        d("Content-Disposition: form-data; name=\"%s\"", str);
        if (str2 != null) {
            d("; filename=\"%s\"", str2);
        }
        i("", new Object[0]);
        if (str3 != null) {
            i("%s: %s", HttpMessage.CONTENT_TYPE_HEADER, str3);
        }
        i("", new Object[0]);
    }

    public void g(Uri uri, String str, String str2) {
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.d;
        str.getClass();
        uri.getClass();
        if (str2 == null) {
            str2 = "content/unknown";
        }
        f(str, str, str2);
        int i = gvt.i(j3c.b().getContentResolver().openInputStream(uri), filterOutputStream);
        i("", new Object[0]);
        k();
        lsg lsgVar = (lsg) this.e;
        String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        lsgVar.a();
    }

    public void h(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) {
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.d;
        str.getClass();
        parcelFileDescriptor.getClass();
        if (str2 == null) {
            str2 = "content/unknown";
        }
        f(str, str, str2);
        int i = gvt.i(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), filterOutputStream);
        i("", new Object[0]);
        k();
        lsg lsgVar = (lsg) this.e;
        String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        lsgVar.a();
    }

    public void i(String str, Object... objArr) {
        d(str, Arrays.copyOf(objArr, objArr.length));
        if (this.c) {
            return;
        }
        d("\r\n", new Object[0]);
    }

    public void j(String str, Object obj, ood oodVar) {
        lsg lsgVar = (lsg) this.e;
        str.getClass();
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.d;
        String str2 = ood.j;
        if (h1b.R(obj)) {
            a(str, h1b.y(obj));
            return;
        }
        if (obj instanceof Bitmap) {
            f(str, str, "image/png");
            ((Bitmap) obj).compress(Bitmap.CompressFormat.PNG, 100, filterOutputStream);
            i("", new Object[0]);
            k();
            lsgVar.a();
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            f(str, str, "content/unknown");
            filterOutputStream.write(bArr);
            i("", new Object[0]);
            k();
            String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bArr.length)}, 1));
            lsgVar.a();
            return;
        }
        if (obj instanceof Uri) {
            g((Uri) obj, str, null);
            return;
        }
        if (obj instanceof ParcelFileDescriptor) {
            h(str, (ParcelFileDescriptor) obj, null);
            return;
        }
        if (!(obj instanceof nod)) {
            xq0.x("value is not a supported type.");
            return;
        }
        nod nodVar = (nod) obj;
        Parcelable parcelable = nodVar.b;
        String str3 = nodVar.a;
        if (parcelable instanceof ParcelFileDescriptor) {
            h(str, (ParcelFileDescriptor) parcelable, str3);
        } else if (parcelable instanceof Uri) {
            g((Uri) parcelable, str, str3);
        } else {
            xq0.x("value is not a supported type.");
        }
    }

    public void k() {
        if (!this.c) {
            i("--%s", ood.j);
            return;
        }
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.d;
        byte[] bytes = "&".getBytes(Charsets.UTF_8);
        bytes.getClass();
        filterOutputStream.write(bytes);
    }

    public kj3(fnb fnbVar) {
        this.a = 3;
        fnbVar.getClass();
        this.d = fnbVar;
    }

    public kj3(zdj zdjVar, boolean z, boolean z2) {
        this.a = 2;
        zdjVar.getClass();
        this.d = zdjVar;
        this.b = z;
        this.c = z2;
        this.e = l18.b.b(hag.I(i5h.class), false);
    }

    public kj3(so3 so3Var, xol xolVar, boolean z, boolean z2) {
        this.a = 0;
        xolVar.getClass();
        this.d = so3Var;
        this.e = xolVar;
        this.b = z;
        this.c = z2;
    }

    public /* synthetic */ kj3() {
        this.a = 4;
    }

    public kj3(FilterOutputStream filterOutputStream, lsg lsgVar, boolean z) {
        this.a = 1;
        this.d = filterOutputStream;
        this.e = lsgVar;
        this.b = true;
        this.c = z;
    }
}
