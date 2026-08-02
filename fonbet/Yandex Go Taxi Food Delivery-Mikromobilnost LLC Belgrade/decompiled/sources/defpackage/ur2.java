package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.b;

/* loaded from: classes10.dex */
public abstract class ur2 {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        jge jgeVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                jgeVar = new gyc(clipData, 3);
            } else {
                kge kgeVar = new kge();
                kgeVar.b = clipData;
                kgeVar.c = 3;
                jgeVar = kgeVar;
            }
            b.l(textView, jgeVar.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        jge jgeVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            jgeVar = new gyc(clipData, 3);
        } else {
            kge kgeVar = new kge();
            kgeVar.b = clipData;
            kgeVar.c = 3;
            jgeVar = kgeVar;
        }
        b.l(view, jgeVar.build());
        return true;
    }
}
