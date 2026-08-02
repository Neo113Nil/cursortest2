package ru.yandex.taxi.design;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.graphics.BlendModeCompat;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.aph0;
import defpackage.b4i0;
import defpackage.cma1;
import defpackage.dzg0;
import defpackage.eja1;
import defpackage.k4o;
import defpackage.mq0;
import defpackage.mrg0;
import defpackage.ooc;
import defpackage.qje;
import defpackage.rp31;
import defpackage.tje;
import defpackage.tpr;
import defpackage.una1;
import defpackage.up11;
import defpackage.vng;
import defpackage.w511;
import defpackage.wch0;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.yyg0;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.KeyboardAwareRobotoEditText;

@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002¬\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0013\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\f2\b\b\u0001\u0010\u001c\u001a\u00020\u00062\b\b\u0001\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b$\u0010#J\u0017\u0010'\u001a\u00020\f2\b\b\u0001\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b)\u0010\u0014J\u000f\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b-\u0010\u0014J\u0017\u0010-\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b-\u0010\u0017J\u0017\u0010.\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b.\u0010\u0014J\u0017\u00100\u001a\u00020\f2\b\b\u0001\u0010/\u001a\u00020\u0006¢\u0006\u0004\b0\u0010\u0017J\u0015\u00102\u001a\u00020\f2\u0006\u00101\u001a\u00020\u0006¢\u0006\u0004\b2\u0010\u0017J\u0015\u00104\u001a\u00020\f2\u0006\u00103\u001a\u00020\n¢\u0006\u0004\b4\u0010\u000eJ\u0015\u00107\u001a\u00020\f2\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b9\u0010\u0017J\u0017\u0010.\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b.\u0010\u0017J\u0017\u0010:\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b:\u0010\u0017J\u0017\u0010:\u001a\u00020\f2\b\u0010<\u001a\u0004\u0018\u00010;¢\u0006\u0004\b:\u0010=J\u0017\u0010@\u001a\u00020\f2\b\u0010?\u001a\u0004\u0018\u00010>¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u0004\u0018\u00010>¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020\f2\b\u0010<\u001a\u0004\u0018\u00010;¢\u0006\u0004\bD\u0010=J\u0017\u0010G\u001a\u00020\f2\b\u0010F\u001a\u0004\u0018\u00010E¢\u0006\u0004\bG\u0010HJ\u0015\u0010J\u001a\u00020\f2\u0006\u0010I\u001a\u00020\u0006¢\u0006\u0004\bJ\u0010\u0017J\u0017\u0010G\u001a\u00020\f2\b\u0010<\u001a\u0004\u0018\u00010;¢\u0006\u0004\bG\u0010=J\u0017\u0010G\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\bG\u0010\u0017J\u0015\u0010L\u001a\u00020\f2\u0006\u0010K\u001a\u00020\u0006¢\u0006\u0004\bL\u0010\u0017J\u0015\u0010N\u001a\u00020\f2\u0006\u0010M\u001a\u00020\u0006¢\u0006\u0004\bN\u0010\u0017J\u0017\u0010P\u001a\u00020\f2\b\b\u0001\u0010O\u001a\u00020\u0006¢\u0006\u0004\bP\u0010\u0017J\u0017\u0010Q\u001a\u00020\f2\b\b\u0001\u0010O\u001a\u00020\u0006¢\u0006\u0004\bQ\u0010\u0017J\u0017\u0010S\u001a\u00020\f2\b\b\u0001\u0010R\u001a\u00020\u0006¢\u0006\u0004\bS\u0010\u0017J\u0015\u0010U\u001a\u00020\f2\u0006\u0010T\u001a\u00020\n¢\u0006\u0004\bU\u0010\u000eJ\u0015\u0010V\u001a\u00020\f2\u0006\u0010M\u001a\u00020\u0006¢\u0006\u0004\bV\u0010\u0017J\u0017\u0010Y\u001a\u00020\f2\b\u0010X\u001a\u0004\u0018\u00010W¢\u0006\u0004\bY\u0010ZJ\u0013\u0010\\\u001a\b\u0012\u0004\u0012\u00020\f0[¢\u0006\u0004\b\\\u0010]J\u0013\u0010^\u001a\b\u0012\u0004\u0012\u00020\n0[¢\u0006\u0004\b^\u0010]J\u0013\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00110[¢\u0006\u0004\b_\u0010]J\u0017\u0010a\u001a\u00020\f2\b\u0010`\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\ba\u0010\u0014J\u0017\u0010c\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010b¢\u0006\u0004\bc\u0010dJ\u0017\u0010f\u001a\u00020\f2\b\u0010e\u001a\u0004\u0018\u00010W¢\u0006\u0004\bf\u0010ZJ\u0017\u0010h\u001a\u00020\f2\b\u0010g\u001a\u0004\u0018\u00010W¢\u0006\u0004\bh\u0010ZJ\u000f\u0010i\u001a\u00020\fH\u0014¢\u0006\u0004\bi\u0010jJ\r\u0010k\u001a\u00020\f¢\u0006\u0004\bk\u0010jJ)\u0010p\u001a\u00020\f2\u0006\u0010l\u001a\u00020\n2\u0006\u0010m\u001a\u00020\u00062\b\u0010o\u001a\u0004\u0018\u00010nH\u0014¢\u0006\u0004\bp\u0010qJ\u0015\u0010s\u001a\u00020\f2\u0006\u0010r\u001a\u00020\n¢\u0006\u0004\bs\u0010\u000eJ\r\u0010t\u001a\u00020\f¢\u0006\u0004\bt\u0010jJ\r\u0010u\u001a\u00020\f¢\u0006\u0004\bu\u0010jJ\u0015\u0010w\u001a\u00020\f2\u0006\u0010v\u001a\u00020\n¢\u0006\u0004\bw\u0010\u000eJ\r\u0010x\u001a\u00020\f¢\u0006\u0004\bx\u0010jJ\r\u0010y\u001a\u00020\f¢\u0006\u0004\by\u0010jJ\u0017\u0010z\u001a\u00020\f2\b\b\u0001\u0010O\u001a\u00020\u0006¢\u0006\u0004\bz\u0010\u0017J\u0017\u0010|\u001a\u00020\f2\b\b\u0001\u0010{\u001a\u00020\u0006¢\u0006\u0004\b|\u0010\u0017J\u0017\u0010}\u001a\u00020\f2\b\b\u0001\u0010O\u001a\u00020\u0006¢\u0006\u0004\b}\u0010\u0017J\u000e\u0010\u007f\u001a\u00020~¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0018\u0010\u0082\u0001\u001a\u00020\f2\u0007\u0010\u0081\u0001\u001a\u00020\n¢\u0006\u0005\b\u0082\u0001\u0010\u000eJ\u001a\u0010\u0084\u0001\u001a\u00020\f2\t\b\u0001\u0010\u0083\u0001\u001a\u00020\u0006¢\u0006\u0005\b\u0084\u0001\u0010\u0017J\u001c\u0010\u0087\u0001\u001a\u00020\f2\b\u0010\u0086\u0001\u001a\u00030\u0085\u0001H\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0012\u0010\u0089\u0001\u001a\u00020\nH\u0016¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u001a\u0010\u008c\u0001\u001a\u00020\f2\u0007\u0010\u008b\u0001\u001a\u00020\u0006H\u0016¢\u0006\u0005\b\u008c\u0001\u0010\u0017J\u001e\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u00182\b\u0010\u008e\u0001\u001a\u00030\u008d\u0001H\u0002¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001e\u0010\u0091\u0001\u001a\u0004\u0018\u00010;2\b\u0010\u008e\u0001\u001a\u00030\u008d\u0001H\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u001e\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u008e\u0001\u001a\u00030\u008d\u0001H\u0003¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u0011\u0010\u0095\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b\u0095\u0001\u0010jJ\u0011\u0010\u0096\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b\u0096\u0001\u0010jR\u001b\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u009a\u0001\u001a\u00030\u0099\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0018\u0010\u009d\u0001\u001a\u00030\u009c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0018\u0010\u009f\u0001\u001a\u00030\u009c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u009e\u0001R\u0017\u0010 \u0001\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0019\u0010¢\u0001R\u0019\u0010£\u0001\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0015\u0010¨\u0001\u001a\u00030¥\u00018F¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001R\u0016\u0010«\u0001\u001a\u0004\u0018\u00010\u00118F¢\u0006\b\u001a\u0006\b©\u0001\u0010ª\u0001¨\u0006\u00ad\u0001"}, d2 = {"Lru/yandex/taxi/design/AddressInputComponent;", "Lru/yandex/taxi/design/DividerAwareComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "isImportant", "Lzy11;", "setTrailImportantForAccessibility", "(Z)V", "animate", "setAnimateLayoutChanges", "", "text", "setTitle", "(Ljava/lang/CharSequence;)V", "setSubtitle", "res", "(I)V", "Lru/yandex/taxi/design/AddressInputComponent$Mode;", "mode", "setMode", "(Lru/yandex/taxi/design/AddressInputComponent$Mode;)V", "imageRes", "tintColorAttr", "setClearImage", "(II)V", "Landroid/animation/Animator$AnimatorListener;", "listener", "showContent", "(Landroid/animation/Animator$AnimatorListener;)V", "hideContent", "", CaretView.ALPHA_PROPERTY, "setBackgroundAlpha", "(F)V", "setAddress", "Landroid/text/Editable;", "getAddress", "()Landroid/text/Editable;", "setHint", "setTrailText", "colorInt", "setTrailTextColor", "height", "setTrailDividerSize", "isVisible", "setTrailDividerVisibility", "Lru/yandex/taxi/design/CompanionTextStyle;", "style", "setTrailTextStyle", "(Lru/yandex/taxi/design/CompanionTextStyle;)V", "setTrailTextSize", "setTrailImage", "Landroid/graphics/drawable/Drawable;", "drawable", "(Landroid/graphics/drawable/Drawable;)V", "Landroid/view/View;", "view", "setTrailView", "(Landroid/view/View;)V", "getTrailView", "()Landroid/view/View;", "setLeadBackground", "Landroid/graphics/Bitmap;", "image", "setLeadImage", "(Landroid/graphics/Bitmap;)V", "margin", "setLeadMargins", "size", "setLeadIconSize", "padding", "setLeadIconPadding", "color", "setLeadImageTint", "setTrailImageTint", "endMargin", "setTrailEndMargin", "hideKeyboardOnDetach", "setHideKeyboardOnDetach", "setInputVerticalPaddings", "Ljava/lang/Runnable;", "onTrailClickListener", "setOnTrailClickListener", "(Ljava/lang/Runnable;)V", "Ltpr;", "textClearedFlow", "()Ltpr;", "textFocusFlow", "textValueFlow", "newText", "setTextWithoutNotifying", "Landroid/widget/TextView$OnEditorActionListener;", "setOnEditorActionListener", "(Landroid/widget/TextView$OnEditorActionListener;)V", "onClose", "setOnKeyboardCloseListener", "onClear", "setOnClearListener", "onDetachedFromWindow", "()V", "requestInputFocus", "gainFocus", "direction", "Landroid/graphics/Rect;", "previouslyFocusedRect", "onFocusChanged", "(ZILandroid/graphics/Rect;)V", BackendConfig.Restrictions.ENABLED, "setComponentEnabled", "applyTrailTextRobust", "applyTrailTextRegular", "clickable", "setTrailClickable", "startTrailProgressAnimation", "stopTrailProgressAnimation", "setAddressTextColorInt", "colorAttr", "setAddressTextColorAttr", "setAddressHintColor", "Lmq0;", "createAutofitHelper", "()Lmq0;", "isInProgress", "setProgress", "backgroundRes", "setElementBackground", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "applyThemeForChildrenByDefault", "()Z", "minHeight", "setMinimumHeight", "Landroid/content/res/TypedArray;", "attributes", "getModeFromAttributes", "(Landroid/content/res/TypedArray;)Lru/yandex/taxi/design/AddressInputComponent$Mode;", "getLeadImagePlaceholderFromAttributes", "(Landroid/content/res/TypedArray;)Landroid/graphics/drawable/Drawable;", "getLeadImagePlaceholderTintFromAttributes", "(Landroid/content/res/TypedArray;)Ljava/lang/Integer;", "setReadWrite", "setReadOnly", "elementBackgroundRes", "Ljava/lang/Integer;", "Lru/yandex/taxi/design/ListItemInputComponent;", "input", "Lru/yandex/taxi/design/ListItemInputComponent;", "Lru/yandex/taxi/design/ListItemSideContainer;", "leadContainer", "Lru/yandex/taxi/design/ListItemSideContainer;", "trailContainer", "trailDivider", "Landroid/view/View;", "Lru/yandex/taxi/design/AddressInputComponent$Mode;", "trailResId", CA20Status.STATUS_USER_I, "Landroid/widget/EditText;", "getAddressEditText", "()Landroid/widget/EditText;", "addressEditText", "getHint", "()Ljava/lang/CharSequence;", "hint", "Mode", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AddressInputComponent extends DividerAwareComponent {
    private Integer elementBackgroundRes;
    private final ListItemInputComponent input;
    private final ListItemSideContainer leadContainer;
    private Mode mode;
    private final ListItemSideContainer trailContainer;
    private final View trailDivider;
    private int trailResId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/design/AddressInputComponent$Mode;", "", "VIEW", "INPUT", "EMPTY", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Mode {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode EMPTY;
        public static final Mode INPUT;
        public static final Mode VIEW;

        static {
            Mode mode = new Mode("VIEW", 0);
            VIEW = mode;
            Mode mode2 = new Mode("INPUT", 1);
            INPUT = mode2;
            Mode mode3 = new Mode("EMPTY", 2);
            EMPTY = mode3;
            Mode[] modeArr = {mode, mode2, mode3};
            $VALUES = modeArr;
            $ENTRIES = kotlin.enums.a.a(modeArr);
        }

        public static k4o a() {
            return $ENTRIES;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    public AddressInputComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ru.yandex.taxi.design.utils.c.q(this, aph0.component_address_select, true);
        int i2 = wch0.address_select_input;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ListItemInputComponent listItemInputComponent = (ListItemInputComponent) ((View) rp31.d(this, i2));
        this.input = listItemInputComponent;
        this.leadContainer = (ListItemSideContainer) ((View) rp31.d(this, wch0.address_select_lead_frame));
        ListItemSideContainer listItemSideContainer = (ListItemSideContainer) ((View) rp31.d(this, wch0.address_select_trail));
        this.trailContainer = listItemSideContainer;
        this.trailDivider = (View) rp31.d(this, wch0.address_select_trail_divider);
        listItemInputComponent.setShowUnderLine(false);
        listItemInputComponent.setBackground(null);
        listItemInputComponent.setListItemPaddingStart(0);
        listItemInputComponent.setInputType(524401);
        listItemInputComponent.setImeOptions(3);
        listItemInputComponent.setMaxLines(2);
        listItemInputComponent.setClearButtonSize(tje.u(40, getContext()));
        listItemInputComponent.setEllipsizeHint(false);
        setAnimateLayoutChanges(false);
        listItemInputComponent.setListItemPaddingEnd(tje.u(2, getContext()));
        listItemSideContainer.setCompanionTextStyle(CompanionTextStyle.ROBUST);
        listItemSideContainer.setCompanionTextSize(tje.r(mrg0.component_text_size_caption, getContext()));
        setClickable(true);
        applyTrailTextRobust();
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, b4i0.AddressInputComponent, i, 0);
        try {
            Mode modeFromAttributes = getModeFromAttributes(obtainStyledAttributes);
            this.mode = modeFromAttributes;
            if (modeFromAttributes != null) {
                setMode(modeFromAttributes);
            }
            Drawable leadImagePlaceholderFromAttributes = getLeadImagePlaceholderFromAttributes(obtainStyledAttributes);
            if (leadImagePlaceholderFromAttributes != null) {
                setLeadImage(leadImagePlaceholderFromAttributes);
            }
            Integer leadImagePlaceholderTintFromAttributes = getLeadImagePlaceholderTintFromAttributes(obtainStyledAttributes);
            if (leadImagePlaceholderTintFromAttributes != null) {
                setLeadImageTint(leadImagePlaceholderTintFromAttributes.intValue());
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final Drawable getLeadImagePlaceholderFromAttributes(TypedArray attributes) {
        int i = b4i0.AddressInputComponent_lead_image_placeholder;
        if (attributes.hasValue(i)) {
            return attributes.getDrawable(i);
        }
        return null;
    }

    private final Integer getLeadImagePlaceholderTintFromAttributes(TypedArray attributes) {
        int color;
        int i = b4i0.AddressInputComponent_lead_image_placeholder_tint;
        if (attributes.hasValue(i) && (color = attributes.getColor(i, -1)) != -1) {
            return Integer.valueOf(color);
        }
        return null;
    }

    private final Mode getModeFromAttributes(TypedArray attributes) {
        int i = b4i0.AddressInputComponent_component_address_mode;
        if (!attributes.hasValue(i)) {
            return null;
        }
        int i2 = attributes.getInt(i, 0);
        for (Mode mode : Mode.a()) {
            if (mode.ordinal() == i2) {
                return mode;
            }
        }
        return Mode.VIEW;
    }

    private final void setReadOnly() {
        this.input.setReadOnly(true);
        this.input.getInput().setImportantForAccessibility(2);
        setFocusable(false);
    }

    private final void setReadWrite() {
        this.input.setReadOnly(false);
        this.input.getInput().setImportantForAccessibility(1);
        setFocusableInTouchMode(true);
    }

    @Override // ru.yandex.taxi.design.DividerAwareComponent, com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        int i = this.trailResId;
        if (i != 0) {
            setTrailImage(i);
        }
        Mode mode = this.mode;
        if (mode != null) {
            setMode(mode);
        }
    }

    @Override // com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    public final void applyTrailTextRegular() {
        setTrailTextStyle(CompanionTextStyle.REGULAR);
        setTrailTextSize(mrg0.component_text_size_body);
    }

    public final void applyTrailTextRobust() {
        setTrailTextStyle(CompanionTextStyle.ROBUST);
        setTrailTextSize(mrg0.component_text_size_caption);
    }

    public final mq0 createAutofitHelper() {
        return una1.a(this);
    }

    public final Editable getAddress() {
        return this.input.getText();
    }

    public final EditText getAddressEditText() {
        return this.input.getInput();
    }

    public final CharSequence getHint() {
        return this.input.getHintText();
    }

    public final View getTrailView() {
        return this.trailContainer.getAsView(View.class);
    }

    public final void hideContent(Animator.AnimatorListener listener) {
        cma1.a0(this.input, listener);
        cma1.a0(this.leadContainer, null);
        cma1.a0(this.trailContainer, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.trailContainer.setDebounceClickListener((Runnable) null);
        setOnClickListener(null);
        cma1.P(this.input).a();
        cma1.P(this.leadContainer).a();
        cma1.P(this.trailContainer).a();
    }

    @Override // android.view.View
    public void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        if (gainFocus) {
            this.input.requestFocus();
        }
    }

    public final void requestInputFocus() {
        this.input.requestInputFocus();
    }

    public final void setAddress(CharSequence text) {
        ListItemInputComponent listItemInputComponent = this.input;
        if (text == null) {
            text = "";
        }
        listItemInputComponent.setText(text);
    }

    public final void setAddressHintColor(int color) {
        this.input.setHintColor(color);
    }

    public final void setAddressTextColorAttr(int colorAttr) {
        this.input.setInputTextColorAttr(colorAttr);
    }

    public final void setAddressTextColorInt(int color) {
        this.input.setInputTextColor(color);
    }

    public final void setAnimateLayoutChanges(boolean animate) {
        this.input.setAnimateLayoutChanges(animate);
    }

    public final void setBackgroundAlpha(float alpha) {
        Drawable background = getBackground();
        if (background != null) {
            background.mutate().setAlpha(((int) (255.0f * alpha)) & 255);
        }
        this.trailDivider.setAlpha(alpha);
    }

    public final void setClearImage(int imageRes, int tintColorAttr) {
        this.input.setTrailImage(imageRes, tintColorAttr);
    }

    public final void setComponentEnabled(boolean enabled) {
        setEnabled(enabled);
        this.trailContainer.setEnabled(enabled);
        this.leadContainer.setEnabled(enabled);
    }

    public final void setElementBackground(int backgroundRes) {
        this.elementBackgroundRes = Integer.valueOf(backgroundRes);
        setBackgroundResource(backgroundRes);
    }

    public final void setHideKeyboardOnDetach(boolean hideKeyboardOnDetach) {
        this.input.getInput().setHideKeyboardOnDetach(hideKeyboardOnDetach);
    }

    public final void setHint(int res) {
        setHint(getContext().getString(res));
    }

    public final void setInputVerticalPaddings(int padding) {
        this.input.setCenterVerticalPaddings(padding);
    }

    public final void setLeadBackground(Drawable drawable) {
        this.leadContainer.setBackground(drawable);
    }

    public final void setLeadIconPadding(int padding) {
        this.leadContainer.setIconPadding(padding, padding, padding, padding);
    }

    public final void setLeadIconSize(int size) {
        this.leadContainer.setIconSize(size);
    }

    public final void setLeadImage(Bitmap image) {
        this.leadContainer.setImage(image);
        this.leadContainer.setVisibility(image != null ? 0 : 8);
    }

    public final void setLeadImageTint(int color) {
        Drawable drawable = this.leadContainer.getAsImageView().getDrawable();
        if (drawable != null) {
            drawable.mutate().setColorFilter(ooc.k(color, BlendModeCompat.SRC_ATOP));
        }
    }

    public final void setLeadMargins(int margin) {
        xw31.D(margin, this.leadContainer);
    }

    @Override // android.view.View
    public void setMinimumHeight(int minHeight) {
        this.input.setMinimumHeight(minHeight);
        super.setMinimumHeight(minHeight);
    }

    public final void setMode(Mode mode) {
        this.mode = mode;
        KeyboardAwareRobotoEditText input = this.input.getInput();
        int i = a.a[mode.ordinal()];
        if (i == 1) {
            Integer num = this.elementBackgroundRes;
            if (num != null) {
                setElementBackground(num.intValue());
            } else {
                setBackground(null);
            }
            setAddressHintColor(qje.t(xng0.textMinor, getContext()));
            int[] iArr = up11.a;
            input.setTypeface(eja1.w(0, 0));
            setReadWrite();
            return;
        }
        if (i == 2) {
            Integer num2 = this.elementBackgroundRes;
            if (num2 != null) {
                setElementBackground(num2.intValue());
            } else {
                setBackground(vng.t(yyg0.address_select_empty_bg, getContext()));
            }
            setAddressHintColor(qje.t(xng0.textMain, getContext()));
            int[] iArr2 = up11.a;
            input.setTypeface(eja1.w(3, 0));
            setReadOnly();
            return;
        }
        if (i != 3) {
            w511.b();
            return;
        }
        Integer num3 = this.elementBackgroundRes;
        if (num3 != null) {
            setElementBackground(num3.intValue());
        } else {
            setBackground(vng.t(dzg0.bg_transparent_ripple, getContext()));
        }
        setAddressHintColor(qje.t(xng0.textMinor, getContext()));
        int[] iArr3 = up11.a;
        input.setTypeface(eja1.w(0, 0));
        setReadOnly();
    }

    public final void setOnClearListener(Runnable onClear) {
        this.input.setOnClear(onClear);
    }

    public final void setOnEditorActionListener(TextView.OnEditorActionListener listener) {
        this.input.setOnEditorActionListener(listener);
    }

    public final void setOnKeyboardCloseListener(Runnable onClose) {
        this.input.setOnKeyboardCloseListener(onClose);
    }

    public final void setOnTrailClickListener(Runnable onTrailClickListener) {
        this.trailContainer.setDebounceClickListener(onTrailClickListener);
        setTrailClickable(onTrailClickListener != null);
    }

    public final void setProgress(boolean isInProgress) {
        this.input.setProgress(isInProgress);
    }

    public final void setSubtitle(CharSequence text) {
        this.input.setSubtitle(text);
    }

    public final void setTextWithoutNotifying(CharSequence newText) {
        this.input.setTextWithoutNotifying(newText);
    }

    public final void setTitle(int res) {
        setTitle(getContext().getString(res));
    }

    public final void setTrailClickable(boolean clickable) {
        this.trailContainer.setClickable(clickable);
        this.trailContainer.setBackground(clickable ? vng.t(dzg0.bg_transparent_ripple, getContext()) : null);
    }

    public final void setTrailDividerSize(int height) {
        ru.yandex.taxi.design.utils.c.C(height, this.trailDivider);
    }

    public final void setTrailDividerVisibility(boolean isVisible) {
        this.trailDivider.setVisibility(isVisible ? 0 : 8);
    }

    public final void setTrailEndMargin(int endMargin) {
        xw31.z(endMargin, this.trailContainer);
    }

    public final void setTrailImage(int res) {
        setTrailImage(vng.t(res, getContext()));
        this.trailResId = res;
    }

    public final void setTrailImageTint(int color) {
        Drawable drawable = this.trailContainer.getAsImageView().getDrawable();
        if (drawable != null) {
            drawable.mutate().setColorFilter(ooc.k(color, BlendModeCompat.SRC_ATOP));
        }
    }

    public final void setTrailImportantForAccessibility(boolean isImportant) {
        int i = isImportant ? 1 : 2;
        this.trailContainer.setFocusable(true);
        this.trailContainer.setImportantForAccessibility(i);
    }

    public final void setTrailText(int res) {
        setTrailText(getContext().getString(res));
    }

    public final void setTrailTextColor(int colorInt) {
        this.trailContainer.setCompanionTextColor(colorInt);
    }

    public final void setTrailTextSize(int res) {
        this.trailContainer.setCompanionTextSize(tje.r(res, getContext()));
    }

    public final void setTrailTextStyle(CompanionTextStyle style) {
        this.trailContainer.setCompanionTextStyle(style);
    }

    public final void setTrailView(View view) {
        this.trailContainer.setView(view);
    }

    public final void showContent(Animator.AnimatorListener listener) {
        cma1.z0(this.input, listener);
        cma1.z0(this.leadContainer, null);
        cma1.z0(this.trailContainer, null);
    }

    public final void startTrailProgressAnimation() {
        this.trailContainer.startCompanionTextProgressAnimation();
    }

    public final void stopTrailProgressAnimation() {
        this.trailContainer.stopCompanionTextProgressAnimation();
    }

    public final tpr textClearedFlow() {
        return this.input.textClearedFlow();
    }

    public final tpr textFocusFlow() {
        return this.input.textFocusFlow();
    }

    public final tpr textValueFlow() {
        return this.input.textValueFlow();
    }

    public final void setHint(CharSequence text) {
        this.input.setHint(text);
    }

    public final void setTitle(CharSequence text) {
        this.input.setTitle(text);
    }

    public final void setTrailText(CharSequence text) {
        this.trailContainer.setCompanionText(text);
    }

    public final void setTrailImage(Drawable drawable) {
        this.trailResId = 0;
        this.trailContainer.setImage(drawable);
    }

    public final void setLeadImage(Drawable drawable) {
        this.leadContainer.setImage(drawable);
        this.leadContainer.setVisibility(drawable != null ? 0 : 8);
    }

    public final void setLeadImage(int res) {
        setLeadImage(vng.t(res, getContext()));
    }

    public AddressInputComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public AddressInputComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ AddressInputComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
