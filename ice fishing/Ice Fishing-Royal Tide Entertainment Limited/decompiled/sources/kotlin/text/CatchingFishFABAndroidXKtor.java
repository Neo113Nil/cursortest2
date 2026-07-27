package kotlin.text;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import java.util.Objects;

/* loaded from: classes.dex */
public final class CatchingFishFABAndroidXKtor {
    public static CatchingFishMVIOkHttp CatchingFishParcelableFAB(View view, CatchingFishMVIOkHttp catchingFishMVIOkHttp) {
        CharSequence coerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Objects.toString(catchingFishMVIOkHttp);
        }
        CatchingFishIntentReduxMVVM catchingFishIntentReduxMVVM = catchingFishMVIOkHttp.CatchingFishParcelableFAB;
        if (catchingFishIntentReduxMVVM.CatchingFishUnitTesting() == 2) {
            return catchingFishMVIOkHttp;
        }
        ClipData CatchingFishReduxKtor = catchingFishIntentReduxMVVM.CatchingFishReduxKtor();
        int CatchingFishFragmentHandler = catchingFishIntentReduxMVVM.CatchingFishFragmentHandler();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < CatchingFishReduxKtor.getItemCount(); i++) {
            ClipData.Item itemAt = CatchingFishReduxKtor.getItemAt(i);
            if ((CatchingFishFragmentHandler & 1) != 0) {
                coerceToStyledText = itemAt.coerceToText(context);
                if (coerceToStyledText instanceof Spanned) {
                    coerceToStyledText = coerceToStyledText.toString();
                }
            } else {
                coerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (coerceToStyledText != null) {
                if (z) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), coerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, max2);
                    editable.replace(max, max2, coerceToStyledText);
                    z = true;
                }
            }
        }
        return null;
    }
}
