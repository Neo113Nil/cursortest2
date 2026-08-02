package defpackage;

import android.database.Cursor;
import com.yandex.music.databases.main.MainDatabase;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class tdh {
    public final String a;
    public final String b;
    public final Set c;
    public final AtomicReference d;
    public final AtomicInteger e;

    public tdh(String str, String str2, Set set) {
        set.getClass();
        this.a = str;
        this.b = str2;
        this.c = set;
        this.d = new AtomicReference(Boolean.FALSE);
        this.e = new AtomicInteger();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(MainDatabase mainDatabase, cg6 cg6Var) {
        sdh sdhVar;
        int i;
        AtomicReference atomicReference;
        Integer num;
        int i2;
        Boolean valueOf;
        Boolean bool;
        if (cg6Var instanceof sdh) {
            sdhVar = (sdh) cg6Var;
            int i3 = sdhVar.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sdhVar.n = i3 - Integer.MIN_VALUE;
                Object obj = sdhVar.l;
                nm6 nm6Var = nm6.a;
                i = sdhVar.n;
                atomicReference = this.d;
                if (i != 0) {
                    qgg.h0(obj);
                    if (Intrinsics.d(atomicReference.get(), Boolean.FALSE)) {
                        return Unit.a;
                    }
                    Integer num2 = new Integer(this.e.getAndIncrement());
                    try {
                        jw jwVar = new jw(mainDatabase, null, this, num2);
                        sdhVar.j = num2;
                        sdhVar.k = 1;
                        sdhVar.n = 1;
                        if (tyf.N(mainDatabase, jwVar, sdhVar) == nm6Var) {
                            return nm6Var;
                        }
                        num = num2;
                    } catch (Throwable th) {
                        th = th;
                        num = num2;
                        i2 = 1;
                        valueOf = Boolean.valueOf(i2 != 0);
                        while (!atomicReference.compareAndSet(num, valueOf) && atomicReference.get() == num) {
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = sdhVar.k;
                    num = sdhVar.j;
                    try {
                        qgg.h0(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        valueOf = Boolean.valueOf(i2 != 0);
                        while (!atomicReference.compareAndSet(num, valueOf)) {
                        }
                        throw th;
                    }
                }
                bool = Boolean.FALSE;
                while (!atomicReference.compareAndSet(num, bool) && atomicReference.get() == num) {
                }
                return Unit.a;
            }
        }
        sdhVar = new sdh(this, cg6Var);
        Object obj2 = sdhVar.l;
        nm6 nm6Var2 = nm6.a;
        i = sdhVar.n;
        atomicReference = this.d;
        if (i != 0) {
        }
        bool = Boolean.FALSE;
        while (!atomicReference.compareAndSet(num, bool)) {
        }
        return Unit.a;
    }

    public final void b(rsr rsrVar) {
        rsrVar.getClass();
        String str = this.a;
        rsrVar.execSQL("DELETE FROM ".concat(str));
        n8g b = t75.b();
        Cursor query = rsrVar.query("pragma table_info(" + str + ")");
        try {
            Cursor cursor = query;
            while (cursor.moveToNext()) {
                b.add(cursor.getString(cursor.getColumnIndexOrThrow("name")));
            }
            yd5.q(query, null);
            StringBuilder m = f1d.m("INSERT INTO ", str, " SELECT ", CollectionsKt.X(t75.a(b), null, null, null, null, 63), " FROM (");
            m.append(this.b);
            m.append(")");
            rsrVar.execSQL(m.toString());
        } finally {
        }
    }
}
