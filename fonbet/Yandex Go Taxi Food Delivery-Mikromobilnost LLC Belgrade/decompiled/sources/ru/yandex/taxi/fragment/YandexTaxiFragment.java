package ru.yandex.taxi.fragment;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a600;
import defpackage.dl40;
import defpackage.dxf0;
import defpackage.el40;
import defpackage.jcs;
import defpackage.ny61;
import defpackage.vdj;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.ui.FragmentBackground;
import ru.yandex.taxi.ui.MultiClickHandler$OnClickListener;
import ru.yandex.taxi.widget.dialog.BaseDialog;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u00042\u00020\u0005:\u0001<B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0016¢\u0006\u0004\b\u000b\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0010\u0010\u0007J\u000f\u0010\u0012\u001a\u00020\u0011H\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0007J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u0007J\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u0007J\u000f\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u0007J\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0011¢\u0006\u0004\b\"\u0010\u0013J\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0011H\u0016¢\u0006\u0004\b&\u0010\u0013J\u000f\u0010'\u001a\u00020\nH\u0016¢\u0006\u0004\b'\u0010\u0007J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0011H\u0016¢\u0006\u0004\b+\u0010\u0013J\u000f\u0010,\u001a\u00020\u0011H\u0016¢\u0006\u0004\b,\u0010\u0013J\u000f\u0010-\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00028\u0000¢\u0006\u0004\b/\u0010.J\r\u00101\u001a\u000200¢\u0006\u0004\b1\u00102R\u0018\u0010\u001c\u001a\u0004\u0018\u00018\u00008\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\b\u001c\u00103R\u0014\u00104\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00106\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u00108\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006="}, d2 = {"Lru/yandex/taxi/fragment/YandexTaxiFragment;", CA20Status.STATUS_REQUEST_C, "Ljcs;", "F", "Lru/yandex/taxi/fragment/BaseFragment;", "Lel40;", "<init>", "()V", "Lvdj;", "dialogFactory", "Lzy11;", "showDialog", "(Lvdj;)V", "Lru/yandex/taxi/widget/dialog/BaseDialog;", "dialog", "(Lru/yandex/taxi/widget/dialog/BaseDialog;)V", "dismissDisplayingDialog", "", "hasDialog", "()Z", "onDialogDismissed", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "onResume", "onPause", "onDetach", "callback", "setCallbackListener", "(Ljava/lang/Object;)V", "Lru/yandex/taxi/ui/FragmentBackground;", "getBackground", "()Lru/yandex/taxi/ui/FragmentBackground;", "hasView", "Landroid/view/ViewGroup;", "getRootView", "()Landroid/view/ViewGroup;", "satisfiesClickDelay", "updateLastClickOnItemTimestamp", "", "getLastClickOnItemTimestamp", "()J", "hasSettings", "canOpenMainMenu", "getCallback", "()Ljava/lang/Object;", "requireCallback", "La600;", "asMenuOwner", "()La600;", "Ljava/lang/Object;", "multiClickHandler", "Lel40;", "deferredDialogFactory", "Lvdj;", "displayingDialog", "Lru/yandex/taxi/widget/dialog/BaseDialog;", "mainMenuOwner", "La600;", "SharedClickStateOnClickListener", "fragment"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public class YandexTaxiFragment<C, F extends jcs> extends BaseFragment<F> implements el40 {
    protected C callback;
    private vdj deferredDialogFactory;
    private BaseDialog<?> displayingDialog;
    private final el40 multiClickHandler = new dl40(0);
    private final a600 mainMenuOwner = new dxf0(this);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b¦\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/fragment/YandexTaxiFragment$SharedClickStateOnClickListener;", "Lru/yandex/taxi/ui/MultiClickHandler$OnClickListener;", "<init>", "(Lru/yandex/taxi/fragment/YandexTaxiFragment;)V", "fragment"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public abstract class SharedClickStateOnClickListener extends MultiClickHandler$OnClickListener {
        public SharedClickStateOnClickListener() {
            super(YandexTaxiFragment.this);
        }
    }

    /* renamed from: asMenuOwner, reason: from getter */
    public final a600 getMainMenuOwner() {
        return this.mainMenuOwner;
    }

    public boolean canOpenMainMenu() {
        return true;
    }

    public void dismissDisplayingDialog() {
        BaseDialog<?> baseDialog = this.displayingDialog;
        if (baseDialog != null && baseDialog.getDismissOnFragmentDetach()) {
            baseDialog.dismiss();
        }
        this.displayingDialog = null;
    }

    public FragmentBackground getBackground() {
        return FragmentBackground.BLANK;
    }

    public final C getCallback() {
        return this.callback;
    }

    @Override // defpackage.el40
    public long getLastClickOnItemTimestamp() {
        return this.multiClickHandler.getLastClickOnItemTimestamp();
    }

    public final ViewGroup getRootView() {
        View view = getView();
        if (view != null) {
            return (ViewGroup) view;
        }
        ny61.r("Get view while in detached state");
        return null;
    }

    public final boolean hasDialog() {
        return (this.displayingDialog == null && this.deferredDialogFactory == null) ? false : true;
    }

    public boolean hasSettings() {
        return false;
    }

    public final boolean hasView() {
        return getView() != null;
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        vdj vdjVar = this.deferredDialogFactory;
        if (vdjVar != null) {
            showDialog(vdjVar.b(requireActivity()));
            this.deferredDialogFactory = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        dismissDisplayingDialog();
    }

    public void onDialogDismissed() {
        this.displayingDialog = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        BaseDialog<?> baseDialog = this.displayingDialog;
        if (baseDialog != null) {
            baseDialog.onPause();
        }
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.multiClickHandler.updateLastClickOnItemTimestamp();
        BaseDialog<?> baseDialog = this.displayingDialog;
        if (baseDialog != null) {
            baseDialog.onResume();
        }
    }

    public final C requireCallback() {
        C c = this.callback;
        if (c != null) {
            return c;
        }
        ny61.r("Required value was null.");
        return null;
    }

    @Override // defpackage.el40
    public boolean satisfiesClickDelay() {
        return this.multiClickHandler.satisfiesClickDelay();
    }

    public final void setCallbackListener(C callback) {
        this.callback = callback;
    }

    public void showDialog(vdj dialogFactory) {
        if (getActivity() == null) {
            this.deferredDialogFactory = dialogFactory;
        } else {
            showDialog(dialogFactory.b(requireActivity()));
        }
    }

    @Override // defpackage.el40
    public void updateLastClickOnItemTimestamp() {
        this.multiClickHandler.updateLastClickOnItemTimestamp();
    }

    public void showDialog(BaseDialog<?> dialog) {
        dialog.show();
        this.displayingDialog = dialog;
    }
}
