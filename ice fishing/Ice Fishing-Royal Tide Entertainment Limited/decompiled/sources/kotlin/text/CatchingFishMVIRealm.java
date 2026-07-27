package kotlin.text;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class CatchingFishMVIRealm implements KeyListener {
    public final KeyListener CatchingFishParcelableFAB;
    public final CatchingFishMVPExoPlayer CatchingFishSnackbar;

    public CatchingFishMVIRealm(KeyListener keyListener) {
        CatchingFishMVPExoPlayer catchingFishMVPExoPlayer = new CatchingFishMVPExoPlayer(18);
        this.CatchingFishParcelableFAB = keyListener;
        this.CatchingFishSnackbar = catchingFishMVPExoPlayer;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.CatchingFishParcelableFAB.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.CatchingFishParcelableFAB.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean z;
        this.CatchingFishSnackbar.getClass();
        if (i != 67 ? i != 112 ? false : CatchingFishAsyncTaskDagger.CatchingFishSpannableWidget(editable, keyEvent, true) : CatchingFishAsyncTaskDagger.CatchingFishSpannableWidget(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z = true;
        } else {
            z = false;
        }
        return z || this.CatchingFishParcelableFAB.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.CatchingFishParcelableFAB.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.CatchingFishParcelableFAB.onKeyUp(view, editable, i, keyEvent);
    }
}
