package ru.yandex.taxi.delivery.ui.recycler;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.awh;
import defpackage.bdc;
import defpackage.bhh;
import defpackage.bmh;
import defpackage.bvf0;
import defpackage.d1x;
import defpackage.dci;
import defpackage.evu0;
import defpackage.f1h0;
import defpackage.gbi;
import defpackage.hki;
import defpackage.i630;
import defpackage.ike;
import defpackage.jqr;
import defpackage.kyh0;
import defpackage.lys;
import defpackage.m17;
import defpackage.mai;
import defpackage.mkb0;
import defpackage.mzg0;
import defpackage.ny61;
import defpackage.o400;
import defpackage.oxe;
import defpackage.qnh;
import defpackage.qwh;
import defpackage.rju;
import defpackage.s0i;
import defpackage.sjh;
import defpackage.svh;
import defpackage.tls;
import defpackage.tt2;
import defpackage.tvh;
import defpackage.uh6;
import defpackage.uvh;
import defpackage.uyj;
import defpackage.vsi;
import defpackage.w511;
import defpackage.wvh;
import defpackage.xjg;
import defpackage.xng0;
import defpackage.ys0;
import defpackage.zii;
import defpackage.zo31;
import defpackage.zvh;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.delivery.extracted_delivery_form.interactors.f;
import ru.yandex.taxi.delivery.extracted_delivery_form.ui.point.DeliveryPointFocusHolder$FocusTarget;
import ru.yandex.taxi.delivery.extracted_delivery_form.ui.unitedsummary.recycler.DeliveryAddressExtendedModel$Field;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliveryFormStepType;
import ru.yandex.taxi.delivery.ui.photocomment.AddPhotocommentButtonView;
import ru.yandex.taxi.delivery.ui.recycler.a;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.bubble.BubbleTextComponent;
import ru.yandex.taxi.design.bubble.decorator.HintBubbleDecorator$Position;
import ru.yandex.taxi.design.utils.TextChangedListener;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.logistics.sdk.photocomments.PhotocommentsView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes5.dex */
public final class a extends lys {
    public static final /* synthetic */ int i0 = 0;
    public final qwh S;
    public final s0i T;
    public final f U;
    public final gbi V;
    public final xjg W;
    public final qnh Z;
    public final mai a0;
    public final vsi b0;
    public final zii c0;
    public final ike d0;
    public hki e0;
    public View f0;
    public final DeliveryAddressExtendedModel$Field[] g0;
    public final Map h0;

