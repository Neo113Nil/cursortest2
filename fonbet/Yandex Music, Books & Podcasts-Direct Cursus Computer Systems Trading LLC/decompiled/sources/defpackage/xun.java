package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class xun {
    public static final msg l = new msg("RemoteMediaClient", null);
    public final w1x c;
    public final yks d;
    public final wmh e;
    public h4x f;
    public i8s g;
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();
    public final ConcurrentHashMap j = new ConcurrentHashMap();
    public final ConcurrentHashMap k = new ConcurrentHashMap();
    public final Object a = new Object();
    public final fsn b = new fsn(Looper.getMainLooper(), 3);

    static {
        String str = w1x.w;
    }

    public xun(w1x w1xVar) {
        yks yksVar = new yks(this);
        this.d = yksVar;
        this.c = w1xVar;
        w1xVar.h = new gao(this);
        w1xVar.c = yksVar;
        wmh wmhVar = new wmh();
        wmhVar.m = Collections.synchronizedSet(new HashSet());
        wmhVar.b = new msg("MediaQueue", null);
        wmhVar.c = this;
        Math.max(20, 1);
        wmhVar.d = new ArrayList();
        wmhVar.e = new SparseIntArray();
        wmhVar.g = new ArrayList();
        wmhVar.h = new ArrayDeque(20);
        wmhVar.i = new fsn(Looper.getMainLooper(), 3);
        wmhVar.j = new fbr(4, wmhVar);
        p(new gix(0, wmhVar));
        wmhVar.f = new dhx(wmhVar);
        wmhVar.a = wmhVar.g();
        wmhVar.f();
        this.e = wmhVar;
    }

    public static vgr t() {
        vgr vgrVar = new vgr(null, 1);
        vgrVar.g(new i3x(new Status(17, null, null, null), 0));
        return vgrVar;
    }

    public static final void z(o3x o3xVar) {
        try {
            o3xVar.n();
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Throwable unused) {
            o3xVar.g(new i3x(new Status(2100, null, null, null), 1));
        }
    }

    public final long a() {
        long n;
        synchronized (this.a) {
            y1g.B("Must be called from the main thread.");
            n = this.c.n();
        }
        return n;
    }

    public final int b() {
        int i;
        synchronized (this.a) {
            try {
                y1g.B("Must be called from the main thread.");
                owh e = e();
                i = e != null ? e.f : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public final cph c() {
        y1g.B("Must be called from the main thread.");
        owh e = e();
        if (e == null) {
            return null;
        }
        Integer num = (Integer) e.x.get(e.l);
        if (num == null) {
            return null;
        }
        return (cph) e.q.get(num.intValue());
    }

    public final MediaInfo d() {
        MediaInfo mediaInfo;
        synchronized (this.a) {
            y1g.B("Must be called from the main thread.");
            owh owhVar = this.c.f;
            mediaInfo = owhVar == null ? null : owhVar.a;
        }
        return mediaInfo;
    }

    public final owh e() {
        owh owhVar;
        synchronized (this.a) {
            y1g.B("Must be called from the main thread.");
            owhVar = this.c.f;
        }
        return owhVar;
    }

    public final int f() {
        int i;
        synchronized (this.a) {
            try {
                y1g.B("Must be called from the main thread.");
                owh e = e();
                i = e != null ? e.e : 1;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public final long g() {
        long j;
        synchronized (this.a) {
            y1g.B("Must be called from the main thread.");
            owh owhVar = this.c.f;
            MediaInfo mediaInfo = owhVar == null ? null : owhVar.a;
            j = mediaInfo != null ? mediaInfo.e : 0L;
        }
        return j;
    }

    public final boolean h() {
        y1g.B("Must be called from the main thread.");
        return i() || w() || m() || l() || k();
    }

    public final boolean i() {
        y1g.B("Must be called from the main thread.");
        owh e = e();
        return e != null && e.e == 4;
    }

    public final boolean j() {
        y1g.B("Must be called from the main thread.");
        MediaInfo d = d();
        return d != null && d.b == 2;
    }

    public final boolean k() {
        y1g.B("Must be called from the main thread.");
        owh e = e();
        return (e == null || e.l == 0) ? false : true;
    }

    public final boolean l() {
        y1g.B("Must be called from the main thread.");
        owh e = e();
        if (e == null) {
            return false;
        }
        if (e.e != 3) {
            return j() && b() == 2;
        }
        return true;
    }

    public final boolean m() {
        y1g.B("Must be called from the main thread.");
        owh e = e();
        return e != null && e.e == 2;
    }

    public final boolean n() {
        y1g.B("Must be called from the main thread.");
        owh e = e();
        return e != null && e.r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x017d, code lost:
    
        if (r11 != false) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6 A[Catch: JSONException -> 0x0077, TryCatch #0 {JSONException -> 0x0077, blocks: (B:3:0x001d, B:8:0x0044, B:10:0x0051, B:12:0x005b, B:13:0x0067, B:15:0x006d, B:24:0x0082, B:26:0x008e, B:28:0x009d, B:33:0x00b6, B:36:0x00bb, B:37:0x00fe, B:39:0x0102, B:40:0x010e, B:42:0x0112, B:43:0x011a, B:45:0x011e, B:46:0x0124, B:48:0x0128, B:49:0x012b, B:51:0x012f, B:52:0x0132, B:54:0x0136, B:55:0x0139, B:57:0x013d, B:59:0x0147, B:61:0x0157, B:62:0x015d, B:64:0x0163, B:66:0x016d, B:67:0x0171, B:68:0x0172, B:70:0x0176, B:71:0x017f, B:72:0x0192, B:73:0x0196, B:75:0x019c, B:81:0x00c0, B:82:0x00a6, B:84:0x00ac, B:88:0x0183, B:92:0x01af, B:93:0x01be, B:95:0x01c4, B:101:0x01dc, B:103:0x01e9, B:105:0x01fd, B:109:0x020e, B:110:0x021a, B:112:0x0220, B:118:0x0232, B:120:0x0247, B:121:0x0266, B:123:0x026c, B:126:0x0276, B:127:0x0282, B:129:0x0288, B:135:0x029a, B:136:0x02a6, B:138:0x02ac, B:144:0x02be, B:145:0x02ca, B:147:0x02d0, B:157:0x02e2, B:158:0x02e6, B:160:0x02ec, B:162:0x02fc, B:166:0x0302, B:167:0x0311, B:169:0x0317, B:175:0x0329, B:180:0x033b, B:181:0x034a, B:183:0x0350, B:189:0x0368, B:191:0x0375, B:192:0x0381, B:194:0x0387, B:196:0x03a0, B:197:0x03ac, B:199:0x03b2, B:206:0x03c4), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0102 A[Catch: JSONException -> 0x0077, TryCatch #0 {JSONException -> 0x0077, blocks: (B:3:0x001d, B:8:0x0044, B:10:0x0051, B:12:0x005b, B:13:0x0067, B:15:0x006d, B:24:0x0082, B:26:0x008e, B:28:0x009d, B:33:0x00b6, B:36:0x00bb, B:37:0x00fe, B:39:0x0102, B:40:0x010e, B:42:0x0112, B:43:0x011a, B:45:0x011e, B:46:0x0124, B:48:0x0128, B:49:0x012b, B:51:0x012f, B:52:0x0132, B:54:0x0136, B:55:0x0139, B:57:0x013d, B:59:0x0147, B:61:0x0157, B:62:0x015d, B:64:0x0163, B:66:0x016d, B:67:0x0171, B:68:0x0172, B:70:0x0176, B:71:0x017f, B:72:0x0192, B:73:0x0196, B:75:0x019c, B:81:0x00c0, B:82:0x00a6, B:84:0x00ac, B:88:0x0183, B:92:0x01af, B:93:0x01be, B:95:0x01c4, B:101:0x01dc, B:103:0x01e9, B:105:0x01fd, B:109:0x020e, B:110:0x021a, B:112:0x0220, B:118:0x0232, B:120:0x0247, B:121:0x0266, B:123:0x026c, B:126:0x0276, B:127:0x0282, B:129:0x0288, B:135:0x029a, B:136:0x02a6, B:138:0x02ac, B:144:0x02be, B:145:0x02ca, B:147:0x02d0, B:157:0x02e2, B:158:0x02e6, B:160:0x02ec, B:162:0x02fc, B:166:0x0302, B:167:0x0311, B:169:0x0317, B:175:0x0329, B:180:0x033b, B:181:0x034a, B:183:0x0350, B:189:0x0368, B:191:0x0375, B:192:0x0381, B:194:0x0387, B:196:0x03a0, B:197:0x03ac, B:199:0x03b2, B:206:0x03c4), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0112 A[Catch: JSONException -> 0x0077, TryCatch #0 {JSONException -> 0x0077, blocks: (B:3:0x001d, B:8:0x0044, B:10:0x0051, B:12:0x005b, B:13:0x0067, B:15:0x006d, B:24:0x0082, B:26:0x008e, B:28:0x009d, B:33:0x00b6, B:36:0x00bb, B:37:0x00fe, B:39:0x0102, B:40:0x010e, B:42:0x0112, B:43:0x011a, B:45:0x011e, B:46:0x0124, B:48:0x0128, B:49:0x012b, B:51:0x012f, B:52:0x0132, B:54:0x0136, B:55:0x0139, B:57:0x013d, B:59:0x0147, B:61:0x0157, B:62:0x015d, B:64:0x0163, B:66:0x016d, B:67:0x0171, B:68:0x0172, B:70:0x0176, B:71:0x017f, B:72:0x0192, B:73:0x0196, B:75:0x019c, B:81:0x00c0, B:82:0x00a6, B:84:0x00ac, B:88:0x0183, B:92:0x01af, B:93:0x01be, B:95:0x01c4, B:101:0x01dc, B:103:0x01e9, B:105:0x01fd, B:109:0x020e, B:110:0x021a, B:112:0x0220, B:118:0x0232, B:120:0x0247, B:121:0x0266, B:123:0x026c, B:126:0x0276, B:127:0x0282, B:129:0x0288, B:135:0x029a, B:136:0x02a6, B:138:0x02ac, B:144:0x02be, B:145:0x02ca, B:147:0x02d0, B:157:0x02e2, B:158:0x02e6, B:160:0x02ec, B:162:0x02fc, B:166:0x0302, B:167:0x0311, B:169:0x0317, B:175:0x0329, B:180:0x033b, B:181:0x034a, B:183:0x0350, B:189:0x0368, B:191:0x0375, B:192:0x0381, B:194:0x0387, B:196:0x03a0, B:197:0x03ac, B:199:0x03b2, B:206:0x03c4), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011e A[Catch: JSONException -> 0x0077, TryCatch #0 {JSONException -> 0x0077, blocks: (B:3:0x001d, B:8:0x0044, B:10:0x0051, B:12:0x005b, B:13:0x0067, B:15:0x006d, B:24:0x0082, B:26:0x008e, B:28:0x009d, B:33:0x00b6, B:36:0x00bb, B:37:0x00fe, B:39:0x0102, B:40:0x010e, B:42:0x0112, B:43:0x011a, B:45:0x011e, B:46:0x0124, B:48:0x0128, B:49:0x012b, B:51:0x012f, B:52:0x0132, B:54:0x0136, B:55:0x0139, B:57:0x013d, B:59:0x0147, B:61:0x0157, B:62:0x015d, B:64:0x0163, B:66:0x016d, B:67:0x0171, B:68:0x0172, B:70:0x0176, B:71:0x017f, B:72:0x0192, B:73:0x0196, B:75:0x019c, B:81:0x00c0, B:82:0x00a6, B:84:0x00ac, B:88:0x0183, B:92:0x01af, B:93:0x01be, B:95:0x01c4, B:101:0x01dc, B:103:0x01e9, B:105:0x01fd, B:109:0x020e, B:110:0x021a, B:112:0x0220, B:118:0x0232, B:120:0x0247, B:121:0x0266, B:123:0x026c, B:126:0x0276, B:127:0x0282, B:129:0x0288, B:135:0x029a, B:136:0x02a6, B:138:0x02ac, B:144:0x02be, B:145:0x02ca, B:147:0x02d0, B:157:0x02e2, B:158:0x02e6, B:160:0x02ec, B:162:0x02fc, B:166:0x0302, B:167:0x0311, B:169:0x0317, B:175:0x0329, B:180:0x033b, B:181:0x034a, B:183:0x0350, B:189:0x0368, B:191:0x0375, B:192:0x0381, B:194:0x0387, B:196:0x03a0, B:197:0x03ac, B:199:0x03b2, B:206:0x03c4), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0128 A[Catch: JSONException -> 0x0077, TryCatch #0 {JSONException -> 0x0077, blocks: (B:3:0x001d, B:8:0x0044, B:10:0x0051, B:12:0x005b, B:13:0x0067, B:15:0x006d, B:24:0x0082, B:26:0x008e, B:28:0x009d, B:33:0x00b6, B:36:0x00bb, B:37:0x00fe, B:39:0x0102, B:40:0x010e, B:42:0x0112, B:43:0x011a, B:45:0x011e, B:46:0x0124, B:48:0x0128, B:49:0x012b, B:51:0x012f, B:52:0x0132, B:54:0x0136, B:55:0x0139, B:57:0x013d, B:59:0x0147, B:61:0x0157, B:62:0x015d, B:64:0x0163, B:66:0x016d, B:67:0x0171, B:68:0x0172, B:70:0x0176, B:71:0x017f, B:72:0x0192, B:73:0x0196, B:75:0x019c, B:81:0x00c0, B:82:0x00a6, B:84:0x00ac, B:88:0x0183, B:92:0x01af, B:93:0x01be, B:95:0x01c4, B:101:0x01dc, B:103:0x01e9, B:105:0x01fd, B:109:0x020e, B:110:0x021a, B:112:0x0220, B:118:0x0232, B:120:0x0247, B:121:0x0266, B:123:0x026c, B:126:0x0276, B:127:0x0282, B:129:0x0288, B:135:0x029a, B:136:0x02a6, B:138:0x02ac, B:144:0x02be, B:145:0x02ca, B:147:0x02d0, B:157:0x02e2, B:158:0x02e6, B:160:0x02ec, B:162:0x02fc, B:166:0x0302, B:167:0x0311, B:169:0x0317, B:175:0x0329, B:180:0x033b, B:181:0x034a, B:183:0x0350, B:189:0x0368, B:191:0x0375, B:192:0x0381, B:194:0x0387, B:196:0x03a0, B:197:0x03ac, B:199:0x03b2, B:206:0x03c4), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012f A[Catch: JSONException -> 0x0077, TryCatch #0 {JSONException -> 0x0077, blocks: (B:3:0x001d, B:8:0x0044, B:10:0x0051, B:12:0x005b, B:13:0x0067, B:15:0x006d, B:24:0x0082, B:26:0x008e, B:28:0x009d, B:33:0x00b6, B:36:0x00bb, B:37:0x00fe, B:39:0x0102, B:40:0x010e, B:42:0x0112, B:43:0x011a, B:45:0x011e, B:46:0x0124, B:48:0x0128, B:49:0x012b, B:51:0x012f, B:52:0x0132, B:54:0x0136, B:55:0x0139, B:57:0x013d, B:59:0x0147, B:61:0x0157, B:62:0x015d, B:64:0x0163, B:66:0x016d, B:67:0x0171, B:68:0x0172, B:70:0x0176, B:71:0x017f, B:72:0x0192, B:73:0x0196, B:75:0x019c, B:81:0x00c0, B:82:0x00a6, B:84:0x00ac, B:88:0x0183, B:92:0x01af, B:93:0x01be, B:95:0x01c4, B:101:0x01dc, B:103:0x01e9, B:105:0x01fd, B:109:0x020e, B:110:0x021a, B:112:0x0220, B:118:0x0232, B:120:0x0247, B:121:0x0266, B:123:0x026c, B:126:0x0276, B:127:0x0282, B:129:0x0288, B:135:0x029a, B:136:0x02a6, B:138:0x02ac, B:144:0x02be, B:145:0x02ca, B:147:0x02d0, B:157:0x02e2, B:158:0x02e6, B:160:0x02ec, B:162:0x02fc, B:166:0x0302, B:167:0x0311, B:169:0x0317, B:175:0x0329, B:180:0x033b, B:181:0x034a, B:183:0x0350, B:189:0x0368, B:191:0x0375, B:192:0x0381, B:194:0x0387, B:196:0x03a0, B:197:0x03ac, B:199:0x03b2, B:206:0x03c4), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0136 A[Catch: JSONException -> 0x0077, TryCatch #0 {JSONException -> 0x0077, blocks: (B:3:0x001d, B:8:0x0044, B:10:0x0051, B:12:0x005b, B:13:0x0067, B:15:0x006d, B:24:0x0082, B:26:0x008e, B:28:0x009d, B:33:0x00b6, B:36:0x00bb, B:37:0x00fe, B:39:0x0102, B:40:0x010e, B:42:0x0112, B:43:0x011a, B:45:0x011e, B:46:0x0124, B:48:0x0128, B:49:0x012b, B:51:0x012f, B:52:0x0132, B:54:0x0136, B:55:0x0139, B:57:0x013d, B:59:0x0147, B:61:0x0157, B:62:0x015d, B:64:0x0163, B:66:0x016d, B:67:0x0171, B:68:0x0172, B:70:0x0176, B:71:0x017f, B:72:0x0192, B:73:0x0196, B:75:0x019c, B:81:0x00c0, B:82:0x00a6, B:84:0x00ac, B:88:0x0183, B:92:0x01af, B:93:0x01be, B:95:0x01c4, B:101:0x01dc, B:103:0x01e9, B:105:0x01fd, B:109:0x020e, B:110:0x021a, B:112:0x0220, B:118:0x0232, B:120:0x0247, B:121:0x0266, B:123:0x026c, B:126:0x0276, B:127:0x0282, B:129:0x0288, B:135:0x029a, B:136:0x02a6, B:138:0x02ac, B:144:0x02be, B:145:0x02ca, B:147:0x02d0, B:157:0x02e2, B:158:0x02e6, B:160:0x02ec, B:162:0x02fc, B:166:0x0302, B:167:0x0311, B:169:0x0317, B:175:0x0329, B:180:0x033b, B:181:0x034a, B:183:0x0350, B:189:0x0368, B:191:0x0375, B:192:0x0381, B:194:0x0387, B:196:0x03a0, B:197:0x03ac, B:199:0x03b2, B:206:0x03c4), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013d A[Catch: JSONException -> 0x0077, TryCatch #0 {JSONException -> 0x0077, blocks: (B:3:0x001d, B:8:0x0044, B:10:0x0051, B:12:0x005b, B:13:0x0067, B:15:0x006d, B:24:0x0082, B:26:0x008e, B:28:0x009d, B:33:0x00b6, B:36:0x00bb, B:37:0x00fe, B:39:0x0102, B:40:0x010e, B:42:0x0112, B:43:0x011a, B:45:0x011e, B:46:0x0124, B:48:0x0128, B:49:0x012b, B:51:0x012f, B:52:0x0132, B:54:0x0136, B:55:0x0139, B:57:0x013d, B:59:0x0147, B:61:0x0157, B:62:0x015d, B:64:0x0163, B:66:0x016d, B:67:0x0171, B:68:0x0172, B:70:0x0176, B:71:0x017f, B:72:0x0192, B:73:0x0196, B:75:0x019c, B:81:0x00c0, B:82:0x00a6, B:84:0x00ac, B:88:0x0183, B:92:0x01af, B:93:0x01be, B:95:0x01c4, B:101:0x01dc, B:103:0x01e9, B:105:0x01fd, B:109:0x020e, B:110:0x021a, B:112:0x0220, B:118:0x0232, B:120:0x0247, B:121:0x0266, B:123:0x026c, B:126:0x0276, B:127:0x0282, B:129:0x0288, B:135:0x029a, B:136:0x02a6, B:138:0x02ac, B:144:0x02be, B:145:0x02ca, B:147:0x02d0, B:157:0x02e2, B:158:0x02e6, B:160:0x02ec, B:162:0x02fc, B:166:0x0302, B:167:0x0311, B:169:0x0317, B:175:0x0329, B:180:0x033b, B:181:0x034a, B:183:0x0350, B:189:0x0368, B:191:0x0375, B:192:0x0381, B:194:0x0387, B:196:0x03a0, B:197:0x03ac, B:199:0x03b2, B:206:0x03c4), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0176 A[Catch: JSONException -> 0x0077, TryCatch #0 {JSONException -> 0x0077, blocks: (B:3:0x001d, B:8:0x0044, B:10:0x0051, B:12:0x005b, B:13:0x0067, B:15:0x006d, B:24:0x0082, B:26:0x008e, B:28:0x009d, B:33:0x00b6, B:36:0x00bb, B:37:0x00fe, B:39:0x0102, B:40:0x010e, B:42:0x0112, B:43:0x011a, B:45:0x011e, B:46:0x0124, B:48:0x0128, B:49:0x012b, B:51:0x012f, B:52:0x0132, B:54:0x0136, B:55:0x0139, B:57:0x013d, B:59:0x0147, B:61:0x0157, B:62:0x015d, B:64:0x0163, B:66:0x016d, B:67:0x0171, B:68:0x0172, B:70:0x0176, B:71:0x017f, B:72:0x0192, B:73:0x0196, B:75:0x019c, B:81:0x00c0, B:82:0x00a6, B:84:0x00ac, B:88:0x0183, B:92:0x01af, B:93:0x01be, B:95:0x01c4, B:101:0x01dc, B:103:0x01e9, B:105:0x01fd, B:109:0x020e, B:110:0x021a, B:112:0x0220, B:118:0x0232, B:120:0x0247, B:121:0x0266, B:123:0x026c, B:126:0x0276, B:127:0x0282, B:129:0x0288, B:135:0x029a, B:136:0x02a6, B:138:0x02ac, B:144:0x02be, B:145:0x02ca, B:147:0x02d0, B:157:0x02e2, B:158:0x02e6, B:160:0x02ec, B:162:0x02fc, B:166:0x0302, B:167:0x0311, B:169:0x0317, B:175:0x0329, B:180:0x033b, B:181:0x034a, B:183:0x0350, B:189:0x0368, B:191:0x0375, B:192:0x0381, B:194:0x0387, B:196:0x03a0, B:197:0x03ac, B:199:0x03b2, B:206:0x03c4), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(String str) {
        int i;
        int i2;
        boolean z;
        owh owhVar;
        int[] j;
        w1x w1xVar = this.c;
        j2x j2xVar = w1xVar.p;
        j2x j2xVar2 = w1xVar.o;
        j2x j2xVar3 = w1xVar.j;
        List list = w1xVar.d;
        msg msgVar = w1xVar.a;
        msgVar.b("message received: %s", str);
        String str2 = msgVar.a;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("type");
            long optLong = jSONObject.optLong("requestId", -1L);
            switch (string.hashCode()) {
                case -1830647528:
                    if (string.equals("LOAD_CANCELLED")) {
                        j2xVar3.b(optLong, 2101, w1x.c(jSONObject));
                        return;
                    }
                    return;
                case -1790231854:
                    if (string.equals("QUEUE_ITEMS")) {
                        w1xVar.t.b(optLong, 0, null);
                        w1xVar.e("QUEUE_ITEMS", jSONObject);
                        if (w1xVar.h != null) {
                            JSONArray jSONArray = jSONObject.getJSONArray("items");
                            cph[] cphVarArr = new cph[jSONArray.length()];
                            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                                h4b h4bVar = new h4b();
                                h4bVar.a = new cph(jSONObject2);
                                cphVarArr[i3] = h4bVar.f();
                            }
                            Iterator it = ((xun) w1xVar.h.a).i.iterator();
                            while (it.hasNext()) {
                                ((wun) it.next()).j(cphVarArr);
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case -1125000185:
                    if (string.equals("INVALID_REQUEST")) {
                        Log.w(str2, msgVar.d("received unexpected error: Invalid Request.", new Object[0]));
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            ((j2x) it2.next()).b(optLong, 2001, w1x.c(jSONObject));
                        }
                        return;
                    }
                    return;
                case -262628938:
                    if (string.equals("LOAD_FAILED")) {
                        j2xVar3.b(optLong, 2100, w1x.c(jSONObject));
                        return;
                    }
                    return;
                case 66247144:
                    if (string.equals("ERROR")) {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            ((j2x) it3.next()).b(optLong, 2100, w1x.c(jSONObject));
                        }
                        if (w1xVar.h == null) {
                            return;
                        }
                        MediaError.a(jSONObject);
                        Iterator it4 = ((xun) w1xVar.h.a).i.iterator();
                        while (it4.hasNext()) {
                            ((wun) it4.next()).getClass();
                        }
                        return;
                    }
                    return;
                case 154411710:
                    if (string.equals("QUEUE_CHANGE")) {
                        w1xVar.u.b(optLong, 0, null);
                        w1xVar.e("QUEUE_CHANGE", jSONObject);
                        if (w1xVar.h != null) {
                            String string2 = jSONObject.getString("changeType");
                            int[] j2 = w1x.j(jSONObject.getJSONArray("itemIds"));
                            int optInt = jSONObject.optInt("insertBefore", 0);
                            if (j2 != null) {
                                switch (string2.hashCode()) {
                                    case -2130463047:
                                        if (string2.equals("INSERT")) {
                                            Iterator it5 = ((xun) w1xVar.h.a).i.iterator();
                                            while (it5.hasNext()) {
                                                ((wun) it5.next()).i(j2, optInt);
                                            }
                                            return;
                                        }
                                        return;
                                    case -1881281404:
                                        if (string2.equals("REMOVE")) {
                                            Iterator it6 = ((xun) w1xVar.h.a).i.iterator();
                                            while (it6.hasNext()) {
                                                ((wun) it6.next()).k(j2);
                                            }
                                            return;
                                        }
                                        return;
                                    case -1785516855:
                                        if (string2.equals("UPDATE")) {
                                            int[] j3 = w1x.j(jSONObject.getJSONArray("itemIds"));
                                            y1g.H(j3, "A list of item IDs is expected in a QUEUE UPDATE message.");
                                            JSONArray optJSONArray = jSONObject.optJSONArray("reorderItemIds");
                                            if (optJSONArray == null) {
                                                Iterator it7 = ((xun) w1xVar.h.a).i.iterator();
                                                while (it7.hasNext()) {
                                                    ((wun) it7.next()).h(j3);
                                                }
                                                return;
                                            }
                                            ArrayList c = d94.c(j3);
                                            int optInt2 = jSONObject.optInt("insertBefore", 0);
                                            int[] j4 = w1x.j(optJSONArray);
                                            y1g.G(j4);
                                            ArrayList c2 = d94.c(j4);
                                            Iterator it8 = ((xun) w1xVar.h.a).i.iterator();
                                            while (it8.hasNext()) {
                                                ((wun) it8.next()).l(c, c2, optInt2);
                                            }
                                            return;
                                        }
                                        return;
                                    case 1122976047:
                                        if (string2.equals("ITEMS_CHANGE")) {
                                            Iterator it9 = ((xun) w1xVar.h.a).i.iterator();
                                            while (it9.hasNext()) {
                                                ((wun) it9.next()).m(j2);
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 431600379:
                    if (string.equals("INVALID_PLAYER_STATE")) {
                        Log.w(str2, msgVar.d("received unexpected error: Invalid Player State.", new Object[0]));
                        Iterator it10 = list.iterator();
                        while (it10.hasNext()) {
                            ((j2x) it10.next()).b(optLong, 2100, w1x.c(jSONObject));
                        }
                        return;
                    }
                    return;
                case 823510221:
                    if (string.equals("MEDIA_STATUS")) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("status");
                        if (jSONArray2.length() > 0) {
                            JSONObject jSONObject3 = jSONArray2.getJSONObject(0);
                            boolean c3 = j2xVar3.c(optLong);
                            boolean z2 = true;
                            if (j2xVar2.d()) {
                                if (j2xVar2.c(optLong)) {
                                }
                                i = 1;
                                if (!c3 && (owhVar = w1xVar.f) != null) {
                                    i2 = owhVar.a(jSONObject3, i);
                                    if ((i2 & 1) != 0) {
                                        w1xVar.e = SystemClock.elapsedRealtime();
                                        w1xVar.i = -1;
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if ((i2 & 2) != 0) {
                                        w1xVar.e = SystemClock.elapsedRealtime();
                                    } else {
                                        z2 = z;
                                    }
                                    if ((i2 & 128) != 0) {
                                        w1xVar.e = SystemClock.elapsedRealtime();
                                    }
                                    if ((i2 & 4) != 0) {
                                        w1xVar.f();
                                    }
                                    if ((i2 & 8) != 0) {
                                        w1xVar.h();
                                    }
                                    if ((i2 & 16) != 0) {
                                        w1xVar.g();
                                    }
                                    if ((i2 & 32) != 0) {
                                        w1xVar.e = SystemClock.elapsedRealtime();
                                        gao gaoVar = w1xVar.h;
                                        if (gaoVar != null) {
                                            xun xunVar = (xun) gaoVar.a;
                                            Iterator it11 = xunVar.h.iterator();
                                            if (it11.hasNext()) {
                                                throw hrg.j(it11);
                                            }
                                            Iterator it12 = xunVar.i.iterator();
                                            while (it12.hasNext()) {
                                                ((wun) it12.next()).a();
                                            }
                                        }
                                    }
                                    if ((i2 & 64) != 0) {
                                        w1xVar.e = SystemClock.elapsedRealtime();
                                    }
                                    w1xVar.i();
                                }
                                owh owhVar2 = new owh(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
                                owhVar2.a(jSONObject3, 0);
                                w1xVar.f = owhVar2;
                                w1xVar.e = SystemClock.elapsedRealtime();
                                i2 = 127;
                                if ((i2 & 1) != 0) {
                                }
                                if ((i2 & 2) != 0) {
                                }
                                if ((i2 & 128) != 0) {
                                }
                                if ((i2 & 4) != 0) {
                                }
                                if ((i2 & 8) != 0) {
                                }
                                if ((i2 & 16) != 0) {
                                }
                                if ((i2 & 32) != 0) {
                                }
                                if ((i2 & 64) != 0) {
                                }
                                w1xVar.i();
                            }
                            if (!j2xVar.d() || j2xVar.c(optLong)) {
                                i = 0;
                                if (!c3) {
                                    i2 = owhVar.a(jSONObject3, i);
                                    if ((i2 & 1) != 0) {
                                    }
                                    if ((i2 & 2) != 0) {
                                    }
                                    if ((i2 & 128) != 0) {
                                    }
                                    if ((i2 & 4) != 0) {
                                    }
                                    if ((i2 & 8) != 0) {
                                    }
                                    if ((i2 & 16) != 0) {
                                    }
                                    if ((i2 & 32) != 0) {
                                    }
                                    if ((i2 & 64) != 0) {
                                    }
                                    w1xVar.i();
                                }
                                owh owhVar22 = new owh(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
                                owhVar22.a(jSONObject3, 0);
                                w1xVar.f = owhVar22;
                                w1xVar.e = SystemClock.elapsedRealtime();
                                i2 = 127;
                                if ((i2 & 1) != 0) {
                                }
                                if ((i2 & 2) != 0) {
                                }
                                if ((i2 & 128) != 0) {
                                }
                                if ((i2 & 4) != 0) {
                                }
                                if ((i2 & 8) != 0) {
                                }
                                if ((i2 & 16) != 0) {
                                }
                                if ((i2 & 32) != 0) {
                                }
                                if ((i2 & 64) != 0) {
                                }
                                w1xVar.i();
                            } else {
                                i = 1;
                                if (!c3) {
                                }
                                owh owhVar222 = new owh(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
                                owhVar222.a(jSONObject3, 0);
                                w1xVar.f = owhVar222;
                                w1xVar.e = SystemClock.elapsedRealtime();
                                i2 = 127;
                                if ((i2 & 1) != 0) {
                                }
                                if ((i2 & 2) != 0) {
                                }
                                if ((i2 & 128) != 0) {
                                }
                                if ((i2 & 4) != 0) {
                                }
                                if ((i2 & 8) != 0) {
                                }
                                if ((i2 & 16) != 0) {
                                }
                                if ((i2 & 32) != 0) {
                                }
                                if ((i2 & 64) != 0) {
                                }
                                w1xVar.i();
                            }
                        } else {
                            w1xVar.f = null;
                            w1xVar.i();
                            w1xVar.f();
                            w1xVar.h();
                            w1xVar.g();
                        }
                        Iterator it13 = list.iterator();
                        while (it13.hasNext()) {
                            ((j2x) it13.next()).b(optLong, 0, null);
                        }
                        return;
                    }
                    return;
                case 2107149050:
                    if (string.equals("QUEUE_ITEM_IDS")) {
                        w1xVar.s.b(optLong, 0, null);
                        w1xVar.e("QUEUE_ITEM_IDS", jSONObject);
                        if (w1xVar.h == null || (j = w1x.j(jSONObject.getJSONArray("itemIds"))) == null) {
                            return;
                        }
                        Iterator it14 = ((xun) w1xVar.h.a).i.iterator();
                        while (it14.hasNext()) {
                            ((wun) it14.next()).h(j);
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (JSONException e) {
            Log.w(str2, msgVar.d("Message is malformed (%s); ignoring: %s", e.getMessage(), str));
        }
    }

    public final void p(wun wunVar) {
        y1g.B("Must be called from the main thread.");
        if (wunVar != null) {
            this.i.add(wunVar);
        }
    }

    public final BasePendingResult q(rrh rrhVar) {
        y1g.B("Must be called from the main thread.");
        if (!y()) {
            return t();
        }
        r1x r1xVar = new r1x(this, rrhVar, 2);
        z(r1xVar);
        return r1xVar;
    }

    public final void r() {
        y1g.B("Must be called from the main thread.");
        int f = f();
        if (f == 4 || f == 2) {
            y1g.B("Must be called from the main thread.");
            if (y()) {
                z(new z0x(this, 3));
                return;
            } else {
                t();
                return;
            }
        }
        y1g.B("Must be called from the main thread.");
        if (y()) {
            z(new z0x(this, 5));
        } else {
            t();
        }
    }

    public final int s() {
        cph c;
        if (d() != null && h()) {
            if (i()) {
                return 6;
            }
            if (m()) {
                return 3;
            }
            if (l()) {
                return 2;
            }
            if (k() && (c = c()) != null && c.a != null) {
                return 6;
            }
        }
        return 0;
    }

    public final void u() {
        h4x h4xVar = this.f;
        if (h4xVar == null) {
            return;
        }
        y1g.B("Must be called from the main thread.");
        String str = this.c.b;
        d94.b(str);
        synchronized (h4xVar.C) {
            h4xVar.C.put(str, this);
        }
        q5i a = h8s.a();
        a.c = new z6u(11, h4xVar, str, this);
        a.b = 8413;
        h4xVar.c(1, a.c());
        y1g.B("Must be called from the main thread.");
        if (y()) {
            z(new z0x(this, 6));
        } else {
            t();
        }
    }

    public final void v(h4x h4xVar) {
        xun xunVar;
        h4x h4xVar2 = this.f;
        if (h4xVar2 == h4xVar) {
            return;
        }
        if (h4xVar2 != null) {
            w1x w1xVar = this.c;
            synchronized (w1xVar.d) {
                try {
                    Iterator it = w1xVar.d.iterator();
                    while (it.hasNext()) {
                        ((j2x) it.next()).f(2002);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            w1xVar.d();
            this.e.e();
            y1g.B("Must be called from the main thread.");
            String str = this.c.b;
            if (TextUtils.isEmpty(str)) {
                xq0.x("Channel namespace cannot be null or empty");
                return;
            }
            synchronized (h4xVar2.C) {
                xunVar = (xun) h4xVar2.C.remove(str);
            }
            q5i a = h8s.a();
            a.c = new yks(14, h4xVar2, xunVar, str);
            a.b = 8414;
            h4xVar2.c(1, a.c());
            this.d.b = null;
            this.b.removeCallbacksAndMessages(null);
        }
        this.f = h4xVar;
        if (h4xVar != null) {
            this.d.b = h4xVar;
        }
    }

    public final boolean w() {
        y1g.B("Must be called from the main thread.");
        owh e = e();
        return e != null && e.e == 5;
    }

    public final void x(Set set) {
        HashSet hashSet = new HashSet(set);
        if (m() || l() || i() || w()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                h64 h64Var = (h64) it.next();
                long a = a();
                g();
                h64Var.a(a);
            }
            return;
        }
        if (!k()) {
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((h64) it2.next()).a(0L);
            }
            return;
        }
        cph c = c();
        if (c == null || c.a == null) {
            return;
        }
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            ((h64) it3.next()).a(0L);
        }
    }

    public final boolean y() {
        return this.f != null;
    }
}
