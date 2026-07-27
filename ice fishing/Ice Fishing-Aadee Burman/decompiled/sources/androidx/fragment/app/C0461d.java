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
import c2.EnumC0536c;
import com.google.firebase.FirebaseCommonRegistrar;
import g2.C4524a;
import g2.C4525b;
import h2.InterfaceC4563b;
import j3.InterfaceC4604a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import l4.C4664a;
import q2.C4896n;

/* renamed from: androidx.fragment.app.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0461d implements K.e, InterfaceC4563b, g2.f, j3.c, InterfaceC4604a, R3.e {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4972n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f4973u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f4974v;

    public /* synthetic */ C0461d(int i, Object obj, Object obj2) {
        this.f4972n = i;
        this.f4973u = obj;
        this.f4974v = obj2;
    }

    @Override // K.e
    public void a() {
        a0 operation = (a0) this.f4974v;
        kotlin.jvm.internal.h.e(operation, "$operation");
        ((Animator) this.f4973u).end();
        if (N.E(2)) {
            Log.v("FragmentManager", "Animator from operation " + operation + " has been canceled.");
        }
    }

    @Override // g2.f
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        g2.h hVar = (g2.h) this.f4973u;
        C4524a c4524a = hVar.f37645w;
        int i = c4524a.f37630b;
        Z1.i iVar = (Z1.i) this.f4974v;
        ArrayList k9 = hVar.k(sQLiteDatabase, iVar, i);
        for (W1.d dVar : W1.d.values()) {
            if (dVar != iVar.f4150c) {
                int size = c4524a.f37630b - k9.size();
                if (size <= 0) {
                    break;
                }
                Z2.e a9 = Z1.i.a();
                a9.H(iVar.f4148a);
                if (dVar == null) {
                    throw new NullPointerException("Null priority");
                }
                a9.f4172w = dVar;
                a9.f4171v = iVar.f4149b;
                k9.addAll(hVar.k(sQLiteDatabase, a9.n(), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i6 = 0; i6 < k9.size(); i6++) {
            sb.append(((C4525b) k9.get(i6)).f37634a);
            if (i6 < k9.size() - 1) {
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
                set.add(new g2.g(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = k9.listIterator();
        while (listIterator.hasNext()) {
            C4525b c4525b = (C4525b) listIterator.next();
            if (hashMap.containsKey(Long.valueOf(c4525b.f37634a))) {
                C4896n c9 = c4525b.f37636c.c();
                long j9 = c4525b.f37634a;
                for (g2.g gVar : (Set) hashMap.get(Long.valueOf(j9))) {
                    c9.a(gVar.f37639a, gVar.f37640b);
                }
                listIterator.set(new C4525b(j9, c4525b.f37635b, c9.c()));
            }
        }
        return k9;
    }

    @Override // R3.e
    public Object b(C2.N n9) {
        String str;
        switch (this.f4972n) {
            case 6:
                Context context = (Context) n9.a(Context.class);
                switch (((B1.x) this.f4974v).f161n) {
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
                return new C4664a((String) this.f4973u, str);
            default:
                String str2 = (String) this.f4973u;
                R3.b bVar = (R3.b) this.f4974v;
                try {
                    Trace.beginSection(str2);
                    return bVar.f2719f.b(n9);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // h2.InterfaceC4563b
    public Object c() {
        switch (this.f4972n) {
            case 1:
                g2.h hVar = (g2.h) ((f2.i) this.f4973u).f37484c;
                hVar.getClass();
                Iterable iterable = (Iterable) this.f4974v;
                if (iterable.iterator().hasNext()) {
                    hVar.b().compileStatement("DELETE FROM events WHERE _id in " + g2.h.n(iterable)).execute();
                    break;
                }
                break;
            default:
                f2.i iVar = (f2.i) this.f4973u;
                iVar.getClass();
                Iterator it = ((HashMap) this.f4974v).entrySet().iterator();
                while (it.hasNext()) {
                    ((g2.h) iVar.i).l(((Integer) r2.getValue()).intValue(), EnumC0536c.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                break;
        }
        return null;
    }

    @Override // j3.c
    public void f(j3.m mVar) {
        ((j4.h) this.f4973u).a((Intent) this.f4974v);
    }

    @Override // j3.InterfaceC4604a
    public Object h(j3.m mVar) {
        j4.j jVar = (j4.j) this.f4973u;
        String str = (String) this.f4974v;
        synchronized (jVar) {
            ((s.b) jVar.f38418b).remove(str);
        }
        return mVar;
    }
}
