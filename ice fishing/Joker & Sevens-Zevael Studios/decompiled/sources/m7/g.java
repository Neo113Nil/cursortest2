package m7;

import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.autofill.AutofillManager;
import b4.m;
import d8.s;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m0.w2;
import o6.w;
import o6.y;
import r1.p;
import u.j0;
import u.n0;
import v.l1;
import v.n;
import v.o;
import v.z;
import x1.g0;
import x1.v1;
import y1.r;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g implements w, o, l1 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4956g;

    /* renamed from: h, reason: collision with root package name */
    public Object f4957h;

    public /* synthetic */ g(int i10, Object obj) {
        this.f4956g = i10;
        this.f4957h = obj;
    }

    public static void j(i4.c cVar) {
        cVar.g("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.g("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        cVar.g("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        cVar.g("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        cVar.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        cVar.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        cVar.g("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.g("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        cVar.g("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.g("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.g("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        cVar.g("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.g("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        cVar.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        cVar.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
    }

    public static m r(i4.c cVar) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new d4.a("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap.put("prerequisite_id", new d4.a("prerequisite_id", "TEXT", true, 2, null, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new d4.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new d4.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new d4.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        hashSet2.add(new d4.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
        d4.e eVar = new d4.e("Dependency", hashMap, hashSet, hashSet2);
        d4.e a6 = d4.e.a(cVar, "Dependency");
        if (!eVar.equals(a6)) {
            return new m("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + eVar + "\n Found:\n" + a6, false);
        }
        HashMap hashMap2 = new HashMap(27);
        hashMap2.put("id", new d4.a("id", "TEXT", true, 1, null, 1));
        hashMap2.put("state", new d4.a("state", "INTEGER", true, 0, null, 1));
        hashMap2.put("worker_class_name", new d4.a("worker_class_name", "TEXT", true, 0, null, 1));
        hashMap2.put("input_merger_class_name", new d4.a("input_merger_class_name", "TEXT", false, 0, null, 1));
        hashMap2.put("input", new d4.a("input", "BLOB", true, 0, null, 1));
        hashMap2.put("output", new d4.a("output", "BLOB", true, 0, null, 1));
        hashMap2.put("initial_delay", new d4.a("initial_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("interval_duration", new d4.a("interval_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("flex_duration", new d4.a("flex_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("run_attempt_count", new d4.a("run_attempt_count", "INTEGER", true, 0, null, 1));
        hashMap2.put("backoff_policy", new d4.a("backoff_policy", "INTEGER", true, 0, null, 1));
        hashMap2.put("backoff_delay_duration", new d4.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("last_enqueue_time", new d4.a("last_enqueue_time", "INTEGER", true, 0, null, 1));
        hashMap2.put("minimum_retention_duration", new d4.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("schedule_requested_at", new d4.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
        hashMap2.put("run_in_foreground", new d4.a("run_in_foreground", "INTEGER", true, 0, null, 1));
        hashMap2.put("out_of_quota_policy", new d4.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        hashMap2.put("period_count", new d4.a("period_count", "INTEGER", true, 0, "0", 1));
        hashMap2.put("generation", new d4.a("generation", "INTEGER", true, 0, "0", 1));
        hashMap2.put("required_network_type", new d4.a("required_network_type", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_charging", new d4.a("requires_charging", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_device_idle", new d4.a("requires_device_idle", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_battery_not_low", new d4.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_storage_not_low", new d4.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        hashMap2.put("trigger_content_update_delay", new d4.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("trigger_max_content_delay", new d4.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("content_uri_triggers", new d4.a("content_uri_triggers", "BLOB", true, 0, null, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new d4.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
        hashSet4.add(new d4.d("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
        d4.e eVar2 = new d4.e("WorkSpec", hashMap2, hashSet3, hashSet4);
        d4.e a8 = d4.e.a(cVar, "WorkSpec");
        if (!eVar2.equals(a8)) {
            return new m("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + eVar2 + "\n Found:\n" + a8, false);
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("tag", new d4.a("tag", "TEXT", true, 1, null, 1));
        hashMap3.put("work_spec_id", new d4.a("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new d4.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new d4.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        d4.e eVar3 = new d4.e("WorkTag", hashMap3, hashSet5, hashSet6);
        d4.e a10 = d4.e.a(cVar, "WorkTag");
        if (!eVar3.equals(a10)) {
            return new m("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + eVar3 + "\n Found:\n" + a10, false);
        }
        HashMap hashMap4 = new HashMap(3);
        hashMap4.put("work_spec_id", new d4.a("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap4.put("generation", new d4.a("generation", "INTEGER", true, 2, "0", 1));
        hashMap4.put("system_id", new d4.a("system_id", "INTEGER", true, 0, null, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new d4.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        d4.e eVar4 = new d4.e("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
        d4.e a11 = d4.e.a(cVar, "SystemIdInfo");
        if (!eVar4.equals(a11)) {
            return new m("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + eVar4 + "\n Found:\n" + a11, false);
        }
        HashMap hashMap5 = new HashMap(2);
        hashMap5.put("name", new d4.a("name", "TEXT", true, 1, null, 1));
        hashMap5.put("work_spec_id", new d4.a("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new d4.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new d4.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        d4.e eVar5 = new d4.e("WorkName", hashMap5, hashSet8, hashSet9);
        d4.e a12 = d4.e.a(cVar, "WorkName");
        if (!eVar5.equals(a12)) {
            return new m("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + eVar5 + "\n Found:\n" + a12, false);
        }
        HashMap hashMap6 = new HashMap(2);
        hashMap6.put("work_spec_id", new d4.a("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap6.put("progress", new d4.a("progress", "BLOB", true, 0, null, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new d4.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        d4.e eVar6 = new d4.e("WorkProgress", hashMap6, hashSet10, new HashSet(0));
        d4.e a13 = d4.e.a(cVar, "WorkProgress");
        if (!eVar6.equals(a13)) {
            return new m("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + eVar6 + "\n Found:\n" + a13, false);
        }
        HashMap hashMap7 = new HashMap(2);
        hashMap7.put("key", new d4.a("key", "TEXT", true, 1, null, 1));
        hashMap7.put("long_value", new d4.a("long_value", "INTEGER", false, 0, null, 1));
        d4.e eVar7 = new d4.e("Preference", hashMap7, new HashSet(0), new HashSet(0));
        d4.e a14 = d4.e.a(cVar, "Preference");
        if (eVar7.equals(a14)) {
            return new m(null, true);
        }
        return new m("Preference(androidx.work.impl.model.Preference).\n Expected:\n" + eVar7 + "\n Found:\n" + a14, false);
    }

    @Override // v.l1, v.j1
    public boolean a() {
        ((s) this.f4957h).getClass();
        return false;
    }

    @Override // v.j1
    public long b(n nVar, n nVar2, n nVar3) {
        return ((s) this.f4957h).b(nVar, nVar2, nVar3);
    }

    @Override // o6.w
    public void e() {
        y yVar = (y) this.f4957h;
        Iterator it = yVar.f5378i.values().iterator();
        while (it.hasNext()) {
            ((n6.a) it.next()).m();
        }
        yVar.f5385p.f5364p = Collections.EMPTY_SET;
    }

    @Override // o6.w
    public void f() {
        y yVar = (y) this.f4957h;
        yVar.f5373d.lock();
        try {
            yVar.f5383n = new o6.s(yVar, yVar.f5380k, yVar.f5381l, yVar.f5376g, yVar.f5382m, yVar.f5373d, yVar.f5375f);
            yVar.f5383n.e();
            yVar.f5374e.signalAll();
        } finally {
            yVar.f5373d.unlock();
        }
    }

    @Override // v.o
    public v.y get(int i10) {
        switch (this.f4956g) {
            case 17:
                return (z) this.f4957h;
            default:
                return (v.y) this.f4957h;
        }
    }

    @Override // o6.w
    public boolean h() {
        return true;
    }

    public void i(g0 g0Var) {
        if (!g0Var.G()) {
            u1.a.b("DepthSortedSet.add called on an unattached node");
        }
        ((v1) this.f4957h).add(g0Var);
    }

    @Override // v.j1
    public n k(long j3, n nVar, n nVar2, n nVar3) {
        return ((s) this.f4957h).k(j3, nVar, nVar2, nVar3);
    }

    @Override // v.j1
    public n n(n nVar, n nVar2, n nVar3) {
        return ((s) this.f4957h).n(nVar, nVar2, nVar3);
    }

    public w2 o() {
        q3.i a6 = q3.i.a();
        if (a6.b() == 1) {
            return new o2.k(true);
        }
        m0.l1 s10 = m0.z.s(Boolean.FALSE);
        o2.g gVar = new o2.g(s10, this);
        a6.f5759a.writeLock().lock();
        try {
            if (a6.f5761c != 1 && a6.f5761c != 2) {
                a6.f5760b.add(gVar);
                a6.f5759a.writeLock().unlock();
                return s10;
            }
            a6.f5762d.post(new e3.a(Arrays.asList(gVar), a6.f5761c, (Throwable) null));
            a6.f5759a.writeLock().unlock();
            return s10;
        } catch (Throwable th) {
            a6.f5759a.writeLock().unlock();
            throw th;
        }
    }

    @Override // v.j1
    public n p(long j3, n nVar, n nVar2, n nVar3) {
        return ((s) this.f4957h).p(j3, nVar, nVar2, nVar3);
    }

    public void q(View view, int i10, boolean z10) {
        if (Build.VERSION.SDK_INT >= 27) {
            ((AutofillManager) this.f4957h).notifyViewVisibilityChanged(view, i10, z10);
        }
    }

    public x4.c s(x4.e eVar, r rVar) {
        Object obj;
        int i10;
        long F;
        long j3;
        boolean z10;
        s.o oVar = (s.o) this.f4957h;
        List list = (List) eVar.f8294g;
        s.o oVar2 = new s.o(list.size());
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            p pVar = (p) list.get(i11);
            long j6 = pVar.f5981a;
            int b2 = t.a.b(oVar.f6309h, oVar.f6311j, j6);
            if (b2 < 0 || (obj = oVar.f6310i[b2]) == s.p.f6313a) {
                obj = null;
            }
            r1.o oVar3 = (r1.o) obj;
            if (oVar3 == null) {
                i10 = i11;
                j3 = pVar.f5982b;
                F = pVar.f5984d;
                z10 = false;
            } else {
                long j10 = oVar3.f5978a;
                boolean z11 = oVar3.f5980c;
                i10 = i11;
                F = rVar.F(oVar3.f5979b);
                j3 = j10;
                z10 = z11;
            }
            long j11 = pVar.f5981a;
            List list2 = list;
            int i12 = size;
            oVar2.b(j11, new r1.n(j11, pVar.f5982b, pVar.f5984d, pVar.f5985e, pVar.f5986f, j3, F, z10, pVar.f5987g, pVar.f5989i, pVar.f5990j, pVar.f5991k));
            boolean z12 = pVar.f5985e;
            if (z12) {
                oVar.b(j6, new r1.o(pVar.f5982b, pVar.f5983c, z12));
            } else {
                oVar.c(j6);
            }
            i11 = i10 + 1;
            list = list2;
            size = i12;
        }
        return new x4.c(oVar2, eVar);
    }

    public void t(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            HashMap hashMap2 = (HashMap) this.f4957h;
            if (value == null) {
                hashMap2.put(str, null);
            } else {
                Class<?> cls = value.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    hashMap2.put(str, value);
                } else {
                    int i10 = 0;
                    if (cls == boolean[].class) {
                        boolean[] zArr = (boolean[]) value;
                        String str2 = o4.e.f5204b;
                        Boolean[] boolArr = new Boolean[zArr.length];
                        while (i10 < zArr.length) {
                            boolArr[i10] = Boolean.valueOf(zArr[i10]);
                            i10++;
                        }
                        hashMap2.put(str, boolArr);
                    } else if (cls == byte[].class) {
                        byte[] bArr = (byte[]) value;
                        String str3 = o4.e.f5204b;
                        Byte[] bArr2 = new Byte[bArr.length];
                        while (i10 < bArr.length) {
                            bArr2[i10] = Byte.valueOf(bArr[i10]);
                            i10++;
                        }
                        hashMap2.put(str, bArr2);
                    } else if (cls == int[].class) {
                        int[] iArr = (int[]) value;
                        String str4 = o4.e.f5204b;
                        Integer[] numArr = new Integer[iArr.length];
                        while (i10 < iArr.length) {
                            numArr[i10] = Integer.valueOf(iArr[i10]);
                            i10++;
                        }
                        hashMap2.put(str, numArr);
                    } else if (cls == long[].class) {
                        long[] jArr = (long[]) value;
                        String str5 = o4.e.f5204b;
                        Long[] lArr = new Long[jArr.length];
                        while (i10 < jArr.length) {
                            lArr[i10] = Long.valueOf(jArr[i10]);
                            i10++;
                        }
                        hashMap2.put(str, lArr);
                    } else if (cls == float[].class) {
                        float[] fArr = (float[]) value;
                        String str6 = o4.e.f5204b;
                        Float[] fArr2 = new Float[fArr.length];
                        while (i10 < fArr.length) {
                            fArr2[i10] = Float.valueOf(fArr[i10]);
                            i10++;
                        }
                        hashMap2.put(str, fArr2);
                    } else {
                        if (cls != double[].class) {
                            throw new IllegalArgumentException("Key " + str + "has invalid type " + cls);
                        }
                        double[] dArr = (double[]) value;
                        String str7 = o4.e.f5204b;
                        Double[] dArr2 = new Double[dArr.length];
                        while (i10 < dArr.length) {
                            dArr2[i10] = Double.valueOf(dArr[i10]);
                            i10++;
                        }
                        hashMap2.put(str, dArr2);
                    }
                }
            }
        }
    }

    public String toString() {
        switch (this.f4956g) {
            case 22:
                return ((v1) this.f4957h).toString();
            default:
                return super.toString();
        }
    }

    public boolean u(g0 g0Var) {
        if (!g0Var.G()) {
            u1.a.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((v1) this.f4957h).remove(g0Var);
    }

    public void v(Exception exc) {
        i iVar = (i) this.f4957h;
        if (v2.h.f7203l.g(iVar, null, new v2.c(exc))) {
            v2.h.d(iVar);
        }
    }

    public /* synthetic */ g(int i10, boolean z10) {
        this.f4956g = i10;
    }

    public g(s2.c cVar) {
        this.f4956g = 15;
        this.f4957h = new j0(n0.f6623a, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if (r7 == 1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041 A[LOOP:1: B:14:0x003f->B:15:0x0041, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(int[] iArr, float[] fArr, float[][] fArr2) {
        int i10;
        int length;
        int i11;
        this.f4956g = 16;
        int length2 = fArr.length - 1;
        v.p[][] pVarArr = new v.p[length2][];
        int i12 = 1;
        int i13 = 1;
        int i14 = 0;
        while (i14 < length2) {
            int i15 = iArr[i14];
            int i16 = 3;
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 != 3) {
                            i16 = 4;
                            if (i15 != 4) {
                                i16 = 5;
                                if (i15 != 5) {
                                    i10 = i13;
                                    float[] fArr3 = fArr2[i14];
                                    length = (fArr3.length % 2) + (fArr3.length / 2);
                                    v.p[] pVarArr2 = new v.p[length];
                                    for (i11 = 0; i11 < length; i11++) {
                                        int i17 = i11 * 2;
                                        float f10 = fArr[i14];
                                        int i18 = i14 + 1;
                                        float f11 = fArr[i18];
                                        float[] fArr4 = fArr2[i14];
                                        float f12 = fArr4[i17];
                                        int i19 = i17 + 1;
                                        float f13 = fArr4[i19];
                                        float[] fArr5 = fArr2[i18];
                                        pVarArr2[i11] = new v.p(i10, f10, f11, f12, f13, fArr5[i17], fArr5[i19]);
                                    }
                                    pVarArr[i14] = pVarArr2;
                                    i14++;
                                    i13 = i10;
                                }
                            }
                        }
                    }
                    i12 = 2;
                    i10 = i12;
                    float[] fArr32 = fArr2[i14];
                    length = (fArr32.length % 2) + (fArr32.length / 2);
                    v.p[] pVarArr22 = new v.p[length];
                    while (i11 < length) {
                    }
                    pVarArr[i14] = pVarArr22;
                    i14++;
                    i13 = i10;
                }
                i12 = 1;
                i10 = i12;
                float[] fArr322 = fArr2[i14];
                length = (fArr322.length % 2) + (fArr322.length / 2);
                v.p[] pVarArr222 = new v.p[length];
                while (i11 < length) {
                }
                pVarArr[i14] = pVarArr222;
                i14++;
                i13 = i10;
            }
            i10 = i16;
            float[] fArr3222 = fArr2[i14];
            length = (fArr3222.length % 2) + (fArr3222.length / 2);
            v.p[] pVarArr2222 = new v.p[length];
            while (i11 < length) {
            }
            pVarArr[i14] = pVarArr2222;
            i14++;
            i13 = i10;
        }
        this.f4957h = pVarArr;
    }

    public g(long[] jArr) {
        s.w wVar;
        this.f4956g = 21;
        if (jArr != null) {
            long[] copyOf = Arrays.copyOf(jArr, jArr.length);
            wVar = new s.w(copyOf.length);
            int i10 = wVar.f6350b;
            if (i10 >= 0) {
                if (copyOf.length != 0) {
                    int length = copyOf.length + i10;
                    long[] jArr2 = wVar.f6349a;
                    if (jArr2.length < length) {
                        long[] copyOf2 = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                        pc.j.d(copyOf2, "copyOf(...)");
                        wVar.f6349a = copyOf2;
                    }
                    long[] jArr3 = wVar.f6349a;
                    int i11 = wVar.f6350b;
                    if (i10 != i11) {
                        bc.l.Q(jArr3, jArr3, copyOf.length + i10, i10, i11);
                    }
                    bc.l.Q(copyOf, jArr3, i10, 0, copyOf.length);
                    wVar.f6350b += copyOf.length;
                }
            } else {
                t.a.d("");
                throw null;
            }
        } else {
            wVar = new s.w(16);
        }
        this.f4957h = wVar;
    }

    public g(int i10) {
        this.f4956g = i10;
        switch (i10) {
            case 8:
                this.f4957h = v6.a.q(Looper.getMainLooper());
                break;
            case 12:
                this.f4957h = new s.o((Object) null);
                break;
            case 22:
                this.f4957h = new v1(x1.f.f8031a);
                break;
            default:
                this.f4957h = new HashMap();
                break;
        }
    }

    public g(float f10, float f11, n nVar) {
        o gVar;
        this.f4956g = 19;
        if (nVar != null) {
            gVar = new s3.k(f10, f11, nVar);
        } else {
            gVar = new g(f10, f11);
        }
        this.f4957h = new s(gVar);
    }

    @Override // o6.w
    public void c(Bundle bundle) {
    }

    @Override // o6.w
    public void d(int i10) {
    }

    public g(float f10, float f11) {
        this.f4956g = 17;
        this.f4957h = new z(f10, f11, 0.01f);
    }

    @Override // o6.w
    public void g(m6.b bVar, n6.c cVar, boolean z10) {
    }
}
