package ru.yandex.music.widget;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.aon;
import defpackage.cg6;
import defpackage.f9r;
import defpackage.hag;
import defpackage.jyr;
import defpackage.knv;
import defpackage.l18;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.tcg;
import defpackage.viu;
import defpackage.vq2;
import defpackage.xq0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/music/widget/VivoWidgetUpdateWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class VivoWidgetUpdateWorker extends CoroutineWorker {
    public final Context g;
    public final jyr h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VivoWidgetUpdateWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.g = context;
        this.h = l18.b.b(hag.I(knv.class), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Continuation continuation) {
        viu viuVar;
        int i;
        if (continuation instanceof viu) {
            viuVar = (viu) continuation;
            int i2 = viuVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                viuVar.l = i2 - Integer.MIN_VALUE;
                Object obj = viuVar.j;
                nm6 nm6Var = nm6.a;
                i = viuVar.l;
                jyr jyrVar = this.h;
                if (i != 0) {
                    qgg.h0(obj);
                    aon aonVar = (aon) ((knv) jyrVar.getValue()).k.getValue();
                    f9r f9rVar = (f9r) ((knv) jyrVar.getValue()).l.getValue();
                    viuVar.l = 1;
                    if (vq2.S(this.g, aonVar, f9rVar, viuVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                ((knv) jyrVar.getValue()).a().b();
                return tcg.a();
            }
        }
        viuVar = new viu(this, (cg6) continuation);
        Object obj2 = viuVar.j;
        nm6 nm6Var2 = nm6.a;
        i = viuVar.l;
        jyr jyrVar2 = this.h;
        if (i != 0) {
        }
        ((knv) jyrVar2.getValue()).a().b();
        return tcg.a();
    }
}
