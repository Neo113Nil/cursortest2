package u0;

import android.content.Context;
import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import t0.C4986A;
import y0.InterfaceC5201a;

/* renamed from: u0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5052b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f40987a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40988b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC5201a f40989c;

    /* renamed from: d, reason: collision with root package name */
    public final C4986A f40990d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f40991e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f40992f;

    /* renamed from: g, reason: collision with root package name */
    public final int f40993g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f40994h;
    public final Executor i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f40995j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f40996k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashSet f40997l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f40998m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f40999n;

    public C5052b(Context context, String str, InterfaceC5201a interfaceC5201a, C4986A migrationContainer, ArrayList arrayList, boolean z3, int i, Executor queryExecutor, Executor transactionExecutor, boolean z6, boolean z9, LinkedHashSet linkedHashSet, ArrayList typeConverters, ArrayList autoMigrationSpecs) {
        kotlin.jvm.internal.h.e(migrationContainer, "migrationContainer");
        AbstractC4404f.l(i, "journalMode");
        kotlin.jvm.internal.h.e(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.h.e(transactionExecutor, "transactionExecutor");
        kotlin.jvm.internal.h.e(typeConverters, "typeConverters");
        kotlin.jvm.internal.h.e(autoMigrationSpecs, "autoMigrationSpecs");
        this.f40987a = context;
        this.f40988b = str;
        this.f40989c = interfaceC5201a;
        this.f40990d = migrationContainer;
        this.f40991e = arrayList;
        this.f40992f = z3;
        this.f40993g = i;
        this.f40994h = queryExecutor;
        this.i = transactionExecutor;
        this.f40995j = z6;
        this.f40996k = z9;
        this.f40997l = linkedHashSet;
        this.f40998m = typeConverters;
        this.f40999n = autoMigrationSpecs;
    }
}
