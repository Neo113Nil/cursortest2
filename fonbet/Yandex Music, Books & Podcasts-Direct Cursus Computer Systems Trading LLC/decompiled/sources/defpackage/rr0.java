package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class rr0 {
    public static boolean a(@NonNull DragEvent dragEvent, @NonNull TextView textView, @NonNull Activity activity) {
        gc6 gc6Var;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                gc6Var = new fc6(clipData, 3);
            } else {
                hc6 hc6Var = new hc6();
                hc6Var.b = clipData;
                hc6Var.c = 3;
                gc6Var = hc6Var;
            }
            wdu.m(textView, gc6Var.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(@NonNull DragEvent dragEvent, @NonNull View view, @NonNull Activity activity) {
        gc6 gc6Var;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            gc6Var = new fc6(clipData, 3);
        } else {
            hc6 hc6Var = new hc6();
            hc6Var.b = clipData;
            hc6Var.c = 3;
            gc6Var = hc6Var;
        }
        wdu.m(view, gc6Var.build());
        return true;
    }
}
