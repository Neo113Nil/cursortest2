package b4;

import android.content.Context;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f947a;

    /* renamed from: b, reason: collision with root package name */
    public final String f948b;

    /* renamed from: c, reason: collision with root package name */
    public final h4.c f949c;

    /* renamed from: d, reason: collision with root package name */
    public final l f950d;

    /* renamed from: e, reason: collision with root package name */
    public final List f951e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f952f;

    /* renamed from: g, reason: collision with root package name */
    public final int f953g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f954h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f955i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f956j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f957k;

    /* renamed from: l, reason: collision with root package name */
    public final Set f958l;

    public b(Context context, String str, h4.c cVar, l lVar, List list, boolean z10, int i10, Executor executor, Executor executor2, boolean z11, boolean z12, Set set, List list2, List list3) {
        pc.j.e(lVar, "migrationContainer");
        a4.d.t("journalMode", i10);
        pc.j.e(executor, "queryExecutor");
        pc.j.e(executor2, "transactionExecutor");
        pc.j.e(list2, "typeConverters");
        pc.j.e(list3, "autoMigrationSpecs");
        this.f947a = context;
        this.f948b = str;
        this.f949c = cVar;
        this.f950d = lVar;
        this.f951e = list;
        this.f952f = z10;
        this.f953g = i10;
        this.f954h = executor;
        this.f955i = executor2;
        this.f956j = z11;
        this.f957k = z12;
        this.f958l = set;
    }
}
