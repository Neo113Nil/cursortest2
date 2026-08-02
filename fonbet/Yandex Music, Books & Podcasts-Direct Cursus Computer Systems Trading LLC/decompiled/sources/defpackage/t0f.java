package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes5.dex */
public class t0f extends opn {
    public final Context u;

    public t0f(ViewGroup viewGroup, int i) {
        this(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
    }

    public t0f(View view) {
        super(view);
        this.u = view.getContext();
    }
}
