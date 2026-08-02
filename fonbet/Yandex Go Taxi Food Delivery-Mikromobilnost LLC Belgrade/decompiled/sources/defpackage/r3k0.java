package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.Surface;
import android.view.View;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.view.l;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.DirectExecutor;
import com.yandex.div.legacy.view.tab.TabsLayout;
import com.yandex.go.feed.global.div.custom.slide_to_confirm.SlideToConfirmDivViewHolder;
import com.yandex.go.payments.shared.y;
import com.yandex.go.superapp.api.repository.SuperAppRecenterPointRepository$Type;
import com.yandex.go.taxi.order.details.v2.ui.view.item.driver.RideCardDriverSectionView;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.b0;
import com.yandex.go.taxi.order.robotaxi.ui.RobotaxiModalView;
import com.yandex.go.vault.ui.VaultStoreErrorView;
import com.yandex.messaging.input.b;
import com.yandex.messaging.internal.view.stickers.panel.a;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.common.domain.entities.BottomBarItemId;
import com.ybsdk.core.transfer.utils.domain.entities.TransferType;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.core.utils.ext.ViewState;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.cashback.impl.entities.CashbackSelectorCategoryEntity;
import com.ybsdk.feature.transfer.version2.api.TransferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics;
import com.ybsdk.feature.transfer.version2.api.TransferRemoteConfig$DashboardTopButton$Type;
import com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation.TransfersDashboardScreenParams;
import com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation.TransfersDashboardSlideableView$State$Loading$SkeletonType;
import com.ybsdk.network.dto.CreateApplicationWithProductJsonAdapter;
import com.ybsdk.rconfig.configs.TransfersDashboardBottomSheetConfig;
import com.ybsdk.widgets.common.OperationProgressView;
import com.ybsdk.widgets.common.checkbox.CheckBoxView;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import kotlin.Pair;
import kotlinx.serialization.KSerializer;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.surge.dialog.selector.SelectorModalView;
import ru.yandex.taxi.transition.c;

