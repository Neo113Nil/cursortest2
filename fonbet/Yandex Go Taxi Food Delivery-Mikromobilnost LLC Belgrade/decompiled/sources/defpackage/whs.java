package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import defpackage.shs;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import ru.yandex.taxi.banners.presentation.fullscreen.FullScreenBannerModalView;
import ru.yandex.taxi.banners.presentation.fullscreen.FullScreenBannerPage;
import ru.yandex.taxi.widget.c;

/* loaded from: classes5.dex */
public final class whs extends e890 {
    public shs c;
    public boolean f;
    public Bitmap h;
    public boolean i;
    public final zhs j;
    public final /* synthetic */ FullScreenBannerModalView k;
    public final ArrayList d = new ArrayList();
    public final SparseArray e = new SparseArray();
    public boolean g = true;

    public whs(FullScreenBannerModalView fullScreenBannerModalView, shs shsVar) {
        this.k = fullScreenBannerModalView;
        this.c = shsVar;
        this.j = new zhs(fullScreenBannerModalView);
    }

    @Override // defpackage.e890
    public final void a(ViewPager viewPager, int i, Object obj) {
        this.e.remove(i);
        View findViewWithTag = viewPager.findViewWithTag(obj);
        if (findViewWithTag instanceof FullScreenBannerPage) {
            ((FullScreenBannerPage) findViewWithTag).destroy();
            this.d.add(findViewWithTag);
        }
        viewPager.removeView(findViewWithTag);
    }

    @Override // defpackage.e890
    public final int b() {
        return this.c.l.size();
    }

    @Override // defpackage.e890
    public final int c(Object obj) {
        int indexOf = this.c.l.indexOf(obj);
        if (indexOf == -1) {
            return -2;
        }
        return indexOf;
    }

    @Override // defpackage.e890
    public final Object d(ViewPager viewPager, int i) {
        FullScreenBannerPage fullScreenBannerPage;
        boolean z;
        pdc pdcVar;
        tse tseVar;
        pav pavVar;
        c cVar;
        ltc ltcVar;
        ptc ptcVar;
        ir4 ir4Var;
        int i2 = i;
        ArrayList arrayList = this.d;
        boolean isEmpty = arrayList.isEmpty();
        FullScreenBannerModalView fullScreenBannerModalView = this.k;
        if (isEmpty) {
            Context context = fullScreenBannerModalView.getContext();
            pdcVar = fullScreenBannerModalView.colorConverter;
            tseVar = fullScreenBannerModalView.lifecycleScope;
            pavVar = fullScreenBannerModalView.imageLoader;
            cVar = fullScreenBannerModalView.formattedTextConverter;
            ltcVar = fullScreenBannerModalView.communicationsErrorsInteractor;
            ptcVar = fullScreenBannerModalView.communicationsFontPropertiesProvider;
            ir4Var = fullScreenBannerModalView.bannerAssetsStorage;
            fullScreenBannerPage = new FullScreenBannerPage(context, pdcVar, tseVar, pavVar, this.j, cVar, ltcVar, ptcVar, ir4Var);
        } else {
            fullScreenBannerPage = (FullScreenBannerPage) arrayList.remove(0);
        }
        this.e.put(i2, fullScreenBannerPage);
        List list = this.c.l;
        z = fullScreenBannerModalView.isRtl;
        if (z) {
            i2 = (b() - 1) - i2;
        }
        shs.a aVar = (shs.a) list.get(i2);
        fullScreenBannerPage.setTag(aVar);
        fullScreenBannerPage.setData(aVar);
        viewPager.addView(fullScreenBannerPage);
        FullScreenBannerPage l = l();
        if (this.f && l != null) {
            this.f = false;
            l.setBackgroundVisible(this.g);
            l.setPlaybackResumed(this.i);
            Bitmap bitmap = this.h;
            if (bitmap != null) {
                l.setVideoFrame(bitmap);
            }
        }
        return aVar;
    }

    @Override // defpackage.e890
    public final boolean e(View view, Object obj) {
        return jl40.l(view.getTag(), obj);
    }

    public final FullScreenBannerPage l() {
        ViewPager viewPager;
        viewPager = this.k.pager;
        return (FullScreenBannerPage) this.e.get(viewPager.getCurrentItem());
    }

    public final void m(BiConsumer biConsumer) {
        SparseArray sparseArray = this.e;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            biConsumer.accept(Integer.valueOf(sparseArray.keyAt(i)), sparseArray.valueAt(i));
        }
    }
}
