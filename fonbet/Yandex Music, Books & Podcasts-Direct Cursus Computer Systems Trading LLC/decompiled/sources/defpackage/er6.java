package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.i;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class er6 extends i {
    public final dl g;
    public final cvl h;
    public final Function1 i;

    public er6(dl dlVar, cvl cvlVar, Function1 function1) {
        this.g = dlVar;
        this.h = cvlVar;
        this.i = function1;
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, 0);
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(new wn5(new dr6(this, 0), 727447909, true));
        return composeView;
    }
}
