package m;

import O.C0332d;
import O.InterfaceC0330c;
import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import i1.C4586c;

/* renamed from: m.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4682D {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0330c interfaceC0330c;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                interfaceC0330c = new C4586c(clipData, 3);
            } else {
                C0332d c0332d = new C0332d();
                c0332d.f2154u = clipData;
                c0332d.f2155v = 3;
                interfaceC0330c = c0332d;
            }
            O.X.k(textView, interfaceC0330c.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0330c interfaceC0330c;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0330c = new C4586c(clipData, 3);
        } else {
            C0332d c0332d = new C0332d();
            c0332d.f2154u = clipData;
            c0332d.f2155v = 3;
            interfaceC0330c = c0332d;
        }
        O.X.k(view, interfaceC0330c.build());
        return true;
    }
}
