package ru.yandex.taxi.maas.impl.ride.exitchoice;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.go.zone.repository.o;
import defpackage.a3v;
import defpackage.ah00;
import defpackage.atd0;
import defpackage.bo40;
import defpackage.c0g;
import defpackage.co40;
import defpackage.e0g;
import defpackage.el00;
import defpackage.et00;
import defpackage.f100;
import defpackage.gh00;
import defpackage.iqz0;
import defpackage.j7u0;
import defpackage.l8x;
import defpackage.leh;
import defpackage.lr00;
import defpackage.nwf0;
import defpackage.opz0;
import defpackage.pho;
import defpackage.pv0;
import defpackage.pwf0;
import defpackage.r1s;
import defpackage.rjt0;
import defpackage.rqo;
import defpackage.sgu0;
import defpackage.svd0;
import defpackage.tt2;
import defpackage.y000;
import defpackage.z000;
import defpackage.zn40;
import defpackage.zzf;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.fragment.MapFragment;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseStationCardAnalytics$OpenReasonV2;
import ru.yandex.taxi.maas.impl.ride.exitchoice.MaasExitChooseModalView;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 X2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0002YB-\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0010H\u0016¢\u0006\u0004\b%\u0010$J\u000f\u0010&\u001a\u00020\u0010H\u0016¢\u0006\u0004\b&\u0010$J\u000f\u0010'\u001a\u00020\u0010H\u0016¢\u0006\u0004\b'\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010)R\u0018\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010*R\"\u0010,\u001a\u00020+8\u0006@\u0007X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00103\u001a\u0002028\u0006@\u0007X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010:\u001a\u0002098\u0006@\u0007X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010A\u001a\u00020@8\u0006@\u0007X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010H\u001a\u00020G8\u0006@\u0007X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010O\u001a\u00020N8\u0006@\u0007X\u0086.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006Z"}, d2 = {"Lru/yandex/taxi/maas/impl/ride/exitchoice/MaasExitChooseFragment;", "Lru/yandex/taxi/fragment/MapFragment;", "Lz000;", "Le0g;", "", "title", "doneButtonText", "Lj7u0;", "station", "Lru/yandex/taxi/maas/api/analytics/MultiTransportChooseStationCardAnalytics$OpenReasonV2;", "Lru/yandex/taxi/maas/api/analytics/OpenReason;", "openReason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lj7u0;Lru/yandex/taxi/maas/api/analytics/MultiTransportChooseStationCardAnalytics$OpenReasonV2;)V", "Lpv0;", "address", "Lzy11;", "moveCameraToAddress", "(Lpv0;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "()V", "onStop", "onDismissingStart", "onDestroyView", "Ljava/lang/String;", "Lj7u0;", "Lru/yandex/taxi/maas/api/analytics/MultiTransportChooseStationCardAnalytics$OpenReasonV2;", "La3v;", "focusCoordinator", "La3v;", "getFocusCoordinator", "()La3v;", "setFocusCoordinator", "(La3v;)V", "Lru/yandex/taxi/maas/impl/ride/exitchoice/b;", "maasModalViewFactory", "Lru/yandex/taxi/maas/impl/ride/exitchoice/b;", "getMaasModalViewFactory", "()Lru/yandex/taxi/maas/impl/ride/exitchoice/b;", "setMaasModalViewFactory", "(Lru/yandex/taxi/maas/impl/ride/exitchoice/b;)V", "Latd0;", "pointAddressDecoder", "Latd0;", "getPointAddressDecoder", "()Latd0;", "setPointAddressDecoder", "(Latd0;)V", "Lsvd0;", "pointZoneInteractor", "Lsvd0;", "getPointZoneInteractor", "()Lsvd0;", "setPointZoneInteractor", "(Lsvd0;)V", "Lru/yandex/taxi/maas/impl/ride/exitchoice/d;", "exitOverlay", "Lru/yandex/taxi/maas/impl/ride/exitchoice/d;", "getExitOverlay", "()Lru/yandex/taxi/maas/impl/ride/exitchoice/d;", "setExitOverlay", "(Lru/yandex/taxi/maas/impl/ride/exitchoice/d;)V", "Lah00;", "mapController", "Lah00;", "getMapController", "()Lah00;", "setMapController", "(Lah00;)V", "Ll8x;", "pointAddressJob", "Ll8x;", "Companion", "y000", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MaasExitChooseFragment extends MapFragment<z000, e0g> {
    public static final y000 Companion = new y000();
    private static final int DURATION_ZOOM_MS = 300;
    private final String doneButtonText;
    public d exitOverlay;
    public a3v focusCoordinator;
    public b maasModalViewFactory;
    public ah00 mapController;
    private final MultiTransportChooseStationCardAnalytics$OpenReasonV2 openReason;
    public atd0 pointAddressDecoder;
    private l8x pointAddressJob;
    public svd0 pointZoneInteractor;
    private final j7u0 station;
    private final String title;

    private MaasExitChooseFragment(String str, String str2, j7u0 j7u0Var, MultiTransportChooseStationCardAnalytics$OpenReasonV2 multiTransportChooseStationCardAnalytics$OpenReasonV2) {
        this.title = str;
        this.doneButtonText = str2;
        this.station = j7u0Var;
        this.openReason = multiTransportChooseStationCardAnalytics$OpenReasonV2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveCameraToAddress(pv0 address) {
        ((gh00) getMapController()).D(ru.yandex.taxi.map.utils.a.F(address.a.B()), 17.0f, 300.0f, null);
    }

    public static final MaasExitChooseFragment newInstance(String str, String str2, j7u0 j7u0Var, z000 z000Var, MultiTransportChooseStationCardAnalytics$OpenReasonV2 multiTransportChooseStationCardAnalytics$OpenReasonV2) {
        Companion.getClass();
        MaasExitChooseFragment maasExitChooseFragment = new MaasExitChooseFragment(str, str2, j7u0Var, multiTransportChooseStationCardAnalytics$OpenReasonV2, null);
        maasExitChooseFragment.setCallbackListener(z000Var);
        return maasExitChooseFragment;
    }

    public final d getExitOverlay() {
        d dVar = this.exitOverlay;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }

    public final a3v getFocusCoordinator() {
        a3v a3vVar = this.focusCoordinator;
        if (a3vVar != null) {
            return a3vVar;
        }
        return null;
    }

    public final b getMaasModalViewFactory() {
        b bVar = this.maasModalViewFactory;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    public final ah00 getMapController() {
        ah00 ah00Var = this.mapController;
        if (ah00Var != null) {
            return ah00Var;
        }
        return null;
    }

    public final atd0 getPointAddressDecoder() {
        atd0 atd0Var = this.pointAddressDecoder;
        if (atd0Var != null) {
            return atd0Var;
        }
        return null;
    }

    public final svd0 getPointZoneInteractor() {
        svd0 svd0Var = this.pointZoneInteractor;
        if (svd0Var != null) {
            return svd0Var;
        }
        return null;
    }

    @Override // ru.yandex.taxi.fragment.MapFragment, ru.yandex.taxi.fragment.YandexTaxiFragment, ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        e0g injector = injector();
        zzf zzfVar = injector.b;
        this.receiverProvider = zzfVar.Yp;
        c0g c0gVar = injector.c;
        setFocusCoordinator((a3v) c0gVar.Wb.get());
        Context context2 = (Context) c0gVar.U.get();
        a3v a3vVar = (a3v) c0gVar.Wb.get();
        sgu0 sgu0Var = (sgu0) c0gVar.lh.get();
        zzf zzfVar2 = c0gVar.z;
        setMaasModalViewFactory(new b(context2, a3vVar, sgu0Var, new f100(new r1s(29, new zn40((pho) zzfVar2.d0.get()), new bo40((pho) zzfVar2.d0.get()), new co40((pho) zzfVar2.d0.get())))));
        setPointAddressDecoder((atd0) c0gVar.Ac.get());
        setPointZoneInteractor(c0gVar.H6());
        setExitOverlay(new d((ah00) c0gVar.Vb.get(), (Context) c0gVar.U.get(), injector.a, (leh) zzfVar.um.get(), c0gVar.Z5(), (o) zzfVar.q2.get(), (el00) zzfVar.Dc.get(), zzfVar.W0(), (sgu0) c0gVar.lh.get(), zzfVar.A1(), c0gVar.h6(), c0gVar.T5(), (tt2) zzfVar.n.get(), (lr00) c0gVar.oh.get(), (et00) c0gVar.ph.get(), (rqo) zzfVar.C.get(), (opz0) zzfVar.Lb.get(), (iqz0) c0gVar.Ru.get(), (rjt0) zzfVar.Ch.get()));
        setMapController((ah00) c0gVar.Vb.get());
        d exitOverlay = getExitOverlay();
        ArrayList arrayList = this.station.a;
        r0 r0Var = exitOverlay.g0;
        r0Var.getClass();
        r0Var.m(null, arrayList);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FrameLayout frameLayout = new FrameLayout(inflater.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        getExitOverlay().detach();
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment
    public void onDismissingStart() {
        super.onDismissingStart();
        l8x l8xVar = this.pointAddressJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getFocusCoordinator().b8(this);
        getMenuButtonCoordinator().setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        getFocusCoordinator().a0(this);
        getMenuButtonCoordinator().setVisibility(0);
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        nwf0 b = pwf0.b(MaasExitChooseModalView.a.class);
        b maasModalViewFactory = getMaasModalViewFactory();
        String str = this.title;
        String str2 = this.doneButtonText;
        j7u0 j7u0Var = this.station;
        MaasExitChooseModalView.a aVar = (MaasExitChooseModalView.a) b.b;
        MultiTransportChooseStationCardAnalytics$OpenReasonV2 multiTransportChooseStationCardAnalytics$OpenReasonV2 = this.openReason;
        maasModalViewFactory.getClass();
        MaasExitChooseModalView maasExitChooseModalView = new MaasExitChooseModalView(maasModalViewFactory.a, maasModalViewFactory.c, maasModalViewFactory.b, str, str2, j7u0Var, aVar, maasModalViewFactory.d, multiTransportChooseStationCardAnalytics$OpenReasonV2);
        b.a(new a(this, maasExitChooseModalView));
        modalViewCoordinator().s(maasExitChooseModalView, false);
        getExitOverlay().attach();
    }

    public final void setExitOverlay(d dVar) {
        this.exitOverlay = dVar;
    }

    public final void setFocusCoordinator(a3v a3vVar) {
        this.focusCoordinator = a3vVar;
    }

    public final void setMaasModalViewFactory(b bVar) {
        this.maasModalViewFactory = bVar;
    }

    public final void setMapController(ah00 ah00Var) {
        this.mapController = ah00Var;
    }

    public final void setPointAddressDecoder(atd0 atd0Var) {
        this.pointAddressDecoder = atd0Var;
    }

    public final void setPointZoneInteractor(svd0 svd0Var) {
        this.pointZoneInteractor = svd0Var;
    }

    public /* synthetic */ MaasExitChooseFragment(String str, String str2, j7u0 j7u0Var, MultiTransportChooseStationCardAnalytics$OpenReasonV2 multiTransportChooseStationCardAnalytics$OpenReasonV2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j7u0Var, multiTransportChooseStationCardAnalytics$OpenReasonV2);
    }
}
