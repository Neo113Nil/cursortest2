package defpackage;

import android.content.pm.ShortcutManager;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.YMApplication;
import ru.yandex.music.shortcuts.ShortcutsHelper$ShortcutsWorker;

/* loaded from: classes6.dex */
public final /* synthetic */ class sdq implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tqn b;
    public final /* synthetic */ YMApplication c;

    public /* synthetic */ sdq(tqn tqnVar, YMApplication yMApplication, int i) {
        this.a = i;
        this.b = tqnVar;
        this.c = yMApplication;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Continuation continuation = null;
        YMApplication yMApplication = this.c;
        tqn tqnVar = this.b;
        switch (i) {
            case 0:
                if (!tqnVar.a) {
                    tqnVar.a = true;
                    ShortcutManager i2 = l1b.i(yMApplication);
                    dq7 dq7Var = ca8.a;
                    x97.y(gld.e(mn7.d), null, null, new v5p(yMApplication, i2, continuation, 20), 3);
                    break;
                } else {
                    break;
                }
            default:
                if (!tqnVar.a) {
                    tqnVar.a = true;
                    g2j g2jVar = g2j.a;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    fa6 fa6Var = new fa6(new f1j(null), g2j.d, false, false, false, false, -1L, -1L, CollectionsKt.A0(linkedHashSet));
                    qkk qkkVar = new qkk(ShortcutsHelper$ShortcutsWorker.class, 1L, TimeUnit.DAYS);
                    ((t4w) qkkVar.c).j = fa6Var;
                    rkk rkkVar = (rkk) qkkVar.a();
                    g4w d = g4w.d(yMApplication);
                    d.getClass();
                    d.b("ShortcutsHelper", mpb.b, rkkVar);
                    break;
                } else {
                    break;
                }
        }
        return Unit.a;
    }
}
