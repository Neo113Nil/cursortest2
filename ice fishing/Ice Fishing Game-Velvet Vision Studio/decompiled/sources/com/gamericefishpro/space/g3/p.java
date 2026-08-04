package com.gamericefishpro.space.g3;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends ViewOutlineProvider {
    public final /* synthetic */ int a;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 1:
                Intrinsics.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                com.gamericefishpro.space.m5.a.s(view);
                throw null;
            default:
                if (!(view instanceof com.gamericefishpro.space.r1.l) || (outline2 = ((com.gamericefishpro.space.r1.l) view).w) == null) {
                    return;
                }
                outline.set(outline2);
                return;
        }
    }
}
