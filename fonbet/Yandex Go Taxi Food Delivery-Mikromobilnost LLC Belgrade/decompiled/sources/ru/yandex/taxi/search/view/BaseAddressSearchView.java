package ru.yandex.taxi.search.view;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Selection;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.b;
import defpackage.bx4;
import defpackage.ce0;
import defpackage.cvw;
import defpackage.czo0;
import defpackage.e8v0;
import defpackage.ff2;
import defpackage.fx4;
import defpackage.hbp0;
import defpackage.i51;
import defpackage.js4;
import defpackage.k8v0;
import defpackage.kyh0;
import defpackage.l8x;
import defpackage.mh3;
import defpackage.ney;
import defpackage.pav;
import defpackage.pyv;
import defpackage.pzt0;
import defpackage.qje;
import defpackage.rp31;
import defpackage.t030;
import defpackage.tje;
import defpackage.uf4;
import defpackage.vb3;
import defpackage.w511;
import defpackage.wch0;
import defpackage.x9v0;
import defpackage.xng0;
import defpackage.yn0;
import defpackage.zw4;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.analytics.Events$Suggest$ZeroSuggestAdditionalTapArea;
import ru.yandex.taxi.design.AddressInputComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.preorder.suggested.selection.SuggestsView;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.search.view.BaseAddressSearchView;

@Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002:\fº\u0001\u0003O»\u0001¼\u0001½\u0001¾\u0001B\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\u0012H$¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H%¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH$¢\u0006\u0004\b\u0018\u0010\u000fJ\u000f\u0010\u0019\u001a\u00020\rH$¢\u0006\u0004\b\u0019\u0010\u000fJ\u000f\u0010\u001a\u001a\u00020\rH$¢\u0006\u0004\b\u001a\u0010\u000fJ\u000f\u0010\u001b\u001a\u00020\rH$¢\u0006\u0004\b\u001b\u0010\u000fJ\u000f\u0010\u001c\u001a\u00020\rH$¢\u0006\u0004\b\u001c\u0010\u000fJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH$¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\rH$¢\u0006\u0004\b!\u0010\u000fJ\u000f\u0010\"\u001a\u00020\rH$¢\u0006\u0004\b\"\u0010\u000fJ\u000f\u0010#\u001a\u00020\rH$¢\u0006\u0004\b#\u0010\u000fJ\u000f\u0010$\u001a\u00020\rH$¢\u0006\u0004\b$\u0010\u000fJ\u0017\u0010'\u001a\u00020\r2\u0006\u0010&\u001a\u00020%H$¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\r2\u0006\u0010&\u001a\u00020%H$¢\u0006\u0004\b)\u0010(J3\u00100\u001a\u00020\r2\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010\u001d2\b\u0010-\u001a\u0004\u0018\u00010\u001d2\u0006\u0010/\u001a\u00020.H$¢\u0006\u0004\b0\u00101J#\u00102\u001a\u00020\r2\b\u0010,\u001a\u0004\u0018\u00010\u001d2\b\u0010-\u001a\u0004\u0018\u00010\u001dH$¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\r2\u0006\u0010&\u001a\u00020%H$¢\u0006\u0004\b4\u0010(J\u0017\u00107\u001a\u00020\r2\u0006\u00106\u001a\u000205H$¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\r2\u0006\u00106\u001a\u000205H$¢\u0006\u0004\b9\u00108J\u0017\u0010:\u001a\u00020\r2\u0006\u0010&\u001a\u00020%H$¢\u0006\u0004\b:\u0010(J\u0017\u0010<\u001a\u00020\r2\u0006\u0010;\u001a\u00020\u0015H$¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\rH$¢\u0006\u0004\b>\u0010\u000fJ\u0017\u0010@\u001a\u00020\r2\u0006\u0010?\u001a\u00020\nH$¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\rH$¢\u0006\u0004\bB\u0010\u000fJ\u000f\u0010C\u001a\u00020\rH&¢\u0006\u0004\bC\u0010\u000fJ\u000f\u0010D\u001a\u00020\nH$¢\u0006\u0004\bD\u0010\fJ\u000f\u0010E\u001a\u00020\rH$¢\u0006\u0004\bE\u0010\u000fJ\u000f\u0010F\u001a\u00020\rH\u0014¢\u0006\u0004\bF\u0010\u000fJ\u000f\u0010G\u001a\u00020\rH$¢\u0006\u0004\bG\u0010\u000fJ\u000f\u0010H\u001a\u00020\rH\u0014¢\u0006\u0004\bH\u0010\u000fJ\u0017\u0010K\u001a\u00020\r2\u0006\u0010J\u001a\u00020IH\u0004¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\rH\u0004¢\u0006\u0004\bM\u0010\u000fJ\u000f\u0010N\u001a\u00020\rH\u0004¢\u0006\u0004\bN\u0010\u000fJ\u0017\u0010Q\u001a\u00020\r2\b\u0010P\u001a\u0004\u0018\u00010O¢\u0006\u0004\bQ\u0010RJ\u0015\u0010\"\u001a\u00020\r2\u0006\u0010T\u001a\u00020S¢\u0006\u0004\b\"\u0010UJ\r\u0010V\u001a\u00020\r¢\u0006\u0004\bV\u0010\u000fJ\u0017\u0010Y\u001a\u00020\r2\u0006\u0010X\u001a\u00020WH\u0004¢\u0006\u0004\bY\u0010ZJ\u0017\u0010]\u001a\u00020\r2\u0006\u0010\\\u001a\u00020[H\u0004¢\u0006\u0004\b]\u0010^J\u0017\u0010`\u001a\u00020\r2\u0006\u0010T\u001a\u00020_H\u0004¢\u0006\u0004\b`\u0010aJ\u001f\u0010`\u001a\u00020\r2\u0006\u0010T\u001a\u00020_2\u0006\u0010?\u001a\u00020\nH\u0004¢\u0006\u0004\b`\u0010bJ\u0017\u0010c\u001a\u00020\r2\u0006\u0010T\u001a\u00020_H\u0004¢\u0006\u0004\bc\u0010aJ;\u0010h\u001a\u00020\r2\u0006\u0010T\u001a\u00020_2\u0006\u0010d\u001a\u00020\n2\u0006\u0010e\u001a\u00020\n2\u0006\u0010f\u001a\u00020\n2\n\b\u0002\u0010g\u001a\u0004\u0018\u00010SH\u0004¢\u0006\u0004\bh\u0010iJE\u0010h\u001a\u00020\r2\u0006\u0010T\u001a\u00020_2\u0006\u0010d\u001a\u00020\n2\u0006\u0010e\u001a\u00020\n2\u0006\u0010f\u001a\u00020\n2\b\u0010j\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010g\u001a\u0004\u0018\u00010SH\u0004¢\u0006\u0004\bh\u0010kJ\u001f\u0010m\u001a\u00020\r2\u0006\u0010T\u001a\u00020_2\u0006\u0010l\u001a\u00020\u001dH\u0004¢\u0006\u0004\bm\u0010nJ\u0019\u0010o\u001a\u0004\u0018\u00010\u001d2\u0006\u0010T\u001a\u00020_H\u0004¢\u0006\u0004\bo\u0010pJ#\u0010t\u001a\u0004\u0018\u00010s2\u0006\u0010q\u001a\u00020S2\b\b\u0001\u0010r\u001a\u00020\u0015H\u0002¢\u0006\u0004\bt\u0010uJ!\u0010v\u001a\u00020\r2\u0006\u0010q\u001a\u00020S2\b\b\u0001\u0010r\u001a\u00020\u0015H\u0002¢\u0006\u0004\bv\u0010wJ1\u0010x\u001a\u00020\r2\u0006\u0010T\u001a\u00020_2\u0006\u0010d\u001a\u00020\n2\u0006\u0010e\u001a\u00020\n2\b\u0010j\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\bx\u0010yJ\u001f\u0010z\u001a\u00020\r2\u0006\u0010T\u001a\u00020_2\u0006\u0010f\u001a\u00020\nH\u0002¢\u0006\u0004\bz\u0010bR\u001a\u0010|\u001a\u00020{8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007fR\u0018\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001e\u0010\u0086\u0001\u001a\u00020\u00078\u0005X\u0084\u0004¢\u0006\u000f\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0005\b\u0088\u0001\u0010\tR\u001f\u0010\u0089\u0001\u001a\u00020S8\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R \u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001f\u0010\u0092\u0001\u001a\u00020S8\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u008a\u0001\u001a\u0006\b\u0093\u0001\u0010\u008c\u0001R\u001c\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0094\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0019\u0010\u0097\u0001\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R*\u0010\u009a\u0001\u001a\u00030\u0099\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R*\u0010 \u0001\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0005\b¤\u0001\u0010 R*\u0010¥\u0001\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¥\u0001\u0010¡\u0001\u001a\u0006\b¦\u0001\u0010£\u0001\"\u0005\b§\u0001\u0010 R \u0010©\u0001\u001a\u00030¨\u00018\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001R\u0019\u0010P\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bP\u0010\u00ad\u0001R,\u0010¯\u0001\u001a\u0005\u0018\u00010®\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001\"\u0006\b³\u0001\u0010´\u0001R\u0018\u0010¶\u0001\u001a\u00030µ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u0014\u0010¹\u0001\u001a\u00020S8F¢\u0006\b\u001a\u0006\b¸\u0001\u0010\u008c\u0001¨\u0006¿\u0001"}, d2 = {"Lru/yandex/taxi/search/view/BaseAddressSearchView;", CA20Status.STATUS_CERTIFICATE_V, "Landroid/widget/FrameLayout;", "Lzw4;", "builder", "<init>", "(Lzw4;)V", "Lru/yandex/taxi/preorder/suggested/selection/SuggestsView;", "getSuggestsView", "()Lru/yandex/taxi/preorder/suggested/selection/SuggestsView;", "", "insetsHelperHasInputFocus", "()Z", "Lzy11;", "insetsHelperNotifyKeyboardShown", "()V", "insetsHelperNotifyKeyboardHidden", "searchModalCloseKeyboard", "Li51;", "mvpView", "()Li51;", "", "getContentViewLayoutRes", "()I", "onResume", "onPause", "onParentDismiss", "onParentDismissManually", "onTextCleared", "", "text", "filterChanged", "(Ljava/lang/String;)V", "onSearchAgain", "closeKeyboard", "onShowKeyboard", "onHideKeyboard", "Lx9v0;", "model", "onItemSelected", "(Lx9v0;)V", "onItemSelectedLongTap", "Lyn0;", "actionViewModel", "id", "idType", "Lru/yandex/taxi/analytics/Events$Suggest$ZeroSuggestAdditionalTapArea;", "area", "onAdditionalItemSelected", "(Lyn0;Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/analytics/Events$Suggest$ZeroSuggestAdditionalTapArea;)V", "onAdditionalItemShow", "(Ljava/lang/String;Ljava/lang/String;)V", "onDotsClicked", "Lk8v0;", "action", "onTrailAction", "(Lk8v0;)V", "onTrailButtonBind", "onItemEntranceClicked", "itemsCount", "onScrollToBottom", "(I)V", "onKeyboardSearchClicked", "clearDestinationOnDismiss", "onClearFilterClicked", "(Z)V", "onPointOnMapClicked", "onTouchOutside", "inputHasFocus", "onDismiss", "onAttachedToWindow", "requestActiveInputViewFocus", "onDetachedFromWindow", "Landroid/graphics/drawable/Drawable;", "inputBg", "updateInputBackground", "(Landroid/graphics/drawable/Drawable;)V", "doCollapse", "doExpand", "Lbx4;", "onKeyboardListener", "setOnKeyboardListener", "(Lbx4;)V", "Landroid/view/View;", "addressInput", "(Landroid/view/View;)V", "onKeyboardClosed", "Lru/yandex/taxi/preorder/suggested/selection/SuggestsView$State;", ClidProvider.STATE, "changeSuggestsViewState", "(Lru/yandex/taxi/preorder/suggested/selection/SuggestsView$State;)V", "Lru/yandex/taxi/search/address/view/PointType;", "pointType", "changePointType", "(Lru/yandex/taxi/search/address/view/PointType;)V", "Lru/yandex/taxi/design/AddressInputComponent;", "setActiveInputListeners", "(Lru/yandex/taxi/design/AddressInputComponent;)V", "(Lru/yandex/taxi/design/AddressInputComponent;Z)V", "removeActiveInputListeners", "isSourcePoint", "isActive", "canPointOnMap", "trailView", "setupAddressInput", "(Lru/yandex/taxi/design/AddressInputComponent;ZZZLandroid/view/View;)V", "color", "(Lru/yandex/taxi/design/AddressInputComponent;ZZZLjava/lang/String;Landroid/view/View;)V", "filter", "setFilter", "(Lru/yandex/taxi/design/AddressInputComponent;Ljava/lang/String;)V", "getFilter", "(Lru/yandex/taxi/design/AddressInputComponent;)Ljava/lang/String;", "view", "tagId", "Ll8x;", "getJobFromViewTag", "(Landroid/view/View;I)Ll8x;", "unsubscribe", "(Landroid/view/View;I)V", "setupLeadImage", "(Lru/yandex/taxi/design/AddressInputComponent;ZZLjava/lang/String;)V", "setupMapRelatedTail", "Lhbp0;", "mainScope", "Lhbp0;", "getMainScope", "()Lhbp0;", "Lney;", "lifecycleObservable", "Lney;", "Lpyv;", "drawableFactory", "Lpyv;", "suggestsView", "Lru/yandex/taxi/preorder/suggested/selection/SuggestsView;", "suggestsViewField", "suggestsProgressView", "Landroid/view/View;", "getSuggestsProgressView", "()Landroid/view/View;", "Landroid/view/ViewStub;", "emptyOrDefaultMessageViewStub", "Landroid/view/ViewStub;", "getEmptyOrDefaultMessageViewStub", "()Landroid/view/ViewStub;", "addressInputShadow", "getAddressInputShadow", "Landroid/widget/TextView;", "emptyOrDefaultMessageView", "Landroid/widget/TextView;", "suggestsViewState", "Lru/yandex/taxi/preorder/suggested/selection/SuggestsView$State;", "Lpav;", "imageLoader", "Lpav;", "getImageLoader", "()Lpav;", "setImageLoader", "(Lpav;)V", "notFoundMessageText", "Ljava/lang/String;", "getNotFoundMessageText", "()Ljava/lang/String;", "setNotFoundMessageText", "defaultMessageText", "getDefaultMessageText", "setDefaultMessageText", "Landroid/widget/TextView$OnEditorActionListener;", "editorActionListener", "Landroid/widget/TextView$OnEditorActionListener;", "getEditorActionListener", "()Landroid/widget/TextView$OnEditorActionListener;", "Lbx4;", "Lt030;", "modalViewCompatibleDelegate", "Lt030;", "getModalViewCompatibleDelegate", "()Lt030;", "setModalViewCompatibleDelegate", "(Lt030;)V", "Le8v0;", "suggestScrollKeyboardVisibilityExperimentRepository", "Le8v0;", "getSearchModalInputShadow", "searchModalInputShadow", "yw4", "ax4", "cx4", "dx4", "ex4", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseAddressSearchView<V extends BaseAddressSearchView<V>> extends FrameLayout {
    private final View addressInputShadow;
    private String defaultMessageText;
    private final pyv drawableFactory;
    private final TextView.OnEditorActionListener editorActionListener;
    private TextView emptyOrDefaultMessageView;
    private final ViewStub emptyOrDefaultMessageViewStub;
    private pav imageLoader;
    private final ney lifecycleObservable;
    private final hbp0 mainScope;
    private t030 modalViewCompatibleDelegate;
    private String notFoundMessageText;
    private bx4 onKeyboardListener;
    private final e8v0 suggestScrollKeyboardVisibilityExperimentRepository;
    private final View suggestsProgressView;
    private final SuggestsView suggestsView;
    private SuggestsView.State suggestsViewState;

    public BaseAddressSearchView(zw4 zw4Var) {
        super(zw4Var.a);
        this.mainScope = new hbp0(new czo0(14), "", null);
        this.suggestsViewState = SuggestsView.State.FULL;
        this.editorActionListener = new ff2(1, this);
        c.q(this, getContentViewLayoutRes(), true);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.lifecycleObservable = zw4Var.b;
        this.drawableFactory = zw4Var.c;
        pav pavVar = zw4Var.d;
        this.imageLoader = pavVar;
        int i = wch0.suggests_view;
        WeakHashMap weakHashMap = b.a;
        SuggestsView suggestsView = (SuggestsView) ((View) rp31.d(this, i));
        this.suggestsView = suggestsView;
        suggestsView.initSuggestAdapter(pavVar, zw4Var.e, zw4Var.f);
        this.suggestsProgressView = (View) rp31.d(this, wch0.suggests_progress);
        this.emptyOrDefaultMessageViewStub = (ViewStub) ((View) rp31.d(this, wch0.empty_message_stub));
        this.addressInputShadow = (View) rp31.d(this, wch0.address_input_shadow);
        this.notFoundMessageText = zw4Var.h;
        this.defaultMessageText = zw4Var.i;
        this.suggestScrollKeyboardVisibilityExperimentRepository = zw4Var.g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean editorActionListener$lambda$0(BaseAddressSearchView baseAddressSearchView, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        baseAddressSearchView.onKeyboardSearchClicked();
        baseAddressSearchView.closeKeyboard();
        return false;
    }

    private final l8x getJobFromViewTag(View view, int tagId) {
        Object tag = view.getTag(tagId);
        if (tag instanceof l8x) {
            return (l8x) tag;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setActiveInputListeners$lambda$4(AddressInputComponent addressInputComponent, BaseAddressSearchView baseAddressSearchView, boolean z) {
        addressInputComponent.requestFocus();
        baseAddressSearchView.onClearFilterClicked(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setActiveInputListeners$lambda$5(AddressInputComponent addressInputComponent, BaseAddressSearchView baseAddressSearchView) {
        addressInputComponent.setEnabled(false);
        baseAddressSearchView.onPointOnMapClicked();
    }

    public static /* synthetic */ void setupAddressInput$default(BaseAddressSearchView baseAddressSearchView, AddressInputComponent addressInputComponent, boolean z, boolean z2, boolean z3, String str, View view, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: setupAddressInput");
            return;
        }
        if ((i & 32) != 0) {
            view = null;
        }
        baseAddressSearchView.setupAddressInput(addressInputComponent, z, z2, z3, str, view);
    }

    private final void setupLeadImage(AddressInputComponent addressInput, boolean isSourcePoint, boolean isActive, String color) {
        pyv pyvVar = this.drawableFactory;
        addressInput.setLeadImage(isSourcePoint ? pyvVar.b(color, isActive) : pyvVar.a(color, isActive));
    }

    private final void setupMapRelatedTail(AddressInputComponent addressInput, boolean canPointOnMap) {
        if (!canPointOnMap) {
            addressInput.setTrailText((CharSequence) null);
            addressInput.setTrailDividerVisibility(false);
        } else {
            addressInput.setTrailText(getContext().getString(kyh0.point_on_map));
            addressInput.setTrailTextColor(qje.t(xng0.textMain, getContext()));
            addressInput.setTrailDividerVisibility(true);
        }
    }

    private final void unsubscribe(View view, int tagId) {
        l8x jobFromViewTag = getJobFromViewTag(view, tagId);
        if (jobFromViewTag != null) {
            jobFromViewTag.a(null);
        }
    }

    public final void changePointType(PointType pointType) {
        this.suggestsView.changePointType(pointType);
    }

    public final void changeSuggestsViewState(SuggestsView.State state) {
        this.suggestsViewState = state;
        this.suggestsView.changeViewState(state);
    }

    public abstract void closeKeyboard();

    public final void closeKeyboard(View addressInput) {
        if (addressInput != null) {
            addressInput.post(new ce0(addressInput, 15));
        }
        addressInput.clearFocus();
        bx4 bx4Var = this.onKeyboardListener;
        if (bx4Var != null) {
            bx4Var.a();
        }
    }

    public final void doCollapse() {
        t030 t030Var = this.modalViewCompatibleDelegate;
        if (t030Var != null) {
            t030Var.collapse();
        }
    }

    public final void doExpand() {
        t030 t030Var = this.modalViewCompatibleDelegate;
        if (t030Var != null) {
            t030Var.expand();
        }
    }

    public abstract void filterChanged(String text);

    public final View getAddressInputShadow() {
        return this.addressInputShadow;
    }

    public abstract int getContentViewLayoutRes();

    public final String getDefaultMessageText() {
        return this.defaultMessageText;
    }

    public final TextView.OnEditorActionListener getEditorActionListener() {
        return this.editorActionListener;
    }

    public final ViewStub getEmptyOrDefaultMessageViewStub() {
        return this.emptyOrDefaultMessageViewStub;
    }

    public final String getFilter(AddressInputComponent addressInput) {
        Editable address = addressInput.getAddress();
        if (address != null) {
            return address.toString();
        }
        return null;
    }

    public final pav getImageLoader() {
        return this.imageLoader;
    }

    public final hbp0 getMainScope() {
        return this.mainScope;
    }

    public final t030 getModalViewCompatibleDelegate() {
        return this.modalViewCompatibleDelegate;
    }

    public final String getNotFoundMessageText() {
        return this.notFoundMessageText;
    }

    public final View getSearchModalInputShadow() {
        return this.addressInputShadow;
    }

    public final View getSuggestsProgressView() {
        return this.suggestsProgressView;
    }

    public final SuggestsView getSuggestsView() {
        return this.suggestsView;
    }

    public abstract boolean inputHasFocus();

    public final boolean insetsHelperHasInputFocus() {
        return inputHasFocus();
    }

    public final void insetsHelperNotifyKeyboardHidden() {
        onHideKeyboard();
    }

    public final void insetsHelperNotifyKeyboardShown() {
        onShowKeyboard();
    }

    public abstract i51 mvpView();

    public abstract void onAdditionalItemSelected(yn0 actionViewModel, String id, String idType, Events$Suggest$ZeroSuggestAdditionalTapArea area);

    public abstract void onAdditionalItemShow(String id, String idType);

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mainScope.a();
        this.lifecycleObservable.a(new vb3(1, this), this);
        this.suggestsView.setAdapterCallback(new fx4(this));
    }

    public abstract void onClearFilterClicked(boolean clearDestinationOnDismiss);

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mainScope.b();
        this.suggestsView.setAdapterCallback(null);
        TextView textView = this.emptyOrDefaultMessageView;
        if (textView != null) {
            textView.setOnClickListener(null);
            textView.setClickable(false);
        }
        this.lifecycleObservable.d(this);
    }

    public abstract void onDismiss();

    public abstract void onDotsClicked(x9v0 model);

    public abstract void onHideKeyboard();

    public abstract void onItemEntranceClicked(x9v0 model);

    public abstract void onItemSelected(x9v0 model);

    public abstract void onItemSelectedLongTap(x9v0 model);

    public final void onKeyboardClosed() {
        bx4 bx4Var = this.onKeyboardListener;
        if (bx4Var != null) {
            bx4Var.a();
        }
    }

    public abstract void onKeyboardSearchClicked();

    public abstract void onParentDismiss();

    public abstract void onParentDismissManually();

    public abstract void onPause();

    public abstract void onPointOnMapClicked();

    public abstract void onResume();

    public abstract void onScrollToBottom(int itemsCount);

    public abstract void onSearchAgain();

    public abstract void onShowKeyboard();

    public abstract void onTextCleared();

    public abstract void onTouchOutside();

    public abstract void onTrailAction(k8v0 action);

    public abstract void onTrailButtonBind(k8v0 action);

    public final void removeActiveInputListeners(AddressInputComponent addressInput) {
        unsubscribe(addressInput, wch0.suggested_text_cleared_listener);
        unsubscribe(addressInput, wch0.suggested_text_changed_listener);
        addressInput.setTag(wch0.suggested_text_cleared_listener, null);
        addressInput.setTag(wch0.suggested_text_changed_listener, null);
        addressInput.setOnClearListener(null);
        addressInput.setOnTrailClickListener(null);
        addressInput.setOnEditorActionListener(null);
        addressInput.setOnKeyboardCloseListener(null);
    }

    public abstract void requestActiveInputViewFocus();

    public final void searchModalCloseKeyboard() {
        closeKeyboard();
    }

    public final void setActiveInputListeners(AddressInputComponent addressInput, boolean clearDestinationOnDismiss) {
        unsubscribe(addressInput, wch0.suggested_text_cleared_listener);
        unsubscribe(addressInput, wch0.suggested_text_changed_listener);
        pzt0 N = tje.N(this.mainScope, null, null, new BaseAddressSearchView$setActiveInputListeners$$inlined$safeCollectIn$1(addressInput.textClearedFlow(), null, this), 3);
        pzt0 N2 = tje.N(this.mainScope, null, null, new BaseAddressSearchView$setActiveInputListeners$$inlined$safeCollectIn$2(addressInput.textValueFlow(), null, this), 3);
        addressInput.setTag(wch0.suggested_text_cleared_listener, N);
        addressInput.setTag(wch0.suggested_text_changed_listener, N2);
        addressInput.setOnEditorActionListener(this.editorActionListener);
        int i = 2;
        addressInput.setOnKeyboardCloseListener(new js4(i, this));
        addressInput.setOnClearListener(new uf4(addressInput, this, clearDestinationOnDismiss, i));
        addressInput.setOnTrailClickListener(new mh3(9, addressInput, this));
    }

    public final void setDefaultMessageText(String str) {
        this.defaultMessageText = str;
    }

    public final void setFilter(AddressInputComponent addressInput, String filter) {
        addressInput.setTextWithoutNotifying(filter);
        Selection.setSelection(addressInput.getAddress(), filter.length());
    }

    public final void setImageLoader(pav pavVar) {
        this.imageLoader = pavVar;
    }

    public final void setModalViewCompatibleDelegate(t030 t030Var) {
        this.modalViewCompatibleDelegate = t030Var;
    }

    public final void setNotFoundMessageText(String str) {
        this.notFoundMessageText = str;
    }

    public final void setOnKeyboardListener(bx4 onKeyboardListener) {
        this.onKeyboardListener = onKeyboardListener;
    }

    public final void setupAddressInput(AddressInputComponent addressInput, boolean isSourcePoint, boolean isActive, boolean canPointOnMap, String color, View trailView) {
        setupLeadImage(addressInput, isSourcePoint, isActive, color);
        if (trailView != null) {
            addressInput.setTrailView(trailView);
        } else {
            setupMapRelatedTail(addressInput, canPointOnMap);
        }
    }

    public final SuggestsView suggestsViewField() {
        return this.suggestsView;
    }

    public final void updateInputBackground(Drawable inputBg) {
        cvw.e0(this.addressInputShadow, inputBg, Integer.valueOf(tje.u(10, getContext())), null, 12);
    }

    public final void setupAddressInput(AddressInputComponent addressInput, boolean isSourcePoint, boolean isActive, boolean canPointOnMap, View trailView) {
        setupAddressInput(addressInput, isSourcePoint, isActive, canPointOnMap, null, trailView);
    }

    public static /* synthetic */ void setupAddressInput$default(BaseAddressSearchView baseAddressSearchView, AddressInputComponent addressInputComponent, boolean z, boolean z2, boolean z3, View view, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: setupAddressInput");
            return;
        }
        if ((i & 16) != 0) {
            view = null;
        }
        baseAddressSearchView.setupAddressInput(addressInputComponent, z, z2, z3, view);
    }

    public final void setActiveInputListeners(AddressInputComponent addressInput) {
        setActiveInputListeners(addressInput, true);
    }
}
