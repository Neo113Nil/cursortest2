package com.gamericefishpro.space.n;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        com.gamericefishpro.space.d4.c cVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                cVar = new com.gamericefishpro.space.vb.c(clipData, 3);
            } else {
                com.gamericefishpro.space.d4.d dVar = new com.gamericefishpro.space.d4.d();
                dVar.e = clipData;
                dVar.i = 3;
                cVar = dVar;
            }
            com.gamericefishpro.space.d4.l0.h(textView, cVar.build());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        com.gamericefishpro.space.d4.c cVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            cVar = new com.gamericefishpro.space.vb.c(clipData, 3);
        } else {
            com.gamericefishpro.space.d4.d dVar = new com.gamericefishpro.space.d4.d();
            dVar.e = clipData;
            dVar.i = 3;
            cVar = dVar;
        }
        com.gamericefishpro.space.d4.l0.h(view, cVar.build());
        return true;
    }
}
