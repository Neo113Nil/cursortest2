package defpackage;

import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes6.dex */
public final class ybl implements mau {
    public static ybl a;

    public static Uri a(String str) {
        str.getClass();
        r20 r20Var = new r20(0);
        Uri m = ((s20) r20Var.a(String.format(((q20) r20Var.d).b, str), true)).m();
        m.getClass();
        return m;
    }

    public static g0o b(String str, twh twhVar) {
        str.getClass();
        Charset charset = Charsets.UTF_8;
        if (twhVar != null) {
            Pattern pattern = twh.e;
            Charset a2 = twhVar.a(null);
            if (a2 == null) {
                try {
                    twhVar = q5g.C(twhVar + "; charset=utf-8");
                } catch (IllegalArgumentException unused) {
                    twhVar = null;
                }
            } else {
                charset = a2;
            }
        }
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        int length = bytes.length;
        cvt.c(bytes.length, 0, length);
        return new g0o(twhVar, length, bytes);
    }

    public static List e(n7q n7qVar, qrp qrpVar) {
        n7qVar.getClass();
        int ordinal = qrpVar.ordinal();
        tye tyeVar = tye.a;
        if (ordinal == 0) {
            zop zopVar = zop.a;
            mwk b = n7qVar.b();
            b.getClass();
            if (!((Boolean) dag.p(b, osr.a)).booleanValue()) {
                zopVar = null;
            }
            mwk b2 = n7qVar.b();
            b2.getClass();
            zop zopVar2 = (zop) dag.p(b2, o6c.k);
            zop zopVar3 = ((Boolean) wdg.A(n7qVar, tyeVar)).booleanValue() ? zop.b : null;
            if (zopVar3 == null) {
                zopVar3 = zop.f;
            }
            return xz0.w(new zop[]{zopVar, zopVar2, zopVar3});
        }
        if (ordinal == 1) {
            return xz0.w(new zop[]{zop.d, zop.e, ((Boolean) wdg.A(n7qVar, tyeVar)).booleanValue() ? zop.f : null});
        }
        if (ordinal == 2) {
            zop zopVar4 = zop.d;
            if (!((Boolean) wdg.A(n7qVar, kjn.e)).booleanValue()) {
                zopVar4 = null;
            }
            return xz0.w(new zop[]{zopVar4, ((Boolean) wdg.A(n7qVar, tyeVar)).booleanValue() ? zop.f : null});
        }
        if (ordinal != 3) {
            b6e.s();
            return null;
        }
        mwk b3 = n7qVar.b();
        b3.getClass();
        return CollectionsKt.w0(CollectionsKt.z0(CollectionsKt.g0(e(n7qVar, qrp.a), e(n7qVar, ((Boolean) dag.p(b3, y9w.e)).booleanValue() ? qrp.b : qrp.c))));
    }

    public static Uri g(String str, String str2) {
        str.getClass();
        str2.getClass();
        c4m c4mVar = c4m.YANDEXMUSIC;
        Uri m = ((d4m) new b30(c4mVar).a(String.format(c4mVar.b, str, str2, Boolean.FALSE), true)).m();
        m.getClass();
        return m;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static wsu h(e6v e6vVar, List list, v80 v80Var, ezu ezuVar, boolean z) {
        boolean z2;
        ssu ssuVar;
        ssu ssuVar2;
        list.getClass();
        ArrayList O = ivf.O(list, v80Var, e6vVar, z);
        kcr kcrVar = ezuVar.a;
        hcr hcrVar = hcr.a;
        int i = 0;
        if (Intrinsics.d(kcrVar, hcrVar)) {
            z2 = false;
        } else {
            z2 = true;
            if (!(kcrVar instanceof icr) && !(kcrVar instanceof jcr)) {
                b6e.s();
                return null;
            }
        }
        if (Intrinsics.d(kcrVar, hcrVar)) {
            ssuVar = new ssu(0, O.size(), 0L);
        } else {
            if (kcrVar instanceof icr) {
                ssuVar2 = new ssu(((icr) kcrVar).a, O.size(), 0L);
                return new wsu(O, c5b.a, ssuVar2, !Intrinsics.d(ezuVar.b, Boolean.TRUE) ? new seq(null, z2) : req.a, false);
            }
            if (!(kcrVar instanceof jcr)) {
                b6e.s();
                return null;
            }
            mqs mqsVar = ((jcr) kcrVar).a;
            int indexOf = list.indexOf(mqsVar);
            Integer valueOf = Integer.valueOf(indexOf);
            if (indexOf == -1) {
                valueOf = null;
            }
            if (valueOf != null) {
                i = valueOf.intValue();
            } else {
                ssg.a(3, "WithMetaPlayableConverter", "No track " + mqsVar + " found in " + list, null);
            }
            ssuVar = new ssu(i, O.size(), 0L);
        }
        ssuVar2 = ssuVar;
        return new wsu(O, c5b.a, ssuVar2, !Intrinsics.d(ezuVar.b, Boolean.TRUE) ? new seq(null, z2) : req.a, false);
    }

    @Override // defpackage.mau
    public void c(MediaExtractor mediaExtractor, Object obj) {
        mediaExtractor.setDataSource(new lau((ByteBuffer) obj));
    }

    @Override // defpackage.mau
    public void d(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(new lau((ByteBuffer) obj));
    }

    public nsh f() {
        if (nsh.n == null) {
            synchronized (this) {
                if (nsh.n == null) {
                    phg a2 = phg.a(j3c.b());
                    a2.getClass();
                    nsh.n = new nsh(a2, new ttm());
                }
            }
        }
        nsh nshVar = nsh.n;
        if (nshVar != null) {
            return nshVar;
        }
        xq0.q("Required value was null.");
        return null;
    }
}
