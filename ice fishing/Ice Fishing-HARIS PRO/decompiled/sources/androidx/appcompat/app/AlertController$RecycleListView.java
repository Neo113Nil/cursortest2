package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import g.AbstractC0155a;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final int f1743a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1744b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0155a.f3050t);
        this.f1744b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f1743a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
