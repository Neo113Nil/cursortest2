package ru.yandex.taxi.fragment.favorites.edit;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.address.models.PlaceType;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.summary.api.state.SummaryUiState$Type;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.a0g;
import defpackage.a7t0;
import defpackage.agp;
import defpackage.aip;
import defpackage.arv0;
import defpackage.avj0;
import defpackage.b61;
import defpackage.bdc;
import defpackage.bgf;
import defpackage.bgp;
import defpackage.bip;
import defpackage.c0g;
import defpackage.c1o;
import defpackage.c61;
import defpackage.ce0;
import defpackage.cgp;
import defpackage.d6z;
import defpackage.ddf;
import defpackage.egp;
import defpackage.fdp;
import defpackage.fgp;
import defpackage.gdp;
import defpackage.gtu;
import defpackage.hdp;
import defpackage.hka1;
import defpackage.hxx;
import defpackage.hz20;
import defpackage.jfp;
import defpackage.jtu;
import defpackage.kfp;
import defpackage.kgp;
import defpackage.kip;
import defpackage.kyh0;
import defpackage.lfp;
import defpackage.m3o;
import defpackage.mjp;
import defpackage.nb1;
import defpackage.nfp;
import defpackage.nj00;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.ofp;
import defpackage.p1b;
import defpackage.p2y0;
import defpackage.p51;
import defpackage.pav;
import defpackage.pep0;
import defpackage.pfp;
import defpackage.pho;
import defpackage.prg0;
import defpackage.pry0;
import defpackage.pv0;
import defpackage.pwy0;
import defpackage.q5z;
import defpackage.qfp;
import defpackage.qmp;
import defpackage.qv10;
import defpackage.rfp;
import defpackage.rqo;
import defpackage.rwp0;
import defpackage.tdh0;
import defpackage.tj60;
import defpackage.tje;
import defpackage.tls;
import defpackage.tt2;
import defpackage.ufp;
import defpackage.uvh;
import defpackage.w030;
import defpackage.w040;
import defpackage.w511;
import defpackage.wip;
import defpackage.xfp;
import defpackage.xng0;
import defpackage.xph0;
import defpackage.xw31;
import defpackage.xzf;
import defpackage.yqv0;
import defpackage.yt3;
import defpackage.z81;
import defpackage.z9n;
import defpackage.zsa;
import defpackage.zuj0;
import defpackage.zy11;
import defpackage.zzf;
import defpackage.zzs;
import java.util.HashMap;
import kotlin.Metadata;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.common_models.object.GeoObjectType;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.design.ellipsize.TextMiddleEllipsizer$EllipsizingMode;
import ru.yandex.taxi.favorites.analytics.FavoritesAnalytics$TappedItem;
import ru.yandex.taxi.favorites.delete.DeleteFavoriteModalView;
import ru.yandex.taxi.favorites.edit.a;
import ru.yandex.taxi.favorites.edit.arguments.EditArguments;
import ru.yandex.taxi.favorites.edit.presenter.FavoriteEditPresenter$attachView$$inlined$safeCollectIn$1;
import ru.yandex.taxi.favorites.edit.presenter.d;
import ru.yandex.taxi.favorites.experiment.e;
import ru.yandex.taxi.fragment.YandexTaxiFragment;
import ru.yandex.taxi.fragment.favorites.edit.FavoriteEditFragment;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.search.view.AddressSearchModalView;
import ru.yandex.taxi.search.view.AddressSearchView;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.utils.BaseTextWatcher;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringBar;
import ru.yandex.taxi.widget.ShimmeringImageView;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;
import ru.yandex.taxi.widget.c;

