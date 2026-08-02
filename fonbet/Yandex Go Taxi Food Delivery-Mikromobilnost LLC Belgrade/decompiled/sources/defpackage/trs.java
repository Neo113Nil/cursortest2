package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.legacy.view.DivView;
import com.yandex.div.legacy.view.GalleryTailLayout;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final class trs extends ggk {
    public final Context a;
    public final ut31 b;
    public final h2b c;
    public final pzf d;
    public final cee e;
    public final h2b1 f;

    public trs(Context context, ut31 ut31Var, h2b h2bVar, pzf pzfVar, cee ceeVar) {
        h2b1 h2b1Var = h2b1.C;
        this.a = context;
        this.b = ut31Var;
        this.c = h2bVar;
        this.d = pzfVar;
        this.e = ceeVar;
        this.f = h2b1Var;
        final int i = 0;
        final int i2 = 2;
        ut31Var.d("GalleryDivViewBuilder.GALLERY", new zq31(this) { // from class: prs
            public final /* synthetic */ trs b;

            {
                this.b = this;
            }

            @Override // defpackage.zq31
            public final View a() {
                int i3 = i;
                trs trsVar = this.b;
                switch (i3) {
                    case 0:
                        RecyclerView recyclerView = new RecyclerView(trsVar.a);
                        recyclerView.setId(ogh0.div_gallery);
                        recyclerView.setScrollingTouchSlop(1);
                        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        return recyclerView;
                    case 1:
                        LinearLayout linearLayout = new LinearLayout(trsVar.a);
                        linearLayout.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -2));
                        linearLayout.setGravity(17);
                        linearLayout.setOrientation(0);
                        return linearLayout;
                    default:
                        return new GalleryTailLayout(trsVar.a);
                }
            }
        }, 2);
        final int i3 = 1;
        ut31Var.d("GalleryDivViewBuilder.ITEM", new zq31(this) { // from class: prs
            public final /* synthetic */ trs b;

            {
                this.b = this;
            }

            @Override // defpackage.zq31
            public final View a() {
                int i32 = i3;
                trs trsVar = this.b;
                switch (i32) {
                    case 0:
                        RecyclerView recyclerView = new RecyclerView(trsVar.a);
                        recyclerView.setId(ogh0.div_gallery);
                        recyclerView.setScrollingTouchSlop(1);
                        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        return recyclerView;
                    case 1:
                        LinearLayout linearLayout = new LinearLayout(trsVar.a);
                        linearLayout.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -2));
                        linearLayout.setGravity(17);
                        linearLayout.setOrientation(0);
                        return linearLayout;
                    default:
                        return new GalleryTailLayout(trsVar.a);
                }
            }
        }, 8);
        ut31Var.d("GalleryDivViewBuilder.TAIL", new zq31(this) { // from class: prs
            public final /* synthetic */ trs b;

            {
                this.b = this;
            }

            @Override // defpackage.zq31
            public final View a() {
                int i32 = i2;
                trs trsVar = this.b;
                switch (i32) {
                    case 0:
                        RecyclerView recyclerView = new RecyclerView(trsVar.a);
                        recyclerView.setId(ogh0.div_gallery);
                        recyclerView.setScrollingTouchSlop(1);
                        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        return recyclerView;
                    case 1:
                        LinearLayout linearLayout = new LinearLayout(trsVar.a);
                        linearLayout.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -2));
                        linearLayout.setGravity(17);
                        linearLayout.setOrientation(0);
                        return linearLayout;
                    default:
                        return new GalleryTailLayout(trsVar.a);
                }
            }
        }, 2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.ggk
    public final View a(DivView divView, n15 n15Var) {
        int i;
        RecyclerView.d u590Var;
        char c;
        int i2;
        int i3;
        char c2;
        int i4;
        rrk rrkVar = (rrk) n15Var;
        RecyclerView recyclerView = (RecyclerView) this.b.b("GalleryDivViewBuilder.GALLERY");
        Context context = this.a;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(new qrs(this, divView, rrkVar));
        o9y currentState = divView.getCurrentState();
        z83.d(currentState, null);
        if (currentState != null) {
            p9y p9yVar = (p9y) ((n9y) currentState.b.get(rrkVar.e()));
            if (p9yVar != null) {
                linearLayoutManager.r(p9yVar.a, p9yVar.b);
            }
            recyclerView.addOnScrollListener(new ray(rrkVar.e(), currentState, linearLayoutManager));
            recyclerView.addOnScrollListener(new srs(this, divView, linearLayoutManager));
        }
        Resources resources = context.getResources();
        apf apfVar = rrkVar.C;
        n0l n0lVar = rrkVar.A;
        n0l n0lVar2 = rrkVar.B;
        n0l n0lVar3 = rrkVar.z;
        rbh rbhVar = (rbh) rrkVar.w;
        if (apfVar != null) {
            int dimensionPixelOffset = resources.getDimensionPixelOffset(atg0.div_gallery_horizontal_internal_item_padding);
            int dimensionPixelOffset2 = resources.getDimensionPixelOffset(atg0.div_gallery_tail_horizontal_padding);
            int i5 = dimensionPixelOffset2 - dimensionPixelOffset;
            int dimensionPixelOffset3 = resources.getDimensionPixelOffset(atg0.div_gallery_horizontal_padding);
            if (rbhVar != null) {
                String str = rbhVar.c;
                str.getClass();
                switch (str.hashCode()) {
                    case 108:
                        if (str.equals("l")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 109:
                        if (str.equals("m")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case HProv.PP_CACHE_SIZE /* 115 */:
                        if (str.equals("s")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                        i4 = atg0.div_horizontal_padding_l;
                        break;
                    case 1:
                        i4 = atg0.div_horizontal_padding_m;
                        break;
                    case 2:
                        i4 = atg0.div_horizontal_padding_s;
                        break;
                    default:
                        i4 = atg0.div_horizontal_padding;
                        break;
                }
                int dimensionPixelOffset4 = resources.getDimensionPixelOffset(i4);
                if ("left".equals(rbhVar.b)) {
                    dimensionPixelOffset3 = dimensionPixelOffset4;
                } else {
                    i3 = dimensionPixelOffset4;
                    u590Var = new oss(dimensionPixelOffset3 - dimensionPixelOffset, Math.max(mj91.b(n0lVar3, resources.getDisplayMetrics()) - (resources.getDimensionPixelOffset(atg0.div_gallery_horizontal_internal_item_padding) * 2), 0), i5, i3, mj91.b(n0lVar2, resources.getDisplayMetrics()), mj91.b(n0lVar, resources.getDisplayMetrics()));
                }
            }
            i3 = dimensionPixelOffset2;
            u590Var = new oss(dimensionPixelOffset3 - dimensionPixelOffset, Math.max(mj91.b(n0lVar3, resources.getDisplayMetrics()) - (resources.getDimensionPixelOffset(atg0.div_gallery_horizontal_internal_item_padding) * 2), 0), i5, i3, mj91.b(n0lVar2, resources.getDisplayMetrics()), mj91.b(n0lVar, resources.getDisplayMetrics()));
        } else {
            int dimensionPixelOffset5 = resources.getDimensionPixelOffset(atg0.div_gallery_horizontal_padding);
            if (rbhVar != null) {
                String str2 = rbhVar.c;
                str2.getClass();
                switch (str2.hashCode()) {
                    case 108:
                        if (str2.equals("l")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 109:
                        if (str2.equals("m")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case HProv.PP_CACHE_SIZE /* 115 */:
                        if (str2.equals("s")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        i2 = atg0.div_horizontal_padding_l;
                        break;
                    case 1:
                        i2 = atg0.div_horizontal_padding_m;
                        break;
                    case 2:
                        i2 = atg0.div_horizontal_padding_s;
                        break;
                    default:
                        i2 = atg0.div_horizontal_padding;
                        break;
                }
                i = resources.getDimensionPixelOffset(i2);
                if ("left".equals(rbhVar.b)) {
                    i = dimensionPixelOffset5;
                    dimensionPixelOffset5 = i;
                }
            } else {
                i = dimensionPixelOffset5;
            }
            int dimensionPixelOffset6 = resources.getDimensionPixelOffset(atg0.div_gallery_horizontal_internal_item_padding);
            u590Var = new u590(dimensionPixelOffset5 - dimensionPixelOffset6, Math.max(mj91.b(n0lVar3, resources.getDisplayMetrics()) - (resources.getDimensionPixelOffset(atg0.div_gallery_horizontal_internal_item_padding) * 2), 0), i - dimensionPixelOffset6, mj91.b(n0lVar2, resources.getDisplayMetrics()), mj91.b(n0lVar, resources.getDisplayMetrics()), 0, 0, 224);
        }
        recyclerView.addItemDecoration(u590Var);
        return recyclerView;
    }
}
