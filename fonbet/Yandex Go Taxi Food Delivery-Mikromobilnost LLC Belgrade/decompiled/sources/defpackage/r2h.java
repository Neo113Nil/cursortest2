package defpackage;

import android.os.SystemClock;
import com.yandex.go.flex.common.api.actions.DeeplinkNavigationAction;
import com.yandex.go.flex.common.api.actions.GoReloadLabeledSectionsAction;
import com.yandex.go.flex.common.api.actions.OpenSettingsAction;
import com.yandex.go.flex.common.router.settings.a;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class r2h implements dw {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public r2h(y50 y50Var) {
        this.a = 0;
        this.b = y50Var;
        this.c = new LinkedHashMap();
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        int i = this.a;
        int i2 = 5;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                DeeplinkNavigationAction deeplinkNavigationAction = (DeeplinkNavigationAction) krVar;
                long uptimeMillis = SystemClock.uptimeMillis();
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj2;
                linkedHashMap.values().removeIf(new md3(i2, new zk6(uptimeMillis, 1)));
                int i3 = linkedHashMap.get(deeplinkNavigationAction) != null ? 0 : 1;
                if (i3 != 0) {
                    linkedHashMap.put(deeplinkNavigationAction, Long.valueOf(uptimeMillis));
                }
                if (i3 != 0) {
                    ((a60) ((y50) obj)).c(deeplinkNavigationAction.a, v770.l);
                    break;
                }
                break;
            case 1:
                GoReloadLabeledSectionsAction goReloadLabeledSectionsAction = (GoReloadLabeledSectionsAction) krVar;
                dw dwVar = (dw) obj2;
                if (goReloadLabeledSectionsAction.b == null) {
                    u1m u1mVar = ((gfw0) obj).a;
                    goReloadLabeledSectionsAction = new GoReloadLabeledSectionsAction(goReloadLabeledSectionsAction.a, u1mVar != null ? u1mVar.c : null);
                }
                dwVar.handle(goReloadLabeledSectionsAction, n6uVar);
                break;
            default:
                ((pep0) ((oep0) obj2)).f(new xx70(7, (a) ((yvf0) obj).get(), new bm50(i2, (OpenSettingsAction) krVar, n6uVar)), zy11.a, hxx.a);
                break;
        }
    }

    public /* synthetic */ r2h(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
