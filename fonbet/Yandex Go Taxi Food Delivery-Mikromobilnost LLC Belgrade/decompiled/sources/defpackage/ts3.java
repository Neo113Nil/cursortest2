package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* loaded from: classes11.dex */
public final class ts3 implements tls {
    public static final ts3 a = new ts3();

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return LayoutInflater.from(((ViewGroup) obj).getContext());
    }
}
