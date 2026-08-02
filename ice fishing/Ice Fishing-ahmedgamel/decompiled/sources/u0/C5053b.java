package u0;

import android.content.Context;
import com.google.android.gms.internal.ads.Wv;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import m.R0;
import y0.InterfaceC5196a;

/* renamed from: u0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5053b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f40949a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40950b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC5196a f40951c;

    /* renamed from: d, reason: collision with root package name */
    public final R0 f40952d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f40953e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f40954f;

    /* renamed from: g, reason: collision with root package name */
    public final int f40955g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f40956h;
    public final Executor i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f40957j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f40958k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashSet f40959l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f40960m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f40961n;

    public C5053b(Context context, String str, InterfaceC5196a interfaceC5196a, R0 migrationContainer, ArrayList arrayList, boolean z6, int i, Executor queryExecutor, Executor transactionExecutor, boolean z9, boolean z10, LinkedHashSet linkedHashSet, ArrayList typeConverters, ArrayList autoMigrationSpecs) {
        kotlin.jvm.internal.h.e(migrationContainer, "migrationContainer");
        Wv.n(i, "journalMode");
        kotlin.jvm.internal.h.e(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.h.e(transactionExecutor, "transactionExecutor");
        kotlin.jvm.internal.h.e(typeConverters, "typeConverters");
        kotlin.jvm.internal.h.e(autoMigrationSpecs, "autoMigrationSpecs");
        this.f40949a = context;
        this.f40950b = str;
        this.f40951c = interfaceC5196a;
        this.f40952d = migrationContainer;
        this.f40953e = arrayList;
        this.f40954f = z6;
        this.f40955g = i;
        this.f40956h = queryExecutor;
        this.i = transactionExecutor;
        this.f40957j = z9;
        this.f40958k = z10;
        this.f40959l = linkedHashSet;
        this.f40960m = typeConverters;
        this.f40961n = autoMigrationSpecs;
    }
}
