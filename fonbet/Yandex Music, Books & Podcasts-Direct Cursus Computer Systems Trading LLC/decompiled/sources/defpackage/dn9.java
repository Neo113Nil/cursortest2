package defpackage;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.View;
import com.yandex.passport.sloth.ui.dependencies.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.c;
import ru.yandex.music.common.media.context.e;
import ru.yandex.video.m3.list_player_manager.impl.telemetry.a;

/* loaded from: classes3.dex */
public class dn9 implements rct, v5k, adu {
    public static final dl4 g = new dl4(13);
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public dn9(mn0 mn0Var, ges gesVar, List list, jx7 jx7Var, ppc ppcVar) {
        int i;
        String str;
        List list2;
        mn0 mn0Var2 = mn0Var;
        ges gesVar2 = gesVar;
        this.a = 20;
        this.b = mn0Var2;
        this.c = list;
        bwf bwfVar = bwf.c;
        this.d = btf.a(bwfVar, new pgi(this, 1));
        int i2 = 0;
        this.e = btf.a(bwfVar, new pgi(this, i2));
        x5k x5kVar = gesVar2.b;
        mn0 mn0Var3 = nn0.a;
        ArrayList arrayList = mn0Var2.d;
        String str2 = mn0Var2.b;
        List list3 = (arrayList == null || (list3 = CollectionsKt.o0(arrayList, new C1318t(21))) == null) ? c5b.a : list3;
        ArrayList arrayList2 = new ArrayList();
        zx0 zx0Var = new zx0();
        int size = list3.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            ln0 ln0Var = (ln0) list3.get(i3);
            ln0 a = ln0.a(ln0Var, x5kVar.a((x5k) ln0Var.a), i2, 14);
            Object obj = a.a;
            int i5 = a.c;
            int i6 = a.b;
            while (i4 < i6 && !zx0Var.isEmpty()) {
                ln0 ln0Var2 = (ln0) zx0Var.last();
                int i7 = ln0Var2.c;
                List list4 = list3;
                Object obj2 = ln0Var2.a;
                if (i6 < i7) {
                    arrayList2.add(new ln0(obj2, i4, i6));
                    i4 = i6;
                    list3 = list4;
                } else {
                    int i8 = size;
                    arrayList2.add(new ln0(obj2, i4, i7));
                    i4 = ln0Var2.c;
                    while (!zx0Var.isEmpty() && i4 == ((ln0) zx0Var.last()).c) {
                        zx0Var.removeLast();
                    }
                    list3 = list4;
                    size = i8;
                }
            }
            List list5 = list3;
            int i9 = size;
            if (i4 < i6) {
                arrayList2.add(new ln0(x5kVar, i4, i6));
                i4 = i6;
            }
            ln0 ln0Var3 = (ln0) zx0Var.r();
            if (ln0Var3 != null) {
                int i10 = ln0Var3.c;
                Object obj3 = ln0Var3.a;
                int i11 = ln0Var3.b;
                if (i11 == i6 && i10 == i5) {
                    zx0Var.removeLast();
                    zx0Var.addLast(new ln0(((x5k) obj3).a((x5k) obj), i6, i5));
                } else if (i11 == i10) {
                    arrayList2.add(new ln0(obj3, i11, i10));
                    zx0Var.removeLast();
                    zx0Var.addLast(new ln0(obj, i6, i5));
                } else {
                    if (i10 < i5) {
                        e7o.e();
                        throw null;
                    }
                    zx0Var.addLast(new ln0(((x5k) obj3).a((x5k) obj), i6, i5));
                }
            } else {
                zx0Var.addLast(new ln0(obj, i6, i5));
            }
            i3++;
            list3 = list5;
            size = i9;
            i2 = 0;
        }
        while (i4 <= str2.length() && !zx0Var.isEmpty()) {
            ln0 ln0Var4 = (ln0) zx0Var.last();
            Object obj4 = ln0Var4.a;
            int i12 = ln0Var4.c;
            arrayList2.add(new ln0(obj4, i4, i12));
            while (!zx0Var.isEmpty() && i12 == ((ln0) zx0Var.last()).c) {
                zx0Var.removeLast();
            }
            i4 = i12;
        }
        if (i4 < str2.length()) {
            arrayList2.add(new ln0(x5kVar, i4, str2.length()));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
            arrayList2.add(new ln0(x5kVar, 0, 0));
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i13 = i;
        while (i13 < size2) {
            ln0 ln0Var5 = (ln0) arrayList2.get(i13);
            int i14 = ln0Var5.b;
            int i15 = ln0Var5.c;
            String substring = i14 != i15 ? str2.substring(i14, i15) : "";
            List b = nn0.b(mn0Var2, i14, i15, d5.y0);
            mn0 mn0Var4 = new mn0(substring, b == null ? c5b.a : b);
            x5k x5kVar2 = (x5k) ln0Var5.a;
            if (x5kVar2.b == Integer.MIN_VALUE) {
                str = str2;
                x5kVar2 = new x5k(x5kVar2.a, x5kVar.b, x5kVar2.c, x5kVar2.d, x5kVar2.e, x5kVar2.f, x5kVar2.g, x5kVar2.h, x5kVar2.i);
            } else {
                str = str2;
            }
            ges gesVar3 = new ges(gesVar2.a, gesVar2.b.a(x5kVar2));
            List list6 = mn0Var4.a;
            List list7 = list6 == null ? c5b.a : list6;
            List list8 = (List) this.c;
            ArrayList arrayList4 = new ArrayList(list8.size());
            int size3 = list8.size();
            int i16 = 0;
            while (i16 < size3) {
                ln0 ln0Var6 = (ln0) list8.get(i16);
                x5k x5kVar3 = x5kVar;
                int i17 = ln0Var6.b;
                ges gesVar4 = gesVar3;
                int i18 = ln0Var6.c;
                if (nn0.c(i14, i15, i17, i18)) {
                    if (i14 > i17 || i18 > i15) {
                        tme.a("placeholder can not overlap with paragraph.");
                    }
                    list2 = list8;
                    arrayList4.add(new ln0(ln0Var6.a, i17 - i14, i18 - i14));
                } else {
                    list2 = list8;
                }
                i16++;
                list8 = list2;
                gesVar3 = gesVar4;
                x5kVar = x5kVar3;
            }
            arrayList3.add(new u5k(new mh0(substring, gesVar3, list7, arrayList4, ppcVar, jx7Var), i14, i15));
            i13++;
            mn0Var2 = mn0Var;
            gesVar2 = gesVar;
            str2 = str;
        }
        this.f = arrayList3;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(dn9 dn9Var, cg6 cg6Var) {
        f8c f8cVar;
        int i;
        dn9Var.getClass();
        if (cg6Var instanceof f8c) {
            f8cVar = (f8c) cg6Var;
            int i2 = f8cVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f8cVar.l = i2 - Integer.MIN_VALUE;
                Object obj = f8cVar.j;
                nm6 nm6Var = nm6.a;
                i = f8cVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    CoroutineContext coroutineContext = (CoroutineContext) dn9Var.f;
                    ox1 ox1Var = new ox1(dn9Var, null, 15);
                    f8cVar.l = 1;
                    obj = x97.V(coroutineContext, ox1Var, f8cVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                JSONObject jSONObject = (JSONObject) obj;
                JSONObject jSONObject2 = jSONObject.getJSONObject("templates");
                JSONObject jSONObject3 = jSONObject.getJSONObject("card");
                jSONObject2.getClass();
                jSONObject3.getClass();
                return new uv8(jSONObject2, jSONObject3);
            }
        }
        f8cVar = new f8c(dn9Var, cg6Var);
        Object obj2 = f8cVar.j;
        nm6 nm6Var2 = nm6.a;
        i = f8cVar.l;
        if (i != 0) {
        }
        JSONObject jSONObject4 = (JSONObject) obj2;
        JSONObject jSONObject22 = jSONObject4.getJSONObject("templates");
        JSONObject jSONObject32 = jSONObject4.getJSONObject("card");
        jSONObject22.getClass();
        jSONObject32.getClass();
        return new uv8(jSONObject22, jSONObject32);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(dn9 dn9Var, kpo kpoVar, mfk mfkVar, cg6 cg6Var) {
        c8c c8cVar;
        int i;
        dn9Var.getClass();
        if (cg6Var instanceof c8c) {
            c8cVar = (c8c) cg6Var;
            int i2 = c8cVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c8cVar.l = i2 - Integer.MIN_VALUE;
                Object obj = c8cVar.j;
                nm6 nm6Var = nm6.a;
                i = c8cVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    CoroutineContext coroutineContext = (CoroutineContext) dn9Var.f;
                    d8c d8cVar = new d8c(dn9Var, kpoVar, mfkVar, null);
                    c8cVar.l = 1;
                    obj = x97.V(coroutineContext, d8cVar, c8cVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                JSONObject jSONObject = (JSONObject) obj;
                JSONObject jSONObject2 = jSONObject.getJSONObject("templates");
                JSONObject jSONObject3 = jSONObject.getJSONObject("card");
                jSONObject2.getClass();
                jSONObject3.getClass();
                return new uv8(jSONObject2, jSONObject3);
            }
        }
        c8cVar = new c8c(dn9Var, cg6Var);
        Object obj2 = c8cVar.j;
        nm6 nm6Var2 = nm6.a;
        i = c8cVar.l;
        if (i != 0) {
        }
        JSONObject jSONObject4 = (JSONObject) obj2;
        JSONObject jSONObject22 = jSONObject4.getJSONObject("templates");
        JSONObject jSONObject32 = jSONObject4.getJSONObject("card");
        jSONObject22.getClass();
        jSONObject32.getClass();
        return new uv8(jSONObject22, jSONObject32);
    }

    public static final int g(dn9 dn9Var, Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        xq0.q(hrg.q("Column '", str, "' not found in cursor"));
        return 0;
    }

    public static void l(dg0 dg0Var) {
        SQLiteDatabase sQLiteDatabase = dg0Var.a;
        try {
            sQLiteDatabase.execSQL("\n    CREATE TABLE IF NOT EXISTS cards(\n    layout_id TEXT NOT NULL PRIMARY KEY,\n    card_data BLOB NULLABLE,\n    metadata BLOB NULLABLE,\n    group_id TEXT NOT NULL)");
            sQLiteDatabase.execSQL("\n    CREATE TABLE IF NOT EXISTS template_references(\n    group_id TEXT NOT NULL,\n    template_id TEXT NOT NULL,\n    template_hash TEXT NOT NULL,\n    PRIMARY KEY(group_id, template_id))");
            sQLiteDatabase.execSQL("\n    CREATE TABLE IF NOT EXISTS templates(\n    template_hash TEXT NOT NULL PRIMARY KEY,\n    template_data BLOB NULLABLE)");
            sQLiteDatabase.execSQL("\n    CREATE TABLE IF NOT EXISTS raw_json(\n    raw_json_id TEXT NOT NULL PRIMARY KEY,\n    raw_json_data BLOB NULLABLE)");
        } catch (SQLException e) {
            throw new SQLException("Create tables", e);
        }
    }

    public static void n(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = (i4 & 31) | (((i4 >> 5) & 31) << 10) | (((i4 >> 10) & 31) << 5);
                i2++;
            }
            return;
        }
        if (i != -1) {
            return;
        }
        while (i2 <= i3) {
            int i5 = iArr[i2];
            iArr[i2] = ((i5 >> 10) & 31) | ((i5 & 31) << 10) | (((i5 >> 5) & 31) << 5);
            i2++;
        }
    }

