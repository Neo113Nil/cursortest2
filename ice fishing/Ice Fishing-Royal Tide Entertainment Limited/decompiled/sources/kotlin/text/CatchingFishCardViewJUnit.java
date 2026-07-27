package kotlin.text;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class CatchingFishCardViewJUnit extends CatchingFishAdMobFirebase implements Runnable {
    public final WeakReference CatchingFishReduxKtor;

    public CatchingFishCardViewJUnit(EditText editText) {
        this.CatchingFishReduxKtor = new WeakReference(editText);
    }

    @Override // kotlin.text.CatchingFishAdMobFirebase
    public final void CatchingFishParcelableFAB() {
        Handler handler;
        EditText editText = (EditText) this.CatchingFishReduxKtor.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        CatchingFishFABRecyclerView.CatchingFishParcelableFAB((EditText) this.CatchingFishReduxKtor.get(), 1);
    }
}
