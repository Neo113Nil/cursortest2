package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class yqy implements tls {
    public static final yqy a = new yqy();

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return LayoutInflater.from(((ViewGroup) obj).getContext());
    }
}
