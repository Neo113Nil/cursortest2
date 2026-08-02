package com.yandex.passport.internal.ui;

import android.content.DialogInterface;
import com.yandex.passport.internal.analytics.y;
import com.yandex.passport.internal.entities.t;
import com.yandex.passport.internal.ui.authbytrack.AuthByTrackActivity;
import com.yandex.passport.internal.ui.challenge.delete.DeleteForeverActivity;
import com.yandex.passport.internal.ui.challenge.delete.s;
import com.yandex.passport.internal.ui.social.o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((c) obj).finish();
                return;
            case 1:
                AuthByTrackActivity authByTrackActivity = (AuthByTrackActivity) obj;
                y yVar = authByTrackActivity.d;
                if (yVar == null) {
                    Intrinsics.j("reporter");
                    throw null;
                }
                t tVar = authByTrackActivity.f;
                if (tVar == null) {
                    Intrinsics.j("trackId");
                    throw null;
                }
                yVar.a(tVar);
                authByTrackActivity.finish();
                return;
            case 2:
                int i2 = DeleteForeverActivity.j;
                ((DeleteForeverActivity) obj).n().H(s.b);
                return;
            case 3:
                String str = o.k;
                ((androidx.fragment.app.t) obj).getOnBackPressedDispatcher().d();
                return;
            default:
                String str2 = com.yandex.passport.internal.ui.tv.c.m;
                androidx.fragment.app.t requireActivity = ((com.yandex.passport.internal.ui.tv.c) obj).requireActivity();
                requireActivity.setResult(0);
                requireActivity.finish();
                return;
        }
    }
}