@Metadata(d1 = {"\u0000\u009c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 «\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0003\u0002¬\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u0006J#\u0010 \u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010\u0006J\u000f\u0010&\u001a\u00020\tH\u0016¢\u0006\u0004\b&\u0010\u0006J\u000f\u0010'\u001a\u00020\tH\u0016¢\u0006\u0004\b'\u0010\u0006J\u0017\u0010*\u001a\u00020\t2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\tH\u0016¢\u0006\u0004\b,\u0010\u0006J\u0017\u0010.\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J'\u00103\u001a\u00020\t2\u0006\u00100\u001a\u00020-2\u0006\u00101\u001a\u00020-2\u0006\u00102\u001a\u00020-H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\tH\u0016¢\u0006\u0004\b5\u0010\u0006J\u000f\u00106\u001a\u00020\tH\u0016¢\u0006\u0004\b6\u0010\u0006J\u000f\u00107\u001a\u00020\tH\u0016¢\u0006\u0004\b7\u0010\u0006J\u0017\u0010:\u001a\u00020\t2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\t2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b<\u0010;J\u001f\u0010?\u001a\u00020\t2\u0006\u0010=\u001a\u00020-2\u0006\u0010>\u001a\u000208H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\t2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\bA\u0010;J\u000f\u0010B\u001a\u00020\tH\u0016¢\u0006\u0004\bB\u0010\u0006J\u000f\u0010C\u001a\u00020\tH\u0016¢\u0006\u0004\bC\u0010\u0006J\u0017\u0010F\u001a\u00020\t2\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020\t2\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bH\u0010GJ\u000f\u0010I\u001a\u00020\tH\u0016¢\u0006\u0004\bI\u0010\u0006J\u000f\u0010J\u001a\u00020\tH\u0016¢\u0006\u0004\bJ\u0010\u0006J\u0017\u0010M\u001a\u00020\t2\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bM\u0010NJ\u000f\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\tH\u0016¢\u0006\u0004\bR\u0010\u0006J\u000f\u0010S\u001a\u00020\tH\u0016¢\u0006\u0004\bS\u0010\u0006J\u000f\u0010T\u001a\u00020\tH\u0016¢\u0006\u0004\bT\u0010\u0006J\u0017\u0010W\u001a\u00020\t2\u0006\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bW\u0010XJ\u000f\u0010Z\u001a\u00020YH\u0014¢\u0006\u0004\bZ\u0010[J\u0017\u0010^\u001a\u00020\t2\u0006\u0010]\u001a\u00020\\H\u0016¢\u0006\u0004\b^\u0010_J\u0017\u0010b\u001a\u00020\t2\u0006\u0010a\u001a\u00020`H\u0016¢\u0006\u0004\bb\u0010cJ\u000f\u0010d\u001a\u00020\tH\u0002¢\u0006\u0004\bd\u0010\u0006J\u0017\u0010f\u001a\u00020\t2\u0006\u0010e\u001a\u00020\\H\u0002¢\u0006\u0004\bf\u0010_J\u000f\u0010h\u001a\u00020gH\u0002¢\u0006\u0004\bh\u0010iJ7\u0010n\u001a\u00020\t2\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00020k\u0012\u0004\u0012\u00020\t0j2\u0012\u0010m\u001a\u000e\u0012\u0004\u0012\u00020k\u0012\u0004\u0012\u00020\t0jH\u0002¢\u0006\u0004\bn\u0010oJ\u000f\u0010p\u001a\u00020\tH\u0002¢\u0006\u0004\bp\u0010\u0006J\u0017\u0010r\u001a\u00020\t2\u0006\u0010q\u001a\u00020\\H\u0002¢\u0006\u0004\br\u0010_J\u0017\u0010t\u001a\u00020\t2\u0006\u0010s\u001a\u00020\\H\u0002¢\u0006\u0004\bt\u0010_J\u0017\u0010u\u001a\u00020\t2\u0006\u0010s\u001a\u00020\\H\u0002¢\u0006\u0004\bu\u0010_J\u000f\u0010v\u001a\u00020\tH\u0002¢\u0006\u0004\bv\u0010\u0006J\u000f\u0010w\u001a\u00020\tH\u0002¢\u0006\u0004\bw\u0010\u0006J\u0011\u0010y\u001a\u0004\u0018\u00010xH\u0002¢\u0006\u0004\by\u0010zR\u0018\u0010|\u001a\u0004\u0018\u00010{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R)\u0010\u007f\u001a\u0004\u0018\u00010~8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001c\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0085\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001c\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001b\u0010\u008b\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0080\u0001R\u001c\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001c\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u008e\u0001R\u001b\u0010\u0090\u0001\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001c\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001c\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0095\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R*\u0010\u0099\u0001\u001a\u00030\u0098\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0019\u0010\u009f\u0001\u001a\u00020\\8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u001c\u0010¢\u0001\u001a\u0005\u0018\u00010¡\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u0018\u0010¥\u0001\u001a\u00030¤\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0018\u0010§\u0001\u001a\u00030¤\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¦\u0001R\u0018\u0010©\u0001\u001a\u00030¨\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001¨\u0006\u00ad\u0001"}, d2 = {"Lru/yandex/taxi/fragment/favorites/edit/FavoriteEditFragment;", "Lru/yandex/taxi/fragment/YandexTaxiFragment;", "Lufp;", "La0g;", "Lcgp;", "<init>", "()V", "Landroid/content/Context;", "context", "Lzy11;", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lkgp;", ClidProvider.STATE, "renderInputs", "(Lkgp;)V", "showAddressSearchModal", "", "title", "subtitle", "renderHeader", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "Lnj00;", "renderMapImage", "(Lnj00;)V", "onDestroyView", "onResume", "onPause", "Ljava/lang/Runnable;", "positiveAction", "showDeleteDialog", "(Ljava/lang/Runnable;)V", "showDeleteButton", "", "setScreenTitle", "(Ljava/lang/String;)V", "addressTitle", "addressSubtitle", "fullAddress", "updateAddressItem", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "showSetAsDestinationButton", "showSaveButton", "showHouseMissingDialog", "Lcom/yandex/go/address/models/FavoriteAddress;", "address", "onAddressAdded", "(Lcom/yandex/go/address/models/FavoriteAddress;)V", "onAddressRemoved", "addressId", "updatedAddress", "onAddressUpdated", "(Ljava/lang/String;Lcom/yandex/go/address/models/FavoriteAddress;)V", "onPickedAddress", "showActiveOrderError", "requestFocusOnSelectAsDestinationButton", "", "e", "handleSaveError", "(Ljava/lang/Throwable;)V", "handleDeleteError", "showLoading", "stopLoading", "Lbgp;", "model", "render", "(Lbgp;)V", "Legp;", "inputsHolder", "()Legp;", "onBack", "showDeleteLoading", "stopDeleteLoading", "Lzzs;", "initialPoint", "changeAddressOnMap", "(Lzzs;)V", "", "autoPaddingGravity", "()I", "", "visible", "setShimmerLoading", "(Z)V", "Lru/yandex/taxi/theme/ThemeType;", "type", "applyThemeType", "(Lru/yandex/taxi/theme/ThemeType;)V", "bindViewsInFields", BackendConfig.Restrictions.ENABLED, "enableEditAddressField", "Lmjp;", "addressSearchComponent", "()Lmjp;", "Lkotlin/Function1;", "Lpv0;", "onPointOnMap", "onAddressPicked", "searchAddress", "(Ltls;Ltls;)V", "unbindViewsInFields", "enable", "enableInteraction", "progressing", "setProgressing", "animateProgressing", "setListeners", "injectDependencies", "Lru/yandex/taxi/favorites/edit/arguments/EditArguments;", "getEditArguments", "()Lru/yandex/taxi/favorites/edit/arguments/EditArguments;", "Lru/yandex/taxi/design/ToolbarComponent;", "toolbar", "Lru/yandex/taxi/design/ToolbarComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "titleView", "Lru/yandex/taxi/design/ListItemComponent;", "getTitleView", "()Lru/yandex/taxi/design/ListItemComponent;", "setTitleView", "(Lru/yandex/taxi/design/ListItemComponent;)V", "Lru/yandex/taxi/widget/ShimmeringBar;", "headerSkeleton", "Lru/yandex/taxi/widget/ShimmeringBar;", "Landroid/widget/LinearLayout;", "fieldsSkeleton", "Landroid/widget/LinearLayout;", "addressField", "Lru/yandex/taxi/widget/ShimmeringRobotoTextView;", "selectAsDestinationButton", "Lru/yandex/taxi/widget/ShimmeringRobotoTextView;", "saveButton", "favoriteInputsHolder", "Legp;", "Lru/yandex/taxi/favorites/edit/a;", "favoriteMapHolder", "Lru/yandex/taxi/favorites/edit/a;", "Ljfp;", "favoriteEditComponent", "Ljfp;", "Lru/yandex/taxi/favorites/edit/presenter/d;", "presenter", "Lru/yandex/taxi/favorites/edit/presenter/d;", "getPresenter", "()Lru/yandex/taxi/favorites/edit/presenter/d;", "setPresenter", "(Lru/yandex/taxi/favorites/edit/presenter/d;)V", "isProgressing", "Z", "Lru/yandex/taxi/favorites/delete/DeleteFavoriteModalView;", "currentDeleteModalView", "Lru/yandex/taxi/favorites/delete/DeleteFavoriteModalView;", "Landroid/text/TextWatcher;", "textWatcher", "Landroid/text/TextWatcher;", "addressTitleWatcher", "Landroid/view/View$OnClickListener;", "onSaveClickListener", "Landroid/view/View$OnClickListener;", "Companion", "ofp", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FavoriteEditFragment extends YandexTaxiFragment<ufp, a0g> implements cgp {
    public static final int $stable = 8;
    private static final String ARGUMENT_KEY = "argument_key";
    public static final ofp Companion = new ofp();
    private ListItemComponent addressField;
    private DeleteFavoriteModalView currentDeleteModalView;
    private jfp favoriteEditComponent;
    private egp favoriteInputsHolder;
    private a favoriteMapHolder;
    private LinearLayout fieldsSkeleton;
    private ShimmeringBar headerSkeleton;
    private boolean isProgressing;
    public d presenter;
    private ShimmeringRobotoTextView saveButton;
    private ShimmeringRobotoTextView selectAsDestinationButton;
    private ListItemComponent titleView;
    private ToolbarComponent toolbar;
    private final TextWatcher textWatcher = new BaseTextWatcher() { // from class: ru.yandex.taxi.fragment.favorites.edit.FavoriteEditFragment$textWatcher$1
        @Override // ru.yandex.taxi.utils.BaseTextWatcher, android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            FavoriteEditFragment.this.getPresenter().M.k();
        }
    };
    private final TextWatcher addressTitleWatcher = new BaseTextWatcher() { // from class: ru.yandex.taxi.fragment.favorites.edit.FavoriteEditFragment$addressTitleWatcher$1
        @Override // ru.yandex.taxi.utils.BaseTextWatcher, android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            egp egpVar;
            ShimmeringRobotoTextView shimmeringRobotoTextView;
            d presenter = FavoriteEditFragment.this.getPresenter();
            presenter.M.g(s.toString());
            egpVar = FavoriteEditFragment.this.favoriteInputsHolder;
            if (egpVar != null) {
                egpVar.c.cleanError();
            }
            shimmeringRobotoTextView = FavoriteEditFragment.this.saveButton;
            if (shimmeringRobotoTextView != null) {
                shimmeringRobotoTextView.setEnabled(true);
            }
        }
    };
    private final View.OnClickListener onSaveClickListener = new lfp(this, 0);

    /* JADX WARN: Multi-variable type inference failed */
    private final mjp addressSearchComponent() {
        RoutePointType routePointType = RoutePointType.FAVORITE;
        c0g c0gVar = ((a0g) injector()).b;
        w030 modalViewCoordinator = modalViewCoordinator();
        ddf ddfVar = new ddf(11, new rwp0(routePointType, false));
        m3o m3oVar = m3o.b;
        modalViewCoordinator.getClass();
        m3oVar.getClass();
        return new xzf(ddfVar, m3oVar, c0gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void animateProgressing(boolean progressing) {
        ShimmeringRobotoTextView shimmeringRobotoTextView = this.saveButton;
        if (shimmeringRobotoTextView != null) {
            Rect rect = xw31.a;
            if (shimmeringRobotoTextView.getVisibility() == 0) {
                ShimmeringRobotoTextView shimmeringRobotoTextView2 = this.saveButton;
                if (shimmeringRobotoTextView2 == null) {
                    return;
                }
                if (progressing) {
                    shimmeringRobotoTextView2.setClickable(true);
                    setListeners();
                    shimmeringRobotoTextView2.stopAnimation();
                    return;
                } else {
                    shimmeringRobotoTextView2.setOnClickListener(null);
                    shimmeringRobotoTextView2.setClickable(false);
                    shimmeringRobotoTextView2.startAnimation();
                    return;
                }
            }
        }
        ShimmeringRobotoTextView shimmeringRobotoTextView3 = this.selectAsDestinationButton;
        if (shimmeringRobotoTextView3 == null) {
            return;
        }
        Rect rect2 = xw31.a;
        if (shimmeringRobotoTextView3.getVisibility() != 0 || (shimmeringRobotoTextView2 = this.selectAsDestinationButton) == null) {
            return;
        }
        if (progressing) {
        }
    }

    private final void bindViewsInFields() {
        ToolbarComponent toolbarComponent = (ToolbarComponent) nonNullViewById(tdh0.toolbar);
        this.toolbar = toolbarComponent;
        if (toolbarComponent != null) {
            toolbarComponent.setOnNavigationClickListener(new kfp(this, 2));
        }
        this.titleView = (ListItemComponent) nonNullViewById(tdh0.favorites_edit_header_title);
        this.headerSkeleton = (ShimmeringBar) nonNullViewById(tdh0.header_skeleton);
        this.fieldsSkeleton = (LinearLayout) nonNullViewById(tdh0.fields_skeleton);
        AnimatedListItemInputComponent animatedListItemInputComponent = (AnimatedListItemInputComponent) nonNullViewById(tdh0.address_name);
        animatedListItemInputComponent.addTextChangedListener(this.addressTitleWatcher);
        if (!tje.J(requireContext())) {
            animatedListItemInputComponent.postDelayed(new uvh(animatedListItemInputComponent, 1), 300L);
        }
        this.favoriteInputsHolder = new egp(nonNullViewById(tdh0.delivery_block_title), nonNullViewById(tdh0.delivery_floor_divider), animatedListItemInputComponent, (AnimatedListItemInputComponent) nonNullViewById(tdh0.porch), (AnimatedListItemInputComponent) nonNullViewById(tdh0.comment), (AnimatedListItemInputComponent) nonNullViewById(tdh0.quarters), (AnimatedListItemInputComponent) nonNullViewById(tdh0.floor), (AnimatedListItemInputComponent) nonNullViewById(tdh0.doorphone), (AnimatedListItemInputComponent) nonNullViewById(tdh0.comment_to_courier), new kfp(this, 3));
        ListItemComponent listItemComponent = (ListItemComponent) nonNullViewById(tdh0.address);
        this.addressField = listItemComponent;
        if (listItemComponent != null) {
            listItemComponent.setDebounceClickListener(new kfp(this, 4));
        }
        this.favoriteMapHolder = new a(getLifecycleScope(), nonNullViewById(tdh0.map_widget), (ShimmeringImageView) nonNullViewById(tdh0.map_image_view), nonNullViewById(tdh0.map_pin), (GoImageView) nonNullViewById(tdh0.map_pin_image), nonNullViewById(tdh0.map_error_container), (RobotoTextView) nonNullViewById(tdh0.map_address_title), nonNullViewById(tdh0.map_address_skeleton), (ButtonComponent) nonNullViewById(tdh0.map_edit_button), new kfp(this, 5), new kfp(this, 6), new kfp(this, 0));
        ShimmeringRobotoTextView shimmeringRobotoTextView = (ShimmeringRobotoTextView) nonNullViewById(tdh0.save_button);
        this.saveButton = shimmeringRobotoTextView;
        if (shimmeringRobotoTextView != null) {
            shimmeringRobotoTextView.updateShimmeringColor(new bdc(xng0.everFront));
        }
        this.selectAsDestinationButton = (ShimmeringRobotoTextView) nonNullViewById(tdh0.select_as_destination_button);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindViewsInFields$lambda$2(FavoriteEditFragment favoriteEditFragment) {
        favoriteEditFragment.getPresenter().M.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindViewsInFields$lambda$4(FavoriteEditFragment favoriteEditFragment) {
        d presenter = favoriteEditFragment.getPresenter();
        aip aipVar = presenter.K;
        FavoritesAnalytics$TappedItem favoritesAnalytics$TappedItem = FavoritesAnalytics$TappedItem.AddressEditButton;
        aipVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("tapped_item", favoritesAnalytics$TappedItem.getEventValue());
        aipVar.a.a("Favorites.MapPreview.Tapped", hashMap, 1, new HashMap());
        ((cgp) presenter.Dg()).showAddressSearchModal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindViewsInFields$lambda$5(FavoriteEditFragment favoriteEditFragment) {
        d presenter = favoriteEditFragment.getPresenter();
        aip aipVar = presenter.K;
        FavoritesAnalytics$TappedItem favoritesAnalytics$TappedItem = FavoritesAnalytics$TappedItem.Map;
        aipVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("tapped_item", favoritesAnalytics$TappedItem.getEventValue());
        aipVar.a.a("Favorites.MapPreview.Tapped", hashMap, 1, new HashMap());
        ((cgp) presenter.Dg()).changeAddressOnMap(presenter.M.a().B());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindViewsInFields$lambda$6(FavoriteEditFragment favoriteEditFragment) {
        favoriteEditFragment.getPresenter().Lg();
    }

    private final void enableEditAddressField(boolean enabled) {
        ListItemComponent listItemComponent = this.addressField;
        if (!enabled) {
            if (listItemComponent != null) {
                listItemComponent.setEnabled(false);
            }
        } else {
            if (listItemComponent != null) {
                listItemComponent.setFocusable(false);
            }
            ListItemComponent listItemComponent2 = this.addressField;
            if (listItemComponent2 != null) {
                listItemComponent2.setClickable(true);
            }
        }
    }

    private final void enableInteraction(boolean enable) {
        ListItemComponent listItemComponent = this.addressField;
        if (listItemComponent != null) {
            listItemComponent.setClickable(enable);
        }
        egp egpVar = this.favoriteInputsHolder;
        if (egpVar != null) {
            egpVar.c.setEnabled(enable);
            egpVar.d.setEnabled(enable);
            egpVar.e.setEnabled(enable);
            egpVar.f.setEnabled(enable);
            egpVar.g.setEnabled(enable);
            egpVar.h.setEnabled(enable);
            egpVar.i.setEnabled(enable);
        }
    }

    private final EditArguments getEditArguments() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return null;
        }
        return (EditArguments) arguments.getParcelable(ARGUMENT_KEY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void injectDependencies() {
        if (this.favoriteEditComponent != null) {
            return;
        }
        EditArguments editArguments = getEditArguments();
        if (editArguments == null) {
            ny61.r("missing arguments");
            return;
        }
        rfp rfpVar = new rfp();
        a0g a0gVar = (a0g) injector();
        a0gVar.getClass();
        zzf zzfVar = a0gVar.a;
        c0g c0gVar = a0gVar.b;
        p1b p1bVar = new p1b(zzfVar, c0gVar, rfpVar);
        this.favoriteEditComponent = p1bVar;
        this.receiverProvider = zzfVar.Yp;
        this.presenter = new d((zuj0) zzfVar.W.get(), new w040((tt2) zzfVar.n.get(), editArguments, (qmp) zzfVar.D.get(), (ru.yandex.taxi.favorites.data.repo.a) zzfVar.W7.get(), (zuj0) zzfVar.W.get(), new kip((rqo) zzfVar.C.get(), 0), new e((rqo) zzfVar.C.get()), (bgf) c0gVar.a.g2.get()), (p2y0) zzfVar.J2.get(), (arv0) zzfVar.c9.get(), (ru.yandex.taxi.favorites.data.repo.a) zzfVar.W7.get(), (qmp) zzfVar.D.get(), (c) zzfVar.Ze.get(), new kip((rqo) zzfVar.C.get(), 0), c0gVar.j6(), (pwy0) zzfVar.U.get(), new wip((tj60) c0gVar.t7.get(), (Context) c0gVar.U.get()), (z9n) p1bVar.b, (oep0) c0gVar.T.get(), new aip((pho) c0gVar.z.d0.get()), (pav) zzfVar.p3.get());
    }

    public static final FavoriteEditFragment newInstance(EditArguments editArguments) {
        Companion.getClass();
        FavoriteEditFragment favoriteEditFragment = new FavoriteEditFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(ARGUMENT_KEY, editArguments);
        favoriteEditFragment.setArguments(bundle);
        return favoriteEditFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSaveClickListener$lambda$0(FavoriteEditFragment favoriteEditFragment, View view) {
        String Y;
        kip kipVar = favoriteEditFragment.getPresenter().E;
        if (kipVar.a().b) {
            agp a = kipVar.a();
            Y = d6z.Y(a, a.j);
        } else {
            Y = null;
        }
        egp egpVar = favoriteEditFragment.favoriteInputsHolder;
        String a2 = egpVar != null ? egpVar.a() : null;
        if ((a2 != null && a2.length() != 0) || Y == null || Y.length() == 0) {
            favoriteEditFragment.getPresenter().M.e();
            egp egpVar2 = favoriteEditFragment.favoriteInputsHolder;
            if (egpVar2 != null) {
                egpVar2.b();
                return;
            }
            return;
        }
        egp egpVar3 = favoriteEditFragment.favoriteInputsHolder;
        if (egpVar3 != null) {
            AnimatedListItemInputComponent animatedListItemInputComponent = egpVar3.c;
            animatedListItemInputComponent.setErrorText(Y);
            animatedListItemInputComponent.focusInput();
        }
        ShimmeringRobotoTextView shimmeringRobotoTextView = favoriteEditFragment.saveButton;
        if (shimmeringRobotoTextView != null) {
            shimmeringRobotoTextView.setEnabled(false);
        }
    }

    private final void searchAddress(tls onPointOnMap, tls onAddressPicked) {
        pv0 pv0Var = new pv0(getPresenter().M.a(), null, null, null, null, null, null, null, 1022);
        p51 p51Var = AddressSearchModalView.Companion;
        c61 c61Var = AddressSearchView.Companion;
        mjp addressSearchComponent = addressSearchComponent();
        c61Var.getClass();
        b61 b61Var = new b61(addressSearchComponent);
        PlainAddress a = getPresenter().M.a();
        b61Var.r = (a.g0() == GeoObjectType.ADDRESS || a.g0() == GeoObjectType.DELIVERY_PICKUP_POINT) ? q5z.L(a) : q5z.D(a);
        b61Var.j = tdh0.suggested_favorites;
        b61Var.q = new nb1(4, onPointOnMap);
        b61Var.n = ru.yandex.taxi.design.utils.c.G(kyh0.favorite_address_search_hint, asView());
        b61Var.p = false;
        b61Var.l.nh(pv0Var);
        p51Var.getClass();
        AddressSearchModalView a2 = p51.a(b61Var);
        a2.setOnAddressPickedListener(new nfp(0, onAddressPicked));
        modalViewCoordinator().s(a2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void searchAddress$lambda$0(tls tlsVar, hz20 hz20Var, pv0 pv0Var) {
        if (pv0Var != null) {
            tlsVar.invoke(pv0Var);
        }
    }

    private final void setListeners() {
        ToolbarComponent toolbarComponent = this.toolbar;
        int i = 1;
        if (toolbarComponent != null) {
            toolbarComponent.setTrailContainerClickListener(new kfp(this, i));
        }
        ShimmeringRobotoTextView shimmeringRobotoTextView = this.saveButton;
        if (shimmeringRobotoTextView != null) {
            shimmeringRobotoTextView.setOnClickListener(this.onSaveClickListener);
        }
        ShimmeringRobotoTextView shimmeringRobotoTextView2 = this.selectAsDestinationButton;
        if (shimmeringRobotoTextView2 != null) {
            shimmeringRobotoTextView2.setOnClickListener(new lfp(this, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListeners$lambda$0(FavoriteEditFragment favoriteEditFragment) {
        if (favoriteEditFragment.isProgressing) {
            return;
        }
        favoriteEditFragment.getPresenter().M.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListeners$lambda$1(FavoriteEditFragment favoriteEditFragment, View view) {
        d presenter = favoriteEditFragment.getPresenter();
        ((a7t0) presenter.A).b(new yqv0(SummaryUiState$Type.NORMAL, ""));
        if (((e0) presenter.z).s()) {
            ((cgp) presenter.Dg()).showActiveOrderError();
        } else {
            presenter.M.j();
        }
        egp egpVar = favoriteEditFragment.favoriteInputsHolder;
        if (egpVar != null) {
            egpVar.b();
        }
    }

    private final void setProgressing(boolean progressing) {
        this.isProgressing = progressing;
        animateProgressing(progressing);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 showAddressSearchModal$lambda$0(FavoriteEditFragment favoriteEditFragment, pv0 pv0Var) {
        ufp ufpVar = (ufp) favoriteEditFragment.callback;
        if (ufpVar != null) {
            xfp.V(ufpVar.a, pv0Var, null, new qfp(favoriteEditFragment));
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showAddressSearchModal$lambda$1(FavoriteEditFragment favoriteEditFragment, pv0 pv0Var) {
        d presenter = favoriteEditFragment.getPresenter();
        presenter.M.h(pv0Var.a);
        presenter.Lg();
        return zy11.a;
    }

    private final void unbindViewsInFields() {
        this.toolbar = null;
        this.titleView = null;
        this.headerSkeleton = null;
        this.fieldsSkeleton = null;
        this.selectAsDestinationButton = null;
        this.saveButton = null;
        ListItemComponent listItemComponent = this.addressField;
        if (listItemComponent != null) {
            listItemComponent.setOnClickListener(null);
        }
        this.addressField = null;
    }

    @Override // defpackage.cgp
    public void applyThemeType(ThemeType type) {
        a aVar = this.favoriteMapHolder;
        if (aVar != null) {
            GoImageView goImageView = aVar.d;
            goImageView.setImageTintList(ColorStateList.valueOf(ru.yandex.taxi.design.utils.c.c(xng0.textOnControlMinor, goImageView)));
        }
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment
    public int autoPaddingGravity() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cgp
    public void changeAddressOnMap(zzs initialPoint) {
        ufp ufpVar = (ufp) this.callback;
        if (ufpVar != null) {
            xfp.V(ufpVar.a, null, initialPoint, new pfp(this));
        }
    }

    public final d getPresenter() {
        d dVar = this.presenter;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }

    public final ListItemComponent getTitleView() {
        return this.titleView;
    }

    @Override // defpackage.cgp
    public void handleDeleteError(Throwable e) {
        d presenter = getPresenter();
        wip wipVar = presenter.H;
        avj0 avj0Var = (avj0) presenter.x;
        wipVar.a(avj0Var.h(kyh0.favorite_item_deleting_error_title), avj0Var.h(kyh0.favorite_item_deleting_error_message));
    }

    @Override // defpackage.cgp
    public void handleSaveError(Throwable e) {
        d presenter = getPresenter();
        wip wipVar = presenter.H;
        avj0 avj0Var = (avj0) presenter.x;
        wipVar.a(avj0Var.h(kyh0.favorite_item_saving_error_title), avj0Var.h(kyh0.favorite_item_saving_error_message));
    }

    @Override // defpackage.cgp
    public egp inputsHolder() {
        egp egpVar = this.favoriteInputsHolder;
        if (egpVar != null) {
            return egpVar;
        }
        ny61.g("Required value was null.");
        return null;
    }

    @Override // defpackage.cgp
    public void onAddressAdded(FavoriteAddress address) {
        View view = getView();
        if (view != null) {
            view.post(new ce0(view, 15));
        }
        ufp callback = getCallback();
        if (callback != null) {
            xfp xfpVar = callback.a;
            String comment = address.getComment();
            boolean z = false;
            boolean z2 = (comment == null || comment.length() == 0) ? false : true;
            String porchNumber = address.getPorchNumber();
            if (porchNumber != null && porchNumber.length() != 0) {
                z = true;
            }
            String b = hka1.b(address.getDatumType());
            bip bipVar = xfpVar.G;
            PlaceType placeType = address.getPlaceType();
            boolean z3 = callback.b.b;
            bipVar.getClass();
            String a = bip.a("favorites.add", placeType);
            String str = z3 ? PolicyMappingsExtension.MAP : "other";
            i d = ((j) bipVar.a).d(a);
            d.g("commentSpecified", z2);
            d.g("porchSpecified", z);
            d.d("datum_type", b);
            d.d("addressPickType", str);
            d.m();
            xfpVar.r(new fdp(4, address));
        }
    }

    @Override // defpackage.cgp
    public void onAddressRemoved(FavoriteAddress address) {
        ufp callback = getCallback();
        if (callback != null) {
            xfp xfpVar = callback.a;
            bip bipVar = xfpVar.G;
            PlaceType placeType = address.getPlaceType();
            bipVar.getClass();
            ((j) bipVar.a).n(bip.a("favorites.delete", placeType));
            xfpVar.r(new fdp(5, address));
        }
    }

    @Override // defpackage.cgp
    public void onAddressUpdated(String addressId, FavoriteAddress updatedAddress) {
        View view = getView();
        if (view != null) {
            view.post(new ce0(view, 15));
        }
        ufp callback = getCallback();
        if (callback != null) {
            xfp xfpVar = callback.a;
            String comment = updatedAddress.getComment();
            int i = 1;
            boolean z = false;
            boolean z2 = (comment == null || comment.length() == 0) ? false : true;
            String porchNumber = updatedAddress.getPorchNumber();
            if (porchNumber != null && porchNumber.length() != 0) {
                z = true;
            }
            String b = hka1.b(updatedAddress.getDatumType());
            bip bipVar = xfpVar.G;
            PlaceType placeType = updatedAddress.getPlaceType();
            bipVar.getClass();
            i d = ((j) bipVar.a).d(bip.a("favorites.edit", placeType));
            d.g("commentSpecified", z2);
            d.g("porchSpecified", z);
            d.d("datum_type", b);
            d.m();
            xfpVar.r(new hdp(addressId, updatedAddress, i));
        }
    }

    @Override // ru.yandex.taxi.fragment.YandexTaxiFragment, ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        injectDependencies();
    }

    @Override // defpackage.cgp
    public void onBack() {
        egp egpVar = this.favoriteInputsHolder;
        if (egpVar != null) {
            egpVar.b();
        }
        requireActivity().onBackPressed();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(xph0.favorite_edit_screen, container, false);
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.currentDeleteModalView = null;
        getPresenter().Cg();
        super.onDestroyView();
        unbindViewsInFields();
        egp egpVar = this.favoriteInputsHolder;
        if (egpVar != null) {
            egpVar.c.setOnFocusStateChanged(null);
            egpVar.d.setOnFocusStateChanged(null);
            egpVar.e.setOnFocusStateChanged(null);
            egpVar.f.setOnFocusStateChanged(null);
            egpVar.g.setOnFocusStateChanged(null);
            egpVar.h.setOnFocusStateChanged(null);
            egpVar.i.setOnFocusStateChanged(null);
        }
    }

    @Override // ru.yandex.taxi.fragment.YandexTaxiFragment, androidx.fragment.app.Fragment
    public void onPause() {
        View view = getView();
        if (view != null) {
            view.clearFocus();
        }
        egp egpVar = this.favoriteInputsHolder;
        if (egpVar != null) {
            egpVar.b();
        }
        getPresenter().pause();
        super.onPause();
    }

    @Override // defpackage.cgp
    public void onPickedAddress(FavoriteAddress address) {
        View view = getView();
        if (view != null) {
            view.post(new ce0(view, 15));
        }
        ufp callback = getCallback();
        if (callback != null) {
            xfp xfpVar = callback.a;
            ((j) xfpVar.G.a).n("favorites.setDestination");
            PlainAddress f = z81.f(address);
            f.O1(xfpVar.K.b(f));
            xfpVar.r(new gdp(f, 1));
        }
    }

    @Override // ru.yandex.taxi.fragment.YandexTaxiFragment, ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getPresenter().resume();
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        bindViewsInFields();
        ofp ofpVar = Companion;
        ListItemComponent listItemComponent = this.addressField;
        ofpVar.getClass();
        if (listItemComponent != null) {
            listItemComponent.setSaveFromParentEnabled(false);
        }
        ShimmeringRobotoTextView shimmeringRobotoTextView = this.saveButton;
        if (shimmeringRobotoTextView != null) {
            shimmeringRobotoTextView.setSaveFromParentEnabled(false);
        }
        setListeners();
        d presenter = getPresenter();
        presenter.Bg(this);
        presenter.M.i();
        renderInputs(presenter.Kg());
        render(presenter.M.d());
        presenter.Mg();
        presenter.Lg();
        tje.N(presenter.Jg(), null, null, new FavoriteEditPresenter$attachView$$inlined$safeCollectIn$1(presenter.G.a(), null, presenter, this), 3);
        ToolbarComponent toolbarComponent = this.toolbar;
        setAccessibilityScreenName(toolbarComponent != null ? toolbarComponent.getTitleText() : null);
        ToolbarComponent toolbarComponent2 = this.toolbar;
        if (toolbarComponent2 != null) {
            toolbarComponent2.requestAccessibilityFocus();
        }
        tje.k(112, nonNullViewById(tdh0.container));
    }

    @Override // defpackage.cgp
    public void render(bgp model) {
        setScreenTitle(model.m ? model.a : "");
        updateAddressItem(model.c, model.p ? model.g : "", model.d);
        egp egpVar = this.favoriteInputsHolder;
        if (egpVar != null) {
            String str = model.b;
            AnimatedListItemInputComponent animatedListItemInputComponent = egpVar.c;
            animatedListItemInputComponent.setValue(str);
            animatedListItemInputComponent.setSelection(egp.c(str));
            String str2 = model.e;
            AnimatedListItemInputComponent animatedListItemInputComponent2 = egpVar.d;
            animatedListItemInputComponent2.setValue(str2);
            animatedListItemInputComponent2.setSelection(egp.c(str2));
            String str3 = model.f;
            AnimatedListItemInputComponent animatedListItemInputComponent3 = egpVar.e;
            animatedListItemInputComponent3.setValue(str3);
            animatedListItemInputComponent3.setSelection(egp.c(str3));
            String str4 = model.h;
            AnimatedListItemInputComponent animatedListItemInputComponent4 = egpVar.f;
            animatedListItemInputComponent4.setValue(str4);
            animatedListItemInputComponent4.setSelection(egp.c(str4));
            String str5 = model.i;
            AnimatedListItemInputComponent animatedListItemInputComponent5 = egpVar.g;
            animatedListItemInputComponent5.setValue(str5);
            animatedListItemInputComponent5.setSelection(egp.c(str5));
            String str6 = model.j;
            AnimatedListItemInputComponent animatedListItemInputComponent6 = egpVar.h;
            animatedListItemInputComponent6.setValue(str6);
            animatedListItemInputComponent6.setSelection(egp.c(str6));
            String str7 = model.k;
            AnimatedListItemInputComponent animatedListItemInputComponent7 = egpVar.i;
            animatedListItemInputComponent7.setValue(str7);
            animatedListItemInputComponent7.setSelection(egp.c(str7));
        }
        egp egpVar2 = this.favoriteInputsHolder;
        if (egpVar2 != null) {
            TextWatcher textWatcher = this.textWatcher;
            egpVar2.c.addTextChangedListener(textWatcher);
            egpVar2.d.addTextChangedListener(textWatcher);
            egpVar2.e.addTextChangedListener(textWatcher);
            egpVar2.f.addTextChangedListener(textWatcher);
            egpVar2.g.addTextChangedListener(textWatcher);
            egpVar2.h.addTextChangedListener(textWatcher);
            egpVar2.i.addTextChangedListener(textWatcher);
        }
        ToolbarComponent toolbarComponent = this.toolbar;
        if (toolbarComponent != null) {
            toolbarComponent.setTrailVisibility(model.l ? 0 : 8);
        }
        if (model.n) {
            showSaveButton();
        }
        enableEditAddressField(model.o);
    }

    @Override // defpackage.cgp
    public void renderHeader(CharSequence title, CharSequence subtitle) {
        if (title == null || title.length() == 0) {
            ListItemComponent listItemComponent = this.titleView;
            if (listItemComponent != null) {
                listItemComponent.setVisibility(8);
                return;
            }
            return;
        }
        ListItemComponent listItemComponent2 = this.titleView;
        if (listItemComponent2 != null) {
            listItemComponent2.setVisibility(0);
        }
        ListItemComponent listItemComponent3 = this.titleView;
        if (listItemComponent3 != null) {
            listItemComponent3.setTitle(title);
        }
        ListItemComponent listItemComponent4 = this.titleView;
        if (listItemComponent4 != null) {
            listItemComponent4.setSubtitle(subtitle);
        }
    }

    @Override // defpackage.cgp
    public void renderInputs(kgp state) {
        int i;
        egp egpVar = this.favoriteInputsHolder;
        if (egpVar != null) {
            AnimatedListItemInputComponent animatedListItemInputComponent = egpVar.i;
            AnimatedListItemInputComponent animatedListItemInputComponent2 = egpVar.e;
            AnimatedListItemInputComponent animatedListItemInputComponent3 = egpVar.c;
            boolean z = state.a;
            boolean z2 = state.e;
            boolean z3 = state.d;
            boolean z4 = state.f;
            animatedListItemInputComponent3.setVisibility(z ? 0 : 8);
            animatedListItemInputComponent2.setDividerVisibility(z3);
            animatedListItemInputComponent2.setVisibility(z3 ? 0 : 8);
            if (z4) {
                i = 5;
            } else {
                if (z4) {
                    w511.b();
                    return;
                }
                i = 6;
            }
            animatedListItemInputComponent2.setImeOptions(i);
            egpVar.d.setVisibility(state.c ? 0 : 8);
            egpVar.a.setVisibility(z2 ? 0 : 8);
            egpVar.b.setVisibility(z2 ? 0 : 8);
            egpVar.g.setVisibility(z4 ? 0 : 8);
            egpVar.h.setVisibility(z4 ? 0 : 8);
            egpVar.f.setVisibility(z4 ? 0 : 8);
            animatedListItemInputComponent.setVisibility(z4 ? 0 : 8);
            if (state instanceof fgp) {
                fgp fgpVar = (fgp) state;
                String str = fgpVar.h;
                String str2 = fgpVar.g;
                if (str2.length() > 0) {
                    animatedListItemInputComponent2.setInputTitle(str2);
                }
                if (str.length() > 0) {
                    animatedListItemInputComponent.setInputTitle(str);
                }
            }
        }
        ListItemComponent listItemComponent = this.addressField;
        if (listItemComponent != null) {
            listItemComponent.setVisibility(state.b ? 0 : 8);
        }
    }

    @Override // defpackage.cgp
    public void renderMapImage(nj00 state) {
        a aVar = this.favoriteMapHolder;
        if (aVar != null) {
            aVar.l.l(state);
        }
    }

    @Override // defpackage.cgp
    public void requestFocusOnSelectAsDestinationButton() {
        ShimmeringRobotoTextView shimmeringRobotoTextView = this.selectAsDestinationButton;
        if (shimmeringRobotoTextView != null) {
            shimmeringRobotoTextView.sendAccessibilityEvent(8);
        }
    }

    public final void setPresenter(d dVar) {
        this.presenter = dVar;
    }

    @Override // defpackage.cgp
    public void setScreenTitle(String title) {
        ToolbarComponent toolbarComponent = this.toolbar;
        if (toolbarComponent != null) {
            toolbarComponent.setTitle(title);
        }
    }

    @Override // defpackage.cgp
    public void setShimmerLoading(boolean visible) {
        ListItemComponent listItemComponent = this.titleView;
        if (listItemComponent != null) {
            listItemComponent.setVisibility(visible ? 4 : 0);
        }
        ShimmeringBar shimmeringBar = this.headerSkeleton;
        if (shimmeringBar != null) {
            shimmeringBar.setVisibility(visible ? 0 : 8);
        }
        LinearLayout linearLayout = this.fieldsSkeleton;
        if (linearLayout != null) {
            linearLayout.setVisibility(visible ? 0 : 8);
        }
        a aVar = this.favoriteMapHolder;
        if (aVar != null) {
            qv10.B(visible, aVar.m, null);
        }
        if (visible) {
            showLoading();
        } else {
            stopLoading();
        }
    }

    public final void setTitleView(ListItemComponent listItemComponent) {
        this.titleView = listItemComponent;
    }

    @Override // defpackage.cgp
    public void showActiveOrderError() {
        Toast.makeText(getContext(), kyh0.favorites_complete_order_warning_toast, 1).show();
    }

    @Override // defpackage.cgp
    public void showAddressSearchModal() {
        View view = getView();
        if (view != null) {
            view.post(new ce0(view, 15));
        }
        final int i = 0;
        final int i2 = 1;
        searchAddress(new tls(this) { // from class: mfp
            public final /* synthetic */ FavoriteEditFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 showAddressSearchModal$lambda$0;
                zy11 showAddressSearchModal$lambda$1;
                int i3 = i;
                FavoriteEditFragment favoriteEditFragment = this.b;
                pv0 pv0Var = (pv0) obj;
                switch (i3) {
                    case 0:
                        showAddressSearchModal$lambda$0 = FavoriteEditFragment.showAddressSearchModal$lambda$0(favoriteEditFragment, pv0Var);
                        return showAddressSearchModal$lambda$0;
                    default:
                        showAddressSearchModal$lambda$1 = FavoriteEditFragment.showAddressSearchModal$lambda$1(favoriteEditFragment, pv0Var);
                        return showAddressSearchModal$lambda$1;
                }
            }
        }, new tls(this) { // from class: mfp
            public final /* synthetic */ FavoriteEditFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 showAddressSearchModal$lambda$0;
                zy11 showAddressSearchModal$lambda$1;
                int i3 = i2;
                FavoriteEditFragment favoriteEditFragment = this.b;
                pv0 pv0Var = (pv0) obj;
                switch (i3) {
                    case 0:
                        showAddressSearchModal$lambda$0 = FavoriteEditFragment.showAddressSearchModal$lambda$0(favoriteEditFragment, pv0Var);
                        return showAddressSearchModal$lambda$0;
                    default:
                        showAddressSearchModal$lambda$1 = FavoriteEditFragment.showAddressSearchModal$lambda$1(favoriteEditFragment, pv0Var);
                        return showAddressSearchModal$lambda$1;
                }
            }
        });
    }

    @Override // defpackage.cgp
    public void showDeleteButton() {
        ToolbarComponent toolbarComponent = this.toolbar;
        if (toolbarComponent != null) {
            toolbarComponent.setTrailVisibility(0);
        }
    }

    @Override // defpackage.cgp
    public void showDeleteDialog(Runnable positiveAction) {
        View view = getView();
        if (view != null) {
            view.post(new ce0(view, 15));
        }
        DeleteFavoriteModalView deleteFavoriteModalView = new DeleteFavoriteModalView(requireContext(), getPresenter().M.a().getDatumType() != null);
        deleteFavoriteModalView.setOnDeleteClickListener(positiveAction);
        this.currentDeleteModalView = deleteFavoriteModalView;
        modalViewCoordinator().s(deleteFavoriteModalView, true);
    }

    @Override // defpackage.cgp
    public void showDeleteLoading() {
        DeleteFavoriteModalView deleteFavoriteModalView = this.currentDeleteModalView;
        if (deleteFavoriteModalView != null) {
            deleteFavoriteModalView.startLoading();
        }
    }

    @Override // defpackage.cgp
    public void showHouseMissingDialog() {
        View view = getView();
        if (view != null) {
            view.post(new ce0(view, 15));
        }
        d presenter = getPresenter();
        ((pep0) presenter.J).f(new zsa(16, (jtu) presenter.I.get(), new ru.yandex.taxi.favorites.edit.presenter.c(presenter), new c1o(14, presenter)), new gtu(presenter.M.a().d()), hxx.a);
    }

    @Override // defpackage.cgp
    public void showLoading() {
        setProgressing(true);
        enableInteraction(false);
    }

    @Override // defpackage.cgp
    public void showSaveButton() {
        ShimmeringRobotoTextView shimmeringRobotoTextView = this.saveButton;
        if (shimmeringRobotoTextView != null) {
            shimmeringRobotoTextView.setVisibility(0);
        }
        ShimmeringRobotoTextView shimmeringRobotoTextView2 = this.selectAsDestinationButton;
        if (shimmeringRobotoTextView2 != null) {
            shimmeringRobotoTextView2.setVisibility(8);
        }
    }

    @Override // defpackage.cgp
    public void showSetAsDestinationButton() {
        ShimmeringRobotoTextView shimmeringRobotoTextView = this.saveButton;
        if (shimmeringRobotoTextView != null) {
            shimmeringRobotoTextView.setVisibility(8);
        }
        ShimmeringRobotoTextView shimmeringRobotoTextView2 = this.selectAsDestinationButton;
        if (shimmeringRobotoTextView2 != null) {
            kip kipVar = getPresenter().E;
            shimmeringRobotoTextView2.setVisibility((kipVar.a().f && kipVar.a().b) ? 8 : 0);
        }
    }

    @Override // defpackage.cgp
    public void stopDeleteLoading() {
        DeleteFavoriteModalView deleteFavoriteModalView = this.currentDeleteModalView;
        if (deleteFavoriteModalView != null) {
            deleteFavoriteModalView.stopLoading();
        }
    }

    @Override // defpackage.cgp
    public void stopLoading() {
        setProgressing(false);
        enableInteraction(true);
    }

    @Override // defpackage.cgp
    public void updateAddressItem(String addressTitle, String addressSubtitle, String fullAddress) {
        ListItemComponent listItemComponent = this.addressField;
        if (listItemComponent != null) {
            listItemComponent.setTitle(addressTitle);
        }
        ListItemComponent listItemComponent2 = this.addressField;
        if (listItemComponent2 != null) {
            listItemComponent2.setSubtitle(addressSubtitle);
        }
        final a aVar = this.favoriteMapHolder;
        if (aVar != null) {
            final RobotoTextView robotoTextView = aVar.f;
            robotoTextView.setText(fullAddress);
            robotoTextView.setTextSize(0, tje.r(prg0.favorite_map_preview_title_size_max, robotoTextView.getContext()));
            robotoTextView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: ru.yandex.taxi.favorites.edit.FavoriteMapHolder$autoSizeTitle$1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    if (RobotoTextView.this.getMeasuredWidth() == 0 || RobotoTextView.this.getMeasuredHeight() == 0) {
                        return true;
                    }
                    RobotoTextView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                    a aVar2 = aVar;
                    RobotoTextView robotoTextView2 = RobotoTextView.this;
                    float a = ((yt3) aVar2.n.getValue()).a();
                    boolean z = false;
                    if (a != 0.0f && robotoTextView2.getTextSize() != a) {
                        robotoTextView2.setTextSize(0, a);
                        z = true;
                    }
                    robotoTextView2.setText(((pry0) aVar2.o.getValue()).a(robotoTextView2.getText(), TextMiddleEllipsizer$EllipsizingMode.MIDDLE_ELLIPSE));
                    return !z;
                }
            });
        }
    }
}
