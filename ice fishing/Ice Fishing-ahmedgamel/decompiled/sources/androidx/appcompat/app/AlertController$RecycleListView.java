package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import g.AbstractC4528a;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: n, reason: collision with root package name */
    public final int f4439n;

    /* renamed from: u, reason: collision with root package name */
    public final int f4440u;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4528a.f37569u);
        this.f4440u = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f4439n = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
