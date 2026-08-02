package ru.yandex.taxi.map.overlay.diagnostic.journal;

import android.content.Context;
import android.view.View;
import androidx.core.view.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a8z;
import defpackage.b8z;
import defpackage.c8z;
import defpackage.d8z;
import defpackage.e8z;
import defpackage.g0c;
import defpackage.he7;
import defpackage.lj1;
import defpackage.lki;
import defpackage.qoi0;
import defpackage.qth0;
import defpackage.rp31;
import defpackage.tih0;
import defpackage.x43;
import defpackage.xng0;
import defpackage.xpy;
import defpackage.z7z;
import defpackage.zxs;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0014\u0010 \u001a\u00020\u00198TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001b¨\u0006!"}, d2 = {"Lru/yandex/taxi/map/overlay/diagnostic/journal/LocationDiagnosticModalView;", "Lru/yandex/taxi/widget/SlideableModalView;", "Lc8z;", "Landroid/content/Context;", "context", "Ld8z;", "presenter", "<init>", "(Landroid/content/Context;Ld8z;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "La8z;", "coordinatesUpdateModelList", "updateCoordinatesJournal", "(Ljava/util/List;)V", "Ld8z;", "Landroidx/recyclerview/widget/RecyclerView;", "coordinatesUpdateList", "Landroidx/recyclerview/widget/RecyclerView;", "Lz7z;", "adapter", "Lz7z;", "", "getFullscreenBackgroundAttrRes", "()I", "fullscreenBackgroundAttrRes", "getSlideableBackgroundAttrRes", "slideableBackgroundAttrRes", "getCardContentViewLayoutRes", "cardContentViewLayoutRes", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LocationDiagnosticModalView extends SlideableModalView implements c8z {
    private final z7z adapter;
    private final RecyclerView coordinatesUpdateList;
    private final d8z presenter;

    public LocationDiagnosticModalView(Context context, d8z d8zVar) {
        super(context);
        this.presenter = d8zVar;
        int i = tih0.coordinates_list;
        WeakHashMap weakHashMap = b.a;
        RecyclerView recyclerView = (RecyclerView) ((View) rp31.d(this, i));
        this.coordinatesUpdateList = recyclerView;
        lki lkiVar = new lki(2);
        SimpleDateFormat simpleDateFormat = b8z.U;
        g0c a = qoi0.a(a8z.class);
        lj1 lj1Var = new lj1(context, 23);
        xpy xpyVar = new xpy(26);
        Class a2 = a.a();
        he7 he7Var = new he7(1, xpyVar);
        EmptyList emptyList = EmptyList.a;
        z7z z7zVar = new z7z(lkiVar, Collections.singletonList(new zxs(a2, 0, lj1Var, emptyList, he7Var, null)));
        this.adapter = z7zVar;
        z7zVar.submitList(emptyList, null);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(z7zVar);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return qth0.modal_view_diagnosctic_geo_points;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getFullscreenBackgroundAttrRes() {
        return xng0.bgTransparent;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getSlideableBackgroundAttrRes() {
        return xng0.bgTransparent;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        d8z d8zVar = this.presenter;
        d8zVar.Bg(this);
        x43 x43Var = d8zVar.w.a;
        ArrayList arrayList = new ArrayList();
        Iterator it = x43Var.iterator();
        int i = 0;
        while (it.hasNext()) {
            i++;
            e8z e8zVar = (e8z) it.next();
            arrayList.add(new a8z(i, e8zVar.a, e8zVar.b));
        }
        ((c8z) d8zVar.Dg()).updateCoordinatesJournal(arrayList);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // defpackage.c8z
    public void updateCoordinatesJournal(List<a8z> coordinatesUpdateModelList) {
        this.adapter.submitList(coordinatesUpdateModelList, null);
    }
}
