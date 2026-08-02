package yads;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.media3.exoplayer.offline.DownloadService;
import defpackage.i191;
import defpackage.m281;
import defpackage.nba1;
import defpackage.ny61;
import defpackage.o4b;
import defpackage.pg71;
import defpackage.rf71;
import defpackage.uw21;
import defpackage.w511;
import defpackage.wu81;
import defpackage.ym71;
import defpackage.zv71;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes7.dex */
public final class lj0 extends Handler {
    public final HandlerThread a;
    public final wu81 b;
    public final i191 c;
    public final Handler d;
    public final ArrayList e;
    public final HashMap f;
    public int g;
    public boolean h;
    public int i;
    public int j;
    public int k;

    public lj0(HandlerThread handlerThread, wu81 wu81Var, i191 i191Var, Handler handler, boolean z) {
        super(handlerThread.getLooper());
        this.a = handlerThread;
        this.b = wu81Var;
        this.c = i191Var;
        this.d = handler;
        this.i = 3;
        this.j = 5;
        this.h = z;
        this.e = new ArrayList();
        this.f = new HashMap();
    }

    public final void a() {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        try {
            wu81 wu81Var = this.b;
            int[] iArr = {3, 4};
            wu81Var.e();
            StringBuilder sb = new StringBuilder("state IN (");
            for (int i = 0; i < 2; i++) {
                if (i > 0) {
                    sb.append(HexString.CHAR_COMMA);
                }
                sb.append(iArr[i]);
            }
            sb.append(')');
            Cursor a = wu81Var.a(sb.toString(), null);
            while (a.moveToPosition(a.getPosition() + 1)) {
                try {
                    arrayList2.add(wu81.b(a));
                } finally {
                }
            }
            a.close();
        } catch (IOException unused) {
            nba1.c("DownloadManager", "Failed to load downloads.");
        }
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            ArrayList arrayList3 = this.e;
            pg71 pg71Var = (pg71) arrayList3.get(i2);
            arrayList3.set(i2, new pg71(pg71Var.a, 5, pg71Var.c, System.currentTimeMillis(), pg71Var.e, 0, 0, pg71Var.h));
        }
        int i3 = 0;
        while (true) {
            int size = arrayList2.size();
            arrayList = this.e;
            if (i3 >= size) {
                break;
            }
            pg71 pg71Var2 = (pg71) arrayList2.get(i3);
            arrayList.add(new pg71(pg71Var2.a, 5, pg71Var2.c, System.currentTimeMillis(), pg71Var2.e, 0, 0, pg71Var2.h));
            i3++;
        }
        Collections.sort(arrayList, new uw21(15));
        try {
            this.b.l();
        } catch (IOException e) {
            nba1.c("DownloadManager", nba1.b("Failed to update index.", e));
        }
        ArrayList arrayList4 = new ArrayList(this.e);
        for (int i4 = 0; i4 < this.e.size(); i4++) {
            this.d.obtainMessage(2, new ym71((pg71) this.e.get(i4), false, arrayList4)).sendToTarget();
        }
        b();
    }

    public final void b() {
        int i = 0;
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            pg71 pg71Var = (pg71) this.e.get(i2);
            HashMap hashMap = this.f;
            rj0 rj0Var = pg71Var.a;
            zv71 zv71Var = (zv71) hashMap.get(rj0Var.b);
            int i3 = pg71Var.b;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        zv71Var.getClass();
                        if (zv71Var.w) {
                            ny61.k();
                            return;
                        } else if (this.h || this.g != 0 || i >= this.i) {
                            a(pg71Var, 0, 0);
                            zv71Var.b(false);
                        }
                    } else if (i3 != 5 && i3 != 7) {
                        ny61.k();
                        return;
                    } else if (zv71Var == null) {
                        zv71 zv71Var2 = new zv71(pg71Var.a, this.c.b(rj0Var), pg71Var.h, true, this.j, this);
                        this.f.put(rj0Var.b, zv71Var2);
                        zv71Var2.start();
                    } else if (!zv71Var.w) {
                        zv71Var.b(false);
                    }
                } else if (zv71Var != null) {
                    if (zv71Var.w) {
                        ny61.k();
                        return;
                    }
                    zv71Var.b(false);
                }
            } else if (zv71Var != null) {
                if (zv71Var.w) {
                    ny61.k();
                    return;
                }
                zv71Var.b(false);
            } else if (this.h || this.g != 0 || this.k >= this.i) {
                zv71Var = null;
            } else {
                pg71 a = a(pg71Var, 2, 0);
                i191 i191Var = this.c;
                rj0 rj0Var2 = a.a;
                rj0 rj0Var3 = a.a;
                zv71 zv71Var3 = new zv71(rj0Var3, i191Var.b(rj0Var2), a.h, false, this.j, this);
                this.f.put(rj0Var3.b, zv71Var3);
                int i4 = this.k;
                this.k = i4 + 1;
                if (i4 == 0) {
                    sendEmptyMessageDelayed(11, 5000L);
                }
                zv71Var3.start();
                zv71Var = zv71Var3;
            }
            if (zv71Var != null && !zv71Var.w) {
                i++;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.util.ArrayList] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        o4b o4bVar;
        List list;
        wu81 wu81Var;
        String str;
        o4b o4bVar2 = null;
        int i = 7;
        int i2 = 2;
        r10 = 0;
        int i3 = 0;
        switch (message.what) {
            case 0:
                this.g = message.arg1;
                try {
                    try {
                        this.b.k();
                        wu81 wu81Var2 = this.b;
                        int[] iArr = {0, 1, 2, 5, 7};
                        wu81Var2.e();
                        StringBuilder sb = new StringBuilder("state IN (");
                        for (int i4 = 0; i4 < 5; i4++) {
                            if (i4 > 0) {
                                sb.append(HexString.CHAR_COMMA);
                            }
                            sb.append(iArr[i4]);
                        }
                        sb.append(')');
                        o4bVar = new o4b(wu81Var2.a(sb.toString(), null), i2);
                    } catch (IOException e) {
                        e = e;
                    }
                    while (true) {
                        try {
                        } catch (IOException e2) {
                            e = e2;
                            o4bVar2 = o4bVar;
                            nba1.c("DownloadManager", nba1.b("Failed to load index.", e));
                            this.e.clear();
                            rf71.m(o4bVar2);
                            this.d.obtainMessage(0, new ArrayList(this.e)).sendToTarget();
                            b();
                            i3 = 1;
                            this.d.obtainMessage(1, i3, this.f.size()).sendToTarget();
                            return;
                        } catch (Throwable th) {
                            th = th;
                            o4bVar2 = o4bVar;
                            rf71.m(o4bVar2);
                            throw th;
                        }
                        if (!o4bVar.b.moveToPosition(o4bVar.b.getPosition() + 1)) {
                            rf71.m(o4bVar);
                            this.d.obtainMessage(0, new ArrayList(this.e)).sendToTarget();
                            b();
                            i3 = 1;
                            this.d.obtainMessage(1, i3, this.f.size()).sendToTarget();
                            return;
                        }
                        this.e.add(wu81.b(o4bVar.b));
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            case 1:
                this.h = message.arg1 != 0;
                b();
                i3 = 1;
                this.d.obtainMessage(1, i3, this.f.size()).sendToTarget();
                return;
            case 2:
                this.g = message.arg1;
                b();
                i3 = 1;
                this.d.obtainMessage(1, i3, this.f.size()).sendToTarget();
                return;
            case 3:
                String str2 = (String) message.obj;
                int i5 = message.arg1;
                if (str2 == null) {
                    for (int i6 = 0; i6 < this.e.size(); i6++) {
                        a((pg71) this.e.get(i6), i5);
                    }
                    try {
                        wu81 wu81Var3 = this.b;
                        wu81Var3.e();
                        try {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(DownloadService.KEY_STOP_REASON, Integer.valueOf(i5));
                            wu81Var3.a.getWritableDatabase().update("ExoPlayerDownloads", contentValues, wu81.d, null);
                        } catch (Throwable th3) {
                            throw new m30(th3);
                        }
                    } catch (IOException e3) {
                        nba1.c("DownloadManager", nba1.b("Failed to set manual stop reason", e3));
                    }
                } else {
                    pg71 a = a(str2, false);
                    if (a != null) {
                        a(a, i5);
                    } else {
                        try {
                            this.b.f(i5, str2);
                        } catch (IOException e4) {
                            nba1.c("DownloadManager", nba1.b("Failed to set manual stop reason: ".concat(str2), e4));
                        }
                    }
                }
                b();
                i3 = 1;
                this.d.obtainMessage(1, i3, this.f.size()).sendToTarget();
                return;
            case 4:
                this.i = message.arg1;
                b();
                i3 = 1;
                this.d.obtainMessage(1, i3, this.f.size()).sendToTarget();
                return;
            case 5:
                this.j = message.arg1;
                i3 = 1;
                this.d.obtainMessage(1, i3, this.f.size()).sendToTarget();
                return;
            case 6:
                rj0 rj0Var = (rj0) message.obj;
                int i7 = message.arg1;
                pg71 a2 = a(rj0Var.b, true);
                long currentTimeMillis = System.currentTimeMillis();
                if (a2 != null) {
                    int i8 = a2.b;
                    long j = (i8 == 5 || i8 == 3 || i8 == 4) ? currentTimeMillis : a2.c;
                    if (i8 != 5 && i8 != 7) {
                        i = i7 != 0 ? 1 : 0;
                    }
                    rj0 rj0Var2 = a2.a;
                    if (!rj0Var2.b.equals(rj0Var.b)) {
                        w511.q();
                        return;
                    }
                    if (rj0Var2.e.isEmpty() || rj0Var.e.isEmpty()) {
                        list = Collections.EMPTY_LIST;
                    } else {
                        list = new ArrayList(rj0Var2.e);
                        for (int i9 = 0; i9 < rj0Var.e.size(); i9++) {
                            y13 y13Var = (y13) rj0Var.e.get(i9);
                            if (!list.contains(y13Var)) {
                                list.add(y13Var);
                            }
                        }
                    }
                    a(new pg71(new rj0(rj0Var2.b, rj0Var.c, rj0Var.d, list, rj0Var.f, rj0Var.g, rj0Var.h), i, j, currentTimeMillis, -1L, i7, 0, new m281()));
                } else {
                    a(new pg71(rj0Var, i7 != 0 ? 1 : 0, currentTimeMillis, currentTimeMillis, -1L, i7, 0, new m281()));
                }
                b();
                i3 = 1;
                this.d.obtainMessage(1, i3, this.f.size()).sendToTarget();
                return;
            case 7:
                String str3 = (String) message.obj;
                pg71 a3 = a(str3, true);
                if (a3 == null) {
                    nba1.c("DownloadManager", "Failed to remove nonexistent download: " + str3);
                } else {
                    a(a3, 5, 0);
                    b();
                }
                i3 = 1;
                this.d.obtainMessage(1, i3, this.f.size()).sendToTarget();
                return;
            case 8:
                a();
                i3 = 1;
                this.d.obtainMessage(1, i3, this.f.size()).sendToTarget();
                return;
            case 9:
                zv71 zv71Var = (zv71) message.obj;
                String str4 = zv71Var.a.b;
                this.f.remove(str4);
                boolean z = zv71Var.w;
                if (!z) {
                    int i10 = this.k - 1;
                    this.k = i10;
                    if (i10 == 0) {
                        removeMessages(11);
                    }
                }
                if (zv71Var.z) {
                    b();
                } else {
                    Exception exc = zv71Var.A;
                    if (exc != null) {
                        nba1.c("DownloadManager", nba1.b("Task failed: " + zv71Var.a + Extension.FIX_SPACE + z, exc));
                    }
                    pg71 a4 = a(str4, false);
                    a4.getClass();
                    int i11 = a4.b;
                    if (i11 != 2) {
                        if (i11 != 5 && i11 != 7) {
                            ny61.k();
                            return;
                        }
                        if (!z) {
                            ny61.k();
                            return;
                        }
                        if (i11 == 7) {
                            int i12 = a4.f;
                            a(a4, i12 == 0 ? 0 : 1, i12);
                            b();
                        } else {
                            this.e.remove(a(a4.a.b));
                            try {
                                wu81Var = this.b;
                                str = a4.a.b;
                                wu81Var.e();
                            } catch (IOException unused) {
                                nba1.c("DownloadManager", "Failed to remove from database");
                            }
                            try {
                                wu81Var.a.getWritableDatabase().delete("ExoPlayerDownloads", "id = ?", new String[]{str});
                                this.d.obtainMessage(2, new ym71(a4, true, new ArrayList(this.e))).sendToTarget();
                            } finally {
                                m30 m30Var = new m30(th);
                            }
                        }
                    } else {
                        if (z) {
                            ny61.k();
                            return;
                        }
                        rj0 rj0Var3 = a4.a;
                        pg71 pg71Var = new pg71(rj0Var3, exc == null ? 3 : 4, a4.c, System.currentTimeMillis(), a4.e, a4.f, exc == null ? 0 : 1, a4.h);
                        this.e.remove(a(rj0Var3.b));
                        try {
                            this.b.g(pg71Var);
                        } catch (IOException e5) {
                            nba1.c("DownloadManager", nba1.b("Failed to update index.", e5));
                        }
                        this.d.obtainMessage(2, new ym71(pg71Var, false, new ArrayList(this.e))).sendToTarget();
                    }
                    b();
                }
                this.d.obtainMessage(1, i3, this.f.size()).sendToTarget();
                return;
            case 10:
                zv71 zv71Var2 = (zv71) message.obj;
                int i13 = message.arg1;
                int i14 = message.arg2;
                int i15 = rf71.a;
                long j2 = ((i13 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) << 32) | (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & i14);
                pg71 a5 = a(zv71Var2.a.b, false);
                a5.getClass();
                if (j2 == a5.e || j2 == -1) {
                    return;
                }
                a(new pg71(a5.a, a5.b, a5.c, System.currentTimeMillis(), j2, a5.f, a5.g, a5.h));
                return;
            case 11:
                for (int i16 = 0; i16 < this.e.size(); i16++) {
                    pg71 pg71Var2 = (pg71) this.e.get(i16);
                    if (pg71Var2.b == 2) {
                        try {
                            this.b.g(pg71Var2);
                        } catch (IOException e6) {
                            nba1.c("DownloadManager", nba1.b("Failed to update index.", e6));
                        }
                    }
                }
                sendEmptyMessageDelayed(11, 5000L);
                return;
            case 12:
                Iterator it = this.f.values().iterator();
                while (it.hasNext()) {
                    ((zv71) it.next()).b(true);
                }
                try {
                    this.b.k();
                } catch (IOException e7) {
                    nba1.c("DownloadManager", nba1.b("Failed to update index.", e7));
                }
                this.e.clear();
                this.a.quit();
                synchronized (this) {
                    notifyAll();
                }
                return;
            default:
                ny61.k();
                return;
        }
    }

    public final void a(pg71 pg71Var, int i) {
        if (i == 0) {
            if (pg71Var.b == 1) {
                a(pg71Var, 0, 0);
            }
        } else if (i != pg71Var.f) {
            int i2 = pg71Var.b;
            if (i2 == 0 || i2 == 2) {
                i2 = 1;
            }
            a(new pg71(pg71Var.a, i2, pg71Var.c, System.currentTimeMillis(), pg71Var.e, i, 0, pg71Var.h));
        }
    }

    public final pg71 a(pg71 pg71Var) {
        int i = pg71Var.b;
        if (i != 3 && i != 4) {
            int a = a(pg71Var.a.b);
            int i2 = 15;
            if (a == -1) {
                this.e.add(pg71Var);
                Collections.sort(this.e, new uw21(i2));
            } else {
                boolean z = pg71Var.c != ((pg71) this.e.get(a)).c;
                this.e.set(a, pg71Var);
                if (z) {
                    Collections.sort(this.e, new uw21(i2));
                }
            }
            try {
                this.b.g(pg71Var);
            } catch (IOException e) {
                nba1.c("DownloadManager", nba1.b("Failed to update index.", e));
            }
            this.d.obtainMessage(2, new ym71(pg71Var, false, new ArrayList(this.e))).sendToTarget();
            return pg71Var;
        }
        ny61.k();
        return null;
    }

    public final pg71 a(String str, boolean z) {
        int a = a(str);
        if (a != -1) {
            return (pg71) this.e.get(a);
        }
        if (!z) {
            return null;
        }
        try {
            return this.b.j(str);
        } catch (IOException e) {
            nba1.c("DownloadManager", nba1.b("Failed to load download: " + str, e));
            return null;
        }
    }

    public final int a(String str) {
        for (int i = 0; i < this.e.size(); i++) {
            if (((pg71) this.e.get(i)).a.b.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public final pg71 a(pg71 pg71Var, int i, int i2) {
        if (i != 3 && i != 4) {
            return a(new pg71(pg71Var.a, i, pg71Var.c, System.currentTimeMillis(), pg71Var.e, i2, 0, pg71Var.h));
        }
        ny61.k();
        return null;
    }

    public static int a(pg71 pg71Var, pg71 pg71Var2) {
        long j = pg71Var.c;
        long j2 = pg71Var2.c;
        int i = rf71.a;
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }
}
