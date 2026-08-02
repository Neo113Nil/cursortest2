package ru.rt.ebs.cryptosdk.presentation.verification;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.ny61;
import defpackage.tls;
import defpackage.win;
import defpackage.xoh0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes4.dex */
public final /* synthetic */ class a extends FunctionReferenceImpl implements tls {
    public static final a b = new a();

    public a() {
        super(1, 0, win.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lru/rt/ebs/cryptosdk/databinding/EbsActVerificationBinding;");
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        View inflate = ((LayoutInflater) obj).inflate(xoh0.ebs_act_verification, (ViewGroup) null, false);
        if (inflate != null) {
            return new win(0, (FrameLayout) inflate);
        }
        ny61.t("rootView");
        return null;
    }
}
