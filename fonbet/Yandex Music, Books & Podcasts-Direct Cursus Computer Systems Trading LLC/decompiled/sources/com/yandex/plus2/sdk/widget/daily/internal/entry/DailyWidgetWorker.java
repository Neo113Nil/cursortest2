package com.yandex.plus2.sdk.widget.daily.internal.entry;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.a87;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.ovn;
import defpackage.qcg;
import defpackage.qgg;
import defpackage.xq0;
import defpackage.y87;
import defpackage.z21;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/plus2/sdk/widget/daily/internal/entry/DailyWidgetWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "sdk-widget-daily"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class DailyWidgetWorker extends CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DailyWidgetWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Continuation continuation) {
        y87 y87Var;
        int i;
        if (continuation instanceof y87) {
            y87Var = (y87) continuation;
            int i2 = y87Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y87Var.l = i2 - Integer.MIN_VALUE;
                Object obj = y87Var.j;
                nm6 nm6Var = nm6.a;
                i = y87Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    if (this.b.c >= 3) {
                        return new qcg();
                    }
                    ovn ovnVar = a87.a;
                    z21 z21Var = new z21(2, 14, null);
                    y87Var.l = 1;
                    obj = ovnVar.B(z21Var, y87Var);
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
                obj.getClass();
                return obj;
            }
        }
        y87Var = new y87(this, (cg6) continuation);
        Object obj2 = y87Var.j;
        nm6 nm6Var2 = nm6.a;
        i = y87Var.l;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }
}
