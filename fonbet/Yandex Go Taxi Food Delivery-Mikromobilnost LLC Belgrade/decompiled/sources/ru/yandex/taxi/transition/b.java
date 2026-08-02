package ru.yandex.taxi.transition;

import android.view.View;
import defpackage.ce0;
import defpackage.w511;
import defpackage.yjx;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.transition.AttachableViewHolder;
import ru.yandex.taxi.transition.b;
import ru.yandex.taxi.widget.ModalView;

/* loaded from: classes6.dex */
public abstract class b extends AttachableViewHolder {
    @Override // ru.yandex.taxi.transition.AttachableViewHolder
    public void M1(AttachableViewHolder.b bVar) {
        super.M1(bVar);
        if (bVar.a || bVar.b) {
            h().dismissWithAction(bVar.c);
        }
    }

    @Override // ru.yandex.taxi.transition.AttachableViewHolder
    /* renamed from: N3, reason: merged with bridge method [inline-methods] */
    public abstract ModalView h();

    public final void Q2() {
        View findFocus = h().findFocus();
        if (findFocus != null) {
            findFocus.clearFocus();
            findFocus.post(new ce0(findFocus, 15));
        }
        requestFocus();
    }

    public void closeKeyboard() {
        Q2();
    }

    public void hideKeyboard() {
        Q2();
    }

    public final void p6(final ListItemInputComponent listItemInputComponent) {
        listItemInputComponent.getInput().setOnCloseListener(new yjx() { // from class: m030
            @Override // defpackage.yjx
            public final void onClose() {
                ListItemInputComponent listItemInputComponent2 = listItemInputComponent;
                listItemInputComponent2.clearFocus();
                listItemInputComponent2.post(new ce0(listItemInputComponent2, 15));
                b.this.requestFocus();
            }
        });
    }

    public void q4(AttachableViewHolder.TransitionType transitionType) {
        ModalView.TransitionType transitionType2;
        ModalView h = h();
        int i = a.a[transitionType.ordinal()];
        if (i == 1) {
            transitionType2 = ModalView.TransitionType.APPEAR;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            transitionType2 = ModalView.TransitionType.DISAPPEAR;
        }
        h.onTransitionEnd(transitionType2);
    }

    @Override // ru.yandex.taxi.transition.AttachableViewHolder
    public void requestFocus() {
        requestFocus();
    }

    public final void s5(AttachableViewHolder.TransitionType transitionType) {
        ModalView.TransitionType transitionType2;
        ModalView h = h();
        int i = a.a[transitionType.ordinal()];
        if (i == 1) {
            transitionType2 = ModalView.TransitionType.APPEAR;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            transitionType2 = ModalView.TransitionType.DISAPPEAR;
        }
        h.onTransitionStart(transitionType2);
    }
}
