package ru.yandex.taxi.search.address.view;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.core.view.OneShotPreDrawListener;
import com.adjust.sdk.Constants;
import com.yandex.go.address.models.Address;
import defpackage.bhh0;
import defpackage.bjd;
import defpackage.bms;
import defpackage.cfs;
import defpackage.ejd;
import defpackage.etg0;
import defpackage.ex4;
import defpackage.f6v0;
import defpackage.fct0;
import defpackage.fjd;
import defpackage.gct0;
import defpackage.gjd;
import defpackage.gyc;
import defpackage.hbp0;
import defpackage.i61;
import defpackage.ijd;
import defpackage.jhd;
import defpackage.jjd;
import defpackage.k4o;
import defpackage.k8v0;
import defpackage.mw0;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.q91;
import defpackage.qje;
import defpackage.qw0;
import defpackage.rp31;
import defpackage.s2h;
import defpackage.t6v0;
import defpackage.tbb;
import defpackage.tje;
import defpackage.tpr;
import defpackage.u0c0;
import defpackage.u6v0;
import defpackage.v51;
import defpackage.v6v0;
import defpackage.w511;
import defpackage.x9v0;
import defpackage.xng0;
import defpackage.xvz;
import defpackage.xy4;
import defpackage.yn0;
import defpackage.yy4;
import defpackage.z51;
import defpackage.zph0;
import defpackage.zy11;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.address.design.SourceDestinationComponentV2;
import ru.yandex.taxi.analytics.Events$Suggest$ZeroSuggestAdditionalTapArea;
import ru.yandex.taxi.design.AddressInputComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.experiments.mainscreen.MainScreenBehavior;
import ru.yandex.taxi.mainscreen.analytics.MainScreenAnalyticsScreenMode;
import ru.yandex.taxi.preorder.suggested.menu.EntryPoint;
import ru.yandex.taxi.preorder.suggested.selection.SuggestsView;
import ru.yandex.taxi.search.address.view.CompositeAddressSearchView;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.search.g;
import ru.yandex.taxi.search.view.BaseAddressSearchView;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.modalview.ModalViewProcessing$ProcessingState;

