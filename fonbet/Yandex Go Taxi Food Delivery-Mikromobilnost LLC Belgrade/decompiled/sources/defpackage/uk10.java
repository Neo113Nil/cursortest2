package defpackage;

import android.location.Location;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.core.net.entities.UserData;
import com.yandex.messaging.core.net.entities.UsersData;
import com.yandex.messaging.core.net.entities.proto.message.LocalizationDescriptor;
import com.yandex.messaging.core.net.entities.proto.message.LocalizedData;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.SeenMarkerEntity;
import com.yandex.messaging.internal.view.messagemenu.MessageMenuDialog;
import com.yandex.messaging.internal.view.messagemenu.a;
import com.yandex.mobile.ads.nativeads.NativeAdLoadListener;
import com.yandex.plus.home.feature.webviews.internal.container.modal.ModalViewBehavior;
import com.yandex.xplat.xflags.IncompatibleTypesError;
import com.yandex.xplat.xflags.VariableType;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.masstransit.trains.checkout.i;
import ru.yandex.taxi.masstransit.trains.schedule.c;
import ru.yandex.taxi.masstransit.trains.schedule.e;

/* loaded from: classes15.dex */
public final class uk10 implements bu10, zeo, c3v, ho3, NativeAdLoadListener, hw31, atq0, us51, op30, lb6, ca60, mvo, hr20, zme {
    public static e100 b;
    public Object a;

    public uk10(ufg ufgVar) {
        new ea20(ufgVar, "flutter/mousecursor", wzt0.b, null).b(new xl10(this));
    }

    @Override // defpackage.go3
    public void D(Object obj) {
        LinkedHashMap linkedHashMap;
        UsersData usersData = (UsersData) obj;
        aj20 aj20Var = (aj20) this.a;
        aj20Var.f = null;
        l020 C = aj20Var.b.C();
        try {
            for (UserData userData : usersData.users) {
                C.P0(userData);
            }
            C.s();
            C.close();
            if (((iv21) aj20Var.d.get()).c) {
                v5z v5zVar = aj20Var.c;
                z5z z5zVar = v5zVar.a;
                for (UserData userData2 : usersData.users) {
                    UserData.LocalizationDescriptor localizationDescriptor = userData2.localizationDescriptor;
                    if (localizationDescriptor != null) {
                        LocalizationDescriptor localizationDescriptor2 = new LocalizationDescriptor(localizationDescriptor.version, localizationDescriptor.defaultLang, localizationDescriptor.langs);
                        hv21 a = ((cv21) z5zVar.b.getValue()).a(userData2.userId);
                        LocalizationDescriptor localizationDescriptor3 = a != null ? a.c : null;
                        if (localizationDescriptor3 == null || localizationDescriptor3.getVersion() <= localizationDescriptor2.getVersion()) {
                            Map<String, UserData.LocalizedData> map = userData2.localizationMap;
                            if (map != null) {
                                linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
                                Iterator<T> it = map.entrySet().iterator();
                                while (it.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it.next();
                                    linkedHashMap.put(entry.getKey(), new LocalizedData(((UserData.LocalizedData) entry.getValue()).displayName, ((UserData.LocalizedData) entry.getValue()).avatarId));
                                }
                            } else {
                                linkedHashMap = null;
                            }
                            if (linkedHashMap == null) {
                                v5zVar.b.c("localizationMap must be if localizationDescriptor exists", "userId", userData2.userId);
                            } else {
                                ((cv21) z5zVar.b.getValue()).c(new hv21(userData2.userId, true, localizationDescriptor2, linkedHashMap));
                            }
                        }
                    }
                }
            }
            aj20Var.a(EmptyList.a);
        } finally {
        }
    }

    @Override // defpackage.atq0
    public Object a(byte[] bArr) {
        try {
            return ((Moshi) this.a).adapter(SeenMarkerEntity.class).fromJson(new String(bArr, Charset.defaultCharset()));
        } catch (IOException unused) {
            throw new RuntimeException();
        }
    }

    @Override // defpackage.atq0
    public byte[] b(Object obj) {
        return ((Moshi) this.a).adapter(SeenMarkerEntity.class).toJson(obj).getBytes(Charset.defaultCharset());
    }

    @Override // defpackage.ho3
    /* renamed from: c */
    public boolean mo103c(int i) {
        ((aj20) this.a).f = null;
        return false;
    }

    @Override // defpackage.bu10
    public void close() {
        MessageMenuDialog messageMenuDialog = ((a) this.a).A;
        if (messageMenuDialog != null) {
            messageMenuDialog.close();
        }
    }

    @Override // defpackage.mvo
    public b231 d(Map map) {
        VariableType variableType = ((mvo) this.a).d(map).a;
        VariableType variableType2 = VariableType.Boolean;
        if (variableType == variableType2) {
            return new ia6(!r1.c());
        }
        throw new IncompatibleTypesError(variableType, variableType2);
    }

    @Override // defpackage.lb6
    public void e(int i) {
        ((vn40) this.a).c0(i);
    }

