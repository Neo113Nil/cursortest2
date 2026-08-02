package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchView;

/* loaded from: classes3.dex */
public final class t8p {
    public final SearchView a;
    public final View b;
    public final ClippableRoundedCornerLayout c;
    public final FrameLayout d;
    public final FrameLayout e;
    public final MaterialToolbar f;
    public final Toolbar g;
    public final LinearLayout h;
    public final TextView i;
    public final EditText j;
    public final ImageButton k;
    public final View l;
    public final TouchObserverFrameLayout m;
    public final kdh n;
    public AnimatorSet o;
    public SearchBar p;

    public t8p(SearchView searchView) {
        this.a = searchView;
        this.b = searchView.a;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchView.b;
        this.c = clippableRoundedCornerLayout;
        this.d = searchView.e;
        this.e = searchView.f;
        this.f = searchView.g;
        this.g = searchView.h;
        this.i = searchView.i;
        this.j = searchView.k;
        this.k = searchView.l;
        this.l = searchView.m;
        this.m = searchView.n;
        this.h = searchView.j;
        this.n = new kdh(clippableRoundedCornerLayout);
    }

    public static void a(t8p t8pVar, float f) {
        ActionMenuView F;
        t8pVar.k.setAlpha(f);
        t8pVar.l.setAlpha(f);
        t8pVar.m.setAlpha(f);
        if (!t8pVar.a.x || (F = pd.F(t8pVar.f)) == null) {
            return;
        }
        F.setAlpha(f);
    }

