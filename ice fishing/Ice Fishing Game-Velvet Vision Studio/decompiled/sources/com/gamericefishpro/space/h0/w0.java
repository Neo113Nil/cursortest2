package com.gamericefishpro.space.h0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Trace;
import com.gamericefishpro.space.t0.c2;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w0 implements c2, com.gamericefishpro.space.k8.b, com.gamericefishpro.space.j8.g, OnCompleteListener, com.gamericefishpro.space.r9.a, com.gamericefishpro.space.bb.e {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object i;

    public /* synthetic */ w0(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.i = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    @Override // com.gamericefishpro.space.bb.e
    public Object a(com.gamericefishpro.space.b1.d dVar) {
        String strValueOf;
        switch (this.d) {
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                String str = (String) this.e;
                com.gamericefishpro.space.tb.j jVar = (com.gamericefishpro.space.tb.j) this.i;
                Context context = (Context) dVar.b(Context.class);
                switch (jVar.d) {
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo == null) {
                            strValueOf = "";
                        } else {
                            strValueOf = String.valueOf(applicationInfo.targetSdkVersion);
                        }
                        break;
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 == null) {
                            strValueOf = "";
                        } else {
                            strValueOf = String.valueOf(applicationInfo2.minSdkVersion);
                        }
                        break;
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            strValueOf = "tv";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            strValueOf = "watch";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            strValueOf = "auto";
                        } else if (!context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                            strValueOf = "";
                        } else {
                            strValueOf = "embedded";
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName == null) {
                            strValueOf = "";
                        } else {
                            strValueOf = FirebaseCommonRegistrar.a(installerPackageName);
                        }
                        break;
                }
                return new com.gamericefishpro.space.vb.a(str, strValueOf);
            default:
                String str2 = (String) this.e;
                com.gamericefishpro.space.bb.b bVar = (com.gamericefishpro.space.bb.b) this.i;
                try {
                    Trace.beginSection(str2);
                    return bVar.f.a(dVar);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // com.gamericefishpro.space.j8.g
    public Object apply(Object obj) {
        com.gamericefishpro.space.j8.i iVar = (com.gamericefishpro.space.j8.i) this.e;
        com.gamericefishpro.space.c8.j jVar = (com.gamericefishpro.space.c8.j) this.i;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        com.gamericefishpro.space.j8.a aVar = iVar.v;
        ArrayList arrayListL = iVar.l(sQLiteDatabase, jVar, aVar.b);
        for (com.gamericefishpro.space.z7.d dVar : com.gamericefishpro.space.z7.d.values()) {
            if (dVar != jVar.c) {
                int size = aVar.b - arrayListL.size();
                if (size <= 0) {
                    break;
                }
                com.gamericefishpro.space.a8.c cVarA = com.gamericefishpro.space.c8.j.a();
                cVarA.C(jVar.a);
                if (dVar == null) {
                    throw new NullPointerException("Null priority");
                }
                cVarA.i = dVar;
                cVarA.e = jVar.b;
                arrayListL.addAll(iVar.l(sQLiteDatabase, cVarA.e(), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < arrayListL.size(); i++) {
            sb.append(((com.gamericefishpro.space.j8.b) arrayListL.get(i)).a);
            if (i < arrayListL.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j), hashSet);
                }
                hashSet.add(new com.gamericefishpro.space.j8.h(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListL.listIterator();
        while (listIterator.hasNext()) {
            com.gamericefishpro.space.j8.b bVar = (com.gamericefishpro.space.j8.b) listIterator.next();
            long j2 = bVar.a;
            if (map.containsKey(Long.valueOf(j2))) {
                com.gamericefishpro.space.c8.h hVarC = bVar.c.c();
                for (com.gamericefishpro.space.j8.h hVar : (Set) map.get(Long.valueOf(j2))) {
                    hVarC.f(hVar.a, hVar.b);
                }
                listIterator.set(new com.gamericefishpro.space.j8.b(j2, bVar.b, hVarC.h()));
            }
        }
        return arrayListL;
    }

    @Override // com.gamericefishpro.space.k8.b
    public Object b() {
        switch (this.d) {
            case 1:
                com.gamericefishpro.space.i8.h hVar = (com.gamericefishpro.space.i8.h) this.e;
                Iterable iterable = (Iterable) this.i;
                com.gamericefishpro.space.j8.i iVar = (com.gamericefishpro.space.j8.i) ((com.gamericefishpro.space.j8.d) hVar.c);
                iVar.getClass();
                if (iterable.iterator().hasNext()) {
                    iVar.b().compileStatement("DELETE FROM events WHERE _id in " + com.gamericefishpro.space.j8.i.t(iterable)).execute();
                    break;
                }
                break;
            default:
                com.gamericefishpro.space.i8.h hVar2 = (com.gamericefishpro.space.i8.h) this.e;
                for (Map.Entry entry : ((HashMap) this.i).entrySet()) {
                    ((com.gamericefishpro.space.j8.i) ((com.gamericefishpro.space.j8.c) hVar2.i)).n(((Integer) entry.getValue()).intValue(), com.gamericefishpro.space.f8.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // com.gamericefishpro.space.t0.c2
    public boolean c() {
        y0 y0Var = (y0) this.e;
        d dVar = (d) this.i;
        if (!y0Var.q) {
            y0Var.j();
            long jA = d.a(y0Var.o, dVar.a);
            dVar.a = jA;
            y0Var.q = !y0Var.i(y0Var.n, jA + dVar.b);
        }
        return y0Var.q;
    }

    @Override // com.gamericefishpro.space.r9.a
    public Object e(Task task) {
        com.gamericefishpro.space.tb.k kVar = (com.gamericefishpro.space.tb.k) this.e;
        String str = (String) this.i;
        synchronized (kVar) {
            ((com.gamericefishpro.space.t.e) kVar.b).remove(str);
        }
        return task;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((com.gamericefishpro.space.tb.g) this.e).a((Intent) this.i);
    }
}