    public View f(ListItemComponent listItemComponent, lj10 lj10Var) {
        View inflateTrailView = listItemComponent.inflateTrailView(rqh0.menu_messages_badge_container);
        mj10 mj10Var = (mj10) this.a;
        int r = tje.r(urg0.support_messages_badge_size, listItemComponent.getContext());
        View b2 = ((nj10) mj10Var).b(lj10Var);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(r, r);
        layoutParams.gravity = 16;
        b2.setLayoutParams(layoutParams);
        ((FrameLayout) inflateTrailView).addView(b2);
        int r2 = tje.r(mrg0.go_design_s_space, listItemComponent.getContext());
        ViewGroup.LayoutParams layoutParams2 = b2.getLayoutParams();
        FrameLayout.LayoutParams layoutParams3 = layoutParams2 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams2 : null;
        if (layoutParams3 != null) {
            layoutParams3.setMargins(r2, r2, r2, r2);
        }
        return inflateTrailView;
    }

    public ts51 g() {
        return ((sj30) this.a).c;
    }

    @Override // defpackage.hr20
    public String get(String str) {
        return ((kvj0) this.a).y.a(str);
    }

    @Override // defpackage.bu10
    public void goBack() {
        a aVar = (a) this.a;
        boolean z = aVar.M;
        MessageMenuDialog messageMenuDialog = aVar.A;
        if (z) {
            if (messageMenuDialog != null) {
                messageMenuDialog.close();
            }
        } else if (messageMenuDialog != null) {
            messageMenuDialog.goBack();
        }
    }

    public void h(bb01 bb01Var) {
        e eVar = (e) this.a;
        zg40 zg40Var = ((sg40) eVar.S.h.getValue()).a;
        eVar.D((i) eVar.M.get(), new gb40(bb01Var.h.toString(), 8, zg40Var.b, zg40Var.c, zg40Var.a, bb01Var.m), new av30(eVar, 1));
    }

    public void i(oh40 oh40Var) {
        e eVar = (e) this.a;
        eVar.D((m950) eVar.L.get(), oh40Var, new c(eVar));
    }

    public void j(String str) {
        o61 o61Var = (o61) this.a;
        int hashCode = str.hashCode();
        if (hashCode == -1538217009) {
            if (str.equals("tariffs")) {
                o61Var.getClass();
                o61Var.a.a("menu.tariffs", new HashMap(), 1, new HashMap());
                return;
            }
            return;
        }
        if (hashCode == 92611469) {
            if (str.equals("about")) {
                o61Var.getClass();
                o61Var.a.a("menu.about", new HashMap(), 1, new HashMap());
                return;
            }
            return;
        }
        if (hashCode == 106437065 && str.equals("parks")) {
            o61Var.getClass();
            o61Var.a.a("menu.parks", new HashMap(), 1, new HashMap());
        }
    }

    @Override // defpackage.hw31
    public n751 k(View view, n751 n751Var, iw31 iw31Var) {
        ModalViewBehavior modalViewBehavior = (ModalViewBehavior) this.a;
        modalViewBehavior.E = n751Var.a.i().d;
        modalViewBehavior.K();
        return n751Var;
    }

    @Override // defpackage.zme
    public Object l(Object obj) {
        return Optional.ofNullable(((zme) this.a).l((rvj0) obj));
    }

    @Override // defpackage.zeo
    public void onCancel(Object obj) {
        yxf0 yxf0Var = ((qm31) this.a).a;
        yxf0Var.a = null;
        yxf0Var.w();
    }

    @Override // defpackage.bu10
    public void onExpandReactionsChoose() {
        final rai0 rai0Var;
        final a aVar = (a) this.a;
        View view = aVar.E;
        if (((zxo) aVar.z.get()).c && (rai0Var = aVar.N) != null) {
            if (view.isLaidOut() && view.getHeight() > 0) {
                a.v(aVar, rai0Var);
            } else if (!view.isLaidOut() || view.isLayoutRequested()) {
                view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.messaging.internal.view.messagemenu.MessageMenuBrick$showExpandedReactions$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        view2.removeOnLayoutChangeListener(this);
                        a.v(a.this, rai0Var);
                    }
                });
            } else {
                a.v(aVar, rai0Var);
            }
        }
    }

    @Override // defpackage.zeo
    public void onListen(Object obj, xeo xeoVar) {
        yj70 yj70Var = new yj70((yeo) xeoVar);
        yxf0 yxf0Var = ((qm31) this.a).a;
        yxf0Var.a = yj70Var;
        yxf0Var.w();
    }

    @Override // defpackage.c3v
    public void onLocationChanged(Location location) {
        ((ht10) ((c9v) this.a).b).c = location;
    }

    @Override // defpackage.bu10
    public void onPublicReactionListChosen(ServerMessageRef serverMessageRef, int i) {
    }

    public uk10(rqo rqoVar) {
        this.a = ((jbh) rqoVar).f(SimplePersistentBooleanExperiment.MULTIORDER_ADDRESS_PICKER);
    }

    public /* synthetic */ uk10(Object obj) {
        this.a = obj;
    }
}
