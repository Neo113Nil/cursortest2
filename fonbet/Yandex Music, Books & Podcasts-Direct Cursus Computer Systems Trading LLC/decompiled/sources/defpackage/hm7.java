package defpackage;

import android.net.Uri;
import androidx.media3.extractor.flac.FlacExtractor;
import com.connectsdk.etc.helper.HttpMessage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class hm7 implements u2c {
    public static final int[] f = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final xiu g = new xiu(new rj7(1));
    public static final xiu h = new xiu(new rj7(2));
    public qsn b;
    public int e;
    public mvt d = new mvt(20);
    public boolean c = true;

    @Override // defpackage.u2c
    public final void a(mvt mvtVar) {
        synchronized (this) {
            this.d = mvtVar;
        }
    }

    @Override // defpackage.u2c
    public final void b() {
        synchronized (this) {
        }
    }

    @Override // defpackage.u2c
    public final void c(boolean z) {
        synchronized (this) {
            this.c = z;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:9:0x0024, B:11:0x002b, B:12:0x0031, B:15:0x0039, B:18:0x003e, B:21:0x0044, B:23:0x0047, B:27:0x004a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:9:0x0024, B:11:0x002b, B:12:0x0031, B:15:0x0039, B:18:0x003e, B:21:0x0044, B:23:0x0047, B:27:0x004a), top: B:2:0x0001 }] */
    @Override // defpackage.u2c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized r2c[] d(Uri uri, Map map) {
        ArrayList arrayList;
        String str;
        int x;
        int y;
        try {
            int[] iArr = f;
            arrayList = new ArrayList(21);
            List list = (List) map.get(HttpMessage.CONTENT_TYPE_HEADER);
            if (list != null && !list.isEmpty()) {
                str = (String) list.get(0);
                x = h4a.x(str);
                if (x != -1) {
                    f(arrayList, x);
                }
                y = h4a.y(uri);
                if (y != -1 && y != x) {
                    f(arrayList, y);
                }
                for (int i = 0; i < 21; i++) {
                    int i2 = iArr[i];
                    if (i2 != x && i2 != y) {
                        f(arrayList, i2);
                    }
                }
            }
            str = null;
            x = h4a.x(str);
            if (x != -1) {
            }
            y = h4a.y(uri);
            if (y != -1) {
                f(arrayList, y);
            }
            while (i < 21) {
            }
        } catch (Throwable th) {
            throw th;
        }
        return (r2c[]) arrayList.toArray(new r2c[arrayList.size()]);
    }

    @Override // defpackage.u2c
    public final synchronized r2c[] e() {
        return d(Uri.EMPTY, new HashMap());
    }

    public final void f(ArrayList arrayList, int i) {
        switch (i) {
            case 0:
                arrayList.add(new v9());
                break;
            case 1:
                arrayList.add(new y9());
                break;
            case 2:
                arrayList.add(new on(0));
                break;
            case 3:
                arrayList.add(new p60());
                break;
            case 4:
                r2c q = g.q(0);
                if (q == null) {
                    arrayList.add(new FlacExtractor());
                    break;
                } else {
                    arrayList.add(q);
                    break;
                }
            case 5:
                arrayList.add(new ync());
                break;
            case 6:
                arrayList.add(new reh(this.d, this.c ? 0 : 2));
                break;
            case 7:
                arrayList.add(new sfi(0));
                break;
            case 8:
                arrayList.add(new jvc(this.d, this.c ? 0 : 32));
                arrayList.add(new xfi(this.d, this.c ? 0 : 16));
                break;
            case 9:
                arrayList.add(new qnj());
                break;
            case 10:
                arrayList.add(new c0n());
                break;
            case 11:
                if (this.b == null) {
                    ude udeVar = yde.b;
                    this.b = qsn.e;
                }
                arrayList.add(new ebt(1, !this.c ? 1 : 0, this.d, new ojs(0L), new et7(this.b, r2)));
                break;
            case 12:
                arrayList.add(new vku());
                break;
            case 14:
                arrayList.add(new ro7(this.e));
                break;
            case 15:
                r2c q2 = h.q(new Object[0]);
                if (q2 != null) {
                    arrayList.add(q2);
                    break;
                }
                break;
            case 16:
                arrayList.add(new ah2(!this.c ? 1 : 0, this.d));
                break;
            case 17:
                arrayList.add(new j83(1));
                break;
            case 18:
                arrayList.add(new dh2(2));
                break;
            case 19:
                arrayList.add(new j83(0));
                break;
            case 20:
                arrayList.add(new dh2(1));
                break;
            case 21:
                arrayList.add(new dh2(0));
                break;
        }
    }
}
