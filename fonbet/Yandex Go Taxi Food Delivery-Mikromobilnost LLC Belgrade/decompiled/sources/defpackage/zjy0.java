package defpackage;

import android.content.Context;
import android.text.Spannable;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.ui.semantics.f;
import com.samsung.android.sdk.samsungpay.v2.card.Card;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import com.yandex.go.compose.ComposeContentKt$ContentImpl$scope$1$1$action$1;
import com.yandex.go.navigator.experiment.NavigatorLanguageSettingAvailabilityExperiment;
import com.yandex.go.navigator.settings.voice_settings.c;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.interactor.q;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.TransportSelectorOptionDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.TransportSelectorPayloadDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ui.transport_type_selector.TransportTypeSelectorUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ui.transport_type_selector.b;
import com.yandex.go.user_profile.main_menu.profile.models.UserProfileStyle;
import com.yandex.mapkit.navigation.automotive.TrafficLightsController;
import com.yandex.mapkit.transport.masstransit.Route;
import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.core.transfer.utils.domain.entities.UnconditionalLimitWidgetEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.transfer.version2.api.entities.TransferResultPageEntity;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType;
import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.a;
import com.ybsdk.screens.upgrade.presentation.edit.UpgradeEditFragment;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.g;
import defpackage.ac31;
import defpackage.agd;
import defpackage.bgd;
import defpackage.bts;
import defpackage.dd31;
import defpackage.did;
import defpackage.fid;
import defpackage.ge31;
import defpackage.je31;
import defpackage.kf91;
import defpackage.o430;
import defpackage.tfx;
import defpackage.tje;
import defpackage.tls;
import defpackage.wls;
import defpackage.xfd;
import defpackage.yfd;
import defpackage.zpn;
import defpackage.zy11;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.communications.api.dto.BannerWidgets;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;

