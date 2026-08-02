package androidx.recyclerview.widget;

import android.view.View;

/* loaded from: classes3.dex */
public interface ViewBoundsCheck$Callback {
    View getChildAt(int i);

    int getChildEnd(View view);

    int getChildStart(View view);

    int getParentEnd();

    int getParentStart();
}
