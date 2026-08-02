package U;

import O.C0336f;
import O.InterfaceC0334e;
import O.InterfaceC0351v;
import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class r implements InterfaceC0351v {
    public final C0336f a(View view, C0336f c0336f) {
        CharSequence coerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c0336f);
        }
        if (c0336f.f2162a.d() == 2) {
            return c0336f;
        }
        InterfaceC0334e interfaceC0334e = c0336f.f2162a;
        ClipData e9 = interfaceC0334e.e();
        int u6 = interfaceC0334e.u();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z6 = false;
        for (int i = 0; i < e9.getItemCount(); i++) {
            ClipData.Item itemAt = e9.getItemAt(i);
            if ((u6 & 1) != 0) {
                coerceToStyledText = itemAt.coerceToText(context);
                if (coerceToStyledText instanceof Spanned) {
                    coerceToStyledText = coerceToStyledText.toString();
                }
            } else {
                coerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (coerceToStyledText != null) {
                if (z6) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), coerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, max2);
                    editable.replace(max, max2, coerceToStyledText);
                    z6 = true;
                }
            }
        }
        return null;
    }
}
