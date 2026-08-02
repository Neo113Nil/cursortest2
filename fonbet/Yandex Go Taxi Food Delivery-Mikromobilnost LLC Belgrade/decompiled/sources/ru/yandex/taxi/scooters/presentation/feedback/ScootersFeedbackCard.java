package ru.yandex.taxi.scooters.presentation.feedback;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.aln0;
import defpackage.arm0;
import defpackage.ce0;
import defpackage.cln0;
import defpackage.cma1;
import defpackage.evu0;
import defpackage.mrg0;
import defpackage.npm0;
import defpackage.ny61;
import defpackage.pfh0;
import defpackage.ppm0;
import defpackage.qrh0;
import defpackage.qvq;
import defpackage.s3n0;
import defpackage.sdk0;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.uw0;
import defpackage.v3n0;
import defpackage.vkn0;
import defpackage.w7i0;
import defpackage.wls;
import defpackage.xkn0;
import defpackage.ykn0;
import defpackage.yso;
import defpackage.zkn0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.RatingBarComponent;
import ru.yandex.taxi.scooters.presentation.feedback.comment.ScootersCommentAndPhotosView;
import ru.yandex.taxi.scooters.presentation.feedback.newbie.ScootersFeedbackCardNewbieHeader;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001'B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u008b\u0001\u0010\u001d\u001a\u00020\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\u00142 \b\u0002\u0010\u001a\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\r0\u00162\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\r0\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\"\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00192\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r0\u0014¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u0019¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u0019¢\u0006\u0004\b&\u0010%J\u0017\u0010)\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u0019¢\u0006\u0004\b,\u0010-J\u001b\u00100\u001a\u00020\r2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u0017¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u00020\r2\u0006\u00102\u001a\u00020\u001b¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b7\u00108J\u001f\u0010;\u001a\u00020\r2\u0006\u00109\u001a\u00020\u00192\b\b\u0002\u0010:\u001a\u00020\u0019¢\u0006\u0004\b;\u0010-J\r\u0010<\u001a\u00020\r¢\u0006\u0004\b<\u0010=J\u0015\u0010>\u001a\u00020\r2\u0006\u00109\u001a\u00020\u0019¢\u0006\u0004\b>\u0010%J\u0015\u0010A\u001a\u00020\r2\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\rH\u0002¢\u0006\u0004\bC\u0010=J\u000f\u0010D\u001a\u00020\rH\u0002¢\u0006\u0004\bD\u0010=J\u0019\u0010E\u001a\u00020\u0019*\b\u0012\u0004\u0012\u00020.0\u0017H\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\rH\u0002¢\u0006\u0004\bG\u0010=R\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010L\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010NR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010NR\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010NR\"\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010OR.\u0010\u001a\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\r0\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010PR\"\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\r0\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010O¨\u0006Q"}, d2 = {"Lru/yandex/taxi/scooters/presentation/feedback/ScootersFeedbackCard;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lru/yandex/taxi/scooters/presentation/feedback/comment/b;", "scootersPhotoAdapter", "Lzy11;", "setScootersPhotoAdapter", "(Lru/yandex/taxi/scooters/presentation/feedback/comment/b;)V", "Lkotlin/Function0;", "onUploadPhotoClick", "onTakePhotoDamageClick", "onSupportButtonClickListener", "Lkotlin/Function1;", "onRatingChangeListener", "Lkotlin/Function2;", "", "Lfln0;", "", "onItemsSelectionChangeListener", "", "onCommentFocusedListener", "setListeners", "(Lsls;Lsls;Lsls;Ltls;Lwls;Ltls;)V", "visible", "Lru/yandex/taxi/design/ListItemComponent;", "titleConfigurator", "bindTitle", "(ZLtls;)V", "bindSupport", "(Z)V", "bindRatingBar", "Lzkn0;", "itemsComponentData", "bindItemsSelection", "(Lzkn0;)V", "photoEnabled", "bindComment", "(ZZ)V", "Lppm0;", "photos", "updatePhotos", "(Ljava/util/List;)V", "text", "updateComment", "(Ljava/lang/String;)V", "rating", "()Ljava/lang/Integer;", "comment", "()Ljava/lang/String;", "isVisible", "animate", "changeRatingBarTitleVisibility", "scrollToFirstPhoto", "()V", "setPhotoButtonVisibility", "Lcln0;", "uiState", "bindNewbieUiState", "(Lcln0;)V", "setupListeners", "initComment", "hasLoadError", "(Ljava/util/List;)Z", "closeCommentKeyboard", "Laln0;", "binding", "Laln0;", "Lw7i0;", "onRatingChangeListenerInternal", "Lw7i0;", "Lsls;", "Ltls;", "Lwls;", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersFeedbackCard extends GoLinearLayout {
    public static final int $stable = 8;
    private final aln0 binding;
    private tls onCommentFocusedListener;
    private wls onItemsSelectionChangeListener;
    private tls onRatingChangeListener;
    private w7i0 onRatingChangeListenerInternal;
    private sls onSupportButtonClickListener;
    private sls onTakePhotoDamageClick;
    private sls onUploadPhotoClick;

    public ScootersFeedbackCard(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(qrh0.scooters_feedback_card, this);
        int i3 = pfh0.comment_with_photos;
        ScootersCommentAndPhotosView scootersCommentAndPhotosView = (ScootersCommentAndPhotosView) cma1.O(i3, this);
        if (scootersCommentAndPhotosView != null) {
            i3 = pfh0.items_selection_component;
            ScootersFeedbackItemsSelectionComponent scootersFeedbackItemsSelectionComponent = (ScootersFeedbackItemsSelectionComponent) cma1.O(i3, this);
            if (scootersFeedbackItemsSelectionComponent != null) {
                i3 = pfh0.newbie_header;
                ScootersFeedbackCardNewbieHeader scootersFeedbackCardNewbieHeader = (ScootersFeedbackCardNewbieHeader) cma1.O(i3, this);
                if (scootersFeedbackCardNewbieHeader != null) {
                    i3 = pfh0.rating_bar;
                    RatingBarComponent ratingBarComponent = (RatingBarComponent) cma1.O(i3, this);
                    if (ratingBarComponent != null) {
                        i3 = pfh0.rating_bar_title;
                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i3, this);
                        if (robotoTextView != null) {
                            i3 = pfh0.support_list_item_component;
                            ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i3, this);
                            if (listItemComponent != null) {
                                i3 = pfh0.title_view;
                                ListItemComponent listItemComponent2 = (ListItemComponent) cma1.O(i3, this);
                                if (listItemComponent2 != null) {
                                    this.binding = new aln0(this, scootersCommentAndPhotosView, scootersFeedbackItemsSelectionComponent, scootersFeedbackCardNewbieHeader, ratingBarComponent, robotoTextView, listItemComponent, listItemComponent2);
                                    int i4 = 2;
                                    this.onRatingChangeListenerInternal = new sdk0(i4);
                                    this.onUploadPhotoClick = new s3n0(19);
                                    this.onTakePhotoDamageClick = new s3n0(20);
                                    this.onSupportButtonClickListener = new s3n0(21);
                                    this.onRatingChangeListener = new vkn0(1);
                                    this.onItemsSelectionChangeListener = new arm0(3);
                                    this.onCommentFocusedListener = new vkn0(i4);
                                    setOrientation(1);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
        throw null;
    }

    public static /* synthetic */ void changeRatingBarTitleVisibility$default(ScootersFeedbackCard scootersFeedbackCard, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        scootersFeedbackCard.changeRatingBarTitleVisibility(z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void changeRatingBarTitleVisibility$lambda$0$0(ScootersFeedbackCard scootersFeedbackCard, ValueAnimator valueAnimator) {
        scootersFeedbackCard.binding.f.setHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeCommentKeyboard() {
        ScootersCommentAndPhotosView scootersCommentAndPhotosView = this.binding.b;
        scootersCommentAndPhotosView.post(new ce0(scootersCommentAndPhotosView, 15));
        this.binding.b.clearFocus();
    }

    private final boolean hasLoadError(List<ppm0> list) {
        List<ppm0> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ppm0) it.next()).b);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof npm0) {
                arrayList2.add(obj);
            }
        }
        return !arrayList2.isEmpty();
    }

    private final void initComment() {
        ScootersCommentAndPhotosView scootersCommentAndPhotosView = this.binding.b;
        scootersCommentAndPhotosView.roundView(tje.r(mrg0.go_design_m_space, scootersCommentAndPhotosView.getContext()));
        scootersCommentAndPhotosView.setOnTryLoadPhotoListener(new ScootersFeedbackCard$initComment$1$1(0, this.onUploadPhotoClick, sls.class, "invoke", "invoke()Ljava/lang/Object;", 0));
        scootersCommentAndPhotosView.setOnCloseListener(new uw0(2, this));
        scootersCommentAndPhotosView.setOnCameraClickListener(new xkn0(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 initComment$lambda$0$0(ScootersFeedbackCard scootersFeedbackCard) {
        scootersFeedbackCard.closeCommentKeyboard();
        scootersFeedbackCard.onTakePhotoDamageClick.invoke();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onCommentFocusedListener$lambda$0(String str) {
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onItemsSelectionChangeListener$lambda$0(List list, boolean z) {
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onRatingChangeListener$lambda$0(int i) {
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRatingChangeListenerInternal$lambda$0(float f, boolean z) {
    }

    public static /* synthetic */ void setListeners$default(ScootersFeedbackCard scootersFeedbackCard, sls slsVar, sls slsVar2, sls slsVar3, tls tlsVar, wls wlsVar, tls tlsVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            slsVar = scootersFeedbackCard.onUploadPhotoClick;
        }
        if ((i & 2) != 0) {
            slsVar2 = scootersFeedbackCard.onTakePhotoDamageClick;
        }
        if ((i & 4) != 0) {
            slsVar3 = scootersFeedbackCard.onSupportButtonClickListener;
        }
        if ((i & 8) != 0) {
            tlsVar = scootersFeedbackCard.onRatingChangeListener;
        }
        if ((i & 16) != 0) {
            wlsVar = scootersFeedbackCard.onItemsSelectionChangeListener;
        }
        if ((i & 32) != 0) {
            tlsVar2 = scootersFeedbackCard.onCommentFocusedListener;
        }
        wls wlsVar2 = wlsVar;
        tls tlsVar3 = tlsVar2;
        scootersFeedbackCard.setListeners(slsVar, slsVar2, slsVar3, tlsVar, wlsVar2, tlsVar3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListeners$lambda$0(ScootersFeedbackCard scootersFeedbackCard, tls tlsVar, float f, boolean z) {
        if (z) {
            int i = (int) f;
            scootersFeedbackCard.binding.e.startSelectionAnimation(i);
            tlsVar.invoke(Integer.valueOf(i));
        }
    }

    private final void setupListeners() {
        this.binding.g.setDebounceClickListener(new v3n0(12, this));
        this.binding.e.addOnRatingBarChangeListener(this.onRatingChangeListenerInternal);
        int i = 0;
        this.binding.c.setOnSelectionChangeListener(new ykn0(i, this));
        this.binding.b.setOnCommentFocusedListener(new xkn0(this, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupListeners$lambda$0(ScootersFeedbackCard scootersFeedbackCard) {
        scootersFeedbackCard.closeCommentKeyboard();
        scootersFeedbackCard.onSupportButtonClickListener.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupListeners$lambda$1(ScootersFeedbackCard scootersFeedbackCard, List list) {
        scootersFeedbackCard.onItemsSelectionChangeListener.invoke(list, Boolean.valueOf(scootersFeedbackCard.binding.c.requiresSelection()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupListeners$lambda$2(ScootersFeedbackCard scootersFeedbackCard) {
        scootersFeedbackCard.onCommentFocusedListener.invoke(String.valueOf(scootersFeedbackCard.binding.b.getComment()));
        return zy11.a;
    }

    public final void bindComment(boolean visible, boolean photoEnabled) {
        ScootersCommentAndPhotosView scootersCommentAndPhotosView = this.binding.b;
        scootersCommentAndPhotosView.setVisibility(visible ? 0 : 8);
        scootersCommentAndPhotosView.setPhotoEnabled(photoEnabled);
        if (visible) {
            return;
        }
        closeCommentKeyboard();
    }

    public final void bindItemsSelection(zkn0 itemsComponentData) {
        this.binding.c.setVisibility(itemsComponentData != null ? 0 : 8);
        if (itemsComponentData != null) {
            this.binding.c.bindData(itemsComponentData.a, itemsComponentData.b);
        }
    }

    public final void bindNewbieUiState(cln0 uiState) {
        this.binding.d.bindUiState(uiState);
        this.binding.d.setVisibility(0);
    }

    public final void bindRatingBar(boolean visible) {
        this.binding.e.setVisibility(visible ? 0 : 8);
    }

    public final void bindSupport(boolean visible) {
        this.binding.g.setVisibility(visible ? 0 : 8);
    }

    public final void bindTitle(boolean visible, tls titleConfigurator) {
        this.binding.h.setVisibility(visible ? 0 : 8);
        if (visible) {
            titleConfigurator.invoke(this.binding.h);
        }
    }

    public final void changeRatingBarTitleVisibility(final boolean isVisible, boolean animate) {
        aln0 aln0Var = this.binding;
        if (!animate) {
            aln0Var.f.setVisibility(isVisible ? 0 : 8);
            return;
        }
        int height = aln0Var.f.getHeight();
        ValueAnimator ofInt = ValueAnimator.ofInt(isVisible ? 0 : height, isVisible ? height : 0);
        ofInt.setDuration(200L);
        ofInt.addUpdateListener(new yso(27, this));
        ofInt.addListener(new Animator.AnimatorListener() { // from class: ru.yandex.taxi.scooters.presentation.feedback.ScootersFeedbackCard$changeRatingBarTitleVisibility$lambda$0$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                ScootersFeedbackCard.this.changeRatingBarTitleVisibility(isVisible, false);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ofInt.start();
    }

    public final String comment() {
        Editable comment;
        if (this.binding.b.getVisibility() != 0 || (comment = this.binding.b.getComment()) == null || evu0.J(comment)) {
            return null;
        }
        return String.valueOf(this.binding.b.getComment());
    }

    public final Integer rating() {
        if (this.binding.e.getVisibility() == 0) {
            return Integer.valueOf((int) this.binding.e.getCurrentRating());
        }
        return null;
    }

    public final void scrollToFirstPhoto() {
        this.binding.b.scrollToPhoto(0);
    }

    public final void setListeners(sls onUploadPhotoClick, sls onTakePhotoDamageClick, sls onSupportButtonClickListener, tls onRatingChangeListener, wls onItemsSelectionChangeListener, tls onCommentFocusedListener) {
        this.onUploadPhotoClick = onUploadPhotoClick;
        this.onTakePhotoDamageClick = onTakePhotoDamageClick;
        this.onSupportButtonClickListener = onSupportButtonClickListener;
        this.onRatingChangeListener = onRatingChangeListener;
        this.binding.e.removeOnRatingBarChangeListener(this.onRatingChangeListenerInternal);
        this.onRatingChangeListenerInternal = new qvq(3, this, onRatingChangeListener);
        this.onCommentFocusedListener = onCommentFocusedListener;
        this.onItemsSelectionChangeListener = onItemsSelectionChangeListener;
        setupListeners();
        initComment();
    }

    public final void setPhotoButtonVisibility(boolean isVisible) {
        this.binding.b.setPhotoButtonVisibility(isVisible);
    }

    public final void setScootersPhotoAdapter(ru.yandex.taxi.scooters.presentation.feedback.comment.b scootersPhotoAdapter) {
        this.binding.b.setScootersPhotoAdapter(scootersPhotoAdapter);
    }

    public final void updateComment(String text) {
        this.binding.b.setCommentText(text);
    }

    public final void updatePhotos(List<ppm0> photos) {
        ScootersCommentAndPhotosView scootersCommentAndPhotosView = this.binding.b;
        scootersCommentAndPhotosView.changeTryAgainButtonVisibility(hasLoadError(photos));
        scootersCommentAndPhotosView.updatePhotos(photos);
    }

    public ScootersFeedbackCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public ScootersFeedbackCard(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public ScootersFeedbackCard(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ ScootersFeedbackCard(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
