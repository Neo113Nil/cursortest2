package com.yandex.passport.internal.ui.bouncer.roundabout;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.lightside.slab.SlotView;
import com.yandex.passport.R;
import defpackage.b6;
import defpackage.ezf;
import defpackage.g4i;
import defpackage.hdu;
import defpackage.ldg;
import defpackage.ldu;
import defpackage.ndu;
import defpackage.rof;
import defpackage.tot;
import defpackage.trq;
import defpackage.vwo;
import defpackage.wdu;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public final class s extends b6 {
    public final trq d;
    public final vwo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(Activity activity) {
        super(activity, 10);
        activity.getClass();
        SlotView slotView = new SlotView(ezf.a0(activity, 0), null, 0, 0);
        boolean z = this instanceof rof;
        if (z) {
            ((rof) this).j(slotView);
        }
        trq trqVar = new trq(slotView);
        this.d = trqVar;
        vwo vwoVar = new vwo(ezf.a0(activity, 0), 0, 0);
        if (z) {
            ((rof) this).j(vwoVar);
        }
        int i = (int) (8 * g4i.a.density);
        vwoVar.setPadding(i, i, i, i);
        ldg.H(R.color.passport_roundabout_background, vwoVar);
        View view = trqVar.a;
        ezf.a0(vwoVar.getCtx(), 0).getClass();
        vwoVar.j(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.setLayoutParams(layoutParams == null ? new ViewGroup.LayoutParams(-1, -2) : layoutParams);
        if (vwoVar.isAttachedToWindow()) {
            WeakHashMap weakHashMap = wdu.a;
            ldu.c(vwoVar);
        } else {
            vwoVar.addOnAttachStateChangeListener(new n(1, vwoVar, vwoVar));
        }
        this.e = vwoVar;
    }

    @Override // defpackage.b6
    public final View z(hdu hduVar) {
        Context ctx = hduVar.getCtx();
        ctx.getClass();
        vwo vwoVar = this.e;
        vwoVar.getClass();
        r rVar = new r(ctx);
        rVar.addView(vwoVar);
        tot totVar = new tot(19, rVar);
        WeakHashMap weakHashMap = wdu.a;
        ndu.n(rVar, totVar);
        return rVar;
    }
}
