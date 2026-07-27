package U;

import O.C0344f;
import O.InterfaceC0342e;
import O.InterfaceC0359v;
import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class r implements InterfaceC0359v {
    public final C0344f a(View view, C0344f c0344f) {
        CharSequence coerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c0344f);
        }
        if (c0344f.f2260a.c() == 2) {
            return c0344f;
        }
        InterfaceC0342e interfaceC0342e = c0344f.f2260a;
        ClipData d2 = interfaceC0342e.d();
        int w9 = interfaceC0342e.w();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z8 = false;
        for (int i = 0; i < d2.getItemCount(); i++) {
            ClipData.Item itemAt = d2.getItemAt(i);
            if ((w9 & 1) != 0) {
                coerceToStyledText = itemAt.coerceToText(context);
                if (coerceToStyledText instanceof Spanned) {
                    coerceToStyledText = coerceToStyledText.toString();
                }
            } else {
                coerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (coerceToStyledText != null) {
                if (z8) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), coerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, max2);
                    editable.replace(max, max2, coerceToStyledText);
                    z8 = true;
                }
            }
        }
        return null;
    }
}
