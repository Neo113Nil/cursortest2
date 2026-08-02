package ru.yandex.taxi.preorder.summary.selector.verticals.bold;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.taxi.experiments.ShowPolicyDto;
import defpackage.g0c;
import defpackage.g2a;
import defpackage.hf31;
import defpackage.i86;
import defpackage.ib31;
import defpackage.im4;
import defpackage.j86;
import defpackage.k86;
import defpackage.kk31;
import defpackage.km4;
import defpackage.kv5;
import defpackage.m6;
import defpackage.mqv0;
import defpackage.ob31;
import defpackage.oeq0;
import defpackage.q0v;
import defpackage.qoi0;
import defpackage.sb31;
import defpackage.tje;
import defpackage.vl4;
import defpackage.wls;
import defpackage.zxs;
import defpackage.zy11;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.design.utils.b;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.recycler.PositionLayoutManager;

@Metadata(d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u00019\u0018\u00002\u00020\u00012\u00020\u0002:\u0001<BO\b\u0007\u0012\u001a\b\u0001\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\u00020\u00062\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u001eH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010.R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006="}, d2 = {"Lru/yandex/taxi/preorder/summary/selector/verticals/bold/BoldVerticalsView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Lkk31;", "Lkotlin/Function2;", "", "Lob31;", "Lzy11;", "onSelectVertical", "Landroid/content/Context;", "context", "Lmqv0;", "summaryUiDelegate", "Lru/yandex/taxi/design/utils/b;", "shadowBgRepository", "Lhf31;", "verticalNamesVisibilityRepository", "Lim4;", "badgeShowPolicyRepository", "<init>", "(Lwls;Landroid/content/Context;Lmqv0;Lru/yandex/taxi/design/utils/b;Lhf31;Lim4;)V", "model", "onItemClicked", "(Lob31;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "verticals", "render", "(Ljava/util/List;)V", "position", "", "positionOffset", "updateHeaderState", "(IF)V", "smoothScrollToPosition", "(I)V", "Landroid/view/View;", "asView", "()Landroid/view/View;", "getVertical", "(I)Lob31;", "Lhf31;", "Lim4;", "Li86;", "verticalsAdapter", "Li86;", "Landroidx/recyclerview/widget/RecyclerView;", "verticalsView", "Landroidx/recyclerview/widget/RecyclerView;", "Lkm4;", "badgeShownDelegate", "Lkm4;", "k86", "onScrollListener", "Lk86;", "l86", "selector"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BoldVerticalsView extends GoFrameLayout implements kk31 {
    private final im4 badgeShowPolicyRepository;
    private final km4 badgeShownDelegate;
    private final k86 onScrollListener;
    private final hf31 verticalNamesVisibilityRepository;
    private final i86 verticalsAdapter;
    private final RecyclerView verticalsView;

    public BoldVerticalsView(wls wlsVar, Context context, mqv0 mqv0Var, b bVar, hf31 hf31Var, im4 im4Var) {
        super(context, null, 0, 0, 14, null);
        this.verticalNamesVisibilityRepository = hf31Var;
        this.badgeShowPolicyRepository = im4Var;
        g2a b = mqv0Var.b(context);
        q0v q0vVar = new q0v(22, wlsVar, this);
        int i = a.Z;
        g0c a = qoi0.a(ob31.class);
        i86 i86Var = new i86(Collections.singletonList(new zxs(a.a(), 0, null, EmptyList.a, null, new sb31(b, q0vVar, hf31Var, bVar))));
        this.verticalsAdapter = i86Var;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        recyclerView.setClipToPadding(false);
        recyclerView.setClipChildren(false);
        recyclerView.setPadding(tje.u(16, recyclerView.getContext()), tje.u(8, recyclerView.getContext()), tje.u(16, recyclerView.getContext()), tje.u(8, recyclerView.getContext()));
        recyclerView.setImportantForAccessibility(1);
        this.verticalsView = recyclerView;
        this.badgeShownDelegate = new km4(new kv5(14, this));
        this.onScrollListener = new k86(this);
        setClipChildren(false);
        addView(recyclerView);
        recyclerView.setAdapter(i86Var);
        PositionLayoutManager positionLayoutManager = new PositionLayoutManager(context);
        positionLayoutManager.d0 = new m6(19, this);
        positionLayoutManager.e0 = hf31Var;
        recyclerView.setLayoutManager(positionLayoutManager);
        recyclerView.setItemAnimator(null);
        recyclerView.addItemDecoration(new j86());
        recyclerView.setAccessibilityDelegateCompat(new ib31(recyclerView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 badgeShownDelegate$lambda$0(BoldVerticalsView boldVerticalsView, String str) {
        boldVerticalsView.badgeShowPolicyRepository.a(str);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oeq0 lambda$0$0$0(BoldVerticalsView boldVerticalsView, int i) {
        return ((ob31) boldVerticalsView.verticalsAdapter.getItem(i)).d;
    }

    private final void onItemClicked(ob31 model) {
        ShowPolicyDto showPolicyDto;
        vl4 vl4Var = model.e;
        if (vl4Var == null || (showPolicyDto = vl4Var.i) == null) {
            return;
        }
        this.badgeShowPolicyRepository.b(showPolicyDto.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 verticalsAdapter$lambda$0(wls wlsVar, BoldVerticalsView boldVerticalsView, int i, ob31 ob31Var) {
        wlsVar.invoke(Integer.valueOf(i), ob31Var);
        boldVerticalsView.onItemClicked(ob31Var);
        return zy11.a;
    }

    @Override // com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        this.verticalsView.setAdapter(this.verticalsAdapter);
    }

    @Override // defpackage.kk31
    public View asView() {
        return this;
    }

    @Override // defpackage.kk31
    public ob31 getVertical(int position) {
        return (ob31) this.verticalsAdapter.getItem(position);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.verticalsView.addOnScrollListener(this.onScrollListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.verticalsView.removeOnScrollListener(this.onScrollListener);
    }

    @Override // defpackage.kk31
    public void render(List<ob31> verticals) {
        this.verticalsAdapter.submitList(verticals, null);
        Iterator<ob31> it = verticals.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().c) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            i = 0;
        }
        smoothScrollToPosition(i);
        setVisibility(verticals.size() <= 1 ? 8 : 0);
        this.badgeShownDelegate.a(this.verticalsView);
    }

    @Override // defpackage.kk31
    public void smoothScrollToPosition(int position) {
        this.verticalsView.smoothScrollToPosition(position);
    }

    @Override // defpackage.kk31
    public void updateHeaderState(int position, float positionOffset) {
        smoothScrollToPosition(position);
    }
}
