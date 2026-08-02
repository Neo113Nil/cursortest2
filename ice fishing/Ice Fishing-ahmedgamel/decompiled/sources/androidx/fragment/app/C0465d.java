package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import e2.EnumC4475c;
import i2.C4587a;
import i2.C4588b;
import j2.InterfaceC4611b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import l3.InterfaceC4673a;
import n4.C4773a;
import s2.C4945n;

/* renamed from: androidx.fragment.app.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0465d implements K.e, InterfaceC4611b, i2.f, l3.c, InterfaceC4673a, T3.e {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4940n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f4941u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f4942v;

    public /* synthetic */ C0465d(int i, Object obj, Object obj2) {
        this.f4940n = i;
        this.f4941u = obj;
        this.f4942v = obj2;
    }

    @Override // K.e
    public void a() {
        a0 operation = (a0) this.f4942v;
        kotlin.jvm.internal.h.e(operation, "$operation");
        ((Animator) this.f4941u).end();
        if (N.E(2)) {
            Log.v("FragmentManager", "Animator from operation " + operation + " has been canceled.");
        }
    }

    @Override // i2.f
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        i2.h hVar = (i2.h) this.f4941u;
        C4587a c4587a = hVar.f38172w;
        int i = c4587a.f38157b;
        b2.i iVar = (b2.i) this.f4942v;
        ArrayList k9 = hVar.k(sQLiteDatabase, iVar, i);
        for (Y1.d dVar : Y1.d.values()) {
            if (dVar != iVar.f5539c) {
                int size = c4587a.f38157b - k9.size();
                if (size <= 0) {
                    break;
                }
                b3.e a9 = b2.i.a();
                a9.H(iVar.f5537a);
                if (dVar == null) {
                    throw new NullPointerException("Null priority");
                }
                a9.f5559w = dVar;
                a9.f5558v = iVar.f5538b;
                k9.addAll(hVar.k(sQLiteDatabase, a9.o(), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i4 = 0; i4 < k9.size(); i4++) {
            sb.append(((C4588b) k9.get(i4)).f38161a);
            if (i4 < k9.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j6 = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j6));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j6), set);
                }
                set.add(new i2.g(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = k9.listIterator();
        while (listIterator.hasNext()) {
            C4588b c4588b = (C4588b) listIterator.next();
            if (hashMap.containsKey(Long.valueOf(c4588b.f38161a))) {
                C4945n c9 = c4588b.f38163c.c();
                long j9 = c4588b.f38161a;
                for (i2.g gVar : (Set) hashMap.get(Long.valueOf(j9))) {
                    c9.a(gVar.f38166a, gVar.f38167b);
                }
                listIterator.set(new C4588b(j9, c4588b.f38162b, c9.c()));
            }
        }
        return k9;
    }

    @Override // T3.e
    public Object c(E2.M m9) {
        String str;
        switch (this.f4940n) {
            case 6:
                Context context = (Context) m9.a(Context.class);
                switch (((D0.n) this.f4942v).f476n) {
                    case 9:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo == null) {
                            str = "";
                            break;
                        } else {
                            str = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                    case 10:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 == null) {
                            str = "";
                            break;
                        } else {
                            str = String.valueOf(applicationInfo2.minSdkVersion);
                            break;
                        }
                    case 11:
                        int i = Build.VERSION.SDK_INT;
                        if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                    if (i >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                        str = "embedded";
                                        break;
                                    } else {
                                        str = "";
                                        break;
                                    }
                                } else {
                                    str = "auto";
                                    break;
                                }
                            } else {
                                str = "watch";
                                break;
                            }
                        } else {
                            str = "tv";
                            break;
                        }
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName == null) {
                            str = "";
                            break;
                        } else {
                            str = FirebaseCommonRegistrar.a(installerPackageName);
                            break;
                        }
                }
                return new C4773a((String) this.f4941u, str);
            default:
                String str2 = (String) this.f4941u;
                T3.b bVar = (T3.b) this.f4942v;
                try {
                    Trace.beginSection(str2);
                    return bVar.f3174f.c(m9);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // j2.InterfaceC4611b
    public Object d() {
        switch (this.f4940n) {
            case 1:
                i2.h hVar = (i2.h) ((h2.i) this.f4941u).f38108c;
                hVar.getClass();
                Iterable iterable = (Iterable) this.f4942v;
                if (iterable.iterator().hasNext()) {
                    hVar.b().compileStatement("DELETE FROM events WHERE _id in " + i2.h.n(iterable)).execute();
                    break;
                }
                break;
            default:
                h2.i iVar = (h2.i) this.f4941u;
                iVar.getClass();
                Iterator it = ((HashMap) this.f4942v).entrySet().iterator();
                while (it.hasNext()) {
                    ((i2.h) iVar.i).l(((Integer) r2.getValue()).intValue(), EnumC4475c.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                break;
        }
        return null;
    }

    @Override // l3.InterfaceC4673a
    public Object g(l3.m mVar) {
        l4.j jVar = (l4.j) this.f4941u;
        String str = (String) this.f4942v;
        synchronized (jVar) {
            ((s.b) jVar.f38930b).remove(str);
        }
        return mVar;
    }

    @Override // l3.c
    public void r(l3.m mVar) {
        ((l4.h) this.f4941u).a((Intent) this.f4942v);
    }
}
