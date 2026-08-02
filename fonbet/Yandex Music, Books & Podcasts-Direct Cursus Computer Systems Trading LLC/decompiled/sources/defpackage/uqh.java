package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class uqh extends qon {
    public final ArrayList d = new ArrayList();
    public final LayoutInflater e;
    public final Drawable f;
    public final Drawable g;
    public final Drawable h;
    public final Drawable i;
    public sqh j;
    public final int k;
    public final AccelerateDecelerateInterpolator l;
    public final /* synthetic */ wqh m;

    public uqh(wqh wqhVar) {
        this.m = wqhVar;
        Context context = wqhVar.n;
        this.e = LayoutInflater.from(context);
        this.f = v3g.F(context, R.attr.mediaRouteDefaultIconDrawable);
        this.g = v3g.F(context, R.attr.mediaRouteTvIconDrawable);
        this.h = v3g.F(context, R.attr.mediaRouteSpeakerIconDrawable);
        this.i = v3g.F(context, R.attr.mediaRouteSpeakerGroupIconDrawable);
        this.k = context.getResources().getInteger(R.integer.mr_cast_volume_slider_layout_animation_duration_ms);
        this.l = new AccelerateDecelerateInterpolator();
        x();
    }

    @Override // defpackage.qon
    public final int c() {
        return this.d.size() + 1;
    }

    @Override // defpackage.qon
    public final int f(int i) {
        sqh sqhVar;
        if (i == 0) {
            sqhVar = this.j;
        } else {
            sqhVar = (sqh) this.d.get(i - 1);
        }
        return sqhVar.b;
    }

    @Override // defpackage.qon
    public final void j(opn opnVar, int i) {
        g8c b;
        xqh xqhVar;
        ArrayList arrayList = this.d;
        int i2 = (i == 0 ? this.j : (sqh) arrayList.get(i - 1)).b;
        sqh sqhVar = i == 0 ? this.j : (sqh) arrayList.get(i - 1);
        wqh wqhVar = this.m;
        int i3 = 0;
        if (i2 == 1) {
            wqhVar.v.put(((irh) sqhVar.a).c, (oqh) opnVar);
            qqh qqhVar = (qqh) opnVar;
            View view = qqhVar.a;
            wqh wqhVar2 = qqhVar.A.m;
            if (wqhVar2.y0 && Collections.unmodifiableList(wqhVar2.i.v).size() > 1) {
                i3 = qqhVar.z;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i3;
            view.setLayoutParams(layoutParams);
            irh irhVar = (irh) sqhVar.a;
            qqhVar.t(irhVar);
            qqhVar.y.setText(irhVar.d);
            return;
        }
        if (i2 == 2) {
            ((rqh) opnVar).u.setText(sqhVar.a.toString());
            return;
        }
        if (i2 != 3) {
            if (i2 != 4) {
                e7o.n();
                return;
            }
            pqh pqhVar = (pqh) opnVar;
            View view2 = pqhVar.u;
            irh irhVar2 = (irh) sqhVar.a;
            pqhVar.z = irhVar2;
            ImageView imageView = pqhVar.v;
            imageView.setVisibility(0);
            pqhVar.w.setVisibility(4);
            uqh uqhVar = pqhVar.A;
            List unmodifiableList = Collections.unmodifiableList(uqhVar.m.i.v);
            view2.setAlpha((unmodifiableList.size() == 1 && unmodifiableList.get(0) == irhVar2) ? pqhVar.y : 1.0f);
            view2.setOnClickListener(new je(8, pqhVar));
            imageView.setImageDrawable(uqhVar.v(irhVar2));
            pqhVar.x.setText(irhVar2.d);
            return;
        }
        wqhVar.v.put(((irh) sqhVar.a).c, (oqh) opnVar);
        tqh tqhVar = (tqh) opnVar;
        float f = tqhVar.E;
        je jeVar = tqhVar.G;
        ImageView imageView2 = tqhVar.z;
        View view3 = tqhVar.y;
        CheckBox checkBox = tqhVar.D;
        irh irhVar3 = (irh) sqhVar.a;
        uqh uqhVar2 = tqhVar.H;
        wqh wqhVar3 = uqhVar2.m;
        if (irhVar3 == wqhVar3.i && Collections.unmodifiableList(irhVar3.v).size() > 0) {
            Iterator it = Collections.unmodifiableList(irhVar3.v).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                irh irhVar4 = (irh) it.next();
                if (!wqhVar3.k.contains(irhVar4)) {
                    irhVar3 = irhVar4;
                    break;
                }
            }
        }
        tqhVar.t(irhVar3);
        imageView2.setImageDrawable(uqhVar2.v(irhVar3));
        tqhVar.B.setText(irhVar3.d);
        checkBox.setVisibility(0);
        boolean v = tqhVar.v(irhVar3);
        boolean z = !wqhVar3.m.contains(irhVar3) && (!tqhVar.v(irhVar3) || Collections.unmodifiableList(wqhVar3.i.v).size() >= 2) && (!tqhVar.v(irhVar3) || ((b = wqhVar3.i.b(irhVar3)) != null && ((xqhVar = (xqh) b.a) == null || xqhVar.c)));
        checkBox.setChecked(v);
        tqhVar.A.setVisibility(4);
        imageView2.setVisibility(0);
        view3.setEnabled(z);
        checkBox.setEnabled(z);
        tqhVar.v.setEnabled(z || v);
        tqhVar.w.setEnabled(z || v);
        view3.setOnClickListener(jeVar);
        checkBox.setOnClickListener(jeVar);
        RelativeLayout relativeLayout = tqhVar.C;
        if (v && !tqhVar.u.e()) {
            i3 = tqhVar.F;
        }
        ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
        layoutParams2.height = i3;
        relativeLayout.setLayoutParams(layoutParams2);
        view3.setAlpha((z || v) ? 1.0f : f);
        checkBox.setAlpha((z || !v) ? 1.0f : f);
    }

    @Override // defpackage.qon
    public final opn m(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.e;
        if (i == 1) {
            return new qqh(this, layoutInflater.inflate(R.layout.mr_cast_group_volume_item, viewGroup, false));
        }
        if (i == 2) {
            return new rqh(layoutInflater.inflate(R.layout.mr_cast_header_item, viewGroup, false));
        }
        if (i == 3) {
            return new tqh(this, layoutInflater.inflate(R.layout.mr_cast_route_item, viewGroup, false));
        }
        if (i == 4) {
            return new pqh(this, layoutInflater.inflate(R.layout.mr_cast_group_item, viewGroup, false));
        }
        e7o.n();
        return null;
    }

    @Override // defpackage.qon
    public final void q(opn opnVar) {
        this.m.v.values().remove(opnVar);
    }

    public final void u(int i, View view) {
        tph tphVar = new tph(i, view.getLayoutParams().height, 1, view);
        tphVar.setAnimationListener(new ju9(1, this));
        tphVar.setDuration(this.k);
        tphVar.setInterpolator(this.l);
        view.startAnimation(tphVar);
    }

    public final Drawable v(irh irhVar) {
        Uri uri = irhVar.f;
        if (uri != null) {
            try {
                Drawable createFromStream = Drawable.createFromStream(this.m.n.getContentResolver().openInputStream(uri), null);
                if (createFromStream != null) {
                    return createFromStream;
                }
            } catch (IOException e) {
                Log.w("MediaRouteCtrlDialog", "Failed to load " + uri, e);
            }
        }
        int i = irhVar.n;
        return i != 1 ? i != 2 ? irhVar.e() ? this.i : this.f : this.h : this.g;
    }

    public final void w() {
        xqh xqhVar;
        wqh wqhVar = this.m;
        ArrayList arrayList = wqhVar.m;
        arrayList.clear();
        ArrayList arrayList2 = wqhVar.k;
        ArrayList arrayList3 = new ArrayList();
        hrh hrhVar = wqhVar.i.a;
        hrhVar.getClass();
        krh.b();
        for (irh irhVar : Collections.unmodifiableList(hrhVar.b)) {
            g8c b = wqhVar.i.b(irhVar);
            if (b != null && (xqhVar = (xqh) b.a) != null && xqhVar.d) {
                arrayList3.add(irhVar);
            }
        }
        HashSet hashSet = new HashSet(arrayList2);
        hashSet.removeAll(arrayList3);
        arrayList.addAll(hashSet);
        g();
    }

    public final void x() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        wqh wqhVar = this.m;
        ArrayList arrayList2 = wqhVar.l;
        Context context = wqhVar.n;
        ArrayList arrayList3 = wqhVar.k;
        this.j = new sqh(1, wqhVar.i);
        ArrayList arrayList4 = wqhVar.j;
        if (arrayList4.isEmpty()) {
            arrayList.add(new sqh(3, wqhVar.i));
        } else {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                arrayList.add(new sqh(3, (irh) it.next()));
            }
        }
        boolean z = false;
        if (!arrayList3.isEmpty()) {
            Iterator it2 = arrayList3.iterator();
            boolean z2 = false;
            while (it2.hasNext()) {
                irh irhVar = (irh) it2.next();
                if (!arrayList4.contains(irhVar)) {
                    if (!z2) {
                        wqhVar.i.getClass();
                        yqh a = irh.a();
                        String j = a != null ? a.j() : null;
                        if (TextUtils.isEmpty(j)) {
                            j = context.getString(R.string.mr_dialog_groupable_header);
                        }
                        arrayList.add(new sqh(2, j));
                        z2 = true;
                    }
                    arrayList.add(new sqh(3, irhVar));
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                irh irhVar2 = (irh) it3.next();
                irh irhVar3 = wqhVar.i;
                if (irhVar3 != irhVar2) {
                    if (!z) {
                        irhVar3.getClass();
                        yqh a2 = irh.a();
                        String k = a2 != null ? a2.k() : null;
                        if (TextUtils.isEmpty(k)) {
                            k = context.getString(R.string.mr_dialog_transferable_header);
                        }
                        arrayList.add(new sqh(2, k));
                        z = true;
                    }
                    arrayList.add(new sqh(4, irhVar2));
                }
            }
        }
        w();
    }
}
