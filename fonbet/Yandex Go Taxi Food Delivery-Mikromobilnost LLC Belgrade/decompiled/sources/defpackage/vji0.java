package defpackage;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public interface vji0 {
    boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent);

    void onRequestDisallowInterceptTouchEvent(boolean z);

    void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent);
}
