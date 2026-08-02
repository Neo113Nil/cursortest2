package ru.kinopoisk.sdk.easylogin.internal;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import defpackage.ehv;
import defpackage.qzm;
import defpackage.sn5;
import defpackage.wn5;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.cc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1001cc {
    public static ComposeView a(Context context, qzm[] qzmVarArr, sn5 sn5Var) {
        N4 n4 = N4.Old;
        ehv ehvVar = ehv.i;
        context.getClass();
        n4.getClass();
        qzmVarArr.getClass();
        sn5Var.getClass();
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ehvVar);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        composeView.setContent(new wn5(new C0987bc(qzmVarArr, sn5Var), 1122935689, true));
        return composeView;
    }
}
