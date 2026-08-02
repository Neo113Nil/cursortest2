package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.webkit.PermissionRequest;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.etc.helper.HttpMessage;
import com.connectsdk.service.airplay.PListParser;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.charset.Charset;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.ssl.X509TrustManager;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import ru.yandex.music.catalog.info.FullInfoActivity;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.search.SearchActivity;

/* loaded from: classes3.dex */
public final class kkp implements tq3, c6e, jzc, pm5, kzc, ukk, qce {
    public static kkp f;
    public static final String[] g = {ConnectableDevice.KEY_ID, PListParser.TAG_KEY, "metadata"};
    public static final h1b h = new h1b();
    public static final y9w i = new y9w(27);
    public static final uit j = new uit(2);
    public static final a5k k = new a5k();
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public kkp(int i2) {
        this.a = i2;
        switch (i2) {
            case 2:
                hs4 hs4Var = hs4.m;
                this.c = wyf.y();
                this.d = wyf.y();
                this.e = wyf.y();
                this.b = hs4Var;
                break;
            case 8:
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ih(0));
                this.c = new HashMap();
                this.d = new ReferenceQueue();
                this.b = newSingleThreadExecutor;
                newSingleThreadExecutor.execute(new q9(2, this));
                break;
            case 20:
                Random random = new Random();
                this.d = new HashMap();
                this.e = random;
                this.b = new HashMap();
                this.c = new HashMap();
                break;
            case 26:
                break;
            case 27:
                this.c = new HashMap();
                break;
            default:
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = new ArrayDeque();
                break;
        }
    }

    public static void C(long j2, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j2) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            hashMap.remove(arrayList.get(i2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable a(kkp kkpVar, cg6 cg6Var) {
        cg4 cg4Var;
        int i2;
        rj6 rj6Var;
        if (cg6Var instanceof cg4) {
            cg4Var = (cg4) cg6Var;
            int i3 = cg4Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cg4Var.l = i3 - Integer.MIN_VALUE;
                Object obj = cg4Var.j;
                nm6 nm6Var = nm6.a;
                i2 = cg4Var.l;
                if (i2 != 0) {
                    qgg.h0(obj);
                    pf4 pf4Var = (pf4) ((jyr) kkpVar.e).getValue();
                    cg4Var.l = 1;
                    obj = pf4Var.a(false, cg4Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (rj6Var instanceof pj6) {
                        throw ((pj6) rj6Var).a();
                    }
                    b6e.s();
                    return null;
                }
                List list = ((qe4) ((qj6) rj6Var).a).b;
                ArrayList arrayList = new ArrayList(v75.o(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((rf4) it.next()).b);
                }
                return arrayList;
            }
        }
        cg4Var = new cg4(kkpVar, cg6Var);
        Object obj2 = cg4Var.j;
        nm6 nm6Var2 = nm6.a;
        i2 = cg4Var.l;
        if (i2 != 0) {
        }
        rj6Var = (rj6) obj2;
        if (rj6Var instanceof qj6) {
        }
    }

    public static synchronized kkp v() {
        kkp kkpVar;
        synchronized (kkp.class) {
            try {
                if (f == null) {
                    f = new kkp(0);
                }
                kkpVar = f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kkpVar;
    }

    public un4 A() {
        un4 un4Var;
        String str = (String) this.b;
        if (str != null && (un4Var = (un4) ((HashMap) this.c).get(str)) != null && !un4Var.equals((un4) this.e)) {
            this.e = un4Var;
        }
        return (un4) this.e;
    }

    public void B(oq oqVar) {
        oqVar.getClass();
        int i2 = FullInfoActivity.g;
        t tVar = (t) this.b;
        tVar.getClass();
        String str = oqVar.a;
        co6 co6Var = oqVar.D;
        CoverPath coverPath = co6Var.a;
        qo6 qo6Var = co6Var.b;
        String str2 = oqVar.b;
        String x = etn.x(oqVar);
        String str3 = oqVar.i;
        if (str3 == null) {
            str3 = "";
        }
        tVar.startActivity(wdp.l0(tVar, new ixc(null, str, coverPath, qo6Var, null, null, str2, x, str3), false));
    }

    public void D(boolean z) {
        if (z) {
            ((uug) this.d).i();
        } else {
            ((uug) this.e).i();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (r1 == null) goto L6;
     */
    @Override // defpackage.qce
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void E(rce rceVar, pgb pgbVar) {
        String str;
        rceVar.getClass();
        ls4 ls4Var = (ls4) this.c;
        Long l = (Long) ls4Var.d.remove((String) this.b);
        if (l != null) {
            str = String.valueOf(System.currentTimeMillis() - l.longValue());
        }
        str = "N/A";
        qy2 qy2Var = (qy2) ls4Var.c.getValue();
        String e = ls4.e(ls4Var, rceVar.b);
        Throwable th = pgbVar.c;
        qy2Var.getClass();
        qy2Var.a.a("image_load_error", uah.e(new Pair("url", e), new Pair("error", th.getMessage()), new Pair(ConnectableDevice.KEY_ID, qy2Var.b), new Pair("durationMs", str), new Pair("placeName", qy2Var.c)));
        ((n7w) this.d).T();
    }

    public mu2 F(List list) {
        mu2 mu2Var;
        HashMap hashMap = (HashMap) this.d;
        ArrayList m = m(list);
        if (m.size() < 2) {
            return (mu2) ild.w(m, null);
        }
        Collections.sort(m, new mj(3));
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = ((mu2) m.get(0)).c;
        int i4 = 0;
        while (true) {
            if (i4 >= m.size()) {
                break;
            }
            mu2 mu2Var2 = (mu2) m.get(i4);
            if (i3 == mu2Var2.c) {
                arrayList.add(new android.util.Pair(mu2Var2.b, Integer.valueOf(mu2Var2.d)));
                i4++;
            } else if (arrayList.size() == 1) {
                return (mu2) m.get(0);
            }
        }
        mu2 mu2Var3 = (mu2) hashMap.get(arrayList);
        if (mu2Var3 != null) {
            return mu2Var3;
        }
        List subList = m.subList(0, arrayList.size());
        int i5 = 0;
        for (int i6 = 0; i6 < subList.size(); i6++) {
            i5 += ((mu2) subList.get(i6)).d;
        }
        int nextInt = ((Random) this.e).nextInt(i5);
        int i7 = 0;
        while (true) {
            if (i2 >= subList.size()) {
                mu2Var = (mu2) ild.x(subList);
                break;
            }
            mu2Var = (mu2) subList.get(i2);
            i7 += mu2Var.d;
            if (nextInt < i7) {
                break;
            }
            i2++;
        }
        hashMap.put(arrayList, mu2Var);
        return mu2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (r4 == null) goto L6;
     */
    @Override // defpackage.qce
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void G(rce rceVar, bqr bqrVar) {
        String str;
        Drawable drawable = bqrVar.a;
        bb7 bb7Var = bqrVar.c;
        rceVar.getClass();
        ls4 ls4Var = (ls4) this.c;
        Long l = (Long) ls4Var.d.remove((String) this.b);
        if (l != null) {
            str = String.valueOf(System.currentTimeMillis() - l.longValue());
        }
        str = "N/A";
        qy2 qy2Var = (qy2) ls4Var.c.getValue();
        String e = ls4.e(ls4Var, rceVar.b);
        String name = bb7Var.name();
        String valueOf = String.valueOf(vq2.N(drawable, 0, 0, 7).getAllocationByteCount());
        qy2Var.getClass();
        name.getClass();
        valueOf.getClass();
        qy2Var.a.a("image_load_success", uah.e(new Pair("url", e), new Pair("type", name), new Pair("sizeBytes", valueOf), new Pair(ConnectableDevice.KEY_ID, qy2Var.b), new Pair("durationMs", str), new Pair("placeName", qy2Var.c)));
        Bitmap bitmap = drawable instanceof BitmapDrawable ? ((BitmapDrawable) drawable).getBitmap() : vq2.N(drawable, 0, 0, 7);
        int ordinal = bb7Var.ordinal();
        t33 t33Var = t33.c;
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2) {
                t33Var = t33.b;
            } else {
                if (ordinal != 3) {
                    b6e.s();
                    return;
                }
                t33Var = t33.a;
            }
        }
        ((n7w) this.d).X(new qq3(bitmap, (Uri) this.e, t33Var, 0));
    }

    public void H(oq oqVar) {
        oqVar.getClass();
        dy7 dy7Var = (dy7) ((jyr) this.e).getValue();
        kxi kxiVar = (kxi) this.d;
        y supportFragmentManager = ((t) this.b).getSupportFragmentManager();
        supportFragmentManager.getClass();
        qld.L(oqVar, dy7Var, kxiVar, pd.t(new qzm[0]), supportFragmentManager);
    }

    public void I(oq oqVar, List list) {
        oqVar.getClass();
        list.getClass();
        t tVar = (t) this.b;
        np2 np2Var = tVar instanceof np2 ? (np2) tVar : null;
        rf3 J = np2Var != null ? np2Var.l().J() : null;
        int i2 = SearchActivity.Z;
        c0p x = rvf.x(J);
        tVar.getClass();
        l18 l18Var = l18.b;
        bdt I = hag.I(y8s.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        y8s y8sVar = (y8s) qdcVar.C(I);
        String str = oqVar.a;
        str.getClass();
        y8sVar.d.put(str, list);
        Intent intent = new Intent(tVar, (Class<?>) SearchActivity.class);
        intent.putExtra("extra.for.entity.search", new j5p(oqVar, x));
        tVar.startActivity(intent);
    }

    public void J(mqs mqsVar, gj gjVar, oq oqVar, LinkedList linkedList, zus zusVar) {
        mqsVar.getClass();
        oqVar.getClass();
        zusVar.getClass();
        int ordinal = ((ezb) l18.b.b(hag.I(ezb.class), true).getValue()).a().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                b6e.s();
                return;
            } else if (mqsVar.i() != null) {
                return;
            }
        }
        ve veVar = new ve(oqVar.j() == lq.b ? muo.PODCAST : muo.ALBUM, zqt.d);
        b6v u0 = y5g.u0(oqVar);
        t tVar = (t) this.b;
        y supportFragmentManager = tVar.getSupportFragmentManager();
        supportFragmentManager.getClass();
        rre.Z(mqsVar, zusVar, u0, veVar, tVar, supportFragmentManager, (kxi) this.d, (PlaybackScope) this.c, gjVar, linkedList != null ? new mvs(oqVar, linkedList) : null, null, 1024);
    }

    @Override // defpackage.tq3
    public void b(sq3 sq3Var) {
        ((SparseArray) this.d).put(sq3Var.a, sq3Var);
    }

    @Override // defpackage.c6e
    public void c(Exception exc, nr1 nr1Var) {
        viq viqVar = (viq) this.c;
        nsh nshVar = (nsh) this.e;
        if (exc != null) {
            ((ys1) nshVar.d).c(new lr1(nshVar, (qdc) this.b, viqVar, nr1Var, exc, (Object) null));
            return;
        }
        jml jmlVar = (jml) this.d;
        String p = nr1Var.i.p(HttpMessage.CONTENT_TYPE_HEADER);
        wgi wgiVar = new wgi();
        String str = null;
        if (p != null) {
            for (String str2 : p.split(";")) {
                String[] split = str2.split("=", 2);
                String trim = split[0].trim();
                String str3 = split.length > 1 ? split[1] : null;
                if (str3 != null && str3.endsWith("\"") && str3.startsWith("\"")) {
                    str3 = f1d.d(1, 1, str3);
                }
                List list = (List) wgiVar.get(trim);
                if (list == null) {
                    list = wgiVar.g();
                    wgiVar.put(trim, list);
                }
                list.add(str3);
            }
        }
        List list2 = (List) wgiVar.get("charset");
        String str4 = (list2 == null || list2.size() == 0) ? null : (String) list2.get(0);
        if (str4 != null && Charset.isSupported(str4)) {
            str = str4;
        }
        om3 om3Var = new om3();
        pm3 pm3Var = new pm3(nr1Var);
        nr1Var.c(new rp7(om3Var));
        nr1Var.s(new xiu(10, pm3Var, om3Var));
        qkr qkrVar = new qkr(jmlVar, str);
        qkrVar.m(pm3Var);
        pm3Var.i(qkrVar);
        qkrVar.i(new pt0((Object) this, (Object) nr1Var, false));
        viqVar.l(qkrVar);
    }

    @Override // defpackage.tq3
    public boolean d() {
        try {
            SQLiteDatabase readableDatabase = ((kc7) this.c).getReadableDatabase();
            String str = (String) this.b;
            str.getClass();
            return v0u.a(readableDatabase, 1, str) != -1;
        } catch (SQLException e) {
            throw new pg5(e);
        }
    }

    @Override // defpackage.tq3
    public void delete() {
        kc7 kc7Var = (kc7) this.c;
        String str = (String) this.b;
        str.getClass();
        try {
            String concat = "ExoPlayerCacheIndex".concat(str);
            SQLiteDatabase writableDatabase = kc7Var.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                int i2 = v0u.a;
                try {
                    int i3 = dvt.a;
                    if (DatabaseUtils.queryNumEntries(writableDatabase, "sqlite_master", "tbl_name = ?", new String[]{"ExoPlayerVersions"}) > 0) {
                        writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                    }
                    writableDatabase.execSQL("DROP TABLE IF EXISTS ".concat(concat));
                    writableDatabase.setTransactionSuccessful();
                } catch (SQLException e) {
                    throw new pg5(e);
                }
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e2) {
            throw new pg5(e2);
        }
    }

    @Override // defpackage.tq3
    public void e(HashMap hashMap) {
        SparseArray sparseArray = (SparseArray) this.d;
        if (sparseArray.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = ((kc7) this.c).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                try {
                    sq3 sq3Var = (sq3) sparseArray.valueAt(i2);
                    if (sq3Var == null) {
                        int keyAt = sparseArray.keyAt(i2);
                        String str = (String) this.e;
                        str.getClass();
                        writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(keyAt)});
                    } else {
                        l(writableDatabase, sq3Var);
                    }
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            writableDatabase.setTransactionSuccessful();
            sparseArray.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new pg5(e);
        }
    }

    @Override // defpackage.tq3
    public void f(long j2) {
        String hexString = Long.toHexString(j2);
        this.b = hexString;
        this.e = f1d.g("ExoPlayerCacheIndex", hexString);
    }

    @Override // defpackage.tq3
    public void g(HashMap hashMap) {
        try {
            SQLiteDatabase writableDatabase = ((kc7) this.c).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                z(writableDatabase);
                Iterator it = hashMap.values().iterator();
                while (it.hasNext()) {
                    l(writableDatabase, (sq3) it.next());
                }
                writableDatabase.setTransactionSuccessful();
                ((SparseArray) this.d).clear();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLException e) {
            throw new pg5(e);
        }
    }

    @Override // defpackage.tq3
    public void h(sq3 sq3Var, boolean z) {
        SparseArray sparseArray = (SparseArray) this.d;
        int i2 = sq3Var.a;
        if (z) {
            sparseArray.delete(i2);
        } else {
            sparseArray.put(i2, null);
        }
    }

    @Override // defpackage.ukk
    public void i(List list) {
        PermissionRequest permissionRequest = (PermissionRequest) this.d;
        mmo mmoVar = ((fi4) ((sh4) this.b).b).u;
        mmo mmoVar2 = (mmo) this.c;
        if (mmoVar == mmoVar2) {
            o oVar = (o) mmoVar2.b;
            if (oVar.isAdded() && !oVar.isRemoving()) {
                Set A0 = list != null ? CollectionsKt.A0(list) : null;
                if (A0 == null) {
                    A0 = q5b.a;
                }
                for (String str : ((kcv) this.e).a) {
                    if (!A0.contains(str)) {
                        permissionRequest.deny();
                        return;
                    }
                }
                permissionRequest.grant(permissionRequest.getResources());
                return;
            }
        }
        permissionRequest.deny();
    }

    @Override // defpackage.tq3
    public void j(HashMap hashMap, SparseArray sparseArray) {
        kc7 kc7Var = (kc7) this.c;
        vq1.A(((SparseArray) this.d).size() == 0);
        try {
            SQLiteDatabase readableDatabase = kc7Var.getReadableDatabase();
            String str = (String) this.b;
            str.getClass();
            if (v0u.a(readableDatabase, 1, str) != 1) {
                SQLiteDatabase writableDatabase = kc7Var.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    z(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            SQLiteDatabase readableDatabase2 = kc7Var.getReadableDatabase();
            String str2 = (String) this.e;
            str2.getClass();
            Cursor query = readableDatabase2.query(str2, g, null, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    int i2 = query.getInt(0);
                    String string = query.getString(1);
                    string.getClass();
                    hashMap.put(string, new sq3(i2, string, rdk.e(new DataInputStream(new ByteArrayInputStream(query.getBlob(2))))));
                    sparseArray.put(i2, string);
                } finally {
                }
            }
            query.close();
        } catch (SQLiteException e) {
            hashMap.clear();
            sparseArray.clear();
            throw new pg5(e);
        }
    }

    public synchronized void k(daf dafVar, j8b j8bVar) {
        jh jhVar = (jh) ((HashMap) this.c).put(dafVar, new jh(dafVar, j8bVar, (ReferenceQueue) this.d));
        if (jhVar != null) {
            jhVar.c = null;
            jhVar.clear();
        }
    }

    public void l(SQLiteDatabase sQLiteDatabase, sq3 sq3Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        rdk.g(sq3Var.e, new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConnectableDevice.KEY_ID, Integer.valueOf(sq3Var.a));
        contentValues.put(PListParser.TAG_KEY, sq3Var.b);
        contentValues.put("metadata", byteArray);
        String str = (String) this.e;
        str.getClass();
        sQLiteDatabase.replaceOrThrow(str, null, contentValues);
    }

    public ArrayList m(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.b;
        C(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.c;
        C(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            mu2 mu2Var = (mu2) list.get(i2);
            if (!hashMap.containsKey(mu2Var.b) && !hashMap2.containsKey(Integer.valueOf(mu2Var.c))) {
                arrayList.add(mu2Var);
            }
        }
        return arrayList;
    }

    public synchronized kci n(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) this.b).iterator();
            boolean z = false;
            while (it.hasNext()) {
                mgi mgiVar = (mgi) it.next();
                if (((HashSet) this.d).contains(mgiVar)) {
                    z = true;
                } else if (mgiVar.a.isAssignableFrom(cls) && mgiVar.b.isAssignableFrom(cls2)) {
                    ((HashSet) this.d).add(mgiVar);
                    arrayList.add(mgiVar.c.y(this));
                    ((HashSet) this.d).remove(mgiVar);
                }
            }
            if (arrayList.size() > 1) {
                y9w y9wVar = (y9w) this.c;
                vx6 vx6Var = (vx6) this.e;
                y9wVar.getClass();
                return new fr1(2, arrayList, vx6Var);
            }
            if (arrayList.size() == 1) {
                return (kci) arrayList.get(0);
            }
            if (z) {
                return j;
            }
            throw new lsn("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            ((HashSet) this.d).clear();
            throw th;
        }
    }

    public synchronized ArrayList o(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = ((ArrayList) this.b).iterator();
            while (it.hasNext()) {
                mgi mgiVar = (mgi) it.next();
                if (!((HashSet) this.d).contains(mgiVar) && mgiVar.a.isAssignableFrom(cls)) {
                    ((HashSet) this.d).add(mgiVar);
                    arrayList.add(mgiVar.c.y(this));
                    ((HashSet) this.d).remove(mgiVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    @Override // defpackage.kzc
    public void onFailure(Throwable th) {
        ((xip) this.b).a(sgr.n.h(th).i("Authorization future failed"), new s2i());
    }

    @Override // defpackage.kzc
    public void onSuccess(Object obj) {
        sgr sgrVar = (sgr) obj;
        xip xipVar = (xip) this.b;
        if (!sgrVar.g()) {
            xipVar.a(sgrVar, new s2i());
            return;
        }
        akk akkVar = (akk) this.c;
        try {
            akkVar.b.set(((vip) this.e).b(xipVar, (s2i) this.d));
            akkVar.f();
        } catch (RuntimeException e) {
            xipVar.a(sgr.n.h(e).i("Failed to start server call after authorization check"), new s2i());
        }
    }

    public void p(X509Certificate[] x509CertificateArr) {
        int i2;
        if (x509CertificateArr == null || x509CertificateArr.length == 0) {
            throw new CertificateException("Empty certificate chain");
        }
        yfx yfxVar = (yfx) this.c;
        X509Certificate x509Certificate = x509CertificateArr[0];
        X509TrustManager x509TrustManager = (X509TrustManager) this.b;
        yfxVar.getClass();
        try {
            i2 = yfxVar.z(x509Certificate, x509CertificateArr, x509TrustManager);
        } catch (RuntimeException e) {
            ((osg) yfxVar.b).D("Unexpected exception while verifying certificate chain", e);
            i2 = 3;
        }
        if (i2 != 1) {
            throw new ea4(i2);
        }
    }

    public void q(jh jhVar) {
        k2o k2oVar;
        synchronized (this) {
            ((HashMap) this.c).remove(jhVar.a);
            if (jhVar.b && (k2oVar = jhVar.c) != null) {
                ((q7b) this.e).e(jhVar.a, new j8b(k2oVar, true, false, jhVar.a, (q7b) this.e));
            }
        }
    }

    @Override // defpackage.pm5
    public void r(Exception exc) {
        synchronized (((gt1) this.e)) {
            ((ay0) this.c).remove((ft1) this.d);
            ((gt1) this.e).h((String) this.b);
        }
    }

    @Override // defpackage.jzc
    public void s(Exception exc, Object obj) {
        InetAddress inetAddress = (InetAddress) obj;
        viq viqVar = (viq) this.c;
        m56 m56Var = (m56) this.b;
        if (exc == null) {
            viqVar.j(((ys1) this.e).a(new InetSocketAddress(inetAddress, ((InetSocketAddress) this.d).getPort()), m56Var));
        } else {
            m56Var.g(exc, null);
            viqVar.k(exc, null);
        }
    }

    public synchronized ArrayList t(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            mgi mgiVar = (mgi) it.next();
            if (!arrayList.contains(mgiVar.b) && mgiVar.a.isAssignableFrom(cls)) {
                arrayList.add(mgiVar.b);
            }
        }
        return arrayList;
    }

    public String toString() {
        switch (this.a) {
            case 27:
                return "Clients(clients=" + ((HashMap) this.c) + ", myClientId=" + ((String) this.b) + ", host=" + u() + ")";
            default:
                return super.toString();
        }
    }

    public un4 u() {
        if (((un4) this.d) == null) {
            Iterator it = ((HashMap) this.c).values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                un4 un4Var = (un4) it.next();
                if (un4Var.b) {
                    this.d = un4Var;
                    break;
                }
            }
        }
        return (un4) this.d;
    }

    public boolean w(Context context) {
        if (((Boolean) this.d) == null) {
            this.d = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.d).booleanValue();
    }

    public boolean x(Context context) {
        if (((Boolean) this.c) == null) {
            this.c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.c).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object y(boolean z, cg6 cg6Var) {
        hg1 hg1Var;
        int i2;
        xdr xdrVar;
        if (cg6Var instanceof hg1) {
            hg1Var = (hg1) cg6Var;
            int i3 = hg1Var.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hg1Var.m = i3 - Integer.MIN_VALUE;
                Object obj = hg1Var.k;
                nm6 nm6Var = nm6.a;
                i2 = hg1Var.m;
                if (i2 != 0) {
                    qgg.h0(obj);
                    v3w.n(z, (xdr) this.d, null);
                    xdrVar = (xdr) this.e;
                    f91 f91Var = (f91) this.b;
                    hg1Var.j = xdrVar;
                    hg1Var.m = 1;
                    obj = ((l91) f91Var).c(hg1Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xdrVar = hg1Var.j;
                    qgg.h0(obj);
                }
                xdrVar.l(obj);
                return Unit.a;
            }
        }
        hg1Var = new hg1(this, cg6Var);
        Object obj2 = hg1Var.k;
        nm6 nm6Var2 = nm6.a;
        i2 = hg1Var.m;
        if (i2 != 0) {
        }
        xdrVar.l(obj2);
        return Unit.a;
    }

    public void z(SQLiteDatabase sQLiteDatabase) {
        String str = (String) this.b;
        str.getClass();
        v0u.b(sQLiteDatabase, 1, str);
        String str2 = (String) this.e;
        str2.getClass();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
        sQLiteDatabase.execSQL("CREATE TABLE " + ((String) this.e) + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
    }

    public /* synthetic */ kkp(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.a = i2;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj;
    }

    public kkp(oxo oxoVar, vzp vzpVar) {
        this.a = 12;
        this.b = oxoVar;
        this.c = vzpVar;
        this.d = new LinkedHashMap();
        this.e = new ReentrantLock();
    }

    public kkp(f91 f91Var, gg1 gg1Var) {
        this.a = 15;
        f91Var.getClass();
        gg1Var.getClass();
        this.b = f91Var;
        this.c = gg1Var;
        Boolean bool = Boolean.FALSE;
        this.d = ydr.a(bool);
        this.e = ydr.a(bool);
    }

    public kkp(kxi kxiVar, y yVar, jyr jyrVar) {
        this.a = 6;
        kxiVar.getClass();
        yVar.getClass();
        this.b = kxiVar;
        this.c = yVar;
        this.d = new ve(muo.BIG_PLAYER, zqt.a);
        this.e = jyrVar;
    }

    public kkp(jy7 jy7Var, com.yandex.plus.bdui.o oVar) {
        this.a = 7;
        s2 s2Var = new s2(7);
        this.b = jy7Var;
        this.c = oVar;
        this.d = s2Var;
        this.e = new LinkedHashMap();
    }

    public kkp(c44 c44Var, fnb fnbVar) {
        this.a = 23;
        fnbVar.getClass();
        this.b = c44Var;
        this.c = fnbVar;
        this.d = btf.b(wg.e);
        this.e = btf.b(new v34(this, 0));
    }

    public kkp(Context context, wmn wmnVar) {
        this.a = 28;
        context.getClass();
        this.b = context;
        this.c = wmnVar;
        this.d = btf.b(new ym4(5));
        this.e = btf.b(new r93(19, this));
    }

    public kkp(t tVar, PlaybackScope playbackScope, kxi kxiVar) {
        this.a = 11;
        tVar.getClass();
        playbackScope.getClass();
        this.b = tVar;
        this.c = playbackScope;
        this.d = kxiVar;
        bdt I = hag.I(dy7.class);
        l18 l18Var = l18.b;
        this.e = l18Var.b(I, true);
        l18Var.b(hag.I(mvp.class), true);
    }

    public kkp(X509TrustManager x509TrustManager, osg osgVar) {
        Method method;
        this.a = 9;
        this.b = x509TrustManager;
        this.c = new yfx(osgVar, 11);
        Method method2 = null;
        try {
            method = x509TrustManager.getClass().getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class);
        } catch (NoSuchMethodException unused) {
            method = null;
        }
        this.d = method;
        try {
            method2 = x509TrustManager.getClass().getMethod("isSameTrustConfiguration", String.class, String.class);
        } catch (NoSuchMethodException unused2) {
        }
        this.e = method2;
    }

    public kkp(vx6 vx6Var) {
        this.a = 3;
        this.b = new ArrayList();
        this.d = new HashSet();
        this.e = vx6Var;
        this.c = i;
    }

    public kkp(c01 c01Var, ia0 ia0Var, qe3 qe3Var, sai saiVar) {
        this.a = 14;
        c01Var.getClass();
        this.b = c01Var;
        this.c = ia0Var;
        this.d = qe3Var;
        this.e = saiVar;
    }

    public kkp(oq oqVar, br brVar, qe3 qe3Var, sai saiVar) {
        this.a = 10;
        oqVar.getClass();
        this.b = oqVar;
        this.c = brVar;
        this.d = qe3Var;
        this.e = saiVar;
    }

    public kkp(ls4 ls4Var, String str, n7w n7wVar, Uri uri) {
        this.a = 29;
        this.c = ls4Var;
        this.b = str;
        this.d = n7wVar;
        this.e = uri;
    }

    public kkp(Context context, ljf ljfVar, s63 s63Var) {
        this.a = 24;
        context.getClass();
        this.b = context;
        this.c = ljfVar;
        this.d = ((ag4) s63Var.a).a;
        this.e = l18.b.b(hag.I(pf4.class), true);
    }

    public kkp(nnk nnkVar, a8h a8hVar) {
        this.a = 19;
        this.e = nnkVar;
        this.b = a8hVar;
        eeg eegVar = (eeg) nnkVar.a;
        String str = (String) nnkVar.b;
        deg b = eegVar.b(str);
        this.d = b;
        if (b != null) {
            this.c = b.b(a8hVar);
        } else {
            xq0.q(hrg.q("Could not find policy '", str, "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files."));
            throw null;
        }
    }

    public /* synthetic */ kkp(int i2, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public kkp(ArrayList arrayList, List list) {
        this.a = 4;
        this.b = list;
        this.d = new SparseBooleanArray();
        this.c = new xy0(0);
        int size = list.size();
        int i2 = Integer.MIN_VALUE;
        b5k b5kVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            b5k b5kVar2 = (b5k) list.get(i3);
            int i4 = b5kVar2.e;
            if (i4 > i2) {
                b5kVar = b5kVar2;
                i2 = i4;
            }
        }
        this.e = b5kVar;
    }

    public kkp(gt1 gt1Var, ay0 ay0Var, ft1 ft1Var, String str) {
        this.a = 18;
        this.e = gt1Var;
        this.c = ay0Var;
        this.d = ft1Var;
        this.b = str;
    }

    public kkp(kc7 kc7Var) {
        this.a = 1;
        this.c = kc7Var;
        this.d = new SparseArray();
    }
}
