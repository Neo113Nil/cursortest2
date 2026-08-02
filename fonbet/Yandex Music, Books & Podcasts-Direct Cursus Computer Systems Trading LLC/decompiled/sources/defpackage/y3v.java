package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes4.dex */
public final class y3v {
    public final b3v a;
    public final xpl b;
    public final oq7 c;
    public final by7 d;
    public final fkn e;
    public boolean f;

    public y3v(b3v b3vVar, xpl xplVar, oq7 oq7Var) {
        this.a = b3vVar;
        this.b = xplVar;
        this.c = oq7Var;
        this.d = asq.K(b3vVar.b, new q0v(1, this));
        this.e = xplVar.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0067, code lost:
    
        if (r7.length() > 0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static l2v a(cml cmlVar) {
        a3v z2vVar;
        String str;
        a3v z2vVar2;
        CoverPath coverPath;
        String uri;
        boolean z;
        i2v i2vVar;
        bzs bzsVar;
        jzb jzbVar;
        w1v w1vVar = (w1v) cmlVar.a;
        w1vVar.getClass();
        Integer backgroundColor = w1vVar.getBackgroundColor();
        b1v D = backgroundColor != null ? p1g.D(backgroundColor.intValue()) : null;
        x2v d = w1vVar.d();
        d.getClass();
        if (d instanceof t2v) {
            z2vVar = new z2v(((t2v) d).a.b, d);
        } else {
            if (d instanceof u2v) {
                u2v u2vVar = (u2v) d;
                List list = u2vVar.a;
                c01 c01Var = (c01) CollectionsKt.firstOrNull(list);
                if (c01Var != null && (coverPath = c01Var.l) != null && (uri = coverPath.getUri()) != null) {
                    WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS_NO_CROP;
                    webPath$Storage.getClass();
                    str = etn.B(uri, webPath$Storage).getPathForSize(frv.b());
                    if (str != null) {
                    }
                }
                str = null;
                String N = xp3.N(list);
                z2vVar2 = str == null ? new z2v(N, u2vVar) : new y2v(N, str, u2vVar);
                z = w1vVar instanceof v1v;
                if (!z) {
                    String str2 = ((v1v) w1vVar).a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    i2vVar = new h2v(str2);
                } else if (w1vVar instanceof t1v) {
                    i2vVar = new h2v(((t1v) w1vVar).b);
                } else {
                    if (!(w1vVar instanceof u1v)) {
                        b6e.s();
                        return null;
                    }
                    i2vVar = g2v.a;
                }
                i2v i2vVar2 = i2vVar;
                co6 a = w1vVar.a();
                h1v h1vVar = a == null ? new h1v(a.b, vz1.w(a.a)) : null;
                if (!z || (w1vVar instanceof u1v)) {
                    bzsVar = null;
                } else {
                    if (!(w1vVar instanceof t1v)) {
                        b6e.s();
                        return null;
                    }
                    bzsVar = ((t1v) w1vVar).e;
                }
                if (!(w1vVar instanceof t1v)) {
                    jzbVar = ((t1v) w1vVar).f;
                } else {
                    if (!(w1vVar instanceof u1v) && !z) {
                        b6e.s();
                        return null;
                    }
                    jzbVar = null;
                }
                return new l2v(new k2v(z2vVar2, h1vVar, D == null ? Integer.valueOf(D.a) : null, D == null ? Integer.valueOf(D.b) : null, D == null ? Integer.valueOf(D.c) : null, D != null ? D.d : null, i2vVar2, bzsVar, jzbVar, w1vVar.c(), w1vVar.b()), cmlVar.b);
            }
            if (d instanceof w2v) {
                z2vVar = new z2v(((w2v) d).a, d);
            } else {
                if (!(d instanceof v2v)) {
                    b6e.s();
                    return null;
                }
                v2v v2vVar = (v2v) d;
                z2vVar = new z2v(zwf.B(v2vVar.b, v2vVar.a), d);
            }
        }
        z2vVar2 = z2vVar;
        z = w1vVar instanceof v1v;
        if (!z) {
        }
        i2v i2vVar22 = i2vVar;
        co6 a2 = w1vVar.a();
        if (a2 == null) {
        }
        if (z) {
        }
        bzsVar = null;
        if (!(w1vVar instanceof t1v)) {
        }
        return new l2v(new k2v(z2vVar2, h1vVar, D == null ? Integer.valueOf(D.a) : null, D == null ? Integer.valueOf(D.b) : null, D == null ? Integer.valueOf(D.c) : null, D != null ? D.d : null, i2vVar22, bzsVar, jzbVar, w1vVar.c(), w1vVar.b()), cmlVar.b);
    }
}
