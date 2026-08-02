package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ru.yandex.taxi.address.design.AddressInputView;
import ru.yandex.taxi.scooters.presentation.feedback.comment.ScootersCommentAndPhotosView;
import ru.yandex.taxi.search.address.view.CompositeAddressSearchView;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes6.dex */
public final /* synthetic */ class qw0 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qw0(ViewGroup viewGroup, Object obj, int i) {
        this.a = i;
        this.b = viewGroup;
        this.c = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.a;
        Object obj = this.c;
        ViewGroup viewGroup = this.b;
        switch (i) {
            case 0:
                AddressInputView.setOnFocusChangeListener$lambda$0((AddressInputView) viewGroup, (View.OnFocusChangeListener) obj, view, z);
                break;
            case 1:
                CompositeAddressSearchView.createOnFocusChangeListenerV2$lambda$0((CompositeAddressSearchView) viewGroup, (PointType) obj, view, z);
                break;
            default:
                ScootersCommentAndPhotosView.setOnCommentFocusedListener$lambda$0((ScootersCommentAndPhotosView) viewGroup, (sls) obj, view, z);
                break;
        }
    }
}
