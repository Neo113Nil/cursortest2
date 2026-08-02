package defpackage;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.webkit.SslErrorHandler;
import com.yandex.plus.log.api.a;
import com.yandex.plus.log.api.b;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.utils.Preconditions;

/* loaded from: classes6.dex */
public final class le3 implements ke3, pm5, r2o, cb7, zfv, x7o, kip, b4b, ozk {
    public static final String[] c = {"name", "length", "last_touch_timestamp"};
    public Object a;
    public Object b;

    public le3(int i) {
        switch (i) {
            case 4:
                this.a = l18.b.b(hag.I(e0j.class), true);
                this.b = new s2(17);
                break;
            case 26:
                this.a = btf.b(new bv7(26));
                this.b = l18.b.b(hag.I(o8q.class), true);
                break;
            default:
                this.a = new LinkedHashSet();
                this.b = new LinkedHashMap();
                break;
        }
    }

    @Override // defpackage.m6b
    public boolean A(Object obj, File file, pwj pwjVar) {
        return ((a33) this.b).A(new s33((r33) this.a, ((BitmapDrawable) ((k2o) obj).get()).getBitmap()), file, pwjVar);
    }

    @Override // defpackage.cb7
    public Object C(Object obj, wa7 wa7Var) {
        return Boolean.valueOf(obj != null);
    }

    @Override // defpackage.ozk
    public boolean H() {
        return ((n6c) this.b).a;
    }

    @Override // defpackage.ke3
    public rf3 J() {
        kii kiiVar = (kii) this.a;
        if (kiiVar != null) {
            return ((kii) Preconditions.nonNull(kiiVar)).getSelectedTab();
        }
        dfi.r("selectedTab(): no tabs", "BottomNavigationPluginImpl");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.cb7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object M(cg6 cg6Var) {
        za7 za7Var;
        Object obj;
        int i;
        le3 le3Var;
        if (cg6Var instanceof za7) {
            za7Var = (za7) cg6Var;
            int i2 = za7Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                za7Var.m = i2 - Integer.MIN_VALUE;
                obj = za7Var.k;
                nm6 nm6Var = nm6.a;
                i = za7Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    cb7 cb7Var = (cb7) this.a;
                    za7Var.j = this;
                    za7Var.m = 1;
                    obj = cb7Var.M(za7Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    le3Var = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    le3Var = za7Var.j;
                    qgg.h0(obj);
                }
                if (obj == null) {
                    return ((ybg) le3Var.b).invoke(obj);
                }
                return null;
            }
        }
        za7Var = new za7(this, cg6Var);
        obj = za7Var.k;
        nm6 nm6Var2 = nm6.a;
        i = za7Var.m;
        if (i != 0) {
        }
        if (obj == null) {
        }
    }

    @Override // defpackage.cb7
    public Object N(Object obj, cg6 cg6Var) {
        return Unit.a;
    }

    @Override // defpackage.ozk
    public boolean P() {
        return ((d1) this.a).b.F;
    }

    @Override // defpackage.cb7
    public ya7 S(qec qecVar) {
        return new ya7(this, qecVar);
    }