/* loaded from: classes3.dex */
public final /* synthetic */ class r3k0 implements u3k0, t3k0, jkz0, eps0, odv, qur, z3q0, xz60, y80, sbu0, ffb, u1d0, el7, aa3, nl21, zbv, ev31, bx60, ay31 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r3k0(ro01 ro01Var, mjt0 mjt0Var, TransfersDashboardScreenParams transfersDashboardScreenParams) {
        this.a = 24;
        this.b = ro01Var;
        this.c = transfersDashboardScreenParams;
    }

    @Override // defpackage.nl21
    public void B(o0k o0kVar) {
        h9z0 h9z0Var = (h9z0) this.b;
        String str = (String) this.c;
        Drawable drawable = o0kVar.b;
        HashMap hashMap = h9z0Var.m;
        Drawable drawable2 = (Drawable) hashMap.get(str);
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        drawable.setCallback(h9z0Var.o);
        hashMap.put(str, drawable);
        h9z0Var.n.put(str, o0kVar.a);
        RecyclerView recyclerView = h9z0Var.b.a;
        if (recyclerView != null) {
            recyclerView.invalidate();
        }
    }

    @Override // defpackage.u3k0
    public void a(int[] iArr) {
        v3k0 v3k0Var = (v3k0) this.b;
        String substring = ((String) this.c).substring(iArr[2] + 1, iArr[3]);
        Matcher matcher = jl41.a.matcher(substring);
        if (matcher.find() && matcher.start() == 0 && matcher.end() == substring.length()) {
            for (int i : iArr) {
                int[] iArr2 = v3k0Var.g;
                iArr2[i] = iArr2[i] | 1;
            }
            int i2 = iArr[1];
            for (int i3 = iArr[0] + 1; i3 < i2; i3++) {
                v3k0Var.g[i3] = 0;
            }
            v3k0Var.d(iArr[0], iArr[1], 1, 16);
            v3k0Var.d(iArr[2], iArr[3], 0, 32);
            v3k0Var.b.add(substring);
        }
    }

    @Override // defpackage.aa3
    public euy apply(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 16:
                ArrayList arrayList = (ArrayList) obj2;
                List list = (List) obj;
                ((d1x0) obj3).toString();
                Objects.toString(list);
                sgb1.g(3, "SyncCaptureSessionBase");
                return list.isEmpty() ? new hiv(1, new IllegalArgumentException("Unable to open capture session without surfaces")) : list.contains(null) ? new hiv(1, new DeferrableSurface.SurfaceClosedException("Surface closed", (DeferrableSurface) arrayList.get(list.indexOf(null)))) : ni91.f(list);
            default:
                ArrayList arrayList2 = (ArrayList) obj2;
                ykn0 ykn0Var = ((cx31) obj3).c;
                Integer num = (Integer) ((s38) arrayList2.get(0)).b.g(s38.j, 100);
                Objects.requireNonNull(num);
                int intValue = num.intValue();
                Integer num2 = (Integer) ((s38) arrayList2.get(0)).b.g(s38.i, 0);
                Objects.requireNonNull(num2);
                int intValue2 = num2.intValue();
                cjw0 cjw0Var = ((iru0) ykn0Var.b).u;
                return cjw0Var != null ? ((DefaultSurfaceProcessor) cjw0Var.a).snapshot(intValue, intValue2) : new hiv(1, new Exception("Failed to take picture: pipeline is not ready."));
        }
    }

    @Override // defpackage.ffb
    public void b(CheckBoxView checkBoxView, boolean z) {
        CashbackSelectorCategoryEntity cashbackSelectorCategoryEntity = (CashbackSelectorCategoryEntity) this.b;
        lav0 lav0Var = (lav0) this.c;
        if (cashbackSelectorCategoryEntity.isSelected()) {
            return;
        }
        lav0Var.b.invoke(cashbackSelectorCategoryEntity, Boolean.valueOf(z));
    }

    public ArrayList c() {
        tdl tdlVar = (tdl) this.b;
        TabsLayout tabsLayout = (TabsLayout) this.c;
        ArrayList arrayList = new ArrayList(tdlVar.F.size());
        Iterator it = tdlVar.F.iterator();
        while (it.hasNext()) {
            arrayList.add(new w5x0((sdl) it.next(), tabsLayout.getResources().getDisplayMetrics()));
        }
        return arrayList;
    }

    public void d(Long l, boolean z) {
        ((RideCardDriverSectionView) this.b).contentUpdate((ygk0) this.c, z, l);
    }

    @Override // defpackage.t3k0
    public Object e() {
        v3k0 v3k0Var = (v3k0) this.b;
        llt0 llt0Var = (llt0) this.c;
        String str = (String) v3k0Var.b.poll();
        Objects.requireNonNull(str);
        return llt0Var.x(if90.c(str), false);
    }

    @Override // defpackage.zbv
    public rbv g(Context context, int i, int i2) {
        String str = (String) this.c;
        String str2 = (String) this.b;
        bcv bcvVar = new bcv(cxv.a(context, i, i2, str));
        return new pbv((dcv) bcvVar, (dcv) bcvVar, (tev) rev.d, (vfv) h2b1.G, str2, false);
    }

    @Override // defpackage.u1d0
    public void h(w7o w7oVar) {
        h6w0 h6w0Var = (h6w0) this.b;
        gcn gcnVar = (gcn) this.c;
        yrv0 yrv0Var = h6w0Var.c;
        boolean z = w7oVar.a;
        h1p h1pVar = h6w0Var.d;
        i d = ((j) yrv0Var.a).d("Superapp.Showcase.EatsAttemptSubscribePlus");
        LinkedHashMap linkedHashMap = d.a;
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, z ? "purchased" : "purchaseFailed");
        linkedHashMap.put(Constants.KEY_SERVICE, h1pVar.getValue());
        d.m();
        gcnVar.a(new ck7(z ? new ljd0(true) : new ljd0(false), null));
    }

    @Override // defpackage.sbu0
    public void i(String str, String str2) {
        e1w e1wVar;
        a aVar = (a) this.b;
        SharedPreferences sharedPreferences = (SharedPreferences) this.c;
        yfa yfaVar = aVar.C;
        if (yfaVar != null && (e1wVar = ((b) yfaVar.a).s) != null) {
            e1wVar.i(str, str2);
        }
        sharedPreferences.edit().putInt("emoji_sticker_current_position", 1).apply();
    }

    @Override // defpackage.el7
    public Object j(androidx.concurrent.futures.b bVar) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 15:
                ((AtomicReference) obj).set(bVar);
                return "SurfaceRequest-surface-recreation(" + ((znw0) obj2).hashCode() + Extension.C_BRAKE;
            case 20:
                l lVar = (l) obj2;
                Surface surface = (Surface) obj;
                sgb1.g(3, "TextureViewImpl");
                lVar.h.b(surface, geb1.b(), new k9b(17, bVar));
                return "provideSurface[request=" + lVar.h + " surface=" + surface + "]";
            default:
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                bVar.a(new jy31(9, atomicBoolean), DirectExecutor.INSTANCE);
                ((Executor) obj2).execute(new hpo0(26, atomicBoolean, bVar, (sls) obj));
                return zy11.a;
        }
    }

    @Override // defpackage.qur
    public void k(ArrayList arrayList) {
        x6o0 x6o0Var = (x6o0) this.b;
        x6o0Var.g.put(((zuo0) this.c).getSessionId(), arrayList);
        x6o0Var.d.c(SuperAppRecenterPointRepository$Type.SCOOTERS, tcc.o(x6o0Var.g.values()));
    }

    @Override // defpackage.xz60
    public void l(int i, int i2, int i3, boolean z) {
        SelectorModalView.render$lambda$0$0((SelectorModalView) this.b, (tlq0) this.c, i, i2, i3, z);
    }

    @Override // defpackage.jkz0
    public void m(pkz0 pkz0Var) {
        b0 b0Var = (b0) this.b;
        b0Var.S.a(((fpk0) pkz0Var).e, (wrs0) this.c);
    }

    @Override // defpackage.y80
    public boolean n(String str) {
        y yVar = (y) this.b;
        List list = (List) this.c;
        if (str != null) {
            list.add(str);
        }
        c cVar = yVar.c.a().c;
        x43 x43Var = cVar.c;
        if (cVar.e != null || x43Var.isEmpty()) {
            return true;
        }
        cVar.b((av31) x43Var.removeLast(), 0);
        yu31 yu31Var = cVar.k;
        if (yu31Var.d <= 0) {
            return true;
        }
        yu31Var.a();
        return true;
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 n751Var) {
        n751 lambda$0$0$4;
        lambda$0$0$4 = VaultStoreErrorView.lambda$0$0$4((u2y) this.b, (VaultStoreErrorView) this.c, view, n751Var);
        return lambda$0$0$4;
    }

    @Override // defpackage.eps0
    public void p(int i, long j) {
        int i2 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i2) {
            case 4:
                RobotaxiModalView.createSlider$lambda$0$0$0((RobotaxiModalView) obj2, (fvk0) obj, i, j);
                break;
            default:
                SlideToConfirmDivViewHolder.bind$lambda$0$0((SlideToConfirmDivViewHolder) obj2, (v3k) obj, i, j);
                break;
        }
    }

    @Override // defpackage.ev31
    public Object q(Object obj) {
        String str;
        qc70 lVar;
        com.ybsdk.core.utils.text.b bVar;
        int i;
        qc70 qc70Var;
        q451 q451Var;
        q451 q451Var2;
        q451 q451Var3;
        ColorModel attr;
        ColorModel attr2;
        ColorModel attr3;
        ColorModel attr4;
        ColorModel attr5;
        ColorModel attr6;
        ss01 ss01Var;
        uv01 uv01Var;
        uv01 uv01Var2;
        q4u q4uVar;
        Uri uri;
        String description;
        String error;
        int i2 = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i2) {
            case 23:
                us01 us01Var = (us01) obj3;
                Context context = (Context) obj2;
                ns01 ns01Var = (ns01) obj;
                String str2 = ns01Var.j;
                String str3 = ns01Var.i;
                rbv rbvVar = ns01Var.b;
                us01Var.getClass();
                String str4 = ns01Var.h;
                rbv rbvVar2 = ns01Var.m;
                Text text = ns01Var.l;
                Text text2 = ns01Var.k;
                int i3 = ts01.a[ns01Var.g.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        return new ss01(us01.b(text2, text, rbvVar2), rbvVar, pc70.a, new wty0(w530.a(us01Var.a, ns01Var.e, ns01Var.f, false, null, false, 60), o1i0.YbSdkTransferTitleNumbersStyle), new wty0(str3, o1i0.YbSdkTransferMessageTextStyle), str2, (Text.Resource) null, 192);
                    }
                    if (i3 == 3) {
                        stz0 b = us01.b(text2, text, rbvVar2);
                        com.ybsdk.widgets.common.l lVar2 = new com.ybsdk.widgets.common.l(OperationProgressView.StatusIcon.TIMEOUT);
                        if (evu0.J(str4)) {
                            com.ybsdk.core.utils.text.b bVar2 = Text.Companion;
                            int i4 = dzh0.ybsdk_transfer_transfer_delay_title;
                            bVar2.getClass();
                            str4 = d.a(context, new Text.Resource(i4)).toString();
                        }
                        ss01Var = new ss01(b, rbvVar, lVar2, new wty0(str4, l1i0.Widget_YB_Text_Headline2), new wty0(us01Var.a(ns01Var, context), o1i0.YbSdkTransferMessageTextStyle, ung0.ybColor_textIcon_secondary), "", unr0.h(Text.Companion, dzh0.ybsdk_transfer_button_agree), 128);
                    } else if (i3 == 4 || i3 == 5) {
                        stz0 b2 = us01.b(text2, text, rbvVar2);
                        com.ybsdk.widgets.common.l lVar3 = new com.ybsdk.widgets.common.l(OperationProgressView.StatusIcon.ERROR);
                        if (evu0.J(str4)) {
                            com.ybsdk.core.utils.text.b bVar3 = Text.Companion;
                            int i5 = dzh0.ybsdk_transfer_default_error;
                            bVar3.getClass();
                            str4 = d.a(context, new Text.Resource(i5)).toString();
                        }
                        ss01Var = new ss01(b2, rbvVar, lVar3, new wty0(str4, l1i0.Widget_YB_Text_Headline2), new wty0(us01Var.a(ns01Var, context), o1i0.YbSdkTransferMessageTextStyle, ung0.ybColor_textIcon_secondary), "", unr0.h(Text.Companion, dzh0.ybsdk_transfer_button_try_again), 128);
                    } else {
                        w511.b();
                    }
                    return ss01Var;
                }
                TransferType transferType = ns01Var.n;
                int[] iArr = ts01.b;
                int i6 = iArr[transferType.ordinal()];
                if (i6 == 1) {
                    str = "−";
                } else if (i6 == 2) {
                    str = "";
                } else {
                    w511.b();
                }
                String j = b64.j(str, w530.a(us01Var.a, ns01Var.e, ns01Var.f, false, null, false, 60));
                stz0 b3 = us01.b(text2, text, rbvVar2);
                wty0 wty0Var = new wty0(j, o1i0.YbSdkTransferTitleNumbersStyle);
                wty0 wty0Var2 = new wty0(str3, o1i0.YbSdkTransferMessageTextStyle);
                int i7 = iArr[transferType.ordinal()];
                if (i7 == 1) {
                    lVar = new com.ybsdk.widgets.common.l(OperationProgressView.StatusIcon.SUCCESS);
                } else if (i7 == 2) {
                    lVar = oc70.a;
                } else {
                    w511.b();
                }
                int i8 = iArr[transferType.ordinal()];
                if (i8 == 1) {
                    bVar = Text.Companion;
                    i = dzh0.ybsdk_transfer_button_done;
                } else if (i8 == 2) {
                    bVar = Text.Companion;
                    i = dzh0.ybsdk_transfer_button_agree;
                } else {
                    w511.b();
                }
                Text.Resource h = unr0.h(bVar, i);
                mw3 mw3Var = ns01Var.o;
                if (mw3Var != null) {
                    boolean z = ns01Var.p;
                    Boolean bool = mw3Var.d;
                    kw3 kw3Var = mw3Var.k;
                    String str5 = mw3Var.c;
                    lw3 lw3Var = mw3Var.i;
                    String str6 = mw3Var.b;
                    if (str6 == null || str5 == null) {
                        qc70Var = lVar;
                        q451Var2 = null;
                        x4c.g("Inconsistent auto topup widget", null, "Title or/and description was not provided", null, 10);
                    } else {
                        if (kw3Var != null) {
                            Text.Constant i9 = g8e.i(Text.Companion, str6);
                            Text.Constant constant = new Text.Constant(str5);
                            rbv rbvVar3 = lw3Var != null ? lw3Var.d : null;
                            if (lw3Var == null || (attr4 = lw3Var.c) == null) {
                                attr4 = new ColorModel.Attr(ung0.ybColor_fill_default_100);
                            }
                            ColorModel colorModel = attr4;
                            if (lw3Var == null || (attr5 = lw3Var.a) == null) {
                                attr5 = new ColorModel.Attr(ung0.ybColor_textIcon_primary);
                            }
                            ColorModel colorModel2 = attr5;
                            if (lw3Var == null || (attr6 = lw3Var.b) == null) {
                                attr6 = new ColorModel.Attr(ung0.ybColor_textIcon_primary);
                            }
                            q451Var3 = new o451(new r451(i9, constant, rbvVar3, z, colorModel, colorModel2, attr6, lw3Var != null ? lw3Var.e : null, lw3Var != null ? lw3Var.f : null, new Text.Constant(kw3Var.a)));
                            qc70Var = lVar;
                        } else if (bool != null) {
                            Text.Constant i10 = g8e.i(Text.Companion, str6);
                            Text.Constant constant2 = new Text.Constant(str5);
                            rbv rbvVar4 = lw3Var != null ? lw3Var.d : null;
                            if (lw3Var == null || (attr = lw3Var.c) == null) {
                                attr = new ColorModel.Attr(ung0.ybColor_fill_default_100);
                            }
                            ColorModel colorModel3 = attr;
                            if (lw3Var == null || (attr2 = lw3Var.a) == null) {
                                attr2 = new ColorModel.Attr(ung0.ybColor_textIcon_primary);
                            }
                            ColorModel colorModel4 = attr2;
                            if (lw3Var == null || (attr3 = lw3Var.b) == null) {
                                attr3 = new ColorModel.Attr(ung0.ybColor_textIcon_primary);
                            }
                            ColorModel colorModel5 = attr3;
                            ColorModel.Attr attr7 = new ColorModel.Attr(ung0.ybColor_fill_default_400);
                            ViewState viewState = ViewState.CHECKED;
                            ViewState viewState2 = ViewState.ENABLED;
                            qc70Var = lVar;
                            vbb vbbVar = new vbb(attr7, new ViewState[]{viewState, viewState2});
                            ColorModel.Attr attr8 = new ColorModel.Attr(ung0.ybColor_fill_default_200);
                            ViewState viewState3 = ViewState.DISABLED;
                            q451Var3 = new p451(new s451(i10, constant2, rbvVar4, bool.booleanValue(), z, colorModel3, colorModel4, colorModel5, new p1b(new vbb[]{vbbVar, new vbb(attr8, new ViewState[]{viewState, viewState3}), new vbb(new ColorModel.Attr(ung0.ybColor_fill_default_300), new ViewState[]{ViewState.UNCHECKED, viewState2}), new vbb(new ColorModel.Attr(ung0.ybColor_fill_default_200), new ViewState[]{viewState3})}), true));
                        } else {
                            qc70Var = lVar;
                            q451Var2 = null;
                            x4c.g("Inconsistent auto topup widget", null, "Button and Enabled are null at same time", null, 10);
                        }
                        q451Var = q451Var3;
                    }
                    q451Var3 = q451Var2;
                    q451Var = q451Var3;
                } else {
                    qc70Var = lVar;
                    q451Var = null;
                }
                return new ss01(b3, rbvVar, qc70Var, wty0Var, wty0Var2, str2, h, q451Var);
                return null;
            default:
                vv01 vv01Var = (vv01) obj;
                String tokenizationProductId = ((TransfersDashboardScreenParams) obj2).getTokenizationProductId();
                boolean z2 = vv01Var.e;
                boolean z3 = vv01Var.d;
                qu01 qu01Var = (qu01) ((ro01) obj3);
                rb6 c = qu01Var.f() ? null : fab1.c(vv01Var.a, BottomBarItemId.PAY);
                Integer num = vv01Var.c;
                ue6 ue6Var = vv01Var.b;
                if (ue6Var instanceof te6) {
                    u8j0 u8j0Var = ((te6) ue6Var).a;
                    if (u8j0Var instanceof s8j0) {
                        Throwable th = ((s8j0) u8j0Var).a;
                        FailDataException failDataException = th instanceof FailDataException ? (FailDataException) th : null;
                        io01 entity = ((TransfersDashboardBottomSheetConfig) qu01Var.b.d(dv01.a).getData()).toEntity();
                        uv01Var = new qv01(new ev01(entity.a, (failDataException == null || (error = failDataException.getError()) == null) ? entity.b : new Text.Constant(error), (failDataException == null || (description = failDataException.getDescription()) == null) ? entity.c : new Text.Constant(description), entity.d));
                    } else if (u8j0Var instanceof t8j0) {
                        uv01Var = new sv01(TransfersDashboardSlideableView$State$Loading$SkeletonType.WITH_WIDGET);
                    } else {
                        if (!(u8j0Var instanceof r8j0)) {
                            w511.b();
                            return null;
                        }
                        uv01Var2 = new tv01((rr51) ((r8j0) u8j0Var).a);
                    }
                    uv01Var2 = uv01Var;
                } else {
                    if (!ue6Var.equals(bei.y)) {
                        w511.b();
                        return null;
                    }
                    uv01Var = rv01.a;
                    uv01Var2 = uv01Var;
                }
                ArrayList a = qu01Var.a();
                ArrayList arrayList = new ArrayList();
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((jo01) next).e != TransferRemoteConfig$DashboardTopButton$Type.NFC || z3 || z2) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    jo01 jo01Var = (jo01) it2.next();
                    if (jo01Var.e == TransferRemoteConfig$DashboardTopButton$Type.NFC) {
                        Pair pair = new Pair(sd90.h(jo01Var.b, CreateApplicationWithProductJsonAdapter.productKey, tokenizationProductId), TransferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics.PAYMENT);
                        Uri uri2 = (Uri) pair.getFirst();
                        TransferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics transferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics = (TransferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics) pair.getSecond();
                        Pair pair2 = (z3 || (uri = jo01Var.c) == null) ? new Pair(uri2, transferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics) : z2 ? new Pair(sd90.h(uri, CreateApplicationWithProductJsonAdapter.productKey, tokenizationProductId), TransferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics.TOKENIZATION) : new Pair(uri2, transferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics);
                        jo01Var = new jo01(jo01Var.a, (Uri) pair2.getFirst(), jo01Var.c, (TransferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics) pair2.getSecond(), jo01Var.e);
                    }
                    arrayList2.add(jo01Var);
                }
                mo01 b4 = qu01Var.b();
                if (b4 != null) {
                    Text text3 = b4.b;
                    ArrayList<lo01> arrayList3 = b4.c;
                    ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
                    for (lo01 lo01Var : arrayList3) {
                        arrayList4.add(new n4u(lo01Var.a, lo01Var.b, lo01Var.c, lo01Var.d));
                    }
                    q4uVar = new q4u(text3, arrayList4);
                } else {
                    q4uVar = null;
                }
                return new zv01(c, uv01Var2, num, arrayList2, vv01Var.f ? q4uVar : null);
        }
    }

    @Override // defpackage.odv
    public void r(pdv pdvVar) {
        ((odv) this.c).r((mdl0) this.b);
    }

    @Override // defpackage.dtq0
    public KSerializer select(String str) {
        return str.equals("DebugSection") ? pwg.Companion.serializer() : ((gzp0) this.b).a.select((String) this.c);
    }

    public /* synthetic */ r3k0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ r3k0(String str, String str2) {
        this.a = 22;
        this.c = str;
        this.b = str2;
    }
}