    public static AnimatorSet i(View view, int i, int i2, boolean z) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(i, 0.0f);
        ofFloat.addUpdateListener(new nl4(new tuh(23), new View[]{view}));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(i2, 0.0f);
        ofFloat2.addUpdateListener(nl4.a(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(z ? 300L : 250L);
        animatorSet.setInterpolator(fdo.a(z, wm0.b));
        return animatorSet;
    }

    public final void b(AnimatorSet animatorSet) {
        ImageButton H = pd.H(this.f);
        if (H == null) {
            return;
        }
        Drawable drawable = H.getDrawable();
        if (!this.a.w) {
            if (drawable instanceof aqa) {
                aqa aqaVar = (aqa) drawable;
                if (aqaVar.i != 1.0f) {
                    aqaVar.i = 1.0f;
                    aqaVar.invalidateSelf();
                }
            }
            if (drawable instanceof j4c) {
                ((j4c) drawable).a(1.0f);
                return;
            }
            return;
        }
        if (drawable instanceof aqa) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new hr2(12, (aqa) drawable));
            animatorSet.playTogether(ofFloat);
        }
        if (drawable instanceof j4c) {
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new hr2(13, (j4c) drawable));
            animatorSet.playTogether(ofFloat2);
        }
        SearchBar searchBar = this.p;
        if (searchBar == null || searchBar.getNavigationIcon() != null) {
            return;
        }
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat3.addUpdateListener(new hr2(15, H));
        animatorSet.playTogether(ofFloat3);
    }

    public final void c() {
        SearchBar searchBar = this.p;
        kdh kdhVar = this.n;
        if (kdhVar.c() != null) {
            AnimatorSet f = kdhVar.f(searchBar);
            View view = (View) kdhVar.e;
            if (view instanceof ClippableRoundedCornerLayout) {
                ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) view;
                ValueAnimator ofObject = ValueAnimator.ofObject(new idh(), clippableRoundedCornerLayout.getCornerRadii(), kdhVar.g());
                ofObject.addUpdateListener(new hr2(11, clippableRoundedCornerLayout));
                f.playTogether(ofObject);
            }
            f.setDuration(kdhVar.c);
            f.start();
            kdhVar.i = 0.0f;
            kdhVar.j = null;
            kdhVar.k = null;
        }
        AnimatorSet animatorSet = this.o;
        if (animatorSet != null) {
            animatorSet.reverse();
        }
        this.o = null;
    }

    public final AnimatorSet d(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        MaterialToolbar materialToolbar = this.f;
        ImageButton H = pd.H(materialToolbar);
        if (H != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(k(pd.H(this.p), H), 0.0f);
            ofFloat.addUpdateListener(new nl4(new tuh(23), new View[]{H}));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(g(), 0.0f);
            ofFloat2.addUpdateListener(nl4.a(H));
            animatorSet.playTogether(ofFloat, ofFloat2);
        }
        ActionMenuView F = pd.F(materialToolbar);
        if (F != null) {
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(k(pd.F(this.p), F), 0.0f);
            ofFloat3.addUpdateListener(new nl4(new tuh(23), new View[]{F}));
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(g(), 0.0f);
            ofFloat4.addUpdateListener(nl4.a(F));
            animatorSet.playTogether(ofFloat3, ofFloat4);
        }
        animatorSet.setDuration(z ? 300L : 250L);
        animatorSet.setInterpolator(fdo.a(z, wm0.b));
        return animatorSet;
    }

    public final AnimatorSet e(boolean z) {
        EditText editText;
        Animator animator;
        AnimatorSet animatorSet = new AnimatorSet();
        if (this.o == null) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            b(animatorSet2);
            animatorSet2.setDuration(z ? 300L : 250L);
            animatorSet2.setInterpolator(fdo.a(z, wm0.b));
            animatorSet.playTogether(animatorSet2, d(z));
        }
        TimeInterpolator timeInterpolator = z ? wm0.a : wm0.b;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(z ? 300L : 250L);
        ofFloat.setStartDelay(z ? 100L : 0L);
        ofFloat.setInterpolator(fdo.a(z, timeInterpolator));
        ofFloat.addUpdateListener(new nl4(new tuh(26), new View[]{this.b}));
        kdh kdhVar = this.n;
        Rect rect = kdhVar.j;
        Rect rect2 = kdhVar.k;
        SearchView searchView = this.a;
        if (rect == null) {
            rect = new Rect(searchView.getLeft(), searchView.getTop(), searchView.getRight(), searchView.getBottom());
        }
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.c;
        if (rect2 == null) {
            rect2 = fxf.v(clippableRoundedCornerLayout, this.p);
        }
        final Rect rect3 = new Rect(rect2);
        final float cornerSize = this.p.getCornerSize();
        float[] cornerRadii = clippableRoundedCornerLayout.getCornerRadii();
        float[] g = kdhVar.g();
        final float[] fArr = {Math.max(cornerRadii[0], g[0]), Math.max(cornerRadii[1], g[1]), Math.max(cornerRadii[2], g[2]), Math.max(cornerRadii[3], g[3]), Math.max(cornerRadii[4], g[4]), Math.max(cornerRadii[5], g[5]), Math.max(cornerRadii[6], g[6]), Math.max(cornerRadii[7], g[7])};
        ValueAnimator ofObject = ValueAnimator.ofObject(new kjc(rect3), rect2, rect);
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: r8p
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                float[] fArr2 = fArr;
                float f = fArr2[0];
                float f2 = cornerSize;
                float[] fArr3 = {wm0.a(f2, f, animatedFraction), wm0.a(f2, fArr2[1], animatedFraction), wm0.a(f2, fArr2[2], animatedFraction), wm0.a(f2, fArr2[3], animatedFraction), wm0.a(f2, fArr2[4], animatedFraction), wm0.a(f2, fArr2[5], animatedFraction), wm0.a(f2, fArr2[6], animatedFraction), wm0.a(f2, fArr2[7], animatedFraction)};
                ClippableRoundedCornerLayout clippableRoundedCornerLayout2 = t8p.this.c;
                clippableRoundedCornerLayout2.getClass();
                Rect rect4 = rect3;
                clippableRoundedCornerLayout2.a(rect4.left, rect4.top, rect4.right, rect4.bottom, fArr3);
            }
        });
        ofObject.setDuration(z ? 300L : 250L);
        k5c k5cVar = wm0.b;
        ofObject.setInterpolator(fdo.a(z, k5cVar));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setDuration(z ? 50L : 42L);
        ofFloat2.setStartDelay(z ? 250L : 0L);
        LinearInterpolator linearInterpolator = wm0.a;
        ofFloat2.setInterpolator(fdo.a(z, linearInterpolator));
        ofFloat2.addUpdateListener(new nl4(new tuh(26), new View[]{this.k}));
        AnimatorSet animatorSet3 = new AnimatorSet();
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat3.setDuration(z ? 150L : 83L);
        ofFloat3.setStartDelay(z ? 75L : 0L);
        ofFloat3.setInterpolator(fdo.a(z, linearInterpolator));
        View view = this.l;
        TouchObserverFrameLayout touchObserverFrameLayout = this.m;
        ofFloat3.addUpdateListener(new nl4(new tuh(26), new View[]{view, touchObserverFrameLayout}));
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat((touchObserverFrameLayout.getHeight() * 0.050000012f) / 2.0f, 0.0f);
        ofFloat4.setDuration(z ? 300L : 250L);
        ofFloat4.setInterpolator(fdo.a(z, k5cVar));
        ofFloat4.addUpdateListener(nl4.a(view));
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.95f, 1.0f);
        ofFloat5.setDuration(z ? 300L : 250L);
        ofFloat5.setInterpolator(fdo.a(z, k5cVar));
        ofFloat5.addUpdateListener(new nl4(new tuh(25), new View[]{touchObserverFrameLayout}));
        animatorSet3.playTogether(ofFloat3, ofFloat4, ofFloat5);
        View view2 = this.d;
        Animator i = i(view2, f(view2), g(), z);
        Toolbar toolbar = this.g;
        Animator i2 = i(toolbar, f(toolbar), g(), z);
        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat6.setDuration(z ? 300L : 250L);
        ofFloat6.setInterpolator(fdo.a(z, k5cVar));
        if (searchView.x) {
            ofFloat6.addUpdateListener(new k4c(pd.F(toolbar), pd.F(this.f)));
        }
        EditText editText2 = this.j;
        Animator j = j(editText2, z);
        Animator j2 = j(this.i, z);
        AnimatorSet animatorSet4 = new AnimatorSet();
        if (this.p == null || TextUtils.equals(editText2.getText(), this.p.getText())) {
            editText = editText2;
        } else {
            ValueAnimator ofFloat7 = ValueAnimator.ofFloat(0.0f, 1.0f);
            editText = editText2;
            ofFloat7.addUpdateListener(new hr2(14, this));
            animatorSet4.playTogether(ofFloat7);
        }
        if (this.p == null || !TextUtils.equals(editText.getText(), this.p.getText())) {
            animator = i;
        } else {
            animator = i;
            Rect rect4 = new Rect(0, 0, editText.getWidth(), editText.getHeight());
            ValueAnimator ofInt = ValueAnimator.ofInt(this.p.getTextView().getWidth(), editText.getWidth());
            ofInt.addUpdateListener(new up0(2, this, rect4));
            animatorSet4.playTogether(ofInt);
        }
        animatorSet4.setDuration(z ? 300L : 250L);
        animatorSet4.setInterpolator(fdo.a(z, linearInterpolator));
        animatorSet.playTogether(ofFloat, ofObject, ofFloat2, animatorSet3, animator, i2, ofFloat6, j, j2, animatorSet4);
        animatorSet.addListener(new y2c(this, z));
        return animatorSet;
    }

    public final int f(View view) {
        int marginEnd = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).getMarginEnd();
        int l = l(this.p);
        return this.p.getLayoutDirection() == 1 ? l - marginEnd : ((this.p.getWidth() + l) + marginEnd) - this.a.getWidth();
    }

    public final int g() {
        FrameLayout frameLayout = this.e;
        int height = (frameLayout.getHeight() / 2) + frameLayout.getTop();
        SearchBar searchBar = this.p;
        int top = searchBar.getTop();
        for (ViewParent parent = searchBar.getParent(); (parent instanceof View) && parent != this.a.getParent(); parent = parent.getParent()) {
            top += ((View) parent).getTop();
        }
        return ((this.p.getHeight() / 2) + top) - height;
    }

    public final AnimatorSet h(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.c;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(clippableRoundedCornerLayout.getHeight(), 0.0f);
        ofFloat.addUpdateListener(nl4.a(clippableRoundedCornerLayout));
        animatorSet.playTogether(ofFloat);
        b(animatorSet);
        animatorSet.setInterpolator(fdo.a(z, wm0.b));
        animatorSet.setDuration(z ? 350L : 300L);
        return animatorSet;
    }

    public final AnimatorSet j(View view, boolean z) {
        TextView placeholderTextView = this.p.getPlaceholderTextView();
        if (TextUtils.isEmpty(placeholderTextView.getText()) || z) {
            placeholderTextView = this.p.getTextView();
        }
        return i(view, l(placeholderTextView) - (this.h.getLeft() + view.getLeft()), g(), z);
    }

    public final int k(View view, View view2) {
        if (view != null) {
            return l(view) - l(view2);
        }
        int marginStart = ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).getMarginStart();
        int paddingStart = this.p.getPaddingStart();
        int l = l(this.p);
        return this.p.getLayoutDirection() == 1 ? (((this.p.getWidth() + l) + marginStart) - paddingStart) - this.a.getRight() : (l - marginStart) + paddingStart;
    }

    public final int l(View view) {
        int left = view.getLeft();
        for (ViewParent parent = view.getParent(); (parent instanceof View) && parent != this.a.getParent(); parent = parent.getParent()) {
            left += ((View) parent).getLeft();
        }
        return left;
    }

    public final AnimatorSet m() {
        SearchBar searchBar = this.p;
        SearchView searchView = this.a;
        if (searchBar != null) {
            if (searchView.d()) {
                searchView.b();
            }
            AnimatorSet e = e(false);
            e.addListener(new s8p(this, 1));
            e.start();
            return e;
        }
        if (searchView.d()) {
            searchView.b();
        }
        AnimatorSet h = h(false);
        h.addListener(new s8p(this, 3));
        h.start();
        return h;
    }

    public final void n(ri2 ri2Var) {
        float f = ri2Var.c;
        if (f <= 0.0f) {
            return;
        }
        SearchBar searchBar = this.p;
        float cornerSize = searchBar.getCornerSize();
        kdh kdhVar = this.n;
        if (((ri2) kdhVar.f) == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        ri2 ri2Var2 = (ri2) kdhVar.f;
        kdhVar.f = ri2Var;
        if (ri2Var2 != null) {
            if (searchBar.getVisibility() != 4) {
                searchBar.setVisibility(4);
            }
            boolean z = ri2Var.d == 0;
            float f2 = ri2Var.b;
            float f3 = kdhVar.g;
            float interpolation = ((PathInterpolator) kdhVar.d).getInterpolation(f);
            View view = (View) kdhVar.e;
            float width = view.getWidth();
            float height = view.getHeight();
            if (width > 0.0f && height > 0.0f) {
                float a = wm0.a(1.0f, 0.9f, interpolation);
                float a2 = wm0.a(0.0f, Math.max(0.0f, ((width - (0.9f * width)) / 2.0f) - f3), interpolation) * (z ? 1 : -1);
                float min = Math.min(Math.max(0.0f, ((height - (a * height)) / 2.0f) - f3), kdhVar.h);
                float f4 = f2 - kdhVar.i;
                float a3 = wm0.a(0.0f, min, Math.abs(f4) / height) * Math.signum(f4);
                if (!Float.isNaN(a) && !Float.isNaN(a2) && !Float.isNaN(a3)) {
                    view.setScaleX(a);
                    view.setScaleY(a);
                    view.setTranslationX(a2);
                    view.setTranslationY(a3);
                    if (view instanceof ClippableRoundedCornerLayout) {
                        float[] g = kdhVar.g();
                        ((ClippableRoundedCornerLayout) view).a(r17.getLeft(), r17.getTop(), r17.getRight(), r17.getBottom(), new float[]{wm0.a(g[0], cornerSize, interpolation), wm0.a(g[1], cornerSize, interpolation), wm0.a(g[2], cornerSize, interpolation), wm0.a(g[3], cornerSize, interpolation), wm0.a(g[4], cornerSize, interpolation), wm0.a(g[5], cornerSize, interpolation), wm0.a(g[6], cornerSize, interpolation), wm0.a(g[7], cornerSize, interpolation)});
                    }
                }
            }
        }
        AnimatorSet animatorSet = this.o;
        if (animatorSet != null) {
            animatorSet.setCurrentPlayTime((long) (f * animatorSet.getDuration()));
            return;
        }
        SearchView searchView = this.a;
        if (searchView.d()) {
            searchView.b();
        }
        if (searchView.w) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            b(animatorSet2);
            animatorSet2.setDuration(250L);
            animatorSet2.setInterpolator(fdo.a(false, wm0.b));
            this.o = animatorSet2;
            animatorSet2.start();
            this.o.pause();
        }
    }
}
