package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* loaded from: classes11.dex */
public final class roq implements tls {
    public static final roq a = new roq();

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return LayoutInflater.from(((ViewGroup) obj).getContext());
    }
}
