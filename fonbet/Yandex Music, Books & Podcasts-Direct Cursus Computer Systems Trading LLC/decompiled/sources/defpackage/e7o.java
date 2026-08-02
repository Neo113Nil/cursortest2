package defpackage;

import android.content.Context;
import android.content.pm.ShortcutManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.impl.InterfaceC0108a7;
import io.appmetrica.analytics.impl.S2;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final /* synthetic */ class e7o implements c9a, InterfaceC0108a7, zjo, ua6, fuo, ag6, myc, z1s, jcs {
    public final /* synthetic */ int a;

    public /* synthetic */ e7o(jac jacVar) {
        this.a = 11;
    }

    public static /* bridge */ /* synthetic */ ShortcutManager b(Object obj) {
        return (ShortcutManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class d() {
        return ShortcutManager.class;
    }

    public static /* synthetic */ void e() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void f(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void h(Object obj, Object obj2, String str) {
        throw new wp3(str + obj + obj2);
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void j(String str) {
        throw new nmo(str);
    }

    public static /* synthetic */ void k(String str, float f, Object obj, float f2, Object obj2) {
        throw new IllegalArgumentException(str + f + obj + f2 + obj2);
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void m(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void n() {
        throw new IllegalStateException();
    }

    public static /* synthetic */ void o(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    @Override // defpackage.fuo
    public kqt a(Context context, ypt yptVar) {
        yptVar.getClass();
        return new kqt(yptVar);
    }

    @Override // defpackage.ua6
    public void accept(Object obj) {
        ((xno) obj).b.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fe  */
    @Override // defpackage.zjo, defpackage.myc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        boolean z;
        lj ljVar;
        jj[] jjVarArr;
        int i;
        onh[] onhVarArr;
        onh[] onhVarArr2;
        switch (this.a) {
            case 5:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    Cursor cursor = rawQuery;
                    ArrayList arrayList = new ArrayList();
                    while (cursor.moveToNext()) {
                        nsh a = de2.a();
                        a.L(cursor.getString(1));
                        a.d = qsm.b(cursor.getInt(2));
                        String string = cursor.getString(3);
                        a.c = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(a.c());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
            case 17:
                return yde.y(Integer.valueOf(((wk4) obj).a));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                Bundle bundle = (Bundle) obj;
                Bundle bundle2 = bundle.getBundle(ris.t);
                onh b = bundle2 != null ? onh.b(bundle2) : onh.g;
                long j = bundle.getLong(ris.u, -9223372036854775807L);
                long j2 = bundle.getLong(ris.v, -9223372036854775807L);
                long j3 = bundle.getLong(ris.w, -9223372036854775807L);
                boolean z2 = bundle.getBoolean(ris.x, false);
                boolean z3 = bundle.getBoolean(ris.y, false);
                Bundle bundle3 = bundle.getBundle(ris.z);
                fnh b2 = bundle3 != null ? fnh.b(bundle3) : null;
                boolean z4 = bundle.getBoolean(ris.A, false);
                long j4 = bundle.getLong(ris.B, 0L);
                long j5 = bundle.getLong(ris.C, -9223372036854775807L);
                int i2 = bundle.getInt(ris.D, 0);
                int i3 = bundle.getInt(ris.E, 0);
                long j6 = bundle.getLong(ris.F, 0L);
                ris risVar = new ris();
                risVar.b(ris.r, b, null, j, j2, j3, z2, z3, b2, j4, j5, i2, i3, j6);
                risVar.k = z4;
                return risVar;
            default:
                Bundle bundle4 = (Bundle) obj;
                int i4 = bundle4.getInt(ois.h, 0);
                long j7 = bundle4.getLong(ois.i, -9223372036854775807L);
                long j8 = bundle4.getLong(ois.j, 0L);
                boolean z5 = bundle4.getBoolean(ois.k, false);
                Bundle bundle5 = bundle4.getBundle(ois.l);
                if (bundle5 != null) {
                    ArrayList parcelableArrayList = bundle5.getParcelableArrayList(lj.h);
                    if (parcelableArrayList == null) {
                        jjVarArr = new jj[0];
                    } else {
                        jj[] jjVarArr2 = new jj[parcelableArrayList.size()];
                        int i5 = 0;
                        while (i5 < parcelableArrayList.size()) {
                            Bundle bundle6 = (Bundle) parcelableArrayList.get(i5);
                            long j9 = bundle6.getLong(jj.l);
                            int i6 = bundle6.getInt(jj.m);
                            int i7 = bundle6.getInt(jj.s);
                            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(jj.n);
                            ArrayList parcelableArrayList3 = bundle6.getParcelableArrayList(jj.t);
                            int[] intArray = bundle6.getIntArray(jj.o);
                            long[] longArray = bundle6.getLongArray(jj.p);
                            long j10 = bundle6.getLong(jj.q);
                            boolean z6 = bundle6.getBoolean(jj.r);
                            ArrayList<String> stringArrayList = bundle6.getStringArrayList(jj.u);
                            boolean z7 = z5;
                            boolean z8 = bundle6.getBoolean(jj.v);
                            if (intArray == null) {
                                intArray = new int[0];
                            }
                            int[] iArr = intArray;
                            if (parcelableArrayList3 != null) {
                                onhVarArr2 = new onh[parcelableArrayList3.size()];
                                for (int i8 = 0; i8 < parcelableArrayList3.size(); i8++) {
                                    Bundle bundle7 = (Bundle) parcelableArrayList3.get(i8);
                                    onhVarArr2[i8] = bundle7 == null ? null : onh.b(bundle7);
                                }
                            } else if (parcelableArrayList2 != null) {
                                onhVarArr2 = new onh[parcelableArrayList2.size()];
                                for (int i9 = 0; i9 < parcelableArrayList2.size(); i9++) {
                                    Uri uri = (Uri) parcelableArrayList2.get(i9);
                                    onhVarArr2[i9] = uri == null ? null : onh.c(uri);
                                }
                            } else {
                                i = 0;
                                onhVarArr = new onh[0];
                                if (longArray == null) {
                                    longArray = new long[i];
                                }
                                jjVarArr2[i5] = new jj(j9, i6, i7, iArr, onhVarArr, longArray, j10, z6, stringArrayList != null ? new String[i] : (String[]) stringArrayList.toArray(new String[i]), z8);
                                i5++;
                                z5 = z7;
                            }
                            onhVarArr = onhVarArr2;
                            i = 0;
                            if (longArray == null) {
                            }
                            jjVarArr2[i5] = new jj(j9, i6, i7, iArr, onhVarArr, longArray, j10, z6, stringArrayList != null ? new String[i] : (String[]) stringArrayList.toArray(new String[i]), z8);
                            i5++;
                            z5 = z7;
                        }
                        jjVarArr = jjVarArr2;
                    }
                    z = z5;
                    ljVar = new lj(jjVarArr, bundle5.getLong(lj.i, 0L), bundle5.getLong(lj.j, -9223372036854775807L), bundle5.getInt(lj.k, 0));
                } else {
                    z = z5;
                    ljVar = lj.f;
                }
                ois oisVar = new ois();
                oisVar.j(null, null, i4, j7, j8, ljVar, z);
                return oisVar;
        }
    }

    @Override // defpackage.c9a
    public double c(double d) {
        return d;
    }

    @Override // defpackage.z1s
    public int g() {
        int i = b2s.v;
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.ag6
    public Object p(Task task) {
        boolean z;
        if (task.l()) {
            rb2 rb2Var = (rb2) task.h();
            mvt mvtVar = mvt.h;
            mvtVar.v("Crashlytics report successfully enqueued to DataTransport: " + rb2Var.b);
            File file = rb2Var.c;
            z = true;
            if (file.delete()) {
                mvtVar.v("Deleted report file: " + file.getPath());
            } else {
                mvtVar.I("Crashlytics could not delete report file: " + file.getPath(), null);
            }
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.g());
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public /* synthetic */ e7o(int i) {
        this.a = i;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0108a7
    public boolean a(Throwable th) {
        return S2.a(th);
    }
}
