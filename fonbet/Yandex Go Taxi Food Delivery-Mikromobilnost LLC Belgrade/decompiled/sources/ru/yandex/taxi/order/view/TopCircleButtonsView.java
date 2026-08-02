package ru.yandex.taxi.order.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import defpackage.cwz0;
import defpackage.dwz0;
import defpackage.dzg0;
import defpackage.gtq0;
import defpackage.hpo0;
import defpackage.jl40;
import defpackage.l8x;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.pav;
import defpackage.qg;
import defpackage.qje;
import defpackage.rmy0;
import defpackage.s741;
import defpackage.scc;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.ve60;
import defpackage.vng;
import defpackage.w511;
import defpackage.xlp0;
import defpackage.xng0;
import defpackage.xt;
import defpackage.xw;
import defpackage.ycc;
import defpackage.zy11;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.CircleButtonsPanelComponent;
import ru.yandex.taxi.superapp.orders.models.ActionAccessibilityType;
import ru.yandex.taxi.superapp.orders.models.ActionType;
import ru.yandex.taxi.widget.buttons.LoadingIconCircleButton;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001DB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u00020\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ-\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\"\u0010#J-\u0010&\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0017H\u0002¢\u0006\u0004\b&\u0010'J-\u0010(\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0017H\u0002¢\u0006\u0004\b(\u0010\u001aJ\u001d\u0010-\u001a\u00020\b2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\b¢\u0006\u0004\b/\u0010\nJ\u000f\u00100\u001a\u00020\bH\u0014¢\u0006\u0004\b0\u0010\nJ#\u00103\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000e01¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\b2\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u0004\u0018\u00010\u000b2\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J\u0013\u0010=\u001a\b\u0012\u0004\u0012\u00020901¢\u0006\u0004\b=\u0010>J\u0013\u0010?\u001a\b\u0012\u0004\u0012\u00020901¢\u0006\u0004\b?\u0010>R \u0010A\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020 0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020D0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020H8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bK\u0010JR\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010LR\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010M¨\u0006N"}, d2 = {"Lru/yandex/taxi/order/view/TopCircleButtonsView;", "Lru/yandex/taxi/design/CircleButtonsPanelComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lzy11;", "cancelAndRemoveJobs", "()V", "Lru/yandex/taxi/widget/buttons/LoadingIconCircleButton;", "", FinishFlowStatus.ORDER_ID_FIELD_NAME, "Lxw;", "actionModel", "bindCircleButton", "(Lru/yandex/taxi/widget/buttons/LoadingIconCircleButton;Ljava/lang/String;Lxw;)V", "button", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "applyContentDescriptionAndReadIfChanged", "(Lru/yandex/taxi/widget/buttons/LoadingIconCircleButton;Ljava/lang/String;)V", "circleButton", "Lkotlin/Function0;", "onShown", "loadCircleButtonImage", "(Lru/yandex/taxi/widget/buttons/LoadingIconCircleButton;Lxw;Lsls;)V", "loadAvatar", "loadIcon", "image", "removeJob", "(Ljava/lang/String;)V", "Ll8x;", "job", "replaceJob", "(Ll8x;Lxw;)V", "Landroid/graphics/Bitmap;", "bitmap", "showButton", "(Lru/yandex/taxi/widget/buttons/LoadingIconCircleButton;Landroid/graphics/Bitmap;Lsls;)V", "setupFallbackIcon", "Ltse;", "coroutineScope", "Lpav;", "imageLoader", "init", "(Ltse;Lpav;)V", "resetSubscriptions", "onDetachedFromWindow", "", "actions", "updateActions", "(Ljava/lang/String;Ljava/util/List;)V", "Lxt;", "actionClickListener", "setActionClickListener", "(Lxt;)V", "Lru/yandex/taxi/superapp/orders/models/ActionType;", "type", "getButtonForActionType", "(Lru/yandex/taxi/superapp/orders/models/ActionType;)Lru/yandex/taxi/widget/buttons/LoadingIconCircleButton;", "getVisibleButtons", "()Ljava/util/List;", "getInvisibleButtons", "", "jobsMap", "Ljava/util/Map;", "", "Lcwz0;", "actionViews", "Ljava/util/List;", "Lxt;", "", "circleButtonIconPadding", CA20Status.STATUS_USER_I, "circleButtonAvatarSize", "Ltse;", "Lpav;", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TopCircleButtonsView extends CircleButtonsPanelComponent {
    public static final int $stable = 8;
    private xt actionClickListener;
    private final List<cwz0> actionViews;
    private final int circleButtonAvatarSize;
    private final int circleButtonIconPadding;
    private tse coroutineScope;
    private pav imageLoader;
    private final Map<String, l8x> jobsMap;

    public TopCircleButtonsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.jobsMap = new LinkedHashMap();
        this.actionViews = new ArrayList();
        this.circleButtonIconPadding = tje.u(14, getContext());
        this.circleButtonAvatarSize = tje.r(mrg0.circle_buttons_circle_size, getContext());
    }

    private final void applyContentDescriptionAndReadIfChanged(LoadingIconCircleButton button, String description) {
        button.setContentDescription(description);
        if (description == null || description.length() == 0 || jl40.l(description, button.getContentDescription())) {
            return;
        }
        getRootView().announceForAccessibility(description);
    }

    private final void bindCircleButton(LoadingIconCircleButton loadingIconCircleButton, String str, xw xwVar) {
        loadingIconCircleButton.setTitleAutofitEnabled(xwVar.a.getIsAutofitPreferred());
        loadingIconCircleButton.setTitle(xwVar.b);
        boolean z = xwVar.l;
        loadingIconCircleButton.setEnabled(z);
        loadingIconCircleButton.setBadgeText(xwVar.c);
        loadingIconCircleButton.setBadgeTextColor(xwVar.j);
        loadingIconCircleButton.setBadgeContentDescription(xwVar.f);
        loadingIconCircleButton.setBadgeBackgroundColor(xwVar.i);
        loadingIconCircleButton.setAlpha(z ? 1.0f : 0.6f);
        applyContentDescriptionAndReadIfChanged(loadingIconCircleButton, xwVar.e);
        ActionAccessibilityType actionAccessibilityType = xwVar.k;
        if (actionAccessibilityType != null) {
            int i = dwz0.a[actionAccessibilityType.ordinal()];
            if (i == 1) {
                qg qgVar = new qg();
                qgVar.b = true;
                androidx.core.view.b.p(loadingIconCircleButton, qgVar);
            } else if (i == 2) {
                androidx.core.view.b.p(loadingIconCircleButton, new s741());
            } else {
                if (i != 3) {
                    w511.b();
                    return;
                }
                androidx.core.view.b.p(loadingIconCircleButton, new ve60());
            }
        }
        if (xwVar.o) {
            loadingIconCircleButton.startTitleAnimation();
        } else {
            loadingIconCircleButton.stopTitleAnimation();
        }
        if (xwVar.n) {
            loadCircleButtonImage(loadingIconCircleButton, xwVar, new xlp0(27, this, str, xwVar));
        } else {
            loadingIconCircleButton.setIcon(xwVar.h);
            loadingIconCircleButton.setIconPadding(this.circleButtonIconPadding);
            loadingIconCircleButton.setIconTintEnable(true);
            loadingIconCircleButton.setIconTintColor(qje.t(xng0.textOnControlMinor, loadingIconCircleButton.getContext()));
            int i2 = xwVar.g;
            if (i2 != -1) {
                loadingIconCircleButton.setIconBackground(vng.t(i2, loadingIconCircleButton.getContext()));
            } else {
                loadingIconCircleButton.setBackgroundColor(qje.t(xng0.controlMinor, loadingIconCircleButton.getContext()));
            }
        }
        loadingIconCircleButton.setDebounceClickListener(new hpo0(14, this, str, xwVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 bindCircleButton$lambda$1(TopCircleButtonsView topCircleButtonsView, String str, xw xwVar) {
        xt xtVar = topCircleButtonsView.actionClickListener;
        if (xtVar != null) {
            xtVar.f(xwVar.a);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindCircleButton$lambda$2(TopCircleButtonsView topCircleButtonsView, String str, xw xwVar) {
        xt xtVar = topCircleButtonsView.actionClickListener;
        if (xtVar != null) {
            xtVar.j(str, xwVar.a);
        }
    }

    private final void cancelAndRemoveJobs() {
        Iterator<T> it = this.jobsMap.values().iterator();
        while (it.hasNext()) {
            ((l8x) it.next()).a(null);
        }
        this.jobsMap.clear();
    }

    private final void loadAvatar(LoadingIconCircleButton circleButton, xw actionModel, sls onShown) {
        tse tseVar = this.coroutineScope;
        if (tseVar == null) {
            tseVar = null;
        }
        replaceJob(tje.N(tseVar, null, null, new TopCircleButtonsView$loadAvatar$job$1(actionModel, onShown, null, this, circleButton), 3), actionModel);
    }

    private final void loadCircleButtonImage(LoadingIconCircleButton circleButton, xw actionModel, sls onShown) {
        if (this.jobsMap.containsKey(actionModel.d)) {
            return;
        }
        if (!actionModel.m) {
            circleButton.setIconPadding(this.circleButtonIconPadding);
            loadIcon(circleButton, actionModel, onShown);
        } else {
            circleButton.setIconBackground(ru.yandex.taxi.design.utils.c.k(dzg0.oval_shape, circleButton));
            circleButton.enableImageLoading();
            circleButton.setIconPadding(this.circleButtonIconPadding);
            loadAvatar(circleButton, actionModel, onShown);
        }
    }

    private final void loadIcon(LoadingIconCircleButton circleButton, xw actionModel, sls onShown) {
        tse tseVar = this.coroutineScope;
        if (tseVar == null) {
            tseVar = null;
        }
        replaceJob(tje.N(tseVar, null, null, new TopCircleButtonsView$loadIcon$job$1(actionModel, onShown, null, this, circleButton), 3), actionModel);
    }

    private final void removeJob(String image) {
        l8x remove = this.jobsMap.remove(image);
        if (remove != null) {
            remove.a(null);
        }
    }

    private final void replaceJob(l8x job, xw actionModel) {
        String str = actionModel.d;
        if (str == null) {
            str = "";
        }
        removeJob(str);
        Map<String, l8x> map = this.jobsMap;
        String str2 = actionModel.d;
        map.put(str2 != null ? str2 : "", job);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupFallbackIcon(LoadingIconCircleButton button, xw actionModel, sls onShown) {
        button.setIcon(actionModel.h);
        button.setIconPadding(this.circleButtonIconPadding);
        button.setIconTintEnable(true);
        button.disableImageLoading();
        button.imageFadeIn();
        onShown.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showButton(LoadingIconCircleButton button, Bitmap bitmap, sls onShown) {
        button.setIconPadding(0);
        button.setIconTintEnable(false);
        button.disableImageLoading();
        Resources resources = button.getResources();
        int color = button.getContext().getColor(mqg0.component_gray_150);
        button.setIcon(new RippleDrawable(gtq0.e(color), new BitmapDrawable(resources, bitmap), null));
        button.imageFadeIn();
        onShown.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean updateActions$lambda$1(List list, TopCircleButtonsView topCircleButtonsView, cwz0 cwz0Var) {
        boolean contains = list.contains(cwz0Var.c);
        boolean z = !contains;
        if (!contains) {
            topCircleButtonsView.removeJob(cwz0Var.b);
            LoadingIconCircleButton loadingIconCircleButton = (LoadingIconCircleButton) cwz0Var.a.get();
            if (loadingIconCircleButton != null) {
                topCircleButtonsView.removeView(loadingIconCircleButton);
            }
        }
        return z;
    }

    public final LoadingIconCircleButton getButtonForActionType(ActionType type) {
        Object obj;
        Iterator<T> it = this.actionViews.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((cwz0) obj).c == type) {
                break;
            }
        }
        cwz0 cwz0Var = (cwz0) obj;
        if (cwz0Var != null) {
            return (LoadingIconCircleButton) cwz0Var.a.get();
        }
        return null;
    }

    public final List<ActionType> getInvisibleButtons() {
        List<cwz0> list = this.actionViews;
        ArrayList arrayList = new ArrayList();
        for (cwz0 cwz0Var : list) {
            LoadingIconCircleButton loadingIconCircleButton = (LoadingIconCircleButton) cwz0Var.a.get();
            ActionType actionType = (loadingIconCircleButton == null || ru.yandex.taxi.design.utils.c.r(loadingIconCircleButton)) ? null : cwz0Var.c;
            if (actionType != null) {
                arrayList.add(actionType);
            }
        }
        return arrayList;
    }

    public final List<ActionType> getVisibleButtons() {
        List<cwz0> list = this.actionViews;
        ArrayList arrayList = new ArrayList();
        for (cwz0 cwz0Var : list) {
            LoadingIconCircleButton loadingIconCircleButton = (LoadingIconCircleButton) cwz0Var.a.get();
            ActionType actionType = (loadingIconCircleButton == null || !ru.yandex.taxi.design.utils.c.r(loadingIconCircleButton)) ? null : cwz0Var.c;
            if (actionType != null) {
                arrayList.add(actionType);
            }
        }
        return arrayList;
    }

    public final void init(tse coroutineScope, pav imageLoader) {
        this.coroutineScope = coroutineScope;
        this.imageLoader = imageLoader;
    }

    @Override // ru.yandex.taxi.design.CircleButtonsPanelComponent, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cancelAndRemoveJobs();
    }

    public final void resetSubscriptions() {
        cancelAndRemoveJobs();
    }

    public final void setActionClickListener(xt actionClickListener) {
        this.actionClickListener = actionClickListener;
    }

    public final void updateActions(String orderId, List<xw> actions) {
        List<xw> list = actions;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((xw) it.next()).a);
        }
        ycc.w(this.actionViews, new rmy0(17, arrayList, this), true);
        Iterator it2 = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                for (Object obj : this.actionViews) {
                    int i3 = i + 1;
                    if (i < 0) {
                        scc.m();
                        throw null;
                    }
                    cwz0 cwz0Var = (cwz0) obj;
                    xw xwVar = actions.get(i);
                    String str = cwz0Var.b;
                    String str2 = xwVar.d;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (!str.equals(str2)) {
                        removeJob(cwz0Var.b);
                        String str3 = xwVar.d;
                        if (str3 == null) {
                            str3 = "";
                        }
                        cwz0Var.b = str3;
                    }
                    LoadingIconCircleButton loadingIconCircleButton = (LoadingIconCircleButton) cwz0Var.a.get();
                    if (loadingIconCircleButton != null) {
                        bindCircleButton(loadingIconCircleButton, orderId, xwVar);
                    }
                    i = i3;
                }
                return;
            }
            Object next = it2.next();
            int i4 = i2 + 1;
            if (i2 < 0) {
                scc.m();
                throw null;
            }
            ActionType actionType = (ActionType) next;
            List<cwz0> list2 = this.actionViews;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it3 = list2.iterator();
                while (it3.hasNext()) {
                    if (((cwz0) it3.next()).c == actionType) {
                        break;
                    }
                }
            }
            String str4 = actions.get(i2).d;
            String str5 = str4 != null ? str4 : "";
            LoadingIconCircleButton loadingIconCircleButton2 = new LoadingIconCircleButton(getContext());
            this.actionViews.add(i2, new cwz0(new WeakReference(loadingIconCircleButton2), str5, actionType));
            addView(loadingIconCircleButton2, i2);
            i2 = i4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TopCircleButtonsView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ TopCircleButtonsView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
