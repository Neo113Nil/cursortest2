package f1;

import D1.i;
import a1.f;
import a1.q;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.lumenpath.harispro.hrnavigator.databinding.ItemExpandableCardBinding;
import com.lumenpath.harispro.hrnavigator.databinding.ItemExpandableSimpleBinding;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import k0.C;
import k0.b0;
import o1.C0317a;
import u1.g;
import u1.h;

/* renamed from: f1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0153b extends C {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3030d;
    public final List e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f3031f;

    public C0153b(List list, int i) {
        this.f3030d = i;
        switch (i) {
            case 1:
                i.e(list, "items");
                this.e = list;
                this.f3031f = new LinkedHashSet();
                break;
            case 2:
                i.e(list, "services");
                this.e = list;
                this.f3031f = new LinkedHashSet();
                break;
            default:
                i.e(list, "sections");
                this.e = list;
                this.f3031f = new LinkedHashSet();
                break;
        }
    }

    @Override // k0.C
    public final int a() {
        switch (this.f3030d) {
        }
        return this.e.size();
    }

    @Override // k0.C
    public final void c(b0 b0Var, int i) {
        switch (this.f3030d) {
            case 0:
                C0152a c0152a = (C0152a) b0Var;
                f fVar = (f) this.e.get(i);
                i.e(fVar, "section");
                C0153b c0153b = c0152a.f3029v;
                boolean contains = c0153b.f3031f.contains(Integer.valueOf(i));
                ItemExpandableSimpleBinding itemExpandableSimpleBinding = c0152a.f3028u;
                itemExpandableSimpleBinding.titleText.setText(fVar.f1688b);
                itemExpandableSimpleBinding.contentText.setText(fVar.f1689c);
                itemExpandableSimpleBinding.contentText.setVisibility(contains ? 0 : 8);
                itemExpandableSimpleBinding.divider.setVisibility(contains ? 0 : 8);
                itemExpandableSimpleBinding.expandIcon.setText(contains ? "▲" : "▼");
                itemExpandableSimpleBinding.cardView.setOnClickListener(new b1.c(c0152a, 4, c0153b));
                return;
            case 1:
                C0154c c0154c = (C0154c) b0Var;
                a1.i iVar = (a1.i) this.e.get(i);
                i.e(iVar, "item");
                C0153b c0153b2 = c0154c.f3033v;
                boolean contains2 = c0153b2.f3031f.contains(Integer.valueOf(i));
                ItemExpandableSimpleBinding itemExpandableSimpleBinding2 = c0154c.f3032u;
                itemExpandableSimpleBinding2.titleText.setText(iVar.f1698b);
                itemExpandableSimpleBinding2.contentText.setText(iVar.f1699c);
                itemExpandableSimpleBinding2.contentText.setVisibility(contains2 ? 0 : 8);
                itemExpandableSimpleBinding2.divider.setVisibility(contains2 ? 0 : 8);
                itemExpandableSimpleBinding2.expandIcon.setText(contains2 ? "▲" : "▼");
                itemExpandableSimpleBinding2.cardView.setOnClickListener(new b1.c(c0154c, 5, c0153b2));
                return;
            default:
                C0317a c0317a = (C0317a) b0Var;
                q qVar = (q) this.e.get(i);
                i.e(qVar, "service");
                C0153b c0153b3 = c0317a.f4129v;
                boolean contains3 = c0153b3.f3031f.contains(Integer.valueOf(i));
                ItemExpandableCardBinding itemExpandableCardBinding = c0317a.f4128u;
                itemExpandableCardBinding.titleText.setText(qVar.f1730b);
                itemExpandableCardBinding.descriptionText.setText(qVar.f1732d);
                TextView textView = itemExpandableCardBinding.stagesText;
                List list = qVar.e;
                ArrayList arrayList = new ArrayList(u1.i.I(list, 10));
                int i2 = 0;
                for (Object obj : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        h.H();
                        throw null;
                    }
                    arrayList.add(i3 + ". " + ((String) obj));
                    i2 = i3;
                }
                textView.setText(g.Q(arrayList, "\n", null, null, null, 62));
                itemExpandableCardBinding.resultText.setText(qVar.f1733f);
                itemExpandableCardBinding.expandedContent.setVisibility(contains3 ? 0 : 8);
                itemExpandableCardBinding.divider.setVisibility(contains3 ? 0 : 8);
                itemExpandableCardBinding.expandIcon.setText(contains3 ? "▲" : "▼");
                itemExpandableCardBinding.cardView.setOnClickListener(new b1.c(c0317a, 6, c0153b3));
                return;
        }
    }

    @Override // k0.C
    public final b0 d(ViewGroup viewGroup) {
        switch (this.f3030d) {
            case 0:
                i.e(viewGroup, "parent");
                ItemExpandableSimpleBinding inflate = ItemExpandableSimpleBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                i.d(inflate, "inflate(...)");
                return new C0152a(this, inflate);
            case 1:
                i.e(viewGroup, "parent");
                ItemExpandableSimpleBinding inflate2 = ItemExpandableSimpleBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                i.d(inflate2, "inflate(...)");
                return new C0154c(this, inflate2);
            default:
                i.e(viewGroup, "parent");
                ItemExpandableCardBinding inflate3 = ItemExpandableCardBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                i.d(inflate3, "inflate(...)");
                return new C0317a(this, inflate3);
        }
    }
}
