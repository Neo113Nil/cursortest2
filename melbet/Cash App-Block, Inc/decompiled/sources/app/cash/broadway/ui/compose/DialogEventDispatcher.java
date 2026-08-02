package app.cash.broadway.ui.compose;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class DialogEventDispatcher {
    public final ArrayList eventListeners = new ArrayList();

    public final void dispatch(DialogListenerEvent dialogListenerEvent) {
        Iterator it = this.eventListeners.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(dialogListenerEvent);
        }
    }
}
