package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class o8n extends won {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public o8n(Context context) {
        context.getClass();
        this.b = context.getDrawable(R.drawable.plus_logs_debug_panel_divider_horizontal);
    }

    @Override // defpackage.won
    public void g(Canvas canvas, RecyclerView recyclerView, kpn kpnVar) {
        float f;
        float top;
        float translationY;
        float bottom;
        switch (this.a) {
            case 0:
                p8n p8nVar = (p8n) this.b;
                canvas.getClass();
                kpnVar.getClass();
                von itemAnimator = recyclerView.getItemAnimator();
                if (itemAnimator != null && itemAnimator.f() && !p8nVar.h) {
                    float width = recyclerView.getWidth();
                    yon layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager != null) {
                        int Q = layoutManager.Q();
                        View view = null;
                        int i = 0;
                        View view2 = null;
                        while (true) {
                            float f2 = 0.0f;
                            if (i < Q) {
                                View P = layoutManager.P(i);
                                if (P != null) {
                                    if (P.getTranslationY() < 0.0f) {
                                        view = P;
                                    } else if (P.getTranslationY() > 0.0f && view2 == null) {
                                        view2 = P;
                                    }
                                }
                                i++;
                            } else {
                                if (view != null && view2 != null) {
                                    f2 = view.getTranslationY() + view.getBottom();
                                    top = view2.getTop();
                                    translationY = view2.getTranslationY();
                                } else if (view != null) {
                                    f2 = view.getTranslationY() + view.getBottom();
                                    bottom = view.getBottom();
                                    f = bottom;
                                    canvas.drawRect(0.0f, f2, width, f, p8nVar.i);
                                    p8n.u(p8nVar, canvas, 0.0f, f2, width, f);
                                    break;
                                } else if (view2 != null) {
                                    f2 = view2.getTop();
                                    top = view2.getTop();
                                    translationY = view2.getTranslationY();
                                } else {
                                    f = 0.0f;
                                    canvas.drawRect(0.0f, f2, width, f, p8nVar.i);
                                    p8n.u(p8nVar, canvas, 0.0f, f2, width, f);
                                }
                                bottom = top + translationY;
                                f = bottom;
                                canvas.drawRect(0.0f, f2, width, f, p8nVar.i);
                                p8n.u(p8nVar, canvas, 0.0f, f2, width, f);
                            }
                        }
                    }
                }
                break;
        }
    }

    @Override // defpackage.won
    public void h(Canvas canvas, RecyclerView recyclerView, kpn kpnVar) {
        switch (this.a) {
            case 1:
                canvas.getClass();
                kpnVar.getClass();
                Drawable drawable = (Drawable) this.b;
                if (drawable != null) {
                    int paddingLeft = recyclerView.getPaddingLeft();
                    int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    qon adapter = recyclerView.getAdapter();
                    if (adapter != null) {
                        int childCount = recyclerView.getChildCount() - 1;
                        int i = 0;
                        while (i < childCount) {
                            View childAt = recyclerView.getChildAt(i);
                            i++;
                            View childAt2 = recyclerView.getChildAt(i);
                            int Y = RecyclerView.Y(childAt);
                            int Y2 = RecyclerView.Y(childAt2);
                            if (Y != -1 && Y2 != -1 && adapter.f(Y) == adapter.f(Y2)) {
                                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                                layoutParams.getClass();
                                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((zon) layoutParams)).bottomMargin;
                                drawable.setBounds(paddingLeft, bottom, width, drawable.getIntrinsicHeight() + bottom);
                                drawable.draw(canvas);
                            }
                        }
                        break;
                    }
                }
                break;
        }
    }

    public o8n(p8n p8nVar) {
        this.b = p8nVar;
    }
}
