package kotlin.text;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class CatchingFishMVPCustomView extends CatchingFishAdMobFirebase implements Runnable {
    public final WeakReference CatchingFishDaggerWebsocket;
    public final WeakReference CatchingFishReduxKtor;

    public CatchingFishMVPCustomView(TextView textView, CatchingFishViewRealm catchingFishViewRealm) {
        this.CatchingFishReduxKtor = new WeakReference(textView);
        this.CatchingFishDaggerWebsocket = new WeakReference(catchingFishViewRealm);
    }

    @Override // kotlin.text.CatchingFishAdMobFirebase
    public final void CatchingFishParcelableFAB() {
        Handler handler;
        TextView textView = (TextView) this.CatchingFishReduxKtor.get();
        if (textView == null || (handler = textView.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.CatchingFishReduxKtor.get();
        InputFilter inputFilter = (InputFilter) this.CatchingFishDaggerWebsocket.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    CatchingFishMVPOkHttpMVP CatchingFishParcelableFAB = CatchingFishMVPOkHttpMVP.CatchingFishParcelableFAB();
                    if (text == null) {
                        length = 0;
                    } else {
                        CatchingFishParcelableFAB.getClass();
                        length = text.length();
                    }
                    CharSequence CatchingFishDaggerWebsocket = CatchingFishParcelableFAB.CatchingFishDaggerWebsocket(text, 0, length);
                    if (text == CatchingFishDaggerWebsocket) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(CatchingFishDaggerWebsocket);
                    int selectionEnd = Selection.getSelectionEnd(CatchingFishDaggerWebsocket);
                    textView.setText(CatchingFishDaggerWebsocket);
                    if (CatchingFishDaggerWebsocket instanceof Spannable) {
                        Spannable spannable = (Spannable) CatchingFishDaggerWebsocket;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
