package com.gamericefishpro.space.ca;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.d9.h;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class c<S> extends com.gamericefishpro.space.w4.e {
    public final LinkedHashSet J;
    public final LinkedHashSet K;

    public c() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.J = new LinkedHashSet();
        this.K = new LinkedHashSet();
    }

    public static boolean j(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(h.J(R.attr.materialCalendarStyle, context, a.class.getCanonicalName()).data, new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    @Override // com.gamericefishpro.space.w4.e, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.J.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // com.gamericefishpro.space.w4.e, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.K.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }
}
