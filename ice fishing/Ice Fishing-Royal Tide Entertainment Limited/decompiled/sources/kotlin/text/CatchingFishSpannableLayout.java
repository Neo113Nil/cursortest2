package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class CatchingFishSpannableLayout implements CatchingFishGlideParcelable {
    public static final AtomicReference CatchingFishParcelableFAB = new AtomicReference();

    @Override // kotlin.text.CatchingFishGlideParcelable
    public final void CatchingFishParcelableFAB(boolean z) {
        synchronized (com.google.firebase.CatchingFishPagingLibrary.CatchingFishCloudMessaging) {
            try {
                ArrayList arrayList = new ArrayList(com.google.firebase.CatchingFishPagingLibrary.CatchingFishEspressoTesting.values());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    com.google.firebase.CatchingFishPagingLibrary catchingFishPagingLibrary = (com.google.firebase.CatchingFishPagingLibrary) obj;
                    if (catchingFishPagingLibrary.CatchingFishDaggerWebsocket.get()) {
                        Iterator it = catchingFishPagingLibrary.CatchingFishLayout.iterator();
                        while (it.hasNext()) {
                            com.google.firebase.CatchingFishPagingLibrary catchingFishPagingLibrary2 = ((CatchingFishContextKtorFlux) it.next()).CatchingFishParcelableFAB;
                            if (!z) {
                                ((CatchingFishXMLLayoutAdMob) catchingFishPagingLibrary2.CatchingFishViewModelFAB.get()).CatchingFishSnackbar();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
