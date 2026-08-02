package ru.yandex.taxi.fragment;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.b;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import com.yandex.go.broadcast.NetworkChangesReceiver;
import defpackage.a0g;
import defpackage.eja1;
import defpackage.g18;
import defpackage.hst;
import defpackage.jcs;
import defpackage.jst;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.q15;
import defpackage.qke;
import defpackage.qv10;
import defpackage.rp31;
import defpackage.tje;
import defpackage.up50;
import defpackage.w030;
import defpackage.wfi0;
import defpackage.y030;
import defpackage.yvf0;
import defpackage.zbs;
import java.util.Arrays;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.activity.ContentContainer$ZOrder;
import ru.yandex.yx_platform_api.InternetConnectionStreamHandler;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0006J\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u001a\u001a\u00020\u0019H\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010 \u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\u001e*\u00020\u00122\b\b\u0001\u0010\u001f\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J!\u0010\"\u001a\u00028\u0001\"\b\b\u0001\u0010\u001e*\u00020\u00122\b\b\u0001\u0010\u001f\u001a\u00020\u0019¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010\u0006J\u000f\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010\u0006J\u0019\u0010'\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010%H\u0004¢\u0006\u0004\b'\u0010(J\u0019\u0010+\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010**\u00020)¢\u0006\u0004\b+\u0010,J\u0019\u0010-\u001a\u00028\u0001\"\b\b\u0001\u0010**\u00020)H\u0007¢\u0006\u0004\b-\u0010,J\u000f\u0010.\u001a\u00028\u0000H\u0016¢\u0006\u0004\b.\u0010/J\r\u00101\u001a\u000200¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u00072\u0006\u00104\u001a\u000203H\u0007¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0007H\u0017¢\u0006\u0004\b7\u0010\u0006R$\u0010:\u001a\n\u0012\u0004\u0012\u000209\u0018\u0001088\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b:\u0010;\u0012\u0004\b<\u0010\u0006R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010CR\u0016\u0010D\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR$\u0010J\u001a\u0004\u0018\u00010I8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0011\u0010S\u001a\u00020P8F¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0011\u0010U\u001a\u00020P8F¢\u0006\u0006\u001a\u0004\bT\u0010RR\u0011\u0010V\u001a\u0002008F¢\u0006\u0006\u001a\u0004\bV\u00102R\u0014\u0010X\u001a\u00020I8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010MR\u0014\u0010Z\u001a\u00020I8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010M¨\u0006["}, d2 = {"Lru/yandex/taxi/fragment/BaseFragment;", "Ljcs;", CA20Status.STATUS_USER_I, "Landroidx/fragment/app/Fragment;", "", "<init>", "()V", "Lzy11;", "initInsetsHandling", "tryToRegisterBroadcastReceiver", "tryToUnregisterBroadcastReceiver", "Lw030;", "modalViewCoordinator", "()Lw030;", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "", "autoPaddingGravity", "()I", "asView", "()Landroid/view/View;", "T", "id", "findViewById", "(I)Landroid/view/View;", "nonNullViewById", "onResume", "onDestroyView", "Lup50;", "networkReceiverListener", "setNetworkReceiverListener", "(Lup50;)V", "Lzbs;", CA20Status.STATUS_REQUEST_C, "getComponent", "()Lzbs;", "requireComponent", "injector", "()Ljcs;", "", "showOnTopOfMenuButton", "()Z", "Landroid/app/Activity;", "activity", "onAppearingStart", "(Landroid/app/Activity;)V", "onDismissingStart", "Lyvf0;", "Lwfi0;", "receiverProvider", "Lyvf0;", "getReceiverProvider$annotations", "Landroid/content/BroadcastReceiver;", "networkReceiver", "Landroid/content/BroadcastReceiver;", "Lup50;", "component", "Lzbs;", "Lw030;", "isActive", "Z", "Lg18;", "insetsPaddingsCancellable", "Lg18;", "", "accessibilityScreenName", "Ljava/lang/String;", "getAccessibilityScreenName", "()Ljava/lang/String;", "setAccessibilityScreenName", "(Ljava/lang/String;)V", "Landroidx/lifecycle/o;", "getLifecycleScope", "()Landroidx/lifecycle/o;", "lifecycleScope", "getViewLifecycleScope", "viewLifecycleScope", "isAttachedAndActive", "getPromoName", "promoName", "getBusinessName", "businessName", "fragment"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class BaseFragment<I extends jcs> extends Fragment {
    private String accessibilityScreenName;
    private zbs component;
    private g18 insetsPaddingsCancellable;
    private boolean isActive;
    private w030 modalViewCoordinator;
    private BroadcastReceiver networkReceiver;
    private up50 networkReceiverListener;
    public yvf0 receiverProvider;

    public static /* synthetic */ void getReceiverProvider$annotations() {
    }

    private final void initInsetsHandling() {
        int autoPaddingGravity = autoPaddingGravity();
        View asView = asView();
        if (autoPaddingGravity == 0 || asView.getFitsSystemWindows()) {
            return;
        }
        this.insetsPaddingsCancellable = tje.k(autoPaddingGravity, asView);
    }

    private final void tryToRegisterBroadcastReceiver() {
        up50 up50Var = this.networkReceiverListener;
        if (up50Var == null) {
            jst.e.getClass();
            return;
        }
        NetworkChangesReceiver networkChangesReceiver = new NetworkChangesReceiver(up50Var);
        yvf0 yvf0Var = this.receiverProvider;
        if (yvf0Var != null && ((wfi0) yvf0Var.get()) != null) {
            qke.z(requireContext(), networkChangesReceiver, new IntentFilter(InternetConnectionStreamHandler.CONNECTIVITY_ACTION), 2);
        }
        this.networkReceiver = networkChangesReceiver;
        jst.e.getClass();
    }

    private final void tryToUnregisterBroadcastReceiver() {
        BroadcastReceiver broadcastReceiver = this.networkReceiver;
        if (broadcastReceiver == null) {
            jst.e.getClass();
            return;
        }
        yvf0 yvf0Var = this.receiverProvider;
        if (yvf0Var != null && ((wfi0) yvf0Var.get()) != null) {
            requireContext().unregisterReceiver(broadcastReceiver);
        }
        this.networkReceiver = null;
        jst.e.getClass();
    }

    public final View asView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        ny61.r("Cannot provide any root view");
        return null;
    }

    public int autoPaddingGravity() {
        return 119;
    }

    public <T extends View> T findViewById(int id) {
        return (T) asView().findViewById(id);
    }

    public final String getAccessibilityScreenName() {
        return this.accessibilityScreenName;
    }

    public String getBusinessName() {
        return getClass().getSimpleName();
    }

    public final <C extends zbs> C getComponent() {
        return (C) this.component;
    }

    public final o getLifecycleScope() {
        return r.a(getLifecycle());
    }

    public String getPromoName() {
        return "#none#";
    }

    public final o getViewLifecycleScope() {
        return eja1.s(getViewLifecycleOwner());
    }

    public I injector() {
        zbs zbsVar = this.component;
        Objects.requireNonNull(zbsVar);
        return (I) zbsVar;
    }

    public final boolean isAttachedAndActive() {
        return this.isActive && isAdded() && !isRemoving();
    }

    public final w030 modalViewCoordinator() {
        w030 w030Var = this.modalViewCoordinator;
        if (w030Var != null) {
            return w030Var;
        }
        jst.e.s(new NullPointerException("You are trying to access modalViewCoordinator before appearing start. Or your fragment doesn't have one"));
        return w030.a;
    }

    public final <T extends View> T nonNullViewById(int id) {
        View asView = asView();
        WeakHashMap weakHashMap = b.a;
        return (T) rp31.d(asView, id);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAppearingStart(Activity activity) {
        jst.e.p(String.format("%s onAppearingStart", Arrays.copyOf(new Object[]{getBusinessName()}, 1)), new Exception());
        if (this.isActive) {
            return;
        }
        this.isActive = true;
        if (activity instanceof q15) {
            a0g a0gVar = (a0g) ((q15) activity).createFragmentComponent();
            this.modalViewCoordinator = ((y030) a0gVar.b.a.b.H3.get()).a(ContentContainer$ZOrder.FRAGMENT_MODAL_VIEW);
            this.component = a0gVar;
            modalViewCoordinator().b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        hst hstVar = jst.e;
        qv10.C(new Object[]{getClass().getSimpleName(), Boolean.valueOf(this.component == null)}, 2, "%s onAttach. Component is null? %s", hstVar);
        if (this.component == null) {
            if (context instanceof q15) {
                a0g a0gVar = (a0g) ((q15) context).createFragmentComponent();
                this.modalViewCoordinator = ((y030) a0gVar.b.a.b.H3.get()).a(ContentContainer$ZOrder.FRAGMENT_MODAL_VIEW);
                this.component = a0gVar;
            } else {
                hstVar.s(new IllegalStateException("fragment is not attached to supported activity"));
            }
        }
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        g18 g18Var = this.insetsPaddingsCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        super.onDestroyView();
    }

    public void onDismissingStart() {
        jst.e.p(String.format("%s onDismissingStart", Arrays.copyOf(new Object[]{getBusinessName()}, 1)), new Exception());
        if (this.isActive) {
            this.isActive = false;
            modalViewCoordinator().q();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        asView().requestApplyInsets();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        String str = this.accessibilityScreenName;
        if (str == null || str.length() == 0) {
            return;
        }
        asView().announceForAccessibility(this.accessibilityScreenName);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initInsetsHandling();
    }

    @jxi
    public final <C extends zbs> C requireComponent() {
        zbs component = getComponent();
        Objects.requireNonNull(component);
        return (C) component;
    }

    public final void setAccessibilityScreenName(String str) {
        this.accessibilityScreenName = str;
    }

    public final void setNetworkReceiverListener(up50 networkReceiverListener) {
        if (this.networkReceiverListener == networkReceiverListener) {
            return;
        }
        this.networkReceiverListener = networkReceiverListener;
        if (networkReceiverListener != null) {
            tryToRegisterBroadcastReceiver();
        } else {
            tryToUnregisterBroadcastReceiver();
        }
    }

    public final boolean showOnTopOfMenuButton() {
        return false;
    }
}
