package ru.yandex.taxi.jobs;

import android.content.Context;
import androidx.work.CoroutineWorker;
import defpackage.vnt;
import defpackage.wwg;
import defpackage.zzb;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0001B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/jobs/GoCoroutineJob;", "", "T", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Lvnt;", "params", "<init>", "(Landroid/content/Context;Lvnt;)V", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class GoCoroutineJob<T> extends CoroutineWorker {
    public final vnt c;

    public GoCoroutineJob(Context context, vnt vntVar) {
        super(context, vntVar.b());
        this.c = vntVar;
    }

    public final Object b() {
        return wwg.e(getApplicationContext(), ((zzb) this.c.a()).a());
    }
}