/* loaded from: classes10.dex */
public final /* synthetic */ class zjy0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ zjy0(KeyCommand keyCommand, dny0 dny0Var, Ref$BooleanRef ref$BooleanRef) {
        this.a = 3;
        this.c = keyCommand;
        this.w = dny0Var;
        this.b = ref$BooleanRef;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x053d  */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ik2 ik2Var;
        Integer d;
        Integer e;
        Integer e2;
        Integer d2;
        dry0 dry0Var;
        dry0 dry0Var2;
        ery0 ery0Var;
        ery0 ery0Var2;
        Integer d3;
        Integer e3;
        Integer e4;
        Integer d4;
        dry0 dry0Var3;
        dry0 dry0Var4;
        ery0 ery0Var3;
        ery0 ery0Var4;
        hoy0 hoy0Var;
        kcz0 kcz0Var;
        hoy0 hoy0Var2;
        m031 m031Var;
        u031 u031Var;
        ActionButtonEntity actionButtonEntity;
        String str;
        String str2;
        String str3;
        SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType selectedTransferSubject$CrossBorderByPhone$PriorityMoneyType;
        BigDecimal amount;
        Spannable a;
        sh5 stateManager;
        sh5 stateManager2;
        sh5 stateManager3;
        g render$lambda$9$lambda$7;
        int i = this.a;
        int i2 = 4;
        int i3 = 9;
        int i4 = 0;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.w;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj4;
                ik2 ik2Var2 = (ik2) obj3;
                bmt0 bmt0Var = (bmt0) obj2;
                ik2 ik2Var3 = (ik2) obj;
                if (ref$BooleanRef.element) {
                    Object obj5 = ik2Var3.a;
                    int i5 = ik2Var3.c;
                    int i6 = ik2Var3.b;
                    if ((obj5 instanceof bmt0) && i6 == ik2Var2.b && i5 == ik2Var2.c) {
                        if (bmt0Var == null) {
                            bmt0Var = new bmt0(0L, 0L, (lzr) null, (hzr) null, (izr) null, (eyr) null, (String) null, 0L, (td5) null, (soy0) null, (k5z) null, 0L, (rly0) null, (bgr0) null, 65535);
                        }
                        ik2Var = new ik2(bmt0Var, i6, i5);
                        ref$BooleanRef.element = ik2Var2.equals(ik2Var3);
                        break;
                    }
                }
                ik2Var = ik2Var3;
                ref$BooleanRef.element = ik2Var2.equals(ik2Var3);
                break;
            case 1:
                tls tlsVar = (tls) obj3;
                xpy0 xpy0Var = (xpy0) ((Ref$ObjectRef) obj2).element;
                hoy0 a2 = ((jnn) obj4).a((List) obj);
                if (xpy0Var != null) {
                    xpy0Var.a(null, a2);
                }
                tlsVar.invoke(a2);
                break;
            case 2:
                oz40 oz40Var = (oz40) obj2;
                cjs0 cjs0Var = (cjs0) obj;
                float floatValue = ((Number) ((m3u0) obj3).getValue()).floatValue();
                float intBitsToFloat = Float.intBitsToFloat((int) (cjs0Var.a >> 32)) * floatValue;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (cjs0Var.a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) * floatValue;
                if (Float.intBitsToFloat((int) (((cjs0) oz40Var.getValue()).a >> 32)) != intBitsToFloat || Float.intBitsToFloat((int) (((cjs0) oz40Var.getValue()).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) != intBitsToFloat2) {
                    oz40Var.setValue(new cjs0((Float.floatToRawIntBits(intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(intBitsToFloat) << 32)));
                    break;
                }
                break;
            case 3:
                dny0 dny0Var = (dny0) obj2;
                Ref$BooleanRef ref$BooleanRef2 = (Ref$BooleanRef) obj4;
                tny0 tny0Var = (tny0) obj;
                switch (cny0.a[((KeyCommand) obj3).ordinal()]) {
                    case 1:
                        dny0Var.b.d(false);
                        break;
                    case 2:
                        dny0Var.b.q();
                        break;
                    case 3:
                        dny0Var.b.f();
                        break;
                    case 4:
                        tny0Var.e.a = null;
                        if (tny0Var.g.b.length() > 0) {
                            if (asy0.c(tny0Var.f)) {
                                tny0Var.i();
                                break;
                            } else {
                                boolean f = tny0Var.f();
                                long j = tny0Var.f;
                                if (f) {
                                    int f2 = asy0.f(j);
                                    tny0Var.q(f2, f2);
                                    break;
                                } else {
                                    int e5 = asy0.e(j);
                                    tny0Var.q(e5, e5);
                                    break;
                                }
                            }
                        }
                        break;
                    case 5:
                        tny0Var.e.a = null;
                        if (tny0Var.g.b.length() > 0) {
                            if (asy0.c(tny0Var.f)) {
                                tny0Var.m();
                                break;
                            } else {
                                boolean f3 = tny0Var.f();
                                long j2 = tny0Var.f;
                                if (f3) {
                                    int e6 = asy0.e(j2);
                                    tny0Var.q(e6, e6);
                                    break;
                                } else {
                                    int f4 = asy0.f(j2);
                                    tny0Var.q(f4, f4);
                                    break;
                                }
                            }
                        }
                        break;
                    case 6:
                        vry0 vry0Var = tny0Var.e;
                        vry0Var.a = null;
                        kk2 kk2Var = tny0Var.g;
                        String str4 = kk2Var.b;
                        String str5 = kk2Var.b;
                        if (str4.length() > 0) {
                            if (tny0Var.f()) {
                                vry0Var.a = null;
                                if (str5.length() > 0 && (e = tny0Var.e()) != null) {
                                    int intValue = e.intValue();
                                    tny0Var.q(intValue, intValue);
                                    break;
                                }
                            } else {
                                vry0Var.a = null;
                                if (str5.length() > 0 && (d = tny0Var.d()) != null) {
                                    int intValue2 = d.intValue();
                                    tny0Var.q(intValue2, intValue2);
                                    break;
                                }
                            }
                        }
                        break;
                    case 7:
                        vry0 vry0Var2 = tny0Var.e;
                        vry0Var2.a = null;
                        kk2 kk2Var2 = tny0Var.g;
                        String str6 = kk2Var2.b;
                        String str7 = kk2Var2.b;
                        if (str6.length() > 0) {
                            if (tny0Var.f()) {
                                vry0Var2.a = null;
                                if (str7.length() > 0 && (d2 = tny0Var.d()) != null) {
                                    int intValue3 = d2.intValue();
                                    tny0Var.q(intValue3, intValue3);
                                    break;
                                }
                            } else {
                                vry0Var2.a = null;
                                if (str7.length() > 0 && (e2 = tny0Var.e()) != null) {
                                    int intValue4 = e2.intValue();
                                    tny0Var.q(intValue4, intValue4);
                                    break;
                                }
                            }
                        }
                        break;
                    case 8:
                        tny0Var.l();
                        break;
                    case 9:
                        tny0Var.j();
                        break;
                    case 10:
                        if (tny0Var.g.b.length() > 0 && (dry0Var = tny0Var.c) != null) {
                            int g = tny0Var.g(dry0Var, -1);
                            tny0Var.q(g, g);
                            break;
                        }
                        break;
                    case 11:
                        if (tny0Var.g.b.length() > 0 && (dry0Var2 = tny0Var.c) != null) {
                            int g2 = tny0Var.g(dry0Var2, 1);
                            tny0Var.q(g2, g2);
                            break;
                        }
                        break;
                    case 12:
                        if (tny0Var.g.b.length() > 0 && (ery0Var = tny0Var.i) != null) {
                            int h = tny0Var.h(ery0Var, -1);
                            tny0Var.q(h, h);
                            break;
                        }
                        break;
                    case 13:
                        if (tny0Var.g.b.length() > 0 && (ery0Var2 = tny0Var.i) != null) {
                            int h2 = tny0Var.h(ery0Var2, 1);
                            tny0Var.q(h2, h2);
                            break;
                        }
                        break;
                    case 14:
                        tny0Var.o();
                        break;
                    case 15:
                        tny0Var.n();
                        break;
                    case 16:
                        tny0Var.e.a = null;
                        if (tny0Var.g.b.length() > 0) {
                            if (tny0Var.f()) {
                                tny0Var.o();
                                break;
                            } else {
                                tny0Var.n();
                                break;
                            }
                        }
                        break;
                    case 17:
                        tny0Var.e.a = null;
                        if (tny0Var.g.b.length() > 0) {
                            if (tny0Var.f()) {
                                tny0Var.n();
                                break;
                            } else {
                                tny0Var.o();
                                break;
                            }
                        }
                        break;
                    case 18:
                        tny0Var.e.a = null;
                        if (tny0Var.g.b.length() > 0) {
                            tny0Var.q(0, 0);
                            break;
                        }
                        break;
                    case 19:
                        tny0Var.e.a = null;
                        kk2 kk2Var3 = tny0Var.g;
                        if (kk2Var3.b.length() > 0) {
                            int length = kk2Var3.b.length();
                            tny0Var.q(length, length);
                            break;
                        }
                        break;
                    case 20:
                        List a3 = tny0Var.a(new uiy0(5));
                        if (a3 != null) {
                            dny0Var.a(a3);
                            break;
                        }
                        break;
                    case 21:
                        List a4 = tny0Var.a(new uiy0(6));
                        if (a4 != null) {
                            dny0Var.a(a4);
                            break;
                        }
                        break;
                    case 22:
                        List a5 = tny0Var.a(new uiy0(7));
                        if (a5 != null) {
                            dny0Var.a(a5);
                            break;
                        }
                        break;
                    case 23:
                        List a6 = tny0Var.a(new uiy0(8));
                        if (a6 != null) {
                            dny0Var.a(a6);
                            break;
                        }
                        break;
                    case 24:
                        List a7 = tny0Var.a(new uiy0(i3));
                        if (a7 != null) {
                            dny0Var.a(a7);
                            break;
                        }
                        break;
                    case 25:
                        List a8 = tny0Var.a(new uiy0(10));
                        if (a8 != null) {
                            dny0Var.a(a8);
                            break;
                        }
                        break;
                    case 26:
                        if (dny0Var.e) {
                            ref$BooleanRef2.element = dny0Var.a.x.b.r.a(dny0Var.l);
                            break;
                        } else {
                            dny0Var.a(Collections.singletonList(new fnc("\n", 1)));
                            break;
                        }
                    case 27:
                        if (dny0Var.e) {
                            ref$BooleanRef2.element = false;
                            break;
                        } else {
                            dny0Var.a(Collections.singletonList(new fnc("\t", 1)));
                            break;
                        }
                    case 28:
                        tny0Var.e.a = null;
                        kk2 kk2Var4 = tny0Var.g;
                        if (kk2Var4.b.length() > 0) {
                            tny0Var.q(0, kk2Var4.b.length());
                            break;
                        }
                        break;
                    case 29:
                        tny0Var.i();
                        tny0Var.p();
                        break;
                    case 30:
                        tny0Var.m();
                        tny0Var.p();
                        break;
                    case 31:
                        vry0 vry0Var3 = tny0Var.e;
                        vry0Var3.a = null;
                        kk2 kk2Var5 = tny0Var.g;
                        String str8 = kk2Var5.b;
                        String str9 = kk2Var5.b;
                        if (str8.length() > 0) {
                            if (tny0Var.f()) {
                                vry0Var3.a = null;
                                if (str9.length() > 0 && (e3 = tny0Var.e()) != null) {
                                    int intValue5 = e3.intValue();
                                    tny0Var.q(intValue5, intValue5);
                                }
                            } else {
                                vry0Var3.a = null;
                                if (str9.length() > 0 && (d3 = tny0Var.d()) != null) {
                                    int intValue6 = d3.intValue();
                                    tny0Var.q(intValue6, intValue6);
                                }
                            }
                        }
                        tny0Var.p();
                        break;
                    case 32:
                        vry0 vry0Var4 = tny0Var.e;
                        vry0Var4.a = null;
                        kk2 kk2Var6 = tny0Var.g;
                        String str10 = kk2Var6.b;
                        String str11 = kk2Var6.b;
                        if (str10.length() > 0) {
                            if (tny0Var.f()) {
                                vry0Var4.a = null;
                                if (str11.length() > 0 && (d4 = tny0Var.d()) != null) {
                                    int intValue7 = d4.intValue();
                                    tny0Var.q(intValue7, intValue7);
                                }
                            } else {
                                vry0Var4.a = null;
                                if (str11.length() > 0 && (e4 = tny0Var.e()) != null) {
                                    int intValue8 = e4.intValue();
                                    tny0Var.q(intValue8, intValue8);
                                }
                            }
                        }
                        tny0Var.p();
                        break;
                    case 33:
                        tny0Var.l();
                        tny0Var.p();
                        break;
                    case 34:
                        tny0Var.j();
                        tny0Var.p();
                        break;
                    case 35:
                        tny0Var.o();
                        tny0Var.p();
                        break;
                    case 36:
                        tny0Var.n();
                        tny0Var.p();
                        break;
                    case 37:
                        tny0Var.e.a = null;
                        if (tny0Var.g.b.length() > 0) {
                            if (tny0Var.f()) {
                                tny0Var.o();
                            } else {
                                tny0Var.n();
                            }
                        }
                        tny0Var.p();
                        break;
                    case 38:
                        tny0Var.e.a = null;
                        if (tny0Var.g.b.length() > 0) {
                            if (tny0Var.f()) {
                                tny0Var.n();
                            } else {
                                tny0Var.o();
                            }
                        }
                        tny0Var.p();
                        break;
                    case 39:
                        if (tny0Var.g.b.length() > 0 && (dry0Var3 = tny0Var.c) != null) {
                            int g3 = tny0Var.g(dry0Var3, -1);
                            tny0Var.q(g3, g3);
                        }
                        tny0Var.p();
                        break;
                    case 40:
                        if (tny0Var.g.b.length() > 0 && (dry0Var4 = tny0Var.c) != null) {
                            int g4 = tny0Var.g(dry0Var4, 1);
                            tny0Var.q(g4, g4);
                        }
                        tny0Var.p();
                        break;
                    case 41:
                        if (tny0Var.g.b.length() > 0 && (ery0Var3 = tny0Var.i) != null) {
                            int h3 = tny0Var.h(ery0Var3, -1);
                            tny0Var.q(h3, h3);
                        }
                        tny0Var.p();
                        break;
                    case 42:
                        if (tny0Var.g.b.length() > 0 && (ery0Var4 = tny0Var.i) != null) {
                            int h4 = tny0Var.h(ery0Var4, 1);
                            tny0Var.q(h4, h4);
                        }
                        tny0Var.p();
                        break;
                    case 43:
                        tny0Var.e.a = null;
                        if (tny0Var.g.b.length() > 0) {
                            tny0Var.q(0, 0);
                        }
                        tny0Var.p();
                        break;
                    case 44:
                        tny0Var.e.a = null;
                        kk2 kk2Var7 = tny0Var.g;
                        if (kk2Var7.b.length() > 0) {
                            int length2 = kk2Var7.b.length();
                            tny0Var.q(length2, length2);
                        }
                        tny0Var.p();
                        break;
                    case 45:
                        tny0Var.e.a = null;
                        if (tny0Var.g.b.length() > 0) {
                            long j3 = tny0Var.f;
                            int i7 = asy0.c;
                            int i8 = (int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & j3);
                            tny0Var.q(i8, i8);
                            break;
                        }
                        break;
                    case 46:
                        ay11 ay11Var = dny0Var.h;
                        if (ay11Var != null) {
                            ay11Var.a(hoy0.a(tny0Var.h, tny0Var.g, tny0Var.f, 4));
                        }
                        ay11 ay11Var2 = dny0Var.h;
                        if (ay11Var2 != null) {
                            kcz0 kcz0Var2 = ay11Var2.b;
                            if (kcz0Var2 == null || (kcz0Var = (kcz0) kcz0Var2.a) == null) {
                                hoy0Var = null;
                            } else {
                                ay11Var2.b = kcz0Var;
                                ay11Var2.d -= ((hoy0) kcz0Var2.b).a.b.length();
                                ay11Var2.c = new kcz0(ay11Var2.c, (hoy0) kcz0Var2.b);
                                hoy0Var = (hoy0) kcz0Var.b;
                            }
                            if (hoy0Var != null) {
                                dny0Var.k.invoke(hoy0Var);
                                break;
                            }
                        }
                        break;
                    case 47:
                        ay11 ay11Var3 = dny0Var.h;
                        if (ay11Var3 != null) {
                            kcz0 kcz0Var3 = ay11Var3.c;
                            if (kcz0Var3 != null) {
                                ay11Var3.c = (kcz0) kcz0Var3.a;
                                hoy0 hoy0Var3 = (hoy0) kcz0Var3.b;
                                ay11Var3.b = new kcz0(ay11Var3.b, hoy0Var3);
                                ay11Var3.d = hoy0Var3.a.b.length() + ay11Var3.d;
                                hoy0Var2 = (hoy0) kcz0Var3.b;
                            } else {
                                hoy0Var2 = null;
                            }
                            if (hoy0Var2 != null) {
                                dny0Var.k.invoke(hoy0Var2);
                                break;
                            }
                        }
                        break;
                    case 48:
                    case 49:
                        break;
                    default:
                        w511.b();
                        break;
                }
                break;
            case 4:
                Context context = (Context) obj4;
                mnq0 mnq0Var = (mnq0) obj;
                f.p(mnq0Var, 0);
                f.l(mnq0Var, context.getString(kyh0.mt_view_other_variants));
                f.f(mnq0Var, context.getString(kyh0.mt_route_details_see_travel_options_description), new yyy0((tls) obj3, (w611) obj2, i4));
                break;
            case 5:
                ((oz40) obj2).setValue(Boolean.TRUE);
                ((tls) obj4).invoke(new o3z0((BannerWidgets.NamedActionType) obj, ((u3z0) obj3).d));
                break;
            case 6:
                break;
            case 7:
                d901 d901Var = (d901) obj4;
                TrafficLightsController trafficLightsController = (TrafficLightsController) obj;
                d901Var.b = trafficLightsController;
                c901 c901Var = new c901((g901) obj3, d901Var, (g901) obj2);
                trafficLightsController.addListener(c901Var);
                d901Var.c = c901Var;
                break;
            case 8:
                a aVar = (a) obj3;
                u031 u031Var2 = (u031) obj2;
                wk01 wk01Var = (wk01) obj;
                nfb nfbVar = (nfb) ((cqg) obj4).a;
                String str12 = nfbVar.j;
                hfb hfbVar = nfbVar.r;
                wjq0 wjq0Var = wk01Var.i;
                aVar.getClass();
                qj01 qj01Var = aVar.V;
                if ((wjq0Var instanceof gjq0) && hfbVar != null) {
                    MoneyEntity moneyEntity = hfbVar.a;
                    gfb gfbVar = hfbVar.b;
                    ifb ifbVar = hfbVar.c;
                    gjq0 gjq0Var = (gjq0) wjq0Var;
                    SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType selectedTransferSubject$CrossBorderByPhone$PriorityMoneyType2 = gjq0Var.g;
                    BigDecimal bigDecimal = (moneyEntity == null || (amount = moneyEntity.getAmount()) == null) ? gjq0Var.e : amount;
                    if (moneyEntity == null || (str = moneyEntity.getCurrency()) == null) {
                        str = gjq0Var.f;
                    }
                    String str13 = str;
                    ejq0 ejq0Var = (gfbVar != null ? gfbVar.a : null) != null ? new ejq0(gfbVar.a.getAmount().toPlainString(), gfbVar.a.getCurrency()) : gjq0Var.h;
                    if (gfbVar == null || (str2 = gfbVar.b) == null) {
                        str2 = gjq0Var.i;
                    }
                    String str14 = str2;
                    if (gfbVar == null || (str3 = gfbVar.c) == null) {
                        str3 = gjq0Var.j;
                    }
                    String str15 = str3;
                    fjq0 fjq0Var = ifbVar != null ? new fjq0(ifbVar.a, ifbVar.b, ifbVar.c) : gjq0Var.b;
                    String str16 = hfbVar.d;
                    if (str16 != null) {
                        SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType selectedTransferSubject$CrossBorderByPhone$PriorityMoneyType3 = str16.equals(Card.CARD_TYPE_DEBIT) ? SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType.DEBIT : str16.equals(Card.CARD_TYPE_CREDIT) ? SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType.CREDIT : selectedTransferSubject$CrossBorderByPhone$PriorityMoneyType2;
                        if (selectedTransferSubject$CrossBorderByPhone$PriorityMoneyType3 != null) {
                            selectedTransferSubject$CrossBorderByPhone$PriorityMoneyType = selectedTransferSubject$CrossBorderByPhone$PriorityMoneyType3;
                            wjq0Var = gjq0.c(gjq0Var, fjq0Var, bigDecimal, str13, selectedTransferSubject$CrossBorderByPhone$PriorityMoneyType, ejq0Var, str14, str15, 7181);
                        }
                    }
                    selectedTransferSubject$CrossBorderByPhone$PriorityMoneyType = selectedTransferSubject$CrossBorderByPhone$PriorityMoneyType2;
                    wjq0Var = gjq0.c(gjq0Var, fjq0Var, bigDecimal, str13, selectedTransferSubject$CrossBorderByPhone$PriorityMoneyType, ejq0Var, str14, str15, 7181);
                }
                unq unqVar = nfbVar.a;
                rr51 rr51Var = nfbVar.l;
                boolean z = nfbVar.i;
                unq unqVar2 = nfbVar.a;
                ThemedImageUrlEntity themedImageUrlEntity = nfbVar.h;
                String str17 = nfbVar.g;
                String str18 = nfbVar.f;
                String str19 = nfbVar.e;
                UnconditionalLimitWidgetEntity unconditionalLimitWidgetEntity = nfbVar.b;
                p39 p39Var = nfbVar.m;
                String str20 = nfbVar.o;
                Boolean bool = nfbVar.p;
                String str21 = nfbVar.k;
                TransferScenario transferScenario = wk01Var.a;
                switch (transferScenario == null ? -1 : rl01.k[transferScenario.ordinal()]) {
                    case -1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        if (z || str12 == null || evu0.J(str12)) {
                            aVar.l0(unconditionalLimitWidgetEntity == null ? unconditionalLimitWidgetEntity.getDescription() : null);
                            qj01Var.b(p39Var);
                            rvz0 rvz0Var = str19 == null ? new rvz0(str19, str18, str17, themedImageUrlEntity) : null;
                            qj01Var.i.l(unqVar2);
                            qj01Var.h.l(rvz0Var);
                            m031Var = new m031(rvz0Var, unconditionalLimitWidgetEntity, rr51Var, p39Var);
                        } else {
                            TransferResultPageEntity transferResultPageEntity = nfbVar.c;
                            if (transferResultPageEntity != null) {
                                aVar.l0(unconditionalLimitWidgetEntity != null ? unconditionalLimitWidgetEntity.getDescription() : null);
                                rvz0 rvz0Var2 = str19 != null ? new rvz0(str19, str18, str17, themedImageUrlEntity) : null;
                                qj01Var.h.l(rvz0Var2);
                                qj01Var.i.l(unqVar2);
                                qj01Var.b(p39Var);
                                u031Var = new s031(rvz0Var2, transferResultPageEntity, nfbVar.d, nfbVar.b, str12, nfbVar.l, nfbVar.m, nfbVar.r);
                                wk01 b = wk01.b(wk01Var, null, null, null, null, null, null, wjq0Var, unqVar, str20, bool, null, null, u031Var, false, false, str21, null, false, null, false, null, null, null, null, null, null, null, -1117953, 15);
                                actionButtonEntity = nfbVar.q;
                                if (actionButtonEntity == null) {
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                aVar.Z(new ol01(gao.e(null, null, null, 7)));
                                UnconditionalLimitWidgetEntity d5 = ysb1.d(u031Var2);
                                aVar.l0(d5 != null ? d5.getDescription() : null);
                                qj01Var.b(p39Var);
                                rvz0 rvz0Var3 = str19 != null ? new rvz0(str19, str18, str17, themedImageUrlEntity) : null;
                                qj01Var.i.l(unqVar2);
                                qj01Var.h.l(rvz0Var3);
                                x4c.g("result page is null when transfer allowed", null, null, Collections.singletonList(orp0.e), 6);
                                m031Var = new m031(rvz0Var3, unconditionalLimitWidgetEntity, rr51Var, p39Var);
                            }
                        }
                        u031Var = m031Var;
                        wk01 b2 = wk01.b(wk01Var, null, null, null, null, null, null, wjq0Var, unqVar, str20, bool, null, null, u031Var, false, false, str21, null, false, null, false, null, null, null, null, null, null, null, -1117953, 15);
                        actionButtonEntity = nfbVar.q;
                        if (actionButtonEntity == null) {
                        }
                    case 0:
                    default:
                        w511.b();
                        break;
                    case 1:
                        if (z) {
                            u031Var = t031.a;
                            wk01 b22 = wk01.b(wk01Var, null, null, null, null, null, null, wjq0Var, unqVar, str20, bool, null, null, u031Var, false, false, str21, null, false, null, false, null, null, null, null, null, null, null, -1117953, 15);
                            actionButtonEntity = nfbVar.q;
                            if (actionButtonEntity == null) {
                            }
                        }
                        if (z) {
                        }
                        aVar.l0(unconditionalLimitWidgetEntity == null ? unconditionalLimitWidgetEntity.getDescription() : null);
                        qj01Var.b(p39Var);
                        if (str19 == null) {
                        }
                        qj01Var.i.l(unqVar2);
                        qj01Var.h.l(rvz0Var);
                        m031Var = new m031(rvz0Var, unconditionalLimitWidgetEntity, rr51Var, p39Var);
                        u031Var = m031Var;
                        wk01 b222 = wk01.b(wk01Var, null, null, null, null, null, null, wjq0Var, unqVar, str20, bool, null, null, u031Var, false, false, str21, null, false, null, false, null, null, null, null, null, null, null, -1117953, 15);
                        actionButtonEntity = nfbVar.q;
                        if (actionButtonEntity == null) {
                        }
                        break;
                }
                break;
            case 9:
                n70 n70Var = (n70) obj4;
                Text text = (Text) obj3;
                r961 r961Var = (r961) obj2;
                g gVar = (g) obj;
                String str22 = ((vqj0) n70Var.Z()).c;
                Text text2 = ((vqj0) n70Var.Z()).b;
                if (text == null) {
                    text = Text.Empty.INSTANCE;
                }
                a = rtu.a(new jiu(6), d.a(r961Var.a.getContext(), text).toString());
                break;
            case 10:
                e960 e960Var = (e960) obj3;
                com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation.a aVar2 = (com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation.a) obj2;
                vv01 vv01Var = (vv01) obj;
                boolean isEmpty = ((List) obj4).isEmpty();
                c960 c960Var = c960.a;
                break;
            case 11:
                jh5 jh5Var = (jh5) obj3;
                ig5 ig5Var = (ig5) obj2;
                gbi0 gbi0Var = (gbi0) obj;
                FlexAdapter flexAdapter = ((j511) obj4).c;
                if (flexAdapter != null && (stateManager = flexAdapter.getStateManager()) != null) {
                    bia1.j(stateManager, scc.g("TicketWriteState", "readBlocksResult"), gbi0Var);
                }
                jh5Var.a.dispatch(((f511) ig5Var).b);
                break;
            case 12:
                jh5 jh5Var2 = (jh5) obj3;
                ig5 ig5Var2 = (ig5) obj2;
                String str23 = (String) obj;
                FlexAdapter flexAdapter2 = (FlexAdapter) ((kcz0) obj4).b;
                if (flexAdapter2 != null && (stateManager2 = flexAdapter2.getStateManager()) != null) {
                    bia1.j(stateManager2, scc.g("ReadCardByNFCScreenState", "cardNumber"), str23);
                }
                jh5Var2.a.dispatch(((r511) ig5Var2).b);
                break;
            case 13:
                bb11 bb11Var = (bb11) obj3;
                yfd yfdVar = (yfd) obj;
                eg01 eg01Var = new eg01((oy7) obj2);
                hwo0 hwo0Var = ((za11) obj4).a;
                ((agd) yfdVar).e = new jl01(23, new uio0(bb11Var, eg01Var, (o7r0) ((qcz0) hwo0Var.b).get(), (dxu) ((xvf0) hwo0Var.c).get(), (fyu) ((xvf0) hwo0Var.w).get(), (a2v) ((xvf0) hwo0Var.x).get()));
                agd agdVar = (agd) yfdVar;
                TransportSelectorPayloadDto transportSelectorPayloadDto = (TransportSelectorPayloadDto) agdVar.a;
                bb11Var.getClass();
                List<TransportSelectorOptionDto> list = transportSelectorPayloadDto.e;
                ArrayList arrayList = new ArrayList();
                for (TransportSelectorOptionDto transportSelectorOptionDto : list) {
                    String str24 = transportSelectorOptionDto.a;
                    if (!transportSelectorOptionDto.d) {
                        str24 = null;
                    }
                    if (str24 != null) {
                        arrayList.add(str24);
                    }
                }
                Set N0 = kotlin.collections.a.N0(arrayList);
                bb11Var.c = transportSelectorPayloadDto.e.size();
                bb11Var.d = N0;
                r0 r0Var = bb11Var.e;
                r0Var.getClass();
                r0Var.m(null, N0);
                agdVar.c = e.X(new b(bb11Var.a.a(), bb11Var, transportSelectorPayloadDto), new TransportTypeSelectorUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1(null, bb11Var));
                yed.a.getClass();
                agdVar.g = yed.b;
                break;
            case 14:
                jh5 jh5Var3 = (jh5) obj3;
                ig5 ig5Var3 = (ig5) obj2;
                rb51 rb51Var = (rb51) obj;
                FlexAdapter flexAdapter3 = ((j511) obj4).c;
                if (flexAdapter3 != null && (stateManager3 = flexAdapter3.getStateManager()) != null) {
                    bia1.j(stateManager3, scc.g("TicketWriteState", "writeBlocksResult"), rb51Var);
                }
                jh5Var3.a.dispatch(((tb11) ig5Var3).b);
                break;
            case 15:
                render$lambda$9$lambda$7 = UpgradeEditFragment.render$lambda$9$lambda$7((ea21) obj4, (i861) obj3, (UpgradeEditFragment) obj2, (g) obj);
                break;
            case 16:
                n70 n70Var2 = (n70) obj4;
                tls tlsVar2 = (tls) obj3;
                tls tlsVar3 = (tls) obj2;
                if (kotlin.collections.a.u0((List) obj) instanceof ka21) {
                    ((b361) n70Var2.N).b.wiggle();
                    break;
                } else {
                    LoadableInput loadableInput = ((b361) n70Var2.N).b;
                    loadableInput.render(false, new ms3(i3, n70Var2, tlsVar2));
                    if (((la21) n70Var2.Z()).a.g) {
                        loadableInput.setOnClickListener(new os3(i3, n70Var2, tlsVar3));
                        break;
                    } else {
                        loadableInput.setOnClickListener(null);
                        break;
                    }
                }
            case 17:
                UserProfileStyle userProfileStyle = (UserProfileStyle) obj4;
                oep0 oep0Var = (oep0) obj3;
                com.yandex.go.user_profile.main_menu.profile.a aVar3 = (com.yandex.go.user_profile.main_menu.profile.a) obj2;
                Object value = ((Result) obj).getValue();
                if (!(value instanceof Result.Failure)) {
                    ((pep0) oep0Var).f((m950) aVar3.b.get(), new ym10(userProfileStyle, true, false), hxx.a);
                    break;
                }
                break;
            case 18:
                UserProfileStyle userProfileStyle2 = (UserProfileStyle) obj4;
                oep0 oep0Var2 = (oep0) obj3;
                com.yandex.go.user_profile.main_menu.profile.b bVar = (com.yandex.go.user_profile.main_menu.profile.b) obj2;
                Object value2 = ((Result) obj).getValue();
                if (!(value2 instanceof Result.Failure)) {
                    ((pep0) oep0Var2).f((m950) bVar.b.get(), new ym10(userProfileStyle2, true, false), hxx.a);
                    break;
                }
                break;
            case 19:
                final dd31 dd31Var = (dd31) obj4;
                final com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.f fVar = (com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.f) obj2;
                final yfd yfdVar2 = (yfd) obj;
                final ad31 ad31Var = new ad31(dd31Var);
                final zv20 zv20Var = new zv20(ad31Var, (bpw0) dd31Var.i0.a.a.get());
                ((agd) yfdVar2).c = ((q) obj3).c();
                tls tlsVar4 = new tls() { // from class: com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj6) {
                        tje.N(dd31.this.o(), null, null, new VerticalHubV2Router$content$1$1$1(fVar, (ge31) obj6, ad31Var, null), 3);
                        return zy11.a;
                    }
                };
                agd agdVar2 = (agd) yfdVar2;
                agdVar2.e = tlsVar4;
                agdVar2.g = new androidx.compose.runtime.internal.a(1266256651, new bms() { // from class: com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.b
                    @Override // defpackage.bms
                    public final Object invoke(Object obj6, Object obj7, Object obj8, Object obj9) {
                        int i9;
                        xfd xfdVar = (xfd) obj6;
                        je31 je31Var = (je31) obj7;
                        fid fidVar = (fid) obj8;
                        int intValue9 = ((Integer) obj9).intValue();
                        if ((intValue9 & 6) == 0) {
                            i9 = ((intValue9 & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue9;
                        } else {
                            i9 = intValue9;
                        }
                        if ((intValue9 & 48) == 0) {
                            i9 |= ((bts) fidVar).k(je31Var) ? 32 : 16;
                        }
                        bts btsVar = (bts) fidVar;
                        boolean V = btsVar.V(i9 & 1, (i9 & 147) != 146);
                        zy11 zy11Var2 = zy11.a;
                        if (!V) {
                            btsVar.Y();
                            return zy11Var2;
                        }
                        dd31 dd31Var2 = dd31.this;
                        boolean e7 = btsVar.e(dd31Var2);
                        Object Q = btsVar.Q();
                        o430 o430Var = did.a;
                        if (e7 || Q == o430Var) {
                            Q = new VerticalHubV2Router$content$1$2$1$1(dd31Var2, null);
                            btsVar.o0(Q);
                        }
                        zpn.e(btsVar, (wls) Q, zy11Var2);
                        yfd yfdVar3 = yfdVar2;
                        int i10 = ((ac31) ((agd) yfdVar3).a).a.b;
                        ac31 ac31Var = (ac31) ((agd) yfdVar3).a;
                        Boolean bool2 = ac31Var.b;
                        boolean booleanValue = bool2 != null ? bool2.booleanValue() : ac31Var.a.a;
                        ComposeContentKt$ContentImpl$scope$1$1$action$1 composeContentKt$ContentImpl$scope$1$1$action$1 = ((bgd) xfdVar).a;
                        boolean e8 = btsVar.e(dd31Var2);
                        Object Q2 = btsVar.Q();
                        if (e8 || Q2 == o430Var) {
                            VerticalHubV2Router$content$1$2$2$1 verticalHubV2Router$content$1$2$2$1 = new VerticalHubV2Router$content$1$2$2$1(1, dd31Var2, dd31.class, "onAnchoredHeightChanged", "onAnchoredHeightChanged(I)V", 0);
                            btsVar.o0(verticalHubV2Router$content$1$2$2$1);
                            Q2 = verticalHubV2Router$content$1$2$2$1;
                        }
                        tfx tfxVar = (tfx) Q2;
                        boolean z2 = booleanValue;
                        kf91.b(i10, je31Var, z2, composeContentKt$ContentImpl$scope$1$1$action$1, (tls) tfxVar, dd31Var2.P, dd31Var2.N, zv20Var, dd31Var2.L, btsVar, i9 & 112);
                        return zy11Var2;
                    }
                }, true);
                break;
            case 20:
                ((vw20) obj).n1((Route) obj4, (List) obj3, (ArrayList) obj2);
                break;
            case 21:
                c cVar = (c) obj4;
                String str25 = (String) obj2;
                r6r0 r6r0Var = cVar.I;
                String str26 = ((NavigatorLanguageSettingAvailabilityExperiment.Voice) obj3).a;
                i650 i650Var = r6r0Var.a;
                HashMap u = n.u(i650Var);
                if (str26 != null) {
                    u.put("voice", str26);
                }
                i650Var.a.a("navigation.settings.language.voice.select", u, 1, new HashMap());
                bf50 bf50Var = cVar.B;
                bf50Var.c.r("navigator.language_assistance_key", str25);
                bf50Var.h.l(str25);
                cVar.H.d(str25, str26);
                break;
            default:
                oe51 oe51Var = (oe51) obj;
                jwu g5 = ((je51) obj4).b.g();
                oe51Var.a(g5);
                t4j0 t4j0Var = new t4j0();
                t4j0Var.a = g5.e();
                t4j0Var.c.a(ExtFunctionsKt.HEADER_USER_AGENT, ((ke51) obj3).b);
                oe51Var.b(t4j0Var);
                ((e331) obj2).invoke(new d5j0(t4j0Var));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ zjy0(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }
}
