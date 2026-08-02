package com.yandex.plus.pay.ui.core.debug.internal.ui.log;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import defpackage.s9f;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class f implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;

    public /* synthetic */ f(h hVar, int i) {
        this.a = i;
        this.b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        h hVar = this.b;
        switch (i) {
            case 0:
                s9f s9fVar = (s9f) obj;
                s9fVar.getClass();
                try {
                    View findViewById = hVar.requireView().findViewById(R.id.logs_export_button);
                    if (findViewById != null) {
                        return (Button) findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
                } catch (ClassCastException e) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar, e);
                    return null;
                }
            case 1:
                s9f s9fVar2 = (s9f) obj;
                s9fVar2.getClass();
                try {
                    View findViewById2 = hVar.requireView().findViewById(R.id.logs_back_button);
                    if (findViewById2 != null) {
                        return (ImageButton) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
                } catch (ClassCastException e2) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar2, e2);
                    return null;
                }
            case 2:
                s9f s9fVar3 = (s9f) obj;
                s9fVar3.getClass();
                try {
                    View findViewById3 = hVar.requireView().findViewById(R.id.logs_filter_spinner);
                    if (findViewById3 != null) {
                        return (Spinner) findViewById3;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.Spinner");
                } catch (ClassCastException e3) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar3, e3);
                    return null;
                }
            case 3:
                s9f s9fVar4 = (s9f) obj;
                s9fVar4.getClass();
                try {
                    View findViewById4 = hVar.requireView().findViewById(R.id.logs_scroll_up_button);
                    if (findViewById4 != null) {
                        return (FloatingActionButton) findViewById4;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.floatingactionbutton.FloatingActionButton");
                } catch (ClassCastException e4) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar4, e4);
                    return null;
                }
            default:
                s9f s9fVar5 = (s9f) obj;
                s9fVar5.getClass();
                try {
                    View findViewById5 = hVar.requireView().findViewById(R.id.logs_recycler);
                    if (findViewById5 != null) {
                        return (RecyclerView) findViewById5;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                } catch (ClassCastException e5) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar5, e5);
                    return null;
                }
        }
    }
}
