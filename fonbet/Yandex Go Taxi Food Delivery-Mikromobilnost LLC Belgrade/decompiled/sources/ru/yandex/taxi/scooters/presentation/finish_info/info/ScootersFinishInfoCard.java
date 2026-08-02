package ru.yandex.taxi.scooters.presentation.finish_info.info;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoView;
import defpackage.ajl0;
import defpackage.aki0;
import defpackage.arm0;
import defpackage.bdc;
import defpackage.bmn0;
import defpackage.bys;
import defpackage.cma1;
import defpackage.cmn0;
import defpackage.dmn0;
import defpackage.emn0;
import defpackage.f3x;
import defpackage.g18;
import defpackage.i3y;
import defpackage.j3x;
import defpackage.jl40;
import defpackage.kok0;
import defpackage.kqe0;
import defpackage.kyh0;
import defpackage.lmn0;
import defpackage.mrg0;
import defpackage.nac;
import defpackage.ny61;
import defpackage.pav;
import defpackage.pfh0;
import defpackage.q0h0;
import defpackage.qeg0;
import defpackage.qrh0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tmm0;
import defpackage.vng;
import defpackage.wls;
import defpackage.wxs;
import defpackage.xng0;
import defpackage.zhb0;
import defpackage.zln0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$BooleanRef;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.order.view.CostDetailsView;
import ru.yandex.taxi.utils.AbsoluteSizeSpanFix;
import ru.yandex.taxi.utils.ForegroundColorSpanFix;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ}\u0010\u001c\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00140\u00132\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00140\u00162\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJS\u0010 \u001a\u00020\u00142\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00140\u00162\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b \u0010!Jc\u0010\"\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00140\u00162\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00142\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'JK\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(2\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00140\u00162\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b*\u0010+JK\u0010,\u001a\b\u0012\u0004\u0012\u00020)0(2\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00140\u00162\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b,\u0010+R$\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010-R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001b\u00107\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001e\u00108\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u00104\u001a\u0004\b<\u0010=R\u001e\u0010?\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00109¨\u0006@"}, d2 = {"Lru/yandex/taxi/scooters/presentation/finish_info/info/ScootersFinishInfoCard;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "redesign", "", "totalPrice", "discount", "", "Lemn0;", "finishInfoItems", "Lkotlin/Function1;", "Lzy11;", "onPricingHeaderClickListener", "Lkotlin/Function2;", "onCharityItemClickListener", "Ls7n0;", "onDialogItemClickListener", "Lpav;", "imageLoader", "render", "(ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ltls;Lwls;Ltls;Lpav;)V", "onDetachedFromWindow", "()V", "renderV1", "(Ljava/util/List;Lwls;Ltls;Lpav;)V", "renderV2", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lwls;Ltls;Lpav;)V", "Landroid/view/View;", "item", "changeItemTo", "(Landroid/view/View;)V", "Lbys;", "", "createV1RecyclerViewAdapter", "(Lwls;Ltls;Lpav;)Lbys;", "createV2RecyclerViewAdapter", "Ltls;", "", "Lg18;", "cancellables", "Ljava/util/List;", "Landroidx/recyclerview/widget/RecyclerView;", "itemV1RecyclerView$delegate", "Li3y;", "getItemV1RecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "itemV1RecyclerView", "itemV1RecyclerViewAdapter", "Lbys;", "Llmn0;", "itemV2Binding$delegate", "getItemV2Binding", "()Llmn0;", "itemV2Binding", "itemV2RecyclerViewAdapter", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersFinishInfoCard extends GoFrameLayout {
    public static final int $stable = 8;
    private final List<g18> cancellables;

    /* renamed from: itemV1RecyclerView$delegate, reason: from kotlin metadata */
    private final i3y itemV1RecyclerView;
    private bys itemV1RecyclerViewAdapter;

    /* renamed from: itemV2Binding$delegate, reason: from kotlin metadata */
    private final i3y itemV2Binding;
    private bys itemV2RecyclerViewAdapter;
    private tls onPricingHeaderClickListener;

    public ScootersFinishInfoCard(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.cancellables = new ArrayList();
        this.itemV1RecyclerView = a.a(new kok0(context, 5));
        this.itemV2Binding = a.a(new tmm0(17, context, this));
    }

    private final void changeItemTo(View item) {
        if (jl40.l(item.getParent(), this)) {
            return;
        }
        removeAllViews();
        addView(item);
    }

    private final bys createV1RecyclerViewAdapter(wls onCharityItemClickListener, tls onDialogItemClickListener, pav imageLoader) {
        RecyclerView itemV1RecyclerView = getItemV1RecyclerView();
        j3x j3xVar = new j3x();
        createV1RecyclerViewAdapter$lambda$1(this, imageLoader, onCharityItemClickListener, onDialogItemClickListener, j3xVar);
        LinearLayoutManager linearLayoutManager = j3xVar.b;
        if (linearLayoutManager == null) {
            linearLayoutManager = new LinearLayoutManager(itemV1RecyclerView.getContext(), 1, false);
        }
        itemV1RecyclerView.setLayoutManager(linearLayoutManager);
        bys bysVar = new bys(new wxs(), j3xVar.a);
        itemV1RecyclerView.setAdapter(bysVar);
        return bysVar;
    }

    private static final zy11 createV1RecyclerViewAdapter$lambda$1(ScootersFinishInfoCard scootersFinishInfoCard, pav pavVar, wls wlsVar, tls tlsVar, j3x j3xVar) {
        ScootersFinishInfoCard$createV1RecyclerViewAdapter$1$1 scootersFinishInfoCard$createV1RecyclerViewAdapter$1$1 = new ScootersFinishInfoCard$createV1RecyclerViewAdapter$1$1(scootersFinishInfoCard);
        j3xVar.getClass();
        aki0.b(new f3x(emn0.class, j3xVar, scootersFinishInfoCard$createV1RecyclerViewAdapter$1$1), new zhb0(scootersFinishInfoCard, pavVar, wlsVar, tlsVar, 9));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 createV1RecyclerViewAdapter$lambda$1$0(ScootersFinishInfoCard scootersFinishInfoCard, pav pavVar, wls wlsVar, tls tlsVar, ListItemComponent listItemComponent, emn0 emn0Var) {
        listItemComponent.setTitle(emn0Var.a);
        String str = emn0Var.c;
        if (str != null) {
            scootersFinishInfoCard.cancellables.add(((nac) pavVar.a(listItemComponent.getLeadImageView())).c(str));
        }
        listItemComponent.setTrailCompanionText(emn0Var.b);
        if (emn0Var instanceof bmn0) {
            listItemComponent.setTrailMode(2);
            listItemComponent.setDebounceClickListener(new ajl0(20, wlsVar, emn0Var));
        } else if (emn0Var instanceof cmn0) {
            listItemComponent.setTrailMode(2);
            listItemComponent.setDebounceClickListener(new ajl0(21, tlsVar, emn0Var));
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createV1RecyclerViewAdapter$lambda$1$0$1(wls wlsVar, emn0 emn0Var) {
        bmn0 bmn0Var = (bmn0) emn0Var;
        wlsVar.invoke(bmn0Var.d, bmn0Var.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createV1RecyclerViewAdapter$lambda$1$0$2(tls tlsVar, emn0 emn0Var) {
        tlsVar.invoke(((cmn0) emn0Var).d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ListItemComponent createV1RecyclerViewAdapter$prepareInfoItem(ScootersFinishInfoCard scootersFinishInfoCard) {
        ListItemComponent listItemComponent = new ListItemComponent(scootersFinishInfoCard.getContext(), null, 0, 6, null);
        listItemComponent.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        listItemComponent.setBackground(vng.t(q0h0.scooters_item_bg, listItemComponent.getContext()));
        return listItemComponent;
    }

    private final bys createV2RecyclerViewAdapter(wls onCharityItemClickListener, tls onDialogItemClickListener, pav imageLoader) {
        RecyclerView recyclerView = getItemV2Binding().b;
        j3x j3xVar = new j3x();
        createV2RecyclerViewAdapter$lambda$2(this, imageLoader, onCharityItemClickListener, onDialogItemClickListener, j3xVar);
        LinearLayoutManager linearLayoutManager = j3xVar.b;
        if (linearLayoutManager == null) {
            linearLayoutManager = new LinearLayoutManager(recyclerView.getContext(), 1, false);
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        bys bysVar = new bys(new wxs(), j3xVar.a);
        recyclerView.setAdapter(bysVar);
        return bysVar;
    }

    private static final zy11 createV2RecyclerViewAdapter$lambda$2(ScootersFinishInfoCard scootersFinishInfoCard, pav pavVar, wls wlsVar, tls tlsVar, j3x j3xVar) {
        ScootersFinishInfoCard$createV2RecyclerViewAdapter$1$1 scootersFinishInfoCard$createV2RecyclerViewAdapter$1$1 = new ScootersFinishInfoCard$createV2RecyclerViewAdapter$1$1(scootersFinishInfoCard);
        j3xVar.getClass();
        aki0.b(new f3x(dmn0.class, j3xVar, scootersFinishInfoCard$createV2RecyclerViewAdapter$1$1), new arm0(4));
        aki0.b(new f3x(bmn0.class, j3xVar, new ScootersFinishInfoCard$createV2RecyclerViewAdapter$1$3(scootersFinishInfoCard)), new qeg0(16, scootersFinishInfoCard, pavVar, wlsVar));
        aki0.b(new f3x(cmn0.class, j3xVar, new ScootersFinishInfoCard$createV2RecyclerViewAdapter$1$5(scootersFinishInfoCard)), new qeg0(scootersFinishInfoCard, pavVar, tlsVar));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 createV2RecyclerViewAdapter$lambda$2$0(CostDetailsView costDetailsView, dmn0 dmn0Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(dmn0Var.a);
        ForegroundColorSpanFix foregroundColorSpanFix = new ForegroundColorSpanFix(c.c(xng0.textMinor, costDetailsView));
        CharSequence charSequence = dmn0Var.a;
        spannableStringBuilder.setSpan(foregroundColorSpanFix, 0, charSequence.length(), 33);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpanFix(c.d(mrg0.component_text_size_body, costDetailsView), false), 0, charSequence.length(), 33);
        SpannedString spannedString = new SpannedString(spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        CharSequence charSequence2 = dmn0Var.b;
        spannableStringBuilder2.append(charSequence2);
        spannableStringBuilder2.setSpan(new AbsoluteSizeSpanFix(c.d(mrg0.component_text_size_body, costDetailsView), false), 0, charSequence2.length(), 33);
        costDetailsView.setData(spannedString, new SpannedString(spannableStringBuilder2));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 createV2RecyclerViewAdapter$lambda$2$1(ScootersFinishInfoCard scootersFinishInfoCard, pav pavVar, wls wlsVar, ListItemComponent listItemComponent, bmn0 bmn0Var) {
        String str = bmn0Var.c;
        if (str != null) {
            scootersFinishInfoCard.cancellables.add(((nac) pavVar.a(listItemComponent.getLeadImageView())).c(str));
        }
        listItemComponent.setTitle(bmn0Var.a);
        listItemComponent.setTrailCompanionText(bmn0Var.b);
        listItemComponent.setDebounceClickListener(new ajl0(19, wlsVar, bmn0Var));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createV2RecyclerViewAdapter$lambda$2$1$1(wls wlsVar, bmn0 bmn0Var) {
        wlsVar.invoke(bmn0Var.d, bmn0Var.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 createV2RecyclerViewAdapter$lambda$2$2(ScootersFinishInfoCard scootersFinishInfoCard, pav pavVar, tls tlsVar, ListItemComponent listItemComponent, cmn0 cmn0Var) {
        String str = cmn0Var.c;
        if (str != null) {
            scootersFinishInfoCard.cancellables.add(((nac) pavVar.a(listItemComponent.getLeadImageView())).c(str));
        }
        listItemComponent.setTitle(cmn0Var.a);
        listItemComponent.setTrailCompanionText(cmn0Var.b);
        listItemComponent.setDebounceClickListener(new ajl0(18, tlsVar, cmn0Var));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createV2RecyclerViewAdapter$lambda$2$2$1(tls tlsVar, cmn0 cmn0Var) {
        tlsVar.invoke(cmn0Var.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ListItemComponent createV2RecyclerViewAdapter$prepareClickableItem(ScootersFinishInfoCard scootersFinishInfoCard) {
        ListItemComponent listItemComponent = new ListItemComponent(scootersFinishInfoCard.getContext(), null, 0, 6, null);
        listItemComponent.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        listItemComponent.setBackground(vng.t(q0h0.scooters_item_bg, listItemComponent.getContext()));
        listItemComponent.setTrailMode(2);
        return listItemComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CostDetailsView createV2RecyclerViewAdapter$prepareCostDetailsView(ScootersFinishInfoCard scootersFinishInfoCard) {
        CostDetailsView costDetailsView = new CostDetailsView(scootersFinishInfoCard.getContext(), null, 0, 0, 14, null);
        costDetailsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        costDetailsView.setTextColor(new bdc(xng0.textMinor), new bdc(xng0.textMain));
        costDetailsView.setDotsPattern(Extension.DOT_CHAR);
        costDetailsView.setMinimumHeight(tje.u(32, costDetailsView.getContext()));
        return costDetailsView;
    }

    private final RecyclerView getItemV1RecyclerView() {
        return (RecyclerView) this.itemV1RecyclerView.getValue();
    }

    private final lmn0 getItemV2Binding() {
        return (lmn0) this.itemV2Binding.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView itemV1RecyclerView_delegate$lambda$0(Context context) {
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        recyclerView.addItemDecoration(new zln0(context));
        recyclerView.setItemAnimator(null);
        return recyclerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lmn0 itemV2Binding_delegate$lambda$0(Context context, ScootersFinishInfoCard scootersFinishInfoCard) {
        View inflate = LayoutInflater.from(context).inflate(qrh0.scooters_finish_info_card_v2, (ViewGroup) null, false);
        int i = pfh0.chevron_image_view;
        if (((GoImageView) cma1.O(i, inflate)) != null) {
            i = pfh0.clickable_header_view;
            GoView goView = (GoView) cma1.O(i, inflate);
            if (goView != null) {
                i = pfh0.items_recycler_view;
                RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                if (recyclerView != null) {
                    i = pfh0.subtitle_text_view;
                    RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                    if (robotoTextView != null) {
                        i = pfh0.title_text_view;
                        RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                        if (robotoTextView2 != null) {
                            lmn0 lmn0Var = new lmn0((MotionLayout) inflate, goView, recyclerView, robotoTextView, robotoTextView2);
                            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                            ref$BooleanRef.element = true;
                            c.z(new kqe0(23, ref$BooleanRef, lmn0Var, scootersFinishInfoCard), goView);
                            return lmn0Var;
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 itemV2Binding_delegate$lambda$0$0$0(Ref$BooleanRef ref$BooleanRef, lmn0 lmn0Var, ScootersFinishInfoCard scootersFinishInfoCard) {
        if (ref$BooleanRef.element) {
            ref$BooleanRef.element = false;
            lmn0Var.a.transitionToEnd();
        } else {
            ref$BooleanRef.element = true;
            lmn0Var.a.transitionToStart();
        }
        tls tlsVar = scootersFinishInfoCard.onPricingHeaderClickListener;
        if (tlsVar != null) {
            tlsVar.invoke(Boolean.valueOf(!ref$BooleanRef.element));
        }
        return zy11.a;
    }

    private final void renderV1(List<? extends emn0> finishInfoItems, wls onCharityItemClickListener, tls onDialogItemClickListener, pav imageLoader) {
        changeItemTo(getItemV1RecyclerView());
        if (this.itemV1RecyclerViewAdapter == null) {
            this.itemV1RecyclerViewAdapter = createV1RecyclerViewAdapter(onCharityItemClickListener, onDialogItemClickListener, imageLoader);
        }
        bys bysVar = this.itemV1RecyclerViewAdapter;
        if (bysVar != null) {
            bysVar.submitList(finishInfoItems, null);
        }
    }

    private final void renderV2(String totalPrice, String discount, List<? extends emn0> finishInfoItems, wls onCharityItemClickListener, tls onDialogItemClickListener, pav imageLoader) {
        changeItemTo(getItemV2Binding().a);
        getItemV2Binding().d.setText(c.H(this, kyh0.scooters_ride_finish_info_card_total, totalPrice));
        getItemV2Binding().c.setVisibility(discount.length() > 0 ? 0 : 8);
        getItemV2Binding().c.setText(c.H(this, kyh0.scooters_ride_finish_info_card_discount, discount));
        if (this.itemV2RecyclerViewAdapter == null) {
            this.itemV2RecyclerViewAdapter = createV2RecyclerViewAdapter(onCharityItemClickListener, onDialogItemClickListener, imageLoader);
        }
        bys bysVar = this.itemV2RecyclerViewAdapter;
        if (bysVar != null) {
            bysVar.submitList(finishInfoItems, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Iterator<T> it = this.cancellables.iterator();
        while (it.hasNext()) {
            ((g18) it.next()).cancel();
        }
        this.cancellables.clear();
    }

    public final void render(boolean redesign, String totalPrice, String discount, List<? extends emn0> finishInfoItems, tls onPricingHeaderClickListener, wls onCharityItemClickListener, tls onDialogItemClickListener, pav imageLoader) {
        this.onPricingHeaderClickListener = onPricingHeaderClickListener;
        if (!redesign) {
            if (finishInfoItems.isEmpty()) {
                setVisibility(8);
                return;
            } else {
                setVisibility(0);
                renderV1(finishInfoItems, onCharityItemClickListener, onDialogItemClickListener, imageLoader);
                return;
            }
        }
        if (finishInfoItems.isEmpty() || totalPrice.length() <= 0) {
            setVisibility(8);
        } else {
            setVisibility(0);
            renderV2(totalPrice, discount, finishInfoItems, onCharityItemClickListener, onDialogItemClickListener, imageLoader);
        }
    }

    public ScootersFinishInfoCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public ScootersFinishInfoCard(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public ScootersFinishInfoCard(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ ScootersFinishInfoCard(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
