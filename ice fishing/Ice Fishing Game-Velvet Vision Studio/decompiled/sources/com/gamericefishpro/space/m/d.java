package com.gamericefishpro.space.m;

import android.app.ActivityManager;
import android.content.res.Resources;
import android.graphics.Region;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.MenuItem;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.d4.l0;
import com.gamericefishpro.space.d4.o1;
import com.gamericefishpro.space.d4.r0;
import com.gamericefishpro.space.n.f0;
import com.gamericefishpro.space.n.j1;
import com.gamericefishpro.space.n9.b2;
import com.gamericefishpro.space.n9.d2;
import com.gamericefishpro.space.n9.e2;
import com.gamericefishpro.space.n9.f1;
import com.gamericefishpro.space.n9.l1;
import com.gamericefishpro.space.n9.q4;
import com.gamericefishpro.space.n9.r1;
import com.gamericefishpro.space.n9.t0;
import com.gamericefishpro.space.n9.t2;
import com.gamericefishpro.space.n9.v0;
import com.gamericefishpro.space.n9.w3;
import com.gamericefishpro.space.o1.z;
import com.gamericefishpro.space.q0.t;
import com.gamericefishpro.space.q0.v;
import com.gamericefishpro.space.q0.w;
import com.gamericefishpro.space.t0.u;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.MissingFormatArgumentException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class d implements j1, com.gamericefishpro.space.l4.c, n, f0, q4, com.gamericefishpro.space.d4.p, com.gamericefishpro.space.l4.g, com.gamericefishpro.space.p5.c {
    public final /* synthetic */ int d;
    public Object e;

    public /* synthetic */ d(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    public static String C(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public static d H(String str) {
        return new d(9, (TextUtils.isEmpty(str) || str.length() > 1) ? b2.UNINITIALIZED : e2.e(str.charAt(0)));
    }

    public static void n(com.gamericefishpro.space.e6.c cVar) {
        cVar.h("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.h("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        cVar.h("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        cVar.h("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        cVar.h("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        cVar.h("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        cVar.h("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.h("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        cVar.h("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.h("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.h("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        cVar.h("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.h("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        cVar.h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        cVar.h("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
    }

    public static int t(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    public static boolean x(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static com.gamericefishpro.space.o8.a y(com.gamericefishpro.space.e6.c cVar) {
        HashMap map = new HashMap(2);
        map.put("work_spec_id", new com.gamericefishpro.space.y5.f("work_spec_id", "TEXT", true, 1, null, 1));
        map.put("prerequisite_id", new com.gamericefishpro.space.y5.f("prerequisite_id", "TEXT", true, 2, null, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new com.gamericefishpro.space.y5.g("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new com.gamericefishpro.space.y5.g("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new com.gamericefishpro.space.y5.h("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        hashSet2.add(new com.gamericefishpro.space.y5.h("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
        com.gamericefishpro.space.y5.i iVar = new com.gamericefishpro.space.y5.i("Dependency", map, hashSet, hashSet2);
        com.gamericefishpro.space.y5.i iVarA = com.gamericefishpro.space.y5.i.a(cVar, "Dependency");
        if (!iVar.equals(iVarA)) {
            return new com.gamericefishpro.space.o8.a(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + iVar + "\n Found:\n" + iVarA, 2);
        }
        HashMap map2 = new HashMap(27);
        map2.put("id", new com.gamericefishpro.space.y5.f("id", "TEXT", true, 1, null, 1));
        map2.put("state", new com.gamericefishpro.space.y5.f("state", "INTEGER", true, 0, null, 1));
        map2.put("worker_class_name", new com.gamericefishpro.space.y5.f("worker_class_name", "TEXT", true, 0, null, 1));
        map2.put("input_merger_class_name", new com.gamericefishpro.space.y5.f("input_merger_class_name", "TEXT", false, 0, null, 1));
        map2.put("input", new com.gamericefishpro.space.y5.f("input", "BLOB", true, 0, null, 1));
        map2.put("output", new com.gamericefishpro.space.y5.f("output", "BLOB", true, 0, null, 1));
        map2.put("initial_delay", new com.gamericefishpro.space.y5.f("initial_delay", "INTEGER", true, 0, null, 1));
        map2.put("interval_duration", new com.gamericefishpro.space.y5.f("interval_duration", "INTEGER", true, 0, null, 1));
        map2.put("flex_duration", new com.gamericefishpro.space.y5.f("flex_duration", "INTEGER", true, 0, null, 1));
        map2.put("run_attempt_count", new com.gamericefishpro.space.y5.f("run_attempt_count", "INTEGER", true, 0, null, 1));
        map2.put("backoff_policy", new com.gamericefishpro.space.y5.f("backoff_policy", "INTEGER", true, 0, null, 1));
        map2.put("backoff_delay_duration", new com.gamericefishpro.space.y5.f("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        map2.put("last_enqueue_time", new com.gamericefishpro.space.y5.f("last_enqueue_time", "INTEGER", true, 0, null, 1));
        map2.put("minimum_retention_duration", new com.gamericefishpro.space.y5.f("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        map2.put("schedule_requested_at", new com.gamericefishpro.space.y5.f("schedule_requested_at", "INTEGER", true, 0, null, 1));
        map2.put("run_in_foreground", new com.gamericefishpro.space.y5.f("run_in_foreground", "INTEGER", true, 0, null, 1));
        map2.put("out_of_quota_policy", new com.gamericefishpro.space.y5.f("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        map2.put("period_count", new com.gamericefishpro.space.y5.f("period_count", "INTEGER", true, 0, "0", 1));
        map2.put("generation", new com.gamericefishpro.space.y5.f("generation", "INTEGER", true, 0, "0", 1));
        map2.put("required_network_type", new com.gamericefishpro.space.y5.f("required_network_type", "INTEGER", true, 0, null, 1));
        map2.put("requires_charging", new com.gamericefishpro.space.y5.f("requires_charging", "INTEGER", true, 0, null, 1));
        map2.put("requires_device_idle", new com.gamericefishpro.space.y5.f("requires_device_idle", "INTEGER", true, 0, null, 1));
        map2.put("requires_battery_not_low", new com.gamericefishpro.space.y5.f("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        map2.put("requires_storage_not_low", new com.gamericefishpro.space.y5.f("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        map2.put("trigger_content_update_delay", new com.gamericefishpro.space.y5.f("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        map2.put("trigger_max_content_delay", new com.gamericefishpro.space.y5.f("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        map2.put("content_uri_triggers", new com.gamericefishpro.space.y5.f("content_uri_triggers", "BLOB", true, 0, null, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new com.gamericefishpro.space.y5.h("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
        hashSet4.add(new com.gamericefishpro.space.y5.h("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
        com.gamericefishpro.space.y5.i iVar2 = new com.gamericefishpro.space.y5.i("WorkSpec", map2, hashSet3, hashSet4);
        com.gamericefishpro.space.y5.i iVarA2 = com.gamericefishpro.space.y5.i.a(cVar, "WorkSpec");
        if (!iVar2.equals(iVarA2)) {
            return new com.gamericefishpro.space.o8.a(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + iVar2 + "\n Found:\n" + iVarA2, 2);
        }
        HashMap map3 = new HashMap(2);
        map3.put("tag", new com.gamericefishpro.space.y5.f("tag", "TEXT", true, 1, null, 1));
        map3.put("work_spec_id", new com.gamericefishpro.space.y5.f("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new com.gamericefishpro.space.y5.g("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new com.gamericefishpro.space.y5.h("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        com.gamericefishpro.space.y5.i iVar3 = new com.gamericefishpro.space.y5.i("WorkTag", map3, hashSet5, hashSet6);
        com.gamericefishpro.space.y5.i iVarA3 = com.gamericefishpro.space.y5.i.a(cVar, "WorkTag");
        if (!iVar3.equals(iVarA3)) {
            return new com.gamericefishpro.space.o8.a(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + iVar3 + "\n Found:\n" + iVarA3, 2);
        }
        HashMap map4 = new HashMap(3);
        map4.put("work_spec_id", new com.gamericefishpro.space.y5.f("work_spec_id", "TEXT", true, 1, null, 1));
        map4.put("generation", new com.gamericefishpro.space.y5.f("generation", "INTEGER", true, 2, "0", 1));
        map4.put("system_id", new com.gamericefishpro.space.y5.f("system_id", "INTEGER", true, 0, null, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new com.gamericefishpro.space.y5.g("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        com.gamericefishpro.space.y5.i iVar4 = new com.gamericefishpro.space.y5.i("SystemIdInfo", map4, hashSet7, new HashSet(0));
        com.gamericefishpro.space.y5.i iVarA4 = com.gamericefishpro.space.y5.i.a(cVar, "SystemIdInfo");
        if (!iVar4.equals(iVarA4)) {
            return new com.gamericefishpro.space.o8.a(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + iVar4 + "\n Found:\n" + iVarA4, 2);
        }
        HashMap map5 = new HashMap(2);
        map5.put("name", new com.gamericefishpro.space.y5.f("name", "TEXT", true, 1, null, 1));
        map5.put("work_spec_id", new com.gamericefishpro.space.y5.f("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new com.gamericefishpro.space.y5.g("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new com.gamericefishpro.space.y5.h("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        com.gamericefishpro.space.y5.i iVar5 = new com.gamericefishpro.space.y5.i("WorkName", map5, hashSet8, hashSet9);
        com.gamericefishpro.space.y5.i iVarA5 = com.gamericefishpro.space.y5.i.a(cVar, "WorkName");
        if (!iVar5.equals(iVarA5)) {
            return new com.gamericefishpro.space.o8.a(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + iVar5 + "\n Found:\n" + iVarA5, 2);
        }
        HashMap map6 = new HashMap(2);
        map6.put("work_spec_id", new com.gamericefishpro.space.y5.f("work_spec_id", "TEXT", true, 1, null, 1));
        map6.put("progress", new com.gamericefishpro.space.y5.f("progress", "BLOB", true, 0, null, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new com.gamericefishpro.space.y5.g("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        com.gamericefishpro.space.y5.i iVar6 = new com.gamericefishpro.space.y5.i("WorkProgress", map6, hashSet10, new HashSet(0));
        com.gamericefishpro.space.y5.i iVarA6 = com.gamericefishpro.space.y5.i.a(cVar, "WorkProgress");
        if (!iVar6.equals(iVarA6)) {
            return new com.gamericefishpro.space.o8.a(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + iVar6 + "\n Found:\n" + iVarA6, 2);
        }
        HashMap map7 = new HashMap(2);
        map7.put("key", new com.gamericefishpro.space.y5.f("key", "TEXT", true, 1, null, 1));
        map7.put("long_value", new com.gamericefishpro.space.y5.f("long_value", "INTEGER", false, 0, null, 1));
        com.gamericefishpro.space.y5.i iVar7 = new com.gamericefishpro.space.y5.i("Preference", map7, new HashSet(0), new HashSet(0));
        com.gamericefishpro.space.y5.i iVarA7 = com.gamericefishpro.space.y5.i.a(cVar, "Preference");
        if (iVar7.equals(iVarA7)) {
            return new com.gamericefishpro.space.o8.a(true, (String) null, 2);
        }
        return new com.gamericefishpro.space.o8.a(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + iVar7 + "\n Found:\n" + iVarA7, 2);
    }

    public void A(float f, float f2, long j) {
        com.gamericefishpro.space.o1.q qVarJ = ((com.gamericefishpro.space.a8.c) this.e).j();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        qVarJ.g(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        qVarJ.c(f, f2);
        qVarJ.g(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void B(float f, float f2) {
        ((com.gamericefishpro.space.a8.c) this.e).j().g(f, f2);
    }

    public void D() {
        w3 w3Var = (w3) this.e;
        w3Var.r();
        r1 r1Var = (r1) w3Var.d;
        f1 f1Var = r1Var.w;
        r1.j(f1Var);
        com.gamericefishpro.space.z8.a aVar = r1Var.D;
        aVar.getClass();
        if (f1Var.B(System.currentTimeMillis())) {
            f1 f1Var2 = r1Var.w;
            r1.j(f1Var2);
            f1Var2.E.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                v0 v0Var = r1Var.y;
                r1.l(v0Var);
                v0Var.G.a("Detected application was in foreground");
                aVar.getClass();
                I(System.currentTimeMillis());
            }
        }
    }

    public void E(int i, String str, List list, boolean z, boolean z2) {
        t0 t0Var;
        l1 l1Var = (l1) this.e;
        int i2 = i - 1;
        if (i2 == 0) {
            v0 v0Var = ((r1) l1Var.d).y;
            r1.l(v0Var);
            t0Var = v0Var.F;
        } else if (i2 != 1) {
            if (i2 == 3) {
                v0 v0Var2 = ((r1) l1Var.d).y;
                r1.l(v0Var2);
                t0Var = v0Var2.G;
            } else if (i2 != 4) {
                v0 v0Var3 = ((r1) l1Var.d).y;
                r1.l(v0Var3);
                t0Var = v0Var3.E;
            } else if (z) {
                v0 v0Var4 = ((r1) l1Var.d).y;
                r1.l(v0Var4);
                t0Var = v0Var4.C;
            } else if (z2) {
                v0 v0Var5 = ((r1) l1Var.d).y;
                r1.l(v0Var5);
                t0Var = v0Var5.B;
            } else {
                v0 v0Var6 = ((r1) l1Var.d).y;
                r1.l(v0Var6);
                t0Var = v0Var6.D;
            }
        } else if (z) {
            v0 v0Var7 = ((r1) l1Var.d).y;
            r1.l(v0Var7);
            t0Var = v0Var7.z;
        } else if (z2) {
            v0 v0Var8 = ((r1) l1Var.d).y;
            r1.l(v0Var8);
            t0Var = v0Var8.y;
        } else {
            v0 v0Var9 = ((r1) l1Var.d).y;
            r1.l(v0Var9);
            t0Var = v0Var9.A;
        }
        int size = list.size();
        if (size == 1) {
            t0Var.b(list.get(0), str);
            return;
        }
        if (size == 2) {
            t0Var.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            t0Var.a(str);
        } else {
            t0Var.d(str, list.get(0), list.get(1), list.get(2));
        }
    }

    public void F(long j) {
        w3 w3Var = (w3) this.e;
        w3Var.r();
        w3Var.v();
        r1 r1Var = (r1) w3Var.d;
        f1 f1Var = r1Var.w;
        r1.j(f1Var);
        if (f1Var.B(j)) {
            r1.j(f1Var);
            f1Var.E.b(true);
            r1Var.q().w();
        }
        r1.j(f1Var);
        f1Var.I.b(j);
        if (f1Var.E.a()) {
            I(j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    public void G(d2 d2Var, int i) {
        com.gamericefishpro.space.n9.h hVar;
        if (i == -30) {
            hVar = com.gamericefishpro.space.n9.h.TCF;
        } else if (i == -20) {
            hVar = com.gamericefishpro.space.n9.h.API;
        } else if (i == -10) {
            hVar = com.gamericefishpro.space.n9.h.MANIFEST;
        } else if (i != 0) {
            hVar = i != 30 ? com.gamericefishpro.space.n9.h.UNSET : com.gamericefishpro.space.n9.h.INITIALIZATION;
        } else {
            hVar = com.gamericefishpro.space.n9.h.API;
        }
        ((EnumMap) this.e).put(d2Var, hVar);
    }

    public void I(long j) {
        w3 w3Var = (w3) this.e;
        w3Var.r();
        r1 r1Var = (r1) w3Var.d;
        if (r1Var.b()) {
            f1 f1Var = r1Var.w;
            r1.j(f1Var);
            f1Var.I.b(j);
            r1Var.D.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            v0Var.G.b(Long.valueOf(jElapsedRealtime), "Session started, time");
            long j2 = j / 1000;
            Long lValueOf = Long.valueOf(j2);
            t2 t2Var = r1Var.F;
            r1.k(t2Var);
            t2Var.C(j, lValueOf, "auto", "_sid");
            r1.j(f1Var);
            f1Var.J.b(j2);
            f1Var.E.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j2);
            r1.k(t2Var);
            t2Var.z(j, bundle, "auto", "_s");
            String strD = f1Var.O.d();
            if (TextUtils.isEmpty(strD)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strD);
            r1.k(t2Var);
            t2Var.z(j, bundle2, "auto", "_ssr");
        }
    }

    public void J(d2 d2Var, com.gamericefishpro.space.n9.h hVar) {
        ((EnumMap) this.e).put(d2Var, hVar);
    }

    @Override // com.gamericefishpro.space.n9.q4
    public void a(String str, String str2, Bundle bundle) {
        t2 t2Var = (t2) this.e;
        if (!TextUtils.isEmpty(str)) {
            t2Var.getClass();
            throw new IllegalStateException("Unexpected call on client side");
        }
        ((r1) t2Var.d).D.getClass();
        t2Var.w("auto", "_err", bundle, true, true, System.currentTimeMillis());
    }

    @Override // com.gamericefishpro.space.m.n
    public void b(i iVar, boolean z) {
        if (iVar instanceof s) {
            ((s) iVar).v.j().c(false);
        }
        n nVar = ((com.gamericefishpro.space.n.i) this.e).w;
        if (nVar != null) {
            nVar.b(iVar, z);
        }
    }

    @Override // com.gamericefishpro.space.m.n
    public boolean c(i iVar) {
        com.gamericefishpro.space.n.i iVar2 = (com.gamericefishpro.space.n.i) this.e;
        if (iVar == iVar2.i) {
            return false;
        }
        ((s) iVar).w.getClass();
        iVar2.getClass();
        n nVar = iVar2.w;
        if (nVar != null) {
            return nVar.c(iVar);
        }
        return false;
    }

    @Override // com.gamericefishpro.space.l4.c
    public Object d(com.gamericefishpro.space.l4.b bVar) {
        return ((com.gamericefishpro.space.db.a) this.e).invoke(bVar);
    }

    @Override // com.gamericefishpro.space.n.j1
    public void f(i iVar, j jVar) {
        f fVar = (f) this.e;
        Handler handler = fVar.y;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = fVar.A;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (iVar == ((e) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new r0(this, i2 < arrayList.size() ? (e) arrayList.get(i2) : null, jVar, iVar, 1, false), iVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // com.gamericefishpro.space.p5.c
    public void g(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case RequestError.STOP_TRACKING /* 11 */:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
        ((ProfileInstallReceiver) this.e).setResultCode(i);
    }

    @Override // com.gamericefishpro.space.l4.g
    public com.gamericefishpro.space.si.e j() {
        return ((com.gamericefishpro.space.l4.g) this.e).j();
    }

    @Override // com.gamericefishpro.space.n.j1
    public void k(i iVar, MenuItem menuItem) {
        ((f) this.e).y.removeCallbacksAndMessages(iVar);
    }

    @Override // com.gamericefishpro.space.d4.p
    public o1 l(View view, o1 o1Var) {
        com.gamericefishpro.space.d4.l1 l1Var = o1Var.a;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.e;
        if (!Objects.equals(coordinatorLayout.G, o1Var)) {
            coordinatorLayout.G = o1Var;
            boolean z = o1Var.a() > 0;
            coordinatorLayout.H = z;
            coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
            if (!l1Var.o()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    Field field = l0.a;
                    if (childAt.getFitsSystemWindows() && ((com.gamericefishpro.space.p3.c) childAt.getLayoutParams()).a != null && l1Var.o()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return o1Var;
    }

    @Override // com.gamericefishpro.space.l4.g
    public Object m(Function2 function2, com.gamericefishpro.space.th.a aVar) {
        return ((com.gamericefishpro.space.l4.g) this.e).m(new com.gamericefishpro.space.p4.c(function2, null, 0), aVar);
    }

    public void o() {
        ((u) this.e).getClass();
    }

    public boolean p(String str) {
        String strU = u(str);
        return "1".equals(strU) || Boolean.parseBoolean(strU);
    }

    public Integer q(String str) {
        String strU = u(str);
        if (TextUtils.isEmpty(strU)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strU));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + C(str) + "(" + strU + ") into an int");
            return null;
        }
    }

    public JSONArray r(String str) {
        String strU = u(str);
        if (TextUtils.isEmpty(strU)) {
            return null;
        }
        try {
            return new JSONArray(strU);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + C(str) + ": " + strU + ", falling back to default");
            return null;
        }
    }

    public String s(Resources resources, String str, String str2) {
        String[] strArr;
        String strU = u(str2);
        if (!TextUtils.isEmpty(strU)) {
            return strU;
        }
        String strU2 = u(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(strU2)) {
            return null;
        }
        int identifier = resources.getIdentifier(strU2, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", C(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray jSONArrayR = r(str2.concat("_loc_args"));
        if (jSONArrayR == null) {
            strArr = null;
        } else {
            int length = jSONArrayR.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = jSONArrayR.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + C(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e);
            return null;
        }
    }

    public String toString() {
        switch (this.d) {
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                StringBuilder sb = new StringBuilder("1");
                for (d2 d2Var : d2.values()) {
                    com.gamericefishpro.space.n9.h hVar = (com.gamericefishpro.space.n9.h) ((EnumMap) this.e).get(d2Var);
                    if (hVar == null) {
                        hVar = com.gamericefishpro.space.n9.h.UNSET;
                    }
                    sb.append(hVar.d);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public String u(String str) {
        Bundle bundle = (Bundle) this.e;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public void v(float f, float f2, float f3, float f4) {
        com.gamericefishpro.space.a8.c cVar = (com.gamericefishpro.space.a8.c) this.e;
        com.gamericefishpro.space.o1.q qVarJ = cVar.j();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (cVar.o() >> 32)) - (f3 + f);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (cVar.o() & 4294967295L)) - (f4 + f2))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
        if (!(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) >= 0.0f && Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) >= 0.0f)) {
            z.a("Width and height must be greater than or equal to zero");
        }
        cVar.H(jFloatToRawIntBits);
        qVarJ.g(f, f2);
    }

    public long w() {
        switch (this.d) {
            case 21:
                com.gamericefishpro.space.q0.h hVar = (com.gamericefishpro.space.q0.h) this.e;
                long jW = hVar.M.w();
                if (jW != 16) {
                    return jW;
                }
                t tVar = (t) com.gamericefishpro.space.h2.k.h(hVar, v.a);
                if (tVar != null) {
                    long j = tVar.a;
                    if (j != 16) {
                        return j;
                    }
                }
                return ((com.gamericefishpro.space.o1.s) com.gamericefishpro.space.h2.k.h(hVar, com.gamericefishpro.space.q0.f.a)).a;
            default:
                return ((w) this.e).c;
        }
    }

    public Bundle z() {
        Bundle bundle = (Bundle) this.e;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public d(EnumMap enumMap) {
        this.d = 8;
        EnumMap enumMap2 = new EnumMap(d2.class);
        this.e = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public d(com.gamericefishpro.space.db.a produceNewData) {
        this.d = 1;
        Intrinsics.checkNotNullParameter(produceNewData, "produceNewData");
        this.e = produceNewData;
    }

    public d(boolean z) {
        this.d = 18;
        this.e = new AtomicBoolean(z);
    }

    public d(int i) {
        this.d = i;
        switch (i) {
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                this.e = new EnumMap(d2.class);
                break;
            case 15:
                break;
            case 16:
                this.e = new Region();
                break;
            case 25:
                this.e = new SparseIntArray();
                new SparseIntArray();
                break;
            default:
                this.e = com.gamericefishpro.space.a.a.f(Looper.getMainLooper());
                break;
        }
    }

    public d(Bundle bundle) {
        this.d = 29;
        this.e = new Bundle(bundle);
    }

    public d(com.gamericefishpro.space.l4.g delegate) {
        this.d = 19;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.e = delegate;
    }

    @Override // com.gamericefishpro.space.n.f0
    public void e(int i) {
    }

    @Override // com.gamericefishpro.space.n.f0
    public void h(int i) {
    }

    @Override // com.gamericefishpro.space.n.f0
    public void i(int i, float f) {
    }
}
