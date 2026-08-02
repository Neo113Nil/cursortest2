package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.music.myvibe.settings.ui.view.YaRotatingProgress;
import defpackage.amh;
import defpackage.kpn;
import defpackage.zkf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.catalog.juicybottommenu.JuicyBottomSheetFrameLayout;

/* loaded from: classes3.dex */
public final class zkf {
    public static final /* synthetic */ s9f[] q = {new yxm(zkf.class, "titleTextView", "getTitleTextView()Landroid/widget/TextView;", 0), f1d.c(ern.a, zkf.class, "contextTextView", "getContextTextView()Landroid/widget/TextView;", 0), new yxm(zkf.class, "langTextView", "getLangTextView()Landroid/widget/TextView;", 0), new yxm(zkf.class, "contextsRecycler", "getContextsRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0), new yxm(zkf.class, "langRecycler", "getLangRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0), new yxm(zkf.class, "clearSelectionButton", "getClearSelectionButton()Landroid/widget/Button;", 0), new yxm(zkf.class, "progressView", "getProgressView()Lcom/yandex/music/myvibe/settings/ui/view/YaRotatingProgress;", 0), new yxm(zkf.class, "noResultContainer", "getNoResultContainer()Landroid/view/View;", 0)};
    public final mmo a;
    public final jyr b;
    public final q13 c;
    public final q13 d;
    public final q13 e;
    public final q13 f;
    public final q13 g;
    public final nkf h;
    public final nkf i;
    public final q13 j;
    public final q13 k;
    public final q13 l;
    public h4b m;
    public Map n;
    public Map o;
    public List p;

