package ru.yandex.taxi.search.view;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.address.models.Address;
import defpackage.adh0;
import defpackage.aph0;
import defpackage.ax4;
import defpackage.b61;
import defpackage.c61;
import defpackage.cx4;
import defpackage.d61;
import defpackage.dhj0;
import defpackage.dx4;
import defpackage.dzg0;
import defpackage.e61;
import defpackage.f51;
import defpackage.f6v0;
import defpackage.g18;
import defpackage.hks;
import defpackage.j0;
import defpackage.j61;
import defpackage.jg;
import defpackage.k4o;
import defpackage.k8v0;
import defpackage.m810;
import defpackage.mw0;
import defpackage.qje;
import defpackage.rp31;
import defpackage.s2h;
import defpackage.t6v0;
import defpackage.tpr;
import defpackage.u6v0;
import defpackage.uh6;
import defpackage.uz;
import defpackage.v6v0;
import defpackage.wch0;
import defpackage.x9v0;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.y4;
import defpackage.yn0;
import defpackage.z51;
import defpackage.zy11;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.analytics.Events$Suggest$ZeroSuggestAdditionalTapArea;
import ru.yandex.taxi.design.AddressInputComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.preorder.suggested.menu.EntryPoint;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.search.b;
import ru.yandex.taxi.search.presenter.f;
import ru.yandex.taxi.search.view.AddressSearchView;