    public static int p(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    public static wm9 t(dn9 dn9Var, RuntimeException runtimeException, String str) {
        return new wm9("Unexpected exception on database access: ".concat(str), runtimeException);
    }

    @Override // defpackage.rct
    public void H(qas qasVar) {
        switch (this.a) {
            case 9:
                j79 j79Var = (j79) this.d;
                sv4 sv4Var = new sv4(22, this, qasVar);
                if (j79Var.p == null) {
                    lb4 lb4Var = new lb4(6, j79Var);
                    j79Var.addTextChangedListener(lb4Var);
                    j79Var.p = lb4Var;
                }
                j79Var.o.add(sv4Var);
                break;
            default:
                nm9 nm9Var = ((gm9) this.f).e;
                String str = ((e23) this.e).a.getDataTag().a;
                pm9 pm9Var = (pm9) this.d;
                Map map = (Map) nm9Var.d.get(str);
                if (map != null) {
                    ter terVar = (ter) map.get(pm9Var.f() + '/' + ((String) CollectionsKt.Y(pm9Var.c)));
                    if (terVar != null) {
                        terVar.b = new WeakReference(qasVar);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.v5k
    public boolean a() {
        ArrayList arrayList = (ArrayList) this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((u5k) arrayList.get(i)).a.a()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [arf, java.lang.Object] */
    @Override // defpackage.v5k
    public float b() {
        return ((Number) this.e.getValue()).floatValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [arf, java.lang.Object] */
    @Override // defpackage.v5k
    public float c() {
        return ((Number) this.d.getValue()).floatValue();
    }

    @Override // defpackage.rct
    public void d(Object obj) {
        kxt c;
        Object obj2;
        switch (this.a) {
            case 9:
                j79 j79Var = (j79) this.d;
                String str = (String) obj;
                if (str == null) {
                    str = "";
                }
                xr2 xr2Var = (xr2) this.b;
                if (xr2Var == null) {
                    mne mneVar = (mne) this.c;
                    if (mneVar != null) {
                        if (mneVar.a(str)) {
                            mneVar.b = str;
                            mneVar.c = str.length();
                        }
                    }
                    Editable text = j79Var.getText();
                    if (!Intrinsics.d(text != null ? text.toString() : null, str)) {
                        j79Var.setText(str);
                        if (j79Var.isFocused()) {
                            j79Var.setSelection(str.length());
                            break;
                        }
                    }
                } else {
                    xr2Var.k(str);
                    String i = xr2Var.i();
                    String str2 = (String) this.e;
                    if (str2 != null && (c = ((e23) this.f).b.c(str2)) != null) {
                        c.g(i);
                    }
                    String i2 = xr2Var.i();
                    j79Var.setText(i2);
                    if (j79Var.isFocused()) {
                        j79Var.setSelection(i2.length());
                        break;
                    }
                }
                break;
            default:
                String str3 = (String) obj;
                dm9 dm9Var = (dm9) this.c;
                mm9 mm9Var = (mm9) this.b;
                if (str3 != null && mm9Var.getStateId() != null && !str3.equals(mm9Var.getStateId())) {
                    Iterator it = dm9Var.I.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (Intrinsics.d(((cm9) obj2).d, str3)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    cm9 cm9Var = (cm9) obj2;
                    pm9 pm9Var = (pm9) this.d;
                    String str4 = dm9Var.p;
                    if (str4 == null && (str4 = dm9Var.x) == null) {
                        str4 = "";
                    }
                    ((e23) this.e).a.T(pm9Var.a(str4, cm9Var, str3), true);
                    break;
                }
                break;
        }
    }

    public void h(em3 em3Var, Class cls) {
        ((ArrayList) this.c).add(new Pair(em3Var, cls));
    }

    public void i(r8c r8cVar, Class cls) {
        ((ArrayList) this.e).add(new Pair(r8cVar, cls));
    }

    public sb3 j(oq oqVar, mqs mqsVar) {
        qb3 qb3Var = qb3.b;
        int indexOf = oqVar.F.indexOf(mqsVar);
        Integer valueOf = Integer.valueOf(indexOf);
        if (indexOf == -1) {
            valueOf = null;
        }
        if (valueOf == null) {
            su4.s(2, null, hrg.r("Time left calculation is failed, no track found: trackId=", mqsVar.a, " albumId=", oqVar.a), null);
            return qb3Var;
        }
        int intValue = valueOf.intValue();
        r1l r1lVar = (r1l) this.e;
        mqsVar.getClass();
        Long a = r1lVar.a(mqsVar.a);
        long longValue = a != null ? a.longValue() : 0L;
        if (intValue != 0 || longValue > 0) {
            LinkedList linkedList = oqVar.F;
            Iterator it = linkedList.subList(intValue, linkedList.size()).iterator();
            long j = 0;
            while (it.hasNext()) {
                j += ((mqs) it.next()).e;
            }
            long j2 = j - longValue;
            if (j2 > 0) {
                skr skrVar = (skr) this.c;
                msa msaVar = nsa.b;
                long f = nsa.f(yd5.M(1, ssa.MINUTES));
                if (j2 < f) {
                    j2 = f;
                }
                return new rb3(skrVar.d(R.string.non_music_screen_time_left, saf.N(j2)));
            }
        }
        return qb3Var;
    }

    public ArrayList k(LinkedHashSet linkedHashSet) {
        SQLiteDatabase sQLiteDatabase;
        ArrayList arrayList = new ArrayList(linkedHashSet.size());
        final az6 az6Var = new az6(23, linkedHashSet);
        nsh nshVar = (nsh) this.b;
        eg0 eg0Var = (eg0) nshVar.b;
        synchronized (eg0Var) {
            eg0Var.f = ((cg0) eg0Var.c).getReadableDatabase();
            eg0Var.a++;
            ((LinkedHashSet) eg0Var.d).add(Thread.currentThread());
            sQLiteDatabase = (SQLiteDatabase) eg0Var.f;
            sQLiteDatabase.getClass();
        }
        final dg0 W = nshVar.W(sQLiteDatabase);
        tjn tjnVar = new tjn(new an9(W, 1), new szm() { // from class: xm9
            @Override // defpackage.szm
            public final Object get() {
                return (Cursor) az6Var.invoke(dg0.this);
            }
        });
        try {
            Cursor a = tjnVar.a();
            if (a.getCount() != 0 && a.moveToFirst()) {
                do {
                    zm9 zm9Var = new zm9(this, a);
                    arrayList.add(new oin(zm9Var.c, zm9Var.getData()));
                    zm9Var.b = true;
                } while (a.moveToNext());
            }
            tjnVar.close();
            return arrayList;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m(cg6 cg6Var) {
        eb1 eb1Var;
        int i;
        rj6 rj6Var;
        Object pd1Var;
        u51 u51Var = (u51) this.b;
        xdr xdrVar = (xdr) this.e;
        if (cg6Var instanceof eb1) {
            eb1Var = (eb1) cg6Var;
            int i2 = eb1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eb1Var.l = i2 - Integer.MIN_VALUE;
                Object obj = eb1Var.j;
                nm6 nm6Var = nm6.a;
                i = eb1Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    if (((AtomicBoolean) this.c).getAndSet(true)) {
                        return xdrVar.getValue();
                    }
                    if (xdrVar.getValue() instanceof qd1) {
                        return xdrVar.getValue();
                    }
                    q01 q01Var = (q01) ((arf) this.d).getValue();
                    String str = u51Var.a;
                    eb1Var.l = 1;
                    obj = q01Var.a(str, eb1Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    pd1Var = new qd1(((qj6) rj6Var).a);
                } else {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    pd1Var = new pd1(u51Var, false);
                }
                xdrVar.getClass();
                xdrVar.m(null, pd1Var);
                return pd1Var;
            }
        }
        eb1Var = new eb1(this, cg6Var);
        Object obj2 = eb1Var.j;
        nm6 nm6Var2 = nm6.a;
        i = eb1Var.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof qj6)) {
        }
        xdrVar.getClass();
        xdrVar.m(null, pd1Var);
        return pd1Var;
    }

    public void q() {
        mhh mhhVar = new mhh(this, (bih) this.f);
        this.c = mhhVar;
        mhhVar.onCreate();
    }

    public void r(mwk mwkVar, fx fxVar) {
        gj gjVar = mwkVar.c().c;
        if (gjVar == null) {
            return;
        }
        gx gxVar = (gx) this.c;
        mqs a = mwkVar.a();
        gxVar.a(fxVar, a != null ? a.a : null, gjVar);
    }

    public boolean s(float[] fArr) {
        a5k[] a5kVarArr = (a5k[]) this.e;
        if (a5kVarArr != null && a5kVarArr.length > 0) {
            for (a5k a5kVar : a5kVarArr) {
                a5kVar.getClass();
                float f = fArr[2];
                if (f < 0.95f && f > 0.05f) {
                    float f2 = fArr[0];
                    if (f2 < 10.0f || f2 > 37.0f || fArr[1] > 0.82f) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public dn9(String str, String str2, fnb fnbVar) {
        this.a = 7;
        str.getClass();
        this.b = str;
        this.c = str2;
        this.d = fnbVar;
        this.e = qld.m();
        this.f = eta.e();
    }

    public dn9(q1c q1cVar, r1c r1cVar, Integer num, String str, String str2) {
        this.a = 11;
        q1cVar.getClass();
        r1cVar.getClass();
        str2.getClass();
        this.b = q1cVar;
        this.c = r1cVar;
        this.d = num;
        this.e = str;
        this.f = str2;
    }

    public dn9(ypp yppVar) {
        this.a = 24;
        this.b = yppVar;
        this.e = new AtomicBoolean(false);
        zh registerForActivityResult = yppVar.registerForActivityResult(new vh(3), new gi(8, this));
        registerForActivityResult.getClass();
        this.f = registerForActivityResult;
    }

    public dn9(fnb fnbVar, cvo cvoVar) {
        this.a = 29;
        cvoVar.getClass();
        this.b = fnbVar;
        this.c = cvoVar;
        this.d = btf.b(new p1n(4));
        final int i = 0;
        this.e = btf.b(new Function0(this) { // from class: h6n
            public final /* synthetic */ dn9 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        dn9 dn9Var = this.b;
                        return new tnb((cvo) dn9Var.c, (fnb) dn9Var.b, (jyr) dn9Var.d, 24);
                    default:
                        dn9 dn9Var2 = this.b;
                        return new vnb((fnb) dn9Var2.b, ((cvo) dn9Var2.c).a, (jyr) dn9Var2.d);
                }
            }
        });
        final int i2 = 1;
        this.f = btf.b(new Function0(this) { // from class: h6n
            public final /* synthetic */ dn9 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        dn9 dn9Var = this.b;
                        return new tnb((cvo) dn9Var.c, (fnb) dn9Var.b, (jyr) dn9Var.d, 24);
                    default:
                        dn9 dn9Var2 = this.b;
                        return new vnb((fnb) dn9Var2.b, ((cvo) dn9Var2.c).a, (jyr) dn9Var2.d);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dn9(String str, String str2, String str3, Function1 function1, Function1 function12, Function0 function0, Function0 function02, Function1 function13, Function1 function14) {
        this.a = 22;
        str.getClass();
        this.b = (uif) function1;
        this.c = (uif) function12;
        this.d = (uif) function0;
        this.e = (uif) function13;
        this.f = (uif) function14;
    }

    public dn9(u51 u51Var, arf arfVar) {
        this.a = 4;
        u51Var.getClass();
        this.b = u51Var;
        this.c = new AtomicBoolean(false);
        this.d = arfVar;
        this.e = ydr.a(new pd1(u51Var, true));
        this.f = btf.b(new z3(22, this));
    }

    public dn9(Context context, qqs qqsVar, dv3 dv3Var, s8i s8iVar, d1j d1jVar) {
        this.a = 25;
        this.b = qqsVar;
        this.c = dv3Var;
        this.d = s8iVar;
        this.e = d1jVar;
        this.f = new rx1(context, 0);
    }

    public dn9(q2a q2aVar, z2a z2aVar, ldi ldiVar, g3a g3aVar, Map map) {
        this.a = 15;
        this.b = q2aVar;
        this.c = z2aVar;
        this.d = ldiVar;
        this.f = g3aVar;
        this.e = map;
    }

    public dn9(Activity activity) {
        this.a = 16;
        activity.getClass();
        this.b = activity;
        bdt I = hag.I(ggf.class);
        l18 l18Var = l18.b;
        this.c = l18Var.b(I, true);
        this.d = l18Var.b(hag.I(wst.class), true);
        this.e = l18Var.b(hag.I(frt.class), true);
        this.f = btf.b(new v1e(17, this));
    }

    public dn9(PlaybackScope playbackScope, ebm ebmVar) {
        this.a = 28;
        this.b = playbackScope;
        this.c = ebmVar;
        bdt I = hag.I(lkm.class);
        l18 l18Var = l18.b;
        this.d = l18Var.b(I, true);
        this.e = btf.b(new hvl(23));
        this.f = l18Var.b(hag.I(k68.class), true);
    }

    public dn9(a aVar, qdc qdcVar) {
        this.a = 17;
        this.b = aVar;
        this.c = qdcVar;
        this.d = new WeakHashMap();
        this.e = new AtomicReference(null);
        this.f = new AtomicInteger(Integer.MIN_VALUE);
    }

    public dn9(mm6 mm6Var, e eVar, z5l z5lVar, kxi kxiVar) {
        this.a = 21;
        mm6Var.getClass();
        this.b = mm6Var;
        this.c = z5lVar;
        this.d = kxiVar;
        j0q j0qVar = new j0q();
        this.e = j0qVar;
        this.f = j0qVar;
    }

    public dn9(Context context, c cVar, m mVar, String str, kxi kxiVar) {
        this.a = 2;
        context.getClass();
        kxiVar.getClass();
        this.b = context;
        this.c = cVar;
        this.d = mVar;
        this.e = str;
        this.f = kxiVar;
    }

    public dn9(int i) {
        this.a = i;
        switch (i) {
            case 26:
                l18 l18Var = l18.b;
                bdt I = hag.I(t3g.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                this.b = (t3g) qdcVar.C(I);
                bdt I2 = hag.I(gx.class);
                qdc qdcVar2 = l18Var.a;
                qdcVar2.getClass();
                this.c = (gx) qdcVar2.C(I2);
                this.d = ydr.a(null);
                this.e = ydr.a(null);
                this.f = btf.b(new ufl(3));
                break;
        }
    }

    public dn9(br1 br1Var, tc1 tc1Var, sfg sfgVar, fs7 fs7Var) {
        this.a = 13;
        dq7 dq7Var = ca8.a;
        mn7 mn7Var = mn7.d;
        mn7Var.getClass();
        this.b = br1Var;
        this.c = tc1Var;
        this.d = sfgVar;
        this.e = fs7Var;
        this.f = mn7Var;
    }

    public dn9(yzk yzkVar, skr skrVar, oq7 oq7Var, r1l r1lVar) {
        this.a = 5;
        yzkVar.getClass();
        this.b = yzkVar;
        this.c = skrVar;
        this.d = oq7Var;
        this.e = r1lVar;
        this.f = ydr.a(oq.J);
    }

    public dn9(Drawable.Callback callback) {
        this.a = 14;
        this.b = new lm7();
        this.c = new HashMap();
        this.d = new HashMap();
        this.f = ".ttf";
        if (!(callback instanceof View)) {
            psg.b("LottieDrawable must be inside of a view for images to work.");
            this.e = null;
        } else {
            this.e = ((View) callback).getContext().getAssets();
        }
    }

    public dn9(br1 br1Var, tc1 tc1Var, o6c o6cVar, sfg sfgVar) {
        this.a = 12;
        dq7 dq7Var = ca8.a;
        mn7 mn7Var = mn7.d;
        mn7Var.getClass();
        this.b = br1Var;
        this.c = tc1Var;
        this.d = o6cVar;
        this.e = sfgVar;
        this.f = mn7Var;
    }

    public /* synthetic */ dn9(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public dn9(cvl cvlVar, List list, vrl vrlVar, qe3 qe3Var, sai saiVar) {
        this.a = 27;
        cvlVar.getClass();
        this.b = cvlVar;
        this.c = list;
        this.d = vrlVar;
        this.e = qe3Var;
        this.f = saiVar;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [bn9] */
    public dn9(Context context, y19 y19Var) {
        this.a = 0;
        this.b = new nsh(context, "div-storage.db", (bn9) new zyc() { // from class: bn9
            public final boolean equals(Object obj) {
                if (obj instanceof bn9) {
                    return Intrinsics.d(getFunctionDelegate(), ((zyc) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // defpackage.zyc
            public final syc getFunctionDelegate() {
                return new ezc(1, 0, dn9.class, dn9.this, "onCreate", "onCreate(Lcom/yandex/div/storage/database/DatabaseOpenHelper$Database;)V");
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }, new cn9(this));
        uiq uiqVar = new uiq(new rs6(26, this));
        this.c = uiqVar;
        this.d = new z6n(9, uiqVar);
        this.e = tah.b(new Pair(new Pair(2, 3), new ym9()));
        this.f = new ym9(this);
    }

    public dn9(int[] iArr, int i, a5k[] a5kVarArr) {
        k85 k85Var;
        this.a = 1;
        this.f = new float[3];
        this.e = a5kVarArr;
        int[] iArr2 = new int[io.requery.android.database.sqlite.SQLiteDatabase.OPEN_NOMUTEX];
        this.c = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            int p = p(Color.blue(i3), 8, 5) | (p(Color.red(i3), 8, 5) << 10) | (p(Color.green(i3), 8, 5) << 5);
            iArr[i2] = p;
            iArr2[p] = iArr2[p] + 1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 32768; i5++) {
            if (iArr2[i5] > 0) {
                int rgb = Color.rgb(p((i5 >> 10) & 31, 5, 8), p((i5 >> 5) & 31, 5, 8), p(i5 & 31, 5, 8));
                float[] fArr = (float[]) this.f;
                aa5.h(rgb, fArr);
                if (s(fArr)) {
                    iArr2[i5] = 0;
                }
            }
            if (iArr2[i5] > 0) {
                i4++;
            }
        }
        int[] iArr3 = new int[i4];
        this.b = iArr3;
        int i6 = 0;
        for (int i7 = 0; i7 < 32768; i7++) {
            if (iArr2[i7] > 0) {
                iArr3[i6] = i7;
                i6++;
            }
        }
        if (i4 <= i) {
            this.d = new ArrayList();
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = iArr3[i8];
                ((ArrayList) this.d).add(new b5k(Color.rgb(p((i9 >> 10) & 31, 5, 8), p((i9 >> 5) & 31, 5, 8), p(i9 & 31, 5, 8)), iArr2[i9]));
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i, g);
        priorityQueue.offer(new k85(this, 0, ((int[]) this.b).length - 1));
        while (priorityQueue.size() < i && (k85Var = (k85) priorityQueue.poll()) != null) {
            int i10 = k85Var.b;
            int i11 = k85Var.a;
            if ((i10 + 1) - i11 <= 1) {
                break;
            }
            dn9 dn9Var = k85Var.j;
            if ((i10 + 1) - i11 > 1) {
                int i12 = k85Var.e - k85Var.d;
                int i13 = k85Var.g - k85Var.f;
                int i14 = k85Var.i - k85Var.h;
                int i15 = (i12 < i13 || i12 < i14) ? (i13 < i12 || i13 < i14) ? -1 : -2 : -3;
                int[] iArr4 = (int[]) dn9Var.b;
                int[] iArr5 = (int[]) dn9Var.c;
                n(iArr4, i15, i11, i10);
                Arrays.sort(iArr4, i11, k85Var.b + 1);
                n(iArr4, i15, i11, k85Var.b);
                int i16 = k85Var.c / 2;
                int i17 = 0;
                int i18 = i11;
                while (true) {
                    int i19 = k85Var.b;
                    if (i18 > i19) {
                        break;
                    }
                    i17 += iArr5[iArr4[i18]];
                    if (i17 >= i16) {
                        i11 = Math.min(i19 - 1, i18);
                        break;
                    }
                    i18++;
                }
                k85 k85Var2 = new k85(dn9Var, i11 + 1, k85Var.b);
                k85Var.b = i11;
                k85Var.a();
                priorityQueue.offer(k85Var2);
                priorityQueue.offer(k85Var);
            } else {
                xq0.q("Can not split a box with only 1 color");
                throw null;
            }
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            k85 k85Var3 = (k85) it.next();
            dn9 dn9Var2 = k85Var3.j;
            int[] iArr6 = (int[]) dn9Var2.b;
            int[] iArr7 = (int[]) dn9Var2.c;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            for (int i24 = k85Var3.a; i24 <= k85Var3.b; i24++) {
                int i25 = iArr6[i24];
                int i26 = iArr7[i25];
                i21 += i26;
                i20 = (((i25 >> 10) & 31) * i26) + i20;
                i22 = (((i25 >> 5) & 31) * i26) + i22;
                i23 += i26 * (i25 & 31);
            }
            float f = i21;
            b5k b5kVar = new b5k(Color.rgb(p(Math.round(i20 / f), 5, 8), p(Math.round(i22 / f), 5, 8), p(Math.round(i23 / f), 5, 8)), i21);
            if (!s(b5kVar.b())) {
                arrayList.add(b5kVar);
            }
        }
        this.d = arrayList;
    }

    public dn9(on5 on5Var) {
        this.a = 6;
        this.b = CollectionsKt.y0(on5Var.a);
        this.c = CollectionsKt.y0(on5Var.b);
        this.d = CollectionsKt.y0(on5Var.c);
        this.e = CollectionsKt.y0(on5Var.d);
        this.f = CollectionsKt.y0(on5Var.e);
    }

    public dn9(bih bihVar) {
        this.a = 19;
        this.f = bihVar;
        this.e = bihVar;
        this.b = new ArrayList();
    }
}
