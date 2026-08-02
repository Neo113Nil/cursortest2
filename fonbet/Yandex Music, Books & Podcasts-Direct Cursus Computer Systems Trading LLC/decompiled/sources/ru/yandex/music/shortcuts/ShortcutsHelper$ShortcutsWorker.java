package ru.yandex.music.shortcuts;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.cg6;
import defpackage.clc;
import defpackage.l1b;
import defpackage.nm6;
import defpackage.qcg;
import defpackage.qgg;
import defpackage.rdq;
import defpackage.ssg;
import defpackage.tcg;
import defpackage.vdq;
import defpackage.xq0;
import defpackage.zsd;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"ru/yandex/music/shortcuts/ShortcutsHelper$ShortcutsWorker", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class ShortcutsHelper$ShortcutsWorker extends CoroutineWorker {
    public final Context g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortcutsHelper$ShortcutsWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.g = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Continuation continuation) {
        rdq rdqVar;
        int i;
        try {
            if (continuation instanceof rdq) {
                rdqVar = (rdq) continuation;
                int i2 = rdqVar.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    rdqVar.l = i2 - Integer.MIN_VALUE;
                    Object obj = rdqVar.j;
                    nm6 nm6Var = nm6.a;
                    i = rdqVar.l;
                    Context context = this.g;
                    if (i != 0) {
                        qgg.h0(obj);
                        clc a = vdq.a(context);
                        rdqVar.l = 1;
                        obj = zsd.g0(a, rdqVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    l1b.i(context).setDynamicShortcuts((List) obj);
                    return tcg.a();
                }
            }
            if (i != 0) {
            }
            l1b.i(context).setDynamicShortcuts((List) obj);
            return tcg.a();
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            ssg.a(7, "ShortcutsWorker", "job failed", e2);
            return new qcg();
        }
        rdqVar = new rdq(this, (cg6) continuation);
        Object obj2 = rdqVar.j;
        nm6 nm6Var2 = nm6.a;
        i = rdqVar.l;
        Context context2 = this.g;
    }
}
