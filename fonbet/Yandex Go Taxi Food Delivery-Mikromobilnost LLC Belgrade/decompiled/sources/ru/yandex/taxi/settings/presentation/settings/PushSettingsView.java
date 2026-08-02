package ru.yandex.taxi.settings.presentation.settings;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.amp0;
import defpackage.d6z;
import defpackage.oxe0;
import defpackage.p3g0;
import defpackage.pav;
import defpackage.qje;
import defpackage.r4g0;
import defpackage.rp31;
import defpackage.tje;
import defpackage.tt2;
import defpackage.u4g0;
import defpackage.v3g0;
import defpackage.veh0;
import defpackage.xng0;
import defpackage.yqh0;
import defpackage.z2g0;
import defpackage.z5r0;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.FloatingTitleToolbarComponent;
import ru.yandex.taxi.design.utils.c;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001'B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0010J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0010J\u000f\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u0010J\u000f\u0010\u001a\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001a\u0010\u0010J\u000f\u0010\u001b\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001b\u0010\u0010R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u00060'R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/yandex/taxi/settings/presentation/settings/PushSettingsView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Ltt2;", "appDispatchers", "Landroid/app/Activity;", "activity", "Lru/yandex/taxi/settings/presentation/settings/a;", "presenter", "<init>", "(Landroid/content/Context;Lpav;Ltt2;Landroid/app/Activity;Lru/yandex/taxi/settings/presentation/settings/a;)V", "Lzy11;", "setupRecycler", "()V", "setupToolbar", "", "Lz5r0;", "settingsModel", "onSettingsLoaded", "(Ljava/util/List;)V", "onSettingsError", "showLoading", "hideLoading", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/app/Activity;", "Lru/yandex/taxi/settings/presentation/settings/a;", "Lru/yandex/taxi/design/FloatingTitleToolbarComponent;", "toolbar", "Lru/yandex/taxi/design/FloatingTitleToolbarComponent;", "Landroid/widget/FrameLayout;", "loadingSpinner", "Landroid/widget/FrameLayout;", "Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Landroidx/recyclerview/widget/RecyclerView;", "Lr4g0;", "mvpView", "Lr4g0;", "Lz2g0;", "adapter", "Lz2g0;", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PushSettingsView extends LinearLayout {
    private final Activity activity;
    private final z2g0 adapter;
    private final FrameLayout loadingSpinner;
    private final r4g0 mvpView;
    private final a presenter;
    private final RecyclerView recycler;
    private final FloatingTitleToolbarComponent toolbar;

    public PushSettingsView(Context context, pav pavVar, tt2 tt2Var, Activity activity, a aVar) {
        super(context);
        this.activity = activity;
        this.presenter = aVar;
        setOrientation(1);
        c.q(this, yqh0.push_settings_view, true);
        int i = veh0.toolbar;
        WeakHashMap weakHashMap = b.a;
        this.toolbar = (FloatingTitleToolbarComponent) ((View) rp31.d(this, i));
        this.loadingSpinner = (FrameLayout) ((View) rp31.d(this, veh0.loading_spinner));
        this.recycler = (RecyclerView) ((View) rp31.d(this, veh0.settings_recycler));
        this.mvpView = new r4g0(this);
        this.adapter = new z2g0(new amp0(pavVar, tt2Var, new PushSettingsView$adapter$1(1, aVar, a.class, "onSettingToggleRequested", "onSettingToggleRequested(Lru/yandex/taxi/settings/model/SettingListItemModel$SettingItemModel;)V", 0)));
        setBackgroundColor(qje.t(xng0.bgMain, getContext()));
        setupRecycler();
        setupToolbar();
    }

    private final void hideLoading() {
        this.loadingSpinner.setVisibility(8);
        this.recycler.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSettingsError() {
        hideLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSettingsLoaded(List<? extends z5r0> settingsModel) {
        hideLoading();
        this.adapter.submitList(settingsModel);
    }

    private final void setupRecycler() {
        this.recycler.setLayoutManager(new LinearLayoutManager(getContext()));
        this.recycler.setAdapter(this.adapter);
        this.recycler.setItemAnimator(null);
    }

    private final void setupToolbar() {
        this.toolbar.setOnBackClickListener(new oxe0(12, this.presenter));
        this.toolbar.setTitleAccessibilityHeading(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupToolbar$navigateBack(a aVar) {
        aVar.E.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLoading() {
        this.loadingSpinner.setVisibility(0);
        this.recycler.setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.presenter;
        aVar.Bg(this.mvpView);
        p3g0 a = aVar.C.a();
        v3g0 v3g0Var = (v3g0) aVar.Dg();
        a.getClass();
        v3g0Var.H6(d6z.Y(a, "notifications_screen_title"));
        ((v3g0) aVar.Dg()).ca(d6z.Y(a, "notifications_screen_caption"));
        ((v3g0) aVar.Dg()).Qc(u4g0.b);
        tje.N(aVar.Jg(), null, null, new PushSettingsPresenter$attachView$1(null, aVar), 3);
        aVar.x.a();
        tje.N(aVar.Jg(), null, null, new PushSettingsPresenter$attachView$2(null, aVar), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }
}
