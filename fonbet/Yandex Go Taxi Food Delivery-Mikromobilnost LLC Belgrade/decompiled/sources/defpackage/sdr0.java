package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class sdr0 implements tls {
    public static final sdr0 a = new sdr0();

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return LayoutInflater.from(((ViewGroup) obj).getContext());
    }
}
