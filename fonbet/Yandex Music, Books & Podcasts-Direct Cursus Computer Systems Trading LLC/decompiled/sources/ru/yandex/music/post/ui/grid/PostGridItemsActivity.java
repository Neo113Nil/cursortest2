package ru.yandex.music.post.ui.grid;

import android.graphics.ColorFilter;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager12Fixed;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import defpackage.aqd;
import defpackage.c01;
import defpackage.co1;
import defpackage.co6;
import defpackage.cvl;
import defpackage.dim;
import defpackage.do1;
import defpackage.e7o;
import defpackage.f30;
import defpackage.g30;
import defpackage.gqm;
import defpackage.hqm;
import defpackage.i4w;
import defpackage.jqm;
import defpackage.jyr;
import defpackage.kle;
import defpackage.lg3;
import defpackage.ogp;
import defpackage.oq;
import defpackage.ou0;
import defpackage.p11;
import defpackage.p7w;
import defpackage.qdq;
import defpackage.qo6;
import defpackage.qxm;
import defpackage.rhp;
import defpackage.rke;
import defpackage.rvf;
import defpackage.sht;
import defpackage.sk3;
import defpackage.suh;
import defpackage.tpd;
import defpackage.u4m;
import defpackage.url;
import defpackage.uvg;
import defpackage.v4m;
import defpackage.vul;
import defpackage.wp0;
import defpackage.wyf;
import defpackage.xal;
import defpackage.y7g;
import defpackage.yhb;
import defpackage.yu0;
import defpackage.zcu;
import defpackage.zq;
import defpackage.zs4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.player.a;
import ru.yandex.music.post.ui.grid.PostGridItemsActivity;
import ru.yandex.music.ui.view.CompoundImageView;
import ru.yandex.music.utils.Assertions;

