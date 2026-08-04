package com.gamericefishpro.space.i2;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 {
    public final /* synthetic */ int a;
    public int b;
    public boolean c;
    public final Object d;
    public final Object e;

    public i1(SideSheetBehavior sideSheetBehavior) {
        this.a = 1;
        this.e = sideSheetBehavior;
        this.d = new com.appsflyer.a(10, this);
    }

    public void a(int i) {
        switch (this.a) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.e;
                WeakReference weakReference = sideSheetBehavior.p;
                if (weakReference != null && weakReference.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        ((View) sideSheetBehavior.p.get()).postOnAnimation((com.appsflyer.a) this.d);
                        this.c = true;
                    }
                    break;
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.e;
                WeakReference weakReference2 = bottomSheetBehavior.W;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        ((View) bottomSheetBehavior.W.get()).postOnAnimation((com.gamericefishpro.space.h4.b) this.d);
                        this.c = true;
                    }
                    break;
                }
                break;
        }
    }

    public i1(BottomSheetBehavior bottomSheetBehavior) {
        this.a = 2;
        this.e = bottomSheetBehavior;
        this.d = new com.gamericefishpro.space.h4.b(29, this);
    }

    public i1(Context context, m mVar) {
        this.a = 0;
        this.d = mVar;
        this.b = 0;
        this.e = new GestureDetector(context, new h1(this));
    }
}
