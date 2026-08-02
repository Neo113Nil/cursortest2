package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchView;

/* loaded from: classes3.dex */
public final class s8p extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ t8p b;

    public /* synthetic */ s8p(t8p t8pVar, int i) {
        this.a = i;
        this.b = t8pVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                t8p t8pVar = this.b;
                SearchView searchView = t8pVar.a;
                SearchView searchView2 = t8pVar.a;
                if (!searchView.d()) {
                    searchView2.f();
                }
                searchView2.setTransitionState(p8p.d);
                break;
            case 1:
                t8p t8pVar2 = this.b;
                t8pVar2.c.setVisibility(8);
                SearchView searchView3 = t8pVar2.a;
                if (!searchView3.d()) {
                    searchView3.b();
                }
                searchView3.setTransitionState(p8p.b);
                break;
            case 2:
                t8p t8pVar3 = this.b;
                SearchView searchView4 = t8pVar3.a;
                SearchView searchView5 = t8pVar3.a;
                if (!searchView4.d()) {
                    searchView5.f();
                }
                searchView5.setTransitionState(p8p.d);
                break;
            default:
                t8p t8pVar4 = this.b;
                t8pVar4.c.setVisibility(8);
                SearchView searchView6 = t8pVar4.a;
                if (!searchView6.d()) {
                    searchView6.b();
                }
                searchView6.setTransitionState(p8p.b);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                t8p t8pVar = this.b;
                t8pVar.c.setVisibility(0);
                SearchBar searchBar = t8pVar.p;
                searchBar.L0.getClass();
                View centerView = searchBar.getCenterView();
                if (centerView != null) {
                    centerView.setAlpha(0.0f);
                    break;
                }
                break;
            case 1:
                this.b.a.setTransitionState(p8p.a);
                break;
            case 2:
                t8p t8pVar2 = this.b;
                t8pVar2.c.setVisibility(0);
                t8pVar2.a.setTransitionState(p8p.c);
                break;
            default:
                this.b.a.setTransitionState(p8p.a);
                break;
        }
    }
}