    public a(d1x d1xVar, tt2 tt2Var, qwh qwhVar, s0i s0iVar, f fVar, gbi gbiVar, xjg xjgVar, qnh qnhVar, mai maiVar, vsi vsiVar, zii ziiVar, dci dciVar) {
        super(d1xVar);
        this.S = qwhVar;
        this.T = s0iVar;
        this.U = fVar;
        this.V = gbiVar;
        this.W = xjgVar;
        this.Z = qnhVar;
        this.a0 = maiVar;
        this.b0 = vsiVar;
        this.c0 = ziiVar;
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        this.d0 = bvf0.a(o400.a);
        this.g0 = DeliveryAddressExtendedModel$Field.values();
        this.h0 = b.i(new Pair(DeliveryAddressExtendedModel$Field.Porch, d1xVar.p), new Pair(DeliveryAddressExtendedModel$Field.Apartment, d1xVar.i), new Pair(DeliveryAddressExtendedModel$Field.Floor, d1xVar.o), new Pair(DeliveryAddressExtendedModel$Field.DoorPhone, d1xVar.n), new Pair(DeliveryAddressExtendedModel$Field.Comment, d1xVar.k));
        DeliveryPointFocusHolder$FocusTarget deliveryPointFocusHolder$FocusTarget = DeliveryPointFocusHolder$FocusTarget.Porch;
        d1x d1xVar2 = (d1x) ((zo31) this.R);
        e0(deliveryPointFocusHolder$FocusTarget, d1xVar2.p);
        e0(DeliveryPointFocusHolder$FocusTarget.Floor, d1xVar2.o);
        e0(DeliveryPointFocusHolder$FocusTarget.Apartment, d1xVar2.i);
        e0(DeliveryPointFocusHolder$FocusTarget.DoorPhone, d1xVar2.n);
        e0(DeliveryPointFocusHolder$FocusTarget.Comment, d1xVar2.k);
        d1x d1xVar3 = (d1x) ((zo31) this.R);
        final int i = 0;
        c.z(new wvh(this, i), d1xVar3.b);
        FrameLayout frameLayout = d1xVar3.b;
        CharSequence text = d1xVar3.f.getText();
        CharSequence text2 = d1xVar3.e.getText();
        StringBuilder sb = new StringBuilder();
        sb.append((Object) text);
        sb.append((Object) text2);
        frameLayout.setContentDescription(sb.toString());
        ((d1x) ((zo31) this.R)).h.setDebounceClickListener(new oxe(29, this));
        d1x d1xVar4 = (d1x) ((zo31) this.R);
        BubbleTextComponent bubbleTextComponent = d1xVar4.d;
        RobotoTextView robotoTextView = d1xVar4.f;
        bubbleTextComponent.showCloseIcon(false);
        final int i2 = 1;
        bubbleTextComponent.setOnClickListener(new View.OnClickListener(this) { // from class: vvh
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                a aVar = this.b;
                switch (i3) {
                    case 0:
                        if (aVar.F() != -1) {
                            f fVar2 = aVar.U;
                            int i4 = aVar.z;
                            if (i4 == -1) {
                                i4 = aVar.c;
                            }
                            fVar2.a(i4, true);
                        }
                        aVar.d0();
                        break;
                    default:
                        hki hkiVar = aVar.e0;
                        if (hkiVar != null) {
                            aVar.V.e(hkiVar);
                            aVar.T.b();
                            ((d1x) ((zo31) aVar.R)).d.hide(true);
                            break;
                        }
                        break;
                }
            }
        });
        if (gbiVar.a.t) {
            ViewGroup.LayoutParams layoutParams = bubbleTextComponent.getLayoutParams();
            if (layoutParams == null) {
                ny61.t("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                throw null;
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.topToBottom = robotoTextView.getId();
            layoutParams2.bottomToBottom = -1;
            bubbleTextComponent.setLayoutParams(layoutParams2);
            bubbleTextComponent.setPadding(0, (int) uh6.o(6.0f), 0, 0);
        } else {
            ViewGroup.LayoutParams layoutParams3 = bubbleTextComponent.getLayoutParams();
            if (layoutParams3 == null) {
                ny61.t("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                throw null;
            }
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            layoutParams4.bottomToBottom = robotoTextView.getId();
            layoutParams4.topToBottom = -1;
            bubbleTextComponent.setLayoutParams(layoutParams4);
            bubbleTextComponent.setPadding(0, 0, 0, 0);
        }
        rju rjuVar = new rju(this.a.getContext());
        rjuVar.b(new bdc(xng0.textMain));
        if (gbiVar.a.t) {
            rjuVar.g(HintBubbleDecorator$Position.TOP_LEFT);
        } else {
            rjuVar.g(HintBubbleDecorator$Position.OFFSET_START);
        }
        bubbleTextComponent.setDecorator(rjuVar);
        d1x d1xVar5 = (d1x) ((zo31) this.R);
        BubbleTextComponent bubbleTextComponent2 = d1xVar5.j;
        BubbleTextComponent bubbleTextComponent3 = d1xVar5.j;
        bubbleTextComponent2.showCloseIcon(false);
        bubbleTextComponent3.setManualCloseListener(new wvh(this, 2));
        bubbleTextComponent3.setOnClickListener(new View.OnClickListener(this) { // from class: vvh
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                a aVar = this.b;
                switch (i3) {
                    case 0:
                        if (aVar.F() != -1) {
                            f fVar2 = aVar.U;
                            int i4 = aVar.z;
                            if (i4 == -1) {
                                i4 = aVar.c;
                            }
                            fVar2.a(i4, true);
                        }
                        aVar.d0();
                        break;
                    default:
                        hki hkiVar = aVar.e0;
                        if (hkiVar != null) {
                            aVar.V.e(hkiVar);
                            aVar.T.b();
                            ((d1x) ((zo31) aVar.R)).d.hide(true);
                            break;
                        }
                        break;
                }
            }
        });
        rju rjuVar2 = new rju(this.a.getContext());
        rjuVar2.b(new bdc(xng0.textMain));
        rjuVar2.g(HintBubbleDecorator$Position.OFFSET_START);
        bubbleTextComponent3.setDecorator(rjuVar2);
        ((d1x) ((zo31) this.R)).g.setImageLoader(dciVar);
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        View view;
        tvh tvhVar = (tvh) obj;
        zo31 zo31Var = (zo31) this.R;
        hki hkiVar = tvhVar.d;
        i630 i630Var = tvhVar.b;
        this.e0 = hkiVar;
        boolean z = tvhVar.e;
        int i = 0;
        if (z) {
            d1x d1xVar = (d1x) zo31Var;
            d1xVar.l.setVisibility(!d1xVar.k.getInputFocused() ? 0 : 8);
            view = d1xVar.l;
        } else {
            view = null;
        }
        this.f0 = view;
        DeliveryAddressExtendedModel$Field[] deliveryAddressExtendedModel$FieldArr = this.g0;
        int length = deliveryAddressExtendedModel$FieldArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            DeliveryAddressExtendedModel$Field deliveryAddressExtendedModel$Field = deliveryAddressExtendedModel$FieldArr[i2];
            LinkedHashMap linkedHashMap = tvhVar.h;
            boolean containsKey = linkedHashMap.containsKey(deliveryAddressExtendedModel$Field);
            Map map = this.h0;
            if (containsKey) {
                AnimatedListItemInputComponent animatedListItemInputComponent = (AnimatedListItemInputComponent) map.get(deliveryAddressExtendedModel$Field);
                if (animatedListItemInputComponent != null && animatedListItemInputComponent.getVisibility() != 0) {
                    animatedListItemInputComponent.setVisibility(0);
                    animatedListItemInputComponent.setAlpha(0.0f);
                    animatedListItemInputComponent.animate().alpha(1.0f);
                }
                svh svhVar = (svh) linkedHashMap.get(deliveryAddressExtendedModel$Field);
                String str = svhVar != null ? svhVar.a : null;
                if (str == null) {
                    str = "";
                }
                svh svhVar2 = (svh) linkedHashMap.get(deliveryAddressExtendedModel$Field);
                String str2 = svhVar2 != null ? svhVar2.b : null;
                String str3 = str2 != null ? str2 : "";
                if (animatedListItemInputComponent != null) {
                    animatedListItemInputComponent.setInputTitle(str);
                    animatedListItemInputComponent.setValue(str3, false);
                    animatedListItemInputComponent.setSelection(animatedListItemInputComponent.value().length());
                }
            } else {
                AnimatedListItemInputComponent animatedListItemInputComponent2 = (AnimatedListItemInputComponent) map.get(deliveryAddressExtendedModel$Field);
                if (animatedListItemInputComponent2 != null && animatedListItemInputComponent2.getVisibility() == 0) {
                    animatedListItemInputComponent2.animate().alpha(0.0f).withEndAction(new uvh(animatedListItemInputComponent2, 0));
                }
            }
            i2++;
        }
        List<? extends mkb0> list = tvhVar.g;
        hki hkiVar2 = this.e0;
        DeliveryFormStepType a = hkiVar2 != null ? hkiVar2.a() : null;
        int i3 = 2;
        if (!i630Var.b || a == null) {
            d1x d1xVar2 = (d1x) zo31Var;
            d1xVar2.f.setText((String) i630Var.d);
            d1xVar2.f.setVisibility(0);
            d1xVar2.e.setText((String) i630Var.e);
        } else {
            d1x d1xVar3 = (d1x) zo31Var;
            RobotoTextView robotoTextView = d1xVar3.f;
            RobotoTextView robotoTextView2 = d1xVar3.e;
            robotoTextView.setText("");
            d1xVar3.f.setVisibility(8);
            int i4 = zvh.a[a.ordinal()];
            if (i4 == 1) {
                robotoTextView2.setText(kyh0.delivery_form_source_empty_contact_place_holder);
            } else {
                if (i4 != 2) {
                    w511.b();
                    return;
                }
                robotoTextView2.setText(kyh0.delivery_form_destination_empty_contact_place_holder);
            }
        }
        d1x d1xVar4 = (d1x) zo31Var;
        FrameLayout frameLayout = d1xVar4.b;
        PhotocommentsView photocommentsView = d1xVar4.g;
        ListItemComponent listItemComponent = d1xVar4.h;
        CharSequence text = d1xVar4.f.getText();
        CharSequence text2 = d1xVar4.e.getText();
        StringBuilder sb = new StringBuilder();
        sb.append((Object) text);
        sb.append((Object) text2);
        frameLayout.setContentDescription(sb.toString());
        String str4 = tvhVar.a;
        RobotoTextView robotoTextView3 = d1xVar4.q;
        robotoTextView3.setText(str4);
        robotoTextView3.setVisibility(evu0.J(str4) ? 8 : 0);
        androidx.core.view.b.q(robotoTextView3, true);
        if (i630Var.c) {
            this.T.c();
            d1xVar4.d.show(true);
        }
        listItemComponent.setTitle(tvhVar.c);
        DeliveryFormStepType deliveryFormStepType = DeliveryFormStepType.SOURCE;
        hki hkiVar3 = this.e0;
        listItemComponent.setLeadImage(deliveryFormStepType == (hkiVar3 != null ? hkiVar3.a() : null) ? mzg0.ic_order_card_source : f1h0.ic_summary_destination_point);
        photocommentsView.bindPhotocomments(list);
        photocommentsView.setDeleteClickListener(new bhh(4, this));
        boolean z2 = tvhVar.f;
        int size = list.size();
        AddPhotocommentButtonView addPhotocommentButtonView = d1xVar4.r;
        addPhotocommentButtonView.bindModel(new m17(!z2, z));
        addPhotocommentButtonView.setOnCameraChosenListener(new DeliveryAddressExtendedViewHolder$renderPhotocommentButton$1(1, this, a.class, "onCameraChosen", "onCameraChosen(Lru/yandex/taxi/delivery/extracted_form_common_data/extra/DeliveryPointType;)V", 0));
        addPhotocommentButtonView.setOnFilesChosenListener(new DeliveryAddressExtendedViewHolder$renderPhotocommentButton$2(1, this, a.class, "onFilesChosen", "onFilesChosen(Lru/yandex/taxi/delivery/extracted_form_common_data/extra/DeliveryPointType;)V", 0));
        c.z(new ys0(this, size, i3), addPhotocommentButtonView);
        this.Z.e(d1xVar4.m, F(), false);
        a0(new awh(e.H(this.d0, new jqr(this.U.b(), new DeliveryAddressExtendedViewHolder$subscribeNotificationState$job$1(this, null), 3)), i));
    }