@Metadata(d1 = {"\u0000\u0090\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\b*\u0002Â\u0001\u0018\u0000 Å\u00012\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\tÀ\u0001\u0003Æ\u0001Ç\u0001È\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\fJ\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\fJ\u000f\u0010\u0016\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0016\u0010\fJ\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001b\u0010\fJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\fJ\u000f\u0010\u001d\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001d\u0010\fJ\u000f\u0010\u001e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001e\u0010\fJ\u0017\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b#\u0010\"J3\u0010*\u001a\u00020\n2\u0006\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010\u00172\b\u0010'\u001a\u0004\u0018\u00010\u00172\u0006\u0010)\u001a\u00020(H\u0014¢\u0006\u0004\b*\u0010+J#\u0010,\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\u00172\b\u0010'\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b.\u0010\"J\u0017\u00101\u001a\u00020\n2\u0006\u00100\u001a\u00020/H\u0014¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\n2\u0006\u00100\u001a\u00020/H\u0014¢\u0006\u0004\b3\u00102J\u0017\u00104\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b4\u0010\"J\u0017\u00106\u001a\u00020\n2\u0006\u00105\u001a\u00020\u000fH\u0014¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\nH\u0014¢\u0006\u0004\b8\u0010\fJ\u0017\u0010;\u001a\u00020\n2\u0006\u0010:\u001a\u000209H\u0014¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\nH\u0014¢\u0006\u0004\b=\u0010\fJ\u000f\u0010>\u001a\u00020\nH\u0016¢\u0006\u0004\b>\u0010\fJ\u000f\u0010?\u001a\u000209H\u0014¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\nH\u0014¢\u0006\u0004\bA\u0010\fJ\r\u0010C\u001a\u00020B¢\u0006\u0004\bC\u0010DJ\r\u0010F\u001a\u00020E¢\u0006\u0004\bF\u0010GJ\r\u0010H\u001a\u00020\n¢\u0006\u0004\bH\u0010\fJ\r\u0010J\u001a\u00020I¢\u0006\u0004\bJ\u0010KJ\u0015\u0010M\u001a\u00020\n2\u0006\u0010L\u001a\u00020I¢\u0006\u0004\bM\u0010NJ\u0017\u0010P\u001a\u0004\u0018\u00010\u00172\u0006\u0010O\u001a\u00020E¢\u0006\u0004\bP\u0010QJ\u0017\u0010T\u001a\u00020\n2\b\u0010S\u001a\u0004\u0018\u00010R¢\u0006\u0004\bT\u0010UJ\r\u0010V\u001a\u00020\n¢\u0006\u0004\bV\u0010\fJ%\u0010Y\u001a\u00020\n2\u0006\u0010L\u001a\u00020I2\u0006\u0010W\u001a\u0002092\u0006\u0010X\u001a\u000209¢\u0006\u0004\bY\u0010ZJ\u0015\u0010]\u001a\u00020\n2\u0006\u0010\\\u001a\u00020[¢\u0006\u0004\b]\u0010^J\u001d\u0010]\u001a\u00020\n2\u0006\u0010_\u001a\u00020[2\u0006\u0010`\u001a\u000209¢\u0006\u0004\b]\u0010aJ\u0017\u0010d\u001a\u00020\n2\b\u0010c\u001a\u0004\u0018\u00010b¢\u0006\u0004\bd\u0010eJ\r\u0010f\u001a\u00020\n¢\u0006\u0004\bf\u0010\fJ\u0015\u0010i\u001a\u00020\n2\u0006\u0010h\u001a\u00020g¢\u0006\u0004\bi\u0010jJ\u001d\u0010l\u001a\u00020\n2\u0006\u0010O\u001a\u00020E2\u0006\u0010k\u001a\u000209¢\u0006\u0004\bl\u0010mJ\u0015\u0010o\u001a\u00020\n2\u0006\u0010n\u001a\u00020\u000f¢\u0006\u0004\bo\u00107J\u0017\u0010r\u001a\u00020\n2\u0006\u0010q\u001a\u00020pH\u0016¢\u0006\u0004\br\u0010sJ\u000f\u0010t\u001a\u000209H\u0016¢\u0006\u0004\bt\u0010@J\u001f\u0010v\u001a\u00020\n2\u0006\u0010u\u001a\u0002092\u0006\u0010O\u001a\u00020EH\u0002¢\u0006\u0004\bv\u0010wJ\u0017\u0010y\u001a\u00020x2\u0006\u0010O\u001a\u00020EH\u0002¢\u0006\u0004\by\u0010zJ\u000f\u0010{\u001a\u00020\nH\u0002¢\u0006\u0004\b{\u0010\fJ\u000f\u0010|\u001a\u00020\nH\u0002¢\u0006\u0004\b|\u0010\fJ4\u0010\u0082\u0001\u001a\u00020\n2\u0006\u0010~\u001a\u00020}2\u0006\u0010\u007f\u001a\u00020E2\u0007\u0010\u0080\u0001\u001a\u00020E2\u0007\u0010\u0081\u0001\u001a\u00020\u0017H\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0011\u0010\u0084\u0001\u001a\u00020\nH\u0002¢\u0006\u0005\b\u0084\u0001\u0010\fJ\u0011\u0010\u0085\u0001\u001a\u00020BH\u0002¢\u0006\u0005\b\u0085\u0001\u0010DJ\u0011\u0010\u0086\u0001\u001a\u00020\nH\u0002¢\u0006\u0005\b\u0086\u0001\u0010\fJ\u0011\u0010\u0087\u0001\u001a\u00020\nH\u0002¢\u0006\u0005\b\u0087\u0001\u0010\fJ\u0011\u0010\u0088\u0001\u001a\u00020\nH\u0002¢\u0006\u0005\b\u0088\u0001\u0010\fJ\u0012\u0010\u0089\u0001\u001a\u00020}H\u0002¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u0019\u0010\u008b\u0001\u001a\u00020\n2\u0006\u0010u\u001a\u000209H\u0002¢\u0006\u0005\b\u008b\u0001\u0010<J\u001a\u0010\u008d\u0001\u001a\u00020\n2\u0007\u0010\u008c\u0001\u001a\u000209H\u0002¢\u0006\u0005\b\u008d\u0001\u0010<J$\u0010\u0090\u0001\u001a\u00020\n2\u0007\u0010\u008e\u0001\u001a\u00020B2\u0007\u0010\u008f\u0001\u001a\u00020\u000fH\u0002¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u0011\u0010\u0092\u0001\u001a\u00020\nH\u0002¢\u0006\u0005\b\u0092\u0001\u0010\fJ%\u0010\u0096\u0001\u001a\u00030\u0095\u00012\b\u0010\u0094\u0001\u001a\u00030\u0093\u00012\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u0098\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001a\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0017\u0010\u009e\u0001\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0017\u0010 \u0001\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0001\u0010\u009f\u0001R\u0017\u0010¡\u0001\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0017\u0010£\u0001\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¢\u0001R\u0018\u0010¥\u0001\u001a\u00030¤\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0018\u0010¨\u0001\u001a\u00030§\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0018\u0010«\u0001\u001a\u00030ª\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u0018\u0010®\u0001\u001a\u00030\u00ad\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u001a\u0010±\u0001\u001a\u0005\u0018\u00010°\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u0019\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bS\u0010³\u0001R\u0019\u0010´\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u0019\u0010¶\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010µ\u0001R\u0019\u0010·\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010µ\u0001R\u001a\u0010¹\u0001\u001a\u00030¸\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u0019\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bF\u0010»\u0001R\u001b\u0010¼\u0001\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010»\u0001R\u001a\u0010¾\u0001\u001a\u00030½\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u001a\u0010\b\u001a\u00070À\u0001R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\b\u0010Á\u0001R\u0018\u0010Ã\u0001\u001a\u00030Â\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001¨\u0006É\u0001"}, d2 = {"Lru/yandex/taxi/search/address/view/CompositeAddressSearchView;", "Lru/yandex/taxi/search/view/BaseAddressSearchView;", "Lnwy0;", "Lfjd;", "viewBuilder", "<init>", "(Lfjd;)V", "Lbjd;", "mvpView", "()Lbjd;", "Lzy11;", "onAttachedToWindow", "()V", "requestActiveInputViewFocus", "onDetachedFromWindow", "", "getContentViewLayoutRes", "()I", "onResume", "onPause", "onParentDismiss", "onParentDismissManually", "onTextCleared", "", "text", "filterChanged", "(Ljava/lang/String;)V", "onSearchAgain", "closeKeyboard", "onShowKeyboard", "onHideKeyboard", "Lx9v0;", "model", "onItemSelected", "(Lx9v0;)V", "onItemSelectedLongTap", "Lyn0;", "actionViewModel", "id", "idType", "Lru/yandex/taxi/analytics/Events$Suggest$ZeroSuggestAdditionalTapArea;", "area", "onAdditionalItemSelected", "(Lyn0;Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/analytics/Events$Suggest$ZeroSuggestAdditionalTapArea;)V", "onAdditionalItemShow", "(Ljava/lang/String;Ljava/lang/String;)V", "onDotsClicked", "Lk8v0;", "action", "onTrailAction", "(Lk8v0;)V", "onTrailButtonBind", "onItemEntranceClicked", "itemsCount", "onScrollToBottom", "(I)V", "onKeyboardSearchClicked", "", "clearDestinationOnDismiss", "onClearFilterClicked", "(Z)V", "onPointOnMapClicked", "onTouchOutside", "inputHasFocus", "()Z", "onDismiss", "Landroid/view/View;", "activeInput", "()Landroid/view/View;", "Lru/yandex/taxi/search/address/view/PointType;", "activePoint", "()Lru/yandex/taxi/search/address/view/PointType;", "invalidateActivePoint", "Lru/yandex/taxi/widget/modalview/ModalViewProcessing$ProcessingState;", "getProcessingState", "()Lru/yandex/taxi/widget/modalview/ModalViewProcessing$ProcessingState;", "processingState", "applyProcessingState", "(Lru/yandex/taxi/widget/modalview/ModalViewProcessing$ProcessingState;)V", "pointType", "getFilter", "(Lru/yandex/taxi/search/address/view/PointType;)Ljava/lang/String;", "Lex4;", "suggestsListener", "setSuggestsListener", "(Lex4;)V", "onUpdateOffsets", "minimized", "isMovedByUser", "onCollapse", "(Lru/yandex/taxi/widget/modalview/ModalViewProcessing$ProcessingState;ZZ)V", "Lru/yandex/taxi/mainscreen/analytics/MainScreenAnalyticsScreenMode;", "shortcutsVisible", "onExpand", "(Lru/yandex/taxi/mainscreen/analytics/MainScreenAnalyticsScreenMode;)V", "screenMode", "addressSearchVisible", "(Lru/yandex/taxi/mainscreen/analytics/MainScreenAnalyticsScreenMode;Z)V", "Lcom/yandex/go/address/models/Address;", "sourceAddress", "onSourceAddressChanged", "(Lcom/yandex/go/address/models/Address;)V", "onRouteConfirmed", "Landroid/net/Uri;", Constants.DEEPLINK, "processDeeplink", "(Landroid/net/Uri;)V", "requestFocusIfRequired", "setActivePoint", "(Lru/yandex/taxi/search/address/view/PointType;Z)V", "additionalHeight", "setTopSpaceAdditionalHeight", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "applyThemeForChildrenByDefault", "hasFocus", "onFocusChange", "(ZLru/yandex/taxi/search/address/view/PointType;)V", "Landroid/view/View$OnFocusChangeListener;", "createOnFocusChangeListenerV2", "(Lru/yandex/taxi/search/address/view/PointType;)Landroid/view/View$OnFocusChangeListener;", "expandSuggests", "collapseSuggests", "Lru/yandex/taxi/design/AddressInputComponent;", "addressInput", "activePointType", "inputPointType", "color", "initInput", "(Lru/yandex/taxi/design/AddressInputComponent;Lru/yandex/taxi/search/address/view/PointType;Lru/yandex/taxi/search/address/view/PointType;Ljava/lang/String;)V", "initInputs", "activeFocusCatcher", "requestPendingFocusIfNeed", "setInputListeners", "removeInputListeners", "activeAddressInput", "()Lru/yandex/taxi/design/AddressInputComponent;", "checkSourceDestinationType", "visible", "setSourceDestinationWithCirclePinsVisibility", "view", "targetViewId", "changeSourceDestinationViewAttachment", "(Landroid/view/View;I)V", "requestInputFocus", "Lru/yandex/taxi/preorder/suggested/menu/EntryPoint;", "entryPoint", "Lv6v0;", "createSuggestMenuPayload", "(Lru/yandex/taxi/preorder/suggested/menu/EntryPoint;Lx9v0;)Lv6v0;", "Lyy4;", "presenter", "Lyy4;", "Lq91;", "addressesListPerfCallback", "Lq91;", "sourceInput", "Lru/yandex/taxi/design/AddressInputComponent;", "destinationInput", "sourceFocusCatcher", "Landroid/view/View;", "destinationFocusCatcher", "Landroid/widget/Space;", "topSpace", "Landroid/widget/Space;", "Landroid/view/ViewStub;", "toolbarStub", "Landroid/view/ViewStub;", "Lru/yandex/taxi/search/g;", "sourceDestinationHolder", "Lru/yandex/taxi/search/g;", "Li61;", "listener", "Li61;", "Ls2h;", "deeplinkNavigator", "Ls2h;", "Lex4;", "canPointOnMap", "Z", "clickOnAddress", "isAddressMinorBackground", "Lru/yandex/taxi/search/address/view/CompositeAddressSearchView$SourceDestinationType;", "sourceDestinationType", "Lru/yandex/taxi/search/address/view/CompositeAddressSearchView$SourceDestinationType;", "Lru/yandex/taxi/search/address/view/PointType;", "pendingFocusRequestPointType", "Lu0c0;", "pinStyles", "Lu0c0;", "Lru/yandex/taxi/search/address/view/d;", "Lru/yandex/taxi/search/address/view/d;", "jjd", "destinationAddressAutofitOwner", "Ljjd;", "Companion", "v51", "SourceDestinationType", "gjd", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CompositeAddressSearchView extends BaseAddressSearchView<CompositeAddressSearchView> implements nwy0 {
    public static final gjd Companion = new gjd();
    private PointType activePoint;
    private final q91 addressesListPerfCallback;
    private boolean canPointOnMap;
    private boolean clickOnAddress;
    private final s2h deeplinkNavigator;
    private final jjd destinationAddressAutofitOwner;
    private final View destinationFocusCatcher;
    private final AddressInputComponent destinationInput;
    private boolean isAddressMinorBackground;
    private final i61 listener;
    private final d mvpView;
    private PointType pendingFocusRequestPointType;
    private u0c0 pinStyles;
    private final yy4 presenter;
    private final ru.yandex.taxi.search.g sourceDestinationHolder;
    private SourceDestinationType sourceDestinationType;
    private final View sourceFocusCatcher;
    private final AddressInputComponent sourceInput;
    private ex4 suggestsListener;
    private final ViewStub toolbarStub;
    private final Space topSpace;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/search/address/view/CompositeAddressSearchView$SourceDestinationType;", "", "NEWBIES", "WITH_CIRCLES", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class SourceDestinationType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ SourceDestinationType[] $VALUES;
        public static final SourceDestinationType NEWBIES;
        public static final SourceDestinationType WITH_CIRCLES;

        static {
            SourceDestinationType sourceDestinationType = new SourceDestinationType("NEWBIES", 0);
            NEWBIES = sourceDestinationType;
            SourceDestinationType sourceDestinationType2 = new SourceDestinationType("WITH_CIRCLES", 1);
            WITH_CIRCLES = sourceDestinationType2;
            SourceDestinationType[] sourceDestinationTypeArr = {sourceDestinationType, sourceDestinationType2};
            $VALUES = sourceDestinationTypeArr;
            $ENTRIES = kotlin.enums.a.a(sourceDestinationTypeArr);
        }

        public static SourceDestinationType valueOf(String str) {
            return (SourceDestinationType) Enum.valueOf(SourceDestinationType.class, str);
        }

        public static SourceDestinationType[] values() {
            return (SourceDestinationType[]) $VALUES.clone();
        }
    }

    private CompositeAddressSearchView(fjd fjdVar) {
        super(fjdVar);
        com.yandex.go.address.search.common.presenter.a aVar = fjdVar.l;
        this.presenter = aVar;
        com.yandex.go.address.search.perf.b bVar = fjdVar.t;
        this.addressesListPerfCallback = bVar;
        int i = bhh0.source_address_input;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        AddressInputComponent addressInputComponent = (AddressInputComponent) ((View) rp31.d(this, i));
        this.sourceInput = addressInputComponent;
        AddressInputComponent addressInputComponent2 = (AddressInputComponent) ((View) rp31.d(this, bhh0.destination_address_input));
        this.destinationInput = addressInputComponent2;
        this.sourceFocusCatcher = (View) rp31.d(this, bhh0.source_touch_area);
        this.destinationFocusCatcher = (View) rp31.d(this, bhh0.destination_touch_area);
        this.topSpace = (Space) ((View) rp31.d(this, bhh0.top_space));
        this.toolbarStub = (ViewStub) ((View) rp31.d(this, bhh0.toolbar_stub));
        this.canPointOnMap = true;
        this.sourceDestinationType = SourceDestinationType.WITH_CIRCLES;
        this.pinStyles = u0c0.d;
        this.mvpView = new d(this);
        this.destinationAddressAutofitOwner = new jjd(this);
        i61 i61Var = fjdVar.n;
        this.listener = i61Var;
        this.canPointOnMap = fjdVar.r;
        aVar.y.D = fjdVar.s;
        aVar.e0 = new v51(2, i61Var);
        ru.yandex.taxi.search.g gVar = fjdVar.m;
        this.sourceDestinationHolder = gVar;
        this.deeplinkNavigator = fjdVar.o;
        this.isAddressMinorBackground = false;
        gVar.a.setVisibility(8);
        ru.yandex.taxi.design.utils.c.w((View) rp31.d(this, bhh0.source_destination_stub), gVar.a);
        addressInputComponent.setMode(AddressInputComponent.Mode.INPUT);
        addressInputComponent2.setDividers(DividerPosition.TOP, DividerType.ICON_HALF_MARGIN);
        com.yandex.go.address.search.common.presenter.d dVar = aVar.x;
        dVar.b0 = bVar;
        com.yandex.go.address.search.common.presenter.b bVar2 = aVar.y;
        bVar2.b0 = bVar;
        bjd mvpView = mvpView();
        MainScreenBehavior mainScreenBehavior = aVar.K;
        if (aVar.Wg()) {
            mvpView.ye();
        } else {
            mvpView.od();
        }
        aVar.b0 = mainScreenBehavior.getIsShowCurrentRouteSuggest();
        dVar.O.f = mainScreenBehavior.getIsShowCurrentRouteSuggest() && mvpView.H();
        bVar2.O.f = mainScreenBehavior.getIsShowCurrentRouteSuggest() && mvpView.H();
        mvpView().setActivePoint(fjdVar.p);
        getAddressInputShadow().setPivotY(0.0f);
        final Uri uri = fjdVar.q;
        if (uri != null) {
            if (isAttachedToWindow()) {
                processDeeplink(uri);
            } else {
                addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: ru.yandex.taxi.search.address.view.CompositeAddressSearchView$_init_$lambda$0$$inlined$doOnAttach$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view) {
                        this.removeOnAttachStateChangeListener(this);
                        this.processDeeplink(uri);
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view) {
                    }
                });
            }
        }
    }

    private static final zy11 _init_$lambda$1(CompositeAddressSearchView compositeAddressSearchView) {
        Activity p = ru.yandex.taxi.design.utils.c.p(compositeAddressSearchView);
        if (p != null) {
            p.onBackPressed();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AddressInputComponent activeAddressInput() {
        return this.activePoint == PointType.DESTINATION ? this.destinationInput : this.sourceInput;
    }

    private final View activeFocusCatcher() {
        return this.activePoint == PointType.SOURCE ? this.destinationFocusCatcher : this.sourceFocusCatcher;
    }

    public static final fjd builder(xy4 xy4Var) {
        Companion.getClass();
        return new fjd(xy4Var);
    }

    private final void changeSourceDestinationViewAttachment(View view, int targetViewId) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.removeRule(3);
            layoutParams2.addRule(3, targetViewId);
            view.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkSourceDestinationType(boolean hasFocus) {
        SourceDestinationType sourceDestinationType = this.sourceDestinationType;
        SourceDestinationType sourceDestinationType2 = SourceDestinationType.NEWBIES;
        if (sourceDestinationType == sourceDestinationType2) {
            setSourceDestinationWithCirclePinsVisibility(false);
            this.sourceDestinationHolder.b();
            this.sourceDestinationHolder.a.setVisibility(0);
        } else {
            this.sourceDestinationHolder.a.setVisibility(8);
            setSourceDestinationWithCirclePinsVisibility(true);
        }
        if (hasFocus) {
            requestInputFocus();
        }
        int id = this.sourceDestinationType == sourceDestinationType2 ? this.sourceDestinationHolder.a.getId() : this.destinationInput.getId();
        changeSourceDestinationViewAttachment(suggestsViewField(), id);
        changeSourceDestinationViewAttachment(getSuggestsProgressView(), id);
        changeSourceDestinationViewAttachment(getEmptyOrDefaultMessageViewStub(), id);
    }

    private final void collapseSuggests() {
        changeSuggestsViewState(SuggestsView.State.SHORT);
    }

    private final View.OnFocusChangeListener createOnFocusChangeListenerV2(PointType pointType) {
        return new qw0(this, pointType, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createOnFocusChangeListenerV2$lambda$0(CompositeAddressSearchView compositeAddressSearchView, PointType pointType, View view, boolean z) {
        if (z) {
            compositeAddressSearchView.mvpView().setActivePoint(pointType);
            compositeAddressSearchView.presenter.ih(pointType);
        }
        compositeAddressSearchView.presenter.lh();
    }

    private final v6v0 createSuggestMenuPayload(EntryPoint entryPoint, x9v0 model) {
        PointType pointType = this.activePoint;
        u6v0 u6v0Var = new u6v0();
        final int i = 0;
        u6v0Var.a = new t6v0(this) { // from class: cjd
            public final /* synthetic */ CompositeAddressSearchView b;

            {
                this.b = this;
            }

            @Override // defpackage.t6v0
            public final void a(Address address) {
                int i2 = i;
                CompositeAddressSearchView compositeAddressSearchView = this.b;
                switch (i2) {
                    case 0:
                        compositeAddressSearchView.closeKeyboard();
                        break;
                    case 1:
                        compositeAddressSearchView.onDismiss();
                        break;
                    default:
                        CompositeAddressSearchView.createSuggestMenuPayload$lambda$3(compositeAddressSearchView, address);
                        break;
                }
            }
        };
        final int i2 = 1;
        u6v0Var.b = new z51(this, model, i2);
        u6v0Var.d = new t6v0(this) { // from class: cjd
            public final /* synthetic */ CompositeAddressSearchView b;

            {
                this.b = this;
            }

            @Override // defpackage.t6v0
            public final void a(Address address) {
                int i22 = i2;
                CompositeAddressSearchView compositeAddressSearchView = this.b;
                switch (i22) {
                    case 0:
                        compositeAddressSearchView.closeKeyboard();
                        break;
                    case 1:
                        compositeAddressSearchView.onDismiss();
                        break;
                    default:
                        CompositeAddressSearchView.createSuggestMenuPayload$lambda$3(compositeAddressSearchView, address);
                        break;
                }
            }
        };
        final int i3 = 2;
        u6v0Var.c = new t6v0(this) { // from class: cjd
            public final /* synthetic */ CompositeAddressSearchView b;

            {
                this.b = this;
            }

            @Override // defpackage.t6v0
            public final void a(Address address) {
                int i22 = i3;
                CompositeAddressSearchView compositeAddressSearchView = this.b;
                switch (i22) {
                    case 0:
                        compositeAddressSearchView.closeKeyboard();
                        break;
                    case 1:
                        compositeAddressSearchView.onDismiss();
                        break;
                    default:
                        CompositeAddressSearchView.createSuggestMenuPayload$lambda$3(compositeAddressSearchView, address);
                        break;
                }
            }
        };
        u6v0Var.g = new f6v0(i2, findFocus());
        return new v6v0(model, pointType, u6v0Var.a(), new jhd(i2, this, model), entryPoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createSuggestMenuPayload$lambda$1(CompositeAddressSearchView compositeAddressSearchView, x9v0 x9v0Var, Address address) {
        yy4 yy4Var = compositeAddressSearchView.presenter;
        PointType pointType = compositeAddressSearchView.activePoint;
        if (pointType != null) {
            yy4Var.gh(pointType, x9v0Var);
        } else {
            ny61.g("Required value was null.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createSuggestMenuPayload$lambda$3(CompositeAddressSearchView compositeAddressSearchView, Address address) {
        yy4 yy4Var = compositeAddressSearchView.presenter;
        PointType pointType = compositeAddressSearchView.activePoint;
        if (pointType != null) {
            yy4Var.oh(address, pointType);
        } else {
            ny61.g("Required value was null.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tpr createSuggestMenuPayload$lambda$4(CompositeAddressSearchView compositeAddressSearchView, x9v0 x9v0Var) {
        yy4 yy4Var = compositeAddressSearchView.presenter;
        PointType pointType = compositeAddressSearchView.activePoint;
        if (pointType != null) {
            return yy4Var.Rg(pointType, x9v0Var);
        }
        ny61.g("Required value was null.");
        return null;
    }

    private final void expandSuggests() {
        changeSuggestsViewState(SuggestsView.State.FULL);
    }

    private final void initInput(AddressInputComponent addressInput, PointType activePointType, PointType inputPointType, String color) {
        boolean z = activePointType == inputPointType;
        BaseAddressSearchView.setupAddressInput$default(this, addressInput, inputPointType == PointType.SOURCE, z, z && this.canPointOnMap, color, null, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initInputs() {
        PointType pointType = this.activePoint;
        if (pointType == null) {
            ny61.g("Required value was null.");
        } else {
            initInput(this.sourceInput, pointType, PointType.SOURCE, this.pinStyles.a.c);
            initInput(this.destinationInput, pointType, PointType.DESTINATION, this.pinStyles.b.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFocusChange(boolean hasFocus, PointType pointType) {
        if (hasFocus) {
            mvpView().setActivePoint(pointType);
            this.presenter.ih(pointType);
        }
        this.presenter.lh();
    }

    private final void removeInputListeners() {
        SourceDestinationComponentV2 sourceDestinationComponentV2 = this.sourceDestinationHolder.a;
        sourceDestinationComponentV2.removeOnSourceTextChangeListener();
        sourceDestinationComponentV2.removeOnDestinationTextChangeListener();
        SourceDestinationComponentV2 sourceDestinationComponentV22 = this.sourceDestinationHolder.a;
        sourceDestinationComponentV22.setSourceOnEditorActionListener(null);
        sourceDestinationComponentV22.setDestinationOnEditorActionListener(null);
        SourceDestinationComponentV2 sourceDestinationComponentV23 = this.sourceDestinationHolder.a;
        sourceDestinationComponentV23.setSourceOnCloseOnKeyboardCloseListener(null);
        sourceDestinationComponentV23.setSourceOnCloseOnKeyboardCloseListener(null);
        SourceDestinationComponentV2 sourceDestinationComponentV24 = this.sourceDestinationHolder.a;
        sourceDestinationComponentV24.setOnSourceClearListener(null);
        sourceDestinationComponentV24.setOnDestinationClearListener(null);
        SourceDestinationComponentV2 sourceDestinationComponentV25 = this.sourceDestinationHolder.a;
        sourceDestinationComponentV25.setOnSourceButtonClickListener(null);
        sourceDestinationComponentV25.setOnDestinationButtonClickListener(null);
    }

    private final void requestInputFocus() {
        if (this.sourceDestinationType != SourceDestinationType.NEWBIES) {
            if (this.activePoint == PointType.DESTINATION) {
                this.destinationInput.requestFocus();
                return;
            } else {
                this.sourceInput.requestFocus();
                return;
            }
        }
        ru.yandex.taxi.search.g gVar = this.sourceDestinationHolder;
        PointType pointType = this.activePoint;
        if (pointType != null) {
            gVar.d(pointType);
        } else {
            ny61.g("Required value was null.");
        }
    }

    private final void requestPendingFocusIfNeed() {
        if (this.presenter.Ug()) {
            return;
        }
        if (this.pendingFocusRequestPointType == null) {
            this.pendingFocusRequestPointType = this.activePoint;
        }
        if (this.sourceDestinationType == SourceDestinationType.NEWBIES) {
            ru.yandex.taxi.search.g gVar = this.sourceDestinationHolder;
            PointType pointType = this.pendingFocusRequestPointType;
            if (pointType == null) {
                ny61.g("Required value was null.");
                return;
            }
            gVar.d(pointType);
        } else {
            PointType pointType2 = this.pendingFocusRequestPointType;
            int i = pointType2 == null ? -1 : ijd.a[pointType2.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    this.destinationInput.requestFocus();
                } else {
                    if (i != 2) {
                        w511.b();
                        return;
                    }
                    this.sourceInput.requestFocus();
                }
            }
        }
        this.pendingFocusRequestPointType = null;
    }

    private final void setInputListeners() {
        final ru.yandex.taxi.search.g gVar = this.sourceDestinationHolder;
        final int i = 0;
        final ejd ejdVar = new ejd(this, i);
        final tbb tbbVar = new tbb(5, this);
        SourceDestinationComponentV2 sourceDestinationComponentV2 = gVar.a;
        sourceDestinationComponentV2.setOnSourceTextChangeListener(new bms() { // from class: ect0
            @Override // defpackage.bms
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                String obj5;
                int i2 = i;
                zy11 zy11Var = zy11.a;
                tbb tbbVar2 = tbbVar;
                ejd ejdVar2 = ejdVar;
                g gVar2 = gVar;
                CharSequence charSequence = (CharSequence) obj;
                ((Integer) obj2).getClass();
                int intValue = ((Integer) obj3).intValue();
                ((Integer) obj4).getClass();
                switch (i2) {
                    case 0:
                        PointType pointType = PointType.SOURCE;
                        gVar2.e(pointType, String.valueOf(charSequence));
                        if (intValue > 0 && (charSequence == null || charSequence.length() == 0)) {
                            ejdVar2.invoke();
                        }
                        obj5 = charSequence != null ? charSequence.toString() : null;
                        tbbVar2.invoke(pointType, obj5 != null ? obj5 : "");
                        break;
                    default:
                        PointType pointType2 = PointType.DESTINATION;
                        gVar2.e(pointType2, String.valueOf(charSequence));
                        if (intValue > 0 && (charSequence == null || charSequence.length() == 0)) {
                            ejdVar2.invoke();
                        }
                        obj5 = charSequence != null ? charSequence.toString() : null;
                        tbbVar2.invoke(pointType2, obj5 != null ? obj5 : "");
                        break;
                }
                return zy11Var;
            }
        });
        final int i2 = 1;
        sourceDestinationComponentV2.setOnDestinationTextChangeListener(new bms() { // from class: ect0
            @Override // defpackage.bms
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                String obj5;
                int i22 = i2;
                zy11 zy11Var = zy11.a;
                tbb tbbVar2 = tbbVar;
                ejd ejdVar2 = ejdVar;
                g gVar2 = gVar;
                CharSequence charSequence = (CharSequence) obj;
                ((Integer) obj2).getClass();
                int intValue = ((Integer) obj3).intValue();
                ((Integer) obj4).getClass();
                switch (i22) {
                    case 0:
                        PointType pointType = PointType.SOURCE;
                        gVar2.e(pointType, String.valueOf(charSequence));
                        if (intValue > 0 && (charSequence == null || charSequence.length() == 0)) {
                            ejdVar2.invoke();
                        }
                        obj5 = charSequence != null ? charSequence.toString() : null;
                        tbbVar2.invoke(pointType, obj5 != null ? obj5 : "");
                        break;
                    default:
                        PointType pointType2 = PointType.DESTINATION;
                        gVar2.e(pointType2, String.valueOf(charSequence));
                        if (intValue > 0 && (charSequence == null || charSequence.length() == 0)) {
                            ejdVar2.invoke();
                        }
                        obj5 = charSequence != null ? charSequence.toString() : null;
                        tbbVar2.invoke(pointType2, obj5 != null ? obj5 : "");
                        break;
                }
                return zy11Var;
            }
        });
        ru.yandex.taxi.search.g gVar2 = this.sourceDestinationHolder;
        TextView.OnEditorActionListener editorActionListener = getEditorActionListener();
        SourceDestinationComponentV2 sourceDestinationComponentV22 = gVar2.a;
        sourceDestinationComponentV22.setSourceOnEditorActionListener(editorActionListener);
        sourceDestinationComponentV22.setDestinationOnEditorActionListener(editorActionListener);
        ru.yandex.taxi.search.g gVar3 = this.sourceDestinationHolder;
        Runnable runnable = new Runnable(this) { // from class: djd
            public final /* synthetic */ CompositeAddressSearchView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                CompositeAddressSearchView compositeAddressSearchView = this.b;
                switch (i3) {
                    case 0:
                        compositeAddressSearchView.onPointOnMapClicked();
                        break;
                    case 1:
                        compositeAddressSearchView.closeKeyboard();
                        break;
                    default:
                        compositeAddressSearchView.onClearFilterClicked(true);
                        break;
                }
            }
        };
        SourceDestinationComponentV2 sourceDestinationComponentV23 = gVar3.a;
        sourceDestinationComponentV23.setSourceOnCloseOnKeyboardCloseListener(new mw0(8, runnable));
        sourceDestinationComponentV23.setSourceOnCloseOnKeyboardCloseListener(new mw0(9, runnable));
        ru.yandex.taxi.search.g gVar4 = this.sourceDestinationHolder;
        final int i3 = 2;
        Runnable runnable2 = new Runnable(this) { // from class: djd
            public final /* synthetic */ CompositeAddressSearchView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i32 = i3;
                CompositeAddressSearchView compositeAddressSearchView = this.b;
                switch (i32) {
                    case 0:
                        compositeAddressSearchView.onPointOnMapClicked();
                        break;
                    case 1:
                        compositeAddressSearchView.closeKeyboard();
                        break;
                    default:
                        compositeAddressSearchView.onClearFilterClicked(true);
                        break;
                }
            }
        };
        SourceDestinationComponentV2 sourceDestinationComponentV24 = gVar4.a;
        sourceDestinationComponentV24.setOnSourceClearListener(new mw0(10, runnable2));
        sourceDestinationComponentV24.setOnDestinationClearListener(new mw0(11, runnable2));
        ru.yandex.taxi.search.g gVar5 = this.sourceDestinationHolder;
        Runnable runnable3 = new Runnable(this) { // from class: djd
            public final /* synthetic */ CompositeAddressSearchView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i32 = i;
                CompositeAddressSearchView compositeAddressSearchView = this.b;
                switch (i32) {
                    case 0:
                        compositeAddressSearchView.onPointOnMapClicked();
                        break;
                    case 1:
                        compositeAddressSearchView.closeKeyboard();
                        break;
                    default:
                        compositeAddressSearchView.onClearFilterClicked(true);
                        break;
                }
            }
        };
        SourceDestinationComponentV2 sourceDestinationComponentV25 = gVar5.a;
        sourceDestinationComponentV25.setOnSourceButtonClickListener(new mw0(6, runnable3));
        sourceDestinationComponentV25.setOnDestinationButtonClickListener(new mw0(7, runnable3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setInputListeners$lambda$0(CompositeAddressSearchView compositeAddressSearchView) {
        compositeAddressSearchView.onTextCleared();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setInputListeners$lambda$1(CompositeAddressSearchView compositeAddressSearchView, PointType pointType, String str) {
        compositeAddressSearchView.presenter.Qg(pointType, str);
        return zy11.a;
    }

    private final void setSourceDestinationWithCirclePinsVisibility(boolean visible) {
        getAddressInputShadow().setVisibility(visible ? 0 : 8);
        this.sourceInput.setVisibility(visible ? 0 : 8);
        this.destinationInput.setVisibility(visible ? 0 : 8);
        this.destinationInput.setDividers(DividerPosition.TOP, DividerType.ICON_HALF_MARGIN);
        boolean z = visible && this.activePoint == PointType.DESTINATION;
        this.sourceFocusCatcher.setVisibility(z ? 0 : 8);
        boolean z2 = visible && this.activePoint == PointType.SOURCE;
        this.destinationFocusCatcher.setVisibility(z2 ? 0 : 8);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getAddressInputShadow().getLayoutParams();
        layoutParams.addRule(6, bhh0.source_address_input);
        layoutParams.addRule(8, bhh0.destination_address_input);
        this.sourceFocusCatcher.setVisibility(z ? 0 : 8);
        this.destinationFocusCatcher.setVisibility(z2 ? 0 : 8);
    }

    public final View activeInput() {
        if (this.sourceDestinationType != SourceDestinationType.NEWBIES) {
            return this.activePoint == PointType.DESTINATION ? this.destinationInput : this.sourceInput;
        }
        ru.yandex.taxi.search.g gVar = this.sourceDestinationHolder;
        PointType pointType = this.activePoint;
        if (pointType != null) {
            return gVar.a(pointType);
        }
        ny61.g("Required value was null.");
        return null;
    }

    public final PointType activePoint() {
        PointType pointType = this.activePoint;
        if (pointType != null) {
            return pointType;
        }
        ny61.g("Required value was null.");
        return null;
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    public final void applyProcessingState(ModalViewProcessing$ProcessingState processingState) {
        this.presenter.Kg(processingState);
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        getAddressInputShadow().setBackgroundTintList(ColorStateList.valueOf(qje.t(xng0.bgMain, getContext())));
        this.sourceDestinationHolder.a.applyTheme(themeType);
        if (this.activePoint != null) {
            initInputs();
        }
        this.presenter.sh(this.isAddressMinorBackground);
    }

    @Override // defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void closeKeyboard() {
        PointType pointType;
        if (this.sourceDestinationType != SourceDestinationType.NEWBIES || (pointType = this.activePoint) == null) {
            closeKeyboard(activeInput());
            return;
        }
        SourceDestinationComponentV2 sourceDestinationComponentV2 = this.sourceDestinationHolder.a;
        int i = gct0.a[pointType.ordinal()];
        if (i == 1) {
            sourceDestinationComponentV2.closeSourceKeyboard();
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            sourceDestinationComponentV2.closeDestinationKeyboard();
        }
        onKeyboardClosed();
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void filterChanged(String text) {
        PointType pointType = this.activePoint;
        if (pointType != null) {
            this.presenter.Qg(pointType, text);
        }
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public int getContentViewLayoutRes() {
        return zph0.address_search_composite_view;
    }

    public final String getFilter(PointType pointType) {
        return mvpView().q8(pointType);
    }

    public final ModalViewProcessing$ProcessingState getProcessingState() {
        return this.presenter.Sg();
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public boolean inputHasFocus() {
        return this.sourceDestinationType == SourceDestinationType.NEWBIES ? this.sourceDestinationHolder.c(null) : this.sourceInput.hasFocus() || this.destinationInput.hasFocus();
    }

    public final void invalidateActivePoint() {
        this.presenter.Vg(mvpView());
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onAdditionalItemSelected(yn0 actionViewModel, String id, String idType, Events$Suggest$ZeroSuggestAdditionalTapArea area) {
        yy4 yy4Var = this.presenter;
        PointType pointType = this.activePoint;
        if (pointType != null) {
            yy4Var.Yg(actionViewModel, id, idType, area, pointType);
        } else {
            ny61.g("Required value was null.");
        }
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onAdditionalItemShow(String id, String idType) {
        yy4 yy4Var = this.presenter;
        PointType pointType = this.activePoint;
        if (pointType != null) {
            yy4Var.Zg(id, idType, pointType);
        } else {
            ny61.g("Required value was null.");
        }
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        suggestsViewField().setPerformanceCallback(new gyc(this));
        int i = 0;
        checkSourceDestinationType(false);
        ru.yandex.taxi.design.utils.c.z(new CompositeAddressSearchView$onAttachedToWindow$2(0, this.sourceInput, AddressInputComponent.class, "requestFocus", "requestFocus()Z", 8), this.sourceFocusCatcher);
        yy4 yy4Var = this.presenter;
        d dVar = this.mvpView;
        PointType pointType = this.activePoint;
        if (pointType == null) {
            ny61.g("Required value was null.");
            return;
        }
        yy4Var.Mg(dVar, pointType);
        setActiveInputListeners(activeAddressInput());
        setInputListeners();
        tje.N(getMainScope(), null, null, new CompositeAddressSearchView$onAttachedToWindow$$inlined$collectIn$1(this.sourceInput.textFocusFlow(), null, this), 3);
        tje.N(getMainScope(), null, null, new CompositeAddressSearchView$onAttachedToWindow$$inlined$collectIn$2(this.destinationInput.textFocusFlow(), null, this), 3);
        ru.yandex.taxi.search.g gVar = this.sourceDestinationHolder;
        gVar.a.setOnSourceFocusChangedListener(new fct0(gVar, createOnFocusChangeListenerV2(PointType.SOURCE), i));
        ru.yandex.taxi.search.g gVar2 = this.sourceDestinationHolder;
        gVar2.a.setOnDestinationFocusChangedListener(new fct0(gVar2, createOnFocusChangeListenerV2(PointType.DESTINATION), 1));
        this.presenter.sh(this.isAddressMinorBackground);
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onClearFilterClicked(boolean clearDestinationOnDismiss) {
        yy4 yy4Var = this.presenter;
        PointType pointType = this.activePoint;
        if (pointType != null) {
            yy4Var.Ng(pointType, clearDestinationOnDismiss);
        } else {
            ny61.g("Required value was null.");
        }
    }

    public final void onCollapse(ModalViewProcessing$ProcessingState processingState, boolean minimized, boolean isMovedByUser) {
        collapseSuggests();
        this.presenter.bh(mvpView(), processingState, minimized, isMovedByUser);
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q91 q91Var = this.addressesListPerfCallback;
        View.OnFocusChangeListener onFocusChangeListener = null;
        if (q91Var != null) {
            com.yandex.go.address.search.perf.b bVar = (com.yandex.go.address.search.perf.b) q91Var;
            xvz.B(bVar.e.b, bVar);
            cfs cfsVar = bVar.f;
            if (cfsVar != null) {
                cfsVar.a();
            }
            bVar.f = null;
            bVar.g.b();
            bVar.h = null;
            bVar.i = null;
            bVar.j.clear();
        }
        suggestsViewField().setPerformanceCallback(null);
        removeActiveInputListeners(activeAddressInput());
        this.presenter.Cg();
        this.sourceFocusCatcher.setOnClickListener(null);
        this.destinationFocusCatcher.setOnClickListener(null);
        this.destinationInput.setOnClickListener(null);
        removeInputListeners();
        ru.yandex.taxi.search.g gVar = this.sourceDestinationHolder;
        hbp0 hbp0Var = gVar.d;
        SourceDestinationComponentV2 sourceDestinationComponentV2 = gVar.a;
        hbp0Var.b();
        sourceDestinationComponentV2.setOnSourceFocusChangedListener(new fct0(gVar, onFocusChangeListener, 0));
        sourceDestinationComponentV2.setOnDestinationFocusChangedListener(new fct0(gVar, onFocusChangeListener, 1));
        this.sourceInput.clearFocus();
        this.destinationInput.clearFocus();
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onDismiss() {
        this.mvpView.h(null);
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onDotsClicked(x9v0 model) {
        this.presenter.hh(createSuggestMenuPayload(EntryPoint.DOTS, model));
    }

    public final void onExpand(MainScreenAnalyticsScreenMode screenMode, boolean addressSearchVisible) {
        expandSuggests();
        this.presenter.eh(this.clickOnAddress, screenMode, addressSearchVisible);
        this.clickOnAddress = false;
        requestPendingFocusIfNeed();
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onHideKeyboard() {
        yy4 yy4Var = this.presenter;
        PointType pointType = this.activePoint;
        if (pointType != null) {
            yy4Var.Tg(pointType);
        } else {
            ny61.g("Required value was null.");
        }
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onItemEntranceClicked(x9v0 model) {
        yy4 yy4Var = this.presenter;
        PointType pointType = this.activePoint;
        if (pointType != null) {
            yy4Var.fh(pointType, model);
        } else {
            ny61.g("Required value was null.");
        }
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onItemSelected(x9v0 model) {
        yy4 yy4Var = this.presenter;
        PointType pointType = this.activePoint;
        if (pointType != null) {
            yy4Var.gh(pointType, model);
        } else {
            ny61.g("Required value was null.");
        }
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onItemSelectedLongTap(x9v0 model) {
        this.presenter.hh(createSuggestMenuPayload(EntryPoint.LONG_TAP, model));
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onKeyboardSearchClicked() {
        yy4 yy4Var = this.presenter;
        PointType pointType = this.activePoint;
        if (pointType != null) {
            yy4Var.Xg(pointType);
        } else {
            ny61.g("Required value was null.");
        }
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onParentDismiss() {
        this.presenter.onDismiss();
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onParentDismissManually() {
        this.presenter.ch();
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onPause() {
        this.presenter.pause();
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onPointOnMapClicked() {
        yy4 yy4Var = this.presenter;
        PointType pointType = this.activePoint;
        if (pointType != null) {
            yy4Var.ph(pointType);
        } else {
            ny61.g("Required value was null.");
        }
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onResume() {
        this.presenter.resume();
    }

    public final void onRouteConfirmed() {
        this.presenter.Og(mvpView());
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onScrollToBottom(int itemsCount) {
        yy4 yy4Var = this.presenter;
        PointType pointType = this.activePoint;
        if (pointType != null) {
            yy4Var.jh(pointType, itemsCount);
        } else {
            ny61.g("Required value was null.");
        }
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onSearchAgain() {
        PointType pointType = this.activePoint;
        if (pointType != null) {
            this.presenter.rh(pointType);
        }
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onShowKeyboard() {
        yy4 yy4Var = this.presenter;
        PointType pointType = this.activePoint;
        if (pointType != null) {
            yy4Var.th(pointType);
        } else {
            ny61.g("Required value was null.");
        }
    }

    public final void onSourceAddressChanged(Address sourceAddress) {
        this.presenter.kh(sourceAddress);
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onTextCleared() {
        PointType pointType = this.activePoint;
        if (pointType != null) {
            this.presenter.mh(pointType);
        }
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onTouchOutside() {
        yy4 yy4Var = this.presenter;
        PointType pointType = this.activePoint;
        if (pointType != null) {
            yy4Var.ah(pointType);
        } else {
            ny61.g("Required value was null.");
        }
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onTrailAction(k8v0 action) {
        this.presenter.bc(action);
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onTrailButtonBind(k8v0 action) {
        this.presenter.s7(action);
    }

    public final void onUpdateOffsets() {
        this.presenter.nh();
    }

    public final void processDeeplink(Uri deeplink) {
        this.presenter.qh(deeplink);
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void requestActiveInputViewFocus() {
        activeInput().requestFocus();
    }

    public final void setActivePoint(PointType pointType, boolean requestFocusIfRequired) {
        PointType pointType2 = this.activePoint;
        if (pointType2 == pointType) {
            return;
        }
        if (pointType2 != null) {
            activeFocusCatcher().setVisibility(8);
            removeActiveInputListeners(activeAddressInput());
            yy4 yy4Var = this.presenter;
            PointType pointType3 = this.activePoint;
            if (pointType3 == null) {
                ny61.g("Required value was null.");
                return;
            }
            yy4Var.Pg(pointType3);
        }
        this.activePoint = pointType;
        initInputs();
        OneShotPreDrawListener.add(this, new e(this, requestFocusIfRequired));
        if (this.presenter.Wg()) {
            return;
        }
        activeFocusCatcher().setVisibility(0);
    }

    public final void setSuggestsListener(ex4 suggestsListener) {
        this.suggestsListener = suggestsListener;
    }

    public final void setTopSpaceAdditionalHeight(int additionalHeight) {
        ru.yandex.taxi.design.utils.c.C(tje.r(etg0.address_search_composite_top_space_height, getContext()) + additionalHeight, this.topSpace);
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public bjd mvpView() {
        return this.mvpView;
    }

    public final void onExpand(MainScreenAnalyticsScreenMode shortcutsVisible) {
        onExpand(shortcutsVisible, false);
    }

    public /* synthetic */ CompositeAddressSearchView(fjd fjdVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fjdVar);
    }
}
