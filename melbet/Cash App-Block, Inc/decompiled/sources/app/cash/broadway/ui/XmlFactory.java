package app.cash.broadway.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class XmlFactory {
    public static View inflate(Context context, int i, ViewGroup viewGroup, Integer num) {
        context.getClass();
        if (num != null) {
            context = new ContextThemeWrapper(context, num.intValue());
        }
        View inflate = LayoutInflater.from(context).cloneInContext(context).inflate(i, viewGroup, false);
        inflate.getClass();
        return inflate;
    }
}
