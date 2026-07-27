package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class CatchingFishJUnitRedux extends CatchingFishServiceFragment {
    public static List CatchingFishMutableLiveData(CatchingFishJUnitGson catchingFishJUnitGson) {
        Iterator it = catchingFishJUnitGson.iterator();
        if (!it.hasNext()) {
            return CatchingFishViewPagerDagger.CatchingFishReduxKtor;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return CatchingFishGsonCardView.CatchingFishFragmentFactory(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