    @Override // defpackage.b4b
    public boolean a(CharSequence charSequence, int i, int i2, jdt jdtVar) {
        if ((jdtVar.c & 4) > 0) {
            return true;
        }
        if (((flt) this.a) == null) {
            this.a = new flt(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((wvo) this.b).getClass();
        ((flt) this.a).setSpan(new kdt(jdtVar), i, i2, 33);
        return true;
    }

    @Override // defpackage.ke3
    public void b(rf3 rf3Var) {
        rf3Var.getClass();
        kii kiiVar = (kii) this.a;
        if (kiiVar == null) {
            dfi.r("selectTabSilently(): no tabs", "BottomNavigationPluginImpl");
            return;
        }
        Object nonNull = Preconditions.nonNull(kiiVar);
        nonNull.getClass();
        ((kii) nonNull).t(rf3Var, false);
    }

    public void c(PrintWriter printWriter) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        LinkedHashSet<pdv> linkedHashSet = (LinkedHashSet) this.a;
        printWriter.getClass();
        try {
            for (pdv pdvVar : linkedHashSet) {
                String str = (String) linkedHashMap.get(pdvVar.a);
                if (str != null) {
                    printWriter.print("WebView HTML for ");
                    printWriter.print(pdvVar);
                    printWriter.println(StringUtils.PROCESS_POSTFIX_DELIMITER);
                    printWriter.println(cuk.w(pdvVar, str));
                }
            }
        } catch (Exception unused) {
        }
        linkedHashSet.clear();
        linkedHashMap.clear();
    }

    public HashMap d() {
        try {
            ((String) this.b).getClass();
            Cursor query = ((kc7) this.a).getReadableDatabase().query((String) this.b, c, null, null, null, null, null);
            try {
                HashMap hashMap = new HashMap(query.getCount());
                while (query.moveToNext()) {
                    String string = query.getString(0);
                    string.getClass();
                    hashMap.put(string, new sp3(query.getLong(1), query.getLong(2)));
                }
                query.close();
                return hashMap;
            } finally {
            }
        } catch (SQLException e) {
            throw new pg5(e);
        }
    }

    @Override // defpackage.zfv
    public void e() {
        boolean z = ((mi7) this.b).b;
        SslErrorHandler sslErrorHandler = (SslErrorHandler) this.a;
        if (z) {
            sslErrorHandler.proceed();
        } else {
            sslErrorHandler.cancel();
        }
    }

    public void f(long j) {
        kc7 kc7Var = (kc7) this.a;
        try {
            String hexString = Long.toHexString(j);
            this.b = "ExoPlayerCacheFileMetadata" + hexString;
            if (v0u.a(kc7Var.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = kc7Var.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    v0u.b(writableDatabase, 2, hexString);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + ((String) this.b));
                    writableDatabase.execSQL("CREATE TABLE " + ((String) this.b) + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e) {
            throw new pg5(e);
        }
    }

    @Override // defpackage.kip
    public t9f g(String str) {
        arf arfVar = (arf) ((LinkedHashMap) this.b).get(str);
        t9f t9fVar = arfVar != null ? (t9f) arfVar.getValue() : null;
        b bVar = (b) this.a;
        if (t9fVar != null) {
            a aVar = a.c;
            if (bVar.b(aVar)) {
                bVar.c(aVar, "DescriptorContentSerializerSelector", "Serializer found for content type = ".concat(str));
                return t9fVar;
            }
        } else {
            a aVar2 = a.d;
            if (bVar.b(aVar2)) {
                bVar.c(aVar2, "DescriptorContentSerializerSelector", ouj.k('!', "Serializer not found for content type = ", str));
            }
        }
        return t9fVar;
    }

    @Override // defpackage.arr
    public Object get() {
        return new mzk(Boolean.valueOf(((n6c) this.b).a));
    }

    @Override // defpackage.b4b
    public Object getResult() {
        return (flt) this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(cg6 cg6Var) {
        yx5 yx5Var;
        int i;
        rx5 rx5Var;
        Long l;
        rj6 rj6Var;
        Object obj;
        ArrayList g0;
        if (cg6Var instanceof yx5) {
            yx5Var = (yx5) cg6Var;
            int i2 = yx5Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yx5Var.n = i2 - Integer.MIN_VALUE;
                Object obj2 = yx5Var.l;
                nm6 nm6Var = nm6.a;
                i = yx5Var.n;
                ?? r4 = 0;
                if (i != 0) {
                    qgg.h0(obj2);
                    rx5 rx5Var2 = (rx5) ((rw5) this.a).f.getValue();
                    ox5 ox5Var = rx5Var2 instanceof ox5 ? (ox5) rx5Var2 : null;
                    Long l2 = ox5Var != null ? new Long(ox5Var.a.a) : null;
                    vw5 vw5Var = (vw5) this.b;
                    yx5Var.j = rx5Var2;
                    yx5Var.k = l2;
                    yx5Var.n = 1;
                    vw5Var.getClass();
                    Object V = x97.V(dm6.b, new ja4(vw5Var, r4, 12), yx5Var);
                    if (V == nm6Var) {
                        return nm6Var;
                    }
                    rx5Var = rx5Var2;
                    obj2 = V;
                    l = l2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    l = yx5Var.k;
                    rx5Var = yx5Var.j;
                    qgg.h0(obj2);
                }
                rj6Var = (rj6) obj2;
                if (!(rj6Var instanceof qj6)) {
                    Object obj3 = ((qj6) rj6Var).a;
                    if (((List) obj3).isEmpty()) {
                        obj3 = null;
                    }
                    List list = (List) obj3;
                    if (list != null) {
                        List<ov5> list2 = list;
                        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                        for (ov5 ov5Var : list2) {
                            arrayList.add(new ov5(ov5Var.a, ov5Var.b));
                        }
                        if (l != null) {
                            Iterator it = arrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it.next();
                                if (((ov5) obj).a == l.longValue()) {
                                    break;
                                }
                            }
                            ov5 ov5Var2 = (ov5) obj;
                            if (ov5Var2 != null) {
                                List c2 = t75.c(ov5Var2);
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    Object next = it2.next();
                                    if (((ov5) next).a != l.longValue()) {
                                        arrayList2.add(next);
                                    }
                                }
                                g0 = CollectionsKt.g0(c2, arrayList2);
                            } else {
                                ox5 ox5Var2 = rx5Var instanceof ox5 ? (ox5) rx5Var : null;
                                if (ox5Var2 != null) {
                                    g0 = CollectionsKt.g0(t75.c(ox5Var2.a), arrayList);
                                }
                            }
                            r4 = g0;
                        }
                        r4 = arrayList;
                    }
                    if (r4 != 0) {
                        return new ifg(r4);
                    }
                } else if (!(rj6Var instanceof pj6)) {
                    b6e.s();
                    return null;
                }
                return gfg.a;
            }
        }
        yx5Var = new yx5(this, cg6Var);
        Object obj22 = yx5Var.l;
        nm6 nm6Var2 = nm6.a;
        i = yx5Var.n;
        ?? r42 = 0;
        if (i != 0) {
        }
        rj6Var = (rj6) obj22;
        if (!(rj6Var instanceof qj6)) {
        }
        return gfg.a;
    }

    public void i(Exception exc, rn5 rn5Var) {
        String str = (String) this.a;
        gw0 gw0Var = (gw0) this.b;
        if (rn5Var == null) {
            gw0Var.i(str, veb.a(r5.a, new zeb("ERROR_CONNECT_FAILED").a(), "Connect failed"));
            return;
        }
        gw0Var.j = rn5Var;
        if (exc != null) {
            gw0Var.i(str, veb.b(exc));
            return;
        }
        rn5Var.d(new znk(12, this));
        int i = 14;
        rn5Var.g = new ozw(i, this);
        rn5Var.h = new efo(i, this);
    }

    public void j(fqc fqcVar) {
        ks1 ks1Var = (ks1) this.b;
        gao gaoVar = (gao) this.a;
        int i = fqcVar.b;
        if (i != 0) {
            ks1Var.execute(new zs3(gaoVar, i, 0));
        } else {
            ks1Var.execute(new x8x(13, gaoVar, fqcVar.a));
        }
    }

    public void k(Set set) {
        ((String) this.b).getClass();
        try {
            SQLiteDatabase writableDatabase = ((kc7) this.a).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete((String) this.b, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLException e) {
            throw new pg5(e);
        }
    }

    public Object l(Function0 function0) {
        if (Intrinsics.d(Looper.myLooper(), (Looper) this.a)) {
            return function0.invoke();
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        ((Handler) this.b).post(new r8(atomicReference, function0, atomicReference2, countDownLatch));
        countDownLatch.await();
        Throwable th = (Throwable) atomicReference2.get();
        if (th == null) {
            return atomicReference.get();
        }
        RuntimeException runtimeException = new RuntimeException("Exception in runOnProperThread");
        StackTraceElement[] stackTrace = th.getStackTrace();
        stackTrace.getClass();
        int i = -1;
        int length = stackTrace.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                String className = stackTrace[length].getClassName();
                className.getClass();
                if (StringsKt.M(className, "ExoPlayerProperThreadRunner", false)) {
                    i = length;
                    break;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        if (i < 0) {
            throw th;
        }
        int length2 = runtimeException.getStackTrace().length + i + 1;
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            stackTraceElementArr[i3] = null;
        }
        int i4 = i + 1;
        System.arraycopy(th.getStackTrace(), 0, stackTraceElementArr, 0, i4);
        System.arraycopy(runtimeException.getStackTrace(), 0, stackTraceElementArr, i4, runtimeException.getStackTrace().length);
        th.setStackTrace(stackTraceElementArr);
        throw th;
    }

    public void m(long j, long j2, String str) {
        ((String) this.b).getClass();
        try {
            SQLiteDatabase writableDatabase = ((kc7) this.a).getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow((String) this.b, null, contentValues);
        } catch (SQLException e) {
            throw new pg5(e);
        }
    }

    public void n(long j) {
        for (zno znoVar : (zno[]) this.b) {
            if (znoVar.F != j) {
                znoVar.F = j;
                znoVar.z = true;
            }
        }
    }

    public azs o(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = (int[]) this.a;
            if (i2 >= iArr.length) {
                vq1.K("BaseMediaChunkOutput", "Unmatched track of type: " + i);
                return new z48();
            }
            if (i == iArr[i2]) {
                return ((zno[]) this.b)[i2];
            }
            i2++;
        }
    }

    @Override // defpackage.x7o
    public void onSuccess(Object obj) {
        ggk ggkVar = (ggk) obj;
        ggkVar.getClass();
        hek.f((hek) this.b, null);
        ((x7o) this.a).onSuccess(new zm(ggkVar));
    }

    @Override // defpackage.ke3
    public void p(boolean z) {
        kii kiiVar = (kii) this.a;
        if (kiiVar != null) {
            kiiVar.setDarkTheme(z);
        }
    }

    @Override // defpackage.pm5
    public void r(Exception exc) {
        dt1 dt1Var = (dt1) this.a;
        if (exc != null) {
            ((m56) ((ps1) this.b).c).g(exc, dt1Var);
            return;
        }
        jtc jtcVar = new jtc(8);
        jtcVar.b = new xiu(this);
        dt1Var.c(jtcVar);
        dt1Var.s(new xzi(this));
    }

    @Override // defpackage.ke3
    public void u(boolean z) {
        v3w.n(z, ((kii) Preconditions.nonNull((kii) this.a)).m, null);
    }

    @Override // defpackage.r2o
    public int w(pwj pwjVar) {
        return 2;
    }

    @Override // defpackage.x7o
    public void x(Object obj) {
        bfk bfkVar = (bfk) obj;
        bfkVar.getClass();
        hek.f((hek) this.b, null);
        ((x7o) this.a).x(bfkVar);
    }

    @Override // defpackage.ke3
    public void y(Intent... intentArr) {
        rf3 J;
        if (((kii) this.a) == null || (J = J()) == null) {
            return;
        }
        dyd.b(J, (Intent[]) Arrays.copyOf(intentArr, intentArr.length));
    }

    @Override // defpackage.zfv
    public void z() {
        ((SslErrorHandler) this.a).proceed();
    }

    public /* synthetic */ le3(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }
}