    public final void c0() {
        d1x d1xVar = (d1x) ((zo31) this.R);
        d1xVar.p.clearInputFocus();
        d1xVar.o.clearInputFocus();
        d1xVar.k.clearInputFocus();
        d1xVar.i.clearInputFocus();
        d1xVar.n.clearInputFocus();
    }

    public final void d0() {
        ((d1x) ((zo31) this.R)).j.hide(true);
    }

    public final void e0(final DeliveryPointFocusHolder$FocusTarget deliveryPointFocusHolder$FocusTarget, AnimatedListItemInputComponent animatedListItemInputComponent) {
        final int i = 0;
        animatedListItemInputComponent.setOnFocusStateChanged(new tls(this) { // from class: xvh
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                View view;
                hki hkiVar;
                int i2 = i;
                zy11 zy11Var = zy11.a;
                DeliveryPointFocusHolder$FocusTarget deliveryPointFocusHolder$FocusTarget2 = deliveryPointFocusHolder$FocusTarget;
                a aVar = this.b;
                switch (i2) {
                    case 0:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (aVar.F() != -1) {
                            if (deliveryPointFocusHolder$FocusTarget2 == DeliveryPointFocusHolder$FocusTarget.Comment && (view = aVar.f0) != null) {
                                view.setVisibility(!booleanValue ? 0 : 8);
                            }
                            xjg xjgVar = aVar.W;
                            int F = aVar.F();
                            jvi jviVar = (jvi) xjgVar.b;
                            r0 r0Var = jviVar.a;
                            if (booleanValue) {
                                jviVar.b = (ivi) r0Var.getValue();
                                r0Var.m(null, new ivi(F, deliveryPointFocusHolder$FocusTarget2, booleanValue));
                                break;
                            }
                        }
                        break;
                    default:
                        String str = (String) obj;
                        if (aVar.F() != -1 && (hkiVar = aVar.e0) != null) {
                            ((mai) aVar.W.c).a(new up(hkiVar, deliveryPointFocusHolder$FocusTarget2, str));
                            break;
                        }
                        break;
                }
                return zy11Var;
            }
        });
        final int i2 = 1;
        animatedListItemInputComponent.setOnKeyboardClosed(new wvh(this, i2));
        animatedListItemInputComponent.setOnInputClicked(new bmh(5, this, deliveryPointFocusHolder$FocusTarget));
        animatedListItemInputComponent.addTextChangedListener(new TextChangedListener(new tls(this) { // from class: xvh
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                View view;
                hki hkiVar;
                int i22 = i2;
                zy11 zy11Var = zy11.a;
                DeliveryPointFocusHolder$FocusTarget deliveryPointFocusHolder$FocusTarget2 = deliveryPointFocusHolder$FocusTarget;
                a aVar = this.b;
                switch (i22) {
                    case 0:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (aVar.F() != -1) {
                            if (deliveryPointFocusHolder$FocusTarget2 == DeliveryPointFocusHolder$FocusTarget.Comment && (view = aVar.f0) != null) {
                                view.setVisibility(!booleanValue ? 0 : 8);
                            }
                            xjg xjgVar = aVar.W;
                            int F = aVar.F();
                            jvi jviVar = (jvi) xjgVar.b;
                            r0 r0Var = jviVar.a;
                            if (booleanValue) {
                                jviVar.b = (ivi) r0Var.getValue();
                                r0Var.m(null, new ivi(F, deliveryPointFocusHolder$FocusTarget2, booleanValue));
                                break;
                            }
                        }
                        break;
                    default:
                        String str = (String) obj;
                        if (aVar.F() != -1 && (hkiVar = aVar.e0) != null) {
                            ((mai) aVar.W.c).a(new up(hkiVar, deliveryPointFocusHolder$FocusTarget2, str));
                            break;
                        }
                        break;
                }
                return zy11Var;
            }
        }));
    }
}
