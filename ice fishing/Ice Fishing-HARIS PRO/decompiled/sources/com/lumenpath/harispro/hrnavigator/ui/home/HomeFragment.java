package com.lumenpath.harispro.hrnavigator.ui.home;

import C1.l;
import D1.i;
import V0.ViewOnClickListenerC0050a;
import Z.AbstractComponentCallbacksC0070s;
import Z0.b;
import Z0.o;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.lumenpath.harispro.hrnavigator.R;
import com.lumenpath.harispro.hrnavigator.databinding.FragmentHomeBinding;
import com.lumenpath.harispro.hrnavigator.ui.home.HomeFragment;
import e1.C0130b;
import e1.d;
import e1.f;
import java.util.List;
import u1.h;

/* loaded from: classes.dex */
public final class HomeFragment extends AbstractComponentCallbacksC0070s {

    /* renamed from: W, reason: collision with root package name */
    public FragmentHomeBinding f2802W;

    /* renamed from: X, reason: collision with root package name */
    public int f2803X;

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void C(View view) {
        i.e(view, "view");
        FragmentHomeBinding fragmentHomeBinding = this.f2802W;
        i.b(fragmentHomeBinding);
        fragmentHomeBinding.benchmarksHeader.sectionTitle.setText(k(R.string.industry_benchmarks));
        FragmentHomeBinding fragmentHomeBinding2 = this.f2802W;
        i.b(fragmentHomeBinding2);
        fragmentHomeBinding2.directionsHeader.sectionTitle.setText(k(R.string.our_directions));
        FragmentHomeBinding fragmentHomeBinding3 = this.f2802W;
        i.b(fragmentHomeBinding3);
        fragmentHomeBinding3.actionsHeader.sectionTitle.setText(k(R.string.quick_actions));
        FragmentHomeBinding fragmentHomeBinding4 = this.f2802W;
        i.b(fragmentHomeBinding4);
        fragmentHomeBinding4.tipHeader.sectionTitle.setText(k(R.string.tip_of_day));
        FragmentHomeBinding fragmentHomeBinding5 = this.f2802W;
        i.b(fragmentHomeBinding5);
        RecyclerView recyclerView = fragmentHomeBinding5.benchmarksRecycler;
        H();
        recyclerView.setLayoutManager(new LinearLayoutManager(0));
        FragmentHomeBinding fragmentHomeBinding6 = this.f2802W;
        i.b(fragmentHomeBinding6);
        fragmentHomeBinding6.benchmarksRecycler.setAdapter(new C0130b(b.f1641a, 0));
        List F2 = h.F(new f("👥", "HR Audit", ""), new f("🏢", "Org Structure", ""), new f("📈", "Process Optimization", ""), new f("🎯", "Consulting", ""));
        FragmentHomeBinding fragmentHomeBinding7 = this.f2802W;
        i.b(fragmentHomeBinding7);
        RecyclerView recyclerView2 = fragmentHomeBinding7.directionsRecycler;
        H();
        recyclerView2.setLayoutManager(new GridLayoutManager());
        FragmentHomeBinding fragmentHomeBinding8 = this.f2802W;
        i.b(fragmentHomeBinding8);
        final int i = 0;
        fragmentHomeBinding8.directionsRecycler.setAdapter(new d(F2, new l(this) { // from class: i1.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeFragment f3307b;

            {
                this.f3307b = this;
            }

            @Override // C1.l
            public final Object g(Object obj) {
                Integer num = (Integer) obj;
                switch (i) {
                    case 0:
                        num.intValue();
                        h0.f.l(this.f3307b).l(R.id.action_global_services, null);
                        break;
                    default:
                        int intValue = num.intValue();
                        HomeFragment homeFragment = this.f3307b;
                        if (intValue == 0) {
                            h0.f.l(homeFragment).l(R.id.action_global_diagnostic, null);
                        } else if (intValue == 1) {
                            h0.f.l(homeFragment).l(R.id.action_global_knowledge, null);
                        } else if (intValue == 2) {
                            h0.f.l(homeFragment).l(R.id.action_global_builder, null);
                        } else if (intValue == 3) {
                            h0.f.l(homeFragment).l(R.id.action_global_checklists, null);
                        } else if (intValue == 4) {
                            h0.f.l(homeFragment).l(R.id.metricsListFragment, null);
                        } else if (intValue == 5) {
                            h0.f.l(homeFragment).l(R.id.templatesListFragment, null);
                        }
                        break;
                }
                return t1.i.f4388c;
            }
        }, 0));
        List F3 = h.F(new f("📊", "HR Check-Up", ""), new f("📚", "Knowledge Base", ""), new f("🧩", "HR Builder", ""), new f("📋", "Checklists", ""), new f("📉", "HR Metrics", ""), new f("📄", "HR Templates", ""));
        FragmentHomeBinding fragmentHomeBinding9 = this.f2802W;
        i.b(fragmentHomeBinding9);
        RecyclerView recyclerView3 = fragmentHomeBinding9.actionsRecycler;
        H();
        recyclerView3.setLayoutManager(new GridLayoutManager());
        FragmentHomeBinding fragmentHomeBinding10 = this.f2802W;
        i.b(fragmentHomeBinding10);
        final int i2 = 1;
        fragmentHomeBinding10.actionsRecycler.setAdapter(new d(F3, new l(this) { // from class: i1.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeFragment f3307b;

            {
                this.f3307b = this;
            }

            @Override // C1.l
            public final Object g(Object obj) {
                Integer num = (Integer) obj;
                switch (i2) {
                    case 0:
                        num.intValue();
                        h0.f.l(this.f3307b).l(R.id.action_global_services, null);
                        break;
                    default:
                        int intValue = num.intValue();
                        HomeFragment homeFragment = this.f3307b;
                        if (intValue == 0) {
                            h0.f.l(homeFragment).l(R.id.action_global_diagnostic, null);
                        } else if (intValue == 1) {
                            h0.f.l(homeFragment).l(R.id.action_global_knowledge, null);
                        } else if (intValue == 2) {
                            h0.f.l(homeFragment).l(R.id.action_global_builder, null);
                        } else if (intValue == 3) {
                            h0.f.l(homeFragment).l(R.id.action_global_checklists, null);
                        } else if (intValue == 4) {
                            h0.f.l(homeFragment).l(R.id.metricsListFragment, null);
                        } else if (intValue == 5) {
                            h0.f.l(homeFragment).l(R.id.templatesListFragment, null);
                        }
                        break;
                }
                return t1.i.f4388c;
            }
        }, 0));
        FragmentHomeBinding fragmentHomeBinding11 = this.f2802W;
        i.b(fragmentHomeBinding11);
        fragmentHomeBinding11.tipText.setText((CharSequence) o.f1654a.get(this.f2803X));
        FragmentHomeBinding fragmentHomeBinding12 = this.f2802W;
        i.b(fragmentHomeBinding12);
        fragmentHomeBinding12.nextTipButton.setOnClickListener(new ViewOnClickListenerC0050a(6, this));
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(layoutInflater, "inflater");
        FragmentHomeBinding inflate = FragmentHomeBinding.inflate(layoutInflater, viewGroup, false);
        this.f2802W = inflate;
        i.b(inflate);
        ScrollView root = inflate.getRoot();
        i.d(root, "getRoot(...)");
        return root;
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void v() {
        this.f1582D = true;
        this.f2802W = null;
    }
}
