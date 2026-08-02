package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class qe9 {
    public final wb8 a;
    public final ExecutorService b;

    public qe9(wb8 wb8Var, ExecutorService executorService) {
        this.a = wb8Var;
        this.b = executorService;
    }

    public final void a(bgg bggVar, dfb dfbVar, String str, int i, boolean z, Function1 function1, Function1 function12) {
        qe9 qe9Var;
        int i2;
        Function1 function13;
        Object obj = null;
        if (str != null) {
            qe9Var = this;
            i2 = i;
            function13 = function1;
            pe9 pe9Var = new pe9(dfbVar, function13, qe9Var, i2, function12);
            Future loadingTask = bggVar.getLoadingTask();
            if (loadingTask != null) {
                loadingTask.cancel(true);
            }
            cj3 cj3Var = new cj3(str, z, new sv4(23, pe9Var, bggVar));
            if (z) {
                cj3Var.run();
            } else {
                obj = qe9Var.b.submit(cj3Var);
            }
            if (obj != null) {
                bggVar.setTag(R.id.bitmap_load_references_tag, obj);
            }
            obj = Unit.a;
        } else {
            qe9Var = this;
            i2 = i;
            function13 = function1;
        }
        if (obj == null) {
            function13.invoke(qe9Var.a.a(i2));
        }
    }
}
