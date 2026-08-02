package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.data.audio.WarningContent;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes3.dex */
public final class m82 {
    public final uav a;
    public final md0 b;
    public final jyr c;
    public final jyr d;

    public m82(fb2 fb2Var, s82 s82Var, x02 x02Var, a12 a12Var, u72 u72Var, uav uavVar, md0 md0Var) {
        this.a = uavVar;
        this.b = md0Var;
        final int i = 0;
        this.c = btf.b(new Function0(this) { // from class: j82
            public final /* synthetic */ m82 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (dc0) this.b.b.o.getValue();
                    default:
                        ((jd0) this.b.b.t.getValue()).getClass();
                        return Integer.valueOf(wct.s());
                }
            }
        });
        final int i2 = 1;
        this.d = btf.b(new Function0(this) { // from class: j82
            public final /* synthetic */ m82 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (dc0) this.b.b.o.getValue();
                    default:
                        ((jd0) this.b.b.t.getValue()).getClass();
                        return Integer.valueOf(wct.s());
                }
            }
        });
    }

    public static Uri h(m82 m82Var, co6 co6Var) {
        String pathForSize;
        int intValue = ((Number) m82Var.d.getValue()).intValue();
        m82Var.getClass();
        CoverPath coverPath = co6Var.a;
        String uri = coverPath.getUri();
        if (uri == null || uri.length() == 0 || Intrinsics.d(coverPath.getUri(), "null")) {
            coverPath = null;
        }
        if (coverPath != null && (pathForSize = coverPath.getPathForSize(intValue)) != null) {
            if (pathForSize.length() <= 0) {
                pathForSize = null;
            }
            if (pathForSize != null) {
                return Uri.parse(pathForSize);
            }
        }
        return null;
    }

    public final MediaBrowserCompat$MediaItem a(oq oqVar, String str, boolean z) {
        oqVar.getClass();
        String str2 = oqVar.a;
        str2.getClass();
        String concat = (z ? "downloaded_album_playable_prefix_" : "album_playable_prefix_").concat(str2);
        rdk rdkVar = new rdk(14);
        rdkVar.b = concat;
        rdkVar.c = oqVar.b;
        k(rdkVar, oqVar);
        Bundle J = cxb.J();
        if (str != null) {
            J.putString("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", str);
        }
        if (oqVar.g == WarningContent.EXPLICIT) {
            J.putLong("android.media.IS_EXPLICIT", 1L);
        }
        rdkVar.g = J;
        return new MediaBrowserCompat$MediaItem(rdkVar.t(), 2);
    }

    public final MediaBrowserCompat$MediaItem b(c01 c01Var, boolean z) {
        c01Var.getClass();
        String str = c01Var.a;
        str.getClass();
        String concat = (z ? "downloaded_artist_playable_prefix_" : "artist_playable_prefix_").concat(str);
        rdk rdkVar = new rdk(14);
        rdkVar.b = concat;
        rdkVar.c = c01Var.b;
        k(rdkVar, c01Var);
        return new MediaBrowserCompat$MediaItem(rdkVar.t(), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, zsu zsuVar, cg6 cg6Var) {
        k82 k82Var;
        int i;
        rdk rdkVar;
        rdk rdkVar2;
        if (cg6Var instanceof k82) {
            k82Var = (k82) cg6Var;
            int i2 = k82Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k82Var.n = i2 - Integer.MIN_VALUE;
                k82 k82Var2 = k82Var;
                Object obj = k82Var2.l;
                nm6 nm6Var = nm6.a;
                i = k82Var2.n;
                if (i != 0) {
                    qgg.h0(obj);
                    String r = hrg.r("my_vibe_prefix_", zsuVar.e, " my_vibe_seeds_prefix_", CollectionsKt.X(zsuVar.f, StringUtils.COMMA, null, null, null, 62));
                    rdk rdkVar3 = new rdk(14);
                    rdkVar3.b = r;
                    rdkVar3.c = zsuVar.a;
                    rdkVar3.d = str2;
                    Bundle J = cxb.J();
                    if (str != null) {
                        J.putString("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", str);
                    }
                    rdkVar3.g = J;
                    k82Var2.j = rdkVar3;
                    k82Var2.k = rdkVar3;
                    k82Var2.n = 1;
                    jcv jcvVar = zsuVar.d;
                    obj = null;
                    if (jcvVar != null) {
                        uav uavVar = this.a;
                        String pathForSize = jcvVar.getPathForSize(uavVar.c);
                        String str3 = zsuVar.g.b;
                        if (str3 != null) {
                            obj = uavVar.a(Uri.parse(pathForSize), 200, 200, str3, k82Var2);
                        }
                    }
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    rdkVar = rdkVar3;
                    rdkVar2 = rdkVar;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rdkVar = k82Var2.k;
                    rdkVar2 = k82Var2.j;
                    qgg.h0(obj);
                }
                rdkVar.e = (Bitmap) obj;
                return new MediaBrowserCompat$MediaItem(rdkVar2.t(), 2);
            }
        }
        k82Var = new k82(this, cg6Var);
        k82 k82Var22 = k82Var;
        Object obj2 = k82Var22.l;
        nm6 nm6Var2 = nm6.a;
        i = k82Var22.n;
        if (i != 0) {
        }
        rdkVar.e = (Bitmap) obj2;
        return new MediaBrowserCompat$MediaItem(rdkVar2.t(), 2);
    }

    public final MediaBrowserCompat$MediaItem d(cvl cvlVar, String str, String str2, boolean z) {
        cvlVar.getClass();
        rdk rdkVar = new rdk(14);
        if (str == null) {
            String str3 = cvlVar.c.a;
            String str4 = cvlVar.a;
            str3.getClass();
            str4.getClass();
            str = (z ? "downloaded_playlist_playable_prefix_" : "playlist_playable_prefix_") + " uid_prefix_" + str3 + " kind_prefix" + str4;
        }
        rdkVar.b = str;
        rdkVar.c = cvlVar.b;
        k(rdkVar, cvlVar);
        Bundle J = cxb.J();
        if (str2 != null) {
            J.putString("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", str2);
        }
        rdkVar.g = J;
        return new MediaBrowserCompat$MediaItem(rdkVar.t(), 2);
    }

    public final MediaBrowserCompat$MediaItem e(mqs mqsVar, String str, String str2, y02 y02Var) {
        mqsVar.getClass();
        str2.getClass();
        String str3 = mqsVar.a;
        ((Set) umh.a.getValue()).contains(str2);
        str3.getClass();
        StringBuilder sb = new StringBuilder("track_playable_base_prefix_");
        sb.append(str3);
        String o = su4.o(sb, " track_playable_content_id_", str2);
        String str4 = mqsVar.c;
        List list = mqsVar.f;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((zp2) obj).equals(zp2.k)) {
                arrayList.add(obj);
            }
        }
        String X = CollectionsKt.X(arrayList, ", ", null, null, new uv1(17), 30);
        Uri h = h(this, mqsVar.x0);
        if (h == null) {
            h = dc0.a(i().a, R.drawable.blank_state_track);
        }
        Uri uri = h;
        Bundle J = cxb.J();
        if (str != null) {
            J.putString("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", str);
        }
        if (y02Var != null) {
            J.putInt("android.media.browse.CONTENT_STYLE_SINGLE_ITEM_HINT", y02Var.a());
        }
        if (mqsVar.m == WarningContent.EXPLICIT) {
            J.putLong("android.media.IS_EXPLICIT", 1L);
        }
        return new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(o, str4, X, null, null, uri, J, null), 2);
    }

    public final MediaBrowserCompat$MediaItem f(yit yitVar, String str, y02 y02Var) {
        yitVar.getClass();
        if (yitVar instanceof o20) {
            return l(((o20) yitVar).a, str, y02Var);
        }
        if (yitVar instanceof hm1) {
            u51 u51Var = ((hm1) yitVar).a;
            String str2 = u51Var.a;
            str2.getClass();
            String concat = "artist_playable_prefix_".concat(str2);
            String str3 = u51Var.b;
            Uri j = j(u51Var.c);
            if (j == null) {
                j = dc0.a(i().a, R.drawable.blank_state_artist);
            }
            Uri uri = j;
            Bundle J = cxb.J();
            if (str != null) {
                J.putString("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", str);
            }
            if (y02Var != null) {
                J.putInt("android.media.browse.CONTENT_STYLE_SINGLE_ITEM_HINT", y02Var.a());
            }
            return new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(concat, str3, null, null, null, uri, J, null), 2);
        }
        if (yitVar instanceof te4) {
            return l(((te4) yitVar).a, str, y02Var);
        }
        if (yitVar instanceof r1g) {
            return l(((r1g) yitVar).a, str, y02Var);
        }
        if (yitVar instanceof a2g) {
            return m(((a2g) yitVar).a, str, y02Var);
        }
        if (yitVar instanceof e6i) {
            Assertions.throwOrSkip$default(new FailedAssertionException("Mix entities are not supported in Android Auto"), null, 2, null);
            return new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(null, null, null, null, null, null, null, null), 1);
        }
        if (yitVar instanceof fej) {
            return l(((fej) yitVar).a, str, y02Var);
        }
        if (yitVar instanceof umk) {
            return m(((umk) yitVar).a, str, y02Var);
        }
        if (yitVar instanceof s3m) {
            return m(((s3m) yitVar).a, str, y02Var);
        }
        if (yitVar instanceof llu) {
            Assertions.throwOrSkip$default(new FailedAssertionException("Wave agent entities are not supported in Android Auto"), null, 2, null);
            return new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(null, null, null, null, null, null, null, null), 1);
        }
        b6e.s();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(gmu gmuVar, String str, String str2, cg6 cg6Var) {
        l82 l82Var;
        int i;
        rdk rdkVar;
        rdk rdkVar2;
        if (cg6Var instanceof l82) {
            l82Var = (l82) cg6Var;
            int i2 = l82Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l82Var.n = i2 - Integer.MIN_VALUE;
                l82 l82Var2 = l82Var;
                Object obj = l82Var2.l;
                nm6 nm6Var = nm6.a;
                i = l82Var2.n;
                if (i != 0) {
                    qgg.h0(obj);
                    String r = hrg.r("my_vibe_prefix_", gmuVar.d.h(), " my_vibe_seeds_prefix_", CollectionsKt.X(gmuVar.e, StringUtils.COMMA, null, null, null, 62));
                    rdk rdkVar3 = new rdk(14);
                    rdkVar3.b = r;
                    rdkVar3.c = str == null ? gmuVar.a : str;
                    rdkVar3.d = str2;
                    l82Var2.j = rdkVar3;
                    l82Var2.k = rdkVar3;
                    l82Var2.n = 1;
                    String str3 = gmuVar.c;
                    if (str3 != null) {
                        jcv jcvVar = new jcv(str3, WebPath$Storage.AVATARS_NO_CROP);
                        uav uavVar = this.a;
                        String pathForSize = jcvVar.getPathForSize(uavVar.c);
                        String str4 = gmuVar.f;
                        if (str4 != null) {
                            obj = uavVar.a(Uri.parse(pathForSize), 200, 200, str4, l82Var2);
                            if (obj != nm6Var) {
                                return nm6Var;
                            }
                            rdkVar = rdkVar3;
                            rdkVar2 = rdkVar;
                        }
                    }
                    obj = null;
                    if (obj != nm6Var) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rdkVar = l82Var2.k;
                    rdkVar2 = l82Var2.j;
                    qgg.h0(obj);
                }
                rdkVar.e = (Bitmap) obj;
                return new MediaBrowserCompat$MediaItem(rdkVar2.t(), 2);
            }
        }
        l82Var = new l82(this, cg6Var);
        l82 l82Var22 = l82Var;
        Object obj2 = l82Var22.l;
        nm6 nm6Var2 = nm6.a;
        i = l82Var22.n;
        if (i != 0) {
        }
        rdkVar.e = (Bitmap) obj2;
        return new MediaBrowserCompat$MediaItem(rdkVar2.t(), 2);
    }

    public final dc0 i() {
        return (dc0) this.c.getValue();
    }

    public final Uri j(u9b u9bVar) {
        String pathForSize;
        CoverPath M = kg5.M(u9bVar, WebPath$Storage.AVATARS);
        String uri = M.getUri();
        if (uri == null || uri.length() == 0 || Intrinsics.d(M.getUri(), "null")) {
            M = null;
        }
        if (M != null && (pathForSize = M.getPathForSize(((Number) this.d.getValue()).intValue())) != null) {
            if (pathForSize.length() <= 0) {
                pathForSize = null;
            }
            if (pathForSize != null) {
                return Uri.parse(pathForSize);
            }
        }
        return null;
    }

    public final void k(rdk rdkVar, nu1 nu1Var) {
        if (nu1Var instanceof oq) {
            Uri h = h(this, ((oq) nu1Var).D);
            if (h == null) {
                h = dc0.a(i().a, R.drawable.blank_state_album);
            }
            rdkVar.f = h;
            return;
        }
        if (nu1Var instanceof c01) {
            Uri h2 = h(this, ((c01) nu1Var).q);
            if (h2 == null) {
                h2 = dc0.a(i().a, R.drawable.blank_state_artist);
            }
            rdkVar.f = h2;
            return;
        }
        if (nu1Var instanceof cvl) {
            Uri h3 = h(this, op7.c((cvl) nu1Var));
            if (h3 == null) {
                h3 = dc0.a(i().a, R.drawable.blank_state_playlist);
            }
            rdkVar.f = h3;
        }
    }

    public final MediaBrowserCompat$MediaItem l(lt ltVar, String str, y02 y02Var) {
        String str2 = ltVar.a;
        str2.getClass();
        String concat = "album_playable_prefix_".concat(str2);
        String str3 = ltVar.c;
        Uri j = j(ltVar.e);
        if (j == null) {
            j = dc0.a(i().a, R.drawable.blank_state_album);
        }
        Uri uri = j;
        Bundle J = cxb.J();
        if (str != null) {
            J.putString("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", str);
        }
        if (ltVar.d == WarningContent.EXPLICIT) {
            J.putLong("android.media.IS_EXPLICIT", 1L);
        }
        if (y02Var != null) {
            J.putInt("android.media.browse.CONTENT_STYLE_SINGLE_ITEM_HINT", y02Var.a());
        }
        return new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(concat, str3, null, null, null, uri, J, null), 2);
    }

    public final MediaBrowserCompat$MediaItem m(eul eulVar, String str, y02 y02Var) {
        String str2 = eulVar.a;
        String str3 = eulVar.b;
        str2.getClass();
        str3.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("playlist_playable_prefix_");
        sb.append(" uid_prefix_");
        sb.append(str2);
        String o = su4.o(sb, " kind_prefix", str3);
        String str4 = eulVar.c;
        Uri j = j(eulVar.d);
        if (j == null) {
            j = dc0.a(i().a, R.drawable.blank_state_playlist);
        }
        Uri uri = j;
        Bundle J = cxb.J();
        if (str != null) {
            J.putString("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", str);
        }
        if (y02Var != null) {
            J.putInt("android.media.browse.CONTENT_STYLE_SINGLE_ITEM_HINT", y02Var.a());
        }
        return new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(o, str4, null, null, null, uri, J, null), 2);
    }
}
