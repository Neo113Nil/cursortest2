package ru.yandex.taxi.parks.view;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.afh0;
import defpackage.aq80;
import defpackage.crh0;
import defpackage.czo0;
import defpackage.gho;
import defpackage.h3y;
import defpackage.hbp0;
import defpackage.je90;
import defpackage.nw70;
import defpackage.op70;
import defpackage.qu;
import defpackage.rp31;
import defpackage.te90;
import defpackage.ue90;
import defpackage.x770;
import defpackage.xe90;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.fragment.YandexTaxiFragment;
import ru.yandex.taxi.fragment.settings.ParksListFragment;
import ru.yandex.taxi.parks.a;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\bR\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u00060$R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/yandex/taxi/parks/view/ParksContentView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lzy11;", "initScrollListener", "()V", "onAttachedToWindow", "onDetachedFromWindow", "Lru/yandex/taxi/parks/a;", "parksListPresenter", "Lru/yandex/taxi/parks/a;", "getParksListPresenter", "()Lru/yandex/taxi/parks/a;", "setParksListPresenter", "(Lru/yandex/taxi/parks/a;)V", "Lgho;", "eventsListener", "Lgho;", "getEventsListener", "()Lgho;", "setEventsListener", "(Lgho;)V", "Lh3y;", "Lnw70;", "parksQuickBlacklister", "Lh3y;", "getParksQuickBlacklister", "()Lh3y;", "setParksQuickBlacklister", "(Lh3y;)V", "Lxe90;", "parkAdapter", "Lxe90;", "Lte90;", "mvpView", "Lte90;", "Landroidx/recyclerview/widget/RecyclerView;", "list", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/yandex/taxi/design/ToolbarComponent;", "toolbar", "Lru/yandex/taxi/design/ToolbarComponent;", "Lhbp0;", "testingMainScope", "Lhbp0;", "parks"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ParksContentView extends FrameLayout {
    public gho eventsListener;
    private final RecyclerView list;
    private final te90 mvpView;
    private xe90 parkAdapter;
    public a parksListPresenter;
    public h3y parksQuickBlacklister;
    private final hbp0 testingMainScope;
    private final ToolbarComponent toolbar;

    public ParksContentView(Context context) {
        super(context);
        c.q(this, crh0.parks_list_content, true);
        this.parkAdapter = new xe90();
        this.mvpView = new te90(this);
        int i = afh0.parks_list;
        WeakHashMap weakHashMap = b.a;
        RecyclerView recyclerView = (RecyclerView) ((View) rp31.d(this, i));
        this.list = recyclerView;
        ToolbarComponent toolbarComponent = (ToolbarComponent) ((View) rp31.d(this, afh0.toolbar));
        this.toolbar = toolbarComponent;
        this.testingMainScope = new hbp0(new czo0(14), "", null);
        xe90 xe90Var = new xe90();
        this.parkAdapter = xe90Var;
        xe90Var.b = new nw70(8, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(this.parkAdapter);
        toolbarComponent.setOnNavigationClickListener(new op70(16, this));
        initScrollListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ParksContentView parksContentView) {
        Object obj;
        obj = ((YandexTaxiFragment) ((ParksListFragment) ((aq80) parksContentView.getEventsListener()).a)).callback;
        je90 je90Var = (je90) obj;
        if (je90Var != null) {
            je90Var.b.r(new qu(9));
        }
    }

    private final void initScrollListener() {
        this.list.addOnScrollListener(new ue90(this));
    }

    public final gho getEventsListener() {
        gho ghoVar = this.eventsListener;
        if (ghoVar != null) {
            return ghoVar;
        }
        return null;
    }

    public final a getParksListPresenter() {
        a aVar = this.parksListPresenter;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    public final h3y getParksQuickBlacklister() {
        h3y h3yVar = this.parksQuickBlacklister;
        if (h3yVar != null) {
            return h3yVar;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a parksListPresenter = getParksListPresenter();
        parksListPresenter.Bg(this.mvpView);
        x770 x770Var = parksListPresenter.y;
        x770Var.getClass();
        x770Var.a.a("ParksList.Shown", new HashMap(), 1, new HashMap());
        if (parksListPresenter.D) {
            parksListPresenter.Lg();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getParksListPresenter().Cg();
    }

    public final void setEventsListener(gho ghoVar) {
        this.eventsListener = ghoVar;
    }

    public final void setParksListPresenter(a aVar) {
        this.parksListPresenter = aVar;
    }

    public final void setParksQuickBlacklister(h3y h3yVar) {
        this.parksQuickBlacklister = h3yVar;
    }
}
