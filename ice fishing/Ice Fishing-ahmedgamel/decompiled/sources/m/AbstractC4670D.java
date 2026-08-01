package m;

import O.C0327d;
import O.InterfaceC0325c;
import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import g1.C4522b;

/* renamed from: m.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4670D {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0325c interfaceC0325c;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                interfaceC0325c = new C4522b(clipData, 3);
            } else {
                C0327d c0327d = new C0327d();
                c0327d.f2066u = clipData;
                c0327d.f2067v = 3;
                interfaceC0325c = c0327d;
            }
            O.X.k(textView, interfaceC0325c.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0325c interfaceC0325c;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0325c = new C4522b(clipData, 3);
        } else {
            C0327d c0327d = new C0327d();
            c0327d.f2066u = clipData;
            c0327d.f2067v = 3;
            interfaceC0325c = c0327d;
        }
        O.X.k(view, interfaceC0325c.build());
        return true;
    }
}