/* loaded from: classes6.dex */
public class PostGridItemsActivity extends a {
    public static final /* synthetic */ int H0 = 0;
    public TextView A0;
    public TextView B0;
    public TextView C0;
    public TextView D0;
    public final rhp E0 = new rhp();
    public final yhb F0 = (yhb) sk3.I(yhb.class);
    public qxm G0;
    public RecyclerView Y;
    public AppBarLayout Z;
    public ViewGroup v0;
    public CollapsingToolbarLayout w0;
    public CompoundImageView x0;
    public ImageView y0;
    public Toolbar z0;

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ArrayList arrayList;
        ArrayList arrayList2;
        super.onCreate(bundle);
        this.Y = (RecyclerView) findViewById(R.id.recycler_view);
        this.Z = (AppBarLayout) findViewById(R.id.appbar);
        this.v0 = (ViewGroup) findViewById(R.id.texts);
        this.w0 = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        this.x0 = (CompoundImageView) findViewById(R.id.compound_background_img);
        this.y0 = (ImageView) findViewById(R.id.background_img);
        this.z0 = (Toolbar) findViewById(R.id.toolbar);
        this.A0 = (TextView) findViewById(R.id.toolbar_title);
        this.B0 = (TextView) findViewById(R.id.title);
        this.C0 = (TextView) findViewById(R.id.subtitle);
        TextView textView = (TextView) findViewById(R.id.open_full_info);
        this.D0 = textView;
        textView.setOnClickListener(new xal(4, this));
        setSupportActionBar(this.z0);
        this.z0.setTitle((CharSequence) null);
        Bundle extras = getIntent().getExtras();
        String string = extras.getString("extra.event.id");
        Assertions.assertNonEmpty(string);
        qxm a = this.F0.a(string);
        this.G0 = a;
        if (a == null) {
            finish();
            return;
        }
        kle b = ogp.r().b();
        b.getClass();
        if (ogp.v() != null) {
            rke.a(this).c(b);
        }
        qxm qxmVar = this.G0;
        boolean z = qxmVar instanceof u4m;
        int i = 1;
        gqm gqmVar = gqm.a;
        if (z) {
            List unmodifiableList = Collections.unmodifiableList(((v4m) ((u4m) qxmVar).e).c);
            arrayList2 = new ArrayList(unmodifiableList.size());
            Iterator it = unmodifiableList.iterator();
            while (it.hasNext()) {
                cvl cvlVar = ((vul) it.next()).a;
                url urlVar = new url(cvlVar);
                cvlVar.d();
                arrayList2.add(new hqm(cvlVar, urlVar, gqmVar, 2));
            }
        } else {
            if (qxmVar instanceof f30) {
                List unmodifiableList2 = Collections.unmodifiableList(((g30) ((f30) qxmVar).e).c);
                ArrayList arrayList3 = new ArrayList(unmodifiableList2.size());
                Iterator it2 = unmodifiableList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((p7w) it2.next()).a);
                }
                arrayList = new ArrayList(arrayList3.size());
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    oq oqVar = (oq) it3.next();
                    arrayList.add(new hqm(oqVar, new zq(oqVar), gqmVar, 1));
                }
            } else {
                if (!(qxmVar instanceof co1)) {
                    e7o.e();
                    return;
                }
                List list = ((do1) ((co1) qxmVar).e).c;
                ArrayList arrayList4 = new ArrayList(list.size());
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(((p7w) it4.next()).a);
                }
                arrayList = new ArrayList(arrayList4.size());
                Iterator it5 = arrayList4.iterator();
                while (it5.hasNext()) {
                    c01 c01Var = (c01) it5.next();
                    arrayList.add(new hqm(c01Var, new p11(c01Var), gqm.b, 2));
                }
            }
            arrayList2 = arrayList;
        }
        qxm qxmVar2 = this.G0;
        String str = qxmVar2 != null ? qxmVar2.e.a : null;
        if (y7g.G(str)) {
            str = this.G0.b;
        }
        int i2 = 8;
        int i3 = 0;
        if (y7g.G(str)) {
            TextView textView2 = this.D0;
            jyr jyrVar = sht.a;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            this.A0.getViewTreeObserver().addOnGlobalLayoutListener(new dim(this, i3));
        } else {
            this.C0.getViewTreeObserver().addOnGlobalLayoutListener(new dim(this, i));
        }
        this.B0.setText(this.G0.a);
        this.A0.setText(this.G0.a);
        this.A0.setAlpha(0.0f);
        sht.d(this.C0, str);
        CompoundImageView compoundImageView = this.x0;
        jyr jyrVar2 = sht.b;
        compoundImageView.setCustomColorFilter((ColorFilter) jyrVar2.getValue());
        this.y0.setColorFilter((ColorFilter) jyrVar2.getValue());
        CoverPath coverPath = (CoverPath) extras.getParcelable(CoverPath.COVER_EXTRA);
        if (coverPath != null) {
            i4w.O(this.y0, new co6(coverPath, qo6.e, null), 0);
            CompoundImageView compoundImageView2 = this.x0;
            if (compoundImageView2 != null) {
                compoundImageView2.setVisibility(8);
            }
            ImageView imageView = this.y0;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        } else {
            CompoundImageView compoundImageView3 = this.x0;
            ArrayList arrayList5 = new ArrayList(arrayList2.size());
            Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                arrayList5.add(((hqm) it6.next()).a.b().a);
            }
            compoundImageView3.setCoverPaths(arrayList5);
            CompoundImageView compoundImageView4 = this.x0;
            if (compoundImageView4 != null) {
                compoundImageView4.setVisibility(0);
            }
            ImageView imageView2 = this.y0;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        this.Z.a(new zcu(this.A0));
        this.Z.a(new wp0() { // from class: bim
            @Override // defpackage.wp0
            public final void a(AppBarLayout appBarLayout, int i4) {
                int i5 = PostGridItemsActivity.H0;
                float x = hyf.x(1.0f - (Math.abs(i4 / appBarLayout.getTotalScrollRange()) * 2.0f), 0.0f, 1.0f);
                PostGridItemsActivity postGridItemsActivity = PostGridItemsActivity.this;
                View[] viewArr = {postGridItemsActivity.B0, postGridItemsActivity.C0, postGridItemsActivity.D0};
                jyr jyrVar3 = sht.a;
                sht.c(x, false, (View[]) Arrays.copyOf(viewArr, 3));
            }
        });
        this.w0.setOnApplyWindowInsetsListener(null);
        qdq.d(this.z0, false, true, false, false);
        qdq.d(this.v0, false, true, false, false);
        qxm qxmVar3 = this.G0;
        String str2 = qxmVar3 != null ? qxmVar3.e.a : null;
        jqm jqmVar = new jqm();
        jqmVar.e = new suh(this, str2, i2);
        jqmVar.f = new uvg(26, this);
        this.Y.setAdapter(jqmVar);
        RecyclerView recyclerView = this.Y;
        aqd aqdVar = new aqd(0);
        GridLayoutManager12Fixed gridLayoutManager12Fixed = new GridLayoutManager12Fixed(this);
        if (gridLayoutManager12Fixed.i) {
            gridLayoutManager12Fixed.i = false;
            gridLayoutManager12Fixed.j = 0;
            RecyclerView recyclerView2 = gridLayoutManager12Fixed.b;
            if (recyclerView2 != null) {
                recyclerView2.c.n();
            }
        }
        gridLayoutManager12Fixed.K = aqdVar;
        recyclerView.setLayoutManager(gridLayoutManager12Fixed);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.unit_margin);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.unit_and_half_margin);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.edge_margin);
        this.Y.s(new tpd(dimensionPixelSize, dimensionPixelSize3, dimensionPixelSize2, dimensionPixelSize3));
        zs4.a(this.Y);
        this.E0.c(rvf.z(this.Y, wyf.F(getLifecycle())));
        ArrayList arrayList6 = jqmVar.d;
        arrayList6.clear();
        arrayList6.addAll(arrayList2);
        jqmVar.g();
        if (bundle == null) {
            qxm qxmVar4 = this.G0;
            HashMap hashMap = new HashMap();
            hashMap.put("type", qxmVar4.a());
            hashMap.put("title", qxmVar4.a);
            lg3.e0("Post_MultiItemsWindow", hashMap);
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        if (this.G0 != null) {
            getMenuInflater().inflate(R.menu.actionbar_share_menu, menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // ru.yandex.music.player.a, defpackage.np2, defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onDestroy() {
        this.E0.a();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        qxm qxmVar;
        if (menuItem.getItemId() == R.id.share && (qxmVar = this.G0) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("type", qxmVar.a());
            hashMap.put("title", qxmVar.a);
            lg3.e0("Post_SharePost", hashMap);
            y7g.O(this, y7g.N(this.G0.e.b));
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // ru.yandex.music.player.a, defpackage.np2
    public final int q() {
        return R.layout.post_grid_items;
    }

    @Override // defpackage.np2
    public final int v(ou0 ou0Var) {
        return yu0.a[ou0Var.ordinal()] == 1 ? R.style.AppTheme_EdgeToEdge_TransparentStatusBar : R.style.AppTheme_Dark_EdgeToEdge_TransparentStatusBar;
    }
}
