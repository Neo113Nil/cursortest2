package ru.yandex.taxi.requirements.ui.bubbles;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.HorizontalScrollableHost;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.aub;
import defpackage.bgh;
import defpackage.fes0;
import defpackage.jnj0;
import defpackage.jsg0;
import defpackage.kp50;
import defpackage.ndj0;
import defpackage.nwy0;
import defpackage.og20;
import defpackage.pav;
import defpackage.qje;
import defpackage.rji0;
import defpackage.tje;
import defpackage.wls;
import defpackage.xng0;
import defpackage.xw31;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.utils.RecyclerShadowController$Type;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\u00020\u00072\b\b\u0001\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u001a\u001a\u00020\u00192\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\u000b2\b\b\u0003\u0010\u001c\u001a\u00020\u00072\b\b\u0003\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010#\u001a\u00020\u000b2\u001a\u0010\"\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000b\u0018\u00010 ¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Lru/yandex/taxi/requirements/ui/bubbles/RequirementsBubblesContainer;", "Landroidx/recyclerview/widget/HorizontalScrollableHost;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "updateShadowBackground", "()V", "color", CaretView.ALPHA_PROPERTY, "colorWithAlpha", "(II)I", "Lpav;", "imageLoader", "init", "(Lpav;)V", "", "Lndj0;", "models", "", "updateBubbles", "(Ljava/util/List;)Z", "topPadding", "bottomPadding", "updateBubblesPadding", "(II)V", "Lkotlin/Function2;", "Lru/yandex/taxi/requirements/models/domain/RequirementBubbleAction;", "onBubbleClick", "setBubbleClickListener", "(Lwls;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Landroidx/recyclerview/widget/RecyclerView;", "Ljnj0;", "adapter", "Ljnj0;", "Landroid/view/View;", "shadow", "Landroid/view/View;", "Lrji0;", "shadowController", "Lrji0;", "nonblocking"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RequirementsBubblesContainer extends HorizontalScrollableHost implements nwy0 {
    private final jnj0 adapter;
    private final RecyclerView recycler;
    private final View shadow;
    private final rji0 shadowController;

    public RequirementsBubblesContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        RecyclerView recyclerView = new RecyclerView(context);
        this.recycler = recyclerView;
        jnj0 jnj0Var = new jnj0();
        this.adapter = jnj0Var;
        View view = new View(context);
        this.shadow = view;
        rji0 rji0Var = new rji0(RecyclerShadowController$Type.END);
        this.shadowController = rji0Var;
        addView(recyclerView, new FrameLayout.LayoutParams(-1, -1));
        addView(view, new FrameLayout.LayoutParams(tje.r(jsg0.bubbles_container_shadow_width, getContext()), -1, 8388613));
        int u = tje.u(4, getContext());
        recyclerView.addItemDecoration(new bgh(u, u, u));
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(jnj0Var);
        recyclerView.setClipToPadding(false);
        xw31.B(tje.u(12, getContext()), recyclerView);
        updateShadowBackground();
        rji0Var.a(view, recyclerView);
    }

    private final int colorWithAlpha(int color, int alpha) {
        return Color.argb(alpha, Color.red(color), Color.green(color), Color.blue(color));
    }

    public static /* synthetic */ void updateBubblesPadding$default(RequirementsBubblesContainer requirementsBubblesContainer, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        requirementsBubblesContainer.updateBubblesPadding(i, i2);
    }

    private final void updateShadowBackground() {
        int t = qje.t(xng0.bgMain, getContext());
        final fes0 fes0Var = new fes0(new int[]{colorWithAlpha(t, 255), colorWithAlpha(t, 0)}, new float[]{0.0f, 1.0875f}, xw31.n(getContext()) ? 90.0f : 270.0f, Shader.TileMode.CLAMP);
        View view = this.shadow;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.setShaderFactory(new ShapeDrawable.ShaderFactory() { // from class: ru.yandex.taxi.requirements.ui.bubbles.RequirementsBubblesContainer$updateShadowBackground$1$1
            @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
            public Shader resize(int width, int height) {
                fes0.this.a(width, height);
                return fes0.this.b();
            }
        });
        view.setBackground(shapeDrawable);
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        updateShadowBackground();
        this.shadowController.c();
        this.shadowController.a(this.shadow, this.recycler);
        this.recycler.setAdapter(this.adapter);
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final void init(pav imageLoader) {
        this.adapter.c = imageLoader;
    }

    public final void setBubbleClickListener(wls onBubbleClick) {
        this.adapter.b = onBubbleClick;
    }

    public final boolean updateBubbles(List<ndj0> models) {
        this.recycler.setImportantForAccessibility(!models.isEmpty() ? 1 : 2);
        jnj0 jnj0Var = this.adapter;
        jnj0Var.getClass();
        boolean z = models.size() != jnj0Var.a.size();
        if (jnj0Var.a.isEmpty() || models.isEmpty()) {
            jnj0Var.a = models;
            jnj0Var.notifyDataSetChanged();
            return z;
        }
        i f = kp50.f(new og20(jnj0Var.a, models, new aub(15)), false);
        jnj0Var.a = models;
        f.b(jnj0Var);
        return z;
    }

    public final void updateBubblesPadding(int topPadding, int bottomPadding) {
        xw31.I(this.recycler, null, Integer.valueOf(topPadding), null, Integer.valueOf(bottomPadding));
        xw31.E(this.shadow, null, Integer.valueOf(topPadding), null, Integer.valueOf(bottomPadding));
    }

    public RequirementsBubblesContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public RequirementsBubblesContainer(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ RequirementsBubblesContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
