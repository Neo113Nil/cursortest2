package androidx.fragment.app;

import B0.j;
import V0.u;
import Z.AbstractComponentCallbacksC0070s;
import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* loaded from: classes.dex */
public class ListFragment extends AbstractComponentCallbacksC0070s {

    /* renamed from: W, reason: collision with root package name */
    public final Handler f1983W = new Handler();

    /* renamed from: X, reason: collision with root package name */
    public final j f1984X = new j(8, this);

    /* renamed from: Y, reason: collision with root package name */
    public final u f1985Y = new u(1, this);

    /* renamed from: Z, reason: collision with root package name */
    public ListView f1986Z;

    /* renamed from: a0, reason: collision with root package name */
    public View f1987a0;

    /* renamed from: b0, reason: collision with root package name */
    public View f1988b0;

    /* renamed from: c0, reason: collision with root package name */
    public View f1989c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f1990d0;

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void C(View view) {
        M();
    }

    public final void M() {
        if (this.f1986Z != null) {
            return;
        }
        View view = this.f1584F;
        if (view == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if (view instanceof ListView) {
            this.f1986Z = (ListView) view;
        } else {
            TextView textView = (TextView) view.findViewById(16711681);
            if (textView == null) {
                this.f1987a0 = view.findViewById(R.id.empty);
            } else {
                textView.setVisibility(8);
            }
            this.f1988b0 = view.findViewById(16711682);
            this.f1989c0 = view.findViewById(16711683);
            View findViewById = view.findViewById(R.id.list);
            if (!(findViewById instanceof ListView)) {
                if (findViewById != null) {
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
            }
            ListView listView = (ListView) findViewById;
            this.f1986Z = listView;
            View view2 = this.f1987a0;
            if (view2 != null) {
                listView.setEmptyView(view2);
            }
        }
        this.f1990d0 = true;
        this.f1986Z.setOnItemClickListener(this.f1985Y);
        if (this.f1988b0 != null) {
            M();
            View view3 = this.f1988b0;
            if (view3 == null) {
                throw new IllegalStateException("Can't be used with a custom content view");
            }
            if (this.f1990d0) {
                this.f1990d0 = false;
                view3.clearAnimation();
                this.f1989c0.clearAnimation();
                this.f1988b0.setVisibility(0);
                this.f1989c0.setVisibility(8);
            }
        }
        this.f1983W.post(this.f1984X);
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context H2 = H();
        FrameLayout frameLayout = new FrameLayout(H2);
        LinearLayout linearLayout = new LinearLayout(H2);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(H2, null, R.attr.progressBarStyleLarge), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(H2);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(H2);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(H2);
        listView.setId(R.id.list);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void v() {
        this.f1983W.removeCallbacks(this.f1984X);
        this.f1986Z = null;
        this.f1990d0 = false;
        this.f1989c0 = null;
        this.f1988b0 = null;
        this.f1987a0 = null;
        this.f1582D = true;
    }
}