@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u0083\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0006~\u0002\u0084\u0001\u0085\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0011\u0010\u000bJ\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001d\u0010\u000bJ\u000f\u0010\u001e\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001e\u0010\u000bJ\u000f\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010\u000bJ\u000f\u0010 \u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010\u000bJ\u000f\u0010!\u001a\u00020\tH\u0014¢\u0006\u0004\b!\u0010\u000bJ\u0017\u0010$\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\tH\u0014¢\u0006\u0004\b&\u0010\u000bJ\u000f\u0010'\u001a\u00020\tH\u0014¢\u0006\u0004\b'\u0010\u000bJ\u0017\u0010*\u001a\u00020\t2\u0006\u0010)\u001a\u00020(H\u0014¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\t2\u0006\u0010)\u001a\u00020(H\u0014¢\u0006\u0004\b,\u0010+J3\u00103\u001a\u00020\t2\u0006\u0010.\u001a\u00020-2\b\u0010/\u001a\u0004\u0018\u00010\"2\b\u00100\u001a\u0004\u0018\u00010\"2\u0006\u00102\u001a\u000201H\u0014¢\u0006\u0004\b3\u00104J#\u00105\u001a\u00020\t2\b\u0010/\u001a\u0004\u0018\u00010\"2\b\u00100\u001a\u0004\u0018\u00010\"H\u0014¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\t2\u0006\u0010)\u001a\u00020(H\u0014¢\u0006\u0004\b7\u0010+J\u0017\u0010:\u001a\u00020\t2\u0006\u00109\u001a\u000208H\u0014¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\t2\u0006\u00109\u001a\u000208H\u0014¢\u0006\u0004\b<\u0010;J\u0017\u0010=\u001a\u00020\t2\u0006\u0010)\u001a\u00020(H\u0014¢\u0006\u0004\b=\u0010+J\u0017\u0010?\u001a\u00020\t2\u0006\u0010>\u001a\u00020\u001aH\u0014¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\tH\u0014¢\u0006\u0004\bA\u0010\u000bJ\u0017\u0010D\u001a\u00020\t2\u0006\u0010C\u001a\u00020BH\u0014¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\tH\u0014¢\u0006\u0004\bF\u0010\u000bJ\u000f\u0010G\u001a\u00020BH\u0014¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\tH\u0014¢\u0006\u0004\bI\u0010\u000bJ\u000f\u0010J\u001a\u00020\tH\u0014¢\u0006\u0004\bJ\u0010\u000bJ\u000f\u0010K\u001a\u00020\tH\u0014¢\u0006\u0004\bK\u0010\u000bJ\u000f\u0010L\u001a\u00020\tH\u0016¢\u0006\u0004\bL\u0010\u000bJ\u0017\u0010N\u001a\u00020\t2\u0006\u0010M\u001a\u00020\"H\u0014¢\u0006\u0004\bN\u0010%J\u0017\u0010P\u001a\u00020\t2\u0006\u0010O\u001a\u00020\"H\u0014¢\u0006\u0004\bP\u0010%J\u0017\u0010S\u001a\u00020\t2\u0006\u0010R\u001a\u00020QH\u0014¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\tH\u0002¢\u0006\u0004\bU\u0010\u000bJ\u000f\u0010V\u001a\u00020\tH\u0002¢\u0006\u0004\bV\u0010\u000bJ\u000f\u0010W\u001a\u00020\tH\u0002¢\u0006\u0004\bW\u0010\u000bJ\u0017\u0010Z\u001a\u00020\t2\u0006\u0010Y\u001a\u00020XH\u0002¢\u0006\u0004\bZ\u0010[J\u001f\u0010^\u001a\u00020\t2\u0006\u0010\\\u001a\u00020\f2\u0006\u0010]\u001a\u00020\u001aH\u0002¢\u0006\u0004\b^\u0010_J\u001f\u0010c\u001a\u00020b2\u0006\u0010a\u001a\u00020`2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\bc\u0010dR\u0014\u0010f\u001a\u00020e8\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010i\u001a\u0004\u0018\u00010h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010l\u001a\u00020k8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010o\u001a\u00020n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010Y\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010qR\u0016\u0010r\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010t\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010sR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010sR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010uR\u0018\u0010v\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010y\u001a\u0004\u0018\u00010x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010|\u001a\u0004\u0018\u00010{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0018\u0010\u0007\u001a\u00060~R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u007fR\u001a\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001¨\u0006\u0086\u0001"}, d2 = {"Lru/yandex/taxi/search/view/AddressSearchView;", "Lru/yandex/taxi/search/view/BaseAddressSearchView;", "Lb61;", "builder", "<init>", "(Lb61;)V", "Lj61;", "mvpView", "()Lj61;", "Lzy11;", "onAttachedToWindow", "()V", "Landroid/view/View;", "bottomShadowView", "addShadowScrollListener", "(Landroid/view/View;)V", "requestActiveInputViewFocus", "onDetachedFromWindow", "Lax4;", "onAddressPickedListener", "setOnAddressPickedListener", "(Lax4;)V", "Lcx4;", "listener", "setOnPickupFromPhotoTapListener", "(Lcx4;)V", "", "getContentViewLayoutRes", "()I", "onResume", "onPause", "onParentDismiss", "onParentDismissManually", "onTextCleared", "", "text", "filterChanged", "(Ljava/lang/String;)V", "onShowKeyboard", "onHideKeyboard", "Lx9v0;", "model", "onItemSelected", "(Lx9v0;)V", "onItemSelectedLongTap", "Lyn0;", "actionViewModel", "id", "idType", "Lru/yandex/taxi/analytics/Events$Suggest$ZeroSuggestAdditionalTapArea;", "area", "onAdditionalItemSelected", "(Lyn0;Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/analytics/Events$Suggest$ZeroSuggestAdditionalTapArea;)V", "onAdditionalItemShow", "(Ljava/lang/String;Ljava/lang/String;)V", "onDotsClicked", "Lk8v0;", "action", "onTrailAction", "(Lk8v0;)V", "onTrailButtonBind", "onItemEntranceClicked", "itemsCount", "onScrollToBottom", "(I)V", "onKeyboardSearchClicked", "", "clearDestinationOnDismiss", "onClearFilterClicked", "(Z)V", "onPointOnMapClicked", "inputHasFocus", "()Z", "onDismiss", "closeKeyboard", "onSearchAgain", "onTouchOutside", "subtitle", "onSubtitleChanged", "title", "setTitle", "Lhks;", ClidProvider.STATE, "updateNextButtonState", "(Lhks;)V", "setRedesignedInputHolder", "setNewbiesInputListeners", "removeNewbiesInputListeners", "Lru/yandex/taxi/search/view/AddressSearchView$InputType;", "inputType", "changeTopViewAttachment", "(Lru/yandex/taxi/search/view/AddressSearchView$InputType;)V", "view", "targetId", "changeTopAttachment", "(Landroid/view/View;I)V", "Lru/yandex/taxi/preorder/suggested/menu/EntryPoint;", "entryPoint", "Lv6v0;", "createSuggestMenuPayload", "(Lru/yandex/taxi/preorder/suggested/menu/EntryPoint;Lx9v0;)Lv6v0;", "Lru/yandex/taxi/search/presenter/f;", "presenter", "Lru/yandex/taxi/search/presenter/f;", "Ldx4;", "onPointOnMapListener", "Ldx4;", "Lru/yandex/taxi/design/AddressInputComponent;", "addressInput", "Lru/yandex/taxi/design/AddressInputComponent;", "Lru/yandex/taxi/search/b;", "addressInputHolder", "Lru/yandex/taxi/search/b;", "Lru/yandex/taxi/search/view/AddressSearchView$InputType;", "isFirstInputShow", "Z", "showDefaultSuggestOnLaunch", "Lax4;", "onPickupFromPhotoClickListener", "Lcx4;", "Lru/yandex/taxi/search/address/view/PointType;", "pointType", "Lru/yandex/taxi/search/address/view/PointType;", "Ls2h;", "deeplinkNavigator", "Ls2h;", "Lru/yandex/taxi/search/view/a;", "Lru/yandex/taxi/search/view/a;", "Landroid/view/ViewStub;", "toolbarStub", "Landroid/view/ViewStub;", "Companion", "InputType", "c61", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public class AddressSearchView extends BaseAddressSearchView<AddressSearchView> {
    public static final c61 Companion = new c61();
    public final AddressInputComponent addressInput;
    public final b addressInputHolder;
    private final boolean clearDestinationOnDismiss;
    private final s2h deeplinkNavigator;
    private InputType inputType;
    private boolean isFirstInputShow;
    private final a mvpView;
    private ax4 onAddressPickedListener;
    private cx4 onPickupFromPhotoClickListener;
    private final dx4 onPointOnMapListener;
    private final PointType pointType;
    protected final f presenter;
    private final boolean showDefaultSuggestOnLaunch;
    private final ViewStub toolbarStub;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/search/view/AddressSearchView$InputType;", "", "NEWBIES", "OLD", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class InputType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ InputType[] $VALUES;
        public static final InputType NEWBIES;
        public static final InputType OLD;

        static {
            InputType inputType = new InputType("NEWBIES", 0);
            NEWBIES = inputType;
            InputType inputType2 = new InputType("OLD", 1);
            OLD = inputType2;
            InputType[] inputTypeArr = {inputType, inputType2};
            $VALUES = inputTypeArr;
            $ENTRIES = kotlin.enums.a.a(inputTypeArr);
        }

        public static InputType valueOf(String str) {
            return (InputType) Enum.valueOf(InputType.class, str);
        }

        public static InputType[] values() {
            return (InputType[]) $VALUES.clone();
        }
    }

    public AddressSearchView(b61 b61Var) {
        super(b61Var);
        f fVar = b61Var.l;
        this.presenter = fVar;
        dx4 dx4Var = b61Var.q;
        this.onPointOnMapListener = dx4Var;
        b bVar = b61Var.m;
        this.addressInputHolder = bVar;
        this.inputType = InputType.OLD;
        this.isFirstInputShow = true;
        this.onPickupFromPhotoClickListener = b61Var.y;
        this.pointType = b61Var.u;
        this.deeplinkNavigator = b61Var.v;
        this.mvpView = new a(this);
        this.toolbarStub = (ViewStub) findViewById(wch0.toolbar_stub);
        fVar.D = false;
        fVar.F.l(b61Var.o);
        int i = adh0.address_input;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        AddressInputComponent addressInputComponent = (AddressInputComponent) ((View) rp31.d(this, i));
        this.addressInput = addressInputComponent;
        bVar.b();
        View findViewById = findViewById(wch0.address_input_stub);
        if (findViewById != null) {
            c.w(findViewById, bVar.a);
        }
        String str = b61Var.r;
        if (str != null && str.length() != 0) {
            setFilter(addressInputComponent, str);
            bVar.c(str);
        }
        addressInputComponent.setFocusableInTouchMode(true);
        addressInputComponent.setMode(AddressInputComponent.Mode.INPUT);
        addressInputComponent.setHint(b61Var.n);
        setupAddressInput(addressInputComponent, b61Var.p, true, dx4Var != null, b61Var.w);
        bVar.d(b61Var.n);
        this.showDefaultSuggestOnLaunch = b61Var.s;
        boolean z = b61Var.x;
        r0 r0Var = bVar.d;
        r0Var.m(null, ru.yandex.taxi.address.experiment.a.a((ru.yandex.taxi.address.experiment.a) r0Var.getValue(), null, null, null, null, null, null, null, null, false, false, z, false, 393215));
        this.clearDestinationOnDismiss = b61Var.t;
    }

    private static final zy11 _init_$lambda$0(AddressSearchView addressSearchView) {
        Activity p = c.p(addressSearchView);
        if (p != null) {
            p.onBackPressed();
        }
        return zy11.a;
    }

    public static final b61 builder(f51 f51Var) {
        Companion.getClass();
        return new b61(f51Var);
    }

    private final void changeTopAttachment(View view, int targetId) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(3, targetId);
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeTopViewAttachment(InputType inputType) {
        int id = inputType == InputType.NEWBIES ? this.addressInputHolder.a.getId() : this.addressInput.getId();
        changeTopAttachment(suggestsViewField(), id);
        changeTopAttachment(getSuggestsProgressView(), id);
        changeTopAttachment(getEmptyOrDefaultMessageViewStub(), id);
    }

    private final v6v0 createSuggestMenuPayload(EntryPoint entryPoint, x9v0 model) {
        PointType pointType = this.pointType;
        u6v0 u6v0Var = new u6v0();
        final int i = 0;
        u6v0Var.a = new t6v0(this) { // from class: y51
            public final /* synthetic */ AddressSearchView b;

            {
                this.b = this;
            }

            @Override // defpackage.t6v0
            public final void a(Address address) {
                int i2 = i;
                AddressSearchView addressSearchView = this.b;
                switch (i2) {
                    case 0:
                        addressSearchView.closeKeyboard();
                        break;
                    default:
                        addressSearchView.onDismiss();
                        break;
                }
            }
        };
        u6v0Var.b = new z51(this, model, i);
        final int i2 = 1;
        u6v0Var.d = new t6v0(this) { // from class: y51
            public final /* synthetic */ AddressSearchView b;

            {
                this.b = this;
            }

            @Override // defpackage.t6v0
            public final void a(Address address) {
                int i22 = i2;
                AddressSearchView addressSearchView = this.b;
                switch (i22) {
                    case 0:
                        addressSearchView.closeKeyboard();
                        break;
                    default:
                        addressSearchView.onDismiss();
                        break;
                }
            }
        };
        u6v0Var.c = new e61(i, this.presenter);
        u6v0Var.g = new f6v0(i2, findFocus());
        return new v6v0(model, pointType, u6v0Var.a(), new j0(16, this, model), entryPoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createSuggestMenuPayload$lambda$1(AddressSearchView addressSearchView, x9v0 x9v0Var, Address address) {
        addressSearchView.presenter.ih(x9v0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tpr createSuggestMenuPayload$lambda$3(AddressSearchView addressSearchView, x9v0 x9v0Var) {
        return addressSearchView.presenter.Mg(x9v0Var);
    }

    private final void removeNewbiesInputListeners() {
        g18 g18Var = this.addressInputHolder.e;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.addressInputHolder.a.setOnEditorActionListener(null);
        this.addressInputHolder.a.setOnKeyboardCloseListener(null);
        this.addressInputHolder.a.setOnClearListener(null);
        this.addressInputHolder.a.setOnButtonClickListener(null);
    }

    private final void setNewbiesInputListeners() {
        b bVar = this.addressInputHolder;
        jg jgVar = new jg(8, this.presenter);
        y4 y4Var = new y4(25, this);
        g18 g18Var = bVar.e;
        if (g18Var != null) {
            g18Var.cancel();
        }
        final int i = 1;
        bVar.e = bVar.a.setOnTextChangedListener(new dhj0(i, bVar, jgVar, y4Var));
        b bVar2 = this.addressInputHolder;
        bVar2.a.setOnEditorActionListener(getEditorActionListener());
        final int i2 = 0;
        this.addressInputHolder.a.setOnKeyboardCloseListener(new mw0(0, new Runnable(this) { // from class: a61
            public final /* synthetic */ AddressSearchView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                AddressSearchView addressSearchView = this.b;
                switch (i3) {
                    case 0:
                        addressSearchView.closeKeyboard();
                        break;
                    case 1:
                        addressSearchView.onClearFilterClicked(true);
                        break;
                    default:
                        addressSearchView.onPointOnMapClicked();
                        break;
                }
            }
        }));
        final int i3 = 2;
        this.addressInputHolder.a.setOnClearListener(new mw0(2, new Runnable(this) { // from class: a61
            public final /* synthetic */ AddressSearchView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i32 = i;
                AddressSearchView addressSearchView = this.b;
                switch (i32) {
                    case 0:
                        addressSearchView.closeKeyboard();
                        break;
                    case 1:
                        addressSearchView.onClearFilterClicked(true);
                        break;
                    default:
                        addressSearchView.onPointOnMapClicked();
                        break;
                }
            }
        }));
        this.addressInputHolder.a.setOnButtonClickListener(new mw0(1, new Runnable(this) { // from class: a61
            public final /* synthetic */ AddressSearchView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i32 = i3;
                AddressSearchView addressSearchView = this.b;
                switch (i32) {
                    case 0:
                        addressSearchView.closeKeyboard();
                        break;
                    case 1:
                        addressSearchView.onClearFilterClicked(true);
                        break;
                    default:
                        addressSearchView.onPointOnMapClicked();
                        break;
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setNewbiesInputListeners$lambda$0(AddressSearchView addressSearchView, String str) {
        addressSearchView.presenter.Lg(str);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRedesignedInputHolder() {
        b bVar = this.addressInputHolder;
        bVar.a.setBackground(getContext().getDrawable(dzg0.bg_rounded));
        int b = m810.b(uh6.o(8.0f));
        b bVar2 = this.addressInputHolder;
        bVar2.a.setBackgroundTintList(ColorStateList.valueOf(qje.t(xng0.controlMinor, getContext())));
        xw31.E(this.addressInputHolder.a, Integer.valueOf(b), Integer.valueOf(b * 2), Integer.valueOf(b), Integer.valueOf(b));
    }

    public void addShadowScrollListener(View bottomShadowView) {
        suggestsViewField().addOnScrollListener(new d61());
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void closeKeyboard() {
        if (this.inputType != InputType.NEWBIES) {
            closeKeyboard(this.addressInput);
        } else {
            this.addressInputHolder.a.closeKeyboard();
            onKeyboardClosed();
        }
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void filterChanged(String text) {
        this.presenter.Lg(text);
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public int getContentViewLayoutRes() {
        return aph0.address_search_view;
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public boolean inputHasFocus() {
        return this.inputType == InputType.NEWBIES ? this.addressInputHolder.a.hasFocus() : this.addressInput.hasFocus();
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onAdditionalItemSelected(yn0 actionViewModel, String id, String idType, Events$Suggest$ZeroSuggestAdditionalTapArea area) {
        this.presenter.fh(actionViewModel, id, idType, area);
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onAdditionalItemShow(String id, String idType) {
        this.presenter.gh(id, idType);
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isFirstInputShow = true;
        this.presenter.eh(this.mvpView);
        Editable address = this.addressInput.getAddress();
        if (address == null || address.length() == 0) {
            if (this.inputType == InputType.NEWBIES) {
                this.addressInputHolder.a.requestFocus();
            } else {
                OneShotPreDrawListener.add(this.addressInput, new uz(3, this));
            }
        }
        this.addressInputHolder.a();
        setActiveInputListeners(this.addressInput, this.clearDestinationOnDismiss);
        setNewbiesInputListeners();
        if (this.showDefaultSuggestOnLaunch) {
            this.presenter.Kg(true);
        }
        PointType pointType = this.pointType;
        if (pointType == null) {
            pointType = PointType.DESTINATION;
        }
        changePointType(pointType);
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onClearFilterClicked(boolean clearDestinationOnDismiss) {
        this.presenter.Kg(clearDestinationOnDismiss);
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeActiveInputListeners(this.addressInput);
        removeNewbiesInputListeners();
        this.addressInputHolder.c.b();
        this.presenter.Cg();
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onDismiss() {
        this.mvpView.h(null);
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onDotsClicked(x9v0 model) {
        this.presenter.Wg(createSuggestMenuPayload(EntryPoint.DOTS, model));
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onHideKeyboard() {
        this.presenter.hideKeyboard();
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onItemEntranceClicked(x9v0 model) {
        this.presenter.Vg(model);
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onItemSelected(x9v0 model) {
        this.presenter.ih(model);
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onItemSelectedLongTap(x9v0 model) {
        this.presenter.Wg(createSuggestMenuPayload(EntryPoint.LONG_TAP, model));
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onKeyboardSearchClicked() {
        this.presenter.Rg();
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onParentDismiss() {
        this.presenter.onDismiss();
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onParentDismissManually() {
        this.presenter.onDismiss();
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onPause() {
        this.presenter.pause();
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onPointOnMapClicked() {
        this.presenter.Zg();
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onResume() {
        this.presenter.resume();
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onScrollToBottom(int itemsCount) {
        this.presenter.N0(itemsCount);
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onSearchAgain() {
        this.presenter.lh();
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onShowKeyboard() {
        this.presenter.showKeyboard();
    }

    public void onSubtitleChanged(String subtitle) {
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onTextCleared() {
        this.presenter.kh();
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onTouchOutside() {
        this.presenter.hh();
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onTrailAction(k8v0 action) {
        this.presenter.bc(action);
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onTrailButtonBind(k8v0 action) {
        this.presenter.s7(action);
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public void requestActiveInputViewFocus() {
        if (this.inputType == InputType.NEWBIES) {
            this.addressInputHolder.a.requestFocus();
        } else {
            this.addressInput.requestFocus();
        }
    }

    public final void setOnAddressPickedListener(ax4 onAddressPickedListener) {
        this.onAddressPickedListener = onAddressPickedListener;
    }

    public final void setOnPickupFromPhotoTapListener(cx4 listener) {
        this.onPickupFromPhotoClickListener = listener;
    }

    public void setTitle(String title) {
    }

    public void updateNextButtonState(hks state) {
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchView
    public j61 mvpView() {
        return this.mvpView;
    }
}