    public zkf(JuicyBottomSheetFrameLayout juicyBottomSheetFrameLayout, LayoutInflater layoutInflater) {
        final int i = 1;
        View inflate = layoutInflater.inflate(R.layout.rup_dialog_settings_view, (ViewGroup) juicyBottomSheetFrameLayout, true);
        inflate.getClass();
        juicyBottomSheetFrameLayout.getClass();
        layoutInflater.getClass();
        mmo mmoVar = new mmo(12);
        this.a = mmoVar;
        this.b = btf.b(new zya(29, inflate, this));
        this.c = new q13(new o8f(inflate, 4));
        this.d = new q13(new o8f(inflate, 5));
        this.e = new q13(new o8f(inflate, 6));
        this.f = new q13(new o8f(inflate, 7));
        this.g = new q13(new o8f(inflate, 8));
        nkf nkfVar = new nkf(mmoVar, new qec(8, this));
        this.h = nkfVar;
        nkf nkfVar2 = new nkf(mmoVar, new cib(10, this));
        this.i = nkfVar2;
        this.j = new q13(new o8f(inflate, 9));
        this.k = new q13(new o8f(inflate, 10));
        this.l = new q13(new o8f(inflate, 11));
        final int i2 = 0;
        b().setOnClickListener(new View.OnClickListener(this) { // from class: xkf
            public final /* synthetic */ zkf b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object obj;
                switch (i2) {
                    case 0:
                        h4b h4bVar = this.b.m;
                        if (h4bVar == null) {
                            return;
                        }
                        elf elfVar = (elf) h4bVar.a;
                        if (((j5v) elfVar.l.getValue()).a()) {
                            elfVar.H();
                            return;
                        }
                        iwe iweVar = elfVar.n;
                        iweVar.getClass();
                        ssg.a(3, "RadioRestrictionsManager", "clearSelection()", null);
                        ahn ahnVar = (ahn) ((xdr) iweVar.c).getValue();
                        HashMap hashMap = new HashMap();
                        for (Map.Entry entry : ahnVar.a.entrySet()) {
                            String str = (String) entry.getKey();
                            Iterator it = ((wgn) entry.getValue()).b.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj = it.next();
                                    if (((zgn) obj) instanceof ygn) {
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            zgn zgnVar = (zgn) obj;
                            if (zgnVar != null) {
                                hashMap.put(str, zgnVar);
                            }
                        }
                        ssg.a(3, "RadioRestrictionsManager", "New selection state: " + hashMap.entrySet(), null);
                        xdr xdrVar = (xdr) iweVar.b;
                        ahn ahnVar2 = new ahn(ahnVar.a, hashMap);
                        xdrVar.getClass();
                        xdrVar.m(null, ahnVar2);
                        qdc qdcVar = elfVar.m;
                        qdcVar.getClass();
                        ssg.a(3, "RadioBlocksManager", "clearSelection()", null);
                        xdr xdrVar2 = (xdr) qdcVar.b;
                        Iterable iterable = (Iterable) xdrVar2.getValue();
                        ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                        Iterator it2 = iterable.iterator();
                        while (true) {
                            int i3 = 0;
                            if (!it2.hasNext()) {
                                if (!arrayList.isEmpty()) {
                                    Iterator it3 = arrayList.iterator();
                                    while (it3.hasNext()) {
                                        if (((nfn) it3.next()).b && (i3 = i3 + 1) < 0) {
                                            u75.m();
                                            throw null;
                                        }
                                    }
                                }
                                ssg.a(3, "RadioBlocksManager", dfi.c(i3, "New selection state: ", " values selected"), null);
                                xdrVar2.m(null, arrayList);
                                elfVar.G();
                                return;
                            }
                            arrayList.add(new nfn(((nfn) it2.next()).a, false));
                        }
                        break;
                    default:
                        h4b h4bVar2 = this.b.m;
                        if (h4bVar2 != null) {
                            ((elf) h4bVar2.a).r.a(Unit.a);
                            return;
                        }
                        return;
                }
            }
        });
        int dimensionPixelOffset = inflate.getContext().getResources().getDimensionPixelOffset(R.dimen.half_unit_margin);
        RecyclerView d = d();
        final Context context = d().getContext();
        d.setLayoutManager(new LinearLayoutManager(context) { // from class: com.yandex.music.myvibe.api.settings.view.LandingWaveSettingsView$2
            @Override // defpackage.yon
            public final int S(amh amhVar, kpn kpnVar) {
                amhVar.getClass();
                kpnVar.getClass();
                return zkf.this.h.c();
            }

            @Override // defpackage.yon
            public final int h0(amh amhVar, kpn kpnVar) {
                amhVar.getClass();
                kpnVar.getClass();
                return 1;
            }

            @Override // defpackage.yon
            public final int i0(amh amhVar, kpn kpnVar) {
                amhVar.getClass();
                kpnVar.getClass();
                return 1;
            }
        });
        RecyclerView e = e();
        final Context context2 = e().getContext();
        e.setLayoutManager(new LinearLayoutManager(context2) { // from class: com.yandex.music.myvibe.api.settings.view.LandingWaveSettingsView$3
            @Override // defpackage.yon
            public final int S(amh amhVar, kpn kpnVar) {
                amhVar.getClass();
                kpnVar.getClass();
                return zkf.this.i.c();
            }

            @Override // defpackage.yon
            public final int h0(amh amhVar, kpn kpnVar) {
                amhVar.getClass();
                kpnVar.getClass();
                return 1;
            }

            @Override // defpackage.yon
            public final int i0(amh amhVar, kpn kpnVar) {
                amhVar.getClass();
                kpnVar.getClass();
                return 1;
            }
        });
        d().setItemAnimator(null);
        d().s(new e3e(dimensionPixelOffset, 0));
        d().setAdapter(nkfVar);
        e().setItemAnimator(null);
        e().s(new e3e(dimensionPixelOffset, 0));
        e().setAdapter(nkfVar2);
        View findViewById = f().findViewById(R.id.image_no_result);
        findViewById.getClass();
        ImageView imageView = (ImageView) findViewById;
        View findViewById2 = f().findViewById(R.id.text_view_no_result_title);
        findViewById2.getClass();
        TextView textView = (TextView) findViewById2;
        View findViewById3 = f().findViewById(R.id.text_view_no_result_subtitle);
        findViewById3.getClass();
        TextView textView2 = (TextView) findViewById3;
        View findViewById4 = f().findViewById(R.id.button_retry);
        findViewById4.getClass();
        imageView.setVisibility(0);
        textView.setVisibility(0);
        textView2.setVisibility(0);
        findViewById4.setVisibility(0);
        textView.setText(R.string.stub_title_no_connection);
        textView2.setText(R.string.stub_subtitle_no_connection_no_downloads);
        imageView.setImageResource(R.drawable.ic_offline_mode_lte_wi_fi_40);
        findViewById4.setOnClickListener(new View.OnClickListener(this) { // from class: xkf
            public final /* synthetic */ zkf b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object obj;
                switch (i) {
                    case 0:
                        h4b h4bVar = this.b.m;
                        if (h4bVar == null) {
                            return;
                        }
                        elf elfVar = (elf) h4bVar.a;
                        if (((j5v) elfVar.l.getValue()).a()) {
                            elfVar.H();
                            return;
                        }
                        iwe iweVar = elfVar.n;
                        iweVar.getClass();
                        ssg.a(3, "RadioRestrictionsManager", "clearSelection()", null);
                        ahn ahnVar = (ahn) ((xdr) iweVar.c).getValue();
                        HashMap hashMap = new HashMap();
                        for (Map.Entry entry : ahnVar.a.entrySet()) {
                            String str = (String) entry.getKey();
                            Iterator it = ((wgn) entry.getValue()).b.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj = it.next();
                                    if (((zgn) obj) instanceof ygn) {
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            zgn zgnVar = (zgn) obj;
                            if (zgnVar != null) {
                                hashMap.put(str, zgnVar);
                            }
                        }
                        ssg.a(3, "RadioRestrictionsManager", "New selection state: " + hashMap.entrySet(), null);
                        xdr xdrVar = (xdr) iweVar.b;
                        ahn ahnVar2 = new ahn(ahnVar.a, hashMap);
                        xdrVar.getClass();
                        xdrVar.m(null, ahnVar2);
                        qdc qdcVar = elfVar.m;
                        qdcVar.getClass();
                        ssg.a(3, "RadioBlocksManager", "clearSelection()", null);
                        xdr xdrVar2 = (xdr) qdcVar.b;
                        Iterable iterable = (Iterable) xdrVar2.getValue();
                        ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                        Iterator it2 = iterable.iterator();
                        while (true) {
                            int i3 = 0;
                            if (!it2.hasNext()) {
                                if (!arrayList.isEmpty()) {
                                    Iterator it3 = arrayList.iterator();
                                    while (it3.hasNext()) {
                                        if (((nfn) it3.next()).b && (i3 = i3 + 1) < 0) {
                                            u75.m();
                                            throw null;
                                        }
                                    }
                                }
                                ssg.a(3, "RadioBlocksManager", dfi.c(i3, "New selection state: ", " values selected"), null);
                                xdrVar2.m(null, arrayList);
                                elfVar.G();
                                return;
                            }
                            arrayList.add(new nfn(((nfn) it2.next()).a, false));
                        }
                        break;
                    default:
                        h4b h4bVar2 = this.b.m;
                        if (h4bVar2 != null) {
                            ((elf) h4bVar2.a).r.a(Unit.a);
                            return;
                        }
                        return;
                }
            }
        });
    }

