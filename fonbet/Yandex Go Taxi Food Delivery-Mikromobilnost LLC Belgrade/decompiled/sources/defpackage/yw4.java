package defpackage;

import android.widget.TextView;
import java.util.List;
import ru.yandex.taxi.preorder.suggested.selection.SuggestsView;
import ru.yandex.taxi.search.view.BaseAddressSearchView;

/* loaded from: classes6.dex */
public abstract class yw4 implements i51 {
    public final /* synthetic */ BaseAddressSearchView a;

    public yw4(BaseAddressSearchView baseAddressSearchView) {
        this.a = baseAddressSearchView;
    }

    public final void I() {
        TextView textView;
        BaseAddressSearchView baseAddressSearchView = this.a;
        baseAddressSearchView.suggestsViewField().setVisibility(4);
        hideProgress();
        textView = baseAddressSearchView.emptyOrDefaultMessageView;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    @Override // defpackage.i51
    public final boolean Xd() {
        return this.a.getSuggestsProgressView().getVisibility() == 0;
    }

    @Override // defpackage.i51
    public void a9() {
        TextView textView;
        TextView textView2;
        I();
        BaseAddressSearchView baseAddressSearchView = this.a;
        textView = baseAddressSearchView.emptyOrDefaultMessageView;
        if (textView == null) {
            baseAddressSearchView.emptyOrDefaultMessageView = (TextView) baseAddressSearchView.getEmptyOrDefaultMessageViewStub().inflate();
        }
        textView2 = baseAddressSearchView.emptyOrDefaultMessageView;
        if (textView2 == null) {
            ny61.g("Required value was null.");
            return;
        }
        textView2.setText(baseAddressSearchView.getDefaultMessageText());
        textView2.setVisibility(0);
        textView2.setOnClickListener(null);
        textView2.setClickable(false);
    }

    @Override // defpackage.i51
    public void cg() {
        TextView textView;
        TextView textView2;
        I();
        BaseAddressSearchView baseAddressSearchView = this.a;
        textView = baseAddressSearchView.emptyOrDefaultMessageView;
        if (textView == null) {
            baseAddressSearchView.emptyOrDefaultMessageView = (TextView) baseAddressSearchView.getEmptyOrDefaultMessageViewStub().inflate();
        }
        textView2 = baseAddressSearchView.emptyOrDefaultMessageView;
        if (textView2 == null) {
            ny61.g("Required value was null.");
            return;
        }
        textView2.setText(baseAddressSearchView.getNotFoundMessageText());
        textView2.setOnClickListener(new tf(12, baseAddressSearchView));
        textView2.setVisibility(0);
        baseAddressSearchView.onScrollToBottom(0);
    }

    @Override // defpackage.hz20
    public final void dismiss() {
        h(null);
    }

    public final void h(Runnable runnable) {
        t030 modalViewCompatibleDelegate = this.a.getModalViewCompatibleDelegate();
        if (modalViewCompatibleDelegate != null) {
            modalViewCompatibleDelegate.dismissWithAction(runnable);
        }
    }

    @Override // defpackage.i51
    public final void hideProgress() {
        this.a.getSuggestsProgressView().setVisibility(8);
    }

    @Override // defpackage.i51
    public final void showProgress() {
        I();
        this.a.getSuggestsProgressView().setVisibility(0);
    }

    @Override // defpackage.i51
    public final void y2(List list) {
        SuggestsView.State state;
        I();
        BaseAddressSearchView baseAddressSearchView = this.a;
        baseAddressSearchView.suggestsViewField().setVisibility(0);
        baseAddressSearchView.suggestsViewField().changeDataSet(list);
        SuggestsView suggestsViewField = baseAddressSearchView.suggestsViewField();
        state = baseAddressSearchView.suggestsViewState;
        suggestsViewField.changeViewState(state);
    }
}
