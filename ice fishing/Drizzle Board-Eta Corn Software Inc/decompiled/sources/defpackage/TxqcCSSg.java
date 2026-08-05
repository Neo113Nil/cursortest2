package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class TxqcCSSg {
    public static boolean NCTxEWno(DragEvent dragEvent, View view, Activity activity) {
        z8 z8Var;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            z8Var = new tg0(clipData, 3);
        } else {
            a9 a9Var = new a9();
            a9Var.MdtA4re8 = clipData;
            a9Var.wxUZMvaN = 3;
            z8Var = a9Var;
        }
        hg0.Qr9iLBAD(view, z8Var.build());
        return true;
    }

    public static boolean qoPGr6Ce(DragEvent dragEvent, TextView textView, Activity activity) {
        z8 z8Var;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                z8Var = new tg0(clipData, 3);
            } else {
                a9 a9Var = new a9();
                a9Var.MdtA4re8 = clipData;
                a9Var.wxUZMvaN = 3;
                z8Var = a9Var;
            }
            hg0.Qr9iLBAD(textView, z8Var.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }
}
