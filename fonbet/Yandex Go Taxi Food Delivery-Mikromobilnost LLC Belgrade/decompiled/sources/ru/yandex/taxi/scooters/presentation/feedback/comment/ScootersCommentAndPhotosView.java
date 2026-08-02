package ru.yandex.taxi.scooters.presentation.feedback.comment;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageButton;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.ajl0;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.pfh0;
import defpackage.ppm0;
import defpackage.qrh0;
import defpackage.qw0;
import defpackage.rp31;
import defpackage.s3n0;
import defpackage.sls;
import defpackage.tje;
import defpackage.uqu;
import defpackage.yjx;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewRounded$1;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.KeyboardAwareRobotoEditText;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\u00020\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001bJ\u0015\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u0018¢\u0006\u0004\b\u001f\u0010\u001bJ\u001b\u0010\"\u001a\u00020\u000b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&J\u001b\u0010'\u001a\u00020\u000b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0 ¢\u0006\u0004\b'\u0010#J\u0017\u0010)\u001a\u00020\u000b2\b\b\u0001\u0010(\u001a\u00020\u0006¢\u0006\u0004\b)\u0010&J\u0015\u0010,\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R6\u0010@\u001a\b\u0012\u0004\u0012\u00020\u000b0 2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u000b0 8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010#R.\u0010F\u001a\u0004\u0018\u00010E2\b\u0010?\u001a\u0004\u0018\u00010E8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0013\u0010O\u001a\u0004\u0018\u00010L8F¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006P"}, d2 = {"Lru/yandex/taxi/scooters/presentation/feedback/comment/ScootersCommentAndPhotosView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrsAttributeSet", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lzy11;", "setAccessibilityFocusOnTryAgainButton", "()V", "initRvPhotos", "Lyjx;", "onCloseListener", "setOnCloseListener", "(Lyjx;)V", "", "Lppm0;", "photos", "updatePhotos", "(Ljava/util/List;)V", "", "visible", "changeTryAgainButtonVisibility", "(Z)V", BackendConfig.Restrictions.ENABLED, "setPhotoEnabled", "isVisible", "setPhotoButtonVisibility", "Lkotlin/Function0;", "action", "setOnCameraClickListener", "(Lsls;)V", "position", "scrollToPhoto", "(I)V", "setOnCommentFocusedListener", "roundSize", "roundView", "", "text", "setCommentText", "(Ljava/lang/String;)V", "Lcom/yandex/go/design/view/GoConstraintLayout;", "commentFrame", "Lcom/yandex/go/design/view/GoConstraintLayout;", "Lru/yandex/taxi/widget/KeyboardAwareRobotoEditText;", "commentEditText", "Lru/yandex/taxi/widget/KeyboardAwareRobotoEditText;", "Lcom/yandex/go/design/view/GoImageButton;", "takePhotoButton", "Lcom/yandex/go/design/view/GoImageButton;", "Landroidx/recyclerview/widget/RecyclerView;", "rvPhotos", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/yandex/taxi/design/ButtonComponent;", "tryAgainButton", "Lru/yandex/taxi/design/ButtonComponent;", "photoEnabled", "Z", "value", "onTryLoadPhotoListener", "Lsls;", "getOnTryLoadPhotoListener", "()Lsls;", "setOnTryLoadPhotoListener", "Lru/yandex/taxi/scooters/presentation/feedback/comment/b;", "scootersPhotoAdapter", "Lru/yandex/taxi/scooters/presentation/feedback/comment/b;", "getScootersPhotoAdapter", "()Lru/yandex/taxi/scooters/presentation/feedback/comment/b;", "setScootersPhotoAdapter", "(Lru/yandex/taxi/scooters/presentation/feedback/comment/b;)V", "Landroid/text/Editable;", "getComment", "()Landroid/text/Editable;", "comment", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersCommentAndPhotosView extends GoLinearLayout {
    public static final int $stable = 8;
    private final KeyboardAwareRobotoEditText commentEditText;
    private final GoConstraintLayout commentFrame;
    private sls onTryLoadPhotoListener;
    private boolean photoEnabled;
    private final RecyclerView rvPhotos;
    private b scootersPhotoAdapter;
    private final GoImageButton takePhotoButton;
    private final ButtonComponent tryAgainButton;

    public ScootersCommentAndPhotosView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setOrientation(1);
        c.q(this, qrh0.scooters_comment_and_photos_view, true);
        int i3 = pfh0.comment_frame;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.commentFrame = (GoConstraintLayout) ((View) rp31.d(this, i3));
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = (KeyboardAwareRobotoEditText) ((View) rp31.d(this, pfh0.comment_edit_text));
        keyboardAwareRobotoEditText.setImeOptions(6);
        keyboardAwareRobotoEditText.setRawInputType(147456);
        this.commentEditText = keyboardAwareRobotoEditText;
        this.takePhotoButton = (GoImageButton) ((View) rp31.d(this, pfh0.take_photo_button));
        this.rvPhotos = (RecyclerView) ((View) rp31.d(this, pfh0.rv_photos));
        ButtonComponent buttonComponent = (ButtonComponent) ((View) rp31.d(this, pfh0.try_again_button));
        this.tryAgainButton = buttonComponent;
        androidx.core.view.b.t(buttonComponent, getContext().getString(kyh0.scooters_photo_loading_error));
        this.onTryLoadPhotoListener = new s3n0(10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _set_onTryLoadPhotoListener_$lambda$0(sls slsVar, ScootersCommentAndPhotosView scootersCommentAndPhotosView) {
        slsVar.invoke();
        scootersCommentAndPhotosView.tryAgainButton.setVisibility(8);
    }

    private final void initRvPhotos() {
        RecyclerView recyclerView = this.rvPhotos;
        recyclerView.setAdapter(this.scootersPhotoAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.addItemDecoration(new uqu(tje.u(4, recyclerView.getContext())));
    }

    private final void setAccessibilityFocusOnTryAgainButton() {
        ButtonComponent buttonComponent = this.tryAgainButton;
        buttonComponent.setFocusable(true);
        buttonComponent.performAccessibilityAction(64, null);
        buttonComponent.sendAccessibilityEvent(32768);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnCommentFocusedListener$lambda$0(ScootersCommentAndPhotosView scootersCommentAndPhotosView, sls slsVar, View view, boolean z) {
        if (jl40.l(view, scootersCommentAndPhotosView.commentEditText) && z) {
            slsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updatePhotos$lambda$0(ScootersCommentAndPhotosView scootersCommentAndPhotosView, List list) {
        scootersCommentAndPhotosView.rvPhotos.setVisibility(!list.isEmpty() ? 0 : 8);
    }

    public final void changeTryAgainButtonVisibility(boolean visible) {
        this.tryAgainButton.setVisibility(visible ? 0 : 8);
        if (visible) {
            setAccessibilityFocusOnTryAgainButton();
        }
    }

    public final Editable getComment() {
        return this.commentEditText.getText();
    }

    public final sls getOnTryLoadPhotoListener() {
        return this.onTryLoadPhotoListener;
    }

    public final b getScootersPhotoAdapter() {
        return this.scootersPhotoAdapter;
    }

    public final void roundView(int roundSize) {
        GoConstraintLayout goConstraintLayout = this.commentFrame;
        goConstraintLayout.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(roundSize));
        goConstraintLayout.setClipToOutline(true);
    }

    public final void scrollToPhoto(int position) {
        this.rvPhotos.scrollToPosition(position);
    }

    public final void setCommentText(String text) {
        this.commentEditText.setText(text);
    }

    public final void setOnCameraClickListener(sls action) {
        c.z(action, this.takePhotoButton);
    }

    public final void setOnCloseListener(yjx onCloseListener) {
        this.commentEditText.setOnCloseListener(onCloseListener);
    }

    public final void setOnCommentFocusedListener(sls action) {
        this.commentEditText.setOnFocusChangeListener(new qw0(this, action, 2));
    }

    public final void setOnTryLoadPhotoListener(sls slsVar) {
        this.onTryLoadPhotoListener = slsVar;
        this.tryAgainButton.setDebounceClickListener(new ajl0(14, slsVar, this));
    }

    public final void setPhotoButtonVisibility(boolean isVisible) {
        this.takePhotoButton.setVisibility(isVisible ? 0 : 8);
    }

    public final void setPhotoEnabled(boolean enabled) {
        this.photoEnabled = enabled;
        this.takePhotoButton.setVisibility(enabled ? 0 : 8);
    }

    public final void setScootersPhotoAdapter(b bVar) {
        this.scootersPhotoAdapter = bVar;
        initRvPhotos();
    }

    public final void updatePhotos(List<ppm0> photos) {
        b bVar = this.scootersPhotoAdapter;
        if (bVar != null) {
            bVar.submitList(photos, new ajl0(15, this, photos));
        }
    }

    public ScootersCommentAndPhotosView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public ScootersCommentAndPhotosView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public ScootersCommentAndPhotosView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ ScootersCommentAndPhotosView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
