package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* loaded from: classes6.dex */
public final class ukg implements tls {
    public static final ukg a = new ukg();

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return LayoutInflater.from(((ViewGroup) obj).getContext());
    }
}
