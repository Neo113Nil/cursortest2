package kotlin.text;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class CatchingFishToastMVIRoom {
    public static boolean CatchingFishParcelableFAB(DragEvent dragEvent, TextView textView, Activity activity) {
        CatchingFishGsonBundleMoshi catchingFishGsonBundleMoshi;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                catchingFishGsonBundleMoshi = new CatchingFishServiceHilt(clipData, 3);
            } else {
                CatchingFishStripeAPIKtor catchingFishStripeAPIKtor = new CatchingFishStripeAPIKtor();
                catchingFishStripeAPIKtor.CatchingFishDaggerWebsocket = clipData;
                catchingFishStripeAPIKtor.CatchingFishWorkManager = 3;
                catchingFishGsonBundleMoshi = catchingFishStripeAPIKtor;
            }
            CatchingFishFABCameraX.CatchingFishLayout(textView, catchingFishGsonBundleMoshi.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean CatchingFishSnackbar(DragEvent dragEvent, View view, Activity activity) {
        CatchingFishGsonBundleMoshi catchingFishGsonBundleMoshi;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            catchingFishGsonBundleMoshi = new CatchingFishServiceHilt(clipData, 3);
        } else {
            CatchingFishStripeAPIKtor catchingFishStripeAPIKtor = new CatchingFishStripeAPIKtor();
            catchingFishStripeAPIKtor.CatchingFishDaggerWebsocket = clipData;
            catchingFishStripeAPIKtor.CatchingFishWorkManager = 3;
            catchingFishGsonBundleMoshi = catchingFishStripeAPIKtor;
        }
        CatchingFishFABCameraX.CatchingFishLayout(view, catchingFishGsonBundleMoshi.build());
        return true;
    }
}
