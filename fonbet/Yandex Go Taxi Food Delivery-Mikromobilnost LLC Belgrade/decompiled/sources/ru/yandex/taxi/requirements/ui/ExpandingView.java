package ru.yandex.taxi.requirements.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.cma1;
import defpackage.evu0;
import defpackage.jfh0;
import defpackage.jrh0;
import defpackage.kyh0;
import defpackage.mpo;
import defpackage.mrg0;
import defpackage.ny61;
import defpackage.opo;
import defpackage.pry;
import defpackage.qje;
import defpackage.qpo;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.yot0;
import defpackage.zot0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.design.ListItemCheckComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/requirements/ui/ExpandingView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzot0;", "model", "Lzy11;", "announceOfCommentAppearingIfNeed", "(Lzot0;)V", "Lkotlin/Function0;", "onSwitcherClick", "onSaveClick", "bind", "(Lzot0;Lsls;Lsls;)V", "Lmpo;", "binding", "Lmpo;", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExpandingView extends LinearLayout {
    private final mpo binding;

    public ExpandingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(jrh0.expanding_component, this);
        int i2 = jfh0.checkbox_item;
        ListItemCheckComponent listItemCheckComponent = (ListItemCheckComponent) cma1.O(i2, this);
        if (listItemCheckComponent != null) {
            i2 = jfh0.footer_item;
            ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i2, this);
            if (listItemComponent != null) {
                i2 = jfh0.header_item;
                ListItemSwitchComponent listItemSwitchComponent = (ListItemSwitchComponent) cma1.O(i2, this);
                if (listItemSwitchComponent != null) {
                    this.binding = new mpo(this, listItemCheckComponent, listItemComponent, listItemSwitchComponent);
                    setOrientation(1);
                    setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final void announceOfCommentAppearingIfNeed(zot0 model) {
        boolean z = model.c;
        String str = model.h;
        if (z || str == null || evu0.J(str)) {
            this.binding.d.setClickable(true);
            this.binding.d.setFocusable(1);
        } else {
            this.binding.d.setClickable(false);
            this.binding.d.setFocusable(0);
            announceForAccessibility(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0$0(yot0 yot0Var, sls slsVar, ExpandingView expandingView, zot0 zot0Var, View view) {
        if (yot0Var != null) {
            expandingView.announceOfCommentAppearingIfNeed(zot0Var);
        }
        slsVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0$2(yot0 yot0Var, zot0 zot0Var) {
        tls tlsVar;
        if (yot0Var == null || (tlsVar = yot0Var.a) == null) {
            return;
        }
        tlsVar.invoke(zot0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bind(zot0 model, sls onSwitcherClick, final sls onSaveClick) {
        boolean z;
        ListItemComponent listItemComponent;
        mpo mpoVar = this.binding;
        yot0 yot0Var = model.e;
        boolean z2 = model.f;
        String str = yot0Var != null ? yot0Var.e : null;
        String str2 = yot0Var != null ? yot0Var.c : null;
        boolean z3 = yot0Var != null && model.c;
        if (z3) {
            String str3 = yot0Var != null ? yot0Var.d : null;
            if (str3 != null && !evu0.J(str3) && str != null && !evu0.J(str)) {
                z = true;
                listItemComponent = mpoVar.c;
                ListItemSwitchComponent listItemSwitchComponent = mpoVar.d;
                ListItemCheckComponent listItemCheckComponent = mpoVar.b;
                listItemComponent.setVisibility(!z3 ? 0 : 8);
                listItemSwitchComponent.setTitle(model.a);
                listItemSwitchComponent.setCheckedWithAnimation(model.c);
                int i = 0;
                listItemSwitchComponent.setOnClickListener(new opo(yot0Var, onSwitcherClick, this, model, 0));
                listItemSwitchComponent.setDividers(DividerPosition.BOTTOM, (!z2 || z3) ? DividerType.NONE : DividerType.MARGIN);
                listItemCheckComponent.setTitle(yot0Var == null ? yot0Var.d : null);
                listItemCheckComponent.setTitleColorAttr(xng0.textMinor);
                listItemCheckComponent.setTitleTextSizePx(tje.r(mrg0.component_text_size_caption, getContext()));
                listItemCheckComponent.setVisibility(!z ? 0 : 8);
                listItemCheckComponent.setChecked(yot0Var == null && yot0Var.f);
                listItemCheckComponent.setCheckedChangeListener(new pry() { // from class: ppo
                    @Override // defpackage.pry
                    public final void a(boolean z4) {
                        sls.this.invoke();
                    }
                });
                ExpandingView expandingView = mpoVar.a;
                if (z2) {
                    xw31.I(expandingView, null, null, null, 0);
                } else {
                    xw31.I(expandingView, null, null, null, Integer.valueOf(tje.r(mrg0.go_design_m_space, getContext())));
                }
                if (str != null || evu0.J(str)) {
                    listItemComponent.setTitle(str2);
                    listItemComponent.setTitleTextColor(qje.t(xng0.textMinor, getContext()));
                } else {
                    listItemComponent.setTitle(str);
                    listItemComponent.setTitleTextColor(qje.t(xng0.textMain, getContext()));
                }
                listItemComponent.setContentDescription(getContext().getString(kyh0.summary_comment_hint) + Extension.FIX_SPACE + ((Object) listItemComponent.title().getText()));
                listItemComponent.setDebounceClickListener(new qpo(i, yot0Var, model));
            }
        }
        z = false;
        listItemComponent = mpoVar.c;
        ListItemSwitchComponent listItemSwitchComponent2 = mpoVar.d;
        ListItemCheckComponent listItemCheckComponent2 = mpoVar.b;
        listItemComponent.setVisibility(!z3 ? 0 : 8);
        listItemSwitchComponent2.setTitle(model.a);
        listItemSwitchComponent2.setCheckedWithAnimation(model.c);
        int i2 = 0;
        listItemSwitchComponent2.setOnClickListener(new opo(yot0Var, onSwitcherClick, this, model, 0));
        listItemSwitchComponent2.setDividers(DividerPosition.BOTTOM, (!z2 || z3) ? DividerType.NONE : DividerType.MARGIN);
        listItemCheckComponent2.setTitle(yot0Var == null ? yot0Var.d : null);
        listItemCheckComponent2.setTitleColorAttr(xng0.textMinor);
        listItemCheckComponent2.setTitleTextSizePx(tje.r(mrg0.component_text_size_caption, getContext()));
        listItemCheckComponent2.setVisibility(!z ? 0 : 8);
        listItemCheckComponent2.setChecked(yot0Var == null && yot0Var.f);
        listItemCheckComponent2.setCheckedChangeListener(new pry() { // from class: ppo
            @Override // defpackage.pry
            public final void a(boolean z4) {
                sls.this.invoke();
            }
        });
        ExpandingView expandingView2 = mpoVar.a;
        if (z2) {
        }
        if (str != null) {
        }
        listItemComponent.setTitle(str2);
        listItemComponent.setTitleTextColor(qje.t(xng0.textMinor, getContext()));
        listItemComponent.setContentDescription(getContext().getString(kyh0.summary_comment_hint) + Extension.FIX_SPACE + ((Object) listItemComponent.title().getText()));
        listItemComponent.setDebounceClickListener(new qpo(i2, yot0Var, model));
    }

    public ExpandingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ExpandingView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ExpandingView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
