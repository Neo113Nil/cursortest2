package ru.yandex.taxi.requirements.glued.ui.image;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import defpackage.aub;
import defpackage.jl40;
import defpackage.kjj0;
import defpackage.kp50;
import defpackage.og20;
import defpackage.vpr;
import defpackage.xw31;
import defpackage.zy11;
import java.util.List;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.requirements.glued.ui.image.a;

/* loaded from: classes6.dex */
public final class h implements vpr {
    public final /* synthetic */ i a;

    public h(i iVar) {
        this.a = iVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Triple triple = (Triple) obj;
        String str = (String) triple.getFirst();
        Bitmap bitmap = (Bitmap) triple.getSecond();
        List list = (List) triple.getThird();
        i iVar = this.a;
        iVar.getClass();
        ViewState viewState = list.isEmpty() ? ViewState.CAR : ViewState.OPTIONS;
        final int i = 1;
        final int i2 = 0;
        boolean z = viewState != iVar.k;
        boolean l = jl40.l(iVar.l, str);
        iVar.k = viewState;
        iVar.l = str;
        kjj0 kjj0Var = iVar.i;
        List list2 = kjj0Var.b;
        kjj0Var.b = list;
        if (l) {
            kp50.f(new og20(list2, list, new aub(14)), true).b(kjj0Var);
        } else {
            kjj0Var.notifyDataSetChanged();
        }
        ViewState viewState2 = iVar.k;
        ViewState viewState3 = ViewState.CAR;
        if (viewState2 == viewState3) {
            ImageView imageView = iVar.f;
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
            } else {
                imageView.setImageDrawable(null);
            }
        }
        int width = bitmap != null ? bitmap.getWidth() : 0;
        int v = xw31.v();
        if (width > v) {
            width = v;
        }
        int height = bitmap != null ? bitmap.getHeight() : 0;
        boolean z2 = (width == iVar.n && height == iVar.m) ? false : true;
        iVar.n = width;
        iVar.m = height;
        if (z2) {
            iVar.p.invoke();
        }
        if (z) {
            final a aVar = iVar.j;
            if (viewState == viewState3) {
                View view = aVar.a;
                view.animate().cancel();
                if (l) {
                    State state = aVar.b;
                    State state2 = State.SHOWN;
                    if (state != state2) {
                        aVar.b = state2;
                        int width2 = xw31.n(view.getContext()) ? view.getWidth() - (view.getRight() - ((View) view.getParent()).getWidth()) : (-view.getWidth()) + (-view.getLeft());
                        if (view.getTranslationX() == 0.0f) {
                            view.setTranslationX(width2);
                        }
                        view.setVisibility(0);
                        view.animate().translationX(0.0f).setDuration(600L).withEndAction(new Runnable() { // from class: h8h
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i3 = i2;
                                a aVar2 = aVar;
                                switch (i3) {
                                    case 0:
                                        aVar2.a.setTranslationX(0.0f);
                                        break;
                                    default:
                                        aVar2.a.setTranslationX(0.0f);
                                        aVar2.a.setVisibility(4);
                                        break;
                                }
                            }
                        });
                    }
                } else {
                    view.setTranslationX(0.0f);
                    view.setVisibility(0);
                    aVar.b = State.SHOWN;
                }
            } else {
                View view2 = aVar.a;
                view2.animate().cancel();
                if (l) {
                    State state3 = aVar.b;
                    State state4 = State.HIDED;
                    if (state3 != state4) {
                        aVar.b = state4;
                        int width3 = xw31.n(view2.getContext()) ? (-view2.getLeft()) - view2.getWidth() : (-view2.getLeft()) + xw31.v();
                        view2.setVisibility(0);
                        view2.animate().translationX(width3).setDuration(600L).withEndAction(new Runnable() { // from class: h8h
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i3 = i;
                                a aVar2 = aVar;
                                switch (i3) {
                                    case 0:
                                        aVar2.a.setTranslationX(0.0f);
                                        break;
                                    default:
                                        aVar2.a.setTranslationX(0.0f);
                                        aVar2.a.setVisibility(4);
                                        break;
                                }
                            }
                        });
                    }
                } else {
                    view2.setTranslationX(0.0f);
                    view2.setVisibility(4);
                    aVar.b = State.HIDED;
                }
            }
        }
        return zy11.a;
    }
}
