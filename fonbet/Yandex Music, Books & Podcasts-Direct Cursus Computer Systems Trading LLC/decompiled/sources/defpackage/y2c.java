package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.search.SearchBar;

/* loaded from: classes3.dex */
public final class y2c extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y2c(int i, Object obj) {
        this.a = i;
        this.c = obj;
        this.b = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.b = true;
                break;
            case 2:
                this.b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                if (!this.b) {
                    ((View) obj).setVisibility(4);
                    break;
                }
                break;
            case 1:
                m5c m5cVar = (m5c) obj;
                if (!this.b) {
                    if (((Float) m5cVar.z.getAnimatedValue()).floatValue() != 0.0f) {
                        m5cVar.A = 2;
                        m5cVar.s.invalidate();
                        break;
                    } else {
                        m5cVar.A = 0;
                        m5cVar.l(0);
                        break;
                    }
                } else {
                    this.b = false;
                    break;
                }
            case 2:
                lyo lyoVar = (lyo) obj;
                if (!this.b) {
                    lyoVar.setVisibility(0);
                    break;
                }
                break;
            default:
                t8p t8pVar = (t8p) obj;
                EditText editText = t8pVar.j;
                boolean z = this.b;
                t8p.a(t8pVar, z ? 1.0f : 0.0f);
                editText.setAlpha(1.0f);
                SearchBar searchBar = t8pVar.p;
                if (searchBar != null) {
                    searchBar.getTextView().setAlpha(1.0f);
                }
                editText.setClipBounds(null);
                ClippableRoundedCornerLayout clippableRoundedCornerLayout = t8pVar.c;
                clippableRoundedCornerLayout.a = null;
                clippableRoundedCornerLayout.b = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
                clippableRoundedCornerLayout.invalidate();
                if (!z) {
                    t8pVar.n.l = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                if (this.b) {
                    ((View) this.c).setVisibility(0);
                    break;
                }
                break;
            case 1:
            default:
                super.onAnimationStart(animator);
                break;
            case 2:
                ((lyo) this.c).setVisibility(0);
                this.b = false;
                break;
            case 3:
                t8p.a((t8p) this.c, this.b ? 0.0f : 1.0f);
                break;
        }
    }

    public y2c(View view, boolean z) {
        this.a = 0;
        this.b = z;
        this.c = view;
    }

    public y2c(t8p t8pVar, boolean z) {
        this.a = 3;
        this.c = t8pVar;
        this.b = z;
    }
}
