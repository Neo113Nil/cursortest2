package defpackage;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes4.dex */
public final class jml implements q3c, m7t {
    public jml(ujl ujlVar) {
    }

    public static ugt a(int i) {
        String str;
        if ((i & 2) != 0) {
            str = new jcv("avatars.yandex.net/get-music-content/10103188/b0fc313e.a.26709117-2/%%", WebPath$Storage.AVATARS).getPathForSize(720);
            str.getClass();
        } else {
            str = null;
        }
        return new ugt(c3x.h(4286825624L), c3x.h(4294967295L), "Some text text text text text", str, "");
    }

    @Override // defpackage.m7t
    public Object apply(Object obj) {
        ohx ohxVar = (ohx) obj;
        try {
            int j = ohxVar.j();
            byte[] bArr = new byte[j];
            dmx dmxVar = new dmx(bArr, j);
            knx a = hnx.c.a(ohx.class);
            hjp hjpVar = dmxVar.a;
            if (hjpVar == null) {
                hjpVar = new hjp(dmxVar);
            }
            a.g(ohxVar, hjpVar);
            if (j - dmxVar.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            kac.k(hrg.q("Serializing ", ohx.class.getName(), " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(se5 se5Var, cg6 cg6Var) {
        jyp jypVar;
        int i;
        oq oqVar;
        mq mqVar;
        int ordinal;
        xys xysVar;
        if (cg6Var instanceof jyp) {
            jypVar = (jyp) cg6Var;
            int i2 = jypVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jypVar.n = i2 - Integer.MIN_VALUE;
                Object obj = jypVar.l;
                nm6 nm6Var = nm6.a;
                i = jypVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    se5Var.getClass();
                    oq a = se5Var.k.a();
                    if (a == null) {
                        return iyp.c;
                    }
                    mq f = a.f();
                    l18 l18Var = l18.b;
                    bdt I = hag.I(ms.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    ms msVar = (ms) qdcVar.C(I);
                    jypVar.j = a;
                    jypVar.k = f;
                    jypVar.n = 1;
                    Enum b = msVar.a.b(a, jypVar);
                    if (b == nm6Var) {
                        return nm6Var;
                    }
                    oqVar = a;
                    mqVar = f;
                    obj = b;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mqVar = jypVar.k;
                    oqVar = jypVar.j;
                    qgg.h0(obj);
                }
                mq mqVar2 = (mq) obj;
                mqVar.getClass();
                ordinal = mqVar.ordinal();
                if (ordinal != 0) {
                    xysVar = vys.a;
                } else {
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    xysVar = wys.a;
                }
                oqVar.getClass();
                mqVar2.getClass();
                return new iyp(xysVar, oqVar.f() != mqVar2);
            }
        }
        jypVar = new jyp(this, cg6Var);
        Object obj2 = jypVar.l;
        nm6 nm6Var2 = nm6.a;
        i = jypVar.n;
        if (i != 0) {
        }
        mq mqVar22 = (mq) obj2;
        mqVar.getClass();
        ordinal = mqVar.ordinal();
        if (ordinal != 0) {
        }
        oqVar.getClass();
        mqVar22.getClass();
        return new iyp(xysVar, oqVar.f() != mqVar22);
    }

    public String c(String str) {
        IntRange intRange = new IntRange(1, 44, 1);
        ArrayList arrayList = new ArrayList(v75.o(intRange, 10));
        ype it = intRange.iterator();
        while (it.c) {
            it.nextInt();
            phn.a.getClass();
            arrayList.add(Integer.valueOf(phn.b.e(0, 16)));
        }
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Character.valueOf("0123456789abcdef".charAt(((Number) it2.next()).intValue())));
        }
        String X = CollectionsKt.X(arrayList2, "", null, null, null, 62);
        Locale locale = Locale.US;
        return CollectionsKt.X(u75.h(X, str, String.format(locale, "%04d", Arrays.copyOf(new Object[]{3081}, 1)), String.format(locale, "%010d", Arrays.copyOf(new Object[]{Long.valueOf(System.currentTimeMillis() / 1000)}, 1))), "x", null, null, null, 62);
    }

    @Override // defpackage.q3c
    public Object f() {
        try {
            return new kno(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            b6e.q(e);
            return null;
        }
    }
}
