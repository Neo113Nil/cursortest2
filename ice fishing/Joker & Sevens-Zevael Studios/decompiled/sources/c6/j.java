package c6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Trace;
import com.google.firebase.FirebaseCommonRegistrar;
import d8.t;
import g7.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements e6.b, d6.h, g7.c, g7.a, l7.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1262g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1263h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1264i;

    public /* synthetic */ j(int i10, Object obj, Object obj2) {
        this.f1262g = i10;
        this.f1263h = obj;
        this.f1264i = obj2;
    }

    @Override // e6.b
    public Object a() {
        switch (this.f1262g) {
            case 0:
                l lVar = (l) this.f1263h;
                Iterable iterable = (Iterable) this.f1264i;
                d6.j jVar = (d6.j) ((d6.d) lVar.f1270c);
                jVar.getClass();
                if (iterable.iterator().hasNext()) {
                    jVar.a().compileStatement("DELETE FROM events WHERE _id in " + d6.j.j(iterable)).execute();
                    break;
                }
                break;
            default:
                l lVar2 = (l) this.f1263h;
                for (Map.Entry entry : ((HashMap) this.f1264i).entrySet()) {
                    ((d6.j) ((d6.c) lVar2.f1276i)).g(((Integer) entry.getValue()).intValue(), z5.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // d6.h
    public Object apply(Object obj) {
        d6.j jVar = (d6.j) this.f1263h;
        w5.i iVar = (w5.i) this.f1264i;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        d6.a aVar = jVar.f1705j;
        ArrayList f10 = jVar.f(sQLiteDatabase, iVar, aVar.f1687b);
        for (t5.d dVar : t5.d.values()) {
            if (dVar != iVar.f7689c) {
                int size = aVar.f1687b - f10.size();
                if (size <= 0) {
                    break;
                }
                a5.c a6 = w5.i.a();
                a6.L(iVar.f7687a);
                if (dVar == null) {
                    throw new NullPointerException("Null priority");
                }
                a6.f263i = dVar;
                a6.f261g = iVar.f7688b;
                f10.addAll(jVar.f(sQLiteDatabase, a6.n(), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < f10.size(); i10++) {
            sb.append(((d6.b) f10.get(i10)).f1691a);
            if (i10 < f10.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j3 = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j3));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j3), set);
                }
                set.add(new d6.i(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = f10.listIterator();
        while (listIterator.hasNext()) {
            d6.b bVar = (d6.b) listIterator.next();
            long j6 = bVar.f1691a;
            if (hashMap.containsKey(Long.valueOf(j6))) {
                d8.m c3 = bVar.f1693c.c();
                for (d6.i iVar2 : (Set) hashMap.get(Long.valueOf(j6))) {
                    c3.f(iVar2.f1699a, iVar2.f1700b);
                }
                listIterator.set(new d6.b(j6, bVar.f1692b, c3.h()));
            }
        }
        return f10;
    }

    @Override // g7.a
    public Object b(o oVar) {
        d8.j jVar = (d8.j) this.f1263h;
        String str = (String) this.f1264i;
        synchronized (jVar) {
            ((s.f) jVar.f1793b).remove(str);
        }
        return oVar;
    }

    @Override // l7.e
    public Object e(t tVar) {
        String valueOf;
        switch (this.f1262g) {
            case 5:
                String str = (String) this.f1263h;
                d6.f fVar = (d6.f) this.f1264i;
                Context context = (Context) tVar.a(Context.class);
                switch (fVar.f1696g) {
                    case 17:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                        valueOf = "";
                        break;
                    case 18:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null) {
                            valueOf = String.valueOf(applicationInfo2.minSdkVersion);
                            break;
                        }
                        valueOf = "";
                        break;
                    case 19:
                        if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                    if (context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                        valueOf = "embedded";
                                        break;
                                    }
                                    valueOf = "";
                                    break;
                                } else {
                                    valueOf = "auto";
                                    break;
                                }
                            } else {
                                valueOf = "watch";
                                break;
                            }
                        } else {
                            valueOf = "tv";
                            break;
                        }
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            valueOf = FirebaseCommonRegistrar.a(installerPackageName);
                            break;
                        }
                        valueOf = "";
                        break;
                }
                return new f8.a(str, valueOf);
            default:
                String str2 = (String) this.f1263h;
                l7.b bVar = (l7.b) this.f1264i;
                try {
                    Trace.beginSection(str2);
                    return bVar.f4218f.e(tVar);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // g7.c
    public void k(o oVar) {
        ((d8.g) this.f1263h).a((Intent) this.f1264i);
    }
}
