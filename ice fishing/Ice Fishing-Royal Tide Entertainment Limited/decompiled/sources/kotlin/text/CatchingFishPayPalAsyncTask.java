package kotlin.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class CatchingFishPayPalAsyncTask extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public final /* synthetic */ Set CatchingFishLayout;
    public /* synthetic */ Object CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishPayPalAsyncTask(Set set, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishLayout = set;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        CatchingFishPayPalAsyncTask catchingFishPayPalAsyncTask = new CatchingFishPayPalAsyncTask(this.CatchingFishLayout, catchingFishWebsocketGradle);
        catchingFishPayPalAsyncTask.CatchingFishViewModelFAB = obj;
        return catchingFishPayPalAsyncTask;
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        return ((CatchingFishPayPalAsyncTask) CatchingFishCloudMessaging((CatchingFishDaggerHiltMVI) obj, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final Object CatchingFishOkHttp(Object obj) {
        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
        Set keySet = ((CatchingFishDaggerHiltMVI) this.CatchingFishViewModelFAB).CatchingFishParcelableFAB().keySet();
        ArrayList arrayList = new ArrayList(CatchingFishLayoutToast.CatchingFishParcelable(keySet));
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((CatchingFishXMLLayoutRedux) it.next()).CatchingFishParcelableFAB);
        }
        LinkedHashSet linkedHashSet = CatchingFishSnackbarService.CatchingFishParcelableFAB;
        boolean z = true;
        Set set = this.CatchingFishLayout;
        if (set != linkedHashSet) {
            Set set2 = set;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    if (!arrayList.contains((String) it2.next())) {
                        break;
                    }
                }
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
