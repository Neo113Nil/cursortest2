package m;

import O.C0028d;
import O.InterfaceC0027c;
import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: m.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0240F {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0027c interfaceC0027c;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                interfaceC0027c = new B.b(clipData, 3);
            } else {
                C0028d c0028d = new C0028d();
                c0028d.f797b = clipData;
                c0028d.f798c = 3;
                interfaceC0027c = c0028d;
            }
            O.K.h(textView, interfaceC0027c.k());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0027c interfaceC0027c;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0027c = new B.b(clipData, 3);
        } else {
            C0028d c0028d = new C0028d();
            c0028d.f797b = clipData;
            c0028d.f798c = 3;
            interfaceC0027c = c0028d;
        }
        O.K.h(view, interfaceC0027c.k());
        return true;
    }
}