    public final List a() {
        return (List) this.b.getValue();
    }

    public final Button b() {
        return (Button) this.j.a(q[5]);
    }

    public final TextView c() {
        return (TextView) this.d.a(q[1]);
    }

    public final RecyclerView d() {
        return (RecyclerView) this.f.a(q[3]);
    }

    public final RecyclerView e() {
        return (RecyclerView) this.g.a(q[4]);
    }

    public final View f() {
        return (View) this.l.a(q[7]);
    }

    public final void g(boolean z) {
        int i;
        int i2;
        Set entrySet;
        Object obj;
        if (z) {
            i = 0;
            i2 = 4;
        } else {
            i = 8;
            i2 = 0;
        }
        f().setVisibility(i);
        q13 q13Var = this.c;
        s9f[] s9fVarArr = q;
        ((TextView) q13Var.a(s9fVarArr[0])).setVisibility(i2);
        if (this.p == null || !(!r12.isEmpty())) {
            c().setVisibility(i2);
            d().setVisibility(i2);
        } else {
            c().setVisibility(i2);
            d().setVisibility(i2);
        }
        for (l7o l7oVar : a()) {
            Map map = this.o;
            wgn wgnVar = null;
            if (map != null && (entrySet = map.entrySet()) != null) {
                Iterator it = entrySet.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (Intrinsics.d(((Map.Entry) obj).getKey(), l7oVar.b)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                Map.Entry entry = (Map.Entry) obj;
                if (entry != null) {
                    wgnVar = (wgn) entry.getValue();
                }
            }
            if (wgnVar == null || !(!b85.C(wgnVar.b, xgn.class).isEmpty())) {
                l7oVar.a.setVisibility(8);
                l7oVar.a(8);
            } else {
                l7oVar.a.setVisibility(i2);
                l7oVar.a(i2);
            }
        }
        b().setVisibility(i2);
        ((YaRotatingProgress) this.k.a(s9fVarArr[6])).setVisibility(4);
    }
}
